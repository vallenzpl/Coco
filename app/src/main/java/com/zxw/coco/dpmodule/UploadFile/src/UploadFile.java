package com.zxw.coco.dpmodule.UploadFile.src;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class UploadFile {


    public static void main(String[] args) {
        // write your code here
        try {

            if (args.length < 2 || args[0] == null || args[0].length() < 1 || args[1] == null || args[1].length() < 1) {
                System.out.println("args wrong");
                return;
            }
            URL url = new URL(args[0]);
            File uploadFile = new File(args[1]);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
            httpURLConnection.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            OutputStream httpOut = httpURLConnection.getOutputStream();
            FileInputStream fin = new FileInputStream(uploadFile);
            BufferedReader bfr = new BufferedReader(new InputStreamReader(fin, "UTF-8"));
            StringBuffer stringBuffer1= new StringBuffer();
            stringBuffer1.append("&info=");
            String sss;
            while ((sss=bfr.readLine())!=null) {
                stringBuffer1.append(sss);
            }

            httpOut.write(stringBuffer1.toString().getBytes());
            httpOut.flush();
            httpOut.close();
            bfr.close();
            fin.close();
            InputStreamReader httpIn = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(httpIn);
            StringBuffer stringBuffer = new StringBuffer();
            String tem;

            while ((tem = bufferedReader.readLine()) != null) {

                stringBuffer.append(tem);
            }
            System.out.println(httpURLConnection.getResponseCode());
            System.out.println(stringBuffer);
            bufferedReader.close();
            httpIn.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

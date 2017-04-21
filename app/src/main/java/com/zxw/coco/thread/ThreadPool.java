package com.zxw.coco.thread;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Created by xiangwuzhu on 16/10/14.
 */
public class ThreadPool {


    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(1);
//        for (int i = 0; i < 5; i++) {
//            executorService.execute(new PoloRun(i));
//        }
//        System.out.println(" end !!");
//        executorService.shutdown();

//        Business business = new Business();
//        Business business1 = new Business();


//        Uri path = Uri.parse("http://osm.51ping.com/os/order/detail?orderid=100004091&token=7d26635fb627902e811753bd752d5ca883c958b9254cc419b37f726460f30c7d&product=dpapp");
//        System.out.println(path.getHost());



        try {
            URL url=new URL("http://developer.android.com/referencejava/net/URL.html?s=a&tr=32#getRef()");
            System.out.println("Authority是:"+url.getAuthority());
            System.out.println("Host是:"+url.getHost());
            System.out.println("Port是："+url.getPort());
            System.out.println("File是"+url.getFile());
            System.out.println("Path是"+url.getPath());
            System.out.println("Query是："+url.getQuery());
            System.out.println("Ref是:"+url.getRef());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

//        try {
//            URI absolute=new URI("http://www.baidu.com");
//            System.out.println("Host是:"+absolute.getHost());
//
//            URI relative=new URI("robot.txt");
//            URI resolved=new URI("http://www.baidu.com/robot.txt");
//
//            System.out.println("-----------------------解析前-------------------------");
//            System.out.println("Authority是:"+relative.getAuthority());
//            System.out.println("Host是:"+relative.getHost());
//            System.out.println("Port是："+relative.getPort());
//            System.out.println("Path是"+relative.getPath());
//            System.out.println("Query是："+relative.getQuery());
//            System.out.println("Ref是:"+relative.getFragment());
//            System.out.println("Scheme是:"+relative.getScheme());
//
//            System.out.println("-----------------------解析后-------------------------");
//            relative=absolute.resolve(relative);
//            System.out.println("Authority是:"+relative.getAuthority());
//            System.out.println("Host是:"+relative.getHost());
//            System.out.println("Port是："+relative.getPort());
//            System.out.println("Path是"+relative.getPath());
//            System.out.println("Query是："+relative.getQuery());
//            System.out.println("Ref是:"+relative.getFragment());
//            System.out.println("Scheme是:"+relative.getScheme());
//
//            System.out.println("-----------------------相对化-------------------------");
//            relative=absolute.relativize(resolved);
//            System.out.println("Authority是:"+relative.getAuthority());
//            System.out.println("Host是:"+relative.getHost());
//            System.out.println("Port是："+relative.getPort());
//            System.out.println("Path是"+relative.getPath());
//            System.out.println("Query是："+relative.getQuery());
//            System.out.println("Ref是:"+relative.getFragment());
//            System.out.println("Scheme是:"+relative.getScheme());
//
//            System.out.println("-----------------------不透明-------------------------");
//            URI uri=new URI("mailto:warsh@msncn");
//            System.out.println("Authority是:"+uri.getAuthority());
//            System.out.println("Host是:"+uri.getHost());
//            System.out.println("Port是："+uri.getPort());
//            System.out.println("Path是"+uri.getPath());
//            System.out.println("Query是："+uri.getQuery());
//            System.out.println("Ref是:"+uri.getFragment());
//            System.out.println("Scheme是:"+uri.getScheme());
//            System.out.println("Scheme具体部分:"+uri.getSchemeSpecificPart());
//
//        } catch (URISyntaxException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

    }



}


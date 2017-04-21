package com.zxw.coco;

/**
 * Created by xiangwuzhu on 16/10/8.
 */
public class MyTest {

    class Bank {
        String tag = "";
        private int account = 100;

        public int getAccount() {
            return account;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public Bank(String tag) {
            this.tag = tag;
        }

        /**
         * 用同步方法实现
         *
         * @param money
         */
        public synchronized void save(int money) {
            account += money;
        }

        /**
         * 用同步代码块实现
         *
         * @param money
         */
        public void save1(int money) {
            synchronized (this) {
                account += money;
            }
        }
    }

    class NewThread implements Runnable {
        private Bank bank;

        public NewThread(Bank bank) {
            this.bank = bank;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                // bank.save1(10);
                bank.save(10);
                System.out.println(bank.tag + " "+i + "账户余额为：" + bank.getAccount());
            }
        }
    }

    /**
     * 建立线程，调用内部类
     */
    public void useThread() {
        Bank bank = new Bank("T1");
        NewThread new_thread = new NewThread(bank);
        System.out.println("线程1");
        Thread thread1 = new Thread(new_thread, "T1");
        thread1.start();

        bank = new Bank("T2");
        NewThread new_thread2 = new NewThread(bank);
        System.out.println("线程2");
        Thread thread2 = new Thread(new_thread2, "T2");
        thread2.start();
    }


    public static void main(String[] args) {
        MyTest st = new MyTest();
        st.useThread();
    }


}


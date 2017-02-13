package com;

import java.io.File;

/**
 * Created by charlie on 08/02/2017.
 */
public class TestFile {

    public void doJob() {
        System.out.println("1:" + Thread.currentThread().getContextClassLoader().getResource(""));
        System.out.println("2:" + TestFile.class.getClassLoader().getResource(""));
        System.out.println("3:" + ClassLoader.getSystemResource(""));
        System.out.println("4:" + TestFile.class.getResource(""));//IdcardClient.class文件所在路径
        System.out.println("5:" + TestFile.class.getResource("/")); // Class包所在路径，得到的是URL对象，用url.getPath()获取绝对路径String
        System.out.println("6:" + new File("/").getAbsolutePath());
        System.out.println("7:" + System.getProperty("user.dir"));
        System.out.println("8:" + System.getProperty("file.encoding"));//获取文件编码
    }

    public static void main(String[] args) {
        TestFile tf = new TestFile();
        tf.doJob();
    }
}

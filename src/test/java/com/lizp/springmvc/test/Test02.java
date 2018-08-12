package com.lizp.springmvc.test;

public class Test02 {
    public static void main(String[] args) {
        System.err.println();
        /**
         * 1. 如果文件里不包含全角字符，如汉字、中文字符等符号，不论保存成ANSI还是UTF-8，文件都会被系统转换成ANSI；
         *
         * 2. 如果文件中包含汉字、中文字符等全角符号，则保存成UTF-8，打开还是UTF-8；
         *
         * 3. 如果文件是ANSI编码，且内容是纯英文，这时再加入汉字，文件不会变为UTF-8格式，需要手动另存为UTF-8（不要使用记事本另存为）。
         */
    }
}

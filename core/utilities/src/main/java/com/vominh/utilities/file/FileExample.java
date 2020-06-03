package com.vominh.utilities.file;

import java.io.*;
import java.util.Base64;

public class FileExample {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        File file = new File(classLoader.getResource("test.pdf").getFile());
        FileInputStream in = null;
        String encodedBase64 = null;
        if (file != null) {

            try {
                StringBuilder sb = new StringBuilder();
                in = new FileInputStream(file);
                byte[] fileData = new byte[(int) file.length()];
                DataInputStream input = new DataInputStream(in);
                in.read(fileData);
                String str = new String(fileData);
                encodedBase64 = new String(Base64.getEncoder().encodeToString(fileData));
                System.out.println(encodedBase64);
                try {
                    while (true) {
                        sb.append(Integer.toBinaryString(input.readByte()));
                    }
                } catch (EOFException eof) {
                } catch (IOException e) {
                    e.printStackTrace();
                }

//				System.out.println(file.getName());
//				System.out.println(String.valueOf(""));
//				System.out.println(sb);

                in.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}

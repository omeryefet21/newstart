package serialization;

import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException {
        File file1 = new File("c:/temp");
        file1.mkdir();
        File file2 = new File("c:/temp/file2.bin");
        if (!file1.exists()) {
            file1.createNewFile();
        }
        FileOutputStream fileOutputStream=new FileOutputStream("c:/temp/file2.bin");
        DataOutputStream dataOutputStream=new DataOutputStream(fileOutputStream);
        dataOutputStream.writeInt(333);
        dataOutputStream.writeBytes("dadadadadada");
        dataOutputStream.writeInt(3334);
        dataOutputStream.writeInt(333);


        FileInputStream fileInputStream = new FileInputStream("c:/temp/file2.bin");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        System.out.println(dataInputStream.readInt());
     //   System.out.println((char)dataInputStream.read());
        byte[] arr=dataInputStream.readNBytes(12);
        for (byte b:arr) {
            System.out.print((char)b);

        }
        System.out.println();
        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readInt());














    }
}

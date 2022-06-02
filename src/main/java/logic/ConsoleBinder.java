package logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleBinder {

    private static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readString() throws IOException {
        String text = br.readLine();
        return text;
    }

    public static int readInt() throws IOException {
        String text = br.readLine();
        return Integer.parseInt(text.trim());
    }
}

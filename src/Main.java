package src;

import java.io.PrintWriter;

class Main {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        pw.print(">> ");
        
        pw.flush();

        pw.println("test");
        pw.flush();
    }
}
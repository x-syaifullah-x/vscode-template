package src.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EServerSocket {
    private final ServerSocket ss;

    public EServerSocket() throws IOException {
        ss = new ServerSocket(12345);
    }

    public void run() throws IOException {
        while (true) {
            handleSocket(ss.accept());
        }
    }

    public void handleSocket(Socket s) {
        new Thread(new Runnable() {
            private boolean isClosed = false;

            @Override
            public void run() {
                while (!isClosed) {
                    try {
                        if (s.getInputStream().available() > 0) {
                            String message = new String(s.getInputStream().readAllBytes());
                            System.out.println("message from client: " + message);
                            s.getOutputStream().write("hello client ".getBytes());
                            s.close();
                            isClosed = true;
                        }
                        Thread.sleep(1000L);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public final class armr extends armj {
    private final Socket a;
    private final OutputStream b;
    private final InputStream c;

    public armr() {
        throw null;
    }

    public armr(int v) {
        try {
            ServerSocket serverSocket0 = new ServerSocket(v);
            ((ggtj)armq.a.h()).x("server listening");
            Socket socket0 = serverSocket0.accept();
            this.a = socket0;
            serverSocket0.close();
            this.b = socket0.getOutputStream();
            this.c = socket0.getInputStream();
        }
        catch(IOException iOException0) {
            throw new arlq("Failed to connect", iOException0);
        }
    }

    @Override  // armj
    public final int a(byte[] arr_b, int v, int v1) {
        try {
            InputStream inputStream0 = this.c;
            int v2 = 0;
            while(v2 < v1) {
                int v3 = inputStream0.read(arr_b, v + v2, v1 - v2);
                if(v3 > 0) {
                    v2 += v3;
                }
                else if(v3 < 0) {
                    throw new IOException("read returned negative: " + v3);
                }
            }
            return v2;
        }
        catch(IOException iOException0) {
            throw new arln("Failed to read", iOException0);
        }
    }

    @Override  // armj
    protected final void c() {
        Socket socket0 = this.a;
        if(socket0 != null) {
            try {
                socket0.close();
            }
            catch(IOException unused_ex) {
            }
        }
    }

    @Override  // armj
    protected final void d(byte[] arr_b, int v, int v1) {
        try {
            this.b.write(arr_b, v, v1);
        }
        catch(IOException iOException0) {
            throw new arln("Could not write", iOException0);
        }
    }
}


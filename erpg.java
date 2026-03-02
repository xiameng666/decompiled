import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class erpg implements Runnable {
    private static final baun a;
    private final DataInputStream b;
    private final erpf c;
    private final int d;
    private volatile boolean e;

    static {
        erpg.a = new erqc(new String[]{"DataInputStreamReader"});
    }

    public erpg(InputStream inputStream0, erpf erpf0, int v) {
        this.b = new DataInputStream(inputStream0);
        this.c = erpf0;
        this.d = v;
    }

    public final void a() {
        this.e = true;
    }

    @Override
    public final void run() {
        int v2;
        baun baun0 = erpg.a;
        int v = this.d;
        baun0.j("Starting DataInputStreamReader using read mode %d", new Object[]{v});
        byte[] arr_b = new byte[50000];
        while(!Thread.currentThread().isInterrupted() && !this.e) {
            try {
                if(v == 0) {
                    v2 = this.b.read(arr_b);
                    if(v2 == -1) {
                        throw new EOFException("End of stream reached in Standard read mode");
                    }
                }
                else {
                    DataInputStream dataInputStream0 = this.b;
                    int v1 = dataInputStream0.readInt();
                    if(v1 > 50000) {
                        throw new IOException(a.f(v1, "Packet is too large, size is ", ", max buffer size is 50000"));
                    }
                    if(v1 <= 0) {
                        throw new IOException("Next packet length is invalid! It should be a positive integer, but was actually " + v1);
                    }
                    dataInputStream0.readFully(arr_b, 0, v1);
                    v2 = v1;
                }
                if(this.e) {
                    continue;
                }
                byte[] arr_b1 = new byte[v2];
                System.arraycopy(arr_b, 0, arr_b1, 0, v2);
                baun0.d("Read %d bytes from the stream", new Object[]{v2});
                this.c.a(arr_b1);
            }
            catch(EOFException unused_ex) {
                erpg.a.j("End of stream reached, exiting", new Object[0]);
                return;
            }
            catch(IOException iOException0) {
                if(!this.e) {
                    throw new RuntimeException(iOException0);
                }
                erpg.a.j("Ignoring IOException after shutdown", new Object[0]);
                return;
            }
        }
    }
}


import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

final class arkt implements Runnable {
    public final arlf a;
    public final arim b;
    private static final aqql c;
    private final InputStream d;
    private final ExecutorService e;
    private final byte[] f;

    static {
        arkt.c = new aqql(new String[]{"ConduitRunnable"});
    }

    public arkt(arlf arlf0, ExecutorService executorService0, arim arim0, InputStream inputStream0) {
        this.f = new byte[0x2000];
        this.a = arlf0;
        this.e = executorService0;
        this.b = arim0;
        this.d = inputStream0;
    }

    @Override
    public final void run() {
        try {
            while(true) {
            label_1:
                byte[] arr_b = this.f;
                int v1 = this.d.read(arr_b, 0, 0x2000);
                if(v1 == -1) {
                    return;
                }
                arkr arkr0 = new arkr(this, Arrays.copyOf(arr_b, v1));
                this.e.execute(arkr0);
                if(Thread.currentThread().isInterrupted()) {
                    return;
                }
            }
        }
        catch(IOException iOException0) {
            if(Thread.currentThread().isInterrupted()) {
                arkt.c.j("Interrupted, shutting down", new Object[0]);
                return;
            }
            arkt.c.f("IoException in ConduitRunnable (Expected when the other side closes first): %s", new Object[]{iOException0.getMessage()});
            arkt.c.k("IoException in ConduitRunnable", iOException0, new Object[0]);
            arks arks0 = new arks(this, iOException0);
            this.e.execute(arks0);
            return;
        }
        finally {
            bbpb.b(this.d);
        }
        goto label_1;
    }
}


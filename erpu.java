import android.os.Trace;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

final class erpu implements Runnable {
    public boolean a;
    private final erpt b;
    private final DataInputStream c;

    public erpu(erpt erpt0, DataInputStream dataInputStream0) {
        this.b = erpt0;
        this.c = dataInputStream0;
    }

    @Override
    public final void run() {
        oyn.a("PipeReadManager-readOperation-run");
        while(!Thread.currentThread().isInterrupted() && !this.a) {
            try {
                int v = this.c.readInt();
                baun baun0 = erpv.a;
                baun0.j(a.f(v, "Waiting for ", " bytes."), new Object[0]);
                byte[] arr_b = new byte[v];
                this.c.readFully(arr_b);
                if(baun0.b(2)) {
                    baun0.j("Received bytes with hash " + Arrays.hashCode(arr_b), new Object[0]);
                }
                if(this.a) {
                    baun0.j("Not calling listener -- thread already interrupted.", new Object[0]);
                }
                else {
                    this.b.g(arr_b);
                }
                continue;
            }
            catch(IOException iOException0) {
                Trace.endSection();
                if(!this.a) {
                    throw new RuntimeException(iOException0);
                }
                erpv.a.j("IOException after interrupting thread.", new Object[0]);
                return;
            }
        }
        Trace.endSection();
    }
}


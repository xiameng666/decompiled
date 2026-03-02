import android.util.Log;
import j..util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class czhe implements Runnable {
    final InputStream a;
    final OutputStream b;
    final long c;
    final OutputStream d;
    final czhf e;

    public czhe(czhf czhf0, InputStream inputStream0, OutputStream outputStream0, long v, OutputStream outputStream1) {
        this.a = inputStream0;
        this.b = outputStream0;
        this.c = v;
        this.d = outputStream1;
        Objects.requireNonNull(czhf0);
        this.e = czhf0;
        super();
    }

    @Override
    public final void run() {
        boolean z = false;
        try {
            bbpb.j(this.a, this.b, false, 0x10000);
            goto label_17;
        }
        catch(IOException iOException0) {
            try {
                if(!this.e.a) {
                    Log.w("NearbyConnections", String.format("Exception copying stream for Payload %d", ((long)this.c)), iOException0);
                }
                z = true;
                goto label_17;
            }
            catch(Throwable throwable1) {
                throwable0 = throwable1;
                z = true;
            }
        }
        catch(Throwable throwable0) {
        }
        bbpb.b(this.a);
        czhf.d(this.d, z, this.c);
        bbpb.b(this.b);
        throw throwable0;
    label_17:
        bbpb.b(this.a);
        czhf.d(this.d, z, this.c);
        bbpb.b(this.b);
    }
}


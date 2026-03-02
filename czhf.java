import android.util.Log;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

public final class czhf {
    public volatile boolean a;
    private final ExecutorService b;
    private final bzs c;
    private final bzs d;
    private final bzs e;

    public czhf() {
        this.b = clhl.b.e(6, clhr.b);
        this.c = new bzs();
        this.a = false;
        this.d = new bzs();
        this.e = new bzs();
    }

    final void a(long v) {
        synchronized(this) {
            Long long0 = v;
            bbpb.b(((Closeable)this.c.get(long0)));
            this.c.remove(long0);
            bbpb.b(((Closeable)this.d.get(long0)));
            this.d.remove(long0);
            ParcelablePayload parcelablePayload0 = (ParcelablePayload)this.e.remove(long0);
            if(parcelablePayload0 != null) {
                bbpb.a(parcelablePayload0.d);
                bbpb.a(parcelablePayload0.g);
            }
        }
    }

    final void b(InputStream inputStream0, OutputStream outputStream0, OutputStream outputStream1, ParcelablePayload parcelablePayload0, long v) {
        synchronized(this) {
            Long long0 = v;
            this.c.put(long0, inputStream0);
            this.d.put(long0, outputStream0);
            this.e.put(long0, parcelablePayload0);
            czhe czhe0 = new czhe(this, inputStream0, outputStream0, v, outputStream1);
            this.b.execute(czhe0);
        }
    }

    final void c() {
        bzs bzs2;
        bzs bzs1;
        bzs bzs0;
        synchronized(this) {
            this.a = true;
            this.b.shutdownNow();
            for(int v2 = 0; true; ++v2) {
                bzs0 = this.c;
                if(v2 >= bzs0.d_num) {
                    break;
                }
                bbpb.b(((Closeable)bzs0.i(v2)));
            }
            bzs0.clear();
            for(int v3 = 0; true; ++v3) {
                bzs1 = this.d;
                if(v3 >= bzs1.d_num) {
                    break;
                }
                bbpb.b(((Closeable)bzs1.i(v3)));
            }
            bzs1.clear();
            for(int v1 = 0; true; ++v1) {
                bzs2 = this.e;
                if(v1 >= bzs2.d_num) {
                    break;
                }
                ParcelablePayload parcelablePayload0 = (ParcelablePayload)bzs2.i(v1);
                bbpb.a(parcelablePayload0.d);
                bbpb.a(parcelablePayload0.g);
            }
            bzs2.clear();
        }
    }

    public static final void d(OutputStream outputStream0, boolean z, long v) {
        try {
            outputStream0.write(((int)z));
        }
        catch(IOException iOException0) {
            Log.w("NearbyConnections", String.format("Unable to deliver status for Payload %d", v), iOException0);
        }
        finally {
            bbpb.b(outputStream0);
        }
    }
}


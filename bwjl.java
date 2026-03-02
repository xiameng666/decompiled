import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.CountDownLatch;

public final class bwjl {
    public volatile bwjp a;
    public final CountDownLatch b;
    private static final ComponentName c;
    private final baro d;
    private final ServiceConnection e;
    private int f;
    private final Context g;
    private boolean h;

    static {
        bwjl.c = new ComponentName("com.google.android.gms", "com.google.android.gms.gcm.http.GoogleHttpService");
    }

    public bwjl(Context context0) {
        this.g = context0;
        this.b = new CountDownLatch(1);
        this.d = baro.b(context0);
        this.f = 0;
        this.h = false;
        this.e = new bwjk(this);
    }

    public final void a(String s, int v) {
        boolean z = this.c();
        try {
            if(!z) {
                return;
            }
            if(this.a != null && v > 0) {
                try {
                    this.a.b(s, v);
                }
                catch(RemoteException remoteException0) {
                    Log.w("GoogleHttpServiceClient", "Exception in Google Http Service: ", remoteException0);
                }
            }
        }
        finally {
            this.b();
        }
    }

    public final void b() {
        synchronized(this) {
            int v1 = this.f - 1;
            this.f = v1;
            if(v1 == 0) {
                this.d.f(bwjl.c, this.e);
            }
        }
    }

    public final boolean c() {
        synchronized(this) {
            int v1 = this.f;
            this.f = v1 + 1;
            if(v1 == 0) {
                barn barn0 = new barn(bwjl.c);
                this.h = this.d.d(barn0, this.e, "GoogleHttpServiceClient", null).d();
            }
        }
        return this.h;
    }
}


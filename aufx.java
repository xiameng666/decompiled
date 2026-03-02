import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import java.lang.ref.WeakReference;

public final class aufx {
    public static final aurs a;
    Messenger b;
    public Messenger c;
    public String d;
    Runnable e;
    private static final Object f;
    private static volatile aufx g;
    private final Context h;
    private final bbic i;
    private final clht j;
    private clil k;
    private boolean l;
    private int m;

    static {
        aufx.a = new avjh("AuthContentService");
        aufx.f = new Object();
    }

    private aufx(Context context0, bbic bbic0) {
        this.b = null;
        this.c = null;
        this.k = null;
        this.d = null;
        this.l = false;
        this.m = 0;
        this.h = context0.getApplicationContext();
        this.i = bbic0;
        this.j = new clht(Looper.getMainLooper());
    }

    // Detected as a lambda impl.
    public final void a() {
        aurs aurs0 = aufx.a;
        aurs0.c("Service binding requested (already bound = %b)", new Object[]{Boolean.valueOf(this.l)});
        if(!this.l) {
            ++this.m;
            clil clil0 = this.k;
            if(clil0 == null) {
                aurs0.g("serviceConnection is null: cannot bind to CastAuthContent service at this time.", new Object[0]);
                return;
            }
            bbic bbic0 = this.i;
            Context context0 = this.h;
            if(!bbic0.d(context0, aufx.k(), clil0, 1)) {
                aurs0.g("CastAuthContent service bind attempt failed.", new Object[0]);
                bbic0.b(context0, clil0);
                if(this.m < 10) {
                    aurs0.f("Retrying bind to service in %d seconds", new Object[]{((int)60)});
                    this.g(new auft(this), 60000);
                    return;
                }
                aurs0.g("Max service binding attempts reached. Giving up fetching self-device ID.", new Object[0]);
                return;
            }
            aurs0.f("CastAuthContent service binding created.", new Object[0]);
            this.l = true;
            this.m = 0;
        }
    }

    public final void b() {
        if(this.l) {
            aufx.a.c("Unbinding from CastAuthContentService.", new Object[0]);
            clil clil0 = this.k;
            if(clil0 != null) {
                this.i.b(this.h, clil0);
                this.k = null;
            }
            this.l = false;
        }
    }

    public final void c() {
        if(this.k == null) {
            this.k = new aufu(this);
            this.b = new Messenger(new aufw(new WeakReference(this)));
            boolean z = this.h.getPackageManager().resolveService(aufx.k(), 0) != null;
            aufx.a.c("CastAuthService exists on this device: %b", new Object[]{Boolean.valueOf(z)});
            if(z) {
                this.a();
            }
        }
    }

    public final void d() {
        aufx.a.c("Performing CastAuthServiceClient cleanup", new Object[0]);
        this.j();
        this.b();
        synchronized(aufx.f) {
            aufx.a.c("Freeing shared CastAuthContentServiceClient instance reference.", new Object[0]);
            aufx.g = null;
        }
    }

    final void e() {
        aurs aurs0 = aufx.a;
        aurs0.c("Requesting device Id from CastAuthContent service.", new Object[0]);
        try {
            Message message0 = Message.obtain(null, 1);
            Messenger messenger0 = this.b;
            if(messenger0 == null) {
                aurs0.g("incomingMessenger is null: Device id request aborted.", new Object[0]);
                return;
            }
            message0.replyTo = messenger0;
            Messenger messenger1 = this.c;
            if(messenger1 == null) {
                aurs0.g("serviceMessenger is null: Device id request aborted.", new Object[0]);
                return;
            }
            messenger1.send(message0);
        }
        catch(RemoteException remoteException0) {
            aufx.a.g("Failed to send deviceId request to CastAuthContent service: %s", new Object[]{remoteException0.getMessage()});
        }
    }

    // Detected as a lambda impl.
    public final void f() {
        synchronized(this) {
            Runnable runnable0 = this.e;
            if(runnable0 != null) {
                this.e = null;
                runnable0.run();
            }
        }
    }

    public final void g(Runnable runnable0, int v) {
        synchronized(this) {
            this.j();
            this.e = runnable0;
            aufs aufs0 = () -> synchronized(this) {
                Runnable runnable0 = this.e;
                if(runnable0 != null) {
                    this.e = null;
                    runnable0.run();
                }
            };
            this.j.postDelayed(aufs0, ((long)v));
        }
    }

    public final boolean h(CastDevice castDevice0) {
        String s = castDevice0.n;
        boolean z = this.d != null && s != null && s.equals(this.d);
        if(z) {
            aufx.a.c("device(%s) is a Cast auth-provided self-device", new Object[]{s});
        }
        return z;
    }

    public static aufx i(Context context0) {
        bbic bbic0 = bbic.a();
        if(aufx.g == null) {
            synchronized(aufx.f) {
                if(aufx.g == null) {
                    aufx.g = new aufx(context0, bbic0);
                }
            }
            return aufx.g;
        }
        return aufx.g;
    }

    private final void j() {
        synchronized(this) {
            if(this.e != null) {
                aufx.a.c("Cancelling scheduled retry.", new Object[0]);
                aufs aufs0 = () -> synchronized(this) {
                    Runnable runnable0 = this.e;
                    if(runnable0 != null) {
                        this.e = null;
                        runnable0.run();
                    }
                };
                this.j.removeCallbacks(aufs0);
                this.e = null;
            }
        }
    }

    private static final Intent k() {
        Intent intent0 = new Intent();
        intent0.setClassName("com.google.android.apps.nest.castauth", "com.google.android.apps.nest.castauth.contentservice.CastAuthContentService");
        return intent0;
    }
}


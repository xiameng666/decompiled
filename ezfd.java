import android.content.Context;
import android.content.Intent;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import java.lang.ref.WeakReference;

public final class ezfd implements ezbp {
    public final Object a;
    public boolean b;
    public ghyl c;
    private static WeakReference d;
    private final Context e;
    private boolean f;
    private boolean g;

    static {
        bboh.b("TrustAgent", bbcu.aR);
        ezfd.d = new WeakReference(null);
    }

    private ezfd(Context context0) {
        this.e = context0;
        this.a = new Object();
        this.c = ghyl.a;
    }

    @Override  // ezbp
    public final void a(boolean z) {
    }

    @Override  // ezbp
    public final void b(boolean z) {
        if(hzca.f()) {
            Object object0 = this.a;
            synchronized(object0) {
                if(this.g == z) {
                    return;
                }
                this.g = z;
            }
            this.f("is_configured", z);
            return;
        }
        synchronized(this.a) {
            if(this.g != z) {
                this.g = z;
                this.f("is_configured", z);
            }
        }
    }

    @Override  // ezbp
    public final void c(boolean z, String s) {
        if(hzca.f()) {
            Object object0 = this.a;
            synchronized(object0) {
                if(this.f == z) {
                    return;
                }
                this.f = z;
            }
            this.f("is_trusted", z);
            return;
        }
        synchronized(this.a) {
            if(z != this.f) {
                this.f = z;
                this.f("is_trusted", z);
            }
        }
    }

    @Override  // ezbp
    public final void d(ghyl ghyl0) {
        synchronized(this.a) {
            this.c = ghyl0;
        }
    }

    public static ezfd e() {
        ezfd ezfd0;
        synchronized(ezfd.class) {
            ezfd0 = (ezfd)ezfd.d.get();
            if(ezfd0 == null) {
                ezfd ezfd1 = new ezfd(AppContextProvider.a());
                ezfd.d = new WeakReference(ezfd1);
                return ezfd1;
            }
        }
        return ezfd0;
    }

    public final void f(String s, boolean z) {
        Intent intent0 = new Intent().setAction("com.google.android.gms.trustagent.TRUST_STATE_CHANGED").setPackage("com.google.android.gms").putExtra(s, z);
        this.e.sendBroadcast(intent0, "com.google.android.gms.trustagent.permission.TRUSTAGENT_STATE");
    }

    public final boolean g() {
        synchronized(this.a) {
        }
        return this.g;
    }

    public final boolean h() {
        synchronized(this.a) {
        }
        return this.b;
    }

    public final boolean i() {
        synchronized(this.a) {
        }
        return this.f;
    }
}


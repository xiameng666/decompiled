import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

public final class auim implements cjpb {
    public static final avjh a;
    public final Context b;
    public final ScheduledExecutorService c;
    public final auhn d;
    public final cjpc e;
    public auhm f;
    public long g;
    public aufo h;
    public final ausg i;
    private final Object j;
    private int k;

    static {
        auim.a = new avjh("UsoniaModuleManager");
    }

    public auim(Context context0, ausg ausg0, ScheduledExecutorService scheduledExecutorService0, auhn auhn0) {
        this.k = 1;
        this.j = new Object();
        this.b = context0;
        this.i = ausg0;
        this.c = scheduledExecutorService0;
        this.d = auhn0;
        cjpc cjpc0 = avjn.e(context0);
        this.e = cjpc0;
        this.g = cjpd.b(cjpc0, "com.google.android.gms.PREF_LAST_USONIA_MODULE_DOWNLOAD_REQUEST_TIMESTAMP", 0L);
    }

    @Override  // cjpb
    public final void a(cjpc cjpc0, String s) {
        if("com.google.android.gms.cast.SETTINGS_KEY_UNINSTALL_USONIA_MODULE".equals(s)) {
            auim.a.c("Triggering Usonia Module uninstall after debug setting selected.", new Object[0]);
            Object object0 = this.j;
            synchronized(object0) {
                if(this.k != 4) {
                    return;
                }
                this.b().e(new azty[]{new fapi(this.b, fama.a)}).b(new auif(this));
            }
        }
    }

    final bavt b() {
        return new bawz(this.b);
    }

    final void c(Context context0, bavt bavt0, bavq bavq0, int v) {
        if(v >= 3) {
            auim.a.d("Usonia download failed. Max retry count reached.", new Object[0]);
            this.f(1);
            this.h.a.g.Z();
            return;
        }
        auim.a.c("Downloading Usonia module", new Object[0]);
        ArrayList arrayList0 = new ArrayList();
        bavv.b(new fapi(context0, fama.a), arrayList0);
        evql evql0 = bavt0.c(bavv.a(arrayList0, bavq0));
        evql0.b(new auij());
        evql0.A(new auik(this, context0, bavt0, bavq0, v));
    }

    public final void d() {
        synchronized(this.j) {
            if(this.k == 1) {
                this.f(2);
                this.b().b(new azty[]{new fapi(this.b, fama.a)}).b(new auih(this));
            }
        }
    }

    public final boolean e() {
        synchronized(this.j) {
        }
        return this.k == 4;
    }

    final void f(int v) {
        synchronized(this.j) {
            this.k = v;
        }
    }
}


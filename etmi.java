import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tapandpay.firstparty.InStoreCvmConfig;

public final class etmi implements espy {
    public esqi a;
    private final InStoreCvmConfig b;
    private final etmk c;
    private final eubv d;
    private final Context e;
    private final boolean f;

    public etmi(Context context0, InStoreCvmConfig inStoreCvmConfig0, esqi esqi0, boolean z) {
        this.b = inStoreCvmConfig0;
        this.c = new etmk(context0);
        this.d = new eubv(context0);
        this.a = esqi0;
        this.e = context0;
        this.f = z;
    }

    @Override  // espy
    public final esga a() {
        esga esga0 = this.c.a(this.b.b, false).a;
        this.a.m = esga0;
        return esga0;
    }

    @Override  // espy
    public final boolean b() {
        int v = 1;
        synchronized(this) {
            if(this.f) {
                this.a.i = true;
                return true;
            }
            if(this.d.b() >= this.b.d) {
                this.a.f = true;
                this.a.ae = 5;
                v = 0;
            }
            else if(!this.f()) {
                v = 0;
            }
            this.a.g = v ^ 1;
        }
        return v != 0;
    }

    @Override  // espy
    public final boolean c() {
        long v = SystemClock.elapsedRealtime();
        int v1 = this.d.b();
        boolean z = false;
        boolean z1 = cjpd.i(this.d.c, "remote_lock_hold", false);
        int v2 = esfh.a(this.e);
        esqi esqi0 = this.a;
        esqi0.B = z1;
        esqi0.C = v2 ^ 1;
        esqi0.D = this.c.d();
        if(this.f) {
            this.a.i = true;
            return true;
        }
        if(v1 < this.b.c && !z1 && v2 != 0 && this.f()) {
            z = true;
        }
        esqi esqi1 = this.a;
        esqi1.o = SystemClock.elapsedRealtime() - v;
        return z;
    }

    @Override  // espy
    public final boolean d() {
        return this.d.u() && this.d.v();
    }

    public static InStoreCvmConfig e(int v) {
        int v1;
        esls esls0;
        if(v != 630 && v != 840) {
            esls0 = new esls();
            esls0.a = false;
            esls0.b = 180;
            esls0.c = 3;
            v1 = 2;
        }
        else {
            esls0 = new esls();
            esls0.a = true;
            esls0.b = 600;
            v1 = 20;
            esls0.c = 20;
        }
        esls0.d = v1;
        esls0.e = false;
        return esls0.a();
    }

    private final boolean f() {
        etmf etmf0;
        synchronized(this) {
            long v1 = SystemClock.elapsedRealtime();
            etmf0 = this.c.a(this.b.b, false);
            esqi esqi0 = this.a;
            esqi0.n = SystemClock.elapsedRealtime() - v1;
            this.a.ae = etmf0.c;
            this.a.af = etmf0.d;
            this.a.m = etmf0.a;
            hyxp.g();
        }
        return etmf0.a();
    }
}


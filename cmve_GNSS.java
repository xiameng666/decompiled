import android.os.SystemClock;
import com.google.android.gms.libs.identity.ImmutableWorkSource;
import com.google.android.gms.libs.location.validation.platform.GnssLocationListener;
import com.google.android.gms.location.fused.engine.controllers.GnssProviderController..ExternalSyntheticLambda0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public final class cmve_GNSS {
    public Consumer a;
    public cjgx b;
    private final Executor c;
    private final cmth_FusedLocation d;
    private final gful_cronetEngineProvider e;
    private cmuh_unknownRequest f;
    private cjgv g;
    private final cjgl h;

    public cmve_GNSS(cjhj cjhj0, Executor executor0, cmth_FusedLocation cmth0, gful_cronetEngineProvider gful0) {
        this.a = null;
        this.f = cmuh_unknownRequest.a;
        this.g = null;
        this.b = null;
        this.h = new cjgl(cjhj0);
        this.c = executor0;
        this.d = cmth0;
        this.e = gful0;
    }

    public final void a() {
        synchronized(this) {
            if(huqy_phenotype.E()) {
                gftb.q(this.a != null);
            }
            this.a = null;
            this.f = cmuh_unknownRequest.a;
            this.e();
        }
    }

    public final void b(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        synchronized(this) {
            ibuq.f(fileDescriptor0, "fd");
            ibuq.f(arr_s, "args");
            cmvt cmvt0 = cmvt.a;
            ibuq.f(fileDescriptor0, "fd");
            ibuq.f(arr_s, "args");
            synchronized(cmvt0) {
                if(hunn.g() && bbqa.c()) {
                    ibuq.f(fileDescriptor0, "fd");
                    ibuq.f(arr_s, "args");
                    synchronized(cmvr.a) {
                        printWriter0.println("BlueStar flags:");
                        bbpd bbpd0 = new bbpd(printWriter0, "  ");
                        bbpd0.b();
                        cmpl.a(bbpd0);
                        cmvq.b().g(printWriter0, arr_s);
                    }
                }
            }
        }
    }

    public final void c(Consumer consumer0) {
        synchronized(this) {
            if(huqy_phenotype.E()) {
                gftb.q(this.a == null);
            }
            this.a = consumer0;
            this.e();
        }
    }

    public final void d(cmuh_unknownRequest cmuh0) {
        synchronized(this) {
            if(huqy_phenotype.E()) {
                gftb.q(this.a != null);
            }
            this.f = cmuh0;
            this.e();
        }
    }

    private final void e() {
        long v7;
        cjgv cjgv0;
        if(this.a == null) {
            cjgx cjgx0 = this.b;
            if(cjgx0 != null) {
                synchronized(cjgx0) {
                    GnssLocationListener gnssLocationListener0 = cjgx0.e;
                    cjgx0.e = null;
                }
                if(gnssLocationListener0 != null) {
                    cmvt.a.b(cjgx0.d);
                }
                this.b = null;
                this.g = null;
                this.d.f("gps", 0x7FFFFFFFFFFFFFFFL, 0L);
                return;
            }
        }
        if(this.f.d()) {
            cjgv0 = cjgu.c(cjhs.a, cjgv.c, cjgv.c, true, this.f.f, 0xC0);
        }
        else {
            long v = this.f.c;
            long v1 = this.f.e;
            boolean z = this.f.f;
            ImmutableWorkSource immutableWorkSource0 = this.f.g;
            ibuq.f(cjhs.a, "quality");
            ibuq.f(immutableWorkSource0, "workSource");
            long v2 = ibzy.i(v, ibzz.c);
            long v3 = ibzy.i(0L, ibzz.c);
            long v4 = ibzy.i(v1, ibzz.c);
            cjgv0 = cjgu.a(cjhs.a, v2, v3, v4, true, z, immutableWorkSource0);
        }
        if(cjgv0.equals(this.g)) {
            return;
        }
        if(this.g != null || !this.f.d()) {
            this.d.f("gps", cjgv0.b(), cjgv0.d());
        }
        long v5 = SystemClock.elapsedRealtime();
        long v6 = (long)(((Long)this.e.mr()));
        if(huqy_phenotype.y()) {
            v7 = cjgv0.d();
        }
        else {
            v7 = cjgv0.h() ? cjgv0.d() : cjgv0.b();
        }
        long v8 = cmug.a(v7, v6, v5) - v5;
        cjgx cjgx1 = this.b;
        if(cjgx1 == null) {
            GnssProviderController..ExternalSyntheticLambda0 gnssProviderController$$ExternalSyntheticLambda00 = new GnssProviderController..ExternalSyntheticLambda0(this);
            cjgx cjgx2 = new cjgx(this.h.a, this.h.b, this.c, gnssProviderController$$ExternalSyntheticLambda00);
            long v10 = ibzy.i(v8, ibzz.c);
            cmvt.a.a(cjgx2.a, cjgx2.b, cjgv0, v10, cjgx2.c, cjgx2.d);
            this.b = cjgx2;
        }
        else if(cjgx1.e != null) {
            long v9 = ibzy.i(v8, ibzz.c);
            cmvt.a.a(cjgx1.a, cjgx1.b, cjgv0, v9, cjgx1.c, cjgx1.d);
        }
        this.g = cjgv0;
    }

    @Override
    public final String toString() {
        String request_;
        synchronized(this) {
            request_ = String.valueOf(this.g);
        }
        return "GNSS[request=" + request_ + "]";
    }
}


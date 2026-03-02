import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferConfigurations;

public final class eqsy extends eqth implements cjug, eqfv {
    public static final erqc a;
    public eqlx b;
    public long c;
    private final String d;
    private final String e;
    private final Context f;
    private final Handler g;
    private final boolean h;
    private final boolean i;
    private eqbv j;
    private final cjts k;

    static {
        eqsy.a = new erqc(new String[]{"SourceDirectTransferService"});
    }

    public eqsy(cjts cjts0, Context context0, Handler handler0, boolean z, boolean z1, String s, String s1) {
        this.d = s;
        this.e = s1;
        this.k = cjts0;
        this.f = context0;
        this.g = handler0;
        this.h = z;
        this.i = z1;
        this.h();
    }

    public final void a() {
        synchronized(this) {
            this.b = null;
            eqbv eqbv0 = this.j;
            if(eqbv0 != null) {
                eqsr eqsr0 = new eqsr(this, eqbv0);
                this.g.post(eqsr0);
            }
            this.j = null;
        }
    }

    public static void c(eqlx eqlx0, long v) {
        eqlx0.q(System.currentTimeMillis() - v);
        if(!bbmq.P()) {
            eqlx0.a();
        }
    }

    @Override  // eqti
    public final void d(eqtg eqtg0, ApiMetadata apiMetadata0) {
        eqbv eqbv0 = this.h();
        azug azug0 = this.g(apiMetadata0);
        eqst eqst0 = new eqst(eqtg0, eqbv0, this.g, azug0);
        this.k.b(eqst0);
    }

    @Override  // eqti
    public final void e(eqtg eqtg0, Bundle bundle0, ApiMetadata apiMetadata0) {
        eqbv eqbv0 = this.h();
        azug azug0 = this.g(apiMetadata0);
        eqsv eqsv0 = new eqsv(eqtg0, bundle0, eqbv0, this.g, azug0);
        this.k.b(eqsv0);
    }

    @Override  // eqti
    public final void f(eqtg eqtg0, DirectTransferConfigurations directTransferConfigurations0, ParcelFileDescriptor[] arr_parcelFileDescriptor, eqib eqib0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.ku);
        if(hygx.f() && directTransferConfigurations0.l == 1) {
            ggfp ggfp0 = ggfp.G(hygx.a.b().f().b);
            if(!this.h || !ggfp0.contains(this.d)) {
                throw new SecurityException(this.d + " is not authorized to skip Confirmation and UV");
            }
        }
        eqbv eqbv0 = this.h();
        azug azug0 = this.g(apiMetadata0);
        eqsx eqsx0 = new eqsx(eqtg0, directTransferConfigurations0, arr_parcelFileDescriptor, new epyl(eqib0), eqbv0, this.g, azug0);
        this.k.b(eqsx0);
    }

    private final azug g(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.eP);
        azuf0.g(bbdq.aT);
        azuf0.d(this.d);
        azuf0.c(this.e);
        return azuf0.a();
    }

    private final eqbv h() {
        eqbv eqbv0 = this.j;
        if(eqbv0 != null) {
            return eqbv0;
        }
        eqlx eqlx0 = new eqlx(this.f);
        eqlx0.g(this.d, this.h, this.i);
        this.c = System.currentTimeMillis();
        eqbv eqbv1 = new eqbv(new epzg(this.f, this.g, eqlx0, this, this.d));
        this.j = eqbv1;
        this.b = eqlx0;
        return eqbv1;
    }

    @Override  // eqfv
    public final void m() {
        eqsy.a.h("onComplete()", new Object[0]);
        eqlx eqlx0 = this.b;
        if(eqlx0 == null) {
            return;
        }
        eqlx0.o(true);
        eqsy.c(eqlx0, this.c);
        long v = hyim.d();
        if(v < 0L) {
            this.a();
            return;
        }
        eqsq eqsq0 = new eqsq(this);
        this.g.postDelayed(eqsq0, v);
    }

    @Override  // eqfv
    public final void o(int v, eqoc eqoc0) {
        eqsy.a.f("onError: " + v, new Object[0]);
        eqlx eqlx0 = this.b;
        if(eqlx0 == null) {
            return;
        }
        eqlx0.o(false);
        eqlx0.c(v);
        eqlx0.h(eqoc0);
        eqsy.c(eqlx0, this.c);
        this.a();
    }
}


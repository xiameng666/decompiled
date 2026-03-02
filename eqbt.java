import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

public final class eqbt extends eqim implements cjug, eqfv {
    private static final erqc a;
    private final String b;
    private final String c;
    private final Context d;
    private final Handler e;
    private final boolean f;
    private final boolean g;
    private eqbv h;
    private eqlx i;
    private long j;
    private final cjts k;

    static {
        eqbt.a = new erqc(new String[]{"SourceDeviceServiceDelegate"});
    }

    public eqbt(cjvl cjvl0, Context context0, Handler handler0, boolean z, String s, String s1) {
        cjts cjts0 = new cjts(context0, cjvl0, new bblp(1, 10));
        super();
        this.b = s;
        this.c = s1;
        this.k = cjts0;
        this.d = context0;
        this.e = handler0;
        this.f = true;
        this.g = z;
        this.x();
    }

    @Override  // eqin
    public final void a(eqik eqik0, ApiMetadata apiMetadata0) {
        eqbv eqbv0 = this.x();
        azug azug0 = this.w(apiMetadata0);
        eqau eqau0 = new eqau(eqik0, eqbv0, this.e, azug0);
        this.k.b(eqau0);
    }

    @Override  // eqin
    public final void c(eqvw eqvw0, HandshakeData handshakeData0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqin
    public final void d(eqik eqik0, D2DDevice d2DDevice0, BootstrapConfigurations bootstrapConfigurations0, eqie eqie0, ApiMetadata apiMetadata0) {
        eqbv eqbv0 = this.x();
        azug azug0 = this.w(apiMetadata0);
        eqaw eqaw0 = new eqaw(eqik0, d2DDevice0, bootstrapConfigurations0, eqie0, eqbv0, this.e, azug0);
        this.k.b(eqaw0);
    }

    public final void e() {
        synchronized(this) {
            this.i = null;
            eqbv eqbv0 = this.h;
            if(eqbv0 != null) {
                eqas eqas0 = new eqas(this, eqbv0);
                this.e.post(eqas0);
            }
            this.h = null;
        }
    }

    @Override  // eqin
    public final void f(eqik eqik0, D2DDevice d2DDevice0, String s, eqih eqih0, ApiMetadata apiMetadata0) {
        eqbv eqbv0 = this.x();
        azug azug0 = this.w(apiMetadata0);
        eqba eqba0 = new eqba(eqik0, d2DDevice0, s, eqih0, eqbv0, this.e, azug0);
        this.k.b(eqba0);
    }

    @Override  // eqin
    public final void g(ConnectParams connectParams0, ApiMetadata apiMetadata0) {
        eqbv eqbv0 = this.x();
        azug azug0 = this.w(apiMetadata0);
        eqay eqay0 = new eqay(connectParams0, eqbv0, this.e, azug0);
        this.k.b(eqay0);
    }

    @Override  // eqin
    public final void h(eqik eqik0, ApiMetadata apiMetadata0) {
        eqbv eqbv0 = this.x();
        azug azug0 = this.w(apiMetadata0);
        eqbe eqbe0 = new eqbe(eqik0, eqbv0, this.e, azug0);
        this.k.b(eqbe0);
    }

    @Override  // eqin
    public final void i(eqik eqik0, ApiMetadata apiMetadata0) {
        eqbv eqbv0 = this.x();
        azug azug0 = this.w(apiMetadata0);
        eqbg eqbg0 = new eqbg(eqik0, eqbv0, this.e, azug0);
        this.k.b(eqbg0);
    }

    @Override  // eqin
    public final void j(eqvw eqvw0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqin
    public final void k(eqvw eqvw0, HandshakeData handshakeData0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqin
    public final void l(eqik eqik0, Bundle bundle0, ApiMetadata apiMetadata0) {
        eqbv eqbv0 = this.x();
        azug azug0 = this.w(apiMetadata0);
        eqbi eqbi0 = new eqbi(eqik0, bundle0, eqbv0, this.e, azug0);
        this.k.b(eqbi0);
    }

    @Override  // eqfv
    public final void m() {
        eqbt.a.h("onComplete().", new Object[0]);
        eqlx eqlx0 = this.i;
        if(eqlx0 == null) {
            return;
        }
        eqlx0.o(true);
        eqbt.y(eqlx0, this.j);
        long v = hyim.d();
        if(v < 0L) {
            this.e();
            return;
        }
        eqar eqar0 = new eqar(this);
        this.e.postDelayed(eqar0, v);
    }

    public final void n() {
        eqbt.a.h("onDestroy().", new Object[0]);
        eqlx eqlx0 = this.i;
        if(eqlx0 != null) {
            eqbt.y(eqlx0, this.j);
        }
        this.e();
    }

    @Override  // eqfv
    public final void o(int v, eqoc eqoc0) {
        eqbt.a.f("onError: " + v, new Object[0]);
        eqlx eqlx0 = this.i;
        if(eqlx0 == null) {
            return;
        }
        eqlx0.o(false);
        eqlx0.c(v);
        eqlx0.h(eqoc0);
        eqbt.y(eqlx0, this.j);
        this.e();
    }

    @Override  // eqin
    public final void p(eqik eqik0, Bundle bundle0, ApiMetadata apiMetadata0) {
        eqbv eqbv0 = this.x();
        azug azug0 = this.w(apiMetadata0);
        eqbk eqbk0 = new eqbk(eqik0, bundle0, eqbv0, this.e, azug0);
        this.k.b(eqbk0);
    }

    @Override  // eqin
    public final void q(eqik eqik0, BootstrapConfigurations bootstrapConfigurations0, ParcelFileDescriptor[] arr_parcelFileDescriptor, eqib eqib0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.ku);
        eqbv eqbv0 = this.x();
        azug azug0 = this.w(apiMetadata0);
        eqbm eqbm0 = new eqbm(eqik0, bootstrapConfigurations0, arr_parcelFileDescriptor, new epyl(eqib0), eqbv0, this.e, azug0);
        this.k.b(eqbm0);
    }

    @Override  // eqin
    public final void r(eqik eqik0, eqiq eqiq0, ApiMetadata apiMetadata0) {
        eqbv eqbv0 = this.x();
        azug azug0 = this.w(apiMetadata0);
        eqbo eqbo0 = new eqbo(eqik0, eqiq0, eqbv0, this.e, azug0);
        this.k.b(eqbo0);
    }

    @Override  // eqin
    public final void s(eqik eqik0, ApiMetadata apiMetadata0) {
        eqbv eqbv0 = this.x();
        azug azug0 = this.w(apiMetadata0);
        eqbq eqbq0 = new eqbq(eqik0, eqbv0, this.e, azug0);
        this.k.b(eqbq0);
    }

    @Override  // eqin
    public final void t(eqik eqik0, BootstrapConfigurations bootstrapConfigurations0, ApiMetadata apiMetadata0) {
        eqbv eqbv0 = this.x();
        azug azug0 = this.w(apiMetadata0);
        eqbs eqbs0 = new eqbs(eqik0, bootstrapConfigurations0, eqbv0, this.e, azug0);
        this.k.b(eqbs0);
    }

    @Override  // eqin
    public final void u(eqik eqik0, BootstrapConfigurations bootstrapConfigurations0, ParcelFileDescriptor[] arr_parcelFileDescriptor, eqia eqia0, ApiMetadata apiMetadata0) {
        eqbv eqbv0 = this.x();
        azug azug0 = this.w(apiMetadata0);
        eqbm eqbm0 = new eqbm(eqik0, bootstrapConfigurations0, arr_parcelFileDescriptor, new epyl(eqia0), eqbv0, this.e, azug0);
        this.k.b(eqbm0);
    }

    @Override  // eqin
    public final void v(eqik eqik0, ApiMetadata apiMetadata0) {
        eqbv eqbv0 = this.x();
        azug azug0 = this.w(apiMetadata0);
        eqbc eqbc0 = new eqbc(eqik0, eqbv0, this.e, azug0);
        this.k.b(eqbc0);
    }

    private final azug w(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.eP);
        azuf0.g(bbdq.aT);
        azuf0.d(this.b);
        azuf0.c(this.c);
        return azuf0.a();
    }

    private final eqbv x() {
        eqbv eqbv0 = this.h;
        if(eqbv0 != null) {
            return eqbv0;
        }
        eqlx eqlx0 = new eqlx(this.d);
        eqlx0.g(this.b, this.f, this.g);
        this.j = System.currentTimeMillis();
        eqbv eqbv1 = new eqbv(new epzg(this.d, this.e, eqlx0, this, this.b));
        this.h = eqbv1;
        this.i = eqlx0;
        return eqbv1;
    }

    private static void y(eqlx eqlx0, long v) {
        eqlx0.q(System.currentTimeMillis() - v);
        if(!bbmq.P()) {
            eqlx0.a();
        }
    }
}


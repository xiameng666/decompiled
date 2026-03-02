import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.connection.v3.AdvertisingOptions;

public final class czjq extends azts implements cvxr {
    public cyyf a;
    public final String b;
    public static final int c;
    private static final azta_api d;
    private static final azss e;
    private static final azsy f;

    static {
        azss azss0 = new azss();
        czjq.e = azss0;
        czjk czjk0 = new czjk();
        czjq.f = czjk0;
        czjq.d = new azta_api("Nearby.CONNECTIONS_API", czjk0, azss0);
    }

    public czjq(Context context0, cvxl cvxl0) {
        super(context0, czjq.d, cvxl0, aztr_settings.a);
        batl.s(cvxl0.b);
        this.b = cvxl0.b;
    }

    @Override  // cvxr
    public final evql b(cuwd cuwd0, cvxf cvxf0) {
        azzc azzc0 = new azzc();
        azzc0.a = new czjf(cuwd0, this.iD(cvxf0, cvxf.class.getName()));
        azzc0.d = 0x55B;
        azzc0.c = new Feature[]{cumh.h};
        return this.jn(azzc0.a());
    }

    @Override  // cvxr
    public final evql c(cuwd cuwd0) {
        czjg czjg0 = new czjg(cuwd0);
        azzc azzc0 = new azzc();
        azzc0.d = 0x55D;
        azzc0.c = new Feature[]{cumh.h};
        azzc0.a = new cziu(czjg0);
        return this.jn(azzc0.a());
    }

    @Override  // cvxr
    public final evql d(byte[] arr_b, cvxg cvxg0, AdvertisingOptions advertisingOptions0) {
        czjm czjm0 = new czjm(this, cvxg0);
        azyf azyf0 = this.a.a(this, new Object(), "advertising");
        cyyf cyyf0 = this.a;
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.d = new Feature[]{cumh.h};
        azyq0.a = new czjc(this, arr_b, this.iD(czjm0, cvxg.class.getName()), advertisingOptions0, cvxg0);
        azyq0.b = new czjd();
        azyq0.e = 0x55E;
        return cyyf0.c(this, azyq0.a());
    }

    @Override  // cvxr
    public final void e(cuwd cuwd0, int v) {
        cziv cziv0 = new cziv(cuwd0, v);
        azzc azzc0 = new azzc();
        azzc0.d = 0x55D;
        azzc0.c = new Feature[]{cumh.h};
        azzc0.a = new czje(cziv0);
        this.jn(azzc0.a());
        this.i(cuwd0.e());
    }

    @Override  // cvxr
    public final void f() {
        this.a.d(this, "advertising");
    }

    @Override  // cvxr
    public final void g() {
        this.a.d(this, "discovery").b(new cziw());
    }

    public final void h(String s) {
        azyf azyf0 = this.a.g(this, s);
        cyyf cyyf0 = this.a;
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.a = new czjb();
        azyq0.b = new czjh();
        azyq0.e = 0x561;
        cyyf0.c(this, azyq0.a());
    }

    public final void i(String s) {
        this.a.e(this, this.a.f(s));
    }
}


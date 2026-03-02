import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionListeningOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

public final class czdu extends azts implements cuvm {
    public cyyf a;
    public static final int b;
    private static final azta_api c;
    private static final azss d;
    private static final azsy e;

    static {
        azss azss0 = new azss();
        czdu.d = azss0;
        czcw czcw0 = new czcw();
        czdu.e = czcw0;
        czdu.c = new azta_api("Nearby.CONNECTIONS_API", czcw0, azss0);
    }

    private czdu(Context context0, cuvt cuvt0) {
        super(context0, czdu.c, cuvt0, aztr_settings.a);
    }

    @Override  // cuvm
    public final evql b(cuwd cuwd0, cvxf cvxf0) {
        azzc azzc0 = new azzc();
        azzc0.a = new czby(this, cuwd0, this.iD(cvxf0, cuwv.class.getName()));
        azzc0.d = 0x4CB;
        azzc0.c = new Feature[]{cumh.g};
        return this.jn(azzc0.a());
    }

    @Override  // cuvm
    public final evql c(String s, cuwv cuwv0) {
        azzc azzc0 = new azzc();
        azzc0.a = new czcc(this, s, this.iD(cuwv0, cuwv.class.getName()));
        azzc0.d = 0x4CB;
        return this.jn(azzc0.a());
    }

    public final void cA(String s) {
        azyf azyf0 = this.a.g(this, s);
        cyyf cyyf0 = this.a;
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.a = new czbq();
        azyq0.b = new czbr();
        azyq0.e = 0x4F4;
        cyyf0.c(this, azyq0.a());
    }

    public final void cB(String s) {
        this.a.e(this, this.a.f(s));
    }

    private final evql cC(czdn czdn0) {
        azzc azzc0 = new azzc();
        azzc0.d = 0x4CD;
        azzc0.a = new czca(this, czdn0);
        return this.jn(azzc0.a());
    }

    private final evql cD(czdt czdt0) {
        azzc azzc0 = new azzc();
        azzc0.d = 0x4CD;
        azzc0.a = new czcj(czdt0);
        return this.jn(azzc0.a());
    }

    public static czdu cz(Context context0, cuvt cuvt0) {
        czdu czdu0 = new czdu(context0, cuvt0);
        czdu0.a = cyyf.b(czdu0, cuvt0);
        return czdu0;
    }

    @Override  // cuvm
    public final evql d(long v) {
        return this.cC(new czbw(v));
    }

    @Override  // cuvm
    public final evql e(String s) {
        return this.cC(new czbx(s));
    }

    @Override  // cuvm
    public final evql f(String s) {
        return this.cC(new czcl(s));
    }

    @Override  // cuvm
    public final evql g(String s, cuwd cuwd0, cvxe cvxe0, ConnectionOptions connectionOptions0) {
        czdp czdp0 = new czdp(this, cvxe0);
        this.cA(cuwd0.e());
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{cumh.g};
        azzc0.a = new czcf(s, cuwd0, this.iD(czdp0, cvxe.class.getName()), connectionOptions0);
        azzc0.d = 0x4CA;
        evql evql0 = this.jn(azzc0.a());
        evql0.A(new czda(this, cuwd0));
        return evql0;
    }

    @Override  // cuvm
    public final evql h(String s, String s1, cuvg cuvg0, ConnectionOptions connectionOptions0) {
        czdo czdo0 = new czdo(this, cuvg0);
        this.cA(s1);
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{cumh.f};
        azzc0.a = new czcv(this, s, s1, this.iD(czdo0, cuvg.class.getName()), connectionOptions0);
        azzc0.d = 0x4CA;
        evql evql0 = this.jn(azzc0.a());
        evql0.A(new czcx(this, s1));
        return evql0;
    }

    @Override  // cuvm
    public final evql i(byte[] arr_b, String s, cuvg cuvg0, ConnectionOptions connectionOptions0) {
        czdo czdo0 = new czdo(this, cuvg0);
        this.cA(s);
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{cumh.f};
        azzc0.a = new czbm(this, arr_b, s, this.iD(czdo0, cuvg.class.getName()), connectionOptions0);
        azzc0.d = 0x4CA;
        evql evql0 = this.jn(azzc0.a());
        evql0.A(new czcy(this, s));
        return evql0;
    }

    @Override  // cuvm
    public final evql j(cuwd cuwd0, cuwu cuwu0) {
        azzc azzc0 = new azzc();
        azzc0.a = new czbp(this, cuwd0, cuwu0);
        azzc0.d = 0x4CC;
        azzc0.c = new Feature[]{cumh.g};
        return this.jn(azzc0.a());
    }

    @Override  // cuvm
    public final evql k(String s, cuwu cuwu0) {
        azzc azzc0 = new azzc();
        azzc0.a = new czco(this, s, cuwu0);
        azzc0.d = 0x4CC;
        return this.jn(azzc0.a());
    }

    @Override  // cuvm
    public final evql l(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new czcp(this, s);
        azzc0.c = new Feature[]{cumh.F};
        azzc0.d = 0x568;
        return this.jn(azzc0.a());
    }

    @Override  // cuvm
    public final evql m(String s, String s1, cuvg cuvg0, AdvertisingOptions advertisingOptions0) {
        czdo czdo0 = new czdo(this, cuvg0);
        azyf azyf0 = this.a.a(this, new Object(), "advertising");
        cyyf cyyf0 = this.a;
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.a = new czbo(this, s, s1, this.iD(czdo0, cuvg.class.getName()), advertisingOptions0);
        azyq0.b = new czbz();
        azyq0.e = 0x4F2;
        return cyyf0.c(this, azyq0.a());
    }

    @Override  // cuvm
    public final evql n(byte[] arr_b, String s, cuvg cuvg0, AdvertisingOptions advertisingOptions0) {
        czdo czdo0 = new czdo(this, cuvg0);
        azyf azyf0 = this.a.a(this, new Object(), "advertising");
        cyyf cyyf0 = this.a;
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.d = new Feature[]{cumh.f};
        azyq0.a = new czcd(this, arr_b, s, this.iD(czdo0, cuvg.class.getName()), advertisingOptions0);
        azyq0.b = new czce();
        azyq0.e = 0x4F2;
        return cyyf0.c(this, azyq0.a());
    }

    @Override  // cuvm
    public final evql o(String s, cuwp cuwp0, DiscoveryOptions discoveryOptions0) {
        azyf azyf0 = this.a.a(this, cuwp0, "discovery");
        cyyf cyyf0 = this.a;
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.a = new czck(this, s, azyf0, discoveryOptions0);
        azyq0.b = new czcs();
        azyq0.e = 0x4F3;
        evql evql0 = cyyf0.c(this, azyq0.a());
        evql0.b(new czct());
        evql0.A(new czcu());
        return evql0;
    }

    @Override  // cuvm
    public final evql p(String s, cvxe cvxe0, ConnectionListeningOptions connectionListeningOptions0) {
        czdp czdp0 = new czdp(this, cvxe0);
        azyf azyf0 = this.a.a(this, new Object(), "listening");
        cyyf cyyf0 = this.a;
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.d = new Feature[]{cumh.g};
        azyq0.a = new czbj();
        azyq0.b = new czbk();
        azyq0.e = 0x4CD;
        cyyf0.c(this, azyq0.a());
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{cumh.g};
        azzc0.a = new czbl(s, this.iD(czdp0, cvxe.class.getName()), connectionListeningOptions0);
        azzc0.d = 0x4CD;
        return this.iG(azzc0.a());
    }

    @Override  // cuvm
    public final void q(cuwd cuwd0) {
        czci czci0 = new czci(cuwd0);
        azzc azzc0 = new azzc();
        azzc0.d = 0x4CD;
        azzc0.c = new Feature[]{cumh.g};
        azzc0.a = new czch(czci0);
        this.jn(azzc0.a());
        this.cB(cuwd0.e());
    }

    @Override  // cuvm
    public final void r(String s) {
        this.cD(new czbt(s));
        this.cB(s);
    }

    @Override  // cuvm
    public final void s() {
        this.a.d(this, "advertising");
    }

    @Override  // cuvm
    public final void t() {
        this.s();
        this.u();
        this.cD(new czcq()).z(new czcr(this));
    }

    @Override  // cuvm
    public final void u() {
        this.a.d(this, "discovery").b(new czcb());
    }

    @Override  // cuvm
    public final void v() {
        this.a.d(this, "listening");
    }

    @Override  // cuvm
    public final evql w(byte[] arr_b, AdvertisingOptions advertisingOptions0) {
        azzc azzc0 = new azzc();
        azzc0.a = new czbn(this, arr_b, advertisingOptions0);
        azzc0.d = 0x4CD;
        azzc0.c = new Feature[]{cumh.B};
        return this.jn(azzc0.a());
    }

    @Override  // cuvm
    public final evql x(DiscoveryOptions discoveryOptions0) {
        azzc azzc0 = new azzc();
        azzc0.a = new czbh(this, discoveryOptions0);
        azzc0.d = 0x4CD;
        azzc0.c = new Feature[]{cumh.D};
        evql evql0 = this.jn(azzc0.a());
        evql0.b(new czbi());
        return evql0;
    }
}


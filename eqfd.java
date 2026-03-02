import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

public final class eqfd extends eqiy implements cjug, eqfv {
    public static final erqc a;
    public final Handler b;
    public final eqff c;
    private final String d;
    private final String e;
    private final eqme f;
    private final eqln g;
    private final epyt h;
    private final long i;
    private boolean j;
    private final cjts k;

    static {
        eqfd.a = new erqc(new String[]{"TargetDeviceServiceDelegate"});
    }

    public eqfd(cjvl cjvl0, Context context0, Handler handler0, boolean z, boolean z1, String s, String s1) {
        cjts cjts0 = new cjts(context0, cjvl0, new bblp(1, 10));
        super();
        this.d = s;
        this.e = s1;
        this.k = cjts0;
        this.b = handler0;
        eqme eqme0 = new eqme(context0);
        this.f = eqme0;
        this.s(s, z, z1);
        this.i = System.currentTimeMillis();
        this.g = new eqln(context0, handler0);
        this.h = new epyt(context0);
        this.c = new eqff(new epzg(context0, handler0, eqme0, this));
    }

    @Override  // eqiz
    public final void a(eqiw eqiw0, ApiMetadata apiMetadata0) {
        azug azug0 = this.y(apiMetadata0);
        eqem eqem0 = new eqem(eqiw0, this.c, this.b, azug0);
        this.k.b(eqem0);
    }

    @Override  // eqiz
    public final void c(eqvw eqvw0, HandshakeData handshakeData0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqiz
    public final void d(eqvw eqvw0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqiz
    public final void e(eqiw eqiw0, ApiMetadata apiMetadata0) {
        azug azug0 = this.y(apiMetadata0);
        eqeo eqeo0 = new eqeo(eqiw0, this.c, this.b, azug0);
        this.k.b(eqeo0);
    }

    @Override  // eqiz
    public final void f(eqiw eqiw0, BootstrapOptions bootstrapOptions0, eqit eqit0, ApiMetadata apiMetadata0) {
        this.f.A();
        azug azug0 = this.y(apiMetadata0);
        eqeq eqeq0 = new eqeq(eqiw0, this.c, bootstrapOptions0, eqit0, this.b, azug0);
        this.k.b(eqeq0);
    }

    public final void g() {
        if(!this.j) {
            this.f.B(System.currentTimeMillis() - this.i);
            this.j = true;
        }
        if(!bbmq.P()) {
            this.f.i();
        }
        this.r();
    }

    @Override  // eqiz
    public final void h(eqiw eqiw0, ApiMetadata apiMetadata0) {
        azug azug0 = this.y(apiMetadata0);
        eqes eqes0 = new eqes(eqiw0, this.c, this.b, azug0);
        this.k.b(eqes0);
    }

    @Override  // eqiz
    public final void i(eqvw eqvw0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqiz
    public final void j(eqiw eqiw0, ApiMetadata apiMetadata0) {
        eqmb.a(this.f, 22);
        this.f.E(5);
        azug azug0 = this.y(apiMetadata0);
        eqeu eqeu0 = new eqeu(eqiw0, this.h, this.b, azug0);
        this.k.b(eqeu0);
    }

    @Override  // eqiz
    public final void k(eqiw eqiw0, ApiMetadata apiMetadata0) {
        eqmb.a(this.f, 23);
        this.f.E(4);
        azug azug0 = this.y(apiMetadata0);
        eqew eqew0 = new eqew(eqiw0, this.g, this.b, azug0);
        this.k.b(eqew0);
    }

    @Override  // eqiz
    public final void l(eqiw eqiw0, ApiMetadata apiMetadata0) {
        azug azug0 = this.y(apiMetadata0);
        eqey eqey0 = new eqey(eqiw0, this.c, this.b, azug0);
        this.k.b(eqey0);
    }

    @Override  // eqfv
    public final void m() {
        eqfd.a.h("onComplete()", new Object[0]);
        this.f.z(true);
        this.g();
    }

    @Override  // eqiz
    public final void n(eqvw eqvw0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqfv
    public final void o(int v, eqoc eqoc0) {
        eqfd.a.f("onError() with error %d %s", new Object[]{v, epzh.a(v)});
        this.f.z(false);
        this.f.k(v);
        this.f.n(eqoc0);
        this.g();
    }

    @Override  // eqiz
    public final void p(eqvw eqvw0, HandshakeData handshakeData0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqiz
    public final void q(eqvw eqvw0, ApiMetadata apiMetadata0) {
    }

    public final void r() {
        this.j = false;
        this.f.j();
    }

    public final void s(String s, boolean z, boolean z1) {
        this.f.m(s, z, z1);
    }

    @Override  // eqiz
    public final void t(eqiw eqiw0, BootstrapOptions bootstrapOptions0, ParcelFileDescriptor[] arr_parcelFileDescriptor, eqib eqib0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.kv);
        azug azug0 = this.y(apiMetadata0);
        epyl epyl0 = new epyl(eqib0);
        eqfc eqfc0 = new eqfc(eqiw0, this.c, bootstrapOptions0, arr_parcelFileDescriptor, epyl0, this.b, azug0);
        this.k.b(eqfc0);
    }

    @Override  // eqiz
    public final void u(eqvw eqvw0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqiz
    public final String v(BootstrapOptions bootstrapOptions0) {
        this.c.a.E(2);
        eqmb.a(this.c.a, 13);
        eqeh eqeh0 = this.c.b;
        batl.s(bootstrapOptions0);
        if(!eqeh0.k) {
            throw new RuntimeException("getAdvertisedDeviceName should only be called after resources have been initialized");
        }
        String s = eqeh0.j;
        batl.s(s);
        return s;
    }

    @Override  // eqiz
    public final void w(eqiw eqiw0, BootstrapOptions bootstrapOptions0, ParcelFileDescriptor[] arr_parcelFileDescriptor, eqia eqia0, ApiMetadata apiMetadata0) {
        azug azug0 = this.y(apiMetadata0);
        epyl epyl0 = new epyl(eqia0);
        eqfc eqfc0 = new eqfc(eqiw0, this.c, bootstrapOptions0, arr_parcelFileDescriptor, epyl0, this.b, azug0);
        this.k.b(eqfc0);
    }

    @Override  // eqiz
    public final void x(eqiw eqiw0, eqit eqit0, ApiMetadata apiMetadata0) {
        azug azug0 = this.y(apiMetadata0);
        eqfa eqfa0 = new eqfa(eqiw0, this.c, eqit0, this.b, azug0);
        this.k.b(eqfa0);
    }

    private final azug y(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.eP);
        azuf0.g(bbdq.aT);
        azuf0.d(this.d);
        azuf0.c(this.e);
        return azuf0.a();
    }
}


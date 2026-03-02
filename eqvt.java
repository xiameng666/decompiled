import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

public final class eqvt extends eqiy implements cjug {
    private final equm a;
    private final String b;
    private final String c;
    private final cjts d;

    public eqvt(cjvl cjvl0, Context context0, boolean z, String s, String s1) {
        cjts cjts0 = new cjts(context0, cjvl0, new bblp(1, 10));
        super();
        this.b = s;
        this.c = s1;
        eqlr eqlr0 = new eqlr(context0);
        eqlr0.b(s, z);
        this.a = new equm(context0, 100, eqlr0);
        this.d = cjts0;
    }

    @Override  // eqiz
    public final void a(eqiw eqiw0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqiz
    public final void c(eqvw eqvw0, HandshakeData handshakeData0, ApiMetadata apiMetadata0) {
        azug azug0 = this.g(apiMetadata0);
        eqvm eqvm0 = new eqvm(eqvw0, this.a, handshakeData0, azug0);
        this.d.b(eqvm0);
    }

    @Override  // eqiz
    public final void d(eqvw eqvw0, ApiMetadata apiMetadata0) {
        azug azug0 = this.g(apiMetadata0);
        eqvn eqvn0 = new eqvn(eqvw0, this.a, azug0);
        this.d.b(eqvn0);
    }

    @Override  // eqiz
    public final void e(eqiw eqiw0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqiz
    public final void f(eqiw eqiw0, BootstrapOptions bootstrapOptions0, eqit eqit0, ApiMetadata apiMetadata0) {
    }

    private final azug g(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.eP);
        azuf0.g(bbdq.aT);
        azuf0.d(this.b);
        azuf0.c(this.c);
        return azuf0.a();
    }

    @Override  // eqiz
    public final void h(eqiw eqiw0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqiz
    public final void i(eqvw eqvw0, ApiMetadata apiMetadata0) {
        azug azug0 = this.g(apiMetadata0);
        eqvo eqvo0 = new eqvo(eqvw0, this.a, azug0);
        this.d.b(eqvo0);
    }

    @Override  // eqiz
    public final void j(eqiw eqiw0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqiz
    public final void k(eqiw eqiw0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqiz
    public final void l(eqiw eqiw0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqiz
    public final void n(eqvw eqvw0, ApiMetadata apiMetadata0) {
        azug azug0 = this.g(apiMetadata0);
        eqvp eqvp0 = new eqvp(eqvw0, this.a, azug0);
        this.d.b(eqvp0);
    }

    @Override  // eqiz
    public final void p(eqvw eqvw0, HandshakeData handshakeData0, ApiMetadata apiMetadata0) {
        azug azug0 = this.g(apiMetadata0);
        eqvq eqvq0 = new eqvq(eqvw0, this.a, handshakeData0, azug0);
        this.d.b(eqvq0);
    }

    @Override  // eqiz
    public final void q(eqvw eqvw0, ApiMetadata apiMetadata0) {
        azug azug0 = this.g(apiMetadata0);
        eqvr eqvr0 = new eqvr(eqvw0, this.a, azug0);
        this.d.b(eqvr0);
    }

    @Override  // eqiz
    public final void t(eqiw eqiw0, BootstrapOptions bootstrapOptions0, ParcelFileDescriptor[] arr_parcelFileDescriptor, eqib eqib0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqiz
    public final void u(eqvw eqvw0, ApiMetadata apiMetadata0) {
        azug azug0 = this.g(apiMetadata0);
        eqvs eqvs0 = new eqvs(eqvw0, this.a, azug0);
        this.d.b(eqvs0);
    }

    @Override  // eqiz
    public final String v(BootstrapOptions bootstrapOptions0) {
        return "";
    }

    @Override  // eqiz
    public final void w(eqiw eqiw0, BootstrapOptions bootstrapOptions0, ParcelFileDescriptor[] arr_parcelFileDescriptor, eqia eqia0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqiz
    public final void x(eqiw eqiw0, eqit eqit0, ApiMetadata apiMetadata0) {
    }
}


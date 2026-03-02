import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

public final class eqvg extends eqim implements cjug {
    private final equm a;
    private final String b;
    private final String c;
    private final cjts d;

    public eqvg(cjvl cjvl0, Context context0, boolean z, String s, String s1) {
        this.b = s;
        this.c = s1;
        this.d = new cjts(context0, cjvl0, new bblp(1, 10));
        eqlr eqlr0 = new eqlr(context0);
        eqlr0.b(s, z);
        this.a = new equm(context0, 200, eqlr0);
    }

    @Override  // eqin
    public final void a(eqik eqik0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqin
    public final void c(eqvw eqvw0, HandshakeData handshakeData0, ApiMetadata apiMetadata0) {
        azug azug0 = this.e(apiMetadata0);
        eqvd eqvd0 = new eqvd(eqvw0, this.a, handshakeData0, azug0);
        this.d.b(eqvd0);
    }

    @Override  // eqin
    public final void d(eqik eqik0, D2DDevice d2DDevice0, BootstrapConfigurations bootstrapConfigurations0, eqie eqie0, ApiMetadata apiMetadata0) {
    }

    private final azug e(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.eP);
        azuf0.g(bbdq.aT);
        azuf0.d(this.b);
        azuf0.c(this.c);
        return azuf0.a();
    }

    @Override  // eqin
    public final void f(eqik eqik0, D2DDevice d2DDevice0, String s, eqih eqih0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqin
    public final void g(ConnectParams connectParams0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqin
    public final void h(eqik eqik0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqin
    public final void i(eqik eqik0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqin
    public final void j(eqvw eqvw0, ApiMetadata apiMetadata0) {
        azug azug0 = this.e(apiMetadata0);
        eqve eqve0 = new eqve(eqvw0, this.a, azug0);
        this.d.b(eqve0);
    }

    @Override  // eqin
    public final void k(eqvw eqvw0, HandshakeData handshakeData0, ApiMetadata apiMetadata0) {
        azug azug0 = this.e(apiMetadata0);
        eqvf eqvf0 = new eqvf(eqvw0, handshakeData0, this.a, azug0);
        this.d.b(eqvf0);
    }

    @Override  // eqin
    public final void l(eqik eqik0, Bundle bundle0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqin
    public final void p(eqik eqik0, Bundle bundle0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqin
    public final void q(eqik eqik0, BootstrapConfigurations bootstrapConfigurations0, ParcelFileDescriptor[] arr_parcelFileDescriptor, eqib eqib0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqin
    public final void r(eqik eqik0, eqiq eqiq0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqin
    public final void s(eqik eqik0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqin
    public final void t(eqik eqik0, BootstrapConfigurations bootstrapConfigurations0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqin
    public final void u(eqik eqik0, BootstrapConfigurations bootstrapConfigurations0, ParcelFileDescriptor[] arr_parcelFileDescriptor, eqia eqia0, ApiMetadata apiMetadata0) {
    }

    @Override  // eqin
    public final void v(eqik eqik0, ApiMetadata apiMetadata0) {
    }
}


import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferOptions;

public final class eqte extends eqtj implements cjug, eqfv {
    public static final erqc a;
    public final Handler b;
    public final eqff c;
    private final String d;
    private final String e;
    private final eqme f;
    private final long g;
    private boolean h;
    private final cjts i;

    static {
        eqte.a = new erqc(new String[]{"TargetDirectTransferService"});
    }

    public eqte(cjts cjts0, Context context0, Handler handler0, boolean z, boolean z1, String s, String s1) {
        this.d = s;
        this.e = s1;
        this.i = cjts0;
        this.b = handler0;
        eqme eqme0 = new eqme(context0);
        this.f = eqme0;
        eqme0.m(s, z, z1);
        this.g = System.currentTimeMillis();
        this.c = new eqff(new epzg(context0, handler0, eqme0, this));
    }

    public final void a() {
        if(!this.h) {
            this.f.B(System.currentTimeMillis() - this.g);
            this.h = true;
        }
        if(!bbmq.P()) {
            this.f.i();
        }
        this.h = false;
        this.f.j();
    }

    @Override  // eqtk
    public final void c(eqtg eqtg0, ApiMetadata apiMetadata0) {
        azug azug0 = this.e(apiMetadata0);
        eqtb eqtb0 = new eqtb(eqtg0, this.c, this.b, azug0);
        this.i.b(eqtb0);
    }

    @Override  // eqtk
    public final void d(eqtg eqtg0, DirectTransferOptions directTransferOptions0, ParcelFileDescriptor[] arr_parcelFileDescriptor, eqib eqib0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.kv);
        azug azug0 = this.e(apiMetadata0);
        epyl epyl0 = new epyl(eqib0);
        eqtd eqtd0 = new eqtd(eqtg0, this.c, directTransferOptions0, arr_parcelFileDescriptor, epyl0, this.b, azug0);
        this.i.b(eqtd0);
    }

    private final azug e(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.eP);
        azuf0.g(bbdq.aT);
        azuf0.d(this.d);
        azuf0.c(this.e);
        return azuf0.a();
    }

    @Override  // eqfv
    public final void m() {
        eqte.a.h("onComplete()", new Object[0]);
        this.f.z(true);
        this.a();
    }

    @Override  // eqfv
    public final void o(int v, eqoc eqoc0) {
        eqte.a.f("onError() with error %d %s", new Object[]{v, epzh.a(v)});
        this.f.z(false);
        this.f.k(v);
        this.f.n(eqoc0);
        this.a();
    }
}


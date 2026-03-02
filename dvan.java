import android.content.Context;
import com.google.android.gms.pay.pass.common.template.defaults.DefaultPassInfoCallback;
import dagger.android.AndroidInjector;

final class dvan implements AndroidInjector {
    private final dolg a;
    private final dxed b;
    private final dpsz c;

    public dvan(dolg dolg0, dpsz dpsz0, dxed dxed0) {
        this.c = dpsz0;
        this.a = dolg0;
        this.b = dxed0;
    }

    final dmgi a() {
        dlnj.a();
        return new dmgi(this.a.d(), dmgy.a());
    }

    final dtph b() {
        return new dtph(this.a(), edob.a(dlnj.a()), new dtpi());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvcl dvcl0 = (dvcl)object0;
        dvcl0.b = new dvat();
        dvcl0.c = new DefaultPassInfoCallback();
        dvcl0.d = new fshk();
        dvcl0.ag = new dspx();
        dvcl0.ah = this.c.a();
        dvcl0.ai = new dual(this.c.a(), dmgy.a(), easn.a(), this.a(), new bblp(0x7FFFFFFF, 10));
        dvcl0.aj = new dtnn(this.c.a(), dmgy.a(), easn.a());
        dvcl0.aD = this.b.a();
        dvcl0.ak = this.b();
        dvcl0.al = this.a.d();
        Context context0 = dlnj.a();
        azts azts0 = this.b.a();
        String s = this.a.d();
        dtph dtph0 = this.b();
        dvcl0.am = new dtqf(context0, bbnk.a, azts0, s, dtph0);
        dvcl0.an = new fuok();
        dvcl0.ao = new dtze(dlnj.a(), this.b.a());
    }
}


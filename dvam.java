import com.google.android.gms.pay.pass.common.template.defaults.DefaultPassInfoCallback;
import dagger.android.AndroidInjector;

final class dvam implements AndroidInjector {
    private final dxed a;
    private final dolg b;
    private final dpsz c;

    public dvam(dolg dolg0, dpsz dpsz0, dxed dxed0) {
        this.c = dpsz0;
        this.a = dxed0;
        this.b = dolg0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvbe dvbe0 = (dvbe)object0;
        dvbe0.b = new DefaultPassInfoCallback();
        dvbe0.c = new dspu();
        dvbe0.d = new dspv();
        dvbe0.ag = new fshk();
        dvbe0.ah = new dspx();
        dvbe0.ai = this.c.a();
        dvbe0.av = this.a.a();
        dvbe0.aj = this.b.a();
        dvbe0.ak = new dtze(dlnj.a(), this.a.a());
    }
}


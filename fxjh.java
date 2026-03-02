import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..util.Objects;

final class fxjh extends fxje {
    final fxjk e;

    public fxjh(fxjk fxjk0, long v) {
        Objects.requireNonNull(fxjk0);
        this.e = fxjk0;
        super(fxjk0, 10, v, huqb.a.s().h());
    }

    @Override  // fxje
    public final void a(EAlertUxArgs eAlertUxArgs0) {
        fxja fxja0 = (fxja)this.e.a;
        fxja0.a();
        fxja.b(fxja0.a, eAlertUxArgs0);
    }

    @Override  // fxje
    public final boolean b(gxeo gxeo0) {
        return gxen.b(gxeo0.d) == 3 && gxem.a(gxeo0.h) == 4;
    }
}


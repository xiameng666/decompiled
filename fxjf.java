import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..util.Objects;

final class fxjf extends fxje {
    final fxjk e;

    public fxjf(fxjk fxjk0, long v) {
        Objects.requireNonNull(fxjk0);
        this.e = fxjk0;
        super(fxjk0, 8, v, huqb.c());
    }

    @Override  // fxje
    public final void a(EAlertUxArgs eAlertUxArgs0) {
        fxja fxja0 = (fxja)this.e.a;
        fxja0.a();
        fxja.b(fxja0.a, eAlertUxArgs0);
    }

    @Override  // fxje
    public final boolean b(gxeo gxeo0) {
        int v = gxen.b(gxeo0.d);
        if(v == 0) {
            return false;
        }
        if(v == 3) {
            int v1 = gxeo0.h;
            if(gxem.a(v1) == 3) {
                return true;
            }
            int v2 = gxem.a(v1);
            return v2 == 0 ? false : v2 == 2;
        }
        return false;
    }
}


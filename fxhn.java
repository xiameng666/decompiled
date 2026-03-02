import android.content.Context;
import j..util.Optional;

public final class fxhn {
    public final Context a;
    public final fxmv b;

    public fxhn(Context context0) {
        this.a = context0;
        this.b = new fxmv(((int)huqb.e()), new fxhm());
    }

    final void a() {
        this.b.d(1);
    }

    final void b(gxes gxes0, int v) {
        this.c(gxes0.c, hfyn.b((gxes0.m == null ? hfwn.a : gxes0.m)), v, Optional.empty());
    }

    final void c(String s, long v, int v1, Optional optional0) {
        fxnb.c(s, v, fxhn.d(v1), (optional0.isPresent() ? optional0.map(new fxhl()) : Optional.empty()));
        fxmv.a(v);
        Object[] arr_object = {s, fxmv.a(v), v1};
        this.b.f(4, "%s:%s %d", arr_object);
    }

    static int d(int v) {
        switch(v) {
            case 1: {
                return 2;
            }
            case 2: {
                return 3;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 5;
            }
            case 5: {
                return 6;
            }
            case 6: {
                return 7;
            }
            case 7: {
                return 8;
            }
            case 8: {
                return 9;
            }
            case 9: {
                return 10;
            }
            case 10: {
                return 11;
            }
            case 11: {
                return 12;
            }
            case 12: {
                return 13;
            }
            case 13: {
                return 14;
            }
            default: {
                return 15;
            }
        }
    }
}


import android.content.Context;
import j..util.Optional;

public final class fxjm {
    public final Context a;
    public final fxmv b;

    public fxjm(Context context0) {
        this.a = context0;
        this.b = new fxmv(((int)huqb.e()), new fxjl());
    }

    final void a(gxeo gxeo0, int v) {
        int v2;
        String s = gxeo0.c;
        long v1 = hfyn.b((gxeo0.e == null ? hfwn.a : gxeo0.e));
        switch(v) {
            case 1: {
                v2 = 2;
                break;
            }
            case 2: {
                v2 = 3;
                break;
            }
            case 3: {
                v2 = 4;
                break;
            }
            case 4: {
                v2 = 5;
                break;
            }
            case 5: {
                v2 = 6;
                break;
            }
            case 6: {
                v2 = 7;
                break;
            }
            case 7: {
                v2 = 8;
                break;
            }
            case 8: {
                v2 = 9;
                break;
            }
            case 9: {
                v2 = 10;
                break;
            }
            case 10: {
                v2 = 11;
                break;
            }
            case 11: {
                v2 = 12;
                break;
            }
            default: {
                v2 = 13;
            }
        }
        fxnb.c(s, v1, v2, Optional.empty());
        fxmv.a(v1);
        Object[] arr_object = {s, fxmv.a(v1), v};
        this.b.f(4, "%s:%s %d", arr_object);
    }

    public static final int b(int v) {
        return v == 1 ? -1 : gxen.a(v);
    }
}


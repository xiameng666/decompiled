import android.content.res.Resources;
import android.util.TypedValue;
import java.util.Locale;

public final class gbez {
    static int a(float f) {
        return (int)TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }

    static int b(gbdq gbdq0, int v, int v1, int v2) {
        if(gbdq0.l(v, v1)) {
            hdsi hdsi0 = (hdsi)gbdq0.e(v, v1, hdsi.class);
            switch((hdsh.b(hdsi0.c) == null ? hdsh.a : hdsh.b(hdsi0.c)).ordinal()) {
                case 1: {
                    return gbez.d((hdsi0.d == null ? hdsn.a : hdsi0.d));
                }
                case 2: {
                    return -1;
                }
                case 3: {
                    return -2;
                }
                case 4: {
                    throw new IllegalArgumentException("Contextual Auto not yet supported");
                }
                default: {
                    hdsh hdsh0 = hdsh.b(hdsi0.c) == null ? hdsh.a : hdsh.b(hdsi0.c);
                    throw new IllegalArgumentException(String.format(Locale.US, "Unknown size type: %s", ((int)hdsh0.f)));
                }
            }
        }
        return v2;
    }

    public static int c(gbdq gbdq0, int v, int v1) {
        return gbez.d(((hdsn)gbdq0.e(v, v1, hdsn.class)));
    }

    public static int d(hdsn hdsn0) {
        gaxl.a();
        if(hzlv.a.b().D() && (hdsn0.b & 1) != 0) {
            switch((hdsm.b(hdsn0.c) == null ? hdsm.a : hdsm.b(hdsn0.c)).ordinal()) {
                case 0: {
                    gavs.d("BE_SU_01", null, "Unknown UnitSize.Unit");
                    return 0;
                }
                case 1: {
                    return gbez.a(hdsn0.d);
                }
                case 2: {
                    return (int)TypedValue.applyDimension(2, hdsn0.d, Resources.getSystem().getDisplayMetrics());
                }
                case 3: {
                    return (int)hdsn0.d;
                }
                default: {
                    return gbez.a(hdsn0.d);
                }
            }
        }
        return gbez.a(hdsn0.d);
    }

    public static int[] e(gbet gbet0, gbdq gbdq0) {
        int v = gbet0.d;
        return new int[]{gbez.c(gbdq0, 3, v), gbez.c(gbdq0, 1, v), gbez.c(gbdq0, 4, v), gbez.c(gbdq0, 2, v)};
    }
}


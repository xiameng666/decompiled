import android.content.res.ColorStateList;

public final class gbey {
    public static ColorStateList a(gbet gbet0, gbdq gbdq0) {
        int v = gbdq0.b(1, gbet0.d);
        int v1 = gbdq0.b(2, gbet0.d);
        return new ColorStateList(new int[][]{new int[]{0x10100A0}, new int[0]}, new int[]{v1, v});
    }

    public static boolean b(gbet gbet0, gbdq gbdq0) {
        return gbdq0.l(2, gbet0.d);
    }

    public static boolean c(gbet gbet0, gbdq gbdq0) {
        return gbdq0.l(1, gbet0.d);
    }

    public static boolean d(gbet gbet0, gbdq gbdq0) {
        return gbdq0 != null && gbet0.e(gbdq0, new int[]{1, 2});
    }
}


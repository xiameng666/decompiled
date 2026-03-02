import android.view.ViewGroup.MarginLayoutParams;

public final class gbfi {
    public static boolean a(gbet gbet0, gbdq gbdq0, ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        boolean z;
        int v = gbet0.d;
        if(gbet0.e(gbdq0, new int[]{3})) {
            viewGroup$MarginLayoutParams0.width = gbez.b(gbdq0, 3, v, viewGroup$MarginLayoutParams0.width);
            z = true;
        }
        else {
            z = false;
        }
        if(gbet0.e(gbdq0, new int[]{6})) {
            viewGroup$MarginLayoutParams0.height = gbez.b(gbdq0, 6, v, viewGroup$MarginLayoutParams0.height);
            z = true;
        }
        gbdq gbdq1 = gbdq0.d(1);
        if(gbdq1 != null) {
            if(gbet0.e(gbdq1, new int[]{1})) {
                viewGroup$MarginLayoutParams0.topMargin = gbez.c(gbdq1, 1, v);
                z = true;
            }
            if(gbet0.e(gbdq1, new int[]{2})) {
                viewGroup$MarginLayoutParams0.bottomMargin = gbez.c(gbdq1, 2, v);
                z = true;
            }
            if(gbet0.e(gbdq1, new int[]{3})) {
                viewGroup$MarginLayoutParams0.setMarginStart(gbez.c(gbdq1, 3, v));
                z = true;
            }
            if(gbet0.e(gbdq1, new int[]{4})) {
                viewGroup$MarginLayoutParams0.setMarginEnd(gbez.c(gbdq1, 4, v));
                return true;
            }
        }
        return z;
    }
}


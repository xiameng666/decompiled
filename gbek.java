import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.GridLayout.Alignment;
import android.widget.GridLayout.LayoutParams;
import android.widget.GridLayout.Spec;
import android.widget.GridLayout;

public final class gbek {
    public static GridLayout.Alignment a(hdqb hdqb0) {
        switch(hdqb0.ordinal()) {
            case 2: {
                return GridLayout.START;
            }
            case 3: {
                return GridLayout.END;
            }
            case 4: {
                return GridLayout.CENTER;
            }
            case 5: 
            case 6: {
                return GridLayout.BASELINE;
            }
            case 7: {
                throw new IllegalArgumentException("Stretch not yet supported");
            }
            default: {
                return null;
            }
        }
    }

    public static GridLayout.Alignment b(hdqw hdqw0) {
        GridLayout.Alignment gridLayout$Alignment0 = GridLayout.START;
        switch(hdqw0.ordinal()) {
            case 3: {
                return GridLayout.END;
            }
            case 4: {
                return GridLayout.CENTER;
            }
            case 5: {
                return GridLayout.FILL;
            }
            default: {
                return gridLayout$Alignment0;
            }
        }
    }

    public static GridLayout.Alignment c(hdqz hdqz0) {
        GridLayout.Alignment gridLayout$Alignment0 = GridLayout.START;
        switch(hdqz0.ordinal()) {
            case 3: {
                return GridLayout.END;
            }
            case 4: {
                return GridLayout.CENTER;
            }
            case 5: {
                return GridLayout.FILL;
            }
            default: {
                return gridLayout$Alignment0;
            }
        }
    }

    public static GridLayout.Spec d(GridLayout.Alignment gridLayout$Alignment0, hdra hdra0) {
        int v = hdra0.b & 1;
        int v1 = 0;
        boolean z = true;
        int v2 = (hdra0.b & 2) == 0 ? 0 : 1;
        if(gridLayout$Alignment0 == null) {
            z = false;
        }
        if(v == 0 || !z) {
            v1 = v2;
        }
        else if(v2 != 0) {
            int v3 = hdra0.c;
            int v4 = hdra0.d;
            gftb.check(gridLayout$Alignment0);
            return GridLayout.spec(v3, v4, gridLayout$Alignment0);
        }
        if(v != 0 && z) {
            int v5 = hdra0.c;
            gftb.check(gridLayout$Alignment0);
            return GridLayout.spec(v5, gridLayout$Alignment0);
        }
        if(v != 0 && v1 != 0) {
            return GridLayout.spec(hdra0.c, hdra0.d);
        }
        return v == 0 ? GridLayout.spec(0x80000000) : GridLayout.spec(hdra0.c);
    }

    static void e(GridLayout gridLayout0, GridLayout.Alignment gridLayout$Alignment0, boolean z) {
        int v = gridLayout0.getChildCount();
        int v1 = gridLayout0.getColumnCount();
        for(int v2 = 0; v2 < v; ++v2) {
            View view0 = gridLayout0.getChildAt(v2);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            if((viewGroup$LayoutParams0 instanceof GridLayout.LayoutParams)) {
                if(z) {
                    ((GridLayout.LayoutParams)viewGroup$LayoutParams0).rowSpec = GridLayout.spec(v2 / v1, gridLayout$Alignment0, 1.0f);
                }
                ((GridLayout.LayoutParams)viewGroup$LayoutParams0).columnSpec = GridLayout.spec(v2 % v1, gridLayout$Alignment0, 1.0f);
                view0.setLayoutParams(((GridLayout.LayoutParams)viewGroup$LayoutParams0));
            }
        }
    }

    public static void f(gbet gbet0, GridLayout gridLayout0) {
        gbdq gbdq0 = gbet0.c.c().d(15);
        if(gbdq0 != null) {
            int v = gbet0.d;
            if(gbet0.e(gbdq0, new int[]{1}) && gbdq0.l(1, v)) {
                gridLayout0.setRowCount(gbdq0.c(1, v));
            }
            if(gbet0.e(gbdq0, new int[]{2}) && gbdq0.l(2, v)) {
                gridLayout0.setColumnCount(gbdq0.c(2, v));
            }
            if(gbet0.e(gbdq0, new int[]{5}) && gbdq0.l(5, v) && gbet0.e(gbdq0, new int[]{5})) {
                GridLayout.Alignment gridLayout$Alignment0 = gbek.b(((hdqw)gbdq0.g(5, gbet0.d, hdqw.class)));
                gftb.check(gridLayout$Alignment0);
                gbek.e(gridLayout0, gridLayout$Alignment0, true);
            }
            if(gbet0.e(gbdq0, new int[]{6}) && gbdq0.l(6, v) && gbet0.e(gbdq0, new int[]{6})) {
                GridLayout.Alignment gridLayout$Alignment1 = gbek.c(((hdqz)gbdq0.g(6, gbet0.d, hdqz.class)));
                gftb.check(gridLayout$Alignment1);
                gbek.e(gridLayout0, gridLayout$Alignment1, false);
            }
        }
    }
}


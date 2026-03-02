import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

public final class gbea {
    static ColorStateList a(gbet gbet0, gbdq gbdq0) {
        if(!gbdq0.l(12, gbet0.d)) {
            Context context0 = gbet0.b;
            int v = gbcd.a(context0, 0x101042C);
            if(v == 0) {
                v = context0.getColor(0x7F06131E);  // color:wallet_selectable_item_highlight_light
            }
            return ColorStateList.valueOf(v);
        }
        return ColorStateList.valueOf(gbdq0.b(12, gbet0.d));
    }

    protected static fyuj b(Drawable drawable0, int v) {
        if((drawable0 instanceof fyuj)) {
            return (fyuj)drawable0;
        }
        return drawable0 == null ? new fyuj() : ((fyuj)((RippleDrawable)drawable0).getDrawable(v));
    }

    public static fyut c(gbet gbet0, gbdq gbdq0, boolean z) {
        int[] arr_v = gbdw.a(gbet0.d, gbdq0, z);
        fyus fyus0 = new fyus();
        fyus0.f(((float)arr_v[0]));
        fyus0.h(((float)arr_v[1]));
        fyus0.b(((float)arr_v[2]));
        fyus0.d(((float)arr_v[3]));
        return new fyut(fyus0);
    }

    public static void d(gbet gbet0, gbdq gbdq0, fyuj fyuj0, fyut fyut0, boolean z) {
        int v = gbet0.d;
        int v1 = gbdq0.b(3, v);
        int v2 = gbez.c(gbdq0, 5, v);
        fyuj0.mu(fyut0);
        if(z) {
            fyuj0.ah(((float)v2), v1);
        }
    }
}


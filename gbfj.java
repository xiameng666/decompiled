import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.TextView;

public final class gbfj {
    public static void a(gbet gbet0, gbdq gbdq0, View view0, boolean z, boolean z1) {
        if(gbet0.e(gbdq0, new int[]{1, 3, 2, 5})) {
            Drawable drawable0 = view0.getBackground();
            if(!(z1 ? (drawable0 instanceof RippleDrawable) && ((RippleDrawable)drawable0).getNumberOfLayers() > 1 && (((RippleDrawable)drawable0).getDrawable(0) instanceof fyuj) && (((RippleDrawable)drawable0).getDrawable(1) instanceof fyuj) : drawable0 instanceof fyuj)) {
                if(z1) {
                    fyuj fyuj0 = new fyuj();
                    fyuj0.setTint(-1);
                    drawable0 = new RippleDrawable(ColorStateList.valueOf(0), new fyuj(), fyuj0);
                }
                else {
                    drawable0 = new fyuj();
                }
            }
            gaxl.a();
            int v = !hzlv.a.b().c() || (view0 instanceof gbmp) ? 0 : 1;
            fyut fyut0 = gbea.c(gbet0, gbdq0, z);
            fyuj fyuj1 = gbea.b(drawable0, 0);
            gbea.d(gbet0, gbdq0, fyuj1, fyut0, ((boolean)(v ^ 1)));
            fyuj1.aa(ColorStateList.valueOf(gbdq0.b(1, gbet0.d)));
            if(z1) {
                ColorStateList colorStateList0 = gbea.a(gbet0, gbdq0);
                fyuj fyuj2 = gbea.b(drawable0, 1);
                fyuj2.mu(fyut0);
                if(drawable0 == null) {
                    fyuj2.setTintList(colorStateList0);
                    LayerDrawable layerDrawable0 = new LayerDrawable(new Drawable[]{fyuj1, fyuj2});
                    drawable0 = new StateListDrawable();
                    ((StateListDrawable)drawable0).addState(new int[]{0x10100A7}, layerDrawable0);
                    ((StateListDrawable)drawable0).addState(new int[0], fyuj1);
                }
                else {
                    ((RippleDrawable)drawable0).setColor(colorStateList0);
                }
            }
            gavs.g(drawable0, "BE_DPU_02", null);
            view0.setBackground(drawable0);
            if(v != 0) {
                fyut fyut1 = gbea.c(gbet0, gbdq0, z);
                fyuj fyuj3 = new fyuj();
                fyuj3.aa(ColorStateList.valueOf(0));
                gbea.d(gbet0, gbdq0, fyuj3, fyut1, true);
                gavs.g(fyuj3, "BE_DPU_01", null);
                view0.setForeground(fyuj3);
            }
        }
    }

    public static void b(gbet gbet0, gbdq gbdq0, View view0) {
        int v = gbet0.d;
        if(gbet0.e(gbdq0, new int[]{4})) {
            int v1 = gbez.c(gbdq0, 4, v);
            if((view0 instanceof TextView) && gbdq0.l(4, v) && ((TextView)view0).getMinEms() == -1) {
                ((TextView)view0).setMinWidth(v1);
            }
            view0.setMinimumWidth(v1);
        }
        if(gbet0.e(gbdq0, new int[]{7})) {
            int v2 = gbez.c(gbdq0, 7, v);
            view0.setMinimumHeight(v2);
            if((view0 instanceof TextView) && gbdq0.l(7, v) && ((TextView)view0).getMinLines() == -1) {
                ((TextView)view0).setMinHeight(v2);
            }
        }
        gbdq gbdq1 = gbdq0.d(2);
        if(gbdq1 != null) {
            int v3 = gbet0.d;
            if(gbet0.e(gbdq1, new int[]{1, 2, 3, 4})) {
                view0.setPaddingRelative(gbez.c(gbdq1, 3, v3), gbez.c(gbdq1, 1, v3), gbez.c(gbdq1, 4, v3), gbez.c(gbdq1, 2, v3));
            }
        }
    }

    public static void c(gbet gbet0, gbdq gbdq0, View view0) {
        int v2;
        int v = 6;
        if(gbet0.e(gbdq0, new int[]{6})) {
            view0.setAlpha((gbdq0.l(6, gbet0.d) ? gbdq0.a(6, gbet0.d) : 1.0f));
        }
        if(gbet0.e(gbdq0, new int[]{13, 16})) {
            int v1 = gbet0.d;
            if(gbdq0.l(16, v1)) {
                v2 = gbez.c(gbdq0, 16, v1);
            }
            else {
                int v3 = ((hdte)gbdq0.g(13, v1, hdte.class)).ordinal();
                if(v3 == 1) {
                    v = 1;
                }
                else {
                    switch(v3) {
                        case 2: {
                            v = 3;
                            break;
                        }
                        case 3: {
                            break;
                        }
                        case 4: {
                            v = 8;
                            break;
                        }
                        case 5: {
                            v = 12;
                            break;
                        }
                        default: {
                            v = 0;
                        }
                    }
                }
                v2 = gbez.a(v);
            }
            view0.setElevation(((float)v2));
        }
    }

    public static void d(gbet gbet0, View view0) {
        gbdp gbdp0 = gbet0.c;
        gbfj.b(gbet0, gbdp0.c(), view0);
        gbdq gbdq0 = gbdp0.d();
        gbfj.c(gbet0, gbdq0, view0);
        gbfj.a(gbet0, gbdq0, view0, false, false);
    }
}


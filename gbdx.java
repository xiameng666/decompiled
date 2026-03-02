import android.content.res.ColorStateList;
import com.google.android.material.button.MaterialButton;

public final class gbdx {
    public static void a(gbet gbet0, MaterialButton materialButton0) {
        gbdp gbdp0 = gbet0.c;
        gbdq gbdq0 = gbdp0.c();
        gbdq gbdq1 = gbdp0.d();
        gbfj.b(gbet0, gbdq0, materialButton0);
        gbfe.d(gbet0, gbdq0, materialButton0, 49);
        gbfj.c(gbet0, gbdq1, materialButton0);
        gbfe.i(gbet0, gbdq1, materialButton0);
        if(gbet0.e(gbdq1, new int[]{1}) && gbdq1.l(1, gbet0.d)) {
            materialButton0.B(ColorStateList.valueOf(gbdq1.b(1, gbet0.d)));
        }
        materialButton0.x(gbea.a(gbet0, gbdq1));
        gaxl.a();
        boolean z = hzlv.a.b().i() && gbdq1.d(17) != null;
        gaxl.a();
        boolean z1 = z || hzlv.a.b().j() && gbet0.e(gbdq1, new int[]{2});
        if(z1) {
            int[] arr_v = gbdw.a(gbet0.d, gbdq1, false);
            if(!materialButton0.G()) {
                throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
            }
            fyus fyus0 = new fyus(materialButton0.j.b.a());
            fyus0.f(((float)arr_v[0]));
            fyus0.h(((float)arr_v[1]));
            fyus0.b(((float)arr_v[2]));
            fyus0.d(((float)arr_v[3]));
            materialButton0.mu(new fyut(fyus0));
        }
        if(gbet0.e(gbdq1, new int[]{4, 3, 2, 5})) {
            int v = gbet0.d;
            if(!z1) {
                materialButton0.r(gbez.c(gbdq1, 2, v));
            }
            materialButton0.A(ColorStateList.valueOf(gbdq1.b(3, v)));
            int v1 = gbez.c(gbdq1, 5, v);
            if(materialButton0.G()) {
                fygo fygo0 = materialButton0.j;
                if(fygo0.i != v1) {
                    fygo0.i = v1;
                    fygo0.e();
                }
            }
        }
        int v2 = gbet0.d;
        if(gbet0.e(gbdq1, new int[]{12}) && gbdq1.l(12, v2)) {
            materialButton0.w(ColorStateList.valueOf(gbdq1.b(12, v2)));
        }
    }
}


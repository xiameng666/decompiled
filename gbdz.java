import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.Window;
import android.view.WindowManager.LayoutParams;

public final class gbdz {
    public static void a(gbet gbet0, Dialog dialog0) {
        int v7;
        int v6;
        int v5;
        int v4;
        boolean z;
        Window window0 = dialog0.getWindow();
        if(window0 != null) {
            gbdq gbdq0 = gbet0.c.c();
            if(gbet0.e(gbdq0, new int[]{3, 6})) {
                WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
                windowManager$LayoutParams0.width = gbez.b(gbdq0, 3, gbet0.d, -2);
                windowManager$LayoutParams0.height = gbez.b(gbdq0, 6, gbet0.d, -2);
                window0.setAttributes(windowManager$LayoutParams0);
            }
            gbdq gbdq1 = gbdq0.d(1);
            if(gbdq1 == null) {
                z = gbet0.e(gbdq0, new int[0]);
                v5 = 0;
                v6 = 0;
                v4 = 0;
                v7 = 0;
            }
            else {
                z = gbet0.e(gbdq1, new int[]{3, 4, 1, 2});
                if(z) {
                    int v = gbet0.d;
                    int v1 = gbez.c(gbdq1, 1, v);
                    int v2 = gbez.c(gbdq1, 2, v);
                    int v3 = gbez.c(gbdq1, 3, v);
                    v4 = gbez.c(gbdq1, 4, v);
                    v5 = v3;
                    v6 = v1;
                    v7 = v2;
                }
                else {
                    v5 = 0;
                    v6 = 0;
                    v4 = 0;
                    v7 = 0;
                }
            }
            InsetDrawable insetDrawable0 = z ? new InsetDrawable(new ColorDrawable(0), v5, v6, v4, v7) : null;
            if(insetDrawable0 != null) {
                window0.setBackgroundDrawable(insetDrawable0);
            }
        }
    }
}


import android.view.ViewGroup;
import android.widget.GridLayout;
import com.google.android.flexbox.FlexboxLayout;

public final class gbem {
    public static void a(gbet gbet0, gbmp gbmp0) {
        gbdq gbdq0 = gbet0.c.b().d(12);
        if(gbdq0 != null && gbet0.e(gbdq0, new int[]{1})) {
            int v = gbez.c(gbdq0, 1, gbet0.d);
            if(gbmp0.e != v) {
                gbmp0.e = v;
                gbmp0.b();
            }
        }
        ViewGroup viewGroup0 = gbmp0.b;
        if((viewGroup0 instanceof FlexboxLayout)) {
            gbef.d(gbet0, gbed.a(((FlexboxLayout)viewGroup0)));
            return;
        }
        if((viewGroup0 instanceof GridLayout)) {
            gbek.f(gbet0, ((GridLayout)viewGroup0));
            return;
        }
        if((viewGroup0 instanceof gbmp)) {
            gbem.a(gbet0, ((gbmp)viewGroup0));
        }
    }
}


import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.chimera.modules.credential.manager.AppContextProvider;
import java.util.Arrays;

public final class bgnh {
    public static final int a(Context context0, int v) {
        ibuq.f(context0, "context");
        return !hsam.f() || !hsam.c() ? bgnh.b(context0, v) : fhbz.c(context0, v);
    }

    public static final int b(Context context0, int v) {
        ibuq.f(context0, "context");
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(v, typedValue0, true);
        return typedValue0.data;
    }

    public static final int c(float f) {
        return hsam.e() ? ((int)TypedValue.applyDimension(1, f, AppContextProvider.b().getResources().getDisplayMetrics())) : ((int)f);
    }

    public static final void d(View view0) {
        ibuq.f(view0, "view");
        bgnh.h(view0, false, false, false, true, 0.0f, 494);
    }

    public static final void e(View view0, float f) {
        ibuq.f(view0, "view");
        bgnh.h(view0, true, true, true, false, f, 0xF0);
    }

    public static final void f(View view0) {
        ibuq.f(view0, "view");
        bgnh.h(view0, false, true, false, false, 0.0f, 506);
    }

    public static final void g(SwipeRefreshLayout swipeRefreshLayout0) {
        ibuq.f(swipeRefreshLayout0, "swipeRefreshLayout");
        Context context0 = swipeRefreshLayout0.getContext();
        ibuq.c(context0);
        int v = bgnh.b(context0, 0x7F040A14);  // attr:pwmSwipeRefreshBackgroundColor
        int[] arr_v = context0.getResources().getIntArray(bgnh.b(context0, 0x7F040A15));  // attr:pwmSwipeRefreshColorSchemeArray
        ibuq.e(arr_v, "getIntArray(...)");
        swipeRefreshLayout0.j(v);
        swipeRefreshLayout0.d(Arrays.copyOf(arr_v, arr_v.length));
    }

    public static void h(View view0, boolean z, boolean z1, boolean z2, boolean z3, float f, int v) {
        ibuq.f(view0, "view");
        if((v & 0x100) != 0) {
            f = 0.0f;
        }
        kex.b(view0, new bgng(((boolean)(((v & 2) == 0 ? 1 : 0) & z)), ((boolean)(((int)z1) & ((v & 4) == 0 ? 1 : 0))), ((boolean)(((int)z2) & ((v & 8) == 0 ? 1 : 0))), f, ((boolean)(((int)z3) & ((v & 16) == 0 ? 1 : 0)))));
    }
}


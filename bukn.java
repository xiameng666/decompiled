import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

public final class bukn implements keg {
    public final AppBarLayout a;
    public final View b;

    public bukn(AppBarLayout appBarLayout0, View view0) {
        this.a = appBarLayout0;
        this.b = view0;
    }

    @Override  // keg
    public final kgq et(View view0, kgq kgq0) {
        int v = kgq0.f(16).e;
        int v1 = kgq0.f(1).c;
        AppBarLayout appBarLayout0 = this.a;
        int[] arr_v = new int[2];
        appBarLayout0.getLocationOnScreen(arr_v);
        View view1 = this.b;
        if(arr_v[1] < v1) {
            appBarLayout0.setPadding(0, v1, 0, 0);
            view1.setPadding(0, 0, 0, v + (v1 + v1));
            return kgq.a;
        }
        view1.setPadding(0, 0, 0, v + v1);
        return kgq.a;
    }
}


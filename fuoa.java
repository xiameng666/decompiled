import android.view.ViewGroup.LayoutParams;
import com.google.android.material.appbar.AppBarLayout.Behavior;
import com.google.android.material.appbar.AppBarLayout;

public final class fuoa {
    public static final void a(AppBarLayout appBarLayout0) {
        ibuq.f(appBarLayout0, "<this>");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = appBarLayout0.getLayoutParams();
        jto jto0 = (viewGroup$LayoutParams0 instanceof jto) ? ((jto)viewGroup$LayoutParams0) : null;
        if(jto0 == null) {
            return;
        }
        AppBarLayout.Behavior appBarLayout$Behavior0 = new AppBarLayout.Behavior();
        appBarLayout$Behavior0.d = new funz();
        jto0.b(appBarLayout$Behavior0);
    }
}


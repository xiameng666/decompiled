import android.view.MenuItem;
import android.view.View;
import com.google.android.material.navigation.NavigationView;
import j..util.Objects;

public final class aain implements lqj {
    public final aaiu a;

    public aain(aaiu aaiu0) {
        this.a = aaiu0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        aaiu aaiu0 = this.a;
        NavigationView navigationView0 = (NavigationView)((View)Objects.requireNonNull(aaiu0.getView())).findViewById(0x7F0B19CB);  // id:navigation_view
        gged_interceptors gged0 = ((aaox)object0).b;
        if(!gggq.v(gged0, new aaih(aaiu0))) {
            aaiu0.z(gged_interceptors.l(new aaoz("", null, null, aaiu0.d)));
            return;
        }
        if(navigationView0 != null) {
            fymi fymi0 = navigationView0.m;
            fymi0.clear();
            gged_interceptors gged1 = ((aaox)object0).a;
            int v = ((ggna)gged1).c;
            for(int v1 = 0; v1 < v; ++v1) {
                aaoy aaoy0 = (aaoy)gged1.get(v1);
                MenuItem menuItem0 = fymi0.c(aaoy0.a, aaoy0.b.d.c, 0, aaoy0.b.a);
                grwd grwd0 = aaoy0.b.b;
                String s = aaoy0.b.c;
                if(grwd0 != null && grwd0 != grwd.a) {
                    menuItem0.setIcon(aabq.b(aaiu0.requireContext(), grwd0));
                }
                else if(s != null) {
                    aaiu0.b.b(s, new aaiq(aaiu0, menuItem0, navigationView0));
                }
            }
            fymi0.setGroupCheckable(0, true, true);
            navigationView0.invalidate();
            navigationView0.o = new aaii(aaiu0, ((aaox)object0));
            if(aabu.r(aaiu0.requireContext())) {
                gged0 = gged0.ot();
            }
            aaiu0.z(gged0);
            navigationView0.i(aaiu0.d.c);
        }
    }
}


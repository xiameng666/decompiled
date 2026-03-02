import android.view.View;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;

public final class dvwd extends pdh {
    protected gged_interceptors i;
    protected gged_interceptors j;
    protected ArrayList k;
    private final dvth l;
    private final dvsx m;
    private final AppBarLayout n;
    private final View o;

    public dvwd(dokz dokz0, ValuableGroup valuableGroup0, dvth dvth0, AppBarLayout appBarLayout0, View view0, dvsx dvsx0) {
        super(dokz0);
        this.k = new ArrayList();
        this.i = valuableGroup0.a;
        gged_interceptors gged0 = valuableGroup0.a;
        ggdy ggdy0 = new ggdy();
        for(Object object0: gged0) {
            ggdy0.i(((Valuable)object0).b);
        }
        this.j = ggdy0.h();
        this.l = dvth0;
        this.n = appBarLayout0;
        this.o = view0;
        this.m = dvsx0;
    }

    final Valuable M(int v) {
        return (Valuable)this.i.get(v);
    }

    @Override  // tk
    public final int b() {
        return this.i.size();
    }

    @Override  // pdh
    public final du n(int v) {
        du du0 = (dvxs)this.k.get(v);
        ((dvxs)du0).B(this.j, this.l, this.n, this.o, this.m);
        return du0;
    }
}


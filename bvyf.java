import android.view.ViewGroup;
import com.google.android.gms.growth.uiflow.ui.widget.PagerControls;
import com.google.android.gms.growth.uiflow.ui.widget.ViewPagerExtended;
import java.util.List;

public final class bvyf implements ibts {
    public final ViewPagerExtended a;
    public final bvym b;
    public final PagerControls c;
    public final hgnk d;
    public final ViewGroup e;

    public bvyf(ViewPagerExtended viewPagerExtended0, bvym bvym0, PagerControls pagerControls0, hgnk hgnk0, ViewGroup viewGroup0) {
        this.a = viewPagerExtended0;
        this.b = bvym0;
        this.c = pagerControls0;
        this.d = hgnk0;
        this.e = viewGroup0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        bvyg bvyg0 = new bvyg(this.b, ((List)object0), this.a, this.c, this.d, this.e);
        this.a.post(bvyg0);
        return ibom.a;
    }
}


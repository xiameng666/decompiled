import android.view.View.OnClickListener;
import android.view.View;

public final class dngs implements View.OnClickListener {
    public final dnhi a;
    public final hkir b;
    public final dxev c;

    public dngs(dnhi dnhi0, hkir hkir0, dxev dxev0) {
        this.a = dnhi0;
        this.b = hkir0;
        this.c = dxev0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.h.d(hami.v);
        this.a.q.cS(this.b.c).b(new dngx(new dngw(this.a, this.c)));
    }
}


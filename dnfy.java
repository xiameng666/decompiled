import android.view.View.OnClickListener;
import android.view.View;

public final class dnfy implements View.OnClickListener {
    public final dngl a;
    public final hkir b;
    public final dxev c;

    public dnfy(dngl dngl0, hkir hkir0, dxev dxev0) {
        this.a = dngl0;
        this.b = hkir0;
        this.c = dxev0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.i.d(hami.v);
        this.a.q.cS(this.b.c).b(new dnfx(this.a, this.c));
    }
}


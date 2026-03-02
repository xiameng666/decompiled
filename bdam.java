import android.view.View.OnClickListener;
import android.view.View;

public final class bdam implements View.OnClickListener {
    public final bdau a;
    public final gqmd b;

    public bdam(bdau bdau0, gqmd gqmd0) {
        this.a = bdau0;
        this.b = gqmd0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        hhyo hhyo0 = this.a.e.b;
        ((bemn)new lso(((xob)this.a.f.d.getContext())).a(bemn.class)).b(hhyo0, this.b);
        this.a.f.b.a();
        this.a.f.e.a(gqsm.MT);
    }
}


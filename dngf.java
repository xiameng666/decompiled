import android.view.View.OnClickListener;
import android.view.View;

public final class dngf implements View.OnClickListener {
    public final dngl a;
    public final dxev b;
    public final boolean c;

    public dngf(dngl dngl0, dxev dxev0, boolean z) {
        this.a = dngl0;
        this.b = dxev0;
        this.c = z;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.g.b(this.b, this.c);
        this.a.O(hami.P, this.b);
    }
}


import android.view.View.OnClickListener;
import android.view.View;

public final class dngo implements View.OnClickListener {
    public final dnhi a;
    public final dxev b;
    public final boolean c;

    public dngo(dnhi dnhi0, dxev dxev0, boolean z) {
        this.a = dnhi0;
        this.b = dxev0;
        this.c = z;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.j.b(this.b, this.c);
        this.a.H(hami.P, this.b);
    }
}


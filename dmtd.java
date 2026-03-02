import android.view.View.OnClickListener;
import android.view.View;

public final class dmtd implements View.OnClickListener {
    public final dmtl a;
    public final dxev b;

    public dmtd(dmtl dmtl0, dxev dxev0) {
        this.a = dmtl0;
        this.b = dxev0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.f(this.b);
        this.a.a(hami.S, this.b);
    }
}


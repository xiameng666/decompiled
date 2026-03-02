import android.view.View.OnClickListener;
import android.view.View;

public final class aafl implements View.OnClickListener {
    public final aafw a;

    public aafl(aafw aafw0) {
        this.a = aafw0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        aary aary0 = this.a.z();
        int v = aary0.g.ij() == aase.a ? 3 : 1;
        aary0.m.h(v);
    }
}


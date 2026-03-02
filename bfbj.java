import android.view.View.OnClickListener;
import android.view.View;

public final class bfbj implements View.OnClickListener {
    public final gqlt a;
    public final Boolean b;
    public final bfxv c;

    public bfbj(bfxv bfxv0, gqlt gqlt0, Boolean boolean0) {
        this.c = bfxv0;
        this.a = gqlt0;
        this.b = boolean0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.c.a(this.a, this.b.booleanValue());
    }
}


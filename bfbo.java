import android.view.View.OnClickListener;
import android.view.View;

public final class bfbo implements View.OnClickListener {
    public final bfbt a;
    public final gqlt b;

    public bfbo(bfbt bfbt0, gqlt gqlt0) {
        this.a = bfbt0;
        this.b = gqlt0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a(this.b);
    }
}


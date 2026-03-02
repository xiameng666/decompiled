import android.view.View.OnClickListener;
import android.view.View;

public final class dnhn implements View.OnClickListener {
    public final dnhp a;

    public dnhn(dnhp dnhp0) {
        this.a = dnhp0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a.e(this.a.f);
    }
}


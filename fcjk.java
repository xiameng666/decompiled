import android.view.View.OnClickListener;
import android.view.View;

public final class fcjk implements View.OnClickListener {
    public final fcln a;

    public fcjk(fcln fcln0) {
        this.a = fcln0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fcln.a.h("Cancelling key recovery", new Object[0]);
        evql evql0 = this.a.c.a();
        evql0.b(new fclf(this.a));
        evql0.A(new fclj(this.a, null, 5));
    }
}


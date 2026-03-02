import android.view.View.OnClickListener;
import android.view.View;

public final class arvf implements View.OnClickListener {
    public final arvl a;
    public final xob b;

    public arvf(arvl arvl0, xob xob0) {
        this.a = arvl0;
        this.b = xob0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        arvl arvl0 = this.a;
        if(arvl0.d && arvl0.c != null) {
            arvl0.a.d("Restore not in progress, cancelling notification", new Object[0]);
            if(hqiq.f()) {
                bayn bayn0 = arvl0.c;
                gftb.check(bayn0);
                bayn0.l(evuh.X);
            }
            else {
                bayn bayn1 = arvl0.c;
                gftb.check(bayn1);
                bayn1.k(5);
            }
        }
        this.b.finishAndRemoveTask();
    }
}


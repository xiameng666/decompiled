import android.view.View.OnClickListener;
import android.view.View;

public final class ekik implements View.OnClickListener {
    public final ekit a;

    public ekik(ekit ekit0) {
        this.a = ekit0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ekit ekit0 = this.a;
        if(ekit0.c.c) {
            ejyy ejyy0 = ekit0.ah.f();
            Long long0 = ejyy0.b;
            if(!ekit0.c.D(Long.toString(long0.longValue()))) {
                ekit0.E(ekit0.c.i(), ejyy0, Long.toString(long0.longValue()), 5);
                return;
            }
        }
        ekit0.B();
    }
}


import android.view.View.OnClickListener;
import android.view.View;

public final class zuz implements View.OnClickListener {
    public final zvd a;
    public final zuu b;

    public zuz(zvd zvd0, zuu zuu0) {
        this.a = zvd0;
        this.b = zuu0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        aacf aacf0 = this.a.t;
        if(aacf0 != null) {
            aacf0.a((this.b.a.d == null ? grwp.a : this.b.a.d));
        }
    }
}


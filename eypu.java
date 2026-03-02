import android.view.View.OnClickListener;
import android.view.View;

public final class eypu implements View.OnClickListener {
    public final eypw a;
    public final int b;

    public eypu(eypw eypw0, int v) {
        this.a = eypw0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.e.a(Integer.valueOf(this.b));
    }
}


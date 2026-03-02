import android.view.View.OnClickListener;
import android.view.View;

public final class bmsm implements View.OnClickListener {
    public final bmsp a;

    public bmsm(bmsp bmsp0) {
        this.a = bmsp0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.d.b(new bmsl(this.a));
    }
}


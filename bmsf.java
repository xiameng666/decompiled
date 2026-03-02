import android.view.View.OnClickListener;
import android.view.View;

public final class bmsf implements View.OnClickListener {
    public final bmsp a;

    public bmsf(bmsp bmsp0) {
        this.a = bmsp0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.b.y(10);
    }
}


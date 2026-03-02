import android.view.View.OnClickListener;
import android.view.View;

public final class eklb implements View.OnClickListener {
    public final eklg a;

    public eklb(eklg eklg0) {
        this.a = eklg0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.c.c();
    }
}


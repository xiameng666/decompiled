import android.view.View.OnClickListener;
import android.view.View;

public final class cqkc implements View.OnClickListener {
    public final cqkf a;

    public cqkc(cqkf cqkf0) {
        this.a = cqkf0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.c.run();
    }
}


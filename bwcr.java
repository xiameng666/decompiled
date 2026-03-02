import android.view.View.OnClickListener;
import android.view.View;

public final class bwcr implements View.OnClickListener {
    public final iw a;

    public bwcr(iw iw0) {
        this.a = iw0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.dismiss();
    }
}


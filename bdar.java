import android.view.View.OnClickListener;
import android.view.View;

public final class bdar implements View.OnClickListener {
    public final bdat a;

    public bdar(bdat bdat0) {
        this.a = bdat0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.u.setMaxLines(0x7FFFFFFF);
        this.a.u.setTextIsSelectable(true);
        this.a.y.setVisibility(8);
    }
}


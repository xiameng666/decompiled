import android.view.View.OnClickListener;
import android.view.View;

public final class bmph implements View.OnClickListener {
    public final bmpj a;
    public final int b;

    public bmph(bmpj bmpj0, int v) {
        this.a = bmpj0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bmpg bmpg0 = (bmpg)this.a.e.get(this.b);
        this.a.a.a(bmpg0);
    }
}


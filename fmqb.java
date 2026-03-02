import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

public final class fmqb extends FrameLayout implements fmrd, fmsc {
    public final LayoutInflater a;

    public fmqb(Context context0) {
        super(fmrf.b(context0, iaea.j()), null, 0);
        this.a = LayoutInflater.from(context0);
    }

    @Override  // fmrd
    public final void aL(Object object0) {
        throw null;
    }

    @Override  // fmsc
    public final void b() {
        this.removeAllViews();
    }
}


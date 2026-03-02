import android.view.View;
import android.widget.HorizontalScrollView;

public final class bukm implements Runnable {
    public final HorizontalScrollView a;
    public final View b;

    public bukm(HorizontalScrollView horizontalScrollView0, View view0) {
        this.a = horizontalScrollView0;
        this.b = view0;
    }

    @Override
    public final void run() {
        int v = this.b.getLeft();
        int v1 = this.b.getTop();
        this.a.smoothScrollTo(v, v1);
    }
}


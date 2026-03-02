import androidx.core.widget.NestedScrollView;

public final class duga implements Runnable {
    public final NestedScrollView a;

    public duga(NestedScrollView nestedScrollView0) {
        this.a = nestedScrollView0;
    }

    @Override
    public final void run() {
        int v = this.a.getChildCount() - 1;
        int v1 = this.a.getChildAt(v).getBottom() + this.a.getPaddingBottom() - (this.a.getScrollY() + this.a.getHeight());
        this.a.y(v1);
    }
}


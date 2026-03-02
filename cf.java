import android.view.View;
import android.view.ViewGroup;

public final class cf implements Runnable {
    public final ViewGroup a;
    public final View b;
    public final ch c;

    public cf(ViewGroup viewGroup0, View view0, ch ch0) {
        this.a = viewGroup0;
        this.b = view0;
        this.c = ch0;
    }

    @Override
    public final void run() {
        this.a.endViewTransition(this.b);
        this.c.a.a.f(this.c);
    }
}


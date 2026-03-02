import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import j..util.Objects;

final class bmxz implements ViewTreeObserver.OnGlobalLayoutListener {
    final View a;
    final bmya b;

    public bmxz(bmya bmya0, View view0) {
        this.a = view0;
        Objects.requireNonNull(bmya0);
        this.b = bmya0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.b.a.o((this.a == null ? this.b.b.findViewById(0x7F0B0DFD).getBottom() : this.a.getBottom()));  // id:cancel_button
    }
}


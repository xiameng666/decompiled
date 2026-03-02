import android.view.View;
import android.view.ViewGroup;
import j..util.Objects;

public final class egwf extends tk {
    public final View a;

    public egwf(View view0) {
        this.a = view0;
    }

    @Override  // tk
    public final int b() {
        return 1;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        Objects.requireNonNull(this);
        return new uq(this.a);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
    }
}


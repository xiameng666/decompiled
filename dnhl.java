import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import j..util.Objects;

public final class dnhl extends tk {
    public boolean a;
    private static final int e;

    static {
        dnhl.e = ((ghfw)ghgf.e().d(dnhl.class.getCanonicalName())).a;
    }

    public dnhl() {
        this.a = false;
    }

    @Override  // tk
    public final int b() {
        return this.a ? 1 : 0;
    }

    @Override  // tk
    public final int dx(int v) {
        return dnhl.e;
    }

    @Override  // tk
    public final long dy(int v) {
        return (long)dnhl.e;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E06D5, viewGroup0, false);  // layout:pay_fop_detail_empty_space
        Objects.requireNonNull(this);
        return new uq(view0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
    }
}


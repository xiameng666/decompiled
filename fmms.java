import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public final class fmms extends tk {
    private final List a;
    private final fmqf e;
    private final fmrq f;

    public fmms(fmqf fmqf0, fmrq fmrq0) {
        this.a = new ArrayList();
        this.e = fmqf0;
        this.f = fmrq0;
    }

    @Override  // tk
    public final int b() {
        return this.a.size();
    }

    @Override  // tk
    public final int dx(int v) {
        return 15;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        return new uq(new fmoo(viewGroup0.getContext()));
    }

    public final void f(List list0) {
        this.a.clear();
        this.x(0, this.a.size());
        this.a.addAll(list0);
        this.w(0, this.a.size());
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        fmlm fmlm0 = (fmlm)this.a.get(v);
        ((fmoo)uq0.a).a(fmlm0, this.e, this.f);
    }

    public final boolean n() {
        return this.a.isEmpty();
    }
}


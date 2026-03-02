import android.view.ViewGroup;
import java.util.ArrayList;

public class csee extends tk {
    protected final ArrayList a;

    public csee() {
        this.a = new ArrayList();
    }

    public final void G(int v, int v1) {
        this.a.subList(v, v1).clear();
        this.x(v, v1 - v);
    }

    public final void H(cskk cskk0) {
        ArrayList arrayList0 = this.a;
        if(arrayList0.add(cskk0)) {
            this.s(arrayList0.size() - 1);
        }
    }

    @Override  // tk
    public final int b() {
        return this.a.size();
    }

    @Override  // tk
    public final int dx(int v) {
        return ((cskk)this.a.get(v)).a();
    }

    @Override  // tk
    public uq dz(ViewGroup viewGroup0, int v) {
        return csju.a(viewGroup0, v);
    }

    public final void f(int v, cskk cskk0) {
        this.a.add(v, cskk0);
        this.s(v);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ((cskk)this.a.get(v)).b(uq0);
    }

    public final void n() {
        this.a.clear();
        this.q();
    }
}


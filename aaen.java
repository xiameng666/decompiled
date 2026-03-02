import android.view.ViewGroup;
import j..util.Objects;
import java.util.List;

public class aaen extends lh {
    public final aaev e;
    private aaby f;
    private aacg g;
    private boolean h;
    private boolean i;

    public aaen(la la0, aaev aaev0) {
        super(la0);
        this.e = aaev0;
    }

    public final void H(aaby aaby0, aacg aacg0) {
        if(Objects.equals(this.f, aaby0)) {
            return;
        }
        this.f = aaby0;
        this.g = aacg0;
        if(this.h) {
            this.i = true;
            return;
        }
        this.jQ(this.d());
    }

    @Override  // tk
    public uq dz(ViewGroup viewGroup0, int v) {
        throw null;
    }

    @Override  // lh
    public final void e(List list0, List list1) {
        this.h = false;
        if(this.i) {
            this.jQ(this.d());
        }
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ((aaep)uq0).D(((aaem)this.c(v)));
    }

    @Override  // lh
    public void jQ(List list0) {
        List list1;
        this.h = true;
        this.i = false;
        if(list0 == null) {
            list1 = null;
        }
        else {
            ggdy ggdy0 = new ggdy();
            aaby aaby0 = this.f;
            if(aaby0 != null) {
                ggdy0.i(new aaeq(aaby0, this.g));
            }
            if(!list0.isEmpty() && ((aaem)list0.get(0)).a() == 1) {
                ggdy0.k(list0.subList(1, list0.size()));
            }
            else {
                ggdy0.k(list0);
            }
            list1 = ggdy0.h();
        }
        super.jQ(list1);
    }

    @Override  // tk
    public final void l(uq uq0) {
        ((aaep)uq0).F();
    }

    @Override  // tk
    public final void z(uq uq0, int v, List list0) {
        ((aaep)uq0).E(((aaem)this.c(v)), list0);
    }
}


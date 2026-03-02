import j..util.Objects;
import java.lang.reflect.Array;
import java.util.Map;

final class ggbs extends ggnn {
    public final ggeo b;
    public final ggeo c;
    public final int[] d;
    public final int[] e;
    public final Object[][] f;
    private final ggeo g;
    private final ggeo h;
    private final int[] i;
    private final int[] j;

    public ggbs(gged_interceptors gged0, ggfp ggfp0, ggfp ggfp1) {
        int[] arr_v = new int[2];
        arr_v[1] = ggfp1.size();
        arr_v[0] = ggfp0.size();
        this.f = (Object[][])Array.newInstance(Object.class, arr_v);
        ggeo ggeo0 = ggkm.d(ggfp0);
        this.b = ggeo0;
        ggeo ggeo1 = ggkm.d(ggfp1);
        this.c = ggeo1;
        this.d = new int[((ggnf)ggeo0).d];
        this.e = new int[((ggnf)ggeo1).d];
        int[] arr_v1 = new int[gged0.size()];
        int[] arr_v2 = new int[gged0.size()];
        for(int v = 0; v < gged0.size(); ++v) {
            ggpi ggpi0 = (ggpi)gged0.get(v);
            Object object0 = ggpi0.b();
            Object object1 = ggpi0.a();
            int v1 = (int)(((Integer)Objects.requireNonNull(((Integer)this.b.get(object0)))));
            int v2 = (int)(((Integer)Objects.requireNonNull(((Integer)this.c.get(object1)))));
            ggbs.v(object0, object1, this.f[v1][v2], ggpi0.c());
            Object[] arr_object = this.f[v1];
            arr_object[v2] = ggpi0.c();
            ++this.d[v1];
            ++this.e[v2];
            arr_v1[v] = v1;
            arr_v2[v] = v2;
        }
        this.i = arr_v1;
        this.j = arr_v2;
        this.g = new ggbr(this);
        this.h = new ggbn(this);
    }

    @Override  // gfyy
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)this.b.get(object0);
        Integer integer1 = (Integer)this.c.get(object1);
        return integer0 == null || integer1 == null ? null : this.f[((int)integer0)][((int)integer1)];
    }

    @Override  // ggpj
    public final int k() {
        return this.i.length;
    }

    @Override  // ggge
    public final ggeo l() {
        return ggeo.k(this.h);
    }

    @Override  // ggge
    public final ggeo m() {
        return ggeo.k(this.g);
    }

    @Override  // ggnn
    public final ggpi n(int v) {
        int v1 = this.i[v];
        int v2 = this.j[v];
        return ggbs.t(this.s().v().get(v1), this.r().v().get(v2), Objects.requireNonNull(this.f[v1][v2]));
    }

    @Override  // ggnn
    public final Object o(int v) {
        return Objects.requireNonNull(this.f[this.i[v]][this.j[v]]);
    }

    @Override  // ggge
    public final Map p() {
        return this.m();
    }

    @Override  // ggnn
    Object writeReplace() {
        return gggd.a(this, this.i, this.j);
    }
}


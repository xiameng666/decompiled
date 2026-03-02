import java.io.Serializable;
import java.util.Collection;

final class gggd implements Serializable {
    private final Object[] a;
    private final Object[] b;
    private final Object[] c;
    private final int[] d;
    private final int[] e;
    private static final long serialVersionUID;

    private gggd(Object[] arr_object, Object[] arr_object1, Object[] arr_object2, int[] arr_v, int[] arr_v1) {
        this.a = arr_object;
        this.b = arr_object1;
        this.c = arr_object2;
        this.d = arr_v;
        this.e = arr_v1;
    }

    static gggd a(ggge ggge0, int[] arr_v, int[] arr_v1) {
        Object[] arr_object = ggge0.s().toArray();
        Object[] arr_object1 = ggge0.r().toArray();
        Collection collection0 = ggge0.a;
        if(collection0 == null) {
            collection0 = ggge0.d();
            ggge0.a = collection0;
        }
        return new gggd(arr_object, arr_object1, ((ggds)collection0).toArray(), arr_v, arr_v1);
    }

    Object readResolve() {
        Object[] arr_object = this.c;
        if(arr_object.length == 0) {
            return ggon.b;
        }
        if(arr_object.length == 1) {
            return new ggoi(this.a[0], this.b[0], arr_object[0]);
        }
        ggdy ggdy0 = new ggdy(arr_object.length);
        for(int v = 0; v < arr_object.length; ++v) {
            ggdy0.i(ggge.t(this.a[this.d[v]], this.b[this.e[v]], arr_object[v]));
        }
        return ggnn.u(ggdy0.h(), ggfp.H(this.a), ggfp.H(this.b));
    }
}


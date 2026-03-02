import j..util.Objects;
import java.util.Arrays;
import java.util.Iterator;

public class ggfn extends ggdq {
    Object[] d;
    private int e;

    public ggfn() {
        super(4);
    }

    public ggfn(int v) {
        super(v);
        this.d = new Object[ggfp.B(v)];
    }

    @Override  // ggdq
    public void c(Object object0) {
        this.i(object0);
    }

    @Override  // ggdr
    public ggds g() {
        return this.h();
    }

    public ggfp h() {
        ggfp ggfp0;
        int v = this.b;
        switch(v) {
            case 0: {
                return ggnj.a;
            }
            case 1: {
                return new ggoh(Objects.requireNonNull(this.a[0]));
            }
            default: {
                if(this.d != null && ggfp.B(v) == this.d.length) {
                    ggfp0 = new ggnj((ggfp.P(this.b, this.a.length) ? Arrays.copyOf(this.a, this.b) : this.a), this.e, this.d, this.d.length - 1, this.b);
                }
                else {
                    ggfp0 = ggfp.E(this.b, this.a);
                    this.b = ggfp0.size();
                }
                this.c = true;
                this.d = null;
                return ggfp0;
            }
        }
    }

    public final void i(Object object0) {
        gftb.check(object0);
        if(this.d != null) {
            int v = ggfp.B(this.b);
            Object[] arr_object = this.d;
            if(v > arr_object.length) {
                goto label_21;
            }
            Objects.requireNonNull(arr_object);
            int v1 = this.d.length - 1;
            int v2 = object0.hashCode();
            for(int v3 = ggdk.a(v2); true; v3 = v4 + 1) {
                int v4 = v3 & v1;
                Object[] arr_object1 = this.d;
                Object object1 = arr_object1[v4];
                if(object1 == null) {
                    arr_object1[v4] = object0;
                    this.e += v2;
                    super.b(object0);
                    return;
                }
                if(object1.equals(object0)) {
                    return;
                }
            }
        }
    label_21:
        this.d = null;
        super.b(object0);
    }

    public final void j(Object[] arr_object) {
        if(this.d != null) {
            for(int v = 0; v < arr_object.length; ++v) {
                this.i(arr_object[v]);
            }
            return;
        }
        super.d(arr_object);
    }

    public final void k(Iterable iterable0) {
        gftb.check(iterable0);
        if(this.d != null) {
            for(Object object0: iterable0) {
                this.i(object0);
            }
            return;
        }
        super.e(iterable0);
    }

    public final void l(Iterator iterator0) {
        gftb.check(iterator0);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            this.i(object0);
        }
    }

    public final void m(ggfn ggfn0) {
        if(this.d != null) {
            for(int v = 0; v < ggfn0.b; ++v) {
                this.i(Objects.requireNonNull(ggfn0.a[v]));
            }
            return;
        }
        this.a(ggfn0.a, ggfn0.b);
    }
}


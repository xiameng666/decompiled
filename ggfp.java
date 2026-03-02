import j..util.Objects;
import j..util.Set;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;

public abstract class ggfp extends ggds implements Set, java.util.Set {
    private transient gged_interceptors a;
    private static final long serialVersionUID = 0xDECAFL;

    static int B(int v) {
        int v1 = Math.max(v, 2);
        if(v1 < 0x2CCCCCCC) {
            int v2 = Integer.highestOneBit(v1 - 1);
            do {
                v2 += v2;
            }
            while(((double)v2) * 0.7 < ((double)v1));
            return v2;
        }
        gftb.b(v1 < 0x40000000, "collection too large");
        return 0x40000000;
    }

    public gged_interceptors C() {
        return gged_interceptors.f(this.toArray());
    }

    public static ggfn D(int v) {
        ggag.c(v, "expectedSize");
        return new ggfn(v);
    }

    public static ggfp E(int v, Object[] arr_object) {
        switch(v) {
            case 0: {
                return ggnj.a;
            }
            case 1: {
                return new ggoh(Objects.requireNonNull(arr_object[0]));
            }
            default: {
                int v1 = ggfp.B(v);
                Object[] arr_object1 = new Object[v1];
                int v3 = 0;
                int v4 = 0;
                for(int v2 = 0; v2 < v; ++v2) {
                    Object object0 = arr_object[v2];
                    ggml.e(object0, v2);
                    int v5 = object0.hashCode();
                    for(int v6 = ggdk.a(v5); true; ++v6) {
                        int v7 = v6 & v1 - 1;
                        Object object1 = arr_object1[v7];
                        if(object1 == null) {
                            arr_object[v4] = object0;
                            arr_object1[v7] = object0;
                            v3 += v5;
                            ++v4;
                            break;
                        }
                        if(object1.equals(object0)) {
                            break;
                        }
                    }
                }
                Arrays.fill(arr_object, v4, v, null);
                if(v4 == 1) {
                    return new ggoh(Objects.requireNonNull(arr_object[0]));
                }
                if(ggfp.B(v4) < v1 / 2) {
                    return ggfp.E(v4, arr_object);
                }
                if(ggfp.P(v4, arr_object.length)) {
                    arr_object = Arrays.copyOf(arr_object, v4);
                }
                return new ggnj(arr_object, v3, arr_object1, v1 - 1, v4);
            }
        }
    }

    public static ggfp F(Iterable iterable0) {
        if((iterable0 instanceof Collection)) {
            return ggfp.G(((Collection)iterable0));
        }
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return ggnj.a;
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return new ggoh(object0);
        }
        ggfn ggfn0 = new ggfn();
        ggfn0.i(object0);
        ggfn0.l(iterator0);
        return ggfn0.h();
    }

    public static ggfp G(Collection collection0) {
        if((collection0 instanceof ggfp) && !(collection0 instanceof SortedSet) && !((ggfp)collection0).oo()) {
            return (ggfp)collection0;
        }
        Object[] arr_object = collection0.toArray();
        return ggfp.E(arr_object.length, arr_object);
    }

    public static ggfp H(Object[] arr_object) {
        switch(arr_object.length) {
            case 0: {
                return ggnj.a;
            }
            case 1: {
                return new ggoh(arr_object[0]);
            }
            default: {
                Object[] arr_object1 = (Object[])arr_object.clone();
                return ggfp.E(arr_object.length, arr_object1);
            }
        }
    }

    public static ggfp I() {
        return ggnj.a;
    }

    public static ggfp J(Object object0) {
        return new ggoh(object0);
    }

    public static ggfp K(Object object0, Object object1) {
        return ggfp.E(2, new Object[]{object0, object1});
    }

    public static ggfp L(Object object0, Object object1, Object object2) {
        return ggfp.E(3, new Object[]{object0, object1, object2});
    }

    public static ggfp M(Object object0, Object object1, Object object2, Object object3) {
        return ggfp.E(4, new Object[]{object0, object1, object2, object3});
    }

    public static ggfp N(Object object0, Object object1, Object object2, Object object3, Object object4) {
        return ggfp.E(5, new Object[]{object0, object1, object2, object3, object4});
    }

    @SafeVarargs
    public static ggfp O(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object[] arr_object) {
        int v = arr_object.length + 6;
        Object[] arr_object1 = new Object[v];
        arr_object1[0] = object0;
        arr_object1[1] = object1;
        arr_object1[2] = object2;
        arr_object1[3] = object3;
        arr_object1[4] = object4;
        arr_object1[5] = object5;
        System.arraycopy(arr_object, 0, arr_object1, 6, arr_object.length);
        return ggfp.E(v, arr_object1);
    }

    public static boolean P(int v, int v1) {
        return v < (v1 >> 1) + (v1 >> 2);
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return !(object0 instanceof ggfp) || !this.w() || !((ggfp)object0).w() || this.hashCode() == object0.hashCode() ? ggog.o(this, object0) : false;
    }

    @Override
    public int hashCode() {
        return ggog.a(this);
    }

    @Override  // ggds
    public Iterator iterator() {
        return this.om();
    }

    @Override  // ggds
    public abstract ggqj om();

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override  // ggds
    public gged_interceptors v() {
        gged_interceptors gged0 = this.a;
        if(gged0 == null) {
            gged0 = this.C();
            this.a = gged0;
        }
        return gged0;
    }

    public boolean w() {
        return false;
    }

    @Override  // ggds
    public Object writeReplace() {
        return new ggfo(this.toArray());
    }
}


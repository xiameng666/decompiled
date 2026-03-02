import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class hfrj implements Builder {
    public final hfrj A(byte[] arr_b, hftc hftc0) {
        return this.J(arr_b, arr_b.length, hftc0);
    }

    @Override  // Builder
    public final Builder mergeFrom(MessageLite hfvm0) {
        if(this.S().getClass().isInstance(hfvm0)) {
            return this.w(((hfrk)hfvm0));
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override  // Builder
    public final Builder mergeFromBytes(byte[] arr_b) {
        return this.y(arr_b);
    }

    @Override  // Builder
    public final Builder D(byte[] arr_b, hftc hftc0) {
        return this.A(arr_b, hftc0);
    }

    public static void E(Iterable iterable0, List list0) {
        hfup.d(iterable0);
        if((iterable0 instanceof hfuy)) {
            int v = list0.size();
            for(Object object0: ((hfuy)iterable0).a()) {
                if(object0 == null) {
                    String s = "Element at index " + (((hfuy)list0).size() - v) + " is null.";
                    int v1 = ((hfuy)list0).size();
                    while(true) {
                        --v1;
                        if(v1 < v) {
                            break;
                        }
                        ((hfuy)list0).remove(v1);
                    }
                    throw new NullPointerException(s);
                }
                if((object0 instanceof ByteString)) {
                    ByteString hfsf0 = (ByteString)object0;
                    ((hfuy)list0).b();
                }
                else if((object0 instanceof byte[])) {
                    ByteString.copyFrom(((byte[])object0));
                    ((hfuy)list0).b();
                }
                else {
                    ((hfuy)list0).add(((String)object0));
                }
            }
            return;
        }
        if(!(iterable0 instanceof hfvt)) {
            if((iterable0 instanceof Collection)) {
                int v2 = ((Collection)iterable0).size();
                if((list0 instanceof ArrayList)) {
                    ((ArrayList)list0).ensureCapacity(list0.size() + v2);
                }
                else if((list0 instanceof hfvv)) {
                    int v3 = list0.size() + v2;
                    int v4 = ((hfvv)list0).b.length;
                    if(v3 > v4) {
                        if(v4 == 0) {
                            ((hfvv)list0).b = new Object[Math.max(v3, 10)];
                        }
                        else {
                            while(v4 < v3) {
                                v4 = hfvv.d(v4);
                            }
                            ((hfvv)list0).b = Arrays.copyOf(((hfvv)list0).b, v4);
                        }
                    }
                }
            }
            int v5 = list0.size();
            if((iterable0 instanceof List) && (iterable0 instanceof RandomAccess)) {
                int v6 = ((List)iterable0).size();
                for(int v7 = 0; v7 < v6; ++v7) {
                    Object object1 = ((List)iterable0).get(v7);
                    if(object1 == null) {
                        hfrj.a(list0, v5);
                    }
                    list0.add(object1);
                }
                return;
            }
            for(Object object2: iterable0) {
                if(object2 == null) {
                    hfrj.a(list0, v5);
                }
                list0.add(object2);
            }
            return;
        }
        list0.addAll(((Collection)iterable0));
    }

    @Override  // Builder
    public void F(hfsl hfsl0, hftc hftc0) {
        throw null;
    }

    public final void G(InputStream inputStream0) {
        hfsl hfsl0 = hfsl.N(inputStream0);
        this.x(hfsl0);
        hfsl0.z(0);
    }

    public final void H(InputStream inputStream0, hftc hftc0) {
        hfsl hfsl0 = hfsl.N(inputStream0);
        this.z(hfsl0, hftc0);
        hfsl0.z(0);
    }

    public hfrj I(byte[] arr_b, int v) {
        throw null;
    }

    public hfrj J(byte[] arr_b, int v, hftc hftc0) {
        throw null;
    }

    @Override  // Builder
    public final void K(InputStream inputStream0) {
        this.G(inputStream0);
    }

    @Override  // Builder
    public final void L(InputStream inputStream0, hftc hftc0) {
        this.H(inputStream0, hftc0);
    }

    private static void a(List list0, int v) {
        String s = "Element at index " + (list0.size() - v) + " is null.";
        int v1 = list0.size();
        while(true) {
            --v1;
            if(v1 < v) {
                break;
            }
            list0.remove(v1);
        }
        throw new NullPointerException(s);
    }

    @Override
    public Object clone() {
        return this.v();
    }

    public abstract hfrj v();

    protected abstract hfrj w(hfrk arg1);

    public final hfrj x(hfsl hfsl0) {
        return this.z(hfsl0, hftc.a);
    }

    public final hfrj y(byte[] arr_b) {
        return this.I(arr_b, arr_b.length);
    }

    public abstract hfrj z(hfsl arg1, hftc arg2);
}


import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class bzs {
    private int[] a;
    private Object[] b;
    public int d_num;

    public bzs() {
        this(null);
    }

    public bzs(int v) {
        this.a = v == 0 ? caa.a : new int[v];
        this.b = v == 0 ? caa.c : new Object[v + v];
    }

    public bzs(bzs bzs0) {
        this(null);
        if(bzs0 != null) {
            this.k(bzs0);
        }
    }

    public bzs(byte[] arr_b) {
        this(0);
    }

    private final int a(Object object0, int v) {
        int v1 = this.d_num;
        if(v1 == 0) {
            return -1;
        }
        int v2 = caa.a(this.a, v1, v);
        if(v2 < 0 || ibuq.m(object0, this.b[v2 + v2])) {
            return v2;
        }
        int v3;
        for(v3 = v2 + 1; v3 < v1 && this.a[v3] == v; ++v3) {
            if(ibuq.m(object0, this.b[v3 + v3])) {
                return v3;
            }
        }
        for(int v4 = v2 - 1; v4 >= 0 && this.a[v4] == v; --v4) {
            if(ibuq.m(object0, this.b[v4 + v4])) {
                return v4;
            }
        }
        return ~v3;
    }

    private final int b() {
        int v = this.d_num;
        if(v == 0) {
            return -1;
        }
        int v1 = caa.a(this.a, v, 0);
        if(v1 < 0 || this.b[v1 + v1] == null) {
            return v1;
        }
        int v2;
        for(v2 = v1 + 1; v2 < v && this.a[v2] == 0; ++v2) {
            if(this.b[v2 + v2] == null) {
                return v2;
            }
        }
        for(int v3 = v1 - 1; v3 >= 0 && this.a[v3] == 0; --v3) {
            if(this.b[v3 + v3] == null) {
                return v3;
            }
        }
        return ~v2;
    }

    public void clear() {
        if(this.d_num > 0) {
            this.a = caa.a;
            this.b = caa.c;
            this.d_num = 0;
        }
    }

    public final boolean containsKey(Object object0) {
        return this.e(object0) >= 0;
    }

    public final boolean containsValue(Object object0) {
        return this.d(object0) >= 0;
    }

    public final int d(Object object0) {
        int v = this.d_num + this.d_num;
        Object[] arr_object = this.b;
        if(object0 == null) {
            for(int v1 = 1; v1 < v; v1 += 2) {
                if(arr_object[v1] == null) {
                    return v1 >> 1;
                }
            }
            return -1;
        }
        for(int v2 = 1; v2 < v; v2 += 2) {
            if(ibuq.m(object0, arr_object[v2])) {
                return v2 >> 1;
            }
        }
        return -1;
    }

    public final int e(Object object0) {
        return object0 == null ? this.b() : this.a(object0, object0.hashCode());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        try {
            if((object0 instanceof bzs)) {
                int v = this.d_num;
                if(v == ((bzs)object0).d_num) {
                    for(int v1 = 0; v1 < v; ++v1) {
                        Object object1 = this.f(v1);
                        Object object2 = this.i(v1);
                        Object object3 = ((bzs)object0).get(object1);
                        if(object2 == null) {
                            if(object3 != null || !((bzs)object0).containsKey(object1)) {
                                return false;
                            }
                        }
                        else if(!ibuq.m(object2, object3)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            if((object0 instanceof Map)) {
                if(this.d_num != ((Map)object0).size()) {
                    return false;
                }
                int v2 = this.d_num;
                for(int v3 = 0; v3 < v2; ++v3) {
                    Object object4 = this.f(v3);
                    Object object5 = this.i(v3);
                    Object object6 = ((Map)object0).get(object4);
                    if(object5 == null) {
                        if(object6 != null || !((Map)object0).containsKey(object4)) {
                            return false;
                        }
                    }
                    else if(!ibuq.m(object5, object6)) {
                        return false;
                    }
                }
                return true;
            }
        }
        catch(NullPointerException | ClassCastException unused_ex) {
        }
        return false;
    }

    public final Object f(int v) {
        if(v < 0 || v >= this.d_num) {
            cad.a(a.h(v, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[v + v];
    }

    public Object g(int v) {
        if(v < 0 || v >= this.d_num) {
            cad.a(("Expected index to be within 0..size()-1, but was " + v));
        }
        Object[] arr_object = this.b;
        int v1 = v + v;
        Object object0 = arr_object[v1 + 1];
        int v2 = this.d_num;
        if(v2 <= 1) {
            this.clear();
            return object0;
        }
        int v3 = v2 - 1;
        int[] arr_v = this.a;
        int v4 = 8;
        if(arr_v.length > 8 && v2 < arr_v.length / 3) {
            if(v2 > 8) {
                v4 = v2 + (v2 >> 1);
            }
            int[] arr_v1 = Arrays.copyOf(arr_v, v4);
            ibuq.e(arr_v1, "copyOf(...)");
            this.a = arr_v1;
            Object[] arr_object1 = Arrays.copyOf(this.b, v4 + v4);
            ibuq.e(arr_object1, "copyOf(...)");
            this.b = arr_object1;
            if(v2 != this.d_num) {
                throw new ConcurrentModificationException();
            }
            if(v > 0) {
                ibpg.aa(arr_v, this.a, 0, 0, v);
                ibpg.ac(arr_object, this.b, 0, 0, v1);
            }
            if(v < v3) {
                int v5 = v + 1;
                ibpg.aa(arr_v, this.a, v, v5, v2);
                ibpg.ac(arr_object, this.b, v1, v5 + v5, v2 + v2);
            }
        }
        else {
            if(v < v3) {
                int v6 = v + 1;
                ibpg.aa(arr_v, arr_v, v, v6, v2);
                ibpg.ac(this.b, this.b, v1, v6 + v6, v2 + v2);
            }
            Object[] arr_object2 = this.b;
            int v7 = v3 + v3;
            arr_object2[v7] = null;
            arr_object2[v7 + 1] = null;
        }
        if(v2 != this.d_num) {
            throw new ConcurrentModificationException();
        }
        this.d_num = v3;
        return object0;
    }

    public final Object get(Object object0) {
        int v = this.e(object0);
        return v < 0 ? null : this.b[v + v + 1];
    }

    public final Object getOrDefault(Object object0, Object object1) {
        int v = this.e(object0);
        return v < 0 ? object1 : this.b[v + v + 1];
    }

    public Object h(int v, Object object0) {
        if(v < 0 || v >= this.d_num) {
            cad.a(("Expected index to be within 0..size()-1, but was " + v));
        }
        Object[] arr_object = this.b;
        int v1 = v + v + 1;
        Object object1 = arr_object[v1];
        arr_object[v1] = object0;
        return object1;
    }

    @Override
    public int hashCode() {
        int[] arr_v = this.a;
        Object[] arr_object = this.b;
        int v = this.d_num;
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 1; v2 < v; v1 += 2) {
            Object object0 = arr_object[v1];
            v3 += (object0 == null ? 0 : object0.hashCode()) ^ arr_v[v2];
            ++v2;
        }
        return v3;
    }

    public final Object i(int v) {
        if(v < 0 || v >= this.d_num) {
            cad.a(a.h(v, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[v + v + 1];
    }

    public final boolean isEmpty() {
        return this.d_num <= 0;
    }

    public final void j(int v) {
        int v1 = this.d_num;
        int[] arr_v = this.a;
        if(arr_v.length < v) {
            int[] arr_v1 = Arrays.copyOf(arr_v, v);
            ibuq.e(arr_v1, "copyOf(...)");
            this.a = arr_v1;
            Object[] arr_object = Arrays.copyOf(this.b, v + v);
            ibuq.e(arr_object, "copyOf(...)");
            this.b = arr_object;
        }
        if(this.d_num == v1) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void k(bzs bzs0) {
        ibuq.f(bzs0, "map");
        int v = bzs0.d_num;
        this.j(this.d_num + v);
        if(this.d_num != 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                this.put(bzs0.f(v1), bzs0.i(v1));
            }
        }
        else if(v > 0) {
            ibpg.aa(bzs0.a, this.a, 0, 0, v);
            ibpg.ac(bzs0.b, this.b, 0, 0, v + v);
            this.d_num = v;
        }
    }

    public Object put(Object object0, Object object1) {
        int v = this.d_num;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = object0 == null ? this.b() : this.a(object0, v1);
        if(v2 >= 0) {
            int v3 = v2 + v2 + 1;
            Object[] arr_object = this.b;
            Object object2 = arr_object[v3];
            arr_object[v3] = object1;
            return object2;
        }
        int v4 = 8;
        int v5 = ~v2;
        int[] arr_v = this.a;
        if(v >= arr_v.length) {
            if(v >= 8) {
                v4 = (v >> 1) + v;
            }
            else if(v < 4) {
                v4 = 4;
            }
            int[] arr_v1 = Arrays.copyOf(arr_v, v4);
            ibuq.e(arr_v1, "copyOf(...)");
            this.a = arr_v1;
            Object[] arr_object1 = Arrays.copyOf(this.b, v4 + v4);
            ibuq.e(arr_object1, "copyOf(...)");
            this.b = arr_object1;
            if(v != this.d_num) {
                throw new ConcurrentModificationException();
            }
        }
        if(v5 < v) {
            int v6 = v5 + 1;
            ibpg.aa(this.a, this.a, v6, v5, v);
            ibpg.ac(this.b, this.b, v6 + v6, v5 + v5, this.d_num + this.d_num);
        }
        int v7 = this.d_num;
        if(v == v7) {
            int[] arr_v2 = this.a;
            if(v5 < arr_v2.length) {
                arr_v2[v5] = v1;
                Object[] arr_object2 = this.b;
                int v8 = v5 + v5;
                arr_object2[v8] = object0;
                arr_object2[v8 + 1] = object1;
                this.d_num = v7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object object0, Object object1) {
        Object object2 = this.get(object0);
        return object2 == null ? this.put(object0, object1) : object2;
    }

    public final Object remove(Object object0) {
        int v = this.e(object0);
        return v < 0 ? null : this.g(v);
    }

    public final boolean remove(Object object0, Object object1) {
        int v = this.e(object0);
        if(v >= 0 && ibuq.m(object1, this.i(v))) {
            this.g(v);
            return true;
        }
        return false;
    }

    public final Object replace(Object object0, Object object1) {
        int v = this.e(object0);
        return v < 0 ? null : this.h(v, object1);
    }

    public final boolean replace(Object object0, Object object1, Object object2) {
        int v = this.e(object0);
        if(v >= 0 && ibuq.m(object1, this.i(v))) {
            this.h(v, object2);
            return true;
        }
        return false;
    }

    public final int size() {
        return this.d_num;
    }

    @Override
    public final String toString() {
        if(this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.d_num * 28);
        stringBuilder0.append('{');
        int v = this.d_num;
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = this.f(v1);
            if(object0 == stringBuilder0) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
            stringBuilder0.append('=');
            Object object1 = this.i(v1);
            if(object1 == stringBuilder0) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object1);
            }
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}


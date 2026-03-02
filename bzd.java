import java.util.List;

public final class bzd {
    public Object[] a;
    public int b;
    private byq c;

    public bzd() {
        this(null);
    }

    public bzd(int v) {
        this.a = v == 0 ? bze.a : new Object[v];
    }

    public bzd(byte[] arr_b) {
        this(16);
    }

    public final int a(Object object0) {
        int v = 0;
        if(object0 == null) {
            Object[] arr_object = this.a;
            int v1 = this.b;
            while(v < v1) {
                if(arr_object[v] == null) {
                    return v;
                }
                ++v;
            }
            return -1;
        }
        Object[] arr_object1 = this.a;
        int v2 = this.b;
        while(v < v2) {
            if(object0.equals(arr_object1[v])) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public final Object b() {
        if(this.f()) {
            cad.d("ObjectList is empty.");
        }
        return this.a[0];
    }

    public final Object c(int v) {
        if(v < 0 || v >= this.b) {
            this.d(v);
        }
        return this.a[v];
    }

    public final void d(int v) {
        cad.c(("Index " + v + " must be in 0.." + (this.b - 1)));
    }

    public final boolean e(Object object0) {
        return this.a(object0) >= 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof bzd)) {
            int v = this.b;
            if(((bzd)object0).b == v) {
                Object[] arr_object = this.a;
                Object[] arr_object1 = ((bzd)object0).a;
                ibwm ibwm0 = ibwt.q(0, v);
                int v1 = ibwm0.a;
                int v2 = ibwm0.b;
                if(v1 <= v2) {
                    while(true) {
                        if(!ibuq.m(arr_object[v1], arr_object1[v1])) {
                            return false;
                        }
                        if(v1 == v2) {
                            break;
                        }
                        ++v1;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.b == 0;
    }

    public final boolean g() {
        return this.b != 0;
    }

    public final Object h(int v) {
        if(v < 0 || v >= this.b) {
            this.d(v);
        }
        Object[] arr_object = this.a;
        Object object0 = arr_object[v];
        int v1 = this.b;
        if(v != v1 - 1) {
            ibpg.ac(arr_object, arr_object, v, v + 1, v1);
        }
        int v2 = this.b - 1;
        this.b = v2;
        arr_object[v2] = null;
        return object0;
    }

    @Override
    public final int hashCode() {
        Object[] arr_object = this.a;
        int v = this.b;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            v2 += (object0 == null ? 0 : object0.hashCode()) * 0x1F;
        }
        return v2;
    }

    public final Object i(int v, Object object0) {
        if(v < 0 || v >= this.b) {
            this.d(v);
        }
        Object[] arr_object = this.a;
        Object object1 = arr_object[v];
        arr_object[v] = object0;
        return object1;
    }

    public final List j() {
        List list0 = this.c;
        if(list0 != null) {
            return list0;
        }
        byq byq0 = new byq(this);
        this.c = byq0;
        return byq0;
    }

    public final void k() {
        ibpg.f(this.a, null, 0, this.b);
        this.b = 0;
    }

    public final void l(int v, int v1) {
        if(v < 0 || (v > this.b || v1 < 0 || v1 > this.b)) {
            cad.c(("Start (" + v + ") and end (" + v1 + ") must be in 0.." + this.b));
        }
        if(v1 < v) {
            cad.a(("Start (" + v + ") is more than end (" + v1 + ')'));
        }
        if(v1 != v) {
            int v2 = this.b;
            if(v1 < v2) {
                ibpg.ac(this.a, this.a, v, v1, v2);
            }
            int v3 = this.b - (v1 - v);
            ibpg.f(this.a, null, v3, this.b);
            this.b = v3;
        }
    }

    public final void m(int v, Object[] arr_object) {
        ibuq.f(arr_object, "oldContent");
        Object[] arr_object1 = new Object[Math.max(v, arr_object.length * 3 / 2)];
        ibpg.ac(arr_object, arr_object1, 0, 0, arr_object.length);
        this.a = arr_object1;
    }

    public final void n(int v) {
        cad.c(("Index " + v + " must be in 0.." + this.b));
    }

    public final boolean o(Object object0) {
        int v = this.a(object0);
        if(v >= 0) {
            this.h(v);
            return true;
        }
        return false;
    }

    public final void p(Object object0) {
        int v = this.b + 1;
        Object[] arr_object = this.a;
        if(arr_object.length < v) {
            this.m(v, arr_object);
        }
        int v1 = this.b;
        this.a[v1] = object0;
        this.b = v1 + 1;
    }

    public final void q(List list0) {
        int v = this.b;
        if(list0.isEmpty()) {
            return;
        }
        int v1 = list0.size() + v;
        Object[] arr_object = this.a;
        if(arr_object.length < v1) {
            this.m(v1, arr_object);
        }
        Object[] arr_object1 = this.a;
        int v2 = list0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            arr_object1[v3 + v] = list0.get(v3);
        }
        this.b += list0.size();
    }

    @Override
    public final String toString() {
        bzc bzc0 = new bzc(this);
        StringBuilder stringBuilder0 = new StringBuilder("[");
        Object[] arr_object = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            if(v1 != 0) {
                stringBuilder0.append(", ");
            }
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            stringBuilder0.append(((CharSequence)bzc0.a(object0)));
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}


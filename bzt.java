import java.util.Arrays;

public final class bzt implements Cloneable {
    public boolean a;
    public int[] b;
    public Object[] c;
    public int d;

    public bzt() {
        this(null);
    }

    public bzt(int v) {
        if(v == 0) {
            this.b = caa.a;
            this.c = caa.c;
            return;
        }
        int v1 = caa.d(v);
        this.b = new int[v1];
        this.c = new Object[v1];
    }

    public bzt(byte[] arr_b) {
        this(10);
    }

    public final int a(int v) {
        if(this.a) {
            bzu.c(this);
        }
        return caa.a(this.b, this.d, v);
    }

    public final int b(int v) {
        if(this.a) {
            bzu.c(this);
        }
        if(v < this.d && v >= 0) {
            return this.b[v];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int c() {
        if(this.a) {
            bzu.c(this);
        }
        return this.d;
    }

    @Override
    public final Object clone() {
        return this.d();
    }

    public final bzt d() {
        Object object0 = super.clone();
        ibuq.d(object0, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        bzt bzt0 = (bzt)object0;
        bzt0.b = (int[])this.b.clone();
        bzt0.c = (Object[])this.c.clone();
        return bzt0;
    }

    public final Object e(int v) {
        if(this.a) {
            bzu.c(this);
        }
        if(v < this.d && v >= 0) {
            return this.c[v];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void f(int v, Object object0) {
        int v1 = this.d;
        if(v1 != 0 && v <= this.b[v1 - 1]) {
            this.h(v, object0);
            return;
        }
        if(this.a && v1 >= this.b.length) {
            bzu.c(this);
        }
        int v2 = this.d;
        int[] arr_v = this.b;
        if(v2 >= arr_v.length) {
            int v3 = caa.d(v2 + 1);
            int[] arr_v1 = Arrays.copyOf(arr_v, v3);
            ibuq.e(arr_v1, "copyOf(...)");
            this.b = arr_v1;
            Object[] arr_object = Arrays.copyOf(this.c, v3);
            ibuq.e(arr_object, "copyOf(...)");
            this.c = arr_object;
        }
        this.b[v2] = v;
        this.c[v2] = object0;
        this.d = v2 + 1;
    }

    public final void g() {
        int v = this.d;
        Object[] arr_object = this.c;
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = null;
        }
        this.d = 0;
        this.a = false;
    }

    public final void h(int v, Object object0) {
        int v1 = caa.a(this.b, this.d, v);
        if(v1 >= 0) {
            this.c[v1] = object0;
            return;
        }
        int v2 = ~v1;
        int v3 = this.d;
        if(v2 < v3) {
            Object[] arr_object = this.c;
            if(arr_object[v2] == bzu.a) {
                this.b[v2] = v;
                arr_object[v2] = object0;
                return;
            }
        }
        if(this.a && v3 >= this.b.length) {
            bzu.c(this);
            v2 = ~caa.a(this.b, this.d, v);
        }
        int v4 = this.d;
        int[] arr_v = this.b;
        if(v4 >= arr_v.length) {
            int v5 = caa.d(v4 + 1);
            int[] arr_v1 = Arrays.copyOf(arr_v, v5);
            ibuq.e(arr_v1, "copyOf(...)");
            this.b = arr_v1;
            Object[] arr_object1 = Arrays.copyOf(this.c, v5);
            ibuq.e(arr_object1, "copyOf(...)");
            this.c = arr_object1;
        }
        int v6 = this.d;
        if(v6 - v2 != 0) {
            ibpg.aa(this.b, this.b, v2 + 1, v2, v6);
            ibpg.ac(this.c, this.c, v2 + 1, v2, this.d);
        }
        this.b[v2] = v;
        this.c[v2] = object0;
        ++this.d;
    }

    public final boolean i(int v) {
        return this.a(v) >= 0;
    }

    public final boolean j() {
        return this.c() == 0;
    }

    @Override
    public final String toString() {
        if(this.c() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.d * 28);
        stringBuilder0.append('{');
        int v = this.d;
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(this.b(v1));
            stringBuilder0.append('=');
            Object object0 = this.e(v1);
            if(object0 == this) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}


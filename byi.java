import java.util.Arrays;

public final class byi implements Cloneable {
    public boolean a;
    public long[] b;
    public Object[] c;
    public int d;

    public byi() {
        this(null);
    }

    public byi(int v) {
        if(v == 0) {
            this.b = caa.b;
            this.c = caa.c;
            return;
        }
        int v1 = caa.e(v);
        this.b = new long[v1];
        this.c = new Object[v1];
    }

    public byi(byte[] arr_b) {
        this(10);
    }

    public final int a(long v) {
        if(this.a) {
            int v1 = this.d;
            long[] arr_v = this.b;
            Object[] arr_object = this.c;
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Object object0 = arr_object[v2];
                if(object0 != byj.a) {
                    if(v2 != v3) {
                        arr_v[v3] = arr_v[v2];
                        arr_object[v3] = object0;
                        arr_object[v2] = null;
                    }
                    ++v3;
                }
            }
            this.a = false;
            this.d = v3;
        }
        return caa.b(this.b, this.d, v);
    }

    public final int b() {
        if(this.a) {
            int v = this.d;
            long[] arr_v = this.b;
            Object[] arr_object = this.c;
            int v2 = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                Object object0 = arr_object[v1];
                if(object0 != byj.a) {
                    if(v1 != v2) {
                        arr_v[v2] = arr_v[v1];
                        arr_object[v2] = object0;
                        arr_object[v1] = null;
                    }
                    ++v2;
                }
            }
            this.a = false;
            this.d = v2;
        }
        return this.d;
    }

    public final long c(int v) {
        if(v < 0 || v >= this.d) {
            cad.a(("Expected index to be within 0..size()-1, but was " + v));
        }
        if(this.a) {
            int v1 = this.d;
            long[] arr_v = this.b;
            Object[] arr_object = this.c;
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Object object0 = arr_object[v2];
                if(object0 != byj.a) {
                    if(v2 != v3) {
                        arr_v[v3] = arr_v[v2];
                        arr_object[v3] = object0;
                        arr_object[v2] = null;
                    }
                    ++v3;
                }
            }
            this.a = false;
            this.d = v3;
        }
        return this.b[v];
    }

    @Override
    public final Object clone() {
        Object object0 = super.clone();
        ibuq.d(object0, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        Object object1 = (byi)object0;
        object1.b = (long[])this.b.clone();
        object1.c = (Object[])this.c.clone();
        return object1;
    }

    public final Object d(long v) {
        int v1 = caa.b(this.b, this.d, v);
        if(v1 >= 0) {
            Object object0 = this.c[v1];
            return object0 == byj.a ? null : object0;
        }
        return null;
    }

    public final Object e(long v, Object object0) {
        int v1 = caa.b(this.b, this.d, v);
        if(v1 >= 0) {
            Object object1 = this.c[v1];
            return object1 == byj.a ? object0 : object1;
        }
        return object0;
    }

    public final Object f(int v) {
        if(v < 0 || v >= this.d) {
            cad.a(a.h(v, "Expected index to be within 0..size()-1, but was "));
        }
        if(this.a) {
            int v1 = this.d;
            long[] arr_v = this.b;
            Object[] arr_object = this.c;
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Object object0 = arr_object[v2];
                if(object0 != byj.a) {
                    if(v2 != v3) {
                        arr_v[v3] = arr_v[v2];
                        arr_object[v3] = object0;
                        arr_object[v2] = null;
                    }
                    ++v3;
                }
            }
            this.a = false;
            this.d = v3;
        }
        return this.c[v];
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

    public final void h(long v, Object object0) {
        int v1 = caa.b(this.b, this.d, v);
        if(v1 >= 0) {
            this.c[v1] = object0;
            return;
        }
        int v2 = ~v1;
        int v3 = this.d;
        if(v2 < v3) {
            Object[] arr_object = this.c;
            if(arr_object[v2] == byj.a) {
                this.b[v2] = v;
                arr_object[v2] = object0;
                return;
            }
        }
        if(this.a) {
            long[] arr_v = this.b;
            if(v3 >= arr_v.length) {
                Object[] arr_object1 = this.c;
                int v5 = 0;
                for(int v4 = 0; v4 < v3; ++v4) {
                    Object object1 = arr_object1[v4];
                    if(object1 != byj.a) {
                        if(v4 != v5) {
                            arr_v[v5] = arr_v[v4];
                            arr_object1[v5] = object1;
                            arr_object1[v4] = null;
                        }
                        ++v5;
                    }
                }
                this.a = false;
                this.d = v5;
                v2 = ~caa.b(this.b, v5, v);
            }
        }
        int v6 = this.d;
        long[] arr_v1 = this.b;
        if(v6 >= arr_v1.length) {
            int v7 = caa.e(v6 + 1);
            long[] arr_v2 = Arrays.copyOf(arr_v1, v7);
            ibuq.e(arr_v2, "copyOf(...)");
            this.b = arr_v2;
            Object[] arr_object2 = Arrays.copyOf(this.c, v7);
            ibuq.e(arr_object2, "copyOf(...)");
            this.c = arr_object2;
        }
        int v8 = this.d;
        if(v8 - v2 != 0) {
            ibpg.ab(this.b, this.b, v2 + 1, v2, v8);
            ibpg.ac(this.c, this.c, v2 + 1, v2, this.d);
        }
        this.b[v2] = v;
        this.c[v2] = object0;
        ++this.d;
    }

    public final void i(long v) {
        int v1 = caa.b(this.b, this.d, v);
        if(v1 >= 0) {
            Object[] arr_object = this.c;
            Object object0 = byj.a;
            if(arr_object[v1] != object0) {
                arr_object[v1] = object0;
                this.a = true;
            }
        }
    }

    public final boolean j(long v) {
        return this.a(v) >= 0;
    }

    public final boolean k() {
        return this.b() == 0;
    }

    @Override
    public final String toString() {
        if(this.b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.d * 28);
        stringBuilder0.append('{');
        int v = this.d;
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(this.c(v1));
            stringBuilder0.append('=');
            Object object0 = this.f(v1);
            if(object0 == stringBuilder0) {
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


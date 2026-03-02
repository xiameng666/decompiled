public final class bzu {
    public static final Object a;

    static {
        bzu.a = new Object();
    }

    public static final Object a(bzt bzt0, int v) {
        int v1 = caa.a(bzt0.b, bzt0.d, v);
        if(v1 >= 0) {
            Object object0 = bzt0.c[v1];
            return object0 == bzu.a ? null : object0;
        }
        return null;
    }

    public static final void b(bzt bzt0, int v) {
        int v1 = caa.a(bzt0.b, bzt0.d, v);
        if(v1 >= 0) {
            Object[] arr_object = bzt0.c;
            Object object0 = bzu.a;
            if(arr_object[v1] != object0) {
                arr_object[v1] = object0;
                bzt0.a = true;
            }
        }
    }

    public static final void c(bzt bzt0) {
        int v = bzt0.d;
        int[] arr_v = bzt0.b;
        Object[] arr_object = bzt0.c;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            if(object0 != bzu.a) {
                if(v1 != v2) {
                    arr_v[v2] = arr_v[v1];
                    arr_object[v2] = object0;
                    arr_object[v1] = null;
                }
                ++v2;
            }
        }
        bzt0.a = false;
        bzt0.d = v2;
    }
}


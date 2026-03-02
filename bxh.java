public final class bxh {
    public Object[] a;
    public int b;
    public int c;
    public int d;

    public bxh() {
        this(8);
    }

    public bxh(int v) {
        if(Integer.bitCount(v) != 1) {
            int v1 = Integer.highestOneBit(v - 1);
            v = v1 + v1;
        }
        this.d = v - 1;
        this.a = new Object[v];
    }

    public final int a() {
        return this.d & this.c - this.b;
    }

    public final Object b(int v) {
        if(v < 0 || v >= this.a()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object object0 = this.a[this.d & this.b + v];
        ibuq.c(object0);
        return object0;
    }

    public final Object c() {
        int v = this.b;
        if(v == this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object[] arr_object = this.a;
        Object object0 = arr_object[v];
        arr_object[v] = null;
        this.b = v + 1 & this.d;
        return object0;
    }

    public final void d(Object object0) {
        int v = this.b - 1 & this.d;
        this.b = v;
        this.a[v] = object0;
        if(v == this.c) {
            this.e();
        }
    }

    public final void e() {
        Object[] arr_object = this.a;
        int v = this.b;
        int v1 = arr_object.length - v;
        int v2 = arr_object.length + arr_object.length;
        if(v2 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        Object[] arr_object1 = new Object[v2];
        ibpg.ac(arr_object, arr_object1, 0, v, arr_object.length);
        ibpg.ac(this.a, arr_object1, v1, 0, this.b);
        this.a = arr_object1;
        this.b = 0;
        this.c = arr_object.length;
        this.d = v2 - 1;
    }

    public final void f() {
        int v = this.c;
        if(this.b == v) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int v1 = this.d & v - 1;
        Object[] arr_object = this.a;
        Object object0 = arr_object[v1];
        arr_object[v1] = null;
        this.c = v1;
    }
}


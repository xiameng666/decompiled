final class jre {
    public final Object[] a;
    public int b;

    public jre() {
        this.a = new Object[0x100];
    }

    public final Object a() {
        int v = this.b;
        if(v > 0) {
            Object object0 = this.a[v - 1];
            this.a[v - 1] = null;
            this.b = v - 1;
            return object0;
        }
        return null;
    }

    public final void b(Object object0) {
        int v = this.b;
        if(v < 0x100) {
            this.a[v] = object0;
            this.b = v + 1;
        }
    }
}


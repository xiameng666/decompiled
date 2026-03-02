public final class ehhm {
    public Object a;
    private Object b;

    public final ehhn a() {
        Object object0 = this.b;
        if(object0 != null) {
            return new ehhn(object0, this.a);
        }
        throw new IllegalStateException("Missing required properties: apiEntry");
    }

    public final void b(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("Null apiEntry");
        }
        this.b = object0;
    }
}


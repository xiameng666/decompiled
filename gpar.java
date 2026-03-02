public final class gpar implements gpew {
    private static final Object a;
    private volatile Object b;
    private volatile gpew c;

    static {
        gpar.a = new Object();
    }

    public gpar(gpew gpew0) {
        this.b = gpar.a;
        this.c = gpew0;
    }

    @Override  // gpew
    public final Object a() {
        Object object2;
        Object object0 = this.b;
        Object object1 = gpar.a;
        if(object0 == object1) {
            synchronized(this) {
                object2 = this.b;
                if(object2 == object1) {
                    object2 = this.c.a();
                    this.b = object2;
                    this.c = null;
                }
            }
            return object2;
        }
        return object0;
    }
}


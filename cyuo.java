public final class cyuo implements gfsi {
    public final long a;

    public cyuo(long v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        for(Object object1: ((cyez)object0).b) {
            Object object2 = (cyex)object1;
            if(this.a == object2.c) {
                return object2;
            }
        }
        return cyex.a;
    }
}


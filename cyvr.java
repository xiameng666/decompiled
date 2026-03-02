public final class cyvr implements gfsi {
    public final String a;

    public cyvr(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        for(Object object1: ((cyxt)object0).c) {
            Object object2 = (cyxs)object1;
            if(this.a.equals(object2.d)) {
                return object2;
            }
        }
        return cyxs.b;
    }
}


public final class fogp implements gfsi {
    public final String a;

    public fogp(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        int v = ((gged_interceptors)object0).size();
        int v1 = 0;
        while(v1 < v) {
            Object object1 = (foec)((gged_interceptors)object0).get(v1);
            ++v1;
            if(this.a.equals(object1.a)) {
                return object1;
            }
        }
        return null;
    }
}


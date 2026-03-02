public final class cyrj implements gfsi {
    public final String a;

    public cyrj(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        for(Object object1: ((cyjs)object0).b) {
            cyjq cyjq0 = (cyjq)object1;
            if(cyjq0.c.equals(this.a)) {
                return gfsx.m(cyjq0);
            }
        }
        return gfqx.a;
    }
}


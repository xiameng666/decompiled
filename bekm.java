public final class bekm implements ibth {
    public final lqd a;
    public final lqd b;
    public final lqd c;
    public final lqd d;
    public final lqd e;
    public final lqh f;

    public bekm(lqd lqd0, lqd lqd1, lqd lqd2, lqd lqd3, lqd lqd4, lqh lqh0) {
        this.a = lqd0;
        this.b = lqd1;
        this.c = lqd2;
        this.d = lqd3;
        this.e = lqd4;
        this.f = lqh0;
    }

    @Override  // ibth
    public final Object a() {
        Boolean boolean0 = (Boolean)this.a.ij();
        if(boolean0 != null) {
            boolean z = boolean0.booleanValue();
            String s = (String)this.b.ij();
            if(s == null) {
                return ibom.a;
            }
            String s1 = (String)this.c.ij();
            if(s1 == null) {
                return ibom.a;
            }
            Boolean boolean1 = (Boolean)this.d.ij();
            if(boolean1 != null) {
                bekq bekq0 = (bekq)this.e.ij();
                boolean z1 = !z && s.length() != 0 && s1.length() <= 1000 && !boolean1.booleanValue() && bekq0 == null;
                this.f.l(Boolean.valueOf(z1));
                return ibom.a;
            }
            return ibom.a;
        }
        return ibom.a;
    }
}


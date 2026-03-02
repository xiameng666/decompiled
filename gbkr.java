public final class gbkr implements gbkj {
    public final omn a;
    public final oko b;

    public gbkr(omn omn0) {
        this.a = omn0;
        this.b = new gbkp(this);
        new gbkq(this);
    }

    @Override  // gbkj
    public final Object a(String s, ibrl ibrl0) {
        gbkm gbkm0 = new gbkm(s);
        return oqj.d(this.a, true, false, gbkm0, ibrl0);
    }

    @Override  // gbkj
    public final Object b(gbks[] arr_gbks, ibrl ibrl0) {
        arr_gbks.getClass();
        gbkl gbkl0 = new gbkl(this, arr_gbks);
        return oqj.d(this.a, false, true, gbkl0, ibrl0);
    }
}


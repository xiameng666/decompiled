public final class bxqj implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        kli kli0 = new kli(((aztb)object0).getMessage());
        if(((aztb)object0).b() == 16) {
            kli0 = new klb(((aztb)object0).getMessage());
        }
        else {
            Integer integer0 = ((aztb)object0).b();
            if(bxql.a.contains(integer0)) {
                kli0 = new klf(((aztb)object0).getMessage());
            }
        }
        bxpz bxpz0 = new bxpz();
        bxpz0.c = kli0;
        return new ggoh(bxpz0.a());
    }
}


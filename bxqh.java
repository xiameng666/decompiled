public final class bxqh implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        klq klq0 = new klq(((aztb)object0).getMessage());
        if(((aztb)object0).b() == 16) {
            klq0 = new klk(((aztb)object0).getMessage());
        }
        else {
            Integer integer0 = ((aztb)object0).b();
            if(bxql.a.contains(integer0)) {
                klq0 = new klo(((aztb)object0).getMessage());
            }
        }
        bxqb bxqb0 = new bxqb();
        bxqb0.c = klq0;
        return new ggoh(bxqb0.a());
    }
}


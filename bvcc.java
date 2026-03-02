public final class bvcc implements ibts {
    public final gtl a;

    public bvcc(gtl gtl0) {
        this.a = gtl0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((hzk)object0), "coordinates");
        long v = ((hzk)object0).g() & 0xFFFFFFFFL;
        gtl gtl0 = this.a;
        if(((int)v) > gtl0.e()) {
            gtl0.i(((int)v));
        }
        return ibom.a;
    }
}


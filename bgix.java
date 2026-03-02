public final class bgix implements gfsi {
    public final ggeo a;

    public bgix(ggeo ggeo0) {
        this.a = ggeo0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ggdy ggdy0 = new ggdy();
        ggqj ggqj0 = ((grbp)object0).a.om();
        while(ggqj0.hasNext()) {
            ggeo ggeo0 = this.a;
            Object object1 = ggqj0.next();
            gqmd gqmd0 = (gqmd)object1;
            if(ggeo0.containsKey(gqmd0)) {
                ggdy0.i(new bedh(gqmd0, ((hhyo)ggeo0.get(gqmd0))));
            }
            else {
                ((ggtj)bgiy.a.j()).x("Reuse check returned unknown credential group.");
            }
        }
        return new bgiw(ggdy0.h(), ggna.a);
    }
}


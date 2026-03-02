public final class ibro implements ibtw {
    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibuq.f(((ibrt)object0), "acc");
        ibuq.f(((ibrr)object1), "element");
        ibrt ibrt0 = ((ibrt)object0).minusKey(((ibrr)object1).getKey());
        ibru ibru0 = ibru.a;
        if(ibrt0 != ibru0) {
            ibrm ibrm0 = ibrn.k;
            ibrn ibrn0 = (ibrn)ibrt0.get(ibrm0);
            if(ibrn0 == null) {
                return new ibrk(ibrt0, ((ibrr)object1));
            }
            ibrt ibrt1 = ibrt0.minusKey(ibrm0);
            return ibrt1 == ibru0 ? new ibrk(((ibrr)object1), ibrn0) : new ibrk(new ibrk(ibrt1, ((ibrr)object1)), ibrn0);
        }
        return (ibrr)object1;
    }
}


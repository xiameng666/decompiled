public final class buzg implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ccoi)object0), "$this$getDirection");
        ccnv ccnv0 = ((ccoi)object0).d;
        if(ccnv0 == null) {
            ccnv0 = ccnv.a;
        }
        boolean z = false;
        if(ccnv0.c) {
            ccnv ccnv1 = ((ccoi)object0).d;
            if(ccnv1 == null) {
                ccnv1 = ccnv.a;
            }
            if((ccnu.b(ccnv1.b) == null ? ccnu.f : ccnu.b(ccnv1.b)) == ccnu.e) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}


public final class acul implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        if(!(((clcp)object0) instanceof cldc)) {
            throw new gfuz("Returned future should be ProtoUrlResponse but not.");
        }
        if(hoxf.p()) {
            clcq clcq0 = ((cldc)(((clcp)object0))).a;
            if(clcq0.a() != 200) {
                ((ggtj)acup.a.h()).z("Response failed with status code %d", clcq0.a());
                throw new clbw("Response failed with status code: " + clcq0.a(), gfsx.l(clcq0));
            }
        }
        return ((cldc)(((clcp)object0))).b;
    }
}


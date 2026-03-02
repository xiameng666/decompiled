public final class gpms implements ibtw {
    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        gged_interceptors gged0;
        Object object2;
        ibuq.f(((hfrh)object0), "$this$metadata");
        ibuq.f(((iaoa)object1), "it");
        gftb.check(((iaoa)object1));
        iaof_metadata iaof0 = ((hfrh)object0).c;
        if(iaof0 == null) {
            object2 = ggna.a;
        }
        else {
            synchronized(iaof0) {
                Iterable iterable0 = iaof0.b(((iaoa)object1));
                gged0 = iterable0 == null ? ggna.a : gged_interceptors.h(iterable0);
            }
            object2 = gged0;
        }
        ibuq.e(object2, "trailers(...)");
        return object2;
    }
}


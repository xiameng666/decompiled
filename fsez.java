public final class fsez implements fsgd {
    @Override  // fsgd
    public final Object a(fsgk fsgk0) {
        ibuq.f(fsgk0, "response");
        if((fsgk0 instanceof fsgi)) {
            return ((fsgi)fsgk0).a;
        }
        if((fsgk0 instanceof fsgj)) {
            throw new fsev(fseh.a, "JsonResponse is expected");
        }
        if((fsgk0 instanceof fsgh)) {
            throw fsgr.e(((fsgh)fsgk0).a);
        }
        throw new ibnq();
    }
}


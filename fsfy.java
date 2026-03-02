public final class fsfy implements fsgd {
    @Override  // fsgd
    public final Object a(fsgk fsgk0) {
        ibuq.f(fsgk0, "response");
        if((fsgk0 instanceof fsgi)) {
            throw new fsev(fseh.a, "PendingIntentResponse is expected");
        }
        if((fsgk0 instanceof fsgj)) {
            return ((fsgj)fsgk0).a;
        }
        if((fsgk0 instanceof fsgh)) {
            throw fsgr.e(((fsgh)fsgk0).a);
        }
        throw new ibnq();
    }
}


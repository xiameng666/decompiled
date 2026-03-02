final class dfpu extends ibuo implements ibtw {
    public static final dfpu a;

    static {
        dfpu.a = new dfpu();
    }

    public dfpu() {
        super(2, dfot.class, "visibilityReducer", "visibilityReducer(Lcom/google/android/gms/nearby/sharing/main/visibility/VisibilityState;Lcom/google/android/gms/nearby/sharing/main/visibility/VisibilityEvent;)Lcom/google/android/gms/nearby/sharing/main/visibility/VisibilityState;", 1);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibuq.f(((dfqp)object0), "p0");
        ibuq.f(((dfoo)object1), "p1");
        ibuq.f(((dfqp)object0), "state");
        ibuq.f(((dfoo)object1), "event");
        if((((dfoo)object1) instanceof dfoj)) {
            return dfqp.a(((dfqp)object0), new dfog(((dfoj)(((dfoo)object1))).a), null, null, null, false, false, 62);
        }
        if((((dfoo)object1) instanceof dfol)) {
            return dfqp.a(((dfqp)object0), null, new dfog(((int)((dfol)(((dfoo)object1))).a.f)), new dfog(Boolean.valueOf(((dfol)(((dfoo)object1))).a.j)), null, false, false, 57);
        }
        if((((dfoo)object1) instanceof dfok)) {
            return dfqp.a(((dfqp)object0), null, null, null, new dfog(Boolean.valueOf(((dfok)(((dfoo)object1))).a)), false, false, 55);
        }
        if((((dfoo)object1) instanceof dfom)) {
            return dfqp.a(((dfqp)object0), null, null, null, null, false, true, 15);
        }
        if((((dfoo)object1) instanceof dfoi)) {
            return dfqp.a(((dfqp)object0), null, null, null, null, true, false, 0x2F);
        }
        if((((dfoo)object1) instanceof dfon)) {
            return dfqp.a(((dfqp)object0), null, null, null, null, false, false, 0x2F);
        }
        throw new ibnq();
    }
}


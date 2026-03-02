final class sbs implements icih {
    final ryh a;
    final icih b;

    public sbs(ryh ryh0, icih icih0) {
        this.a = ryh0;
        this.b = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        sct.c("OnboardingTaskServiceServer", "Emitting state change for node " + rqy.a(this.a) + ": " + ((rxv)object0));
        rxv rxv0 = ((rxv)object0).k(this.a);
        Object object1 = this.b.a(rxv0, ibrl0);
        return object1 == ibrx.a ? object1 : ibom.a;
    }
}


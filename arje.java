import j..util.Objects;

final class arje extends arkp {
    final arjh a;

    public arje(arjh arjh0, arin arin0, hkyj hkyj0) {
        Objects.requireNonNull(arjh0);
        this.a = arjh0;
        super(arin0, hkyj0);
    }

    @Override  // arkq
    protected final void d() {
        arjh.p.m("ContinuousStreamingEvent stream expectation failed.", new Object[0]);
        this.a.l(2, "ContinuousStreamingRequest stream expectation failed.", false);
    }

    @Override  // arkp
    protected final MessageLite e(byte[] arr_b) {
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)asbg.a), arr_b, 0, arr_b.length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        return (asbg)hftv0;
    }

    @Override  // arkp
    protected final void f(MessageLite hfvm0) {
        this.a.z.a(((asbg)hfvm0));
    }
}


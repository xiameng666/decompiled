import j..util.Objects;

final class arja extends arkp {
    final arjh a;

    public arja(arjh arjh0, arin arin0, hkyj hkyj0) {
        Objects.requireNonNull(arjh0);
        this.a = arjh0;
        super(arin0, hkyj0);
    }

    @Override  // arkq
    protected final void d() {
        arjh.p.m("SummaryRequest stream expectation failed.", new Object[0]);
        this.a.l(2, "SummaryRequest stream expectation failed.", false);
    }

    @Override  // arkp
    protected final MessageLite e(byte[] arr_b) {
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)asbl.a), arr_b, 0, arr_b.length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        return (asbl)hftv0;
    }

    @Override  // arkp
    protected final void f(MessageLite hfvm0) {
        if(hqhq.B()) {
            ariz ariz0 = new ariz(this, ((asbl)hfvm0));
            this.a.x.execute(ariz0);
            return;
        }
        this.a.s(((asbl)hfvm0));
    }
}


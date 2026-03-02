import j..util.DesugarCollections;

public final class cyva implements kba {
    public final ProtoLiteBuilder a;

    public cyva(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // kba
    public final Object a() {
        return DesugarCollections.unmodifiableList(((cyxn)this.a.b_message).c);
    }
}


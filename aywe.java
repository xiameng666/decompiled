public final class aywe implements gfsi {
    public final aywf a;
    public final aywa b;

    public aywe(aywf aywf0, aywa aywa0) {
        this.a = aywf0;
        this.b = aywa0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ayvz)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ayvz)object0))));
        String s = this.a.a.a;
        s.getClass();
        aywa aywa0 = this.b;
        aywa0.getClass();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ayvz)hftp0.b_message).b().put(s, aywa0);
        return (ayvz)hftp0.N_build();
    }
}


public final class fkxg implements ibts {
    public final fkys a;
    public final fkvu b;

    public fkxg(fkys fkys0, fkvu fkvu0) {
        this.a = fkys0;
        this.b = fkvu0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        gssu gssu0 = (gssu)((ProtoLiteMessage)gssv.a).v_newBuilder();
        gstw gstw0 = ((gsuo)object0).d;
        if(gstw0 == null) {
            gstw0 = gstw.a;
        }
        gssu0.a(gstw0);
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)gssu0).N_build();
        ibuq.e(hftv0, "build(...)");
        return gdtf.j(this.a.c(this.b, ((gssv)hftv0)), new fkww(new fkwv(((gssv)hftv0), ((gsuo)object0))), gmap.a);
    }
}


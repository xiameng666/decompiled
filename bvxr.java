public final class bvxr implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        int v = ((hgmq)object0).e;
        if(hgmp.a(v) == hgmp.a) {
            ibuq.c(((hgmq)object0));
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hgmq)object0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((hgmq)object0))));
            ibuq.f(hftp0, "builder");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hgmq)hftp0.b_message).g = "id/container";
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            return (hgmq)hftv0;
        }
        ((ggtj)bvxt.a.j()).B("Failed binding ListContainerElement - all children must be containers! type \'%s\' is invalid.", hgmp.a(v).name());
        return null;
    }
}


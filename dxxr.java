public final class dxxr implements ibts {
    public final boolean a;

    public dxxr(boolean z) {
        this.a = z;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((dltz)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dltz)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dltz)object0))));
        dlub dlub0 = dlua.a(hftp0);
        ProtoLiteBuilder hftp1 = dlub0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((dltz)hftp1.b_message).b = this.a;
        return dlub0.a();
    }
}


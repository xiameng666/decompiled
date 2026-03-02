public final class ctyf implements ibts {
    public final ctyp a;

    public ctyf(ctyp ctyp0) {
        this.a = ctyp0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        byte[] arr_b = (byte[])object0;
        ibuq.f(arr_b, "bytes");
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ctys.a), arr_b, 0, arr_b.length, hftc.a);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ctys ctys0 = (ctys)hftv0;
        ibuq.e(ctys0, "parseFrom(...)");
        return new ctyl(this.a.d(ctys0));
    }
}


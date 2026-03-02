public final class ctyg implements ibts {
    public final ctyp a;

    public ctyg(ctyp ctyp0) {
        this.a = ctyp0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        byte[] arr_b = (byte[])object0;
        ibuq.f(arr_b, "bytes");
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ctyy.a), arr_b, 0, arr_b.length, hftc.a);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ctyy ctyy0 = (ctyy)hftv0;
        ibuq.e(ctyy0, "parseFrom(...)");
        return new ctyo(this.a.e(ctyy0));
    }
}


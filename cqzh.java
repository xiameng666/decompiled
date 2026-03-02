public final class cqzh implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        byte[] arr_b = (byte[])object0;
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gtxe.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return gfsx.m(((gtxe)hftv0));
        }
        catch(hfur unused_ex) {
            return gfqx.a;
        }
    }
}


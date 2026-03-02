public final class flho implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        byte[] arr_b = (byte[])object0;
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hfrn.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (hfrn)hftv0;
        }
        catch(hfur hfur0) {
            flbj.d("LiMsgController", "Failed to parse intentMetaData", hfur0);
            return hfrn.a;
        }
    }
}


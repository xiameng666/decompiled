public final class fcmg implements evqk {
    @Override  // evqk
    public final evql a(Object object0) {
        byte[] arr_b = (byte[])object0;
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ffbp.a), arr_b, 0, arr_b.length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ffbp ffbp0 = (ffbp)hftv0;
        fcmj.a.j("restore_ongoing response: %b", new Object[]{Boolean.valueOf(ffbp0.c)});
        return evrg.d(Boolean.valueOf(ffbp0.c));
    }
}


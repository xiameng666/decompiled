public final class fckf implements evpo {
    @Override  // evpo
    public final Object a(evql evql0) {
        byte[] arr_b = (byte[])evql0.j();
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ffbt.a), arr_b, 0, arr_b.length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        return (ffbt)hftv0;
    }
}


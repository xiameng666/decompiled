public final class etmd implements evpo {
    public final dyfv a;
    public final azts b;

    public etmd(azts azts0, dyfv dyfv0) {
        this.b = azts0;
        this.a = dyfv0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(evql0.n()) {
            byte[] arr_b = (byte[])evql0.j();
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hjqi.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            hjqd hjqd0 = ((hjqi)hftv0).i;
            if(hjqd0 == null) {
                hjqd0 = hjqd.a;
            }
            if(hjqd0.b) {
                byte[] arr_b1 = this.a.toBytesArray();
                return this.b.ba(arr_b1);
            }
        }
        return evql0;
    }
}


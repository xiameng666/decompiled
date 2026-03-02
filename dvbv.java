public final class dvbv implements evqf {
    public final dvcl a;

    public dvbv(dvcl dvcl0) {
        this.a = dvcl0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        dvcl dvcl0 = this.a;
        byte[] arr_b = (byte[])object0;
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ftcg.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            dvcl0.H(dvcl0.ap, (((ftcg)hftv0).b == 2 ? ((ftjh)((ftcg)hftv0).c) : ftjh.a).b, true);
        }
        catch(hfur hfur0) {
            a.ae(dvcl.a.j(), "Failed to parse activity history response", hfur0);
            dvcl0.ar();
        }
    }
}


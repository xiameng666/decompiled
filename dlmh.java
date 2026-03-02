public final class dlmh implements evpo {
    @Override  // evpo
    public final Object a(evql evql0) {
        if(!evql0.n()) {
            return evrg.d(Boolean.valueOf(false));
        }
        Object object0 = evql0.j();
        ibuq.e(object0, "getResult(...)");
        byte[] arr_b = (byte[])object0;
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ftjr.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ibuq.e(((ftjr)hftv0), "parseFrom(...)");
            if(((ftjr)hftv0).b == 10) {
                return evrg.d(Boolean.valueOf(((ftbq)((ftjr)hftv0).c).c));
            }
        }
        catch(hfur hfur0) {
            a.ae(dlmi.a.j(), "Unable to parse scan to add capability response", hfur0);
            return evrg.d(Boolean.valueOf(false));
        }
        return evrg.d(Boolean.valueOf(false));
    }
}


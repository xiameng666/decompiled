public final class fcjb implements evqk {
    @Override  // evqk
    public final evql a(Object object0) {
        byte[] arr_b = (byte[])object0;
        Boolean boolean0 = Boolean.valueOf(false);
        if(arr_b == null) {
            fcji.a.h("backup_supported response is null", new Object[0]);
            return evrg.d(boolean0);
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fexv.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            fcji.a.j("backup_supported response: %b", new Object[]{Boolean.valueOf(((fexv)hftv0).c)});
            return evrg.d(Boolean.valueOf(((fexv)hftv0).c));
        }
        catch(hfur hfur0) {
            fcji.a.i("Failed to parse backup_supported response", hfur0, new Object[0]);
            return evrg.d(boolean0);
        }
    }
}


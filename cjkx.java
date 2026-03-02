public final class cjkx implements evpo {
    @Override  // evpo
    public final Object a(evql evql0) {
        gfnu gfnu0;
        boolean z = false;
        if(evql0.n()) {
            byte[] arr_b = (byte[])evql0.j();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gfnx.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            if(((gfnx)hftv0).b == 1) {
                gfnu0 = gfnu.b(((Integer)((gfnx)hftv0).c).intValue());
                if(gfnu0 == null) {
                    gfnu0 = gfnu.d;
                }
            }
            else {
                gfnu0 = gfnu.a;
            }
            ibuq.e(gfnu0, "getGetGw4NotificationDelegationStateResponse(...)");
            if(gfnu0 == gfnu.c) {
                z = true;
            }
            return evrg.d(Boolean.valueOf(z));
        }
        return evrg.d(Boolean.valueOf(false));
    }
}


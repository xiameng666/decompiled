public final class cjku implements evpo {
    public final cjkv a;
    public final gjdg b;

    public cjku(cjkv cjkv0, gjdg gjdg0) {
        this.a = cjkv0;
        this.b = gjdg0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        fsxj fsxj0;
        cjkv cjkv0 = this.a;
        gjdg gjdg0 = this.b;
        Boolean boolean0 = Boolean.valueOf(false);
        if(!evql0.n()) {
            ((ggsc)((ggsc)cjkv0.b.j()).s(evql0.i()).ar(6118)).x("Failed to check governance");
            cjkv0.a(gjdg0, "GOVERNANCE_CHECK_ERROR");
            return evrg.d(boolean0);
        }
        try {
            byte[] arr_b = (byte[])evql0.j();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fsxk.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ibuq.e(((fsxk)hftv0), "parseFrom(...)");
            int v = ((fsxk)hftv0).c;
            switch(v) {
                case 0: {
                    fsxj0 = fsxj.a;
                    break;
                }
                case 1: {
                    fsxj0 = fsxj.b;
                    break;
                }
                default: {
                    fsxj0 = v == 2 ? fsxj.c : null;
                }
            }
            if(fsxj0 == null) {
                fsxj0 = fsxj.d;
            }
            if(fsxj0 == fsxj.c) {
                String s = ((fsxk)hftv0).d;
                ibuq.e(s, "getSuppressionReason(...)");
                cjkv0.a(gjdg0, s);
                return evrg.d(boolean0);
            }
            return evrg.d(Boolean.valueOf(true));
        }
        catch(hfur hfur0) {
            ((ggsc)((ggsc)cjkv0.b.j()).s(hfur0).ar(6117)).x("Failed to parse CheckNotificationGovernanceResponse");
            cjkv0.a(gjdg0, "GOVERNANCE_PARSE_RESPONSE_ERROR");
            return evrg.d(boolean0);
        }
    }
}


public final class aank implements lqj {
    public final aanp a;

    public aank(aanp aanp0) {
        this.a = aanp0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        int v3;
        zjo zjo0 = ((zjn)object0).b;
        int v = 0;
        int v1 = zjo0 == null || zjo0.d != 1 ? 0 : 1;
        int v2 = ((zjn)object0).c - 1;
        switch(v2) {
            case 0: {
                v3 = 1 == v1 ? 0x7F150203 : 0x7F150205;  // string:as_prompt_card_dismissed_snackbar "Suggestion dismissed"
                break;
            }
            case 1: {
                v3 = 1 == v1 ? 0x7F150202 : 0x7F150204;  // string:as_prompt_card_dismissed_error_snackbar "Couldn\'t dismiss suggestion"
                break;
            }
            default: {
                v3 = 0x7F1500FA;  // string:accountsettings_snackbar_error_no_connection "Can\'t connect to the internet"
            }
        }
        switch(v2) {
            case 0: {
                if(zjo0 != null && zjo0.d == 1) {
                    v = 0x7F1508FA;  // string:common_undo "Undo"
                }
                break;
            }
            case 1: {
                v = 0x7F1508C9;  // string:common_retry "Retry"
            }
        }
        aaci aaci0 = new aaci(v3, v, new aach(((zjn)object0), this.a.f));
        this.a.b(aaci0.a, aaci0.b, aaci0.c);
    }
}


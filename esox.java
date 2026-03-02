public final class esox implements evqf {
    public final espb a;

    public esox(espb espb0) {
        this.a = espb0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        boolean z1;
        byte[] arr_b = (byte[])object0;
        boolean z = false;
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hjqi.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            hjqm hjqm0 = ((hjqi)hftv0).g;
            if(hjqm0 == null) {
                hjqm0 = hjqm.a;
            }
            z1 = hjqm0.c;
        }
        catch(hfur hfur0) {
            a.ae(espb.a.i(), "Cannot get pay capabilities, assuming wallet is not active.", hfur0);
            z1 = false;
        }
        espb espb0 = this.a;
        bboh bboh0 = espb.a;
        ((ggtj)bboh0.h()).B("The wallet active status is: %s", Boolean.valueOf(z1));
        if(hwwq.l() && espb0.c.i()) {
            z = true;
        }
        ((ggtj)bboh0.h()).S("The device country is: %s, and Swan Lake is set to %b", espb0.c.c(), z);
        if(z1 && !z) {
            espb.d(espb0.b, "com.google.android.gms.tapandpay.globalactions.WalletQuickAccessWalletService");
            espb.c(espb0.b, "com.google.android.gms.tapandpay.globalactions.QuickAccessWalletService");
            return;
        }
        espb.d(espb0.b, "com.google.android.gms.tapandpay.globalactions.QuickAccessWalletService");
        espb.c(espb0.b, "com.google.android.gms.tapandpay.globalactions.WalletQuickAccessWalletService");
    }
}


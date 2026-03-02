import android.os.Bundle;

public final class dnfg extends lsb {
    public final frxj a;
    public final frxn b;
    public dxev c;
    public final fuho d;
    public final fryk e;
    public final ftuw f;
    public static final int g;
    private static final bboh h;
    private final Bundle i;

    static {
        dnfg.h = bboh.b("Pay", bbcu.cZ);
    }

    public dnfg(Bundle bundle0) {
        fryh fryh0;
        this.a = new frxj(Boolean.valueOf(false));
        this.b = new frxn();
        this.i = bundle0;
        try {
            byte[] arr_b = bundle0.getByteArray("PAYMENT_METHOD_DATA");
            if(arr_b == null) {
                throw new IllegalStateException("Required value was null.");
            }
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dxev.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ibuq.e(((dxev)hftv0), "parseFrom(...)");
            this.c = (dxev)hftv0;
        }
        catch(hfur hfur0) {
            a.ae(dnfg.h.j(), "FopCardJpTokenizeValuePropViewModel: failed to get payment method data.", hfur0);
            this.c = dxew.a(((ProtoLiteMessage)dxev.a).v_newBuilder()).a();
        }
        hkhr hkhr0 = this.c.c == null ? hkhr.b : this.c.c;
        hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
        ibuq.e(hkhh0, "getDeviceDetails(...)");
        String s = hkhh0.c;
        ibuq.e(s, "getCardArtFifeUrl(...)");
        fryj fryj0 = new fryj(s, null, null, null, 14);
        frxq frxq0 = (hkhh0.b & 1) == 0 ? new frxq(hll.b) : new frxp((hkhh0.f == null ? hkhd.a : hkhh0.f).b);
        this.d = new fuhm(new fugr(new fujl(fryj0, null, null, frxq0, false, new dnff(), false, 150)), new frys(0x7F151C51, new Object[]{this.b()}), new frys(0x7F151C50, new Object[]{this.b()}));  // string:pay_card_tokenize_value_prop_screen_title "Set up card to pay using %1$s"
        switch(this.c().ordinal()) {
            case 9: {
                fryh0 = new fryh(0x7F080FAA);  // drawable:tokenize_value_prop_nfcab
                break;
            }
            case 28: {
                fryh0 = new fryh(0x7F080FAB);  // drawable:tokenize_value_prop_quicpay
                break;
            }
            default: {
                fryh0 = new fryh(0);
            }
        }
        this.e = fryh0;
        dnfe dnfe0 = new dnfe(this);
        this.f = new ftuw(new ftts(new fryr(0x7F1521F2), null, false, ftvc.c, null, null, 0x41E95, null, null, dnfe0, 438), null, false, (hwev.c() ? ftvd.b : ftvd.a), null, (hwev.c() ? ftvb.c : ftvb.b), null, true, 86);  // string:pay_set_up "Set up"
    }

    public final void a(boolean z) {
        this.a.b(Boolean.valueOf(z));
    }

    private final fryv b() {
        switch(this.c().ordinal()) {
            case 9: {
                return new fryr(0x7F151E16);  // string:pay_fops_list_card_network_jcb "JCB"
            }
            case 28: {
                return new fryr(0x7F151E17);  // string:pay_fops_list_card_network_quicpay "QUICPay"
            }
            default: {
                return new fryu("");
            }
        }
    }

    private final hktu c() {
        hkhr hkhr0 = this.c.c == null ? hkhr.b : this.c.c;
        hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
        hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
        switch((hktu.b(hkir0.f) == null ? hktu.D : hktu.b(hkir0.f)).ordinal()) {
            case 9: {
                return hktu.C;
            }
            case 28: {
                return hktu.j;
            }
            default: {
                return hktu.a;
            }
        }
    }
}


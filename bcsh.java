import android.content.Context;

public final class bcsh {
    private static final baun a;
    private final bbxx b;
    private final Context c;

    static {
        bcsh.a = bcrh.a("verification factory");
    }

    public bcsh(bbxx bbxx0, Context context0) {
        this.b = bbxx0;
        this.c = context0;
    }

    public final bcsg a(bcrd bcrd0, hofs hofs0, bcse bcse0, bcrr bcrr0) {
        String s;
        baun baun0 = bcsh.a;
        baun0.j("get verifier for verification " + hofs0, new Object[0]);
        try {
            bcrg.e();
            if(!bcrg.c(hofs0)) {
                baun0.f("Not a pending verification.", new Object[0]);
                throw new bcrc("Not a pending verification", gmfx.aA, false);
            }
            hoer hoer0 = hofs0.c == 4 ? ((hoer)hofs0.d) : hoer.a;
            hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
            switch((hobl.b(hobj0.f) == null ? hobl.i : hobl.b(hobj0.f)).ordinal()) {
                case 1: {
                    break;
                }
                case 2: {
                    s = "inbound_message_verifier";
                    goto label_24;
                }
                case 3: {
                    s = "carrier_id";
                    goto label_24;
                }
                case 5: {
                    s = "registered_sms";
                    goto label_24;
                }
                case 6: {
                    s = "flash_call_verifier";
                    goto label_24;
                }
                case 7: {
                    goto label_23;
                }
                default: {
                    s = "unknown";
                    goto label_24;
                }
            }
        }
        catch(bcrc bcrc0) {
            throw new IllegalArgumentException(bcrc0);
        }
        s = "outbound_message_verifier";
        goto label_24;
    label_23:
        s = "ts43_verifier";
    label_24:
        switch(s) {
            case "carrier_id": {
                if(hrfm.f()) {
                    hoer hoer1 = hofs0.c == 4 ? ((hoer)hofs0.d) : hoer.a;
                    if((hoer1.c == null ? hobj.a : hoer1.c).c == 12) {
                        baun0.h("Doing Carrier ID TS43 Client verification", new Object[0]);
                        return new bcrn(hofs0, this.b, bcrd0, this.c);
                    }
                }
                baun0.h("Doing Carrier ID verification", new Object[0]);
                return new bcro(hofs0, this.b, bcrd0);
            }
            case "flash_call_verifier": {
                baun0.h("Doing Flash Call verification", new Object[0]);
                return new bcrv(hofs0, this.b, bcrd0, bcrr0);
            }
            case "inbound_message_verifier": {
                baun0.h("Doing MT verification", new Object[0]);
                return new bcsa(hofs0, this.b, bcrd0, bcse0);
            }
            case "outbound_message_verifier": {
                baun0.h("Doing MO verification", new Object[0]);
                return new bcrx(hofs0, this.b, bcrd0);
            }
            case "registered_sms": {
                baun0.h("Doing Registered SMS verification", new Object[0]);
                return new bcsc(hofs0, this.b, bcrd0);
            }
            case "ts43_verifier": {
                if(!hrfm.f()) {
                    throw new IllegalArgumentException();
                }
                baun0.h("Doing TS43 verification", new Object[0]);
                return new bcrn(hofs0, this.b, bcrd0, this.c);
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }
}


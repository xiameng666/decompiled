import com.google.android.gms.common.api.Status;

public final class crxw {
    private static final bboh a;

    static {
        crxw.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public static Status a(iapl iapl0) {
        bcnm.i(cslm.h(), "Parsing GTAF status exception.", iapl0, crxw.a);
        iapk iapk0 = iapl0.a;
        if(iapk0 != null) {
            String s = iapk0.toString() + "; RPC to GTAF failed";
            switch(iapk0.t.ordinal()) {
                case 1: {
                    return new Status(27031, s);
                }
                case 2: {
                    return new Status(27032, s);
                }
                case 3: {
                    return new Status(27033, s);
                }
                case 4: {
                    return new Status(27034, s);
                }
                case 5: {
                    return new Status(27002, s);
                }
                case 6: {
                    return new Status(27036, s);
                }
                case 8: {
                    return new Status(27012, s);
                }
                case 9: {
                    return new Status(27030, s);
                }
                case 10: {
                    return new Status(0x699F, s);
                }
                case 11: {
                    return new Status(27017, s);
                }
                case 12: {
                    return new Status(27040, s);
                }
                case 13: {
                    return new Status(27041, s);
                }
                case 14: {
                    return new Status(27022, s);
                }
                case 15: {
                    return new Status(27042, s);
                }
                case 16: {
                    return new Status(27038, s);
                }
                default: {
                    return new Status(27043, "Unhandled RPC Failure: " + s);
                }
            }
        }
        return new Status(27011, "Calling GTAF failed.");
    }
}


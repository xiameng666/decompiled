public final class eikt implements eikj {
    public final omn a;
    public final oko b;
    public final okn c;

    public eikt(omn omn0) {
        this.a = omn0;
        this.b = new eikr(this);
        this.c = new eiks(this);
    }

    @Override  // eikj
    public final gmcd a() {
        eikl eikl0 = new eikl();
        return ooy.a(this.a, true, false, eikl0);
    }

    @Override  // eikj
    public final gmcd b(String s) {
        eikm eikm0 = new eikm(s);
        return ooy.a(this.a, true, false, eikm0);
    }

    @Override  // eikj
    public final void c(eiki[] arr_eiki) {
        eiko eiko0 = new eiko(this, arr_eiki);
        oqj.b(this.a, false, true, eiko0);
    }

    public static final String d(int v) {
        switch(v - 1) {
            case 0: {
                return "NONE";
            }
            case 1: {
                return "DETECTED";
            }
            case 2: {
                return "STAGED";
            }
            default: {
                return "SENT";
            }
        }
    }

    public static final int e(String s) {
        switch(s) {
            case "DETECTED": {
                return 2;
            }
            case "NONE": {
                return 1;
            }
            case "SENT": {
                return 4;
            }
            case "STAGED": {
                return 3;
            }
            default: {
                throw new IllegalArgumentException("Can\'t convert value to enum, unknown value: " + s);
            }
        }
    }
}


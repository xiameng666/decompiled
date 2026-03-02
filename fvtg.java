public final class fvtg extends fvua {
    public final int a;
    public final fvtm b;

    public fvtg(int v, fvui fvui0, int v1, long v2, fvtm fvtm0, boolean z) {
        super(fvui0, v1, v2, z);
        this.a = v;
        this.b = fvtm0;
    }

    public static void a(StringBuilder stringBuilder0, fvtg fvtg0) {
        String s;
        if(fvtg0 == null) {
            stringBuilder0.append("null");
            return;
        }
        stringBuilder0.append("CellLocatorResult [type=");
        switch(fvtg0.a) {
            case 1: {
                s = "CellPrimaryOnly";
                break;
            }
            case 2: {
                s = "CellFingerprint";
                break;
            }
            default: {
                s = "None";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", primary=");
        fvtm.k(stringBuilder0, fvtg0.b);
        stringBuilder0.append("], Cache={}, ");
        fvua.b(stringBuilder0, fvtg0);
        stringBuilder0.append("]");
    }

    @Override  // fvua
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        fvtg.a(stringBuilder0, this);
        return stringBuilder0.toString();
    }
}


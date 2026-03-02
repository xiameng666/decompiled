public class fvua {
    public final fvui c;
    public final long d;
    public final boolean e;
    public final int f;

    public fvua(fvui fvui0, int v, long v1, boolean z) {
        this.c = fvui0;
        this.f = v;
        this.d = v1;
        this.e = z;
        if((v == 1 ? 1 : 0) == (fvui0 == null ? 0 : 1)) {
            return;
        }
        throw new RuntimeException("Invalid Args");
    }

    public static void b(StringBuilder stringBuilder0, fvua fvua0) {
        String s;
        stringBuilder0.append("LocatorResult [position=");
        fvui fvui0 = fvua0.c;
        if(fvui0 == null) {
            stringBuilder0.append("null");
        }
        else {
            stringBuilder0.append(fvui0);
        }
        stringBuilder0.append(", status=");
        switch(fvua0.f) {
            case 1: {
                s = "OK";
                break;
            }
            case 2: {
                s = "NO_LOCATION";
                break;
            }
            case 3: {
                s = "GLS_ERROR";
                break;
            }
            default: {
                s = "EMPTY_SCAN";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", reportTime=");
        stringBuilder0.append(fvua0.d);
        stringBuilder0.append(", wantsGlsModels=");
        stringBuilder0.append(fvua0.e);
        stringBuilder0.append("]");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        fvua.b(stringBuilder0, this);
        return stringBuilder0.toString();
    }
}


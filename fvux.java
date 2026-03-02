import java.util.List;

public final class fvux extends fvua {
    public final int a;
    public final fvvj b;
    public final List g;

    public fvux(int v, long v1, fvvj fvvj0) {
        this(0, null, v, v1, fvvj0, false, null);
    }

    public fvux(int v, fvui fvui0, int v1, long v2, fvvj fvvj0, boolean z, List list0) {
        if(fvvj0 != null) {
            v2 = fvvj0.m();
        }
        super(fvui0, v1, v2, z);
        this.a = v;
        this.b = fvvj0;
        this.g = list0;
    }

    public static void a(StringBuilder stringBuilder0, fvux fvux0) {
        String s = "null";
        if(fvux0 == null) {
            stringBuilder0.append("null");
            return;
        }
        stringBuilder0.append("WifiLocatorResult [type=");
        stringBuilder0.append((fvux0.a == 5 ? "Frewle" : "UNKNOWN"));
        stringBuilder0.append(",wifiScan=");
        fvvj fvvj0 = fvux0.b;
        if(fvvj0 != null) {
            s = fvvj0.toString();
        }
        stringBuilder0.append(s);
        fvua.b(stringBuilder0, fvux0);
        stringBuilder0.append("]");
    }

    @Override  // fvua
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(200);
        fvux.a(stringBuilder0, this);
        return stringBuilder0.toString();
    }
}


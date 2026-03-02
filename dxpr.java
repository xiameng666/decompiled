import android.os.Bundle;

public final class dxpr extends lsb {
    public static final bboh a;
    public final frxj b;
    public final dycb c;
    public final gmcg d;
    public final String e;
    private final Bundle f;

    static {
        dxpr.a = bboh.b("Pay", bbcu.cZ);
    }

    public dxpr(dycb dycb0, gmcg gmcg0, Bundle bundle0) {
        this.b = new frxj(new dxpn(null));
        this.c = dycb0;
        this.d = gmcg0;
        this.f = bundle0;
        int v = bundle0.getInt("secure_element_service_provider");
        String s = bundle0.getString("emoney_service_provider_card_id");
        if(s == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.e = dypl.d(v).name() + s;
        icbb.b(lsc.a(this), null, null, new dxpo(this, null), 3);
    }

    public final void a(dxpn dxpn0) {
        this.b.b(dxpn0);
    }
}


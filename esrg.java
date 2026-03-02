import java.util.Set;
import org.json.JSONObject;

public final class esrg implements essj {
    public static final bboh a;
    private final esqg b;

    static {
        esrg.a = bboh.b("TapAndPay", bbcu.aM);
    }

    public esrg() {
        this.b = new esqg();
    }

    @Override  // essj
    public final esrz b(JSONObject jSONObject0, JSONObject jSONObject1) {
        return new esrd(jSONObject0);
    }

    @Override  // essj
    public final essa c(esrz esrz0, JSONObject jSONObject0, byte[] arr_b, essb essb0, Set set0) {
        gfmo gfmo0 = esrn.a(jSONObject0);
        return new esrf(((esrd)esrz0), gfmo0, new esrk(gfmo0), new esrb(this, essb0), this.b, set0);
    }

    @Override  // essj
    public final esse d(esrz esrz0, JSONObject jSONObject0, byte[] arr_b, essg essg0, essb essb0) {
        hmba hmba0;
        esrd esrd0 = (esrd)esrz0;
        gfmo gfmo0 = esrn.a(jSONObject0);
        esqx esqx0 = new esqx(gfmo0, esrd0.a);
        esqx0.c();
        esrk esrk0 = new esrk(gfmo0);
        esqz esqz0 = new esqz();
        try {
            esra esra0 = new esra(esrg.a);
            hmba0 = new hmba(esrd0.b, esqx0, esrk0, esqz0, esqz0, null, esqz0, esqz0, null, null, esra0);
        }
        catch(hmhv unused_ex) {
            throw new essd(2, "Invalid card profile");
        }
        esrj esrj0 = new esrj(essg0);
        try {
            return new esrc(hmba0.e(esrj0));
        }
        catch(hmhy unused_ex) {
            throw new essd(3, "Transaction declined");
        }
        catch(hmhv unused_ex) {
            throw new essd(2, "Invalid profile");
        }
        catch(IllegalArgumentException unused_ex) {
            throw new essd(1, "Invalid input");
        }
    }

    @Override  // essj
    public final String e() {
        return "unknown";
    }
}


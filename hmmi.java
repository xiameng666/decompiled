import org.json.JSONException;
import org.json.JSONObject;

public final class hmmi extends hmmo implements fsaq {
    private int c;
    private dqpp e;

    public hmmi() {
        this.c = 0;
    }

    @Override  // hmmo, fsay
    public final fsat b(String s, JSONObject jSONObject0, fsas fsas0, fsbc fsbc0, fsaw fsaw0) {
        hmmp hmmp0;
        hmnb hmnb0 = new hmnb(fsbc0);
        try {
            if(this.e == null) {
                throw new hmov("persistCardPayloadCallback not set.");
            }
            this.a = fsaw0;
            hmnp hmnp0 = new hmnp(new hmmn(fsas0), hmnb0);
            String s1 = jSONObject0.getString("type");
            if(jSONObject0.has("persistenceMode")) {
                int v = hmqh.b(jSONObject0.getString("persistenceMode"));
                this.c = v;
                if(v == 5) {
                    throw new hmov("Invalid persistenceMode received in cardPayload.");
                }
            }
            else {
                this.c = 5;
            }
            if(s1.startsWith("DESFire")) {
                hmmp0 = new hmmp(hmnp0, hmnb0, this, this, this.c, this);
                hmmp0.c(jSONObject0);
                return hmmp0;
            }
            if(!s1.startsWith("MIFAREPlus")) {
                throw new hmov("MIFARE CardPayload is invalid");
            }
            hmmp0 = new hmmq(hmnp0, hmnb0, this, this, this.c);
            hmmp0.c(jSONObject0);
            return hmmp0;
        }
        catch(hmou | JSONException exception0) {
            throw new hmov("Exception while initializing MIFARE Applet", exception0);
        }
    }

    @Override  // fsaq
    public final void c(dqpp dqpp0) {
        this.e = dqpp0;
    }

    public final void e(JSONObject jSONObject0) {
        boolean z = false;
        dqpp dqpp0 = this.e;
        if(dqpp0 != null) {
            if(this.c == 2) {
                z = true;
            }
            dqpp0.a(jSONObject0, z);
        }
    }
}


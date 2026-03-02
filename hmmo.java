import org.json.JSONException;
import org.json.JSONObject;

public class hmmo implements fsay, hmpv {
    protected fsaw a;
    public fsax b;

    @Override  // fsay
    public final fsat a(fsaw fsaw0) {
        return fsay.d;
    }

    @Override  // fsay
    public fsat b(String s, JSONObject jSONObject0, fsas fsas0, fsbc fsbc0, fsaw fsaw0) {
        hmmp hmmp0;
        hmnb hmnb0 = new hmnb(fsbc0);
        try {
            this.a = fsaw0;
            hmnp hmnp0 = new hmnp(new hmmn(fsas0), hmnb0);
            String s1 = jSONObject0.getString("type");
            if(s1.startsWith("DESFire")) {
                hmmp0 = new hmmp(hmnp0, hmnb0, this, this);
                hmmp0.c(jSONObject0);
                return hmmp0;
            }
            if(!s1.startsWith("MIFAREPlus")) {
                throw new hmov("MIFARE CardPayload is invalid");
            }
            hmmp0 = new hmmq(hmnp0, hmnb0, this);
            hmmp0.c(jSONObject0);
            return hmmp0;
        }
        catch(hmou | JSONException exception0) {
            throw new hmov("Exception while initializing MIFARE Applet", exception0);
        }
    }

    @Override  // fsay
    public final void d(fsax fsax0) {
        this.b = fsax0;
    }

    @Override  // hmpv
    public final void f(hmoo hmoo0) {
        fsau fsau0;
        fsaw fsaw0 = this.a;
        if(fsaw0 != null) {
            int v = hmoo0.b.a;
            if(v == 0) {
                throw null;
            }
            switch(v - 1) {
                case 1: {
                    fsau0 = fsau.b;
                    break;
                }
                case 2: {
                    fsau0 = fsau.d;
                    break;
                }
                case 3: {
                    fsau0 = fsau.e;
                    break;
                }
                case 4: {
                    fsau0 = fsau.f;
                    break;
                }
                case 5: {
                    fsau0 = fsau.g;
                    break;
                }
                case 6: {
                    fsau0 = fsau.c;
                    break;
                }
                case 7: {
                    fsau0 = fsau.n;
                    break;
                }
                default: {
                    fsau0 = fsau.a;
                }
            }
            fsaw0.a(new hmmr(fsau0, hmoo0.a, hmoo0.c));
        }
    }
}


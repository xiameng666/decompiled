import org.json.JSONException;
import org.json.JSONObject;

public final class hmml implements ftrx, hmpv {
    private dqqy a;

    @Override  // ftrx
    public final ftrr a(JSONObject jSONObject0, fsbl fsbl0, ftrs ftrs0, dqqy dqqy0) {
        hmmp hmmp0;
        hmnc hmnc0 = new hmnc(ftrs0);
        try {
            this.a = dqqy0;
            hmnp hmnp0 = new hmnp(new hmmk(fsbl0), hmnc0);
            String s = jSONObject0.getString("type");
            if(s.startsWith("DESFire")) {
                hmmp0 = new hmmp(hmnp0, hmnc0, this);
                hmmp0.c(jSONObject0);
                return hmmp0;
            }
            if(!s.startsWith("MIFAREPlus")) {
                throw new ftrq();
            }
            hmmp0 = new hmmq(hmnp0, hmnc0, this);
            hmmp0.c(jSONObject0);
            return hmmp0;
        }
        catch(hmou | JSONException unused_ex) {
            throw new ftrq();
        }
    }

    @Override  // hmpv
    public final void f(hmoo hmoo0) {
        int v1;
        int v = hmoo0.b.a;
        if(v == 0) {
            throw null;
        }
        switch(v - 1) {
            case 1: {
                v1 = 2;
                break;
            }
            case 2: {
                v1 = 4;
                break;
            }
            case 3: {
                v1 = 5;
                break;
            }
            case 4: {
                v1 = 6;
                break;
            }
            case 5: {
                v1 = 7;
                break;
            }
            case 6: {
                v1 = 3;
                break;
            }
            default: {
                v1 = 1;
            }
        }
        hmms hmms0 = new hmms(v1, hmoo0.a);
        this.a.a(hmms0);
    }
}


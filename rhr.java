import android.net.Network;
import org.json.JSONObject;

public final class rhr {
    public String a;
    public JSONObject b;
    public Network c;
    public bkbc d;
    private String e;
    private ggee f;
    private ggef g;
    private int h;
    private byte i;

    public final rhs a() {
        ggee ggee0 = this.f;
        if(ggee0 != null) {
            this.g = ggee0.a();
        }
        else if(this.g == null) {
            this.g = ggby.a;
        }
        if(this.i == 1) {
            String s = this.e;
            if(s != null) {
                String s1 = this.a;
                if(s1 != null) {
                    JSONObject jSONObject0 = this.b;
                    if(jSONObject0 != null) {
                        return new rhs(s, s1, jSONObject0, this.g, this.h, this.c, this.d);
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.e == null) {
            stringBuilder0.append(" url");
        }
        if(this.a == null) {
            stringBuilder0.append(" requestMethod");
        }
        if(this.b == null) {
            stringBuilder0.append(" postData");
        }
        if(this.i == 0) {
            stringBuilder0.append(" timeoutInSec");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final ggee b() {
        if(this.f == null) {
            this.f = new ggee();
        }
        return this.f;
    }

    public final void c(String s, String s1) {
        this.b().b(s, s1);
    }

    public final void d(int v) {
        this.h = v;
        this.i = 1;
    }

    public final void e(String s) {
        if(s == null) {
            throw new NullPointerException("Null url");
        }
        this.e = s;
    }
}


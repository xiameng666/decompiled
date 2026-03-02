import android.animation.AnimatorListenerAdapter;
import j..util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

final class aaid {
    final aaif a;
    private int b;

    public aaid(aaif aaif0, JSONObject jSONObject0) {
        Objects.requireNonNull(aaif0);
        this.a = aaif0;
        super();
        this.b = 0;
        try {
            this.b = jSONObject0.getInt("op") - jSONObject0.getInt("ip");
            aaif0.aj.y(jSONObject0.toString());
        }
        catch(JSONException unused_ex) {
            this.b = 0;
        }
    }

    public final float a(int v) {
        return this.b == 0 ? 0.0f : ((float)v) / ((float)this.b);
    }

    public final void b(grus grus0, AnimatorListenerAdapter animatorListenerAdapter0) {
        if(this.b == 0) {
            return;
        }
        float f = this.a(grus0.b);
        float f1 = this.a(grus0.c);
        this.a.aj.hI();
        this.a.aj.r(f, f1);
        this.a.aj.s(f);
        this.a.aj.b(animatorListenerAdapter0);
        this.a.aj.i();
    }
}


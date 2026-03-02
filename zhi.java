import org.json.JSONObject;

public final class zhi {
    public final grwy a;
    public final JSONObject b;
    public final grxw c;
    public final int d;

    public zhi(int v) {
        this(v, null, null, null);
    }

    public zhi(int v, grxw grxw0, grwy grwy0, JSONObject jSONObject0) {
        boolean z = true;
        if(v == 3) {
            if(grwy0 == null || jSONObject0 == null) {
                z = false;
            }
            v = 3;
        }
        batl.b(z);
        this.a = grwy0;
        this.c = grxw0;
        this.b = jSONObject0;
        this.d = v;
    }
}


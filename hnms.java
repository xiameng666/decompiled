import org.json.JSONObject;

public final class hnms {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public int d;

    public static hnms a(JSONObject jSONObject0) {
        hnms hnms0 = new hnms();
        hnms0.a = hnne.c(jSONObject0.getString("acKey"));
        hnms0.b = hnne.c(jSONObject0.getString("lcKey"));
        String s = jSONObject0.optString("rpKey");
        if(s.length() > 0) {
            hnms0.c = hnne.c(s);
        }
        hnms0.d = Integer.parseInt(jSONObject0.getString("atc"), 16);
        return hnms0;
    }
}


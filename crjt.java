import android.os.Bundle;
import j..util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class crjt {
    public final String a;
    public Bundle b;
    final crjx c;
    private final Bundle d;

    public crjt(crjx crjx0, String s) {
        Objects.requireNonNull(crjx0);
        this.c = crjx0;
        super();
        batl.q(s);
        this.a = s;
        this.d = new Bundle();
    }

    public final Bundle a() {
        if(this.b == null) {
            crjx crjx0 = this.c;
            String s = crjx0.b().getString(this.a, null);
            if(s != null) {
                try {
                    Bundle bundle0 = new Bundle();
                    JSONArray jSONArray0 = new JSONArray(s);
                    for(int v = 0; true; ++v) {
                        int v1 = jSONArray0.length();
                        if(v >= v1) {
                            break;
                        }
                        try {
                            JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                            String s1 = jSONObject0.getString("n");
                            String s2 = jSONObject0.getString("t");
                            int v2 = s2.hashCode();
                            switch(v2) {
                                case 100: {
                                    if(s2.equals("d")) {
                                        bundle0.putDouble(s1, Double.parseDouble(jSONObject0.getString("v")));
                                    }
                                    else {
                                        crjx0.aJ().c.b("Unrecognized persisted bundle type. Type", s2);
                                    }
                                    break;
                                }
                                case 108: {
                                    if(s2.equals("l")) {
                                        bundle0.putLong(s1, Long.parseLong(jSONObject0.getString("v")));
                                    }
                                    else {
                                        crjx0.aJ().c.b("Unrecognized persisted bundle type. Type", s2);
                                    }
                                    break;
                                }
                                case 0x73: {
                                    if(s2.equals("s")) {
                                        bundle0.putString(s1, jSONObject0.getString("v"));
                                    }
                                    else {
                                        crjx0.aJ().c.b("Unrecognized persisted bundle type. Type", s2);
                                    }
                                    break;
                                }
                                case 0xD18: {
                                    if(s2.equals("ia")) {
                                        hvhs.c();
                                        if(crjx0.am().t(crif.aD)) {
                                            JSONArray jSONArray1 = new JSONArray(jSONObject0.getString("v"));
                                            int v3 = jSONArray1.length();
                                            int[] arr_v = new int[v3];
                                            for(int v4 = 0; v4 < v3; ++v4) {
                                                arr_v[v4] = jSONArray1.optInt(v4);
                                            }
                                            bundle0.putIntArray(s1, arr_v);
                                        }
                                    }
                                    else {
                                        crjx0.aJ().c.b("Unrecognized persisted bundle type. Type", s2);
                                    }
                                    break;
                                }
                                case 0xD75: {
                                    if(s2.equals("la")) {
                                        hvhs.c();
                                        if(crjx0.am().t(crif.aD)) {
                                            JSONArray jSONArray2 = new JSONArray(jSONObject0.getString("v"));
                                            int v5 = jSONArray2.length();
                                            long[] arr_v1 = new long[v5];
                                            for(int v6 = 0; v6 < v5; ++v6) {
                                                arr_v1[v6] = jSONArray2.optLong(v6);
                                            }
                                            bundle0.putLongArray(s1, arr_v1);
                                        }
                                    }
                                    else {
                                        crjx0.aJ().c.b("Unrecognized persisted bundle type. Type", s2);
                                    }
                                    break;
                                }
                                default: {
                                    crjx0.aJ().c.b("Unrecognized persisted bundle type. Type", s2);
                                }
                            }
                        }
                        catch(JSONException | NumberFormatException unused_ex) {
                            this.c.aJ().c.a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.b = bundle0;
                }
                catch(JSONException unused_ex) {
                    this.c.aJ().c.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if(this.b == null) {
                this.b = this.d;
            }
        }
        Bundle bundle1 = this.b;
        batl.s(bundle1);
        return new Bundle(bundle1);
    }
}


import org.json.JSONObject;

public final class hmnr {
    public final byte a;
    public final boolean b;
    public String c;
    public final int d;
    private byte[] e;

    public hmnr(int v, byte[] arr_b, boolean z) {
        this.d = v;
        this.a = 0;
        this.b = z;
        this.c = "?";
        if(arr_b != null) {
            this.e = (byte[])arr_b.clone();
        }
    }

    public hmnr(String s) {
        this.d = 1;
        this.a = 0;
        this.b = false;
        this.c = s;
    }

    public hmnr(JSONObject jSONObject0) {
        int v;
        this.a = hmpy.I(jSONObject0.getString("version"))[0];
        this.b = jSONObject0.getBoolean("singleDes");
        this.c = jSONObject0.getString("alias");
        switch(jSONObject0.getString("type")) {
            case "AES": {
                v = 1;
                break;
            }
            case "DES2": {
                v = 2;
                break;
            }
            case "DES3": {
                v = 3;
                break;
            }
            default: {
                v = 4;
            }
        }
        this.d = v;
    }

    public final int a() {
        switch(this.d - 1) {
            case 0: {
                return 16;
            }
            case 1: 
            case 2: {
                return 8;
            }
            default: {
                return 0;
            }
        }
    }

    public static String b(int v, int v1) {
        return String.format("key-%06x-%d", v, v1);
    }

    public final byte[] c() {
        return this.e == null ? null : ((byte[])this.e.clone());
    }
}


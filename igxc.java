import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class igxc extends igwf {
    public igxc(igvt igvt0, String s, int v) {
        super(igvt0, s, ((long)v));
    }

    @Override  // igvx
    public final Object a(String s, JSONObject jSONObject0) {
        switch(s.hashCode()) {
            case 0xCAD56011: {
                return s.equals("string") ? this.toString() : a.a(s, "Invalid format (", ") for IPE_UD field");
            }
            case 0x31ECE8: {
                return s.equals("json") ? igvr.a(this) : a.a(s, "Invalid format (", ") for IPE_UD field");
            }
            case 0x32C67C: {
                if(s.equals("long")) {
                    return (long)this.e;
                }
                break;
            }
            case 0x59DC06B: {
                if(s.equals("bytes")) {
                    try {
                        return new JSONArray(igvq.i(this.toString()));
                    }
                    catch(JSONException unused_ex) {
                        return "JSON error returning byte[]";
                    }
                }
                break;
            }
            default: {
                return a.a(s, "Invalid format (", ") for IPE_UD field");
            }
        }
        return a.a(s, "Invalid format (", ") for IPE_UD field");
    }

    @Override  // igwf
    public final String toString() {
        int v = this.c.c;
        if(v > 56) {
            return String.format("%X", ((long)this.e));
        }
        if(v > 0x30) {
            return String.format("%014X", ((long)this.e));
        }
        if(v > 40) {
            return String.format("%012X", ((long)this.e));
        }
        if(v > 0x20) {
            return String.format("%010X", ((long)this.e));
        }
        if(v > 24) {
            return String.format("%08X", ((long)this.e));
        }
        if(v > 16) {
            return String.format("%06X", ((long)this.e));
        }
        return v <= 8 ? String.format("%02X", ((long)this.e)) : String.format("%04X", ((long)this.e));
    }
}


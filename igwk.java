import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONObject;

final class igwk extends igvy {
    public igwk(igvt igvt0, String s, int v) {
        super(igvt0, s, v);
    }

    @Override  // igvx
    public final Object a(String s, JSONObject jSONObject0) {
        byte[] arr_b = this.e;
        if(arr_b == null) {
            return null;
        }
        switch(s.hashCode()) {
            case 0xCAD56011: {
                if(s.equals("string")) {
                    try {
                        return new String(arr_b);
                    label_7:
                        if(s.equals("json")) {
                            return igvr.a(this);
                        label_9:
                            if(s.equals("bytes")) {
                                return new JSONArray(arr_b);
                            }
                        }
                    }
                    catch(Exception exception0) {
                        return exception0.toString();
                    }
                }
                break;
            }
            case 0x31ECE8: {
                goto label_7;
            }
            case 0x59DC06B: {
                goto label_9;
            }
            default: {
                return a.a(s, "Invalid format (", ") for Byte field");
            }
        }
        return a.a(s, "Invalid format (", ") for Byte field");
    }

    @Override  // igvy
    public final String toString() {
        try {
            return String.format("\"%1$s\"", new String(this.e, "UTF-8"));
        }
        catch(UnsupportedEncodingException unused_ex) {
            return "";
        }
    }
}


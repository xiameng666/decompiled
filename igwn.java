import j..util.DesugarTimeZone;
import java.util.Calendar;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class igwn extends igvx {
    byte[] e;

    public igwn(igvt igvt0) {
        super(igvt0, "DateOfBirth");
        this.e = new byte[4];
        this.e = igvt0.h(4);
        this.c = igvt0.c;
    }

    @Override  // igvx
    public final Object a(String s, JSONObject jSONObject0) {
        byte[] arr_b = this.e;
        if(arr_b != null && arr_b.length >= 4) {
            switch(s.hashCode()) {
                case 0xCAD56011: {
                    return s.equals("string") ? this.toString() : a.a(s, "Invalid format (", ") for Byte field");
                }
                case 0x197EF: {
                    if(s.equals("int")) {
                        return igvq.b(arr_b, 0, 0x20);
                    }
                    break;
                }
                case 0x31ECE8: {
                    return s.equals("json") ? igvr.a(this) : a.a(s, "Invalid format (", ") for Byte field");
                }
                case 0x32C67C: {
                    if(s.equals("long")) {
                        int v = igvq.a(arr_b[0]);
                        int v1 = igvq.a(arr_b[1]);
                        int v2 = igvq.a(arr_b[2]);
                        int v3 = igvq.a(arr_b[3]);
                        Calendar calendar0 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar0.clear();
                        calendar0.set(v * 100 + v1, v2, v3, 0, 0, 0);
                        return calendar0.getTimeInMillis();
                    }
                    break;
                }
                case 0x59DC06B: {
                    if(s.equals("bytes")) {
                        try {
                            return new JSONArray(this.e);
                        }
                        catch(JSONException unused_ex) {
                            return "JSON error returning byte[]";
                        }
                    }
                    break;
                }
                default: {
                    return a.a(s, "Invalid format (", ") for Byte field");
                }
            }
            return a.a(s, "Invalid format (", ") for Byte field");
        }
        return null;
    }

    @Override  // igvx
    public final Object b() {
        return this.e;
    }

    @Override  // igvx
    public final String toString() {
        return String.format("%02X/%02X/%02X%02X", ((byte)this.e[3]), ((byte)this.e[2]), ((byte)this.e[0]), ((byte)this.e[1]));
    }
}


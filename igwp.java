import java.util.Calendar;
import java.util.Locale;
import org.json.JSONObject;

final class igwp extends igwf {
    public igwp(igvt igvt0, String s) {
        super(igvt0, s, 24L);
    }

    @Override  // igvx
    public final Object a(String s, JSONObject jSONObject0) {
        switch(s.hashCode()) {
            case 0xCAD56011: {
                return s.equals("string") ? this.toString() : a.a(s, "Invalid format (", ") for DTS field");
            }
            case 0x197EF: {
                if(s.equals("int")) {
                    return (long)this.e;
                }
                break;
            }
            case 0x31ECE8: {
                return s.equals("json") ? igvr.a(this) : a.a(s, "Invalid format (", ") for DTS field");
            }
            case 0x32C67C: {
                if(s.equals("long")) {
                    return (long)(this.e * 60000L + 852076800000L);
                }
                break;
            }
            default: {
                return a.a(s, "Invalid format (", ") for DTS field");
            }
        }
        return a.a(s, "Invalid format (", ") for DTS field");
    }

    @Override  // igwf
    public final String toString() {
        long v = this.e;
        if(v == 0L) {
            return "not specified";
        }
        Calendar calendar0 = igvq.e(((int)v));
        return String.format(Locale.UK, "%1$td/%1$tm/%1$tY %1$tk:%1$tM", calendar0);
    }
}


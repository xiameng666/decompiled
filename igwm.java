import java.util.Calendar;
import java.util.Locale;
import org.json.JSONObject;

final class igwm extends igwt {
    public igwm(igvt igvt0, String s) {
        super(igvt0, s, 14);
    }

    @Override  // igvx
    public final Object a(String s, JSONObject jSONObject0) {
        switch(s.hashCode()) {
            case 0xCAD56011: {
                return s.equals("string") ? this.toString() : a.a(s, "Invalid format (", ") for DATE field");
            }
            case 0x197EF: {
                if(s.equals("int")) {
                    return (int)this.e;
                }
                break;
            }
            case 0x31ECE8: {
                return s.equals("json") ? igvr.a(this) : a.a(s, "Invalid format (", ") for DATE field");
            }
            case 0x32C67C: {
                if(s.equals("long")) {
                    return (long)(((long)this.e) * 86400000L + 852076800000L);
                }
                break;
            }
            default: {
                return a.a(s, "Invalid format (", ") for DATE field");
            }
        }
        return a.a(s, "Invalid format (", ") for DATE field");
    }

    @Override  // igwt
    public final String toString() {
        int v = this.e;
        if(v == 0) {
            return "Does not expire";
        }
        Calendar calendar0 = igvq.f(v);
        return String.format(Locale.UK, "%1$td/%1$tm/%1$tY", calendar0);
    }
}


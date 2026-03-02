import java.util.Calendar;
import org.json.JSONObject;

final class igxb extends igwt {
    public igxb(igvt igvt0) {
        super(igvt0, "ExpiryTime", 11);
    }

    @Override  // igvx
    public final Object a(String s, JSONObject jSONObject0) {
        Object object0 = this.b();
        switch(s.hashCode()) {
            case 0xCAD56011: {
                return s.equals("string") ? this.toString() : a.a(s, "Invalid format (", ") for TIME field");
            }
            case 0x197EF: {
                if(s.equals("int")) {
                    return object0;
                }
                break;
            }
            case 0x31ECE8: {
                return s.equals("json") ? igvr.a(this) : a.a(s, "Invalid format (", ") for TIME field");
            }
            case 0x32C67C: {
                if(s.equals("long")) {
                    return (long)(((short)(((Short)object0))));
                }
                break;
            }
            default: {
                return a.a(s, "Invalid format (", ") for TIME field");
            }
        }
        return a.a(s, "Invalid format (", ") for TIME field");
    }

    @Override  // igwt
    public final String toString() {
        Calendar calendar0 = Calendar.getInstance();
        calendar0.clear();
        calendar0.set(0x7DF, 0, 1, 0, 0, 0);
        calendar0.add(12, ((int)this.e));
        return String.format("%1$tk:%1$tM", calendar0);
    }
}


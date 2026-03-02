import org.json.JSONObject;

final class igwz extends igwt {
    public igwz(igvt igvt0, String s) {
        super(igvt0, s, 16);
    }

    @Override  // igvx
    public final Object a(String s, JSONObject jSONObject0) {
        switch(s.hashCode()) {
            case 0xCAD56011: {
                return s.equals("string") ? this.toString() : a.a(s, "Invalid format (", ") for OID16 field");
            }
            case 0x197EF: {
                if(s.equals("int")) {
                    return (int)this.e;
                }
                break;
            }
            case 0x31ECE8: {
                return s.equals("json") ? igvr.a(this) : a.a(s, "Invalid format (", ") for OID16 field");
            }
            case 0x32C67C: {
                if(s.equals("long")) {
                    return (long)this.e;
                }
                break;
            }
            default: {
                return a.a(s, "Invalid format (", ") for OID16 field");
            }
        }
        return a.a(s, "Invalid format (", ") for OID16 field");
    }

    @Override  // igwt
    public final String toString() {
        return String.format("%1$04x", ((short)this.e));
    }
}


import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class igwq extends igvx {
    private final int e;
    private String f;

    public igwq(igvt igvt0, String s) {
        super(igvt0, s);
        String s1;
        int v = igvt0.c(4);
        this.e = v;
        this.c = igvt0.c;
        switch(v) {
            case 0: {
                s1 = "not-specified";
                break;
            }
            case 1: {
                s1 = "sale";
                break;
            }
            case 2: {
                s1 = "validation-outward-journey-if-return-ticket";
                break;
            }
            case 3: {
                s1 = "undo-previous-event-without-refund";
                break;
            }
            case 4: {
                s1 = "str-load";
                break;
            }
            case 5: {
                s1 = "str-autoload";
                break;
            }
            case 6: {
                s1 = "consumed";
                break;
            }
            case 7: {
                s1 = "str-debit";
                break;
            }
            case 8: {
                s1 = "exchange";
                break;
            }
            case 9: {
                s1 = "redeem-loyalty-points";
                break;
            }
            case 10: {
                s1 = "undo-previous-event-with-refund";
                break;
            }
            case 11: {
                s1 = "check-in";
                break;
            }
            case 12: {
                s1 = "check-out";
                break;
            }
            case 13: {
                s1 = "activate-stored-ticket";
                break;
            }
            case 14: {
                s1 = "record-of-multiple-leg-journey";
                break;
            }
            case 15: {
                s1 = "cta-payment-received";
                break;
            }
            default: {
                return;
            }
        }
        this.f = s1;
    }

    @Override  // igvx
    public final Object a(String s, JSONObject jSONObject0) {
        Object object0 = this.b();
        JSONObject jSONObject1 = null;
        if(s.equals("enum")) {
            try {
                jSONObject1 = jSONObject0.getJSONObject("extra_parameters").optJSONObject("enum_defines");
            }
            catch(JSONException unused_ex) {
            }
            if(jSONObject1 == null) {
                s = "string";
            }
        }
        switch(s.hashCode()) {
            case 0xCAD56011: {
                return s.equals("string") ? this.toString() : "Invalid format (double) for EventTypeCode field";
            }
            case 0x197EF: {
                if(s.equals("int")) {
                    ((Integer)object0).intValue();
                    return (Integer)object0;
                }
                break;
            }
            case 0x2F9501: {
                return s.equals("enum") ? jSONObject1.optString(object0.toString(), "Undefined code for " + object0.toString()) : "Invalid format (double) for EventTypeCode field";
            }
            case 0x31ECE8: {
                return s.equals("json") ? igvr.a(this) : "Invalid format (double) for EventTypeCode field";
            }
            case 0x32C67C: {
                if(s.equals("long")) {
                    return (long)(((int)(((Integer)object0))));
                }
                break;
            }
            case 0x59DC06B: {
                if(s.equals("bytes")) {
                    try {
                        return new JSONArray(new byte[]{((byte)(((int)(((Integer)object0)))))});
                    }
                    catch(JSONException unused_ex) {
                        return "JSON error returning byte[]";
                    }
                }
                break;
            }
            default: {
                return "Invalid format (double) for EventTypeCode field";
            }
        }
        return "Invalid format (double) for EventTypeCode field";
    }

    @Override  // igvx
    public final Object b() {
        return (int)this.e;
    }

    @Override  // igvx
    public final String toString() {
        return String.format(Locale.UK, "%1$d \'%2$s\'", ((int)this.e), this.f);
    }
}


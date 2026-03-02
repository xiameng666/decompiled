import org.json.JSONArray;
import org.json.JSONObject;

final class igwc extends igvx {
    public igwc(igvt igvt0) {
        super(igvt0, "IDFlags");
        igvv igvv0 = igvt0.e();
        this.e(new igwr(igvt0, "ShellDepositRefundable?"));
        this.e(new igwr(igvt0, "DepositRefundable?"));
        this.e(new igwr(igvt0, "PrintTicket"));
        this.e(new igwr(igvt0, "CompanionAllowed"));
        this.e(new igwr(igvt0, "URI"));
        this.e(new igws(igvt0));
        this.e(new igwr(igvt0, "Personalised"));
        igvt0.g(igvv0);
        this.a = igvt0.c(8);
        this.c = igvt0.c;
    }

    @Override  // igvx
    public final Object a(String s, JSONObject jSONObject0) {
        Object object0 = this.a;
        if(object0 == null) {
            return null;
        }
        switch(s.hashCode()) {
            case 0xB0F77BD1: {
                if(s.equals("double")) {
                    return a.a(s, "Invalid format (", ") for Byte field");
                }
                break;
            }
            case 0xCAD56011: {
                if(s.equals("string")) {
                    return object0.toString();
                }
                break;
            }
            case 0x197EF: {
                return s.equals("int") ? object0 : null;
            }
            case 0x2F9501: {
                if(s.equals("enum")) {
                    Object object1 = new JSONArray();
                    int v = 0;
                    while(v < this.b.size()) {
                        try {
                            if(((byte)(((Byte)((igvx)this.b.get(v)).b()))) != 0) {
                                goto label_15;
                            }
                        }
                        catch(Exception unused_ex) {
                        }
                        goto label_16;
                    label_15:
                        ((JSONArray)object1).put(((igvx)this.b.get(v)).d);
                    label_16:
                        ++v;
                    }
                    return object1;
                }
                break;
            }
            case 0x31ECE8: {
                if(s.equals("json")) {
                    return igvr.a(this);
                }
                break;
            }
            case 0x32C67C: {
                if(s.equals("long")) {
                    return (long)(((int)(((Integer)object0))));
                }
                break;
            }
            case 0x59DC06B: {
                if(s.equals("bytes")) {
                    return a.a(s, "Invalid format (", ") for Byte field");
                }
                break;
            }
            case 0x6DF7FE7F: {
                if(s.equals("double0")) {
                    return (double)(((long)(((int)(((Integer)object0))))));
                }
                break;
            }
            case 0x6DF7FE80: {
                if(s.equals("double1")) {
                    return (double)(((double)(((long)(((int)(((Integer)object0))))))) / 10.0);
                }
                break;
            }
            case 0x6DF7FE81: {
                if(s.equals("double2")) {
                    return (double)(((double)(((long)(((int)(((Integer)object0))))))) / 100.0);
                }
                break;
            }
            case 0x6DF7FE82: {
                if(s.equals("double3")) {
                    return (double)(((double)(((long)(((int)(((Integer)object0))))))) / 1000.0);
                }
                break;
            }
            default: {
                return null;
            }
        }
        return null;
    }
}


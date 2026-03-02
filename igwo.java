import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

final class igwo extends igwl {
    public igwo(igvt igvt0, String s) {
        super(igvt0, s, new ArrayList(Arrays.asList(new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Special Day"})));
    }

    @Override  // igvx
    public final Object a(String s, JSONObject jSONObject0) {
        Object object0 = this.b();
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
                if(s.equals("int")) {
                    ((Integer)object0).intValue();
                    return (Integer)object0;
                }
                break;
            }
            case 0x2F9501: {
                if(s.equals("enum")) {
                    Object object1 = new JSONArray();
                    for(int v = 0; v < this.b.size(); ++v) {
                        if(((byte)(((Byte)((igvx)this.b.get(v)).b()))) != 0) {
                            ((JSONArray)object1).put(((igvx)this.b.get(v)).d);
                        }
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
                    return (double)(((int)(((Integer)object0))));
                }
                break;
            }
            case 0x6DF7FE80: {
                if(s.equals("double1")) {
                    return (double)(((double)(((int)(((Integer)object0))))) / 10.0);
                }
                break;
            }
            case 0x6DF7FE81: {
                if(s.equals("double2")) {
                    return (double)(((double)(((int)(((Integer)object0))))) / 100.0);
                }
                break;
            }
            case 0x6DF7FE82: {
                if(s.equals("double3")) {
                    return (double)(((double)(((int)(((Integer)object0))))) / 1000.0);
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


import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.List;
import org.json.JSONException;

public final class hmkv {
    final hmlg a;

    public hmkv(hmlg hmlg0) {
        this.a = hmlg0;
    }

    public final hmli a(hmli hmli0) {
        Object object0 = hmli0.a;
        if((object0 instanceof String)) {
            Object object1 = this.c(((String)object0));
            return (object1 instanceof hmli) ? ((hmli)object1) : new hmli(object1);
        }
        return hmli0;
    }

    public final Object b(hmli hmli0, Object object0) {
        if(hmli0 == null) {
            return null;
        }
        return (hmli0.a instanceof String) ? new hmli(this.c(((String)hmli0.a))).d(object0) : hmli0.d(object0);
    }

    public final Object c(String s) {
        hmlg hmlg0 = this.a;
        hmle hmle0 = hmlg0.f.a();
        if(s.equals("$")) {
            return hmle0.b();
        }
        if(s.equals("$_returnVal")) {
            return hmle0.e.a;
        }
        if(s.startsWith("#_")) {
            int v = Integer.parseInt(s.split("_")[1].trim());
            Integer integer0 = v;
            List list0 = hmle0.f;
            integer0.getClass();
            if(list0.size() - v >= list0.size()) {
                throw new hmki("Wrong stored variable specified");
            }
            integer0.getClass();
            return ((hmli)list0.get(list0.size() - v)).a;
        }
        if(s.equals("$_selectedTag")) {
            return ((hmlp)hmle0.b.a).a;
        }
        if(s.equals("$_selectedTagChain")) {
            StringBuilder stringBuilder0 = new StringBuilder();
            for(hmkh hmkh0 = hmle0.b; hmkh0 != null; hmkh0 = hmkh0.c) {
                hmlp hmlp0 = (hmlp)hmkh0.a;
                if(hmlp0.a() == -1) {
                    break;
                }
                stringBuilder0.insert(0, hmlp0.a);
                stringBuilder0.insert(0, "~");
            }
            stringBuilder0.delete(0, 1);
            return stringBuilder0.toString();
        }
        if(s.equals("$_foreachCounter")) {
            return new hmkg(new BigDecimal(hmle0.d), 3);
        }
        if(s.equals("$_cardConfig")) {
            return hmlg0.a;
        }
        if(s.equals("$_jsonOutput")) {
            return hmlg0.e;
        }
        if(s.contains(":")) {
            String[] arr_s = s.split(":");
            switch(arr_s[0].trim()) {
                case "I": {
                    return new hmkg(new BigDecimal(arr_s[1].trim()), 11);
                }
                case "b": {
                    int v1 = Integer.valueOf(arr_s[1].trim(), 16).byteValue();
                    Byte.valueOf(((byte)v1)).getClass();
                    return new hmkg(new BigDecimal(v1), 1);
                }
                case "ba": {
                    return ByteBuffer.wrap(hmlx.n(arr_s[1].trim()));
                }
                case "bo": {
                    return Boolean.valueOf(arr_s[1].trim());
                }
                case "cd": {
                    return s;
                }
                case "d": {
                    return new hmkg(new BigDecimal(arr_s[1].trim()), 5);
                }
                case "f": {
                    return new hmkg(new BigDecimal(arr_s[1].trim()), 4);
                }
                case "i": {
                    return new hmkg(new BigDecimal(arr_s[1].trim()), 3);
                }
                case "l": {
                    return new hmkg(new BigDecimal(arr_s[1].trim()), 6);
                }
                case "s": {
                    if(arr_s.length == 1) {
                        return "";
                    }
                    return "null".equals(arr_s[1].trim()) ? null : arr_s[1];
                }
                case "sh": {
                    return new hmkg(new BigDecimal(arr_s[1].trim()), 2);
                }
                default: {
                    throw new hmki("Invalid data type: " + arr_s[0] + " is not supported data type.");
                }
            }
        }
        try {
            if(hmlg0.f.b(s) != null) {
                return hmlg0.f.b(s).a;
            }
            if(hmlg0.c.a(s) != null) {
                return hmlg0.c.a(s).a;
            }
        }
        catch(JSONException unused_ex) {
        }
        return s;
    }
}


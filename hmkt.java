import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class hmkt {
    private final hmlg a;
    private final hmkv b;

    public hmkt(hmlg hmlg0) {
        this.a = hmlg0;
        this.b = new hmkv(hmlg0);
    }

    public final hmli a(JSONArray jSONArray0, hmli hmli0) {
        if(jSONArray0 == null) {
            hmli hmli1 = this.a.f.a().a();
            JSONArray jSONArray1 = new JSONArray();
            jSONArray0 = (JSONArray)this.b.b(hmli1, jSONArray1);
        }
        Object object0 = hmli0.a;
        if(!(object0 instanceof JSONObject)) {
            if((object0 instanceof JSONArray)) {
                int v1 = 0;
                while(v1 < jSONArray0.length()) {
                    if((jSONArray0.get(v1) instanceof JSONArray)) {
                        JSONArray jSONArray2 = jSONArray0.getJSONArray(v1);
                        if(jSONArray2.length() >= ((JSONArray)object0).length()) {
                            int v2 = 0;
                            while(v2 < ((JSONArray)object0).length()) {
                                if(((JSONArray)object0).get(v2).toString().equals(jSONArray2.get(v2).toString())) {
                                    ++v2;
                                    continue;
                                }
                                else {
                                    goto label_19;
                                }
                                break;
                            }
                            return new hmli(jSONArray2);
                        }
                    }
                label_19:
                    ++v1;
                }
                throw new hmki("array not found in the given array");
            }
            for(int v = 0; v < jSONArray0.length(); ++v) {
                if(jSONArray0.get(v).toString().equals(hmli0.toString())) {
                    jSONArray0.get(v);
                    return new hmli(jSONArray0.get(v));
                }
            }
            throw new hmki("value not found in the given array");
        }
        return hmkt.q(jSONArray0, ((JSONObject)object0));
    }

    public final hmli b(JSONArray jSONArray0, int v) {
        if(jSONArray0 == null) {
            try {
                hmli hmli0 = this.a.f.a().a();
                JSONArray jSONArray1 = new JSONArray();
                jSONArray0 = (JSONArray)this.b.b(hmli0, jSONArray1);
            }
            catch(Exception unused_ex) {
            }
        }
        if(jSONArray0 == null) {
            return new hmli(new JSONArray());
        }
        if(jSONArray0.length() <= 0) {
            return new hmli(jSONArray0);
        }
        if(v >= jSONArray0.length()) {
            throw new IndexOutOfBoundsException("Given Index exceeds the length of json array");
        }
        jSONArray0.get(v);
        return new hmli(jSONArray0.get(v));
    }

    public final hmli c(JSONObject jSONObject0, String s) {
        if(jSONObject0 == null) {
            try {
                hmli hmli0 = this.a.f.a().a();
                JSONObject jSONObject1 = new JSONObject();
                jSONObject0 = (JSONObject)this.b.b(hmli0, jSONObject1);
            }
            catch(Exception unused_ex) {
            }
        }
        if(jSONObject0 == null) {
            jSONObject0 = new JSONObject();
        }
        if(s != null && !s.isEmpty()) {
            String[] arr_s = s.trim().split("~");
            int v = 0;
            while(v < arr_s.length) {
                if(v + 1 == arr_s.length) {
                    if(jSONObject0.has(arr_s[v])) {
                        jSONObject0.get(arr_s[v]);
                        return new hmli(jSONObject0.get(arr_s[v]));
                    }
                    Object object0 = null;
                    String s1 = arr_s[v];
                    Iterator iterator0 = jSONObject0.keys();
                    while(iterator0.hasNext()) {
                        Object object1 = iterator0.next();
                        String s2 = (String)object1;
                        if(s2.contains("-")) {
                            String[] arr_s1 = s2.split("-");
                            if(Integer.parseInt(arr_s1[0]) > Integer.parseInt(s1) || Integer.parseInt(s1) > Integer.parseInt(arr_s1[1])) {
                                continue;
                            }
                            object0 = jSONObject0.get(s2);
                            break;
                        }
                        if(s2.contains(",") && Arrays.asList(s2.split(",")).contains(s1)) {
                            object0 = jSONObject0.get(s2);
                            break;
                        }
                    }
                    if(object0 != null) {
                        return new hmli(object0);
                    }
                    jSONObject0.put(arr_s[v], new JSONObject());
                    return new hmli(jSONObject0.getJSONObject(arr_s[v]));
                }
                if(!jSONObject0.has(arr_s[v])) {
                    jSONObject0.put(arr_s[v], new JSONObject());
                }
                jSONObject0 = jSONObject0.getJSONObject(arr_s[v]);
                ++v;
            }
        }
        return new hmli(jSONObject0);
    }

    public final JSONArray d(JSONArray jSONArray0, hmli hmli0, int v, int v1) {
        if(jSONArray0 == null) {
            hmli hmli1 = this.a.f.a().a();
            JSONArray jSONArray1 = new JSONArray();
            jSONArray0 = (JSONArray)this.b.b(hmli1, jSONArray1);
            v1 = jSONArray0.length();
            v = 0;
        }
        JSONArray jSONArray2 = new JSONArray();
        Object object0 = hmli0.a;
        if((object0 instanceof JSONObject)) {
            JSONArray jSONArray3 = new JSONArray();
            while(v < v1) {
                if((jSONArray0.get(v) instanceof JSONObject)) {
                    JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                    if(hmkt.p(((JSONObject)object0), jSONObject0)) {
                        Iterator iterator0 = ((JSONObject)object0).keys();
                        while(iterator0.hasNext()) {
                            Object object1 = iterator0.next();
                            if(jSONObject0.get(((String)object1)).equals(((JSONObject)object0).get(((String)object1)))) {
                                continue;
                            }
                            goto label_20;
                        }
                        jSONArray3.put(jSONObject0);
                    }
                }
            label_20:
                ++v;
            }
            if(jSONArray3.length() > 0) {
                return jSONArray3;
            }
            throw new hmki("Object not found in the array");
        }
        if((object0 instanceof JSONArray)) {
            JSONArray jSONArray4 = new JSONArray();
            while(v < v1) {
                if((jSONArray0.get(v) instanceof JSONArray)) {
                    JSONArray jSONArray5 = jSONArray0.getJSONArray(v);
                    if(jSONArray5.length() >= ((JSONArray)object0).length()) {
                        int v2 = 0;
                        while(true) {
                            if(v2 < ((JSONArray)object0).length()) {
                                if(((JSONArray)object0).get(v2).toString().equals(jSONArray5.get(v2).toString())) {
                                    ++v2;
                                    continue;
                                }
                                else {
                                    goto label_38;
                                }
                            }
                            jSONArray4.put(jSONArray5);
                            goto label_38;
                        }
                    }
                    else {
                        goto label_38;
                    }
                }
                else {
                label_38:
                    ++v;
                    continue;
                }
                break;
            }
            if(jSONArray4.length() > 0) {
                return jSONArray4;
            }
            throw new hmki("array not found in the given array");
        }
        while(v < v1) {
            if(jSONArray0.get(v).toString().equals(hmli0.toString())) {
                jSONArray2.put(jSONArray0.get(v));
            }
            ++v;
        }
        if(jSONArray2.length() > 0) {
            return jSONArray2;
        }
        throw new hmki("value not found in the given array");
    }

    public final JSONArray e(JSONArray jSONArray0, int v) {
        if(jSONArray0 == null) {
            try {
                hmli hmli0 = this.a.f.a().a();
                JSONArray jSONArray1 = new JSONArray();
                jSONArray0 = (JSONArray)this.b.b(hmli0, jSONArray1);
            }
            catch(Exception unused_ex) {
            }
        }
        if(jSONArray0 != null && v < jSONArray0.length()) {
            JSONArray jSONArray2 = new JSONArray();
            for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                if(v1 != v) {
                    jSONArray2.put(jSONArray0.get(v1));
                }
            }
            return jSONArray2;
        }
        return jSONArray0;
    }

    public final JSONArray f(JSONArray jSONArray0, JSONArray jSONArray1) {
        if(jSONArray0 == null) {
            hmli hmli0 = this.a.f.a().a();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray0 = (JSONArray)this.b.b(hmli0, jSONArray2);
        }
        if(jSONArray0 == null) {
            return jSONArray1;
        }
        if(jSONArray1 != null) {
            for(int v = 0; v < jSONArray1.length(); ++v) {
                jSONArray0.put(jSONArray1.get(v));
            }
        }
        return jSONArray0;
    }

    public final JSONObject g(JSONObject jSONObject0, String s) {
        if(jSONObject0 == null) {
            try {
                hmli hmli0 = this.a.f.a().a();
                JSONObject jSONObject1 = new JSONObject();
                jSONObject0 = (JSONObject)this.b.b(hmli0, jSONObject1);
            }
            catch(Exception unused_ex) {
            }
        }
        if(s != null && !s.isEmpty()) {
            String[] arr_s = s.trim().split("~");
            for(int v = 0; v < arr_s.length; ++v) {
                if(v + 1 == arr_s.length && jSONObject0 != null) {
                    jSONObject0.remove(arr_s[v]);
                }
                if(jSONObject0 != null && jSONObject0.has(arr_s[v])) {
                    jSONObject0 = jSONObject0.getJSONObject(arr_s[v]);
                }
            }
        }
        return jSONObject0;
    }

    public final JSONObject h(JSONObject jSONObject0, JSONObject jSONObject1) {
        if(jSONObject0 == null) {
            hmlg hmlg0 = this.a;
            if(hmlg0.f.a().j) {
                hmli hmli0 = hmlg0.f.a().a();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject0 = (JSONObject)this.b.b(hmli0, jSONObject2);
            }
        }
        if(jSONObject0 == null) {
            return jSONObject1;
        }
        if(jSONObject1 == null) {
            return jSONObject0;
        }
        Iterator iterator0 = jSONObject1.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            jSONObject0.put(((String)object0), jSONObject1.get(((String)object0)));
        }
        return jSONObject0;
    }

    public final JSONObject i(JSONArray jSONArray0, boolean z) {
        Iterator iterator0;
        Object object0;
        if(jSONArray0 == null) {
            hmli hmli0 = this.a.f.a().a();
            JSONArray jSONArray1 = new JSONArray();
            jSONArray0 = (JSONArray)this.b.b(hmli0, jSONArray1);
        }
        JSONObject jSONObject0 = new JSONObject();
        if(z) {
            int v = jSONArray0.length();
            do {
                --v;
                if(v < 0) {
                    return jSONObject0;
                }
                object0 = jSONArray0.get(v);
                if(!(object0 instanceof JSONObject)) {
                    throw new IllegalArgumentException("Expected array of JSON Objects");
                }
                iterator0 = ((JSONObject)object0).keys();
            label_12:
            }
            while(!iterator0.hasNext());
            Object object1 = iterator0.next();
            jSONObject0.put(((String)object1), ((JSONObject)object0).get(((String)object1)));
            goto label_12;
        }
        else {
            int v1 = 0;
            while(v1 < jSONArray0.length()) {
                Object object2 = jSONArray0.get(v1);
                if(!(object2 instanceof JSONObject)) {
                    throw new IllegalArgumentException("Expected array of JSON Objects");
                }
                Iterator iterator1 = ((JSONObject)object2).keys();
                while(iterator1.hasNext()) {
                    Object object3 = iterator1.next();
                    jSONObject0.put(((String)object3), ((JSONObject)object2).get(((String)object3)));
                }
                ++v1;
                continue;
            }
        }
        return jSONObject0;
    }

    public final boolean j(JSONObject jSONObject0, String s) {
        if(jSONObject0 == null) {
            try {
                hmli hmli0 = this.a.f.a().a();
                JSONObject jSONObject1 = new JSONObject();
                jSONObject0 = (JSONObject)this.b.b(hmli0, jSONObject1);
            }
            catch(Exception unused_ex) {
            }
        }
        if(s != null && !s.isEmpty()) {
            String[] arr_s = s.trim().split("~");
            for(int v = 0; v < arr_s.length; ++v) {
                if(v + 1 == arr_s.length) {
                    if(jSONObject0 != null) {
                        jSONObject0.has(arr_s[v]);
                        return jSONObject0 != null && jSONObject0.has(arr_s[v]);
                    }
                    return false;
                }
                if(jSONObject0 == null) {
                    jSONObject0 = null;
                }
                else if(jSONObject0.has(arr_s[v])) {
                    jSONObject0 = jSONObject0.getJSONObject(arr_s[v]);
                }
            }
        }
        return false;
    }

    public final void k(hmli hmli0, String s, Integer integer0, String s1) {
        if(hmli0 == null) {
            hmli0 = this.a.f.a().a();
        }
        hmln hmln0 = this.a.b;
        Object object0 = hmkt.o(hmli0, s1);
        if((object0 instanceof ByteBuffer)) {
            object0 = hmlx.g(((ByteBuffer)object0).array());
        }
        try {
            Map map0 = hmln0.a;
            if(!map0.isEmpty() && map0.get(integer0) != null) {
                ((JSONObject)map0.get(integer0)).put(s, object0);
                return;
            }
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put(s, object0);
            map0.put(integer0, jSONObject0);
        }
        catch(JSONException unused_ex) {
        }
    }

    public static final hmli l(hmli hmli0, String s, hmli hmli1) {
        Object object0 = hmli0.a;
        if(!(object0 instanceof JSONObject)) {
            if(s != null && !s.isEmpty()) {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put(s, hmkt.o(hmli1, ""));
                ((JSONArray)object0).put(jSONObject0);
                return new hmli(((JSONArray)object0));
            }
            ((JSONArray)object0).put(hmkt.o(hmli1, ""));
            return new hmli(((JSONArray)object0));
        }
        ((JSONObject)object0).put(s, hmkt.o(hmli1, ""));
        return new hmli(((JSONObject)object0));
    }

    public static final hmli m(Integer integer0, hmli hmli0) {
        String s;
        Object object0 = hmli0.a;
        Boolean boolean0 = Boolean.valueOf(false);
        if((object0 instanceof JSONObject)) {
            if(((int)integer0) >= ((JSONObject)object0).length()) {
                return new hmli(boolean0);
            }
            JSONObject jSONObject0 = new JSONObject();
            int v1 = (int)integer0;
            Iterator iterator0 = ((JSONObject)object0).keys();
            for(int v = 0; true; ++v) {
                s = null;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object1 = iterator0.next();
                String s1 = (String)object1;
                if(v == v1) {
                    s = s1;
                    break;
                }
            }
            jSONObject0.put(s, ((JSONObject)object0).get(s));
            return new hmli(jSONObject0);
        }
        if(!(object0 instanceof JSONArray)) {
            throw new hmki("Data type not supported");
        }
        if(((int)integer0) >= ((JSONArray)object0).length()) {
            return new hmli(boolean0);
        }
        ((JSONArray)object0).get(integer0.intValue());
        return new hmli(((JSONArray)object0).get(integer0.intValue()));
    }

    public static final hmli n(hmli hmli0, String s, hmli hmli1, boolean z) {
        int v1;
        Object object0 = hmli0.a;
        if((object0 instanceof JSONObject)) {
            if(z) {
                if(((JSONObject)object0).has(s)) {
                    ((JSONObject)object0).put(s, hmkt.o(hmli1, ""));
                    return new hmli(((JSONObject)object0));
                }
                return hmli0;
            }
            if(!((JSONObject)object0).has(s)) {
                ((JSONObject)object0).put(s, hmkt.o(hmli1, ""));
                return new hmli(((JSONObject)object0));
            }
            return hmli0;
        }
        JSONArray jSONArray0 = (JSONArray)object0;
        boolean z1 = true;
        int v = 0;
        if(s != null && !s.isEmpty()) {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put(s, hmkt.o(hmli1, ""));
            try {
                v1 = 0;
                hmkt.q(jSONArray0, jSONObject0);
                v1 = 1;
            }
            catch(Exception unused_ex) {
            }
            if(!z) {
                z1 = false;
                v = v1;
            }
            else if(v1 != 0) {
                jSONArray0.put(jSONObject0);
                return hmli0;
            }
            if(!z1 && v == 0) {
                jSONArray0.put(jSONObject0);
            }
            return hmli0;
        }
        Object object1 = hmkt.o(hmli1, "");
        for(int v2 = 0; true; ++v2) {
            if(v2 >= jSONArray0.length()) {
                z1 = false;
                break;
            }
            if(jSONArray0.get(v2).equals(object1)) {
                break;
            }
        }
        if(z) {
            if(z1) {
                jSONArray0.put(z1);
                return hmli0;
            }
        }
        else if(!z1) {
            jSONArray0.put(z1);
        }
        return hmli0;
    }

    private static final Object o(hmli hmli0, String s) {
        switch(s) {
            case "ba": {
                return hmli0.d(ByteBuffer.allocate(0));
            }
            case "bo": {
                return hmli0.d(Boolean.FALSE);
            }
            case "d": {
                return ((hmkg)hmli0.d(new hmkg(5))).a.doubleValue();
            }
            case "f": {
                return ((hmkg)hmli0.d(new hmkg(4))).a.floatValue();
            }
            case "i": {
                return ((hmkg)hmli0.d(new hmkg(3))).a.intValue();
            }
            case "l": {
                return ((hmkg)hmli0.d(new hmkg(6))).a.longValue();
            }
            case "s": {
                return hmli0.d("");
            }
            default: {
                Object object0 = hmli0.a;
                if((object0 instanceof ByteBuffer)) {
                    return hmli0.toString();
                }
                if((object0 instanceof BigDecimal)) {
                    return ((BigDecimal)object0).doubleValue();
                }
                if((object0 instanceof hmkg)) {
                    switch(((hmkg)object0).b - 1) {
                        case 0: {
                            return ((hmkg)object0).a.byteValue();
                        }
                        case 1: {
                            return ((hmkg)object0).a.shortValue();
                        }
                        case 2: {
                            return ((hmkg)object0).a.intValue();
                        }
                        case 3: {
                            return ((hmkg)object0).a.floatValue();
                        }
                        case 4: {
                            return ((hmkg)object0).a.doubleValue();
                        }
                        case 5: {
                            return ((hmkg)object0).a.longValue();
                        }
                        case 6: {
                            return ((hmkg)object0).a.toString();
                        }
                        default: {
                            return ((hmkg)object0).a;
                        }
                    }
                }
                return object0;
            }
        }
    }

    private static final boolean p(JSONObject jSONObject0, JSONObject jSONObject1) {
        if(jSONObject0.length() > jSONObject1.length()) {
            return false;
        }
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(!jSONObject1.has(((String)object0))) {
                return false;
            }
        }
        return true;
    }

    private static final hmli q(JSONArray jSONArray0, JSONObject jSONObject0) {
        int v = 0;
        while(v < jSONArray0.length()) {
            if((jSONArray0.get(v) instanceof JSONObject)) {
                JSONObject jSONObject1 = jSONArray0.getJSONObject(v);
                if(hmkt.p(jSONObject0, jSONObject1)) {
                    Iterator iterator0 = jSONObject0.keys();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        if(jSONObject1.get(((String)object0)).equals(jSONObject0.get(((String)object0)))) {
                            continue;
                        }
                        goto label_11;
                    }
                    return new hmli(jSONObject1);
                }
            }
        label_11:
            ++v;
        }
        throw new hmki("Object not found in the array");
    }
}


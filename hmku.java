import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class hmku {
    public final hmqm a;
    public final hmkv b;
    public final hmkt c;

    public hmku(hmlg hmlg0, hmqm hmqm0) {
        this.a = hmqm0;
        this.c = new hmkt(hmlg0);
        this.b = new hmkv(hmlg0);
    }

    public final hmli a(List list0) {
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            return hmli0;
        }
        try {
            switch(list0.size()) {
                case 2: {
                    hmli hmli1 = (hmli)list0.get(0);
                    JSONArray jSONArray0 = new JSONArray();
                    hmli hmli2 = new hmli(((JSONArray)this.b.b(hmli1, jSONArray0)));
                    hmli hmli3 = (hmli)list0.get(1);
                    return hmkt.l(hmli2, null, this.b.a(hmli3));
                }
                case 3: {
                    hmli hmli4 = this.p(((hmli)list0.get(0)));
                    hmli hmli5 = (hmli)list0.get(1);
                    String s = (String)this.b.b(hmli5, "");
                    hmli hmli6 = (hmli)list0.get(2);
                    return hmkt.l(hmli4, s, this.b.a(hmli6));
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
        }
        catch(Exception exception0) {
            this.a.a("Exception executing addOrUpdate method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli b(List list0) {
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            return hmli0;
        }
        try {
            switch(list0.size()) {
                case 3: {
                    hmli hmli1 = (hmli)list0.get(0);
                    JSONArray jSONArray0 = new JSONArray();
                    hmli hmli2 = new hmli(((JSONArray)this.b.b(hmli1, jSONArray0)));
                    hmli hmli3 = (hmli)list0.get(1);
                    hmli hmli4 = this.b.a(hmli3);
                    hmli hmli5 = (hmli)list0.get(2);
                    return hmkt.n(hmli2, null, hmli4, ((Boolean)this.b.b(hmli5, Boolean.TRUE)).booleanValue());
                }
                case 4: {
                    hmli hmli6 = this.p(((hmli)list0.get(0)));
                    hmli hmli7 = (hmli)list0.get(1);
                    String s = (String)this.b.b(hmli7, "");
                    hmli hmli8 = (hmli)list0.get(2);
                    hmli hmli9 = this.b.a(hmli8);
                    hmli hmli10 = (hmli)list0.get(3);
                    return hmkt.n(hmli6, s, hmli9, ((Boolean)this.b.b(hmli10, Boolean.TRUE)).booleanValue());
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
        }
        catch(Exception exception0) {
            this.a.a("Exception executing addToJSONIf method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli c(List list0) {
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            if(list0.size() == 2) {
                hmli hmli2 = (hmli)list0.get(0);
                String s = (String)this.b.b(hmli2, "");
                hmli hmli3 = (hmli)list0.get(1);
                hmkg hmkg0 = new hmkg(3);
                Integer integer0 = ((hmkg)this.b.b(hmli3, hmkg0)).a.intValue();
                this.c.k(null, s, integer0, "defaultType");
            }
            else {
                switch(list0.size()) {
                    case 3: {
                        String s1 = (String)((hmli)list0.get(0)).a;
                        hmli hmli4 = new hmli(this.b.c(s1));
                        hmli hmli5 = (hmli)list0.get(1);
                        String s2 = (String)this.b.b(hmli5, "");
                        hmli hmli6 = (hmli)list0.get(2);
                        hmkg hmkg1 = new hmkg(3);
                        Integer integer1 = ((hmkg)this.b.b(hmli6, hmkg1)).a.intValue();
                        this.c.k(hmli4, s2, integer1, "defaultType");
                        break;
                    }
                    case 4: {
                        String s3 = (String)((hmli)list0.get(0)).a;
                        hmli hmli7 = new hmli(this.b.c(s3));
                        hmli hmli8 = (hmli)list0.get(1);
                        String s4 = (String)this.b.b(hmli8, "");
                        hmli hmli9 = (hmli)list0.get(2);
                        hmkg hmkg2 = new hmkg(3);
                        Integer integer2 = ((hmkg)this.b.b(hmli9, hmkg2)).a.intValue();
                        hmli hmli10 = (hmli)list0.get(3);
                        String s5 = (String)this.b.b(hmli10, "");
                        this.c.k(hmli7, s4, integer2, s5);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Incorrect number of parameters");
                    }
                }
            }
            return new hmli(Boolean.valueOf(true));
        }
        catch(Exception exception0) {
            this.a.a("Exception executing addTransactionField method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli d(List list0) {
        JSONArray jSONArray0;
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            switch(list0.size()) {
                case 1: {
                    hmli hmli2 = (hmli)list0.get(0);
                    hmli hmli3 = this.b.a(hmli2);
                    jSONArray0 = this.c.d(null, hmli3, 0, 0);
                    break;
                }
                case 2: {
                    hmli hmli4 = (hmli)list0.get(0);
                    JSONArray jSONArray1 = new JSONArray();
                    JSONArray jSONArray2 = (JSONArray)this.b.b(hmli4, jSONArray1);
                    hmli hmli5 = (hmli)list0.get(1);
                    hmli hmli6 = this.b.a(hmli5);
                    int v = jSONArray2.length();
                    jSONArray0 = this.c.d(jSONArray2, hmli6, 0, v);
                    break;
                }
                case 4: {
                    hmli hmli7 = (hmli)list0.get(0);
                    JSONArray jSONArray3 = new JSONArray();
                    JSONArray jSONArray4 = (JSONArray)this.b.b(hmli7, jSONArray3);
                    hmli hmli8 = (hmli)list0.get(1);
                    hmli hmli9 = this.b.a(hmli8);
                    hmli hmli10 = (hmli)list0.get(2);
                    Integer integer0 = (int)1;
                    hmkg hmkg0 = hmkg.a(integer0);
                    int v1 = ((hmkg)this.b.b(hmli10, hmkg0)).a.intValue();
                    hmli hmli11 = (hmli)list0.get(3);
                    hmkg hmkg1 = hmkg.a(integer0);
                    int v2 = ((hmkg)this.b.b(hmli11, hmkg1)).a.intValue();
                    jSONArray0 = this.c.d(jSONArray4, hmli9, v1, v2);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(jSONArray0);
        }
        catch(Exception exception0) {
            this.a.a("Exception executing findAllInJsonArray method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli e(List list0) {
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            return hmli0;
        }
        try {
            switch(list0.size()) {
                case 1: {
                    hmli hmli1 = (hmli)list0.get(0);
                    hmli hmli2 = this.b.a(hmli1);
                    return this.c.a(null, hmli2);
                }
                case 2: {
                    hmli hmli3 = (hmli)list0.get(0);
                    JSONArray jSONArray0 = new JSONArray();
                    JSONArray jSONArray1 = (JSONArray)this.b.b(hmli3, jSONArray0);
                    hmli hmli4 = (hmli)list0.get(1);
                    hmli hmli5 = this.b.a(hmli4);
                    return this.c.a(jSONArray1, hmli5);
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
        }
        catch(Exception exception0) {
            this.a.a("Exception executing findInJsonArray method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli f(hmlf hmlf0, List list0) {
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            return hmli0;
        }
        try {
            hmkv hmkv0 = this.b;
            int v = ((hmkg)hmkv0.b(((hmli)list0.get(0)), new hmkg(3))).a.intValue();
            if(v == 0) {
                ArrayList arrayList0 = new ArrayList();
                if(list0.size() != 2) {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
                hmli hmli1 = hmkv0.a(((hmli)list0.get(1)));
                arrayList0.add(((hmli)list0.get(0)));
                arrayList0.add(hmli1);
                hmlf0.a().c = arrayList0;
                return hmkt.m(Integer.valueOf(0), hmli1);
            }
            if(list0.size() == 2) {
                return hmkt.m(Integer.valueOf(v), ((hmli)list0.get(1)));
            }
            throw new IllegalArgumentException("Incorrect number of parameters");
        }
        catch(Exception exception0) {
            this.a.a("Exception executing foreachInJson method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli g(List list0) {
        boolean z;
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            switch(list0.size()) {
                case 1: {
                    hmli hmli2 = (hmli)list0.get(0);
                    String s = (String)this.b.b(hmli2, "");
                    z = this.c.j(null, s);
                    break;
                }
                case 2: {
                    hmli hmli3 = (hmli)list0.get(0);
                    JSONObject jSONObject0 = new JSONObject();
                    JSONObject jSONObject1 = (JSONObject)this.b.b(hmli3, jSONObject0);
                    hmli hmli4 = (hmli)list0.get(1);
                    String s1 = (String)this.b.b(hmli4, "");
                    z = this.c.j(jSONObject1, s1);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(Boolean.valueOf(z));
        }
        catch(Exception exception0) {
            this.a.a("Exception executing hasKeyInJson method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli h(List list0) {
        boolean z = true;
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            return hmli0;
        }
        try {
            if(list0.size() != 1) {
                throw new IllegalArgumentException("Incorrect number of parameters");
            }
            hmli hmli1 = (hmli)list0.get(0);
            Object object0 = this.b.a(hmli1).a;
            if(!(object0 instanceof JSONObject)) {
                if(!(object0 instanceof JSONArray) || ((JSONArray)object0).length() != 0) {
                    z = false;
                }
            }
            else if(((JSONObject)object0).length() != 0) {
                z = false;
            }
            return new hmli(Boolean.valueOf(z));
        }
        catch(Exception exception0) {
            this.a.a("Exception executing merge json object method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli i(List list0) {
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            return hmli0;
        }
        try {
            if(list0.isEmpty()) {
                return this.c.b(null, 0);
            }
            switch(list0.size()) {
                case 1: {
                    hmli hmli1 = (hmli)list0.get(0);
                    JSONArray jSONArray0 = new JSONArray();
                    JSONArray jSONArray1 = (JSONArray)this.b.b(hmli1, jSONArray0);
                    return this.c.b(jSONArray1, 0);
                }
                case 2: {
                    hmli hmli2 = (hmli)list0.get(0);
                    JSONArray jSONArray2 = new JSONArray();
                    JSONArray jSONArray3 = (JSONArray)this.b.b(hmli2, jSONArray2);
                    hmli hmli3 = (hmli)list0.get(1);
                    int v = ((hmkg)this.b.b(hmli3, hmkg.a(Integer.valueOf(0)))).a.intValue();
                    return this.c.b(jSONArray3, v);
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
        }
        catch(Exception exception0) {
            this.a.a("Exception executing jsonArray method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli j(List list0) {
        JSONArray jSONArray0;
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            switch(list0.size()) {
                case 1: {
                    hmli hmli2 = (hmli)list0.get(0);
                    int v = ((hmkg)this.b.b(hmli2, hmkg.a(Integer.valueOf(0)))).a.intValue();
                    jSONArray0 = this.c.e(null, v);
                    break;
                }
                case 2: {
                    hmli hmli3 = (hmli)list0.get(0);
                    JSONArray jSONArray1 = new JSONArray();
                    JSONArray jSONArray2 = (JSONArray)this.b.b(hmli3, jSONArray1);
                    hmli hmli4 = (hmli)list0.get(1);
                    int v1 = ((hmkg)this.b.b(hmli4, hmkg.a(Integer.valueOf(0)))).a.intValue();
                    jSONArray0 = this.c.e(jSONArray2, v1);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(jSONArray0);
        }
        catch(Exception exception0) {
            this.a.a("Exception executing jsonArrayRemove method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli k(List list0) {
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            return hmli0;
        }
        try {
            if(list0.isEmpty()) {
                return this.c.c(null, null);
            }
            if(list0.size() != 2) {
                throw new IllegalArgumentException("Incorrect number of parameters");
            }
            hmli hmli1 = (hmli)list0.get(0);
            JSONObject jSONObject0 = new JSONObject();
            JSONObject jSONObject1 = (JSONObject)this.b.b(hmli1, jSONObject0);
            hmli hmli2 = (hmli)list0.get(1);
            String s = (String)this.b.b(hmli2, "");
            return this.c.c(jSONObject1, s);
        }
        catch(Exception exception0) {
            this.a.a("Exception executing jsonObject method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli l(List list0) {
        JSONObject jSONObject0;
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            switch(list0.size()) {
                case 1: {
                    hmli hmli2 = (hmli)list0.get(0);
                    String s = (String)this.b.b(hmli2, "");
                    jSONObject0 = this.c.g(null, s);
                    break;
                }
                case 2: {
                    hmli hmli3 = (hmli)list0.get(0);
                    JSONObject jSONObject1 = new JSONObject();
                    JSONObject jSONObject2 = (JSONObject)this.b.b(hmli3, jSONObject1);
                    hmli hmli4 = (hmli)list0.get(1);
                    String s1 = (String)this.b.b(hmli4, "");
                    jSONObject0 = this.c.g(jSONObject2, s1);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(jSONObject0);
        }
        catch(Exception exception0) {
            this.a.a("Exception executing jsonObjectRemove method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli m(List list0) {
        JSONArray jSONArray2;
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            switch(list0.size()) {
                case 1: {
                    hmli hmli2 = (hmli)list0.get(0);
                    JSONArray jSONArray0 = new JSONArray();
                    JSONArray jSONArray1 = (JSONArray)this.b.b(hmli2, jSONArray0);
                    jSONArray2 = this.c.f(null, jSONArray1);
                    break;
                }
                case 2: {
                    hmli hmli3 = (hmli)list0.get(0);
                    JSONArray jSONArray3 = new JSONArray();
                    JSONArray jSONArray4 = (JSONArray)this.b.b(hmli3, jSONArray3);
                    hmli hmli4 = (hmli)list0.get(1);
                    JSONArray jSONArray5 = new JSONArray();
                    JSONArray jSONArray6 = (JSONArray)this.b.b(hmli4, jSONArray5);
                    jSONArray2 = this.c.f(jSONArray4, jSONArray6);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(jSONArray2);
        }
        catch(Exception exception0) {
            this.a.a("Exception executing merge json array method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli n(List list0) {
        JSONObject jSONObject2;
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            switch(list0.size()) {
                case 1: {
                    hmli hmli2 = (hmli)list0.get(0);
                    JSONObject jSONObject0 = new JSONObject();
                    JSONObject jSONObject1 = (JSONObject)this.b.b(hmli2, jSONObject0);
                    jSONObject2 = this.c.h(null, jSONObject1);
                    break;
                }
                case 2: {
                    hmli hmli3 = (hmli)list0.get(0);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = (JSONObject)this.b.b(hmli3, jSONObject3);
                    hmli hmli4 = (hmli)list0.get(1);
                    JSONObject jSONObject5 = new JSONObject();
                    JSONObject jSONObject6 = (JSONObject)this.b.b(hmli4, jSONObject5);
                    jSONObject2 = this.c.h(jSONObject4, jSONObject6);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Incorrect number of parameters");
                }
            }
            return new hmli(jSONObject2);
        }
        catch(Exception exception0) {
            this.a.a("Exception executing merge json object method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    public final hmli o(List list0) {
        JSONObject jSONObject1;
        hmli hmli0 = hmlx.e(list0);
        if(hmli0 != null) {
            hmli hmli1 = new hmli(hmli0.d);
            hmli1.e = hmli0.e;
            return hmli1;
        }
        try {
            switch(list0.size()) {
                case 1: {
                    hmli hmli3 = (hmli)list0.get(0);
                    boolean z = ((Boolean)this.b.b(hmli3, Boolean.FALSE)).booleanValue();
                    jSONObject1 = this.c.i(null, z);
                    break;
                }
                case 2: {
                    hmli hmli4 = (hmli)list0.get(0);
                    JSONArray jSONArray1 = new JSONArray();
                    JSONArray jSONArray2 = (JSONArray)this.b.b(hmli4, jSONArray1);
                    hmli hmli5 = (hmli)list0.get(1);
                    boolean z1 = ((Boolean)this.b.b(hmli5, Boolean.FALSE)).booleanValue();
                    jSONObject1 = this.c.i(jSONArray2, z1);
                    break;
                }
                default: {
                    if(list0.size() <= 2) {
                        throw new IllegalArgumentException("Incorrect number of parameters");
                    }
                    JSONArray jSONArray0 = new JSONArray();
                    for(int v = 0; v < list0.size() - 1; ++v) {
                        hmli hmli2 = (hmli)list0.get(v);
                        JSONObject jSONObject0 = new JSONObject();
                        jSONArray0.put(this.b.b(hmli2, jSONObject0));
                    }
                    Boolean boolean0 = Boolean.FALSE;
                    jSONObject1 = this.c.i(jSONArray0, ((Boolean)this.b.b(((hmli)list0.get(list0.size() - 1)), boolean0)).booleanValue());
                    break;
                }
            }
            return new hmli(jSONObject1);
        }
        catch(Exception exception0) {
            this.a.a("Exception executing union method", exception0);
            return new hmli(exception0.getMessage());
        }
    }

    private final hmli p(hmli hmli0) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            return new hmli(this.b.b(hmli0, jSONObject0));
        }
        catch(Exception unused_ex) {
            try {
                JSONArray jSONArray0 = new JSONArray();
                return new hmli(this.b.b(hmli0, jSONArray0));
            }
            catch(Exception unused_ex) {
                IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("First param of the addOrUpdate should be either JSONObject or JSONArray.");
                this.a.a("Invalid params to invoke addOrUpdate method", illegalArgumentException0);
                throw new IllegalArgumentException("First param of the addOrUpdate should be either JSONObject or JSONArray.");
            }
        }
    }
}


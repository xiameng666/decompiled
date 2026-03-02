import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class hmmu extends ftry {
    hmqm a;
    private hmoq b;

    @Override  // ftry
    public final JSONArray a(JSONObject jSONObject0, JSONArray jSONArray0, ftrs ftrs0) {
        JSONObject jSONObject4;
        hmqm hmqm0;
        JSONArray jSONArray3;
        JSONObject jSONObject3;
        int v;
        JSONArray jSONArray1;
        this.a = new hmmt(this, ftrs0);
        try {
            try {
                jSONArray1 = new JSONArray();
                JSONObject jSONObject1 = new JSONObject();
                v = 0;
                while(true) {
                label_4:
                    if(v >= jSONArray0.length()) {
                        goto label_9;
                    }
                    if(v == jSONArray0.length() - 1) {
                        JSONObject jSONObject2 = jSONArray0.getJSONObject(v);
                        if(jSONObject2.has("schemaType") && jSONObject2.getString("schemaType").equals("DSL")) {
                            jSONObject1 = this.e(jSONObject0, hmmu.i(jSONObject2), this.a);
                        label_9:
                            if(jSONObject1 != null && jSONObject1.has("ticketFields")) {
                                JSONArray jSONArray2 = jSONObject1.getJSONArray("ticketFields");
                                for(int v1 = 0; v1 < jSONArray2.length(); ++v1) {
                                    jSONArray1.put(jSONArray2.get(v1));
                                }
                            }
                            return jSONArray1;
                        }
                        if(jSONObject0.has("MIFAREPlusState")) {
                            throw new IllegalArgumentException("Partner configuration should have DSL schema type for MIFAREPlus");
                        }
                    }
                    jSONObject3 = jSONArray0.getJSONObject(v);
                    jSONArray3 = jSONObject3.getJSONArray("ticketFields");
                    hmqm0 = this.a;
                    jSONObject4 = new JSONObject();
                    this.a = hmqm0;
                    break;
                }
            }
            catch(JSONException exception0) {
                throw new IllegalArgumentException(exception0.getMessage(), exception0);
            }
            try {
                int v2 = 0;
                this.b = hmop.a(new JSONObject(jSONObject0.toString()));
                for(int v3 = 0; v3 < jSONArray3.length(); ++v3) {
                    JSONObject jSONObject5 = (JSONObject)jSONArray3.get(v3);
                    if(jSONObject5.getString("fieldName").equals("locationOffest")) {
                        v2 = Integer.parseInt(((String)hmmu.n(hmmu.q(this.c(jSONObject5), jSONObject5, 0), jSONObject5)));
                        break;
                    }
                }
                int v4 = 0;
                while(true) {
                    if(v4 >= jSONArray3.length()) {
                        goto label_40;
                    }
                    this.f(jSONArray3, hmqm0, jSONObject4, v4, v2);
                    ++v4;
                }
            }
            catch(JSONException jSONException0) {
                try {
                    throw new hmou(jSONException0.getMessage(), jSONException0);
                label_40:
                    jSONObject4.put("configId", jSONObject3.get("configId"));
                    this.o(jSONObject3, jSONObject4);
                    jSONArray1.put(jSONObject4);
                    ++v;
                    goto label_4;
                }
                catch(JSONException exception0) {
                }
                throw new IllegalArgumentException(exception0.getMessage(), exception0);
            }
        }
        catch(hmou exception0) {
            throw new IllegalArgumentException(exception0.getMessage(), exception0);
        }
    }

    @Override  // ftry
    public final JSONArray b(JSONObject jSONObject0, JSONArray jSONArray0, ftrs ftrs0) {
        JSONObject jSONObject11;
        JSONArray jSONArray6;
        JSONObject jSONObject9;
        hmqm hmqm1;
        JSONArray jSONArray5;
        JSONObject jSONObject8;
        hmlg hmlg0;
        hmqm hmqm0;
        JSONObject jSONObject5;
        int v;
        JSONObject jSONObject3;
        JSONArray jSONArray2;
        JSONObject jSONObject1 = jSONObject0;
        JSONArray jSONArray1 = jSONArray0;
        this.a = new hmmt(this, ftrs0);
        JSONObject jSONObject2 = new JSONObject();
        try {
            try {
                jSONArray2 = new JSONArray();
                jSONObject3 = null;
                v = 0;
                while(true) {
                label_7:
                    if(v >= jSONArray1.length()) {
                        goto label_34;
                    }
                    if(v == jSONArray1.length() - 1) {
                        JSONObject jSONObject4 = jSONArray1.getJSONObject(v);
                        if(jSONObject4.has("schemaType") && jSONObject4.getString("schemaType").equals("DSL")) {
                            jSONObject5 = hmmu.i(jSONObject4);
                            hmqm0 = this.a;
                            break;
                        }
                        if(jSONObject1.has("MIFAREPlusState")) {
                            throw new IllegalArgumentException("Partner configuration should have DSL schema type for MIFAREPlus");
                        }
                    }
                    goto label_94;
                }
            }
            catch(JSONException exception0) {
                throw new IllegalArgumentException(exception0.getMessage(), exception0);
            }
            try {
                hmlg0 = new hmlg();
                hmlg0.b(jSONObject5, hmqm0);
                if(jSONObject1.has("DESFireState")) {
                    JSONArray jSONArray3 = jSONObject5.getJSONArray("fileAccessConfigList");
                    this.b = hmop.a(jSONObject1);
                    for(int v1 = 0; v1 < jSONArray3.length(); ++v1) {
                        this.h(hmlg0, jSONArray3, v1);
                    }
                }
                else {
                    goto label_26;
                }
            }
            catch(JSONException jSONException0) {
                throw new hmou(jSONException0.getMessage(), jSONException0);
            }
            jSONObject2 = (JSONObject)hmlg0.a().a;
            goto label_34;
            try {
            label_26:
                if(jSONObject1.has("MIFAREPlusState")) {
                    new hmna().a(jSONObject1, jSONObject5, hmlg0, hmqm0);
                }
            }
            catch(JSONException jSONException0) {
                try {
                    throw new hmou(jSONException0.getMessage(), jSONException0);
                }
                catch(JSONException exception0) {
                    throw new IllegalArgumentException(exception0.getMessage(), exception0);
                }
            }
        }
        catch(hmou exception0) {
            throw new IllegalArgumentException(exception0.getMessage(), exception0);
        }
        try {
            jSONObject2 = (JSONObject)hmlg0.a().a;
            goto label_34;
        }
        catch(Exception unused_ex) {
            try {
                try {
                    jSONObject2 = new JSONObject();
                label_34:
                    if(jSONObject3 != null) {
                        int v2 = 1;
                        while(v2 < jSONArray2.length()) {
                            JSONObject jSONObject6 = jSONArray2.getJSONObject(v2);
                            int v3 = v2 - 1;
                            while(v3 >= 0) {
                                JSONObject jSONObject7 = jSONArray2.getJSONObject(v3);
                                if(!jSONObject7.has(jSONObject3.getString("orderByField")) && !jSONObject6.has(jSONObject3.getString("orderByField"))) {
                                    break;
                                }
                                if((jSONObject7.get(jSONObject3.getString("orderByField")) instanceof String)) {
                                    String s = jSONObject7.getString(jSONObject3.getString("orderByField"));
                                    String s1 = jSONObject6.getString(jSONObject3.getString("orderByField"));
                                    if(!jSONObject3.getString("order").equals("ascending")) {
                                        if(s.compareToIgnoreCase(s1) < 0) {
                                            jSONArray2.put(v3 + 1, jSONArray2.getJSONObject(v3));
                                            --v3;
                                            continue;
                                        }
                                    }
                                    else if(s.compareToIgnoreCase(s1) > 0) {
                                        jSONArray2.put(v3 + 1, jSONArray2.getJSONObject(v3));
                                        --v3;
                                        continue;
                                    }
                                }
                                else if((jSONObject7.get(jSONObject3.getString("orderByField")) instanceof Double)) {
                                    Double double0 = jSONObject7.getDouble(jSONObject3.getString("orderByField"));
                                    Double double1 = jSONObject6.getDouble(jSONObject3.getString("orderByField"));
                                    if(!jSONObject3.getString("order").equals("ascending")) {
                                        if(double0.compareTo(double1) < 0) {
                                            jSONArray2.put(v3 + 1, jSONArray2.getJSONObject(v3));
                                            --v3;
                                            continue;
                                        }
                                    }
                                    else if(double0.compareTo(double1) > 0) {
                                        jSONArray2.put(v3 + 1, jSONArray2.getJSONObject(v3));
                                        --v3;
                                        continue;
                                    }
                                }
                                else {
                                    long v4 = jSONObject7.getLong(jSONObject3.getString("orderByField"));
                                    Long long0 = v4;
                                    long v5 = jSONObject6.getLong(jSONObject3.getString("orderByField"));
                                    Long long1 = v5;
                                    if(jSONObject3.getString("order").equals("ascending")) {
                                        long0.getClass();
                                        long1.getClass();
                                        if(v4 > v5) {
                                            jSONArray2.put(v3 + 1, jSONArray2.getJSONObject(v3));
                                            --v3;
                                            continue;
                                        }
                                    }
                                    else {
                                        long0.getClass();
                                        long1.getClass();
                                        if(v4 < v5) {
                                            jSONArray2.put(v3 + 1, jSONArray2.getJSONObject(v3));
                                            --v3;
                                            continue;
                                        }
                                    }
                                }
                                break;
                            }
                            jSONArray2.put(v3 + 1, jSONObject6);
                            ++v2;
                        }
                    }
                    if(jSONObject2 != null && jSONObject2.has("transactionFields")) {
                        JSONArray jSONArray4 = jSONObject2.getJSONArray("transactionFields");
                        for(int v6 = 0; v6 < jSONArray4.length(); ++v6) {
                            jSONArray2.put(jSONArray4.get(v6));
                        }
                    }
                    return jSONArray2;
                label_94:
                    jSONObject8 = jSONArray1.getJSONObject(v);
                    jSONArray5 = jSONObject8.getJSONArray("transactionFields");
                    hmqm1 = this.a;
                    jSONObject9 = new JSONObject();
                }
                catch(JSONException exception0) {
                    throw new IllegalArgumentException(exception0.getMessage(), exception0);
                }
                try {
                    HashMap hashMap0 = new HashMap();
                    HashMap hashMap1 = new HashMap();
                    this.b = hmop.a(new JSONObject(jSONObject1.toString()));
                    for(int v7 = 0; v7 < jSONArray5.length(); ++v7) {
                        this.g(jSONArray5.getJSONObject(v7), jSONObject9, hashMap0, hmqm1);
                        String s2 = jSONArray5.getJSONObject(v7).getString("fieldName");
                        if(jSONObject9.has(s2)) {
                            hashMap1.put(s2, jSONObject9.getJSONArray(s2));
                        }
                    }
                    jSONArray6 = new JSONArray();
                    for(Object object0: hashMap1.keySet()) {
                        String s3 = (String)object0;
                        JSONArray jSONArray7 = (JSONArray)hashMap1.get(s3);
                        int v8 = 0;
                        while(v8 < jSONArray7.length()) {
                            if(jSONArray6.length() <= v8) {
                                JSONObject jSONObject10 = new JSONObject();
                                jSONObject11 = jSONObject2;
                                jSONObject10.put(s3, jSONArray7.get(v8));
                                jSONArray6.put(jSONObject10);
                            }
                            else {
                                jSONObject11 = jSONObject2;
                                jSONArray6.getJSONObject(v8).put(s3, jSONArray7.get(v8));
                            }
                            ++v8;
                            jSONObject2 = jSONObject11;
                        }
                        hashMap1 = hashMap1;
                    }
                    for(int v9 = 0; v9 < jSONArray6.length(); ++v9) {
                        JSONObject jSONObject12 = jSONArray6.getJSONObject(v9);
                        for(Object object1: hashMap0.keySet()) {
                            jSONObject12.put(((String)object1), hashMap0.get(((String)object1)));
                        }
                    }
                    goto label_144;
                }
                catch(JSONException jSONException1) {
                    try {
                        throw new hmou(jSONException1.getMessage(), jSONException1);
                    label_144:
                        for(int v10 = 0; v10 < jSONArray6.length(); ++v10) {
                            this.o(jSONObject8, jSONArray6.getJSONObject(v10));
                        }
                        if(jSONObject8.getJSONObject("extraParameters").has("ordering")) {
                            jSONObject3 = jSONObject8.getJSONObject("extraParameters").getJSONObject("ordering");
                        }
                        for(int v11 = 0; v11 < jSONArray6.length(); ++v11) {
                            jSONArray2.put(jSONArray6.getJSONObject(v11));
                        }
                        ++v;
                        jSONObject1 = jSONObject0;
                        jSONArray1 = jSONArray0;
                        jSONObject2 = jSONObject2;
                        goto label_7;
                    }
                    catch(JSONException exception0) {
                    }
                }
            }
            catch(hmou exception0) {
            }
        }
        throw new IllegalArgumentException(exception0.getMessage(), exception0);
    }

    private final hmoe c(JSONObject jSONObject0) {
        return this.d(jSONObject0.getJSONObject("extraParameters").getJSONObject("fileAccess"));
    }

    private final hmoe d(JSONObject jSONObject0) {
        String s = jSONObject0.getString("appId");
        int v = jSONObject0.getInt("fileId");
        byte[] arr_b = hmpy.I(s);
        int v1 = hmpy.N(arr_b, 0, arr_b.length);
        for(Object object0: this.b.e) {
            hmnk hmnk0 = (hmnk)object0;
            if(hmnk0.a == v1) {
                for(Object object1: hmnk0.e) {
                    hmoe hmoe0 = (hmoe)object1;
                    if(hmoe0.b == v) {
                        return hmoe0;
                    }
                }
                throw new hmmx();
            }
        }
        throw new hmmv();
    }

    private final JSONObject e(JSONObject jSONObject0, JSONObject jSONObject1, hmqm hmqm0) {
        hmlg hmlg0;
        try {
            hmlg0 = new hmlg();
            hmlg0.b(jSONObject1, hmqm0);
            if(jSONObject0.has("DESFireState")) {
                JSONArray jSONArray0 = jSONObject1.getJSONArray("fileAccessConfigList");
                this.b = hmop.a(jSONObject0);
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    try {
                        JSONObject jSONObject2 = jSONArray0.getJSONObject(v);
                        hmmu.p(hmlg0, this.d(jSONObject2), jSONObject2);
                    }
                    catch(UnsupportedOperationException | hmmx | hmmv | hmmy exception0) {
                        this.a.a(((RuntimeException)exception0).getMessage(), exception0);
                    }
                }
            }
            else if(jSONObject0.has("MIFAREPlusState")) {
                new hmna().a(jSONObject0, jSONObject1, hmlg0, hmqm0);
            }
        }
        catch(JSONException jSONException0) {
            throw new hmou(jSONException0.getMessage(), jSONException0);
        }
        try {
            return (JSONObject)hmlg0.a().a;
        }
        catch(Exception unused_ex) {
            return new JSONObject();
        }
    }

    private final void f(JSONArray jSONArray0, hmqm hmqm0, JSONObject jSONObject0, int v, int v1) {
        Object object0;
        try {
            JSONObject jSONObject1 = (JSONObject)jSONArray0.get(v);
            String s = jSONObject1.getString("fieldName");
            if(s.equals("locationOffest")) {
                return;
            }
            if(jSONObject1.getJSONObject("extraParameters").has("staticReturnType")) {
                jSONObject0.put(s, hmmu.m(jSONObject1));
                return;
            }
            hmoe hmoe0 = this.c(jSONObject1);
            if((hmoe0 instanceof hmof)) {
                throw new UnsupportedOperationException("Parsing of transcation info is not supported, please use extractTransactionInfo API");
            }
            if((hmoe0 instanceof hmoh)) {
                long[] arr_v = hmmu.j(hmoe0);
                String s1 = jSONObject1.getString("returnType");
                String s2 = jSONObject1.getJSONObject("extraParameters").getJSONObject("conversionConfigs").optString("factor");
                object0 = hmpw.a(new hmpx(Long.toString(arr_v[0]), true, false), s1, (s2.isEmpty() ? ((double)1.0) : Double.valueOf(s2)).doubleValue());
            }
            else {
                object0 = hmmu.n(hmmu.q(hmoe0, jSONObject1, v1), jSONObject1);
            }
            if((object0 instanceof byte[])) {
                Arrays.toString(((byte[])object0));
            }
            jSONObject0.put(s, object0);
        }
        catch(UnsupportedOperationException | hmmx | hmmv | hmmy | hmpz exception0) {
            hmqm0.a(((RuntimeException)exception0).getMessage(), exception0);
        }
    }

    private final void g(JSONObject jSONObject0, JSONObject jSONObject1, Map map0, hmqm hmqm0) {
        try {
            String s = jSONObject0.getString("fieldName");
            if(jSONObject0.getJSONObject("extraParameters").has("staticReturnType")) {
                map0.put(s, hmmu.m(jSONObject0));
                return;
            }
            hmoe hmoe0 = this.c(jSONObject0);
            if((hmoe0 instanceof hmof)) {
                List list0 = hmmu.l(((hmof)hmoe0), jSONObject0.getJSONObject("extraParameters").getJSONObject("fileAccess"));
                JSONArray jSONArray0 = new JSONArray();
                for(Object object0: list0) {
                    Object object1 = hmmu.n(((byte[])object0), jSONObject0);
                    jSONArray0.put(object1);
                    if((object1 instanceof byte[])) {
                        Arrays.toString(((byte[])object1));
                    }
                }
                jSONObject1.put(s, jSONArray0);
                return;
            }
            map0.put(s, hmmu.n(hmmu.q(hmoe0, jSONObject0, 0), jSONObject0));
        }
        catch(UnsupportedOperationException | hmmx | hmmv | hmmy | hmpz exception0) {
            hmqm0.a(((RuntimeException)exception0).getMessage(), exception0);
        }
    }

    private final void h(hmlg hmlg0, JSONArray jSONArray0, int v) {
        try {
            JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
            hmmu.p(hmlg0, this.d(jSONObject0), jSONObject0);
        }
        catch(JSONException jSONException0) {
            throw new hmou(jSONException0.getMessage(), jSONException0);
        }
        catch(UnsupportedOperationException | hmmx | hmmv | hmmy exception0) {
            this.a.a(((RuntimeException)exception0).getMessage(), exception0);
        }
    }

    private static final JSONObject i(JSONObject jSONObject0) {
        if(jSONObject0.has("schemaVersion") && ((double)jSONObject0.getLong("schemaVersion")) == 1.0) {
            try {
                String s = hmlo.a("minifiedDslSnippets", "dslSnippets");
                String s1 = hmlo.a("minifiedFunctionMap", "functionMap");
                if(jSONObject0.has(s)) {
                    jSONObject0.put("minifiedDslSnippets", hmlo.b(((JSONArray)jSONObject0.get(s))));
                }
                if(jSONObject0.has(s1)) {
                    JSONObject jSONObject1 = jSONObject0.getJSONObject(s1);
                    JSONObject jSONObject2 = new JSONObject();
                    Iterator iterator0 = jSONObject1.keys();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        jSONObject2.put(((String)object0), hmlo.b(((JSONArray)jSONObject1.get(((String)object0)))));
                    }
                    jSONObject0.put("minifiedFunctionMap", jSONObject2);
                    return jSONObject0;
                }
                return jSONObject0;
            }
            catch(JSONException unused_ex) {
                return null;
            }
        }
        return jSONObject0;
    }

    private static final long[] j(hmoe hmoe0) {
        if((hmoe0 instanceof hmoh)) {
            return ((hmoh)hmoe0).l.g();
        }
        throw new hmmy("Given file is not of value type.");
    }

    private static final byte[] k(hmoe hmoe0, JSONObject jSONObject0, int v) {
        int v1 = jSONObject0.getInt("positionStart");
        int v2 = jSONObject0.getInt("positionEnd");
        if(jSONObject0.has("considerOffset") && jSONObject0.getString("considerOffset").equals("true")) {
            v1 += v;
            v2 += v;
        }
        byte[] arr_b = hmoe0.a;
        int v3 = v2 - v1 + v1;
        if(v3 <= arr_b.length) {
            return Arrays.copyOfRange(arr_b, v1, v3);
        }
        throw new hmmy("end byte offset from the start byte offset is greater than data length");
    }

    private static final List l(hmof hmof0, JSONObject jSONObject0) {
        List list0 = new ArrayList();
        int v = jSONObject0.getInt("positionStart");
        int v1 = jSONObject0.getInt("positionEnd");
        int v2 = v1 - v;
        int v3 = hmof0.l;
        if(v3 != 0) {
            if(v2 > v3) {
                v2 = v3;
            }
            if(hmof0.j * v1 > hmof0.a.length) {
                throw new hmmy("End Record offset from the start record is greater than data length");
            }
            int v4 = jSONObject0.getInt("recPositionStart");
            int v5 = jSONObject0.getInt("recPositionEnd") - v4 + v4;
            int v6 = hmof0.j;
            if(v5 > v6) {
                throw new hmmy("end byte offset from the start byte offset is greater than record size for record files.");
            }
            byte[] arr_b = Arrays.copyOfRange(Arrays.copyOfRange(hmof0.a, 0, hmof0.l * v6), v * hmof0.j, v1 * hmof0.j);
            int v8 = 0;
            for(int v7 = 0; v7 < v2; ++v7) {
                byte[] arr_b1 = Arrays.copyOfRange(Arrays.copyOfRange(arr_b, v8, hmof0.j + v8), v4, v5);
                hmpy.C(arr_b1);
                list0.add(arr_b1);
                v8 += hmof0.j;
            }
            return list0;
        }
        return list0;
    }

    private static final Object m(JSONObject jSONObject0) {
        if(jSONObject0.getJSONObject("extraParameters").has("conversionConfigs") && jSONObject0.getJSONObject("extraParameters").getJSONObject("conversionConfigs").has("stringType")) {
            String s = jSONObject0.getJSONObject("extraParameters").getString("staticReturnType");
            jSONObject0.getJSONObject("extraParameters").get("conversionConfigs");
            String s1 = jSONObject0.getJSONObject("extraParameters").getJSONObject("conversionConfigs").getString("stringType");
            String s2 = jSONObject0.getString("returnType");
            return hmpw.h(new hmpx(s, s1.equals("numeral"), s1.equals("hexString")), "string", s2, Double.valueOf(1.0), Double.valueOf(0.0));
        }
        return jSONObject0.getJSONObject("extraParameters").getString("staticReturnType");
    }

    private static final Object n(byte[] arr_b, JSONObject jSONObject0) {
        int v1;
        int v;
        hmpy.C(arr_b);
        String s = jSONObject0.getString("returnType");
        JSONObject jSONObject1 = jSONObject0.getJSONObject("extraParameters").getJSONObject("conversionConfigs");
        jSONObject1.getString("type");
        byte[] arr_b1 = (byte[])arr_b.clone();
        try {
            v = 0;
            v = jSONObject0.getJSONObject("extraParameters").getJSONObject("fileAccess").getInt("removeStartBits");
            v1 = 0;
        }
        catch(JSONException unused_ex) {
        }
        try {
            v1 = jSONObject0.getJSONObject("extraParameters").getJSONObject("fileAccess").getInt("removeEndBits");
        }
        catch(JSONException unused_ex) {
        }
        if(v > 0 || v1 > 0) {
            if(v1 > 7 || v > 7) {
                throw new hmpz("Bit offset parameters are incorrect! Need to be between 0-7 but are: startBitsToRemove: " + v + ": endBitsToRemove: " + v1);
            }
            if(v > 0) {
                arr_b1[0] = (byte)(arr_b1[0] & 0xFF & 0xFF >> v);
            }
            if(v1 > 0) {
                byte[] arr_b2 = new BigInteger(1, arr_b1).shiftRight(v1).toByteArray();
                if(arr_b2.length == arr_b1.length) {
                    arr_b1 = arr_b2;
                }
                else {
                    int v2 = arr_b1.length - arr_b2.length;
                    arr_b1 = new byte[arr_b1.length];
                    System.arraycopy(arr_b2, 0, arr_b1, v2, arr_b2.length);
                }
            }
        }
        String s1 = jSONObject1.getString("byteEndian");
        String s2 = jSONObject1.getString("bitEndian");
        byte[] arr_b3 = (byte[])arr_b1.clone();
        if(!s1.equals("big")) {
            arr_b3 = hmpy.L(arr_b3);
            if(s2.equals("small")) {
                hmpw.g(arr_b3, v, v1);
            }
        }
        else if(s2.equals("small")) {
            hmpw.g(arr_b3, v, v1);
        }
        String s3 = jSONObject1.getString("bytesEncoding");
        if((arr_b3 instanceof String)) {
            arr_b3 = hmpy.I(((String)arr_b3));
        }
        else if(!(arr_b3 instanceof byte[])) {
            throw new hmpz("Given data object cannot be converted to bytes.");
        }
        if(s3 != null && !s3.isEmpty()) {
            if(s3.equals("base64")) {
                arr_b3 = hmql.a(arr_b3);
            }
            else if(s3.equals("hex") || s3.equals("base16")) {
                arr_b3 = hmpy.I(new String(arr_b3, Charset.forName("US-ASCII")));
            }
            else if(!s3.equals("none")) {
                throw new hmpz("Not supported numeric encoding : " + s3);
            }
        }
        double f = jSONObject1.has("factor") ? jSONObject1.getDouble("factor") : 1.0;
        Double double0 = f;
        double f1 = jSONObject1.has("addBefore") ? jSONObject1.getDouble("addBefore") : 0.0;
        Double double1 = f1;
        double f2 = jSONObject1.has("addAfter") ? jSONObject1.getDouble("addAfter") : 0.0;
        Double double2 = f2;
        if(jSONObject1.getString("type").equals("date")) {
            String s4 = jSONObject1.optString("dateFormat");
            jSONObject1.optString("locale");
            if(jSONObject1.has("stringEncoding")) {
                String s5 = jSONObject1.optString("stringType");
                arr_b3 = new hmpx(arr_b3, s5.equals("numeral"), s5.equals("hexString"), jSONObject1.optString("stringEncoding"));
            }
            if((arr_b3 instanceof hmpx) && !((hmpx)arr_b3).b && !((hmpx)arr_b3).c && s.equals("string")) {
                return ((hmpx)arr_b3).a;
            }
            Date date0 = hmpw.e(arr_b3, s4);
            double f3 = (double)date0.getTime();
            double1.getClass();
            double0.getClass();
            double2.getClass();
            long v3 = (long)((f3 + f1) * f + f2);
            if(s.equals("long")) {
                return v3;
            }
            if(s.equals("bytes")) {
                return hmpw.f(v3);
            }
            if(s.equals("string")) {
                return hmpy.C(hmpw.f(date0.getTime()));
            }
            throw new hmpz("This output type of date is not supported or complete information for conversion is not provided.");
        }
        if(s.equals("enumString")) {
            Integer integer0 = (Integer)hmpw.h(arr_b3, jSONObject1.getString("type"), "int", double0, Double.valueOf(0.0));
            JSONObject jSONObject2 = jSONObject0.getJSONObject("extraParameters").getJSONObject("mappings");
            if(jSONObject2 == null) {
                throw new hmmz();
            }
            JSONArray jSONArray0 = jSONObject2.getJSONArray("maps");
            for(int v4 = 0; v4 < jSONArray0.length(); ++v4) {
                JSONObject jSONObject3 = jSONArray0.getJSONObject(v4);
                if(jSONObject3.getInt("id") == ((int)integer0)) {
                    jSONObject3.getString("map");
                    return jSONObject3.getString("map");
                }
            }
            return jSONObject2.getString("default");
        }
        byte[] arr_b4 = jSONObject1.getString("type").equals("string") || jSONObject1.has("stringEncoding") ? hmpw.h(new hmpx(arr_b3, jSONObject1.optString("stringType").equals("numeral"), jSONObject1.optString("stringType").equals("hexString"), jSONObject1.optString("stringEncoding")), jSONObject1.getString("type"), s, double0, double1) : hmpw.h(arr_b3, jSONObject1.getString("type"), s, double0, double1);
        return s.equals("bytes") ? hmpy.C(arr_b4) : arr_b4;
    }

    private final void o(JSONObject jSONObject0, JSONObject jSONObject1) {
        if(jSONObject0.has("extraParameters")) {
            JSONObject jSONObject2 = jSONObject0.getJSONObject("extraParameters");
            if(jSONObject2.has("dynamicFieldData")) {
                JSONArray jSONArray0 = jSONObject2.getJSONArray("dynamicFieldData");
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject3 = jSONArray0.getJSONObject(v);
                    String s = jSONObject3.getString("fieldName");
                    if(jSONObject1.has(s)) {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("extraParameters");
                        if(jSONObject4.has("dynamicMapping")) {
                            JSONObject jSONObject5 = jSONObject4.getJSONObject("dynamicMapping");
                            Object object0 = jSONObject1.get(s);
                            if(jSONObject5.get("fromCard").equals(object0)) {
                                jSONObject5.get("replaceWith");
                                jSONObject1.put(s, jSONObject5.get("replaceWith"));
                            }
                            else {
                                hmqm hmqm0 = this.a;
                                String s1 = String.valueOf(jSONObject5.get("fromCard"));
                                ((hmmt)hmqm0).a.b("silently removing field: " + s + " as dynamic mapping was not matching. Expected filed content was: " + s1 + " but was: " + object0);
                                jSONObject1.remove(s);
                            }
                        }
                    }
                }
            }
        }
    }

    private static final void p(hmlg hmlg0, hmoe hmoe0, JSONObject jSONObject0) {
        try {
            if((hmoe0 instanceof hmof)) {
                String s = jSONObject0.getString("key");
                boolean z = jSONObject0.has("saveAsRecordList") ? jSONObject0.getBoolean("saveAsRecordList") : false;
                List list0 = hmmu.l(((hmof)hmoe0), jSONObject0);
                if(z) {
                    for(int v = 0; v < list0.size(); ++v) {
                        hmlg0.c.b.add(ByteBuffer.wrap(((byte[])list0.get(v))));
                    }
                    return;
                }
                byte[] arr_b = new byte[0];
                for(int v1 = 0; v1 < list0.size(); ++v1) {
                    arr_b = hmpy.F(new byte[][]{arr_b, ((byte[])list0.get(v1))});
                }
                hmkd hmkd0 = new hmkd(new hmli(ByteBuffer.wrap(arr_b)), false);
                hmlg0.c.b(s, hmkd0);
                return;
            }
            if((hmoe0 instanceof hmoh)) {
                String s1 = jSONObject0.getString("key");
                long[] arr_v = hmmu.j(hmoe0);
                hmkd hmkd1 = new hmkd(new hmli(ByteBuffer.wrap(ByteBuffer.allocate(8).putLong(arr_v[0]).array())), false);
                hmlg0.c.b(s1, hmkd1);
                return;
            }
            String s2 = jSONObject0.getString("key");
            hmkd hmkd2 = new hmkd(new hmli(ByteBuffer.wrap(hmmu.k(hmoe0, jSONObject0, 0))), false);
            hmlg0.c.b(s2, hmkd2);
        }
        catch(JSONException jSONException0) {
            throw new hmou(jSONException0.getMessage(), jSONException0);
        }
    }

    private static final byte[] q(hmoe hmoe0, JSONObject jSONObject0, int v) {
        return hmmu.k(hmoe0, jSONObject0.getJSONObject("extraParameters").getJSONObject("fileAccess"), v);
    }
}


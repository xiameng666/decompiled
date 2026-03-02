import android.util.Base64;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public final class bnez implements bnet {
    public final Integer a;
    public final Double b;
    public final String c;
    public final byte[] d;
    public final List e;

    public bnez(Integer integer0, Double double0, String s, byte[] arr_b, List list0) {
        this.a = integer0;
        this.b = double0;
        this.c = s;
        this.d = arr_b;
        batl.c(((boolean)(list0.isEmpty() ^ 1)), "Server provided empty list of registered keys");
        this.e = list0;
        HashSet hashSet0 = new HashSet();
        if(s != null) {
            hashSet0.add(s);
        }
        for(Object object0: list0) {
            boolean z = false;
            batl.c(((RegisteredKey)object0).b != null || this.c != null, "Server provided request with null appId and no request appId");
            if(((RegisteredKey)object0).c != null || this.d != null) {
                z = true;
            }
            batl.c(z, "Server provided request with null challenge and no default challenge");
            String s1 = ((RegisteredKey)object0).b;
            if(s1 != null) {
                hashSet0.add(s1);
            }
        }
    }

    @Override  // blyh
    public final JSONObject a() {
        throw null;
    }

    public static List b(JSONArray jSONArray0) {
        byte[] arr_b;
        ProtocolVersion protocolVersion0;
        List list0 = new ArrayList();
        for(int v = 0; v < jSONArray0.length(); ++v) {
            JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
            String s = null;
            String s1 = jSONObject0.has("challenge") ? jSONObject0.getString("challenge") : null;
            String s2 = jSONObject0.has("version") ? jSONObject0.getString("version") : null;
            try {
                protocolVersion0 = ProtocolVersion.b(s2);
            }
            catch(bndq bndq0) {
                throw new JSONException(bndq0.toString());
            }
            String s3 = jSONObject0.getString("keyHandle");
            try {
                arr_b = Base64.decode(s3, 8);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new JSONException(illegalArgumentException0.toString());
            }
            KeyHandle keyHandle0 = new KeyHandle(arr_b, protocolVersion0, (jSONObject0.has("transports") ? Transport.b(jSONObject0.getJSONArray("transports")) : null));
            if(jSONObject0.has("appId")) {
                s = jSONObject0.getString("appId");
            }
            list0.add(new RegisteredKey(keyHandle0, s1, s));
        }
        return list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bnez) ? bata.b(this.a, ((bnez)object0).a) && bata.b(this.b, ((bnez)object0).b) && bata.b(this.c, ((bnez)object0).c) && Arrays.equals(this.d, ((bnez)object0).d) && bata.b(this.e, ((bnez)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.d) * 0x1F + Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e});
    }

    @Override
    public final String toString() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("type", bnev.b.c);
            Integer integer0 = this.a;
            if(integer0 != null) {
                jSONObject0.put("requestId", integer0);
            }
            Double double0 = this.b;
            if(double0 != null) {
                jSONObject0.put("timeoutSeconds", double0);
            }
            String s = this.c;
            if(s != null) {
                jSONObject0.put("appId", s);
            }
            byte[] arr_b = this.d;
            if(arr_b != null) {
                jSONObject0.put("challenge", Base64.encodeToString(arr_b, 11));
            }
            JSONArray jSONArray0 = new JSONArray();
            Iterator iterator0 = this.e.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    jSONObject0.put("registeredKeys", jSONArray0);
                    return jSONObject0.toString();
                }
                Object object0 = iterator0.next();
                RegisteredKey registeredKey0 = (RegisteredKey)object0;
                JSONObject jSONObject1 = new JSONObject();
                try {
                    String s1 = registeredKey0.c;
                    if(s1 != null) {
                        jSONObject1.put("challenge", s1);
                    }
                    KeyHandle keyHandle0 = registeredKey0.a;
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        byte[] arr_b1 = keyHandle0.b;
                        if(arr_b1 != null) {
                            jSONObject2.put("keyHandle", Base64.encodeToString(arr_b1, 11));
                        }
                        ProtocolVersion protocolVersion0 = keyHandle0.c;
                        if(protocolVersion0 != null) {
                            jSONObject2.put("version", protocolVersion0.d);
                        }
                        List list0 = keyHandle0.d;
                        if(list0 != null) {
                            JSONArray jSONArray1 = new JSONArray();
                            for(Object object1: list0) {
                                jSONArray1.put(((Transport)object1).h);
                            }
                            jSONObject2.put("transports", jSONArray1);
                        }
                    }
                    catch(JSONException jSONException2) {
                        throw new RuntimeException(jSONException2);
                    }
                    Iterator iterator2 = jSONObject2.keys();
                    while(iterator2.hasNext()) {
                        Object object2 = iterator2.next();
                        jSONObject1.put(((String)object2), jSONObject2.get(((String)object2)));
                    }
                    String s2 = registeredKey0.b;
                    if(s2 != null) {
                        jSONObject1.put("appId", s2);
                    }
                }
                catch(JSONException jSONException1) {
                    throw new RuntimeException(jSONException1);
                }
                jSONArray0.put(jSONObject1);
            }
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException(jSONException0);
        }
    }
}


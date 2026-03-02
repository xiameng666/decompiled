import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class hmpn {
    public final hmph a;
    public final hmpr b;
    public final hmpl c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public final hmpm g;
    public final hmpj h;
    public JSONObject i;
    public int j;

    static {
        hmpb.I("A000000396564341FFFFFFFFFFFFFFFF");
    }

    public hmpn() {
        this.d = new byte[8];
        this.e = new byte[16];
        this.f = new byte[]{0, 0, 0, 0, 0, 0, 0};
        this.j = 0;
        this.g = new hmpm();
        this.h = new hmpj();
        this.a = new hmph();
        this.b = new hmpr();
        this.c = new hmpl();
    }

    public final void a(JSONObject jSONObject0) {
        try {
            JSONObject jSONObject1 = jSONObject0.getJSONObject("MIFAREPlusState");
            if(jSONObject0.has("transactionSequence")) {
                this.i = jSONObject0.getJSONObject("transactionSequence");
            }
            if(jSONObject0.has("persistenceMode")) {
                this.j = hmqh.b(jSONObject0.getString("persistenceMode"));
            }
            this.f = hmpy.I(jSONObject1.getString("piccUid"));
            this.e = hmpy.I(jSONObject1.getString("dfName"));
            JSONObject jSONObject2 = jSONObject1.getJSONObject("mfpConfigurationBlock");
            this.g.a(jSONObject2);
            JSONObject jSONObject3 = jSONObject1.getJSONObject("fieldConfigurationBlock");
            this.h.a(jSONObject3);
            if(!jSONObject1.isNull("fciData")) {
                this.d = hmql.a(jSONObject1.getString("fciData").getBytes(StandardCharsets.US_ASCII));
            }
            hmph hmph0 = this.a;
            JSONArray jSONArray0 = jSONObject1.getJSONArray("blocks");
            int v1 = 0;
            while(true) {
                if(v1 < jSONArray0.length()) {
                    goto label_33;
                }
                if(!jSONObject1.isNull("transactionMACBlocks")) {
                    JSONObject jSONObject4 = jSONObject1.getJSONObject("transactionMACBlocks");
                    this.b.a(jSONObject4);
                }
                hmpl hmpl0 = this.c;
                JSONArray jSONArray1 = jSONObject1.getJSONArray("keys");
                for(int v = 0; true; ++v) {
                    if(v >= jSONArray1.length()) {
                        return;
                    }
                    hmpk hmpk0 = new hmpk();
                    try {
                        hmpk0.a(((JSONObject)jSONArray1.get(v)));
                    }
                    catch(JSONException jSONException1) {
                        throw new hmou(jSONException1.getMessage());
                    }
                    hmpl0.put(Integer.valueOf(hmpk0.c), hmpk0);
                }
                try {
                label_33:
                    JSONObject jSONObject5 = (JSONObject)jSONArray0.get(v1);
                    if(jSONObject5 != null && jSONObject5.length() > 0) {
                        int v2 = jSONObject5.getInt("blockNumber");
                        Integer integer0 = v2;
                        byte[] arr_b = hmql.a(jSONObject5.getString("data").getBytes(StandardCharsets.US_ASCII));
                        integer0.getClass();
                        if(hmph.d(v2)) {
                            hmph0.put(integer0, new hmpo(arr_b, integer0));
                        }
                        else {
                            hmph0.put(integer0, new hmpi(arr_b, integer0));
                        }
                    }
                    ++v1;
                    continue;
                }
                catch(JSONException jSONException2) {
                }
                break;
            }
            throw new hmou(jSONException2.getMessage());
        }
        catch(JSONException jSONException0) {
            throw new hmou(jSONException0.getMessage());
        }
    }
}


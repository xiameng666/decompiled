import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class hmna {
    hmqm a;
    private hmpn b;

    public final void a(JSONObject jSONObject0, JSONObject jSONObject1, hmlg hmlg0, hmqm hmqm0) {
        hmpn hmpn0 = new hmpn();
        this.b = hmpn0;
        hmpn0.a(jSONObject0);
        this.a = hmqm0;
        JSONArray jSONArray0 = jSONObject1.getJSONArray("blockAccessConfigList");
        for(int v = 0; v < jSONArray0.length(); ++v) {
            this.b(hmlg0, jSONArray0, v);
        }
    }

    private final void b(hmlg hmlg0, JSONArray jSONArray0, int v) {
        byte[] arr_b;
        try {
            JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
            try {
                String s = jSONObject0.getString("key");
                int v1 = jSONObject0.has("blockNumber") ? jSONObject0.getInt("blockNumber") : jSONObject0.getInt("startBlockNumber");
                if(this.b.a.containsKey(Integer.valueOf(v1))) {
                    int v2 = jSONObject0.getInt("positionStart");
                    int v3 = jSONObject0.getInt("positionEnd");
                    int v4 = jSONObject0.has("startBlockNumber") ? jSONObject0.getInt("startBlockNumber") : -1;
                    int v5 = jSONObject0.has("endBlockNumber") ? jSONObject0.getInt("endBlockNumber") : -1;
                    int v6 = jSONObject0.has("blockNumber") ? jSONObject0.getInt("blockNumber") : -1;
                    if(v6 == -1) {
                        if(v4 == -1 || v5 == -1) {
                            throw new hmmw("end position from the start position is greater than data length");
                        }
                        if(v5 < v4) {
                            throw new hmmw("end block number is less than startBlockNumber");
                        }
                        arr_b = new byte[(v5 - v4) * 16];
                        int v7 = 0;
                        while(v4 < v5) {
                            byte[] arr_b1 = this.b.a.b(v4).b();
                            System.arraycopy(arr_b1, 0, arr_b, v7, 16);
                            v7 = arr_b1.length;
                            ++v4;
                        }
                    }
                    else {
                        arr_b = this.b.a.b(v6).b();
                    }
                    int v8 = v3 - v2 + v2;
                    if(v8 > arr_b.length) {
                        throw new hmmw("end position from the start position is greater than data length");
                    }
                    hmkd hmkd0 = new hmkd(new hmli(ByteBuffer.wrap(Arrays.copyOfRange(arr_b, v2, v8))), false);
                    hmlg0.c.b(s, hmkd0);
                }
            }
            catch(JSONException | hmoy exception1) {
                throw new hmou(exception1.getMessage(), exception1);
            }
        }
        catch(JSONException jSONException0) {
            throw new hmou(jSONException0.getMessage(), jSONException0);
        }
        catch(UnsupportedOperationException | hmmx | hmmv | hmmw exception0) {
            this.a.a(((RuntimeException)exception0).getMessage(), exception0);
        }
    }
}


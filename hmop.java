import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class hmop {
    public static hmoq a(JSONObject jSONObject0) {
        hmoe hmoe0;
        hmoq hmoq0 = new hmoq();
        JSONObject jSONObject1 = jSONObject0.getJSONObject("DESFireState");
        if(jSONObject0.has("transactionSequence")) {
            hmoq0.g = jSONObject0.getJSONObject("transactionSequence");
        }
        if(jSONObject0.has("persistenceMode")) {
            hmoq0.l = hmqh.b(jSONObject0.getString("persistenceMode"));
        }
        if(jSONObject0.has("type")) {
            hmoq0.k = jSONObject0.getString("type");
        }
        if(jSONObject1.has("isAuthVCMandatory")) {
            hmoq0.a(jSONObject1.getBoolean("isAuthVCMandatory"));
        }
        if(jSONObject1.has("isPCMandatory")) {
            hmoq0.b(jSONObject1.getBoolean("isPCMandatory"));
        }
        hmoq0.d = (byte)jSONObject1.getInt("piccKeySettings");
        hmoq0.b = jSONObject1.getBoolean("isRandomIdEnabled");
        hmoq0.c = jSONObject1.getBoolean("isFormatDisabled");
        hmoq0.a = hmpy.I(jSONObject1.getString("piccUid"));
        hmoq0.f = jSONObject1.getInt("freeBlocks");
        LinkedList linkedList0 = new LinkedList();
        JSONArray jSONArray0 = jSONObject1.getJSONArray("applications");
        for(int v = 0; v < jSONArray0.length(); ++v) {
            JSONObject jSONObject2 = (JSONObject)jSONArray0.get(v);
            hmnk hmnk0 = new hmnk(jSONObject2.getInt("applicationId"), ((byte)jSONObject2.getInt("keySettingsOne")), ((byte)jSONObject2.getInt("keySettingsTwo")));
            if(jSONObject2.has("keySettingsThree")) {
                hmnk0.c(hmpy.x(jSONObject2.getString("keySettingsThree")));
            }
            if(jSONObject2.has("aksVersion")) {
                hmnk0.b(hmpy.x(jSONObject2.getString("aksVersion")));
            }
            if(jSONObject2.has("rollKey")) {
                hmnk0.f(((byte)jSONObject2.getInt("rollKey")));
            }
            if(jSONObject2.has("smConfig")) {
                hmnk0.g(hmpy.I(jSONObject2.getString("smConfig")));
            }
            if(jSONObject2.has("pdCap1.2")) {
                hmnk0.d(hmpy.x(jSONObject2.getString("pdCap1.2")));
            }
            if(jSONObject2.has("pdCap2")) {
                hmnk0.e(hmpy.I(jSONObject2.getString("pdCap2")));
            }
            LinkedList linkedList1 = new LinkedList();
            JSONArray jSONArray1 = jSONObject2.getJSONArray("files");
            for(int v1 = 0; v1 < jSONArray1.length(); ++v1) {
                JSONObject jSONObject3 = (JSONObject)jSONArray1.get(v1);
                int v2 = 1;
                switch(jSONObject3.getInt("fileType")) {
                    case 2: {
                        hmoe0 = new hmoh();
                        hmoe0.k = hmop.c(jSONObject3.getJSONArray("upperLimit"));
                        hmoe0.j = hmop.c(jSONObject3.getJSONArray("lowerLimit"));
                        hmoe0.l = hmop.c(jSONObject3.getJSONArray("valueFinal"));
                        if(jSONObject3.has("limitedCreditFinal")) {
                            hmoe0.m = hmop.c(jSONObject3.getJSONArray("limitedCreditFinal"));
                        }
                        hmoe0.n = jSONObject3.getInt("flags");
                        break;
                    }
                    case 3: 
                    case 4: {
                        hmoe0 = new hmof();
                        hmoe0.j = jSONObject3.getInt("recordSize");
                        hmoe0.k = jSONObject3.getInt("maxNumberOfRecords");
                        hmoe0.l = jSONObject3.getInt("numberOfRecords");
                        break;
                    }
                    case 5: {
                        hmoe0 = new hmog();
                        hmoe0.m = jSONObject3.getLong("tmcLimit");
                        hmoe0.n = hmpy.I(jSONObject3.getString("readerId"));
                        jSONObject3.getInt("accessRights");
                        break;
                    }
                    default: {
                        hmoe0 = new hmoe();
                    }
                }
                int v3 = jSONObject3.getInt("commModeType");
                switch(v3) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        v2 = 2;
                        break;
                    }
                    default: {
                        if(v3 == 2) {
                            v2 = 3;
                        }
                    }
                }
                hmoe0.i = v2;
                hmoe0.f = jSONObject3.getInt("fileType");
                hmoe0.c = jSONObject3.getInt("accessRights");
                hmoe0.b = jSONObject3.getInt("fileNumber");
                if(jSONObject3.getInt("fileType") != 5) {
                    hmoe0.d = jSONObject3.getInt("isoFileId");
                }
                hmoe0.e = jSONObject3.getBoolean("isPlainWith0x2");
                if(jSONObject3.has("additionalAccessRights")) {
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("additionalAccessRights");
                    byte[][] arr2_b = new byte[jSONArray2.length()][];
                    for(int v4 = 0; v4 < jSONArray2.length(); ++v4) {
                        arr2_b[v4] = hmpy.I(jSONArray2.getString(v4));
                    }
                    hmoe0.c(arr2_b);
                }
                hmoe0.d(hmql.a(jSONObject3.getString("data").getBytes(StandardCharsets.US_ASCII)));
                linkedList1.add(hmoe0);
            }
            hmnk0.e = linkedList1;
            hmnk0.b = jSONObject2.getInt("applicationISOFileId");
            if(!jSONObject2.isNull("dfName")) {
                byte[] arr_b = hmpy.I(jSONObject2.getString("dfName"));
                hmnk0.c = arr_b;
                int v5 = jSONObject2.getInt("applicationISOFileId");
                int v6 = jSONObject2.getInt("applicationISOFileId");
                byte[] arr_b1 = new byte[arr_b.length + 5];
                System.arraycopy(hmpy.T(3, v5), 0, arr_b1, 0, 3);
                System.arraycopy(hmpy.T(2, v6), 0, arr_b1, 3, 2);
                System.arraycopy(arr_b, 0, arr_b1, 5, arr_b.length);
                hmnk0.d = arr_b1;
            }
            linkedList0.add(hmnk0);
        }
        hmoq0.e = linkedList0;
        return hmoq0;
    }

    public static JSONArray b(hmok hmok0) {
        JSONArray jSONArray0 = new JSONArray();
        jSONArray0.put(0, hmok0.g()[0]);
        jSONArray0.put(1, hmok0.g()[1]);
        return jSONArray0;
    }

    private static hmok c(JSONArray jSONArray0) {
        hmok hmok0 = new hmok();
        hmok0.a = (long[])new long[]{jSONArray0.getLong(0), jSONArray0.getLong(1)}.clone();
        return hmok0;
    }
}


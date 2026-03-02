import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class esrq implements esrz {
    public final String a;
    public final Map b;
    public final boolean c;
    public final Map d;
    public final byte[] e;
    public final RSAPrivateKey f;
    public final Map g;
    public final byte h;
    public final String i;
    public final int j;
    public final int k;
    private final String l;

    public esrq(JSONObject jSONObject0, JSONObject jSONObject1) {
        RSAPrivateKey rSAPrivateKey0;
        this.b = new HashMap();
        this.d = new HashMap();
        this.g = new HashMap();
        try {
            this.a = jSONObject0.getString("tpan");
            this.i = jSONObject0.getString("tsn");
            this.k = Integer.parseInt(jSONObject0.getString("tokenExpDate").substring(0, 2));
            this.j = Integer.parseInt(jSONObject0.getString("tokenExpDate").substring(2, 4));
            JSONObject jSONObject2 = jSONObject0.getJSONObject("nfcData");
            JSONArray jSONArray0 = jSONObject2.getJSONArray("aidData");
            for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                JSONObject jSONObject3 = jSONArray0.getJSONObject(v1);
                String s = jSONObject3.getString("aid");
                String s1 = jSONObject3.getString("response");
                this.b.put(s, esxg.c((s1 + "9000")));
            }
            this.l = jSONObject2.getString("ppse");
            JSONArray jSONArray1 = jSONObject2.getJSONArray("readRecordData");
            for(int v2 = 0; v2 < jSONArray1.length(); ++v2) {
                JSONObject jSONObject4 = jSONArray1.getJSONObject(v2);
                String s2 = jSONObject4.getString("recordNum");
                String s3 = jSONObject4.getString("apdu");
                this.g.put(s2, esxg.c((s3 + "9000")));
            }
            JSONObject jSONObject5 = jSONObject2.getJSONObject("internalData");
            JSONObject jSONObject6 = jSONObject5.getJSONObject("configuration");
            this.e = esxg.c(jSONObject6.getString("iadTemplate"));
            this.c = jSONObject6.getBoolean("delayedAuthNotAllowedFlag");
            this.h = (byte)Integer.parseInt(jSONObject6.getString("CCI"), 16);
            JSONArray jSONArray2 = jSONObject5.getJSONArray("profiles");
            for(int v3 = 0; v3 < jSONArray2.length(); ++v3) {
                JSONObject jSONObject7 = jSONArray2.getJSONObject(v3);
                int v4 = ((byte)Integer.parseInt(jSONObject7.getString("id"), 16)) & 0xFF;
                esrp esrp0 = new esrp(esxg.c(jSONObject7.getString("cvmRules")), esxg.c(jSONObject7.optString("afl")), esxg.c(jSONObject7.optString("additionalResponseData")));
                this.d.put(Integer.valueOf(v4), esrp0);
            }
            if(jSONObject1 == null) {
                throw new IllegalArgumentException("bad perso for ODA operations: odaDate is null");
            }
            String s4 = jSONObject1.getString("iccPrivKey");
            byte[] arr_b = ghjc.d.q(s4);
            try {
                HashMap hashMap0 = new HashMap();
                for(int v = 0; v < arr_b.length; v = v6) {
                    int v5 = arr_b[v] & 0xFF;
                    int v6 = (arr_b[v + 1] & 0xFF) + (v + 2);
                    hashMap0.put(Integer.valueOf(v5), Arrays.copyOfRange(arr_b, v + 2, v6));
                }
                byte[] arr_b1 = (byte[])hashMap0.get(Integer.valueOf(0xD4));
                batl.s(arr_b1);
                BigInteger bigInteger0 = new BigInteger(esxg.b(arr_b1), 16);
                byte[] arr_b2 = (byte[])hashMap0.get(Integer.valueOf(0xD5));
                batl.s(arr_b2);
                BigInteger bigInteger1 = new BigInteger(esxg.b(arr_b2), 16);
                byte[] arr_b3 = (byte[])hashMap0.get(Integer.valueOf(210));
                batl.s(arr_b3);
                BigInteger bigInteger2 = new BigInteger(esxg.b(arr_b3), 16);
                byte[] arr_b4 = (byte[])hashMap0.get(Integer.valueOf(0xD3));
                batl.s(arr_b4);
                BigInteger bigInteger3 = new BigInteger(esxg.b(arr_b4), 16);
                byte[] arr_b5 = (byte[])hashMap0.get(Integer.valueOf(209));
                batl.s(arr_b5);
                BigInteger bigInteger4 = new BigInteger(esxg.b(arr_b5), 16);
                byte[] arr_b6 = (byte[])hashMap0.get(Integer.valueOf(0xD6));
                batl.s(arr_b6);
                BigInteger bigInteger5 = new BigInteger(esxg.b(arr_b6), 16);
                RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec0 = new RSAPrivateCrtKeySpec(bigInteger0.multiply(bigInteger1), bigInteger5, BigInteger.ZERO, bigInteger0, bigInteger1, bigInteger2, bigInteger3, bigInteger4);
                rSAPrivateKey0 = (RSAPrivateKey)KeyFactory.getInstance("RSA").generatePrivate(rSAPrivateCrtKeySpec0);
            }
            catch(Exception exception0) {
                throw new IllegalArgumentException(exception0);
            }
            this.f = rSAPrivateKey0;
        }
        catch(JSONException jSONException0) {
            throw new IllegalArgumentException(jSONException0);
        }
    }

    @Override  // esrz
    public final byte[] a() {
        return esxg.c(this.l);
    }

    @Override  // esrz
    public final byte[] b(int v) {
        return new byte[0];
    }
}


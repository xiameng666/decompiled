import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build.VERSION;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class kvx {
    public final String a;
    public final String b;
    public final kxe c;
    private final SigningInfo d;

    public kvx(String s, SigningInfo signingInfo0, String s1) {
        ibuq.f(s, "packageName");
        Collection collection0;
        ibuq.f(signingInfo0, "signingInfo");
        ibuq.f(signingInfo0, "signingInfo");
        Signature[] arr_signature = signingInfo0.getApkContentsSigners();
        List list0 = arr_signature == null ? ibps.a : ibpg.H(arr_signature);
        if(Build.VERSION.SDK_INT >= 35) {
            collection0 = signingInfo0.getPublicKeys();
            if(collection0 == null) {
                collection0 = ibpu.a;
            }
        }
        else {
            collection0 = ibpu.a;
        }
        int v = Build.VERSION.SDK_INT < 35 ? 0 : signingInfo0.getSchemeVersion();
        Signature[] arr_signature1 = signingInfo0.getSigningCertificateHistory();
        List list1 = arr_signature1 == null ? ibps.a : ibpg.H(arr_signature1);
        kxe kxe0 = new kxe(list1, list0, collection0, v, signingInfo0.hasPastSigningCertificates(), signingInfo0.hasMultipleSigners());
        super();
        this.a = s;
        this.b = s1;
        this.c = kxe0;
        ibuq.c(signingInfo0);
        this.d = signingInfo0;
        if(s.length() > 0) {
            return;
        }
        throw new IllegalArgumentException("packageName must not be empty");
    }

    public final SigningInfo a() {
        SigningInfo signingInfo0 = this.d;
        if(signingInfo0 != null) {
            return signingInfo0;
        }
        ibuq.j("signingInfo");
        return null;
    }

    public final String b(String s) {
        ibuq.f(s, "privilegedAllowlist");
        if(!kyi.a(s)) {
            throw new IllegalArgumentException("privilegedAllowlist must not be empty, and must be a valid JSON");
        }
        String s1 = this.b;
        if(s1 != null) {
            try {
                JSONObject jSONObject0 = new JSONObject(s);
                ArrayList arrayList0 = new ArrayList();
                JSONArray jSONArray0 = jSONObject0.getJSONArray("apps");
                int v = jSONArray0.length();
                for(int v1 = 0; v1 < v; ++v1) {
                    JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
                    if(ibuq.m(jSONObject1.getString("type"), "android")) {
                        JSONObject jSONObject2 = jSONObject1.getJSONObject("info");
                        ibuq.e(jSONObject2, "getJSONObject(...)");
                        ibuq.f(jSONObject2, "appInfoJsonObject");
                        JSONArray jSONArray1 = jSONObject2.getJSONArray("signatures");
                        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                        int v2 = jSONArray1.length();
                        for(int v3 = 0; v3 < v2; ++v3) {
                            if(!ibuq.m("userdebug", jSONArray1.getJSONObject(v3).optString("build")) || ibuq.m("userdebug", Build.TYPE)) {
                                String s2 = jSONArray1.getJSONObject(v3).getString("cert_fingerprint_sha256");
                                ibuq.e(s2, "getString(...)");
                                linkedHashSet0.add(s2);
                            }
                        }
                        String s3 = jSONObject2.getString("package_name");
                        ibuq.e(s3, "getString(...)");
                        arrayList0.add(new kyh(s3, linkedHashSet0));
                    }
                }
                for(Object object0: arrayList0) {
                    kyh kyh0 = (kyh)object0;
                    if(!ibuq.m(kyh0.a, this.a)) {
                        continue;
                    }
                    Set set0 = kyh0.b;
                    kxe kxe0 = this.c;
                    LinkedHashSet linkedHashSet1 = new LinkedHashSet();
                    List list0 = kxe0.b;
                    boolean z = kxe0.d;
                    if(!z || list0.isEmpty()) {
                        List list1 = kxe0.a;
                        if(!list1.isEmpty()) {
                            linkedHashSet1.addAll(kvw.a(ibpo.b(list1.get(0))));
                        }
                        if(!z) {
                            if(ibpo.av(set0, linkedHashSet1).isEmpty()) {
                                break;
                            }
                            return s1;
                        }
                    }
                    else {
                        linkedHashSet1.addAll(kvw.a(list0));
                    }
                    if(!set0.containsAll(linkedHashSet1)) {
                        break;
                    }
                    return s1;
                }
            }
            catch(JSONException unused_ex) {
                throw new IllegalArgumentException("privilegedAllowlist must be formatted properly");
            }
            throw new IllegalStateException("Origin is not being returned as the calling app did notmatch the privileged allowlist");
        }
        return s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof kvx) ? ibuq.m(this.a, ((kvx)object0).a) && ibuq.m(this.b, ((kvx)object0).b) && ibuq.m(this.c, ((kvx)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v * 0x1F + this.c.hashCode() : (v + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }
}


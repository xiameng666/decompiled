import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.SigningInfo;
import android.credentials.CredentialOption.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.service.credentials.CallingAppInfo;
import android.util.Log;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.fido2.api.common.HybridRequestData;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.Credential;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.GetCredentialResponse;
import com.google.android.gms.identitycredentials.ImportCredentialsRequest;
import j..util.Map.-EL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public final class byhi extends lsb {
    public bxvv a;
    private final ibrt b;
    private final gra c;

    public byhi() {
        ibuq.f(cclw.a, "highSpeedContext");
        super();
        this.b = cclw.a;
        this.c = new ParcelableSnapshotMutableState(new byht(null), gul.a);
    }

    public final bxvv a() {
        bxvv bxvv0 = this.a;
        if(bxvv0 != null) {
            return bxvv0;
        }
        ibuq.j("request");
        return null;
    }

    public final byht b() {
        return (byht)this.c.a();
    }

    public final void c(Context context0, acp acp0, acp acp1) {
        Intent intent0;
        Intent intent2;
        PackageManager packageManager1;
        bxvs bxvs0;
        boolean z;
        ibuq.f(context0, "context");
        ibuq.f(acp0, "providerIntentLauncher");
        byhy byhy0 = this.b().e;
        if(byhy0 != null) {
            this.l(byht.a(this.b(), null, null, null, null, bxzz.c, null, 0x5F));
            if(ibuq.m(byhy0, byib.a)) {
                if(acp1 == null) {
                    Log.w("CredentialSelector", "Remote entry selected but no remote entry launcher was provided");
                    this.i();
                    return;
                }
                this.n(context0, this.a(), acp1);
                return;
            }
            bxvv bxvv0 = this.a();
            if((bxvv0 instanceof bxvs)) {
                PackageManager packageManager0 = context0.getPackageManager();
                if(!(byhy0 instanceof byhu)) {
                    if(!(byhy0 instanceof byhz)) {
                        throw new ibnq();
                    }
                    byhx byhx0 = (byhx)ibpo.S(((byhz)byhy0).c.values());
                    if(byhx0 == null) {
                        bxvs0 = (bxvs)bxvv0;
                        packageManager1 = packageManager0;
                        z = byhy0 instanceof byhu;
                        intent2 = null;
                    }
                    else {
                        List list0 = byhx0.a;
                        if(list0 == null) {
                            bxvs0 = (bxvs)bxvv0;
                            packageManager1 = packageManager0;
                            z = byhy0 instanceof byhu;
                            intent2 = null;
                        }
                        else {
                            byhu byhu0 = (byhu)ibpo.T(list0);
                            if(byhu0 == null) {
                                bxvs0 = (bxvs)bxvv0;
                                packageManager1 = packageManager0;
                                z = byhy0 instanceof byhu;
                                intent2 = null;
                            }
                            else {
                                Intent intent1 = new Intent(byhu0.c);
                                intent1.setPackage(byhu0.a);
                                intent0 = intent1;
                            label_30:
                                ibuq.e(((bxvs)bxvv0).c, "getAppPackageName(...)");
                                GetCredentialRequest getCredentialRequest0 = ((bxvs)bxvv0).a;
                                String s = getCredentialRequest0.c;
                                kvx kvx0 = byca.b(context0, ((bxvs)bxvv0).c, s);
                                if(kvx0 == null) {
                                    bxvs0 = (bxvs)bxvv0;
                                    packageManager1 = packageManager0;
                                    z = byhy0 instanceof byhu;
                                    intent2 = null;
                                }
                                else {
                                    z = byhy0 instanceof byhu;
                                    ArrayList arrayList0 = new ArrayList(ibpo.q(getCredentialRequest0.a, 10));
                                    for(Iterator iterator0 = getCredentialRequest0.a.iterator(); iterator0.hasNext(); iterator0 = iterator0) {
                                        Object object0 = iterator0.next();
                                        CredentialOption credentialOption0 = (CredentialOption)object0;
                                        String s1 = credentialOption0.a;
                                        kjn kjn0 = ibuq.m(s1, "com.credman.IdentityCredential") ? new kkc(credentialOption0.d) : kjm.a(s1, new Bundle(credentialOption0.b), new Bundle(credentialOption0.c), false, ibpu.a);
                                        arrayList0.add(kjn0);
                                    }
                                    kwx kwx0 = new kwx(arrayList0, kvx0, null, null);
                                    if(Build.VERSION.SDK_INT >= 34) {
                                        bxvs0 = (bxvs)bxvv0;
                                        SigningInfo signingInfo0 = kwx0.b.a();
                                        CallingAppInfo callingAppInfo0 = new CallingAppInfo(kwx0.b.a, signingInfo0, s);
                                        ArrayList arrayList1 = new ArrayList(ibpo.q(kwx0.a, 10));
                                        Iterator iterator1 = kwx0.a.iterator();
                                        while(iterator1.hasNext()) {
                                            Object object1 = iterator1.next();
                                            arrayList1.add(new CredentialOption.Builder(((kjn)object1).a, ((kjn)object1).b, ((kjn)object1).c).setIsSystemProviderRequired(((kjn)object1).d).build());
                                            iterator1 = iterator1;
                                            packageManager0 = packageManager0;
                                        }
                                        packageManager1 = packageManager0;
                                        intent0.putExtra("android.service.credentials.extra.GET_CREDENTIAL_REQUEST", new android.service.credentials.GetCredentialRequest(callingAppInfo0, arrayList1));
                                        if(z) {
                                            byhw byhw0 = ((byhu)byhy0).b;
                                            String s2 = ((byhu)byhy0).d;
                                            if(s2 == null) {
                                                intent0.putExtra("androidx.credentials.registry.provider.extra.CREDENTIAL_ID", byhv.a(byhw0));
                                            }
                                            else {
                                                intent0.putExtra("androidx.credentials.registry.provider.extra.CREDENTIAL_SET_ID", s2);
                                                intent0.putExtra("androidx.credentials.registry.provider.extra.CREDENTIAL_SET_ELEMENT_LENGTH", 1);
                                                intent0.putExtra("androidx.credentials.registry.provider.extra.CREDENTIAL_SET_ELEMENT_ID_0", byhv.a(byhw0));
                                                String s3 = ((byhu)byhy0).e;
                                                if(s3 != null) {
                                                    intent0.putExtra("androidx.credentials.registry.provider.extra.CREDENTIAL_SET_ELEMENT_METADATA_0", s3);
                                                }
                                            }
                                        }
                                        else {
                                            if(!(byhy0 instanceof byhz)) {
                                                throw new ibnq();
                                            }
                                            intent0.putExtra("androidx.credentials.registry.provider.extra.CREDENTIAL_SET_ID", ((byhz)byhy0).a);
                                            int v = ((byhz)byhy0).b;
                                            intent0.putExtra("androidx.credentials.registry.provider.extra.CREDENTIAL_SET_ELEMENT_LENGTH", v);
                                            for(int v1 = 0; v1 < v; ++v1) {
                                                byhx byhx1 = (byhx)((byhz)byhy0).c.get(Integer.valueOf(v1));
                                                if(byhx1 != null) {
                                                    byhu byhu1 = byhx1.b;
                                                    if(byhu1 != null) {
                                                        intent0.putExtra("androidx.credentials.registry.provider.extra.CREDENTIAL_SET_ELEMENT_ID_" + v1, byhv.a(byhu1.b));
                                                        String s4 = byhu1.e;
                                                        if(s4 != null) {
                                                            intent0.putExtra("androidx.credentials.registry.provider.extra.CREDENTIAL_SET_ELEMENT_METADATA_" + v1, s4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        bxvs0 = (bxvs)bxvv0;
                                        packageManager1 = packageManager0;
                                        Bundle bundle0 = kww.a(kwx0);
                                        if(z) {
                                            byhw byhw1 = ((byhu)byhy0).b;
                                            String s5 = ((byhu)byhy0).d;
                                            if(s5 == null) {
                                                bundle0.putString("androidx.credentials.registry.provider.extra.CREDENTIAL_ID", byhv.a(byhw1));
                                            }
                                            else {
                                                bundle0.putString("androidx.credentials.registry.provider.extra.CREDENTIAL_SET_ID", s5);
                                                bundle0.putInt("androidx.credentials.registry.provider.extra.CREDENTIAL_SET_ELEMENT_LENGTH", 1);
                                                bundle0.putString("androidx.credentials.registry.provider.extra.CREDENTIAL_SET_ELEMENT_ID_0", byhv.a(byhw1));
                                                String s6 = ((byhu)byhy0).e;
                                                if(s6 != null) {
                                                    bundle0.putString("androidx.credentials.registry.provider.extra.CREDENTIAL_SET_ELEMENT_METADATA_0", s6);
                                                }
                                            }
                                        }
                                        else {
                                            if(!(byhy0 instanceof byhz)) {
                                                throw new ibnq();
                                            }
                                            bundle0.putString("androidx.credentials.registry.provider.extra.CREDENTIAL_SET_ID", ((byhz)byhy0).a);
                                            int v2 = ((byhz)byhy0).b;
                                            bundle0.putInt("androidx.credentials.registry.provider.extra.CREDENTIAL_SET_ELEMENT_LENGTH", v2);
                                            for(int v3 = 0; v3 < v2; ++v3) {
                                                byhx byhx2 = (byhx)((byhz)byhy0).c.get(Integer.valueOf(v3));
                                                if(byhx2 != null) {
                                                    byhu byhu2 = byhx2.b;
                                                    if(byhu2 != null) {
                                                        bundle0.putString("androidx.credentials.registry.provider.extra.CREDENTIAL_SET_ELEMENT_ID_" + v3, byhv.a(byhu2.b));
                                                        String s7 = byhu2.e;
                                                        if(s7 != null) {
                                                            bundle0.putString("androidx.credentials.registry.provider.extra.CREDENTIAL_SET_ELEMENT_METADATA_" + v3, s7);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        intent0.putExtra("android.service.credentials.extra.GET_CREDENTIAL_REQUEST", bundle0);
                                    }
                                    intent2 = intent0;
                                }
                            }
                        }
                    }
                }
                else if((((byhu)byhy0).b instanceof byic)) {
                    intent0 = new Intent(((byhu)byhy0).c);
                    intent0.setPackage(((byhu)byhy0).a);
                    goto label_30;
                }
                else {
                    bxvs0 = (bxvs)bxvv0;
                    packageManager1 = packageManager0;
                    z = byhy0 instanceof byhu;
                    intent2 = null;
                }
                if(z) {
                    if(intent2 == null || packageManager1.resolveActivity(intent2, 0) == null) {
                        intent2 = new Intent("androidx.identitycredentials.action.GET_CREDENTIALS");
                        intent2.setPackage(((byhu)byhy0).a);
                        byhw byhw2 = ((byhu)byhy0).b;
                        if((byhw2 instanceof byic)) {
                            intent2.putExtra("androidx.identitycredentials.extra.CREDENTIAL_ID", ((byic)byhw2).a);
                            goto label_162;
                        }
                        else {
                            if(!(byhw2 instanceof byia)) {
                                throw new ibnq();
                            }
                            intent2.putExtra("androidx.identitycredentials.extra.CREDENTIAL_ID", ((byia)byhw2).a);
                        label_162:
                            intent2.putExtra("androidx.identitycredentials.extra.GET_CREDENTIAL_REQUEST", bxvs0.a);
                            intent2.putExtra("androidx.identitycredentials.extra.CALLING_PACKAGE_NAME", bxvs0.c);
                            intent2.putExtra("androidx.identitycredentials.extra.ORIGIN", bxvs0.a.c);
                            intent2.putExtra("androidx.identitycredentials.extra.SIGNATURE_COUNT", bxvs0.d.size());
                            ibuq.c(bxvs0.d);
                            int v4 = 0;
                            for(Object object2: bxvs0.d) {
                                if(v4 < 0) {
                                    ibpo.m();
                                }
                                intent2.putExtra("androidx.identitycredentials.extra.SIGNATURE_" + v4, ((byte[])object2));
                                ++v4;
                            }
                        }
                    }
                }
                else if(!(byhy0 instanceof byhz)) {
                    throw new ibnq();
                }
            }
            else if((bxvv0 instanceof bxvt)) {
                if((byhy0 instanceof byhu)) {
                    intent2 = new Intent(((byhu)byhy0).c);
                    ImportCredentialsRequest importCredentialsRequest0 = ((bxvt)bxvv0).a;
                    intent2.putExtra("androidx.identitycredentials.extra.IMPORT_CREDENTIALS_REQUEST", importCredentialsRequest0);
                    intent2.putExtra("androidx.identitycredentials.extra.IMPORT_CREDENTIALS_REQUEST_JSON", importCredentialsRequest0.a);
                    intent2.putExtra("androidx.identitycredentials.extra.CALLING_PACKAGE_NAME", ((bxvt)bxvv0).c);
                    intent2.putExtra("androidx.identitycredentials.extra.SIGNING_INFO", context0.getPackageManager().getPackageInfo(((bxvt)bxvv0).c, 0x8000000).signingInfo);
                    intent2.putExtra("androidx.identitycredentials.extra.SIGNATURE_COUNT", ((bxvt)bxvv0).d.size());
                    ibuq.c(((bxvt)bxvv0).d);
                    int v5 = 0;
                    for(Object object3: ((bxvt)bxvv0).d) {
                        if(v5 < 0) {
                            ibpo.m();
                        }
                        intent2.putExtra("androidx.identitycredentials.extra.SIGNATURE_" + v5, ((byte[])object3));
                        ++v5;
                    }
                    intent2.setData(importCredentialsRequest0.b);
                    intent2.addFlags(2);
                    intent2.setPackage(((byhu)byhy0).a);
                }
                else {
                    if(!(byhy0 instanceof byhz)) {
                        throw new ibnq();
                    }
                    Log.e("CredentialSelector", "Create flow does not support EntrySet.");
                    intent2 = null;
                }
            }
            else if(!(bxvv0 instanceof bxvr)) {
                Log.e("CredentialSelector", "Unsupported request type while constructing intent");
                this.i();
                intent2 = null;
            }
            else if((byhy0 instanceof byhu)) {
                byhw byhw3 = ((byhu)byhy0).b;
                if((byhw3 instanceof byic)) {
                    Intent intent3 = new Intent(((byhu)byhy0).c);
                    intent3.setPackage(((byhu)byhy0).a);
                    ibuq.e(((bxvr)bxvv0).c, "getAppPackageName(...)");
                    CreateCredentialRequest createCredentialRequest0 = ((bxvr)bxvv0).a;
                    String s8 = createCredentialRequest0.d;
                    kvx kvx1 = byca.b(context0, ((bxvr)bxvv0).c, s8);
                    if(kvx1 == null) {
                        intent2 = null;
                    }
                    else {
                        Bundle bundle1 = new Bundle(createCredentialRequest0.b);
                        Bundle bundle2 = new Bundle(createCredentialRequest0.c);
                        kir kir0 = new kir("userid", "username");
                        kwv kwv0 = new kwv(new kiv(createCredentialRequest0.a, bundle1, bundle2, false, kir0, false, s8, false), kvx1);
                        if(Build.VERSION.SDK_INT >= 34) {
                            SigningInfo signingInfo1 = kwv0.b.a();
                            intent3.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST", new android.service.credentials.CreateCredentialRequest(new CallingAppInfo(kwv0.b.a, signingInfo1, s8), kwv0.a.a, kwv0.a.b));
                            intent3.putExtra("androidx.credentials.registry.provider.extra.CREDENTIAL_ID", ((byic)byhw3).a);
                        }
                        else {
                            Bundle bundle3 = kwu.a(kwv0);
                            bundle3.putString("androidx.credentials.registry.provider.extra.CREDENTIAL_ID", ((byic)byhw3).a);
                            intent3.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST", bundle3);
                        }
                        intent2 = intent3;
                    }
                }
                else {
                    Log.e("CredentialSelector", "Unsupported credential id type for create flow " + byhw3.getClass() + ". Exiting...");
                    intent2 = null;
                }
            }
            else {
                if(!(byhy0 instanceof byhz)) {
                    throw new ibnq();
                }
                Log.e("CredentialSelector", "Create flow does not support EntrySet.");
                intent2 = null;
            }
            if(intent2 != null) {
                acp0.b(intent2);
                return;
            }
            Log.w("CredentialSelector", "Failed to construct provider intent");
            this.i();
            return;
        }
        this.i();
    }

    public final void e(Integer integer0, byhu byhu0) {
        bzbc bzbc0 = null;
        if(integer0 != null && byhu0 != null) {
            bzaz bzaz0 = this.b().b;
            bzaz bzaz1 = this.b().b;
            if(bzaz1 != null) {
                bzbc0 = bzaz1.h;
            }
            if(bzaz0 != null && bzbc0 != null) {
                Map map0 = ibpz.r(bzbc0.c.c);
                byhe byhe0 = new byhe(new byhd(byhu0));
                Map.-EL.compute(map0, Integer.valueOf(bzbc0.b), byhe0);
                byhz byhz0 = byhz.a(bzbc0.c, map0);
                List list0 = ibpo.at(bzaz0.c.a);
                try {
                    byhy byhy0 = (byhy)list0.set(bzbc0.a, byhz0);
                }
                catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                    this.h("onBackFromMoreOptionsAtIndex: unexpected activeCardIndex " + bzbc0.a + ". " + indexOutOfBoundsException0);
                    return;
                }
                bywm bywm0 = new bywm(list0);
                byht byht0 = this.b();
                byhy byhy1 = (byhy)ibpo.U(bywm0.a, bzbc0.a);
                this.l(byht.a(byht0, bzaz.a(bzaz0, bywm0, bzba.a, null, byhy1, null, 0xD3), null, null, null, null, null, 0x7D));
                return;
            }
            this.h(a.j(bzbc0, bzaz0, "onBackFromMoreOptionsAtIndex: unexpected null value ", " or ", "."));
            return;
        }
        bzaz bzaz2 = null;
        byht byht1 = this.b();
        bzaz bzaz3 = this.b().b;
        if(bzaz3 != null) {
            bzaz2 = bzaz.a(bzaz3, null, bzba.a, null, null, null, 0xF7);
        }
        this.l(byht.a(byht1, bzaz2, null, null, null, null, null, 0x7D));
    }

    public final void f(byhu byhu0) {
        bzaz bzaz0 = null;
        if(byhu0 != null) {
            byht byht0 = this.b();
            bzaz bzaz1 = this.b().b;
            if(bzaz1 != null) {
                bzaz0 = bzaz.a(bzaz1, null, bzba.a, null, byhu0, null, 471);
            }
            this.l(byht.a(byht0, bzaz0, null, null, null, null, null, 0x7D));
            return;
        }
        bzaz bzaz2 = null;
        byht byht1 = this.b();
        bzaz bzaz3 = this.b().b;
        if(bzaz3 != null) {
            bzaz2 = bzaz.a(bzaz3, null, bzba.a, null, null, null, 503);
        }
        this.l(byht.a(byht1, bzaz2, null, null, null, null, null, 0x7D));
    }

    public final void g(byhy byhy0) {
        ibuq.f(byhy0, "entry");
        this.l(byht.a(this.b(), null, null, null, byhy0, bxzz.b, null, 0x4F));
    }

    public final void h(String s) {
        ibuq.f(s, "errorMessage");
        Log.w("CredentialSelector", s);
        this.i();
    }

    public final void i() {
        Log.w("CredentialSelector", "UI closed due to illegal internal state");
        this.l(byht.a(this.b(), null, null, null, null, null, new bxzt(bxzu.g), 0x3F));
    }

    public final void j(bxzy bxzy0, boolean z) {
        byhy byhy0 = this.b().e;
        if(bxzy0.a == 0) {
            if(z) {
                this.k();
                return;
            }
            this.l(byht.a(this.b(), null, null, null, null, bxzz.a, null, 0x4F));
            return;
        }
        if(byhy0 != null) {
            Intent intent0 = bxzy0.b;
            if(intent0 == null) {
                Log.w("CredentialSelector", "The provider activity succeeded with null result.");
                this.i();
                return;
            }
            if(z) {
                String s = intent0.getStringExtra("FIDO2_JSON_RESPONSE_EXTRA");
                if(s == null) {
                    Log.w("CredentialSelector", "The hybrid activity succeeded with null response.");
                    this.i();
                    return;
                }
                try {
                    Intent intent1 = new Intent();
                    JSONObject jSONObject0 = new JSONObject(s).getJSONObject("response").getJSONObject("digital");
                    ibuq.e(jSONObject0, "getJSONObject(...)");
                    JSONObject jSONObject1 = jSONObject0.optJSONObject("data");
                    String s1 = jSONObject1 == null ? null : jSONObject1.toString();
                    String s2 = s1 == null ? jSONObject0.optString("error") : null;
                    if(s2 != null) {
                        Log.w("CredentialSelector", "The hybrid response contains an error: " + s2);
                        this.i();
                        return;
                    }
                    bxvv bxvv0 = this.a();
                    if(!(bxvv0 instanceof bxvs)) {
                        if((bxvv0 instanceof bxvr)) {
                            if(s1 == null) {
                                throw new IllegalArgumentException("The hybrid response does not contain a response or error.");
                            }
                            Bundle bundle0 = new Bundle();
                            bundle0.putString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON", s1);
                            kwr.f(intent1, new kiu("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", bundle0, null));
                            this.l(byht.a(this.b(), null, null, null, null, null, new bxzt(bxzu.c, intent1), 0x3F));
                            return;
                        }
                        Log.e("CredentialSelector", "Unsupported request type for hybrid " + bxvv0.getClass() + ".");
                        this.i();
                        return;
                    }
                    if(s1 == null) {
                        throw new IllegalArgumentException("The hybrid response does not contain a response or error.");
                    }
                    kwr.h(intent1, new kkb(new kjx(s1)));
                    Bundle bundle1 = new Bundle();
                    byte[] arr_b = s1.getBytes(ibyo.a);
                    ibuq.e(arr_b, "getBytes(...)");
                    bundle1.putByteArray("identityToken", arr_b);
                    bxva.b(intent1, new GetCredentialResponse(new Credential("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", bundle1)));
                    this.l(byht.a(this.b(), null, null, null, null, null, new bxzt(bxzu.c, intent1), 0x3F));
                }
                catch(JSONException jSONException0) {
                    Log.w("CredentialSelector", "The hybrid json response is invalid.", jSONException0);
                    this.i();
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    Log.w("CredentialSelector", "The hybrid json response is invalid.", illegalArgumentException0);
                    this.i();
                }
                return;
            }
            this.l(byht.a(this.b(), null, null, null, null, null, new bxzt(bxzu.c, intent0), 0x3F));
            return;
        }
        Log.w("CredentialSelector", "Illegal state: received a provider result but found no matching entry.");
        this.i();
    }

    public final void k() {
        this.l(byht.a(this.b(), null, null, null, null, null, new bxzt(bxzu.e), 0x3F));
    }

    public final void l(byht byht0) {
        this.c.b(byht0);
    }

    public static void m(byhi byhi0, bxvv bxvv0, Context context0) {
        bxxf bxxf0;
        if((bxvv0 instanceof bxvs)) {
            bxxf0 = bxxf.a;
            goto label_8;
        }
        if((bxvv0 instanceof bxvt)) {
            bxxf0 = bxxf.c;
            goto label_8;
        }
        if((bxvv0 instanceof bxvr)) {
            bxxf0 = bxxf.b;
        label_8:
            ibuq.f(bxxf0, "dataStoreType");
            byea byea0 = new byea(new bxxv(bxxf0));
            ibuq.f(bxvv0, "request");
            ibuq.f(context0, "context");
            ibuq.f(bxvv0, "<set-?>");
            byhi0.a = bxvv0;
            if((bxvv0 instanceof bxvs)) {
                icck icck0 = lsc.a(byhi0);
                byhg byhg0 = new byhg(byea0, ((bxvs)bxvv0), context0, byhi0, null);
                icbb.b(icck0, byhi0.b, null, byhg0, 2);
                return;
            }
            if((bxvv0 instanceof bxvr)) {
                icck icck1 = lsc.a(byhi0);
                byhf byhf0 = new byhf(byea0, ((bxvr)bxvv0), context0, byhi0, null);
                icbb.b(icck1, byhi0.b, null, byhf0, 2);
                return;
            }
            if((bxvv0 instanceof bxvt)) {
                icck icck2 = lsc.a(byhi0);
                byhh byhh0 = new byhh(byea0, ((bxvt)bxvv0), context0, byhi0, null);
                icbb.b(icck2, byhi0.b, null, byhh0, 2);
                return;
            }
            Log.e("CredentialSelector", "Unsupported request type");
            byhi0.i();
            return;
        }
        Class class0 = bxvv0.getClass();
        Objects.toString(class0);
        throw new UnsupportedOperationException("Unsupported request type " + class0);
    }

    private final void n(Context context0, bxvv bxvv0, acp acp0) {
        String s4;
        ibns ibns0;
        try {
            if((bxvv0 instanceof bxvs)) {
                for(Object object0: ((bxvs)bxvv0).a.a) {
                    String s = ((CredentialOption)object0).a;
                    if(!ibuq.m(s, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL") && !ibuq.m(s, "com.credman.IdentityCredential")) {
                        continue;
                    }
                    goto label_8;
                }
                object0 = null;
            label_8:
                if(((CredentialOption)object0) == null) {
                    throw new IllegalStateException("Null request");
                }
                String s1 = ((CredentialOption)object0).d;
                if(s1 == null) {
                    throw new IllegalStateException("Null request");
                }
                ibns0 = new ibns(new JSONObject(s1), ((bxvs)bxvv0).a.c);
            }
            else {
                if(!(bxvv0 instanceof bxvr)) {
                    Log.e("CredentialSelector", "Unsupported request type for hybrid flow");
                    this.i();
                    return;
                }
                CreateCredentialRequest createCredentialRequest0 = ((bxvr)bxvv0).a;
                String s2 = createCredentialRequest0.e;
                if(s2 == null) {
                    throw new IllegalStateException("Null request");
                }
                ibns0 = new ibns(new JSONObject(s2), createCredentialRequest0.d);
            }
        }
        catch(JSONException jSONException0) {
            Log.e("CredentialSelector", "Failed to parse request matcher", jSONException0);
            this.i();
            return;
        }
        catch(NoSuchElementException noSuchElementException0) {
            Log.e("CredentialSelector", "Failed to parse request matcher", noSuchElementException0);
            this.i();
            return;
        }
        catch(IllegalStateException illegalStateException0) {
            Log.e("CredentialSelector", "Failed to get a DC request", illegalStateException0);
            this.i();
            return;
        }
        JSONObject jSONObject0 = (JSONObject)ibns0.a;
        String s3 = (String)ibns0.b;
        bmfn bmfn0 = new bmfn(context0);
        JSONObject jSONObject1 = new JSONObject();
        if(s3 == null) {
            s3 = bxvv0.c;
        }
        jSONObject1.put("origin", s3);
        if((bxvv0 instanceof bxvs)) {
            s4 = "credential.get";
            goto label_48;
        }
        if((bxvv0 instanceof bxvr)) {
            s4 = "credential.create";
        label_48:
            jSONObject1.put("requestType", s4);
            jSONObject1.put("request", new JSONObject().put("digital", jSONObject0));
            String s5 = jSONObject1.toString();
            gftb.check(s5);
            HybridRequestData hybridRequestData0 = new HybridRequestData(s5, "digital_credential", bxvv0.c);
            azzc azzc0 = new azzc();
            azzc0.a = new bmev(bmfn0, hybridRequestData0);
            azzc0.d = 0x154F;
            azzc0.c = new Feature[]{blfo.D};
            evql evql0 = bmfn0.iG(azzc0.a());
            evql0.b(new byhb(new byha(acp0)));
            evql0.A(new byhc(this));
            return;
        }
        Log.e("CredentialSelector", "Unsupported request type for hybrid flow");
        this.i();
    }
}


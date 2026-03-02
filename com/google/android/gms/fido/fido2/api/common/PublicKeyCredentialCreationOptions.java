package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.util.Log;
import bata;
import batl;
import baub;
import bauc;
import bbmu;
import bmgq;
import bmii;
import bmij;
import gfqx;
import gfsx;
import hsvs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator CREATOR;
    public final PublicKeyCredentialRpEntity a;
    public final PublicKeyCredentialUserEntity b;
    public final byte[] c;
    public final List d;
    public final Double e;
    public final List f;
    public final AuthenticatorSelectionCriteria g;
    public final Integer h;
    public final TokenBinding i;
    public final AttestationConveyancePreference j;
    public final AuthenticationExtensions k;
    public final String l;
    public ResultReceiver m;
    public final List n;

    static {
        PublicKeyCredentialCreationOptions.CREATOR = new bmij();
    }

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity0, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity0, byte[] arr_b, List list0, Double double0, List list1, AuthenticatorSelectionCriteria authenticatorSelectionCriteria0, Integer integer0, TokenBinding tokenBinding0, String s, AuthenticationExtensions authenticationExtensions0, String s1, ResultReceiver resultReceiver0, List list2) {
        this.m = resultReceiver0;
        if(s1 != null) {
            try {
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0 = PublicKeyCredentialCreationOptions.k(new JSONObject(s1));
                this.a = publicKeyCredentialCreationOptions0.a;
                this.b = publicKeyCredentialCreationOptions0.b;
                this.c = publicKeyCredentialCreationOptions0.c;
                this.d = publicKeyCredentialCreationOptions0.d;
                this.e = publicKeyCredentialCreationOptions0.e;
                this.f = publicKeyCredentialCreationOptions0.f;
                this.g = publicKeyCredentialCreationOptions0.g;
                this.h = publicKeyCredentialCreationOptions0.h;
                this.i = publicKeyCredentialCreationOptions0.i;
                this.j = publicKeyCredentialCreationOptions0.j;
                this.k = publicKeyCredentialCreationOptions0.k;
                this.n = publicKeyCredentialCreationOptions0.n;
                this.l = s1;
                return;
            }
            catch(JSONException jSONException0) {
                throw new IllegalArgumentException(jSONException0);
            }
        }
        batl.s(publicKeyCredentialRpEntity0);
        this.a = publicKeyCredentialRpEntity0;
        batl.s(publicKeyCredentialUserEntity0);
        this.b = publicKeyCredentialUserEntity0;
        batl.s(arr_b);
        this.c = arr_b;
        batl.s(list0);
        this.d = list0;
        this.e = double0;
        this.f = list1;
        this.g = authenticatorSelectionCriteria0;
        this.h = integer0;
        this.i = tokenBinding0;
        if(s == null) {
            this.j = null;
        }
        else {
            try {
                this.j = AttestationConveyancePreference.a(s);
            }
            catch(bmgq bmgq0) {
                throw new IllegalArgumentException(bmgq0);
            }
        }
        this.k = authenticationExtensions0;
        this.l = null;
        this.n = list2;
    }

    public PublicKeyCredentialCreationOptions(String s) {
        try {
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0 = PublicKeyCredentialCreationOptions.k(new JSONObject(s));
            this.a = publicKeyCredentialCreationOptions0.a;
            this.b = publicKeyCredentialCreationOptions0.b;
            this.c = publicKeyCredentialCreationOptions0.c;
            this.d = publicKeyCredentialCreationOptions0.d;
            this.e = publicKeyCredentialCreationOptions0.e;
            this.f = publicKeyCredentialCreationOptions0.f;
            this.g = publicKeyCredentialCreationOptions0.g;
            this.h = publicKeyCredentialCreationOptions0.h;
            this.i = publicKeyCredentialCreationOptions0.i;
            this.j = publicKeyCredentialCreationOptions0.j;
            this.k = publicKeyCredentialCreationOptions0.k;
            this.n = publicKeyCredentialCreationOptions0.n;
            this.l = s;
        }
        catch(JSONException jSONException0) {
            throw new IllegalArgumentException(jSONException0);
        }
    }

    public final bmii a() {
        bmii bmii0 = new bmii();
        bmii0.a = this.a;
        bmii0.b = this.b;
        bmii0.b(this.c);
        bmii0.c(this.d);
        bmii0.c = this.e;
        bmii0.d = this.f;
        bmii0.e = this.g;
        bmii0.f = this.h;
        bmii0.g = this.i;
        bmii0.h = this.j;
        bmii0.i = this.k;
        bmii0.j = this.n;
        return bmii0;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final ResultReceiver b() {
        return this.m;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final AuthenticationExtensions c() {
        return this.k;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final TokenBinding d() {
        return this.i;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final gfsx e() {
        return gfqx.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        if(bata.b(this.a, ((PublicKeyCredentialCreationOptions)object0).a) && bata.b(this.b, ((PublicKeyCredentialCreationOptions)object0).b) && Arrays.equals(this.c, ((PublicKeyCredentialCreationOptions)object0).c) && bata.b(this.e, ((PublicKeyCredentialCreationOptions)object0).e)) {
            List list0 = ((PublicKeyCredentialCreationOptions)object0).d;
            if(this.d.containsAll(list0) && list0.containsAll(this.d)) {
                List list1 = this.f;
                if(list1 == null && ((PublicKeyCredentialCreationOptions)object0).f == null) {
                label_10:
                    if(bata.b(this.g, ((PublicKeyCredentialCreationOptions)object0).g) && bata.b(this.h, ((PublicKeyCredentialCreationOptions)object0).h) && bata.b(this.i, ((PublicKeyCredentialCreationOptions)object0).i) && bata.b(this.j, ((PublicKeyCredentialCreationOptions)object0).j) && bata.b(this.k, ((PublicKeyCredentialCreationOptions)object0).k) && bata.b(this.l, ((PublicKeyCredentialCreationOptions)object0).l)) {
                        List list3 = this.n;
                        if(list3 == null && ((PublicKeyCredentialCreationOptions)object0).n == null) {
                            return true;
                        }
                        if(list3 != null) {
                            List list4 = ((PublicKeyCredentialCreationOptions)object0).n;
                            return list4 == null || !list3.containsAll(list4) ? false : list4.containsAll(list3);
                        }
                    }
                }
                else if(list1 != null) {
                    List list2 = ((PublicKeyCredentialCreationOptions)object0).f;
                    if(list2 != null && list1.containsAll(list2) && list2.containsAll(list1)) {
                        goto label_10;
                    }
                }
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final Double f() {
        return this.e;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final Integer g() {
        return this.h;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final void h(ResultReceiver resultReceiver0) {
        this.m = resultReceiver0;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.c);
        return Arrays.hashCode(new Object[]{this.a, this.b, integer0, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.n});
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final byte[] i() {
        return this.c;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final byte[] j() {
        return hsvs.o() ? bauc.n(this.a().a()) : bauc.n(this);
    }

    public static PublicKeyCredentialCreationOptions k(JSONObject jSONObject0) {
        bmii bmii0 = new bmii();
        bmii0.a = PublicKeyCredentialRpEntity.a(jSONObject0.getJSONObject("rp"));
        bmii0.b = PublicKeyCredentialUserEntity.a(jSONObject0.getJSONObject("user"));
        bmii0.b(bbmu.f(jSONObject0.getString("challenge")));
        JSONArray jSONArray0 = jSONObject0.getJSONArray("pubKeyCredParams");
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
            gfsx gfsx0 = PublicKeyCredentialParameters.b(jSONArray0.getJSONObject(v1));
            if(gfsx0.i()) {
                arrayList0.add(gfsx0.d());
            }
        }
        bmii0.c(arrayList0);
        if(jSONObject0.has("timeout")) {
            bmii0.c = (double)(jSONObject0.getDouble("timeout") / 1000.0);
        }
        if(jSONObject0.has("excludeCredentials")) {
            JSONArray jSONArray1 = jSONObject0.getJSONArray("excludeCredentials");
            ArrayList arrayList1 = new ArrayList();
            for(int v2 = 0; v2 < jSONArray1.length(); ++v2) {
                arrayList1.add(PublicKeyCredentialDescriptor.b(jSONArray1.getJSONObject(v2)));
            }
            bmii0.d = arrayList1;
        }
        if(jSONObject0.has("authenticatorSelection")) {
            bmii0.e = AuthenticatorSelectionCriteria.a(jSONObject0.getJSONObject("authenticatorSelection"));
        }
        if(jSONObject0.has("extensions")) {
            bmii0.i = AuthenticationExtensions.a(jSONObject0.getJSONObject("extensions"));
        }
        if(jSONObject0.has("attestation")) {
            try {
                bmii0.h = AttestationConveyancePreference.a(jSONObject0.getString("attestation"));
            }
            catch(bmgq bmgq0) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", bmgq0);
                bmii0.h = AttestationConveyancePreference.a;
            }
        }
        if(jSONObject0.has("attestationFormats")) {
            JSONArray jSONArray2 = jSONObject0.getJSONArray("attestationFormats");
            ArrayList arrayList2 = new ArrayList();
            for(int v = 0; v < jSONArray2.length(); ++v) {
                arrayList2.add(jSONArray2.getString(v));
            }
            bmii0.j = arrayList2;
        }
        return bmii0.a();
    }

    public final String l() {
        return this.j == null ? null : this.j.d;
    }

    public final JSONObject m() {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("challenge", bbmu.c(this.c));
        jSONObject0.put("rp", this.a.b());
        jSONObject0.put("user", this.b.b());
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: this.d) {
            jSONArray0.put(((PublicKeyCredentialParameters)object0).e());
        }
        jSONObject0.put("pubKeyCredParams", jSONArray0);
        Double double0 = this.e;
        if(double0 != null) {
            jSONObject0.put("timeout", TimeUnit.SECONDS.toMillis(double0.longValue()));
        }
        if(this.j != null) {
            jSONObject0.put("attestation", this.l());
        }
        List list0 = this.f;
        if(list0 != null) {
            JSONArray jSONArray1 = new JSONArray();
            for(Object object1: list0) {
                jSONArray1.put(((PublicKeyCredentialDescriptor)object1).d());
            }
            jSONObject0.put("excludeCredentials", jSONArray1);
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria0 = this.g;
        if(authenticatorSelectionCriteria0 != null) {
            jSONObject0.put("authenticatorSelection", authenticatorSelectionCriteria0.f());
        }
        AuthenticationExtensions authenticationExtensions0 = this.k;
        if(authenticationExtensions0 != null) {
            JSONObject jSONObject1 = authenticationExtensions0.c();
            if(jSONObject1.length() > 0) {
                jSONObject0.put("extensions", jSONObject1);
            }
        }
        List list1 = this.n;
        if(list1 != null && !list1.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            for(Object object2: list1) {
                jSONArray2.put(((String)object2));
            }
            jSONObject0.put("attestationFormats", jSONArray2);
        }
        return jSONObject0;
    }

    @Override
    public final String toString() {
        String s = bbmu.c(this.c);
        return "PublicKeyCredentialCreationOptions{\n rp=" + this.a.toString() + ", \n user=" + this.b.toString() + ", \n challenge=" + s + ", \n parameters=" + this.d.toString() + ", \n timeoutSeconds=" + this.e + ", \n excludeList=" + this.f + ", \n authenticatorSelection=" + this.g + ", \n requestId=" + this.h + ", \n tokenBinding=" + this.i + ", \n attestationConveyancePreference=" + this.j + ", \n authenticationExtensions=" + this.k + ", \n attestationFormats=" + this.n + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.t(parcel0, 3, this.b, v, false);
        baub.i(parcel0, 4, this.c, false);
        baub.y(parcel0, 5, this.d, false);
        baub.B(parcel0, 6, this.e);
        baub.y(parcel0, 7, this.f, false);
        baub.t(parcel0, 8, this.g, v, false);
        baub.F(parcel0, 9, this.h);
        baub.t(parcel0, 10, this.i, v, false);
        baub.v(parcel0, 11, this.l(), false);
        baub.t(parcel0, 12, this.k, v, false);
        baub.v(parcel0, 13, this.l, false);
        baub.t(parcel0, 14, this.m, v, false);
        baub.x(parcel0, 15, this.n, false);
        baub.c(parcel0, v1);
    }
}


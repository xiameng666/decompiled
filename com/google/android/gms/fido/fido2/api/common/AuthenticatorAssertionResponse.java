package com.google.android.gms.fido.fido2.api.common;

import ByteString;
import MoreObjects;
import ToStringHelper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import bauc;
import bbmu;
import bmgx;
import ghjc;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR;
    public final ByteString a;
    private final ByteString b;
    private final ByteString c;
    private final ByteString d;
    private final ByteString e;

    static {
        AuthenticatorAssertionResponse.CREATOR = new bmgx();
    }

    public AuthenticatorAssertionResponse(ByteString hfsf0, ByteString hfsf1, ByteString hfsf2, ByteString hfsf3, ByteString hfsf4) {
        batl.s(hfsf0);
        this.b = hfsf0;
        batl.s(hfsf1);
        this.c = hfsf1;
        batl.s(hfsf2);
        this.d = hfsf2;
        batl.s(hfsf3);
        this.e = hfsf3;
        this.a = hfsf4;
    }

    @Override  // blyh
    public final JSONObject a() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("keyHandle", bbmu.c(this.e()));
            jSONObject0.put("clientDataJSON", bbmu.c(this.d()));
            jSONObject0.put("authenticatorData", bbmu.c(this.c()));
            jSONObject0.put("signature", bbmu.c(this.f()));
            if(this.a != null) {
                jSONObject0.put("userHandle", bbmu.c(this.g()));
            }
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", jSONException0);
        }
    }

    public static AuthenticatorAssertionResponse b(byte[] arr_b) {
        return (AuthenticatorAssertionResponse)bauc.a(arr_b, AuthenticatorAssertionResponse.CREATOR);
    }

    public final byte[] c() {
        return this.d.toByteArray();
    }

    public final byte[] d() {
        return this.c.toByteArray();
    }

    @Deprecated
    public final byte[] e() {
        return this.b.toByteArray();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof AuthenticatorAssertionResponse) ? bata.b(this.b, ((AuthenticatorAssertionResponse)object0).b) && bata.b(this.c, ((AuthenticatorAssertionResponse)object0).c) && bata.b(this.d, ((AuthenticatorAssertionResponse)object0).d) && bata.b(this.e, ((AuthenticatorAssertionResponse)object0).e) && bata.b(this.a, ((AuthenticatorAssertionResponse)object0).a) : false;
    }

    public final byte[] f() {
        return this.e.toByteArray();
    }

    public final byte[] g() {
        return this.a == null ? null : this.a.toByteArray();
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public final byte[] h() {
        return bauc.n(this);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(new Object[]{this.b}), Arrays.hashCode(new Object[]{this.c}), Arrays.hashCode(new Object[]{this.d}), Arrays.hashCode(new Object[]{this.e}), Arrays.hashCode(new Object[]{this.a})});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        ghjc ghjc0 = ghjc.f;
        gfsv0.add("keyHandle", ghjc0.o(this.e()));
        gfsv0.add("clientDataJSON", ghjc0.o(this.d()));
        gfsv0.add("authenticatorData", ghjc0.o(this.c()));
        gfsv0.add("signature", ghjc0.o(this.f()));
        byte[] arr_b = this.g();
        if(arr_b != null) {
            gfsv0.add("userHandle", ghjc0.o(arr_b));
        }
        return gfsv0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 2, this.e(), false);
        baub.i(parcel0, 3, this.d(), false);
        baub.i(parcel0, 4, this.c(), false);
        baub.i(parcel0, 5, this.f(), false);
        baub.i(parcel0, 6, this.g(), false);
        baub.c(parcel0, v1);
    }
}


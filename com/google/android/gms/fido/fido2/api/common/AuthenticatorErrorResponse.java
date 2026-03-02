package com.google.android.gms.fido.fido2.api.common;

import MoreObjects;
import ToStringHelper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import bauc;
import bmhc;
import bmhs;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR;
    public final ErrorCode a;
    public final String b;
    public final int c;

    static {
        AuthenticatorErrorResponse.CREATOR = new bmhc();
    }

    public AuthenticatorErrorResponse(int v, String s, int v1) {
        try {
            this.a = ErrorCode.a(v);
            this.b = s;
            this.c = v1;
        }
        catch(bmhs bmhs0) {
            throw new IllegalArgumentException(bmhs0);
        }
    }

    @Override  // blyh
    public final JSONObject a() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("errorCode", this.a.m);
            String s = this.b;
            if(s != null) {
                jSONObject0.put("errorMessage", s);
            }
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", jSONException0);
        }
    }

    public final int b() {
        return this.a.m;
    }

    public static AuthenticatorErrorResponse c(byte[] arr_b) {
        return (AuthenticatorErrorResponse)bauc.a(arr_b, AuthenticatorErrorResponse.CREATOR);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof AuthenticatorErrorResponse) ? bata.b(this.a, ((AuthenticatorErrorResponse)object0).a) && bata.b(this.b, ((AuthenticatorErrorResponse)object0).b) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((AuthenticatorErrorResponse)object0).c)) : false;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public final byte[] h() {
        return bauc.n(this);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, ((int)this.c)});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.f("errorCode", this.a.m);
        String s = this.b;
        if(s != null) {
            gfsv0.add("errorMessage", s);
        }
        return gfsv0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.b());
        baub.v(parcel0, 3, this.b, false);
        baub.o(parcel0, 4, this.c);
        baub.c(parcel0, v1);
    }
}


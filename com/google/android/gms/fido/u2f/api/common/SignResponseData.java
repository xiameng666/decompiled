package com.google.android.gms.fido.u2f.api.common;

import MoreObjects;
import ToStringHelper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import bata;
import batl;
import baub;
import bndw;
import ghjc;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;
    public final String b;
    public final byte[] c;
    public final byte[] d;

    static {
        SignResponseData.CREATOR = new bndw();
    }

    public SignResponseData(byte[] arr_b, String s, byte[] arr_b1, byte[] arr_b2) {
        batl.s(arr_b);
        this.a = arr_b;
        batl.s(s);
        this.b = s;
        batl.s(arr_b1);
        this.c = arr_b1;
        batl.s(arr_b2);
        this.d = arr_b2;
    }

    @Override  // blyh
    public final JSONObject a() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("keyHandle", SignResponseData.b(this.a));
            jSONObject0.put("clientData", SignResponseData.b(this.b.getBytes()));
            jSONObject0.put("signatureData", SignResponseData.b(this.c));
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException(jSONException0);
        }
    }

    private static final String b(byte[] arr_b) {
        return Base64.encodeToString(arr_b, 11);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof SignResponseData) ? Arrays.equals(this.a, ((SignResponseData)object0).a) && bata.b(this.b, ((SignResponseData)object0).b) && Arrays.equals(this.c, ((SignResponseData)object0).c) && Arrays.equals(this.d, ((SignResponseData)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.a);
        Integer integer1 = Arrays.hashCode(this.c);
        Integer integer2 = Arrays.hashCode(this.d);
        return Arrays.hashCode(new Object[]{integer0, this.b, integer1, integer2});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("keyHandle", ghjc.f.o(this.a));
        gfsv0.add("clientDataString", this.b);
        gfsv0.add("signatureData", ghjc.f.o(this.c));
        gfsv0.add("application", ghjc.f.o(this.d));
        return gfsv0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.i(parcel0, 4, this.c, false);
        baub.i(parcel0, 5, this.d, false);
        baub.c(parcel0, v1);
    }
}


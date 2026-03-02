package com.google.android.gms.fido.u2f.api.common;

import MoreObjects;
import ToStringHelper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import bata;
import batl;
import baub;
import bndq;
import bndt;
import ghjc;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;
    public final ProtocolVersion b;
    public final String c;

    static {
        RegisterResponseData.CREATOR = new bndt();
    }

    public RegisterResponseData(byte[] arr_b, ProtocolVersion protocolVersion0, String s) {
        batl.s(arr_b);
        this.a = arr_b;
        batl.s(protocolVersion0);
        this.b = protocolVersion0;
        boolean z = true;
        batl.b(protocolVersion0 != ProtocolVersion.a);
        if(protocolVersion0 == ProtocolVersion.b) {
            if(s != null) {
                z = false;
            }
            batl.b(z);
            this.c = null;
            return;
        }
        batl.s(s);
        this.c = s;
    }

    public RegisterResponseData(byte[] arr_b, String s, String s1) {
        this.a = arr_b;
        try {
            this.b = ProtocolVersion.b(s);
            this.c = s1;
        }
        catch(bndq bndq0) {
            throw new IllegalArgumentException(bndq0);
        }
    }

    @Override  // blyh
    public final JSONObject a() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("registrationData", RegisterResponseData.b(this.a));
            jSONObject0.put("version", this.b.d);
            String s = this.c;
            if(s != null) {
                jSONObject0.put("clientData", RegisterResponseData.b(s.getBytes()));
            }
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
        return (object0 instanceof RegisterResponseData) ? bata.b(this.b, ((RegisterResponseData)object0).b) && Arrays.equals(this.a, ((RegisterResponseData)object0).a) && bata.b(this.c, ((RegisterResponseData)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.a);
        return Arrays.hashCode(new Object[]{this.b, integer0, this.c});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("protocolVersion", this.b);
        gfsv0.add("registerData", ghjc.f.o(this.a));
        String s = this.c;
        if(s != null) {
            gfsv0.add("clientDataString", s);
        }
        return gfsv0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b.d, false);
        baub.v(parcel0, 4, this.c, false);
        baub.c(parcel0, v1);
    }
}


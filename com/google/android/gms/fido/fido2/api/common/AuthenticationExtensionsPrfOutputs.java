package com.google.android.gms.fido.fido2.api.common;

import ByteString;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import bata;
import baub;
import bbmu;
import bmgv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ggfz;
import glwl;
import hhrh;
import hhrj;
import hhro;
import hhrp;
import hhrq;
import hhrs;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthenticationExtensionsPrfOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    private final ByteString b;

    static {
        AuthenticationExtensionsPrfOutputs.CREATOR = new bmgv();
    }

    public AuthenticationExtensionsPrfOutputs(boolean z, ByteString hfsf0) {
        this.a = z;
        this.b = hfsf0;
    }

    public AuthenticationExtensionsPrfOutputs(boolean z, byte[] arr_b) {
        this(z, (arr_b == null ? null : ByteString.copyFrom(arr_b)));
    }

    public final hhrs a() {
        hhrp hhrp0;
        try {
            ArrayList arrayList0 = new ArrayList();
            byte[] arr_b = this.d();
            if(arr_b != null) {
                switch(arr_b.length) {
                    case 0x20: {
                        hhrp0 = hhrs.o(new hhro[]{new hhro(new hhrq("first"), hhrs.k(arr_b))});
                        break;
                    }
                    case 0x40: {
                        hhrp0 = hhrs.o(new hhro[]{new hhro(new hhrq("first"), hhrs.k(Arrays.copyOf(arr_b, 0x20))), new hhro(new hhrq("second"), hhrs.k(Arrays.copyOfRange(arr_b, 0x20, 0x40)))});
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("invalid length PRF outputs: " + arr_b.length);
                    }
                }
                arrayList0.add(new hhro(new hhrq("results"), hhrp0));
            }
            arrayList0.add(new hhro(new hhrq("enabled"), new hhrj(this.a)));
            return hhrs.n(arrayList0);
        }
        catch(hhrh hhrh0) {
            throw new IllegalArgumentException("Error encoding AuthenticationExtensionsPrfOutputs to CBOR", hhrh0);
        }
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            if(this.a) {
                jSONObject0.put("enabled", true);
            }
            byte[] arr_b = this.d();
            if(arr_b != null) {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("first", AuthenticationExtensionsPrfOutputs.f(Arrays.copyOf(arr_b, 0x20)));
                if(arr_b.length == 0x40) {
                    jSONObject1.put("second", AuthenticationExtensionsPrfOutputs.f(Arrays.copyOfRange(arr_b, 0x20, 0x40)));
                }
                jSONObject0.put("results", jSONObject1);
            }
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", jSONException0);
        }
    }

    public static byte[] c(String s) {
        try {
            byte[] arr_b = bbmu.f(s);
            if(arr_b.length == 0x20) {
                return arr_b;
            }
            throw new JSONException("PRF result value has wrong length");
        }
        catch(IllegalArgumentException unused_ex) {
            throw new JSONException("Error decoding PRF result value");
        }
    }

    public final byte[] d() {
        return this.b == null ? null : this.b.toByteArray();
    }

    public static byte[] e(hhrs hhrs0) {
        ggfz ggfz0 = hhrs0.m().a;
        if(ggfz0.containsKey(new hhrq("first"))) {
            byte[] arr_b = ((hhrs)ggfz0.get(new hhrq("first"))).j().a.toByteArray();
            if(arr_b.length != 0x20) {
                throw new IllegalArgumentException("Bad PRF input length");
            }
            if(ggfz0.containsKey(new hhrq("second"))) {
                byte[] arr_b1 = ((hhrs)ggfz0.get(new hhrq("second"))).j().a.toByteArray();
                if(arr_b1.length == 0x20) {
                    return glwl.d(new byte[][]{arr_b, arr_b1});
                }
                throw new IllegalArgumentException("Bad PRF input length");
            }
            return arr_b;
        }
        return null;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof AuthenticationExtensionsPrfOutputs) ? this.a == ((AuthenticationExtensionsPrfOutputs)object0).a && bata.b(this.b, ((AuthenticationExtensionsPrfOutputs)object0).b) : false;
    }

    private static String f(byte[] arr_b) {
        return Base64.encodeToString(arr_b, 11);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    @Override
    public final String toString() {
        byte[] arr_b = this.d();
        return "AuthenticationExtensionsPrfOutputs{enabled:" + this.a + "outputs:" + (arr_b != null) + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.i(parcel0, 2, this.d(), false);
        baub.c(parcel0, v1);
    }
}


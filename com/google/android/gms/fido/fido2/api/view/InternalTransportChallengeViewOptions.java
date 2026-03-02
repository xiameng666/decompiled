package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import bmko;
import bmky;
import ghjc;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class InternalTransportChallengeViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final byte[] b;
    public final byte[] c;

    static {
        InternalTransportChallengeViewOptions.CREATOR = new bmko();
    }

    public InternalTransportChallengeViewOptions(String s, byte[] arr_b, byte[] arr_b1) {
        batl.s(s);
        this.a = s;
        this.b = arr_b;
        this.c = arr_b1;
    }

    @Override  // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final JSONObject a() {
        JSONObject jSONObject0 = super.a();
        try {
            jSONObject0.put("rpId", this.a);
            byte[] arr_b = this.b;
            if(arr_b != null) {
                jSONObject0.put("keyHandle", InternalTransportChallengeViewOptions.d(arr_b));
            }
            byte[] arr_b1 = this.c;
            if(arr_b1 != null) {
                jSONObject0.put("dataToSign", InternalTransportChallengeViewOptions.d(arr_b1));
            }
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
            throw new IllegalStateException(jSONException0);
        }
    }

    @Override  // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final bmky b() {
        return bmky.m;
    }

    public static byte[] c(String s) {
        return ghjc.d.q(s);
    }

    private static String d(byte[] arr_b) {
        return ghjc.d.o(arr_b);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof InternalTransportChallengeViewOptions) ? this.a.equals(((InternalTransportChallengeViewOptions)object0).a) && Arrays.equals(this.b, ((InternalTransportChallengeViewOptions)object0).b) && Arrays.equals(this.c, ((InternalTransportChallengeViewOptions)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override  // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, this.b, false);
        baub.i(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}


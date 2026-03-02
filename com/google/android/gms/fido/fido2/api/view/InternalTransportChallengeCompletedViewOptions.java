package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bmkn;
import bmky;
import ghjc;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class InternalTransportChallengeCompletedViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final byte[] b;

    static {
        InternalTransportChallengeCompletedViewOptions.CREATOR = new bmkn();
    }

    public InternalTransportChallengeCompletedViewOptions(int v, byte[] arr_b) {
        this.a = v;
        this.b = arr_b;
    }

    @Override  // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final JSONObject a() {
        JSONObject jSONObject0 = super.a();
        try {
            jSONObject0.put("statusCode", this.a);
            byte[] arr_b = this.b;
            if(arr_b != null) {
                jSONObject0.put("signedData", ghjc.d.o(arr_b));
            }
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
            throw new IllegalStateException(jSONException0);
        }
    }

    @Override  // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final bmky b() {
        return bmky.n;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof InternalTransportChallengeCompletedViewOptions) ? this.a == ((InternalTransportChallengeCompletedViewOptions)object0).a && Arrays.equals(this.b, ((InternalTransportChallengeCompletedViewOptions)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b});
    }

    @Override  // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.i(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}


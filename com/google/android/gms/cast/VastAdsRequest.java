package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import attn;
import aurf;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class VastAdsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;

    static {
        VastAdsRequest.CREATOR = new attn();
    }

    public VastAdsRequest(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    public static VastAdsRequest a(JSONObject jSONObject0) {
        return jSONObject0 == null ? null : new VastAdsRequest(aurf.j(jSONObject0, "adTagUrl"), aurf.j(jSONObject0, "adsResponse"));
    }

    public final JSONObject b() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            String s = this.a;
            if(s != null) {
                jSONObject0.put("adTagUrl", s);
            }
            String s1 = this.b;
            if(s1 != null) {
                jSONObject0.put("adsResponse", s1);
            }
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof VastAdsRequest) ? aurf.u(this.a, ((VastAdsRequest)object0).a) && aurf.u(this.b, ((VastAdsRequest)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.c(parcel0, v1);
    }
}


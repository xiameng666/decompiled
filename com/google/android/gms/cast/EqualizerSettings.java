package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import atrx;
import aurf;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class EqualizerSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final EqualizerBandSettings a;
    public final EqualizerBandSettings b;

    static {
        EqualizerSettings.CREATOR = new atrx();
    }

    public EqualizerSettings(EqualizerBandSettings equalizerBandSettings0, EqualizerBandSettings equalizerBandSettings1) {
        this.a = equalizerBandSettings0;
        this.b = equalizerBandSettings1;
    }

    public final JSONObject a() {
        JSONObject jSONObject0 = new JSONObject();
        EqualizerBandSettings equalizerBandSettings0 = this.a;
        if(equalizerBandSettings0 != null) {
            EqualizerBandSettings equalizerBandSettings1 = this.b;
            if(equalizerBandSettings1 != null) {
                try {
                    jSONObject0.put("low_shelf", equalizerBandSettings0.b());
                    jSONObject0.put("high_shelf", equalizerBandSettings1.b());
                }
                catch(JSONException unused_ex) {
                }
            }
        }
        return jSONObject0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof EqualizerSettings) ? aurf.u(this.a, ((EqualizerSettings)object0).a) && aurf.u(this.b, ((EqualizerSettings)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.t(parcel0, 3, this.b, v, false);
        baub.c(parcel0, v1);
    }
}


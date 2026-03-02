package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import atrw;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.math.BigDecimal;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class EqualizerBandSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final float a;
    public final float b;
    public final float c;

    static {
        EqualizerBandSettings.CREATOR = new atrw();
    }

    public EqualizerBandSettings(float f, float f1, float f2) {
        this.a = f;
        this.b = f1;
        this.c = f2;
    }

    public static EqualizerBandSettings a(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        if(!jSONObject0.has("gain_db")) {
            return null;
        }
        try {
            return new EqualizerBandSettings(BigDecimal.valueOf(jSONObject0.optDouble("frequency", -1.0)).floatValue(), BigDecimal.valueOf(jSONObject0.optDouble("quality", -1.0)).floatValue(), BigDecimal.valueOf(jSONObject0.getDouble("gain_db")).floatValue());
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("gain_db", ((double)this.c));
            float f = this.a;
            if(f != -1.0f) {
                jSONObject0.put("frequency", ((double)f));
            }
            float f1 = this.b;
            if(f1 != -1.0f) {
                jSONObject0.put("quality", ((double)f1));
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
        return (object0 instanceof EqualizerBandSettings) ? this.a == ((EqualizerBandSettings)object0).a && this.b == ((EqualizerBandSettings)object0).b && this.c == ((EqualizerBandSettings)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((float)this.a), ((float)this.b), ((float)this.c)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.l(parcel0, 2, this.a);
        baub.l(parcel0, 3, this.b);
        baub.l(parcel0, 4, this.c);
        baub.c(parcel0, v1);
    }
}


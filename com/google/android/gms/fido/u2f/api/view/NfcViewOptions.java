package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bnff;
import bnfl;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class NfcViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;

    static {
        NfcViewOptions.CREATOR = new bnff();
    }

    public NfcViewOptions() {
        this(false, false);
    }

    public NfcViewOptions(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    @Override  // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final JSONObject a() {
        JSONObject jSONObject0 = super.a();
        try {
            jSONObject0.put("deviceRemovedTooSoon", this.a);
            jSONObject0.put("recommendUsb", this.b);
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException(jSONException0);
        }
    }

    @Override  // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final Transport c() {
        return Transport.c;
    }

    @Override  // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final bnfl d() {
        return bnfl.b;
    }

    @Override  // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final JSONObject e() {
        return this.a();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof NfcViewOptions) ? this.a == ((NfcViewOptions)object0).a && this.b == ((NfcViewOptions)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    @Override  // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 2, this.a);
        baub.e(parcel0, 3, this.b);
        baub.c(parcel0, v1);
    }
}


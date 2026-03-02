package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bnfe;
import bnfl;
import com.google.android.gms.fido.common.Transport;
import org.json.JSONObject;

public class NfcRemoveKeyViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR;

    static {
        NfcRemoveKeyViewOptions.CREATOR = new bnfe();
    }

    @Override  // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final Transport c() {
        return Transport.c;
    }

    @Override  // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final bnfl d() {
        return bnfl.e;
    }

    @Override  // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final JSONObject e() {
        return this.a();
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof NfcRemoveKeyViewOptions;
    }

    @Override  // com.google.android.gms.fido.u2f.api.view.ViewOptions
    public final void writeToParcel(Parcel parcel0, int v) {
        baub.c(parcel0, baub.a(parcel0));
    }
}


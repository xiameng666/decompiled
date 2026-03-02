package com.google.android.gms.recaptcha.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import ejpv;

public class InitResults extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final RecaptchaHandle a;

    static {
        InitResults.CREATOR = new ejpv();
    }

    public InitResults(RecaptchaHandle recaptchaHandle0) {
        this.a = recaptchaHandle0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.c(parcel0, v1);
    }
}


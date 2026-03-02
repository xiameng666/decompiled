package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bbwu;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class VerifyPhoneNumberResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final PhoneNumberVerification[] a;
    public final Bundle b;

    static {
        VerifyPhoneNumberResponse.CREATOR = new bbwu();
    }

    public VerifyPhoneNumberResponse(PhoneNumberVerification[] arr_phoneNumberVerification, Bundle bundle0) {
        this.a = arr_phoneNumberVerification;
        this.b = bundle0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.J(parcel0, 1, this.a, v);
        baub.g(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}


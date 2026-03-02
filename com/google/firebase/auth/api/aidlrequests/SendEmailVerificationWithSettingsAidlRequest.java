package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;
import gorx;

public class SendEmailVerificationWithSettingsAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final ActionCodeSettings b;

    static {
        SendEmailVerificationWithSettingsAidlRequest.CREATOR = new gorx();
    }

    public SendEmailVerificationWithSettingsAidlRequest(String s, ActionCodeSettings actionCodeSettings0) {
        this.a = s;
        this.b = actionCodeSettings0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}


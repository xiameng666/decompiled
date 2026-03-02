package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;
import gory;

public class SendGetOobConfirmationCodeEmailAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final ActionCodeSettings b;
    public final String c;

    static {
        SendGetOobConfirmationCodeEmailAidlRequest.CREATOR = new gory();
    }

    public SendGetOobConfirmationCodeEmailAidlRequest(String s, ActionCodeSettings actionCodeSettings0, String s1) {
        this.a = s;
        this.b = actionCodeSettings0;
        this.c = s1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}


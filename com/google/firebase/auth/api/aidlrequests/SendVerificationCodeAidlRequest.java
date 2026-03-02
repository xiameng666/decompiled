package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.api.model.SendVerificationCodeRequest;
import gorz;

public class SendVerificationCodeAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final SendVerificationCodeRequest a;

    static {
        SendVerificationCodeAidlRequest.CREATOR = new gorz();
    }

    public SendVerificationCodeAidlRequest(SendVerificationCodeRequest sendVerificationCodeRequest0) {
        this.a = sendVerificationCodeRequest0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.c(parcel0, v1);
    }
}


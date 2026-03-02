package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.UserProfileChangeRequest;
import gosm;

public class UpdateProfileAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final UserProfileChangeRequest a;
    public final String b;

    static {
        UpdateProfileAidlRequest.CREATOR = new gosm();
    }

    public UpdateProfileAidlRequest(UserProfileChangeRequest userProfileChangeRequest0, String s) {
        this.a = userProfileChangeRequest0;
        this.b = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}


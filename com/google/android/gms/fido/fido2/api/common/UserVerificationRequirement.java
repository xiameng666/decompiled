package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import bmjh;
import bmji;

public enum UserVerificationRequirement implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator CREATOR;
    public final String d;

    static {
        UserVerificationRequirement.CREATOR = new bmjh();
    }

    private UserVerificationRequirement(String s1) {
        this.d = s1;
    }

    public static UserVerificationRequirement a(String s) {
        UserVerificationRequirement[] arr_userVerificationRequirement = UserVerificationRequirement.values();
        for(int v = 0; v < arr_userVerificationRequirement.length; ++v) {
            UserVerificationRequirement userVerificationRequirement0 = arr_userVerificationRequirement[v];
            if(s.equals(userVerificationRequirement0.d)) {
                return userVerificationRequirement0;
            }
        }
        throw new bmji(s);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.d;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.d);
    }
}


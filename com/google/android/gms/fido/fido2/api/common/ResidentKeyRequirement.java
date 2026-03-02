package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import bmix;
import bmiy;

public enum ResidentKeyRequirement implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator CREATOR;
    public final String d;

    static {
        ResidentKeyRequirement.CREATOR = new bmix();
    }

    private ResidentKeyRequirement(String s1) {
        this.d = s1;
    }

    public static ResidentKeyRequirement a(String s) {
        ResidentKeyRequirement[] arr_residentKeyRequirement = ResidentKeyRequirement.values();
        for(int v = 0; v < arr_residentKeyRequirement.length; ++v) {
            ResidentKeyRequirement residentKeyRequirement0 = arr_residentKeyRequirement[v];
            if(s.equals(residentKeyRequirement0.d)) {
                return residentKeyRequirement0;
            }
        }
        throw new bmiy(s);
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


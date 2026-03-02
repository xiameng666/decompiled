package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import bmgp;
import bmgq;

public enum AttestationConveyancePreference implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");

    public static final Parcelable.Creator CREATOR;
    public final String d;

    static {
        AttestationConveyancePreference.CREATOR = new bmgp();
    }

    private AttestationConveyancePreference(String s1) {
        this.d = s1;
    }

    public static AttestationConveyancePreference a(String s) {
        AttestationConveyancePreference[] arr_attestationConveyancePreference = AttestationConveyancePreference.values();
        for(int v = 0; v < arr_attestationConveyancePreference.length; ++v) {
            AttestationConveyancePreference attestationConveyancePreference0 = arr_attestationConveyancePreference[v];
            if(s.equals(attestationConveyancePreference0.d)) {
                return attestationConveyancePreference0;
            }
        }
        throw new bmgq(s);
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


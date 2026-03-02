package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bkpg;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class BillingSignupData implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;

    static {
        BillingSignupData.CREATOR = new bkpg();
    }

    public BillingSignupData(Parcel parcel0) {
        this.a = parcel0.readString();
        this.b = parcel0.readString();
    }

    public BillingSignupData(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
    }
}


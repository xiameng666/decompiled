package com.google.android.libraries.logging.uievents;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import fhvj;

public final class InstanceId implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        InstanceId.CREATOR = new fhvj();
    }

    public InstanceId(int v) {
        this.a = Math.min(Math.max(0, v), 0x100000);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof InstanceId) ? this.a == ((InstanceId)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
    }
}


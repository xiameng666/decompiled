package com.google.android.libraries.photos.backup.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import fpti;
import fqda;

public final class StatusResult implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final long b;
    public final boolean c;
    public final StatusResult.PermissionAskingState d;

    static {
        StatusResult.CREATOR = new fpti();
    }

    public StatusResult(Parcel parcel0) {
        this.a = parcel0.readInt();
        this.b = parcel0.readLong();
        this.c = fqda.a(parcel0);
        this.d = (StatusResult.PermissionAskingState)parcel0.readSerializable();
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
        parcel0.writeLong(this.b);
        parcel0.writeInt(((int)this.c));
        parcel0.writeSerializable(this.d);
    }
}


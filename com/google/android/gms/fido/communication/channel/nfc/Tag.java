package com.google.android.gms.fido.communication.channel.nfc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import bmba;

public class Tag implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final android.nfc.Tag a;

    static {
        Tag.CREATOR = new bmba();
    }

    public Tag(android.nfc.Tag tag0) {
        this.a = tag0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        this.a.writeToParcel(parcel0, v);
    }
}


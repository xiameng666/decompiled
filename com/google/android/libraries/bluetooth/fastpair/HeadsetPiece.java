package com.google.android.libraries.bluetooth.fastpair;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import fgnt;
import fgnx;

public abstract class HeadsetPiece implements Parcelable, fgnx {
    public static final Parcelable.Creator CREATOR;

    static {
        HeadsetPiece.CREATOR = new fgnt();
    }

    @Override  // fgnx
    public abstract int a();

    public abstract int b();

    public abstract Uri c();

    public abstract String d();

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // fgnx
    public abstract boolean e();

    public final boolean f() {
        return this.a() <= this.b() && this.a() >= 0 && !this.e();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.d());
        parcel0.writeInt(this.b());
        parcel0.writeInt(this.a());
        parcel0.writeByte(((byte)this.e()));
        parcel0.writeParcelable(this.c(), v);
    }
}


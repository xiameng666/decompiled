package com.google.android.wallet.analytics;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import gamf;
import gciq;
import gfcr;

public class AppValidationResult implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final gfcr a;
    public final int b;
    public final long c;

    static {
        AppValidationResult.CREATOR = new gamf();
    }

    public AppValidationResult(Parcel parcel0) {
        this.a = (gfcr)gciq.f(parcel0, ((Parser)((ProtoLiteMessage)gfcr.a).jf(7, null)));
        this.b = parcel0.readInt();
        this.c = parcel0.readLong();
    }

    public AppValidationResult(gfcr gfcr0, int v, long v1) {
        this.a = gfcr0;
        this.b = v;
        this.c = v1;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return "\npackageName: " + this.a.c + "\nresultCode: " + this.b + "\ndurationMs: " + this.c;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        gciq.o(((MessageLite)this.a), parcel0);
        parcel0.writeInt(this.b);
        parcel0.writeLong(this.c);
    }
}


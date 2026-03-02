package com.google.android.gms.wallet.im;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import fblc;
import fbld;

public class InstrumentManagerResult implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final InstrumentManagerResult a;
    public String b;
    public long c;
    public byte[] d;
    public byte[] e;

    static {
        InstrumentManagerResult.a = InstrumentManagerResult.a().a;
        InstrumentManagerResult.CREATOR = new fblc();
    }

    private InstrumentManagerResult() {
    }

    public InstrumentManagerResult(Parcel parcel0) {
        this.b = parcel0.readString();
        this.c = parcel0.readLong();
        this.d = parcel0.createByteArray();
        this.e = parcel0.createByteArray();
    }

    public static fbld a() {
        return new fbld(new InstrumentManagerResult());
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.b);
        parcel0.writeLong(this.c);
        parcel0.writeByteArray(this.d);
        parcel0.writeByteArray(this.e);
    }
}


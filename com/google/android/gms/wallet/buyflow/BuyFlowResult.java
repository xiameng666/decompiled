package com.google.android.gms.wallet.buyflow;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import fbda;
import fbdb;

public class BuyFlowResult implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final BuyFlowResult a;
    public String b;
    public String c;
    public byte[] d;
    public byte[] e;
    public int f;
    public byte[] g;

    static {
        BuyFlowResult.a = BuyFlowResult.a().a;
        BuyFlowResult.CREATOR = new fbda();
    }

    private BuyFlowResult() {
    }

    public BuyFlowResult(Parcel parcel0) {
        this.c = parcel0.readString();
        this.b = parcel0.readString();
        this.d = parcel0.createByteArray();
        this.e = parcel0.createByteArray();
        this.f = parcel0.readInt();
        this.g = parcel0.createByteArray();
    }

    public static fbdb a() {
        return new fbdb(new BuyFlowResult());
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.c);
        parcel0.writeString(this.b);
        parcel0.writeByteArray(this.d);
        parcel0.writeByteArray(this.e);
        parcel0.writeInt(this.f);
        parcel0.writeByteArray(this.g);
    }
}


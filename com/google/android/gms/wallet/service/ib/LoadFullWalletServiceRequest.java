package com.google.android.gms.wallet.service.ib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.gms.wallet.FullWalletRequest;
import fbsg;

public class LoadFullWalletServiceRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final Bundle a;
    public final FullWalletRequest b;
    public final boolean c;

    static {
        LoadFullWalletServiceRequest.CREATOR = new fbsg();
    }

    public LoadFullWalletServiceRequest(Bundle bundle0, FullWalletRequest fullWalletRequest0, boolean z) {
        this.a = bundle0;
        this.b = fullWalletRequest0;
        this.c = z;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.a, v);
        parcel0.writeParcelable(this.b, v);
        parcel0.writeByte(((byte)this.c));
    }
}


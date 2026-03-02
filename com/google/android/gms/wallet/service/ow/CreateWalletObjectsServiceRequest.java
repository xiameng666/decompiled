package com.google.android.gms.wallet.service.ow;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import fbwp;
import guyp;

public class CreateWalletObjectsServiceRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final Account a;
    public guyp b;
    public byte[] c;

    static {
        CreateWalletObjectsServiceRequest.CREATOR = new fbwp();
    }

    public CreateWalletObjectsServiceRequest(Account account0, guyp guyp0) {
        this.a = account0;
        this.b = guyp0;
    }

    public CreateWalletObjectsServiceRequest(Account account0, byte[] arr_b) {
        this.a = account0;
        this.c = arr_b;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        this.a.writeToParcel(parcel0, v);
        if(this.c == null) {
            this.c = this.b.toBytesArray();
        }
        parcel0.writeByteArray(this.c);
    }
}


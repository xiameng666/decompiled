package com.google.android.wallet.common.moduleapicalltasks;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import gchn;

public class PaySeFetchCardAsyncTaskLoaderRequest extends ModuleApiCallTaskLoaderRequest {
    public static final Parcelable.Creator CREATOR;
    public final Account a;
    public final int b;

    static {
        PaySeFetchCardAsyncTaskLoaderRequest.CREATOR = new gchn();
    }

    public PaySeFetchCardAsyncTaskLoaderRequest(Account account0, int v) {
        this.a = account0;
        this.b = v;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        this.a.writeToParcel(parcel0, v);
        parcel0.writeInt(this.b);
    }
}


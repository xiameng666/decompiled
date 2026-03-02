package com.google.android.wallet.common.moduleapicalltasks;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import gchr;

public class PaySePerformSdkOperationAsyncTaskLoaderRequest extends ModuleApiCallTaskLoaderRequest {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final Account e;
    public final long f;

    static {
        PaySePerformSdkOperationAsyncTaskLoaderRequest.CREATOR = new gchr();
    }

    public PaySePerformSdkOperationAsyncTaskLoaderRequest(int v, Account account0, int v1, String s, String s1, long v2) {
        this.a = v;
        this.e = account0;
        this.b = v1;
        this.c = s;
        this.d = s1;
        this.f = v2;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
        this.e.writeToParcel(parcel0, v);
        parcel0.writeInt(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
        parcel0.writeLong(this.f);
    }
}


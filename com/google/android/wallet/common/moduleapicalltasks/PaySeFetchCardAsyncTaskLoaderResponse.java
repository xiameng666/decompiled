package com.google.android.wallet.common.moduleapicalltasks;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import gcho;
import gciq;
import java.util.ArrayList;

public class PaySeFetchCardAsyncTaskLoaderResponse extends ModuleApiCallTaskLoaderResponse {
    public static final Parcelable.Creator CREATOR;
    public final ArrayList a;

    static {
        PaySeFetchCardAsyncTaskLoaderResponse.CREATOR = new gcho();
    }

    public PaySeFetchCardAsyncTaskLoaderResponse(ArrayList arrayList0) {
        this.a = arrayList0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        gciq.n(this.a, parcel0);
    }
}


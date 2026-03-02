package com.google.android.gms.wearable.node.accountmatching.ui;

import android.os.Parcelable;

public abstract class GoogleAccountInfo implements Parcelable {
    public abstract String a();

    public abstract boolean b();

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }
}


package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class WalletAnalyticsEvent implements Parcelable {
    public String m;

    public WalletAnalyticsEvent() {
    }

    public WalletAnalyticsEvent(Parcel parcel0) {
        this.m = parcel0.readString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.m);
    }
}


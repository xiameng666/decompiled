package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import fazk;

public class OwMwAccountChangedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR;

    static {
        OwMwAccountChangedEvent.CREATOR = new fazk();
    }

    public OwMwAccountChangedEvent(Parcel parcel0) {
        super(parcel0);
    }

    public OwMwAccountChangedEvent(String s, String s1) {
        this.m = s;
        this.a = s1;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }
}


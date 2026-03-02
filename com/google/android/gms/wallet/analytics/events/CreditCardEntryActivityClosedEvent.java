package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import fayl;
import fbdz;

public class CreditCardEntryActivityClosedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR;
    public final int c;

    static {
        CreditCardEntryActivityClosedEvent.CREATOR = new fayl();
    }

    public CreditCardEntryActivityClosedEvent(int v, String s) {
        this.m = s;
        this.c = v;
    }

    public CreditCardEntryActivityClosedEvent(Parcel parcel0) {
        super(parcel0);
        this.c = fbdz.a(parcel0.readInt());
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeInt(this.c - 1);
    }
}


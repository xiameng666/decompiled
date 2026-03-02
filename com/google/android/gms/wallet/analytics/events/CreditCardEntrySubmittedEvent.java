package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import fayn;

public class CreditCardEntrySubmittedEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;

    static {
        CreditCardEntrySubmittedEvent.CREATOR = new fayn();
    }

    public CreditCardEntrySubmittedEvent(int v, int v1, String s) {
        this.m = s;
        this.a = v;
        this.b = v1;
    }

    public CreditCardEntrySubmittedEvent(Parcel parcel0) {
        super(parcel0);
        this.a = parcel0.readInt();
        this.b = parcel0.readInt();
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeInt(this.a);
        parcel0.writeInt(this.b);
    }
}


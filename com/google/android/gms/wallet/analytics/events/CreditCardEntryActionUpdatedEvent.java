package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.wallet.analytics.CreditCardEntryAction;
import fayk;

public class CreditCardEntryActionUpdatedEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR;
    public CreditCardEntryAction a;

    static {
        CreditCardEntryActionUpdatedEvent.CREATOR = new fayk();
    }

    public CreditCardEntryActionUpdatedEvent(Parcel parcel0) {
        super(parcel0);
        this.a = new CreditCardEntryAction();
        this.a = (CreditCardEntryAction)parcel0.readParcelable(CreditCardEntryActionUpdatedEvent.class.getClassLoader());
    }

    public CreditCardEntryActionUpdatedEvent(CreditCardEntryAction creditCardEntryAction0, String s) {
        this.m = s;
        this.a = creditCardEntryAction0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeParcelable(this.a, v);
    }
}


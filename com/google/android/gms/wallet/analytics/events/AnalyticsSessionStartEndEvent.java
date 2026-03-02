package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

public abstract class AnalyticsSessionStartEndEvent extends WalletAnalyticsEvent {
    public String a;
    public String b;

    public AnalyticsSessionStartEndEvent() {
    }

    public AnalyticsSessionStartEndEvent(Parcel parcel0) {
        super(parcel0);
        this.a = parcel0.readString();
        this.b = parcel0.readString();
    }

    protected static String a(BuyFlowConfig buyFlowConfig0, String s) {
        String s1 = null;
        String s2 = buyFlowConfig0 == null ? null : buyFlowConfig0.c();
        if(buyFlowConfig0 != null) {
            s1 = buyFlowConfig0.d;
        }
        return s2 + s + s1;
    }

    @Override  // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent
    public void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
    }
}


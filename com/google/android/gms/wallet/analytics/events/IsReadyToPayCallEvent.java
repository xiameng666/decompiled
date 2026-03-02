package com.google.android.gms.wallet.analytics.events;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import fays;
import fbly;
import gciq;
import gklh;
import gkmh;

public class IsReadyToPayCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR;
    public final BuyFlowConfig c;
    public final gklh d;
    public final gkmh e;

    static {
        IsReadyToPayCallEvent.CREATOR = new fays();
    }

    public IsReadyToPayCallEvent(Parcel parcel0) {
        super(parcel0);
        this.c = (BuyFlowConfig)parcel0.readParcelable(IsReadyToPayCallEvent.class.getClassLoader());
        this.d = (gklh)gciq.f(parcel0, ((Parser)((ProtoLiteMessage)gklh.a).jf(7, null)));
        this.e = (gkmh)gciq.f(parcel0, ((Parser)((ProtoLiteMessage)gkmh.a).jf(7, null)));
    }

    public IsReadyToPayCallEvent(BuyFlowConfig buyFlowConfig0, gklh gklh0, String s, gkmh gkmh0) {
        this.m = fbly.a();
        this.c = buyFlowConfig0;
        this.d = gklh0;
        this.a = s;
        this.e = gkmh0;
        this.b = IsReadyToPayCallEvent.a(buyFlowConfig0, s);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeParcelable(this.c, v);
        gciq.o(((MessageLite)this.d), parcel0);
        gciq.o(((MessageLite)this.e), parcel0);
    }
}


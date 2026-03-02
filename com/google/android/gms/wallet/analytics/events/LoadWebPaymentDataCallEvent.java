package com.google.android.gms.wallet.analytics.events;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import fayu;
import fbly;
import fbpb;
import gciq;
import gklj;
import gkmh;

public class LoadWebPaymentDataCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR;
    public final BuyFlowConfig c;
    public final gklj d;
    public final gkmh e;

    static {
        LoadWebPaymentDataCallEvent.CREATOR = new fayu();
    }

    public LoadWebPaymentDataCallEvent(Parcel parcel0) {
        super(parcel0);
        this.c = (BuyFlowConfig)parcel0.readParcelable(LoadWebPaymentDataCallEvent.class.getClassLoader());
        this.d = (gklj)gciq.f(parcel0, ((Parser)((ProtoLiteMessage)gklj.a).jf(7, null)));
        this.e = (gkmh)gciq.f(parcel0, ((Parser)((ProtoLiteMessage)gkmh.a).jf(7, null)));
    }

    public LoadWebPaymentDataCallEvent(BuyFlowConfig buyFlowConfig0, gklj gklj0, String s, gkmh gkmh0) {
        this.m = fbly.a();
        this.c = buyFlowConfig0;
        this.d = gklj0;
        this.a = s;
        this.e = gkmh0;
        this.b = LoadWebPaymentDataCallEvent.a(buyFlowConfig0, s);
    }

    public static void b(Context context0, BuyFlowConfig buyFlowConfig0, gklj gklj0, String s, gkmh gkmh0) {
        fbpb.a(context0, new LoadWebPaymentDataCallEvent(buyFlowConfig0, gklj0, s, gkmh0));
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


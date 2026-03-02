package com.google.android.gms.wallet.analytics.events;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import fayj;
import fbly;
import fbpb;
import gciq;
import gkkk;

public class CreateWalletObjectsEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR;
    public final BuyFlowConfig c;
    public final gkkk d;

    static {
        CreateWalletObjectsEvent.CREATOR = new fayj();
    }

    public CreateWalletObjectsEvent(Parcel parcel0) {
        super(parcel0);
        this.c = (BuyFlowConfig)parcel0.readParcelable(CreateWalletObjectsEvent.class.getClassLoader());
        this.d = (gkkk)gciq.f(parcel0, ((Parser)((ProtoLiteMessage)gkkk.a).jf(7, null)));
    }

    public CreateWalletObjectsEvent(BuyFlowConfig buyFlowConfig0, gkkk gkkk0) {
        this.m = fbly.a();
        this.c = buyFlowConfig0;
        this.d = gkkk0;
        if(buyFlowConfig0 != null) {
            ApplicationParameters applicationParameters0 = buyFlowConfig0.b;
            if(applicationParameters0 != null) {
                this.a = applicationParameters0.b == null ? null : applicationParameters0.b.name;
            }
        }
        this.b = CreateWalletObjectsEvent.a(buyFlowConfig0, this.a);
    }

    public static void b(Context context0, BuyFlowConfig buyFlowConfig0, gkkk gkkk0) {
        fbpb.a(context0, new CreateWalletObjectsEvent(buyFlowConfig0, gkkk0));
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
    }
}


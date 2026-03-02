package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import fazh;
import fbly;
import fbxz;

public class OwInitializedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR;
    public final BuyFlowConfig c;
    public final int d;
    public final int e;
    public final int f;

    static {
        OwInitializedEvent.CREATOR = new fazh();
    }

    public OwInitializedEvent(Parcel parcel0) {
        super(parcel0);
        this.d = parcel0.readInt();
        this.e = parcel0.readInt();
        this.f = parcel0.readInt();
        this.c = (BuyFlowConfig)BuyFlowConfig.CREATOR.createFromParcel(parcel0);
    }

    public OwInitializedEvent(BuyFlowConfig buyFlowConfig0, String s) {
        this.m = fbly.a();
        this.a = s;
        this.b = OwInitializedEvent.a(buyFlowConfig0, this.a);
        this.d = 2;
        this.e = 1;
        this.f = 0;
        this.c = buyFlowConfig0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeInt(this.d);
        parcel0.writeInt(this.e);
        parcel0.writeInt(this.f);
        fbxz.a(this.c, parcel0, v);
    }
}


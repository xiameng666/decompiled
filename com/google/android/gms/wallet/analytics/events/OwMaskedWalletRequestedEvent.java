package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import fazj;
import fbly;
import fbpb;
import fbxz;

public class OwMaskedWalletRequestedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR;
    public final BuyFlowConfig c;
    public final boolean d;

    static {
        OwMaskedWalletRequestedEvent.CREATOR = new fazj();
    }

    public OwMaskedWalletRequestedEvent(Parcel parcel0) {
        super(parcel0);
        this.c = (BuyFlowConfig)BuyFlowConfig.CREATOR.createFromParcel(parcel0);
        this.d = parcel0.readByte() == 1;
    }

    public OwMaskedWalletRequestedEvent(BuyFlowConfig buyFlowConfig0, String s, boolean z) {
        this.m = fbly.a();
        this.a = s;
        this.b = OwMaskedWalletRequestedEvent.a(buyFlowConfig0, this.a);
        this.c = buyFlowConfig0;
        this.d = z;
    }

    public static String b(Context context0, String s, BuyFlowConfig buyFlowConfig0, boolean z) {
        OwMaskedWalletRequestedEvent owMaskedWalletRequestedEvent0 = new OwMaskedWalletRequestedEvent(buyFlowConfig0, s, z);
        fbpb.a(context0, owMaskedWalletRequestedEvent0);
        return owMaskedWalletRequestedEvent0.m;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        fbxz.a(this.c, parcel0, v);
        parcel0.writeByte(((byte)this.d));
    }
}


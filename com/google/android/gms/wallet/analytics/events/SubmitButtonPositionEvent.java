package com.google.android.gms.wallet.analytics.events;

import ProtoLiteBuilder;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import fazt;
import fbpm;
import fbpn;
import gkkd;
import gkke;

public class SubmitButtonPositionEvent extends WalletAnalyticsEvent implements fbpm {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final int b;

    static {
        SubmitButtonPositionEvent.CREATOR = new fazt();
    }

    public SubmitButtonPositionEvent(int v, boolean z, String s) {
        this.b = v;
        this.a = z;
        this.m = s;
    }

    public SubmitButtonPositionEvent(Parcel parcel0) {
        super(parcel0);
        int v = gkkd.a(parcel0.readInt());
        boolean z = true;
        if(v == 0) {
            v = 1;
        }
        this.b = v;
        if(parcel0.readInt() != 1) {
            z = false;
        }
        this.a = z;
    }

    @Override  // fbpm
    public final void b(Context context0, fbpn fbpn0, ProtoLiteBuilder hftp0) {
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gkke)hftp0.b_message).i = this.b - 1;
        ((gkke)hftp0.b_message).b |= 16;
        boolean z = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkke gkke0 = (gkke)hftp0.b_message;
        gkke0.b |= 0x20;
        gkke0.j = z;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeInt(this.b - 1);
        parcel0.writeInt(((int)this.a));
    }
}


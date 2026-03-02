package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import fazi;
import fbpb;

public class OwMaskedWalletReceivedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;

    static {
        OwMaskedWalletReceivedEvent.CREATOR = new fazi();
    }

    public OwMaskedWalletReceivedEvent(int v, String s, String s1, int v1) {
        this.m = s1;
        this.c = false;
        this.d = v;
        this.e = s;
        this.f = v1;
    }

    public OwMaskedWalletReceivedEvent(Parcel parcel0) {
        super(parcel0);
        this.c = parcel0.readByte() != 0;
        this.d = parcel0.readInt();
        this.e = parcel0.readString();
        this.f = parcel0.readInt();
    }

    public static void b(Context context0, int v, String s, String s1, int v1) {
        fbpb.a(context0, new OwMaskedWalletReceivedEvent(v, s, s1, v1));
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeByte(((byte)this.c));
        parcel0.writeInt(this.d);
        parcel0.writeString(this.e);
        parcel0.writeInt(this.f);
    }
}


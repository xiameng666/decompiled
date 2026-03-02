package com.google.android.gms.wallet.analytics.events;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import fazp;
import fbly;
import gciq;
import gkly;

public final class PaySeCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR;
    public final gkly c;

    static {
        PaySeCallEvent.CREATOR = new fazp();
    }

    public PaySeCallEvent(Parcel parcel0) {
        super(parcel0);
        this.c = (gkly)gciq.f(parcel0, ((Parser)((ProtoLiteMessage)gkly.a).jf(7, null)));
    }

    public PaySeCallEvent(String s, gkly gkly0, String s1, String s2) {
        this.m = fbly.a();
        this.c = gkly0;
        this.a = s;
        this.b = s1 + this.a + s2;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        gciq.o(((MessageLite)this.c), parcel0);
    }
}


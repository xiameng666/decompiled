package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import fazl;
import fbpb;

public class OwMwChooserShownEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR;

    static {
        OwMwChooserShownEvent.CREATOR = new fazl();
    }

    public OwMwChooserShownEvent(Parcel parcel0) {
        super(parcel0);
    }

    public OwMwChooserShownEvent(String s) {
        this.m = s;
    }

    public static void a(Context context0, String s) {
        fbpb.a(context0, new OwMwChooserShownEvent(s));
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }
}


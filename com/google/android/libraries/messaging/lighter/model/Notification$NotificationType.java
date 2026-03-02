package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import fmgk;
import gfqx;
import gfsx;

public enum Notification.NotificationType implements Parcelable {
    MESSAGE_RECEIVED(1),
    RENOTIFICATION(2);

    public static final Parcelable.Creator CREATOR;
    public final int c;

    static {
        Notification.NotificationType.CREATOR = new fmgk();
    }

    private Notification.NotificationType(int v1) {
        this.c = v1;
    }

    public static gfsx a(int v) {
        return v - 1 >= 0 && v - 1 < Notification.NotificationType.values().length ? gfsx.m(Notification.NotificationType.values()[v - 1]) : gfqx.a;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.c);
    }
}


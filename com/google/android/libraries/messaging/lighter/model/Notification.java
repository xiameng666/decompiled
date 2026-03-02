package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcelable;

public abstract class Notification implements Parcelable {
    public abstract long a();

    public abstract Notification.OneOfType b();

    public abstract NotificationMetadata c();

    public abstract String d();

    public final MessageReceivedNotification e() {
        return this.b().a();
    }

    public final Notification.NotificationType f() {
        return this.b().b();
    }

    public final Renotification g() {
        return this.b().c();
    }
}


package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import fmgm;
import java.util.HashMap;

public final class NotificationMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final HashMap a;

    static {
        NotificationMetadata.CREATOR = new fmgm();
    }

    public NotificationMetadata(HashMap hashMap0) {
        this.a = hashMap0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return (object0 instanceof NotificationMetadata) ? this.a.equals(((NotificationMetadata)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeMap(this.a);
    }
}


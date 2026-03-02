package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import fmeq;
import fmer;
import ggch;

public enum ContactId.ContactType implements Parcelable {
    UNKNOWN(0),
    PHONE_NUMBER(1),
    EMAIL(2),
    HANDLER(3),
    DEVICE_ID(5);

    public static final Parcelable.Creator CREATOR;
    public final int f;

    static {
        ContactId.ContactType.CREATOR = new fmer();
    }

    private ContactId.ContactType(int v1) {
        this.f = v1;
    }

    public static ContactId.ContactType a(int v) {
        return (ContactId.ContactType)ggch.k(ContactId.ContactType.values()).c(new fmeq(v)).f(ContactId.ContactType.a);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.f);
    }
}


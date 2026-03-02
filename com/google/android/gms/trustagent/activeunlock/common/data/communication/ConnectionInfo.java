package com.google.android.gms.trustagent.activeunlock.common.data.communication;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import exek;
import ibuq;

public final class ConnectionInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final WearConnectionInfo a;
    public final BleConnectionInfo b;
    public final int c;

    static {
        ConnectionInfo.CREATOR = new exek();
    }

    public ConnectionInfo() {
        this(null);
    }

    public ConnectionInfo(WearConnectionInfo wearConnectionInfo0, BleConnectionInfo bleConnectionInfo0) {
        this.a = wearConnectionInfo0;
        this.b = bleConnectionInfo0;
        this.c = bleConnectionInfo0 == null ? 0 : 1;
    }

    public ConnectionInfo(byte[] arr_b) {
        this(null, null);
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
        if(!(object0 instanceof ConnectionInfo)) {
            return false;
        }
        return ibuq.m(this.a, ((ConnectionInfo)object0).a) ? ibuq.m(this.b, ((ConnectionInfo)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        BleConnectionInfo bleConnectionInfo0 = this.b;
        if(bleConnectionInfo0 != null) {
            v = bleConnectionInfo0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "ConnectionInfo(wearConnectionInfo=" + this.a + ", bleConnectionInfo=" + this.b + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "parcel");
        parcel0.writeParcelable(this.a, v);
        parcel0.writeParcelable(this.b, v);
    }
}


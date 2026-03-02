package com.google.android.gms.trustagent.activeunlock.common.data.communication;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import exem;
import ibuq;

public final class WearConnectionInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;

    static {
        WearConnectionInfo.CREATOR = new exem();
    }

    public WearConnectionInfo(String s) {
        ibuq.f(s, "nodeId");
        super();
        this.a = s;
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
        return (object0 instanceof WearConnectionInfo) ? ibuq.m(this.a, ((WearConnectionInfo)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "WearConnectionInfo(nodeId=" + this.a + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "parcel");
        parcel0.writeString(this.a);
    }
}


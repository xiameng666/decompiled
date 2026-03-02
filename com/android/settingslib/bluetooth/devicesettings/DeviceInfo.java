package com.android.settingslib.bluetooth.devicesettings;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import sgt;

public class DeviceInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    private final Bundle b;

    static {
        DeviceInfo.CREATOR = new sgt();
    }

    public DeviceInfo(String s, Bundle bundle0) {
        if(s == null) {
            throw new IllegalArgumentException("Bluetooth address must be set");
        }
        this.a = s;
        this.b = bundle0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeBundle(this.b);
    }
}


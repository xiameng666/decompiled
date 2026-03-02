package com.android.settingslib.bluetooth.devicesettings;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import gged_interceptors;
import java.util.ArrayList;
import java.util.List;
import shd;
import shx;

public class MultiTogglePreference extends shd implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String b;
    private final gged_interceptors c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private final Bundle g;

    static {
        MultiTogglePreference.CREATOR = new shx();
    }

    public MultiTogglePreference(String s, List list0, int v, boolean z, boolean z1, Bundle bundle0) {
        super(2);
        if(s == null) {
            throw new IllegalArgumentException("Title must be set");
        }
        if(v < 0) {
            throw new IllegalArgumentException("State must be a non-negative integer");
        }
        this.b = s;
        this.c = gged_interceptors.i(list0);
        this.d = v;
        this.f = z;
        this.e = z1;
        this.g = bundle0;
    }

    public static MultiTogglePreference a(Parcel parcel0) {
        String s = parcel0.readString();
        ArrayList arrayList0 = new ArrayList();
        parcel0.readTypedList(arrayList0, ToggleInfo.CREATOR);
        return new MultiTogglePreference(s, arrayList0, parcel0.readInt(), parcel0.readBoolean(), parcel0.readBoolean(), parcel0.readBundle(Bundle.class.getClassLoader()));
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // shd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeString(this.b);
        parcel0.writeTypedList(this.c, v);
        parcel0.writeInt(this.d);
        parcel0.writeBoolean(this.f);
        parcel0.writeBoolean(this.e);
        parcel0.writeBundle(this.g);
    }
}


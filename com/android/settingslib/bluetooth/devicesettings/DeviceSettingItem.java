package com.android.settingslib.bluetooth.devicesettings;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import ibuq;
import shb;

public final class DeviceSettingItem implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final Bundle g;
    private final Integer h;
    private final Bundle i;

    static {
        DeviceSettingItem.CREATOR = new shb();
    }

    public DeviceSettingItem(int v, String s, String s1, String s2, String s3, boolean z, Bundle bundle0, int v1) {
        this(v, ((v1 & 2) == 0 ? s : null), ((v1 & 4) == 0 ? s1 : null), ((v1 & 8) == 0 ? s2 : null), ((v1 & 16) == 0 ? s3 : null), ((boolean)(((v1 & 0x20) == 0 ? 1 : 0) & ((int)z))), null, ((v1 & 0x80) == 0 ? bundle0 : Bundle.EMPTY));
    }

    public DeviceSettingItem(int v, String s, String s1, String s2, String s3, boolean z, Integer integer0, Bundle bundle0) {
        ibuq.f(bundle0, "extras");
        super();
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = z;
        this.h = integer0;
        this.g = bundle0;
        Bundle bundle1 = new Bundle(bundle0);
        if(integer0 != null) {
            bundle1.putInt("groupIndex", integer0.intValue());
        }
        this.i = bundle1;
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
        if(!(object0 instanceof DeviceSettingItem)) {
            return false;
        }
        if(this.a != ((DeviceSettingItem)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((DeviceSettingItem)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((DeviceSettingItem)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((DeviceSettingItem)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((DeviceSettingItem)object0).e)) {
            return false;
        }
        if(this.f != ((DeviceSettingItem)object0).f) {
            return false;
        }
        return ibuq.m(this.h, ((DeviceSettingItem)object0).h) ? ibuq.m(this.g, ((DeviceSettingItem)object0).g) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a * 0x1F + (this.b == null ? 0 : this.b.hashCode());
        int v2 = this.c == null ? 0 : this.c.hashCode();
        int v3 = this.d == null ? 0 : this.d.hashCode();
        int v4 = this.e == null ? 0 : this.e.hashCode();
        int v5 = this.f ? 0x4CF : 0x4D5;
        Integer integer0 = this.h;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return (((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v) * 0x1F + this.g.hashCode();
    }

    @Override
    public final String toString() {
        return "DeviceSettingItem(settingId=" + this.a + ", packageName=" + this.b + ", className=" + this.c + ", intentAction=" + this.d + ", preferenceKey=" + this.e + ", highlighted=" + this.f + ", groupIndex=" + this.h + ", extras=" + this.g + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "parcel");
        parcel0.writeInt(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
        parcel0.writeBoolean(this.f);
        parcel0.writeString(this.e);
        parcel0.writeBundle(this.i);
    }
}


package com.android.settingslib.bluetooth.devicesettings;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import ibuq;
import java.util.List;
import sgx;

public final class DeviceSettingForgetDeviceDialogItem implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final List e;
    private final String f;
    private final PendingIntent g;
    private final Bundle h;

    static {
        DeviceSettingForgetDeviceDialogItem.CREATOR = new sgx();
    }

    public DeviceSettingForgetDeviceDialogItem() {
        this(null, null, null, null, null, null, null, Bundle.EMPTY);
    }

    public DeviceSettingForgetDeviceDialogItem(String s, String s1, String s2, String s3, List list0, String s4, PendingIntent pendingIntent0, Bundle bundle0) {
        ibuq.f(bundle0, "extras");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = list0;
        this.f = s4;
        this.g = pendingIntent0;
        this.h = bundle0;
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
        if(!(object0 instanceof DeviceSettingForgetDeviceDialogItem)) {
            return false;
        }
        if(!ibuq.m(this.a, ((DeviceSettingForgetDeviceDialogItem)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((DeviceSettingForgetDeviceDialogItem)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((DeviceSettingForgetDeviceDialogItem)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((DeviceSettingForgetDeviceDialogItem)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((DeviceSettingForgetDeviceDialogItem)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.f, ((DeviceSettingForgetDeviceDialogItem)object0).f)) {
            return false;
        }
        return ibuq.m(this.g, ((DeviceSettingForgetDeviceDialogItem)object0).g) ? ibuq.m(this.h, ((DeviceSettingForgetDeviceDialogItem)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        int v6 = this.f == null ? 0 : this.f.hashCode();
        PendingIntent pendingIntent0 = this.g;
        if(pendingIntent0 != null) {
            v = pendingIntent0.hashCode();
        }
        return ((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v) * 0x1F + this.h.hashCode();
    }

    @Override
    public final String toString() {
        return "DeviceSettingForgetDeviceDialogItem(title=" + this.a + ", description=" + this.b + ", forgetFromAllDevicesCheckboxDescription=" + this.c + ", linkedDeviceListDescription=" + this.d + ", linkedDeviceItems=" + this.e + ", forgetButtonText=" + this.f + ", forgetFromAllDevicesPendingIntent=" + this.g + ", extras=" + this.h + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "parcel");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
        parcel0.writeTypedList(this.e);
        parcel0.writeString(this.f);
        parcel0.writeParcelable(this.g, v);
        parcel0.writeBundle(this.h);
    }
}


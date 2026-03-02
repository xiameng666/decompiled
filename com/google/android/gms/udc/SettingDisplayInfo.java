package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ezmh;
import java.util.Arrays;

public class SettingDisplayInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public SettingState a;
    public String b;
    public String c;

    static {
        SettingDisplayInfo.CREATOR = new ezmh();
    }

    public SettingDisplayInfo() {
    }

    public SettingDisplayInfo(SettingState settingState0, String s, String s1) {
        this.a = settingState0;
        this.b = s;
        this.c = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof SettingDisplayInfo) ? bata.b(this.b, ((SettingDisplayInfo)object0).b) && bata.b(this.c, ((SettingDisplayInfo)object0).c) && bata.b(this.a, ((SettingDisplayInfo)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.v(parcel0, 3, this.b, false);
        baub.v(parcel0, 4, this.c, false);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cuwz;
import java.util.Arrays;

public final class SettingOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;

    static {
        SettingOptions.CREATOR = new cuwz();
    }

    public SettingOptions() {
        this.a = true;
    }

    public SettingOptions(boolean z) {
        this.a = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof SettingOptions) ? bata.b(Boolean.valueOf(this.a), Boolean.valueOf(((SettingOptions)object0).a)) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}


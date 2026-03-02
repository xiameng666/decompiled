package com.google.android.gms.backup;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aqfr;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class BackupStatsRequestConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;

    static {
        BackupStatsRequestConfig.CREATOR = new aqfr();
    }

    public BackupStatsRequestConfig(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import egbj;

public final class BackupAndSyncOptInOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;
    public final boolean c;

    static {
        BackupAndSyncOptInOptions.CREATOR = new egbj();
    }

    public BackupAndSyncOptInOptions(boolean z, boolean z1, boolean z2) {
        this.a = z;
        this.b = z1;
        this.c = z2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}


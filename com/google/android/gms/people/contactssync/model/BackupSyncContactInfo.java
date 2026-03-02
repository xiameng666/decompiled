package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import egbn;

public class BackupSyncContactInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        BackupSyncContactInfo.CREATOR = new egbn();
    }

    public BackupSyncContactInfo(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}


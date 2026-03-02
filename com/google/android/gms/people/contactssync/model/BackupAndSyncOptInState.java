package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import egbl;

public class BackupAndSyncOptInState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int[] b;
    public final int c;
    public final String[] d;

    static {
        BackupAndSyncOptInState.CREATOR = new egbl();
    }

    public BackupAndSyncOptInState(String s, int[] arr_v, int v, String[] arr_s) {
        this.a = s;
        this.b = arr_v;
        this.c = v;
        this.d = arr_s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.p(parcel0, 2, this.b, false);
        baub.o(parcel0, 4, this.c);
        baub.w(parcel0, 5, this.d, false);
        baub.c(parcel0, v1);
    }
}


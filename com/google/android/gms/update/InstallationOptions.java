package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ezut;
import java.util.ArrayList;
import java.util.Arrays;

public class InstallationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    static {
        InstallationOptions.CREATOR = new ezut();
    }

    public InstallationOptions(boolean z, boolean z1, boolean z2, boolean z3) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = z3;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof InstallationOptions) ? this.a == ((InstallationOptions)object0).a && this.b == ((InstallationOptions)object0).b && this.c == ((InstallationOptions)object0).c && this.d == ((InstallationOptions)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("ignoreDeviceIdleCondition", Boolean.valueOf(this.a), arrayList0);
        basz.b("ignoreMaintenanceWindow", Boolean.valueOf(this.b), arrayList0);
        basz.b("ignoreServerPostponeAbInstallationConfig", Boolean.valueOf(this.c), arrayList0);
        basz.b("ignoreOptionalPostInstall", Boolean.valueOf(this.d), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.e(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dllm;
import java.util.Arrays;

public final class WearCardManagementIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;
    public boolean b;

    static {
        WearCardManagementIntentArgs.CREATOR = new dllm();
    }

    public WearCardManagementIntentArgs() {
    }

    public WearCardManagementIntentArgs(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof WearCardManagementIntentArgs) && bata.b(Boolean.valueOf(this.a), Boolean.valueOf(((WearCardManagementIntentArgs)object0).a)) && bata.b(Boolean.valueOf(this.b), Boolean.valueOf(((WearCardManagementIntentArgs)object0).b));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}


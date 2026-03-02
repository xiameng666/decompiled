package com.google.android.gms.auth.firstparty.dataservice;

import ajmx;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class CheckFactoryResetPolicyComplianceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    @Deprecated
    public final boolean b;
    public final int c;

    static {
        CheckFactoryResetPolicyComplianceResponse.CREATOR = new ajmx();
    }

    public CheckFactoryResetPolicyComplianceResponse(int v, int v1) {
        this.a = v;
        this.b = v1 == 1;
        this.c = v1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}


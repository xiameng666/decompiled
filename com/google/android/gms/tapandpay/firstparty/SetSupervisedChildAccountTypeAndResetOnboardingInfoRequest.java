package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import esms;
import java.util.Arrays;

public final class SetSupervisedChildAccountTypeAndResetOnboardingInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;
    public boolean b;
    public boolean c;

    static {
        SetSupervisedChildAccountTypeAndResetOnboardingInfoRequest.CREATOR = new esms();
    }

    public SetSupervisedChildAccountTypeAndResetOnboardingInfoRequest() {
    }

    public SetSupervisedChildAccountTypeAndResetOnboardingInfoRequest(boolean z, boolean z1, boolean z2) {
        this.a = z;
        this.b = z1;
        this.c = z2;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SetSupervisedChildAccountTypeAndResetOnboardingInfoRequest) && bata.b(Boolean.valueOf(this.a), Boolean.valueOf(((SetSupervisedChildAccountTypeAndResetOnboardingInfoRequest)object0).a)) && bata.b(Boolean.valueOf(this.b), Boolean.valueOf(((SetSupervisedChildAccountTypeAndResetOnboardingInfoRequest)object0).b)) && bata.b(Boolean.valueOf(this.c), Boolean.valueOf(((SetSupervisedChildAccountTypeAndResetOnboardingInfoRequest)object0).c));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
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


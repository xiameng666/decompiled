package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlgn;
import java.util.Arrays;

public final class OnboardingConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;

    static {
        OnboardingConfig.CREATOR = new dlgn();
    }

    public OnboardingConfig() {
    }

    public OnboardingConfig(boolean z) {
        this.a = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof OnboardingConfig) ? bata.b(Boolean.valueOf(this.a), Boolean.valueOf(((OnboardingConfig)object0).a)) : false;
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


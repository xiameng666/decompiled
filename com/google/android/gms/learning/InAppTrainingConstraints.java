package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import cbzg;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;

public final class InAppTrainingConstraints extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;
    public final boolean c;

    static {
        InAppTrainingConstraints.CREATOR = new cbzg();
    }

    public InAppTrainingConstraints(boolean z, boolean z1, boolean z2) {
        this.a = z;
        this.b = z1;
        this.c = z2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof InAppTrainingConstraints) ? this.a == ((InAppTrainingConstraints)object0).a && this.b == ((InAppTrainingConstraints)object0).b && this.c == ((InAppTrainingConstraints)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
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


package com.google.android.gms.nearby.connection.v3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cvxj;
import java.util.Arrays;

public final class AnalyticOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;

    static {
        AnalyticOptions.CREATOR = new cvxj();
    }

    public AnalyticOptions(long v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof AnalyticOptions) && this.a == ((AnalyticOptions)object0).a;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a)});
    }

    @Override
    public final String toString() {
        return "AnalyticOptions[flowId=" + this.a + ']';
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}


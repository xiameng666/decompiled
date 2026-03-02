package com.google.android.gms.appusage;

import acno;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class AppUsageIntervals extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final List b;
    public final List c;

    static {
        AppUsageIntervals.CREATOR = new acno();
    }

    public AppUsageIntervals(List list0, List list1, List list2) {
        this.a = list0;
        this.b = list1;
        this.c = list2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.x(parcel0, 1, this.a, false);
        baub.E(parcel0, 2, this.b);
        baub.y(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlfs;
import java.util.Arrays;

public final class HomeIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;
    public IntentSource b;
    public HomescreenConfig c;
    public boolean d;

    static {
        HomeIntentArgs.CREATOR = new dlfs();
    }

    public HomeIntentArgs() {
    }

    public HomeIntentArgs(boolean z, IntentSource intentSource0, HomescreenConfig homescreenConfig0, boolean z1) {
        this.a = z;
        this.b = intentSource0;
        this.c = homescreenConfig0;
        this.d = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof HomeIntentArgs) && bata.b(Boolean.valueOf(this.a), Boolean.valueOf(((HomeIntentArgs)object0).a)) && bata.b(this.b, ((HomeIntentArgs)object0).b) && bata.b(this.c, ((HomeIntentArgs)object0).c) && bata.b(Boolean.valueOf(this.d), Boolean.valueOf(((HomeIntentArgs)object0).d));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.t(parcel0, 2, this.b, v, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.e(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}


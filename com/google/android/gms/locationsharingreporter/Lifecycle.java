package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import cobf;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;
import java.util.Arrays;

public class Lifecycle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final EndCondition b;
    public final int[] c;

    static {
        Lifecycle.CREATOR = new cobf();
    }

    public Lifecycle(boolean z, EndCondition endCondition0, int[] arr_v) {
        this.a = z;
        this.b = endCondition0;
        this.c = arr_v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof Lifecycle) && this.a == ((Lifecycle)object0).a && Objects.equals(this.b, ((Lifecycle)object0).b) && Arrays.equals(this.c, ((Lifecycle)object0).c);
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.c);
        return Objects.hash(new Object[]{Boolean.valueOf(this.a), this.b, integer0});
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.c);
        return "Lifecycle [isSharePermanent=" + this.a + ", endCondition=" + this.b + ", lifecycleManagers=" + s + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.t(parcel0, 2, this.b, v, false);
        baub.p(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}


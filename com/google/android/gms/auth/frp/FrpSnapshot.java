package com.google.android.gms.auth.frp;

import akev;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;

public class FrpSnapshot extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    @Deprecated
    public final PersistentDeviceOwnerState e;
    @Deprecated
    public final boolean f;

    static {
        FrpSnapshot.CREATOR = new akev();
    }

    public FrpSnapshot(int v, boolean z, boolean z1, boolean z2) {
        this.a = v;
        this.b = z;
        this.c = z1;
        this.d = z2;
        this.e = null;
        this.f = false;
    }

    public FrpSnapshot(boolean z, boolean z1, boolean z2) {
        this(1, z, z1, z2);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof FrpSnapshot) ? this.a == ((FrpSnapshot)object0).a && this.b == ((FrpSnapshot)object0).b && this.c == ((FrpSnapshot)object0).c && this.d == ((FrpSnapshot)object0).d && Objects.equals(null, null) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), 0, Boolean.valueOf(false)});
    }

    @Override
    public final String toString() {
        return String.format("FrpSnapshot[supported=%b,required=%b,ls=%b]", Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.e(parcel0, 4, this.d);
        baub.e(parcel0, 6, false);
        baub.c(parcel0, v1);
    }
}


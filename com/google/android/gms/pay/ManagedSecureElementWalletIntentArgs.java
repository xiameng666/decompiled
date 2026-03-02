package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlgb;
import java.util.Arrays;

public final class ManagedSecureElementWalletIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public String h;
    public boolean i;
    public boolean j;

    static {
        ManagedSecureElementWalletIntentArgs.CREATOR = new dlgb();
    }

    public ManagedSecureElementWalletIntentArgs() {
    }

    public ManagedSecureElementWalletIntentArgs(long v, String s, String s1, String s2, String s3, boolean z, boolean z1, String s4, boolean z2, boolean z3) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = z;
        this.g = z1;
        this.h = s4;
        this.i = z2;
        this.j = z3;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ManagedSecureElementWalletIntentArgs) && bata.b(Long.valueOf(this.a), Long.valueOf(((ManagedSecureElementWalletIntentArgs)object0).a)) && bata.b(this.b, ((ManagedSecureElementWalletIntentArgs)object0).b) && bata.b(this.c, ((ManagedSecureElementWalletIntentArgs)object0).c) && bata.b(this.d, ((ManagedSecureElementWalletIntentArgs)object0).d) && bata.b(this.e, ((ManagedSecureElementWalletIntentArgs)object0).e) && bata.b(Boolean.valueOf(this.f), Boolean.valueOf(((ManagedSecureElementWalletIntentArgs)object0).f)) && bata.b(Boolean.valueOf(this.g), Boolean.valueOf(((ManagedSecureElementWalletIntentArgs)object0).g)) && bata.b(this.h, ((ManagedSecureElementWalletIntentArgs)object0).h) && bata.b(Boolean.valueOf(this.i), Boolean.valueOf(((ManagedSecureElementWalletIntentArgs)object0).i)) && bata.b(Boolean.valueOf(this.j), Boolean.valueOf(((ManagedSecureElementWalletIntentArgs)object0).j));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a), this.b, this.c, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.g), this.h, Boolean.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.e(parcel0, 6, this.f);
        baub.e(parcel0, 7, this.g);
        baub.v(parcel0, 8, this.h, false);
        baub.e(parcel0, 9, this.i);
        baub.e(parcel0, 10, this.j);
        baub.c(parcel0, v1);
    }
}


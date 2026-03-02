package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlbp;
import java.util.Arrays;

public final class Animation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public String b;
    public boolean c;
    public String d;

    static {
        Animation.CREATOR = new dlbp();
    }

    public Animation() {
    }

    public Animation(int v, String s, boolean z, String s1) {
        this.a = v;
        this.b = s;
        this.c = z;
        this.d = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof Animation) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((Animation)object0).a)) && bata.b(this.b, ((Animation)object0).b) && bata.b(Boolean.valueOf(this.c), Boolean.valueOf(((Animation)object0).c)) && bata.b(this.d, ((Animation)object0).d);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.e(parcel0, 3, this.c);
        baub.v(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}


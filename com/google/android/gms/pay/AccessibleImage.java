package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlbi;
import java.util.Arrays;

public final class AccessibleImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String c;

    static {
        AccessibleImage.CREATOR = new dlbi();
    }

    public AccessibleImage() {
    }

    public AccessibleImage(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof AccessibleImage) && bata.b(this.a, ((AccessibleImage)object0).a) && bata.b(this.b, ((AccessibleImage)object0).b) && bata.b(this.c, ((AccessibleImage)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}


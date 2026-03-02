package com.google.android.gms.home.matter.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import bwhj;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

public final class Discriminator extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;

    static {
        Discriminator.CREATOR = new bwhj();
    }

    public Discriminator(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    public static Discriminator a(int v) {
        batl.d(v >= 0 && v <= 0xFFF, "Invalid discriminator value 0x%X (valid range 0-0xFFF)", new Object[]{v});
        return new Discriminator(v & 0xFFF, 0xFFF);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof Discriminator) ? this.a == ((Discriminator)object0).a && this.b == ((Discriminator)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((int)this.b)});
    }

    @Override
    public final String toString() {
        return this.b == 0xFFF ? String.format(Locale.ROOT, "%s[0x%03X]", "L", ((int)this.a)) : String.format(Locale.ROOT, "%s[0x%03X]", "S", ((int)this.a));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}


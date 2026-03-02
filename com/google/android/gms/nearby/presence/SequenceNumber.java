package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dats;
import j..util.Objects;
import java.util.Locale;

public final class SequenceNumber extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        SequenceNumber.CREATOR = new dats();
    }

    public SequenceNumber(int v) {
        batl.c(v >= 0 && v <= 15, "Sequence number should be 4 bits.");
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof SequenceNumber) && this.a == ((SequenceNumber)object0).a;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)19), ((int)this.a)});
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "DataElement<type: %s, value: %d>", "ContextSequenceNumber", ((int)this.a));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}


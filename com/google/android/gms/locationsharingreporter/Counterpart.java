package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import coat;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;

public class Counterpart extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final IdentifiedUser a;
    public final AnonymousCounterpart b;

    static {
        Counterpart.CREATOR = new coat();
    }

    public Counterpart(IdentifiedUser identifiedUser0, AnonymousCounterpart anonymousCounterpart0) {
        this.a = identifiedUser0;
        this.b = anonymousCounterpart0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof Counterpart) && Objects.equals(this.a, ((Counterpart)object0).a) && Objects.equals(this.b, ((Counterpart)object0).b);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        return "Counterpart [identifiedUser=" + this.a + ", anonymousCounterpart=" + this.b + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}


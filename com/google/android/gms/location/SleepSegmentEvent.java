package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import cmop;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class SleepSegmentEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;

    static {
        SleepSegmentEvent.CREATOR = new cmop();
    }

    public SleepSegmentEvent(long v, long v1, int v2, int v3, int v4) {
        batl.c(v <= v1, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof SleepSegmentEvent) && this.a == ((SleepSegmentEvent)object0).a && this.b == ((SleepSegmentEvent)object0).b && this.c == ((SleepSegmentEvent)object0).c && this.d == ((SleepSegmentEvent)object0).d && this.e == ((SleepSegmentEvent)object0).e;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a), ((long)this.b), ((int)this.c)});
    }

    @Override
    public final String toString() {
        return "startMillis=" + this.a + ", endMillis=" + this.b + ", status=" + this.c;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        batl.s(parcel0);
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.q(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.o(parcel0, 5, this.e);
        baub.c(parcel0, v1);
    }
}


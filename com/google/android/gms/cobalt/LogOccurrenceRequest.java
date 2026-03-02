package com.google.android.gms.cobalt;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azin;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class LogOccurrenceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public int b;
    public int c;
    public long d;
    public int[] e;

    static {
        LogOccurrenceRequest.CREATOR = new azin();
    }

    private LogOccurrenceRequest() {
    }

    public LogOccurrenceRequest(int v, int v1, int v2, long v3, int[] arr_v) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = arr_v;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof LogOccurrenceRequest) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((LogOccurrenceRequest)object0).a)) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((LogOccurrenceRequest)object0).b)) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((LogOccurrenceRequest)object0).c)) && bata.b(Long.valueOf(this.d), Long.valueOf(((LogOccurrenceRequest)object0).d)) && Arrays.equals(this.e, ((LogOccurrenceRequest)object0).e);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((int)this.b), ((int)this.c), ((long)this.d), Arrays.hashCode(this.e)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.q(parcel0, 4, this.d);
        baub.p(parcel0, 5, this.e, false);
        baub.c(parcel0, v1);
    }
}


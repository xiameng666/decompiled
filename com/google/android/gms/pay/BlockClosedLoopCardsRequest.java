package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlbu;
import java.util.Arrays;

public final class BlockClosedLoopCardsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public long a;
    public int b;

    static {
        BlockClosedLoopCardsRequest.CREATOR = new dlbu();
    }

    public BlockClosedLoopCardsRequest() {
    }

    public BlockClosedLoopCardsRequest(long v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof BlockClosedLoopCardsRequest) && bata.b(Long.valueOf(this.a), Long.valueOf(((BlockClosedLoopCardsRequest)object0).a)) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((BlockClosedLoopCardsRequest)object0).b));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a), ((int)this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}


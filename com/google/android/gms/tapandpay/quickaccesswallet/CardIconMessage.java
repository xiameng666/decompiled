package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import etrn;
import java.util.Arrays;

public final class CardIconMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int[] a;
    public int b;
    public String c;

    static {
        CardIconMessage.CREATOR = new etrn();
    }

    public CardIconMessage() {
    }

    public CardIconMessage(int[] arr_v, int v, String s) {
        this.a = arr_v;
        this.b = v;
        this.c = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof CardIconMessage) && Arrays.equals(this.a, ((CardIconMessage)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((CardIconMessage)object0).b)) && bata.b(this.c, ((CardIconMessage)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), ((int)this.b), this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.p(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.pay;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlfc;
import java.util.Arrays;

public final class GetTransitCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public TransitCard[] a;
    public Bitmap b;
    public Bitmap c;
    public TransitPaymentOption[] d;
    public GetTransitPassResponse e;

    static {
        GetTransitCardsResponse.CREATOR = new dlfc();
    }

    public GetTransitCardsResponse() {
    }

    public GetTransitCardsResponse(TransitCard[] arr_transitCard, Bitmap bitmap0, Bitmap bitmap1, TransitPaymentOption[] arr_transitPaymentOption, GetTransitPassResponse getTransitPassResponse0) {
        this.a = arr_transitCard;
        this.b = bitmap0;
        this.c = bitmap1;
        this.d = arr_transitPaymentOption;
        this.e = getTransitPassResponse0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GetTransitCardsResponse) && Arrays.equals(this.a, ((GetTransitCardsResponse)object0).a) && bata.b(this.b, ((GetTransitCardsResponse)object0).b) && bata.b(this.c, ((GetTransitCardsResponse)object0).c) && Arrays.equals(this.d, ((GetTransitCardsResponse)object0).d) && bata.b(this.e, ((GetTransitCardsResponse)object0).e);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), this.b, this.c, Arrays.hashCode(this.d), this.e});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.J(parcel0, 1, this.a, v);
        baub.t(parcel0, 2, this.b, v, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.J(parcel0, 4, this.d, v);
        baub.t(parcel0, 5, this.e, v, false);
        baub.c(parcel0, v1);
    }
}


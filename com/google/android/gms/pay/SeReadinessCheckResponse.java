package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlio;
import java.util.Arrays;

public final class SeReadinessCheckResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public GetSeFeatureReadinessStatusResponse a;
    public SeReadinessCheckError b;

    static {
        SeReadinessCheckResponse.CREATOR = new dlio();
    }

    public SeReadinessCheckResponse() {
    }

    public SeReadinessCheckResponse(GetSeFeatureReadinessStatusResponse getSeFeatureReadinessStatusResponse0, SeReadinessCheckError seReadinessCheckError0) {
        this.a = getSeFeatureReadinessStatusResponse0;
        this.b = seReadinessCheckError0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SeReadinessCheckResponse) && bata.b(this.a, ((SeReadinessCheckResponse)object0).a) && bata.b(this.b, ((SeReadinessCheckResponse)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}


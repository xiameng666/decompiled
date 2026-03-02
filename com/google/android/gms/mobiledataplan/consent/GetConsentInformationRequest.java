package com.google.android.gms.mobiledataplan.consent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import crud;
import crws;
import java.util.ArrayList;
import java.util.Arrays;

public final class GetConsentInformationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public boolean b;
    public Integer c;
    public Long d;
    public Bundle e;

    static {
        GetConsentInformationRequest.CREATOR = new crws();
    }

    public GetConsentInformationRequest() {
    }

    public GetConsentInformationRequest(String s, boolean z, Integer integer0, Long long0, Bundle bundle0) {
        this.a = s;
        this.b = z;
        this.c = integer0;
        this.d = long0;
        this.e = bundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GetConsentInformationRequest) && bata.b(this.a, ((GetConsentInformationRequest)object0).a) && bata.b(Boolean.valueOf(this.b), Boolean.valueOf(((GetConsentInformationRequest)object0).b)) && bata.b(this.c, ((GetConsentInformationRequest)object0).c) && bata.b(this.d, ((GetConsentInformationRequest)object0).d) && crud.b(this.e, ((GetConsentInformationRequest)object0).e);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), this.c, this.d, crud.a(this.e)});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("clientCpid", this.a, arrayList0);
        basz.b("includeConsentTexts", Boolean.valueOf(this.b), arrayList0);
        basz.b("eventFlowId", this.c, arrayList0);
        basz.b("uniqueRequestId", this.d, arrayList0);
        basz.b("extraInfo", this.e, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.e(parcel0, 2, this.b);
        baub.F(parcel0, 3, this.c);
        baub.I(parcel0, 4, this.d);
        baub.g(parcel0, 5, this.e, false);
        baub.c(parcel0, v1);
    }
}


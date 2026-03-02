package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import crwt;
import java.util.ArrayList;
import java.util.Arrays;

public final class GetConsentInformationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public ConsentStatus a;
    public ConsentAgreementText b;
    public Long c;
    public Integer d;
    public Long e;
    public Integer f;

    static {
        GetConsentInformationResponse.CREATOR = new crwt();
    }

    public GetConsentInformationResponse() {
    }

    public GetConsentInformationResponse(ConsentStatus consentStatus0, ConsentAgreementText consentAgreementText0, Long long0, Integer integer0, Long long1, Integer integer1) {
        this.a = consentStatus0;
        this.b = consentAgreementText0;
        this.c = long0;
        this.d = integer0;
        this.e = long1;
        this.f = integer1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GetConsentInformationResponse) && bata.b(this.a, ((GetConsentInformationResponse)object0).a) && bata.b(this.b, ((GetConsentInformationResponse)object0).b) && bata.b(this.c, ((GetConsentInformationResponse)object0).c) && bata.b(this.d, ((GetConsentInformationResponse)object0).d) && bata.b(this.e, ((GetConsentInformationResponse)object0).e) && bata.b(this.f, ((GetConsentInformationResponse)object0).f);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("ConsentStatus", this.a, arrayList0);
        basz.b("ConsentAgreementText", this.b, arrayList0);
        basz.b("ConsentChangeTime", this.c, arrayList0);
        basz.b("EventFlowId", this.d, arrayList0);
        basz.b("UniqueRequestId", this.e, arrayList0);
        basz.b("ConsentResponseSource", this.f, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.I(parcel0, 3, this.c);
        baub.F(parcel0, 4, this.d);
        baub.I(parcel0, 5, this.e);
        baub.F(parcel0, 6, this.f);
        baub.c(parcel0, v1);
    }
}


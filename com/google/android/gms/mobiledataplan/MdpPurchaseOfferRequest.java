package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;
import crud;
import crvj;
import java.util.ArrayList;
import java.util.Arrays;

public class MdpPurchaseOfferRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Bundle e;
    public final Integer f;
    public final Long g;
    public final int h;
    public final PaymentForm[] i;
    public final String j;

    static {
        MdpPurchaseOfferRequest.CREATOR = new crvj();
    }

    public MdpPurchaseOfferRequest(String s, String s1, String s2, String s3, Bundle bundle0, Integer integer0, Long long0, int v, PaymentForm[] arr_paymentForm, String s4) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = bundle0;
        this.f = integer0;
        this.g = long0;
        this.h = v;
        this.i = arr_paymentForm;
        this.j = s4;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof MdpPurchaseOfferRequest) ? bata.b(this.a, ((MdpPurchaseOfferRequest)object0).a) && bata.b(this.b, ((MdpPurchaseOfferRequest)object0).b) && bata.b(this.c, ((MdpPurchaseOfferRequest)object0).c) && bata.b(this.d, ((MdpPurchaseOfferRequest)object0).d) && crud.b(this.e, ((MdpPurchaseOfferRequest)object0).e) && bata.b(this.f, ((MdpPurchaseOfferRequest)object0).f) && bata.b(this.g, ((MdpPurchaseOfferRequest)object0).g) && bata.b(Integer.valueOf(this.h), Integer.valueOf(((MdpPurchaseOfferRequest)object0).h)) && Arrays.equals(this.i, ((MdpPurchaseOfferRequest)object0).i) && bata.b(this.j, ((MdpPurchaseOfferRequest)object0).j) : false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = crud.a(this.e);
        Integer integer1 = Arrays.hashCode(this.i);
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, integer0, this.f, this.g, ((int)this.h), integer1, this.j});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("CarrierPlanId", this.a, arrayList0);
        basz.b("PlanId", this.b, arrayList0);
        basz.b("OfferContext", this.c, arrayList0);
        basz.b("TransactionId", this.d, arrayList0);
        basz.b("ExtraInfo", this.e, arrayList0);
        basz.b("EventFlowId", this.f, arrayList0);
        basz.b("UniqueRequestId", this.g, arrayList0);
        basz.b("OfferType", Integer.valueOf(this.h), arrayList0);
        basz.b("PaymentForms", Arrays.toString(this.i), arrayList0);
        basz.b("GooglePayPaymentDataSerialized", this.j, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.g(parcel0, 5, this.e, false);
        baub.F(parcel0, 6, this.f);
        baub.I(parcel0, 7, this.g);
        baub.o(parcel0, 8, this.h);
        baub.J(parcel0, 9, this.i, v);
        baub.v(parcel0, 10, this.j, false);
        baub.c(parcel0, v1);
    }
}


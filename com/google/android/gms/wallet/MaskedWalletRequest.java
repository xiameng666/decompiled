package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fawu;
import java.util.ArrayList;

public final class MaskedWalletRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public boolean b;
    public boolean c;
    boolean d;
    public String e;
    public String f;
    public String g;
    public Cart h;
    boolean i;
    boolean j;
    CountrySpecification[] k;
    public final boolean l;
    public final boolean m;
    public ArrayList n;
    public PaymentMethodTokenizationParameters o;
    public ArrayList p;
    public String q;

    static {
        MaskedWalletRequest.CREATOR = new fawu();
    }

    public MaskedWalletRequest() {
        this.l = true;
        this.m = true;
    }

    public MaskedWalletRequest(String s, boolean z, boolean z1, boolean z2, String s1, String s2, String s3, Cart cart0, boolean z3, boolean z4, CountrySpecification[] arr_countrySpecification, boolean z5, boolean z6, ArrayList arrayList0, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters0, ArrayList arrayList1, String s4) {
        this.a = s;
        this.b = z;
        this.c = z1;
        this.d = z2;
        this.e = s1;
        this.f = s2;
        this.g = s3;
        this.h = cart0;
        this.i = z3;
        this.j = z4;
        this.k = arr_countrySpecification;
        this.l = z5;
        this.m = z6;
        this.n = arrayList0;
        this.o = paymentMethodTokenizationParameters0;
        this.p = arrayList1;
        this.q = s4;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.e(parcel0, 3, this.b);
        baub.e(parcel0, 4, this.c);
        baub.e(parcel0, 5, this.d);
        baub.v(parcel0, 6, this.e, false);
        baub.v(parcel0, 7, this.f, false);
        baub.v(parcel0, 8, this.g, false);
        baub.t(parcel0, 9, this.h, v, false);
        baub.e(parcel0, 10, this.i);
        baub.e(parcel0, 11, this.j);
        baub.J(parcel0, 12, this.k, v);
        baub.e(parcel0, 13, this.l);
        baub.e(parcel0, 14, this.m);
        baub.y(parcel0, 15, this.n, false);
        baub.t(parcel0, 16, this.o, v, false);
        baub.E(parcel0, 17, this.p);
        baub.v(parcel0, 18, this.q, false);
        baub.c(parcel0, v1);
    }
}


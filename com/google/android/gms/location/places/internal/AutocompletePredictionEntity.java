package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.style.CharacterStyle;
import basz;
import bata;
import baub;
import cnmj;
import cnok;
import cnoq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutocompletePredictionEntity extends AbstractSafeParcelable implements cnmj {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final List c;
    public final List d;
    public final int e;
    public final String f;
    public final List g;
    public final String h;
    public final List i;

    static {
        AutocompletePredictionEntity.CREATOR = new cnok();
    }

    public AutocompletePredictionEntity(String s, List list0, int v, String s1, List list1, String s2, List list2, String s3, List list3) {
        this.b = s;
        this.c = list0;
        this.e = v;
        this.a = s1;
        this.d = list1;
        this.f = s2;
        this.g = list2;
        this.h = s3;
        this.i = list3;
    }

    @Override  // cnmj
    public final CharSequence a(CharacterStyle characterStyle0) {
        return cnoq.a(this.f, this.g, characterStyle0);
    }

    @Override  // cnmj
    public final String b() {
        return this.a;
    }

    @Override  // cnmj
    public final String c() {
        return this.b;
    }

    @Override  // cnmj
    public final CharSequence d() {
        return cnoq.a(this.a, this.d, null);
    }

    @Override  // cnmj
    public final CharSequence e() {
        return cnoq.a(this.h, this.i, null);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof AutocompletePredictionEntity) ? bata.b(this.b, ((AutocompletePredictionEntity)object0).b) && bata.b(this.c, ((AutocompletePredictionEntity)object0).c) && bata.b(Integer.valueOf(this.e), Integer.valueOf(((AutocompletePredictionEntity)object0).e)) && bata.b(this.a, ((AutocompletePredictionEntity)object0).a) && bata.b(this.d, ((AutocompletePredictionEntity)object0).d) && bata.b(this.f, ((AutocompletePredictionEntity)object0).f) && bata.b(this.g, ((AutocompletePredictionEntity)object0).g) && bata.b(this.h, ((AutocompletePredictionEntity)object0).h) && bata.b(this.i, ((AutocompletePredictionEntity)object0).i) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, ((int)this.e), this.a, this.d, this.f, this.g, this.h, this.i});
    }

    @Override  // bakw
    public final Object l() {
        return this;
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("placeId", this.b, arrayList0);
        basz.b("placeTypes", this.c, arrayList0);
        basz.b("fullText", this.a, arrayList0);
        basz.b("fullTextMatchedSubstrings", this.d, arrayList0);
        basz.b("primaryText", this.f, arrayList0);
        basz.b("primaryTextMatchedSubstrings", this.g, arrayList0);
        basz.b("secondaryText", this.h, arrayList0);
        basz.b("secondaryTextMatchedSubstrings", this.i, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.E(parcel0, 3, this.c);
        baub.y(parcel0, 4, this.d, false);
        baub.o(parcel0, 5, this.e);
        baub.v(parcel0, 6, this.f, false);
        baub.y(parcel0, 7, this.g, false);
        baub.v(parcel0, 8, this.h, false);
        baub.y(parcel0, 9, this.i, false);
        baub.c(parcel0, v1);
    }
}


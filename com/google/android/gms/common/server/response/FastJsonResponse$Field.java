package com.google.android.gms.common.server.response;

import android.os.Parcel;
import basz;
import batl;
import baub;
import bbgi;
import bbgv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import java.util.ArrayList;
import java.util.Map;

public class FastJsonResponse.Field extends AbstractSafeParcelable {
    public static final bbgv CREATOR;
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final int g;
    public final Class h;
    protected final String i;
    public FieldMappingDictionary j;
    public StringToIntConverter k;

    static {
        FastJsonResponse.Field.CREATOR = new bbgv();
    }

    public FastJsonResponse.Field(int v, int v1, boolean z, int v2, boolean z1, String s, int v3, String s1, ConverterWrapper converterWrapper0) {
        this.a = v;
        this.b = v1;
        this.c = z;
        this.d = v2;
        this.e = z1;
        this.f = s;
        this.g = v3;
        StringToIntConverter stringToIntConverter0 = null;
        if(s1 == null) {
            this.h = null;
            this.i = null;
        }
        else {
            this.h = SafeParcelResponse.class;
            this.i = s1;
        }
        if(converterWrapper0 != null) {
            stringToIntConverter0 = converterWrapper0.b;
            if(stringToIntConverter0 == null) {
                throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
            }
        }
        this.k = stringToIntConverter0;
    }

    public FastJsonResponse.Field(int v, boolean z, int v1, boolean z1, String s, int v2, Class class0) {
        this.a = 1;
        this.b = v;
        this.c = z;
        this.d = v1;
        this.e = z1;
        this.f = s;
        this.g = v2;
        this.h = class0;
        this.i = class0 == null ? null : class0.getCanonicalName();
        this.k = null;
    }

    public final bbgi a() {
        Class class0 = this.h;
        batl.s(class0);
        if(class0 == SafeParcelResponse.class) {
            batl.s(this.i);
            batl.t(this.j, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new SafeParcelResponse(this.j, this.i);
        }
        return (bbgi)class0.newInstance();
    }

    final String b() {
        return this.i == null ? null : this.i;
    }

    public final Map c() {
        batl.s(this.i);
        batl.s(this.j);
        Map map0 = this.j.a(this.i);
        batl.s(map0);
        return map0;
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("versionCode", Integer.valueOf(this.a), arrayList0);
        basz.b("typeIn", Integer.valueOf(this.b), arrayList0);
        basz.b("typeInArray", Boolean.valueOf(this.c), arrayList0);
        basz.b("typeOut", Integer.valueOf(this.d), arrayList0);
        basz.b("typeOutArray", Boolean.valueOf(this.e), arrayList0);
        basz.b("outputFieldName", this.f, arrayList0);
        basz.b("safeParcelFieldId", Integer.valueOf(this.g), arrayList0);
        basz.b("concreteTypeName", this.b(), arrayList0);
        Class class0 = this.h;
        if(class0 != null) {
            basz.b("concreteType.class", class0.getCanonicalName(), arrayList0);
        }
        StringToIntConverter stringToIntConverter0 = this.k;
        if(stringToIntConverter0 != null) {
            basz.b("converterName", stringToIntConverter0.getClass().getCanonicalName(), arrayList0);
        }
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.e(parcel0, 5, this.e);
        baub.v(parcel0, 6, this.f, false);
        baub.o(parcel0, 7, this.g);
        baub.v(parcel0, 8, this.b(), false);
        baub.t(parcel0, 9, (this.k == null ? null : new ConverterWrapper(this.k)), v, false);
        baub.c(parcel0, v1);
    }
}


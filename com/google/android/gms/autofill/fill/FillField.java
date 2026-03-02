package com.google.android.gms.autofill.fill;

import amxo;
import ando;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import angs;
import angu;
import angw;
import angx;
import aols;
import gfsx;
import gftb;
import ggdy;
import gged_interceptors;
import ggfp;
import ggna;
import ggqk;
import ghfv;
import hqec;
import j..util.Collection.-EL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class FillField implements Parcelable, IFillField {
    public static final Parcelable.Creator CREATOR;
    public static final Parcelable.Creator a;
    public final ggfp b;
    public final ggfp c;
    private final AutofillId d;
    private final int e;
    private final gged_interceptors f;
    private final int g;
    private final aols h;
    private final gged_interceptors i;
    private final int j;
    private final int k;
    private final String l;
    private final boolean m;

    static {
        FillField.a = new angu();
        FillField.CREATOR = new angw();
    }

    public FillField(AutofillId autofillId0, int v, gged_interceptors gged0, ggfp ggfp0, ggfp ggfp1, int v1, aols aols0, gged_interceptors gged1, int v2, int v3, String s, boolean z) {
        this.d = autofillId0;
        this.e = v;
        this.f = gged0;
        this.b = ggfp0;
        this.c = ggfp1;
        this.g = v1;
        this.h = aols0;
        this.i = gged1;
        this.j = v2;
        this.k = v3;
        this.l = s;
        this.m = z;
    }

    @Override  // com.google.android.gms.autofill.fill.IFillField
    public final int a() {
        return this.e;
    }

    @Override  // com.google.android.gms.autofill.fill.IFillField
    public final int b() {
        return this.k;
    }

    @Override  // com.google.android.gms.autofill.fill.IFillField
    public final int c() {
        return this.g;
    }

    @Override  // com.google.android.gms.autofill.fill.IFillField
    public final int d() {
        return this.j;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.autofill.fill.IFillField
    public final AutofillId e() {
        return this.d;
    }

    public static FillField f(IFillField iFillField0) {
        if((iFillField0 instanceof FillField)) {
            return (FillField)iFillField0;
        }
        angx angx0 = new angx();
        angx0.a = iFillField0.e();
        angx0.b = iFillField0.a();
        angx0.b(iFillField0.i());
        angx0.f(iFillField0.l());
        angx0.d(iFillField0.k());
        angx0.c = iFillField0.c();
        angx0.g(iFillField0.g());
        angx0.h(iFillField0.j());
        angx0.d = iFillField0.d();
        angx0.e = iFillField0.b();
        angx0.f = iFillField0.m();
        return angx0.a();
    }

    @Override  // com.google.android.gms.autofill.fill.IFillField
    public final aols g() {
        return this.h;
    }

    @Override  // com.google.android.gms.autofill.fill.IFillField
    public final gfsx h() {
        Object object0 = null;
        int v = -1;
        for(int v1 = 0; true; ++v1) {
            gged_interceptors gged0 = this.i;
            if(v1 >= ((ggna)gged0).c) {
                break;
            }
            amxo amxo0 = (amxo)gged0.get(v1);
            int v2 = amxo0.b;
            if(v < v2) {
                object0 = amxo0;
            }
            if(v < v2) {
                v = v2;
            }
        }
        return gfsx.l(object0);
    }

    @Override  // com.google.android.gms.autofill.fill.IFillField
    public final gged_interceptors i() {
        return this.f;
    }

    @Override  // com.google.android.gms.autofill.fill.IFillField
    public final gged_interceptors j() {
        return this.i;
    }

    @Override  // com.google.android.gms.autofill.fill.IFillField
    public final ggfp k() {
        return this.c;
    }

    @Override  // com.google.android.gms.autofill.fill.IFillField
    public final ggfp l() {
        return this.b;
    }

    @Override  // com.google.android.gms.autofill.fill.IFillField
    public final String m() {
        return this.l;
    }

    public static List n(Parcel parcel0) {
        int v = parcel0.readInt();
        ggdy ggdy0 = gged_interceptors.e(v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = parcel0.readInt();
            int v3 = parcel0.readInt();
            byte[] arr_b = new byte[v3];
            parcel0.readByteArray(arr_b);
            gftb.b(v3 > 0, "A HashCode must contain at least 1 byte.");
            ggdy0.i(new amxo(new ghfv(((byte[])arr_b.clone())), v2));
        }
        return ggdy0.h();
    }

    @Override  // com.google.android.gms.autofill.fill.IFillField
    public final boolean o(ando[] arr_ando) {
        List list0 = Arrays.asList(arr_ando);
        return !Collections.disjoint(this.b, list0);
    }

    @Override  // com.google.android.gms.autofill.fill.IFillField
    public final boolean p(ando ando0) {
        return this.c.contains(ando0);
    }

    @Override  // com.google.android.gms.autofill.fill.IFillField
    public final boolean q(ando ando0) {
        return this.b.contains(ando0);
    }

    @Override  // com.google.android.gms.autofill.fill.IFillField
    public final boolean r() {
        return this.m;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeTypedObject(this.d, v);
        parcel0.writeInt(this.e);
        parcel0.writeStringArray(((String[])this.f.toArray(new String[0])));
        parcel0.writeIntArray(Collection.-EL.stream(this.b).mapToInt(new angs()).toArray());
        parcel0.writeInt(this.g);
        parcel0.writeInt(this.h.a());
        parcel0.writeInt(((ggna)this.i).c);
        ggqk ggqk0 = this.i.E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            parcel0.writeInt(((amxo)object0).b);
            byte[] arr_b = ((amxo)object0).a.e();
            parcel0.writeInt(arr_b.length);
            parcel0.writeByteArray(arr_b);
        }
        parcel0.writeInt(this.j);
        parcel0.writeInt(this.k);
        parcel0.writeString(this.l);
        if(hqec.e()) {
            parcel0.writeIntArray(Collection.-EL.stream(this.c).mapToInt(new angs()).toArray());
        }
        parcel0.writeInt(((int)this.m));
    }
}


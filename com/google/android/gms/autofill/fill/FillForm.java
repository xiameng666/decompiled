package com.google.android.gms.autofill.fill;

import amno;
import amnr;
import ando;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import angx;
import angz;
import anha;
import anhc;
import anhd;
import anhe;
import anhf;
import anhg;
import anhh;
import anhi;
import anhu;
import bbcu;
import bboh;
import gfsx;
import ggaf;
import ggds;
import ggdy;
import gged_interceptors;
import ggfp;
import ggfq;
import ggft;
import ggna;
import ggnj;
import ggog;
import ggqj;
import ggqk;
import hqec;
import j..util.Collection.-EL;

public class FillForm implements Parcelable, IFillForm {
    public static final Parcelable.Creator CREATOR;
    public static final bboh a;
    public static final Parcelable.Creator b;
    public final gged_interceptors c;
    public final amno d;
    public final gfsx e;
    public final int f;
    private final ggft g;
    private final ggft h;
    private final gfsx i;

    static {
        FillForm.a = bboh.b("FillForm", bbcu.cD);
        FillForm.CREATOR = new anhh();
        FillForm.b = new anhi();
    }

    public FillForm(int v, gged_interceptors gged0, gfsx gfsx0, amno amno0, gfsx gfsx1) {
        this(v, gged0, gfsx0, amno0, gfsx1, hqec.e(), ggnj.a);
    }

    @Deprecated
    public FillForm(int v, gged_interceptors gged0, gfsx gfsx0, amno amno0, gfsx gfsx1, boolean z, ggfp ggfp0) {
        ggdy ggdy0 = new ggdy();
        int v1 = gged0.size();
        for(int v3 = 0; v3 < v1; ++v3) {
            ggdy0.i(FillField.f(((IFillField)gged0.get(v3))));
        }
        gged_interceptors gged1 = ggdy0.h();
        this.i = gfsx0.b(new anhd());
        this.d = amno0;
        this.e = gfsx1;
        this.f = v;
        ggfq ggfq0 = new ggfq();
        ggfq ggfq1 = new ggfq();
        int v4 = ((ggna)gged1).c;
        for(int v2 = 0; v2 < v4; ++v2) {
            FillField fillField0 = (FillField)gged1.get(v2);
            ggqj ggqj0 = fillField0.b.om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                ggfq0.b(((ando)object0), fillField0);
            }
            if(z) {
                ggqj ggqj1 = fillField0.c.om();
                while(ggqj1.hasNext()) {
                    Object object1 = ggqj1.next();
                    ggfq1.b(((ando)object1), fillField0);
                }
            }
        }
        ggdy ggdy1 = new ggdy();
        ggdy1.k(gged1);
        ggqj ggqj2 = ggfp0.om();
        while(ggqj2.hasNext()) {
            Object object2 = ggqj2.next();
            angx angx0 = new angx();
            angx0.g = true;
            angx0.e(((ando)object2));
            angx0.b = 1;
            FillField fillField1 = angx0.a();
            ggfq0.b(((ando)object2), fillField1);
            ggdy1.i(fillField1);
        }
        this.g = ggfq0.a();
        this.c = ggdy1.h();
        this.h = ggfq1.a();
    }

    @Override  // com.google.android.gms.autofill.fill.IFillForm
    public final int a() {
        return this.f;
    }

    @Override  // com.google.android.gms.autofill.fill.IFillForm
    public final amno b() {
        return this.d;
    }

    @Override  // com.google.android.gms.autofill.fill.IFillForm
    public final gfsx c() {
        return this.e;
    }

    @Override  // com.google.android.gms.autofill.fill.IFillForm
    public final gfsx d(ando[] arr_ando) {
        throw null;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.autofill.fill.IFillForm
    public final gfsx e(ggds ggds0) {
        Object object0 = null;
        ggqk ggqk0 = ((gged_interceptors)ggds0).E();
        while(ggqk0.hasNext()) {
            Object object1 = ggqk0.next();
            ando ando0 = (ando)object1;
            if(this.m(ando0)) {
                gged_interceptors gged0 = this.i(ando0);
                int v = gged0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    IFillField iFillField0 = (IFillField)gged0.get(v1);
                    if(angz.d(iFillField0)) {
                        return gfsx.m(iFillField0);
                    }
                    if(object0 == null) {
                        object0 = iFillField0;
                    }
                }
            }
        }
        return gfsx.l(object0);
    }

    @Override  // com.google.android.gms.autofill.fill.IFillForm
    public final gfsx f() {
        anhf anhf0 = new anhf();
        return this.i.b(anhf0);
    }

    @Override  // com.google.android.gms.autofill.fill.IFillForm
    public final gged_interceptors g() {
        return (gged_interceptors)Collection.-EL.stream(this.c).map(new anha()).collect(ggaf.a);
    }

    @Override  // com.google.android.gms.autofill.fill.IFillForm
    public final gged_interceptors h(ando ando0) {
        return (gged_interceptors)Collection.-EL.stream(this.h.e(ando0)).map(new anhg()).collect(ggaf.a);
    }

    @Override  // com.google.android.gms.autofill.fill.IFillForm
    public final gged_interceptors i(ando ando0) {
        return (gged_interceptors)Collection.-EL.stream(this.g.e(ando0)).map(new anhe()).collect(ggaf.a);
    }

    @Override  // com.google.android.gms.autofill.fill.IFillForm
    public final gged_interceptors j(ando[] arr_ando) {
        ggft ggft0 = this.g;
        ggfp ggfp0 = ggft0.e(arr_ando[0]);
        for(int v = 1; v < 2; v = 2) {
            ggfp0 = ggog.e(ggfp0, ggft0.e(arr_ando[1]));
        }
        return (gged_interceptors)Collection.-EL.stream(ggfp0).map(new anhc()).collect(ggaf.a);
    }

    @Override  // com.google.android.gms.autofill.fill.IFillForm
    public final ggfp k() {
        return this.g.r();
    }

    @Override  // com.google.android.gms.autofill.fill.IFillForm
    public final ggfp l(ggds ggds0) {
        return anhu.b(this, ggds0);
    }

    @Override  // com.google.android.gms.autofill.fill.IFillForm
    public final boolean m(ando ando0) {
        return this.g.u(ando0);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.f);
        parcel0.writeTypedList(this.c);
        gfsx gfsx0 = this.i;
        parcel0.writeInt(((int)gfsx0.i()));
        if(gfsx0.i()) {
            parcel0.writeTypedObject(((FillField)gfsx0.d()), v);
        }
        amnr.d(this.d, parcel0);
        gfsx gfsx1 = this.e;
        parcel0.writeInt(((int)gfsx1.i()));
        if(gfsx1.i()) {
            amnr.d(((amno)gfsx1.d()), parcel0);
        }
    }
}


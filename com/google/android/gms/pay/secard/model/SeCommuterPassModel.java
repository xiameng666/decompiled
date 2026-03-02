package com.google.android.gms.pay.secard.model;

import MoreObjects;
import ToStringHelper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bauc;
import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.libraries.tapandpay.pay.pass.common.template.api.PassDetailCallback;
import dylc;
import dyna;
import dyur;
import fshg;
import ftqn;
import gfqx;
import gfsx;
import gged_interceptors;
import ggna;
import gubi;
import gucl;
import guct;
import gucv;
import gumi;
import gutc;
import guut;
import j..util.Objects;

public class SeCommuterPassModel implements PassDetailCallback, fshg {
    public static final Parcelable.Creator CREATOR;
    public final dylc a;
    private final String b;
    private final gfsx c;
    private final gumi d;
    private final gutc e;

    static {
        SeCommuterPassModel.CREATOR = new dyur();
    }

    public SeCommuterPassModel(dylc dylc0, gfsx gfsx0, gutc gutc0, gumi gumi0) {
        dyna dyna0 = dyna.b(dylc0.c) == null ? dyna.k : dyna.b(dylc0.c);
        this.b = String.format("%s.%s", ftqn.a(dyna.class, dyna0), dylc0.d);
        this.a = dylc0;
        this.d = gumi0;
        this.c = gfsx0;
        this.e = gutc0;
    }

    @Override  // com.google.android.libraries.tapandpay.pay.pass.common.template.api.PassDetailCallback
    public final fshg a() {
        return this;
    }

    @Override  // com.google.android.libraries.tapandpay.pay.pass.common.template.api.PassDetailCallback
    public final gubi b() {
        gubi gubi0 = this.d.c;
        return gubi0 == null ? gubi.a : gubi0;
    }

    @Override  // fshg
    public final gfsx bA() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bG() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bH() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gged_interceptors bI() {
        return ggna.a;
    }

    @Override  // fshg
    public final gged_interceptors bJ() {
        return ggna.a;
    }

    @Override  // fshg
    public final guut bK() {
        return guut.a;
    }

    @Override  // fshg
    public final String bL() {
        return this.b;
    }

    @Override  // fshg
    public final boolean bN() {
        return true;
    }

    @Override  // fshg
    public final boolean bO() {
        return false;
    }

    @Override  // fshg
    public final boolean bP() {
        return false;
    }

    @Override  // fshg
    public final boolean bQ() {
        return false;
    }

    @Override  // fshg
    public final boolean bR() {
        return true;
    }

    @Override  // fshg
    public final boolean bS() {
        return true;
    }

    @Override  // fshg
    public final boolean bT() {
        return true;
    }

    @Override  // fshg
    public final gfsx bt() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bu() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx by() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bz() {
        return gfqx.a;
    }

    @Override  // com.google.android.libraries.tapandpay.pay.pass.common.template.api.PassDetailCallback
    public final gubi c() {
        gubi gubi0 = this.d.d;
        return gubi0 == null ? gubi.a : gubi0;
    }

    @Override  // com.google.android.libraries.tapandpay.pay.pass.common.template.api.PassDetailCallback
    @Deprecated
    public final gucl d() {
        return gucl.a;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.libraries.tapandpay.pay.pass.common.template.api.PassDetailCallback
    @Deprecated
    public final guct e() {
        return guct.a;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof SeCommuterPassModel) ? Objects.equals(this.b, ((SeCommuterPassModel)object0).b) && Objects.equals(this.a, ((SeCommuterPassModel)object0).a) && Objects.equals(this.c, ((SeCommuterPassModel)object0).c) && Objects.equals(this.e, ((SeCommuterPassModel)object0).e) && Objects.equals(this.d, ((SeCommuterPassModel)object0).d) : false;
    }

    public final gucv f() {
        gucv gucv0 = this.d.j;
        return gucv0 == null ? gucv.a : gucv0;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.b});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("id", this.b);
        return gfsv0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeByteArray(this.a.toBytesArray());
        parcel0.writeByteArray((this.c.i() ? bauc.n(((GooglePaymentMethodId)this.c.d())) : null));
        parcel0.writeByteArray(this.e.toBytesArray());
        parcel0.writeByteArray(this.d.toBytesArray());
    }
}


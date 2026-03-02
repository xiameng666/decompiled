package com.android.onboarding.tasks;

import a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import com.android.onboarding.contracts.annotations.InternalOnboardingApi;
import ibuq;
import rna;
import rne;
import rnr;
import rnv;
import rnw;
import rnx;
import roc;
import roe;
import ron;
import rqy;
import rra;
import rrb;
import ruj;
import rxs;
import rxt;
import rxu;
import rxv;
import ryt;
import sco;
import scr;
import sdn;

public final class ErasedOnboardingTaskState implements Parcelable, ryt {
    public static final ruj CREATOR;
    private final PersistableBundle a;

    static {
        ErasedOnboardingTaskState.CREATOR = new ruj();
    }

    public ErasedOnboardingTaskState(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "bundle");
        super();
        this.a = persistableBundle0;
    }

    @Override  // ryt
    @InternalOnboardingApi
    public final PersistableBundle a() {
        return new PersistableBundle(this.a);
    }

    @InternalOnboardingApi
    public final int d() {
        if(!this.q()) {
            throw new IllegalArgumentException(a.i(this, "This {", "} is not a pending state."));
        }
        PersistableBundle persistableBundle0 = this.e();
        if(persistableBundle0 != null) {
            return scr.a(persistableBundle0);
        }
        throw new IllegalArgumentException(a.i(this, "The task state {", "} doesn\'t have any result."));
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return this.a.describeContents();
    }

    @InternalOnboardingApi
    public final PersistableBundle e() {
        return this.a().getPersistableBundle("com.android.onboarding.task.RESULT");
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ErasedOnboardingTaskState) && sco.c(this.a, ((ErasedOnboardingTaskState)object0).a);
    }

    @Override  // roj
    public final long f() {
        return rnx.c(this.a);
    }

    @Override  // rof
    public final String fa() {
        String s = this.a.getString("com.android.onboarding.task.COMPONENT");
        if(s != null) {
            return s;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override  // roo
    public final String fb() {
        String s = this.a.getString("com.android.onboarding.task.NODE");
        if(s != null) {
            return s;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override  // rof
    public final roe fi() {
        return new roe(this);
    }

    @Override  // rrc
    public final rra fk() {
        return new rrb(this);
    }

    @Override  // ryt
    public final rnv g() {
        return (rnv)sdn.a(this.a, "com.android.onboarding.task.LAST_METADATA", rnv.a);
    }

    @Override
    public final int hashCode() {
        return sco.d(this.a);
    }

    @Override  // ryt
    public final ErasedOnboardingTaskState i() {
        return this;
    }

    @Override  // ryt
    public final rxv j(rna rna0) {
        ibuq.f(rna0, "parser");
        switch(this.s()) {
            case "Failed": {
                ron ron2 = new ron(this);
                ibuq.f(rna0, "parser");
                ibuq.f(this.a, "bundle");
                long v = rnx.c(this.a);
                PersistableBundle persistableBundle0 = this.a.getPersistableBundle("com.android.onboarding.task.RESULT");
                rnv rnv0 = (rnv)sdn.a(this.a, "com.android.onboarding.task.LAST_METADATA", rnv.a);
                String s = this.a.getString("com.android.onboarding.task.ERROR");
                if(s != null) {
                    rnw.c(s);
                    return new rxs(rna0, ron2, v, persistableBundle0, rnv0, new rnw(s));
                }
                return new rxs(rna0, ron2, v, persistableBundle0, rnv0, new rnr("Failed to parse error message in the bundle."));
            }
            case "InProgress": {
                ron ron1 = new ron(this);
                ibuq.f(rna0, "parser");
                ibuq.f(this.a, "bundle");
                return new rxt(rna0, ron1, rnx.c(this.a));
            }
            case "Success": {
                ron ron0 = new ron(this);
                ibuq.f(rna0, "parser");
                ibuq.f(this.a, "bundle");
                return new rxu(rna0, ron0, rnx.c(this.a), this.a.getPersistableBundle("com.android.onboarding.task.RESULT"), ((rnv)sdn.a(this.a, "com.android.onboarding.task.LAST_METADATA", rnv.a)));
            }
            default: {
                throw new IllegalStateException("Unknown OnboardingTaskState(type=" + this.s() + ")");
            }
        }
    }

    @Override  // ryt
    public final rxv k(rne rne0) {
        ibuq.f(rne0, "parser");
        return this.j(rne0.g());
    }

    @Override  // rof
    public final String l() {
        return roc.a(this);
    }

    @Override  // rrc
    public final String m() {
        return rqy.a(this);
    }

    @Override  // roo
    public final ron o() {
        return new ron(this);
    }

    @Override  // ryt
    public final boolean p() {
        return ibuq.m(this.s(), "Success") || ibuq.m(this.s(), "Failed");
    }

    public final boolean q() {
        PersistableBundle persistableBundle0 = this.e();
        return persistableBundle0 == null ? false : scr.f(persistableBundle0);
    }

    @InternalOnboardingApi
    public final boolean r() {
        PersistableBundle persistableBundle0 = this.e();
        return persistableBundle0 == null ? false : scr.g(persistableBundle0);
    }

    private final String s() {
        String s = this.a.getString("com.android.onboarding.task.TYPE");
        if(s != null) {
            return s;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override
    public final String toString() {
        return "ErasedOnboardingTaskState(type=" + this.s() + " identity=" + rqy.a(this) + " lastMetadata=" + this.g() + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "p0");
        this.a.writeToParcel(parcel0, v);
    }
}


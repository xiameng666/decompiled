package com.google.android.libraries.tapandpay.pay.pass.valuable.model;

import MoreObjects;
import ToStringHelper;
import android.os.Parcel;
import android.os.Parcelable;
import ftqn;
import gfta;
import guuw;
import guwf;
import j..util.Objects;

public abstract class ValuableInfo implements Parcelable {
    public final guuw Q;
    public final guwf R;

    protected ValuableInfo(guuw guuw0, guwf guwf0) {
        this.Q = guuw0;
        this.R = guwf0;
    }

    public final String C() {
        long v = this.Q.b;
        Long long0 = v;
        String s = this.Q.c;
        long0.getClass();
        return v <= 0L || gfta.c(s) ? null : String.format("%s.%s", long0, s);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object object0) {
        return (object0 instanceof ValuableInfo) ? Objects.equals(this.Q, ((ValuableInfo)object0).Q) && this.R == ((ValuableInfo)object0).R : false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.Q});
    }

    @Override
    public String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("classId", this.C());
        gfsv0.add("valuableType", this.R.name());
        return gfsv0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeByteArray(this.Q.toBytesArray());
        parcel0.writeInt(ftqn.a(guwf.class, this.R));
    }
}


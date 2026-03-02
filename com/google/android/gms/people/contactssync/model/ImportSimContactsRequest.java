package com.google.android.gms.people.contactssync.model;

import MoreObjects;
import ToStringHelper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import egbu;
import ggfp;
import glwy;
import j..util.Objects;
import java.util.Set;

public final class ImportSimContactsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Set a;
    public final AccountWithDataSet b;

    static {
        ImportSimContactsRequest.CREATOR = new egbu();
    }

    public ImportSimContactsRequest(Set set0, AccountWithDataSet accountWithDataSet0) {
        this.a = ggfp.G(set0);
        this.b = accountWithDataSet0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ImportSimContactsRequest) ? Objects.equals(this.a, ((ImportSimContactsRequest)object0).a) && Objects.equals(this.b, ((ImportSimContactsRequest)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("subscriptionIds", this.a);
        gfsv0.add("destinationAccount", this.b);
        return gfsv0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.p(parcel0, 1, glwy.n(this.a), false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}


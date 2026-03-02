package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.ExternalApplicationLink;
import com.google.android.gms.reminders.model.ExternalApplicationLinkEntity;
import ejub;
import ejuj;

public class ExternalApplicationLinkRef extends ejub implements ExternalApplicationLink {
    public ExternalApplicationLinkRef(DataHolder dataHolder0, int v, String s) {
        super(dataHolder0, v, s);
    }

    @Override  // com.google.android.gms.reminders.model.ExternalApplicationLink
    public final Integer a() {
        return this.n(this.p("link_application"));
    }

    @Override  // com.google.android.gms.reminders.model.ExternalApplicationLink
    public final String c() {
        return this.r(this.p("link_id"));
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // bakp
    public final boolean equals(Object object0) {
        if(!(object0 instanceof ExternalApplicationLink)) {
            return false;
        }
        return this == object0 ? true : ExternalApplicationLinkEntity.d(this, ((ExternalApplicationLink)object0));
    }

    @Override  // bakp
    public final int hashCode() {
        return ExternalApplicationLinkEntity.b(this);
    }

    @Override  // bakp, bakw
    public final Object l() {
        return new ExternalApplicationLinkEntity(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ejuj.a(new ExternalApplicationLinkEntity(this), parcel0);
    }
}


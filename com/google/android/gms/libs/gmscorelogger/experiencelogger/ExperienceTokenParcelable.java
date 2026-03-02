package com.google.android.gms.libs.gmscorelogger.experiencelogger;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import cdol;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ExperienceTokenParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;

    static {
        ExperienceTokenParcelable.CREATOR = new cdol();
    }

    public ExperienceTokenParcelable(long v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ExperienceTokenParcelable) ? this.a == ((ExperienceTokenParcelable)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return (int)this.a;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}


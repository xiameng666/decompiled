package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dasu;
import java.util.Arrays;

public class PresenceAction extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        PresenceAction.CREATOR = new dasu();
    }

    public PresenceAction(int v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof PresenceAction) && this.a == ((PresenceAction)object0).a;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a)});
    }

    @Override
    public final String toString() {
        return "PresenceAction[action=" + this.a + ']';
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}


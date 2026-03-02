package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import datl;
import java.util.Arrays;

public class PresenceIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final PresenceIdentity a;
    public static final PresenceIdentity b;
    public static final PresenceIdentity c;
    public static final PresenceIdentity d;
    public final int e;
    public final String f;

    static {
        PresenceIdentity.CREATOR = new datl();
        PresenceIdentity.a = new PresenceIdentity(2, "");
        PresenceIdentity.b = new PresenceIdentity(0, "");
        PresenceIdentity.c = new PresenceIdentity(1, "");
        PresenceIdentity.d = new PresenceIdentity(-1, "");
    }

    public PresenceIdentity(int v, String s) {
        this.e = v;
        this.f = s;
    }

    public static String a(int v) {
        switch(v) {
            case -1: {
                return "unknown";
            }
            case 0: {
                return "private group";
            }
            case 1: {
                return "contacts group";
            }
            case 2: {
                return "public";
            }
            default: {
                return "not recognizable";
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof PresenceIdentity)) {
            return this.f == null || this.f.isEmpty() ? this.e == ((PresenceIdentity)object0).e : this.e == ((PresenceIdentity)object0).e && this.f.equals(((PresenceIdentity)object0).f);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.f == null || this.f.isEmpty() ? Arrays.hashCode(new Object[]{((int)this.e)}) : Arrays.hashCode(new Object[]{this.e + this.f});
    }

    @Override
    public final String toString() {
        return "Identity[type=" + PresenceIdentity.a(this.e) + ", provider name =" + this.f + ']';
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.e);
        baub.v(parcel0, 2, this.f, false);
        baub.c(parcel0, v1);
    }
}


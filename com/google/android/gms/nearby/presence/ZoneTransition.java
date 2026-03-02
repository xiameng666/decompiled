package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import daud;
import gged_interceptors;
import j..util.Objects;
import java.util.List;
import java.util.Locale;

public class ZoneTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;
    private final List d;

    static {
        ZoneTransition.CREATOR = new daud();
    }

    public ZoneTransition(int v, int v1, int v2, List list0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = list0;
    }

    public final List a() {
        return gged_interceptors.i(this.d);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ZoneTransition) ? this.a == ((ZoneTransition)object0).a && this.b == ((ZoneTransition)object0).b && this.c == ((ZoneTransition)object0).c && Objects.equals(this.d, ((ZoneTransition)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), ((int)this.b), ((int)this.c), this.d});
    }

    @Override
    public final String toString() {
        String s;
        Locale locale0 = Locale.ENGLISH;
        switch(this.a) {
            case 1: {
                s = "RANGE_FAR";
                break;
            }
            case 2: {
                s = "RANGE_LONG";
                break;
            }
            case 3: {
                s = "RANGE_CLOSE";
                break;
            }
            case 4: {
                s = "RANGE_WITHIN_REACH";
                break;
            }
            case 5: {
                s = "RANGE_TAP";
                break;
            }
            default: {
                s = "RANGE_UNKNOWN";
            }
        }
        Integer integer0 = (int)this.b;
        switch(this.c) {
            case 1: {
                return String.format(locale0, "ZoneTransition{%s, confidence=%s, transitionType=%s, localDeviceMotions=%s}", s, integer0, "TRANSITION_ENTER", this.d);
            }
            case 2: {
                return String.format(locale0, "ZoneTransition{%s, confidence=%s, transitionType=%s, localDeviceMotions=%s}", s, integer0, "TRANSITION_DWELL", this.d);
            }
            case 3: {
                return String.format(locale0, "ZoneTransition{%s, confidence=%s, transitionType=%s, localDeviceMotions=%s}", s, integer0, "TRANSITION_EXIT", this.d);
            }
            default: {
                return String.format(locale0, "ZoneTransition{%s, confidence=%s, transitionType=%s, localDeviceMotions=%s}", s, integer0, "TRANSITION_UNKNOWN", this.d);
            }
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.y(parcel0, 4, this.a(), false);
        baub.c(parcel0, v1);
    }
}


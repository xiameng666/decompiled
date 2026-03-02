package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.WorkSource;
import bata;
import baub;
import bbrd;
import cmmz;
import cmnm;
import cmon;
import cmor;
import cnwf;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import java.util.Arrays;

public final class CurrentLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final int f;
    public final WorkSource g;
    public final ClientIdentity h;

    static {
        CurrentLocationRequest.CREATOR = new cmmz();
    }

    public CurrentLocationRequest(long v, int v1, int v2, long v3, boolean z, int v4, WorkSource workSource0, ClientIdentity clientIdentity0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = z;
        this.f = v4;
        this.g = workSource0;
        this.h = clientIdentity0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof CurrentLocationRequest) ? this.a == ((CurrentLocationRequest)object0).a && this.b == ((CurrentLocationRequest)object0).b && this.c == ((CurrentLocationRequest)object0).c && this.d == ((CurrentLocationRequest)object0).d && this.e == ((CurrentLocationRequest)object0).e && this.f == ((CurrentLocationRequest)object0).f && bata.b(this.g, ((CurrentLocationRequest)object0).g) && bata.b(this.h, ((CurrentLocationRequest)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a), ((int)this.b), ((int)this.c), ((long)this.d)});
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("CurrentLocationRequest[");
        stringBuilder0.append(cmon.a(this.c));
        long v = this.a;
        if(v != 0x7FFFFFFFFFFFFFFFL) {
            stringBuilder0.append(", maxAge=");
            cnwf.e(v, stringBuilder0);
        }
        long v1 = this.d;
        if(v1 != 0x7FFFFFFFFFFFFFFFL) {
            stringBuilder0.append(", duration=");
            stringBuilder0.append(v1);
            stringBuilder0.append("ms");
        }
        int v2 = this.b;
        if(v2 != 0) {
            stringBuilder0.append(", ");
            stringBuilder0.append(cmnm.a(v2));
        }
        if(this.e) {
            stringBuilder0.append(", bypass");
        }
        int v3 = this.f;
        if(v3 != 0) {
            stringBuilder0.append(", ");
            stringBuilder0.append(cmor.a(v3));
        }
        WorkSource workSource0 = this.g;
        if(!bbrd.g(workSource0)) {
            stringBuilder0.append(", workSource=");
            stringBuilder0.append(workSource0);
        }
        ClientIdentity clientIdentity0 = this.h;
        if(clientIdentity0 != null) {
            stringBuilder0.append(", impersonation=");
            stringBuilder0.append(clientIdentity0);
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.q(parcel0, 4, this.d);
        baub.e(parcel0, 5, this.e);
        baub.t(parcel0, 6, this.g, v, false);
        baub.o(parcel0, 7, this.f);
        baub.t(parcel0, 9, this.h, v, false);
        baub.c(parcel0, v1);
    }
}


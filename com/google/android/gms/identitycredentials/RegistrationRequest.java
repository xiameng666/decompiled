package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bxvh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;
import ibzk;
import java.util.Collection;
import java.util.List;

public final class RegistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;
    public final byte[] b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;
    public final String g;

    static {
        RegistrationRequest.CREATOR = new bxvh();
    }

    public RegistrationRequest(byte[] arr_b, byte[] arr_b1, String s, String s1, List list0, String s2, String s3) {
        boolean z = false;
        ibuq.f(arr_b, "credentials");
        ibuq.f(arr_b1, "matcher");
        ibuq.f(s, "type");
        ibuq.f(s1, "requestType");
        ibuq.f(list0, "protocolTypes");
        ibuq.f(s2, "id");
        ibuq.f(s3, "fulfillmentActionName");
        super();
        this.a = arr_b;
        this.b = arr_b1;
        this.c = s;
        this.d = s1;
        this.e = list0;
        this.f = s2;
        this.g = s3;
        boolean z1 = true;
        if(!ibzk.D(s1) && !list0.isEmpty() && (!(list0 instanceof Collection) || !list0.isEmpty())) {
            for(Object object0: list0) {
                if(!ibzk.D(((String)object0))) {
                    z = true;
                    break;
                }
            }
        }
        if(ibzk.D(this.c) || this.d.length() != 0 || !this.e.isEmpty()) {
            z1 = false;
        }
        if(!z && !z1) {
            throw new IllegalArgumentException("Either type: " + this.c + ", or requestType: " + this.d + " and protocolTypes: " + this.e + " must be specified, but all were blank, or for protocolTypes, empty or full of blank elements.");
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.x(parcel0, 5, this.e, false);
        baub.v(parcel0, 6, this.f, false);
        baub.v(parcel0, 7, this.g, false);
        baub.c(parcel0, v1);
    }
}


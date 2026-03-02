package com.google.android.gms.auth.api.identity;

import ahpo;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;

public class CallerVerificationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final int c;

    static {
        CallerVerificationRequest.CREATOR = new ahpo();
    }

    public CallerVerificationRequest(String s, String s1, int v) {
        batl.c(v != 0, "Page name must be resolve to an existing PageNumber and be non-null");
        this.a = s;
        this.b = s1;
        this.c = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof CallerVerificationRequest) && Objects.equals(this.a, ((CallerVerificationRequest)object0).a) && Objects.equals(this.b, ((CallerVerificationRequest)object0).b) && this.c == ((CallerVerificationRequest)object0).c;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, ((int)this.c)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        int v2 = this.c;
        if(v2 == 0) {
            throw null;
        }
        baub.o(parcel0, 4, v2 - 1);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.auth.api.identity;

import ahph;
import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Account e;
    public final String f;
    public final String g;
    public final boolean h;
    public final Bundle i;
    public final boolean j;

    static {
        AuthorizationRequest.CREATOR = new ahph();
    }

    public AuthorizationRequest(List list0, String s, boolean z, boolean z1, Account account0, String s1, String s2, boolean z2, Bundle bundle0, boolean z3) {
        batl.c(list0 != null && !list0.isEmpty(), "requestedScopes cannot be null or empty");
        this.a = list0;
        this.b = s;
        this.c = z;
        this.d = z1;
        this.e = account0;
        this.f = s1;
        this.g = s2;
        this.h = z2;
        this.i = bundle0;
        this.j = z3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof AuthorizationRequest)) {
            return false;
        }
        List list0 = ((AuthorizationRequest)object0).a;
        if(this.a.size() == list0.size() && this.a.containsAll(list0)) {
            Bundle bundle0 = ((AuthorizationRequest)object0).i;
            Bundle bundle1 = this.i;
            if(bundle1 == null) {
                if(bundle0 != null) {
                    return false;
                }
                bundle0 = null;
            }
            if(bundle1 != null && bundle0 == null) {
                return false;
            }
            if(bundle1 != null) {
                if(bundle1.size() != bundle0.size()) {
                    return false;
                }
                for(Object object1: bundle1.keySet()) {
                    if(!bata.b(bundle1.getString(((String)object1)), bundle0.getString(((String)object1)))) {
                        return false;
                    }
                }
            }
            return this.c == ((AuthorizationRequest)object0).c && this.h == ((AuthorizationRequest)object0).h && this.d == ((AuthorizationRequest)object0).d && this.j == ((AuthorizationRequest)object0).j && bata.b(this.b, ((AuthorizationRequest)object0).b) && bata.b(this.e, ((AuthorizationRequest)object0).e) && bata.b(this.f, ((AuthorizationRequest)object0).f) && bata.b(this.g, ((AuthorizationRequest)object0).g);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.h), Boolean.valueOf(this.d), this.e, this.f, this.g, this.i, Boolean.valueOf(this.j)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.e(parcel0, 3, this.c);
        baub.e(parcel0, 4, this.d);
        baub.t(parcel0, 5, this.e, v, false);
        baub.v(parcel0, 6, this.f, false);
        baub.v(parcel0, 7, this.g, false);
        baub.e(parcel0, 8, this.h);
        baub.g(parcel0, 9, this.i, false);
        baub.e(parcel0, 10, this.j);
        baub.c(parcel0, v1);
    }
}


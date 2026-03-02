package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import batl;
import baub;
import bcub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class ContextFenceRegistrationStub extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public ContextFenceStub b;
    public final long c;

    static {
        ContextFenceRegistrationStub.CREATOR = new bcub();
    }

    public ContextFenceRegistrationStub(String s, long v, ContextFenceStub contextFenceStub0) {
        batl.q(s);
        batl.s(contextFenceStub0);
        this(s, contextFenceStub0, v);
    }

    public ContextFenceRegistrationStub(String s, ContextFenceStub contextFenceStub0, long v) {
        this.a = s;
        this.b = contextFenceStub0;
        this.c = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ContextFenceRegistrationStub) ? TextUtils.equals(this.a, ((ContextFenceRegistrationStub)object0).a) && this.c == ((ContextFenceRegistrationStub)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((long)this.c)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.t(parcel0, 3, this.b, v, false);
        baub.q(parcel0, 4, this.c);
        baub.c(parcel0, v1);
    }
}


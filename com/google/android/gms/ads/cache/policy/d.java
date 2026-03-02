package com.google.android.gms.ads.cache.policy;

import ProtoLiteMessage;
import bata;
import com.google.android.gms.ads.cache.a;
import com.google.android.gms.ads.cache.s;

public final class d implements e {
    private final s a;

    public d(s s0) {
        this.a = s0;
    }

    @Override  // com.google.android.gms.ads.cache.policy.e
    public final void a(a a0) {
        a0.a.h(this.a);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof d) ? bata.b(this.a, ((d)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        s s0 = this.a;
        if(((ProtoLiteMessage)s0).isImmutable()) {
            return ((ProtoLiteMessage)s0).s();
        }
        int v = s0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)s0).s();
            s0.memoizedHashCode = v;
        }
        return v;
    }
}


package com.google.android.gms.ads.social;

import com.google.android.gms.presencemanager.ActiveUser;
import evqk;
import evql;
import evrg;

public final class f implements evqk {
    public final i a;

    public f(i i0) {
        this.a = i0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        return ((ActiveUser)object0) == null ? evrg.d("") : this.a.c.b(((ActiveUser)object0));
    }
}


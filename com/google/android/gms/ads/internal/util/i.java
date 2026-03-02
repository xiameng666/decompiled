package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.e;

public final class i implements e {
    public final Context a;
    public final String b;

    public i(Context context0, String s) {
        this.a = context0;
        this.b = s;
    }

    @Override  // com.google.android.gms.ads.internal.util.client.e
    public final void a(String s) {
        m.k(this.a, this.b, s);
    }
}


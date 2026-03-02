package com.google.android.gms.ads.internal.util;

import android.net.Uri;
import java.util.concurrent.Callable;

public final class k implements Callable {
    public final Uri a;

    public k(Uri uri0) {
        this.a = uri0;
    }

    @Override
    public final Object call() {
        return m.n(this.a);
    }
}


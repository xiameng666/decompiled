package com.google.android.gms.ads.nonagon.util.concurrent;

import com.google.android.gms.ads.nonagon.ad.event.c;
import gmcd;
import gmcg;
import java.util.Arrays;
import java.util.Collections;

public final class o {
    public final gmcg a;
    public final c b;

    static {
    }

    public o(gmcg gmcg0, c c0) {
        this.a = gmcg0;
        this.b = c0;
    }

    public final j a(Object object0, gmcd[] arr_gmcd) {
        return new j(this, object0, Arrays.asList(arr_gmcd));
    }

    public final n b(Object object0, gmcd gmcd0) {
        return new n(this, object0, gmcd0, Collections.singletonList(gmcd0), gmcd0);
    }
}


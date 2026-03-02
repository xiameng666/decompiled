package com.google.android.gms.ads.social;

import android.net.Uri;
import com.google.android.gms.ads.internal.c;
import glzn;
import gmcd;
import java.util.HashMap;
import java.util.List;

public final class v implements glzn {
    public final z a;
    public final gmcd b;
    public final gmcd c;
    public final String d;
    public final Uri e;

    public v(z z0, gmcd gmcd0, gmcd gmcd1, String s, Uri uri0) {
        this.a = z0;
        this.b = gmcd0;
        this.c = gmcd1;
        this.d = s;
        this.e = uri0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        List list0 = (List)object0;
        HashMap hashMap0 = new HashMap();
        hashMap0.put("User-Agent", c.e().a(this.a.b, this.a.d.a));
        hashMap0.put("x-afma-drt-cookie", ((String)this.b.get()));
        hashMap0.put("x-afma-drt-v2-cookie", ((String)this.c.get()));
        hashMap0.put("calling-package", this.d);
        hashMap0.put("x-afma-token-requester-type", "requester_type_2");
        return this.a.e.a(0, this.e.toString(), hashMap0, null);
    }
}


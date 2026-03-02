package com.google.android.gms.ads.httpcache;

import com.android.volley.NetworkResponse;
import com.google.android.gms.ads.internal.httpcache.HttpResponseParcel;
import gfsi;
import java.util.Map.Entry;

public final class a implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        int v = ((NetworkResponse)object0).headers.size();
        String[] arr_s = new String[v];
        String[] arr_s1 = new String[v];
        int v1 = 0;
        for(Object object1: ((NetworkResponse)object0).headers.entrySet()) {
            arr_s[v1] = (String)((Map.Entry)object1).getKey();
            arr_s1[v1] = (String)((Map.Entry)object1).getValue();
            ++v1;
        }
        return new HttpResponseParcel(false, null, ((NetworkResponse)object0).statusCode, ((NetworkResponse)object0).data, arr_s, arr_s1, ((NetworkResponse)object0).notModified, ((NetworkResponse)object0).networkTimeMs);
    }
}


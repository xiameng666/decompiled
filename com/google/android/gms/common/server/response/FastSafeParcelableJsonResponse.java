package com.google.android.gms.common.server.response;

import bata;
import batl;
import bbgi;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public abstract class FastSafeParcelableJsonResponse extends bbgi implements SafeParcelable {
    @Override  // bbgi
    public boolean ag(String s) {
        return false;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        if(!this.getClass().isInstance(object0)) {
            return false;
        }
        for(Object object1: this.b().values()) {
            FastJsonResponse.Field fastJsonResponse$Field0 = (FastJsonResponse.Field)object1;
            if(this.e(fastJsonResponse$Field0)) {
                if(((bbgi)object0).e(fastJsonResponse$Field0) && bata.b(this.a(fastJsonResponse$Field0), ((bbgi)object0).a(fastJsonResponse$Field0))) {
                    continue;
                }
                return false;
            }
            if(((bbgi)object0).e(fastJsonResponse$Field0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int v = 0;
        for(Object object0: this.b().values()) {
            FastJsonResponse.Field fastJsonResponse$Field0 = (FastJsonResponse.Field)object0;
            if(this.e(fastJsonResponse$Field0)) {
                Object object1 = this.a(fastJsonResponse$Field0);
                batl.s(object1);
                v = v * 0x1F + object1.hashCode();
            }
        }
        return v;
    }

    @Override  // bbgi
    public Object z(String s) {
        return null;
    }
}


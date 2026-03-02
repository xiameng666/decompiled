package com.google.android.gms.quickstart;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ejll;
import gfud;
import ggnf;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class XosLaunchParameters extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    static {
        XosLaunchParameters.CREATOR = new ejll();
    }

    public XosLaunchParameters(int v, int v1, String s, String s1) {
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = s1;
    }

    public static XosLaunchParameters a(Uri uri0) {
        int v1;
        if(!bata.b(uri0.getHost(), "migrate.google")) {
            throw new IllegalArgumentException("URI does not begin with the correct hostname");
        }
        String s = uri0.getFragment();
        Map map0 = ggnf.a;
        if(s != null) {
            map0 = gfud.g("&").o().a(s);
        }
        List list0 = uri0.getPathSegments();
        int v = 2;
        if(list0.size() < 2) {
            throw new IllegalArgumentException("Path does not contain at least 2 segments");
        }
        try {
            v1 = Integer.parseInt(((String)list0.get(0)));
        }
        catch(NumberFormatException numberFormatException0) {
            throw new IllegalArgumentException("Failed to parse version code", numberFormatException0);
        }
        batl.c(v1 >= 0, "Version code must be non-negative integer");
        if(((String)list0.get(1)).equals("d")) {
            v = 1;
        }
        else if(!((String)list0.get(1)).equals("e")) {
            v = 0;
        }
        String s1 = (String)map0.get("s");
        if(s1 == null) {
            throw new IllegalArgumentException("Session ID param is missing");
        }
        String s2 = (String)map0.get("p");
        if(s2 != null) {
            return new XosLaunchParameters(v1, v, s1, s2);
        }
        throw new IllegalArgumentException("Auth key param is missing");
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "XosLaunchParameters[version=%d, flowType=%d, sessionId=%s, authKey=%s]", ((int)this.a), ((int)this.b), this.c, this.d);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.o(parcel0, 3, this.b);
        baub.v(parcel0, 4, this.c, false);
        baub.v(parcel0, 5, this.d, false);
        baub.c(parcel0, v1);
    }
}


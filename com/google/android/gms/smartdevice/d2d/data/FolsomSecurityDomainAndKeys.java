package com.google.android.gms.smartdevice.d2d.data;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bauc;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import eqgz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FolsomSecurityDomainAndKeys extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    final Set a;
    public String b;
    public ArrayList c;
    private static final HashMap d;

    static {
        FolsomSecurityDomainAndKeys.CREATOR = new eqgz();
        HashMap hashMap0 = new HashMap();
        FolsomSecurityDomainAndKeys.d = hashMap0;
        hashMap0.put("securityDomain", new FastJsonResponse.Field(7, false, 7, false, "securityDomain", 2, null));
        hashMap0.put("sharedKeys", new FastJsonResponse.Field(7, true, 7, true, "sharedKeys", 3, null));
    }

    public FolsomSecurityDomainAndKeys() {
        this.a = new HashSet();
        this.b = "";
        this.c = new ArrayList(0);
    }

    public FolsomSecurityDomainAndKeys(String s, List list0) {
        this.a = new HashSet();
        this.b = "";
        this.c = new ArrayList(0);
        this.b = s;
        this.c = new ArrayList(list0.size());
        for(Object object0: list0) {
            this.c.add(bauc.d(((SharedKey)object0)));
        }
        this.a.add(Integer.valueOf(2));
        this.a.add(Integer.valueOf(3));
    }

    public FolsomSecurityDomainAndKeys(Set set0, String s, ArrayList arrayList0) {
        this.a = set0;
        this.b = s;
        this.c = arrayList0;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                return this.b;
            }
            case 3: {
                return this.c;
            }
            default: {
                throw new IllegalStateException("Unknown field ID: " + v);
            }
        }
    }

    @Override  // bbgi
    public final Map b() {
        return FolsomSecurityDomainAndKeys.d;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // bbgi
    protected final void f(FastJsonResponse.Field fastJsonResponse$Field0, String s, String s1) {
        int v = fastJsonResponse$Field0.g;
        if(v == 2) {
            if(s1 != null) {
                this.b = s1;
                this.a.add(Integer.valueOf(2));
                return;
            }
            v = 2;
        }
        throw new IllegalArgumentException(a.f(v, "Field with id=", " is not known to be a valid string."));
    }

    @Override  // bbgi
    public final void gH(FastJsonResponse.Field fastJsonResponse$Field0, String s, ArrayList arrayList0) {
        int v = fastJsonResponse$Field0.g;
        if(v == 3) {
            if(arrayList0 != null) {
                this.c = arrayList0;
                this.a.add(Integer.valueOf(3));
                return;
            }
            v = 3;
        }
        throw new IllegalArgumentException(a.f(v, "Field with id=", " is not a known array of string."));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Set set0 = this.a;
        int v1 = baub.a(parcel0);
        if(set0.contains(Integer.valueOf(2))) {
            baub.v(parcel0, 2, this.b, true);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.x(parcel0, 3, this.c, true);
        }
        baub.c(parcel0, v1);
    }
}


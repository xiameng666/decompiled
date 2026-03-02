package com.google.android.gms.smartdevice.d2d;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import epxe;
import gfqz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BootstrapAccount extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    public final Set a;
    public String b;
    public String c;
    public boolean d;
    public String e;
    public boolean f;
    public String g;
    public String h;
    public String i;
    private static final HashMap j;

    static {
        BootstrapAccount.CREATOR = new epxe();
        HashMap hashMap0 = new HashMap();
        BootstrapAccount.j = hashMap0;
        hashMap0.put("name", new FastJsonResponse.Field(7, false, 7, false, "name", 2, null));
        hashMap0.put("type", new FastJsonResponse.Field(7, false, 7, false, "type", 3, null));
        hashMap0.put("isManaged", new FastJsonResponse.Field(6, false, 6, false, "isManaged", 4, null));
        hashMap0.put("parentId", new FastJsonResponse.Field(7, false, 7, false, "parentId", 5, null));
        hashMap0.put("isSupervised", new FastJsonResponse.Field(6, false, 6, false, "isSupervised", 6, null));
        hashMap0.put("displayName", new FastJsonResponse.Field(7, false, 7, false, "displayName", 7, null));
        hashMap0.put("givenName", new FastJsonResponse.Field(7, false, 7, false, "givenName", 8, null));
        hashMap0.put("avatarString", new FastJsonResponse.Field(7, false, 7, false, "avatarString", 9, null));
    }

    public BootstrapAccount() {
        this.a = new HashSet();
    }

    public BootstrapAccount(String s, String s1) {
        HashSet hashSet0 = new HashSet();
        this.a = hashSet0;
        this.b = s;
        this.c = s1;
        hashSet0.add(Integer.valueOf(2));
        hashSet0.add(Integer.valueOf(3));
    }

    public BootstrapAccount(Set set0, String s, String s1, boolean z, String s2, boolean z1, String s3, String s4, String s5) {
        this.a = set0;
        this.b = s;
        this.c = s1;
        this.d = z;
        this.e = s2;
        this.f = z1;
        this.g = s3;
        this.h = s4;
        this.i = s5;
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
            case 4: {
                return Boolean.valueOf(this.d);
            }
            case 5: {
                return this.e;
            }
            case 6: {
                return Boolean.valueOf(this.f);
            }
            case 7: {
                return this.g;
            }
            case 8: {
                return this.h;
            }
            case 9: {
                return this.i;
            }
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + v);
            }
        }
    }

    @Override  // bbgi
    public final Map b() {
        return BootstrapAccount.j;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object object0) {
        if(!(object0 instanceof BootstrapAccount)) {
            return false;
        }
        String[] arr_s = this.b.replace("@googlemail.com", "@gmail.com").split("\\.", -1);
        String[] arr_s1 = ((BootstrapAccount)object0).b.replace("@googlemail.com", "@gmail.com").split("\\.", -1);
        StringBuilder stringBuilder0 = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            stringBuilder0.append(arr_s[v1]);
        }
        for(int v = 0; v < arr_s1.length; ++v) {
            stringBuilder1.append(arr_s1[v]);
        }
        return gfqz.e(stringBuilder0.toString(), stringBuilder1.toString());
    }

    @Override  // bbgi
    protected final void f(FastJsonResponse.Field fastJsonResponse$Field0, String s, String s1) {
        if(s1 == null) {
            return;
        }
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                this.b = s1;
                break;
            }
            case 3: {
                this.c = s1;
                break;
            }
            case 5: {
                this.e = s1;
                break;
            }
            case 7: {
                this.g = s1;
                break;
            }
            case 8: {
                this.h = s1;
                break;
            }
            case 9: {
                this.i = s1;
                break;
            }
            default: {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", v));
            }
        }
        this.a.add(Integer.valueOf(v));
    }

    @Override  // bbgi
    protected final void gp(FastJsonResponse.Field fastJsonResponse$Field0, String s, boolean z) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 4: {
                this.d = z;
                break;
            }
            case 6: {
                this.f = z;
                break;
            }
            default: {
                throw new IllegalArgumentException(String.format("Invalid id %s", v));
            }
        }
        this.a.add(Integer.valueOf(v));
    }

    public static BootstrapAccount p(Account account0) {
        return new BootstrapAccount(account0.name, account0.type);
    }

    public final void q(String s) {
        this.a.add(Integer.valueOf(7));
        this.g = s;
    }

    public final void r(String s) {
        this.a.add(Integer.valueOf(8));
        this.h = s;
    }

    public final void s(boolean z) {
        this.a.add(Integer.valueOf(4));
        this.d = z;
    }

    public final void t(boolean z) {
        this.a.add(Integer.valueOf(6));
        this.f = z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Set set0 = this.a;
        int v1 = baub.a(parcel0);
        if(set0.contains(Integer.valueOf(2))) {
            baub.v(parcel0, 2, this.b, true);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.v(parcel0, 3, this.c, true);
        }
        if(set0.contains(Integer.valueOf(4))) {
            baub.e(parcel0, 4, this.d);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.v(parcel0, 5, this.e, true);
        }
        if(set0.contains(Integer.valueOf(6))) {
            baub.e(parcel0, 6, this.f);
        }
        if(set0.contains(Integer.valueOf(7))) {
            baub.v(parcel0, 7, this.g, true);
        }
        if(set0.contains(Integer.valueOf(8))) {
            baub.v(parcel0, 8, this.h, true);
        }
        if(set0.contains(Integer.valueOf(9))) {
            baub.v(parcel0, 9, this.i, true);
        }
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.auth.api.credentials;

import advv;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import bata;
import batl;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gfta;
import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Deprecated
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final Uri c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    static {
        Credential.CREATOR = new advv();
    }

    public Credential(String s, String s1, Uri uri0, List list0, String s2, String s3, String s4, String s5) {
        Boolean boolean0;
        boolean z = false;
        super();
        batl.t(s, "credential identifier cannot be null");
        String s6 = s.trim();
        batl.r(s6, "credential identifier cannot be empty");
        if(s2 != null && TextUtils.isEmpty(s2)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if(s3 != null) {
            if(TextUtils.isEmpty(s3)) {
                boolean0 = Boolean.valueOf(false);
            }
            else {
                Uri uri1 = Uri.parse(s3);
                if(uri1.isAbsolute() && uri1.isHierarchical() && !TextUtils.isEmpty(uri1.getScheme()) && !TextUtils.isEmpty(uri1.getAuthority())) {
                    if("http".equalsIgnoreCase(uri1.getScheme()) || "https".equalsIgnoreCase(uri1.getScheme())) {
                        z = true;
                    }
                    boolean0 = Boolean.valueOf(z);
                }
                else {
                    boolean0 = Boolean.valueOf(false);
                }
            }
            if(!boolean0.booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if(!TextUtils.isEmpty(s3) && !TextUtils.isEmpty(s2)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if(s1 != null && TextUtils.isEmpty(s1.trim())) {
            s1 = null;
        }
        this.b = s1;
        this.c = uri0;
        this.d = list0 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list0);
        this.a = s6;
        this.e = s2;
        this.f = s3;
        this.g = s4;
        this.h = s5;
    }

    public final int a() {
        int v = gfta.c(this.b) ? 1 : 2;
        if(this.c != null) {
            ++v;
        }
        if(!gfta.c(this.g)) {
            ++v;
        }
        return gfta.c(this.h) ? v : v + 1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof Credential) ? TextUtils.equals(this.a, ((Credential)object0).a) && TextUtils.equals(this.b, ((Credential)object0).b) && bata.b(this.c, ((Credential)object0).c) && TextUtils.equals(this.e, ((Credential)object0).e) && TextUtils.equals(this.f, ((Credential)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.f});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.y(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.v(parcel0, 6, this.f, false);
        baub.v(parcel0, 9, this.g, false);
        baub.v(parcel0, 10, this.h, false);
        baub.c(parcel0, v1);
    }
}


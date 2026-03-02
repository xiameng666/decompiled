package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.DefaultOAuthCredential;
import ggna;
import goyc;
import java.util.List;

public class GetAccountInfoUser extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public boolean c;
    public String d;
    public String e;
    public ProviderUserInfoList f;
    public String g;
    public String h;
    public long i;
    public long j;
    public boolean k;
    public DefaultOAuthCredential l;
    public List m;

    static {
        GetAccountInfoUser.CREATOR = new goyc();
    }

    public GetAccountInfoUser() {
        this.f = new ProviderUserInfoList();
    }

    public GetAccountInfoUser(String s, String s1, boolean z, String s2, String s3, ProviderUserInfoList providerUserInfoList0, String s4, String s5, long v, long v1, boolean z1, DefaultOAuthCredential defaultOAuthCredential0, List list0) {
        ProviderUserInfoList providerUserInfoList1;
        this.a = s;
        this.b = s1;
        this.c = z;
        this.d = s2;
        this.e = s3;
        if(providerUserInfoList0 == null) {
            providerUserInfoList1 = new ProviderUserInfoList();
        }
        else {
            List list1 = providerUserInfoList0.a;
            ProviderUserInfoList providerUserInfoList2 = new ProviderUserInfoList();
            if(list1 != null) {
                providerUserInfoList2.a.addAll(list1);
            }
            providerUserInfoList1 = providerUserInfoList2;
        }
        this.f = providerUserInfoList1;
        this.g = s4;
        this.h = s5;
        this.i = v;
        this.j = v1;
        this.k = z1;
        this.l = defaultOAuthCredential0;
        List list2 = list0 == null ? ggna.a : list0;
        this.m = list2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.e(parcel0, 4, this.c);
        baub.v(parcel0, 5, this.d, false);
        baub.v(parcel0, 6, this.e, false);
        baub.t(parcel0, 7, this.f, v, false);
        baub.v(parcel0, 8, this.g, false);
        baub.v(parcel0, 9, this.h, false);
        baub.q(parcel0, 10, this.i);
        baub.q(parcel0, 11, this.j);
        baub.e(parcel0, 12, this.k);
        baub.t(parcel0, 13, this.l, v, false);
        baub.y(parcel0, 14, this.m, false);
        baub.c(parcel0, v1);
    }
}


package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baua;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.IconAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.instream.InstreamAdConfigurationParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.List;

public final class a implements Parcelable.Creator {
    public static final AdRequestInfoParcel a(Parcel parcel0) {
        int v = baua.h(parcel0);
        Bundle bundle0 = null;
        AdRequestParcel adRequestParcel0 = null;
        AdSizeParcel adSizeParcel0 = null;
        String s = null;
        ApplicationInfo applicationInfo0 = null;
        PackageInfo packageInfo0 = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        VersionInfoParcel versionInfoParcel0 = null;
        Bundle bundle1 = null;
        List list0 = null;
        Bundle bundle2 = null;
        String s4 = null;
        String s5 = null;
        List list1 = null;
        String s6 = null;
        NativeAdOptionsParcel nativeAdOptionsParcel0 = null;
        List list2 = null;
        String s7 = null;
        String s8 = null;
        String s9 = null;
        Bundle bundle3 = null;
        String s10 = null;
        IconAdOptionsParcel iconAdOptionsParcel0 = null;
        Bundle bundle4 = null;
        String s11 = null;
        String s12 = null;
        String s13 = null;
        List list3 = null;
        String s14 = null;
        List list4 = null;
        ArrayList arrayList0 = null;
        String s15 = null;
        InstreamAdConfigurationParcel instreamAdConfigurationParcel0 = null;
        String s16 = null;
        Bundle bundle5 = null;
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        int v3 = 0;
        int v4 = 0;
        boolean z1 = false;
        int v5 = 0;
        int v6 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int v7 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int v8 = 0;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        float f = 0.0f;
        float f1 = 0.0f;
        long v9 = 0L;
        long v10 = 0L;
        while(parcel0.dataPosition() < v) {
            int v11 = baua.e(parcel0);
            switch(((char)v11)) {
                case 1: {
                    v1 = baua.f(parcel0, v11);
                    break;
                }
                case 2: {
                    bundle0 = baua.j(parcel0, v11);
                    break;
                }
                case 3: {
                    adRequestParcel0 = (AdRequestParcel)baua.m(parcel0, v11, AdRequestParcel.CREATOR);
                    break;
                }
                case 4: {
                    adSizeParcel0 = (AdSizeParcel)baua.m(parcel0, v11, AdSizeParcel.CREATOR);
                    break;
                }
                case 5: {
                    s = baua.s(parcel0, v11);
                    break;
                }
                case 6: {
                    applicationInfo0 = (ApplicationInfo)baua.m(parcel0, v11, ApplicationInfo.CREATOR);
                    break;
                }
                case 7: {
                    packageInfo0 = (PackageInfo)baua.m(parcel0, v11, PackageInfo.CREATOR);
                    break;
                }
                case 8: {
                    s1 = baua.s(parcel0, v11);
                    break;
                }
                case 9: {
                    s2 = baua.s(parcel0, v11);
                    break;
                }
                case 10: {
                    s3 = baua.s(parcel0, v11);
                    break;
                }
                case 11: {
                    versionInfoParcel0 = (VersionInfoParcel)baua.m(parcel0, v11, VersionInfoParcel.CREATOR);
                    break;
                }
                case 12: {
                    bundle1 = baua.j(parcel0, v11);
                    break;
                }
                case 13: {
                    v2 = baua.f(parcel0, v11);
                    break;
                }
                case 14: {
                    list0 = baua.x(parcel0, v11);
                    break;
                }
                case 15: {
                    bundle2 = baua.j(parcel0, v11);
                    break;
                }
                case 16: {
                    z = baua.D(parcel0, v11);
                    break;
                }
                case 18: {
                    v3 = baua.f(parcel0, v11);
                    break;
                }
                case 19: {
                    v4 = baua.f(parcel0, v11);
                    break;
                }
                case 20: {
                    f = baua.c(parcel0, v11);
                    break;
                }
                case 21: {
                    s4 = baua.s(parcel0, v11);
                    break;
                }
                case 25: {
                    v9 = baua.i(parcel0, v11);
                    break;
                }
                case 26: {
                    s5 = baua.s(parcel0, v11);
                    break;
                }
                case 27: {
                    list1 = baua.x(parcel0, v11);
                    break;
                }
                case 28: {
                    s6 = baua.s(parcel0, v11);
                    break;
                }
                case 29: {
                    nativeAdOptionsParcel0 = (NativeAdOptionsParcel)baua.m(parcel0, v11, NativeAdOptionsParcel.CREATOR);
                    break;
                }
                case 30: {
                    list2 = baua.x(parcel0, v11);
                    break;
                }
                case 0x1F: {
                    v10 = baua.i(parcel0, v11);
                    break;
                }
                case 33: {
                    s7 = baua.s(parcel0, v11);
                    break;
                }
                case 34: {
                    f1 = baua.c(parcel0, v11);
                    break;
                }
                case 35: {
                    v5 = baua.f(parcel0, v11);
                    break;
                }
                case 36: {
                    v6 = baua.f(parcel0, v11);
                    break;
                }
                case 37: {
                    z2 = baua.D(parcel0, v11);
                    break;
                }
                case 39: {
                    s8 = baua.s(parcel0, v11);
                    break;
                }
                case 40: {
                    z1 = baua.D(parcel0, v11);
                    break;
                }
                case 41: {
                    s9 = baua.s(parcel0, v11);
                    break;
                }
                case 42: {
                    z3 = baua.D(parcel0, v11);
                    break;
                }
                case 43: {
                    v7 = baua.f(parcel0, v11);
                    break;
                }
                case 44: {
                    bundle3 = baua.j(parcel0, v11);
                    break;
                }
                case 45: {
                    s10 = baua.s(parcel0, v11);
                    break;
                }
                case 46: {
                    iconAdOptionsParcel0 = (IconAdOptionsParcel)baua.m(parcel0, v11, IconAdOptionsParcel.CREATOR);
                    break;
                }
                case 0x2F: {
                    z4 = baua.D(parcel0, v11);
                    break;
                }
                case 0x30: {
                    bundle4 = baua.j(parcel0, v11);
                    break;
                }
                case 49: {
                    s11 = baua.s(parcel0, v11);
                    break;
                }
                case 50: {
                    s12 = baua.s(parcel0, v11);
                    break;
                }
                case 51: {
                    s13 = baua.s(parcel0, v11);
                    break;
                }
                case 52: {
                    z5 = baua.D(parcel0, v11);
                    break;
                }
                case 53: {
                    list3 = baua.v(parcel0, v11);
                    break;
                }
                case 54: {
                    s14 = baua.s(parcel0, v11);
                    break;
                }
                case 55: {
                    list4 = baua.x(parcel0, v11);
                    break;
                }
                case 56: {
                    v8 = baua.f(parcel0, v11);
                    break;
                }
                case 57: {
                    z6 = baua.D(parcel0, v11);
                    break;
                }
                case 58: {
                    z7 = baua.D(parcel0, v11);
                    break;
                }
                case 59: {
                    z8 = baua.D(parcel0, v11);
                    break;
                }
                case 60: {
                    arrayList0 = baua.x(parcel0, v11);
                    break;
                }
                case 61: {
                    s15 = baua.s(parcel0, v11);
                    break;
                }
                case 0x3F: {
                    instreamAdConfigurationParcel0 = (InstreamAdConfigurationParcel)baua.m(parcel0, v11, InstreamAdConfigurationParcel.CREATOR);
                    break;
                }
                case 0x40: {
                    s16 = baua.s(parcel0, v11);
                    break;
                }
                case 65: {
                    bundle5 = baua.j(parcel0, v11);
                    break;
                }
                default: {
                    baua.C(parcel0, v11);
                }
            }
        }
        baua.A(parcel0, v);
        return new AdRequestInfoParcel(v1, bundle0, adRequestParcel0, adSizeParcel0, s, applicationInfo0, packageInfo0, s1, s2, s3, versionInfoParcel0, bundle1, v2, list0, bundle2, z, v3, v4, f, s4, v9, s5, list1, s6, nativeAdOptionsParcel0, list2, v10, s7, f1, z1, v5, v6, z2, s8, s9, z3, v7, bundle3, s10, iconAdOptionsParcel0, z4, bundle4, s11, s12, s13, z5, list3, s14, list4, v8, z6, z7, z8, arrayList0, s15, instreamAdConfigurationParcel0, s16, bundle5);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        return a.a(parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AdRequestInfoParcel[v];
    }
}


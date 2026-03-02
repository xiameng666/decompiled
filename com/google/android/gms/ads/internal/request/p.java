package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baua;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.util.cache.PoolConfiguration;
import java.util.List;

public final class p implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        boolean z1 = false;
        int v1 = 0;
        Bundle bundle0 = null;
        VersionInfoParcel versionInfoParcel0 = null;
        ApplicationInfo applicationInfo0 = null;
        String s = null;
        List list0 = null;
        PackageInfo packageInfo0 = null;
        String s1 = null;
        String s2 = null;
        PoolConfiguration poolConfiguration0 = null;
        String s3 = null;
        Bundle bundle1 = null;
        Bundle bundle2 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    bundle0 = baua.j(parcel0, v2);
                    break;
                }
                case 2: {
                    versionInfoParcel0 = (VersionInfoParcel)baua.m(parcel0, v2, VersionInfoParcel.CREATOR);
                    break;
                }
                case 3: {
                    applicationInfo0 = (ApplicationInfo)baua.m(parcel0, v2, ApplicationInfo.CREATOR);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    list0 = baua.x(parcel0, v2);
                    break;
                }
                case 6: {
                    packageInfo0 = (PackageInfo)baua.m(parcel0, v2, PackageInfo.CREATOR);
                    break;
                }
                case 7: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 9: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 10: {
                    poolConfiguration0 = (PoolConfiguration)baua.m(parcel0, v2, PoolConfiguration.CREATOR);
                    break;
                }
                case 11: {
                    s3 = baua.s(parcel0, v2);
                    break;
                }
                case 12: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 13: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 14: {
                    bundle1 = baua.j(parcel0, v2);
                    break;
                }
                case 15: {
                    bundle2 = baua.j(parcel0, v2);
                    break;
                }
                case 16: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new NonagonRequestParcel(bundle0, versionInfoParcel0, applicationInfo0, s, list0, packageInfo0, s1, s2, poolConfiguration0, s3, z, z1, bundle1, bundle2, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new NonagonRequestParcel[v];
    }
}


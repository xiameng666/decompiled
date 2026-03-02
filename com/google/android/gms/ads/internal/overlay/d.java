package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baua;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public final class d implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        boolean z = false;
        int v2 = 0;
        int v3 = 0;
        boolean z1 = false;
        AdLauncherIntentInfoParcel adLauncherIntentInfoParcel0 = null;
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        String s = null;
        String s1 = null;
        IBinder iBinder4 = null;
        String s2 = null;
        VersionInfoParcel versionInfoParcel0 = null;
        String s3 = null;
        InterstitialAdParameterParcel interstitialAdParameterParcel0 = null;
        IBinder iBinder5 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        IBinder iBinder6 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 2: {
                    adLauncherIntentInfoParcel0 = (AdLauncherIntentInfoParcel)baua.m(parcel0, v4, AdLauncherIntentInfoParcel.CREATOR);
                    break;
                }
                case 3: {
                    iBinder0 = baua.k(parcel0, v4);
                    break;
                }
                case 4: {
                    iBinder1 = baua.k(parcel0, v4);
                    break;
                }
                case 5: {
                    iBinder2 = baua.k(parcel0, v4);
                    break;
                }
                case 6: {
                    iBinder3 = baua.k(parcel0, v4);
                    break;
                }
                case 7: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 8: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                case 9: {
                    s1 = baua.s(parcel0, v4);
                    break;
                }
                case 10: {
                    iBinder4 = baua.k(parcel0, v4);
                    break;
                }
                case 11: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 12: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 13: {
                    s2 = baua.s(parcel0, v4);
                    break;
                }
                case 14: {
                    versionInfoParcel0 = (VersionInfoParcel)baua.m(parcel0, v4, VersionInfoParcel.CREATOR);
                    break;
                }
                case 16: {
                    s3 = baua.s(parcel0, v4);
                    break;
                }
                case 17: {
                    interstitialAdParameterParcel0 = (InterstitialAdParameterParcel)baua.m(parcel0, v4, InterstitialAdParameterParcel.CREATOR);
                    break;
                }
                case 18: {
                    iBinder5 = baua.k(parcel0, v4);
                    break;
                }
                case 19: {
                    s4 = baua.s(parcel0, v4);
                    break;
                }
                case 24: {
                    s5 = baua.s(parcel0, v4);
                    break;
                }
                case 25: {
                    s6 = baua.s(parcel0, v4);
                    break;
                }
                case 26: {
                    iBinder6 = baua.k(parcel0, v4);
                    break;
                }
                case 27: {
                    iBinder7 = baua.k(parcel0, v4);
                    break;
                }
                case 28: {
                    iBinder8 = baua.k(parcel0, v4);
                    break;
                }
                case 29: {
                    z1 = baua.D(parcel0, v4);
                    break;
                }
                case 30: {
                    v1 = baua.i(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new AdOverlayInfoParcel(adLauncherIntentInfoParcel0, iBinder0, iBinder1, iBinder2, iBinder3, s, z, s1, iBinder4, v2, v3, s2, versionInfoParcel0, s3, interstitialAdParameterParcel0, iBinder5, s4, s5, s6, iBinder6, iBinder7, iBinder8, z1, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AdOverlayInfoParcel[v];
    }
}


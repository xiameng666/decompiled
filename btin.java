import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.trails.TrailsInteraction;
import java.util.List;

public final class btin implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        Account account0 = null;
        String s2 = null;
        Bundle bundle0 = null;
        List list0 = null;
        Bundle bundle1 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        Bitmap bitmap0 = null;
        byte[] arr_b = null;
        String s3 = null;
        Uri uri0 = null;
        List list1 = null;
        List list2 = null;
        String s4 = null;
        ErrorReport errorReport0 = null;
        ThemeSettings themeSettings0 = null;
        PendingIntent pendingIntent0 = null;
        Boolean boolean0 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        String s8 = null;
        ND4CSettings nD4CSettings0 = null;
        String s9 = null;
        List list3 = null;
        String s10 = null;
        List list4 = null;
        String s11 = null;
        Bundle bundle4 = null;
        Bundle bundle5 = null;
        Intent intent0 = null;
        List list5 = null;
        boolean z = false;
        boolean z1 = false;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int v4 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        int v5 = 0;
        int v6 = 0;
        boolean z10 = false;
        while(parcel0.dataPosition() < v) {
            int v7 = parcel0.readInt();
            switch(((char)v7)) {
                case 2: {
                    s = baua.s(parcel0, v7);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v7);
                    break;
                }
                case 4: {
                    account0 = (Account)baua.m(parcel0, v7, Account.CREATOR);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v7);
                    break;
                }
                case 6: {
                    bundle0 = baua.j(parcel0, v7);
                    break;
                }
                case 8: {
                    z = baua.D(parcel0, v7);
                    break;
                }
                case 9: {
                    z1 = baua.D(parcel0, v7);
                    break;
                }
                case 11: {
                    list0 = baua.x(parcel0, v7);
                    break;
                }
                case 15: {
                    bundle3 = baua.j(parcel0, v7);
                    break;
                }
                case 16: {
                    bitmap0 = (Bitmap)baua.m(parcel0, v7, Bitmap.CREATOR);
                    break;
                }
                case 19: {
                    s3 = baua.s(parcel0, v7);
                    break;
                }
                case 22: {
                    uri0 = (Uri)baua.m(parcel0, v7, Uri.CREATOR);
                    break;
                }
                case 23: {
                    list1 = baua.y(parcel0, v7, OverflowMenuItem.CREATOR);
                    break;
                }
                case 25: {
                    list2 = baua.y(parcel0, v7, OfflineSuggestion.CREATOR);
                    break;
                }
                case 0x1F: {
                    s4 = baua.s(parcel0, v7);
                    break;
                }
                case 0x20: {
                    arr_b = baua.E(parcel0, v7);
                    break;
                }
                case 33: {
                    v2 = baua.f(parcel0, v7);
                    break;
                }
                case 34: {
                    v3 = baua.f(parcel0, v7);
                    break;
                }
                case 35: {
                    bundle1 = baua.j(parcel0, v7);
                    break;
                }
                case 36: {
                    v1 = baua.f(parcel0, v7);
                    break;
                }
                case 38: {
                    z2 = baua.D(parcel0, v7);
                    break;
                }
                case 39: {
                    errorReport0 = (ErrorReport)baua.m(parcel0, v7, ErrorReport.CREATOR);
                    break;
                }
                case 41: {
                    themeSettings0 = (ThemeSettings)baua.m(parcel0, v7, ThemeSettings.CREATOR);
                    break;
                }
                case 42: {
                    z3 = baua.D(parcel0, v7);
                    break;
                }
                case 50: {
                    bundle2 = baua.j(parcel0, v7);
                    break;
                }
                case 52: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v7, PendingIntent.CREATOR);
                    break;
                }
                case 53: {
                    boolean0 = baua.n(parcel0, v7);
                    break;
                }
                case 56: {
                    v4 = baua.f(parcel0, v7);
                    break;
                }
                case 57: {
                    z4 = baua.D(parcel0, v7);
                    break;
                }
                case 58: {
                    z5 = baua.D(parcel0, v7);
                    break;
                }
                case 59: {
                    z6 = baua.D(parcel0, v7);
                    break;
                }
                case 60: {
                    z7 = baua.D(parcel0, v7);
                    break;
                }
                case 61: {
                    s5 = baua.s(parcel0, v7);
                    break;
                }
                case 62: {
                    s6 = baua.s(parcel0, v7);
                    break;
                }
                case 0x3F: {
                    s7 = baua.s(parcel0, v7);
                    break;
                }
                case 0x40: {
                    s8 = baua.s(parcel0, v7);
                    break;
                }
                case 65: {
                    z8 = baua.D(parcel0, v7);
                    break;
                }
                case 66: {
                    nD4CSettings0 = (ND4CSettings)baua.m(parcel0, v7, ND4CSettings.CREATOR);
                    break;
                }
                case 67: {
                    s9 = baua.s(parcel0, v7);
                    break;
                }
                case 68: {
                    list3 = baua.y(parcel0, v7, FRDProductSpecificDataEntry.CREATOR);
                    break;
                }
                case 69: {
                    z9 = baua.D(parcel0, v7);
                    break;
                }
                case 70: {
                    s10 = baua.s(parcel0, v7);
                    break;
                }
                case 71: {
                    v5 = baua.f(parcel0, v7);
                    break;
                }
                case 72: {
                    v6 = baua.f(parcel0, v7);
                    break;
                }
                case 73: {
                    list4 = baua.y(parcel0, v7, TrailsInteraction.CREATOR);
                    break;
                }
                case 74: {
                    z10 = baua.D(parcel0, v7);
                    break;
                }
                case 75: {
                    s11 = baua.s(parcel0, v7);
                    break;
                }
                case 76: {
                    bundle4 = baua.j(parcel0, v7);
                    break;
                }
                case 77: {
                    bundle5 = baua.j(parcel0, v7);
                    break;
                }
                case 78: {
                    intent0 = (Intent)baua.m(parcel0, v7, Intent.CREATOR);
                    break;
                }
                case 0x4F: {
                    list5 = baua.x(parcel0, v7);
                    break;
                }
                default: {
                    baua.C(parcel0, v7);
                }
            }
        }
        baua.A(parcel0, v);
        return new HelpConfig(s, s1, account0, s2, bundle0, z, z1, list0, bundle1, bundle2, v1, bundle3, bitmap0, arr_b, v2, v3, s3, uri0, list1, list2, z2, z3, s4, errorReport0, themeSettings0, pendingIntent0, boolean0, v4, z4, z5, z6, z7, s5, s6, s7, s8, z8, nD4CSettings0, s9, list3, z9, s10, v5, v6, list4, z10, s11, bundle4, bundle5, intent0, list5);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new HelpConfig[v];
    }
}


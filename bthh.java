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
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.googlehelp.trails.TrailsInteraction;
import java.util.List;

public final class bthh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Account account0 = null;
        Bundle bundle0 = null;
        String s1 = null;
        String s2 = null;
        Bitmap bitmap0 = null;
        List list0 = null;
        Bundle bundle1 = null;
        Bitmap bitmap1 = null;
        byte[] arr_b = null;
        String s3 = null;
        Uri uri0 = null;
        List list1 = null;
        ThemeSettings themeSettings0 = null;
        List list2 = null;
        ErrorReport errorReport0 = null;
        TogglingData togglingData0 = null;
        PendingIntent pendingIntent0 = null;
        String s4 = null;
        String s5 = null;
        ND4CSettings nD4CSettings0 = null;
        List list3 = null;
        String s6 = null;
        List list4 = null;
        String s7 = null;
        Intent intent0 = null;
        List list5 = null;
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        boolean z2 = false;
        int v5 = 0;
        int v6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int v7 = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int v8 = 0;
        int v9 = 0;
        while(parcel0.dataPosition() < v) {
            int v10 = parcel0.readInt();
            switch(((char)v10)) {
                case 1: {
                    v1 = baua.f(parcel0, v10);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v10);
                    break;
                }
                case 3: {
                    account0 = (Account)baua.m(parcel0, v10, Account.CREATOR);
                    break;
                }
                case 4: {
                    bundle0 = baua.j(parcel0, v10);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v10);
                    break;
                }
                case 6: {
                    z1 = baua.D(parcel0, v10);
                    break;
                }
                case 7: {
                    list0 = baua.x(parcel0, v10);
                    break;
                }
                case 10: {
                    bundle1 = baua.j(parcel0, v10);
                    break;
                }
                case 11: {
                    bitmap1 = (Bitmap)baua.m(parcel0, v10, Bitmap.CREATOR);
                    break;
                }
                case 14: {
                    s3 = baua.s(parcel0, v10);
                    break;
                }
                case 15: {
                    uri0 = (Uri)baua.m(parcel0, v10, Uri.CREATOR);
                    break;
                }
                case 16: {
                    list1 = baua.y(parcel0, v10, OverflowMenuItem.CREATOR);
                    break;
                }
                case 17: {
                    v4 = baua.f(parcel0, v10);
                    break;
                }
                case 18: {
                    list2 = baua.y(parcel0, v10, OfflineSuggestion.CREATOR);
                    break;
                }
                case 19: {
                    arr_b = baua.E(parcel0, v10);
                    break;
                }
                case 20: {
                    v2 = baua.f(parcel0, v10);
                    break;
                }
                case 21: {
                    v3 = baua.f(parcel0, v10);
                    break;
                }
                case 22: {
                    z2 = baua.D(parcel0, v10);
                    break;
                }
                case 23: {
                    errorReport0 = (ErrorReport)baua.m(parcel0, v10, ErrorReport.CREATOR);
                    break;
                }
                case 25: {
                    themeSettings0 = (ThemeSettings)baua.m(parcel0, v10, ThemeSettings.CREATOR);
                    break;
                }
                case 28: {
                    s1 = baua.s(parcel0, v10);
                    break;
                }
                case 0x1F: {
                    togglingData0 = (TogglingData)baua.m(parcel0, v10, TogglingData.CREATOR);
                    break;
                }
                case 0x20: {
                    v5 = baua.f(parcel0, v10);
                    break;
                }
                case 33: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v10, PendingIntent.CREATOR);
                    break;
                }
                case 34: {
                    s2 = baua.s(parcel0, v10);
                    break;
                }
                case 35: {
                    bitmap0 = (Bitmap)baua.m(parcel0, v10, Bitmap.CREATOR);
                    break;
                }
                case 36: {
                    v6 = baua.f(parcel0, v10);
                    break;
                }
                case 37: {
                    z3 = baua.D(parcel0, v10);
                    break;
                }
                case 38: {
                    z4 = baua.D(parcel0, v10);
                    break;
                }
                case 39: {
                    v7 = baua.f(parcel0, v10);
                    break;
                }
                case 40: {
                    s4 = baua.s(parcel0, v10);
                    break;
                }
                case 41: {
                    z5 = baua.D(parcel0, v10);
                    break;
                }
                case 42: {
                    s5 = baua.s(parcel0, v10);
                    break;
                }
                case 43: {
                    z6 = baua.D(parcel0, v10);
                    break;
                }
                case 44: {
                    nD4CSettings0 = (ND4CSettings)baua.m(parcel0, v10, ND4CSettings.CREATOR);
                    break;
                }
                case 45: {
                    z7 = baua.D(parcel0, v10);
                    break;
                }
                case 46: {
                    list3 = baua.y(parcel0, v10, FRDProductSpecificDataEntry.CREATOR);
                    break;
                }
                case 0x2F: {
                    s6 = baua.s(parcel0, v10);
                    break;
                }
                case 0x30: {
                    v8 = baua.f(parcel0, v10);
                    break;
                }
                case 49: {
                    v9 = baua.f(parcel0, v10);
                    break;
                }
                case 50: {
                    list4 = baua.y(parcel0, v10, TrailsInteraction.CREATOR);
                    break;
                }
                case 51: {
                    s7 = baua.s(parcel0, v10);
                    break;
                }
                case 52: {
                    intent0 = (Intent)baua.m(parcel0, v10, Intent.CREATOR);
                    break;
                }
                case 53: {
                    list5 = baua.x(parcel0, v10);
                    break;
                }
                default: {
                    baua.C(parcel0, v10);
                }
            }
        }
        baua.A(parcel0, v);
        return new GoogleHelp(v1, s, account0, bundle0, s1, s2, bitmap0, z, z1, list0, bundle1, bitmap1, arr_b, v2, v3, s3, uri0, list1, v4, themeSettings0, list2, z2, errorReport0, togglingData0, v5, pendingIntent0, v6, z3, z4, v7, s4, z5, s5, z6, nD4CSettings0, z7, list3, s6, v8, v9, list4, s7, intent0, list5);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GoogleHelp[v];
    }
}


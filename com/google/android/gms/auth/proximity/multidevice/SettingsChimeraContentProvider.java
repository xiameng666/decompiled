package com.google.android.gms.auth.proximity.multidevice;

import alfb;
import alfr;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import batl;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.util.List;

public class SettingsChimeraContentProvider extends ContentProvider {
    public static String a(Context context0, String s) {
        batl.j();
        SyncedCryptauthDevice syncedCryptauthDevice0 = alfr.b(context0, s);
        return syncedCryptauthDevice0 == null ? Build.MODEL : syncedCryptauthDevice0.c;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Bundle call(String s, String s1, Bundle bundle0) {
        Uri uri0 = Uri.parse(s1);
        if(uri0 == null) {
            return null;
        }
        if("content".equals(uri0.getScheme()) && "com.google.android.gms.auth.proximity.multidevice.settings.provider".equals(uri0.getAuthority()) && uri0.getPort() == -1) {
            List list0 = uri0.getPathSegments();
            if(list0 != null && list0.size() == 2) {
                if(!s.equals(list0.get(0))) {
                    return null;
                }
                String s2 = (String)list0.get(1);
                if("getText".equals(s)) {
                    Bundle bundle1 = new Bundle();
                    if("summary".equals(s2)) {
                        bundle1.putString("com.android.settings.summary", (alfb.a(this.getContext()) ? "Linked to Chromebook" : this.getContext().getString(0x7F152A58, new Object[]{"phone"})));  // string:settings_summary_disabled "Your %s is not linked to a Chromebook"
                    }
                    return bundle1.isEmpty() ? null : bundle1;
                }
            }
        }
        return null;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri0, String s, String[] arr_s) {
        return 0;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri0) {
        return null;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri0, ContentValues contentValues0) {
        return null;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        return null;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        return 0;
    }
}


package com.google.android.gms.thunderbird.settings;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import bbdg;
import ccmq;
import com.google.android.chimera.ContentProvider;
import ewsi;

public class ThunderbirdSettingsChimeraContentProvider extends ContentProvider {
    private ewsi a;

    @Override  // com.google.android.chimera.ContentProvider
    public final Bundle call(String s, String s1, Bundle bundle0) {
        if("getSummary".equals(s)) {
            Bundle bundle1 = new Bundle();
            bundle1.putCharSequence("com.android.settings.summary", (this.a.l() ? "On" : "Off"));
            return bundle1;
        }
        return null;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri0, String s, String[] arr_s) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri0, ContentValues contentValues0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        ccmq.a().a(bbdg.tl);
        this.a = ewsi.b(this.getContext());
        return true;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        throw new UnsupportedOperationException();
    }
}


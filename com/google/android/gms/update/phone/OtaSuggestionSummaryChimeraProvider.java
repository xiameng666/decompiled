package com.google.android.gms.update.phone;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import avyq;
import baun;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.update.SystemUpdateStatus;
import evrg;
import ezuu;
import ezvm;
import ezwx;
import fabk;
import hwbv;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class OtaSuggestionSummaryChimeraProvider extends ContentProvider {
    private static final baun a;

    static {
        OtaSuggestionSummaryChimeraProvider.a = fabk.h("OtaSuggestionSummaryChimeraProvider");
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Bundle call(String s, String s1, Bundle bundle0) {
        int v3;
        SystemUpdateStatus systemUpdateStatus0;
        OtaSuggestionSummaryChimeraProvider.a.h("OtaSuggestionSummaryChimeraProvider is called!", new Object[0]);
        Bundle bundle1 = new Bundle();
        Context context0 = this.getContext();
        ezvm ezvm0 = ezuu.a(context0);
        try {
            systemUpdateStatus0 = (SystemUpdateStatus)evrg.n(ezvm0.g());
        }
        catch(ExecutionException | InterruptedException exception0) {
            OtaSuggestionSummaryChimeraProvider.a.g("Unable to get SystemUpdateStatus", exception0, new Object[0]);
            return bundle1;
        }
        long v = System.currentTimeMillis() - systemUpdateStatus0.n;
        int v1 = (int)Math.max(TimeUnit.MILLISECONDS.toDays(v), 1L);
        int v2 = ezwx.a(hwbv.a.b().a(), v);
        if("getSummary".equals(s)) {
            switch(v2) {
                case 2: {
                    v3 = 0x7F080C3E;  // drawable:quantum_gm_ic_system_update_orange_24
                    break;
                }
                case 3: {
                    v3 = 0x7F080C3F;  // drawable:quantum_gm_ic_system_update_red_24
                    break;
                }
                default: {
                    v3 = 0x7F080C3D;  // drawable:quantum_gm_ic_system_update_blue_24
                }
            }
            Icon icon0 = Icon.createWithResource(context0, avyq.a(context0, v3));
            bundle1.putString("com.android.settings.title", (v2 == 0 ? context0.getText(0x7F153071).toString() : context0.getText(0x7F15306F).toString()));  // string:system_update_overdue_suggestion_title_text "Get the best of Android"
            bundle1.putString("com.android.settings.summary", (v2 == 0 ? context0.getText(0x7F1530A1).toString() : TextUtils.expandTemplate(context0.getText(0x7F153073), new CharSequence[]{context0.getResources().getQuantityString(0x7F130036, v1, new Object[]{v1})}).toString()));  // string:system_update_update_available_title_text "System update available"
            bundle1.putParcelable("com.android.settings.icon", icon0);
        }
        return bundle1;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri0, String s, String[] arr_s) {
        throw new UnsupportedOperationException("delete operation not supported currently.");
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri0) {
        throw new UnsupportedOperationException("getType operation not supported currently.");
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri0, ContentValues contentValues0) {
        throw new UnsupportedOperationException("insert operation not supported currently.");
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        throw new UnsupportedOperationException("query operation not supported currently.");
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        throw new UnsupportedOperationException("update operation not supported currently.");
    }
}


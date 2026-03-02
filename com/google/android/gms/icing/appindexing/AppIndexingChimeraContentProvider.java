package com.google.android.gms.icing.appindexing;

import abxh;
import abxi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import bwmx;
import bwne;
import bwqt;
import bwsa;
import bwsv;
import bwtd;
import bwwn;
import bxav;
import bxgh;
import com.google.android.gms.icing.appindexing.service.OneoffRebuildIndexChimeraService;
import glrw;
import huau;
import hubn;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public class AppIndexingChimeraContentProvider extends bwwn {
    private bxav a;

    final bwmx a() {
        bxav bxav0 = this.a;
        if(bxav0 == null) {
            Context context0 = this.getContext().getApplicationContext();
            if(context0 != null && hubn.i()) {
                this.a = bxav.c(context0);
            }
            return this.a == null ? null : this.a.a();
        }
        return bxav0.a();
    }

    @Override  // bwwn
    public final String b(Uri uri0) {
        bwsa bwsa0 = bwsv.a(this.getContext(), uri0);
        return bwsa0 == null ? null : "vnd.android.cursor.dir/vnd." + bwsa0.a.b;
    }

    @Override  // bwwn
    public final Cursor c(Uri uri0, String[] arr_s) {
        Cursor cursor0;
        int v;
        bwsa bwsa0 = bwsv.a(this.getContext(), uri0);
        String s = null;
        if(bwsa0 == null) {
            return null;
        }
        abxh abxh0 = abxh.d(arr_s);
        bwne.r("AppIndexing: Queried by ContentFetcher uri=%s query=%s", uri0, abxh0);
        String s1 = bwsa0.b;
        bwqt bwqt0 = bwqt.c(this.getContext().getApplicationContext(), s1);
        if(bwqt0 == null) {
            bwne.b("3P AppIndexing disabled for uri %s", uri0);
            return null;
        }
        if(abxh0.c()) {
            bwne.b("Request to rebuild index for uri %s", uri0);
            try {
                PackageInfo packageInfo0 = this.getContext().getPackageManager().getPackageInfo(s1, 0);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                bwne.b("Package %s is not present.", s1);
                return null;
            }
            if(TimeUnit.HOURS.convert(System.currentTimeMillis() - packageInfo0.lastUpdateTime, TimeUnit.MILLISECONDS) > 24L) {
                if(huau.a.c().i()) {
                    OneoffRebuildIndexChimeraService.e(this.getContext(), s1, glrw.f);
                }
                else {
                    bwne.a("UPDATE_INDEX intent sending from content provider disabled.");
                }
            }
        }
        if(abxh0.a()) {
            v = 1;
            goto label_27;
        }
        if(abxh0.b()) {
            v = 2;
        label_27:
            SQLiteDatabase sQLiteDatabase0 = bwqt0.getReadableDatabase();
            String s2 = bwtd.c(bwsa0.e());
            StringBuilder stringBuilder0 = new StringBuilder("seqno>");
            stringBuilder0.append(abxh0.a);
            stringBuilder0.append(" AND ");
            stringBuilder0.append("tag" + (v == 1 ? " IS NULL" : " IS NOT NULL"));
            cursor0 = sQLiteDatabase0.query(s2, null, stringBuilder0.toString(), null, null, null, "seqno", Long.toString(abxh0.b));
            try(Cursor cursor1 = sQLiteDatabase0.query("incarnation_indexapi", new String[]{"incarnation"}, "app_name = ?", new String[]{bwsa0.b}, null, null, null)) {
                if(cursor1.moveToNext()) {
                    s = cursor1.getString(cursor1.getColumnIndex("incarnation"));
                }
            }
            if(s != null) {
                cursor0 = abxi.a(cursor0, s);
            }
            bwne.r("Returning document cursor with %d rows. Incarnation %s.", Integer.valueOf(cursor0.getCount()), abxi.b(cursor0));
            return cursor0;
        }
        bwne.t("Invalid query: %s", abxh0);
        return null;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        if(this.getContext() != null && this.a() != null) {
            bxgh.a(this.getContext(), printWriter0, arr_s, this.a());
        }
    }
}


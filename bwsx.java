import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;
import java.util.ArrayList;
import java.util.List;
import jeb.synthetic.TWR;

public final class bwsx {
    public final bwsw a;
    private static bwsx b;
    private bakc c;
    private final Context d;

    public bwsx(Context context0) {
        this.a = new bwsw(context0);
        this.c = null;
        this.d = context0;
    }

    public static bwsx a(Context context0) {
        synchronized(bwsx.class) {
            if(bwsx.b == null) {
                bwsx.b = new bwsx(context0.getApplicationContext());
            }
        }
        return bwsx.b;
    }

    public final List b(String s, String s1, Parcelable.Creator parcelable$Creator0) {
        byte[] arr_b;
        List list0 = new ArrayList();
        Cursor cursor0 = this.a.getReadableDatabase().rawQuery(a.a(s1, "SELECT [data] FROM [", "] WHERE [package]=? ORDER BY [id] DESC"), new String[]{s});
        try {
            int v = cursor0.getColumnIndex("data");
            int v1 = 0;
            while(true) {
            label_4:
                if(!cursor0.moveToNext()) {
                    goto label_14;
                }
                arr_b = cursor0.getBlob(v);
                v1 += arr_b.length;
                break;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        if(v1 <= 0x80000) {
            try {
                list0.add(((AbstractSafeParcelable)bauc.a(arr_b, parcelable$Creator0)));
            }
            catch(Throwable unused_ex) {
            }
            goto label_4;
        }
    label_14:
        cursor0.close();
        return list0;
    }

    public final void c(String s, glrq glrq0, glrs glrs0, String s1, Thing thing0, ActionImpl actionImpl0) {
        if(!this.h()) {
            return;
        }
        AppIndexingErrorInfo appIndexingErrorInfo0 = new AppIndexingErrorInfo();
        appIndexingErrorInfo0.a = s;
        appIndexingErrorInfo0.b = glrq0.a();
        appIndexingErrorInfo0.c = glrs0.a();
        appIndexingErrorInfo0.d = s1;
        appIndexingErrorInfo0.e = System.currentTimeMillis();
        appIndexingErrorInfo0.f = thing0;
        appIndexingErrorInfo0.g = actionImpl0;
        this.k(bauc.n(appIndexingErrorInfo0), s, "errors");
    }

    public final void d(String s, ActionImpl actionImpl0) {
        if(!this.i()) {
            return;
        }
        AppIndexingUserActionInfo appIndexingUserActionInfo0 = new AppIndexingUserActionInfo();
        appIndexingUserActionInfo0.a = s;
        appIndexingUserActionInfo0.b = System.currentTimeMillis();
        appIndexingUserActionInfo0.c = actionImpl0;
        this.k(bauc.n(appIndexingUserActionInfo0), s, "user_actions");
    }

    public final void e(String s) {
        if(hubn.a.b().f()) {
            this.l(s, "errors");
        }
        this.l(s, "user_actions");
    }

    public final void f(String s, int v) {
        this.a.getWritableDatabase().delete(s, a.f(v, "[timestamp]<=(strftime(\'%s\',\'now\') - ", ")"), null);
    }

    public final void g(boolean z) {
        synchronized(this) {
            if(hubn.d()) {
                bakc bakc0 = this.j();
                if(bakc0 != null) {
                    SharedPreferences.Editor sharedPreferences$Editor0 = bakc0.edit();
                    sharedPreferences$Editor0.putBoolean("LoggingEnabled", z);
                    sharedPreferences$Editor0.apply();
                }
            }
        }
    }

    public final boolean h() {
        return hubn.d() && this.m();
    }

    public final boolean i() {
        return hubn.e() && this.m();
    }

    private final bakc j() {
        if(this.c == null) {
            try {
                this.c = new bakc(this.d, "3pErrorCachePreferences", true);
                return this.c;
            }
            catch(Exception exception0) {
                bwne.j(exception0, "Something went wrong in the initialization of SharedPreferences", new Object[0]);
            }
        }
        return this.c;
    }

    private final void k(byte[] arr_b, String s, String s1) {
        SQLiteDatabase sQLiteDatabase0 = this.a.getWritableDatabase();
        sQLiteDatabase0.beginTransaction();
        try {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("package", s);
            contentValues0.put("data", arr_b);
            sQLiteDatabase0.insertOrThrow(s1, null, contentValues0);
            sQLiteDatabase0.delete(s1, a.a(s1, "[package]=? AND [id] NOT IN ( SELECT [id] FROM [", "] WHERE [package]=? ORDER BY [id] DESC LIMIT 100)"), new String[]{s, s});
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    private final void l(String s, String s1) {
        this.a.getWritableDatabase().delete(s1, "[package]=?", new String[]{s});
    }

    private final boolean m() {
        boolean z;
        synchronized(this) {
            bakc bakc0 = this.j();
            if(bakc0 == null) {
                return false;
            }
            z = bakc0.getBoolean("LoggingEnabled", false);
        }
        return z;
    }
}


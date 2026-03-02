import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.database.sqlite.SQLiteDatabase;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import java.io.IOException;
import java.security.UnrecoverableKeyException;

public final class atir {
    private static final baun a;

    static {
        atir.a = aqql.a("LocalCryptoBackupStateClearer");
    }

    public static void a(Context context0, boolean z) {
        atir.a.d("Clearing local crypto state.", new Object[0]);
        try {
            aqly aqly0 = aqlq.a(context0);
            try(SQLiteDatabase sQLiteDatabase0 = aqly0.d()) {
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS tertiary_keys");
                aqly0.onCreate(sQLiteDatabase0);
            }
        }
        catch(aqlz aqlz0) {
            atir.a.g("Error clearing encryption database", aqlz0, new Object[0]);
        }
        aqle aqle0 = aqle.a(context0);
        if(atir.b(context0, aqle0, z)) {
            SharedPreferences.Editor sharedPreferences$Editor0 = aqle0.c.edit();
            ggqj ggqj0 = aqle.b.om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                sharedPreferences$Editor0.remove(((String)object0));
            }
            sharedPreferences$Editor0.apply();
            aqle.a.d("Cleared crypto settings for backup", new Object[0]);
        }
        try {
            atgh.a(context0).d();
        }
        catch(IOException iOException0) {
            atir.a.g("Error clearing chunk listing store", iOException0, new Object[0]);
        }
        try {
            atgh.b(context0).d();
        }
        catch(IOException iOException1) {
            atir.a.g("Error clearing key-value store", iOException1, new Object[0]);
        }
    }

    private static boolean b(Context context0, aqle aqle0, boolean z) {
        if(z) {
            return true;
        }
        gfsx gfsx0 = aqle0.b();
        if(!gfsx0.i()) {
            return true;
        }
        aqlm aqlm0 = aqlm.b(context0);
        try {
            gfsx gfsx1 = aqlm0.c(((String)gfsx0.d()));
            if(gfsx1.i() && ((aqlk)gfsx1.d()).a(context0) == 2) {
                return false;
            }
        }
        catch(InternalRecoveryServiceException | UnrecoverableKeyException exception0) {
            atir.a.n("Problem with current key", exception0, new Object[0]);
        }
        return true;
    }
}


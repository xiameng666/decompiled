import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import com.google.android.chimera.ContentProvider;

public abstract class bwwn extends ContentProvider {
    public abstract String b(Uri arg1);

    public abstract Cursor c(Uri arg1, String[] arg2);

    public static void d(Context context0) {
        int v = Binder.getCallingUid();
        if(v == Process.myUid()) {
            return;
        }
        if(context0 != null) {
            try {
                if(context0.getPackageManager().getApplicationInfo("com.google.android.gms", 0).uid != v) {
                    throw new SecurityException(a.f(v, "Calling UID ", " is not Google Play Services."));
                }
                return;
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                throw new SecurityException("Google Play Services not installed", packageManager$NameNotFoundException0);
            }
        }
        throw new SecurityException("Context is null!");
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri0, String s, String[] arr_s) {
        throw new UnsupportedOperationException("delete not supported.");
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri0) {
        bwwn.d(this.getContext());
        return this.b(uri0);
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri0, ContentValues contentValues0) {
        throw new UnsupportedOperationException("insert not supported.");
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        bwwn.d(this.getContext());
        return this.c(uri0, arr_s1);
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        throw new UnsupportedOperationException("update not supported.");
    }
}


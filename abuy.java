import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;

public final class abuy extends ContentProvider {
    public static void a(Context context0) {
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

    @Override  // android.content.ContentProvider
    public final int delete(Uri uri0, String s, String[] arr_s) {
        throw null;
    }

    @Override  // android.content.ContentProvider
    public final String getType(Uri uri0) {
        throw null;
    }

    @Override  // android.content.ContentProvider
    public final Uri insert(Uri uri0, ContentValues contentValues0) {
        throw null;
    }

    @Override  // android.content.ContentProvider
    public final boolean onCreate() {
        throw null;
    }

    @Override  // android.content.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        throw null;
    }

    @Override  // android.content.ContentProvider
    public final int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        throw null;
    }
}


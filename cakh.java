import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

public final class cakh {
    private final ContentResolver a;
    private final cakj b;
    private final cakg c;

    static {
        bboh.b("GmscoreIpa", bbcu.ee);
    }

    public cakh(ContentResolver contentResolver0, cakg cakg0) {
        this.a = contentResolver0;
        this.c = cakg0;
        this.b = cakj.a();
    }

    public final Cursor a(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        Uri uri1;
        String s3;
        String[] arr_s3;
        String s2;
        String[] arr_s2;
        CancellationSignal cancellationSignal0;
        try {
            ContentResolver contentResolver0 = this.a;
            cakg cakg0 = this.c;
            if(cakg0 == null) {
                cancellationSignal0 = null;
                uri1 = uri0;
                arr_s2 = arr_s;
                s2 = s;
                arr_s3 = arr_s1;
                s3 = s1;
            }
            else {
                cancellationSignal0 = cakg0.a();
                arr_s2 = arr_s;
                s2 = s;
                arr_s3 = arr_s1;
                s3 = s1;
                uri1 = uri0;
            }
            return contentResolver0.query(uri1, arr_s2, s2, arr_s3, s3, cancellationSignal0);
        }
        catch(SecurityException unused_ex) {
            this.b.c(1);
            return null;
        }
        catch(SQLiteException unused_ex) {
            this.b.c(2);
            return null;
        }
        catch(NullPointerException unused_ex) {
            this.b.c(3);
            return null;
        }
        catch(NoClassDefFoundError unused_ex) {
            this.b.c(4);
            return null;
        }
        catch(OperationCanceledException unused_ex) {
            this.b.c(5);
            return null;
        }
    }
}


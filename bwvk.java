import android.content.ContentProviderClient;
import android.database.Cursor;

public final class bwvk {
    final ContentProviderClient a;
    final Cursor b;

    public bwvk(ContentProviderClient contentProviderClient0, Cursor cursor0) {
        this.a = contentProviderClient0;
        this.b = cursor0;
    }

    public final int a(String s) {
        try {
            return this.b.getColumnIndex(s);
        }
        catch(Throwable throwable0) {
            throw new bwvj(throwable0);
        }
    }

    public final long b(int v) {
        try {
            return this.b.getLong(v);
        }
        catch(Throwable throwable0) {
            throw new bwvj(throwable0);
        }
    }
}


import android.content.ContentValues;
import android.database.Cursor;

public interface fhdk extends AutoCloseable {
    Cursor a(String arg1, String[] arg2, String arg3, String[] arg4, String arg5, String arg6, String arg7, String arg8);

    Long c();

    void d(String arg1, ContentValues arg2, int arg3);
}


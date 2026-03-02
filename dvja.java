import android.database.Cursor;
import j..util.Objects;
import java.util.AbstractMap.SimpleImmutableEntry;

public final class dvja implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        String s = ((Cursor)object0).getString(((Cursor)object0).getColumnIndexOrThrow("valuable_id"));
        if(gfta.c(s)) {
            ((ggtj)dvjf.a.i()).x("Row found with no valuable ID.");
            return gfqx.a;
        }
        int v = ((Cursor)object0).getColumnIndex("valuable_hash");
        if(v == -1) {
            return gfsx.m(new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(s), Objects.requireNonNull(Long.valueOf(0L))));
        }
        long v1 = ((Cursor)object0).getLong(v);
        return gfsx.m(new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(s), Objects.requireNonNull(Long.valueOf(v1))));
    }
}


import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.ContentValues;
import java.util.List;

public final class ehhj implements ehhk {
    public final boolean a;
    public final List b;
    public final ehac c;

    public ehhj(ehac ehac0, boolean z, List list0) {
        this.c = ehac0;
        this.a = z;
        this.b = list0;
    }

    @Override  // ehhk
    public final void a(ContentValues contentValues0, ContentValues contentValues1) {
        if(!ehhl.l(contentValues0)) {
            long v = ehhl.a(contentValues1);
            long v1 = (long)contentValues1.getAsLong("data_id");
            ContentProviderOperation.Builder contentProviderOperation$Builder0 = ContentProviderOperation.newUpdate(ContentUris.withAppendedId(this.c.a, v1)).withValue("data_sync4", Long.valueOf(v + 10L)).withValue("data_version", Long.valueOf(v));
            this.c.b.a(contentProviderOperation$Builder0, false);
        }
        if(this.a) {
            this.b.add(contentValues0);
        }
    }
}


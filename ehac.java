import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.SyncStats;
import android.net.Uri;
import android.util.Base64;
import java.util.Objects;

public class ehac {
    public final Uri a;
    public final ehbo b;
    private final ehim c;

    public ehac(Uri uri0, ehbo ehbo0, ehim ehim0) {
        this.a = uri0;
        this.b = ehbo0;
        this.c = ehim0;
    }

    public final int a(Uri uri0, ContentValues contentValues0, boolean z) {
        return this.b(uri0, contentValues0, null, null, z);
    }

    public final int b(Uri uri0, ContentValues contentValues0, Long long0, Integer integer0, boolean z) {
        ContentProviderOperation.Builder contentProviderOperation$Builder0 = ContentProviderOperation.newInsert(uri0).withValues(contentValues0);
        if(long0 != null) {
            contentProviderOperation$Builder0.withValue("raw_contact_id", long0);
        }
        if(integer0 != null) {
            contentProviderOperation$Builder0.withValueBackReference("raw_contact_id", integer0.intValue());
        }
        ehbo ehbo0 = this.b;
        int v = ehbo0.a(contentProviderOperation$Builder0, z);
        if(integer0 != null) {
            ehbo0.i(Integer.valueOf(v), contentValues0, integer0);
        }
        SyncStats syncStats0 = ((ehiv)this.c).a.stats;
        ++syncStats0.numInserts;
        return v;
    }

    public final void c(Uri uri0, Long long0, boolean z) {
        this.b.a(ContentProviderOperation.newDelete(ContentUris.withAppendedId(uri0, long0.longValue())), z);
        ++((ehiv)this.c).a.stats.numDeletes;
    }

    public final void d(Long long0, boolean z) {
        this.c(this.a, long0, z);
    }

    public final void e(Uri uri0, Long long0, ContentValues contentValues0, boolean z) {
        this.f(uri0, long0, contentValues0, z, true);
    }

    public final void f(Uri uri0, Long long0, ContentValues contentValues0, boolean z, boolean z1) {
        ContentProviderOperation.Builder contentProviderOperation$Builder0 = ContentProviderOperation.newUpdate(uri0).withValues(contentValues0);
        if(long0 != null) {
            Objects.toString(long0);
            contentProviderOperation$Builder0.withSelection("_id=" + long0.toString(), null);
        }
        this.b.a(contentProviderOperation$Builder0, z);
        if(z1) {
            SyncStats syncStats0 = ((ehiv)this.c).a.stats;
            ++syncStats0.numUpdates;
        }
    }

    public final void g(Uri uri0, String s) {
        ContentProviderOperation.Builder contentProviderOperation$Builder0 = ContentProviderOperation.newAssertQuery(uri0).withSelection("sourceid=?", new String[]{s}).withExpectedCount(0);
        this.b.a(contentProviderOperation$Builder0, false);
    }

    final void h(Uri uri0, long v, Long long0) {
        ContentProviderOperation.Builder contentProviderOperation$Builder0 = ContentProviderOperation.newAssertQuery(ContentUris.withAppendedId(uri0, v)).withValue("version", long0).withExpectedCount(1);
        this.b.a(contentProviderOperation$Builder0, false);
    }

    final void i(Uri uri0, Long long0) {
        this.k(uri0, long0, false);
    }

    public final void j(Long long0, eggh eggh0, Long long1) {
        if(long1 == null) {
            return;
        }
        Uri uri0 = this.a;
        this.h(uri0, long0.longValue(), long1);
        egiv.R();
        boolean z = egiv.v().booleanValue();
        long v = ((long)long1) + 1L;
        ProtoLiteBuilder hftp0 = eggh0 == null ? ((ProtoLiteMessage)eggh.a).v_newBuilder() : ((ProtoLiteMessage)eggh.a).w(((ProtoLiteMessage)eggh0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eggh eggh1 = (eggh)hftp0.b_message;
        eggh1.b |= 2;
        eggh1.d = v;
        long v1 = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eggh eggh2 = (eggh)hftp0.b_message;
        eggh2.b |= 4;
        eggh2.e = v1;
        eggh eggh3 = (eggh)hftp0.N_build();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("sync1", Base64.encodeToString(eggh3.toBytesArray(), 2));
        contentValues0.put("version", Long.valueOf(((long)long1) + 1L));
        this.e(uri0, long0, contentValues0, z);
    }

    final void k(Uri uri0, Long long0, boolean z) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("dirty", Integer.valueOf(((int)z)));
        egiv.R();
        this.e(uri0, long0, contentValues0, egiv.v().booleanValue());
    }

    public final void l(Long long0, ContentValues contentValues0) {
        this.e(this.a, long0, contentValues0, false);
    }

    public void m(Long long0) {
        this.i(this.a, long0);
    }

    public final void n(egzx egzx0, egzx egzx1, boolean z) {
        this.h(this.a, egzx0.h.longValue(), egzx0.i);
        ContentValues contentValues0 = egzx1.a();
        this.e(this.a, egzx0.h, contentValues0, z);
    }

    public final void o(egzx egzx0, boolean z) {
        this.g(this.a, egzx0.k);
        ContentValues contentValues0 = egzx0.a();
        this.a(this.a, contentValues0, z);
    }
}


import android.content.ContentProviderOperation.Builder;
import android.content.ContentUris;
import android.content.SyncStats;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.DisplayPhoto;
import android.text.TextUtils;
import java.io.IOException;

public final class ehak extends ehaf {
    public static final String[] b;
    private final ehcs c;
    private final ehim d;
    private final egzp e;
    private final ehfz f;
    private final ehdl g;

    static {
        ehak.b = new String[]{"sourceid", "_id", "data14", "data15", "data_version", "data_sync4", "data_sync2", "data_sync1"};
    }

    public ehak(Cursor cursor0, ehcs ehcs0, ehim ehim0, egzp egzp0, ehfz ehfz0, ehdl ehdl0) {
        super(cursor0);
        this.c = ehcs0;
        this.d = ehim0;
        this.e = egzp0;
        this.f = ehfz0;
        this.g = ehdl0;
    }

    private final void a(girk girk0, int v) {
        this.d.h(girk0, gjgi.d, false, v, 1);
    }

    @Override  // ehaf
    public final Object b() {
        String s6;
        byte[] arr_b;
        while(this.k()) {
            this.e.d();
            String s = this.h("sourceid");
            long v = (long)this.g("_id");
            Long long0 = this.g("data14");
            String s1 = this.h("data_sync2");
            Long long1 = this.g("data_version");
            Long long2 = this.g("data_sync4");
            try {
                String s2 = long0 == null ? ContentUris.appendId(ContactsContract.Data.CONTENT_URI.buildUpon(), v).toString() : ContentUris.appendId(ContactsContract.DisplayPhoto.CONTENT_URI.buildUpon(), long0.longValue()).toString();
                arr_b = this.f.a(Uri.parse(s2));
            }
            catch(IOException iOException0) {
                this.a(girk.c, 1);
                egig.c("FSA2_SyncUpPhotoCursor", String.format("%s photo for contactId=%s failed.", "update", s), iOException0);
                this.d.r(gjgi.d, girk.c, "IO_EXCEPTION", iOException0);
                this.a(girk.c, 2);
                SyncStats syncStats0 = ((ehiv)this.d).a.stats;
                ++syncStats0.numIoExceptions;
                continue;
            }
            egiv.R();
            hwzc hwzc0 = hwzc.a;
            boolean z = hwzc0.c().bg();
            Boolean.valueOf(z).getClass();
            if(z && long2 != null && arr_b != null && long0 == null) {
                Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
                egiv.R();
                int v1 = (int)hwzc0.c().q();
                Integer.valueOf(v1).getClass();
                if(bitmap0 != null && bitmap0.getWidth() == v1 && bitmap0.getHeight() == v1) {
                    egig.m("FSA2_SyncUpPhotoCursor", "Skipped the low res photo uploading for contact %s", new Object[]{s});
                    continue;
                }
            }
            egig.g("FSA2_SyncUpPhotoCursor", "Start to upload photo for contact %s", s);
            if(arr_b == null) {
                boolean z1 = hwzc0.c().bf();
                Boolean.valueOf(z1).getClass();
                if(z1 && TextUtils.isEmpty(s1)) {
                    this.c();
                    return ehah.a(v);
                }
                this.a(girk.d, 1);
                SystemClock.elapsedRealtime();
                try {
                    this.c.d(s, 3);
                }
                catch(acse | ehfd | iapl exception0) {
                    girk girk0 = ehfl.a(false, gjgi.d, girk.d, exception0, this.d, 1);
                    if(girk0 == girk.d) {
                        this.c();
                        return ehah.a(v);
                    }
                    continue;
                }
                finally {
                    SystemClock.elapsedRealtime();
                }
                this.c();
                return ehah.a(v);
            }
            try {
                this.a(girk.c, 1);
                byte[] arr_b1 = this.l("data15");
                String s3 = this.h("data_sync1");
                long v3 = ehgd.a(arr_b1);
                String s4 = ehcv.b(s3);
                if(!TextUtils.isEmpty(s4)) {
                    try {
                        if(v3 == Long.parseLong(s4)) {
                            goto label_59;
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                    goto label_63;
                label_59:
                    egig.b("FSA2_SyncUpPhotoCursor", "Photo content is not changed, skip syncing it and clear dirty.");
                    this.a(girk.c, 3);
                    this.c();
                    return ehak.n(v, long1, s1);
                }
            label_63:
                String s5 = ehcv.a(Long.toString(v3), true);
                try {
                    s6 = this.c.c(s, arr_b, 3).a;
                }
                catch(acse | ehfd | iapl exception1) {
                    ehfl.a(false, gjgi.d, girk.c, exception1, this.d, 1);
                    throw new ehaj();
                }
                Boolean.valueOf(true).getClass();
                this.c();
                return ehak.n(v, long1, s6).withValue("data_sync1", s5);
            }
            catch(ehaj unused_ex) {
            }
        }
        return null;
    }

    private final void c() {
        this.g.d(1, false);
    }

    private static boolean d(byte[] arr_b) {
        return arr_b == null;
    }

    private static final ContentProviderOperation.Builder n(long v, Long long0, String s) {
        long v1 = ((long)long0) + 1L;
        return ehah.b(v, long0.longValue()).withValue("data_version", Long.valueOf(v1)).withValue("data_sync4", Long.valueOf(v1 + 10L)).withValue("data_sync2", s).withValue("data_sync3", s);
    }
}


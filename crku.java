import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.BatchUploadStatusParcel;
import java.util.Map;
import jeb.synthetic.TWR;

public final class crku implements Runnable {
    public final AppMetadata a;
    public final BatchUploadStatusParcel b;
    public final crih c;

    public crku(crih crih0, AppMetadata appMetadata0, BatchUploadStatusParcel batchUploadStatusParcel0) {
        this.c = crih0;
        this.a = appMetadata0;
        this.b = batchUploadStatusParcel0;
    }

    @Override
    public final void run() {
        long v5;
        long v4;
        long v3;
        int v2;
        int v1;
        String s3;
        String s2;
        byte[] arr_b;
        String s1;
        Cursor cursor3;
        Cursor cursor2;
        Cursor cursor1;
        crqq crqq0 = this.c.a;
        crqq0.F();
        String s = this.a.a;
        batl.s(s);
        crqq0.E();
        crqq0.G();
        BatchUploadStatusParcel batchUploadStatusParcel0 = this.b;
        crdg crdg0 = crqq0.o();
        long v = batchUploadStatusParcel0.a;
        crdg0.n();
        crdg0.aA();
        Cursor cursor0 = null;
        try {
            cursor1 = crdg0.g().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(v)}, null, null, null, "1");
        }
        catch(SQLiteException sQLiteException0) {
            cursor2 = null;
            goto label_51;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(null, throwable0);
            throw throwable0;
        }
        try {
            if(cursor1.moveToFirst()) {
                goto label_27;
            }
            else {
                goto label_25;
            }
            goto label_66;
        }
        catch(SQLiteException sQLiteException0) {
            cursor3 = cursor1;
            goto label_50;
        label_25:
            cursor1.close();
            goto label_66;
            try {
            label_27:
                s1 = cursor1.getString(1);
                batl.s(s1);
                arr_b = cursor1.getBlob(2);
                s2 = cursor1.getString(3);
                s3 = cursor1.getString(4);
                v1 = cursor1.getInt(5);
                v2 = cursor1.getInt(6);
                goto label_38;
            }
            catch(SQLiteException sQLiteException0) {
            }
            catch(Throwable throwable0) {
                goto label_45;
            }
            cursor3 = cursor1;
            goto label_50;
            try {
            label_38:
                v3 = cursor1.getLong(7);
                v4 = cursor1.getLong(8);
                cursor3 = cursor1;
                v5 = cursor1.getLong(9);
                cursor3 = cursor1;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_50;
            }
            catch(Throwable throwable0) {
                goto label_45;
            }
        }
        catch(Throwable throwable0) {
        label_45:
            cursor3 = cursor1;
            goto label_60;
        }
        try {
            cursor0 = crdg0.r(s1, v, arr_b, s2, s3, v1, v2, v3, v4, v5);
            goto label_64;
        }
        catch(SQLiteException sQLiteException0) {
        label_50:
            cursor2 = cursor3;
            try {
            label_51:
                crdg0.aJ().c.c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(v), sQLiteException0);
            }
            catch(Throwable throwable0) {
                cursor0 = cursor2;
                goto label_61;
            }
            if(cursor2 != null) {
                cursor2.close();
            }
            goto label_66;
        }
        catch(Throwable throwable0) {
        }
    label_60:
        cursor0 = cursor3;
    label_61:
        if(cursor0 != null) {
            cursor0.close();
        }
        throw throwable0;
    label_64:
        if(cursor3 != null) {
            cursor3.close();
        }
    label_66:
        if(cursor0 == null) {
            crqq0.aJ().f.c("[sgtm] Queued batch doesn\'t exist. appId, rowId", s, Long.valueOf(batchUploadStatusParcel0.a));
            return;
        }
        String s4 = cursor0.c;
        if(batchUploadStatusParcel0.b == 1) {
            Map map0 = crqq0.s;
            if(map0.containsKey(s4)) {
                map0.remove(s4);
            }
            crdg crdg1 = crqq0.o();
            Long long0 = (long)batchUploadStatusParcel0.a;
            crdg1.I(long0);
            crqq0.aJ().k.c("[sgtm] queued batch deleted after successful client upload. appId, rowId", s, long0);
            long v6 = batchUploadStatusParcel0.c;
            if(v6 > 0L) {
                crdg crdg2 = crqq0.o();
                crdg2.n();
                crdg2.aA();
                Long long1 = v6;
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("upload_type", Integer.valueOf(crnq.b.g));
                contentValues0.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                try {
                    if(((long)crdg2.g().update("upload_queue", contentValues0, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(v6), s, String.valueOf(crnq.e.g)})) != 1L) {
                        crdg2.aJ().f.c("Google Signal pending batch not updated. appId, rowId", s, long1);
                    }
                }
                catch(SQLiteException sQLiteException1) {
                    crdg2.aJ().c.d("Failed to update google Signal pending batch. appid, rowId", s, Long.valueOf(v6), sQLiteException1);
                    throw sQLiteException1;
                }
                crqq0.aJ().k.c("[sgtm] queued Google Signal batch updated. appId, signalRowId", s, Long.valueOf(batchUploadStatusParcel0.c));
                crqq0.ak(s);
                return;
            }
            return;
        }
        if(batchUploadStatusParcel0.b == 3) {
            Map map1 = crqq0.s;
            crqp crqp0 = (crqp)map1.get(s4);
            if(crqp0 == null) {
                crqp0 = new crqp(crqq0);
                map1.put(s4, crqp0);
            }
            else {
                ++crqp0.b;
                crqp0.c = crqp0.a();
            }
            long v7 = crqp0.c;
            crqq0.av();
            crqq0.aJ().k.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", s, s4, Long.valueOf((v7 - System.currentTimeMillis()) / 1000L));
        }
        crdg crdg3 = crqq0.o();
        Long long2 = (long)batchUploadStatusParcel0.a;
        crdg3.K(long2);
        crqq0.aJ().k.c("[sgtm] increased batch retry count after failed client upload. appId, rowId", s, long2);
    }
}


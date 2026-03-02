import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jeb.synthetic.TWR;

public final class crde {
    final crdg a;
    private final String b;
    private long c;

    public crde(crdg crdg0, String s) {
        Objects.requireNonNull(crdg0);
        this.a = crdg0;
        super();
        batl.q(s);
        this.b = s;
        this.c = -1L;
    }

    public crde(crdg crdg0, String s, long v) {
        Objects.requireNonNull(crdg0);
        this.a = crdg0;
        super();
        batl.q(s);
        this.b = s;
        this.c = crdg0.f("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{s, String.valueOf(v)}, -1L);
    }

    public final List a() {
        crsn crsn0;
        List list0 = new ArrayList();
        String[] arr_s = {this.b, String.valueOf(this.c)};
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = this.a.g().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", arr_s, null, null, "rowid", "1000");
                if(cursor0.moveToFirst()) {
                    do {
                        boolean z = false;
                        long v = cursor0.getLong(0);
                        long v1 = cursor0.getLong(3);
                        if(Long.compare(cursor0.getLong(5), 1L) == 0) {
                            z = true;
                        }
                        byte[] arr_b = cursor0.getBlob(4);
                        if(v > this.c) {
                            this.c = v;
                        }
                        try {
                            crsn0 = (crsn)crqt.o(((Builder)(((crsn)((ProtoLiteMessage)crso.a).v_newBuilder()))), arr_b);
                        }
                        catch(IOException iOException0) {
                            this.a.aJ().c.c("Data loss. Failed to merge raw event. appId", crji.a(this.b), iOException0);
                            continue;
                        }
                        String s = cursor0.getString(1);
                        if(s == null) {
                            s = "";
                        }
                        if(!crsn0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crsn0).ensureMutable();
                        }
                        crso crso0 = (crso)crsn0.b_message;
                        crso0.b |= 1;
                        crso0.d = s;
                        long v2 = cursor0.getLong(2);
                        if(!crsn0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crsn0).ensureMutable();
                        }
                        crso crso1 = (crso)crsn0.b_message;
                        crso1.b |= 2;
                        crso1.e = v2;
                        list0.add(new crdd(v, v1, z, ((crso)((ProtoLiteBuilder)crsn0).N_build())));
                    }
                    while(cursor0.moveToNext());
                }
                else {
                    list0 = Collections.EMPTY_LIST;
                }
            }
            catch(SQLiteException sQLiteException0) {
                this.a.aJ().c.c("Data loss. Error querying raw events batch. appId", crji.a(this.b), sQLiteException0);
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        if(cursor0 != null) {
            cursor0.close();
        }
        return list0;
    }
}


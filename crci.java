import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;

final class crci {
    final crcm a;
    private crso b;
    private Long c;
    private long d;

    public crci(crcm crcm0) {
        Objects.requireNonNull(crcm0);
        this.a = crcm0;
        super();
    }

    final crso a(String s, crso crso0) {
        crso crso2;
        Pair pair0;
        crso crso1;
        Long long1;
        Cursor cursor1;
        crcm crcm0 = this.a;
        String s1 = crso0.d;
        hfuo hfuo0 = crso0.c;
        crcm0.aw();
        Long long0 = (Long)crqt.K(crso0, "_eid");
        Cursor cursor0 = null;
        if(long0 == null) {
            crso2 = crso0;
        }
        else if(s1.equals("_ep")) {
            crcm0.aw();
            String s2 = (String)crqt.K(crso0, "_en");
            if(TextUtils.isEmpty(s2)) {
                crcm0.aJ().d.b("Extra parameter without an event name. eventId", long0);
                return null;
            }
            if(this.b == null || this.c == null || ((long)long0) != ((long)this.c)) {
                crdg crdg0 = crcm0.at();
                crdg0.n();
                crdg0.aA();
                try {
                    cursor1 = null;
                    cursor1 = crdg0.g().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{s, long0.toString()});
                    goto label_22;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_35;
                }
                catch(Throwable throwable0) {
                }
                goto label_42;
                try {
                label_22:
                    if(cursor1.moveToFirst()) {
                        byte[] arr_b = cursor1.getBlob(0);
                        long1 = cursor1.getLong(1);
                        try {
                            crso1 = (crso)((ProtoLiteBuilder)(((crsn)crqt.o(((Builder)(((crsn)((ProtoLiteMessage)crso.a).v_newBuilder()))), arr_b)))).N_build();
                            pair0 = Pair.create(crso1, long1);
                            goto label_45;
                        }
                        catch(IOException iOException0) {
                        }
                        crdg0.aJ().c.d("Failed to merge main event. appId, eventId", crji.a(s), long0, iOException0);
                    }
                    else {
                        crdg0.aJ().k.a("Main event not found");
                    }
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_35;
                }
                catch(Throwable throwable0) {
                    goto label_41;
                }
                cursor1.close();
                pair0 = null;
                goto label_46;
                try {
                    try {
                        pair0 = Pair.create(crso1, long1);
                        goto label_45;
                    }
                    catch(SQLiteException sQLiteException0) {
                    }
                label_35:
                    crdg0.aJ().c.b("Error selecting main event", sQLiteException0);
                }
                catch(Throwable throwable0) {
                    goto label_41;
                }
                if(cursor1 != null) {
                    cursor1.close();
                }
                pair0 = null;
                goto label_46;
            label_41:
                cursor0 = cursor1;
            label_42:
                if(cursor0 != null) {
                    cursor0.close();
                }
                throw throwable0;
            label_45:
                cursor1.close();
            label_46:
                if(pair0 != null && pair0.first != null) {
                    this.b = (crso)pair0.first;
                    this.d = (long)(((Long)pair0.second));
                    this.a.aw();
                    this.c = (Long)crqt.K(this.b, "_eid");
                    goto label_54;
                }
                this.a.aJ().d.c("Extra parameter without existing main event. eventName, eventId", s2, long0);
                return null;
            }
        label_54:
            long v = this.d - 1L;
            this.d = v;
            if(v <= 0L) {
                crdg crdg1 = this.a.at();
                crdg1.n();
                crdg1.aJ().k.b("Clearing complex main event info. appId", s);
                try {
                    crdg1.g().execSQL("delete from main_event_params where app_id=?", new String[]{s});
                }
                catch(SQLiteException sQLiteException1) {
                    crdg1.aJ().c.b("Error clearing complex main event", sQLiteException1);
                }
            }
            else {
                this.a.at().ae(s, long0, this.d, this.b);
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.b.c) {
                crsq crsq0 = (crsq)object0;
                this.a.aw();
                if(crqt.D(crso0, crsq0.c) == null) {
                    arrayList0.add(crsq0);
                }
            }
            if(arrayList0.isEmpty()) {
                this.a.aJ().d.b("No unique parameters in main event. eventName", s2);
            }
            else {
                arrayList0.addAll(hfuo0);
                hfuo0 = arrayList0;
            }
            crso2 = crso0;
            s1 = s2;
        }
        else {
            this.c = long0;
            this.b = crso0;
            crcm0.aw();
            long v1 = (long)(((Long)crqt.N(crso0, "_epc", Long.valueOf(0L))));
            this.d = v1;
            if(v1 <= 0L) {
                crcm0.aJ().d.b("Complex event with zero extra param count. eventName", s1);
                crso2 = crso0;
            }
            else {
                crso2 = crso0;
                crcm0.at().ae(s, long0, this.d, crso2);
            }
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)crso2).jf(5, null);
        hftp0.X(((ProtoLiteMessage)crso2));
        if(!((crsn)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((crsn)hftp0))).ensureMutable();
        }
        crso crso3 = (crso)((crsn)hftp0).b_message;
        s1.getClass();
        crso3.b |= 1;
        crso3.d = s1;
        if(!((crsn)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((crsn)hftp0))).ensureMutable();
        }
        ((crso)((crsn)hftp0).b_message).c = hfvv.a;
        if(!((crsn)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((crsn)hftp0))).ensureMutable();
        }
        crso crso4 = (crso)((crsn)hftp0).b_message;
        crso4.b();
        hfrj.E(hfuo0, crso4.c);
        return (crso)((ProtoLiteBuilder)(((crsn)hftp0))).N_build();
    }
}


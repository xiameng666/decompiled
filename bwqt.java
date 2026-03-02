import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall.Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall.Response;
import com.google.android.gms.search.corpora.RequestIndexingCall.Request;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;

public final class bwqt extends bboo {
    public static final bwtt a;
    private static bwqt c;
    private bwtc d;
    private final Set e;

    static {
        bwqt.a = new bwtt();
    }

    public bwqt(Context context0, int v) {
        super(context0, "icing-indexapi.db", v);
        this.e = new HashSet();
        new bwtu(context0);
    }

    @Override  // bboo
    protected final void a(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL(String.format(Locale.US, "CREATE TABLE IF NOT EXISTS [%s] ([%s] STRING PRIMARY KEY, [%s] STRING)", "incarnation_indexapi", "app_name", "incarnation"));
        sQLiteDatabase0.execSQL(String.format(Locale.US, "CREATE TABLE IF NOT EXISTS [%s] ([%s] STRING, [%s] STRING, PRIMARY KEY([%s], [%s]))", "type_indexapi", "app_name", "type", "app_name", "type"));
    }

    public static bwqt c(Context context0, String s) {
        return bwtj.d(context0, s) ? bwqt.d(context0) : null;
    }

    public static bwqt d(Context context0) {
        synchronized(bwqt.class) {
            if(bwqt.c == null) {
                int v1 = (int)huar.a.d().f();
                if(v1 == -1) {
                    v1 = 9;
                }
                bwqt.c = new bwqt(context0, v1);
            }
        }
        return bwqt.c;
    }

    public static Set e(Set set0, String s) {
        return bwqt.f(set0, Arrays.asList(new String[]{s}));
    }

    public static Set f(Set set0, List list0) {
        Set set1 = new HashSet();
        for(Object object0: set0) {
            bwsa bwsa0 = (bwsa)object0;
            if(list0.contains(bwsa0.a.b)) {
                set1.add(bwsa0);
            }
        }
        return set1;
    }

    public final void g(SQLiteDatabase sQLiteDatabase0, bwud bwud0, bwmx bwmx0, bwtc bwtc0, int v) {
        SQLiteDatabase sQLiteDatabase1;
        CorpusStatus corpusStatus0;
        bwsa bwsa0;
        batl.b(sQLiteDatabase0.inTransaction());
        long v1 = Math.max(0L, hubg.a.j().n() - ((long)v));
        String s = bwud0.e;
        Set set0 = bwqs.a(sQLiteDatabase0, s, bwtc0);
        bwqt.t(sQLiteDatabase0, bwud0, bwmx0, set0);
        if(!bwqt.v(sQLiteDatabase0, v1, set0)) {
            sQLiteDatabase0.setTransactionSuccessful();
            sQLiteDatabase0.endTransaction();
            try {
                bwmx0.q();
            }
            catch(Throwable throwable0) {
                sQLiteDatabase0.beginTransaction();
                throw throwable0;
            }
            sQLiteDatabase0.beginTransaction();
            bwqt.t(sQLiteDatabase0, bwud0, bwmx0, set0);
            if(!bwqt.v(sQLiteDatabase0, v1, set0)) {
                sQLiteDatabase0.setTransactionSuccessful();
                sQLiteDatabase0.endTransaction();
                try {
                    Iterator iterator0 = set0.iterator();
                    while(true) {
                    label_19:
                        if(!iterator0.hasNext()) {
                            goto label_37;
                        }
                        Object object0 = iterator0.next();
                        bwsa0 = (bwsa)object0;
                        corpusStatus0 = bwmx0.P(bwud0, bwsa0.c(), s);
                        if(corpusStatus0.a && bwqt.r(sQLiteDatabase0, bwsa0) > v1) {
                            break;
                        }
                    }
                }
                catch(Throwable throwable1) {
                    sQLiteDatabase1 = sQLiteDatabase0;
                    sQLiteDatabase1.beginTransaction();
                    throw throwable1;
                }
                try {
                    sQLiteDatabase1 = sQLiteDatabase0;
                    bwqt.o(sQLiteDatabase1, bwsa0, bwud0, corpusStatus0, bwmx0, 7);
                    sQLiteDatabase0 = sQLiteDatabase1;
                    bwud0 = bwud0;
                    bwmx0 = bwmx0;
                    goto label_19;
                }
                catch(Throwable throwable1) {
                }
                sQLiteDatabase1.beginTransaction();
                throw throwable1;
            label_37:
                sQLiteDatabase0.beginTransaction();
                throw new bwtf();
            }
        }
    }

    public static void h(SQLiteDatabase sQLiteDatabase0, bwsa bwsa0, long v) {
        String s = bwsa0.e();
        bwne.c("Cleaning sequence table \'%s\' where seqno <= %d: deleted %d rows", new Object[]{s, v, sQLiteDatabase0.delete(bwtd.c(s), "seqno<=?", new String[]{String.valueOf(v)})});
    }

    public final void i(SQLiteDatabase sQLiteDatabase0, String[] arr_s, Set set0) {
        for(Object object0: set0) {
            bwsa bwsa0 = (bwsa)object0;
            batl.b(sQLiteDatabase0.inTransaction());
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("uri", s);
                contentValues0.put("action", "del");
                sQLiteDatabase0.insertOrThrow(bwtd.c(bwsa0.e()), null, contentValues0);
            }
        }
    }

    public final boolean j(bwmx bwmx0, bwud bwud0, bwtc bwtc0) {
        boolean z;
        int v7;
        int v6;
        int v5;
        int v2;
        ArrayList arrayList0;
        bwmx bwmx1 = bwmx0;
        Set set0 = this.e;
        String s = bwud0.e;
        synchronized(set0) {
            if(bwvu.i() && bwtc0 != this.d) {
                this.d = bwtc0;
                set0.clear();
            }
            if(!set0.add(s)) {
                return false;
            }
        }
        HashMap hashMap0 = new HashMap();
        SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
        sQLiteDatabase0.beginTransaction();
        try {
            for(Object object0: bwqs.b(sQLiteDatabase0, s, bwtc0)) {
                bwsa bwsa0 = (bwsa)((Pair)object0).first;
                String s1 = (String)((Pair)object0).second;
                if(bwtc0.i(bwsa.h(s1))) {
                    String s2 = bwsa0.e();
                    if(abyd.e(sQLiteDatabase0, s2)) {
                        arrayList0 = new ArrayList();
                        try(Cursor cursor0 = sQLiteDatabase0.rawQuery(a.a(s2, "PRAGMA table_info([", "])"), null)) {
                            while(true) {
                                if(!cursor0.moveToNext()) {
                                    break;
                                }
                                arrayList0.add(cursor0.getString(cursor0.getColumnIndexOrThrow("name")));
                            }
                        }
                        ArrayList arrayList1 = new ArrayList();
                        for(Object object1: bwtd.d(bwsa0.a)) {
                            arrayList1.add(((String)((Pair)object1).first));
                        }
                        Collections.sort(arrayList0);
                        Collections.sort(arrayList1);
                        if(!arrayList0.equals(arrayList1)) {
                            goto label_46;
                        }
                        continue;
                    }
                }
            label_46:
                bwqs.c(sQLiteDatabase0, bwsa0.b, s1);
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS [" + bwsa.f(s1, s) + "]");
            }
            for(Object object2: bwqs.a(sQLiteDatabase0, s, bwtc0)) {
                hashMap0.put(((bwsa)object2), Boolean.valueOf(false));
            }
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        String s3 = bwud0.e;
        bwuc bwuc0 = bwmx1.l;
        if(bwuc0 == null) {
            bwne.s("Failed to update schema and remove orphaned corpora");
            v2 = 0;
        }
        else {
            bwua bwua0 = bwuc0.e(s3);
            bwut bwut0 = bwmx1.f();
            gged_interceptors gged0 = bwut0.m(bwua0);
            int v3 = ((ggna)gged0).c;
            int v4 = 0;
            v2 = 0;
            while(v4 < v3) {
                bwvl bwvl0 = (bwvl)gged0.get(v4);
                bwnq bwnq0 = bwut0.c(bwvl0);
                if(bwnq0 != null) {
                    bwsa bwsa1 = bwsa.a(bwnq0.d, s3, bwtc0);
                    if(bwsa1 == null) {
                    }
                    else if(hashMap0.containsKey(bwsa1)) {
                        hashMap0.put(bwsa1, Boolean.valueOf(true));
                        if(((Boolean)bwvu.t.b()).booleanValue() && !hubu.g()) {
                            v5 = v3;
                            RegisterCorpusInfoCall.Request registerCorpusInfoCall$Request0 = bwtd.a(bwsa1);
                            elbp elbp0 = new elbp(bwmx1.b, bwmx1, registerCorpusInfoCall$Request0, bwud0);
                            bwmx1.c.h(elbp0);
                            if(((RegisterCorpusInfoCall.Response)elbp0.v()).b) {
                                bwts bwts0 = bwmx1.r;
                                glnt glnt0 = (glnt)((ProtoLiteMessage)glnu.a).v_newBuilder();
                                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glqc.a).v_newBuilder();
                                String s4 = bwnq0.f;
                                v6 = v4;
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ProtoLiteMessage hftv0 = hftp0.b_message;
                                s4.getClass();
                                v7 = v2;
                                ((glqc)hftv0).b |= 16;
                                ((glqc)hftv0).g = s4;
                                String s5 = bwnq0.d;
                                if(!hftv0.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                glqc glqc0 = (glqc)hftp0.b_message;
                                s5.getClass();
                                glqc0.b |= 0x20;
                                glqc0.h = s5;
                                glnt0.a(hftp0);
                                bwts0.q(6016, ((glnu)((ProtoLiteBuilder)glnt0).N_build()));
                            }
                            else {
                                v7 = v2;
                                v6 = v4;
                            }
                            goto label_126;
                        }
                        else {
                            v7 = v2;
                            v5 = v3;
                        }
                        v6 = v4;
                        goto label_126;
                    }
                    else {
                        v5 = v3;
                        v6 = v4;
                        bwqn bwqn0 = new bwqn(this, gltq.o, bwnq0.f, bwmx1, bwvl0, bwua0);
                        bwmx1.c.h(bwqn0);
                        bwqn0.v();
                        v2 = 1;
                        goto label_127;
                    }
                }
                v5 = v3;
                v6 = v4;
                v7 = v2;
            label_126:
                v2 = v7;
            label_127:
                v4 = v6 + 1;
                bwmx1 = bwmx0;
                v3 = v5;
            }
        }
        SQLiteDatabase sQLiteDatabase1 = this.getWritableDatabase();
        sQLiteDatabase1.beginTransaction();
        try {
            z = false;
            for(Object object3: hashMap0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object3;
                if(!((Boolean)map$Entry0.getValue()).booleanValue()) {
                    String s6 = ((bwsa)map$Entry0.getKey()).d();
                    bwqs.c(sQLiteDatabase1, ((bwsa)map$Entry0.getKey()).b, s6);
                    sQLiteDatabase1.execSQL("DROP TABLE IF EXISTS [" + bwsa.f(s6, s) + "]");
                    z = true;
                }
            }
            sQLiteDatabase1.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase1.endTransaction();
        }
        return v2 != 0 || z;
    }

    public final void n(Set set0, bwud bwud0, bwmx bwmx0, int v) {
        for(Object object0: set0) {
            bwsa bwsa0 = (bwsa)object0;
            CorpusStatus corpusStatus0 = bwmx0.P(bwud0, bwsa0.c(), bwsa0.b);
            if(corpusStatus0.a) {
                bwqt.o(this.getWritableDatabase(), bwsa0, bwud0, corpusStatus0, bwmx0, v);
            }
        }
    }

    public static void o(SQLiteDatabase sQLiteDatabase0, bwsa bwsa0, bwud bwud0, CorpusStatus corpusStatus0, bwmx bwmx0, int v) {
        long v1;
        String s1;
        String s;
        glnn glnn0 = bxgo.a(bwmx0.b);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)glnn0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)glnn0));
        ProtoLiteMessage hftv0 = hftp0.b_message;
        if(((glnn)hftv0).h) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            glnn glnn1 = (glnn)hftp0.b_message;
            glnn1.c = glre.a(v);
            glnn1.b |= 1;
            glnn glnn2 = (glnn)hftp0.N_build();
            bwmx0.r.v(glnn2);
        }
        s = bwsa0.b;
        s1 = bwsa0.c();
        String[] arr_s = {bwsa0.e()};
        try(Cursor cursor0 = sQLiteDatabase0.query("sqlite_sequence", new String[]{"seq"}, "name=?", arr_s, null, null, null)) {
            v1 = cursor0.moveToNext() ? cursor0.getLong(0) : 0L;
        }
        long v2 = corpusStatus0.b;
        if(v1 > v2) {
            bwne.c("Requesting indexing of \'%s\', maxSeqno/lastIndexedSeqno: %d/%d.", new Object[]{s1, v1, v2});
            RequestIndexingCall.Request requestIndexingCall$Request0 = new RequestIndexingCall.Request();
            requestIndexingCall$Request0.a = s;
            requestIndexingCall$Request0.b = s1;
            requestIndexingCall$Request0.c = v1;
            bwvg bwvg0 = bwmx0.n;
            if(bwvg0 == null) {
                bwne.a("Failed to get content fetcher, unable to index.");
                return;
            }
            bwut bwut0 = bwmx0.f();
            bwqp bwqp0 = new bwqp(bwmx0.b, bwmx0.c, bwut0, bwvg0, bwmx0.p, requestIndexingCall$Request0, bwud0, s1);
            bwmx0.c.h(bwqp0);
        }
    }

    @Override  // bboo
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        batl.b(v1 <= v);
        for(int v2 = v; true; v2 = 8) {
            if(v2 <= v1) {
                int v3;
                for(v3 = v; v3 > v1; v3 = 8) {
                    try {
                        if(v3 != 9) {
                            throw new IllegalStateException();
                        }
                        Iterator iterator0 = abyd.a(sQLiteDatabase0, new String[]{"_seq_table"}).iterator();
                        while(iterator0.hasNext()) {
                            sQLiteDatabase0.execSQL(bcnm.b(iterator0, "DROP INDEX IF EXISTS [", "_uri_index]"));
                        }
                    }
                    catch(Exception exception0) {
                        bwqt.w(v, v1, v3, exception0);
                        break;
                    }
                }
                v = v3;
                break;
            }
            if(v2 != 9) {
                break;
            }
        }
        if(v != v1) {
            this.u(sQLiteDatabase0);
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        batl.b(v1 >= v);
        int v2 = v;
    alab1:
        while(true) {
            if(v2 >= v1) {
                int v3 = v;
                while(v3 < v1) {
                    try {
                    alab2:
                        switch(v3) {
                            case 7: {
                                Iterator iterator0 = abyd.a(sQLiteDatabase0, new String[]{"_seq_table"}).iterator();
                                while(iterator0.hasNext()) {
                                    sQLiteDatabase0.execSQL(bcnm.b(iterator0, "ALTER TABLE [", "] ADD [tag] STRING"));
                                }
                                break;
                            }
                            case 8: {
                                Iterator iterator1 = abyd.a(sQLiteDatabase0, new String[]{"_seq_table"}).iterator();
                                while(true) {
                                    if(!iterator1.hasNext()) {
                                        break alab2;
                                    }
                                    Object object0 = iterator1.next();
                                    sQLiteDatabase0.execSQL(bwtd.b(((String)object0)));
                                }
                            }
                            default: {
                                throw new IllegalStateException();
                            }
                        }
                        ++v3;
                        continue;
                    }
                    catch(Exception exception0) {
                    }
                    bwqt.w(v, v1, v3, exception0);
                    break;
                }
                v = v3;
                break;
            }
            switch(v2) {
                case 7: {
                    if(huar.a.d().H()) {
                        break;
                    }
                    break alab1;
                }
                case 8: {
                    break;
                }
                default: {
                    break alab1;
                }
            }
            ++v2;
        }
        if(v != v1) {
            this.u(sQLiteDatabase0);
        }
    }

    public final void p(Set set0, bwud bwud0, bwmx bwmx0, int v) {
        for(Object object0: set0) {
            bwsa bwsa0 = (bwsa)object0;
            String s = bwsa0.c();
            CorpusStatus corpusStatus0 = bwmx0.P(bwud0, s, bwsa0.b);
            if(corpusStatus0.a && (corpusStatus0.f == null || Integer.parseInt(corpusStatus0.f) == bwsa0.a.e)) {
                bwqt.o(this.getWritableDatabase(), bwsa0, bwud0, corpusStatus0, bwmx0, v);
            }
            else {
                bwne.b("Couldn\'t find corpus \'%s\'.", s);
                RegisterCorpusInfoCall.Request registerCorpusInfoCall$Request0 = bwtd.a(bwsa0);
                bwqo bwqo0 = new bwqo(this, bwmx0.b, bwmx0, registerCorpusInfoCall$Request0, bwud0, s, bwsa0, corpusStatus0, bwmx0, v);
                bwmx0.c.h(bwqo0);
            }
        }
    }

    public static final Set q(SQLiteDatabase sQLiteDatabase0, Set set0, bwud bwud0, bwtc bwtc0) {
        batl.l(sQLiteDatabase0.inTransaction());
        bwne.b("Running \'clear\' for client \'%s\'.", bwud0.e);
        Set set1 = bwqs.a(sQLiteDatabase0, bwud0.e, bwtc0);
        Iterator iterator0 = set1.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            bwsa bwsa0 = (bwsa)object0;
            if(set0 != null && !set0.contains(bwsa0.a.b)) {
                iterator0.remove();
            }
            else {
                String s = bwsa0.e();
                bwne.c("Clearing sequence table: \'%s\' by deleting %d rows, remaining %d rows", new Object[]{s, sQLiteDatabase0.delete(bwtd.c(s), null, null), bwqt.s(sQLiteDatabase0, s)});
            }
        }
        bwne.b("Corpora: %d", Integer.valueOf(set1.size()));
        return set1;
    }

    private static long r(SQLiteDatabase sQLiteDatabase0, bwsa bwsa0) {
        return bwqt.s(sQLiteDatabase0, bwsa0.e());
    }

    private static long s(SQLiteDatabase sQLiteDatabase0, String s) {
        return abyd.e(sQLiteDatabase0, s) ? DatabaseUtils.queryNumEntries(sQLiteDatabase0, bwtd.c(s)) : 0L;
    }

    private static void t(SQLiteDatabase sQLiteDatabase0, bwud bwud0, bwmx bwmx0, Set set0) {
        for(Object object0: set0) {
            bwqt.h(sQLiteDatabase0, ((bwsa)object0), bwmx0.P(bwud0, ((bwsa)object0).c(), bwud0.e).c);
        }
    }

    private final void u(SQLiteDatabase sQLiteDatabase0) {
        Iterator iterator0 = abyd.a(sQLiteDatabase0, new String[]{"_seq_table"}).iterator();
        while(iterator0.hasNext()) {
            sQLiteDatabase0.execSQL(bcnm.b(iterator0, "DROP TABLE [", "]"));
        }
        Iterator iterator1 = abyd.a(sQLiteDatabase0, new String[]{"_indexapi"}).iterator();
        while(iterator1.hasNext()) {
            sQLiteDatabase0.execSQL(bcnm.b(iterator1, "DROP TABLE [", "]"));
        }
        this.onCreate(sQLiteDatabase0);
    }

    private static final boolean v(SQLiteDatabase sQLiteDatabase0, long v, Set set0) {
        for(Object object0: set0) {
            if(bwqt.r(sQLiteDatabase0, ((bwsa)object0)) > v) {
                return false;
            }
        }
        return true;
    }

    private static final void w(int v, int v1, int v2, Exception exception0) {
        bwne.j(exception0, "Could not %s %s from version %d to version %d; error occurred at version %d.", new Object[]{(v > v1 ? "downgrade" : "upgrade"), "icing-indexapi.db", v, v1, v2});
        huax.b();
        bwne.x();
    }
}


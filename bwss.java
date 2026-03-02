import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.firebase.appindexing.internal.Thing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public final class bwss extends bwsh {
    Map a;
    private final Thing[] b;
    private final long c;

    public bwss(Thing[] arr_thing, long v) {
        super(bwst.a(arr_thing), 3);
        this.b = arr_thing;
        this.c = v;
    }

    @Override  // bwse
    protected final void c(bwmx bwmx0, bwud bwud0, NativeIndex nativeIndex0, bwuc bwuc0, bwuj bwuj0) {
        bwst.d(bwmx0, "update");
        gftb.z(this.a, "execute called without validateInput");
        bwne.p("Processing update synchronously for package %s.", bwud0.e);
        Context context0 = bwmx0.b;
        bwrv.a(context0, this.a);
        for(Object object0: this.a.keySet()) {
            bwsa bwsa0 = (bwsa)object0;
            if(bwst.h(bwmx0.O(bwud0, bwsa0.c(), bwsa0.b), bwsa0)) {
                bwst.g(bwud0, bwsa0, bwmx0);
            }
        }
        bwst.i(context0, bwmx0.r, 3);
        hfuo hfuo0 = hubg.h().b;
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: this.a.entrySet()) {
            bwsa bwsa1 = (bwsa)((Map.Entry)object1).getKey();
            for(Object object2: ((List)((Map.Entry)object1).getValue())) {
                hlne hlne0 = bwth.b(((Thing)object2));
                arrayList0.add(hlne0);
                String s = bwsa1.c();
                bwst.e(bwsa1.b, s, hlne0, false, bwmx0, nativeIndex0, bwuc0, bwuj0);
                bwne.r("Synchronously updated Thing (pkg: %s, url: %s)", bwsa1.b, ((Thing)object2).d);
            }
            String s1 = bwsa1.b;
            if(hfuo0.contains(s1)) {
                glzd.g(bwmx0.j(), new bwsd(arrayList0, bwmx0, this.c, s1), gmap.a);
            }
        }
        nativeIndex0.v();
    }

    @Override  // bwsh
    public final void e(bwmx bwmx0) {
        bwrv.a(bwmx0.b, this.a);
    }

    @Override  // bwsh
    public final bwsg g(SQLiteDatabase sQLiteDatabase0, bwqt bwqt0, bwud bwud0, bwtc bwtc0) {
        HashSet hashSet2;
        Set set1;
        Map.Entry map$Entry1;
        HashSet hashSet1;
        Iterator iterator2;
        gftb.z(this.a, "execute called without validateInput");
        Map map0 = this.a;
        batl.l(sQLiteDatabase0.inTransaction());
        if(map0.isEmpty()) {
            return new bwsg(Collections.EMPTY_SET, this.a.keySet());
        }
        HashSet hashSet0 = !"com.google.android.apps.messaging".equals(bwud0.e) || !hubg.a.j().N() ? null : new HashSet();
        Iterator iterator0 = map0.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object0;
            bwsa bwsa0 = (bwsa)map$Entry0.getKey();
            String s = bwsa0.e();
            if(abyd.e(sQLiteDatabase0, s)) {
                iterator2 = iterator0;
                hashSet1 = hashSet0;
                map$Entry1 = map$Entry0;
            }
            else {
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: bwtd.d(bwsa0.a)) {
                    arrayList0.add("[" + ((String)((Pair)object1).first) + "] " + ((String)((Pair)object1).second));
                    iterator0 = iterator0;
                    hashSet0 = hashSet0;
                }
                iterator2 = iterator0;
                hashSet1 = hashSet0;
                String s1 = "CREATE TABLE IF NOT EXISTS [" + bwsa0.e() + "] (" + TextUtils.join(", ", arrayList0) + ")";
                String s2 = bwtd.b(bwsa0.e());
                sQLiteDatabase0.beginTransaction();
                try {
                    String s3 = Long.toHexString(new Random().nextLong());
                    ContentValues contentValues0 = new ContentValues(2);
                    contentValues0.put("app_name", bwsa0.b);
                    contentValues0.put("incarnation", s3);
                    map$Entry1 = map$Entry0;
                    sQLiteDatabase0.insertWithOnConflict("incarnation_indexapi", null, contentValues0, 4);
                    bwne.d("Updated %s with: %s.", "incarnation_indexapi", s3);
                    ContentValues contentValues1 = new ContentValues(2);
                    contentValues1.put("app_name", bwsa0.b);
                    contentValues1.put("type", bwsa0.d());
                    sQLiteDatabase0.insertWithOnConflict("type_indexapi", null, contentValues1, 4);
                    String s4 = bwsa0.d();
                    bwne.c("Updated %s with (%s, %s).", new Object[]{"type_indexapi", bwsa0.b, s4});
                    sQLiteDatabase0.execSQL(s1);
                    if(sQLiteDatabase0.getVersion() >= 9) {
                        sQLiteDatabase0.execSQL(s2);
                    }
                    sQLiteDatabase0.setTransactionSuccessful();
                    bwne.a("Updated incarnation and type table.");
                    bwne.c("Created sequence table: %s. SQL: %s; %s", new Object[]{s, s1, s2});
                }
                finally {
                    sQLiteDatabase0.endTransaction();
                }
            }
            List list0 = (List)map$Entry1.getValue();
            batl.b(sQLiteDatabase0.inTransaction());
            Set set0 = bwqs.a(sQLiteDatabase0, bwsa0.b, bwtc0);
            if(!set0.remove(bwsa0)) {
                throw new IllegalStateException("Missing type: " + bwsa0.a.b);
            }
            if(hashSet1 == null) {
                set1 = set0;
                hashSet2 = null;
            }
            else {
                ArrayList arrayList1 = new ArrayList();
                bwqk bwqk0 = bwsa0.a;
                arrayList1.add(bwqk0.b);
                if("LocalBusiness".equals(bwqk0.b)) {
                    arrayList1.add("DigitalDocument");
                }
                if("DigitalDocument".equals(bwqk0.b)) {
                    arrayList1.add("LocalBusiness");
                }
                set1 = bwqt.f(set0, arrayList1);
                hashSet2 = hashSet1;
            }
            if(hashSet2 != null) {
                hashSet2.addAll(set1);
                hashSet2.add(bwsa0);
            }
            for(Object object2: list0) {
                Thing thing0 = (Thing)object2;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("uri", thing0.d);
                contentValues2.put("action", "del");
                for(Object object3: set1) {
                    sQLiteDatabase0.insertOrThrow(bwtd.c(((bwsa)object3).e()), null, contentValues2);
                }
                contentValues2.put("action", "add");
                contentValues2.put("doc_score", Integer.valueOf(thing0.c.b));
                contentValues2.put("created_timestamp", Long.valueOf(System.currentTimeMillis()));
                contentValues2.put("section_thing_proto", bwth.c(thing0));
                for(Object object4: bwsa0.a.d) {
                    bwqj bwqj0 = (bwqj)object4;
                    List list1 = bwtc.g(thing0, bwqj0.b);
                    if(!list1.isEmpty()) {
                        contentValues2.put("section_" + bwqj0.b, TextUtils.join("\u0000", list1));
                    }
                }
                sQLiteDatabase0.insertOrThrow(bwtd.c(bwsa0.e()), null, contentValues2);
            }
            iterator0 = iterator2;
            hashSet0 = hashSet1;
            continue;
        }
        return hashSet0 == null ? new bwsg(bwqs.a(sQLiteDatabase0, bwud0.e, bwtc0), this.a.keySet()) : new bwsg(hashSet0, this.a.keySet());
    }

    @Override  // bwsi
    public final void h(bwmx bwmx0, bwud bwud0, bwrc bwrc0) {
        bwst.d(bwmx0, "update");
        gftb.z(this.a, "execute called without validateInput");
        bwrv.a(bwmx0.b, this.a);
        for(Object object0: this.a.keySet()) {
            bwqw.a(bwmx0, bwud0, ((bwsa)object0));
        }
        for(Object object1: this.a.entrySet()) {
            bwsa bwsa0 = (bwsa)((Map.Entry)object1).getKey();
            for(Object object2: ((List)((Map.Entry)object1).getValue())) {
                hlne hlne0 = bwth.b(((Thing)object2));
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwlq.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bwlu.a).v_newBuilder();
                String s = bwsa0.b;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                bwlu bwlu0 = (bwlu)hftp1.b_message;
                s.getClass();
                bwlu0.c = s;
                String s1 = bwsa0.c();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((bwlu)hftv0).d = s1;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                bwlu bwlu1 = (bwlu)hftp1.b_message;
                hlne0.getClass();
                bwlu1.e = hlne0;
                bwlu1.b |= 1;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bwlq bwlq0 = (bwlq)hftp0.b_message;
                bwlu bwlu2 = (bwlu)hftp1.N_build();
                bwlu2.getClass();
                bwlq0.c = bwlu2;
                bwlq0.b = 1;
                long v = this.c;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((bwlq)hftp0.b_message).d = v;
                int v1 = bwud0.a();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((bwlq)hftp0.b_message).e = v1;
                bwrc0.a(((bwlq)hftp0.N_build()));
            }
        }
    }

    @Override  // bwsi
    public final void i(bwud bwud0, bwmx bwmx0, bwtc bwtc0) {
        String s = bwud0.e;
        Thing[] arr_thing = this.b;
        bwsz.c(arr_thing, s, bwmx0.b, false, bwtc0);
        if(arr_thing == null) {
            return;
        }
        if(goqs.a(3)) {
            for(int v = 0; v < arr_thing.length; ++v) {
                goqs.b(String.format(Locale.US, "Update Indexable %d / %d", ((int)(v + 1)), ((int)arr_thing.length)));
                goqs.b(arr_thing[v].toString());
            }
        }
        this.a = bwsb.b(arr_thing, s, bwtc0);
    }
}


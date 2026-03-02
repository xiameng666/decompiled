import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class crkk extends crqc implements crct {
    public final Map a;
    final Map b;
    final Map c;
    final Map d;
    public final Map e;
    public final Map f;
    final byk g;
    public final Map h;
    public final Map i;
    final crki j;
    private final Map k;

    public crkk(crqq crqq0) {
        super(crqq0);
        this.a = new bxd();
        this.b = new bxd();
        this.c = new bxd();
        this.d = new bxd();
        this.e = new bxd();
        this.k = new bxd();
        this.h = new bxd();
        this.i = new bxd();
        this.f = new bxd();
        this.g = new crkh(this);
        this.j = new crki(this);
    }

    @Override  // crct
    public final String a(String s, String s1) {
        this.n();
        this.h(s);
        Map map0 = (Map)this.a.get(s);
        return map0 == null ? null : ((String)map0.get(s1));
    }

    @Override  // crqc
    protected final void aM() {
    }

    final crly b(String s, crma crma0) {
        this.n();
        this.h(s);
        crrv crrv0 = this.c(s);
        if(crrv0 == null) {
            return crly.a;
        }
        for(Object object0: crrv0.g) {
            crro crro0 = (crro)object0;
            if(crkk.u((crrt.a(crro0.b) == 0 ? 1 : crrt.a(crro0.b))) == crma0) {
                switch((crrr.a(crro0.c) == 0 ? 1 : crrr.a(crro0.c)) - 1) {
                    case 1: {
                        return crly.d;
                    }
                    case 2: {
                        return crly.c;
                    }
                    default: {
                        return crly.a;
                    }
                }
            }
        }
        return crly.a;
    }

    final crrv c(String s) {
        this.n();
        this.h(s);
        crry crry0 = this.d(s);
        if(crry0 != null && (crry0.b & 0x80) != 0) {
            return crry0.k == null ? crrv.a : crry0.k;
        }
        return null;
    }

    protected final crry d(String s) {
        this.aA();
        this.n();
        batl.q(s);
        this.h(s);
        return (crry)this.e.get(s);
    }

    public final crry e(String s, byte[] arr_b) {
        if(arr_b != null) {
            try {
                crry crry0 = (crry)((ProtoLiteBuilder)crqt.o(((Builder)((ProtoLiteMessage)crry.a).v_newBuilder()), arr_b)).N_build();
                crjg crjg0 = this.aJ().k;
                String s1 = null;
                Long long0 = (crry0.b & 1) == 0 ? null : ((long)crry0.c);
                if((crry0.b & 2) != 0) {
                    s1 = crry0.d;
                }
                crjg0.c("Parsed config. version, gmp_app_id", long0, s1);
                return crry0;
            }
            catch(hfur hfur0) {
                this.aJ().f.c("Unable to merge remote config. appId", crji.a(s), hfur0);
                return crry.a;
            }
            catch(RuntimeException runtimeException0) {
                this.aJ().f.c("Unable to merge remote config. appId", crji.a(s), runtimeException0);
                return crry.a;
            }
        }
        return crry.a;
    }

    final String f(String s) {
        this.n();
        this.h(s);
        return (String)this.k.get(s);
    }

    protected final void g(String s) {
        this.n();
        this.h.put(s, null);
    }

    public final void h(String s) {
        this.aA();
        this.n();
        batl.q(s);
        Map map0 = this.e;
        if(map0.get(s) == null) {
            crdb crdb0 = this.at().k(s);
            if(crdb0 == null) {
                this.a.put(s, null);
                this.c.put(s, null);
                this.b.put(s, null);
                this.d.put(s, null);
                map0.put(s, null);
                this.k.put(s, null);
                this.h.put(s, null);
                this.i.put(s, null);
                this.f.put(s, null);
                return;
            }
            crry crry0 = this.e(s, crdb0.a);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)crry0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)crry0));
            this.w(s, hftp0);
            Map map1 = crkk.v(((crry)hftp0.N_build()));
            this.a.put(s, map1);
            map0.put(s, ((crry)hftp0.N_build()));
            this.i(s, ((crry)hftp0.N_build()));
            this.k.put(s, ((crry)hftp0.b_message).j);
            this.h.put(s, crdb0.b);
            this.i.put(s, crdb0.c);
        }
    }

    public final void i(String s, crry crry0) {
        vzw vzw0;
        if(crry0.h.size() == 0) {
            this.g.f(s);
            return;
        }
        this.aJ().k.b("EES programs found", Integer.valueOf(crry0.h.size()));
        crtj crtj0 = (crtj)crry0.h.get(0);
        try {
            vys vys0 = new vys();
            vys0.a("internal.remoteConfig", new crkd(this, s));
            vys0.a("internal.appMetadata", new crke(this, s));
            vys0.a("internal.logger", new crkf(this));
            try {
                vyv vyv0 = vys0.a;
                vys0.b = vyv0.a();
                if((vyv0.b(vys0.b, ((crtm[])crtj0.b.toArray(new crtm[0]))) instanceof vzu)) {
                    throw new IllegalStateException("Program loading failed");
                }
                Iterator iterator0 = (crtj0.c == null ? crth.a : crtj0.c).b.iterator();
                while(true) {
                label_14:
                    if(!iterator0.hasNext()) {
                        goto label_39;
                    }
                    Object object0 = iterator0.next();
                    hfuo hfuo0 = ((crti)object0).c;
                    String s1 = ((crti)object0).b;
                    for(Object object1: hfuo0) {
                        wad wad0 = vyv0.b(vys0.b, new crtm[]{((crtm)object1)});
                        if(!(wad0 instanceof waa)) {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                        vyw vyw0 = vys0.b;
                        if(vyw0.h(s1)) {
                            wad wad1 = vyw0.d(s1);
                            if(!(wad1 instanceof vzw)) {
                                throw new IllegalStateException("Invalid function name: " + s1);
                            }
                            vzw0 = (vzw)wad1;
                        }
                        else {
                            vzw0 = null;
                        }
                        if(vzw0 == null) {
                            throw new IllegalStateException("Rule function is undefined: " + s1);
                        }
                        vzw0.a(vys0.b, Collections.singletonList(wad0));
                    }
                }
            }
            catch(Throwable throwable0) {
                throw new vyt(throwable0);
            }
            goto label_14;
        label_39:
            this.g.e(s, vys0);
            this.aJ().k.c("EES program loaded for appId, activities", s, Integer.valueOf((crtj0.c == null ? crth.a : crtj0.c).b.size()));
            for(Object object2: (crtj0.c == null ? crth.a : crtj0.c).b) {
                this.aJ().k.b("EES program activity", ((crti)object2).b);
            }
        }
        catch(vyt unused_ex) {
            this.aJ().c.b("Failed to load EES program. appId", s);
        }
    }

    final boolean j(String s) {
        return "1".equals(this.a(s, "measurement.upload.blacklist_internal"));
    }

    final boolean k(String s, crma crma0) {
        this.n();
        this.h(s);
        crrv crrv0 = this.c(s);
        if(crrv0 == null) {
            return false;
        }
        for(Object object0: crrv0.c) {
            crro crro0 = (crro)object0;
            if(crma0 == crkk.u((crrt.a(crro0.b) == 0 ? 1 : crrt.a(crro0.b)))) {
                return crrr.a(crro0.c) == 2;
            }
        }
        return false;
    }

    final boolean l(String s) {
        this.n();
        this.h(s);
        crrv crrv0 = this.c(s);
        return crrv0 == null ? true : (crrv0.b & 1) == 0 || crrv0.f;
    }

    final boolean o(String s, String s1) {
        this.n();
        this.h(s);
        if("ecommerce_purchase".equals(s1)) {
            return true;
        }
        if(!"purchase".equals(s1) && !"refund".equals(s1)) {
            Map map0 = (Map)this.d.get(s);
            if(map0 != null) {
                Boolean boolean0 = (Boolean)map0.get(s1);
                return boolean0 == null ? false : boolean0.booleanValue();
            }
            return false;
        }
        return true;
    }

    final boolean p(String s, String s1) {
        this.n();
        this.h(s);
        if(this.j(s) && crqx.ac(s1)) {
            return true;
        }
        if(this.q(s) && crqx.ad(s1)) {
            return true;
        }
        Map map0 = (Map)this.c.get(s);
        if(map0 != null) {
            Boolean boolean0 = (Boolean)map0.get(s1);
            return boolean0 == null ? false : boolean0.booleanValue();
        }
        return false;
    }

    final boolean q(String s) {
        return "1".equals(this.a(s, "measurement.upload.blacklist_public"));
    }

    protected final boolean r(String s, byte[] arr_b, String s1, String s2) {
        byte[] arr_b3;
        int v6;
        Iterator iterator4;
        SQLiteDatabase sQLiteDatabase2;
        Iterator iterator3;
        Iterator iterator1;
        int v5;
        crre crre3;
        Iterator iterator0;
        int v2;
        this.aA();
        this.n();
        batl.q(s);
        crry crry0 = this.e(s, arr_b);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)crry0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)crry0));
        this.w(s, hftp0);
        this.i(s, ((crry)hftp0.N_build()));
        crry crry1 = (crry)hftp0.N_build();
        this.e.put(s, crry1);
        this.k.put(s, ((crry)hftp0.b_message).j);
        this.h.put(s, s1);
        this.i.put(s, s2);
        Map map0 = crkk.v(((crry)hftp0.N_build()));
        this.a.put(s, map0);
        crdg crdg0 = this.at();
        ArrayList arrayList0 = new ArrayList(DesugarCollections.unmodifiableList(((crry)hftp0.b_message).g));
        int v = 0;
        while(v < arrayList0.size()) {
            crre crre0 = (crre)arrayList0.get(v);
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)crre0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)crre0));
            if(((crre)hftp1.b_message).e.size() != 0) {
                int v1 = 0;
                while(v1 < ((crre)hftp1.b_message).e.size()) {
                    crrf crrf0 = (crrf)((crre)hftp1.b_message).e.get(v1);
                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)crrf0).jf(5, null);
                    hftp2.X(((ProtoLiteMessage)crrf0));
                    ProtoLiteBuilder hftp3 = hftp2.M_clone();
                    String s3 = crmc.b(((crrf)hftp2.b_message).d);
                    if(s3 == null) {
                        v2 = 0;
                    }
                    else {
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        crrf crrf1 = (crrf)hftp3.b_message;
                        crrf1.b |= 2;
                        crrf1.d = s3;
                        v2 = 1;
                    }
                    int v3 = 0;
                    while(v3 < ((crrf)hftp2.b_message).e.size()) {
                        crrg crrg0 = (crrg)((crrf)hftp2.b_message).e.get(v3);
                        String s4 = crnr.b(crrg0.f, crmd.a, crmd.b);
                        if(s4 == null) {
                            v2 = v2;
                        }
                        else {
                            ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)crrg0).jf(5, null);
                            hftp4.X(((ProtoLiteMessage)crrg0));
                            if(!hftp4.b_message.isImmutable()) {
                                hftp4.ensureMutable();
                            }
                            crrg crrg1 = (crrg)hftp4.b_message;
                            crrg1.b |= 8;
                            crrg1.f = s4;
                            crrg crrg2 = (crrg)hftp4.N_build();
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            crrf crrf2 = (crrf)hftp3.b_message;
                            crrg2.getClass();
                            hfuo hfuo0 = crrf2.e;
                            if(!hfuo0.c()) {
                                crrf2.e = ProtoLiteMessage.E(hfuo0);
                            }
                            crrf2.e.set(v3, crrg2);
                            v2 = 1;
                        }
                        ++v3;
                        hftp2 = hftp2;
                        hftp0 = hftp0;
                    }
                    if(v2 != 0) {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        crre crre1 = (crre)hftp1.b_message;
                        crrf crrf3 = (crrf)hftp3.N_build();
                        crrf3.getClass();
                        hfuo hfuo1 = crre1.e;
                        if(!hfuo1.c()) {
                            crre1.e = ProtoLiteMessage.E(hfuo1);
                        }
                        crre1.e.set(v1, crrf3);
                        arrayList0.set(v, ((crre)hftp1.N_build()));
                    }
                    ++v1;
                    hftp0 = hftp0;
                }
            }
            if(((crre)hftp1.b_message).d.size() != 0) {
                for(int v4 = 0; v4 < ((crre)hftp1.b_message).d.size(); ++v4) {
                    crrk crrk0 = (crrk)((crre)hftp1.b_message).d.get(v4);
                    String s5 = crnr.b(crrk0.d, crme.a, crme.b);
                    if(s5 != null) {
                        ProtoLiteBuilder hftp5 = (ProtoLiteBuilder)((ProtoLiteMessage)crrk0).jf(5, null);
                        hftp5.X(((ProtoLiteMessage)crrk0));
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        crrk crrk1 = (crrk)hftp5.b_message;
                        crrk1.b |= 2;
                        crrk1.d = s5;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        crre crre2 = (crre)hftp1.b_message;
                        crrk crrk2 = (crrk)hftp5.N_build();
                        crrk2.getClass();
                        hfuo hfuo2 = crre2.d;
                        if(!hfuo2.c()) {
                            crre2.d = ProtoLiteMessage.E(hfuo2);
                        }
                        crre2.d.set(v4, crrk2);
                        arrayList0.set(v, ((crre)hftp1.N_build()));
                    }
                }
            }
            ++v;
            hftp0 = hftp0;
        }
        crdg0.aA();
        crdg0.n();
        batl.q(s);
        SQLiteDatabase sQLiteDatabase0 = crdg0.g();
        sQLiteDatabase0.beginTransaction();
        try {
            crdg0.aA();
            crdg0.n();
            batl.q(s);
            SQLiteDatabase sQLiteDatabase1 = crdg0.g();
            sQLiteDatabase1.delete("property_filters", "app_id=?", new String[]{s});
            sQLiteDatabase1.delete("event_filters", "app_id=?", new String[]{s});
            iterator0 = arrayList0.iterator();
        alab1:
            while(true) {
            label_121:
                if(!iterator0.hasNext()) {
                    goto label_221;
                }
                Object object0 = iterator0.next();
                crre3 = (crre)object0;
                crdg0.aA();
                crdg0.n();
                batl.q(s);
                batl.s(crre3);
                if((crre3.b & 1) == 0) {
                    goto label_215;
                }
                else {
                    v5 = crre3.c;
                    iterator1 = crre3.e.iterator();
                    while(true) {
                    label_131:
                        if(!iterator1.hasNext()) {
                            for(Object object1: crre3.d) {
                                if((((crrk)object1).b & 1) == 0) {
                                    crdg0.aJ().f.c("Property filter with no ID. Audience definition ignored. appId, audienceId", crji.a(s), Integer.valueOf(v5));
                                    continue alab1;
                                }
                            }
                            iterator3 = crre3.e.iterator();
                            while(true) {
                            label_140:
                                sQLiteDatabase2 = sQLiteDatabase0;
                                if(iterator3.hasNext()) {
                                    break alab1;
                                }
                                goto label_172;
                            }
                        }
                        goto label_208;
                    }
                }
                sQLiteDatabase0 = sQLiteDatabase2;
                iterator0 = iterator4;
            }
        }
        catch(Throwable throwable0) {
            sQLiteDatabase2 = sQLiteDatabase0;
            sQLiteDatabase2.endTransaction();
            throw throwable0;
        }
        try {
            Object object2 = iterator3.next();
            crrf crrf4 = (crrf)object2;
            crdg0.aA();
            crdg0.n();
            batl.q(s);
            batl.s(crrf4);
            iterator4 = iterator0;
            if(crrf4.d.isEmpty()) {
                crdg0.aJ().f.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", crji.a(s), Integer.valueOf(v5), String.valueOf(((crrf4.b & 1) == 0 ? null : ((int)crrf4.c))));
                v6 = v5;
                goto label_198;
            }
            byte[] arr_b1 = crrf4.toBytesArray();
            v6 = v5;
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("app_id", s);
            contentValues0.put("audience_id", Integer.valueOf(v6));
            contentValues0.put("filter_id", ((crrf4.b & 1) == 0 ? null : ((int)crrf4.c)));
            contentValues0.put("event_name", crrf4.d);
            contentValues0.put("session_scoped", ((crrf4.b & 0x40) == 0 ? null : Boolean.valueOf(crrf4.i)));
            contentValues0.put("data", arr_b1);
            try {
                if(crdg0.g().insertWithOnConflict("event_filters", null, contentValues0, 5) == -1L) {
                    crdg0.aJ().c.b("Failed to insert event filter (got -1). appId", crji.a(s));
                }
            }
            catch(SQLiteException sQLiteException0) {
                crdg0.aJ().c.c("Error storing event filter. appId", crji.a(s), sQLiteException0);
                goto label_198;
            }
        }
        catch(Throwable throwable0) {
            sQLiteDatabase2.endTransaction();
            throw throwable0;
        }
        try {
            sQLiteDatabase0 = sQLiteDatabase2;
            iterator0 = iterator4;
            v5 = v6;
            goto label_140;
        }
        catch(Throwable throwable0) {
            sQLiteDatabase2 = sQLiteDatabase0;
            sQLiteDatabase2.endTransaction();
            throw throwable0;
        }
        try {
        label_172:
            iterator4 = iterator0;
            v6 = v5;
            Iterator iterator5 = crre3.d.iterator();
            while(iterator5.hasNext()) {
                Object object3 = iterator5.next();
                crrk crrk3 = (crrk)object3;
                crdg0.aA();
                crdg0.n();
                batl.q(s);
                batl.s(crrk3);
                if(crrk3.d.isEmpty()) {
                    crdg0.aJ().f.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", crji.a(s), Integer.valueOf(v6), String.valueOf(((crrk3.b & 1) == 0 ? null : ((int)crrk3.c))));
                    goto label_198;
                }
                else {
                    byte[] arr_b2 = crrk3.toBytesArray();
                    ContentValues contentValues1 = new ContentValues();
                    contentValues1.put("app_id", s);
                    contentValues1.put("audience_id", Integer.valueOf(v6));
                    contentValues1.put("filter_id", ((crrk3.b & 1) == 0 ? null : ((int)crrk3.c)));
                    contentValues1.put("property_name", crrk3.d);
                    contentValues1.put("session_scoped", ((crrk3.b & 0x20) == 0 ? null : Boolean.valueOf(crrk3.h)));
                    contentValues1.put("data", arr_b2);
                    try {
                        if(crdg0.g().insertWithOnConflict("property_filters", null, contentValues1, 5) == -1L) {
                            crdg0.aJ().c.b("Failed to insert property filter (got -1). appId", crji.a(s));
                            goto label_198;
                        }
                        else {
                            iterator5 = iterator5;
                            continue;
                        }
                        break;
                    }
                    catch(SQLiteException sQLiteException1) {
                        crdg0.aJ().c.c("Error storing property filter. appId", crji.a(s), sQLiteException1);
                    }
                label_198:
                    crdg0.aA();
                    crdg0.n();
                    batl.q(s);
                    SQLiteDatabase sQLiteDatabase3 = crdg0.g();
                    sQLiteDatabase3.delete("property_filters", "app_id=? and audience_id=?", new String[]{s, String.valueOf(v6)});
                    sQLiteDatabase3.delete("event_filters", "app_id=? and audience_id=?", new String[]{s, String.valueOf(v6)});
                    break;
                }
                break;
            }
        }
        catch(Throwable throwable0) {
            sQLiteDatabase2.endTransaction();
            throw throwable0;
        }
        sQLiteDatabase0 = sQLiteDatabase2;
        iterator0 = iterator4;
        goto label_121;
        try {
        label_208:
            Object object4 = iterator1.next();
            if((((crrf)object4).b & 1) != 0) {
                goto label_131;
            }
            crdg0.aJ().f.c("Event filter with no ID. Audience definition ignored. appId, audienceId", crji.a(s), Integer.valueOf(v5));
            goto label_121;
        }
        catch(Throwable throwable0) {
            sQLiteDatabase2 = sQLiteDatabase0;
            sQLiteDatabase2.endTransaction();
            throw throwable0;
        }
        try {
        label_215:
            sQLiteDatabase2 = sQLiteDatabase0;
            iterator4 = iterator0;
            crdg0.aJ().f.b("Audience with no ID. appId", crji.a(s));
            sQLiteDatabase0 = sQLiteDatabase2;
            iterator0 = iterator4;
            goto label_121;
        label_221:
            sQLiteDatabase2 = sQLiteDatabase0;
            ArrayList arrayList1 = new ArrayList();
            for(Object object5: arrayList0) {
                crre crre4 = (crre)object5;
                arrayList1.add(((crre4.b & 1) == 0 ? null : ((int)crre4.c)));
            }
            batl.q(s);
            crdg0.aA();
            crdg0.n();
            SQLiteDatabase sQLiteDatabase4 = crdg0.g();
            try {
                long v7 = crdg0.e("select count(1) from audience_filter_values where app_id=?", new String[]{s});
            }
            catch(SQLiteException sQLiteException2) {
                crdg0.aJ().c.c("Database error querying filters. appId", crji.a(s), sQLiteException2);
                sQLiteDatabase2.setTransactionSuccessful();
                goto label_255;
            }
            int v8 = Math.max(0, Math.min(2000, crdg0.am().f(s, crif.T)));
            if(v7 > ((long)v8)) {
                ArrayList arrayList2 = new ArrayList();
                for(int v9 = 0; true; ++v9) {
                    if(v9 >= arrayList1.size()) {
                        sQLiteDatabase4.delete("audience_filter_values", a.a(a.T(arrayList2, "(", ",", ")"), "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", " order by rowid desc limit -1 offset ?)"), new String[]{s, Integer.toString(v8)});
                        sQLiteDatabase2.setTransactionSuccessful();
                        break;
                    }
                    Integer integer0 = (Integer)arrayList1.get(v9);
                    if(integer0 == null) {
                        sQLiteDatabase2.setTransactionSuccessful();
                        break;
                    }
                    arrayList2.add(Integer.toString(integer0.intValue()));
                }
            }
            else {
                sQLiteDatabase2.setTransactionSuccessful();
            }
        }
        catch(Throwable throwable0) {
            sQLiteDatabase2.endTransaction();
            throw throwable0;
        }
    label_255:
        sQLiteDatabase2.endTransaction();
        try {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((crry)hftp0.b_message).g = hfvv.a;
            arr_b3 = ((crry)hftp0.N_build()).toBytesArray();
        }
        catch(RuntimeException runtimeException0) {
            this.aJ().f.c("Unable to serialize reduced-size config. Storing full config instead. appId", crji.a(s), runtimeException0);
            arr_b3 = arr_b;
        }
        crdg crdg1 = this.at();
        batl.q(s);
        crdg1.n();
        crdg1.aA();
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("remote_config", arr_b3);
        contentValues2.put("config_last_modified_time", s1);
        contentValues2.put("e_tag", s2);
        try {
            if(((long)crdg1.g().update("apps", contentValues2, "app_id = ?", new String[]{s})) == 0L) {
                crdg1.aJ().c.b("Failed to update remote config (got 0). appId", crji.a(s));
            }
        }
        catch(SQLiteException sQLiteException3) {
            crdg1.aJ().c.c("Error storing remote config. appId", crji.a(s), sQLiteException3);
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((crry)hftp0.b_message).h = hfvv.a;
        crry crry2 = (crry)hftp0.N_build();
        this.e.put(s, crry2);
        return true;
    }

    final boolean s(String s) {
        this.n();
        this.h(s);
        return this.b.get(s) != null && ((Set)this.b.get(s)).contains("app_instance_id");
    }

    final boolean t(String s) {
        this.n();
        this.h(s);
        return this.b.get(s) == null ? false : ((Set)this.b.get(s)).contains("os_version") || ((Set)this.b.get(s)).contains("device_info");
    }

    public static final crma u(int v) {
        switch(v - 1) {
            case 1: {
                return crma.a;
            }
            case 2: {
                return crma.b;
            }
            case 3: {
                return crma.c;
            }
            case 4: {
                return crma.d;
            }
            default: {
                return null;
            }
        }
    }

    private static final Map v(crry crry0) {
        Map map0 = new bxd();
        if(crry0 != null) {
            for(Object object0: crry0.e) {
                map0.put(((crrz)object0).b, ((crrz)object0).c);
            }
        }
        return map0;
    }

    private final void w(String s, ProtoLiteBuilder hftp0) {
        HashSet hashSet0 = new HashSet();
        bxd bxd0 = new bxd();
        bxd bxd1 = new bxd();
        bxd bxd2 = new bxd();
        if(hftp0 != null) {
            for(Object object0: DesugarCollections.unmodifiableList(((crry)hftp0.b_message).i)) {
                hashSet0.add(((crrw)object0).b);
            }
            for(int v = 0; v < ((crry)hftp0.b_message).f.size(); ++v) {
                crrx crrx0 = (crrx)((crry)hftp0.b_message).f.get(v);
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)crrx0).jf(5, null);
                hftp1.X(((ProtoLiteMessage)crrx0));
                if(((crrx)hftp1.b_message).c.isEmpty()) {
                    this.aJ().f.a("EventConfig contained null event name");
                }
                else {
                    String s1 = ((crrx)hftp1.b_message).c;
                    String s2 = crmc.b(s1);
                    if(!TextUtils.isEmpty(s2)) {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        crrx crrx1 = (crrx)hftp1.b_message;
                        s2.getClass();
                        crrx1.b |= 1;
                        crrx1.c = s2;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        crry crry0 = (crry)hftp0.b_message;
                        crrx crrx2 = (crrx)hftp1.N_build();
                        crrx2.getClass();
                        hfuo hfuo0 = crry0.f;
                        if(!hfuo0.c()) {
                            crry0.f = ProtoLiteMessage.E(hfuo0);
                        }
                        crry0.f.set(v, crrx2);
                    }
                    crrx crrx3 = (crrx)hftp1.b_message;
                    if((crrx3.b & 2) != 0 && crrx3.d) {
                        bxd0.put(s1, Boolean.valueOf(true));
                    }
                    crrx crrx4 = (crrx)hftp1.b_message;
                    if((crrx4.b & 4) != 0 && crrx4.e) {
                        bxd1.put(crrx4.c, Boolean.valueOf(true));
                    }
                    crrx crrx5 = (crrx)hftp1.b_message;
                    if((crrx5.b & 8) != 0) {
                        int v1 = crrx5.f;
                        if(v1 >= 2 && v1 <= 0xFFFF) {
                            bxd2.put(crrx5.c, Integer.valueOf(v1));
                        }
                        else {
                            this.aJ().f.c("Invalid sampling rate. Event name, sample rate", ((crrx)hftp1.b_message).c, Integer.valueOf(((crrx)hftp1.b_message).f));
                        }
                    }
                }
            }
        }
        this.b.put(s, hashSet0);
        this.c.put(s, bxd0);
        this.d.put(s, bxd1);
        this.f.put(s, bxd2);
    }
}


import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.TWR;

final class crcm extends crqc {
    private String a;
    private Set b;
    private Map c;
    private Long d;

    public crcm(crqq crqq0) {
        super(crqq0);
    }

    @Override  // crqc
    protected final void aM() {
    }

    // This method was un-flattened
    final List b(String s, List list0, List list1, Long long0, boolean z) {
        Boolean boolean0;
        Iterator iterator17;
        int v6;
        String s12;
        Iterator iterator16;
        Map map7;
        List list9;
        crjg crjg0;
        crrk crrk0;
        Cursor cursor6;
        Iterator iterator13;
        Cursor cursor5;
        long v4;
        crdn crdn2;
        Iterator iterator11;
        Map map5;
        List list6;
        Integer integer3;
        bxd bxd5;
        crrf crrf0;
        Cursor cursor4;
        Cursor cursor3;
        crso crso2;
        Cursor cursor2;
        Iterator iterator8;
        crci crci1;
        crdn crdn1;
        Map map3;
        Cursor cursor1;
        Map map1;
        crsx crsx0;
        Map map0;
        Cursor cursor0;
        boolean z1 = false;
        batl.q(s);
        batl.s(list0);
        batl.s(list1);
        this.a = s;
        this.b = new HashSet();
        this.c = new bxd();
        this.d = long0;
        for(Object object0: list0) {
            if("_s".equals(((crso)object0).d)) {
                z1 = true;
                break;
            }
        }
        if(z1) {
            crdg crdg0 = this.at();
            String s1 = this.a;
            crdg0.aA();
            crdg0.n();
            batl.q(s1);
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("current_session_count", Integer.valueOf(0));
            try {
                crdg0.g().update("events", contentValues0, "app_id = ?", new String[]{s1});
            }
            catch(SQLiteException sQLiteException0) {
                crdg0.aJ().c.c("Error resetting session-scoped event counts. appId", crji.a(s1), sQLiteException0);
            }
        }
        crdg crdg1 = this.at();
        String s2 = this.a;
        crdg1.aA();
        crdg1.n();
        batl.q(s2);
        SQLiteDatabase sQLiteDatabase0 = crdg1.g();
        try {
            cursor0 = null;
            cursor0 = sQLiteDatabase0.query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{s2}, null, null, null);
            goto label_37;
        }
        catch(SQLiteException sQLiteException1) {
            goto label_53;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
        label_37:
            if(cursor0.moveToFirst()) {
                map0 = new bxd();
                while(true) {
                    int v = cursor0.getInt(0);
                    byte[] arr_b = cursor0.getBlob(1);
                    try {
                        crsx0 = (crsx)((ProtoLiteBuilder)(((crsw)crqt.o(((Builder)(((crsw)((ProtoLiteMessage)crsx.a).v_newBuilder()))), arr_b)))).N_build();
                    }
                    catch(IOException iOException0) {
                        crdg1.aJ().c.d("Failed to merge filter results. appId, audienceId, error", crji.a(s2), Integer.valueOf(v), iOException0);
                        goto label_47;
                    }
                    map0.put(Integer.valueOf(v), crsx0);
                label_47:
                    if(cursor0.moveToNext()) {
                        continue;
                    }
                    goto label_48;
                }
            }
            else {
                goto label_50;
            }
            goto label_62;
        }
        catch(SQLiteException sQLiteException1) {
            goto label_53;
        }
        catch(Throwable throwable0) {
            goto label_58;
        }
    label_48:
        cursor0.close();
        goto label_62;
        try {
            try {
            label_50:
                map1 = Collections.EMPTY_MAP;
            }
            catch(SQLiteException sQLiteException1) {
            label_53:
                crdg1.aJ().c.c("Database error querying filter results. appId", crji.a(s2), sQLiteException1);
                map1 = Collections.EMPTY_MAP;
                if(cursor0 != null) {
                    goto label_60;
                }
                goto label_61;
            }
        }
        catch(Throwable throwable0) {
        label_58:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_60:
        cursor0.close();
    label_61:
        map0 = map1;
    label_62:
        if(!map0.isEmpty()) {
            HashSet hashSet0 = new HashSet(map0.keySet());
            if(z1) {
                String s3 = this.a;
                crdg crdg2 = this.at();
                String s4 = this.a;
                crdg2.aA();
                crdg2.n();
                batl.q(s4);
                Map map2 = new bxd();
                SQLiteDatabase sQLiteDatabase1 = crdg2.g();
                try {
                    cursor1 = null;
                    cursor1 = sQLiteDatabase1.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{s4, s4});
                    goto label_79;
                }
                catch(SQLiteException sQLiteException2) {
                    goto label_91;
                }
                catch(Throwable throwable1) {
                }
                TWR.safeClose$NT(null, throwable1);
                throw throwable1;
                try {
                label_79:
                    if(cursor1.moveToFirst()) {
                        do {
                            Integer integer0 = cursor1.getInt(0);
                            List list2 = (List)map2.get(integer0);
                            if(list2 == null) {
                                list2 = new ArrayList();
                                map2.put(integer0, list2);
                            }
                            list2.add(Integer.valueOf(cursor1.getInt(1)));
                        }
                        while(cursor1.moveToNext());
                        goto label_99;
                    }
                    else {
                        try {
                            try {
                                map2 = Collections.EMPTY_MAP;
                                goto label_99;
                            }
                            catch(SQLiteException sQLiteException2) {
                            }
                        label_91:
                            crdg2.aJ().c.c("Database error querying scoped filters. appId", crji.a(s4), sQLiteException2);
                            map2 = Collections.EMPTY_MAP;
                            if(cursor1 != null) {
                                goto label_94;
                            }
                        }
                        catch(Throwable throwable1) {
                            goto label_97;
                        }
                    }
                    goto label_100;
                }
                catch(SQLiteException sQLiteException2) {
                    goto label_91;
                }
                catch(Throwable throwable1) {
                    goto label_97;
                }
            label_94:
                cursor1.close();
                goto label_100;
            label_97:
                TWR.safeClose$NT(cursor1, throwable1);
                throw throwable1;
            label_99:
                cursor1.close();
            label_100:
                batl.q(s3);
                batl.s(map0);
                bxd bxd0 = new bxd();
                if(!map0.isEmpty()) {
                    for(Object object1: map0.keySet()) {
                        Integer integer1 = (Integer)object1;
                        crsx crsx1 = (crsx)map0.get(integer1);
                        List list3 = (List)map2.get(integer1);
                        if(list3 != null && !list3.isEmpty()) {
                            List list4 = this.aw().q(crsx1.c, list3);
                            if(list4.isEmpty()) {
                                continue;
                            }
                            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)crsx1).jf(5, null);
                            hftp0.X(((ProtoLiteMessage)crsx1));
                            crsw crsw0 = (crsw)hftp0;
                            if(!crsw0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crsw0).ensureMutable();
                            }
                            hfvb hfvb0 = hfvb.a;
                            ((crsx)crsw0.b_message).c = hfvb0;
                            crsw0.k(list4);
                            List list5 = this.aw().q(crsx1.b, list3);
                            if(!crsw0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crsw0).ensureMutable();
                            }
                            ((crsx)crsw0.b_message).b = hfvb0;
                            crsw0.m(list5);
                            ArrayList arrayList0 = new ArrayList();
                            for(Object object2: crsx1.d) {
                                crsm crsm0 = (crsm)object2;
                                if(!list3.contains(Integer.valueOf(crsm0.c))) {
                                    arrayList0.add(crsm0);
                                }
                            }
                            if(!crsw0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crsw0).ensureMutable();
                            }
                            hfvv hfvv0 = hfvv.a;
                            ((crsx)crsw0.b_message).d = hfvv0;
                            crsw0.a(arrayList0);
                            ArrayList arrayList1 = new ArrayList();
                            for(Object object3: crsx1.e) {
                                crsy crsy0 = (crsy)object3;
                                if(!list3.contains(Integer.valueOf(crsy0.c))) {
                                    arrayList1.add(crsy0);
                                }
                            }
                            if(!crsw0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crsw0).ensureMutable();
                            }
                            ((crsx)crsw0.b_message).e = hfvv0;
                            crsw0.l(arrayList1);
                            bxd0.put(integer1, ((crsx)((ProtoLiteBuilder)crsw0).N_build()));
                        }
                        else {
                            bxd0.put(integer1, crsx1);
                        }
                    }
                }
                map3 = bxd0;
            }
            else {
                map3 = map0;
            }
            for(Object object4: hashSet0) {
                Integer integer2 = (Integer)object4;
                crsx crsx2 = (crsx)map3.get(integer2);
                BitSet bitSet0 = new BitSet();
                BitSet bitSet1 = new BitSet();
                bxd bxd1 = new bxd();
                if(crsx2 != null && crsx2.d.size() != 0) {
                    for(Object object5: crsx2.d) {
                        crsm crsm1 = (crsm)object5;
                        if((crsm1.b & 1) != 0) {
                            bxd1.put(Integer.valueOf(crsm1.c), ((crsm1.b & 2) == 0 ? null : ((long)crsm1.d)));
                        }
                    }
                }
                bxd bxd2 = new bxd();
                if(crsx2 != null && crsx2.e.size() != 0) {
                    for(Object object6: crsx2.e) {
                        crsy crsy1 = (crsy)object6;
                        if((crsy1.b & 1) != 0 && crsy1.d.size() > 0) {
                            bxd2.put(Integer.valueOf(crsy1.c), Long.valueOf(crsy1.d.a(crsy1.d.size() - 1)));
                        }
                    }
                }
                if(crsx2 != null) {
                    for(int v1 = 0; v1 < crsx2.b.size() * 0x40; ++v1) {
                        if(crqt.v(crsx2.b, v1)) {
                            this.aJ().k.c("Filter already evaluated. audience ID, filter ID", integer2, Integer.valueOf(v1));
                            bitSet1.set(v1);
                            if(crqt.v(crsx2.c, v1)) {
                                bitSet0.set(v1);
                                continue;
                            }
                        }
                        bxd1.remove(Integer.valueOf(v1));
                    }
                }
                crch crch0 = new crch(this, ((crsx)map0.get(integer2)), bitSet0, bitSet1, bxd1, bxd2);
                this.c.put(integer2, crch0);
            }
        }
        if(!list0.isEmpty()) {
            crci crci0 = new crci(this);
            bxd bxd3 = new bxd();
            Iterator iterator7 = list0.iterator();
            while(iterator7.hasNext()) {
                Object object7 = iterator7.next();
                crso crso0 = (crso)object7;
                crso crso1 = crci0.a(this.a, crso0);
                if(crso1 != null) {
                    crdg crdg3 = this.at();
                    String s5 = this.a;
                    String s6 = crso1.d;
                    crdn crdn0 = crdg3.o(s5, crso0.d);
                    if(crdn0 == null) {
                        crdg3.aJ().f.c("Event aggregate wasn\'t created during raw event logging. appId, event", crji.a(s5), crdg3.ao().c(s6));
                        crdn1 = new crdn(s5, crso0.d, 1L, 1L, 1L, crso0.e, 0L, null, null, null, null);
                    }
                    else {
                        crdn1 = new crdn(crdn0.a, crdn0.b, crdn0.c + 1L, crdn0.d + 1L, crdn0.e + 1L, crdn0.f, crdn0.g, crdn0.h, crdn0.i, crdn0.j, crdn0.k);
                    }
                    this.at().Q(crdn1);
                    if(!z) {
                        long v2 = crdn1.c;
                        String s7 = crso1.d;
                        Map map4 = (Map)bxd3.get(s7);
                        if(map4 == null) {
                            crdg crdg4 = this.at();
                            crci1 = crci0;
                            String s8 = this.a;
                            crdg4.aA();
                            crdg4.n();
                            batl.q(s8);
                            batl.q(s7);
                            iterator8 = iterator7;
                            bxd bxd4 = new bxd();
                            SQLiteDatabase sQLiteDatabase2 = crdg4.g();
                            try {
                                cursor2 = sQLiteDatabase2.query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{s8, s7}, null, null, null);
                            }
                            catch(SQLiteException sQLiteException3) {
                                crso2 = crso1;
                                cursor3 = null;
                                goto label_286;
                            }
                            catch(Throwable throwable2) {
                                cursor3 = null;
                                goto label_297;
                            }
                            try {
                                if(cursor2.moveToFirst()) {
                                    goto label_247;
                                }
                                else {
                                    goto label_281;
                                }
                                goto label_301;
                            }
                            catch(SQLiteException sQLiteException3) {
                                cursor4 = cursor2;
                                crso2 = crso1;
                                goto label_285;
                            label_247:
                                crso2 = crso1;
                                while(true) {
                                    try {
                                    label_248:
                                        byte[] arr_b1 = cursor2.getBlob(1);
                                        try {
                                            crrf0 = (crrf)((ProtoLiteBuilder)crqt.o(((Builder)((ProtoLiteMessage)crrf.a).v_newBuilder()), arr_b1)).N_build();
                                            goto label_256;
                                        }
                                        catch(IOException iOException1) {
                                        }
                                    }
                                    catch(SQLiteException sQLiteException3) {
                                        goto label_260;
                                    }
                                    catch(Throwable throwable2) {
                                        goto label_263;
                                    }
                                    try {
                                        cursor4 = cursor2;
                                        bxd5 = bxd4;
                                        crdg4.aJ().c.c("Failed to merge filter. appId", crji.a(s8), iOException1);
                                        goto label_274;
                                    }
                                    catch(SQLiteException sQLiteException3) {
                                        goto label_285;
                                    }
                                    catch(Throwable throwable2) {
                                        goto label_296;
                                    }
                                    try {
                                    label_256:
                                        integer3 = cursor2.getInt(0);
                                        list6 = (List)bxd4.get(integer3);
                                        break;
                                    }
                                    catch(SQLiteException sQLiteException3) {
                                    }
                                    catch(Throwable throwable2) {
                                        goto label_263;
                                    }
                                label_260:
                                    cursor4 = cursor2;
                                    goto label_285;
                                }
                            }
                            catch(Throwable throwable2) {
                            label_263:
                                cursor4 = cursor2;
                                goto label_296;
                            }
                            if(list6 == null) {
                                try {
                                    cursor4 = cursor2;
                                    List list7 = new ArrayList();
                                    bxd4.put(integer3, list7);
                                    goto label_272;
                                label_270:
                                    cursor4 = cursor2;
                                    list7 = list6;
                                label_272:
                                    list7.add(crrf0);
                                    bxd5 = bxd4;
                                label_274:
                                    if(!cursor4.moveToNext()) {
                                        goto label_275;
                                    }
                                    goto label_278;
                                }
                                catch(SQLiteException sQLiteException3) {
                                    goto label_285;
                                }
                                catch(Throwable throwable2) {
                                    goto label_296;
                                }
                            }
                            else {
                                goto label_270;
                            }
                            goto label_272;
                        label_275:
                            cursor4.close();
                            map4 = bxd5;
                            goto label_301;
                        label_278:
                            bxd4 = bxd5;
                            cursor2 = cursor4;
                            goto label_248;
                            try {
                            label_281:
                                crso2 = crso1;
                                map4 = Collections.EMPTY_MAP;
                                goto label_300;
                            }
                            catch(SQLiteException sQLiteException3) {
                            label_285:
                                cursor3 = cursor4;
                                try {
                                label_286:
                                    crdg4.aJ().c.c("Database error querying filters. appId", crji.a(s8), sQLiteException3);
                                    map4 = Collections.EMPTY_MAP;
                                }
                                catch(Throwable throwable2) {
                                    TWR.safeClose$NT(cursor3, throwable2);
                                    throw throwable2;
                                }
                                if(cursor3 != null) {
                                    cursor3.close();
                                }
                                goto label_301;
                            }
                            catch(Throwable throwable2) {
                            }
                        label_296:
                            cursor3 = cursor4;
                        label_297:
                            if(cursor3 != null) {
                                cursor3.close();
                            }
                            throw throwable2;
                        label_300:
                            cursor2.close();
                        label_301:
                            bxd3.put(s7, map4);
                        }
                        else {
                            crci1 = crci0;
                            iterator8 = iterator7;
                            crso2 = crso1;
                        }
                        Iterator iterator9 = map4.keySet().iterator();
                        while(iterator9.hasNext()) {
                            Object object8 = iterator9.next();
                            Integer integer4 = (Integer)object8;
                            int v3 = (int)integer4;
                            if(this.b.contains(integer4)) {
                                this.aJ().k.b("Skipping failed audience ID", integer4);
                            }
                            else {
                                boolean z2 = true;
                                for(Object object9: ((List)map4.get(integer4))) {
                                    map5 = map4;
                                    iterator11 = iterator9;
                                    crcj crcj0 = new crcj(this, this.a, v3, ((crrf)object9));
                                    crdn2 = crdn1;
                                    v4 = v2;
                                    z2 = crcj0.c(crso2, v4, crdn2, this.d(v3, ((crrf)object9).c));
                                    if(z2) {
                                        this.c(integer4).b(crcj0);
                                        v2 = v4;
                                        crdn1 = crdn2;
                                        map4 = map5;
                                        iterator9 = iterator11;
                                        continue;
                                    }
                                    this.b.add(integer4);
                                    goto label_337;
                                }
                                map5 = map4;
                                iterator11 = iterator9;
                                crdn2 = crdn1;
                                v4 = v2;
                            label_337:
                                if(!z2) {
                                    this.b.add(integer4);
                                }
                                v2 = v4;
                                crdn1 = crdn2;
                                map4 = map5;
                                iterator9 = iterator11;
                            }
                        }
                        iterator7 = iterator8;
                        crci0 = crci1;
                    }
                }
            }
        }
        if(!z) {
            if(!list1.isEmpty()) {
                bxd bxd6 = new bxd();
                Iterator iterator12 = list1.iterator();
            label_351:
                while(iterator12.hasNext()) {
                    Object object10 = iterator12.next();
                    crtg crtg0 = (crtg)object10;
                    String s9 = crtg0.d;
                    Map map6 = (Map)bxd6.get(s9);
                    if(map6 == null) {
                        crdg crdg5 = this.at();
                        String s10 = this.a;
                        crdg5.aA();
                        crdg5.n();
                        batl.q(s10);
                        batl.q(s9);
                        bxd bxd7 = new bxd();
                        SQLiteDatabase sQLiteDatabase3 = crdg5.g();
                        try {
                            cursor5 = sQLiteDatabase3.query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{s10, s9}, null, null, null);
                        }
                        catch(SQLiteException sQLiteException4) {
                            iterator13 = iterator12;
                            cursor5 = null;
                            goto label_405;
                        }
                        catch(Throwable throwable3) {
                            cursor6 = null;
                            goto label_411;
                        }
                        try {
                            try {
                                if(cursor5.moveToFirst()) {
                                    while(true) {
                                    label_375:
                                        byte[] arr_b2 = cursor5.getBlob(1);
                                        try {
                                            crrk0 = (crrk)((ProtoLiteBuilder)crqt.o(((Builder)((ProtoLiteMessage)crrk.a).v_newBuilder()), arr_b2)).N_build();
                                            goto label_383;
                                        }
                                        catch(IOException iOException2) {
                                        }
                                        crjg0 = crdg5.aJ().c;
                                        iterator13 = iterator12;
                                        goto label_381;
                                    }
                                }
                                else {
                                    goto label_401;
                                }
                                goto label_415;
                            }
                            catch(SQLiteException sQLiteException4) {
                                goto label_399;
                            }
                            try {
                            label_381:
                                crjg0.c("Failed to merge filter", crji.a(s10), iOException2);
                                goto label_392;
                            }
                            catch(SQLiteException sQLiteException4) {
                                goto label_405;
                            }
                            try {
                            label_383:
                                Integer integer5 = cursor5.getInt(0);
                                List list8 = (List)bxd7.get(integer5);
                                if(list8 == null) {
                                    list9 = new ArrayList();
                                    bxd7.put(integer5, list9);
                                }
                                else {
                                    list9 = list8;
                                }
                                list9.add(crrk0);
                                iterator13 = iterator12;
                            }
                            catch(SQLiteException sQLiteException4) {
                                goto label_399;
                            }
                            try {
                            label_392:
                                if(!cursor5.moveToNext()) {
                                    goto label_393;
                                }
                                goto label_396;
                            }
                            catch(SQLiteException sQLiteException4) {
                                goto label_405;
                            }
                        }
                        catch(Throwable throwable3) {
                            goto label_410;
                        }
                    label_393:
                        cursor5.close();
                        map6 = bxd7;
                        goto label_415;
                        try {
                        label_396:
                            iterator12 = iterator13;
                            goto label_375;
                        }
                        catch(SQLiteException sQLiteException4) {
                        label_399:
                            iterator13 = iterator12;
                            goto label_405;
                            try {
                            label_401:
                                iterator13 = iterator12;
                                map6 = Collections.EMPTY_MAP;
                                goto label_414;
                            }
                            catch(SQLiteException sQLiteException4) {
                            }
                            catch(Throwable throwable3) {
                                goto label_410;
                            }
                            try {
                            label_405:
                                crdg5.aJ().c.c("Database error querying filters. appId", crji.a(s10), sQLiteException4);
                                map6 = Collections.EMPTY_MAP;
                                if(cursor5 == null) {
                                    goto label_415;
                                }
                                goto label_414;
                            }
                            catch(Throwable throwable3) {
                                goto label_410;
                            }
                        }
                        catch(Throwable throwable3) {
                        label_410:
                            cursor6 = cursor5;
                        }
                    label_411:
                        if(cursor6 != null) {
                            cursor6.close();
                        }
                        throw throwable3;
                    label_414:
                        cursor5.close();
                    label_415:
                        bxd6.put(s9, map6);
                    }
                    else {
                        iterator13 = iterator12;
                    }
                    Iterator iterator14 = map6.keySet().iterator();
                    while(iterator14.hasNext()) {
                        Object object11 = iterator14.next();
                        Integer integer6 = (Integer)object11;
                        int v5 = (int)integer6;
                        if(this.b.contains(integer6)) {
                            this.aJ().k.b("Skipping failed audience ID", integer6);
                            iterator12 = iterator13;
                            continue label_351;
                        }
                        boolean z3 = true;
                        Iterator iterator15 = ((List)map6.get(integer6)).iterator();
                        while(iterator15.hasNext()) {
                            Object object12 = iterator15.next();
                            crrk crrk1 = (crrk)object12;
                            String s11 = "null";
                            if(this.aJ().j(2)) {
                                map7 = map6;
                                this.aJ().k.d("Evaluating filter. audience, filter, property", integer6, ((crrk1.b & 1) == 0 ? null : ((int)crrk1.c)), this.ao().e(crrk1.d));
                                crjg crjg1 = this.aJ().k;
                                crqt crqt0 = this.aw();
                                if(crrk1 == null) {
                                    iterator16 = iterator14;
                                    s12 = "null";
                                }
                                else {
                                    StringBuilder stringBuilder0 = new StringBuilder();
                                    stringBuilder0.append("\nproperty_filter {\n");
                                    if((crrk1.b & 1) == 0) {
                                        iterator16 = iterator14;
                                    }
                                    else {
                                        iterator16 = iterator14;
                                        crqt.I(stringBuilder0, 0, "filter_id", Integer.valueOf(crrk1.c));
                                    }
                                    crqt.I(stringBuilder0, 0, "property_name", crqt0.ao().e(crrk1.d));
                                    String s13 = crqt.E(crrk1.f, crrk1.g, crrk1.h);
                                    if(!s13.isEmpty()) {
                                        crqt.I(stringBuilder0, 0, "filter_type", s13);
                                    }
                                    crqt0.t(stringBuilder0, 1, (crrk1.e == null ? crrg.a : crrk1.e));
                                    stringBuilder0.append("}\n");
                                    s12 = stringBuilder0.toString();
                                }
                                crjg1.b("Filter definition", s12);
                            }
                            else {
                                map7 = map6;
                                iterator16 = iterator14;
                            }
                            if((crrk1.b & 1) != 0 && crrk1.c <= 0x100) {
                                crcl crcl0 = new crcl(this, this.a, v5, crrk1);
                                Long long1 = this.d;
                                boolean z4 = this.d(v5, crrk1.c);
                                crrk crrk2 = crcl0.a;
                                boolean z5 = crrk2.h;
                                boolean z6 = crrk2.f || crrk2.g || z5;
                                if(z4 && !z6) {
                                    crcl0.h.aJ().k.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(crcl0.c), ((crrk2.b & 1) == 0 ? null : ((int)crrk2.c)));
                                    v6 = v5;
                                    iterator17 = iterator15;
                                }
                                else {
                                    crrg crrg0 = crrk2.e == null ? crrg.a : crrk2.e;
                                    boolean z7 = crrg0.e;
                                    int v7 = crtg0.b;
                                    if((v7 & 8) == 0) {
                                    label_485:
                                        v6 = v5;
                                        iterator17 = iterator15;
                                        if((v7 & 0x20) == 0) {
                                        label_493:
                                            if((v7 & 4) == 0) {
                                            label_506:
                                                crcl0.h.aJ().f.b("User property has no value, property", crcl0.h.ao().e(crtg0.d));
                                            }
                                            else {
                                                int v8 = crrg0.b;
                                                if((v8 & 1) != 0) {
                                                    boolean0 = crcl.i(crcl.e(crtg0.e, (crrg0.c == null ? crrn.a : crrg0.c), crcl0.h.aJ()), z7);
                                                    goto label_508;
                                                }
                                                else if((v8 & 2) == 0) {
                                                label_504:
                                                    crcl0.h.aJ().f.b("No string or number filter defined. property", crcl0.h.ao().e(crtg0.d));
                                                    goto label_507;
                                                }
                                                else {
                                                    if(crqt.x(crtg0.e)) {
                                                        boolean0 = crcl.i(crcl.h(crtg0.e, (crrg0.d == null ? crrj.a : crrg0.d)), z7);
                                                        goto label_508;
                                                    }
                                                    else {
                                                        crcl0.h.aJ().f.c("Invalid user property value for Numeric number filter. property, value", crcl0.h.ao().e(crtg0.d), crtg0.e);
                                                        goto label_507;
                                                    }
                                                    goto label_504;
                                                }
                                                goto label_506;
                                            }
                                        }
                                        else {
                                            if((crrg0.b & 2) == 0) {
                                                crcl0.h.aJ().f.b("No number filter for double property. property", crcl0.h.ao().e(crtg0.d));
                                                goto label_507;
                                            }
                                            else {
                                                boolean0 = crcl.i(crcl.f(crtg0.h, (crrg0.d == null ? crrj.a : crrg0.d)), z7);
                                                goto label_508;
                                            }
                                            goto label_493;
                                        }
                                    }
                                    else {
                                        if((crrg0.b & 2) == 0) {
                                            v6 = v5;
                                            iterator17 = iterator15;
                                            crcl0.h.aJ().f.b("No number filter for long property. property", crcl0.h.ao().e(crtg0.d));
                                            goto label_507;
                                        }
                                        else {
                                            v6 = v5;
                                            iterator17 = iterator15;
                                            boolean0 = crcl.i(crcl.g(crtg0.f, (crrg0.d == null ? crrj.a : crrg0.d)), z7);
                                            goto label_508;
                                        }
                                        goto label_485;
                                    }
                                label_507:
                                    boolean0 = null;
                                label_508:
                                    crjg crjg2 = crcl0.h.aJ().k;
                                    if(boolean0 != null) {
                                        s11 = boolean0;
                                    }
                                    crjg2.b("Property filter result", s11);
                                    if(boolean0 == null) {
                                        z3 = false;
                                        this.b.add(integer6);
                                        goto label_537;
                                    }
                                    else {
                                        crcl0.d = Boolean.valueOf(true);
                                        if(!z5 || boolean0.booleanValue()) {
                                            if(!z4 || crrk2.f) {
                                                crcl0.e = boolean0;
                                            }
                                            if(boolean0.booleanValue() && z6 && (crtg0.b & 1) != 0) {
                                                long v9 = long1 == null ? crtg0.c : ((long)long1);
                                                if(crrk2.g) {
                                                    crcl0.g = v9;
                                                }
                                                else {
                                                    crcl0.f = v9;
                                                }
                                            }
                                        }
                                    }
                                }
                                this.c(integer6).b(crcl0);
                                map6 = map7;
                                iterator14 = iterator16;
                                v5 = v6;
                                iterator15 = iterator17;
                                continue;
                            }
                            this.aJ().f.c("Invalid property filter ID. appId, id", crji.a(this.a), String.valueOf(((crrk1.b & 1) == 0 ? null : ((int)crrk1.c))));
                            this.b.add(integer6);
                            goto label_539;
                        }
                        map7 = map6;
                        iterator16 = iterator14;
                    label_537:
                        if(!z3) {
                            this.b.add(integer6);
                        }
                    label_539:
                        map6 = map7;
                        iterator14 = iterator16;
                    }
                    iterator12 = iterator13;
                }
            }
            List list10 = new ArrayList();
            Set set0 = this.c.keySet();
            set0.removeAll(this.b);
            for(Object object13: set0) {
                crch crch1 = (crch)this.c.get(((Integer)object13));
                batl.s(crch1);
                crsf crsf0 = crch1.a(((Integer)object13).intValue());
                list10.add(crsf0);
                crdg crdg6 = this.at();
                String s14 = this.a;
                crsx crsx3 = crsf0.d == null ? crsx.a : crsf0.d;
                crdg6.aA();
                crdg6.n();
                batl.q(s14);
                batl.s(crsx3);
                byte[] arr_b3 = crsx3.toBytesArray();
                ContentValues contentValues1 = new ContentValues();
                contentValues1.put("app_id", s14);
                contentValues1.put("audience_id", ((Integer)object13));
                contentValues1.put("current_results", arr_b3);
                try {
                    if(crdg6.g().insertWithOnConflict("audience_filter_values", null, contentValues1, 5) != -1L) {
                        continue;
                    }
                    crdg6.aJ().c.b("Failed to insert filter results (got -1). appId", crji.a(s14));
                }
                catch(SQLiteException sQLiteException5) {
                    crdg6.aJ().c.c("Error storing filter results. appId", crji.a(s14), sQLiteException5);
                }
            }
            return list10;
        }
        return new ArrayList();
    }

    private final crch c(Integer integer0) {
        if(this.c.containsKey(integer0)) {
            return (crch)this.c.get(integer0);
        }
        crch crch0 = new crch(this);
        this.c.put(integer0, crch0);
        return crch0;
    }

    private final boolean d(int v, int v1) {
        crch crch0 = (crch)this.c.get(Integer.valueOf(v));
        return crch0 == null ? false : crch0.a.get(v1);
    }
}


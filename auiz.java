import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.discovery.database.room.CastDeviceStorage;
import com.google.android.gms.cast.discovery.database.tcp.TcpProberStorage;
import j..util.Collection.-EL;
import j..util.DesugarCollections;
import j..util.stream.Collector;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class auiz implements cjpb {
    public final Context a;
    public final aulc b;
    public final auju c;
    final Map d;
    public final aufx e;
    private final gful_cronetEngineProvider f;
    private final avjh g;
    private final avij h;
    private final cjpc i;
    private final aumm j;
    private final aumb k;
    private final auji l;
    private final CountDownLatch m;
    private final Map n;
    private final Map o;
    private final Map p;
    private final Map q;
    private final Handler r;
    private final aujm s;
    private final ausg t;

    public auiz(Context context0, ausg ausg0) {
        this.f = gfus.a(((gful_cronetEngineProvider)new auiw()));
        this.g = new avjh("CastDatabase");
        this.m = new CountDownLatch(1);
        this.n = new HashMap();
        this.o = DesugarCollections.synchronizedMap(new HashMap());
        this.p = new HashMap();
        this.q = new HashMap();
        this.d = new HashMap();
        this.r = new clht(Looper.getMainLooper());
        this.a = context0;
        this.t = ausg0;
        avij avij0 = avij.e();
        this.h = avij0;
        cjpc cjpc0 = avjn.e(context0);
        this.i = cjpc0;
        aufx aufx0 = null;
        this.s = ((Boolean)avij0.d.mr()).booleanValue() ? null : new aujm(new aujl(context0), cjpc0);
        this.k = avij0.x() ? new aumb(context0) : null;
        this.j = avij0.x() ? new aumm(context0) : null;
        this.b = new aulc(context0);
        this.c = new auju("unknown_local");
        this.l = new auji();
        if(avij.e().p()) {
            aufx0 = aufx.i(context0);
        }
        this.e = aufx0;
        if(aufx0 != null) {
            aufx0.c();
        }
    }

    @Override  // cjpb
    public final void a(cjpc cjpc0, String s) {
        if(!this.h.h()) {
            return;
        }
        switch(s.hashCode()) {
            case 0xBCA9E067: {
                if(s.equals("com.google.android.gms.cast.SETTINGS_KEY_DATABASE_LOAD_FROM_STORAGE_TIMESTAMP")) {
                    this.g.m("Triggering load from storage after debug setting selected.");
                    atzn.a().execute(() -> {
                        kau kau2;
                        InetSocketAddress inetSocketAddress0;
                        aujg aujg0;
                        Cursor cursor11;
                        Cursor cursor10;
                        Cursor cursor9;
                        Cursor cursor8;
                        aujm aujm2;
                        Cursor cursor7;
                        aujm aujm1;
                        Cursor cursor6;
                        Cursor cursor5;
                        Cursor cursor4;
                        Cursor cursor3;
                        Cursor cursor2;
                        Cursor cursor1;
                        Cursor cursor0;
                        SQLiteDatabase sQLiteDatabase0;
                        auji auji0;
                        Map map3;
                        Map map2;
                        Map map1;
                        Map map0;
                        aujm aujm0;
                        synchronized(this) {
                            this.g.f("Loading the database", new Object[0]);
                            if(this.h.x()) {
                                aumb aumb0 = this.k;
                                if(aumb0 != null) {
                                    synchronized(aumb0) {
                                        CastDeviceStorage castDeviceStorage0 = (CastDeviceStorage)aumb0.a();
                                        if(castDeviceStorage0 == null) {
                                            aumb0.a.m("Cannot load local discovery storage due to null storage");
                                        }
                                        else {
                                            try {
                                                for(Object object0: castDeviceStorage0.v().a()) {
                                                    aumb0.f.put(((auju)object0).b, ((auju)object0));
                                                }
                                                for(Object object1: castDeviceStorage0.u().a()) {
                                                    aumb0.g.put(((aujd)object1).b, ((aujd)object1));
                                                }
                                                aumb0.a.p("The loaded database has %d network info, %d Cast devices", Integer.valueOf(aumb0.f.size()), Integer.valueOf(aumb0.g.size()));
                                            }
                                            catch(SQLiteException | IllegalStateException unused_ex) {
                                                aumb0.a.m("Exception happened when loading Cast device database");
                                                aumb0.f.clear();
                                                aumb0.g.clear();
                                            }
                                        }
                                    }
                                }
                                aumm aumm0 = this.j;
                                if(aumm0 != null) {
                                    synchronized(aumm0) {
                                        TcpProberStorage tcpProberStorage0 = (TcpProberStorage)aumm0.a();
                                        if(tcpProberStorage0 == null) {
                                            aumm0.a.m("Cannot load local discovery storage due to null storage");
                                        }
                                        else {
                                            try {
                                                for(Object object2: tcpProberStorage0.u().a()) {
                                                    aumm0.f.put(((aume)object2).a, ((aume)object2));
                                                }
                                                aumm0.a.n("The loaded TCP prober database has %d probed addresses", Integer.valueOf(aumm0.f.size()));
                                            }
                                            catch(SQLiteException | IllegalStateException unused_ex) {
                                                aumm0.a.m("Exception happened when loading TCP prober database");
                                                aumm0.f.clear();
                                            }
                                        }
                                    }
                                }
                                this.b.k();
                            }
                            else {
                                aujm0 = this.s;
                                if(aujm0 != null) {
                                    map0 = this.l();
                                    map1 = this.j();
                                    map2 = this.d;
                                    map3 = this.m();
                                    auji0 = this.l;
                                    try {
                                        sQLiteDatabase0 = aujm0.b.getWritableDatabase();
                                    }
                                    catch(SQLiteException sQLiteException0) {
                                        aujm0.a.d("Failed to open database.", new Object[]{sQLiteException0});
                                        goto label_292;
                                    }
                                    int v2 = cjpd.a(aujm0.c, "com.google.android.gms.cast.discovery.database.FLAG_CONTROLLED_DATABASE_VERSION_KEY", 0);
                                    aujm0.d = (int)hqpx.a.b().a();
                                    aujm0.a.p("savedFlagControlledVersion: %d. flagControllerVersion: %d", Integer.valueOf(v2), Integer.valueOf(aujm0.d));
                                    if(aujm0.d > v2) {
                                        aujm0.b.c(sQLiteDatabase0);
                                        goto label_292;
                                    }
                                    goto label_69;
                                }
                            }
                            goto label_292;
                        }
                        try {
                        label_69:
                            cursor0 = null;
                            cursor1 = sQLiteDatabase0.query("NetworkInfo", null, null, null, null, null, null);
                        }
                        catch(SQLiteException unused_ex) {
                            cursor2 = null;
                            cursor3 = null;
                            cursor4 = null;
                            cursor5 = null;
                            cursor6 = null;
                            aujm1 = aujm0;
                            goto label_269;
                        }
                        catch(Throwable throwable1) {
                            cursor2 = null;
                            cursor3 = null;
                            cursor4 = null;
                            cursor5 = null;
                            cursor6 = null;
                            goto label_316;
                        }
                        try {
                            cursor4 = sQLiteDatabase0.query("DeviceInfo", null, null, null, null, null, null);
                        }
                        catch(SQLiteException unused_ex) {
                            cursor7 = cursor1;
                            aujm2 = aujm0;
                            cursor2 = null;
                            cursor3 = null;
                            cursor4 = null;
                            cursor5 = null;
                            cursor6 = null;
                            goto label_267;
                        }
                        catch(Throwable throwable1) {
                            cursor7 = cursor1;
                            cursor2 = null;
                            cursor3 = null;
                            cursor4 = null;
                            cursor5 = null;
                            cursor6 = null;
                            goto label_315;
                        }
                        try {
                            aujm2 = aujm0;
                            cursor8 = sQLiteDatabase0.query("NetworkToDevice", null, null, null, null, null, null);
                            goto label_118;
                        }
                        catch(SQLiteException unused_ex) {
                            cursor7 = cursor1;
                            cursor2 = null;
                            cursor3 = null;
                            cursor5 = null;
                            cursor6 = null;
                            goto label_267;
                        }
                        catch(Throwable throwable1) {
                            cursor7 = cursor1;
                            cursor2 = null;
                            cursor3 = null;
                            cursor5 = null;
                        }
                        cursor6 = null;
                        goto label_315;
                        try {
                        label_118:
                            cursor9 = sQLiteDatabase0.query("GuestModeDiscoveryInfo", null, null, null, null, null, null);
                        }
                        catch(SQLiteException unused_ex) {
                            cursor6 = cursor8;
                            cursor7 = cursor1;
                            cursor2 = null;
                            cursor3 = null;
                            cursor5 = null;
                            goto label_267;
                        }
                        catch(Throwable throwable1) {
                            cursor6 = cursor8;
                            cursor7 = cursor1;
                            cursor2 = null;
                            cursor3 = null;
                            cursor5 = null;
                            goto label_315;
                        }
                        try {
                            cursor10 = sQLiteDatabase0.query("GuestModeAppInfo", null, null, null, null, null, null);
                        }
                        catch(SQLiteException unused_ex) {
                            cursor5 = cursor9;
                            cursor7 = cursor1;
                            cursor6 = cursor8;
                            cursor2 = null;
                            cursor3 = null;
                            goto label_267;
                        }
                        catch(Throwable throwable1) {
                            cursor5 = cursor9;
                            cursor7 = cursor1;
                            cursor6 = cursor8;
                            cursor2 = null;
                            cursor3 = null;
                            goto label_315;
                        }
                        if(cursor1 != null && cursor4 != null && cursor8 != null) {
                            try {
                                while(cursor1.moveToNext()) {
                                    auju auju0 = new auju(cursor1.getString(0));
                                    auju0.c = (long)cursor1.getInt(1);
                                    map0.put(auju0.b, auju0);
                                }
                                while(cursor4.moveToNext()) {
                                    aujd aujd0 = aujt.d(cursor4);
                                    if(aujd0 != null) {
                                        CastDevice castDevice0 = aujd0.c;
                                        map1.put(castDevice0.f(), aujd0);
                                        String s = castDevice0.l;
                                        if(!TextUtils.isEmpty(s)) {
                                            map2.put(s, aujd0);
                                        }
                                    }
                                }
                                while(cursor8.moveToNext()) {
                                    kau kau0 = new kau(cursor8.getString(1), cursor8.getString(2));
                                    auju auju1 = (auju)map0.get(((String)kau0.a));
                                    aujd aujd1 = (aujd)map1.get(((String)kau0.b));
                                    if(auju1 != null && aujd1 != null) {
                                        auju1.b(aujd1);
                                    }
                                }
                                while(true) {
                                label_170:
                                    if(!cursor10.moveToNext()) {
                                        while(true) {
                                        label_171:
                                            if(!cursor9.moveToNext()) {
                                                goto label_208;
                                            }
                                            cursor11 = cursor9;
                                            aujg0 = new aujg();
                                            cursor11 = cursor9;
                                            goto label_188;
                                        }
                                    }
                                    goto label_252;
                                }
                            }
                            catch(SQLiteException unused_ex) {
                                goto label_183;
                            }
                            catch(Throwable throwable1) {
                                goto label_174;
                            }
                        }
                        goto label_170;
                    label_174:
                        cursor7 = cursor1;
                        cursor5 = cursor9;
                        cursor6 = cursor8;
                        cursor2 = cursor10;
                        goto label_314;
                        try {
                            cursor11 = cursor9;
                            aujg0 = new aujg();
                            cursor11 = cursor9;
                            goto label_188;
                        }
                        catch(SQLiteException unused_ex) {
                        label_183:
                            cursor7 = cursor1;
                            cursor5 = cursor9;
                            cursor6 = cursor8;
                            cursor2 = cursor10;
                            goto label_266;
                            try {
                            label_188:
                                aujg0.b = cursor11.getString(1);
                                aujg0.c = cursor11.getString(2);
                                kau kau1 = new kau(cursor11.getString(0), aujg0);
                                aujd aujd2 = (aujd)map1.get(kau1.a);
                                if(aujd2 != null) {
                                    aujd2.g = (aujg)kau1.b;
                                    auji0.b.put(((aujg)kau1.b).b.replace(":", ""), aujd2);
                                }
                                cursor9 = cursor11;
                                goto label_171;
                            }
                            catch(SQLiteException unused_ex) {
                            }
                            catch(Throwable throwable1) {
                                goto label_203;
                            }
                            cursor6 = cursor8;
                            cursor7 = cursor1;
                            cursor2 = cursor10;
                            cursor5 = cursor11;
                            goto label_266;
                        }
                        catch(Throwable throwable1) {
                        label_203:
                            cursor6 = cursor8;
                            cursor7 = cursor1;
                            cursor2 = cursor10;
                            cursor5 = cursor11;
                            goto label_314;
                        }
                        try {
                        label_208:
                            cursor6 = cursor8;
                            cursor5 = cursor9;
                            cursor2 = cursor10;
                            cursor7 = cursor1;
                            cursor3 = sQLiteDatabase0.query("ProbedSocketAddress", null, null, null, null, null, null);
                        }
                        catch(SQLiteException unused_ex) {
                            goto label_266;
                        }
                        catch(Throwable throwable1) {
                            goto label_314;
                        }
                        try {
                            while(true) {
                                if(!cursor3.moveToNext()) {
                                    goto label_238;
                                }
                                String s1 = cursor3.getString(0);
                                int v3 = cursor3.getInt(1);
                                String s2 = cursor3.getString(2);
                                boolean z = cursor3.getInt(3) == 1;
                                long v4 = (long)cursor3.getInt(4);
                                int v5 = cursor3.getInt(5);
                                int v6 = cursor3.getInt(6);
                                try {
                                    inetSocketAddress0 = new InetSocketAddress(s1, v3);
                                }
                                catch(IllegalArgumentException | SecurityException exception0) {
                                    aujt.a.h(exception0, "Failed to create InetSocketAddress", new Object[0]);
                                    kau2 = null;
                                    goto label_228;
                                }
                                kau2 = new kau(inetSocketAddress0, new aumd(s2, z, v4, v5, v6));
                            label_228:
                                if(kau2 != null) {
                                    InetSocketAddress inetSocketAddress1 = (InetSocketAddress)kau2.a;
                                    aume aume0 = (aume)map3.get(inetSocketAddress1);
                                    if(aume0 == null) {
                                        aume0 = new aume(inetSocketAddress1);
                                        map3.put(inetSocketAddress1, aume0);
                                    }
                                    aume0.c(((aumd)kau2.b));
                                }
                            }
                        }
                        catch(SQLiteException unused_ex) {
                            goto label_267;
                        }
                        catch(Throwable throwable1) {
                        }
                        goto label_315;
                    label_238:
                        if(cursor7 != null) {
                            cursor7.close();
                        }
                        if(cursor4 != null) {
                            cursor4.close();
                        }
                        if(cursor6 != null) {
                            cursor6.close();
                        }
                        if(cursor5 != null) {
                            cursor5.close();
                        }
                        if(cursor2 != null) {
                            cursor2.close();
                        }
                        cursor3.close();
                        sQLiteDatabase0.close();
                        aujm1 = aujm2;
                        goto label_291;
                        try {
                        label_252:
                            cursor7 = cursor1;
                            cursor5 = cursor9;
                            cursor6 = cursor8;
                            cursor2 = cursor10;
                            String s3 = cursor2.getString(0);
                            cursor2.getInt(1);
                            cursor2.getLong(2);
                            aujf aujf0 = new aujf(s3);
                            auji0.a.put(aujf0.a, aujf0);
                            cursor10 = cursor2;
                            cursor8 = cursor6;
                            cursor9 = cursor5;
                            cursor1 = cursor7;
                            goto label_170;
                        }
                        catch(SQLiteException unused_ex) {
                        label_266:
                            cursor3 = null;
                        label_267:
                            aujm1 = aujm2;
                            cursor0 = cursor7;
                            try {
                            label_269:
                                aujm1.b.c(sQLiteDatabase0);
                                map0.clear();
                                map1.clear();
                                map2.clear();
                                map3.clear();
                                auji0.b();
                                goto label_278;
                            }
                            catch(Throwable throwable1) {
                                goto label_316;
                            label_278:
                                if(cursor0 != null) {
                                    cursor0.close();
                                }
                                if(cursor4 != null) {
                                    cursor4.close();
                                }
                                if(cursor6 != null) {
                                    cursor6.close();
                                }
                                if(cursor5 != null) {
                                    cursor5.close();
                                }
                                if(cursor2 != null) {
                                    cursor2.close();
                                }
                                if(cursor3 != null) {
                                    cursor3.close();
                                }
                                sQLiteDatabase0.close();
                            label_291:
                                aujm1.a.f("%d CastNetworkInfo instances loaded, %d CastDeviceInfo instances loaded, %d paired guest mode devices loaded.", new Object[]{map0.size(), map1.size(), auji0.a().size()});
                            label_292:
                                for(Object object3: this.j().values()) {
                                    aujd aujd3 = (aujd)object3;
                                    String s4 = aujd3.c.l;
                                    if(!TextUtils.isEmpty(s4)) {
                                        this.d.put(s4, aujd3);
                                    }
                                }
                                if(hqsq.c()) {
                                    for(Object object4: this.j().values()) {
                                        this.t(((aujd)object4).c);
                                    }
                                }
                                this.m.countDown();
                                if(this.h.h()) {
                                    this.i.g(this);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        catch(Throwable throwable1) {
                        }
                    label_314:
                        cursor3 = null;
                    label_315:
                        cursor0 = cursor7;
                    label_316:
                        if(cursor0 != null) {
                            cursor0.close();
                        }
                        if(cursor4 != null) {
                            cursor4.close();
                        }
                        if(cursor6 != null) {
                            cursor6.close();
                        }
                        if(cursor5 != null) {
                            cursor5.close();
                        }
                        if(cursor2 != null) {
                            cursor2.close();
                        }
                        if(cursor3 != null) {
                            cursor3.close();
                        }
                        sQLiteDatabase0.close();
                        throw throwable1;
                    });
                    this.w(0x7F150AAC);  // string:database_loaded_from_storage_toast "The Cast database has been loaded from 
                                         // storage."
                    return;
                }
                break;
            }
            case 0x4B168978: {
                if(s.equals("com.google.android.gms.cast.SETTINGS_KEY_DATABASE_FLUSH_TO_STORAGE_TIMESTAMP")) {
                    this.g.m("Triggering flush to storage after debug setting selected.");
                    atzn.a().execute(() -> {
                        __monitor_enter(this);
                        int v = FIN.finallyOpen$NT();
                        this.g.f("Saving the database", new Object[0]);
                        if(this.h.x()) {
                            aumb aumb0 = this.k;
                            if(aumb0 != null) {
                                aumb0.b();
                            }
                            aumm aumm0 = this.j;
                            if(aumm0 != null) {
                                aumm0.b();
                            }
                            this.b.b();
                            FIN.finallyExec$NT(v);
                            return;
                        }
                        aujm aujm0 = this.s;
                        if(aujm0 != null) {
                            try {
                                Map map0 = this.l();
                                Map map1 = this.j();
                                Map map2 = this.d;
                                Map map3 = this.m();
                                auji auji0 = this.l;
                                SQLiteDatabase sQLiteDatabase0 = aujm0.b.getWritableDatabase();
                            }
                            catch(SQLiteException unused_ex) {
                                FIN.finallyExec$NT(v);
                                return;
                            }
                            try {
                                int v1 = FIN.finallyOpen$NT();
                                sQLiteDatabase0.beginTransaction();
                                sQLiteDatabase0.delete("NetworkInfo", null, null);
                                sQLiteDatabase0.delete("DeviceInfo", null, null);
                                sQLiteDatabase0.delete("NetworkToDevice", null, null);
                                sQLiteDatabase0.delete("GuestModeAppInfo", null, null);
                                sQLiteDatabase0.delete("GuestModeDiscoveryInfo", null, null);
                                sQLiteDatabase0.delete("ProbedSocketAddress", null, null);
                                HashMap hashMap0 = new HashMap();
                                int v2 = 0;
                                Iterator iterator0 = map0.values().iterator();
                            alab1:
                                while(true) {
                                    if(!iterator0.hasNext()) {
                                        int v3 = 0;
                                        int v4 = 0;
                                        for(Object object0: map1.values()) {
                                            if(aujm0.a(sQLiteDatabase0, ((aujd)object0))) {
                                                ++v4;
                                            }
                                            else {
                                                ++v3;
                                            }
                                        }
                                        int v5 = 0;
                                        Iterator iterator2 = hashMap0.entrySet().iterator();
                                        while(true) {
                                            if(!iterator2.hasNext()) {
                                                int v6 = 0;
                                                Iterator iterator3 = auji0.a().iterator();
                                                while(iterator3.hasNext()) {
                                                    Object object1 = iterator3.next();
                                                    String s = ((aujd)object1).c.f();
                                                    aujg aujg0 = ((aujd)object1).g;
                                                    if(aujg0 == null) {
                                                        iterator4 = iterator3;
                                                    }
                                                    else {
                                                        String s1 = aujg0.b;
                                                        if(s1 == null) {
                                                            iterator4 = iterator3;
                                                        }
                                                        else {
                                                            Iterator iterator4 = iterator3;
                                                            aujg0.b = s1.replace(":", "");
                                                        }
                                                        Set set0 = aujg0.a;
                                                        if(!set0.isEmpty()) {
                                                            Iterator iterator5 = set0.iterator();
                                                            HashSet hashSet0 = new HashSet();
                                                            while(iterator5.hasNext()) {
                                                                Object object2 = iterator5.next();
                                                                String s2 = (String)object2;
                                                                if(s2.contains(":")) {
                                                                    iterator5.remove();
                                                                    hashSet0.add(s2.replace(":", ""));
                                                                    map3 = map3;
                                                                    v6 = v6;
                                                                    auji0 = auji0;
                                                                }
                                                                else {
                                                                    map3 = map3;
                                                                    v6 = v6;
                                                                }
                                                            }
                                                            int v7 = v6;
                                                            Map map4 = map3;
                                                            auji auji1 = auji0;
                                                            set0.addAll(hashSet0);
                                                            goto label_88;
                                                        }
                                                    }
                                                    v7 = v6;
                                                    map4 = map3;
                                                    auji1 = auji0;
                                                label_88:
                                                    if(aujg0 != null) {
                                                        ContentValues contentValues0 = new ContentValues();
                                                        contentValues0.put("DEVICE_ID", s);
                                                        contentValues0.put("BSSID", aujg0.b);
                                                        contentValues0.put("CACHED_PIN", aujg0.c);
                                                        if(sQLiteDatabase0.replace("GuestModeDiscoveryInfo", null, contentValues0) == -1L) {
                                                            aujm0.a.d("Unable to insert (deviceId %s, guestModeDiscoveryInfo %s) pair.", new Object[]{s, aujg0});
                                                        }
                                                        else {
                                                            v6 = v7 + 1;
                                                            iterator3 = iterator4;
                                                            map3 = map4;
                                                            goto label_103;
                                                        }
                                                    }
                                                    iterator3 = iterator4;
                                                    map3 = map4;
                                                    v6 = v7;
                                                label_103:
                                                    auji0 = auji1;
                                                }
                                                for(Object object3: map2.values()) {
                                                    aujd aujd0 = (aujd)object3;
                                                    String s3 = aujd0.c.f();
                                                    if(!TextUtils.isEmpty(s3) && map1.containsKey(s3)) {
                                                        continue;
                                                    }
                                                    if(aujm0.a(sQLiteDatabase0, aujd0)) {
                                                        ++v4;
                                                    }
                                                    else {
                                                        ++v3;
                                                    }
                                                }
                                                int v8 = 0;
                                                int v9 = 0;
                                                Iterator iterator7 = map3.values().iterator();
                                                while(iterator7.hasNext()) {
                                                    Object object4 = iterator7.next();
                                                    avjh avjh0 = aujm0.a;
                                                    InetSocketAddress inetSocketAddress0 = ((aume)object4).a;
                                                    avjh0.n("Saving %s", inetSocketAddress0);
                                                    for(Object object5: ((aume)object4).b().values()) {
                                                        aumd aumd0 = (aumd)object5;
                                                        ContentValues contentValues1 = new ContentValues();
                                                        if(hqpu.a.b().j()) {
                                                            InetAddress inetAddress0 = inetSocketAddress0.getAddress();
                                                            String s4 = inetAddress0 == null ? "unknown_host_name" : inetAddress0.getHostAddress();
                                                        }
                                                        else {
                                                            s4 = inetSocketAddress0.getHostName();
                                                        }
                                                        Iterator iterator9 = iterator7;
                                                        contentValues1.put("host_name", s4);
                                                        contentValues1.put("port", Integer.valueOf(inetSocketAddress0.getPort()));
                                                        contentValues1.put("network_id", aumd0.a);
                                                        contentValues1.put("is_responding_to_probe", Integer.valueOf(((int)aumd0.b)));
                                                        contentValues1.put("last_probed_timestamp_millis", Long.valueOf(aumd0.c));
                                                        contentValues1.put("probing_error_code", Integer.valueOf(aumd0.d));
                                                        contentValues1.put("number_of_probed_times", Integer.valueOf(aumd0.e));
                                                        if(sQLiteDatabase0.replace("ProbedSocketAddress", null, contentValues1) != -1L) {
                                                            v8 = v8;
                                                            v9 = v9;
                                                            iterator7 = iterator9;
                                                            continue;
                                                        }
                                                        avjh0.d("Unable to insert probed socket address: %s, %s", new Object[]{inetSocketAddress0, aumd0});
                                                        ++v9;
                                                        v8 = v8;
                                                        goto label_156;
                                                    }
                                                    iterator9 = iterator7;
                                                    ++v8;
                                                label_156:
                                                    iterator7 = iterator9;
                                                }
                                                Integer integer0 = (int)0;
                                                aujm0.a.f("[CastNetworkInfo] saved: %d, skipped: %d, [CastDeviceInfo]: saved %d, skipped %d, [Paired Guest Mode DeviceInfo] saved: %d, skipped: %d. [ProbedNetworks]: saved %d, skipped: %d, [ProbedSocketAddress]: saved %d, skipped: %d, [Network-Device pairs]: saved: %d", new Object[]{v2, ((int)(map0.size() - v2)), v4, v3, v6, ((int)(auji0.a().size() - v6)), integer0, integer0, v8, v9, v5});
                                                sQLiteDatabase0.setTransactionSuccessful();
                                                sQLiteDatabase0.endTransaction();
                                                break alab1;
                                            }
                                            Object object6 = iterator2.next();
                                            String s5 = (String)((Map.Entry)object6).getKey();
                                            for(Object object7: ((Set)((Map.Entry)object6).getValue())) {
                                                String s6 = (String)object7;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("network_id", s5);
                                                contentValues2.put("device_id", s6);
                                                if(sQLiteDatabase0.replace("NetworkToDevice", null, contentValues2) == -1L) {
                                                    aujm0.a.d("Unable to insert networkId %s deviceId %s pair.", new Object[]{s5, s6});
                                                }
                                                else {
                                                    ++v5;
                                                }
                                                map0 = map0;
                                                iterator2 = iterator2;
                                                map2 = map2;
                                            }
                                        }
                                    }
                                    Object object8 = iterator0.next();
                                    ContentValues contentValues3 = new ContentValues();
                                    String s7 = ((auju)object8).b;
                                    contentValues3.put("network_id", s7);
                                    contentValues3.put("last_connected_timestamp_millis", Long.valueOf(((auju)object8).c));
                                    if(sQLiteDatabase0.replace("NetworkInfo", null, contentValues3) == -1L) {
                                        aujm0.a.d("Unable to insert CastNetworkInfo: %s.", new Object[]{s7});
                                    }
                                    else {
                                        ++v2;
                                    }
                                    ArrayList arrayList0 = new ArrayList();
                                    ArrayList arrayList1 = new ArrayList(((auju)object8).a);
                                    __monitor_enter(map1);
                                    try {
                                        for(Object object9: arrayList1) {
                                            aujd aujd1 = (aujd)map1.get(((String)object9));
                                            if(aujd1 == null) {
                                                continue;
                                            }
                                            arrayList0.add(aujd1);
                                        }
                                    }
                                    catch(Throwable throwable0) {
                                        __monitor_exit(map1);
                                        throw throwable0;
                                    }
                                    __monitor_exit(map1);
                                    ArrayList arrayList2 = new ArrayList(DesugarCollections.unmodifiableCollection(arrayList0));
                                    Collections.sort(arrayList2, new aujb());
                                    if(!arrayList2.isEmpty()) {
                                        HashSet hashSet1 = new HashSet();
                                        int v10;
                                        for(v10 = arrayList2.size() - Math.min(arrayList2.size(), ((int)hqti.a.b().a())); v10 < arrayList2.size(); ++v10) {
                                            hashSet1.add(((aujd)arrayList2.get(v10)).c.f());
                                        }
                                        hashMap0.put(s7, hashSet1);
                                    }
                                    iterator0 = iterator0;
                                }
                            }
                            catch(SQLiteException sQLiteException0) {
                                aujm0.a.e(sQLiteException0, "SqliteException when trying to save the database", new Object[0]);
                            }
                            FIN.finallyCodeBegin$NT(v1);
                            sQLiteDatabase0.close();
                            FIN.finallyCodeEnd$NT(v1);
                            cjpa cjpa0 = aujm0.c.c();
                            cjpa0.f("com.google.android.gms.cast.discovery.database.FLAG_CONTROLLED_DATABASE_VERSION_KEY", aujm0.d);
                            cjpd.f(cjpa0);
                            FIN.finallyCodeBegin$NT(v);
                            __monitor_exit(this);
                            FIN.finallyCodeEnd$NT(v);
                            return;
                        }
                        FIN.finallyExec$NT(v);
                    });
                    this.w(0x7F150AAB);  // string:database_flushed_to_storage_toast "The Cast database has been flushed to 
                                         // storage."
                    return;
                }
                break;
            }
            case 0x6D809115: {
                if(s.equals("com.google.android.gms.cast.SETTINGS_KEY_DATABASE_CLEAR_TIMESTAMP")) {
                    this.g.m("Triggering clear database after debug setting selected.");
                    atzn.a().execute(new auir(this));
                    this.w(0x7F150AAA);  // string:database_cleared_toast "The Cast database has been cleared."
                    return;
                }
                break;
            }
        }
    }

    public final kau b(Network network0) {
        kau kau0;
        synchronized(this) {
            if(!this.y()) {
                return null;
            }
            String s = this.t.b(network0);
            avjh avjh0 = this.g;
            avjh0.c("getCurrentWifiNetworkInfo: currentNetworkId: %s - network: %s", new Object[]{s, network0});
            if(!TextUtils.isEmpty(s)) {
                return new kau(s, ((auju)this.l().get(s)));
            }
            avjh0.g("Current network id is empty", new Object[0]);
            kau0 = new kau(null, this.c);
        }
        return kau0;
    }

    public final aujd c(String s) {
        aujd aujd0;
        synchronized(this) {
            if(!this.y()) {
                return null;
            }
            aujd0 = (aujd)this.j().get(s);
            this.x(aujd0);
        }
        return aujd0;
    }

    public final aujd d(CastDevice castDevice0) {
        aujd aujd0;
        synchronized(this) {
            this.y();
            aujd0 = new aujd(castDevice0);
            this.x(aujd0);
            if(!TextUtils.isEmpty(castDevice0.f())) {
                this.j().put(castDevice0.f(), aujd0);
            }
            String s = castDevice0.l;
            if(!TextUtils.isEmpty(s)) {
                this.d.put(s, aujd0);
            }
            this.g.n("CastDeviceInfo created: %s", castDevice0);
        }
        return aujd0;
    }

    public final auju e(String s) {
        auju auju0;
        synchronized(this) {
            if(!this.y()) {
                return null;
            }
            auju0 = TextUtils.isEmpty(s) ? this.c : ((auju)this.l().get(s));
        }
        return auju0;
    }

    public final auju f(String s, long v) {
        auju auju0;
        synchronized(this) {
            this.y();
            auju0 = new auju(s);
            auju0.c = v;
            this.l().put(s, auju0);
            this.g.n("WifiNetworkInfo created: id = %s", s);
        }
        return auju0;
    }

    public final aume g(InetSocketAddress inetSocketAddress0) {
        aume aume0;
        synchronized(this) {
            if(!this.y()) {
                return null;
            }
            aume0 = (aume)this.m().get(inetSocketAddress0);
        }
        return aume0;
    }

    public final aume h(InetSocketAddress inetSocketAddress0) {
        aume aume0;
        synchronized(this) {
            this.y();
            aume0 = new aume(inetSocketAddress0);
            this.m().put(inetSocketAddress0, aume0);
        }
        return aume0;
    }

    public final String i(String s) {
        String s1;
        synchronized(this) {
            s1 = (String)this.q.get(s);
        }
        return s1;
    }

    public final Map j() {
        return this.k == null ? this.o : this.k.g;
    }

    public final Map k() {
        if(!avij.e().r()) {
            this.g.g("Wake-on-lan is not supported and shouldn\'t be called", new Object[0]);
            return ggnf.a;
        }
        auit auit0 = new auit();
        Collector collector0 = ggaf.b(new auiu(), new auiv());
        return (Map)Collection.-EL.stream(this.j().entrySet()).filter(auit0).collect(collector0);
    }

    public final Map l() {
        return this.k == null ? this.n : this.k.f;
    }

    public final Map m() {
        return this.j == null ? this.p : this.j.f;
    }

    public final void n(boolean z) {
        synchronized(this) {
            if(!this.y()) {
                this.g.c("Skipping database clear. Database has not been loaded.", new Object[0]);
                return;
            }
            avjh avjh0 = this.g;
            avjh0.m("Start clearing Cast records");
            if(avij.e().r() && z) {
                ggeo ggeo0 = ggeo.k(this.k());
                this.j().clear();
                avjh0.m("Retaining WoL devices");
                this.j().putAll(ggeo0);
            }
            else {
                this.j().clear();
            }
            this.l().clear();
            if(this.h.h()) {
                this.d.clear();
                this.m().clear();
                this.l.b();
            }
            avjh0.c("All devices and networks removed from the database.", new Object[0]);
        }
    }

    // Detected as a lambda impl.
    public final void o() {
        kau kau2;
        InetSocketAddress inetSocketAddress0;
        aujg aujg0;
        Cursor cursor11;
        Cursor cursor10;
        Cursor cursor9;
        Cursor cursor8;
        aujm aujm2;
        Cursor cursor7;
        aujm aujm1;
        Cursor cursor6;
        Cursor cursor5;
        Cursor cursor4;
        Cursor cursor3;
        Cursor cursor2;
        Cursor cursor1;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0;
        auji auji0;
        Map map3;
        Map map2;
        Map map1;
        Map map0;
        aujm aujm0;
        synchronized(this) {
            this.g.f("Loading the database", new Object[0]);
            if(this.h.x()) {
                aumb aumb0 = this.k;
                if(aumb0 != null) {
                    synchronized(aumb0) {
                        CastDeviceStorage castDeviceStorage0 = (CastDeviceStorage)aumb0.a();
                        if(castDeviceStorage0 == null) {
                            aumb0.a.m("Cannot load local discovery storage due to null storage");
                        }
                        else {
                            try {
                                for(Object object0: castDeviceStorage0.v().a()) {
                                    aumb0.f.put(((auju)object0).b, ((auju)object0));
                                }
                                for(Object object1: castDeviceStorage0.u().a()) {
                                    aumb0.g.put(((aujd)object1).b, ((aujd)object1));
                                }
                                aumb0.a.p("The loaded database has %d network info, %d Cast devices", Integer.valueOf(aumb0.f.size()), Integer.valueOf(aumb0.g.size()));
                            }
                            catch(SQLiteException | IllegalStateException unused_ex) {
                                aumb0.a.m("Exception happened when loading Cast device database");
                                aumb0.f.clear();
                                aumb0.g.clear();
                            }
                        }
                    }
                }
                aumm aumm0 = this.j;
                if(aumm0 != null) {
                    synchronized(aumm0) {
                        TcpProberStorage tcpProberStorage0 = (TcpProberStorage)aumm0.a();
                        if(tcpProberStorage0 == null) {
                            aumm0.a.m("Cannot load local discovery storage due to null storage");
                        }
                        else {
                            try {
                                for(Object object2: tcpProberStorage0.u().a()) {
                                    aumm0.f.put(((aume)object2).a, ((aume)object2));
                                }
                                aumm0.a.n("The loaded TCP prober database has %d probed addresses", Integer.valueOf(aumm0.f.size()));
                            }
                            catch(SQLiteException | IllegalStateException unused_ex) {
                                aumm0.a.m("Exception happened when loading TCP prober database");
                                aumm0.f.clear();
                            }
                        }
                    }
                }
                this.b.k();
            }
            else {
                aujm0 = this.s;
                if(aujm0 != null) {
                    map0 = this.l();
                    map1 = this.j();
                    map2 = this.d;
                    map3 = this.m();
                    auji0 = this.l;
                    try {
                        sQLiteDatabase0 = aujm0.b.getWritableDatabase();
                    }
                    catch(SQLiteException sQLiteException0) {
                        aujm0.a.d("Failed to open database.", new Object[]{sQLiteException0});
                        goto label_292;
                    }
                    int v2 = cjpd.a(aujm0.c, "com.google.android.gms.cast.discovery.database.FLAG_CONTROLLED_DATABASE_VERSION_KEY", 0);
                    aujm0.d = (int)hqpx.a.b().a();
                    aujm0.a.p("savedFlagControlledVersion: %d. flagControllerVersion: %d", Integer.valueOf(v2), Integer.valueOf(aujm0.d));
                    if(aujm0.d > v2) {
                        aujm0.b.c(sQLiteDatabase0);
                        goto label_292;
                    }
                    goto label_69;
                }
            }
            goto label_292;
        }
        try {
        label_69:
            cursor0 = null;
            cursor1 = sQLiteDatabase0.query("NetworkInfo", null, null, null, null, null, null);
        }
        catch(SQLiteException unused_ex) {
            cursor2 = null;
            cursor3 = null;
            cursor4 = null;
            cursor5 = null;
            cursor6 = null;
            aujm1 = aujm0;
            goto label_269;
        }
        catch(Throwable throwable1) {
            cursor2 = null;
            cursor3 = null;
            cursor4 = null;
            cursor5 = null;
            cursor6 = null;
            goto label_316;
        }
        try {
            cursor4 = sQLiteDatabase0.query("DeviceInfo", null, null, null, null, null, null);
        }
        catch(SQLiteException unused_ex) {
            cursor7 = cursor1;
            aujm2 = aujm0;
            cursor2 = null;
            cursor3 = null;
            cursor4 = null;
            cursor5 = null;
            cursor6 = null;
            goto label_267;
        }
        catch(Throwable throwable1) {
            cursor7 = cursor1;
            cursor2 = null;
            cursor3 = null;
            cursor4 = null;
            cursor5 = null;
            cursor6 = null;
            goto label_315;
        }
        try {
            aujm2 = aujm0;
            cursor8 = sQLiteDatabase0.query("NetworkToDevice", null, null, null, null, null, null);
            goto label_118;
        }
        catch(SQLiteException unused_ex) {
            cursor7 = cursor1;
            cursor2 = null;
            cursor3 = null;
            cursor5 = null;
            cursor6 = null;
            goto label_267;
        }
        catch(Throwable throwable1) {
            cursor7 = cursor1;
            cursor2 = null;
            cursor3 = null;
            cursor5 = null;
        }
        cursor6 = null;
        goto label_315;
        try {
        label_118:
            cursor9 = sQLiteDatabase0.query("GuestModeDiscoveryInfo", null, null, null, null, null, null);
        }
        catch(SQLiteException unused_ex) {
            cursor6 = cursor8;
            cursor7 = cursor1;
            cursor2 = null;
            cursor3 = null;
            cursor5 = null;
            goto label_267;
        }
        catch(Throwable throwable1) {
            cursor6 = cursor8;
            cursor7 = cursor1;
            cursor2 = null;
            cursor3 = null;
            cursor5 = null;
            goto label_315;
        }
        try {
            cursor10 = sQLiteDatabase0.query("GuestModeAppInfo", null, null, null, null, null, null);
        }
        catch(SQLiteException unused_ex) {
            cursor5 = cursor9;
            cursor7 = cursor1;
            cursor6 = cursor8;
            cursor2 = null;
            cursor3 = null;
            goto label_267;
        }
        catch(Throwable throwable1) {
            cursor5 = cursor9;
            cursor7 = cursor1;
            cursor6 = cursor8;
            cursor2 = null;
            cursor3 = null;
            goto label_315;
        }
        if(cursor1 != null && cursor4 != null && cursor8 != null) {
            try {
                while(cursor1.moveToNext()) {
                    auju auju0 = new auju(cursor1.getString(0));
                    auju0.c = (long)cursor1.getInt(1);
                    map0.put(auju0.b, auju0);
                }
                while(cursor4.moveToNext()) {
                    aujd aujd0 = aujt.d(cursor4);
                    if(aujd0 != null) {
                        CastDevice castDevice0 = aujd0.c;
                        map1.put(castDevice0.f(), aujd0);
                        String s = castDevice0.l;
                        if(!TextUtils.isEmpty(s)) {
                            map2.put(s, aujd0);
                        }
                    }
                }
                while(cursor8.moveToNext()) {
                    kau kau0 = new kau(cursor8.getString(1), cursor8.getString(2));
                    auju auju1 = (auju)map0.get(((String)kau0.a));
                    aujd aujd1 = (aujd)map1.get(((String)kau0.b));
                    if(auju1 != null && aujd1 != null) {
                        auju1.b(aujd1);
                    }
                }
                while(true) {
                label_170:
                    if(!cursor10.moveToNext()) {
                        while(true) {
                        label_171:
                            if(!cursor9.moveToNext()) {
                                goto label_208;
                            }
                            cursor11 = cursor9;
                            aujg0 = new aujg();
                            cursor11 = cursor9;
                            goto label_188;
                        }
                    }
                    goto label_252;
                }
            }
            catch(SQLiteException unused_ex) {
                goto label_183;
            }
            catch(Throwable throwable1) {
                goto label_174;
            }
        }
        goto label_170;
    label_174:
        cursor7 = cursor1;
        cursor5 = cursor9;
        cursor6 = cursor8;
        cursor2 = cursor10;
        goto label_314;
        try {
            cursor11 = cursor9;
            aujg0 = new aujg();
            cursor11 = cursor9;
            goto label_188;
        }
        catch(SQLiteException unused_ex) {
        label_183:
            cursor7 = cursor1;
            cursor5 = cursor9;
            cursor6 = cursor8;
            cursor2 = cursor10;
            goto label_266;
            try {
            label_188:
                aujg0.b = cursor11.getString(1);
                aujg0.c = cursor11.getString(2);
                kau kau1 = new kau(cursor11.getString(0), aujg0);
                aujd aujd2 = (aujd)map1.get(kau1.a);
                if(aujd2 != null) {
                    aujd2.g = (aujg)kau1.b;
                    auji0.b.put(((aujg)kau1.b).b.replace(":", ""), aujd2);
                }
                cursor9 = cursor11;
                goto label_171;
            }
            catch(SQLiteException unused_ex) {
            }
            catch(Throwable throwable1) {
                goto label_203;
            }
            cursor6 = cursor8;
            cursor7 = cursor1;
            cursor2 = cursor10;
            cursor5 = cursor11;
            goto label_266;
        }
        catch(Throwable throwable1) {
        label_203:
            cursor6 = cursor8;
            cursor7 = cursor1;
            cursor2 = cursor10;
            cursor5 = cursor11;
            goto label_314;
        }
        try {
        label_208:
            cursor6 = cursor8;
            cursor5 = cursor9;
            cursor2 = cursor10;
            cursor7 = cursor1;
            cursor3 = sQLiteDatabase0.query("ProbedSocketAddress", null, null, null, null, null, null);
        }
        catch(SQLiteException unused_ex) {
            goto label_266;
        }
        catch(Throwable throwable1) {
            goto label_314;
        }
        try {
            while(true) {
                if(!cursor3.moveToNext()) {
                    goto label_238;
                }
                String s1 = cursor3.getString(0);
                int v3 = cursor3.getInt(1);
                String s2 = cursor3.getString(2);
                boolean z = cursor3.getInt(3) == 1;
                long v4 = (long)cursor3.getInt(4);
                int v5 = cursor3.getInt(5);
                int v6 = cursor3.getInt(6);
                try {
                    inetSocketAddress0 = new InetSocketAddress(s1, v3);
                }
                catch(IllegalArgumentException | SecurityException exception0) {
                    aujt.a.h(exception0, "Failed to create InetSocketAddress", new Object[0]);
                    kau2 = null;
                    goto label_228;
                }
                kau2 = new kau(inetSocketAddress0, new aumd(s2, z, v4, v5, v6));
            label_228:
                if(kau2 != null) {
                    InetSocketAddress inetSocketAddress1 = (InetSocketAddress)kau2.a;
                    aume aume0 = (aume)map3.get(inetSocketAddress1);
                    if(aume0 == null) {
                        aume0 = new aume(inetSocketAddress1);
                        map3.put(inetSocketAddress1, aume0);
                    }
                    aume0.c(((aumd)kau2.b));
                }
            }
        }
        catch(SQLiteException unused_ex) {
            goto label_267;
        }
        catch(Throwable throwable1) {
        }
        goto label_315;
    label_238:
        if(cursor7 != null) {
            cursor7.close();
        }
        if(cursor4 != null) {
            cursor4.close();
        }
        if(cursor6 != null) {
            cursor6.close();
        }
        if(cursor5 != null) {
            cursor5.close();
        }
        if(cursor2 != null) {
            cursor2.close();
        }
        cursor3.close();
        sQLiteDatabase0.close();
        aujm1 = aujm2;
        goto label_291;
        try {
        label_252:
            cursor7 = cursor1;
            cursor5 = cursor9;
            cursor6 = cursor8;
            cursor2 = cursor10;
            String s3 = cursor2.getString(0);
            cursor2.getInt(1);
            cursor2.getLong(2);
            aujf aujf0 = new aujf(s3);
            auji0.a.put(aujf0.a, aujf0);
            cursor10 = cursor2;
            cursor8 = cursor6;
            cursor9 = cursor5;
            cursor1 = cursor7;
            goto label_170;
        }
        catch(SQLiteException unused_ex) {
        label_266:
            cursor3 = null;
        label_267:
            aujm1 = aujm2;
            cursor0 = cursor7;
            try {
            label_269:
                aujm1.b.c(sQLiteDatabase0);
                map0.clear();
                map1.clear();
                map2.clear();
                map3.clear();
                auji0.b();
                goto label_278;
            }
            catch(Throwable throwable1) {
                goto label_316;
            label_278:
                if(cursor0 != null) {
                    cursor0.close();
                }
                if(cursor4 != null) {
                    cursor4.close();
                }
                if(cursor6 != null) {
                    cursor6.close();
                }
                if(cursor5 != null) {
                    cursor5.close();
                }
                if(cursor2 != null) {
                    cursor2.close();
                }
                if(cursor3 != null) {
                    cursor3.close();
                }
                sQLiteDatabase0.close();
            label_291:
                aujm1.a.f("%d CastNetworkInfo instances loaded, %d CastDeviceInfo instances loaded, %d paired guest mode devices loaded.", new Object[]{map0.size(), map1.size(), auji0.a().size()});
            label_292:
                for(Object object3: this.j().values()) {
                    aujd aujd3 = (aujd)object3;
                    String s4 = aujd3.c.l;
                    if(!TextUtils.isEmpty(s4)) {
                        this.d.put(s4, aujd3);
                    }
                }
                if(hqsq.c()) {
                    for(Object object4: this.j().values()) {
                        this.t(((aujd)object4).c);
                    }
                }
                this.m.countDown();
                if(this.h.h()) {
                    this.i.g(this);
                    return;
                }
                return;
            }
            return;
        }
        catch(Throwable throwable1) {
        }
    label_314:
        cursor3 = null;
    label_315:
        cursor0 = cursor7;
    label_316:
        if(cursor0 != null) {
            cursor0.close();
        }
        if(cursor4 != null) {
            cursor4.close();
        }
        if(cursor6 != null) {
            cursor6.close();
        }
        if(cursor5 != null) {
            cursor5.close();
        }
        if(cursor2 != null) {
            cursor2.close();
        }
        if(cursor3 != null) {
            cursor3.close();
        }
        sQLiteDatabase0.close();
        throw throwable1;
    }

    public final void p() {
        synchronized(this) {
            avjh avjh0 = this.g;
            avjh0.m("Start purging expired records...");
            this.y();
            HashMap hashMap0 = new HashMap();
            for(Object object0: new HashMap(this.j()).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                aujd aujd0 = (aujd)map$Entry0.getValue();
                if(aujd0.l(System.currentTimeMillis(), hqpu.a.b().b())) {
                    aunj aunj0 = aujd0.d;
                    if(this.h.r() && aunj0 != null && !aunj0.a()) {
                        hashMap0.put(((String)map$Entry0.getKey()), aujd0);
                    }
                    avjh0.c("Total purge of device: %s", new Object[]{aujd0.c.e()});
                    this.q(((String)map$Entry0.getKey()));
                }
            }
            for(Object object1: new HashMap(this.l()).entrySet()) {
                Map.Entry map$Entry1 = (Map.Entry)object1;
                auju auju0 = (auju)map$Entry1.getValue();
                if(auju0.a(this).isEmpty()) {
                    avjh0.n("Removing network %s", auju0.b);
                    this.l().remove(map$Entry1.getKey());
                }
            }
            for(Object object2: hashMap0.entrySet()) {
                Map.Entry map$Entry2 = (Map.Entry)object2;
                if(((aujd)map$Entry2.getValue()).d != null) {
                    this.j().put(((String)map$Entry2.getKey()), ((aujd)map$Entry2.getValue()));
                }
            }
        }
    }

    public final void q(String s) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
    }

    public static void r(auiz auiz0, CastDevice castDevice0, String s) {
        aume aume0 = auiz0.g(new InetSocketAddress(castDevice0.c, castDevice0.g));
        aumd aumd0 = aume0 == null ? null : aume0.a(s);
        if(aumd0 != null) {
            aumd0.a();
        }
    }

    // Detected as a lambda impl.
    public final void s() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        this.g.f("Saving the database", new Object[0]);
        if(this.h.x()) {
            aumb aumb0 = this.k;
            if(aumb0 != null) {
                aumb0.b();
            }
            aumm aumm0 = this.j;
            if(aumm0 != null) {
                aumm0.b();
            }
            this.b.b();
            FIN.finallyExec$NT(v);
            return;
        }
        aujm aujm0 = this.s;
        if(aujm0 != null) {
            try {
                Map map0 = this.l();
                Map map1 = this.j();
                Map map2 = this.d;
                Map map3 = this.m();
                auji auji0 = this.l;
                SQLiteDatabase sQLiteDatabase0 = aujm0.b.getWritableDatabase();
            }
            catch(SQLiteException unused_ex) {
                FIN.finallyExec$NT(v);
                return;
            }
            try {
                int v1 = FIN.finallyOpen$NT();
                sQLiteDatabase0.beginTransaction();
                sQLiteDatabase0.delete("NetworkInfo", null, null);
                sQLiteDatabase0.delete("DeviceInfo", null, null);
                sQLiteDatabase0.delete("NetworkToDevice", null, null);
                sQLiteDatabase0.delete("GuestModeAppInfo", null, null);
                sQLiteDatabase0.delete("GuestModeDiscoveryInfo", null, null);
                sQLiteDatabase0.delete("ProbedSocketAddress", null, null);
                HashMap hashMap0 = new HashMap();
                int v2 = 0;
                Iterator iterator0 = map0.values().iterator();
            alab1:
                while(true) {
                    if(!iterator0.hasNext()) {
                        int v3 = 0;
                        int v4 = 0;
                        for(Object object0: map1.values()) {
                            if(aujm0.a(sQLiteDatabase0, ((aujd)object0))) {
                                ++v4;
                            }
                            else {
                                ++v3;
                            }
                        }
                        int v5 = 0;
                        Iterator iterator2 = hashMap0.entrySet().iterator();
                        while(true) {
                            if(!iterator2.hasNext()) {
                                int v6 = 0;
                                Iterator iterator3 = auji0.a().iterator();
                                while(iterator3.hasNext()) {
                                    Object object1 = iterator3.next();
                                    String s = ((aujd)object1).c.f();
                                    aujg aujg0 = ((aujd)object1).g;
                                    if(aujg0 == null) {
                                        iterator4 = iterator3;
                                    }
                                    else {
                                        String s1 = aujg0.b;
                                        if(s1 == null) {
                                            iterator4 = iterator3;
                                        }
                                        else {
                                            Iterator iterator4 = iterator3;
                                            aujg0.b = s1.replace(":", "");
                                        }
                                        Set set0 = aujg0.a;
                                        if(!set0.isEmpty()) {
                                            Iterator iterator5 = set0.iterator();
                                            HashSet hashSet0 = new HashSet();
                                            while(iterator5.hasNext()) {
                                                Object object2 = iterator5.next();
                                                String s2 = (String)object2;
                                                if(s2.contains(":")) {
                                                    iterator5.remove();
                                                    hashSet0.add(s2.replace(":", ""));
                                                    map3 = map3;
                                                    v6 = v6;
                                                    auji0 = auji0;
                                                }
                                                else {
                                                    map3 = map3;
                                                    v6 = v6;
                                                }
                                            }
                                            int v7 = v6;
                                            Map map4 = map3;
                                            auji auji1 = auji0;
                                            set0.addAll(hashSet0);
                                            goto label_88;
                                        }
                                    }
                                    v7 = v6;
                                    map4 = map3;
                                    auji1 = auji0;
                                label_88:
                                    if(aujg0 != null) {
                                        ContentValues contentValues0 = new ContentValues();
                                        contentValues0.put("DEVICE_ID", s);
                                        contentValues0.put("BSSID", aujg0.b);
                                        contentValues0.put("CACHED_PIN", aujg0.c);
                                        if(sQLiteDatabase0.replace("GuestModeDiscoveryInfo", null, contentValues0) == -1L) {
                                            aujm0.a.d("Unable to insert (deviceId %s, guestModeDiscoveryInfo %s) pair.", new Object[]{s, aujg0});
                                        }
                                        else {
                                            v6 = v7 + 1;
                                            iterator3 = iterator4;
                                            map3 = map4;
                                            goto label_103;
                                        }
                                    }
                                    iterator3 = iterator4;
                                    map3 = map4;
                                    v6 = v7;
                                label_103:
                                    auji0 = auji1;
                                }
                                for(Object object3: map2.values()) {
                                    aujd aujd0 = (aujd)object3;
                                    String s3 = aujd0.c.f();
                                    if(!TextUtils.isEmpty(s3) && map1.containsKey(s3)) {
                                        continue;
                                    }
                                    if(aujm0.a(sQLiteDatabase0, aujd0)) {
                                        ++v4;
                                    }
                                    else {
                                        ++v3;
                                    }
                                }
                                int v8 = 0;
                                int v9 = 0;
                                Iterator iterator7 = map3.values().iterator();
                                while(iterator7.hasNext()) {
                                    Object object4 = iterator7.next();
                                    avjh avjh0 = aujm0.a;
                                    InetSocketAddress inetSocketAddress0 = ((aume)object4).a;
                                    avjh0.n("Saving %s", inetSocketAddress0);
                                    for(Object object5: ((aume)object4).b().values()) {
                                        aumd aumd0 = (aumd)object5;
                                        ContentValues contentValues1 = new ContentValues();
                                        if(hqpu.a.b().j()) {
                                            InetAddress inetAddress0 = inetSocketAddress0.getAddress();
                                            String s4 = inetAddress0 == null ? "unknown_host_name" : inetAddress0.getHostAddress();
                                        }
                                        else {
                                            s4 = inetSocketAddress0.getHostName();
                                        }
                                        Iterator iterator9 = iterator7;
                                        contentValues1.put("host_name", s4);
                                        contentValues1.put("port", Integer.valueOf(inetSocketAddress0.getPort()));
                                        contentValues1.put("network_id", aumd0.a);
                                        contentValues1.put("is_responding_to_probe", Integer.valueOf(((int)aumd0.b)));
                                        contentValues1.put("last_probed_timestamp_millis", Long.valueOf(aumd0.c));
                                        contentValues1.put("probing_error_code", Integer.valueOf(aumd0.d));
                                        contentValues1.put("number_of_probed_times", Integer.valueOf(aumd0.e));
                                        if(sQLiteDatabase0.replace("ProbedSocketAddress", null, contentValues1) != -1L) {
                                            v8 = v8;
                                            v9 = v9;
                                            iterator7 = iterator9;
                                            continue;
                                        }
                                        avjh0.d("Unable to insert probed socket address: %s, %s", new Object[]{inetSocketAddress0, aumd0});
                                        ++v9;
                                        v8 = v8;
                                        goto label_156;
                                    }
                                    iterator9 = iterator7;
                                    ++v8;
                                label_156:
                                    iterator7 = iterator9;
                                }
                                Integer integer0 = (int)0;
                                aujm0.a.f("[CastNetworkInfo] saved: %d, skipped: %d, [CastDeviceInfo]: saved %d, skipped %d, [Paired Guest Mode DeviceInfo] saved: %d, skipped: %d. [ProbedNetworks]: saved %d, skipped: %d, [ProbedSocketAddress]: saved %d, skipped: %d, [Network-Device pairs]: saved: %d", new Object[]{v2, ((int)(map0.size() - v2)), v4, v3, v6, ((int)(auji0.a().size() - v6)), integer0, integer0, v8, v9, v5});
                                sQLiteDatabase0.setTransactionSuccessful();
                                sQLiteDatabase0.endTransaction();
                                break alab1;
                            }
                            Object object6 = iterator2.next();
                            String s5 = (String)((Map.Entry)object6).getKey();
                            for(Object object7: ((Set)((Map.Entry)object6).getValue())) {
                                String s6 = (String)object7;
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("network_id", s5);
                                contentValues2.put("device_id", s6);
                                if(sQLiteDatabase0.replace("NetworkToDevice", null, contentValues2) == -1L) {
                                    aujm0.a.d("Unable to insert networkId %s deviceId %s pair.", new Object[]{s5, s6});
                                }
                                else {
                                    ++v5;
                                }
                                map0 = map0;
                                iterator2 = iterator2;
                                map2 = map2;
                            }
                        }
                    }
                    Object object8 = iterator0.next();
                    ContentValues contentValues3 = new ContentValues();
                    String s7 = ((auju)object8).b;
                    contentValues3.put("network_id", s7);
                    contentValues3.put("last_connected_timestamp_millis", Long.valueOf(((auju)object8).c));
                    if(sQLiteDatabase0.replace("NetworkInfo", null, contentValues3) == -1L) {
                        aujm0.a.d("Unable to insert CastNetworkInfo: %s.", new Object[]{s7});
                    }
                    else {
                        ++v2;
                    }
                    ArrayList arrayList0 = new ArrayList();
                    ArrayList arrayList1 = new ArrayList(((auju)object8).a);
                    __monitor_enter(map1);
                    try {
                        for(Object object9: arrayList1) {
                            aujd aujd1 = (aujd)map1.get(((String)object9));
                            if(aujd1 == null) {
                                continue;
                            }
                            arrayList0.add(aujd1);
                        }
                    }
                    catch(Throwable throwable0) {
                        __monitor_exit(map1);
                        throw throwable0;
                    }
                    __monitor_exit(map1);
                    ArrayList arrayList2 = new ArrayList(DesugarCollections.unmodifiableCollection(arrayList0));
                    Collections.sort(arrayList2, new aujb());
                    if(!arrayList2.isEmpty()) {
                        HashSet hashSet1 = new HashSet();
                        int v10;
                        for(v10 = arrayList2.size() - Math.min(arrayList2.size(), ((int)hqti.a.b().a())); v10 < arrayList2.size(); ++v10) {
                            hashSet1.add(((aujd)arrayList2.get(v10)).c.f());
                        }
                        hashMap0.put(s7, hashSet1);
                    }
                    iterator0 = iterator0;
                }
            }
            catch(SQLiteException sQLiteException0) {
                aujm0.a.e(sQLiteException0, "SqliteException when trying to save the database", new Object[0]);
            }
            FIN.finallyCodeBegin$NT(v1);
            sQLiteDatabase0.close();
            FIN.finallyCodeEnd$NT(v1);
            cjpa cjpa0 = aujm0.c.c();
            cjpa0.f("com.google.android.gms.cast.discovery.database.FLAG_CONTROLLED_DATABASE_VERSION_KEY", aujm0.d);
            cjpd.f(cjpa0);
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        FIN.finallyExec$NT(v);
    }

    public final void t(CastDevice castDevice0) {
        synchronized(this) {
            if(!TextUtils.isEmpty(castDevice0.f())) {
                String s = castDevice0.n;
                if(!TextUtils.isEmpty(s)) {
                    this.q.put(s, castDevice0.f());
                }
            }
        }
    }

    public final boolean u() {
        synchronized(this) {
            if(!this.y()) {
                this.g.m("Database not loaded");
                return false;
            }
            String s = this.t.b(null);
            this.g.n("currentNetworkId: %s", s);
            auju auju0 = this.e(s);
            this.g.n("getWifiNetworkInfoById(currentNetworkId): %s", auju0);
            if(s != null && this.e(s) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean v(String s) {
        aujd aujd0;
        synchronized(this) {
            if(!avij.e().r()) {
                this.g.g("Wake-on-lan is not supported and shouldn\'t be called", new Object[0]);
                return false;
            }
            aujd0 = this.c(s);
            if(aujd0 == null) {
                return false;
            }
        }
        return aujd0.d != null;
    }

    private final void w(int v) {
        auis auis0 = new auis(this, v);
        this.r.post(auis0);
    }

    private final void x(aujd aujd0) {
        CastDevice castDevice1;
        aufx aufx0 = this.e;
        if(aufx0 != null && aujd0 != null) {
            CastDevice castDevice0 = aujd0.c;
            if(aufx0.h(castDevice0) && !castDevice0.r()) {
                int v = 2;
                int v1 = castDevice0.h;
                if(this.h.F()) {
                    atrq atrq0 = new atrq(aujd0.c);
                    atrq0.k = Boolean.valueOf(true);
                    castDevice1 = atrq0.a();
                }
                else {
                    if(v1 != -1) {
                        v = 2 | v1;
                    }
                    atrq atrq1 = new atrq(aujd0.c);
                    atrq1.j = v;
                    castDevice1 = atrq1.a();
                }
                aujd0.j(castDevice1, false);
            }
        }
    }

    private final boolean y() {
        try {
            long v = (long)(((Long)this.f.mr()));
            return this.m.await(v, TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException unused_ex) {
            return false;
        }
    }
}


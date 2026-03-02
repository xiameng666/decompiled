import android.app.BroadcastOptions;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.ModuleUploadFactory;
import com.google.android.gms.measurement.internal.TriggerUriParcel;
import com.google.android.gms.measurement.internal.UploadBatchesCriteria;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import j..nio.channels.DesugarChannels;
import j..util.DesugarCollections;
import j..util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

public class crqq implements crlw {
    private boolean A;
    private FileLock B;
    private FileChannel C;
    private long D;
    private final Map E;
    private final Map F;
    private final Map G;
    private crns H;
    private String I;
    private crdj J;
    private final crqw K;
    public final crkk a;
    public crdg b;
    public crjp c;
    public crpx d;
    public crcm e;
    public crnn f;
    public crpb g;
    public crka h;
    public final crkt i;
    public final AtomicBoolean j;
    long k;
    public List l;
    public final Deque m;
    public int n;
    public int o;
    public boolean p;
    public List q;
    public List r;
    public final Map s;
    public long t;
    public final crpy u;
    private static volatile crqq v;
    private final crjn w;
    private final crqt x;
    private boolean y;
    private boolean z;

    public crqq(crqr crqr0) {
        this.j = new AtomicBoolean(false);
        this.m = new LinkedList();
        this.s = new HashMap();
        this.K = new crqm(this);
        this.i = crkt.i(crqr0.a);
        this.D = -1L;
        this.u = new crpy(this);
        crqt crqt0 = new crqt(this);
        crqt0.aB();
        this.x = crqt0;
        crjn crjn0 = crqr0.a(this);
        crjn0.aB();
        this.w = crjn0;
        crkk crkk0 = new crkk(this);
        crkk0.aB();
        this.a = crkk0;
        this.E = new HashMap();
        this.F = new HashMap();
        this.G = new HashMap();
        this.aK().f(new crqf(this, crqr0));
    }

    public final crqx A() {
        batl.s(this.i);
        return this.i.p();
    }

    final String B(crmb crmb0) {
        if(crmb0.q()) {
            byte[] arr_b = new byte[16];
            this.A().E().nextBytes(arr_b);
            return String.format(Locale.US, "%032x", new BigInteger(1, arr_b));
        }
        return null;
    }

    final String C(AppMetadata appMetadata0) {
        Future future0 = this.aK().a(new crqk(this, appMetadata0));
        try {
            return (String)future0.get(30000L, TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException | InterruptedException | ExecutionException exception0) {
            this.aJ().c.c("Failed to get app instance id. appId", crji.a(appMetadata0.a), exception0);
            return null;
        }
    }

    final List D(AppMetadata appMetadata0, Bundle bundle0) {
        this.E();
        hvhs.c();
        crcu crcu0 = this.n();
        String s = appMetadata0.a;
        if(crcu0.u(s, crif.aC) && s != null) {
            if(bundle0 != null) {
                int[] arr_v = bundle0.getIntArray("uriSources");
                long[] arr_v1 = bundle0.getLongArray("uriTimestamps");
                if(arr_v != null) {
                    if(arr_v1 != null && arr_v1.length == arr_v.length) {
                        for(int v = 0; v < arr_v.length; ++v) {
                            crdg crdg0 = this.o();
                            int v1 = arr_v[v];
                            long v2 = arr_v1[v];
                            batl.q(s);
                            crdg0.n();
                            crdg0.aA();
                            try {
                                SQLiteDatabase sQLiteDatabase0 = crdg0.g();
                                crdg0.aJ().k.d(a.f(sQLiteDatabase0.delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{s, String.valueOf(v1), String.valueOf(v2)}), "Pruned ", " trigger URIs. appId, source, timestamp"), s, Integer.valueOf(v1), Long.valueOf(v2));
                            }
                            catch(SQLiteException sQLiteException0) {
                                crdg0.aJ().c.c("Error pruning trigger URIs. appId", crji.a(s), sQLiteException0);
                            }
                        }
                    }
                    else {
                        this.aJ().c.a("Uri sources and timestamps do not match");
                    }
                }
            }
            crdg crdg1 = this.o();
            String s1 = appMetadata0.a;
            batl.q(s1);
            crdg1.n();
            crdg1.aA();
            List list0 = new ArrayList();
            Cursor cursor0 = null;
            try {
                try {
                    cursor0 = crdg1.g().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{s1}, null, null, "rowid", null);
                    if(cursor0.moveToFirst()) {
                        do {
                            String s2 = cursor0.getString(0);
                            if(s2 == null) {
                                s2 = "";
                            }
                            list0.add(new TriggerUriParcel(s2, cursor0.getLong(1), cursor0.getInt(2)));
                        }
                        while(cursor0.moveToNext());
                    }
                }
                catch(SQLiteException sQLiteException1) {
                    crdg1.aJ().c.c("Error querying trigger uris. appId", crji.a(s1), sQLiteException1);
                    list0 = Collections.EMPTY_LIST;
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
        return new ArrayList();
    }

    public final void E() {
        this.aK().n();
    }

    final void F() {
        this.E();
        this.G();
        if(!this.y) {
            this.y = true;
            if(this.ap()) {
                FileChannel fileChannel0 = this.C;
                this.E();
                int v = 0;
                if(fileChannel0 != null && fileChannel0.isOpen()) {
                    ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
                    try {
                        fileChannel0.position(0L);
                        int v1 = fileChannel0.read(byteBuffer0);
                        switch(v1) {
                            case -1: {
                                break;
                            }
                            case 4: {
                                byteBuffer0.flip();
                                v = byteBuffer0.getInt();
                                break;
                            }
                            default: {
                                this.aJ().f.b("Unexpected data length. Bytes read", Integer.valueOf(v1));
                            }
                        }
                    }
                    catch(IOException iOException0) {
                        this.aJ().c.b("Failed to read from channel", iOException0);
                    }
                }
                else {
                    this.aJ().c.a("Bad channel to read from");
                }
                int v2 = this.i.d().r();
                this.E();
                if(v > v2) {
                    this.aJ().c.c("Panic: can\'t downgrade version. Previous, current version", Integer.valueOf(v), Integer.valueOf(v2));
                    return;
                }
                if(v < v2) {
                    FileChannel fileChannel1 = this.C;
                    this.E();
                    if(fileChannel1 != null && fileChannel1.isOpen()) {
                        ByteBuffer byteBuffer1 = ByteBuffer.allocate(4);
                        byteBuffer1.putInt(v2);
                        byteBuffer1.flip();
                        try {
                            fileChannel1.truncate(0L);
                            fileChannel1.write(byteBuffer1);
                            fileChannel1.force(true);
                            if(fileChannel1.size() != 4L) {
                                this.aJ().c.b("Error writing to channel. Bytes written", Long.valueOf(fileChannel1.size()));
                            }
                        }
                        catch(IOException iOException1) {
                            this.aJ().c.b("Failed to write to channel", iOException1);
                            goto label_46;
                        }
                        this.aJ().k.c("Storage version upgraded. Previous, current version", Integer.valueOf(v), Integer.valueOf(v2));
                        return;
                    }
                    this.aJ().c.a("Bad channel to read from");
                label_46:
                    this.aJ().c.c("Storage version upgrade failed. Previous, current version", Integer.valueOf(v), Integer.valueOf(v2));
                }
            }
        }
    }

    final void G() {
        if(this.j.get()) {
            return;
        }
        throw new IllegalStateException("UploadController is not initialized");
    }

    public final void H() {
        this.E();
        if(!this.z && !this.p && !this.A) {
            this.aJ().k.a("Stopping uploading service(s)");
            List list0 = this.l;
            if(list0 == null) {
                return;
            }
            for(Object object0: list0) {
                ((Runnable)object0).run();
            }
            List list1 = this.l;
            batl.s(list1);
            list1.clear();
            return;
        }
        this.aJ().k.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.z), Boolean.valueOf(this.p), Boolean.valueOf(this.A));
    }

    final void I(String s, crst crst0) {
        crkk crkk0 = this.v();
        crkk0.n();
        crkk0.h(s);
        Set set0 = (Set)crkk0.b.get(s);
        if(set0 != null) {
            if(!crst0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)crst0).ensureMutable();
            }
            crsu crsu0 = (crsu)crst0.b_message;
            hfuo hfuo0 = crsu0.P;
            if(!hfuo0.c()) {
                crsu0.P = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(set0, crsu0.P);
        }
        crkk crkk1 = this.v();
        crkk1.n();
        crkk1.h(s);
        if(crkk1.b.get(s) != null && (((Set)crkk1.b.get(s)).contains("device_model") || ((Set)crkk1.b.get(s)).contains("device_info"))) {
            if(!crst0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)crst0).ensureMutable();
            }
            crsu crsu1 = (crsu)crst0.b_message;
            crsu1.b &= 0xFFFFFEFF;
            crsu1.n = crsu.a.n;
        }
        if(this.v().t(s)) {
            String s1 = ((crsu)crst0.b_message).m;
            if(!TextUtils.isEmpty(s1)) {
                int v = s1.indexOf(".");
                if(v != -1) {
                    String s2 = s1.substring(0, v);
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    crsu crsu2 = (crsu)crst0.b_message;
                    s2.getClass();
                    crsu2.b |= 0x80;
                    crsu2.m = s2;
                }
            }
        }
        crkk crkk2 = this.v();
        crkk2.n();
        crkk2.h(s);
        if(crkk2.b.get(s) != null && ((Set)crkk2.b.get(s)).contains("user_id")) {
            int v1 = crqt.b(crst0, "_id");
            if(v1 != -1) {
                crst0.o(v1);
            }
        }
        crkk crkk3 = this.v();
        crkk3.n();
        crkk3.h(s);
        if(crkk3.b.get(s) != null && ((Set)crkk3.b.get(s)).contains("google_signals")) {
            if(!crst0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)crst0).ensureMutable();
            }
            crsu crsu3 = (crsu)crst0.b_message;
            crsu3.b &= 0x7FFFFFFF;
            crsu3.I = crsu.a.I;
        }
        if(this.v().s(s)) {
            if(!crst0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)crst0).ensureMutable();
            }
            crsu crsu4 = (crsu)crst0.b_message;
            crsu4.b &= 0xFFFBFFFF;
            crsu4.x = crsu.a.x;
            if(this.w(s).q()) {
                Map map0 = this.G;
                crqo crqo0 = (crqo)map0.get(s);
                if(crqo0 == null) {
                    crqo0 = new crqo(this, this.A().A());
                    map0.put(s, crqo0);
                }
                else {
                    long v2 = this.n().j(s, crif.ad);
                    this.av();
                    long v3 = SystemClock.elapsedRealtime();
                    if(crqo0.b + v2 < v3) {
                        crqo0 = new crqo(this, this.A().A());
                        map0.put(s, crqo0);
                    }
                }
                if(!crst0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)crst0).ensureMutable();
                }
                crsu crsu5 = (crsu)crst0.b_message;
                crqo0.a.getClass();
                crsu5.c |= 0x4000;
                crsu5.Q = crqo0.a;
            }
        }
        crkk crkk4 = this.v();
        crkk4.n();
        crkk4.h(s);
        if(crkk4.b.get(s) != null && ((Set)crkk4.b.get(s)).contains("enhanced_user_id")) {
            if(!crst0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)crst0).ensureMutable();
            }
            ((crsu)crst0.b_message).c &= 0xFFFFDFFF;
            ((crsu)crst0.b_message).O = crsu.a.O;
        }
    }

    final void J(crca crca0) {
        this.E();
        if(TextUtils.isEmpty(crca0.y())) {
            String s = crca0.t();
            batl.s(s);
            this.R(s, 204, null, null, null);
            return;
        }
        String s1 = crca0.t();
        batl.s(s1);
        this.aJ().k.b("Fetching remote configuration", s1);
        crry crry0 = this.v().d(s1);
        crkk crkk0 = this.v();
        crkk0.n();
        String s2 = (String)crkk0.h.get(s1);
        Map map0 = null;
        if(crry0 != null) {
            if(!TextUtils.isEmpty(s2)) {
                bxd bxd0 = new bxd();
                bxd0.put("If-Modified-Since", s2);
                map0 = bxd0;
            }
            crkk crkk1 = this.v();
            crkk1.n();
            String s3 = (String)crkk1.i.get(s1);
            if(!TextUtils.isEmpty(s3)) {
                if(map0 == null) {
                    map0 = new bxd();
                }
                map0.put("If-None-Match", s3);
            }
        }
        this.z = true;
        this.t().b(crca0, map0, (String s, int v, Throwable throwable0, byte[] arr_b, Map map0) -> {
            boolean z;
            this.E();
            this.G();
            batl.q(s);
            try {
                if(arr_b == null) {
                    arr_b = new byte[0];
                }
                crjg crjg0 = this.aJ().k;
                Integer integer0 = (int)arr_b.length;
                crjg0.b("onConfigFetched. Response size", integer0);
                if(this.n().t(crif.aT)) {
                    this.z().u(map0);
                }
                this.o().C();
                try {
                    crca crca0 = this.o().i(s);
                    if(v == 200) {
                    label_19:
                        z = throwable0 == null;
                    }
                    else {
                        switch(v) {
                            case 204: {
                                goto label_19;
                            }
                            case 304: {
                                v = 304;
                                goto label_19;
                            }
                            default: {
                                z = false;
                            }
                        }
                    }
                    if(crca0 == null) {
                        this.aJ().f.b("App does not exist in onConfigFetched. appId", crji.a(s));
                        this.o().O();
                    }
                    else if(!z && v != 404) {
                        this.av();
                        crca0.Q(System.currentTimeMillis());
                        this.o().P(crca0);
                        this.aJ().k.c("Fetching config failed. code, error", Integer.valueOf(v), throwable0);
                        this.v().g(s);
                        crju crju0 = this.g.e;
                        this.av();
                        crju0.b(System.currentTimeMillis());
                        if(v == 429 || v == 503) {
                            crju crju1 = this.g.c;
                            this.av();
                            crju1.b(System.currentTimeMillis());
                        }
                        this.ae();
                        this.o().O();
                    }
                    else {
                        this.z();
                        String s1 = crqt.F(map0, "Last-Modified");
                        this.z();
                        String s2 = crqt.F(map0, "ETag");
                        if(v == 304 || v == 404) {
                            if(this.v().d(s) != null || this.v().r(s, null, null, null)) {
                            label_48:
                                this.av();
                                crca0.N(System.currentTimeMillis());
                                this.o().P(crca0);
                                if(v == 404) {
                                    this.aJ().h.b("Config not found. Using empty config. appId", s);
                                }
                                else {
                                    this.aJ().k.c("Successfully fetched config. Got network response. code, size", Integer.valueOf(v), integer0);
                                }
                                if(this.t().f() && this.aD()) {
                                    this.ai();
                                }
                                else if(this.t().f() && this.o().T(crca0.t())) {
                                    this.ak(crca0.t());
                                }
                                else {
                                    this.ae();
                                }
                                this.o().O();
                            }
                        }
                        else if(!this.v().r(s, arr_b, s1, s2)) {
                        }
                        else {
                            goto label_48;
                        }
                    }
                }
                finally {
                    this.o().J();
                }
            }
            finally {
                this.z = false;
                this.H();
            }
        });
    }

    final void K(AppMetadata appMetadata0, long v) {
        crdg crdg0 = this.o();
        batl.s(appMetadata0.a);
        crca crca0 = crdg0.i(appMetadata0.a);
        if(crca0 != null) {
            crqx crqx0 = this.A();
            String s = crca0.y();
            if(crqx0.af(appMetadata0.b, s)) {
                this.aJ().f.b("New GMP App Id passed in. Removing cached database data. appId", crji.a(crca0.t()));
                this.o().D(crca0.t());
                crca0 = null;
            }
        }
        int v1 = 1;
        if(crca0 != null) {
            int v2 = Long.compare(crca0.c(), 0xFFFFFFFF80000000L) == 0 || crca0.c() == appMetadata0.j ? 0 : 1;
            String s1 = crca0.w();
            if(crca0.c() != 0xFFFFFFFF80000000L || s1 == null || s1.equals(appMetadata0.c)) {
                v1 = 0;
            }
            if((v2 | v1) != 0) {
                Bundle bundle0 = new Bundle();
                bundle0.putString("_pv", s1);
                EventParcel eventParcel0 = new EventParcel("_au", new EventParams(bundle0), "auto", v, 0L);
                if(this.n().t(crif.aM)) {
                    this.P(eventParcel0, appMetadata0);
                    return;
                }
                this.N(eventParcel0, appMetadata0);
            }
        }
    }

    final void L(crca crca0, crst crst0) {
        int v9;
        crtg crtg0;
        crcz crcz0;
        crcy crcy1;
        this.E();
        this.G();
        String s = ((crsu)crst0.b_message).T;
        EnumMap enumMap0 = new EnumMap(crma.class);
        if(s.length() >= crma.values().length && s.charAt(0) == 49) {
            crma[] arr_crma = crma.values();
            int v = 0;
            int v1 = 1;
            while(v < arr_crma.length) {
                crma crma0 = arr_crma[v];
                int v2 = s.charAt(v1);
                crcy[] arr_crcy = crcy.values();
                int v3 = 0;
                while(true) {
                    if(v3 < arr_crcy.length) {
                        crcy crcy0 = arr_crcy[v3];
                        if(crcy0.k == v2) {
                            crcy1 = crcy0;
                            break;
                        }
                        else {
                            ++v3;
                            continue;
                        }
                    }
                    crcy1 = crcy.a;
                    break;
                }
                enumMap0.put(crma0, crcy1);
                ++v;
                ++v1;
            }
            crcz0 = new crcz(enumMap0);
        }
        else {
            crcz0 = new crcz();
        }
        String s1 = crca0.t();
        this.E();
        this.G();
        crmb crmb0 = this.w(s1);
        switch(crmb0.c().ordinal()) {
            case 1: {
                crcz0.b(crma.a, crcy.i);
                break;
            }
            case 2: 
            case 3: {
                crcz0.a(crma.a, crmb0.c);
                break;
            }
            default: {
                crcz0.b(crma.a, crcy.j);
            }
        }
        switch(crmb0.d().ordinal()) {
            case 1: {
                crcz0.b(crma.b, crcy.i);
                break;
            }
            case 2: 
            case 3: {
                crcz0.a(crma.b, crmb0.c);
                break;
            }
            default: {
                crcz0.b(crma.b, crcy.j);
            }
        }
        String s2 = crca0.t();
        this.E();
        this.G();
        crdk crdk0 = this.p(s2, this.q(s2), this.w(s2), crcz0);
        batl.s(crdk0.d);
        boolean z = crdk0.d.booleanValue();
        if(!crst0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)crst0).ensureMutable();
        }
        ((crsu)crst0.b_message).c |= 0x40000;
        ((crsu)crst0.b_message).U = z;
        String s3 = crdk0.e;
        if(!TextUtils.isEmpty(s3)) {
            if(!crst0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)crst0).ensureMutable();
            }
            crsu crsu0 = (crsu)crst0.b_message;
            s3.getClass();
            crsu0.c |= 0x80000;
            crsu0.V = s3;
        }
        this.E();
        this.G();
        for(Object object0: DesugarCollections.unmodifiableList(((crsu)crst0.b_message).f)) {
            crtg0 = (crtg)object0;
            if(!"_npa".equals(crtg0.d)) {
                continue;
            }
            goto label_72;
        }
        crtg0 = null;
    label_72:
        if(crtg0 == null) {
            int v4 = this.b(crca0.t(), crcz0);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)crtg.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            crtg crtg1 = (crtg)hftp0.b_message;
            crtg1.b |= 2;
            crtg1.d = "_npa";
            this.av();
            long v5 = System.currentTimeMillis();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((crtg)hftv0).b |= 1;
            ((crtg)hftv0).c = v5;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            crtg crtg2 = (crtg)hftp0.b_message;
            crtg2.b |= 8;
            crtg2.f = (long)v4;
            crst0.n(((crtg)hftp0.N_build()));
            this.aJ().k.c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(v4));
        }
        else {
            crma crma1 = crma.d;
            crcy crcy2 = (crcy)crcz0.a.get(crma1);
            if(crcy2 == null) {
                crcy2 = crcy.a;
            }
            if(crcy2 == crcy.a) {
                crqv crqv0 = this.o().s(crca0.t(), "_npa");
                if(crqv0 == null) {
                    Boolean boolean0 = crca0.p();
                    if(boolean0 != null && (!boolean0.booleanValue() || crtg0.f == 1L) && (boolean0.booleanValue() || crtg0.f == 0L)) {
                        crcz0.b(crma1, crcy.d);
                    }
                    else {
                        crcz0.b(crma1, crcy.f);
                    }
                }
                else {
                    String s4 = crqv0.b;
                    if("tcf".equals(s4)) {
                        crcz0.b(crma1, crcy.h);
                    }
                    else if("app".equals(s4)) {
                        crcz0.b(crma1, crcy.f);
                    }
                    else {
                        crcz0.b(crma1, crcy.d);
                    }
                }
            }
        }
        String s5 = crcz0.toString();
        if(!crst0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)crst0).ensureMutable();
        }
        ((crsu)crst0.b_message).c |= 0x20000;
        ((crsu)crst0.b_message).T = s5;
        String s6 = crca0.t();
        boolean z1 = this.a.l(s6);
        List list0 = DesugarCollections.unmodifiableList(((crsu)crst0.b_message).e);
        for(int v6 = 0; v6 < list0.size(); ++v6) {
            if("_tcf".equals(((crso)list0.get(v6)).d)) {
                crso crso0 = (crso)list0.get(v6);
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)crso0).jf(5, null);
                hftp1.X(((ProtoLiteMessage)crso0));
                List list1 = DesugarCollections.unmodifiableList(((crso)((crsn)hftp1).b_message).c);
                for(int v7 = 0; v7 < list1.size(); ++v7) {
                    if("_tcfd".equals(((crsq)list1.get(v7)).c)) {
                        String s7 = ((crsq)list1.get(v7)).d;
                        if(z1 && s7.length() > 4) {
                            char[] arr_c = s7.toCharArray();
                            for(int v8 = 1; true; ++v8) {
                                v9 = 0;
                                if(v8 >= 0x40) {
                                    break;
                                }
                                if(arr_c[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(v8)) {
                                    v9 = v8;
                                    break;
                                }
                            }
                            arr_c[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(v9 | 1);
                            s7 = String.valueOf(arr_c);
                        }
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)crsq.a).v_newBuilder();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        crsq crsq0 = (crsq)hftp2.b_message;
                        crsq0.b |= 1;
                        crsq0.c = "_tcfd";
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        crsq crsq1 = (crsq)hftp2.b_message;
                        s7.getClass();
                        crsq1.b |= 2;
                        crsq1.d = s7;
                        ((crsn)hftp1).o(v7, hftp2);
                        break;
                    }
                }
                crst0.p(v6, ((crsn)hftp1));
                return;
            }
        }
    }

    final void M(crst crst0, crqn crqn0) {
        for(int v = 0; v < ((crsu)crst0.b_message).e.size(); ++v) {
            crso crso0 = crst0.a(v);
            String s = null;
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)crso0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)crso0));
            crsn crsn0 = (crsn)hftp0;
            for(Object object0: DesugarCollections.unmodifiableList(((crso)crsn0.b_message).c)) {
                if("_c".equals(((crsq)object0).c)) {
                    if(crqn0.a.W >= this.n().f(crqn0.a.r, crif.ae)) {
                        int v1 = this.n().f(crqn0.a.r, crif.ar);
                        if(v1 <= 0) {
                            if(this.n().u(crqn0.a.r, crif.aE)) {
                                s = this.A().A();
                                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)crsq.a).v_newBuilder();
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                crsq crsq6 = (crsq)hftp4.b_message;
                                crsq6.b |= 1;
                                crsq6.c = "_tu";
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                crsq crsq7 = (crsq)hftp4.b_message;
                                s.getClass();
                                crsq7.b |= 2;
                                crsq7.d = s;
                                crsn0.k(((crsq)hftp4.N_build()));
                            }
                            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)crsq.a).v_newBuilder();
                            if(!hftp5.b_message.isImmutable()) {
                                hftp5.ensureMutable();
                            }
                            crsq crsq8 = (crsq)hftp5.b_message;
                            crsq8.b |= 1;
                            crsq8.c = "_tr";
                            if(!hftp5.b_message.isImmutable()) {
                                hftp5.ensureMutable();
                            }
                            crsq crsq9 = (crsq)hftp5.b_message;
                            crsq9.b |= 4;
                            crsq9.e = 1L;
                            crsn0.k(((crsq)hftp5.N_build()));
                            TriggerUriParcel triggerUriParcel1 = this.z().k(crqn0.a.r, crst0, crsn0, s);
                            if(triggerUriParcel1 != null) {
                                this.aJ().k.c("Generated trigger URI. appId, uri", crqn0.a.r, triggerUriParcel1.a);
                                this.o().ac(crqn0.a.r, triggerUriParcel1);
                                Deque deque1 = this.m;
                                if(!deque1.contains(crqn0.a.r)) {
                                    deque1.add(crqn0.a.r);
                                }
                            }
                        }
                        else if(this.o().aa(this.d(), crqn0.a.r, false, false, false, true).g > ((long)v1)) {
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)crsq.a).v_newBuilder();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            crsq crsq0 = (crsq)hftp1.b_message;
                            crsq0.b |= 1;
                            crsq0.c = "_tnr";
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            crsq crsq1 = (crsq)hftp1.b_message;
                            crsq1.b |= 4;
                            crsq1.e = 1L;
                            crsn0.k(((crsq)hftp1.N_build()));
                        }
                        else {
                            if(this.n().u(crqn0.a.r, crif.aE)) {
                                s = this.A().A();
                                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)crsq.a).v_newBuilder();
                                if(!hftp2.b_message.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                crsq crsq2 = (crsq)hftp2.b_message;
                                crsq2.b |= 1;
                                crsq2.c = "_tu";
                                if(!hftp2.b_message.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                crsq crsq3 = (crsq)hftp2.b_message;
                                s.getClass();
                                crsq3.b |= 2;
                                crsq3.d = s;
                                crsn0.k(((crsq)hftp2.N_build()));
                            }
                            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)crsq.a).v_newBuilder();
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            crsq crsq4 = (crsq)hftp3.b_message;
                            crsq4.b |= 1;
                            crsq4.c = "_tr";
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            crsq crsq5 = (crsq)hftp3.b_message;
                            crsq5.b |= 4;
                            crsq5.e = 1L;
                            crsn0.k(((crsq)hftp3.N_build()));
                            TriggerUriParcel triggerUriParcel0 = this.z().k(crqn0.a.r, crst0, crsn0, s);
                            if(triggerUriParcel0 != null) {
                                this.aJ().k.c("Generated trigger URI. appId, uri", crqn0.a.r, triggerUriParcel0.a);
                                this.o().ac(crqn0.a.r, triggerUriParcel0);
                                Deque deque0 = this.m;
                                if(!deque0.contains(crqn0.a.r)) {
                                    deque0.add(crqn0.a.r);
                                }
                            }
                        }
                    }
                    crso crso1 = (crso)((ProtoLiteBuilder)crsn0).N_build();
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    crsu crsu0 = (crsu)crst0.b_message;
                    crso1.getClass();
                    crsu0.b();
                    crsu0.e.set(v, crso1);
                    break;
                }
            }
        }
    }

    final void N(EventParcel eventParcel0, AppMetadata appMetadata0) {
        List list3;
        List list2;
        long v5;
        List list1;
        long v2;
        batl.s(appMetadata0);
        String s = appMetadata0.a;
        batl.q(s);
        this.E();
        this.G();
        long v = eventParcel0.d;
        long v1 = eventParcel0.e;
        crjj crjj0 = crjj.b(eventParcel0);
        this.E();
        crqx.H((this.H == null || (this.I == null || !this.I.equals(s)) ? null : this.H), crjj0.e, false);
        EventParcel eventParcel1 = crjj0.a();
        this.z();
        if(!crqt.J(appMetadata0)) {
            return;
        }
        if(!appMetadata0.h) {
            this.j(appMetadata0);
            return;
        }
        List list0 = appMetadata0.r;
        if(list0 == null) {
            v2 = v;
        }
        else {
            String s1 = eventParcel1.a;
            if(list0.contains(s1)) {
                Bundle bundle0 = eventParcel1.b.a();
                bundle0.putLong("ga_safelisted", 1L);
                v2 = v;
                eventParcel1 = new EventParcel(s1, new EventParams(bundle0), eventParcel1.c, eventParcel1.d, eventParcel1.e);
                goto label_29;
            }
            this.aJ().j.d("Dropping non-safelisted event. appId, event name, origin", s, eventParcel1.a, eventParcel1.c);
            return;
        }
    label_29:
        this.o().C();
        try {
            String s2 = eventParcel1.a;
            if("_s".equals(s2) && !this.o().U(s, "_s") && ((long)eventParcel1.b.b("_sid")) != 0L) {
                if(!this.o().U(s, "_f") && !this.o().U(s, "_v")) {
                    crdg crdg0 = this.o();
                    this.av();
                    crdg0.B(s, Long.valueOf(System.currentTimeMillis() - 15000L), "_sid", this.i(s, eventParcel1));
                }
                else {
                    this.o().B(s, null, "_sid", this.i(s, eventParcel1));
                }
            }
            crdg crdg1 = this.o();
            batl.q(s);
            crdg1.n();
            crdg1.aA();
            int v4 = Long.compare(v2, 0L);
            if(v4 < 0) {
                crdg1.aJ().f.c("Invalid time querying timed out conditional properties", crji.a(s), Long.valueOf(v2));
                list1 = Collections.EMPTY_LIST;
            }
            else {
                list1 = crdg1.x("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{s, String.valueOf(v2)});
            }
            for(Object object0: list1) {
                ConditionalUserPropertyParcel conditionalUserPropertyParcel0 = (ConditionalUserPropertyParcel)object0;
                if(conditionalUserPropertyParcel0 != null) {
                    this.aJ().k.d("User property timed out", conditionalUserPropertyParcel0.a, this.s().e(conditionalUserPropertyParcel0.c.b), conditionalUserPropertyParcel0.c.a());
                    EventParcel eventParcel2 = conditionalUserPropertyParcel0.g;
                    if(eventParcel2 == null) {
                        v5 = v2;
                    }
                    else {
                        v5 = v2;
                        this.al(new EventParcel(eventParcel2, v5, v1), appMetadata0);
                    }
                    this.o().ad(s, conditionalUserPropertyParcel0.c.b);
                    v2 = v5;
                }
            }
            long v6 = v2;
            crdg crdg2 = this.o();
            batl.q(s);
            crdg2.n();
            crdg2.aA();
            if(v4 < 0) {
                crdg2.aJ().f.c("Invalid time querying expired conditional properties", crji.a(s), Long.valueOf(v6));
                list2 = Collections.EMPTY_LIST;
            }
            else {
                list2 = crdg2.x("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{s, String.valueOf(v6)});
            }
            ArrayList arrayList0 = new ArrayList(list2.size());
            Iterator iterator1 = list2.iterator();
            while(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                ConditionalUserPropertyParcel conditionalUserPropertyParcel1 = (ConditionalUserPropertyParcel)object1;
                if(conditionalUserPropertyParcel1 != null) {
                    this.aJ().k.d("User property expired", conditionalUserPropertyParcel1.a, this.s().e(conditionalUserPropertyParcel1.c.b), conditionalUserPropertyParcel1.c.a());
                    this.o().M(s, conditionalUserPropertyParcel1.c.b);
                    EventParcel eventParcel3 = conditionalUserPropertyParcel1.k;
                    if(eventParcel3 != null) {
                        arrayList0.add(eventParcel3);
                    }
                    this.o().ad(s, conditionalUserPropertyParcel1.c.b);
                    iterator1 = iterator1;
                    v4 = v4;
                }
            }
            for(Object object2: arrayList0) {
                this.al(new EventParcel(((EventParcel)object2), v6, v1), appMetadata0);
                v1 = v1;
            }
            long v7 = v1;
            crdg crdg3 = this.o();
            batl.q(s);
            batl.q(s2);
            crdg3.n();
            crdg3.aA();
            if(v4 < 0) {
                crdg3.aJ().f.d("Invalid time querying triggered conditional properties", crji.a(s), crdg3.ao().c(s2), Long.valueOf(v6));
                list3 = Collections.EMPTY_LIST;
            }
            else {
                list3 = crdg3.x("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{s, s2, String.valueOf(v6)});
            }
            ArrayList arrayList1 = new ArrayList(list3.size());
            for(Object object3: list3) {
                ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = (ConditionalUserPropertyParcel)object3;
                if(conditionalUserPropertyParcel2 != null) {
                    UserAttributeParcel userAttributeParcel0 = conditionalUserPropertyParcel2.c;
                    String s3 = conditionalUserPropertyParcel2.a;
                    batl.s(s3);
                    String s4 = conditionalUserPropertyParcel2.b;
                    Object object4 = userAttributeParcel0.a();
                    batl.s(object4);
                    crqv crqv0 = new crqv(s3, s4, userAttributeParcel0.b, v6, object4);
                    v6 = v6;
                    if(this.o().Y(crqv0)) {
                        this.aJ().k.d("User property triggered", conditionalUserPropertyParcel2.a, this.s().e(crqv0.c), crqv0.e);
                    }
                    else {
                        this.aJ().c.d("Too many active user properties, ignoring", crji.a(conditionalUserPropertyParcel2.a), this.s().e(crqv0.c), crqv0.e);
                    }
                    EventParcel eventParcel4 = conditionalUserPropertyParcel2.i;
                    if(eventParcel4 != null) {
                        arrayList1.add(eventParcel4);
                    }
                    conditionalUserPropertyParcel2.c = new UserAttributeParcel(crqv0);
                    conditionalUserPropertyParcel2.e = true;
                    this.o().X(conditionalUserPropertyParcel2);
                }
            }
            this.al(eventParcel1, appMetadata0);
            for(Object object5: arrayList1) {
                this.al(new EventParcel(((EventParcel)object5), v6, v7), appMetadata0);
                v7 = v7;
            }
            this.o().O();
        }
        finally {
            this.o().J();
        }
    }

    final void O(EventParcel eventParcel0, String s) {
        crca crca0 = this.o().i(s);
        if(crca0 != null && !TextUtils.isEmpty(crca0.w())) {
            Boolean boolean0 = this.ay(crca0);
            if(boolean0 != null) {
                if(!boolean0.booleanValue()) {
                    this.aJ().c.b("App version does not match; dropping event. appId", crji.a(s));
                    return;
                }
            }
            else if(!"_ui".equals(eventParcel0.a)) {
                this.aJ().f.b("Could not find package. appId", crji.a(s));
            }
            this.P(eventParcel0, new AppMetadata(s, crca0.y(), crca0.w(), crca0.c(), crca0.v(), crca0.i(), crca0.f(), null, crca0.al(), false, crca0.x(), 0L, 0, crca0.ak(), false, crca0.p(), crca0.g(), crca0.D(), this.w(s).n(), "", null, crca0.an(), crca0.o(), this.w(s).c, this.q(s).c, crca0.a(), crca0.d(), crca0.C(), crca0.A(), 0L, crca0.b()));
            return;
        }
        this.aJ().j.b("No app data available; dropping event", s);
    }

    final void P(EventParcel eventParcel0, AppMetadata appMetadata0) {
        batl.q(appMetadata0.a);
        crjj crjj0 = crjj.b(eventParcel0);
        crqx crqx0 = this.A();
        Bundle bundle0 = this.o().h(appMetadata0.a);
        crqx0.I(crjj0.e, bundle0);
        this.A().J(crjj0, this.n().d(appMetadata0.a));
        EventParcel eventParcel1 = crjj0.a();
        if(!this.n().t(crif.aP) && "_cmp".equals(eventParcel1.a)) {
            EventParams eventParams0 = eventParcel1.b;
            if("referrer API v2".equals(eventParams0.d("_cis"))) {
                String s = eventParams0.d("gclid");
                if(!TextUtils.isEmpty(s)) {
                    this.ah(new UserAttributeParcel("_lgclid", eventParcel1.d, s, "auto"), appMetadata0);
                }
            }
        }
        this.N(eventParcel1, appMetadata0);
    }

    public final void Q() {
        this.E();
        this.X();
    }

    // Detected as a lambda impl.
    final void R(String s, int v, Throwable throwable0, byte[] arr_b, Map map0) {
        boolean z;
        this.E();
        this.G();
        batl.q(s);
        try {
            if(arr_b == null) {
                arr_b = new byte[0];
            }
            crjg crjg0 = this.aJ().k;
            Integer integer0 = (int)arr_b.length;
            crjg0.b("onConfigFetched. Response size", integer0);
            if(this.n().t(crif.aT)) {
                this.z().u(map0);
            }
            this.o().C();
            try {
                crca crca0 = this.o().i(s);
                if(v == 200) {
                label_19:
                    z = throwable0 == null;
                }
                else {
                    switch(v) {
                        case 204: {
                            goto label_19;
                        }
                        case 304: {
                            v = 304;
                            goto label_19;
                        }
                        default: {
                            z = false;
                        }
                    }
                }
                if(crca0 == null) {
                    this.aJ().f.b("App does not exist in onConfigFetched. appId", crji.a(s));
                    this.o().O();
                }
                else if(!z && v != 404) {
                    this.av();
                    crca0.Q(System.currentTimeMillis());
                    this.o().P(crca0);
                    this.aJ().k.c("Fetching config failed. code, error", Integer.valueOf(v), throwable0);
                    this.v().g(s);
                    crju crju0 = this.g.e;
                    this.av();
                    crju0.b(System.currentTimeMillis());
                    if(v == 429 || v == 503) {
                        crju crju1 = this.g.c;
                        this.av();
                        crju1.b(System.currentTimeMillis());
                    }
                    this.ae();
                    this.o().O();
                }
                else {
                    this.z();
                    String s1 = crqt.F(map0, "Last-Modified");
                    this.z();
                    String s2 = crqt.F(map0, "ETag");
                    if(v == 304 || v == 404) {
                        if(this.v().d(s) != null || this.v().r(s, null, null, null)) {
                        label_48:
                            this.av();
                            crca0.N(System.currentTimeMillis());
                            this.o().P(crca0);
                            if(v == 404) {
                                this.aJ().h.b("Config not found. Using empty config. appId", s);
                            }
                            else {
                                this.aJ().k.c("Successfully fetched config. Got network response. code, size", Integer.valueOf(v), integer0);
                            }
                            if(this.t().f() && this.aD()) {
                                this.ai();
                            }
                            else if(this.t().f() && this.o().T(crca0.t())) {
                                this.ak(crca0.t());
                            }
                            else {
                                this.ae();
                            }
                            this.o().O();
                        }
                    }
                    else if(!this.v().r(s, arr_b, s1, s2)) {
                    }
                    else {
                        goto label_48;
                    }
                }
            }
            finally {
                this.o().J();
            }
        }
        finally {
            this.z = false;
            this.H();
        }
    }

    final void S(boolean z, int v, Throwable throwable0, byte[] arr_b, String s, List list0, Map map0) {
        int v1 = v;
        this.E();
        this.G();
        try {
            byte[] arr_b1 = arr_b == null ? new byte[0] : arr_b;
            if(this.n().t(crif.aT)) {
                this.z().u(map0);
            }
            List list1 = this.q;
            batl.s(list1);
            this.q = null;
            if(z) {
                switch(v1) {
                    case 200: {
                        break;
                    }
                    case 204: {
                        v1 = 204;
                        break;
                    }
                    default: {
                        goto label_15;
                    }
                }
                if(throwable0 != null) {
                label_15:
                    String s1 = new String(arr_b1, StandardCharsets.UTF_8);
                    this.aJ().h.d("Network upload failed. Will retry later. code, error", Integer.valueOf(v1), throwable0, s1.substring(0, Math.min(0x20, s1.length())));
                    crju crju0 = this.g.e;
                    this.av();
                    crju0.b(System.currentTimeMillis());
                    if(v1 == 429 || v1 == 503) {
                        crju crju1 = this.g.c;
                        this.av();
                        crju1.b(System.currentTimeMillis());
                    }
                    crdg crdg0 = this.o();
                    crdg0.n();
                    crdg0.aA();
                    batl.u(list1.size());
                    if(crdg0.W()) {
                        String s2 = a.T(list1, "(", ",", ")");
                        if(crdg0.e(a.a(s2, "SELECT COUNT(1) FROM queue WHERE rowid IN ", " AND retry_count =  2147483647 LIMIT 1"), null) > 0L) {
                            crdg0.aJ().f.a("The number of upload retries exceeds the limit. Will remain unchanged.");
                        }
                        try {
                            crdg0.g().execSQL(a.a(s2, "UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ", " AND (retry_count IS NULL OR retry_count < 2147483647)"));
                        }
                        catch(SQLiteException sQLiteException0) {
                            crdg0.aJ().c.b("Error incrementing retry count. error", sQLiteException0);
                        }
                    }
                    this.ae();
                    goto label_120;
                }
            }
            Integer integer0 = v1;
            this.aJ().k.c("Network upload successful with code, uploadAttempted", integer0, Boolean.valueOf(z));
            try {
                if(z) {
                    crju crju2 = this.g.d;
                    this.av();
                    crju2.b(System.currentTimeMillis());
                }
                this.g.e.b(0L);
                this.ae();
                if(z) {
                    this.aJ().k.c("Successful upload. Got network response. code, size", integer0, Integer.valueOf(arr_b1.length));
                }
                else {
                    this.aJ().k.a("Purged empty bundles");
                }
                this.o().C();
                int v3 = FIN.finallyOpen$NT();
                HashMap hashMap0 = new HashMap();
                for(Object object0: list0) {
                    crss crss0 = (crss)((Pair)object0).first;
                    crqd crqd0 = (crqd)((Pair)object0).second;
                    crnq crnq0 = crqd0.b;
                    if(crnq0 == crnq.d) {
                        continue;
                    }
                    long v4 = this.o().c(s, crss0, crqd0.a, crqd0.a(), crnq0, null);
                    if(crnq0 != crnq.e || v4 == -1L || crss0.d.isEmpty()) {
                        continue;
                    }
                    hashMap0.put(crss0.d, Long.valueOf(v4));
                }
                for(Object object1: list0) {
                    crss crss1 = (crss)((Pair)object1).first;
                    crqd crqd1 = (crqd)((Pair)object1).second;
                    crnq crnq1 = crqd1.b;
                    if(crnq1 != crnq.d) {
                        continue;
                    }
                    Long long0 = (Long)hashMap0.get(crss1.d);
                    this.o().c(s, crss1, crqd1.a, crqd1.a(), crnq1, long0);
                }
                List list2 = this.o().y(s, UploadBatchesCriteria.a(new crnq[]{crnq.d}), 1);
                if(!list2.isEmpty()) {
                    long v5 = ((crqs)list2.get(0)).f;
                    this.av();
                    if(System.currentTimeMillis() > ((long)(((Long)crif.E.a()))) + v5) {
                        this.aJ().f.c("[sgtm] client batches are queued too long. appId, creationTime", s, Long.valueOf(v5));
                    }
                }
                Iterator iterator2 = list1.iterator();
                while(true) {
                label_81:
                    if(!iterator2.hasNext()) {
                        this.o().O();
                        FIN.finallyCodeBegin$NT(v3);
                        this.r = null;
                        if(this.t().f() && this.o().T(s)) {
                            this.ak(s);
                        }
                        else if(this.t().f() && this.aD()) {
                            this.ai();
                        }
                        else {
                            this.D = -1L;
                            this.ae();
                        }
                        this.k = 0L;
                        goto label_120;
                    }
                    Object object2 = iterator2.next();
                    Long long1 = (Long)object2;
                    try {
                        crdg crdg1 = this.o();
                        crdg1.n();
                        crdg1.aA();
                        SQLiteDatabase sQLiteDatabase0 = crdg1.g();
                        try {
                            if(sQLiteDatabase0.delete("queue", "rowid=?", new String[]{String.valueOf(long1.longValue())}) == 1) {
                                continue;
                            }
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                        catch(SQLiteException sQLiteException3) {
                            crdg1.aJ().c.b("Failed to delete a bundle in a queue table", sQLiteException3);
                            throw sQLiteException3;
                        }
                    }
                    catch(SQLiteException sQLiteException2) {
                        List list3 = this.r;
                        if(list3 == null) {
                            throw sQLiteException2;
                        }
                        if(!list3.contains(long1)) {
                            throw sQLiteException2;
                        }
                    }
                }
            }
            catch(SQLiteException sQLiteException1) {
                this.aJ().c.b("Database error while trying to delete uploaded bundles", sQLiteException1);
                this.av();
                this.k = SystemClock.elapsedRealtime();
                this.aJ().k.b("Disable upload, time", Long.valueOf(this.k));
                goto label_120;
            }
            goto label_81;
        label_120:
        }
        finally {
            this.p = false;
            this.H();
        }
    }

    final void T(crca crca0, crst crst0) {
        this.E();
        this.G();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)crsd.a).v_newBuilder();
        byte[] arr_b = crca0.ap();
        if(arr_b != null) {
            try {
                hftp0 = crqt.o(((Builder)hftp0), arr_b);
            }
            catch(hfur unused_ex) {
                this.aJ().f.b("Failed to parse locally stored ad campaign info. appId", crji.a(crca0.t()));
            }
        }
        for(Object object0: DesugarCollections.unmodifiableList(((crsu)crst0.b_message).e)) {
            crso crso0 = (crso)object0;
            if(crso0.d.equals("_cmp")) {
                String s = (String)crqt.N(crso0, "gclid", "");
                String s1 = (String)crqt.N(crso0, "gbraid", "");
                String s2 = (String)crqt.N(crso0, "gad_source", "");
                String[] arr_s = ((String)crif.aQ.a()).split(",");
                this.z();
                HashMap hashMap0 = new HashMap();
                for(Object object1: crso0.c) {
                    crsq crsq0 = (crsq)object1;
                    if(Arrays.asList(arr_s).contains(crsq0.c)) {
                        Object object2 = crqt.G(crsq0);
                        if(object2 != null) {
                            hashMap0.put(crsq0.c, object2);
                        }
                    }
                }
                if(!hashMap0.isEmpty()) {
                    long v = (long)(((Long)crqt.N(crso0, "click_timestamp", Long.valueOf(0L))));
                    if(v <= 0L) {
                        v = crso0.e;
                    }
                    if(!"referrer API v2".equals(crqt.K(crso0, "_cis"))) {
                        if(v <= ((crsd)hftp0.b_message).f) {
                            continue;
                        }
                        if(s.isEmpty()) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            crsd crsd7 = (crsd)hftp0.b_message;
                            crsd7.b &= -2;
                            crsd7.c = crsd.a.c;
                        }
                        else {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            crsd crsd8 = (crsd)hftp0.b_message;
                            crsd8.b |= 1;
                            crsd8.c = s;
                        }
                        if(s1.isEmpty()) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            crsd crsd9 = (crsd)hftp0.b_message;
                            crsd9.b &= -3;
                            crsd9.d = crsd.a.d;
                        }
                        else {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            crsd crsd10 = (crsd)hftp0.b_message;
                            crsd10.b |= 2;
                            crsd10.d = s1;
                        }
                        if(s2.isEmpty()) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            crsd crsd11 = (crsd)hftp0.b_message;
                            crsd11.b &= -5;
                            crsd11.e = crsd.a.e;
                        }
                        else {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            crsd crsd12 = (crsd)hftp0.b_message;
                            crsd12.b |= 4;
                            crsd12.e = s2;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        crsd crsd13 = (crsd)hftp0.b_message;
                        crsd13.b |= 8;
                        crsd13.f = v;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((crsd)hftp0.b_message).b().clear();
                        Map map1 = this.az(crso0);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((crsd)hftp0.b_message).b().putAll(map1);
                    }
                    else if(v > ((crsd)hftp0.b_message).j) {
                        if(s.isEmpty()) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            crsd crsd0 = (crsd)hftp0.b_message;
                            crsd0.b &= -17;
                            crsd0.g = crsd.a.g;
                        }
                        else {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            crsd crsd1 = (crsd)hftp0.b_message;
                            crsd1.b |= 16;
                            crsd1.g = s;
                        }
                        if(s1.isEmpty()) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            crsd crsd2 = (crsd)hftp0.b_message;
                            crsd2.b &= -33;
                            crsd2.h = crsd.a.h;
                        }
                        else {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            crsd crsd3 = (crsd)hftp0.b_message;
                            crsd3.b |= 0x20;
                            crsd3.h = s1;
                        }
                        if(s2.isEmpty()) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            crsd crsd4 = (crsd)hftp0.b_message;
                            crsd4.b &= -65;
                            crsd4.i = crsd.a.i;
                        }
                        else {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            crsd crsd5 = (crsd)hftp0.b_message;
                            crsd5.b |= 0x40;
                            crsd5.i = s2;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        crsd crsd6 = (crsd)hftp0.b_message;
                        crsd6.b |= 0x80;
                        crsd6.j = v;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((crsd)hftp0.b_message).c().clear();
                        Map map0 = this.az(crso0);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((crsd)hftp0.b_message).c().putAll(map0);
                    }
                }
            }
        }
        if(!((ProtoLiteMessage)(((crsd)hftp0.N_build()))).equals(crsd.a)) {
            crsd crsd14 = (crsd)hftp0.N_build();
            if(!crst0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)crst0).ensureMutable();
            }
            crsu crsu0 = (crsu)crst0.b_message;
            crsd14.getClass();
            crsu0.Z = crsd14;
            crsu0.c |= 0x1000000;
        }
        crca0.F(((crsd)hftp0.N_build()).toBytesArray());
        if(crca0.am()) {
            this.o().P(crca0);
        }
        if(this.n().t(crif.aP)) {
            this.o().M(crca0.t(), "_lgclid");
        }
    }

    final void U(AppMetadata appMetadata0) {
        UserAttributeParcel userAttributeParcel1;
        int v5;
        PackageInfo packageInfo0;
        ApplicationInfo applicationInfo0;
        long v4;
        String s1;
        Bundle bundle0;
        crqq crqq0;
        crkt crkt0;
        crka crka0;
        long v3;
        boolean z;
        crdn crdn0;
        long v2;
        this.E();
        this.G();
        batl.s(appMetadata0);
        String s = appMetadata0.a;
        batl.q(s);
        if(!crqq.aG(appMetadata0)) {
            return;
        }
        crca crca0 = this.o().i(s);
        if(crca0 != null && TextUtils.isEmpty(crca0.y()) && !TextUtils.isEmpty(appMetadata0.b)) {
            crca0.N(0L);
            this.o().P(crca0);
            crkk crkk0 = this.v();
            crkk0.n();
            crkk0.e.remove(s);
        }
        if(!appMetadata0.h) {
            this.j(appMetadata0);
            return;
        }
        long v = appMetadata0.l;
        if(v == 0L) {
            this.av();
            v = System.currentTimeMillis();
        }
        int v1 = appMetadata0.m;
        if(v1 != 0 && v1 != 1) {
            this.aJ().f.c("Incorrect app type, assuming installed app. appId, appType", crji.a(s), Integer.valueOf(v1));
            v1 = 0;
        }
        this.o().C();
        try {
            crqv crqv0 = this.o().s(s, "_npa");
            Boolean boolean0 = crqq.aI(appMetadata0);
            if(crqv0 != null && !"auto".equals(crqv0.b)) {
                v2 = v;
            }
            else if(boolean0 != null) {
                UserAttributeParcel userAttributeParcel0 = new UserAttributeParcel("_npa", v, ((long)(boolean0.booleanValue() ? 1L : 0L)), "auto");
                v2 = v;
                if(crqv0 == null || !crqv0.e.equals(userAttributeParcel0.d)) {
                    this.ah(userAttributeParcel0, appMetadata0);
                }
            }
            else {
                v2 = v;
                if(crqv0 != null) {
                    this.W("_npa", appMetadata0);
                }
            }
            if(this.n().t(crif.aL)) {
                this.K(appMetadata0, appMetadata0.D);
            }
            else {
                this.K(appMetadata0, v2);
            }
            this.j(appMetadata0);
            if(v1 == 0) {
                crdn0 = this.o().o(s, "_f");
                z = false;
            }
            else {
                crdn0 = this.o().o(s, "_v");
                z = true;
            }
            if(crdn0 == null) {
                v3 = (v2 / 3600000L + 1L) * 3600000L;
                if(z) {
                    goto label_163;
                }
                else {
                    this.ah(new UserAttributeParcel("_fot", v2, v3, "auto"), appMetadata0);
                    this.E();
                    crka0 = this.h;
                    batl.s(crka0);
                    goto label_58;
                }
            }
            else {
                goto label_178;
            }
            goto label_181;
        }
        catch(Throwable throwable0) {
            crqq0 = this;
            goto label_184;
        }
        try {
        label_58:
            if(s == null) {
                crka0.a.aJ().g.a("Install Referrer Reporter was called with invalid app package name");
            }
            else if(s.isEmpty()) {
                crka0.a.aJ().g.a("Install Referrer Reporter was called with invalid app package name");
            }
            else {
                crkt0 = crka0.a;
                crkt0.s();
                if(crka0.a()) {
                    crjz crjz0 = new crjz(crka0, s);
                    crkt0.s();
                    Intent intent0 = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                    intent0.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                    Context context0 = crkt0.a;
                    PackageManager packageManager0 = context0.getPackageManager();
                    if(packageManager0 == null) {
                        crkt0.aJ().g.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                    }
                    else {
                        List list0 = packageManager0.queryIntentServices(intent0, 0);
                        if(list0 == null || list0.isEmpty()) {
                            crkt0.aJ().i.a("Play Service for fetching Install Referrer is unavailable on device");
                        }
                        else {
                            ResolveInfo resolveInfo0 = (ResolveInfo)list0.get(0);
                            if(resolveInfo0.serviceInfo != null) {
                                if(resolveInfo0.serviceInfo.name == null || !"com.android.vending".equals(resolveInfo0.serviceInfo.packageName) || !crka0.a()) {
                                    crkt0.aJ().f.a("Play Store version 8.3.73 or higher required for Install Referrer");
                                }
                                else {
                                    Intent intent1 = new Intent(intent0);
                                    try {
                                        boolean z1 = bbic.a().d(context0, intent1, crjz0, 1);
                                        crkt0.aJ().k.b("Install Referrer Service is", (z1 ? "available" : "not available"));
                                    }
                                    catch(RuntimeException runtimeException0) {
                                        crka0.a.aJ().c.b("Exception occurred while binding to Install Referrer Service", runtimeException0.getMessage());
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    goto label_92;
                }
            }
            goto label_97;
        }
        catch(Throwable throwable0) {
            crqq0 = this;
            goto label_184;
        }
        try {
        label_92:
            crkt0.aJ().i.a("Install Referrer Reporter is not available");
        }
        catch(Throwable throwable0) {
            crqq0 = this;
            goto label_184;
        }
        try {
        label_97:
            this.E();
            this.G();
            bundle0 = new Bundle();
            bundle0.putLong("_c", 1L);
            bundle0.putLong("_r", 1L);
            bundle0.putLong("_uwa", 0L);
            bundle0.putLong("_pfo", 0L);
            bundle0.putLong("_sys", 0L);
            bundle0.putLong("_sysu", 0L);
            bundle0.putLong("_et", 1L);
            if(appMetadata0.o) {
                bundle0.putLong("_dac", 1L);
            }
            s1 = appMetadata0.a;
            batl.s(s1);
            crdg crdg0 = this.o();
            batl.q(s1);
            crdg0.n();
            crdg0.aA();
            v4 = crdg0.d(s1, "first_open_count");
            if(this.e().getPackageManager() == null) {
                this.aJ().c.b("PackageManager is null, first open report might be inaccurate. appId", crji.a(s1));
                crqq0 = this;
            }
            else {
                applicationInfo0 = null;
                try {
                    packageInfo0 = bbsr.b(this.e()).e(s1, 0);
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    this.aJ().c.c("Package info is null, first open report might be inaccurate. appId", crji.a(s1), packageManager$NameNotFoundException0);
                    packageInfo0 = null;
                }
                if(packageInfo0 != null && packageInfo0.firstInstallTime != 0L) {
                    if(packageInfo0.firstInstallTime == packageInfo0.lastUpdateTime) {
                        v5 = 1;
                    }
                    else if(!this.n().t(crif.ax)) {
                        bundle0.putLong("_uwa", 1L);
                        v5 = 0;
                    }
                    else if(v4 == 0L) {
                        bundle0.putLong("_uwa", 1L);
                        v5 = 0;
                        v4 = 0L;
                    }
                    else {
                        v5 = 0;
                    }
                    userAttributeParcel1 = new UserAttributeParcel("_fi", v2, ((long)(1 == v5 ? 1L : 0L)), "auto");
                    crqq0 = this;
                    goto label_140;
                }
                else {
                    crqq0 = this;
                }
                goto label_147;
            }
            goto label_156;
        }
        catch(Throwable throwable0) {
            crqq0 = this;
            goto label_184;
        }
        try {
        label_140:
            crqq0.ah(userAttributeParcel1, appMetadata0);
            goto label_147;
        }
        catch(Throwable throwable0) {
            goto label_184;
        }
        try {
            crqq0 = this;
            goto label_147;
        }
        catch(Throwable throwable0) {
            try {
                crqq0 = this;
                goto label_184;
                try {
                label_147:
                    applicationInfo0 = bbsr.b(crqq0.e()).d(s1, 0);
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException1) {
                    crqq0.aJ().c.c("Application info is null, first open report might be inaccurate. appId", crji.a(s1), packageManager$NameNotFoundException1);
                }
                if(applicationInfo0 != null) {
                    if((applicationInfo0.flags & 1) != 0) {
                        bundle0.putLong("_sys", 1L);
                    }
                    if((applicationInfo0.flags & 0x80) != 0) {
                        bundle0.putLong("_sysu", 1L);
                    }
                }
            label_156:
                if(v4 >= 0L) {
                    bundle0.putLong("_pfo", v4);
                }
                if(crqq0.n().t(crif.aR)) {
                    crqq0.av();
                    bundle0.putLong("_elt", System.currentTimeMillis());
                }
                crqq0.P(new EventParcel("_f", new EventParams(bundle0), "auto", v2, 0L), appMetadata0);
                goto label_181;
            label_163:
                crqq0 = this;
                crqq0.ah(new UserAttributeParcel("_fvt", v2, v3, "auto"), appMetadata0);
                crqq0.E();
                crqq0.G();
                Bundle bundle1 = new Bundle();
                bundle1.putLong("_c", 1L);
                bundle1.putLong("_r", 1L);
                bundle1.putLong("_et", 1L);
                if(appMetadata0.o) {
                    bundle1.putLong("_dac", 1L);
                }
                if(crqq0.n().t(crif.aR)) {
                    crqq0.av();
                    bundle1.putLong("_elt", System.currentTimeMillis());
                }
                crqq0.P(new EventParcel("_v", new EventParams(bundle1), "auto", v2, 0L), appMetadata0);
                goto label_181;
            label_178:
                crqq0 = this;
                if(appMetadata0.i) {
                    crqq0.P(new EventParcel("_cd", new EventParams(new Bundle()), "auto", v2, 0L), appMetadata0);
                }
            label_181:
                crqq0.o().O();
                goto label_186;
            }
            catch(Throwable throwable0) {
            }
        }
    label_184:
        crqq0.o().J();
        throw throwable0;
    label_186:
        crqq0.o().J();
    }

    final void V(ConditionalUserPropertyParcel conditionalUserPropertyParcel0, AppMetadata appMetadata0) {
        batl.q(conditionalUserPropertyParcel0.a);
        batl.s(conditionalUserPropertyParcel0.c);
        batl.q(conditionalUserPropertyParcel0.c.b);
        this.E();
        this.G();
        if(!crqq.aG(appMetadata0)) {
            return;
        }
        if(!appMetadata0.h) {
            this.j(appMetadata0);
            return;
        }
        this.o().C();
        try {
            this.j(appMetadata0);
            String s = conditionalUserPropertyParcel0.a;
            batl.s(s);
            ConditionalUserPropertyParcel conditionalUserPropertyParcel1 = this.o().j(s, conditionalUserPropertyParcel0.c.b);
            if(conditionalUserPropertyParcel1 == null) {
                this.aJ().f.c("Conditional user property doesn\'t exist", crji.a(conditionalUserPropertyParcel0.a), this.s().e(conditionalUserPropertyParcel0.c.b));
            }
            else {
                this.aJ().j.c("Removing conditional user property", conditionalUserPropertyParcel0.a, this.s().e(conditionalUserPropertyParcel0.c.b));
                this.o().ad(s, conditionalUserPropertyParcel0.c.b);
                if(conditionalUserPropertyParcel1.e) {
                    this.o().M(s, conditionalUserPropertyParcel0.c.b);
                }
                EventParcel eventParcel0 = conditionalUserPropertyParcel0.k;
                if(eventParcel0 != null) {
                    Bundle bundle0 = eventParcel0.b == null ? null : eventParcel0.b.a();
                    EventParcel eventParcel1 = this.A().ah(s, eventParcel0.a, bundle0, conditionalUserPropertyParcel1.b, eventParcel0.d, true);
                    batl.s(eventParcel1);
                    this.al(eventParcel1, appMetadata0);
                }
            }
            this.o().O();
        }
        finally {
            this.o().J();
        }
    }

    final void W(String s, AppMetadata appMetadata0) {
        this.E();
        this.G();
        if(!crqq.aG(appMetadata0)) {
            return;
        }
        if(!appMetadata0.h) {
            this.j(appMetadata0);
            return;
        }
        Boolean boolean0 = crqq.aI(appMetadata0);
        if("_npa".equals(s) && boolean0 != null) {
            this.aJ().j.a("Falling back to manifest metadata value for ad personalization");
            this.av();
            this.ah(new UserAttributeParcel("_npa", System.currentTimeMillis(), ((long)(boolean0.booleanValue() ? 1L : 0L)), "auto"), appMetadata0);
            return;
        }
        this.aJ().j.b("Removing user property", this.s().e(s));
        this.o().C();
        try {
            this.j(appMetadata0);
            if("_id".equals(s)) {
                crdg crdg0 = this.o();
                batl.s(appMetadata0.a);
                crdg0.M(appMetadata0.a, "_lair");
            }
            crdg crdg1 = this.o();
            batl.s(appMetadata0.a);
            crdg1.M(appMetadata0.a, s);
            this.o().O();
            this.aJ().j.b("User property removed", this.s().e(s));
        }
        finally {
            this.o().J();
        }
    }

    public final void X() {
        this.E();
        if(!this.m.isEmpty() && !this.ax().d()) {
            this.av();
            long v = SystemClock.elapsedRealtime() - this.t;
            long v1 = Math.max(0L, ((long)(((int)(((Integer)crif.au.a()))))) - v);
            this.aJ().k.b("Scheduling notify next app runnable, delay in ms", Long.valueOf(v1));
            this.ax().c(v1);
        }
    }

    public static void Y(Context context0, Intent intent0) {
        if(Build.VERSION.SDK_INT < 34) {
            context0.sendBroadcast(intent0);
            return;
        }
        context0.sendBroadcast(intent0, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
    }

    final void Z(AppMetadata appMetadata0) {
        this.E();
        this.G();
        String s = appMetadata0.a;
        batl.q(s);
        crdk crdk0 = crdk.b(appMetadata0.y);
        this.aJ().k.c("Setting DMA consent for package", s, crdk0);
        this.E();
        this.G();
        crly crly0 = crdk.a(this.g(s), 100).c();
        this.F.put(s, crdk0);
        crdg crdg0 = this.o();
        batl.s(s);
        batl.s(crdk0);
        crdg0.n();
        crdg0.aA();
        crmb crmb0 = crdg0.q(s);
        crmb crmb1 = crmb.a;
        if(crmb0 == crmb1) {
            crdg0.S(s, crmb1);
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("dma_consent_settings", crdk0.c);
        crdg0.ai(contentValues0);
        crly crly1 = crdk.a(this.g(s), 100).c();
        this.E();
        this.G();
        boolean z = true;
        boolean z1 = crly0 == crly.c && crly1 == crly.d;
        if(crly0 != crly.d || crly1 != crly.c) {
            z = false;
        }
        if(!z1 && !z) {
            return;
        }
        this.aJ().k.b("Generated _dcu event for", s);
        Bundle bundle0 = new Bundle();
        if(this.o().aa(this.d(), s, false, false, false, false).f < ((long)this.n().f(s, crif.af))) {
            bundle0.putLong("_r", 1L);
            crdc crdc0 = this.o().aa(this.d(), s, false, false, true, false);
            this.aJ().k.c("_dcu realtime event count", s, Long.valueOf(crdc0.f));
        }
        this.K.a(s, "_dcu", bundle0);
    }

    public String a(String s, long v, crmb crmb0) {
        return null;
    }

    private final void aA(crst crst0, long v, boolean z) {
        crqv crqv1;
        String s = z ? "_se" : "_lte";
        crqv crqv0 = this.o().s(((crsu)crst0.b_message).r, s);
        if(crqv0 == null) {
            String s2 = ((crsu)crst0.b_message).r;
            this.av();
            crqv1 = new crqv(s2, "auto", s, System.currentTimeMillis(), v);
        }
        else {
            String s1 = ((crsu)crst0.b_message).r;
            this.av();
            crqv1 = new crqv(s1, "auto", s, System.currentTimeMillis(), ((long)(((long)(((Long)crqv0.e))) + v)));
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)crtg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        crtg crtg0 = (crtg)hftp0.b_message;
        crtg0.b |= 2;
        crtg0.d = s;
        this.av();
        long v1 = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        crtg crtg1 = (crtg)hftp0.b_message;
        crtg1.b |= 1;
        crtg1.c = v1;
        Object object0 = crqv1.e;
        long v2 = (long)(((Long)object0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        crtg crtg2 = (crtg)hftp0.b_message;
        crtg2.b |= 8;
        crtg2.f = v2;
        crtg crtg3 = (crtg)hftp0.N_build();
        int v3 = crqt.b(crst0, s);
        if(v3 >= 0) {
            if(!crst0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)crst0).ensureMutable();
            }
            crsu crsu0 = (crsu)crst0.b_message;
            crtg3.getClass();
            crsu0.c();
            crsu0.f.set(v3, crtg3);
        }
        else {
            crst0.n(crtg3);
        }
        if(v > 0L) {
            this.o().Y(crqv1);
            this.aJ().k.c("Updated engagement user property. scope, value", (z ? "session-scoped" : "lifetime"), object0);
        }
    }

    private final void aB(crst crst0, crqn crqn0) {
        boolean z1;
        Boolean boolean1;
        long v5;
        long v4;
        int v3;
        crst crst1 = crst0;
        crqn crqn1 = crqn0;
        HashMap hashMap0 = new HashMap();
        ArrayList arrayList0 = new ArrayList();
        SecureRandom secureRandom0 = this.A().E();
        int v = 0;
        while(v < ((crsu)crst1.b_message).e.size()) {
            crso crso0 = crst1.a(v);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)crso0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)crso0));
            crsn crsn0 = (crsn)hftp0;
            if(((crso)crsn0.b_message).d.equals("_ep")) {
                this.z();
                String s = (String)crqt.K(((crso)((ProtoLiteBuilder)crsn0).N_build()), "_en");
                crdn crdn0 = (crdn)hashMap0.get(s);
                if(crdn0 == null) {
                    crdg crdg0 = this.o();
                    String s1 = crqn1.a.r;
                    batl.s(s);
                    crdn0 = crdg0.o(s1, s);
                    if(crdn0 != null) {
                        hashMap0.put(s, crdn0);
                    }
                }
                if(crdn0 != null && crdn0.i == null) {
                    Long long0 = crdn0.j;
                    if(long0 != null && ((long)long0) > 1L) {
                        this.z();
                        crqt.A(crsn0, "_sr", long0);
                    }
                    if(crdn0.k != null && crdn0.k.booleanValue()) {
                        this.z();
                        crqt.A(crsn0, "_efs", Long.valueOf(1L));
                    }
                    arrayList0.add(((crso)((ProtoLiteBuilder)crsn0).N_build()));
                }
            }
            else {
                crkk crkk0 = this.v();
                String s2 = crqn1.a.r;
                String s3 = crkk0.a(s2, "measurement.account.time_zone_offset_minutes");
                long v1 = 0L;
                if(!TextUtils.isEmpty(s3)) {
                    try {
                        v1 = Long.parseLong(s3);
                    }
                    catch(NumberFormatException numberFormatException0) {
                        crkk0.aJ().f.c("Unable to parse timezone offset. appId", crji.a(s2), numberFormatException0);
                    }
                }
                long v2 = this.A().u(((crso)crsn0.b_message).e, v1);
                crso crso1 = (crso)((ProtoLiteBuilder)crsn0).N_build();
                Long long1 = (long)1L;
                if(!TextUtils.isEmpty("_dbg")) {
                    Iterator iterator0 = crso1.c.iterator();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        crsq crsq0 = (crsq)object0;
                        if(!"_dbg".equals(crsq0.c)) {
                        }
                        else if(long1.equals(Long.valueOf(crsq0.e))) {
                            goto label_66;
                        }
                        else {
                            break;
                        }
                        iterator0 = iterator0;
                        continue;
                    }
                }
                crkk crkk1 = this.v();
                String s4 = crqn1.a.r;
                String s5 = ((crso)crsn0.b_message).d;
                crkk1.n();
                crkk1.h(s4);
                Map map0 = (Map)crkk1.f.get(s4);
                if(map0 != null) {
                    Integer integer0 = (Integer)map0.get(s5);
                    if(integer0 != null) {
                        v3 = (int)integer0;
                        goto label_67;
                    }
                }
            label_66:
                v3 = 1;
            label_67:
                if(v3 <= 0) {
                    this.aJ().f.c("Sample rate must be positive. event, rate", ((crso)crsn0.b_message).d, Integer.valueOf(v3));
                    arrayList0.add(((crso)((ProtoLiteBuilder)crsn0).N_build()));
                }
                else {
                    crdn crdn1 = (crdn)hashMap0.get(((crso)crsn0.b_message).d);
                    if(crdn1 == null) {
                        crdn crdn2 = this.o().o(crqn1.a.r, ((crso)crsn0.b_message).d);
                        if(crdn2 == null) {
                            v4 = v1;
                            this.aJ().f.c("Event being bundled has no eventAggregate. appId, eventName", crqn1.a.r, ((crso)crsn0.b_message).d);
                            crdn1 = new crdn(crqn1.a.r, ((crso)crsn0.b_message).d, 1L, 1L, 1L, ((crso)crsn0.b_message).e, 0L, null, null, null, null);
                            goto label_83;
                        }
                        else {
                            crdn1 = crdn2;
                        }
                    }
                    v4 = v1;
                label_83:
                    this.z();
                    Long long2 = (Long)crqt.K(((crso)((ProtoLiteBuilder)crsn0).N_build()), "_eid");
                    boolean z = long2 != null;
                    Boolean boolean0 = Boolean.valueOf(z);
                    if(v3 == 1) {
                        arrayList0.add(((crso)((ProtoLiteBuilder)crsn0).N_build()));
                        boolean0.getClass();
                        if(z && (crdn1.i != null || crdn1.j != null || crdn1.k != null)) {
                            crdn crdn3 = crdn1.a(null, null, null);
                            hashMap0.put(((crso)crsn0.b_message).d, crdn3);
                        }
                    }
                    else if(secureRandom0.nextInt(v3) == 0) {
                        this.z();
                        Long long3 = (long)v3;
                        crqt.A(crsn0, "_sr", long3);
                        arrayList0.add(((crso)((ProtoLiteBuilder)crsn0).N_build()));
                        boolean0.getClass();
                        if(z) {
                            crdn1 = crdn1.a(null, long3, null);
                        }
                        hashMap0.put(((crso)crsn0.b_message).d, crdn1.b(((crso)crsn0.b_message).e, v2));
                    }
                    else {
                        Long long4 = crdn1.h;
                        if(long4 == null) {
                            boolean1 = boolean0;
                            z1 = z;
                            v5 = this.A().u(((crso)crsn0.b_message).f, v4);
                        }
                        else {
                            v5 = (long)long4;
                            boolean1 = boolean0;
                            z1 = z;
                        }
                        if(v5 == v2) {
                            boolean1.getClass();
                            if(z1) {
                                hashMap0.put(((crso)crsn0.b_message).d, crdn1.a(long2, null, null));
                            }
                        }
                        else {
                            this.z();
                            crqt.A(crsn0, "_efs", Long.valueOf(1L));
                            this.z();
                            Long long5 = (long)v3;
                            crqt.A(crsn0, "_sr", long5);
                            arrayList0.add(((crso)((ProtoLiteBuilder)crsn0).N_build()));
                            boolean1.getClass();
                            if(z1) {
                                crdn1 = crdn1.a(null, long5, Boolean.valueOf(true));
                            }
                            hashMap0.put(((crso)crsn0.b_message).d, crdn1.b(((crso)crsn0.b_message).e, v2));
                        }
                        crst1 = crst0;
                    }
                }
            }
            crst1.p(v, crsn0);
            ++v;
            crqn1 = crqn0;
        }
        if(arrayList0.size() < ((crsu)crst1.b_message).e.size()) {
            if(!crst1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)crst1).ensureMutable();
            }
            ((crsu)crst1.b_message).e = hfvv.a;
            crst1.l(arrayList0);
        }
        for(Object object1: hashMap0.entrySet()) {
            this.o().Q(((crdn)((Map.Entry)object1).getValue()));
        }
    }

    private final boolean aC(String s, long v) {
        boolean z7;
        int v27;
        int v26;
        int v23;
        crsn crsn6;
        crsn crsn5;
        int v22;
        int v21;
        int v20;
        ProtoLiteBuilder hftp11;
        boolean z5;
        boolean z2;
        crst crst1;
        String s3;
        crsn crsn3;
        int v10;
        int v9;
        hfvv hfvv1;
        int v8;
        this.o().C();
        try {
            crqn crqn0 = new crqn(this);
            this.o().Z(s, v, this.D, crqn0);
            if(crqn0.c != null && !crqn0.c.isEmpty()) {
                crsu crsu0 = crqn0.a;
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)crsu0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)crsu0));
                crst crst0 = (crst)hftp0;
                if(!crst0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)crst0).ensureMutable();
                }
                hfvv hfvv0 = hfvv.a;
                ((crsu)crst0.b_message).e = hfvv0;
                crsn crsn0 = null;
                crsn crsn1 = null;
                int v2 = -1;
                int v3 = 0;
                int v4 = 0;
                int v5 = 0;
                boolean z = false;
                int v6 = -1;
                while(true) {
                    int v7 = v5;
                    if(v3 >= crqn0.c.size()) {
                        break;
                    }
                    crso crso0 = (crso)crqn0.c.get(v3);
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)crso0).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)crso0));
                    crsn crsn2 = (crsn)hftp1;
                    if(this.v().p(crqn0.a.r, ((crso)crsn2.b_message).d)) {
                        this.aJ().f.c("Dropping blocked raw event. appId", crji.a(crqn0.a.r), this.s().c(((crso)crsn2.b_message).d));
                        if(!this.v().j(crqn0.a.r) && !this.v().q(crqn0.a.r) && !"_err".equals(((crso)crsn2.b_message).d)) {
                            this.A().K(this.K, crqn0.a.r, 11, "_ev", ((crso)crsn2.b_message).d, 0);
                        }
                        v8 = v2;
                        hfvv1 = hfvv0;
                        v4 = v4;
                        z = z;
                        v9 = v3;
                    }
                    else {
                        String s1 = ((crso)crsn2.b_message).d;
                        if(!s1.equals("purchase") && (!s1.equals("_iap") && !s1.equals("ecommerce_purchase"))) {
                            v10 = v2;
                            crsn3 = crsn0;
                        }
                        else {
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)crsq.a).v_newBuilder();
                            v10 = v2;
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            crsq crsq0 = (crsq)hftp2.b_message;
                            crsn3 = crsn0;
                            crsq0.b |= 1;
                            crsq0.c = "_ct";
                            if(v7 == 0) {
                                String s2 = crqn0.a.r;
                                if(this.aE(s2, "purchase") && this.aE(s2, "_iap") && this.aE(s2, "ecommerce_purchase")) {
                                    s3 = "new";
                                    goto label_56;
                                }
                            }
                            s3 = "returning";
                        label_56:
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            crsq crsq1 = (crsq)hftp2.b_message;
                            crsq1.b |= 2;
                            crsq1.d = s3;
                            crsn2.k(((crsq)hftp2.N_build()));
                            v7 = 1;
                        }
                        if(((crso)crsn2.b_message).d.equals(crmc.a("_ai"))) {
                            if(!crsn2.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crsn2).ensureMutable();
                            }
                            crso crso1 = (crso)crsn2.b_message;
                            crso1.b |= 1;
                            crso1.d = "_ai";
                            this.aJ().k.a("Renaming ad_impression to _ai");
                            if(this.aJ().j(5)) {
                                for(int v11 = 0; v11 < ((crso)crsn2.b_message).c.size(); ++v11) {
                                    if("ad_platform".equals(crsn2.a(v11).c) && !crsn2.a(v11).d.isEmpty() && "admob".equalsIgnoreCase(crsn2.a(v11).d)) {
                                        this.aJ().h.a("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                }
                            }
                        }
                        boolean z1 = this.v().o(crqn0.a.r, ((crso)crsn2.b_message).d);
                        if(!z1) {
                            this.z();
                            String s4 = ((crso)crsn2.b_message).d;
                            batl.q(s4);
                            if(s4.hashCode() != 95027 || !s4.equals("_ui")) {
                                crst1 = crst0;
                                z = z;
                                z2 = false;
                                goto label_196;
                            }
                        }
                        boolean z3 = false;
                        boolean z4 = false;
                        int v12 = 0;
                        while(true) {
                            crst1 = crst0;
                            if(v12 >= ((crso)crsn2.b_message).c.size()) {
                                break;
                            }
                            if("_c".equals(crsn2.a(v12).c)) {
                                crsq crsq2 = crsn2.a(v12);
                                ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)crsq2).jf(5, null);
                                hftp3.X(((ProtoLiteMessage)crsq2));
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                crsq crsq3 = (crsq)hftp3.b_message;
                                crsq3.b |= 4;
                                crsq3.e = 1L;
                                crsn2.m(v12, ((crsq)hftp3.N_build()));
                                z3 = true;
                            }
                            else if("_r".equals(crsn2.a(v12).c)) {
                                crsq crsq4 = crsn2.a(v12);
                                ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)crsq4).jf(5, null);
                                hftp4.X(((ProtoLiteMessage)crsq4));
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                crsq crsq5 = (crsq)hftp4.b_message;
                                crsq5.b |= 4;
                                crsq5.e = 1L;
                                crsn2.m(v12, ((crsq)hftp4.N_build()));
                                z4 = true;
                            }
                            ++v12;
                            crst0 = crst1;
                        }
                        if(!z3 && z1) {
                            this.aJ().k.b("Marking event as conversion", this.s().c(((crso)crsn2.b_message).d));
                            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)crsq.a).v_newBuilder();
                            if(!hftp5.b_message.isImmutable()) {
                                hftp5.ensureMutable();
                            }
                            crsq crsq6 = (crsq)hftp5.b_message;
                            crsq6.b |= 1;
                            crsq6.c = "_c";
                            if(!hftp5.b_message.isImmutable()) {
                                hftp5.ensureMutable();
                            }
                            crsq crsq7 = (crsq)hftp5.b_message;
                            crsq7.b |= 4;
                            crsq7.e = 1L;
                            crsn2.n(hftp5);
                        }
                        if(!z4) {
                            this.aJ().k.b("Marking event as real-time", this.s().c(((crso)crsn2.b_message).d));
                            ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)crsq.a).v_newBuilder();
                            if(!hftp6.b_message.isImmutable()) {
                                hftp6.ensureMutable();
                            }
                            crsq crsq8 = (crsq)hftp6.b_message;
                            crsq8.b |= 1;
                            crsq8.c = "_r";
                            if(!hftp6.b_message.isImmutable()) {
                                hftp6.ensureMutable();
                            }
                            crsq crsq9 = (crsq)hftp6.b_message;
                            crsq9.b |= 4;
                            crsq9.e = 1L;
                            crsn2.n(hftp6);
                        }
                        if(this.o().aa(this.d(), crqn0.a.r, false, true, false, false).e > ((long)this.n().e(crqn0.a.r))) {
                            crqq.au(crsn2, "_r");
                            z = z;
                        }
                        else {
                            z = true;
                        }
                        if(crqx.ad(((crso)crsn2.b_message).d) && z1) {
                            z5 = z1;
                            if(this.o().aa(this.d(), crqn0.a.r, true, false, false, false).c > ((long)this.n().f(crqn0.a.r, crif.o))) {
                                this.aJ().f.b("Too many conversions. Not logging as conversion. appId", crji.a(crqn0.a.r));
                                int v13 = -1;
                                ProtoLiteBuilder hftp7 = null;
                                boolean z6 = false;
                                for(int v14 = 0; v14 < ((crso)crsn2.b_message).c.size(); ++v14) {
                                    crsq crsq10 = crsn2.a(v14);
                                    if("_c".equals(crsq10.c)) {
                                        ProtoLiteBuilder hftp8 = (ProtoLiteBuilder)((ProtoLiteMessage)crsq10).jf(5, null);
                                        hftp8.X(((ProtoLiteMessage)crsq10));
                                        hftp7 = hftp8;
                                        v13 = v14;
                                    }
                                    else {
                                        if("_err".equals(crsq10.c)) {
                                            z6 = true;
                                        }
                                        hftp7 = hftp7;
                                    }
                                }
                                ProtoLiteBuilder hftp9 = hftp7;
                                if(z6) {
                                    if(hftp9 == null) {
                                        hftp9 = null;
                                    }
                                    else {
                                        crsn2.l(v13);
                                        goto label_195;
                                    }
                                }
                                if(hftp9 == null) {
                                    this.aJ().c.b("Did not find conversion parameter. appId", crji.a(crqn0.a.r));
                                }
                                else {
                                    ProtoLiteBuilder hftp10 = hftp9.M_clone();
                                    if(!hftp10.b_message.isImmutable()) {
                                        hftp10.ensureMutable();
                                    }
                                    crsq crsq11 = (crsq)hftp10.b_message;
                                    crsq11.b |= 1;
                                    crsq11.c = "_err";
                                    if(!hftp10.b_message.isImmutable()) {
                                        hftp10.ensureMutable();
                                    }
                                    crsq crsq12 = (crsq)hftp10.b_message;
                                    crsq12.b |= 4;
                                    crsq12.e = 10L;
                                    crsn2.m(v13, ((crsq)hftp10.N_build()));
                                }
                            }
                        }
                        else {
                            z5 = z1;
                        }
                    label_195:
                        z2 = z5;
                    label_196:
                        if(z2) {
                            ArrayList arrayList0 = new ArrayList(DesugarCollections.unmodifiableList(((crso)crsn2.b_message).c));
                            int v16 = -1;
                            int v17 = -1;
                            for(int v15 = 0; v15 < arrayList0.size(); ++v15) {
                                if("value".equals(((crsq)arrayList0.get(v15)).c)) {
                                    v16 = v15;
                                }
                                else if("currency".equals(((crsq)arrayList0.get(v15)).c)) {
                                    v17 = v15;
                                }
                            }
                            if(v16 != -1) {
                                if((((crsq)arrayList0.get(v16)).b & 4) == 0 && (((crsq)arrayList0.get(v16)).b & 16) == 0) {
                                    this.aJ().h.a("Value must be specified with a numeric type.");
                                    crsn2.l(v16);
                                    crqq.au(crsn2, "_c");
                                    crqq.as(crsn2, 18, "value");
                                }
                                else {
                                    if(v17 != -1) {
                                        String s5 = ((crsq)arrayList0.get(v17)).d;
                                        if(s5.length() == 3) {
                                            int v18 = 0;
                                            while(v18 < s5.length()) {
                                                int v19 = s5.codePointAt(v18);
                                                if(Character.isLetter(v19)) {
                                                    v18 += Character.charCount(v19);
                                                    continue;
                                                }
                                                else {
                                                    goto label_226;
                                                }
                                                break;
                                            }
                                            goto label_230;
                                        }
                                    }
                                label_226:
                                    this.aJ().h.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                    crsn2.l(v16);
                                    crqq.au(crsn2, "_c");
                                    crqq.as(crsn2, 19, "currency");
                                }
                            }
                        }
                    label_230:
                        if("_e".equals(((crso)crsn2.b_message).d)) {
                            this.z();
                            hftp11 = crsn1;
                            if(crqt.D(((crso)((ProtoLiteBuilder)crsn2).N_build()), "_fr") == null) {
                                if(hftp11 != null && Math.abs(((crso)hftp11.b_message).e - ((crso)crsn2.b_message).e) <= 1000L) {
                                    crsn crsn4 = (crsn)hftp11.M_clone();
                                    if(this.aF(crsn2, crsn4)) {
                                        crst0 = crst1;
                                        crst0.p(v6, crsn4);
                                        v6 = v6;
                                        v20 = v10;
                                        crsn0 = null;
                                        crsn1 = null;
                                        goto label_292;
                                    }
                                }
                                crst0 = crst1;
                                v6 = v6;
                                crsn1 = hftp11;
                                crsn0 = crsn2;
                                v20 = v4;
                                goto label_292;
                            }
                            else {
                                v21 = v6;
                                crst0 = crst1;
                                v22 = v10;
                                crsn5 = crsn3;
                                goto label_288;
                            }
                            goto label_255;
                        }
                        else {
                        label_255:
                            hftp11 = crsn1;
                            v21 = v6;
                            crst0 = crst1;
                            if("_vs".equals(((crso)crsn2.b_message).d)) {
                                this.z();
                                if(crqt.D(((crso)((ProtoLiteBuilder)crsn2).N_build()), "_et") == null) {
                                    if(crsn3 == null) {
                                        v23 = v10;
                                        crsn6 = null;
                                    }
                                    else {
                                        crsn6 = crsn3;
                                        if(Math.abs(((crso)crsn6.b_message).e - ((crso)crsn2.b_message).e) <= 1000L) {
                                            crsn crsn7 = (crsn)((ProtoLiteBuilder)crsn6).M_clone();
                                            if(this.aF(crsn7, crsn2)) {
                                                crst0.p(v10, crsn7);
                                                v6 = v21;
                                                v20 = v10;
                                                crsn0 = null;
                                                crsn1 = null;
                                                goto label_292;
                                            }
                                        }
                                        v23 = v10;
                                    }
                                    crsn0 = crsn6;
                                    v20 = v23;
                                    crsn1 = crsn2;
                                    v6 = v4;
                                    goto label_292;
                                }
                                else {
                                    v22 = v10;
                                    crsn5 = crsn3;
                                    goto label_288;
                                }
                                goto label_284;
                            }
                            else {
                            label_284:
                                v22 = v10;
                                crsn5 = crsn3;
                                if(this.n().t(crif.aR) && ("_f".equals(((crso)crsn2.b_message).d) || "_v".equals(((crso)crsn2.b_message).d))) {
                                    crqq.at(crsn2);
                                }
                            }
                        }
                    label_288:
                        crsn0 = crsn5;
                        v6 = v21;
                        v20 = v22;
                        crsn1 = hftp11;
                    label_292:
                        if(((crso)crsn2.b_message).c.size() == 0) {
                            hfvv1 = hfvv0;
                            v8 = v20;
                        }
                        else {
                            this.z();
                            Bundle bundle0 = crqt.C(DesugarCollections.unmodifiableList(((crso)crsn2.b_message).c));
                            int v24 = 0;
                            while(v24 < ((crso)crsn2.b_message).c.size()) {
                                crsq crsq13 = crsn2.a(v24);
                                if(crsq13.c.equals("items") && !crsq13.h.isEmpty()) {
                                    String s6 = crqn0.a.r;
                                    hfuo hfuo0 = crsq13.h;
                                    Bundle[] arr_bundle = new Bundle[hfuo0.size()];
                                    int v25 = 0;
                                    while(v25 < hfuo0.size()) {
                                        crsq crsq14 = (crsq)hfuo0.get(v25);
                                        this.z();
                                        Bundle bundle1 = crqt.C(crsq14.h);
                                        Iterator iterator0 = crsq14.h.iterator();
                                        while(iterator0.hasNext()) {
                                            Object object0 = iterator0.next();
                                            String s7 = ((crso)crsn2.b_message).d;
                                            ProtoLiteBuilder hftp12 = (ProtoLiteBuilder)((ProtoLiteMessage)(((crsq)object0))).jf(5, null);
                                            hftp12.X(((ProtoLiteMessage)(((crsq)object0))));
                                            this.aw(s7, hftp12, bundle1, s6);
                                            v20 = v20;
                                            iterator0 = iterator0;
                                            hfuo0 = hfuo0;
                                            v25 = v25;
                                        }
                                        arr_bundle[v25] = bundle1;
                                        ++v25;
                                        v24 = v24;
                                        v20 = v20;
                                        hfuo0 = hfuo0;
                                    }
                                    v26 = v24;
                                    v27 = v20;
                                    bundle0.putParcelableArray("items", arr_bundle);
                                }
                                else {
                                    v26 = v24;
                                    v27 = v20;
                                    if(!crsq13.c.equals("items")) {
                                        String s8 = ((crso)crsn2.b_message).d;
                                        ProtoLiteBuilder hftp13 = (ProtoLiteBuilder)((ProtoLiteMessage)crsq13).jf(5, null);
                                        hftp13.X(((ProtoLiteMessage)crsq13));
                                        this.aw(s8, hftp13, bundle0, crqn0.a.r);
                                    }
                                }
                                v24 = v26 + 1;
                                v20 = v27;
                            }
                            v8 = v20;
                            if(!crsn2.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crsn2).ensureMutable();
                            }
                            hfvv1 = hfvv0;
                            ((crso)crsn2.b_message).c = hfvv1;
                            crqt crqt0 = this.z();
                            ArrayList arrayList1 = new ArrayList();
                            for(Object object1: bundle0.keySet()) {
                                ProtoLiteBuilder hftp14 = ((ProtoLiteMessage)crsq.a).v_newBuilder();
                                if(!hftp14.b_message.isImmutable()) {
                                    hftp14.ensureMutable();
                                }
                                crsq crsq15 = (crsq)hftp14.b_message;
                                ((String)object1).getClass();
                                crsq15.b |= 1;
                                crsq15.c = (String)object1;
                                Object object2 = bundle0.get(((String)object1));
                                if(object2 != null) {
                                    crqt0.L(hftp14, object2);
                                    arrayList1.add(((crsq)hftp14.N_build()));
                                }
                            }
                            for(Object object3: arrayList1) {
                                crsn2.k(((crsq)object3));
                            }
                        }
                        v9 = v3;
                        crqn0.c.set(v9, ((crso)((ProtoLiteBuilder)crsn2).N_build()));
                        crst0.m(crsn2);
                        ++v4;
                    }
                    v5 = v7;
                    v3 = v9 + 1;
                    hfvv0 = hfvv1;
                    v2 = v8;
                }
                long v28 = 0L;
                int v29 = v4;
                for(int v30 = 0; v30 < v29; ++v30) {
                    crso crso2 = crst0.a(v30);
                    if("_e".equals(crso2.d)) {
                        this.z();
                        if(crqt.D(crso2, "_fr") != null) {
                            if(!crst0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crst0).ensureMutable();
                            }
                            crsu crsu1 = (crsu)crst0.b_message;
                            crsu1.b();
                            crsu1.e.remove(v30);
                            --v29;
                            --v30;
                            continue;
                        }
                    }
                    this.z();
                    crsq crsq16 = crqt.D(crso2, "_et");
                    if(crsq16 != null) {
                        Long long0 = (crsq16.b & 4) == 0 ? null : ((long)crsq16.e);
                        if(long0 != null && ((long)long0) > 0L) {
                            v28 += (long)long0;
                        }
                    }
                }
                this.aA(crst0, v28, false);
                for(Object object4: DesugarCollections.unmodifiableList(((crsu)crst0.b_message).e)) {
                    if("_s".equals(((crso)object4).d)) {
                        this.o().M(((crsu)crst0.b_message).r, "_se");
                        break;
                    }
                }
                if(crqt.b(crst0, "_sid") >= 0) {
                    this.aA(crst0, v28, true);
                }
                else {
                    int v31 = crqt.b(crst0, "_se");
                    if(v31 >= 0) {
                        crst0.o(v31);
                        this.aJ().c.b("Session engagement user property is in the bundle without session ID. appId", crji.a(crqn0.a.r));
                    }
                }
                String s9 = crqn0.a.r;
                this.E();
                this.G();
                crca crca0 = this.o().i(s9);
                if(crca0 == null) {
                    this.aJ().c.b("Cannot fix consent fields without appInfo. appId", crji.a(s9));
                }
                else {
                    this.L(crca0, crst0);
                }
                String s10 = crqn0.a.r;
                this.E();
                this.G();
                crca crca1 = this.o().i(s10);
                if(crca1 == null) {
                    this.aJ().f.b("Cannot populate ad_campaign_info without appInfo. appId", crji.a(s10));
                }
                else {
                    this.T(crca1, crst0);
                }
                crqq.aH(crst0);
                if(!crst0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)crst0).ensureMutable();
                }
                crsu crsu2 = (crsu)crst0.b_message;
                crsu2.b &= 0xEFFFFFFF;
                crsu crsu3 = crsu.a;
                crsu2.G = crsu3.G;
                crmb crmb0 = this.w(crqn0.a.r).j(crmb.h(crqn0.a.N));
                crmb crmb1 = this.o().p(crqn0.a.r);
                this.o().R(crqn0.a.r, crmb0);
                if(!crmb0.q() && crmb1.q()) {
                    this.o().F(crqn0.a.r);
                }
                else if(crmb0.q() && !crmb1.q()) {
                    this.o().N(crqn0.a.r);
                }
                crqq.ar(crst0, crmb0);
                hvhs.c();
                if(this.n().u(crqn0.a.r, crif.aC) && this.A().O(crqn0.a.r) && this.w(crqn0.a.r).o() && crqn0.a.S) {
                    this.M(crst0, crqn0);
                }
                if(!crst0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)crst0).ensureMutable();
                }
                ((crsu)crst0.b_message).D = hfvv0;
                crcm crcm0 = this.l();
                String s11 = ((crsu)crst0.b_message).r;
                List list0 = DesugarCollections.unmodifiableList(((crsu)crst0.b_message).e);
                List list1 = DesugarCollections.unmodifiableList(((crsu)crst0.b_message).f);
                Long long1 = (long)((crsu)crst0.b_message).h;
                crsu crsu4 = (crsu)crst0.b_message;
                crst0.k(crcm0.b(s11, list0, list1, long1, ((boolean)(crmb0.q() ^ 1))));
                if("1".equals(this.n().a.a(crqn0.a.r, "measurement.event_sampling_enabled"))) {
                    this.aB(crst0, crqn0);
                }
                String s12 = crqn0.a.r;
                crca crca2 = this.o().i(s12);
                if(crca2 == null) {
                    this.aJ().c.b("Bundling raw events w/o app info. appId", crji.a(crqn0.a.r));
                }
                else if(((crsu)crst0.b_message).e.size() > 0) {
                    long v32 = crca2.k();
                    if(v32 == 0L) {
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu6 = (crsu)crst0.b_message;
                        crsu6.b &= -33;
                        crsu6.k = 0L;
                        v32 = 0L;
                    }
                    else {
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu5 = (crsu)crst0.b_message;
                        crsu5.b |= 0x20;
                        crsu5.k = v32;
                    }
                    long v33 = crca2.m();
                    if(v33 != 0L) {
                        v32 = v33;
                    }
                    if(v32 == 0L) {
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu8 = (crsu)crst0.b_message;
                        crsu8.b &= -17;
                        crsu8.j = 0L;
                    }
                    else {
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu7 = (crsu)crst0.b_message;
                        crsu7.b |= 16;
                        crsu7.j = v32;
                    }
                    crca2.E(((long)((crsu)crst0.b_message).e.size()));
                    int v34 = (int)crca2.j();
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    ((crsu)crst0.b_message).c |= 0x800000;
                    ((crsu)crst0.b_message).Y = v34;
                    int v35 = (int)crca2.l();
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    crsu crsu9 = (crsu)crst0.b_message;
                    crsu9.b |= 0x100000;
                    crsu9.z = v35;
                    crca2.X(crsu9.h);
                    crca2.V(((crsu)crst0.b_message).i);
                    String s13 = crca2.s();
                    if(s13 == null) {
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu11 = (crsu)crst0.b_message;
                        crsu11.b &= 0xFFDFFFFF;
                        crsu11.A = crsu3.A;
                    }
                    else {
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu10 = (crsu)crst0.b_message;
                        crsu10.b |= 0x200000;
                        crsu10.A = s13;
                    }
                    this.o().P(crca2);
                }
                if(((crsu)crst0.b_message).e.size() > 0) {
                    if(this.m().a && (((crsu)crst0.b_message).b & 0x200000) == 0) {
                        String s14 = this.aJ().f();
                        if(s14 == null) {
                            if(!crst0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crst0).ensureMutable();
                            }
                            crsu crsu13 = (crsu)crst0.b_message;
                            crsu13.b &= 0xFFDFFFFF;
                            crsu13.A = crsu3.A;
                        }
                        else {
                            if(!crst0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crst0).ensureMutable();
                            }
                            crsu crsu12 = (crsu)crst0.b_message;
                            crsu12.b |= 0x200000;
                            crsu12.A = s14;
                        }
                    }
                    crry crry0 = this.v().d(crqn0.a.r);
                    if(crry0 != null && (crry0.b & 1) != 0) {
                        long v36 = crry0.c;
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu14 = (crsu)crst0.b_message;
                        crsu14.b |= 0x20000000;
                        crsu14.H = v36;
                    }
                    else if(crqn0.a.B.isEmpty()) {
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu15 = (crsu)crst0.b_message;
                        crsu15.b |= 0x20000000;
                        crsu15.H = -1L;
                    }
                    else {
                        this.aJ().f.b("Did not find measurement config or missing version info. appId", crji.a(crqn0.a.r));
                    }
                    this.o().ab(((crsu)((ProtoLiteBuilder)crst0).N_build()), z);
                }
                this.o().G(crqn0.b);
                this.o().H(s12);
                this.o().O();
                z7 = true;
            }
            else {
                this.o().O();
                z7 = false;
            }
        }
        finally {
            this.o().J();
        }
        return z7;
    }

    private final boolean aD() {
        this.E();
        this.G();
        return this.o().e("select count(1) > 0 from raw_events", null) != 0L || !TextUtils.isEmpty(this.o().v());
    }

    private final boolean aE(String s, String s1) {
        crdn crdn0 = this.o().o(s, s1);
        return crdn0 == null || crdn0.c < 1L;
    }

    private final boolean aF(crsn crsn0, crsn crsn1) {
        batl.b("_e".equals(((crso)crsn0.b_message).d));
        this.z();
        crsq crsq0 = crqt.D(((crso)((ProtoLiteBuilder)crsn0).N_build()), "_sc");
        String s = null;
        String s1 = crsq0 == null ? null : crsq0.d;
        this.z();
        crsq crsq1 = crqt.D(((crso)((ProtoLiteBuilder)crsn1).N_build()), "_pc");
        if(crsq1 != null) {
            s = crsq1.d;
        }
        if(s != null && s.equals(s1)) {
            batl.b("_e".equals(((crso)crsn0.b_message).d));
            this.z();
            crsq crsq2 = crqt.D(((crso)((ProtoLiteBuilder)crsn0).N_build()), "_et");
            if(crsq2 != null && (crsq2.b & 4) != 0) {
                long v = crsq2.e;
                if(v > 0L) {
                    this.z();
                    crsq crsq3 = crqt.D(((crso)((ProtoLiteBuilder)crsn1).N_build()), "_et");
                    if(crsq3 != null) {
                        long v1 = crsq3.e;
                        if(v1 > 0L) {
                            v += v1;
                        }
                    }
                    this.z();
                    crqt.A(crsn1, "_et", Long.valueOf(v));
                    this.z();
                    crqt.A(crsn0, "_fr", Long.valueOf(1L));
                }
            }
            return true;
        }
        return false;
    }

    private static final boolean aG(AppMetadata appMetadata0) {
        return !TextUtils.isEmpty(appMetadata0.b);
    }

    private static final void aH(crst crst0) {
        if(!crst0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)crst0).ensureMutable();
        }
        crsu crsu0 = (crsu)crst0.b_message;
        crsu0.b |= 4;
        crsu0.h = 0x7FFFFFFFFFFFFFFFL;
        if(!crst0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)crst0).ensureMutable();
        }
        crsu crsu1 = (crsu)crst0.b_message;
        crsu1.b |= 8;
        crsu1.i = 0x8000000000000000L;
        for(int v = 0; v < ((crsu)crst0.b_message).e.size(); ++v) {
            crso crso0 = crst0.a(v);
            long v1 = crso0.e;
            if(v1 < ((crsu)crst0.b_message).h) {
                if(!crst0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)crst0).ensureMutable();
                }
                crsu crsu2 = (crsu)crst0.b_message;
                crsu2.b |= 4;
                crsu2.h = v1;
            }
            long v2 = crso0.e;
            if(v2 > ((crsu)crst0.b_message).i) {
                if(!crst0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)crst0).ensureMutable();
                }
                crsu crsu3 = (crsu)crst0.b_message;
                crsu3.b |= 8;
                crsu3.i = v2;
            }
        }
    }

    private static final Boolean aI(AppMetadata appMetadata0) {
        Boolean boolean0 = appMetadata0.p;
        String s = appMetadata0.C;
        if(!TextUtils.isEmpty(s)) {
            switch(crbx.a(s).a.ordinal()) {
                case 0: 
                case 1: {
                    return null;
                }
                case 2: {
                    return Boolean.valueOf(true);
                }
                case 3: {
                    return Boolean.valueOf(false);
                }
                default: {
                    return boolean0;
                }
            }
        }
        return boolean0;
    }

    @Override  // crlw
    public final crji aJ() {
        batl.s(this.i);
        return this.i.aJ();
    }

    @Override  // crlw
    public final crkq aK() {
        batl.s(this.i);
        return this.i.aK();
    }

    public final void aa(String s, crns crns0) {
        this.E();
        if(this.I != null && !this.I.equals(s) && crns0 == null) {
            return;
        }
        this.I = s;
        this.H = crns0;
    }

    final void ab(AppMetadata appMetadata0) {
        this.E();
        this.G();
        batl.q(appMetadata0.a);
        crmb crmb0 = crmb.i(appMetadata0.s, appMetadata0.x);
        this.w(appMetadata0.a);
        this.aJ().k.c("Setting storage consent for package", appMetadata0.a, crmb0);
        this.af(appMetadata0.a, crmb0);
    }

    final void ac(List list0) {
        batl.b(((boolean)(list0.isEmpty() ^ 1)));
        if(this.q != null) {
            this.aJ().c.a("Set uploading progress before finishing the previous upload");
            return;
        }
        this.q = new ArrayList(list0);
    }

    final void ad(ConditionalUserPropertyParcel conditionalUserPropertyParcel0, AppMetadata appMetadata0) {
        batl.q(conditionalUserPropertyParcel0.a);
        batl.s(conditionalUserPropertyParcel0.b);
        batl.s(conditionalUserPropertyParcel0.c);
        batl.q(conditionalUserPropertyParcel0.c.b);
        this.E();
        this.G();
        if(!crqq.aG(appMetadata0)) {
            return;
        }
        if(!appMetadata0.h) {
            this.j(appMetadata0);
            return;
        }
        ConditionalUserPropertyParcel conditionalUserPropertyParcel1 = new ConditionalUserPropertyParcel(conditionalUserPropertyParcel0);
        boolean z = false;
        conditionalUserPropertyParcel1.e = false;
        this.o().C();
        try {
            crdg crdg0 = this.o();
            String s = conditionalUserPropertyParcel1.a;
            batl.s(s);
            ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = crdg0.j(s, conditionalUserPropertyParcel1.c.b);
            if(conditionalUserPropertyParcel2 != null && !conditionalUserPropertyParcel2.b.equals(conditionalUserPropertyParcel1.b)) {
                this.aJ().f.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.s().e(conditionalUserPropertyParcel1.c.b), conditionalUserPropertyParcel1.b, conditionalUserPropertyParcel2.b);
            }
            if(conditionalUserPropertyParcel2 != null && conditionalUserPropertyParcel2.e) {
                conditionalUserPropertyParcel1.b = conditionalUserPropertyParcel2.b;
                conditionalUserPropertyParcel1.d = conditionalUserPropertyParcel2.d;
                conditionalUserPropertyParcel1.h = conditionalUserPropertyParcel2.h;
                conditionalUserPropertyParcel1.f = conditionalUserPropertyParcel2.f;
                conditionalUserPropertyParcel1.i = conditionalUserPropertyParcel2.i;
                conditionalUserPropertyParcel1.e = true;
                Object object0 = conditionalUserPropertyParcel1.c.a();
                conditionalUserPropertyParcel1.c = new UserAttributeParcel(conditionalUserPropertyParcel1.c.b, conditionalUserPropertyParcel2.c.c, object0, conditionalUserPropertyParcel2.c.f);
            }
            else if(TextUtils.isEmpty(conditionalUserPropertyParcel1.f)) {
                Object object1 = conditionalUserPropertyParcel1.c.a();
                conditionalUserPropertyParcel1.c = new UserAttributeParcel(conditionalUserPropertyParcel1.c.b, conditionalUserPropertyParcel1.d, object1, conditionalUserPropertyParcel1.c.f);
                conditionalUserPropertyParcel1.e = true;
                z = true;
            }
            if(conditionalUserPropertyParcel1.e) {
                UserAttributeParcel userAttributeParcel0 = conditionalUserPropertyParcel1.c;
                String s1 = conditionalUserPropertyParcel1.a;
                batl.s(s1);
                String s2 = conditionalUserPropertyParcel1.b;
                Object object2 = userAttributeParcel0.a();
                batl.s(object2);
                crqv crqv0 = new crqv(s1, s2, userAttributeParcel0.b, userAttributeParcel0.c, object2);
                if(this.o().Y(crqv0)) {
                    this.aJ().j.d("User property updated immediately", conditionalUserPropertyParcel1.a, this.s().e(crqv0.c), crqv0.e);
                }
                else {
                    this.aJ().c.d("(2)Too many active user properties, ignoring", crji.a(conditionalUserPropertyParcel1.a), this.s().e(crqv0.c), crqv0.e);
                }
                if(z) {
                    EventParcel eventParcel0 = conditionalUserPropertyParcel1.i;
                    if(eventParcel0 != null) {
                        this.al(new EventParcel(eventParcel0, conditionalUserPropertyParcel1.d, 0L), appMetadata0);
                    }
                }
            }
            if(this.o().X(conditionalUserPropertyParcel1)) {
                this.aJ().j.d("Conditional property added", conditionalUserPropertyParcel1.a, this.s().e(conditionalUserPropertyParcel1.c.b), conditionalUserPropertyParcel1.c.a());
            }
            else {
                this.aJ().c.d("Too many conditional properties, ignoring", crji.a(conditionalUserPropertyParcel1.a), this.s().e(conditionalUserPropertyParcel1.c.b), conditionalUserPropertyParcel1.c.a());
            }
            this.o().O();
        }
        finally {
            this.o().J();
        }
    }

    public final void ae() {
        long v9;
        long v3;
        boolean z;
        this.E();
        this.G();
        if(this.k > 0L) {
            this.av();
            long v = 3600000L - Math.abs(SystemClock.elapsedRealtime() - this.k);
            if(v > 0L) {
                this.aJ().k.b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(v));
                this.u().c();
                this.x().b();
                return;
            }
            this.k = 0L;
        }
        if(this.i.x() && this.aD()) {
            this.av();
            long v1 = System.currentTimeMillis();
            this.n();
            long v2 = Math.max(0L, ((Long)crif.N.a()).longValue());
            if(this.o().e("select count(1) > 0 from raw_events where realtime = 1", null) != 0L) {
                z = true;
            }
            else if(this.o().e("select count(1) > 0 from queue where has_realtime = 1", null) == 0L) {
                z = false;
            }
            else {
                z = true;
            }
            if(z) {
                String s = this.n().p();
                if(!TextUtils.isEmpty(s) && !".none.".equals(s)) {
                    this.n();
                    v3 = Math.max(0L, ((Long)crif.I.a()).longValue());
                }
                else {
                    this.n();
                    v3 = Math.max(0L, ((Long)crif.H.a()).longValue());
                }
            }
            else {
                this.n();
                v3 = Math.max(0L, ((Long)crif.G.a()).longValue());
            }
            long v4 = this.g.d.a();
            long v5 = this.g.e.a();
            long v6 = Math.max(this.o().f("select max(bundle_end_timestamp) from queue", null, 0L), this.o().f("select max(timestamp) from raw_events", null, 0L));
            if(v6 == 0L) {
                v9 = 0L;
            }
            else {
                long v7 = v1 - Math.abs(v6 - v1);
                long v8 = v1 - Math.abs(v5 - v1);
                v9 = v2 + v7;
                long v10 = Math.max(v1 - Math.abs(v4 - v1), v8);
                if(z && v10 > 0L) {
                    v9 = Math.min(v7, v10) + v3;
                }
                if(!this.z().w(v10, v3)) {
                    v9 = v10 + v3;
                }
                if(v8 != 0L && v8 >= v7) {
                    int v11 = 0;
                    while(true) {
                        this.n();
                        if(v11 >= Math.min(20, Math.max(0, ((Integer)crif.P.a()).intValue()))) {
                            break;
                        }
                        this.n();
                        v9 += Math.max(0L, ((Long)crif.O.a()).longValue()) * (1L << v11);
                        if(v9 > v8) {
                            goto label_58;
                        }
                        ++v11;
                    }
                    v9 = 0L;
                }
            }
        label_58:
            if(v9 == 0L) {
                this.aJ().k.a("Next upload time is 0");
                this.u().c();
                this.x().b();
                return;
            }
            if(!this.t().f()) {
                this.aJ().k.a("No network");
                crjp crjp0 = this.u();
                crqq crqq0 = crjp0.a;
                crqq0.G();
                crqq0.E();
                if(!crjp0.b) {
                    crjp0.a().registerReceiver(crjp0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    crjp0.c = crqq0.t().f();
                    crjp0.b().k.b("Registering connectivity change receiver. Network connected", Boolean.valueOf(crjp0.c));
                    crjp0.b = true;
                }
                this.x().b();
                return;
            }
            long v12 = this.g.c.a();
            this.n();
            long v13 = Math.max(0L, ((Long)crif.F.a()).longValue());
            if(!this.z().w(v12, v13)) {
                v9 = Math.max(v9, v12 + v13);
            }
            this.u().c();
            this.av();
            long v14 = v9 - System.currentTimeMillis();
            if(v14 <= 0L) {
                this.n();
                v14 = Math.max(0L, ((Long)crif.J.a()).longValue());
                crju crju0 = this.g.d;
                this.av();
                crju0.b(System.currentTimeMillis());
            }
            this.aJ().k.b("Upload scheduled in approximately ms", Long.valueOf(v14));
            this.x().c(v14);
            return;
        }
        this.aJ().k.a("Nothing to upload or uploading impossible");
        this.u().c();
        this.x().b();
    }

    final void af(String s, crmb crmb0) {
        this.E();
        this.G();
        this.E.put(s, crmb0);
        this.o().S(s, crmb0);
    }

    final void ag(String s, boolean z, Long long0, Long long1) {
        crca crca0 = this.o().i(s);
        if(crca0 != null) {
            crca0.ah(z);
            crca0.ai(long0);
            crca0.aj(long1);
            if(crca0.am()) {
                this.o().P(crca0);
            }
        }
    }

    final void ah(UserAttributeParcel userAttributeParcel0, AppMetadata appMetadata0) {
        long v4;
        this.E();
        this.G();
        if(crqq.aG(appMetadata0)) {
            if(!appMetadata0.h) {
                this.j(appMetadata0);
                return;
            }
            crqx crqx0 = this.A();
            String s = userAttributeParcel0.b;
            int v = crqx0.i(s);
            int v1 = 0;
            if(v != 0) {
                crqx crqx1 = this.A();
                this.n();
                String s1 = crqx1.B(s, 24, true);
                if(s != null) {
                    v1 = s.length();
                }
                this.A().K(this.K, appMetadata0.a, v, "_ev", s1, v1);
                return;
            }
            int v2 = this.A().b(s, userAttributeParcel0.a());
            if(v2 != 0) {
                crqx crqx2 = this.A();
                this.n();
                String s2 = crqx2.B(s, 24, true);
                Object object0 = userAttributeParcel0.a();
                if(object0 != null && ((object0 instanceof String) || (object0 instanceof CharSequence))) {
                    v1 = object0.toString().length();
                }
                this.A().K(this.K, appMetadata0.a, v2, "_ev", s2, v1);
                return;
            }
            Object object1 = this.A().z(s, userAttributeParcel0.a());
            if(object1 != null) {
                if("_sid".equals(s)) {
                    long v3 = userAttributeParcel0.c;
                    String s3 = userAttributeParcel0.f;
                    String s4 = appMetadata0.a;
                    batl.s(s4);
                    crqv crqv0 = this.o().s(s4, "_sno");
                    if(crqv0 == null) {
                    label_41:
                        if(crqv0 != null) {
                            this.aJ().f.b("Retrieved last session number from database does not contain a valid (long) value", crqv0.e);
                        }
                        crdn crdn0 = this.o().o(s4, "_s");
                        if(crdn0 == null) {
                            v4 = 0L;
                        }
                        else {
                            this.aJ().k.b("Backfill the session number. Last used session number", Long.valueOf(crdn0.c));
                            v4 = crdn0.c;
                        }
                    }
                    else {
                        Object object2 = crqv0.e;
                        if((object2 instanceof Long)) {
                            v4 = (long)(((Long)object2));
                            goto label_49;
                        }
                        goto label_41;
                    }
                label_49:
                    this.ah(new UserAttributeParcel("_sno", v3, ((long)(v4 + 1L)), s3), appMetadata0);
                }
                String s5 = appMetadata0.a;
                batl.s(s5);
                batl.s(userAttributeParcel0.f);
                crqv crqv1 = new crqv(s5, userAttributeParcel0.f, s, userAttributeParcel0.c, object1);
                crjg crjg0 = this.aJ().k;
                String s6 = crqv1.c;
                crjg0.c("Setting user property", this.s().e(s6), object1);
                this.o().C();
                try {
                    if("_id".equals(s6)) {
                        crqv crqv2 = this.o().s(s5, "_id");
                        if(crqv2 != null && !crqv1.e.equals(crqv2.e)) {
                            this.o().M(s5, "_lair");
                        }
                    }
                    this.j(appMetadata0);
                    boolean z = this.o().Y(crqv1);
                    if("_sid".equals(s)) {
                        long v6 = this.z().c(appMetadata0.u);
                        crca crca0 = this.o().i(s5);
                        if(crca0 != null) {
                            crca0.ad(v6);
                            if(crca0.am()) {
                                this.o().P(crca0);
                            }
                        }
                    }
                    this.o().O();
                    if(!z) {
                        this.aJ().c.c("Too many unique user properties are set. Ignoring user property", this.s().e(s6), crqv1.e);
                        this.A().K(this.K, s5, 9, null, null, 0);
                    }
                }
                finally {
                    this.o().J();
                }
            }
        }
    }

    final void ai() {
        Throwable throwable3;
        SQLiteException sQLiteException2;
        Cursor cursor1;
        this.E();
        this.G();
        this.A = true;
        try {
            if(this.m().a) {
            label_11:
                if(this.k <= 0L) {
                    this.E();
                    if(this.q != null) {
                        this.aJ().k.a("Uploading requested multiple times");
                    }
                    else if(this.t().f()) {
                        this.av();
                        long v = System.currentTimeMillis();
                        Cursor cursor0 = null;
                        int v1 = this.n().f(null, crif.ab);
                        this.n();
                        long v2 = v - crcu.A();
                        for(int v3 = 0; v3 < v1 && this.am(v2); ++v3) {
                        }
                        hvhs.c();
                        this.Q();
                        long v4 = this.g.d.a();
                        if(v4 != 0L) {
                            this.aJ().j.b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(v - v4)));
                        }
                        String s = this.o().v();
                        long v5 = -1L;
                        if(TextUtils.isEmpty(s)) {
                            this.D = -1L;
                            crdg crdg1 = this.o();
                            this.n();
                            long v6 = v - crcu.A();
                            crdg1.n();
                            crdg1.aA();
                            try {
                                cursor1 = crdg1.g().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(v6)});
                            }
                            catch(SQLiteException sQLiteException1) {
                                sQLiteException2 = sQLiteException1;
                                cursor1 = null;
                                goto label_74;
                            }
                            catch(Throwable throwable2) {
                                throwable3 = throwable2;
                                goto label_79;
                            }
                            try {
                                try {
                                    if(cursor1.moveToFirst()) {
                                        cursor0 = cursor1.getString(0);
                                    }
                                    else {
                                        crdg1.aJ().k.a("No expired configs for apps with pending events");
                                    }
                                    goto label_82;
                                }
                                catch(SQLiteException sQLiteException2) {
                                }
                            label_74:
                                crdg1.aJ().c.b("Error selecting expired configs", sQLiteException2);
                                if(cursor1 != null) {
                                    goto label_82;
                                }
                                goto label_83;
                            }
                            catch(Throwable throwable3) {
                                cursor0 = cursor1;
                            }
                        label_79:
                            if(cursor0 != null) {
                                cursor0.close();
                            }
                            throw throwable3;
                        label_82:
                            cursor1.close();
                        label_83:
                            if(!TextUtils.isEmpty(((CharSequence)cursor0))) {
                                crca crca0 = this.o().i(((String)cursor0));
                                if(crca0 != null) {
                                    this.J(crca0);
                                }
                            }
                        }
                        else {
                            if(this.D == -1L) {
                                crdg crdg0 = this.o();
                                try {
                                    try {
                                        cursor0 = crdg0.g().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        if(cursor0.moveToFirst()) {
                                            v5 = cursor0.getLong(0);
                                            goto label_47;
                                        }
                                        else {
                                            goto label_49;
                                        }
                                    }
                                    catch(SQLiteException sQLiteException0) {
                                        crdg0.aJ().c.b("Error querying raw events", sQLiteException0);
                                        if(cursor0 != null) {
                                            goto label_47;
                                        }
                                    }
                                    goto label_50;
                                }
                                catch(Throwable throwable1) {
                                    if(cursor0 != null) {
                                        cursor0.close();
                                    }
                                    throw throwable1;
                                }
                            label_47:
                                cursor0.close();
                                goto label_50;
                            label_49:
                                cursor0.close();
                            label_50:
                                this.D = v5;
                            }
                            this.aj(s, v);
                        }
                    }
                    else {
                        this.aJ().k.a("Network not connected, ignoring upload request");
                        this.ae();
                    }
                }
                else {
                    this.ae();
                }
            }
            else {
                Boolean boolean0 = this.i.n().c;
                if(boolean0 == null) {
                    this.aJ().f.a("Upload data called on the client side before use of service was decided");
                }
                else if(boolean0.booleanValue()) {
                    this.aJ().c.a("Upload called in the client side when service should be used");
                }
                else {
                    goto label_11;
                }
            }
        }
        catch(Throwable throwable0) {
            this.A = false;
            this.H();
            throw throwable0;
        }
        this.A = false;
        this.H();
    }

    final void aj(String s, long v) {
        Iterator iterator4;
        String s10;
        int v20;
        crqd crqd1;
        crpy crpy2;
        crpy crpy1;
        int v17;
        int v16;
        List list1;
        crqd crqd0;
        crss crss1;
        crca crca2;
        boolean z5;
        boolean z4;
        boolean z3;
        int v13;
        List list0;
        long v8;
        long v7;
        crsu crsu0;
        crst crst0;
        byte[] arr_b2;
        int v5;
        byte[] arr_b1;
        ByteArrayOutputStream byteArrayOutputStream0;
        crqt crqt0;
        byte[] arr_b;
        long v4;
        int v3;
        ArrayList arrayList0;
        Cursor cursor1;
        crdg crdg1;
        Cursor cursor0;
        int v1 = this.n().f(s, crif.h);
        int v2 = Math.max(0, this.n().f(s, crif.i));
        crdg crdg0 = this.o();
        crdg0.n();
        crdg0.aA();
        batl.b(v1 > 0);
        batl.b(v2 > 0);
        batl.q(s);
        try {
            cursor0 = crdg0.g().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{s}, null, null, "rowid", String.valueOf(v1));
        }
        catch(SQLiteException sQLiteException0) {
            crdg1 = crdg0;
            cursor0 = null;
            goto label_108;
        }
        catch(Throwable throwable0) {
            cursor1 = null;
            goto label_113;
        }
        try {
            if(cursor0.moveToFirst()) {
                arrayList0 = new ArrayList();
                v3 = 0;
                while(true) {
                label_20:
                    v4 = cursor0.getLong(0);
                    try {
                        arr_b = cursor0.getBlob(1);
                        crqt0 = crdg0.aw();
                        goto label_27;
                    }
                    catch(IOException iOException0) {
                    }
                    crdg1 = crdg0;
                    goto label_96;
                }
            }
            else {
                list0 = Collections.EMPTY_LIST;
            }
            goto label_116;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_107;
        }
        catch(Throwable throwable0) {
            goto label_112;
        }
        crdg1 = crdg0;
        goto label_96;
        try {
        label_27:
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
            GZIPInputStream gZIPInputStream0 = new GZIPInputStream(byteArrayInputStream0);
            byteArrayOutputStream0 = new ByteArrayOutputStream();
            arr_b1 = new byte[0x400];
            while(true) {
            label_31:
                v5 = gZIPInputStream0.read(arr_b1);
                if(v5 > 0) {
                    goto label_88;
                }
                gZIPInputStream0.close();
                byteArrayInputStream0.close();
                arr_b2 = byteArrayOutputStream0.toByteArray();
                goto label_40;
            }
        }
        catch(IOException iOException1) {
            crdg1 = crdg0;
            goto label_93;
        label_40:
            if(!arrayList0.isEmpty() && arr_b2.length + v3 > v2) {
                list0 = arrayList0;
                goto label_116;
            }
            try {
                try {
                    crst0 = (crst)crqt.o(((Builder)(((crst)((ProtoLiteMessage)crsu.a).v_newBuilder()))), arr_b2);
                    goto label_47;
                }
                catch(IOException iOException2) {
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_107;
                }
                try {
                    crdg1 = crdg0;
                    crdg1.aJ().c.c("Failed to merge queued bundle. appId", crji.a(s), iOException2);
                    goto label_97;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_108;
                }
                try {
                label_47:
                    if(arrayList0.isEmpty()) {
                        crdg1 = crdg0;
                        goto label_77;
                    }
                    crsu0 = (crsu)((Pair)arrayList0.get(0)).first;
                    crsu crsu1 = (crsu)((ProtoLiteBuilder)crst0).N_build();
                    crdg1 = crdg0;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_107;
                }
                try {
                    if(!crsu0.N.equals(crsu1.N) || !crsu0.T.equals(crsu1.T) || crsu0.U != crsu1.U || !crsu0.V.equals(crsu1.V)) {
                        list0 = arrayList0;
                        goto label_116;
                    }
                    long v6 = -1L;
                    for(Iterator iterator0 = crsu0.f.iterator(); true; iterator0 = iterator0) {
                        v7 = -1L;
                        if(!iterator0.hasNext()) {
                            break;
                        }
                        Object object0 = iterator0.next();
                        crtg crtg0 = (crtg)object0;
                        if("_npa".equals(crtg0.d)) {
                            v6 = crtg0.f;
                            break;
                        }
                    }
                    for(Object object1: crsu1.f) {
                        v8 = v6;
                        crtg crtg1 = (crtg)object1;
                        if(!"_npa".equals(crtg1.d)) {
                            v6 = v8;
                            continue;
                        }
                        v7 = crtg1.f;
                        goto label_73;
                    }
                    v8 = v6;
                label_73:
                    if(v8 == v7) {
                    label_77:
                        if(!cursor0.isNull(2)) {
                            int v9 = cursor0.getInt(2);
                            if(!crst0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crst0).ensureMutable();
                            }
                            ((crsu)crst0.b_message).c |= 2;
                            ((crsu)crst0.b_message).J = v9;
                        }
                        v3 += arr_b2.length;
                        arrayList0.add(Pair.create(((crsu)((ProtoLiteBuilder)crst0).N_build()), Long.valueOf(v4)));
                        goto label_97;
                        try {
                        label_88:
                            crdg1 = crdg0;
                            byteArrayOutputStream0.write(arr_b1, 0, v5);
                            crdg0 = crdg1;
                            goto label_31;
                        }
                        catch(IOException iOException1) {
                            goto label_93;
                        }
                    }
                    else {
                        list0 = arrayList0;
                    }
                    goto label_116;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_108;
                }
            }
            catch(Throwable throwable0) {
                goto label_112;
            }
            try {
            label_93:
                crqt0.aJ().c.b("Failed to ungzip content", iOException1);
                throw iOException1;
            }
            catch(IOException iOException0) {
            }
            catch(SQLiteException sQLiteException0) {
                goto label_108;
            }
            catch(Throwable throwable0) {
                goto label_112;
            }
            try {
            label_96:
                crdg1.aJ().c.c("Failed to unzip queued bundle. appId", crji.a(s), iOException0);
            label_97:
                if(cursor0.moveToNext() && v3 <= v2) {
                    crdg0 = crdg1;
                    goto label_20;
                }
                else {
                    list0 = arrayList0;
                }
                goto label_116;
            }
            catch(SQLiteException sQLiteException0) {
            }
            catch(Throwable throwable0) {
                goto label_112;
            }
            goto label_108;
        }
        catch(SQLiteException sQLiteException0) {
        label_107:
            crdg1 = crdg0;
            try {
            label_108:
                crdg1.aJ().c.c("Error querying bundles. appId", crji.a(s), sQLiteException0);
                list0 = Collections.EMPTY_LIST;
                goto label_116;
            }
            catch(Throwable throwable0) {
            }
            goto label_112;
        }
        catch(Throwable throwable0) {
        label_112:
            cursor1 = cursor0;
        }
    label_113:
        if(cursor1 != null) {
            cursor1.close();
        }
        throw throwable0;
    label_116:
        if(cursor0 != null) {
            cursor0.close();
        }
        if(!list0.isEmpty()) {
            if(this.w(s).o()) {
                String s1 = null;
                for(Object object2: list0) {
                    crsu crsu2 = (crsu)((Pair)object2).first;
                    if(!crsu2.v.isEmpty()) {
                        s1 = crsu2.v;
                        break;
                    }
                }
                if(s1 != null) {
                    for(int v10 = 0; v10 < list0.size(); ++v10) {
                        crsu crsu3 = (crsu)((Pair)list0.get(v10)).first;
                        if(!crsu3.v.isEmpty() && !crsu3.v.equals(s1)) {
                            list0 = list0.subList(0, v10);
                            break;
                        }
                    }
                }
            }
            crss crss0 = crss.a;
            crsr crsr0 = (crsr)((ProtoLiteMessage)crss0).v_newBuilder();
            int v11 = list0.size();
            ArrayList arrayList1 = new ArrayList(list0.size());
            int v12 = !this.n().v(s) || !this.w(s).o() ? 0 : 1;
            boolean z = this.w(s).o();
            boolean z1 = this.w(s).q();
            hvih.c();
            boolean z2 = this.n().u(s, crif.az);
            crpy crpy0 = this.u;
            crca crca0 = crpy0.at().i(s);
            if(crca0 != null && crca0.an()) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)crtf.a).v_newBuilder();
                v13 = v12;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                z3 = z;
                ((crtf)hftp0.b_message).c = 1;
                ((crtf)hftp0.b_message).b |= 1;
                crta crta0 = crta.b(crca0.b());
                batl.s(crta0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((crtf)hftp0.b_message).d = crta0.m;
                ((crtf)hftp0.b_message).b |= 2;
                String s2 = crca0.u();
                crry crry0 = crpy0.au().d(s);
                if(crry0 == null) {
                    crss1 = crss0;
                    z4 = z1;
                    z5 = z2;
                label_296:
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((crtf)hftp0.b_message).e = 2;
                    ((crtf)hftp0.b_message).b |= 4;
                    String s8 = crpy0.ax(s);
                    Map map1 = Collections.EMPTY_MAP;
                    crtf crtf4 = (crtf)hftp0.N_build();
                    crqd0 = new crqd(s8, map1, crnq.a, crtf4);
                }
                else {
                    crca crca1 = crpy0.at().i(s);
                    if(crca1 == null) {
                        crss1 = crss0;
                        z4 = z1;
                        z5 = z2;
                        goto label_296;
                    }
                    else if((crry0.b & 0x200) != 0) {
                        z4 = z1;
                        if((crry0.l == null ? crsa.a : crry0.l).d == 100) {
                            goto label_172;
                        }
                        else {
                            goto label_171;
                        }
                    }
                    else {
                        z4 = z1;
                    label_171:
                        if(crpy0.aq().Z(s, crca1.C()) || !TextUtils.isEmpty(s2) && Math.abs(s2.hashCode() % 100) < (crry0.l == null ? crsa.a : crry0.l).d) {
                        label_172:
                            String s3 = crca0.t();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((crtf)hftp0.b_message).c = 1;
                            ((crtf)hftp0.b_message).b |= 1;
                            crry crry1 = crpy0.au().d(crca0.t());
                            if(crry1 != null && (crry1.b & 0x200) != 0) {
                                HashMap hashMap0 = new HashMap();
                                if(TextUtils.isEmpty(crca0.C())) {
                                    z5 = z2;
                                    crca2 = crca0;
                                }
                                else {
                                    z5 = z2;
                                    crca2 = crca0;
                                    hashMap0.put("x-gtm-server-preview", crca0.C());
                                }
                                String s4 = (crry1.l == null ? crsa.a : crry1.l).e;
                                crta crta1 = crta.b(crca2.b());
                                crss1 = crss0;
                                if(crta1 != null && crta1 != crta.b) {
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ((crtf)hftp0.b_message).d = crta1.m;
                                    ((crtf)hftp0.b_message).b |= 2;
                                    goto label_209;
                                }
                                else if(crpy.az(crca2.t())) {
                                    crta crta2 = crta.k;
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ((crtf)hftp0.b_message).d = crta2.m;
                                    ((crtf)hftp0.b_message).b |= 2;
                                    goto label_209;
                                }
                                else if(TextUtils.isEmpty(s4)) {
                                    crta crta3 = crta.l;
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ((crtf)hftp0.b_message).d = crta3.m;
                                    ((crtf)hftp0.b_message).b |= 2;
                                label_209:
                                    crsa crsa0 = crry1.l;
                                    String s5 = (crsa0 == null ? crsa.a : crsa0).b;
                                    if(crsa0 == null) {
                                        crsa0 = crsa.a;
                                    }
                                    String s6 = crsa0.c;
                                    if(!crpy0.al().a) {
                                        if(TextUtils.isEmpty(s4)) {
                                            if(!hftp0.b_message.isImmutable()) {
                                                hftp0.ensureMutable();
                                            }
                                            ((crtf)hftp0.b_message).e = 5;
                                            ((crtf)hftp0.b_message).b |= 4;
                                            crpy0.aJ().k.b("[sgtm] Local service, missing sgtm_server_url", crca2.t());
                                            crqd0 = null;
                                        }
                                        else {
                                            crpy0.aJ().k.b("[sgtm] Eligible for local service direct upload. appId", s3);
                                            if(!hftp0.b_message.isImmutable()) {
                                                hftp0.ensureMutable();
                                            }
                                            ProtoLiteMessage hftv1 = hftp0.b_message;
                                            ((crtf)hftv1).c = 4;
                                            ((crtf)hftv1).b |= 1;
                                            if(!hftv1.isImmutable()) {
                                                hftp0.ensureMutable();
                                            }
                                            ((crtf)hftp0.b_message).e = 1;
                                            ((crtf)hftp0.b_message).b |= 4;
                                            crtf crtf1 = (crtf)hftp0.N_build();
                                            crqd0 = new crqd(s4, hashMap0, crnq.c, crtf1);
                                        }
                                    }
                                    else if(!TextUtils.isEmpty(s5) && !TextUtils.isEmpty(s6)) {
                                        hashMap0.put("x-sgtm-server-info", s6);
                                        crpy0.aJ().k.b("[sgtm] Eligible for GmsCore upload to sGTM proxy. appId", s3);
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ProtoLiteMessage hftv0 = hftp0.b_message;
                                        ((crtf)hftv0).c = 3;
                                        ((crtf)hftv0).b |= 1;
                                        if(!hftv0.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((crtf)hftp0.b_message).e = 1;
                                        ((crtf)hftp0.b_message).b |= 4;
                                        crtf crtf0 = (crtf)hftp0.N_build();
                                        crqd0 = new crqd(s5, hashMap0, crnq.c, crtf0);
                                    }
                                    else {
                                        crpy0.aJ().k.b("[sgtm] Missing sgtm_upload_url or sgtm_server_info", crca2.t());
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((crtf)hftp0.b_message).e = 4;
                                        ((crtf)hftp0.b_message).b |= 4;
                                        crqd0 = null;
                                    }
                                }
                                else {
                                    crpy0.aJ().k.b("[sgtm] Eligible for client side upload. appId", s3);
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv2 = hftp0.b_message;
                                    ((crtf)hftv2).c = 2;
                                    ((crtf)hftv2).b |= 1;
                                    crta crta4 = crta.b;
                                    if(!hftv2.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ((crtf)hftp0.b_message).d = crta4.m;
                                    ((crtf)hftp0.b_message).b |= 2;
                                    crtf crtf2 = (crtf)hftp0.N_build();
                                    crqd0 = new crqd(s4, hashMap0, crnq.d, crtf2);
                                }
                            }
                            else {
                                crss1 = crss0;
                                z5 = z2;
                                crpy0.aJ().k.b("[sgtm] Missing sgtm_setting in remote config. appId", s3);
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ((crtf)hftp0.b_message).e = 3;
                                ((crtf)hftp0.b_message).b |= 4;
                                crqd0 = null;
                            }
                            if(crqd0 == null) {
                                String s7 = crpy0.ax(s);
                                Map map0 = Collections.EMPTY_MAP;
                                crtf crtf3 = (crtf)hftp0.N_build();
                                crqd0 = new crqd(s7, map0, crnq.a, crtf3);
                            }
                        }
                        else {
                            crss1 = crss0;
                            z5 = z2;
                            goto label_296;
                        }
                    }
                }
            }
            else {
                crss1 = crss0;
                v13 = v12;
                z3 = z;
                z4 = z1;
                z5 = z2;
                crqd0 = new crqd(crpy0.ax(s), crnq.a);
            }
            int v14 = 0;
            while(v14 < v11) {
                crsu crsu4 = (crsu)((Pair)list0.get(v14)).first;
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)crsu4).jf(5, null);
                hftp1.X(((ProtoLiteMessage)crsu4));
                crst crst1 = (crst)hftp1;
                arrayList1.add(((Long)((Pair)list0.get(v14)).second));
                long v15 = this.n().i();
                if(!crst1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)crst1).ensureMutable();
                }
                crsu crsu5 = (crsu)crst1.b_message;
                crsu5.b |= 0x8000;
                crsu5.u = v15;
                if(!crst1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)crst1).ensureMutable();
                }
                crsu crsu6 = (crsu)crst1.b_message;
                crsu6.b |= 2;
                crsu6.g = v;
                boolean z6 = this.m().a;
                if(!crst1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)crst1).ensureMutable();
                }
                crsu crsu7 = (crsu)crst1.b_message;
                crsu7.b |= 0x800000;
                crsu7.C = z6;
                if(v13 == 0) {
                    if(!crst1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst1).ensureMutable();
                    }
                    crsu crsu8 = (crsu)crst1.b_message;
                    crsu8.b &= 0x7FFFFFFF;
                    crsu8.I = crsu.a.I;
                }
                if(!z3) {
                    if(!crst1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst1).ensureMutable();
                    }
                    crsu crsu9 = (crsu)crst1.b_message;
                    crsu9.b &= 0xFFFEFFFF;
                    crsu9.v = crsu.a.v;
                    if(!crst1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst1).ensureMutable();
                    }
                    crsu crsu10 = (crsu)crst1.b_message;
                    crsu10.b &= 0xFFFDFFFF;
                    crsu10.w = false;
                }
                if(!z4) {
                    if(!crst1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst1).ensureMutable();
                    }
                    crsu crsu11 = (crsu)crst1.b_message;
                    crsu11.b &= 0xFFFBFFFF;
                    crsu11.x = crsu.a.x;
                }
                this.I(s, crst1);
                if(!z5) {
                    if(!crst1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst1).ensureMutable();
                    }
                    ((crsu)crst1.b_message).c &= 0xFFFFDFFF;
                    ((crsu)crst1.b_message).O = crsu.a.O;
                }
                if(!z4) {
                    if(!crst1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst1).ensureMutable();
                    }
                    ((crsu)crst1.b_message).D = hfvv.a;
                }
                String s9 = ((crsu)crst1.b_message).v;
                if(!TextUtils.isEmpty(s9) && !s9.equals("00000000-0000-0000-0000-000000000000")) {
                    list1 = list0;
                    v16 = v14;
                    v17 = v11;
                    crpy1 = crpy0;
                }
                else {
                    ArrayList arrayList2 = new ArrayList(DesugarCollections.unmodifiableList(((crsu)crst1.b_message).e));
                    boolean z7 = false;
                    boolean z8 = false;
                    Long long0 = null;
                    Long long1 = null;
                    Iterator iterator3 = arrayList2.iterator();
                    while(iterator3.hasNext()) {
                        Object object3 = iterator3.next();
                        crso crso0 = (crso)object3;
                        if("_fx".equals(crso0.d)) {
                            iterator3.remove();
                            v14 = v14;
                            list0 = list0;
                            v11 = v11;
                            z7 = true;
                            z8 = true;
                        }
                        else if("_f".equals(crso0.d)) {
                            this.z();
                            crsq crsq0 = crqt.D(crso0, "_pfo");
                            if(crsq0 != null) {
                                long1 = (long)crsq0.e;
                            }
                            this.z();
                            crsq crsq1 = crqt.D(crso0, "_uwa");
                            if(crsq1 != null) {
                                long0 = (long)crsq1.e;
                            }
                            crpy0 = crpy0;
                            v14 = v14;
                            list0 = list0;
                            v11 = v11;
                            iterator3 = iterator3;
                            z8 = true;
                        }
                        else {
                            v14 = v14;
                            list0 = list0;
                            v11 = v11;
                        }
                    }
                    list1 = list0;
                    v16 = v14;
                    v17 = v11;
                    crpy1 = crpy0;
                    if(z7) {
                        if(!crst1.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst1).ensureMutable();
                        }
                        ((crsu)crst1.b_message).e = hfvv.a;
                        crst1.l(arrayList2);
                    }
                    if(z8) {
                        this.ag(((crsu)crst1.b_message).r, true, long1, long0);
                    }
                }
                if(((crsu)crst1.b_message).e.size() != 0) {
                    if(this.n().u(s, crif.av)) {
                        byte[] arr_b3 = ((crsu)((ProtoLiteBuilder)crst1).N_build()).toBytesArray();
                        long v18 = this.z().d(arr_b3);
                        if(!crst1.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst1).ensureMutable();
                        }
                        ((crsu)crst1.b_message).c |= 0x20;
                        ((crsu)crst1.b_message).M = v18;
                    }
                    crtf crtf5 = crqd0.c;
                    if(crtf5 != null) {
                        if(!crst1.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst1).ensureMutable();
                        }
                        ((crsu)crst1.b_message).aa = crtf5;
                        ((crsu)crst1.b_message).c |= 0x4000000;
                    }
                    crsr0.k(crst1);
                }
                v14 = v16 + 1;
                crpy0 = crpy1;
                list0 = list1;
                v11 = v17;
            }
            if(((crss)crsr0.b_message).c.size() == 0) {
                this.ac(arrayList1);
                this.S(false, 204, null, null, s, Collections.EMPTY_LIST, null);
                return;
            }
            crss crss2 = (crss)((ProtoLiteBuilder)crsr0).N_build();
            ArrayList arrayList3 = new ArrayList();
            int v19 = crqd0.b == crnq.d ? 1 : 0;
            if(crqd0.b == crnq.c) {
                v20 = v19;
                s10 = null;
                iterator4 = ((crss)((ProtoLiteBuilder)crsr0).N_build()).c.iterator();
            label_459:
                while(iterator4.hasNext()) {
                    Object object4 = iterator4.next();
                    if((((crsu)object4).b & 0x80000000) != 0) {
                        s10 = UUID.randomUUID().toString();
                        break;
                    }
                }
                crss crss3 = (crss)((ProtoLiteBuilder)crsr0).N_build();
                this.E();
                this.G();
                crsr crsr1 = (crsr)((ProtoLiteMessage)crss1).w(((ProtoLiteMessage)crss3));
                if(!TextUtils.isEmpty(s10)) {
                    if(!crsr1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crsr1).ensureMutable();
                    }
                    crss crss4 = (crss)crsr1.b_message;
                    s10.getClass();
                    crss4.b |= 1;
                    crss4.d = s10;
                }
                String s11 = this.v().f(s);
                if(TextUtils.isEmpty(s11)) {
                    crpy2 = crpy0;
                }
                else {
                    if(!crsr1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crsr1).ensureMutable();
                    }
                    crss crss5 = (crss)crsr1.b_message;
                    s11.getClass();
                    crpy2 = crpy0;
                    crss5.b |= 2;
                    crss5.e = s11;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator iterator5 = crss3.c.iterator();
                while(iterator5.hasNext()) {
                    Object object5 = iterator5.next();
                    crsu crsu12 = crsu.a;
                    crst crst2 = (crst)((ProtoLiteMessage)crsu12).w(((ProtoLiteMessage)(((crsu)object5))));
                    if(!crst2.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst2).ensureMutable();
                    }
                    crsu crsu13 = (crsu)crst2.b_message;
                    crsu13.b &= 0x7FFFFFFF;
                    crsu13.I = crsu12.I;
                    arrayList4.add(((crsu)((ProtoLiteBuilder)crst2).N_build()));
                    iterator5 = iterator5;
                    crsr0 = crsr0;
                }
                if(!crsr1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)crsr1).ensureMutable();
                }
                ((crss)crsr1.b_message).c = hfvv.a;
                crsr1.a(arrayList4);
                this.aJ().k.b("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", (TextUtils.isEmpty(s10) ? "null" : ((crss)crsr1.b_message).d));
                crss2 = (crss)((ProtoLiteBuilder)crsr1).N_build();
                if(!TextUtils.isEmpty(s10)) {
                    crss crss6 = (crss)((ProtoLiteBuilder)crsr0).N_build();
                    this.E();
                    this.G();
                    crsr crsr2 = (crsr)((ProtoLiteMessage)crss1).v_newBuilder();
                    this.aJ().k.b("[sgtm] Processing Google Signal, sgtmJoinId:", s10);
                    if(!crsr2.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crsr2).ensureMutable();
                    }
                    crss crss7 = (crss)crsr2.b_message;
                    s10.getClass();
                    crss7.b |= 1;
                    crss7.d = s10;
                    for(Object object6: crss6.c) {
                        crst crst3 = (crst)((ProtoLiteMessage)crsu.a).v_newBuilder();
                        String s12 = ((crsu)object6).I;
                        if(!crst3.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst3).ensureMutable();
                        }
                        crsu crsu14 = (crsu)crst3.b_message;
                        s12.getClass();
                        crsu14.b |= 0x80000000;
                        crsu14.I = s12;
                        int v21 = ((crsu)object6).Y;
                        if(!crst3.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst3).ensureMutable();
                        }
                        ((crsu)crst3.b_message).c |= 0x800000;
                        ((crsu)crst3.b_message).Y = v21;
                        crsr2.k(crst3);
                    }
                    crss crss8 = (crss)((ProtoLiteBuilder)crsr2).N_build();
                    String s13 = crpy2.au().f(s);
                    if(TextUtils.isEmpty(s13)) {
                        crqd1 = new crqd(((String)crif.s.a()), (v20 == 0 ? crnq.b : crnq.e));
                    }
                    else {
                        Uri uri0 = Uri.parse(((String)crif.s.a()));
                        Uri.Builder uri$Builder0 = uri0.buildUpon();
                        uri$Builder0.authority(s13 + "." + uri0.getAuthority());
                        crqd1 = new crqd(uri$Builder0.build().toString(), (v20 == 0 ? crnq.b : crnq.e));
                    }
                    arrayList3.add(Pair.create(crss8, crqd1));
                }
                if(v20 == 0) {
                label_577:
                    if(this.t().f()) {
                        String s14 = this.aJ().j(2) ? this.z().p(crss2) : null;
                        this.z();
                        byte[] arr_b4 = crss2.toBytesArray();
                        this.ac(arrayList1);
                        this.g.e.b(v);
                        this.aJ().k.d("Uploading data. app, uncompressed size, data", s, Integer.valueOf(arr_b4.length), s14);
                        this.p = true;
                        this.t().e(s, crqd0, crss2, new crqg(this, s, arrayList3));
                    }
                }
                else {
                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)crss2).jf(5, null);
                    hftp2.X(((ProtoLiteMessage)crss2));
                    for(int v22 = 0; v22 < crss2.c.size(); ++v22) {
                        crsu crsu15 = (crsu)crss2.c.get(v22);
                        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)crsu15).jf(5, null);
                        hftp3.X(((ProtoLiteMessage)crsu15));
                        crst crst4 = (crst)hftp3;
                        if(!crst4.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst4).ensureMutable();
                        }
                        crsu crsu16 = (crsu)crst4.b_message;
                        crsu16.b &= -3;
                        crsu16.g = 0L;
                        if(!crst4.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst4).ensureMutable();
                        }
                        ((crsu)crst4.b_message).c |= 0x8000000;
                        ((crsu)crst4.b_message).ab = v;
                        ((crsr)hftp2).l(v22, crst4);
                    }
                    arrayList3.add(Pair.create(((crss)((ProtoLiteBuilder)(((crsr)hftp2))).N_build()), crqd0));
                    this.ac(arrayList1);
                    this.S(false, 204, null, null, s, arrayList3, null);
                    if(this.ao(s, crqd0.a)) {
                        this.aJ().k.b("[sgtm] Sending sgtm batches available notification to app", s);
                        Intent intent0 = new Intent();
                        intent0.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        intent0.setPackage(s);
                        crqq.Y(this.e(), intent0);
                    }
                }
            }
            else if(v19 != 0) {
                v20 = 1;
                s10 = null;
                iterator4 = ((crss)((ProtoLiteBuilder)crsr0).N_build()).c.iterator();
                goto label_459;
            }
            else {
                goto label_577;
            }
        }
    }

    final void ak(String s) {
        this.E();
        this.G();
        this.A = true;
        try {
            if(this.m().a) {
            label_12:
                if(this.k > 0L) {
                    this.ae();
                }
                else if(!this.t().f()) {
                    this.aJ().k.a("Network not connected, ignoring upload request");
                    this.ae();
                }
                else if(this.o().T(s)) {
                    crdg crdg0 = this.o();
                    batl.q(s);
                    crdg0.n();
                    crdg0.aA();
                    List list0 = crdg0.y(s, UploadBatchesCriteria.a(new crnq[]{crnq.b}), 1);
                    crqs crqs0 = list0.isEmpty() ? null : ((crqs)list0.get(0));
                    if(crqs0 != null) {
                        crss crss0 = crqs0.b;
                        if(crss0 != null) {
                            crjg crjg0 = this.aJ().k;
                            crnq crnq0 = crqs0.e;
                            String s1 = crqs0.c;
                            crjg0.d("[sgtm] Uploading data from upload queue. appId, type, url", s, crnq0, s1);
                            byte[] arr_b = crss0.toBytesArray();
                            if(this.aJ().j(2)) {
                                String s2 = this.z().p(crss0);
                                this.aJ().k.d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", s, Integer.valueOf(arr_b.length), s2);
                            }
                            crqd crqd0 = new crqd(s1, crqs0.d, crnq0, null);
                            this.p = true;
                            this.t().e(s, crqd0, crss0, new crqh(this, s, crqs0));
                        }
                    }
                }
                else {
                    this.aJ().k.b("[sgtm] Upload queue has no batches for appId", s);
                }
            }
            else {
                Boolean boolean0 = this.i.n().c;
                if(boolean0 == null) {
                    this.aJ().f.a("Upload data called on the client side before use of service was decided");
                }
                else {
                    if(boolean0.booleanValue()) {
                        this.aJ().c.a("Upload called in the client side when service should be used");
                        goto label_42;
                    }
                    goto label_12;
                }
            }
        label_42:
        }
        finally {
            this.A = false;
            this.H();
        }
    }

    final void al(EventParcel eventParcel0, AppMetadata appMetadata0) {
        boolean z5;
        crsu crsu21;
        String s31;
        String s23;
        crdm crdm1;
        long v25;
        String s22;
        long v24;
        String s17;
        crkt crkt1;
        crdn crdn1;
        AppMetadata appMetadata1;
        long v11;
        crqv crqv1;
        long v9;
        String s4;
        String s5;
        int v7;
        int v6;
        Parcelable[] arr_parcelable1;
        Iterator iterator2;
        batl.s(appMetadata0);
        String s = appMetadata0.a;
        batl.q(s);
        long v = System.nanoTime();
        this.E();
        this.G();
        this.z();
        if(crqt.J(appMetadata0)) {
            if(!appMetadata0.h) {
                this.j(appMetadata0);
                return;
            }
            crkk crkk0 = this.v();
            String s1 = eventParcel0.a;
            if(!crkk0.p(s, s1)) {
                goto label_28;
            }
            this.aJ().f.c("Dropping blocked event. appId", crji.a(s), this.s().c(s1));
            if(this.v().j(s) || this.v().q(s)) {
                crca crca0 = this.o().i(s);
                if(crca0 != null) {
                    long v1 = Math.max(crca0.h(), crca0.e());
                    this.av();
                    this.n();
                    if(Math.abs(System.currentTimeMillis() - v1) > ((long)(((Long)crif.M.a())))) {
                        this.aJ().j.a("Fetching config for blocked app");
                        this.J(crca0);
                        return;
                    label_28:
                        crjj crjj0 = crjj.b(eventParcel0);
                        this.A().J(crjj0, this.n().d(s));
                        int v2 = this.n().g(s, crif.Z, 10, 35);
                        Bundle bundle0 = crjj0.e;
                        Iterator iterator0 = new TreeSet(bundle0.keySet()).iterator();
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            String s2 = (String)object0;
                            if("items".equals(s2)) {
                                crqx crqx0 = this.A();
                                Parcelable[] arr_parcelable = bundle0.getParcelableArray(s2);
                                batl.s(arr_parcelable);
                                int v3 = arr_parcelable.length;
                                int v4 = 0;
                                while(v4 < v3) {
                                    Bundle bundle1 = (Bundle)arr_parcelable[v4];
                                    int v5 = 0;
                                    boolean z = false;
                                    Iterator iterator1 = new TreeSet(bundle1.keySet()).iterator();
                                    while(iterator1.hasNext()) {
                                        Object object1 = iterator1.next();
                                        String s3 = (String)object1;
                                        if(crqx.ad(s3)) {
                                            iterator2 = iterator0;
                                            if(!crqx.P(s3, crmd.d)) {
                                                ++v5;
                                                if(v5 > v2) {
                                                    arr_parcelable1 = arr_parcelable;
                                                    if(crqx0.am().t(crif.aO) && z) {
                                                        v6 = v2;
                                                        v7 = v3;
                                                    }
                                                    else {
                                                        v7 = v3;
                                                        v6 = v2;
                                                        crqx0.aJ().e.c(a.f(v2, "Param can\'t contain more than ", " item-scoped custom parameters"), crqx0.ao().d(s3), crqx0.ao().b(bundle1));
                                                    }
                                                    crqx0.N(bundle1, 28);
                                                    bundle1.remove(s3);
                                                    z = true;
                                                    goto label_74;
                                                }
                                                else {
                                                    iterator0 = iterator2;
                                                    iterator1 = iterator1;
                                                    continue;
                                                }
                                                goto label_70;
                                            }
                                        }
                                        else {
                                        label_70:
                                            iterator2 = iterator0;
                                        }
                                        v6 = v2;
                                        arr_parcelable1 = arr_parcelable;
                                        v7 = v3;
                                    label_74:
                                        iterator0 = iterator2;
                                        iterator1 = iterator1;
                                        arr_parcelable = arr_parcelable1;
                                        v3 = v7;
                                        v2 = v6;
                                    }
                                    ++v4;
                                    bundle0 = bundle0;
                                }
                            }
                        }
                        EventParcel eventParcel1 = crjj0.a();
                        if(this.aJ().j(2)) {
                            crjg crjg0 = this.aJ().k;
                            crir crir0 = this.s();
                            crmg crmg0 = crir0.d;
                            if(crmg0.a()) {
                                StringBuilder stringBuilder0 = new StringBuilder("origin=");
                                stringBuilder0.append(eventParcel1.c);
                                stringBuilder0.append(",name=");
                                stringBuilder0.append(crir0.c(eventParcel1.a));
                                stringBuilder0.append(",params=");
                                EventParams eventParams0 = eventParcel1.b;
                                if(eventParams0 == null) {
                                    s5 = null;
                                }
                                else {
                                    s5 = crmg0.a() ? crir0.b(eventParams0.a()) : eventParams0.toString();
                                }
                                stringBuilder0.append(s5);
                                s4 = stringBuilder0.toString();
                            }
                            else {
                                s4 = eventParcel1.toString();
                            }
                            crjg0.b("Logging event", s4);
                        }
                        this.c();
                        this.o().C();
                        try {
                            this.j(appMetadata0);
                            String s6 = eventParcel1.a;
                            boolean z1 = "ecommerce_purchase".equals(s6) || ("purchase".equals(s6) || "refund".equals(s6));
                            if("_iap".equals(s6)) {
                            label_114:
                                EventParams eventParams1 = eventParcel1.b;
                                String s7 = eventParams1.d("currency");
                                if(z1) {
                                    double f = eventParams1.a.getDouble("value");
                                    Double.valueOf(f).getClass();
                                    double f1 = f * 1000000.0 == 0.0 ? ((double)(((long)eventParams1.b("value")))) * 1000000.0 : f * 1000000.0;
                                    if(!(f1 <= 9223372036854776000.0) || !(f1 >= -9223372036854776000.0)) {
                                        this.aJ().f.c("Data lost. Currency value is too big. appId", crji.a(s), Double.valueOf(f1));
                                        this.o().O();
                                        return;
                                    }
                                    v9 = Math.round(f1);
                                    if("refund".equals(s6)) {
                                        v9 = -v9;
                                    }
                                }
                                else {
                                    v9 = (long)eventParams1.b("value");
                                }
                                if(!TextUtils.isEmpty(s7)) {
                                    String s8 = s7.toUpperCase(Locale.US);
                                    if(s8.matches("[A-Z]{3}")) {
                                        crqv crqv0 = this.o().s(s, "_ltv_" + s8);
                                        if(crqv0 != null && (crqv0.e instanceof Long)) {
                                            this.av();
                                            crqv1 = new crqv(s, eventParcel1.c, "_ltv_" + s8, System.currentTimeMillis(), ((long)(((long)(((Long)crqv0.e))) + v9)));
                                        }
                                        else {
                                            crdg crdg0 = this.o();
                                            int v10 = this.n().f(s, crif.S) - 1;
                                            batl.q(s);
                                            crdg0.n();
                                            crdg0.aA();
                                            try {
                                                crdg0.g().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like \'!_ltv!_%\' escape \'!\'order by set_timestamp desc limit ?,10);", new String[]{s, s, String.valueOf(v10)});
                                            }
                                            catch(SQLiteException sQLiteException0) {
                                                crdg0.aJ().c.c("Error pruning currencies. appId", crji.a(s), sQLiteException0);
                                            }
                                            this.av();
                                            crqv1 = new crqv(s, eventParcel1.c, "_ltv_" + s8, System.currentTimeMillis(), v9);
                                        }
                                        s = s;
                                        if(!this.o().Y(crqv1)) {
                                            this.aJ().c.d("Too many unique user properties are set. Ignoring user property. appId", crji.a(s), this.s().e(crqv1.c), crqv1.e);
                                            this.A().K(this.K, s, 9, null, null, 0);
                                        }
                                    }
                                }
                            }
                            else if(z1) {
                                z1 = true;
                                goto label_114;
                            }
                            String s9 = eventParcel1.a;
                            boolean z2 = crqx.ad(s9);
                            boolean z3 = "_err".equals(s9);
                            this.A();
                            EventParams eventParams2 = eventParcel1.b;
                            if(eventParams2 == null) {
                                v11 = 0L;
                            }
                            else {
                                v11 = 0L;
                                crdo crdo0 = new crdo(eventParams2);
                                while(crdo0.hasNext()) {
                                    Object object2 = eventParams2.c(crdo0.a());
                                    if((object2 instanceof Parcelable[])) {
                                        v11 += (long)((Parcelable[])object2).length;
                                    }
                                }
                            }
                            crdc crdc0 = this.o().l(this.d(), s, v11 + 1L, true, z2, false, z3, false, false, false);
                            long v12 = crdc0.b;
                            this.n();
                            long v13 = v12 - crcu.C();
                            if(Long.compare(v13, 0L) > 0) {
                                if(v13 % 1000L == 1L) {
                                    this.aJ().c.c("Data loss. Too many events logged. appId, count", crji.a(s), Long.valueOf(crdc0.b));
                                }
                                this.o().O();
                                return;
                            }
                            if(z2) {
                                long v14 = crdc0.a;
                                this.n();
                                long v15 = v14 - ((long)(((int)(((Integer)crif.n.a())))));
                                if(v15 > 0L) {
                                    if(v15 % 1000L == 1L) {
                                        this.aJ().c.c("Data loss. Too many public events logged. appId, count", crji.a(s), Long.valueOf(crdc0.a));
                                    }
                                    this.A().K(this.K, s, 16, "_ev", eventParcel1.a, 0);
                                    this.o().O();
                                    return;
                                }
                            }
                            if(z3) {
                                appMetadata1 = appMetadata0;
                                long v16 = crdc0.d - ((long)Math.max(0, Math.min(1000000, this.n().f(appMetadata1.a, crif.m))));
                                if(v16 > 0L) {
                                    if(v16 == 1L) {
                                        this.aJ().c.c("Too many error events logged. appId, count", crji.a(s), Long.valueOf(crdc0.d));
                                    }
                                    this.o().O();
                                    return;
                                }
                            }
                            else {
                                appMetadata1 = appMetadata0;
                            }
                            Bundle bundle2 = eventParams2.a();
                            crqx crqx1 = this.A();
                            String s10 = eventParcel1.c;
                            crqx1.L(bundle2, "_o", s10);
                            if(this.A().Z(s, appMetadata1.B)) {
                                Long long0 = (long)1L;
                                this.A().L(bundle2, "_dbg", long0);
                                this.A().L(bundle2, "_r", long0);
                            }
                            if("_s".equals(s9)) {
                                crqv crqv2 = this.o().s(appMetadata1.a, "_sno");
                                if(crqv2 != null) {
                                    Object object3 = crqv2.e;
                                    if((object3 instanceof Long)) {
                                        this.A().L(bundle2, "_sno", object3);
                                    }
                                }
                            }
                            if(this.n().t(crif.aI) && Objects.equals(s10, "am") && Objects.equals(s9, "_ai")) {
                                Object object4 = bundle2.get("value");
                                if((object4 instanceof String)) {
                                    try {
                                        double f2 = Double.parseDouble(((String)object4));
                                        bundle2.remove("value");
                                        bundle2.putDouble("value", f2);
                                    }
                                    catch(NumberFormatException unused_ex) {
                                    }
                                }
                            }
                            long v17 = this.o().b(s);
                            if(v17 > 0L) {
                                this.aJ().f.c("Data lost. Too many events stored on disk, deleted. appId", crji.a(s), Long.valueOf(v17));
                            }
                            crdm crdm0 = new crdm(this.i, eventParcel1.c, s, eventParcel1.a, eventParcel1.d, 0L, bundle2);
                            crkt crkt0 = this.i;
                            crdg crdg1 = this.o();
                            String s11 = crdm0.b;
                            crdn crdn0 = crdg1.o(s, s11);
                            if(crdn0 == null) {
                                crdg crdg2 = this.o();
                                batl.q(s);
                                if(crdg2.f("select count(1) from events where app_id=? and name not like \'!_%\' escape \'!\'", new String[]{s}, 0L) >= ((long)this.n().a(s)) && z2) {
                                    crjg crjg1 = this.aJ().c;
                                    Object object5 = crji.a(s);
                                    Integer integer0 = this.n().a(s);
                                    crjg1.d("Too many event names used, ignoring event. appId, name, supported count", object5, this.s().c(s11), integer0);
                                    this.A().K(this.K, s, 8, null, null, 0);
                                    return;
                                }
                                crdn1 = new crdn(s, s11, crdm0.d);
                                crkt1 = crkt0;
                            }
                            else {
                                crdm0 = new crdm(crkt0, crdm0.c, crdm0.a, s11, crdm0.d, crdn0.f, crdm0.f);
                                crkt1 = crkt0;
                                crdn1 = crdn0.c(crdm0.d);
                            }
                            this.o().Q(crdn1);
                            this.E();
                            this.G();
                            batl.s(appMetadata0);
                            batl.q(crdm0.a);
                            String s12 = appMetadata0.a;
                            batl.b(crdm0.a.equals(s12));
                            crsu crsu0 = crsu.a;
                            crst crst0 = (crst)((ProtoLiteMessage)crsu0).v_newBuilder();
                            if(!crst0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crst0).ensureMutable();
                            }
                            crsu.e(((crsu)crst0.b_message));
                            if(!crst0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crst0).ensureMutable();
                            }
                            crsu.d(((crsu)crst0.b_message));
                            if(!TextUtils.isEmpty(s12)) {
                                if(!crst0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)crst0).ensureMutable();
                                }
                                crsu crsu1 = (crsu)crst0.b_message;
                                s12.getClass();
                                crsu1.b |= 0x1000;
                                crsu1.r = s12;
                            }
                            String s13 = appMetadata0.d;
                            if(!TextUtils.isEmpty(s13)) {
                                if(!crst0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)crst0).ensureMutable();
                                }
                                crsu crsu2 = (crsu)crst0.b_message;
                                s13.getClass();
                                crsu2.b |= 0x800;
                                crsu2.q = s13;
                            }
                            String s14 = appMetadata0.c;
                            if(!TextUtils.isEmpty(s14)) {
                                if(!crst0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)crst0).ensureMutable();
                                }
                                crsu crsu3 = (crsu)crst0.b_message;
                                s14.getClass();
                                crsu3.b |= 0x2000;
                                crsu3.s = s14;
                            }
                            String s15 = appMetadata0.u;
                            if(!TextUtils.isEmpty(s15)) {
                                if(!crst0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)crst0).ensureMutable();
                                }
                                crsu crsu4 = (crsu)crst0.b_message;
                                s15.getClass();
                                crsu4.c |= 0x2000;
                                crsu4.O = s15;
                            }
                            long v18 = appMetadata0.j;
                            if(v18 != 0xFFFFFFFF80000000L) {
                                if(!crst0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)crst0).ensureMutable();
                                }
                                crsu crsu5 = (crsu)crst0.b_message;
                                crsu5.b |= 0x2000000;
                                crsu5.F = (int)v18;
                            }
                            long v19 = appMetadata0.e;
                            if(!crst0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crst0).ensureMutable();
                            }
                            crsu crsu6 = (crsu)crst0.b_message;
                            crsu crsu7 = crsu0;
                            crsu6.b |= 0x4000;
                            crsu6.t = v19;
                            String s16 = appMetadata0.b;
                            if(TextUtils.isEmpty(s16)) {
                                s17 = s15;
                            }
                            else {
                                if(!crst0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)crst0).ensureMutable();
                                }
                                crsu crsu8 = (crsu)crst0.b_message;
                                s16.getClass();
                                s17 = s15;
                                crsu8.b |= 0x400000;
                                crsu8.B = s16;
                            }
                            batl.s(s12);
                            crmb crmb0 = this.w(s12);
                            String s18 = appMetadata0.s;
                            crmb crmb1 = crmb0.j(crmb.h(s18));
                            String s19 = crmb1.m();
                            if(!crst0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crst0).ensureMutable();
                            }
                            ((crsu)crst0.b_message).c |= 0x80;
                            ((crsu)crst0.b_message).N = s19;
                            hvhs.c();
                            if(this.n().u(s12, crif.aC) && this.A().O(s12)) {
                                int v20 = appMetadata0.z;
                                if(!crst0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)crst0).ensureMutable();
                                }
                                ((crsu)crst0.b_message).c |= 0x100000;
                                ((crsu)crst0.b_message).W = v20;
                                long v21 = crmb1.o() || appMetadata0.A == 0L ? appMetadata0.A : appMetadata0.A & -2L | 0x20L;
                                if(!crst0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)crst0).ensureMutable();
                                }
                                ((crsu)crst0.b_message).c |= 0x10000;
                                ((crsu)crst0.b_message).S = v21 == 1L;
                                if(v21 != 0L) {
                                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)crse.a).v_newBuilder();
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv0 = hftp0.b_message;
                                    ((crse)hftv0).b |= 1;
                                    ((crse)hftv0).c = (v21 & 1L) != 0L;
                                    if(!hftv0.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv1 = hftp0.b_message;
                                    ((crse)hftv1).b |= 2;
                                    ((crse)hftv1).d = (v21 & 2L) != 0L;
                                    if(!hftv1.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv2 = hftp0.b_message;
                                    ((crse)hftv2).b |= 4;
                                    ((crse)hftv2).e = (v21 & 4L) != 0L;
                                    if(!hftv2.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv3 = hftp0.b_message;
                                    ((crse)hftv3).b |= 8;
                                    ((crse)hftv3).f = (v21 & 8L) != 0L;
                                    if(!hftv3.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv4 = hftp0.b_message;
                                    ((crse)hftv4).b |= 16;
                                    ((crse)hftv4).g = (v21 & 16L) != 0L;
                                    if(!hftv4.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv5 = hftp0.b_message;
                                    ((crse)hftv5).b |= 0x20;
                                    ((crse)hftv5).h = (v21 & 0x20L) != 0L;
                                    if(!hftv5.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    crse crse0 = (crse)hftp0.b_message;
                                    crse0.b |= 0x40;
                                    crse0.i = (v21 & 0x40L) != 0L;
                                    crse crse1 = (crse)hftp0.N_build();
                                    if(!crst0.b_message.isImmutable()) {
                                        ((ProtoLiteBuilder)crst0).ensureMutable();
                                    }
                                    crsu crsu9 = (crsu)crst0.b_message;
                                    crse1.getClass();
                                    crsu9.X = crse1;
                                    crsu9.c |= 0x400000;
                                }
                            }
                            long v22 = appMetadata0.f;
                            if(v22 != 0L) {
                                if(!crst0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)crst0).ensureMutable();
                                }
                                crsu crsu10 = (crsu)crst0.b_message;
                                crsu10.b |= 0x80000;
                                crsu10.y = v22;
                            }
                            long v23 = appMetadata0.q;
                            if(!crst0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crst0).ensureMutable();
                            }
                            ((crsu)crst0.b_message).c |= 16;
                            ((crsu)crst0.b_message).L = v23;
                            if(this.n().t(crif.aK)) {
                                this.n();
                                String s20 = (String)hvgb.b.mr();
                                if(!crst0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)crst0).ensureMutable();
                                }
                                v24 = v23;
                                ((crsu)crst0.b_message).c |= 0x40000000;
                                ((crsu)crst0.b_message).ad = s20;
                            }
                            else {
                                v24 = v23;
                            }
                            batl.s(s12);
                            crmb crmb2 = this.w(s12).j(crmb.h(s18));
                            if(crmb2.o() && appMetadata0.n) {
                                Pair pair0 = this.g.d(s12, crmb2);
                                if(TextUtils.isEmpty(((CharSequence)pair0.first))) {
                                    crdm1 = crdm0;
                                    s23 = s16;
                                    s22 = s13;
                                    v25 = v18;
                                }
                                else {
                                    String s21 = (String)pair0.first;
                                    if(!crst0.b_message.isImmutable()) {
                                        ((ProtoLiteBuilder)crst0).ensureMutable();
                                    }
                                    crsu crsu11 = (crsu)crst0.b_message;
                                    s21.getClass();
                                    s22 = s13;
                                    crsu11.b |= 0x10000;
                                    crsu11.v = s21;
                                    if(pair0.second != null) {
                                        boolean z4 = ((Boolean)pair0.second).booleanValue();
                                        if(!crst0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)crst0).ensureMutable();
                                        }
                                        crsu crsu12 = (crsu)crst0.b_message;
                                        crsu12.b |= 0x20000;
                                        crsu12.w = z4;
                                    }
                                    if(!crdm0.b.equals("_fx") && !((String)pair0.first).equals("00000000-0000-0000-0000-000000000000")) {
                                        crca crca1 = this.o().i(s12);
                                        if(crca1 != null && crca1.ao()) {
                                            this.ag(s12, false, null, null);
                                            Bundle bundle3 = new Bundle();
                                            Long long1 = crca1.q();
                                            if(long1 == null) {
                                                crdm1 = crdm0;
                                                s23 = s16;
                                                v25 = v18;
                                            }
                                            else {
                                                v25 = v18;
                                                crdm1 = crdm0;
                                                s23 = s16;
                                                bundle3.putLong("_pfo", Math.max(0L, long1.longValue()));
                                            }
                                            Long long2 = crca1.r();
                                            if(long2 != null) {
                                                bundle3.putLong("_uwa", long2.longValue());
                                            }
                                            bundle3.putLong("_r", 1L);
                                            this.K.a(s12, "_fx", bundle3);
                                        }
                                        else {
                                            crdm1 = crdm0;
                                            s23 = s16;
                                            v25 = v18;
                                        }
                                    }
                                    else {
                                        crdm1 = crdm0;
                                        s23 = s16;
                                        v25 = v18;
                                    }
                                }
                            }
                            else {
                                crdm1 = crdm0;
                                s23 = s16;
                                s22 = s13;
                                v25 = v18;
                            }
                            String s24 = this.r().b();
                            if(!crst0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crst0).ensureMutable();
                            }
                            crsu crsu13 = (crsu)crst0.b_message;
                            s24.getClass();
                            crsu13.b |= 0x100;
                            crsu13.n = s24;
                            String s25 = this.r().c();
                            if(!crst0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crst0).ensureMutable();
                            }
                            crsu crsu14 = (crsu)crst0.b_message;
                            s25.getClass();
                            crsu14.b |= 0x80;
                            crsu14.m = s25;
                            int v26 = (int)this.r().a();
                            if(!crst0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crst0).ensureMutable();
                            }
                            crsu crsu15 = (crsu)crst0.b_message;
                            crsu15.b |= 0x400;
                            crsu15.p = v26;
                            String s26 = this.r().d();
                            if(!crst0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crst0).ensureMutable();
                            }
                            crsu crsu16 = (crsu)crst0.b_message;
                            s26.getClass();
                            crsu16.b |= 0x200;
                            crsu16.o = s26;
                            long v27 = appMetadata0.w;
                            if(!crst0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crst0).ensureMutable();
                            }
                            ((crsu)crst0.b_message).c |= 0x8000;
                            ((crsu)crst0.b_message).R = v27;
                            if(crkt1.v()) {
                                String s27 = this.a(((crsu)crst0.b_message).r, 1000L, crmb2);
                                if(!TextUtils.isEmpty(s27)) {
                                    if(!crst0.b_message.isImmutable()) {
                                        ((ProtoLiteBuilder)crst0).ensureMutable();
                                    }
                                    crsu crsu17 = (crsu)crst0.b_message;
                                    s27.getClass();
                                    crsu17.b |= 0x80000000;
                                    crsu17.I = s27;
                                }
                            }
                            crca crca2 = this.o().i(s12);
                            if(crca2 == null) {
                                crca2 = new crca(crkt1, s12);
                                crca2.I(this.B(crmb2));
                                crca2.R(appMetadata0.k);
                                crca2.S(s23);
                                if(crmb2.o()) {
                                    crca2.aa(this.g.e(s12, appMetadata0.n));
                                }
                                crca2.W(0L);
                                crca2.X(0L);
                                crca2.V(0L);
                                crca2.K(s14);
                                crca2.L(v25);
                                crca2.J(s22);
                                crca2.T(v19);
                                crca2.O(v22);
                                crca2.Y(appMetadata0.h);
                                crca2.P(v24);
                                this.o().P(crca2);
                            }
                            if(crmb2.q() && !TextUtils.isEmpty(crca2.u())) {
                                String s28 = crca2.u();
                                batl.s(s28);
                                if(!crst0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)crst0).ensureMutable();
                                }
                                crsu crsu18 = (crsu)crst0.b_message;
                                crsu18.b |= 0x40000;
                                crsu18.x = s28;
                            }
                            if(!TextUtils.isEmpty(crca2.x())) {
                                String s29 = crca2.x();
                                batl.s(s29);
                                if(!crst0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)crst0).ensureMutable();
                                }
                                crsu crsu19 = (crsu)crst0.b_message;
                                crsu19.b |= 0x1000000;
                                crsu19.E = s29;
                            }
                            List list0 = this.o().z(s12);
                            int v28 = 0;
                            while(v28 < list0.size()) {
                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)crtg.a).v_newBuilder();
                                String s30 = ((crqv)list0.get(v28)).c;
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                crtg crtg0 = (crtg)hftp1.b_message;
                                s30.getClass();
                                crtg0.b |= 2;
                                crtg0.d = s30;
                                long v29 = ((crqv)list0.get(v28)).d;
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                crtg crtg1 = (crtg)hftp1.b_message;
                                crtg1.b |= 1;
                                crtg1.c = v29;
                                this.z().H(hftp1, ((crqv)list0.get(v28)).e);
                                if(!crst0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)crst0).ensureMutable();
                                }
                                crsu crsu20 = (crsu)crst0.b_message;
                                crtg crtg2 = (crtg)hftp1.N_build();
                                crtg2.getClass();
                                crsu20.c();
                                crsu20.f.add(crtg2);
                                if("_sid".equals(((crqv)list0.get(v28)).c) && crca2.n() != 0L) {
                                    s31 = s17;
                                    if(this.z().c(s31) == crca2.n()) {
                                        crsu21 = crsu7;
                                    }
                                    else {
                                        if(!crst0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)crst0).ensureMutable();
                                        }
                                        ((crsu)crst0.b_message).c &= 0xFFFFDFFF;
                                        crsu21 = crsu7;
                                        ((crsu)crst0.b_message).O = crsu21.O;
                                    }
                                }
                                else {
                                    crsu21 = crsu7;
                                    s31 = s17;
                                }
                                ++v28;
                                s17 = s31;
                                crsu7 = crsu21;
                            }
                            try {
                                crdg crdg3 = this.o();
                                crsu crsu22 = (crsu)((ProtoLiteBuilder)crst0).N_build();
                                crdg3.n();
                                crdg3.aA();
                                batl.s(crsu22);
                                batl.q(crsu22.r);
                                byte[] arr_b = crsu22.toBytesArray();
                                long v30 = crdg3.aw().d(arr_b);
                                ContentValues contentValues0 = new ContentValues();
                                contentValues0.put("app_id", crsu22.r);
                                contentValues0.put("metadata_fingerprint", Long.valueOf(v30));
                                contentValues0.put("metadata", arr_b);
                                try {
                                    crdg3.g().insertWithOnConflict("raw_events_metadata", null, contentValues0, 4);
                                }
                                catch(SQLiteException sQLiteException1) {
                                    crdg3.aJ().c.c("Error storing raw event metadata. appId", crji.a(crsu22.r), sQLiteException1);
                                    throw sQLiteException1;
                                }
                            }
                            catch(IOException iOException0) {
                                this.aJ().c.c("Data loss. Failed to insert raw event metadata. appId", crji.a(((crsu)crst0.b_message).r), iOException0);
                                goto label_598;
                            }
                            crdg crdg4 = this.o();
                            crdo crdo1 = new crdo(crdm1.f);
                            while(crdo1.hasNext()) {
                                if(!"_r".equals(crdo1.a())) {
                                    continue;
                                }
                                z5 = true;
                                goto label_596;
                            }
                            z5 = this.v().o(crdm1.a, crdm1.b) && this.o().aa(this.d(), crdm1.a, false, false, false, false).e < ((long)this.n().e(crdm1.a));
                        label_596:
                            if(crdg4.V(crdm1, v30, z5)) {
                                this.k = 0L;
                            }
                        label_598:
                            this.o().O();
                        }
                        finally {
                            this.o().J();
                        }
                        this.ae();
                        this.aJ().k.b("Background event processing time, ms", Long.valueOf((System.nanoTime() - v + 500000L) / 1000000L));
                    }
                }
            }
            else if(!"_err".equals(s1)) {
                this.A().K(this.K, s, 11, "_ev", s1, 0);
            }
        }
    }

    final boolean am(long v) {
        return this.aC(null, v);
    }

    final boolean an(String s) {
        return this.aC(s, 0L);
    }

    final boolean ao(String s, String s1) {
        crca crca0 = this.o().i(s);
        if(crca0 != null && this.A().Z(s, crca0.C())) {
            this.s.remove(s1);
            return true;
        }
        crqp crqp0 = (crqp)this.s.get(s1);
        if(crqp0 == null) {
            return true;
        }
        crqp0.a.av();
        return System.currentTimeMillis() >= crqp0.c;
    }

    final boolean ap() {
        this.E();
        if(this.B != null && this.B.isValid()) {
            this.aJ().k.a("Storage concurrent access okay");
            return true;
        }
        File file0 = new File(ccsb.a.b(this.e().getFilesDir(), "google_app_measurement.db"));
        try {
            FileChannel fileChannel0 = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new RandomAccessFile(file0, "rw").getChannel());
            this.C = fileChannel0;
            FileLock fileLock0 = fileChannel0.tryLock();
            this.B = fileLock0;
            if(fileLock0 != null) {
                this.aJ().k.a("Storage concurrent access okay");
                return true;
            }
            this.aJ().c.a("Storage concurrent data access panic");
        }
        catch(FileNotFoundException fileNotFoundException0) {
            this.aJ().c.b("Failed to acquire storage lock", fileNotFoundException0);
        }
        catch(IOException iOException0) {
            this.aJ().c.b("Failed to access storage lock file", iOException0);
        }
        catch(OverlappingFileLockException overlappingFileLockException0) {
            this.aJ().f.b("Storage lock already acquired", overlappingFileLockException0);
        }
        return false;
    }

    public static final void aq(crqc crqc0) {
        if(crqc0 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if(crqc0.aC()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + crqc0.getClass());
    }

    static final void ar(crst crst0, crmb crmb0) {
        if(!crmb0.o()) {
            if(!crst0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)crst0).ensureMutable();
            }
            crsu crsu0 = (crsu)crst0.b_message;
            crsu0.b &= 0xFFFEFFFF;
            crsu crsu1 = crsu.a;
            crsu0.v = crsu1.v;
            if(!crst0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)crst0).ensureMutable();
            }
            crsu crsu2 = (crsu)crst0.b_message;
            crsu2.b &= 0xFFFDFFFF;
            crsu2.w = false;
            if(!crst0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)crst0).ensureMutable();
            }
            crsu crsu3 = (crsu)crst0.b_message;
            crsu3.b &= 0x7FFFFFFF;
            crsu3.I = crsu1.I;
        }
        if(!crmb0.q()) {
            if(!crst0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)crst0).ensureMutable();
            }
            crsu crsu4 = (crsu)crst0.b_message;
            crsu4.b &= 0xFFFBFFFF;
            crsu crsu5 = crsu.a;
            crsu4.x = crsu5.x;
            if(!crst0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)crst0).ensureMutable();
            }
            ((crsu)crst0.b_message).c &= 0xFFFFDFFF;
            ((crsu)crst0.b_message).O = crsu5.O;
        }
    }

    static final void as(crsn crsn0, int v, String s) {
        List list0 = DesugarCollections.unmodifiableList(((crso)crsn0.b_message).c);
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            if("_err".equals(((crsq)list0.get(v1)).c)) {
                return;
            }
        }
        crsq crsq0 = crsq.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)crsq0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        crsq crsq1 = (crsq)hftp0.b_message;
        crsq1.b |= 1;
        crsq1.c = "_err";
        Long.valueOf(v).getClass();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        crsq crsq2 = (crsq)hftp0.b_message;
        crsq2.b |= 4;
        crsq2.e = (long)v;
        crsq crsq3 = (crsq)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)crsq0).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        crsq crsq4 = (crsq)hftp1.b_message;
        crsq4.b |= 1;
        crsq4.c = "_ev";
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        crsq crsq5 = (crsq)hftp1.b_message;
        crsq5.b |= 2;
        crsq5.d = s;
        crsq crsq6 = (crsq)hftp1.N_build();
        crsn0.k(crsq3);
        crsn0.k(crsq6);
    }

    static final void at(crsn crsn0) {
        if("_f".equals(((crso)crsn0.b_message).d) || "_v".equals(((crso)crsn0.b_message).d)) {
            for(int v = 0; v < ((crso)crsn0.b_message).c.size(); ++v) {
                crsq crsq0 = crsn0.a(v);
                if("_elt".equals(crsq0.c)) {
                    long v1 = crsq0.e;
                    if(!crsn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crsn0).ensureMutable();
                    }
                    crso crso0 = (crso)crsn0.b_message;
                    crso0.b |= 16;
                    crso0.h = v1;
                    crsn0.l(v);
                    return;
                }
            }
        }
    }

    static final void au(crsn crsn0, String s) {
        List list0 = DesugarCollections.unmodifiableList(((crso)crsn0.b_message).c);
        for(int v = 0; v < list0.size(); ++v) {
            if(s.equals(((crsq)list0.get(v)).c)) {
                crsn0.l(v);
                return;
            }
        }
    }

    public final void av() {
        batl.s(this.i);
    }

    final void aw(String s, ProtoLiteBuilder hftp0, Bundle bundle0, String s1) {
        List list0 = bbnh.a(new String[]{"_o", "_sn", "_sc", "_si"});
        int v = crqx.ac(((crsq)hftp0.b_message).c) || crqx.ac(s) ? this.n().c(s1, true) : this.n().b(s1, true);
        long v1 = (long)((crsq)hftp0.b_message).d.codePointCount(0, ((crsq)hftp0.b_message).d.length());
        crqx crqx0 = this.A();
        String s2 = ((crsq)hftp0.b_message).c;
        this.n();
        String s3 = crqx0.B(s2, 40, true);
        if(v1 > ((long)v) && !list0.contains(((crsq)hftp0.b_message).c)) {
            if("_ev".equals(((crsq)hftp0.b_message).c)) {
                bundle0.putString("_ev", this.A().B(((crsq)hftp0.b_message).d, this.n().c(s1, true), true));
                return;
            }
            this.aJ().h.c("Param value is too long; discarded. Name, value length", s3, Long.valueOf(v1));
            if(bundle0.getLong("_err") == 0L) {
                bundle0.putLong("_err", 4L);
                if(bundle0.getString("_ev") == null) {
                    bundle0.putString("_ev", s3);
                    bundle0.putLong("_el", v1);
                }
            }
            bundle0.remove(((crsq)hftp0.b_message).c);
        }
    }

    private final crdj ax() {
        if(this.J == null) {
            this.J = new crqi(this, this.i);
        }
        return this.J;
    }

    private final Boolean ay(crca crca0) {
        try {
            if(Long.compare(crca0.c(), 0xFFFFFFFF80000000L) != 0) {
                String s = crca0.t();
                int v = bbsr.b(this.e()).e(s, 0).versionCode;
                return crca0.c() == ((long)v) ? Boolean.valueOf(true) : Boolean.valueOf(false);
            }
            String s1 = crca0.t();
            String s2 = bbsr.b(this.e()).e(s1, 0).versionName;
            String s3 = crca0.w();
            if(s3 == null || !s3.equals(s2)) {
                return Boolean.valueOf(false);
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
        return Boolean.valueOf(true);
    }

    private final Map az(crso crso0) {
        Map map0 = new HashMap();
        this.z();
        HashMap hashMap0 = new HashMap();
        for(Object object0: crso0.c) {
            crsq crsq0 = (crsq)object0;
            if(crsq0.c.startsWith("gad_")) {
                Object object1 = crqt.G(crsq0);
                if(object1 != null) {
                    hashMap0.put(crsq0.c, object1);
                }
            }
        }
        for(Object object2: hashMap0.entrySet()) {
            map0.put(((String)((Map.Entry)object2).getKey()), String.valueOf(((Map.Entry)object2).getValue()));
        }
        return map0;
    }

    private final int b(String s, crcz crcz0) {
        crkk crkk0 = this.a;
        if(crkk0.c(s) == null) {
            crcz0.b(crma.d, crcy.j);
            return 1;
        }
        crca crca0 = this.o().i(s);
        if(crca0 != null && crbx.a(crca0.A()).a == crly.b) {
            crma crma0 = crma.d;
            crly crly0 = crkk0.b(s, crma0);
            if(crly0 != crly.a) {
                crcz0.b(crma0, crcy.i);
                return crly0 == crly.d ? 0 : 1;
            }
        }
        crcz0.b(crma.d, crcy.b);
        return crkk0.k(s, crma.d) ? 0 : 1;
    }

    public void c() {
    }

    final long d() {
        this.av();
        long v = System.currentTimeMillis();
        crpb crpb0 = this.g;
        crpb0.aA();
        crpb0.n();
        crju crju0 = crpb0.f;
        long v1 = crju0.a();
        if(v1 == 0L) {
            v1 = ((long)crpb0.aq().E().nextInt(86400000)) + 1L;
            crju0.b(v1);
        }
        return (v + v1) / 1000L / 60L / 60L / 24L;
    }

    public final Context e() {
        return this.i.a;
    }

    final Bundle g(String s) {
        this.E();
        this.G();
        if(this.v().c(s) == null) {
            return null;
        }
        Bundle bundle0 = new Bundle();
        crmb crmb0 = this.w(s);
        Bundle bundle1 = new Bundle();
        for(Object object0: crmb0.b.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s1 = crmb.l(((crly)map$Entry0.getValue()));
            if(s1 != null) {
                bundle1.putString(((crma)map$Entry0.getKey()).e, s1);
            }
        }
        bundle0.putAll(bundle1);
        crdk crdk0 = this.p(s, this.q(s), crmb0, new crcz());
        Bundle bundle2 = new Bundle();
        for(Object object1: crdk0.f.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object1;
            String s2 = crmb.l(((crly)map$Entry1.getValue()));
            if(s2 != null) {
                bundle2.putString(((crma)map$Entry1.getKey()).e, s2);
            }
        }
        Boolean boolean0 = crdk0.d;
        if(boolean0 != null) {
            bundle2.putString("is_dma_region", boolean0.toString());
        }
        String s3 = crdk0.e;
        if(s3 != null) {
            bundle2.putString("cps_display_str", s3);
        }
        bundle0.putAll(bundle2);
        crqv crqv0 = this.o().s(s, "_npa");
        boolean z = crqv0 == null ? this.b(s, new crcz()) : crqv0.e.equals(Long.valueOf(1L));
        bundle0.putString("ad_personalization", (z ? "denied" : "granted"));
        return bundle0;
    }

    final Bundle i(String s, EventParcel eventParcel0) {
        Bundle bundle0 = new Bundle();
        bundle0.putLong("_sid", eventParcel0.b.b("_sid").longValue());
        crqv crqv0 = this.o().s(s, "_sno");
        if(crqv0 != null) {
            Object object0 = crqv0.e;
            if((object0 instanceof Long)) {
                bundle0.putLong("_sno", ((Long)object0).longValue());
            }
        }
        return bundle0;
    }

    final crca j(AppMetadata appMetadata0) {
        boolean z3;
        this.E();
        this.G();
        batl.s(appMetadata0);
        String s = appMetadata0.a;
        batl.q(s);
        String s1 = appMetadata0.t;
        if(!s1.isEmpty()) {
            crqo crqo0 = new crqo(this, s1);
            this.G.put(s, crqo0);
        }
        crca crca0 = this.o().i(s);
        crmb crmb0 = this.w(s).j(crmb.h(appMetadata0.s));
        String s2 = crmb0.o() ? this.g.e(s, appMetadata0.n) : "";
        boolean z = true;
        boolean z1 = false;
        if(crca0 == null) {
            crca0 = new crca(this.i, s);
            if(crmb0.q()) {
                crca0.I(this.B(crmb0));
            }
            if(crmb0.o()) {
                crca0.aa(s2);
            }
        }
        else if(crmb0.o() && s2 != null && !s2.equals(crca0.z())) {
            boolean z2 = TextUtils.isEmpty(crca0.z());
            crca0.aa(s2);
            if(appMetadata0.n && !"00000000-0000-0000-0000-000000000000".equals(this.g.d(s, crmb0).first) && !z2) {
                if(crmb0.q()) {
                    crca0.I(this.B(crmb0));
                    z3 = false;
                }
                else {
                    z3 = true;
                }
                if(this.o().s(s, "_id") != null && this.o().s(s, "_lair") == null) {
                    this.av();
                    this.o().Y(new crqv(s, "auto", "_lair", System.currentTimeMillis(), ((long)1L)));
                }
                z1 = z3;
            }
            else if(TextUtils.isEmpty(crca0.u()) && crmb0.q()) {
                crca0.I(this.B(crmb0));
            }
        }
        else if(TextUtils.isEmpty(crca0.u()) && crmb0.q()) {
            crca0.I(this.B(crmb0));
        }
        crca0.S(appMetadata0.b);
        String s3 = appMetadata0.k;
        if(!TextUtils.isEmpty(s3)) {
            crca0.R(s3);
        }
        long v = appMetadata0.e;
        if(v != 0L) {
            crca0.T(v);
        }
        String s4 = appMetadata0.c;
        if(!TextUtils.isEmpty(s4)) {
            crca0.K(s4);
        }
        crca0.L(appMetadata0.j);
        String s5 = appMetadata0.d;
        if(s5 != null) {
            crca0.J(s5);
        }
        crca0.O(appMetadata0.f);
        crca0.Y(appMetadata0.h);
        String s6 = appMetadata0.g;
        if(!TextUtils.isEmpty(s6)) {
            crca0.U(s6);
        }
        crca0.H(appMetadata0.n);
        crca0.Z(appMetadata0.p);
        crca0.P(appMetadata0.q);
        crca0.ac(appMetadata0.u);
        crca0.af(appMetadata0.v);
        crca0.ae(appMetadata0.B);
        hvhs.c();
        if(this.n().t(crif.aC)) {
            crca0.G(appMetadata0.z);
        }
        crca0.ag(appMetadata0.w);
        crca0.ab(appMetadata0.C);
        crca0.M(appMetadata0.E);
        if(crca0.am()) {
            z = z1;
        }
        else if(!z1) {
            return crca0;
        }
        this.o().ah(crca0, z);
        return crca0;
    }

    public final AppMetadata k(String s) {
        crca crca0 = this.o().i(s);
        if(crca0 != null && !TextUtils.isEmpty(crca0.w())) {
            Boolean boolean0 = this.ay(crca0);
            if(boolean0 != null && !boolean0.booleanValue()) {
                this.aJ().c.b("App version does not match; dropping. appId", crji.a(s));
                return null;
            }
            return new AppMetadata(s, crca0.y(), crca0.w(), crca0.c(), crca0.v(), crca0.i(), crca0.f(), null, crca0.al(), false, crca0.x(), 0L, 0, crca0.ak(), false, crca0.p(), crca0.g(), crca0.D(), this.w(s).n(), "", null, crca0.an(), crca0.o(), this.w(s).c, this.q(s).c, crca0.a(), crca0.d(), crca0.C(), crca0.A(), 0L, crca0.b());
        }
        this.aJ().j.b("No app data available; dropping", s);
        return null;
    }

    public final crcm l() {
        crcm crcm0 = this.e;
        crqq.aq(crcm0);
        return crcm0;
    }

    public final crcn m() {
        return this.i.c;
    }

    public final crcu n() {
        batl.s(this.i);
        return this.i.d;
    }

    public final crdg o() {
        crdg crdg0 = this.b;
        crqq.aq(crdg0);
        return crdg0;
    }

    final crdk p(String s, crdk crdk0, crmb crmb0, crcz crcz0) {
        int v;
        boolean z = false;
        Boolean boolean0 = Boolean.valueOf(false);
        Boolean boolean1 = Boolean.valueOf(true);
        if(this.v().c(s) == null) {
            if(crdk0.c() == crly.c) {
                crcz0.a(crma.c, crdk0.b);
                return new crdk(boolean0, crdk0.b, boolean1, "-");
            }
            crcz0.b(crma.c, crcy.j);
            return new crdk(boolean0, 90, boolean1, "-");
        }
        crly crly0 = crdk0.c();
        crly crly1 = crly.d;
        if(crly0 == crly1) {
            v = crdk0.b;
            crcz0.a(crma.c, v);
        }
        else {
            crly crly2 = crly.c;
            if(crly0 == crly2) {
                v = crdk0.b;
                crcz0.a(crma.c, v);
            }
            else {
                if(crly0 == crly.b) {
                    crma crma0 = crma.c;
                    crly crly3 = this.a.b(s, crma0);
                    if(crly3 != crly.a) {
                        crcz0.b(crma0, crcy.i);
                        crly0 = crly3;
                        goto label_45;
                    }
                    goto label_21;
                }
                else {
                label_21:
                    crkk crkk0 = this.a;
                    crma crma1 = crma.c;
                    crkk0.n();
                    crkk0.h(s);
                    crrv crrv0 = crkk0.c(s);
                    crma crma2 = null;
                    if(crrv0 != null) {
                        for(Object object0: crrv0.d) {
                            crrp crrp0 = (crrp)object0;
                            if(crma1 == crkk.u((crrt.a(crrp0.b) == 0 ? 1 : crrt.a(crrp0.b)))) {
                                crma2 = crkk.u((crrt.a(crrp0.c) == 0 ? 1 : crrt.a(crrp0.c)));
                                break;
                            }
                        }
                    }
                    crly crly4 = crmb0.c();
                    if(crly4 == crly1 || crly4 == crly2) {
                        z = true;
                    }
                    if(crma2 == crma.a && z) {
                        crcz0.b(crma1, crcy.c);
                        crly0 = crly4;
                    }
                    else {
                        crcz0.b(crma1, crcy.b);
                        crly0 = crkk0.k(s, crma1) ? crly1 : crly2;
                    }
                }
            label_45:
                v = 90;
            }
        }
        boolean z1 = this.a.l(s);
        crkk crkk1 = this.v();
        crkk1.n();
        crkk1.h(s);
        TreeSet treeSet0 = new TreeSet();
        crrv crrv1 = crkk1.c(s);
        if(crrv1 != null) {
            for(Object object1: crrv1.e) {
                treeSet0.add(((crru)object1).b);
            }
        }
        return crly0 == crly.c || treeSet0.isEmpty() ? new crdk(boolean0, v, Boolean.valueOf(z1), "-") : new crdk(boolean1, v, Boolean.valueOf(z1), (z1 ? TextUtils.join("", treeSet0) : ""));
    }

    final crdk q(String s) {
        this.E();
        this.G();
        Map map0 = this.F;
        crdk crdk0 = (crdk)map0.get(s);
        if(crdk0 == null) {
            crdg crdg0 = this.o();
            batl.s(s);
            crdg0.n();
            crdg0.aA();
            crdk crdk1 = crdk.b(crdg0.ag("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{s}));
            map0.put(s, crdk1);
            return crdk1;
        }
        return crdk0;
    }

    public final crdl r() {
        return this.i.c();
    }

    public final crir s() {
        return this.i.i;
    }

    public final crjn t() {
        crqq.aq(this.w);
        return this.w;
    }

    public final crjp u() {
        crjp crjp0 = this.c;
        if(crjp0 != null) {
            return crjp0;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final crkk v() {
        crqq.aq(this.a);
        return this.a;
    }

    final crmb w(String s) {
        this.E();
        this.G();
        crmb crmb0 = (crmb)this.E.get(s);
        if(crmb0 == null) {
            crmb0 = this.o().q(s);
            if(crmb0 == null) {
                crmb0 = crmb.a;
            }
            this.af(s, crmb0);
        }
        return crmb0;
    }

    public final crpx x() {
        crpx crpx0 = this.d;
        crqq.aq(crpx0);
        return crpx0;
    }

    public static crqq y(Context context0) {
        batl.s(context0.getApplicationContext());
        if(crqq.v == null) {
            synchronized(crqq.class) {
                if(crqq.v == null) {
                    crqr crqr0 = null;
                    boolean z = false;
                    if(crcn.a(context0)) {
                        try {
                            crqr0 = (crqr)ModuleUploadFactory.class.asSubclass(crqr.class).getConstructor(Context.class).newInstance(context0);
                        }
                        catch(ClassNotFoundException unused_ex) {
                            z = true;
                        }
                        catch(IllegalAccessException illegalAccessException0) {
                            throw new IllegalStateException(illegalAccessException0);
                        }
                        catch(InstantiationException instantiationException0) {
                            throw new IllegalStateException(instantiationException0);
                        }
                        catch(NoSuchMethodException noSuchMethodException0) {
                            throw new IllegalStateException(noSuchMethodException0);
                        }
                        catch(InvocationTargetException invocationTargetException0) {
                            throw new IllegalStateException(invocationTargetException0);
                        }
                    }
                    if(!crcn.a(context0) || z) {
                        crqr0 = new crqr(context0);
                    }
                    batl.s(crqr0);
                    crqq.v = crqr0.e();
                }
            }
            return crqq.v;
        }
        return crqq.v;
    }

    public final crqt z() {
        crqq.aq(this.x);
        return this.x;
    }
}


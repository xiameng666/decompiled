import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wearable.node.accountmatching.ui.AccountMatchingChimeraActivity;
import j..util.DesugarCollections;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import j..util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import jeb.synthetic.TWR;

public final class fdzv implements ffmj {
    public final List A;
    private final Context B;
    private final Context C;
    private final boolean D;
    private final fdzu E;
    private fdvv F;
    private final ffds G;
    private final ffmp H;
    private final Map I;
    private final Set J;
    private final ffml K;
    private String L;
    private final fdye M;
    public final String a;
    public final fdws b;
    public final boolean c;
    final Collection d;
    final esaa e;
    public final Lock f;
    public final Collection g;
    public final ArrayList h;
    public final SharedPreferences i;
    public fduk j;
    final Deque k;
    final ayux l;
    final ayux m;
    final ayux n;
    final ayux o;
    final ayux p;
    final ayux q;
    final ayux r;
    public final ayux s;
    public final ayux t;
    public final AtomicReference u;
    public final AtomicReference v;
    public final fczt w;
    public String x;
    public final AtomicBoolean y;
    public final AtomicInteger z;

    public fdzv(Context context0, String s, fdye fdye0, fdws fdws0, ffds ffds0, ffmp ffmp0, boolean z, SharedPreferences sharedPreferences0, ffml ffml0) {
        this.d = new ConcurrentLinkedQueue();
        this.f = new ReentrantLock();
        this.g = new ConcurrentLinkedQueue();
        this.h = new ArrayList();
        this.j = null;
        this.F = null;
        this.k = new ConcurrentLinkedDeque();
        this.u = new AtomicReference();
        this.v = new AtomicReference();
        this.I = new ConcurrentHashMap();
        this.J = new HashSet();
        this.x = null;
        this.y = new AtomicBoolean(false);
        this.z = new AtomicInteger(0);
        this.L = null;
        this.A = DesugarCollections.synchronizedList(new ArrayList());
        this.D = hzyg.e();
        this.B = context0;
        this.C = context0 == null ? null : context0.getApplicationContext();
        this.a = s;
        this.M = fdye0;
        this.b = fdws0;
        this.G = ffds0;
        this.H = ffmp0;
        this.c = z;
        this.i = sharedPreferences0;
        this.w = fczt.a();
        this.K = ffml0;
        this.e = iaah.a.c().b() ? new esaa(context0, 1, "Wear_Transport", "readerWakeLock", "com.google.android.gms") : null;
        HandlerThread handlerThread0 = new HandlerThread("WearableTransport.WriteWatchdogHandler", 9);
        handlerThread0.start();
        this.E = new fdzu(this, handlerThread0.getLooper());
        fdob fdob0 = fdob.b();
        this.l = fdob0.a(fdnx.a);
        this.m = fdob0.a(fdnx.b);
        this.n = fdob0.a(fdnx.c);
        this.o = fdob0.a(fdnx.d);
        this.p = fdob0.a(fdnx.e);
        this.q = fdob0.a(fdnx.f);
        this.r = fdob0.a(fdnx.g);
        this.s = fdob0.a(fdnx.h);
        this.t = fdob0.a(fdnx.i);
        fdws0.b = new fdzl(fdws0);
    }

    private final void A(String s, boolean z) {
        Set set0 = this.J;
        if(!set0.contains(s)) {
            ffmn.a("Wear_Transport", "Not reconnecting data plane writers for node %s, they are already connected", new Object[]{s});
            return;
        }
        ffmn.a("Wear_Transport", "Reconnecting data plane writers for node %s", new Object[]{s});
        fdzb fdzb0 = (fdzb)this.I.get(s);
        if(fdzb0 == null) {
            return;
        }
        ffmn.a("Wear_Transport", "Got writer %s for node %s", new Object[]{fdzb0, fdzb0.a});
        fczq fczq0 = this.b(s);
        if(fczq0 == null) {
            ffmn.b("Wear_Transport", "While trying to reconnect DataPlaneWriters, we could not find the ConnectionConfig in the config store for nodeId: %s", new Object[]{s});
            return;
        }
        ArrayList arrayList0 = this.h;
        fdww fdww0 = fdzv.o(fczq0);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            fdwx fdwx0 = (fdwx)arrayList0.get(v1);
            if(!fdwx0.j()) {
                if(!this.c && (fdwx0 instanceof fdvv) && z) {
                    ffmn.a("Wear_Transport", "Not adding writer to %s as it is a DataTransportManager with the transport in enable on receive mode", new Object[]{fdwx0});
                }
                else {
                    ffmn.a("Wear_Transport", "Connecting writer %s to transport %s", new Object[]{fdzb0, fdwx0});
                    fdwx0.h(fdzb0, fdww0);
                }
            }
        }
        set0.remove(s);
    }

    private final void B() {
        ffds ffds0 = this.G;
        fczq fczq0 = ffds0.d(null);
        if(fczq0 != null && fczq0.d == 2) {
            Log.i("Wear_Transport", "removing legacy emulator config.");
            ffds0.a(fczq0.b);
        }
    }

    private final void C(String s) {
        this.I.remove(s);
    }

    private final void D(fdzb fdzb0) {
        String s = fdzb0.a.a;
        ffmn.d("Wear_Transport", "removeWriterFromTransports %s", new Object[]{s});
        this.f.lock();
        try {
            for(Object object0: this.h) {
                ((fdwx)object0).i(s);
            }
        }
        finally {
            this.f.unlock();
        }
    }

    private final boolean E(fdzb fdzb0) {
        if(this.c) {
            return false;
        }
        if(this.F == null) {
            ffmn.f("Wear_Transport", "DataTransportManager is missing, cannot add writer to it", new Object[0]);
            return false;
        }
        ffmn.a("Wear_Transport", "Adding messageTransport with data transport initially disabled", new Object[0]);
        fdvv fdvv0 = this.F;
        fdwv fdwv0 = fdww.a();
        fdwv0.b(fdwu.c);
        fdvv0.h(fdzb0, fdwv0.a());
        return true;
    }

    private static final void F(Semaphore semaphore0) {
        ffmn.a("Wear_Transport", "blocking until network processing loop finishes...", new Object[0]);
        try {
            semaphore0.acquire();
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
            Log.i("Wear_Transport", "Interrupt signal received; shutting down reader/writer threads");
        }
    }

    public final int a(fczq fczq0, boolean z) {
        if(!fczq0.n) {
            Log.w("Wear_Transport", "Received cancelMigration request for a non-migrating config " + fczq0);
            return 10;
        }
        if(!this.y.get()) {
            Log.e("Wear_Transport", "No migration is active - cannot cancel.");
            return 0xFAD;
        }
        String s = this.x;
        if(s != null) {
            String s1 = fczq0.c;
            if(s1 == null) {
                fczq0 = new fczp(fczq0).a();
                fczq0.d(this.x);
            }
            else if(!gfqz.e(s, s1)) {
                ffmn.f("Wear_Transport", "Received request to cancel migration for %s which does not match existing migration address %s", new Object[]{fczq0.c, this.x});
                return 0xFAD;
            }
        }
        AtomicInteger atomicInteger0 = this.z;
        if(atomicInteger0.compareAndSet(1, 3)) {
            fczq0.j = this.L;
            this.f(fczq0, z);
            if(Log.isLoggable("Wear_Transport", 3)) {
                Log.d("Wear_Transport", "Removing connection and bond for config: " + fczq0);
            }
            ((felm)this.v.get()).l(fczq0, null);
            ((felm)this.v.get()).i(fczq0.c);
            this.w.b(-9, fczq0.c);
            return 0;
        }
        Log.w("Wear_Transport", "Received request to cancel migration, but migration is not cancellable because status status is " + atomicInteger0.get());
        return 0xFAC;
    }

    public final fczq b(String s) {
        for(Object object0: this.G.h()) {
            fczq fczq0 = (fczq)object0;
            if(hzya.e()) {
                if(!s.equals(fczq0.j) || fczq0.g()) {
                    continue;
                }
                return fczq0;
            }
            if(s.equals(fczq0.j)) {
                return fczq0;
            }
        }
        return null;
    }

    public final fduk c() {
        if(this.j == null) {
            if(Log.isLoggable("Wear_Transport", 4)) {
                Log.i("Wear_Transport", "Creating control plane transport and adding writers");
            }
            fduk fduk0 = new fduk(this, this.c, this.M);
            for(Object object0: this.d) {
                fdzb fdzb0 = (fdzb)object0;
                ffmn.a("Wear_Transport", "Attaching message writer to ControlPlaneTransport for node: %s", new Object[]{fdzb0.a});
                String s = fdzb0.a.a;
                fczq fczq0 = this.b(s);
                if(fczq0 == null) {
                    ffmn.f("Wear_Transport", "Could not find a config for nodeid %s, attaching a writer with a generic messageWriterConfig", new Object[]{s});
                    fduk0.h(fdzb0, fdww.b());
                }
                else {
                    fduk0.h(fdzb0, fdzv.o(fczq0));
                }
            }
            this.g(fduk0);
        }
        return this.j;
    }

    final feyl d(fdzx fdzx0, fczq fczq0, fdpd fdpd0) {
        Set set1;
        ffau ffau2;
        String s = ((fdsh)this.u.get()).b();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffau.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)feyl.a).v_newBuilder();
        fdye fdye0 = this.M;
        String s1 = fdye0.a().a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        feyl feyl0 = (feyl)hftp1.b_message;
        s1.getClass();
        feyl0.b |= 1;
        feyl0.c = s1;
        String s2 = fdye0.a().b;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        feyl feyl1 = (feyl)hftp1.b_message;
        s2.getClass();
        feyl1.b |= 2;
        feyl1.d = s2;
        long v = (long)(((Long)bbmq.c.i()));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((feyl)hftv0).b |= 4;
        ((feyl)hftv0).e = v;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((feyl)hftv1).b |= 8;
        ((feyl)hftv1).f = 1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        feyl feyl2 = (feyl)hftp1.b_message;
        feyl2.b |= 16;
        feyl2.g = 0;
        if(hzvy.e()) {
            int v1 = Build.VERSION.SDK_INT;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            feyl feyl3 = (feyl)hftp1.b_message;
            feyl3.b |= 0x400;
            feyl3.m = v1;
        }
        if(s != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            feyl feyl4 = (feyl)hftp1.b_message;
            feyl4.b |= 0x40;
            feyl4.i = s;
        }
        if(fczq0.n) {
            this.w.b(1, fczq0.c);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            feyl feyl5 = (feyl)hftp1.b_message;
            feyl5.b |= 0x100;
            feyl5.k = true;
            if(this.c) {
                String s3 = ffem.c(this.i);
                ffmn.d("Wear_Transport", "Migrating from previous phone: %s", new Object[]{s3});
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                feyl feyl6 = (feyl)hftp1.b_message;
                s3.getClass();
                feyl6.b |= 0x200;
                feyl6.l = s3;
            }
        }
        if(fczq0.d == 2 && fczq0.e == 1) {
            String s4 = ffei.d().f();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            feyl feyl7 = (feyl)hftp1.b_message;
            s4.getClass();
            feyl7.b |= 0x80;
            feyl7.j = s4;
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        feyl feyl8 = (feyl)hftp1.b_message;
        feyl8.b |= 0x20;
        feyl8.h = 3;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffau ffau0 = (ffau)hftp0.b_message;
        feyl feyl9 = (feyl)hftp1.N_build();
        feyl9.getClass();
        ffau0.f = feyl9;
        ffau0.b |= 8;
        ffau ffau1 = (ffau)hftp0.N_build();
        ffav ffav0 = feaa.e(ffau1);
        try {
            feaa.i(fdzx0, ffav0, feaa.b(ffau1), fdpd0);
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ffav.a).v_newBuilder();
            feaa.k(fdzx0, hftp2, fdpd0);
            ffau2 = feaa.c(((ffav)hftp2.N_build()));
        }
        catch(IOException iOException0) {
            ffmn.g("Wear_Transport", iOException0, "error while connecting to peer: no connect received before IOException", new Object[0]);
            if(fczq0.n && this.z.get() != 3) {
                this.w.b(-4, fczq0.c);
            }
            fdob.k(7);
            fdob.g(7, this.c, fczq0.h());
            return null;
        }
        if((ffau2.b & 8) != 0) {
            feyl feyl10 = ffau2.f == null ? feyl.a : ffau2.f;
            boolean z = fczq0.n;
            if(z != feyl10.k) {
                if(!this.D || z) {
                    this.w.b(-6, fczq0.c);
                }
                String s5 = "isMigrating state mismatch: local config isMigrating=" + fczq0.n + ", message isMigrating=" + feyl10.k;
                Log.e("Wear_Transport", s5);
                throw new fdrr(s5);
            }
            if(fczq0.e == 2 && (fczq0.d == 1 || fczq0.d == 5)) {
                SharedPreferences sharedPreferences0 = this.i;
                String s6 = ffem.c(sharedPreferences0);
                Log.i("Wear_Transport", "ClientNodeId = " + s6 + " connectNodeId = " + (ffau2.f == null ? feyl.a : ffau2.f).c);
                if(s6 == null) {
                    Log.i("Wear_Transport", "Setting clientNodeId = " + (ffau2.f == null ? feyl.a : ffau2.f).c);
                    ffem.g(sharedPreferences0, (ffau2.f == null ? feyl.a : ffau2.f).c);
                }
                else if(!s6.equals((ffau2.f == null ? feyl.a : ffau2.f).c) && !fczq0.n) {
                    ffmn.f("Wear_Transport", "Mismatched node is attempting to connect: clientNodeId is %s and message nodeId is %s", new Object[]{s6, (ffau2.f == null ? feyl.a : ffau2.f).c});
                    ((fdsh)this.u.get()).h();
                    throw new fdrr();
                }
            }
            if(fczq0.n) {
                this.L = (ffau2.f == null ? feyl.a : ffau2.f).c;
                if(!this.c) {
                    if((feyl10.b & 0x200) != 0) {
                        fdvl fdvl0 = fdvl.m();
                        gftb.check(fdvl0);
                        String s7 = feyl10.c;
                        String s8 = feyl10.l;
                        batl.s(s7);
                        batl.s(s8);
                        try {
                            fdvd fdvd0 = fdvl0.g;
                            if(Log.isLoggable("DataItems", 4)) {
                                Log.i("DataItems", String.format("[migr-trkr] setNodeMigratingFrom(%s, %s)", s7, s8));
                            }
                            batl.s(s7);
                            batl.s(s8);
                            fdvd0.c();
                            SQLiteDatabase sQLiteDatabase0 = fdvd0.b.getWritableDatabase();
                            fdvd0.d(sQLiteDatabase0, s7, s8);
                            feny feny0 = fdvd0.c.o;
                            if(hzyg.h()) {
                                ffmn.a("DataServMigrationCtrl", "Starting migration for node %s", new Object[]{s7});
                                Set set0 = Collections.newSetFromMap(new ConcurrentHashMap());
                                feny0.a.writeLock().lock();
                                try {
                                    set1 = (Set)feny0.d.putIfAbsent(s7, set0);
                                }
                                finally {
                                    feny0.a.writeLock().unlock();
                                }
                                if(set1 != null) {
                                    ffmn.f("DataServMigrationCtrl", "Node %s is already migrating with completed apps %s", new Object[]{s7, set1});
                                }
                            }
                            ConcurrentHashMap concurrentHashMap0 = fdvd0.a;
                            if(!concurrentHashMap0.containsKey(s7)) {
                                concurrentHashMap0.put(s7, new fdvc(fdvd0, s8, fdvd.f(sQLiteDatabase0, s7)));
                            }
                            goto label_162;
                        }
                        catch(SQLiteException sQLiteException0) {
                            if(Log.isLoggable("DataItems", 5)) {
                                Log.w("DataItems", "Database error while trying to set node migrating status", sQLiteException0);
                            }
                            this.w.b(-1, fczq0.c);
                            if(Log.isLoggable("Wear_Transport", 6)) {
                                Log.e("Wear_Transport", "Couldn\'t initialize the node migrating state. Aborting!");
                            }
                            return null;
                        }
                    }
                    this.w.b(-7, fczq0.c);
                    throw new fdrr("Attempting to migrate, but connect message is missing a migratingFromNodeId");
                }
            }
        label_162:
            if(fczq0.n) {
                if(this.x != null && !this.x.equals(fczq0.c)) {
                    ffmn.b("Wear_Transport", "Received migration from %s but we are already migrating to %s", new Object[]{fczq0.c, this.x});
                    this.w.b(-8, fczq0.c);
                    throw new fdrr();
                }
                this.x = fczq0.c;
            }
            if(!fczq0.n) {
                String s9 = (ffau2.f == null ? feyl.a : ffau2.f).i;
                if(!TextUtils.isEmpty(s9) && !TextUtils.isEmpty(s) && !s.equals(s9)) {
                    Log.w("Wear_Transport", a.l(s9, s, "Error: networkid mismatch - the expected networkId is ", " but the actual networkId is "));
                    ((fdsh)this.u.get()).h();
                    throw new fdrr();
                }
            }
            if(hzzi.o()) {
                feyl feyl11 = ffau2.f;
                int v3 = (feyl11 == null ? feyl.a : feyl11).g;
                if(feyl11 == null) {
                    feyl11 = feyl.a;
                }
                int v4 = fdzz.a(v3, feyl11.f);
                if(v4 == -1) {
                    feyl feyl12 = ffau2.f;
                    int v5 = (feyl12 == null ? feyl.a : feyl12).f;
                    if(feyl12 == null) {
                        feyl12 = feyl.a;
                    }
                    Log.e("Wear_Transport", "Error: wire protocol version mismatch - our version: 1, our minimum supported version: 0; peer version: " + v5 + ", peer minimum supported version: " + feyl12.g);
                    fdob.k(9);
                    fdob.g(9, this.c, fczq0.h());
                    throw new feai();
                }
                ffmn.a("Wear_Transport", "Peer handshake connect succeeded, highest version both support: %s", new Object[]{v4});
            }
            else {
                feyl feyl13 = ffau2.f;
                int v6 = (feyl13 == null ? feyl.a : feyl13).f;
                if(!(v6 <= 0 ? v6 >= 0 : (feyl13 == null ? feyl.a : feyl13).g <= 1)) {
                    int v7 = (feyl13 == null ? feyl.a : feyl13).f;
                    if(feyl13 == null) {
                        feyl13 = feyl.a;
                    }
                    Log.e("Wear_Transport", "Error: wire protocol version mismatch - our version: 1, our minimum supported version: 0; peer version: " + v7 + ", peer minimum supported version: " + feyl13.g);
                    fdob.k(9);
                    fdob.g(9, this.c, fczq0.h());
                    throw new feai();
                }
                if(feyl13 == null) {
                    feyl13 = feyl.a;
                }
                ffmn.a("Wear_Transport", "Peer handshake connect succeeded, peer version: %s", new Object[]{((int)feyl13.f)});
            }
            long v8 = (ffau2.f == null ? feyl.a : ffau2.f).e;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.i.edit();
            sharedPreferences$Editor0.putLong("peer_android_id", v8);
            sharedPreferences$Editor0.apply();
            fdob.k(2);
            fdob.g(2, this.c, fczq0.h());
            if(fczq0.n) {
                this.w.b(2, fczq0.c);
            }
            return ffau2.f == null ? feyl.a : ffau2.f;
        }
        if(fczq0.n) {
            this.w.b(-4, fczq0.c);
        }
        Log.w("Wear_Transport", "error, peer didn\'t start with a connect message, found: " + ffax.a(ffau2).o);
        fdob.k(8);
        fdob.g(8, this.c, fczq0.h());
        return null;
    }

    public final void f(fczq fczq0, boolean z) {
        boolean z1;
        if(Log.isLoggable("Wear_Transport", 3)) {
            Log.d("Wear_Transport", "abortMigration config= " + fczq0 + ", sendMessage=" + z);
        }
        if(!fczq0.n) {
            ffmn.f("Wear_Transport", "Cannot abort migration: config is not migrating: %s", new Object[]{fczq0});
            return;
        }
        ffmn.b("Wear_Transport", "failMigration for: %s", new Object[]{fczq0});
        if(z) {
            String s = fczq0.j;
            ffmn.d("Wear_Transport", "Sending migration failed notification to node %s", new Object[]{s});
            if(s != null) {
                if(!this.c().c(s, 5)) {
                    ffmn.b("Wear_Transport", "Could not send migrationFailed message to peer node: %s", new Object[]{s});
                }
                gmde.d(hzyg.a.b().c(), TimeUnit.MILLISECONDS);
            }
        }
        ffmn.d("Wear_Transport", "onMigrationFailed, config=%s", new Object[]{fczq0});
        String s1 = fczq0.j;
        fdvl fdvl0 = fdvl.m();
        gftb.check(fdvl0);
        batl.s(s1);
        try {
            fdvl0.g.b(s1);
        }
        catch(SQLiteException sQLiteException0) {
            if(Log.isLoggable("DataItems", 5)) {
                Log.w("DataItems", "Database error while trying to clear node migrating status", sQLiteException0);
            }
        }
        fdvl fdvl1 = fdvl.m();
        gftb.check(fdvl1);
        fdvl1.P(s1);
        this.G.a(fczq0.b);
        fdzr fdzr0 = null;
        this.x = null;
        this.L = null;
        if(this.c) {
            this.m.a(0L, 1L, ayvf.b);
            String s2 = ffem.b(this.i);
            ffem.d(this.i);
            if(s2 == null) {
                ffmn.d("Wear_Transport", "Not reconnecting data plane writers as they were not disconnected", new Object[0]);
            }
            else {
                fduk fduk0 = this.c();
                if(Log.isLoggable("ControlPlaneTransport", 3)) {
                    Log.d("ControlPlaneTransport", "Sending migration cancelled to node: " + s2);
                }
                if(!fduk0.c(s2, 7)) {
                    ffmn.b("Wear_Transport", "Could not send migration cancelled message to old peer node: %s", new Object[]{s2});
                }
                this.l(s2);
                if(!this.c().c(s2, 4)) {
                    ffmn.b("Wear_Transport", "Could not send resume message to old peer node: %s", new Object[]{s2});
                }
            }
        }
        else {
            this.n.a(0L, 1L, ayvf.b);
        }
        for(Object object0: this.k) {
            fdzr fdzr1 = (fdzr)object0;
            fczq fczq1 = fdzr1.b;
            if(fczq1 != null && fczq0 != null) {
                String s3 = fczq1.c;
                if(s3 != null) {
                    z1 = s3.equals(fczq0.c);
                    goto label_58;
                }
            }
            z1 = false;
        label_58:
            if(z1) {
                fdzr0 = fdzr1;
                break;
            }
        }
        if(fdzr0 == null) {
            Log.e("Wear_Transport", "Could not find a sessionstats for config " + fczq0.b);
            return;
        }
        fdzr0.a.interrupt();
    }

    public final void g(fdwx fdwx0) {
        this.h.add(fdwx0);
        if((fdwx0 instanceof fduk)) {
            this.j = (fduk)fdwx0;
        }
        if((fdwx0 instanceof fdvv)) {
            this.F = (fdvv)fdwx0;
        }
    }

    public final void h(String s) {
        if(this.z.compareAndSet(1, 0)) {
            ffmn.d("Wear_Transport", "Connection continuing unconditionally after %s", new Object[]{s});
            return;
        }
        ffmn.a("Wear_Transport", "%s", new Object[]{"Connection cancelled after " + s});
        throw new fdzq("Connection cancelled after " + s);
    }

    public final void i(String s) {
        this.f.lock();
        try {
            for(Object object0: this.h) {
                fdwx fdwx0 = (fdwx)object0;
                if(!fdwx0.j()) {
                    fdwx0.i(s);
                }
            }
        }
        finally {
            this.f.unlock();
        }
        this.J.add(s);
    }

    public final void j(String s) {
        for(Object object0: this.A) {
            fdvl fdvl0 = ((ffgo)object0).a;
            String s1 = fdvl0.h ? fdvl0.u() : s;
            if(Log.isLoggable("DataItems", 4)) {
                Log.i("DataItems", "recordSyncMarker: " + s1);
            }
            fdpl fdpl0 = fdpl.a("com.google.android.gms", "38918a453d07199354f8b19af05ec6562ced5788");
            fdun fdun0 = new fdun(fdvl0.u(), "/setup/sync_marker/" + s1);
            fdun0.e = new byte[0];
            gmbu.t(fdvl0.o(fdpl0, fdun0), new fduu(fdvl0), gmap.a);
        }
    }

    public final void k(fczq fczq0, boolean z) {
        fdzr fdzr0;
        boolean z1;
        if(!fczq0.n) {
            ffmn.f("Wear_Transport", "onMigrationSucceeded, but config is not migrating: %s", new Object[]{fczq0});
            return;
        }
        ffmn.d("Wear_Transport", "onMigrationSucceeded for: %s", new Object[]{fczq0});
        fczq0.n = false;
        this.G.i(fczq0);
        this.A(fczq0.j, z);
        this.x = null;
        this.L = null;
        if(this.c) {
            this.o.a(0L, 1L, ayvf.b);
            ffem.g(this.i, fczq0.j);
            String s = ffem.b(this.i);
            ffem.d(this.i);
            fduk fduk0 = this.c();
            if(fduk0.e) {
                fdsh fdsh0 = (fdsh)fduk0.d.get();
                if(fdsh0 == null) {
                    Log.e("ControlPlaneTransport", "revokeSelfFromCloudServerAsWatch failed because cloudNodeAdapter is null");
                }
                else {
                    String s1 = fduk0.f.a().a;
                    String s2 = ffgp.c().a();
                    if(Log.isLoggable("ControlPlaneTransport", 4)) {
                        Log.i("ControlPlaneTransport", String.format("watch %s revoking self from cloud network %s", s1, s2));
                    }
                    if(!TextUtils.isEmpty(s2)) {
                        synchronized(fdsh0.D) {
                            SharedPreferences sharedPreferences0 = fdsh0.d;
                            HashSet hashSet0 = new HashSet(sharedPreferences0.getStringSet("nodesToRevoke", ggnj.a));
                            String s3 = sharedPreferences0.getString("networkOfNodesToRevoke:" + s1, null);
                            if(hashSet0.contains(s1) && s2.equals(s3)) {
                                z1 = false;
                            }
                            else {
                                hashSet0.add(s1);
                                sharedPreferences0.edit().putStringSet("nodesToRevoke", hashSet0).putString("networkOfNodesToRevoke:" + s1, s2).commit();
                                z1 = true;
                            }
                        }
                        if(z1) {
                            fdsh0.i.f(2);
                        }
                    }
                }
            }
            if(fduk0.c(s, 2)) {
                long v1 = hzyg.a.b().d();
                if(v1 > 0L) {
                    gmde.d(v1, TimeUnit.MILLISECONDS);
                }
            }
            else {
                ffmn.d("Wear_Transport", "Could not send terminateAssociation message to old peer node %s", new Object[]{s});
            }
            this.y.set(false);
            fdud fdud0 = (fdud)ffgp.i.get();
            batl.s(fdud0);
            if(Log.isLoggable("CloudSync", 3)) {
                Log.d("CloudSync", "cleanup keys");
            }
            try {
                fdud0.a.h = false;
                fdud0.a.a = null;
                fdud0.a.e = null;
                fdud0.a.c = null;
                fdud0.a.b = null;
                fdud0.a.d = null;
                fdud0.a.f = null;
                fdud0.a.g = 0L;
                fdud0.a.l();
            }
            catch(IOException iOException0) {
                Log.e("CloudNodeCrypto", "Failed to save keys in cleanup", iOException0);
            }
            fdud0.b();
            for(Object object1: this.k) {
                fdzr0 = (fdzr)object1;
                if(!s.equals(fdzr0.b.j)) {
                    continue;
                }
                goto label_73;
            }
            fdzr0 = null;
        label_73:
            if(fdzr0 == null) {
                Log.e("Wear_Transport", "Could not find a sessionstats for old node: " + s);
            }
            else {
                fdzr0.a.interrupt();
            }
            this.m(s, false, "Migration Complete", fczq0);
            fczq0.f("server");
            this.G.j(fczq0, true);
            this.G.a("migrating_server");
            ffgp.c().g(null);
            return;
        }
        this.y.set(false);
        this.p.a(0L, 1L, ayvf.b);
    }

    public final void l(String s) {
        this.A(s, true);
    }

    public final void m(String s, boolean z, String s1, fczq fczq0) {
        ffmn.d("Wear_Transport", "terminateAssociation(oldNode=%s, purgeNode=%b, reason=%s, newConfig=%s)", new Object[]{s, Boolean.valueOf(z), s1, Objects.toString(fczq0)});
        fczq fczq1 = this.b(s);
        if(fczq1 == null) {
            ffmn.d("Wear_Transport", "terminateAssociation: no connectionConfig found for node: %s", new Object[]{s});
            return;
        }
        felm felm0 = (felm)this.v.get();
        if(felm0 == null) {
            ffmn.b("Wear_Transport", "terminateAssociation: no connectionServiceManager found", new Object[0]);
            return;
        }
        String s2 = fczq1.c;
        this.w.b(6, s2);
        felm0.k(fczq1.b, null, z);
        if(this.D && fczq0 != null) {
            String s3 = fczq0.c;
            if(!Objects.equals(s2, s3)) {
                ffmn.d("Wear_Transport", "Removing bond as this is not A->A transfer. Old config addr: %s, new config addr: %s", new Object[]{Objects.toString(s2), Objects.toString(s3)});
                felm0.i(s2);
                return;
            }
            ffmn.d("Wear_Transport", "Not removing bond as this case is A->A transfer; addr is %s", new Object[]{Objects.toString(s2)});
            return;
        }
        felm0.i(s2);
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println("Flags:");
        bbpd0.b();
        bbpd0.c("CloudsyncFeature.enableNodeUnrevocationOnConnection", Boolean.valueOf(hzuz.p()));
        bbpd0.c("CloudsyncFeature.enableNodeUnrevocationOnConnection", Boolean.valueOf(hzuz.p()));
        bbpd0.println();
        bbpd0.c("WearableLegacyFeature.negotiateWireVersion", Boolean.valueOf(hzzi.o()));
        bbpd0.c("PhoneSwitchingFeature.enableAToATransfer", Boolean.valueOf(this.D));
        bbpd0.println();
        bbpd0.a();
        bbpd0.println("State:");
        bbpd0.b();
        bbpd0.print("disconnectedDataPlaneNodes: ");
        Object[] arr_object = this.J.toArray();
        for(int v = 0; v < arr_object.length; ++v) {
            bbpd0.print(arr_object[v]);
            bbpd0.print(", ");
        }
        bbpd0.println();
        bbpd0.print("migrationIsActive: ");
        bbpd0.print(this.y);
        bbpd0.print(", migrationCancellationState: ");
        bbpd0.print(this.z);
        bbpd0.print(", migratingNodeId: ");
        bbpd0.print(this.L);
        bbpd0.print(", migrationDestinationAddress: ");
        bbpd0.print(this.x);
        bbpd0.println();
        bbpd0.a();
        this.b.md(bbpd0, z, z1);
        bbpd0.println();
        bbpd0.b();
        for(Object object0: this.d) {
            ((fdzb)object0).md(bbpd0, z, z1);
        }
        bbpd0.println();
        bbpd0.println("Connection stats:");
        bbpd0.b();
        for(Object object1: this.k) {
            ((fdzr)object1).a(bbpd0);
        }
        bbpd0.a();
        bbpd0.a();
    }

    public final void n(InputStream inputStream0, OutputStream outputStream0, int v, fczq fczq0, Boolean boolean0, fent fent0, fdzi fdzi0) {
        boolean z2;
        feal feal0;
        boolean z1;
        fdzs fdzs1;
        fdzs fdzs0;
        Semaphore semaphore0;
        fdzt fdzt0;
        esaa esaa0;
        fdzb fdzb0;
        brzr brzr0;
        feyl feyl0;
        fens fens0;
        int v2;
        String s4;
        fdpd fdpd0;
        ffau ffau2;
        byte[] arr_b;
        fdzx fdzx0;
        String s3;
        ContentValues contentValues1;
        String s2;
        ffds ffds1;
        fczq fczq1 = fczq0;
        fdzr fdzr0 = new fdzr(this.E, fczq1);
        fdzr0.a = Thread.currentThread();
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        ffmn.d("Wear_Transport", "handleConnection, config: %s", new Object[]{fczq1});
        try {
            if(fczq1.c != null) {
                ffmn.a("Wear_Transport", "Updating config paired address", new Object[0]);
                ffds ffds0 = this.G;
                String s = fczq1.b;
                String s1 = fczq1.c;
                ffmn.a("ConnectionConfig", "updateConfigPairedBtAddress(%s, %s)", new Object[]{s, s1});
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("pairedBtAddress", s1);
                if(s == null) {
                    s = "NULL_STRING";
                }
                try {
                    ffds0.a.getWritableDatabase().updateWithOnConflict("connectionConfigurations", contentValues0, "name=?", new String[]{s}, 5);
                }
                catch(SQLiteException sQLiteException0) {
                    if(Log.isLoggable("ConnectionConfig", 6)) {
                        Log.e("ConnectionConfig", "updating configuration BT address failed", sQLiteException0);
                    }
                }
            }
            if(fczq1.u != 0) {
                ffmn.a("Wear_Transport", "Updating config transport type", new Object[0]);
                ffds1 = this.G;
                s2 = fczq1.b;
                Integer integer0 = (int)fczq1.u;
                ffmn.a("ConnectionConfig", "updateConfigRuntimeType(%s, %d)", new Object[]{s2, integer0});
                contentValues1 = new ContentValues();
                contentValues1.put("runtimeType", integer0);
                s3 = "NULL_STRING";
                goto label_29;
            }
            goto label_44;
        }
        catch(fdzq fdzq0) {
            goto label_362;
        }
        catch(Throwable throwable0) {
            goto label_374;
        }
    label_29:
        if(s2 != null) {
            s3 = s2;
        }
        try {
            try {
                try {
                    ffds1.a.getWritableDatabase().updateWithOnConflict("connectionConfigurations", contentValues1, "name=?", new String[]{s3}, 5);
                    hzya.i();
                    if(!hzya.e()) {
                        ffdr ffdr0 = ffds1.b;
                        if(ffdr0 != null) {
                            ffdr0.g(s2);
                        }
                    }
                    else if(ffds1.l(ffds1.c(s3))) {
                        ffds1.b.g(s2);
                    }
                }
                catch(SQLiteException sQLiteException1) {
                    if(Log.isLoggable("ConnectionConfig", 6)) {
                        Log.e("ConnectionConfig", "updating configuration current transport type failed", sQLiteException1);
                    }
                }
            label_44:
                Deque deque0 = this.k;
                synchronized(deque0) {
                    while(deque0.size() >= 20) {
                        deque0.removeFirst();
                    }
                    deque0.push(fdzr0);
                }
                if(fczq1.n) {
                    if(!this.y.compareAndSet(false, true)) {
                        ffmn.b("Wear_Transport", "Could not connect: already migrating to %s", new Object[]{this.x});
                        this.w.b(-8, fczq1.c);
                        throw new fdrr();
                    }
                    ffmn.d("Wear_Transport", "Handling phone switching connection...", new Object[0]);
                    atomicBoolean0.set(true);
                    this.z.set(1);
                }
                fdzx0 = new fdzx(inputStream0, outputStream0, new fdzw(), this.b, fdzr0);
                if(boolean0.booleanValue()) {
                    ffmn.a("Wear_Transport", "Negotiating encryption", new Object[0]);
                    fdpd fdpd1 = this.s(fdzx0, fczq1);
                    if(fdpd1 == null) {
                        goto label_359;
                    }
                    else {
                        fdpd0 = fdpd1;
                    label_70:
                        if(fent0 == null) {
                            goto label_181;
                        }
                        else {
                            ffmn.a("Wear_Transport", "Performing iOS auth over L2CAP", new Object[0]);
                            fent0.e.a(0L, 1L, ayvf.b);
                            arr_b = new byte[0x100];
                            fent0.c.nextBytes(arr_b);
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffau.a).v_newBuilder();
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ffah.a).v_newBuilder();
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ffad.a).v_newBuilder();
                            ByteString hfsf0 = ByteString.copyFrom(arr_b);
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            ffad ffad0 = (ffad)hftp2.b_message;
                            ffad0.b |= 1;
                            ffad0.c = hfsf0;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ffah ffah0 = (ffah)hftp1.b_message;
                            ffad ffad1 = (ffad)hftp2.N_build();
                            ffad1.getClass();
                            ffah0.c = ffad1;
                            ffah0.b = 1;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ffau ffau0 = (ffau)hftp0.b_message;
                            ffah ffah1 = (ffah)hftp1.N_build();
                            ffah1.getClass();
                            ffau0.h = ffah1;
                            ffau0.b |= 0x20;
                            ffau ffau1 = (ffau)hftp0.N_build();
                            ffav ffav0 = feaa.e(ffau1);
                            try {
                                feaa.i(fdzx0, ffav0, feaa.b(ffau1), null);
                            }
                            catch(IOException iOException0) {
                                fent.b("Error while sending handshake challenge to peer.", iOException0);
                                goto label_166;
                            }
                            try {
                                ArrayList arrayList0 = new ArrayList();
                                do {
                                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)ffav.a).v_newBuilder();
                                    feaa.k(fdzx0, hftp3, null);
                                    ffav ffav1 = (ffav)hftp3.N_build();
                                    arrayList0.add(ffav1);
                                }
                                while(arrayList0.size() != ffav1.f);
                                ffau2 = feaa.d(arrayList0);
                                goto label_117;
                            }
                            catch(IOException iOException1) {
                            }
                            fent.b("Error while receiving challenge response to peer.", iOException1);
                            fent.c(2, fdzx0);
                            goto label_116;
                        }
                        goto label_371;
                    }
                }
                else {
                    fdpd0 = null;
                    goto label_70;
                }
                goto label_390;
            }
            catch(fdzq fdzq0) {
                goto label_362;
            }
        }
        catch(Throwable throwable0) {
            goto label_374;
        }
    label_116:
        goto label_166;
        try {
        label_117:
            ffah ffah2 = ffau2.h == null ? ffah.a : ffau2.h;
            if((ffah2.b == 2 ? ((ffae)ffah2.c) : ffae.a).c.isEmpty()) {
                fent.a("Didn\'t receive the challenge response.");
                fent.c(2, fdzx0);
                s4 = null;
            }
            else {
                ffah ffah3 = ffau2.h == null ? ffah.a : ffau2.h;
                fent.a(("Received challenge response from " + (ffah3.b == 2 ? ((ffae)ffah3.c) : ffae.a).c));
                ffah ffah4 = ffau2.h == null ? ffah.a : ffau2.h;
                s4 = (ffah4.b == 2 ? ((ffae)ffah4.c) : ffae.a).c;
                fenv fenv0 = fent0.a;
                if(fenv0.c(s4)) {
                label_130:
                    ffah ffah6 = ffau2.h == null ? ffah.a : ffau2.h;
                    if((ffah6.b == 2 ? ((ffae)ffah6.c) : ffae.a).e.isEmpty()) {
                        ffah ffah10 = ffau2.h == null ? ffah.a : ffau2.h;
                        if(((ffah10.b == 2 ? ((ffae)ffah10.c) : ffae.a).b & 8) == 0) {
                            fent.a("Missing attestation and assertion.");
                            goto label_162;
                        }
                        else {
                            ECPublicKey eCPublicKey0 = fenv0.a(s4);
                            if(eCPublicKey0 == null) {
                                fent.a("Missing public key.");
                            label_162:
                                v2 = 2;
                            }
                            else {
                                ffah ffah11 = ffau2.h == null ? ffah.a : ffau2.h;
                                if(fenr.b(s4, eCPublicKey0, arr_b, (ffah11.b == 2 ? ((ffae)ffah11.c) : ffae.a).f.toByteArray())) {
                                label_156:
                                    v2 = 3;
                                }
                                else {
                                    fent.a("Failed assertion validation.");
                                    fent0.h.a(0L, 1L, ayvf.b);
                                    goto label_162;
                                }
                            }
                        }
                    }
                    else {
                        fenr fenr0 = fent0.d;
                        Context context0 = fent0.b;
                        ffah ffah7 = ffau2.h;
                        ffah ffah8 = ffah7 == null ? ffah.a : ffah7;
                        String s5 = (ffah8.b == 2 ? ((ffae)ffah8.c) : ffae.a).d;
                        if(ffah7 == null) {
                            ffah7 = ffah.a;
                        }
                        X509Certificate x509Certificate0 = fenr0.a(context0, s5, s4, arr_b, (ffah7.b == 2 ? ((ffae)ffah7.c) : ffae.a).e.toByteArray());
                        s4 = s4;
                        if(x509Certificate0 == null) {
                            fent.a("Failed attestation.");
                            fent0.g.a(0L, 1L, ayvf.b);
                            goto label_162;
                        }
                        else {
                            ffah ffah9 = ffau2.h == null ? ffah.a : ffau2.h;
                            fenv0.b(s4, (ffah9.b == 2 ? ((ffae)ffah9.c) : ffae.a).d, x509Certificate0);
                            goto label_156;
                        }
                    }
                }
                else {
                    ffah ffah5 = ffau2.h == null ? ffah.a : ffau2.h;
                    if(!(ffah5.b == 2 ? ((ffae)ffah5.c) : ffae.a).f.isEmpty()) {
                        fent.a("Unknown key identifier for given application id.");
                        v2 = 4;
                        goto label_163;
                    }
                    goto label_130;
                }
            label_163:
                if(fent.c(v2, fdzx0) && v2 == 3) {
                    fent0.f.a(0L, 1L, ayvf.b);
                }
                else {
                label_166:
                    s4 = null;
                }
            }
            if(s4 == null) {
                Log.e("Wear_Transport", "failed pre connect protocol handling.");
                goto label_175;
            }
            else {
                fens0 = new fens(fdzi0, s4);
                goto label_182;
            }
            goto label_371;
        }
        catch(fdzq fdzq0) {
            goto label_362;
        }
        catch(Throwable throwable0) {
            goto label_374;
        }
    label_175:
        ffmn.a("Wear_Transport", "Cleaning up...", new Object[0]);
        if(atomicBoolean0.get()) {
            this.y.set(false);
        }
        this.z.set(0);
        ffmn.a("Wear_Transport", "Network processing loop is finished", new Object[0]);
        goto label_368;
        try {
        label_181:
            fens0 = null;
        label_182:
            this.y("auth/encryption");
            ffmn.d("Wear_Transport", "Performing handshake with peer", new Object[0]);
            feyl0 = this.d(fdzx0, fczq1, fdpd0);
            if(feyl0 == null) {
                goto label_353;
            }
            else {
                this.y("handshake");
                ffmn.a("Wear_Transport", "Connected to node %s", new Object[]{feyl0.c});
                if(fczq1.d == 2 && fczq1.e == 2) {
                    ffmn.a("Wear_Transport", "Setting up emulator configs", new Object[0]);
                    fczq1 = this.q(fczq1, feyl0);
                    this.B();
                    this.x(fczq1);
                }
                goto label_193;
            }
            goto label_371;
        }
        catch(fdzq fdzq0) {
            goto label_362;
        }
        catch(Throwable throwable0) {
            goto label_374;
        }
        try {
        label_193:
            ffmn.d("Wear_Transport", "Setting %s as nodeId connected to %s", new Object[]{feyl0.c, fczq1});
            fczq1.e(feyl0.c);
            fczq1.j = feyl0.c;
            this.G.k(fczq1.b, feyl0.c);
            ((felm)this.v.get()).n(fczq1.b, fczq1.j);
            boolean z = this.c;
            if(z && hzxv.i()) {
                fdne.b(2, fczq1.u);
            }
            if(fczq1.n && z) {
                String s6 = ffem.c(this.i);
                ffmn.a("Wear_Transport", "Dealing with old peer %s", new Object[]{s6});
                ffem.f(this.i, s6);
                if(!this.c().c(s6, 3)) {
                    ffmn.f("Wear_Transport", "Could not send suspend sync message to old node %s", new Object[]{s6});
                }
                ffmn.d("Wear_Transport", "%s is disconnecting data plane writers for old node %s", new Object[]{this.M.a().a, s6});
                this.y("sending suspend to old node");
                this.i(s6);
                this.w.b(3, fczq1.c);
                this.y("disconnecting writers to old node");
            }
            if(hzuz.p() && !z) {
                ffmn.a("Wear_Transport", "Ensuring peer is not cloud revoked", new Object[0]);
                ((fdsh)this.u.get()).d(feyl0.c);
            }
            Context context1 = this.B;
            brzr0 = null;
            if(context1 != null && (hryk.l() || hryk.k())) {
                try {
                    brzr0 = new brzr(context1, this.getClass(), 16, "WearableTransport");
                }
                catch(NullPointerException unused_ex) {
                }
            }
            ffmn.a("Wear_Transport", "Setting up writers...", new Object[0]);
            fdpz fdpz0 = fdzb.h();
            fdpz0.b(this.C);
            fdpz0.a = this.b;
            fdpz0.f(outputStream0);
            fdpz0.b = feyl0;
            fdpz0.c = fdzr0;
            fdpz0.d(v);
            fdpz0.c(fczq1.h());
            fdpz0.d = fdpd0;
            fdpz0.e = fens0;
            fdpz0.e(fdzz.a(feyl0.g, feyl0.f));
            fdpz0.f = hryk.l() ? brzr0 : null;
            fdpz0.h = this.K;
            fdzb0 = fdpz0.a();
            this.I.put(feyl0.c, fdzb0);
            esaa0 = this.e;
            if(hryk.k()) {
                goto label_240;
            }
            else {
                goto label_237;
            }
            goto label_242;
        }
        catch(fdzq fdzq0) {
            goto label_340;
        }
        catch(Throwable throwable0) {
            goto label_343;
        }
    label_237:
        fdzr fdzr1 = fdzr0;
        brzr brzr1 = null;
        goto label_242;
    label_240:
        fdzr1 = fdzr0;
        brzr1 = brzr0;
        try {
        label_242:
            fdzr0 = fdzr1;
            fdzt0 = new fdzt(this, inputStream0, feyl0, fdzr1, fdzb0, fdpd0, fens0, esaa0, brzr1);
            fdzr0 = fdzr1;
            goto label_249;
        }
        catch(fdzq fdzq0) {
            fdzr0 = fdzr1;
            goto label_340;
            try {
            label_249:
                semaphore0 = new Semaphore(0);
                fdzs0 = new fdzs(fdzb0, semaphore0);
                fdzs1 = new fdzs(fdzt0, semaphore0);
                this.g.add(fczq1);
                this.d.add(fdzb0);
                ffmn.a("Wear_Transport", "Starting writer thread to send packets to %s", new Object[]{feyl0.c});
                if(hryk.l()) {
                    gdqs gdqs0 = gdsp.g(gdpu.a);
                    TWR.declareResource(gdqs0);
                    TWR.useResource$NT(gdqs0);
                }
                fdzs0.start();
                SharedPreferences sharedPreferences0 = this.i;
                String s7 = ffem.b(sharedPreferences0);
                if(!this.c && fczq1.n && feyl0.c.equals(s7)) {
                    ffmn.a("Wear_Transport", "Reconnecting to an old watch: %s, clearing activeMigrationNode from prefs", new Object[]{s7});
                    ffem.d(sharedPreferences0);
                    s7 = null;
                }
                if((feyl0.b & 1) != 0 && feyl0.c.equals(s7)) {
                    ffmn.d("Wear_Transport", "Connecting to config which is the active migration node %s", new Object[]{s7});
                    this.v(fdzb0, fczq1);
                label_279:
                    z1 = false;
                }
                else if(!fczq1.n) {
                    ffmn.d("Wear_Transport", "Connecting to config", new Object[0]);
                    this.w(fdzb0, fczq1);
                    goto label_279;
                }
                else {
                    ffmn.d("Wear_Transport", "Connecting to config: %s for migration, only connecting control plane transport", new Object[]{feyl0.c});
                    this.v(fdzb0, fczq1);
                    z1 = this.E(fdzb0);
                }
                if(hryk.k()) {
                    gdqs gdqs1 = gdsp.g(gdpu.a);
                    TWR.declareResource(gdqs1);
                    TWR.useResource$NT(gdqs1);
                }
                fdzs1.start();
            }
            catch(fdzq fdzq0) {
                goto label_340;
            }
            catch(Throwable throwable0) {
                goto label_343;
            }
            try {
                if(!hzyg.d()) {
                    this.y("connecting control plane to new node");
                    this.z(fczq1, z1);
                    atomicBoolean0.set(false);
                label_295:
                    feal0 = null;
                }
                else if(fczq1.n) {
                    this.y("connecting control plane to new node");
                    feal0 = this.u(fczq1, z1, atomicBoolean0);
                }
                else {
                    goto label_295;
                }
            }
            catch(Throwable throwable1) {
                feal0 = null;
                goto label_304;
            }
            try {
                fdzv.F(semaphore0);
                ffmn.d("Wear_Transport", "Threads terminated for node %s", new Object[]{fczq1.j});
                goto label_321;
            }
            catch(Throwable throwable1) {
            }
            try {
            label_304:
                fdzs0.interrupt();
                fdzs1.interrupt();
                if(hzyg.d() && feal0 != null && !feal0.e()) {
                    feal0.a();
                }
                ffmm.a(inputStream0);
                ffmm.a(outputStream0);
                fdzb0.d();
                this.C(fdzb0.a.a);
                this.D(fdzb0);
                this.d.remove(fdzb0);
                this.g.remove(fczq1);
                fczq1.e(null);
                if(this.c && hzxv.i()) {
                    fdne.b(3, fczq1.u);
                }
                gmde.c(fdzs0);
                gmde.c(fdzs1);
                throw throwable1;
            label_321:
                fdzs0.interrupt();
                fdzs1.interrupt();
                if(hzyg.d() && feal0 != null && !feal0.e()) {
                    feal0.a();
                }
                ffmm.a(inputStream0);
                ffmm.a(outputStream0);
                fdzb0.d();
                this.C(fdzb0.a.a);
                this.D(fdzb0);
                this.d.remove(fdzb0);
                this.g.remove(fczq1);
                fczq1.e(null);
                z2 = this.c;
                if(z2 && hzxv.i()) {
                    fdne.b(3, fczq1.u);
                }
                gmde.c(fdzs0);
                gmde.c(fdzs1);
                goto label_345;
            }
            catch(fdzq fdzq0) {
            }
            catch(Throwable throwable0) {
                goto label_343;
            }
        label_340:
            fczq1 = fczq1;
            goto label_362;
        }
        catch(Throwable throwable0) {
        label_343:
            fczq1 = fczq1;
            goto label_374;
        }
    label_345:
        ffmn.a("Wear_Transport", "Cleaning up...", new Object[0]);
        if(atomicBoolean0.get()) {
            this.y.set(false);
        }
        this.z.set(0);
        ffmn.a("Wear_Transport", "Network processing loop is finished", new Object[0]);
        fdob.k(3);
        boolean z3 = fczq1.h();
        goto label_371;
    label_353:
        ffmn.a("Wear_Transport", "Cleaning up...", new Object[0]);
        if(atomicBoolean0.get()) {
            this.y.set(false);
        }
        this.z.set(0);
        ffmn.a("Wear_Transport", "Network processing loop is finished", new Object[0]);
        goto label_368;
        try {
        label_359:
            Log.e("Wear_Transport", "failed mandatory encryption");
            goto label_383;
        }
        catch(fdzq fdzq0) {
            try {
            label_362:
                ffmn.g("Wear_Transport", fdzq0, "Connection cancelled", new Object[0]);
            }
            catch(Throwable throwable0) {
                goto label_374;
            }
            ffmn.a("Wear_Transport", "Cleaning up...", new Object[0]);
            if(atomicBoolean0.get()) {
                this.y.set(false);
            }
            this.z.set(0);
            ffmn.a("Wear_Transport", "Network processing loop is finished", new Object[0]);
        label_368:
            fdob.k(3);
            z2 = this.c;
            z3 = fczq1.h();
        label_371:
            fdob.g(3, z2, z3);
            goto label_390;
        }
        catch(Throwable throwable0) {
        }
    label_374:
        ffmn.a("Wear_Transport", "Cleaning up...", new Object[0]);
        if(atomicBoolean0.get()) {
            this.y.set(false);
        }
        this.z.set(0);
        ffmn.a("Wear_Transport", "Network processing loop is finished", new Object[0]);
        fdob.k(3);
        fdob.g(3, this.c, fczq1.h());
        ffmm.a(fdzr0);
        throw throwable0;
    label_383:
        ffmn.a("Wear_Transport", "Cleaning up...", new Object[0]);
        if(atomicBoolean0.get()) {
            this.y.set(false);
        }
        this.z.set(0);
        ffmn.a("Wear_Transport", "Network processing loop is finished", new Object[0]);
        fdob.k(3);
        fdob.g(3, this.c, fczq1.h());
    label_390:
        ffmm.a(fdzr0);
    }

    public static final fdww o(fczq fczq0) {
        fdwv fdwv0 = fdww.a();
        fdwv0.b((fczq0.o ? fdwu.a : fdwu.b));
        return fdwv0.a();
    }

    public final void p(InputStream inputStream0, OutputStream outputStream0, fczq fczq0) {
        this.n(inputStream0, outputStream0, 0x3000, fczq0, Boolean.valueOf(fczq0.h()), null, null);
    }

    private final fczq q(fczq fczq0, feyl feyl0) {
        String s = "EmulatorAddr-" + feyl0.c;
        if(s.equals(fczq0.c)) {
            ffmn.a("Wear_Transport", "The emulator\'s ConnectionConfiguration is already set.", new Object[0]);
            return this.r(feyl0, fczq0);
        }
        ffds ffds0 = this.G;
        fczq fczq1 = ffds0.d(s);
        if(fczq1 == null) {
            String s1 = feyl0.c.equals(feyl0.d) || feyl0.d.startsWith("sdk_gwear_") ? "Emulator (" + feyl0.c + ")" : feyl0.d;
            ggdy ggdy0 = new ggdy();
            String s2 = fczq0.k;
            if(s2 != null) {
                ggdy0.i(s2);
            }
            List list0 = fczq0.m;
            if(list0 != null) {
                ggdy0.k(list0);
            }
            fczp fczp0 = fczq.a();
            fczp0.a = s1;
            fczp0.b = s;
            fczp0.n(fczq0.d);
            fczp0.k(fczq0.e);
            fczp0.c(true);
            String s3 = null;
            fczp0.d = null;
            if((feyl0.b & 0x80) != 0) {
                s3 = feyl0.j;
            }
            fczp0.e = s3;
            fczp0.f = ggdy0.h();
            fczq fczq2 = fczp0.a();
            ffmn.a("Wear_Transport", "Creating a new ConnectionConfiguration for this emulator connection. %s", new Object[]{fczq2});
            ffds0.i(fczq2);
            return fczq2;
        }
        ffmn.a("Wear_Transport", "Found the correct ConnectionConfiguration.", new Object[0]);
        return this.r(feyl0, fczq1);
    }

    private final fczq r(feyl feyl0, fczq fczq0) {
        if((feyl0.b & 0x80) != 0 && !feyl0.j.equals(fczq0.k)) {
            fczp fczp0 = fczq.a();
            fczp0.a = fczq0.b;
            fczp0.b = fczq0.c;
            fczp0.n(fczq0.d);
            fczp0.k(fczq0.e);
            fczp0.c(fczq0.f);
            fczp0.d = fczq0.j;
            fczp0.e = feyl0.j;
            fczq fczq1 = fczp0.a();
            ffmn.a("Wear_Transport", "Updating the package name for emulator\'s ConnectionConfiguration. %s", new Object[]{fczq1});
            this.G.i(fczq1);
            return fczq1;
        }
        return fczq0;
    }

    private final fdpd s(fdzx fdzx0, fczq fczq0) {
        int v1;
        fdzn fdzn0 = new fdzn(this, fczq0);
        fdpd fdpd0 = new fdpd(new fdpc(fdzx0), fdzn0);
        if(fdpd0.d != null) {
            throw new IllegalStateException("Encryption already established");
        }
        Context context0 = this.C;
        Intent intent0 = new Intent("com.google.android.clockwork.A2AResult");
        fdzn fdzn1 = fdpd0.f;
        String s = ((felm)fdzn1.b.v.get()).c.g(fdzn1.a.b);
        int v = 2;
        hhsq[] arr_hhsq = new hhsq[2];
        if(!TextUtils.isEmpty(s)) {
            byte[] arr_b = ghjc.d.q(s);
            byte[] arr_b1 = Arrays.copyOf(arr_b, 73);
            try {
                arr_hhsq[0] = hhsq.d(arr_b1);
            }
            catch(IllegalArgumentException unused_ex) {
                Log.w("ConnectionConfig", "couldn\'t load saved previous crypto session");
            }
            if(arr_b.length != 73) {
                byte[] arr_b2 = Arrays.copyOfRange(arr_b, 73, arr_b.length);
                try {
                    arr_hhsq[1] = hhsq.d(arr_b2);
                }
                catch(IllegalArgumentException unused_ex) {
                    Log.w("ConnectionConfig", "couldn\'t load saved penultimate crypto session");
                }
            }
            else if(Log.isLoggable("ConnectionConfig", 3)) {
                Log.d("ConnectionConfig", "No saved penultimate crypto session found");
            }
        }
        if(fdpd0.b(context0, arr_hhsq[0] != null, intent0)) {
            hhsq hhsq0 = fdpd0.d;
            if(hhsq0 == null) {
                v = 1;
            }
            else {
                try {
                    fdpc fdpc0 = fdpd0.e;
                    ffau ffau0 = fdpc0.a(fdpd0);
                    byte[] arr_b3 = (ffau0.b & 16) == 0 ? null : (ffau0.g == null ? feys.a : ffau0.g).d.toByteArray();
                    if(arr_b3 == null) {
                        fdpd0.i("Unable to read resume bytes");
                    }
                    else {
                        byte[] arr_b4 = fdpd.c;
                        if(fdpd.c(arr_b3, arr_hhsq[0], hhsq0, arr_b4)) {
                            v1 = 0;
                            goto label_38;
                        }
                        else {
                            Log.d("A2AEncryption", "Failed to validate previous session, trying penultimate");
                            hhsq hhsq1 = arr_hhsq[1];
                            if(hhsq1 != null && fdpd.c(arr_b3, hhsq1, hhsq0, arr_b4)) {
                                v1 = 1;
                            label_38:
                                byte[] arr_b5 = fdpd.d(arr_hhsq[v1], hhsq0, fdpd.b);
                                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffau.a).v_newBuilder();
                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)feys.a).v_newBuilder();
                                ByteString hfsf0 = ByteString.copyFrom(arr_b5);
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                feys feys0 = (feys)hftp1.b_message;
                                feys0.b |= 2;
                                feys0.d = hfsf0;
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ffau ffau1 = (ffau)hftp0.b_message;
                                feys feys1 = (feys)hftp1.N_build();
                                feys1.getClass();
                                ffau1.g = feys1;
                                ffau1.b |= 16;
                                fdpc0.b(((ffau)hftp0.N_build()), fdpd0);
                                Log.i("A2AEncryption", "doing handshake");
                                byte[] arr_b6 = fdpd.a;
                                if(MessageDigest.isEqual(arr_b6, fdpd0.g())) {
                                    fdpd0.a(arr_b6);
                                    fdzn1.a(hhsq0, arr_hhsq[v1]);
                                    v = 0;
                                }
                                else {
                                    fdpd0.i("confirm handshake failed");
                                }
                            }
                            else {
                                fdzn1.a(null, null);
                                fdpd0.i("Couldn\'t validate resume hmac");
                            }
                        }
                    }
                }
                catch(IOException iOException0) {
                    Log.e("A2AEncryption", "IOException during re-encryption " + iOException0.toString());
                    v = 1;
                }
            }
            switch(v) {
                case 0: {
                    break;
                }
                case 2: {
                    Log.e("A2AEncryption", "Could not reestablish encryption, restarting fresh");
                    fdpd0.b(context0, false, intent0);
                    goto label_79;
                }
                default: {
                    Log.e("A2AEncryption", "Failed to resume, though non-fatal error.");
                    goto label_95;
                }
            }
        }
        else {
        label_79:
            if(fdpd0.d == null) {
                Log.e("A2AEncryption", "authenticateAsInitiator() Session is null.");
                fdpd.h(context0, intent0, false);
            }
            else {
                try {
                    Log.i("A2AEncryption", "doing handshake");
                    byte[] arr_b7 = fdpd.a;
                    if(!MessageDigest.isEqual(arr_b7, fdpd0.g())) {
                        fdpd0.a(new byte[0]);
                        Log.e("A2AEncryption", "confirm handshake failed");
                        fdpd.h(context0, intent0, false);
                        goto label_95;
                    }
                    fdpd0.a(arr_b7);
                    goto label_97;
                }
                catch(IOException iOException1) {
                    Log.e("A2AEncryption", "IOException during handshake " + iOException1.toString());
                    fdpd.h(context0, intent0, false);
                }
            }
        label_95:
            Log.e("Wear_Transport", "Could not authenticate as initiator.");
            return null;
        label_97:
            fdpd0.f.a(fdpd0.d, null);
            fdpd.h(context0, intent0, true);
        }
        return fdpd0;
    }

    private final fdww t(fczq fczq0) {
        if(hzvy.a.b().e()) {
            fczq fczq1 = this.G.d(fczq0.c);
            if(fczq1 != null) {
                return fdzv.o(fczq1);
            }
            ffmn.f("Wear_Transport", "The config provided does not exist in config store. Using the config provided : %s", new Object[]{fczq0});
        }
        return fdzv.o(fczq0);
    }

    private final feal u(fczq fczq0, boolean z, AtomicBoolean atomicBoolean0) {
        febr febr0;
        this.y("connecting control plane to new node");
        ffmn.d("Wear_Transport", "Starting asynchronous account matching for config: %s", new Object[]{fczq0});
        this.w.b(4, fczq0.c);
        fdzm fdzm0 = new fdzm(this, fczq0, z, atomicBoolean0);
        fduk fduk0 = this.j;
        bblf bblf0 = new bblf(new bblg(9));
        String s = fczq0.k;
        String s1 = fczq0.c;
        gftb.check(s1);
        String s2 = fczq0.j;
        gftb.check(s2);
        Context context0 = this.B;
        feax feax0 = new feax(context0);
        boolean z1 = this.c;
        if(z1) {
            febr0 = new febr(s2, fduk0, feax0, bblf0);
        }
        else {
            feaz feaz0 = new feaz(feax0);
            gftb.check(s);
            febr0 = new febl(s2, s1, feaz0, context0, fduk0, bblf0, s);
        }
        feal feal0 = new feal(febr0, fdzm0);
        if(z1) {
            this.q.a(0L, 1L, ayvf.b);
        }
        else {
            this.r.a(0L, 1L, ayvf.b);
        }
        ffmn.d("AsyncAcctMatchCtr", "Starting account match service", new Object[0]);
        feal0.a.g(feal0);
        feal0.a.h();
        return feal0;
    }

    private final void v(fdzb fdzb0, fczq fczq0) {
        fdww fdww0 = this.t(fczq0);
        ArrayList arrayList0 = this.h;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            fdwx fdwx0 = (fdwx)arrayList0.get(v1);
            if(fdwx0.j()) {
                fdwx0.h(fdzb0, fdww0);
            }
        }
        this.J.add(fdzb0.a.a);
    }

    private final void w(fdzb fdzb0, fczq fczq0) {
        ArrayList arrayList0 = this.h;
        fdww fdww0 = this.t(fczq0);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((fdwx)arrayList0.get(v1)).h(fdzb0, fdww0);
        }
    }

    private final void x(fczq fczq0) {
        if(!gfta.c(fczq0.k) && !fczq0.k.equals("com.google.android.wearable.app")) {
            try {
                this.C.getPackageManager().getPackageInfo(fczq0.k, 0x80);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                Log.e("Wear_Transport", String.format("Companion app %s for the emulator %s not found.", fczq0.k, fczq0.b));
                Context context0 = this.C;
                PendingIntent pendingIntent0 = fqaw.c(context0, 0, new Intent("android.intent.action.VIEW", Uri.parse("https://developer.android.com/training/wearables/get-started/creating#pairing-assistant")).addFlags(0x10000000), 0x40000000);
                if(hzzi.p()) {
                    juh juh0 = new juh(0, context0.getResources().getText(0x7F153631), pendingIntent0);  // string:wearable_emulator_oem_companion_not_found_action_title "More Info"
                    this.H.a(juh0, 0x7F153635, 0x7F153632, gfsx.m(Integer.valueOf(0x7F153633)), "Wear_Transport", false);  // string:wearable_emulator_oem_companion_not_found_title "Wear OS emulator"
                    return;
                }
                this.H.b(pendingIntent0, 0x7F153635, 0x7F153632, gfsx.m(Integer.valueOf(0x7F153633)), "Wear_Transport", false);  // string:wearable_emulator_oem_companion_not_found_title "Wear OS emulator"
            }
        }
    }

    private final void y(String s) {
        if(this.z.get() != 3) {
            ffmn.d("Wear_Transport", "Connection continuing after step: %s", new Object[]{s});
            return;
        }
        ffmn.a("Wear_Transport", "%s", new Object[]{"Connection cancelled after " + s});
        throw new fdzq("Connection cancelled after " + s);
    }

    private final void z(fczq fczq0, boolean z) {
        febr febr0;
        if(!fczq0.n) {
            return;
        }
        ffmn.a("Wear_Transport", "doMigrationAccountMatchAndCompleteMigration(%s)", new Object[]{fczq0});
        this.w.b(4, fczq0.c);
        fduk fduk0 = this.c();
        boolean z1 = this.c;
        Context context0 = this.C;
        String s = fczq0.c;
        gftb.check(s);
        String s1 = fczq0.j;
        gftb.check(s1);
        String s2 = fczq0.k;
        feam feam0 = new feam();
        bblf bblf0 = new bblf(new bblg(9));
        feax feax0 = new feax(context0);
        if(z1) {
            febr0 = new febr(s1, fduk0, feax0, bblf0);
        }
        else {
            feaz feaz0 = new feaz(feax0);
            gftb.check(s2);
            febr0 = new febl(s1, s, feaz0, context0, fduk0, bblf0, s2);
        }
        febr0.g(feam0);
        try {
            if(z1) {
                this.q.a(0L, 1L, ayvf.b);
            }
            else {
                this.r.a(0L, 1L, ayvf.b);
            }
            if(!z1 && !hzyg.a.b().h()) {
                gftb.check(s2);
                Intent intent0 = AccountMatchingChimeraActivity.g("loading_fragment", s, s2);
                intent0.addFlags(0x10000000);
                context0.startActivity(intent0);
            }
            febr0.h();
            try {
                feam0.a();
            }
            catch(InterruptedException interruptedException0) {
                febr0.c();
                throw interruptedException0;
            }
            fean fean1 = feam0.b;
            if(fean1 != null) {
                throw fean1;
            }
            goto label_48;
        }
        catch(fean fean0) {
            if(Log.isLoggable("Wear_Transport", 5)) {
                Log.w("Wear_Transport", "Account match failed", fean0);
            }
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
        }
        this.w.b(-2, fczq0.c);
        this.a(fczq0, true);
        goto label_56;
    label_48:
        if(!feam0.a) {
            this.w.b(-2, fczq0.c);
            this.a(fczq0, true);
        }
        else if(this.c) {
            this.s.a(0L, 1L, ayvf.b);
        }
        else {
            this.t.a(0L, 1L, ayvf.b);
        }
    label_56:
        this.h("account matching");
        fczt fczt0 = this.w;
        fczt0.b(5, fczq0.c);
        if(this.c) {
            fdvl fdvl0 = fdvl.m();
            gftb.check(fdvl0);
            if(!fdvl0.Y(ffem.c(this.i), fczq0.j)) {
                if(Log.isLoggable("Wear_Transport", 5)) {
                    Log.w("Wear_Transport", "Couldn\'t prepare watch to migrate! Aborting.");
                }
                this.f(fczq0, true);
            }
        }
        ffmn.a("Wear_Transport", "Attempting to complete migration for %s", new Object[]{fczq0});
        this.k(fczq0, z);
        fczt0.b(0, fczq0.c);
        this.j(fczq0.j);
    }
}


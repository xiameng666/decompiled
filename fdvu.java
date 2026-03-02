import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class fdvu implements ffmj {
    private final ArrayList A;
    private Map B;
    public final String a;
    public final String b;
    public final fdvl c;
    public final ffew d;
    public final fedp e;
    public final fdpl f;
    public final fdvr g;
    public final fdvq h;
    public final boolean i;
    public final boolean j;
    public final Object k;
    public ggeo l;
    public fdvt m;
    public boolean n;
    public boolean o;
    final CountDownLatch p;
    public boolean q;
    public fdwy r;
    public fdvr s;
    public boolean t;
    public ffcd u;
    public fdwu v;
    public feua w;
    public List x;
    public felw y;
    private final felo z;

    public fdvu(String s, String s1, fdvl fdvl0, ffew ffew0, felo felo0, fedp fedp0, fdpl fdpl0, boolean z) {
        fdvr fdvr0 = new fdvr();
        this.g = fdvr0;
        this.A = new ArrayList();
        this.h = new fdvq();
        this.k = new Object();
        boolean z1 = false;
        this.o = false;
        this.p = new CountDownLatch(1);
        this.B = new HashMap();
        this.u = null;
        this.x = null;
        this.y = null;
        this.a = s;
        this.b = s1;
        this.c = fdvl0;
        this.d = ffew0;
        this.z = felo0;
        this.e = fedp0;
        this.f = fdpl0;
        this.i = z;
        fdvr0.f(true);
        if(!z && hzvj.d()) {
            z1 = true;
        }
        this.j = z1;
    }

    public final long a(String s) {
        Long long0 = (Long)this.B.get(s);
        return long0 == null ? -1L : ((long)long0);
    }

    public final long b(String s, long v) {
        Long long0 = (Long)this.B.get(s);
        if(long0 == null || v > ((long)long0)) {
            long0 = v;
            this.B.put(s, long0);
        }
        return (long)long0;
    }

    public final void c() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffcd.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffcd ffcd0 = (ffcd)hftp0.b_message;
        ffcd0.b |= 2;
        ffcd0.e = 2;
        Map map0 = this.c.B();
        for(Object object0: map0.entrySet()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ffcc.a).v_newBuilder();
            String s = (String)((Map.Entry)object0).getKey();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ffcc ffcc0 = (ffcc)hftp1.b_message;
            s.getClass();
            ffcc0.b |= 1;
            ffcc0.c = s;
            long v = (long)(((Long)((Map.Entry)object0).getValue()));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ffcc ffcc1 = (ffcc)hftp1.b_message;
            ffcc1.b |= 2;
            ffcc1.d = v;
            ffcc ffcc2 = (ffcc)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffcd ffcd1 = (ffcd)hftp0.b_message;
            ffcc2.getClass();
            hfuo hfuo0 = ffcd1.d;
            if(!hfuo0.c()) {
                ffcd1.d = ProtoLiteMessage.E(hfuo0);
            }
            ffcd1.d.add(ffcc2);
        }
        String s1 = this.b;
        long v1 = map0.containsKey(s1) ? ((long)(((Long)map0.get(s1)))) : -1L;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffcd ffcd2 = (ffcd)hftp0.b_message;
        ffcd2.b |= 1;
        ffcd2.c = v1;
        ggeo ggeo0 = this.z.c();
        if(!this.i && ggeo0.containsKey(s1)) {
            ffaz ffaz0 = (ffaz)ggeo0.get(s1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffcd ffcd3 = (ffcd)hftp0.b_message;
            ffaz0.getClass();
            ffcd3.f = ffaz0;
            ffcd3.b |= 4;
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ffau.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ffau ffau0 = (ffau)hftp2.b_message;
        ffcd ffcd4 = (ffcd)hftp0.N_build();
        ffcd4.getClass();
        ffau0.i = ffcd4;
        ffau0.b |= 0x40;
        ffau ffau1 = (ffau)hftp2.N_build();
        if(fdvu.m() || hzvy.c()) {
            String s2 = ffdb.a(((ffcd)hftp0.N_build()));
            Log.v("datatransport", "doInitialDataSync: node=" + this.a + ", peer=" + s1 + ", sendingSyncStart=" + s2);
        }
        synchronized(this.k) {
            this.l = ggeo0;
            this.s.e();
            this.g.e();
            try {
                this.r.c(3, 0L, ffau1, null);
            }
            catch(IOException iOException0) {
                Log.d("datatransport", "  exception while sending syncStart to peer", iOException0);
            }
            catch(InterruptedException interruptedException0) {
                Log.d("datatransport", "  exception while sending syncStart to peer", interruptedException0);
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void d() {
        __monitor_enter(this.k);
        fdvt fdvt0 = this.m;
        this.m = null;
        __monitor_exit(this.k);
        if(fdvt0 != null) {
            try {
                fdvt0.close();
            }
            catch(IOException iOException0) {
                Log.w("datatransport", "Caught IOException when trying to close SyncStart thread.", iOException0);
            }
        }
        synchronized(this.k) {
            this.n = false;
            this.q = false;
            this.o = false;
            this.r = null;
            this.u = null;
            fdvr fdvr0 = this.s;
            if(fdvr0 != null) {
                fdvr0.f(false);
                ArrayList arrayList0 = this.A;
                arrayList0.add(this.s);
                while(arrayList0.size() > 20) {
                    arrayList0.remove(0);
                }
            }
            this.s = null;
            feua feua0 = this.w;
            if(feua0 != null) {
                AtomicBoolean atomicBoolean0 = feua0.c;
                if(atomicBoolean0.get()) {
                    atomicBoolean0.set(false);
                    feua0.e.run();
                }
                this.w = null;
            }
            if(fdvu.m() || hzvy.c()) {
                Log.v("datatransport", "onDisconnect complete: node=" + this.a + ", peer=" + this.b);
            }
        }
    }

    public final void f() {
        Object object0 = this.k;
        __monitor_enter(object0);
        fdwu fdwu0 = fdwu.a;
        if(this.v != fdwu0 && this.r != null && !this.i) {
            this.v = fdwu0;
            ffcd ffcd0 = this.u;
            this.u = null;
            __monitor_exit(object0);
            if(ffcd0 != null) {
                this.t = ffcd0.e < 2;
                if(ffcd0.e < 2) {
                    ffmn.d("datatransport", "Not evaluating migrating seqIds from V1 peer - no sync table present in sync start", new Object[0]);
                }
                else {
                    for(Object object1: ffcd0.d) {
                        ffcc ffcc0 = (ffcc)object1;
                        String s = ffcc0.c;
                        if(fdvl.W(s)) {
                            fdvl fdvl0 = this.c;
                            Long long0 = (long)ffcc0.d;
                            ffmn.a("DataServMigrationCtrl", "Recording %s as highest expected seqId from node %s", new Object[]{long0, s});
                            feny feny0 = fdvl0.o;
                            ReentrantReadWriteLock reentrantReadWriteLock0 = feny0.b;
                            reentrantReadWriteLock0.writeLock().lock();
                            try {
                                feny0.g.put(s, long0);
                            }
                            catch(Throwable throwable0) {
                                feny0.b.writeLock().unlock();
                                throw throwable0;
                            }
                            reentrantReadWriteLock0.writeLock().unlock();
                            Long long1 = (Long)gfsx.l(((Long)fdvl0.B().get(s))).f(Long.valueOf(-1L));
                            if(ffcc0.d <= ((long)long1)) {
                                ffmn.d("datatransport", "Already had seqId %s for node %s when receiving syncStart, marking all archived dataitems as arrived and attempting to deliver archives.", new Object[]{long1, s});
                                feny0.b(s);
                                fdvl0.L(s, "seq id edge case");
                            }
                        }
                    }
                }
            }
            this.c();
            this.g(ffcd0);
            return;
        }
        __monitor_exit(object0);
    }

    public final void g(ffcd ffcd0) {
        if(ffcd0 == null) {
            return;
        }
        this.t = ffcd0.e < 2;
        long v = ffcd0.c;
        HashMap hashMap0 = new HashMap();
        for(Object object0: ffcd0.d) {
            hashMap0.put(((ffcc)object0).c, Long.valueOf(((ffcc)object0).d));
        }
        if(fdvu.m() || hzvy.c()) {
            String s = ffdb.a(ffcd0);
            Log.v("datatransport", "respondToRemoteSyncStart: node=" + this.a + ", peer=" + this.b + ", remoteSyncStart=" + s);
        }
        synchronized(this.k) {
            if(this.i && hzys.c()) {
                if((ffcd0.b & 4) == 0) {
                label_23:
                    if((ffcd0.b & 4) == 0) {
                        String s2 = this.b;
                        if(this.l.containsKey(s2)) {
                            this.z.i(s2);
                            this.z.h(s2, null);
                        }
                    }
                }
                else {
                    String s1 = this.b;
                    if(!((ProtoLiteMessage)(ffcd0.f == null ? ffaz.a : ffcd0.f)).equals(this.l.getOrDefault(s1, null))) {
                        this.z.g(s1, (ffcd0.f == null ? ffaz.a : ffcd0.f));
                        this.z.h(s1, (ffcd0.f == null ? ffaz.a : ffcd0.f));
                        goto label_28;
                    }
                    goto label_23;
                }
            }
        label_28:
            this.B = hashMap0;
            fdwy fdwy0 = this.r;
            if(fdwy0 == null) {
                return;
            }
            ggeo ggeo0 = this.z.c();
            this.l = ggeo0;
            this.m = this.t ? new fdvt(this, "SyncStartV1-" + this.b, fdwy0, null, v, ggeo0) : new fdvt(this, "SyncStartV2-" + this.b, fdwy0, hashMap0, 0L, ggeo0);
            if(Log.isLoggable("datatransport", 3)) {
                Log.d("datatransport", "syncStart for thread " + this.m.getName());
            }
            this.m.start();
        }
    }

    public final void h(fdwy fdwy0, fduq fduq0) {
        fdwy fdwy1;
        if(fdvu.m()) {
            Log.v("datatransport", "sendDataItemToPeer: peer=" + this.b + ", " + fduq0);
        }
        Object object0 = this.k;
        synchronized(object0) {
            fdwy1 = this.r;
            if(fdwy1 == null) {
                if(fdvu.m()) {
                    Log.v("datatransport", "sendDataItemToPeer: no writer");
                }
                return;
            }
            goto label_10;
        }
        return;
    label_10:
        int v = fdwy1.a();
        String s = this.b;
        if(!this.c.Z(fduq0, v, false, s)) {
            long v1 = this.t ? fduq0.g : fduq0.f;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffau.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ffby.a).v_newBuilder();
            fdpl fdpl0 = fduq0.a;
            String s1 = fdpl0.b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            s1.getClass();
            ((ffby)hftv0).b |= 1;
            ((ffby)hftv0).c = s1;
            String s2 = fdpl0.d;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ffby ffby0 = (ffby)hftp1.b_message;
            s2.getClass();
            ffby0.b |= 2;
            ffby0.d = s2;
            String s3 = fduq0.b.c.toString();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            s3.getClass();
            ((ffby)hftv1).b |= 4;
            ((ffby)hftv1).e = s3;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp1.b_message;
            ((ffby)hftv2).b |= 16;
            ((ffby)hftv2).g = v1;
            boolean z = fduq0.c;
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp1.b_message;
            ((ffby)hftv3).b |= 0x20;
            ((ffby)hftv3).h = z;
            String s4 = fduq0.e;
            if(s4 != null) {
                if(!hftv3.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ffby ffby1 = (ffby)hftp1.b_message;
                ffby1.b |= 0x40;
                ffby1.i = s4;
            }
            byte[] arr_b = fduq0.b.e;
            if(arr_b != null) {
                ByteString hfsf0 = ByteString.copyFrom(arr_b);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ffby ffby2 = (ffby)hftp1.b_message;
                ffby2.b |= 8;
                ffby2.f = hfsf0;
            }
            Set set0 = fduq0.b.b().entrySet();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((ffby)hftp1.b_message).j = hfvv.a;
            for(Object object1: set0) {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fexz.a).v_newBuilder();
                fexy fexy0 = fexy.a;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp2.b_message;
                fexy0.getClass();
                ((fexz)hftv4).d = fexy0;
                ((fexz)hftv4).b |= 2;
                if(!hftv4.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((fexz)hftp2.b_message).e = 4;
                ((fexz)hftp2.b_message).b |= 4;
                String s5 = (String)((Map.Entry)object1).getKey();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                fexz fexz0 = (fexz)hftp2.b_message;
                s5.getClass();
                fexz0.b |= 1;
                fexz0.c = s5;
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)fexy0).v_newBuilder();
                String s6 = ((fdpo)((Map.Entry)object1).getValue()).b;
                batl.s(s6);
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                fexy fexy1 = (fexy)hftp3.b_message;
                fexy1.b |= 8;
                fexy1.c = s6;
                fexy fexy2 = (fexy)hftp3.N_build();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                fexz fexz1 = (fexz)hftp2.b_message;
                fexy2.getClass();
                fexz1.d = fexy2;
                fexz1.b |= 2;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ffby ffby3 = (ffby)hftp1.b_message;
                fexz fexz2 = (fexz)hftp2.N_build();
                fexz2.getClass();
                hfuo hfuo0 = ffby3.j;
                if(!hfuo0.c()) {
                    ffby3.j = ProtoLiteMessage.E(hfuo0);
                }
                ffby3.j.add(fexz2);
            }
            long v2 = fduq0.h;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ffby ffby4 = (ffby)hftp1.b_message;
            ffby4.b |= 0x80;
            ffby4.k = v2;
            ffby ffby5 = (ffby)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffau ffau0 = (ffau)hftp0.b_message;
            ffby5.getClass();
            ffau0.j = ffby5;
            ffau0.b |= 0x80;
            ffau ffau1 = (ffau)hftp0.N_build();
            try {
                synchronized(object0) {
                    fdvr fdvr0 = this.s;
                    if(fdvr0 != null) {
                        fdvr0.c();
                    }
                    this.g.c();
                    if(this.j) {
                        this.b(fduq0.e, v1);
                    }
                }
                fdwy0.c(3, fduq0.b.f, ffau1, null);
                if(hzxv.f()) {
                    fdnd fdnd0 = fdob.b().c;
                    if(fdnd0 != null) {
                        int v4 = fduq0.c ? 4 : 2;
                        fdnf fdnf0 = new fdnf();
                        fdnf0.b = v4;
                        fdnf0.c = 3;
                        fdnf0.a = 4;
                        fdnf0.b(fduq0);
                        fdnd0.a(fdnf0.a());
                    }
                }
            }
            catch(IOException iOException0) {
                if(Log.isLoggable("datatransport", 3)) {
                    goto label_163;
                }
                if(hzvy.c()) {
                label_163:
                    Log.d("datatransport", "  exception while sending dataItem to peer=" + this.b, iOException0);
                }
            }
            catch(InterruptedException interruptedException0) {
                if(Log.isLoggable("datatransport", 3)) {
                    Log.d("datatransport", "  exception while sending dataItem to peer" + this.b, interruptedException0);
                }
                else if(hzvy.c()) {
                    Log.d("datatransport", "  exception while sending dataItem to peer" + this.b, interruptedException0);
                }
                Thread.currentThread().interrupt();
            }
        }
        else if(Log.isLoggable("datatransport", 2)) {
            Log.v("datatransport", "sendDataItemToPeer: filtering data item for peer: " + s + ", uri=" + fduq0.b.c);
        }
    }

    public static boolean i(ggeo ggeo0, String s, String s1, String s2) {
        if(!hzys.c()) {
            if(Log.isLoggable("datatransport", 3)) {
                Log.d("datatransport", String.format("Connection restrictions flags are disabled for hostNodeId: %s, sending all data items to peerNodeId: %s", s1, s2));
            }
            return true;
        }
        return ggeo0.containsKey(s2) ? s.equals(s1) : !ggeo0.containsKey(s);
    }

    public final boolean j(boolean z) {
        fdvt fdvt0;
        if(!this.j) {
            return false;
        }
        synchronized(this.k) {
            if(this.r == null) {
                Log.d("datatransport", "flushPendingDataItems: no MessageWriter, not flushing pending data.");
                return false;
            }
            if(!this.o) {
                Log.d("datatransport", "flushPendingDataItems: data sending is not paused, not flushing as there is no pending data to sync.");
                return false;
            }
            if(z) {
                this.o = false;
                Log.d("datatransport", "Data sending resumed.");
            }
            if(!this.n) {
                Log.d("datatransport", "flushPendingDataItems: initial data sync not finished, no need to start a new sync loop to flush pending data items.");
                return true;
            }
            this.n = false;
            fdvt0 = this.m;
            this.m = new fdvt(this, "SyncStartV2-" + this.b, this.r, this.B, 0L, this.z.c());
            if(Log.isLoggable("datatransport", 3)) {
                Log.d("datatransport", "Syncing over all pending data items that were held when data sending was paused. SyncStartThread started: " + this.m.getName());
            }
            fdvq fdvq0 = this.h;
            fdvq0.a.lock();
            try {
                fdvq0.c += fdvq0.b;
                ++fdvq0.d;
                ArrayList arrayList0 = fdvq0.e;
                arrayList0.add(Pair.create(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(fdvq0.b)));
                while(arrayList0.size() > 10) {
                    arrayList0.remove(0);
                }
                fdvq0.b = 0;
            }
            finally {
                fdvq0.a.unlock();
            }
            fdny.a(fdns.i);
            this.m.start();
        }
        if(fdvt0 != null) {
            try {
                fdvt0.close();
                return true;
            }
            catch(IOException iOException0) {
                Log.w("datatransport", "Caught IOException when trying to close SyncStart thread.", iOException0);
            }
        }
        return true;
    }

    static void k(fdvu fdvu0) {
        fdvu0.n = true;
    }

    static void l(fdvu fdvu0) {
        fdvu0.q = false;
    }

    public static final boolean m() {
        return Log.isLoggable("datatransport", 2) || Log.isLoggable("WearableVerbose", 2);
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        synchronized(this.k) {
            bbpd0.println("Connection to peer node: " + this.b);
            bbpd0.c("initialSyncFinished", Boolean.valueOf(this.n));
            bbpd0.c("pendingDataItems", Boolean.valueOf(this.q));
            bbpd0.c("dataSyncMode", this.v);
            bbpd0.c("dataSendingPauseAllowed", Boolean.valueOf(this.j));
            bbpd0.println();
            if(this.l != null) {
                bbpd0.println("Connection Restrictions: ");
                bbpd0.b();
                ggqj ggqj0 = this.l.w().om();
                while(ggqj0.hasNext()) {
                    Object object1 = ggqj0.next();
                    bbpd0.println(a.w(((String)object1), ": "));
                    bbpd0.println(ffcz.c(((ffaz)this.l.get(((String)object1)))));
                    bbpd0.println();
                }
                bbpd0.a();
            }
        }
        bbpd0.println();
        synchronized(this.k) {
            bbpd0.print("Total ");
            this.g.a(bbpd0);
            bbpd0.println();
            bbpd0.print("Current ");
            fdvr fdvr0 = this.s;
            if(fdvr0 == null) {
                bbpd0.print("[not connected]");
            }
            else {
                fdvr0.a(bbpd0);
            }
            bbpd0.println();
            ArrayList arrayList0 = this.A;
            int v2 = arrayList0.size();
            for(int v4 = 0; v4 < v2; ++v4) {
                if(v4 == 0) {
                    bbpd0.println();
                    v4 = 0;
                }
                bbpd0.print("Historic ");
                ((fdvr)arrayList0.get(v2 - v4 - 1)).a(bbpd0);
                bbpd0.println();
            }
            if(this.w != null) {
                bbpd0.print("Data item sync tracking");
                bbpd0.b();
                this.w.md(bbpd0, z, z1);
                bbpd0.a();
                bbpd0.println();
            }
            if(this.j) {
                bbpd0.println("Data batching stats:");
                bbpd0.b();
                bbpd0.c("dataSendingPaused", Boolean.valueOf(this.o));
                fdvq fdvq0 = this.h;
                fdvq0.a.lock();
                try {
                    bbpd0.c("pendingDataItemsCount", Integer.valueOf(fdvq0.b));
                    bbpd0.c("batchedDataItemsTotalCount", Integer.valueOf(fdvq0.c));
                    bbpd0.c("pendingDataItemsFlushCount", Integer.valueOf(fdvq0.d));
                    bbpd0.c("dataItemAutoflushCount", Integer.valueOf(fdvq0.f));
                    bbpd0.println();
                    bbpd0.println("Data flush history:");
                    bbpd0.b();
                    ArrayList arrayList1 = fdvq0.e;
                    int v6 = arrayList1.size();
                    for(int v3 = 0; v3 < v6; ++v3) {
                        Pair pair0 = (Pair)arrayList1.get(v6 - v3 - 1);
                        bbpd0.printf("%s: flushed %d data items", new Object[]{ffmi.a(((Long)pair0.first).longValue()), pair0.second});
                        bbpd0.println();
                    }
                    bbpd0.a();
                }
                finally {
                    fdvq0.a.unlock();
                }
                bbpd0.println();
                if(this.x != null) {
                    bbpd0.println("Autoflush Filters: ");
                    bbpd0.b();
                    for(Object object3: this.x) {
                        bbpd0.println(ffcz.a(((feyu)object3)));
                    }
                    bbpd0.a();
                }
                bbpd0.a();
                bbpd0.println();
            }
        }
    }

    public static final feyu n(fdun fdun0, List list0) {
        for(Object object0: list0) {
            feyu feyu0 = (feyu)object0;
            Uri uri0 = Uri.parse(feyu0.d);
            if(uri0.getHost().equals("*") || uri0.getHost().equals(fdun0.a)) {
                int v = feyu0.c;
                if(feyw.a(v) == 2) {
                    if(!uri0.getPath().equals(fdun0.b)) {
                        continue;
                    }
                    return feyu0;
                }
                else {
                    if(feyw.a(v) != 3) {
                        continue;
                    }
                    String s = uri0.getPath();
                    if(s != null && (s.isEmpty() || s.charAt(s.length() - 1) != 0x2F)) {
                        s = s + "/";
                    }
                    if(fdun0.b.startsWith(s)) {
                        return feyu0;
                    }
                    continue;
                }
                break;
            }
        }
        return null;
    }
}


import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

public final class fdvv implements fduo, fdwx, ffmj {
    public final Map a;
    private final fdvl b;
    private final ffew c;
    private final felo d;
    private final fdpl e;
    private final boolean f;
    private final fedp g;
    private final fdye h;

    public fdvv(fdye fdye0, fdvl fdvl0, ffew ffew0, felo felo0, fedp fedp0, fdpl fdpl0, boolean z) {
        this.a = new ConcurrentHashMap();
        gftb.check(fdye0);
        this.h = fdye0;
        this.b = fdvl0;
        this.c = ffew0;
        this.d = felo0;
        this.g = fedp0;
        gftb.check(fdpl0);
        this.e = fdpl0;
        this.f = z;
    }

    @Override  // fdwx
    public final void f(String s, ffau ffau0, fdwt fdwt0) {
        long v3;
        Uri uri1;
        fdvu fdvu0 = (fdvu)this.a.get(s);
        if(fdvu0 == null) {
            Log.e("datatransport", "Received message from a disconnected node. Migrating? Node: " + s);
            return;
        }
        int v = ffau0.b;
        if((v & 0x40) != 0) {
            ffcd ffcd0 = ffau0.i == null ? ffcd.a : ffau0.i;
            synchronized(fdvu0.k) {
                if(!fdvu0.i) {
                    fdwu fdwu0 = fdvu0.v;
                    if(fdwu0 == fdwu.b) {
                        Log.d("datatransport", "Not responding to SyncStart message since initial data sync is turned off");
                        fdvu0.u = ffcd0;
                        return;
                    }
                    if(fdwu0 == fdwu.c) {
                        if(Log.isLoggable("datatransport", 4)) {
                            Log.i("datatransport", "Enabling initial data sync because we received a SyncStart");
                        }
                        fdvu0.u = ffcd0;
                        fdvu0.f();
                        return;
                    }
                }
            }
            fdvu0.g(ffcd0);
            return;
        }
        if((v & 0x80) != 0) {
            ffby ffby0 = ffau0.j == null ? ffby.a : ffau0.j;
            if(fdvu.m()) {
                Log.d("datatransport", "handleSetDataItem: node=" + fdvu0.a + ", peer=" + fdvu0.b + ", " + ffby0.e + ", sourceNode=" + ffby0.i + ", seqId=" + ffby0.g + ", lastModified=" + ffby0.k + ", deleted=" + ffby0.h);
            }
            String s1 = fdvu0.t ? fdvu0.b : ffby0.i;
            synchronized(fdvu0.k) {
                v3 = fdvu0.b(s1, ffby0.g);
            }
            fdpl fdpl0 = fdpl.a(ffby0.c, ffby0.d);
            if(fdvu0.f.equals(fdpl0)) {
                Uri uri0 = Uri.parse(ffby0.e);
                if(fdqk.A(uri0.getPath())) {
                    String s2 = uri0.getAuthority();
                    fdpl fdpl1 = fdqk.i(uri0);
                    fdpl fdpl2 = fdvu0.d.a(s2, fdpl1);
                    uri1 = fdpl1.equals(fdpl2) ? null : fdqk.g(fdpl2, uri0.getAuthority(), fdqk.n(uri0)).build();
                }
                else {
                    uri1 = null;
                }
            }
            else {
                fdpl0 = fdvu0.d.a(s1, fdpl0);
                uri1 = null;
            }
            if(fdpl0 == null) {
                fdpl0 = fdpl.a(ffby0.c, ffby0.d);
            }
            fduq fduq0 = new fduq(fdpl0);
            fduq0.f = ffby0.g;
            fduq0.g = -1L;
            fduq0.e = s1;
            fduq0.c = ffby0.h;
            fduq0.h = ffby0.k;
            if(uri1 == null) {
                uri1 = Uri.parse(ffby0.e);
            }
            String s3 = uri1.getHost();
            batl.s(s3);
            String s4 = uri1.getPath();
            batl.s(s4);
            fduq0.b = new fdun(s3, s4);
            fdun fdun0 = fduq0.b;
            fdun0.e = ffby0.f.toByteArray();
            fdun fdun1 = fduq0.b;
            if(ffby0.j.size() != 0) {
                for(Object object1: ffby0.j) {
                    String s5 = ((fexz)object1).c;
                    fexy fexy0 = ((fexz)object1).d;
                    if(fexy0 == null) {
                        fexy0 = fexy.a;
                    }
                    fdun1.d(s5, new fdpo(null, fexy0.c, null));
                }
            }
            fdvu0.d.k(fduq0);
            gmbu.t(fdvu0.c.p(fduq0, fdvu0.b), new fdvp(fdvu0, s1, v3, ffby0), gmap.a);
            synchronized(fdvu0.k) {
                fdvr fdvr0 = fdvu0.s;
                if(fdvr0 != null) {
                    fdvr0.b();
                }
                fdvu0.g.b();
            }
            if(fdvu.m()) {
                Log.d("datatransport", "handleSetDataItem is done: peer=" + fdvu0.b);
            }
        }
    }

    @Override  // fdwx
    public final void g(String s, fdww fdww0) {
        fdvu fdvu0 = (fdvu)this.a.get(s);
        if(fdvu0 != null) {
            if(fdww0.a == fdwu.a) {
                fdvu0.f();
            }
            return;
        }
        Log.e("datatransport", String.format("Trying to update the configuration of a data transport that was never connected for peer id: %s. You probably want to call onMessageWriterAdded first. No action taken.", s));
    }

    @Override  // fdwx
    public final void h(fdwy fdwy0, fdww fdww0) {
        SQLiteDatabase sQLiteDatabase0;
        String s = this.h.a().a;
        Map map0 = this.a;
        String s1 = ((fdzb)fdwy0).a.a;
        fdvu fdvu0 = (fdvu)map0.get(s1);
        if(fdvu0 == null) {
            fdvu fdvu1 = new fdvu(s, s1, this.b, this.c, this.d, this.g, this.e, this.f);
            map0.put(s1, fdvu1);
            fdvu0 = fdvu1;
        }
        fdwu fdwu0 = fdww0.a;
        if(fdvu.m()) {
            Log.v("datatransport", "onConnect");
        }
        if(hzvy.a.b().d()) {
            fdvl fdvl0 = fdvu0.c;
            String s2 = fdvu0.b;
            if(!fdvl0.h) {
                if(s2 == null) {
                    Log.e("DataItems", "NodeId cannot be null. Bailing purgeNodeWhenRevokedNodeReconnects");
                }
                else {
                    try {
                        sQLiteDatabase0 = fdvl0.c.getWritableDatabase();
                    }
                    catch(SQLiteException sQLiteException0) {
                        Log.e("DataItems", "Exception getting db. Bailing purgeNodeWhenRevokedNodeReconnects " + s2, sQLiteException0);
                        goto label_44;
                    }
                    Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT node, seqId FROM nodeinfo WHERE node=?", new String[]{s2});
                    try {
                        if(cursor0.getCount() == 0) {
                            goto label_29;
                        }
                        else {
                            goto label_31;
                        }
                        goto label_44;
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(cursor0, throwable0);
                        throw throwable0;
                    }
                label_29:
                    cursor0.close();
                    goto label_44;
                label_31:
                    cursor0.close();
                    try(Cursor cursor1 = sQLiteDatabase0.query("dataItemsAndAssets", fdxc.a, "host=?", new String[]{s2}, null, null, "packageName, signatureDigest, host, path", "1")) {
                        if(cursor1.getCount() == 0) {
                            goto label_40;
                        }
                    }
                    goto label_44;
                label_40:
                    if(Log.isLoggable("DataItems", 3)) {
                        Log.d("DataItems", a.a(s2, "NodeId ", " reconnecting after being purged, removing NodeInfo data"));
                    }
                    fdvl0.Q(sQLiteDatabase0, s2, true);
                    fdny.a(fdns.m);
                }
            }
        }
    label_44:
        synchronized(fdvu0.k) {
            if(fdvu0.r != null) {
                if(fdvu.m() || hzvy.c()) {
                    Log.v("datatransport", "onConnect: Cleaning up previous connection.");
                }
                fdvu0.d();
            }
            fdvu0.v = fdwu0;
            fdvu0.n = false;
            fdvu0.q = false;
            fdvu0.r = fdwy0;
            fdvu0.s = new fdvr();
            fdvu0.s.f(true);
            if(fdvu0.v != fdwu.a && !fdvu0.i) {
                if(Log.isLoggable("datatransport", 3)) {
                    Log.d("datatransport", "SyncStart message will not be sent to the remote since it is turned off");
                }
                return;
            }
        }
        fdvu0.c();
    }

    @Override  // fdwx
    public final void i(String s) {
        fdvu fdvu0 = (fdvu)this.a.get(s);
        if(fdvu0 == null) {
            return;
        }
        fdvu0.d();
    }

    @Override  // fdwx
    public final boolean j() {
        return false;
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.b();
        bbpd0.println("local: " + this.h.a().a);
        for(Object object0: this.a.values()) {
            bbpd0.println("======");
            ((fdvu)object0).md(bbpd0, z, z1);
        }
        bbpd0.println("======");
        bbpd0.a();
    }

    // This method was un-flattened
    @Override  // fduo
    public final void o(ArrayList arrayList0) {
        int v4;
        Lock lock0;
        Iterator iterator1;
        String s1;
        if(Log.isLoggable("datatransport", 2)) {
            Log.v("datatransport", "onDataItemsChanged: " + arrayList0.size());
        }
        Iterator iterator0 = this.a.values().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            fdvu fdvu0 = (fdvu)object0;
            int v = arrayList0.size();
            int v1 = 0;
            while(v1 < v) {
                fduq fduq0 = (fduq)arrayList0.get(v1);
                Object object1 = fdvu0.k;
                __monitor_enter(object1);
                int v2 = FIN.finallyOpen$NT();
                String s = fduq0.e;
                long v3 = fdvu0.a(s);
                fdwy fdwy0 = fdvu0.r;
                if(fdwy0 == null) {
                    s1 = "there is no message writer";
                    iterator1 = iterator0;
                    goto label_101;
                }
                else if(fdvu0.t && fduq0.e.equals(fdvu0.b)) {
                    s1 = "this item came from this peer";
                    iterator1 = iterator0;
                    goto label_101;
                }
                else if(!fdvu0.t && fduq0.f <= v3) {
                    s1 = "the peer is already at this seqId for this source";
                    iterator1 = iterator0;
                    goto label_101;
                }
                else if(fdvu0.n) {
                    ggeo ggeo0 = fdvu0.l;
                    if(hzys.c()) {
                        String s2 = fdvu0.a;
                        String s3 = fdvu0.b;
                        if(!fdvu.i(ggeo0, fduq0.e, s2, s3)) {
                            if(Log.isLoggable("datatransport", 3)) {
                                Log.d("datatransport", String.format("Not allowed to send the data item %s, from nodeId: %s to peerNodeId: %s", fduq0, s2, s3));
                            }
                            s1 = "did not meet the given connection restrictions.";
                            iterator1 = iterator0;
                            goto label_101;
                        }
                        else if(ggeo0.containsKey(s3)) {
                            ffaz ffaz0 = (ffaz)ggeo0.get(s3);
                            for(Object object2: ffaz0.b) {
                                ffbk ffbk0 = (ffbk)object2;
                                if(!ffbk0.c.equals(fduq0.a.b) || (ffbk0.b & 2) != 0 && fdvu.n(fduq0.b, (ffbk0.d == null ? feyx.a : ffbk0.d).b) == null) {
                                    continue;
                                }
                                else {
                                    goto label_56;
                                }
                                break;
                            }
                            if(Log.isLoggable("datatransport", 3)) {
                                Log.d("datatransport", String.format("Not allowed to send the data item %s, with the constraints: %s", fduq0, ffcz.c(ffaz0)));
                            }
                            s1 = "did not meet the given connection restrictions.";
                            iterator1 = iterator0;
                            goto label_101;
                        }
                    }
                label_56:
                    String s4 = fdvu0.b;
                    hzvv.d();
                    if(hzvv.c()) {
                        fedp fedp0 = fdvu0.e;
                        if(fedp0 != null && !fdvu0.i) {
                            fdpl fdpl0 = fduq0.a;
                            if(!fedp0.f(s4, fdpl0)) {
                                s1 = "DataTargetValidation - the app is not installed on the target node";
                                fdny.c(fdns.l, fdpl0.b, fdpl0.c);
                                iterator1 = iterator0;
                                goto label_101;
                            }
                        }
                    }
                    if(fdvu0.o) {
                        fdvu0.q = true;
                        if(fdvu0.y == null) {
                        label_94:
                            s1 = "sending data items to this peer is paused";
                            iterator1 = iterator0;
                            lock0 = fdvu0.h.a;
                            lock0.lock();
                        }
                        else {
                            List list0 = fdvu0.x;
                            if(list0 == null) {
                                s1 = "sending data items to this peer is paused";
                                iterator1 = iterator0;
                                lock0 = fdvu0.h.a;
                                lock0.lock();
                                goto label_98;
                            }
                            else {
                                feyu feyu0 = fdvu.n(fduq0.b, list0);
                                if(feyu0 != null && Log.isLoggable("datatransport", 2)) {
                                    iterator1 = iterator0;
                                    Log.v("datatransport", String.format("matchesAutoFlushFilter: Matched with %s", ffcz.a(feyu0)));
                                }
                                else {
                                    iterator1 = iterator0;
                                }
                                if(feyu0 == null) {
                                    s1 = "sending data items to this peer is paused";
                                    lock0 = fdvu0.h.a;
                                    lock0.lock();
                                    goto label_98;
                                }
                                else {
                                    s1 = "sending data items to this peer is paused";
                                    fdvu0.y.b.execute(new felt(fdvu0.y, s4));
                                    fdvu0.h.a.lock();
                                    ++fdvu0.h.f;
                                    fdvu0.h.a.unlock();
                                    goto label_101;
                                }
                            }
                            goto label_94;
                        }
                    label_98:
                        ++fdvu0.h.b;
                        lock0.unlock();
                        fdny.c(fdns.h, fduq0.a.b, fduq0.a.c);
                    label_101:
                        if(fdvu.m()) {
                            v4 = v;
                            Log.v("datatransport", "sendDataItemRecord: not sending data item, node=" + fdvu0.a + ", peer=" + fdvu0.b + ", peerSeqId=" + v3 + ", sourceNode=" + s + ", dataSeqId=" + fduq0.f + ", dataItem=" + fduq0 + ", because " + s1);
                        }
                        else {
                            v4 = v;
                        }
                        FIN.finallyExec$NT(v2);
                    }
                    else {
                        iterator1 = iterator0;
                        v4 = v;
                        FIN.finallyCodeBegin$NT(v2);
                        fdvu0.h(fdwy0, fduq0);
                    }
                }
                else {
                    s1 = "initial sync is in progress";
                    fdvu0.q = true;
                    iterator1 = iterator0;
                    goto label_101;
                }
                ++v1;
                v = v4;
                iterator0 = iterator1;
            }
        }
    }
}


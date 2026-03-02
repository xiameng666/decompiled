import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.Log;
import j..util.Objects;
import j..util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class fdrv {
    final fdsh a;
    private final ConcurrentLinkedQueue b;

    public fdrv(fdsh fdsh0) {
        Objects.requireNonNull(fdsh0);
        this.a = fdsh0;
        super();
        this.b = new ConcurrentLinkedQueue();
    }

    public final void a(fdty fdty0) {
        ConcurrentLinkedQueue concurrentLinkedQueue0 = this.b;
        if(concurrentLinkedQueue0.contains(fdty0)) {
            return;
        }
        concurrentLinkedQueue0.offer(fdty0);
    }

    public final boolean b(String s) {
        fdvk fdvk0;
        fdsi fdsi0;
        HashSet hashSet0;
        String s4;
        hlat hlat0;
        String s2;
        fdwc fdwc1;
        Set set0;
        fdtx fdtx0;
        String s1;
        fdrv fdrv0 = this;
        ConcurrentLinkedQueue concurrentLinkedQueue0 = fdrv0.b;
        fdty fdty0 = (fdty)concurrentLinkedQueue0.peek();
        if(fdty0 != null && Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "processAssetsDownload: there are assets to fetch, processing...");
        }
        boolean z = false;
        while(fdty0 != null) {
            fdsh fdsh0 = fdrv0.a;
            if(!fdsh0.s()) {
                break;
            }
            if(fdty0.b) {
                fdsh.i(fdsh0.z);
                long v = SystemClock.elapsedRealtime();
                try {
                    s1 = fdsh0.h.a(fdty0.a);
                    fdsh.v(9, v, 1);
                }
                catch(fdsp | IOException exception0) {
                    fdsh.w(9, v, exception0);
                    throw exception0;
                }
            }
            else {
                s1 = null;
            }
            fdwc fdwc0 = fdsh0.k;
            fdwc0.a("getAssetAcl");
            fdsh.i(fdsh0.z);
            long v1 = SystemClock.elapsedRealtime();
            try {
                fdtx0 = fdsh0.H;
                set0 = Collections.singleton(fdty0.a);
                fdwc1 = fdtx0.b;
                fdwc1.a(":getAssetAcls");
                s2 = "";
            }
            catch(fdsp | IOException exception1) {
                fdsh.w(10, v1, exception1);
                throw exception1;
            }
            try {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlas.a).v_newBuilder();
                long v2 = Long.parseLong(s);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hlas)hftp0.b_message).d = v2;
                String s3 = fdtx0.f();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hlas hlas0 = (hlas)hftp0.b_message;
                s3.getClass();
                hlas0.e = s3;
                List list0 = fdsq.a();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hlas hlas1 = (hlas)hftp0.b_message;
                hfuo hfuo0 = hlas1.g;
                if(!hfuo0.c()) {
                    hlas1.g = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(list0, hlas1.g);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hlas hlas2 = (hlas)hftp0.b_message;
                hfuo hfuo1 = hlas2.f;
                if(!hfuo1.c()) {
                    hlas2.f = ProtoLiteMessage.E(hfuo1);
                }
                hfrj.E(set0, hlas2.f);
                hlas hlas3 = (hlas)hftp0.N_build();
                fdtj fdtj0 = new fdtj();
                fdtk fdtk0 = new fdtk();
                hlan hlan0 = fdtx0.e(claj.b);
                Objects.requireNonNull(hlan0);
                hlat0 = (hlat)fdtx0.c("GetAssetAcls", ((MessageLite)hlas3), fdtj0, fdtk0, new fdtl(hlan0));
                s4 = String.format(Locale.US, "numAcls: %d", hlat0.b.size());
                goto label_64;
            }
            catch(iapn iapn0) {
                goto label_85;
                try {
                label_64:
                    hashSet0 = new HashSet();
                    Iterator iterator0 = hlat0.b.iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            goto label_93;
                        }
                        Object object0 = iterator0.next();
                        hlbh hlbh0 = (hlbh)object0;
                        if(hlbh0.c.size() == 0) {
                            Log.w("CloudNode", "Incomplete asset received on client: " + hlbh0.b);
                            throw new iapn(iapk.n.f("unable to create AssetAcl because no acl array was provided"));
                        }
                        HashSet hashSet1 = new HashSet();
                        for(Iterator iterator1 = hlbh0.c.iterator(); iterator1.hasNext(); iterator1 = iterator1) {
                            Object object1 = iterator1.next();
                            hashSet1.add(fdpl.a(((hlbg)object1).b, ((hlbg)object1).c));
                            concurrentLinkedQueue0 = concurrentLinkedQueue0;
                        }
                        hashSet0.add(new fdsi(hlbh0.b, hashSet1));
                        concurrentLinkedQueue0 = concurrentLinkedQueue0;
                    }
                }
                catch(iapn iapn0) {
                }
                catch(Throwable throwable0) {
                    goto label_91;
                }
                s2 = s4;
                try {
                label_85:
                    fdtx.i(iapn0);
                    throw new AssertionError("unreachable", iapn0);
                }
                catch(Throwable throwable0) {
                    s4 = s2;
                }
            }
            catch(Throwable throwable0) {
                s4 = s2;
            }
            try {
            label_91:
                fdtx0.b.c(":getAssetAcls", s4);
                throw throwable0;
            label_93:
                fdwc1.c(":getAssetAcls", s4);
                Object object2 = hashSet0.iterator().next();
                fdsi0 = (fdsi)object2;
                if(fdsh0.p()) {
                    try {
                        fdsi0 = new fdsi(fdsh0.m.d(fdsi0.a), fdsi0.b);
                    }
                    catch(GeneralSecurityException generalSecurityException0) {
                        throw new fdsp(3, "Failed to decrypt asset ACL", generalSecurityException0);
                    }
                }
                fdsh.v(10, v1, 1);
            }
            catch(fdsp | IOException exception1) {
                fdsh.w(10, v1, exception1);
                throw exception1;
            }
            fdwc0.b("getAssetAcl");
            if(fdsi0 != null) {
                fdvl fdvl0 = fdsh0.g;
                Set set1 = fdsi0.b;
                String s5 = fdsi0.a;
                if(Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", "addAsset from cloud for digest: " + s5);
                }
                SQLiteDatabase sQLiteDatabase0 = fdvl0.c.getWritableDatabase();
                sQLiteDatabase0.beginTransaction();
                try {
                    fdvk0 = fdvl0.l(sQLiteDatabase0, s5, s1 != null, set1);
                    if(Log.isLoggable("DataItems", 3)) {
                        Log.d("DataItems", "Asset metadata written from cloud asset, number of data items to notify: " + fdvk0.a.size());
                        for(Object object3: fdvk0.a) {
                            Log.d("DataItems", "Changed data item id: " + ((String)object3));
                        }
                    }
                    sQLiteDatabase0.setTransactionSuccessful();
                }
                catch(Throwable throwable1) {
                    sQLiteDatabase0.endTransaction();
                    throw throwable1;
                }
                sQLiteDatabase0.endTransaction();
                boolean z1 = fdvk0.c;
                if(z1 || fdvk0.d) {
                    fdvl0.d.b(s5, z1, null, set1);
                }
                fdvl0.M(fdvk0.a);
                fdvl0.K(sQLiteDatabase0, fdvk0.b);
            }
            concurrentLinkedQueue0.poll();
            fdty0 = (fdty)concurrentLinkedQueue0.peek();
            fdrv0 = this;
            z = true;
            concurrentLinkedQueue0 = concurrentLinkedQueue0;
        }
        return z;
    }
}


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jeb.synthetic.TWR;

public final class ebip extends ebhb {
    public static final bboh a;
    bbng b;
    cqxc c;
    ebgp d;
    easu e;
    dtrw f;
    private final ftha g;

    static {
        ebip.a = bboh.b("Pay", bbcu.cZ);
    }

    private ebip(ftha ftha0) {
        this.g = ftha0;
    }

    @Override  // ebhb
    public final void b(ebhc ebhc0) {
        HashMap hashMap1;
        long v4;
        int v3;
        Iterator iterator2;
        gged_interceptors gged0;
        String s = this.g.c;
        gftb.b(((boolean)(gfta.c(s) ^ 1)), "SyncIssuerDisplayConfig requests requires a languageCode");
        try {
            evql evql0 = this.c.l();
            HashMap hashMap0 = new HashMap();
            dtrw dtrw0 = this.f;
            Cursor cursor0 = dmhk.d(dtrw0.f).c().query("IssuerDisplayInfo", dtrw.a, dtrw.e, new String[]{dtrw0.g, dtrw0.h}, null, null, null);
            try {
                ggdy ggdy0 = new ggdy();
                while(cursor0.moveToNext()) {
                    fshn fshn0 = dtrw.a(cursor0);
                    if(fshn0 != null) {
                        ggdy0.i(fshn0);
                    }
                }
                gged0 = ggdy0.h();
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
            cursor0.close();
            ggqk ggqk0 = gged0.E();
            while(ggqk0.hasNext()) {
                Object object0 = ggqk0.next();
                hashMap0.put(((fshn)object0).c, ((fshn)object0));
            }
            evrg.o(evql0, 60000L, TimeUnit.MILLISECONDS);
            hfuo hfuo0 = ((gtxe)evql0.j()).b;
            long v = System.currentTimeMillis();
            CountDownLatch countDownLatch0 = new CountDownLatch(hfuo0.size());
            ebin ebin0 = new ebin(countDownLatch0);
            ebio ebio0 = new ebio(countDownLatch0);
            bboh bboh0 = ebip.a;
            ((ggtj)((ggtj)bboh0.h()).ar(0x2FD7)).R("Syncing %s display configs and %s mdls", new foqe(((long)hashMap0.size())), new foqe(((long)hfuo0.size())));
            int v1 = 0;
            Iterator iterator0 = hfuo0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    for(Object object1: hashMap0.keySet()) {
                        ((ggtj)((ggtj)ebip.a.h()).ar(0x2FDA)).x("Removing display config");
                        dtrw dtrw1 = this.f;
                        SQLiteDatabase sQLiteDatabase0 = dmhk.d(dtrw1.f).c();
                        sQLiteDatabase0.beginTransaction();
                        try {
                            sQLiteDatabase0.delete("IssuerDisplayInfo", dtrw.c, new String[]{((String)object1), dtrw1.g, dtrw1.h});
                            sQLiteDatabase0.setTransactionSuccessful();
                        }
                        finally {
                            sQLiteDatabase0.endTransaction();
                        }
                    }
                    if(v1 > 0) {
                        if(!countDownLatch0.await(60000L, TimeUnit.MILLISECONDS)) {
                            throw new cjuh(8, "Timed out waiting for syncDisplayConfig RPCs to complete");
                        }
                        this.e.a();
                        ((ggtj)((ggtj)ebip.a.h()).ar(0x2FD9)).x("Finished updating display configs");
                    }
                    else {
                        ((ggtj)((ggtj)ebip.a.h()).ar(0x2FD8)).x("No display configs to update");
                    }
                    ebhc0.b(ftcg.a);
                    return;
                }
                Object object2 = iterator0.next();
                gtxg gtxg0 = (gtxg)object2;
                String s1 = gtxg0.b;
                fshn fshn1 = (fshn)hashMap0.remove(s1);
                if(fshn1 == null) {
                    iterator2 = iterator0;
                    v3 = v1;
                    v4 = v;
                    goto label_79;
                }
                else {
                    long v5 = System.currentTimeMillis();
                    iterator2 = iterator0;
                    v3 = v1;
                    long v6 = fshn1.h;
                    v4 = v;
                    long v7 = ebip.e(fshm.a, 60000L);
                    if(gfqz.e(fshn1.f, s)) {
                    label_78:
                        if(v6 + ebip.e((fshm.b(fshn1.g) == null ? fshm.e : fshm.b(fshn1.g)), v7) < v5) {
                        label_79:
                            if(fshn1 == null) {
                                hashMap1 = hashMap0;
                                goto label_96;
                            }
                            else {
                                dtrw dtrw2 = this.f;
                                long v8 = fshn1.h;
                                SQLiteDatabase sQLiteDatabase1 = dmhk.d(dtrw2.f).c();
                                sQLiteDatabase1.beginTransaction();
                                try {
                                    ContentValues contentValues0 = new ContentValues();
                                    hashMap1 = hashMap0;
                                    contentValues0.put("last_update_status", "U");
                                    contentValues0.put("last_update_timestamp_in_millis", Long.valueOf(v4));
                                    sQLiteDatabase1.setTransactionSuccessful();
                                }
                                finally {
                                    sQLiteDatabase1.endTransaction();
                                }
                                if(sQLiteDatabase1.update("IssuerDisplayInfo", contentValues0, dtrw.d, new String[]{s1, Long.toString(v8), dtrw2.g, dtrw2.h}) > 0) {
                                label_96:
                                    if((gtxf.b(gtxg0.h) == null ? gtxf.f : gtxf.b(gtxg0.h)) == gtxf.a) {
                                        gtvt gtvt0 = dtnn.b(gtxg0);
                                        if((gtvs.b(gtvt0.c) == null ? gtvs.m : gtvs.b(gtvt0.c)) == gtvs.f) {
                                            goto label_104;
                                        }
                                        else {
                                            ((ggtj)((ggtj)bboh0.h()).ar(0x2FDC)).B("Not updating display config for mdoc with status %s", new foqj((gtvs.b(gtvt0.c) == null ? gtvs.m : gtvs.b(gtvt0.c))));
                                            countDownLatch0.countDown();
                                            goto label_118;
                                        }
                                        goto label_102;
                                    }
                                    else {
                                    label_102:
                                        gtxd gtxd0 = dual.b(gtxg0);
                                        if((gtxb.b(gtxd0.c) == null ? gtxb.n : gtxb.b(gtxd0.c)) == gtxb.f) {
                                        label_104:
                                            ((ggtj)((ggtj)bboh0.h()).ar(0x2FDB)).x("Updating display config");
                                            this.d.a(s1, s, ebin0, ebio0);
                                            v1 = v3 + 1;
                                            iterator0 = iterator2;
                                            goto label_120;
                                        }
                                        else {
                                            ((ggtj)((ggtj)bboh0.h()).ar(0x2FDD)).B("Not updating display config for mdoc with status %s", new foqj((gtxb.b(gtxd0.c) == null ? gtxb.n : gtxb.b(gtxd0.c))));
                                            countDownLatch0.countDown();
                                            goto label_118;
                                        }
                                    }
                                    goto label_112;
                                }
                                else {
                                label_112:
                                    ((ggtj)((ggtj)bboh0.h()).ar(0x2FDE)).x("Failed to set display config status");
                                    countDownLatch0.countDown();
                                    goto label_118;
                                }
                            }
                            goto label_115;
                        }
                        else {
                        label_115:
                            hashMap1 = hashMap0;
                            ((ggtj)((ggtj)bboh0.h()).ar(0x2FDF)).B("Not updating display config with status %s", new foqj((fshm.b(fshn1.g) == null ? fshm.e : fshm.b(fshn1.g))));
                            countDownLatch0.countDown();
                        }
                    }
                    else {
                        if(v6 + v7 >= v5) {
                            hashMap1 = hashMap0;
                            ((ggtj)((ggtj)bboh0.h()).ar(0x2FDF)).B("Not updating display config with status %s", new foqj((fshm.b(fshn1.g) == null ? fshm.e : fshm.b(fshn1.g))));
                            countDownLatch0.countDown();
                            goto label_118;
                        }
                        else {
                            goto label_79;
                        }
                        goto label_78;
                    }
                }
            label_118:
                iterator0 = iterator2;
                v1 = v3;
            label_120:
                hashMap0 = hashMap1;
                v = v4;
            }
        }
        catch(dmhl dmhl0) {
            throw new cjuh(8, "Error retrieving issuer display config", null, dmhl0);
        }
        catch(TimeoutException timeoutException0) {
            throw new cjuh(8, "Timed out waiting for mdocs list", null, timeoutException0);
        }
        catch(InterruptedException | ExecutionException exception0) {
            throw new cjuh(8, "Unknown error", null, exception0);
        }
    }

    @Override  // ebhb
    public final boolean c() {
        return true;
    }

    public static ebip d(Context context0, ftcd ftcd0) {
        ebip ebip0 = new ebip((ftcd0.c == 4 ? ((ftha)ftcd0.d) : ftha.a));
        ebgi ebgi0 = new ebgi(ebip.f(context0, ftcd0));
        gfqx.a.f(ebgi0);
        ebgi0.inject(ebip0);
        return ebip0;
    }

    private static final long e(fshm fshm0, long v) {
        for(Object object0: hwly.a.j().r().b) {
            gtwj gtwj0 = (gtwj)object0;
            if(gtwj0.b == ftqn.a(fshm.class, fshm0)) {
                return Math.max(gtwj0.c, v);
            }
        }
        return v;
    }
}


import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.leveldb.LevelDb.Iterator;
import com.google.android.gms.leveldb.LevelDb.Options;
import com.google.android.gms.leveldb.LevelDb;
import j..time.Instant;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Map;
import jeb.synthetic.TWR;

public final class bnrf implements gfsi {
    public final bnrm a;
    public final Account b;
    public final Instant c;

    public bnrf(bnrm bnrm0, Account account0, Instant instant0) {
        this.a = bnrm0;
        this.b = account0;
        this.c = instant0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ggfz ggfz0;
        bnry bnry2;
        gsyz gsyz0;
        LevelDb.Iterator levelDb$Iterator1;
        Throwable throwable4;
        LevelDb levelDb1;
        gfsx gfsx0;
        int v4;
        long v3;
        ggfx ggfx0;
        ggeo ggeo1;
        LevelDb.Iterator levelDb$Iterator0;
        LevelDb levelDb0;
        Object object1;
        LevelDb.Options levelDb$Options0;
        ByteString hfsf0;
        long v2;
        long v1;
        ggmi ggmi0;
        Map map0;
        bnry bnry0;
        Account account0 = this.b;
        bnrm bnrm0 = this.a;
        ggeo ggeo0 = (ggeo)object0;
        gtai gtai0 = bnrm0.i();
        try {
            long v = this.c.getEpochSecond();
            bnry0 = new bnry(v, gtai0);
            map0 = ggkm.n(ggeo0, new bnrw(v));
            ggch ggch0 = ggch.j(new ggkk(map0)).d(new bnry[]{bnry0});
            ggmi0 = ggmi.a;
            bnry bnry1 = new bnry(((long)(((Long)ggmi0.k(gggq.j(ggch0, new bnru()))))), ((long)(((Long)ggmi0.h(gggq.j(ggch0, new bnrv()))))));
            v1 = bnry1.a;
            gftb.checkTrue(v1 >= 0L);
            v2 = bnry1.b;
            gftb.checkTrue(v2 <= hfyn.b.b);
            hfsf0 = ByteString.A(acso.e(bnrm0.c.d, account0.name));
            levelDb$Options0 = new LevelDb.Options();
            levelDb$Options0.mDeleteIfCorrupted = false;
            object1 = bnrm0.c.c;
            __monitor_enter(object1);
        }
        catch(acse acse0) {
            goto label_108;
        }
        catch(IOException iOException0) {
            goto label_111;
        }
        try {
            levelDb0 = LevelDb.open(bnrm0.c.c(), levelDb$Options0);
        }
        catch(Throwable throwable0) {
            goto label_103;
        }
        try {
            levelDb$Iterator0 = levelDb0.iterator();
        }
        catch(Throwable throwable1) {
            try {
                TWR.safeClose$NT(levelDb0, throwable1);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                goto label_103;
            }
        }
        try {
            ggeo1 = bnsa.a(levelDb$Iterator0, hfsf0);
            ggfx0 = new ggfx(ggmi0);
            HashSet hashSet0 = new HashSet();
            levelDb$Iterator0.seek(glwl.d(new byte[][]{hfsf0.toByteArray(), glxd.h(v1 << 24)}));
            while(true) {
            label_29:
                if(!levelDb$Iterator0.isValid() || levelDb$Iterator0.key().length != hfsf0.size() + 8 || !ByteString.copyFrom(levelDb$Iterator0.key()).L(hfsf0)) {
                    goto label_82;
                }
                v3 = ByteBuffer.wrap(levelDb$Iterator0.key(), hfsf0.size(), 8).getLong();
                v4 = ((byte)(((int)v3))) >> 1;
                if(v4 >= 0) {
                    break;
                }
                goto label_39;
            }
        }
        catch(Throwable throwable2) {
            goto label_43;
        }
        try {
            if(v4 <= fquo.values().length + 1) {
                gfsx0 = v4 == 0 ? gfsx.m(fqus.a) : gfsx.m(fqus.a(fquo.values()[v4 - 1]));
                goto label_40;
            }
        }
        catch(Throwable throwable3) {
            goto label_49;
        }
        try {
        label_39:
            gfsx0 = gfqx.a;
        label_40:
            if(!gfsx0.i()) {
                goto label_45;
            }
            goto label_53;
        }
        catch(Throwable throwable2) {
        label_43:
            levelDb1 = levelDb0;
            goto label_60;
        }
        try {
        label_45:
            ((ggtj)((ggtj)bnsa.a.j()).p(100)).z("readEidsFromDb: Unexpected component set id %d", v4);
            v2 = v2;
            goto label_29;
        }
        catch(Throwable throwable3) {
        label_49:
            throwable4 = throwable3;
            levelDb1 = levelDb0;
            levelDb$Iterator1 = levelDb$Iterator0;
            goto label_88;
        }
    label_53:
        levelDb1 = levelDb0;
        if(v3 >> 24 > v2) {
            goto label_83;
        }
        try {
            gsyz0 = (gsyz)ggeo1.get(Short.valueOf(((short)(((int)(v3 >> 8))))));
            if(gsyz0 == null) {
                goto label_80;
            }
            bnry2 = (bnry)map0.get(gsyz0);
            goto label_62;
        }
        catch(Throwable throwable2) {
            try {
            label_60:
                levelDb$Iterator1 = levelDb$Iterator0;
                goto label_87;
            label_62:
                if(bnry2 == null) {
                    bnry2 = bnry0;
                }
                levelDb$Iterator1 = levelDb$Iterator0;
                if(bnry2.a <= v3 >> 24 && v3 >> 24 <= bnry2.b) {
                    try {
                        Long long0 = glxd.c(levelDb$Iterator1.value());
                        if(hashSet0.add(long0)) {
                            ggfx0.c(long0, new bnrz(new fqux(gsyz0, ((fqus)gfsx0.d())), v3 >> 24));
                        }
                        else {
                            ((ggtj)bnsa.a.j()).B("Multiple entries for EID %016X exist in the EID storage.", long0);
                        }
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        throw new IOException("Illegal EID value", illegalArgumentException0);
                    }
                }
                levelDb$Iterator1.next();
                levelDb$Iterator0 = levelDb$Iterator1;
                levelDb0 = levelDb1;
                v2 = v2;
                hfsf0 = hfsf0;
                goto label_29;
            label_80:
                levelDb$Iterator1 = levelDb$Iterator0;
                throw new IOException("Missing CanonicDeviceId entry");
            label_82:
                levelDb1 = levelDb0;
            label_83:
                levelDb$Iterator1 = levelDb$Iterator0;
                ggfz0 = ggfx0.a();
                goto label_94;
            }
            catch(Throwable throwable2) {
            }
        }
    label_87:
        throwable4 = throwable2;
    label_88:
        if(levelDb$Iterator1 != null) {
            try {
                levelDb$Iterator1.close();
            }
            catch(Throwable throwable5) {
                try {
                    throwable4.addSuppressed(throwable5);
                    throw throwable4;
                label_94:
                    if(levelDb$Iterator1 != null) {
                        levelDb$Iterator1.close();
                    }
                    goto label_100;
                }
                catch(Throwable throwable1) {
                    goto label_98;
                }
            }
        }
        throw throwable4;
        try {
        label_98:
            TWR.safeClose$NT(levelDb1, throwable1);
            throw throwable1;
        label_100:
            levelDb1.close();
            goto label_105;
        }
        catch(Throwable throwable0) {
            try {
            label_103:
                __monitor_exit(object1);
                throw throwable0;
            label_105:
                __monitor_exit(object1);
                goto label_114;
            }
            catch(acse acse0) {
            }
            catch(IOException iOException0) {
                goto label_111;
            }
        }
    label_108:
        a.ae(bnrm.a.i(), "Cannot resolve account ID while trying to read EIDs from local DB.", acse0);
        return null;
    label_111:
        a.ae(bnrm.a.i(), "Failed to read EIDs from local DB. Scheduling device sync.", iOException0);
        bprs.j(cljp.a(bnrm0.d), account0);
        return null;
    label_114:
        if(ggfz0.isEmpty()) {
            bnrm0.b.remove(account0);
        }
        else {
            bnrl bnrl0 = new bnrl(ggfz0);
            bnrm0.b.put(account0, bnrl0);
        }
        ((ggtj)bnrm.a.h()).z("EID in-memory cache updated for account with %d EIDs", ggfz0.size());
        if(!hsxy.d().isEmpty()) {
            Intent intent0 = new Intent("EID_CACHE_REFRESH_COMPLETED").setPackage(hsxy.d());
            bnrm0.d.sendBroadcast(intent0);
            return null;
        }
        return null;
    }
}


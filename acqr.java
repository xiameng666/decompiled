import android.content.Context;
import com.google.android.gms.leveldb.LevelDb.Iterator;
import com.google.android.gms.leveldb.LevelDb.Options;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.Closeable;
import java.io.File;
import java.util.HashMap;

public final class acqr implements Closeable {
    private final Context a;
    private final acqh b;
    private LevelDb c;

    public acqr(Context context0) {
        this.a = context0;
        this.b = new acqh();
    }

    public final int a() {
        int v2;
        synchronized(this) {
            this.g();
            LevelDb.Iterator levelDb$Iterator0 = this.c().iterator();
            try {
                levelDb$Iterator0.seekToFirst();
                v2 = 0;
                while(levelDb$Iterator0.isValid()) {
                    ++v2;
                    levelDb$Iterator0.next();
                }
            }
            finally {
                levelDb$Iterator0.close();
            }
        }
        return v2;
    }

    public final acrk b() {
        acrk acrk0;
        acrk acrk1;
        synchronized(this) {
            this.g();
            LevelDb.Iterator levelDb$Iterator0 = this.c().iterator();
            try {
                acrk0 = null;
                levelDb$Iterator0.seekToFirst();
                if(levelDb$Iterator0.isValid()) {
                    do {
                        try {
                            byte[] arr_b = levelDb$Iterator0.value();
                            hftc hftc0 = hftc.a();
                            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)acrk.a), arr_b, 0, arr_b.length, hftc0);
                            ProtoLiteMessage.P_makeImmutable(hftv0);
                            acrk1 = (acrk)hftv0;
                            if(!acqr.h(acrk1)) {
                                return acrk1;
                            }
                            this.c().delete(levelDb$Iterator0.key());
                            levelDb$Iterator0.next();
                            this.b.b(4);
                        }
                        catch(hfur unused_ex) {
                            this.c().delete(levelDb$Iterator0.key());
                            levelDb$Iterator0.next();
                            this.b.b(3);
                        }
                    }
                    while(levelDb$Iterator0.isValid());
                    return acrk0;
                }
            }
            finally {
                levelDb$Iterator0.close();
            }
        }
        return acrk0;
    }

    final LevelDb c() {
        LevelDb levelDb0;
        synchronized(this) {
            levelDb0 = this.c;
            gfuy.e(levelDb0);
        }
        return levelDb0;
    }

    @Override
    public final void close() {
        synchronized(this) {
            LevelDb levelDb0 = this.c;
            if(levelDb0 == null) {
                return;
            }
            levelDb0.close();
            this.c = null;
        }
    }

    public final void d(acrk acrk0) {
        synchronized(this) {
            this.g();
            this.c().delete(acqs.a(acrk0));
        }
    }

    public final boolean e(grnz grnz0, String s) {
        synchronized(this) {
            this.g();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)acrk.a).v_newBuilder();
            long v1 = (grnz0.f == null ? groh.a : grnz0.f).c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((acrk)hftv0).b |= 2;
            ((acrk)hftv0).d = v1;
            int v2 = grnz0.d;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((acrk)hftv1).b |= 8;
            ((acrk)hftv1).f = v2;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            grnz0.getClass();
            ((acrk)hftv2).c = grnz0;
            ((acrk)hftv2).b |= 1;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            acrk acrk0 = (acrk)hftp0.b_message;
            s.getClass();
            acrk0.b |= 4;
            acrk0.e = s;
            long v3 = hovl.b();
            for(long v4 = 0L; v4 < v3; ++v4) {
                ProtoLiteMessage hftv3 = hftp0.b_message;
                long v5 = ((acrk)hftv3).d + v4;
                if(!hftv3.isImmutable()) {
                    hftp0.ensureMutable();
                }
                acrk acrk1 = (acrk)hftp0.b_message;
                acrk1.b |= 2;
                acrk1.d = v5;
                acrk acrk2 = (acrk)hftp0.N_build();
                byte[] arr_b = acqs.a(acrk2);
                if(this.c().get(arr_b) == null) {
                    this.c().put(arr_b, acrk2.toBytesArray());
                    return true;
                }
            }
        }
        return false;
    }

    public final acrd[] f() {
        acrd[] arr_acrd;
        ProtoLiteBuilder hftp1;
        int v4;
        synchronized(this) {
            this.g();
            HashMap hashMap0 = new HashMap();
            LevelDb.Iterator levelDb$Iterator0 = this.c().iterator();
            try {
                levelDb$Iterator0.seekToFirst();
                while(levelDb$Iterator0.isValid()) {
                    try {
                        byte[] arr_b = levelDb$Iterator0.value();
                        hftc hftc0 = hftc.a();
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)acrk.a), arr_b, 0, arr_b.length, hftc0);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        acrk acrk0 = (acrk)hftv0;
                        if(acqr.h(acrk0)) {
                            levelDb$Iterator0.next();
                            continue;
                        }
                        else {
                            grnz grnz0 = acrk0.c == null ? grnz.a : acrk0.c;
                            grog grog0 = grnz0.e == null ? grog.a : grnz0.e;
                            String s = (grog0.b == 1 ? ((grob)grog0.c) : grob.a).g;
                            int v2 = acrk0.f;
                            String s1 = v2 + "-" + s;
                            if(((ProtoLiteMessage)acrk0).isImmutable()) {
                                v4 = ((ProtoLiteMessage)acrk0).t(null);
                                if(v4 < 0) {
                                    throw new IllegalStateException("serialized size must be non-negative, was " + v4);
                                }
                            }
                            else {
                                int v3 = acrk0.memoizedSerializedSize & 0x7FFFFFFF;
                                if(v3 == 0x7FFFFFFF) {
                                    v3 = ((ProtoLiteMessage)acrk0).t(null);
                                    if(v3 < 0) {
                                        throw new IllegalStateException("serialized size must be non-negative, was " + v3);
                                    }
                                    acrk0.memoizedSerializedSize = acrk0.memoizedSerializedSize & 0x80000000 | v3;
                                }
                                v4 = v3;
                            }
                            if(hashMap0.containsKey(s1)) {
                                acrd acrd1 = (acrd)hashMap0.get(s1);
                                hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)acrd1).jf(5, null);
                                hftp1.X(((ProtoLiteMessage)acrd1));
                            }
                            else {
                                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)acrd.a).v_newBuilder();
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ProtoLiteMessage hftv1 = hftp0.b_message;
                                s.getClass();
                                ((acrd)hftv1).b |= 1;
                                ((acrd)hftv1).c = s;
                                if(!hftv1.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                acrd acrd0 = (acrd)hftp0.b_message;
                                acrd0.b |= 8;
                                acrd0.f = v2;
                                hftp1 = hftp0;
                            }
                            ProtoLiteMessage hftv2 = hftp1.b_message;
                            int v5 = ((acrd)hftv2).d + 1;
                            if(!hftv2.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv3 = hftp1.b_message;
                            ((acrd)hftv3).b |= 2;
                            ((acrd)hftv3).d = v5;
                            int v6 = ((acrd)hftv3).e + v4;
                            if(!hftv3.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            acrd acrd2 = (acrd)hftp1.b_message;
                            acrd2.b |= 4;
                            acrd2.e = v6;
                            hashMap0.put(s1, ((acrd)hftp1.N_build()));
                            goto label_66;
                        }
                        break;
                    }
                    catch(hfur unused_ex) {
                    }
                label_66:
                    levelDb$Iterator0.next();
                }
            }
            catch(NullPointerException unused_ex) {
            }
            finally {
                levelDb$Iterator0.close();
            }
            arr_acrd = (acrd[])hashMap0.values().toArray(new acrd[0]);
        }
        return arr_acrd;
    }

    private final void g() {
        LevelDb levelDb0;
        acqh acqh0;
        synchronized(this) {
            if(this.c != null) {
                return;
            }
            File file0 = hrnt.i() ? new File(ccsb.a.b(this.a.getFilesDir(), "audit_db")) : new File(this.a.getFilesDir(), "audit_db");
            try {
                acqh0 = this.b;
                LevelDb.Options levelDb$Options0 = new LevelDb.Options();
                levelDb$Options0.mDeleteIfCorrupted = false;
                levelDb0 = LevelDb.open(file0, levelDb$Options0);
            }
            catch(LevelDbException unused_ex) {
                acqh0.b(2);
                try {
                    LevelDb.destroy(file0);
                }
                catch(LevelDbException unused_ex) {
                }
                levelDb0 = LevelDb.open(file0);
            }
            this.c = levelDb0;
        }
    }

    private static boolean h(acrk acrk0) {
        grnz grnz0 = acrk0.c == null ? grnz.a : acrk0.c;
        grog grog0 = grnz0.e == null ? grog.a : grnz0.e;
        return ((grog0.b == 1 ? ((grob)grog0.c) : grob.a).b & 16) == 0 ? true : ((acrk0.c == null ? grnz.a : acrk0.c).b & 16) == 0;
    }
}


import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.leveldb.LevelDb.Iterator;
import com.google.android.gms.leveldb.LevelDb.Options;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.io.Closeable;
import java.io.File;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

public final class fxqn implements Closeable {
    public final fxqo a;
    public final Context b;
    public final Object c;
    public LevelDb d;

    public fxqn(LevelDb levelDb0, fxqo fxqo0, Context context0) {
        this.c = new Object();
        this.d = levelDb0;
        this.a = fxqo0;
        this.b = context0;
    }

    public final void a(ReportingConfig reportingConfig0) {
        LevelDb.Iterator levelDb$Iterator0;
        Object object0 = this.c;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(this.d == null) {
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        List list0 = reportingConfig0.c();
        for(Object object1: list0) {
            this.h(((Account)object1));
        }
        try {
            try {
                levelDb$Iterator0 = null;
                levelDb$Iterator0 = this.d.iterator();
                levelDb$Iterator0.seekToFirst();
                while(true) {
                    if(!levelDb$Iterator0.isValid()) {
                        goto label_56;
                    }
                    ByteBuffer byteBuffer0 = ByteBuffer.wrap(levelDb$Iterator0.key());
                    long v1 = byteBuffer0.getLong();
                    byteBuffer0.getLong();
                    for(Object object2: list0) {
                        if(!fxqq.d(((Account)object2), v1)) {
                            continue;
                        }
                        goto label_37;
                    }
                    fxqw.c("GCoreUlr", a.u(v1, "Deleting entries for account #"));
                    fxra.g("UlrEntitiesDeletedForInvalidAccount");
                    LevelDb levelDb0 = this.d;
                    ByteBuffer byteBuffer1 = ByteBuffer.allocate(8);
                    byteBuffer1.putLong(v1);
                    byte[] arr_b = byteBuffer1.array();
                    ByteBuffer byteBuffer2 = ByteBuffer.allocate(20);
                    byteBuffer2.putLong(v1);
                    byteBuffer2.putLong(-1L);
                    byteBuffer2.putInt(-1);
                    levelDb0.deleteRange(arr_b, byteBuffer2.array());
                label_37:
                    if(v1 == -1L) {
                        levelDb$Iterator0.seekToLast();
                        if(!levelDb$Iterator0.isValid()) {
                            continue;
                        }
                        levelDb$Iterator0.next();
                    }
                    else {
                        ByteBuffer byteBuffer3 = ByteBuffer.allocate(8);
                        byteBuffer3.putLong(v1 + 1L);
                        levelDb$Iterator0.seek(byteBuffer3.array());
                    }
                }
            }
            catch(LevelDbCorruptionException | IllegalStateException exception0) {
            }
            catch(LevelDbException levelDbException0) {
                goto label_52;
            }
            this.b(exception0);
            if(levelDb$Iterator0 != null) {
                goto label_49;
            }
            goto label_57;
        }
        catch(Throwable throwable0) {
            goto label_60;
        }
    label_49:
        levelDb$Iterator0.close();
        goto label_57;
        try {
        label_52:
            fxqw.k("Error removing invalid entries", levelDbException0);
            if(levelDb$Iterator0 != null) {
                goto label_54;
            }
            goto label_57;
        }
        catch(Throwable throwable0) {
            goto label_60;
        }
    label_54:
        levelDb$Iterator0.close();
        goto label_57;
    label_56:
        levelDb$Iterator0.close();
        try {
        label_57:
            FIN.finallyExec$NT(v);
        }
        catch(Throwable throwable0) {
        label_60:
            TWR.safeClose$NT(levelDb$Iterator0, throwable0);
            throw throwable0;
        }
    }

    public final void b(Exception exception0) {
        fxqw.g("Datastore corrupted, removing and recreating", exception0);
        try {
            this.d.close();
            LevelDb.destroy(fxqn.j(this.b));
            this.d = fxqn.k(this.b);
        }
        catch(LevelDbException unused_ex) {
            fxqw.d(5, "datastore corrupted");
            this.d = null;
        }
        catch(IllegalStateException unused_ex) {
            fxqw.d(52, "LevelDb");
            this.d = null;
        }
    }

    public static boolean c(LevelDb.Iterator levelDb$Iterator0, Account account0) {
        if(!levelDb$Iterator0.isValid()) {
            return false;
        }
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(levelDb$Iterator0.key());
        long v = byteBuffer0.getLong();
        byteBuffer0.getLong();
        return fxqq.d(account0, v);
    }

    @Override
    public final void close() {
        synchronized(this.c) {
            LevelDb levelDb0 = this.d;
            if(levelDb0 != null) {
                try {
                    levelDb0.close();
                }
                catch(IllegalStateException illegalStateException0) {
                    fxqw.g("Error closing LevelDb", illegalStateException0);
                }
            }
            this.d = null;
        }
    }

    public final boolean d(fxqm fxqm0, String s) {
        String s1;
        ayvc ayvc0 = hzek.q() ? fxra.b() : null;
        try {
            this.d.write(fxqm0.a);
            if(ayvc0 != null) {
                ayve ayve0 = fxra.c("UlrProfLeveldbWriteSuccess");
                long v = ayvc0.a();
                ayve0.a(ayve0.g.a(v), 1L, ayvf.b);
            }
            switch(s) {
                case "Activity": {
                    s1 = "UlrSavedActivity";
                    break;
                }
                case "Delete": {
                    s1 = "UlrEntitiesDeleted";
                    break;
                }
                case "Locations": {
                    s1 = "UlrSavedLocation";
                    break;
                }
                default: {
                    s1 = "UlrSavedMetadata";
                }
            }
            fxra.h(s1, ((long)fxqm0.b));
            return true;
        }
        catch(LevelDbCorruptionException | IllegalStateException exception0) {
            this.b(exception0);
            if(ayvc0 != null) {
                ayve ayve1 = fxra.c("UlrProfLeveldbWriteError");
                long v1 = ayvc0.a();
                ayve1.a(ayve1.g.a(v1), 1L, ayvf.b);
            }
            return false;
        }
        catch(LevelDbException levelDbException0) {
            if(ayvc0 != null) {
                ayve ayve2 = fxra.c("UlrProfLeveldbWriteError");
                long v2 = ayvc0.a();
                ayve2.a(ayve2.g.a(v2), 1L, ayvf.b);
            }
            fxqw.e(fxqn.o(s), a.a(s, "Error saving writebatch for \'", "\' to datastore"), levelDbException0);
            return false;
        }
    }

    public final byte[] e(byte[] arr_b) {
        if(arr_b != null && arr_b.length != 0) {
            try {
                return this.a.b(arr_b);
            }
            catch(GeneralSecurityException generalSecurityException0) {
                fxqw.e(41, "Error decrypting datastore entry, item will be skipped", generalSecurityException0);
            }
        }
        return null;
    }

    public final byte[] f(fxrq fxrq0, String s) {
        try {
            byte[] arr_b = fxrq0.toBytesArray();
            return this.a.c(arr_b);
        }
        catch(GeneralSecurityException generalSecurityException0) {
            fxqw.e(fxqn.o(s), "Error encrypting datastore entry for " + s, generalSecurityException0);
            return null;
        }
    }

    @Override
    public final void finalize() {
        if(this.d != null) {
            fxqw.m(26, "LevelDb instance was not closed.");
            this.close();
        }
        super.finalize();
    }

    public final void g(fxqm fxqm0, List list0, long v, fxrq fxrq0, String s) {
        byte[] arr_b = this.f(fxrq0, s);
        if(arr_b != null) {
            for(Object object0: list0) {
                fxqm0.b(fxqq.b(((Account)object0), v, fxrq0), arr_b);
            }
        }
    }

    public final void h(Account account0) {
        long v = hzek.a.i().x() - 7200000L;
        batl.b(v > 0L);
        this.m(account0, 0x8000000000000000L, System.currentTimeMillis() - v);
    }

    public static final fxrq i(byte[] arr_b) {
        if(arr_b != null && arr_b.length != 0) {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fxrq.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                return (fxrq)hftv0;
            }
            catch(hfur hfur0) {
                fxqw.e(41, "Error deserializing datastore entry, item will be skipped", hfur0);
            }
        }
        return null;
    }

    static File j(Context context0) {
        return context0.getDir("ulr_db_grpc", 0);
    }

    public static LevelDb k(Context context0) {
        LevelDb.Options levelDb$Options0 = new LevelDb.Options();
        levelDb$Options0.mUseSnappy = false;
        return LevelDb.open(fxqn.j(context0), levelDb$Options0);
    }

    public final void l(Account account0, gzty gzty0, String s) {
        this.n(Collections.singletonList(account0), gzty0, s);
    }

    public final void m(Account account0, long v, long v1) {
        synchronized(this.c) {
            if(this.d == null) {
                return;
            }
            try {
                byte[] arr_b = fxqq.c(account0, v1);
                byte[] arr_b1 = fxqq.a(account0, v, -1);
                this.d.deleteRange(arr_b, arr_b1);
            }
            catch(LevelDbCorruptionException | IllegalStateException exception0) {
                this.b(exception0);
            }
            catch(LevelDbException levelDbException0) {
                fxqw.k("Error deleting entries", levelDbException0);
            }
        }
    }

    public final void n(List list0, gzty gzty0, String s) {
        synchronized(this.c) {
            if(this.d == null) {
                return;
            }
            fxqm fxqm0 = new fxqm();
            try {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fxrq.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fxrq fxrq0 = (fxrq)hftp0.b_message;
                gzty0.getClass();
                fxrq0.e = gzty0;
                fxrq0.b |= 4;
                fxrq fxrq1 = (fxrq)hftp0.N_build();
                this.g(fxqm0, list0, gzty0.c, fxrq1, s);
                this.d(fxqm0, s);
            }
            finally {
                fxqm0.a();
            }
        }
    }

    private static int o(String s) {
        switch(s.hashCode()) {
            case 0xA126572F: {
                return s.equals("Activity") ? 4 : 2;
            }
            case 0x3016773E: {
                return s.equals("Locations") ? 3 : 2;
            }
            case 2043376075: {
                return s.equals("Delete") ? 1 : 2;
            }
            default: {
                return 2;
            }
        }
    }
}


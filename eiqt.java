import android.content.Context;
import android.database.sqlite.SQLiteAbortException;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDatatypeMismatchException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteMisuseException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.TWR;

public abstract class eiqt extends cjtm {
    private static final bboh a;
    private final hlse b;
    private final boolean c;
    private final eisd d;
    private final AtomicBoolean e;
    private final String f;

    static {
        eiqt.a = bboh.b("PhBaseOp", bbcu.al);
    }

    public eiqt(String s, hlse hlse0) {
        this(s, hlse0, true);
    }

    public eiqt(String s, hlse hlse0, boolean z) {
        super(51, s);
        this.e = new AtomicBoolean(false);
        this.f = s;
        this.b = hlse0;
        this.c = z;
        this.d = eisa.a();
    }

    public abstract hlrh b();

    public hlrv c() {
        return null;
    }

    public List d() {
        return null;
    }

    public List e() {
        return null;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/phenotype/service/operations/BaseGmsOperation", "execute", 73, this.f)) {
            this.h(context0, eiov.b(context0));
        }
    }

    public static void g(Context context0, SQLiteException sQLiteException0, hlsc hlsc0) {
        hlsb hlsb6;
        hlsa hlsa3;
        hlsb hlsb4;
        hlsa hlsa1;
        int v;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlsb.a).v_newBuilder();
        String s = sQLiteException0.getClass().getName();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlsb hlsb0 = (hlsb)hftp0.b_message;
        s.getClass();
        hlsb0.b |= 1;
        hlsb0.c = s;
        if((sQLiteException0 instanceof SQLiteAbortException)) {
            v = 0x7350;
        }
        else if((sQLiteException0 instanceof SQLiteAccessPermException)) {
            v = 0x7351;
        }
        else if((sQLiteException0 instanceof SQLiteBindOrColumnIndexOutOfRangeException)) {
            v = 0x7352;
        }
        else if((sQLiteException0 instanceof SQLiteBlobTooBigException)) {
            v = 0x7353;
        }
        else if((sQLiteException0 instanceof SQLiteCantOpenDatabaseException)) {
            v = 0x7354;
        }
        else if((sQLiteException0 instanceof SQLiteConstraintException)) {
            v = 0x7355;
        }
        else if((sQLiteException0 instanceof SQLiteDatabaseCorruptException)) {
            v = 0x7356;
        }
        else if((sQLiteException0 instanceof SQLiteDatabaseLockedException)) {
            v = 0x7357;
        }
        else if((sQLiteException0 instanceof SQLiteDatatypeMismatchException)) {
            v = 0x7358;
        }
        else if((sQLiteException0 instanceof SQLiteDiskIOException)) {
            v = 0x7359;
        }
        else if((sQLiteException0 instanceof SQLiteDoneException)) {
            v = 29530;
        }
        else if((sQLiteException0 instanceof SQLiteFullException)) {
            v = 0x735B;
        }
        else if((sQLiteException0 instanceof SQLiteMisuseException)) {
            v = 0x735C;
        }
        else if((sQLiteException0 instanceof SQLiteOutOfMemoryException)) {
            v = 0x735D;
        }
        else if((sQLiteException0 instanceof SQLiteReadOnlyDatabaseException)) {
            v = 0x735E;
        }
        else {
            v = (sQLiteException0 instanceof SQLiteTableLockedException) ? 0x735F : 0x734F;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlsb hlsb1 = (hlsb)hftp0.b_message;
        hlsb1.b |= 2;
        hlsb1.d = v;
        String s1 = sQLiteException0.getMessage();
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlsb hlsb2 = (hlsb)hftp0.b_message;
            hlsb2.b |= 4;
            hlsb2.e = s1;
        }
        try {
            eiox eiox0 = eiov.a(context0);
            String s2 = eiox0.d();
            if(!s2.equals("ok")) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hlsb hlsb3 = (hlsb)hftp0.b_message;
                s2.getClass();
                hlsb3.b |= 16;
                hlsb3.g = s2;
            }
            try(eiog eiog0 = eiox0.a().a()) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hlsa.a).v_newBuilder();
                long v1 = eiog0.a();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((hlsa)hftv0).b |= 1;
                ((hlsa)hftv0).c = v1;
                long v2 = (long)eiox0.e;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hlsa hlsa0 = (hlsa)hftp1.b_message;
                hlsa0.b |= 2;
                hlsa0.d = v2;
                hlsa1 = (hlsa)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hlsb4 = (hlsb)hftp0.b_message;
                hlsa1.getClass();
            }
            hlsb4.i = hlsa1;
            hlsb4.b |= 0x40;
        }
        catch(SQLiteException sQLiteException1) {
            a.ae(eiqt.a.i(), "Failed to run integrity check or get schema version for Phenotype deDatabase.", sQLiteException1);
        }
        if(fhcd.h(context0)) {
            try {
                eiox eiox1 = eiov.b(context0);
                String s3 = eiox1.d();
                if(!s3.equals("ok")) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hlsb hlsb5 = (hlsb)hftp0.b_message;
                    s3.getClass();
                    hlsb5.b |= 8;
                    hlsb5.f = s3;
                }
                try(eiog eiog1 = eiox1.a().a()) {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hlsa.a).v_newBuilder();
                    long v3 = eiog1.a();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp2.b_message;
                    ((hlsa)hftv1).b |= 1;
                    ((hlsa)hftv1).c = v3;
                    long v4 = (long)eiox1.e;
                    if(!hftv1.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hlsa hlsa2 = (hlsa)hftp2.b_message;
                    hlsa2.b |= 2;
                    hlsa2.d = v4;
                    hlsa3 = (hlsa)hftp2.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hlsb6 = (hlsb)hftp0.b_message;
                    hlsa3.getClass();
                }
                hlsb6.h = hlsa3;
                hlsb6.b |= 0x20;
            }
            catch(SQLiteException sQLiteException2) {
                a.ae(eiqt.a.i(), "Failed to run integrity check or get schema version for Phenotype ceDatabase.", sQLiteException2);
            }
        }
        if(!hlsc0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlsc0).ensureMutable();
        }
        hlsf hlsf0 = (hlsf)hlsc0.b_message;
        hlsb hlsb7 = (hlsb)hftp0.N_build();
        hlsb7.getClass();
        hlsf0.e = hlsb7;
        hlsf0.b |= 8;
    }

    public final void h(Context context0, eiox eiox0) {
        RuntimeException runtimeException0;
        long v = SystemClock.elapsedRealtime();
        boolean z = this.d.b(context0);
        this.e.set(z);
        if(fhcd.g(context0)) {
            throw new cjuh(29508, "API access is not supported in direct boot mode.");
        }
        try {
            runtimeException0 = null;
            try(gdqb gdqb0 = gdsp.e("com/google/android/gms/phenotype/service/operations/BaseGmsOperation", "execute", 93, this.f)) {
                this.i(context0, eiox0);
            }
        }
        catch(SQLiteException sQLiteException0) {
            runtimeException0 = sQLiteException0;
            this.j(Status.d);
        }
        catch(eioz eioz0) {
            throw new cjuh(eioz0.a, eioz0.b);
        }
        catch(eipa eipa0) {
            throw new cjuh(eipa0.a, eipa0.b);
        }
        finally {
            if(this.c) {
                this.m(context0, v, runtimeException0);
            }
        }
    }

    public abstract void i(Context arg1, eiox arg2);

    public static void k(Context context0, SQLiteException sQLiteException0, hlse hlse0) {
        hlsc hlsc0 = (hlsc)((ProtoLiteMessage)hlsf.a).v_newBuilder();
        eiqt.g(context0, sQLiteException0, hlsc0);
        cczb cczb0 = chlr.v().c(((ProtoLiteMessage)(((hlsf)((ProtoLiteBuilder)hlsc0).N_build()))));
        cczb0.c = (int)hlse0.Z;
        cczb0.a();
    }

    public hlrh[] l() {
        return null;
    }

    private final void m(Context context0, long v, Exception exception0) {
        hlsc hlsc0 = (hlsc)((ProtoLiteMessage)hlsf.a).v_newBuilder();
        if(this.e.get()) {
            if(!hlsc0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlsc0).ensureMutable();
            }
            hlsf.d(((hlsf)hlsc0.b_message));
        }
        hlrh hlrh0 = this.b();
        if(hlrh0 != null) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hlrh0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hlrh0));
            long v1 = SystemClock.elapsedRealtime() - v;
            if(!((hlrg)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((hlrg)hftp0))).ensureMutable();
            }
            hlrh hlrh1 = (hlrh)((hlrg)hftp0).b_message;
            hlrh1.b |= 0x400;
            hlrh1.k = (int)v1;
            if(!hlsc0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlsc0).ensureMutable();
            }
            hlsf hlsf0 = (hlsf)hlsc0.b_message;
            hlrh hlrh2 = (hlrh)((ProtoLiteBuilder)(((hlrg)hftp0))).N_build();
            hlrh2.getClass();
            hlsf0.c = hlrh2;
            hlsf0.b |= 2;
        }
        hlrh[] arr_hlrh = this.l();
        if(arr_hlrh != null) {
            List list0 = Arrays.asList(arr_hlrh);
            if(!hlsc0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlsc0).ensureMutable();
            }
            hlsf hlsf1 = (hlsf)hlsc0.b_message;
            hfuo hfuo0 = hlsf1.d;
            if(!hfuo0.c()) {
                hlsf1.d = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(list0, hlsf1.d);
        }
        List list1 = this.d();
        if(list1 != null && !list1.isEmpty()) {
            if(!hlsc0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlsc0).ensureMutable();
            }
            hlsf hlsf2 = (hlsf)hlsc0.b_message;
            hlsf2.b();
            hfrj.E(list1, hlsf2.i);
        }
        List list2 = this.e();
        if(list2 != null && !list2.isEmpty()) {
            if(!hlsc0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlsc0).ensureMutable();
            }
            hlsf hlsf3 = (hlsf)hlsc0.b_message;
            hlsf3.c();
            hfrj.E(list2, hlsf3.j);
        }
        hlrv hlrv0 = this.c();
        if(hlrv0 != null) {
            if(!hlsc0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlsc0).ensureMutable();
            }
            ((hlsf)hlsc0.b_message).f = hlrv0;
            ((hlsf)hlsc0.b_message).b |= 0x20;
        }
        if(exception0 == null) {
            ((ProtoLiteBuilder)hlsc0).N_build();
            new foqj(this.b);
        }
        else {
            if((exception0 instanceof SQLiteException)) {
                eiqt.g(context0, ((SQLiteException)exception0), hlsc0);
            }
            else {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hlsb.a).v_newBuilder();
                String s = exception0.getClass().getName();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                s.getClass();
                ((hlsb)hftv0).b |= 1;
                ((hlsb)hftv0).c = s;
                if((exception0 instanceof eipa)) {
                    int v2 = ((eipa)exception0).a;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hlsb hlsb0 = (hlsb)hftp1.b_message;
                    hlsb0.b |= 2;
                    hlsb0.d = v2;
                }
                if(!hlsc0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hlsc0).ensureMutable();
                }
                hlsf hlsf4 = (hlsf)hlsc0.b_message;
                hlsb hlsb1 = (hlsb)hftp1.N_build();
                hlsb1.getClass();
                hlsf4.e = hlsb1;
                hlsf4.b |= 8;
            }
            ((ggtj)((ggtj)eiqt.a.j()).s(exception0)).R("Phenotype API error. Event: %s, EventCode: %s", ((ProtoLiteBuilder)hlsc0).N_build(), new foqj(this.b));
        }
        cczb cczb0 = chlr.v().c(((ProtoLiteMessage)(((hlsf)((ProtoLiteBuilder)hlsc0).N_build()))));
        hlse hlse0 = this.b;
        cczb0.c = (int)hlse0.Z;
        cczb0.a();
        if(((Boolean)cjnd.b.mr()).booleanValue()) {
            cjnd cjnd0 = cjnd.a();
            hlsf hlsf5 = (hlsf)((ProtoLiteBuilder)hlsc0).N_build();
            gdqs gdqs0 = cjnd0.c.k("phenotypeOperation");
            try {
                if((hlse0 == hlse.t || hlse0 == hlse.g || hlse0 == hlse.h) && cjnd0.d.contains((hlsf5.c == null ? hlrh.a : hlsf5.c).c)) {
                    cjnd0.d(hlsf5, hlse0);
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(gdqs0, throwable0);
                throw throwable0;
            }
            if(gdqs0 != null) {
                gdqs0.close();
            }
        }
    }
}


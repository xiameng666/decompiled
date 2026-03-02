import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.SyncResult;
import j..util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class cqgi extends cjtm {
    public final SyncRequest a;
    private final cqgr b;
    private final Executor c;
    private final cqel d;
    private final String e;
    private final Account f;
    private final fiyj g;
    private final cqdy h;
    private final CallerInfo i;
    private final cmbm j;
    private final cqeo n;

    public cqgi(cqgr cqgr0, cmbm cmbm0, Executor executor0, cqeo cqeo0, cqel cqel0, String s, Account account0, fiyj fiyj0, cqdy cqdy0, SyncRequest syncRequest0, CallerInfo callerInfo0, azug azug0) {
        super(0xD7, "HandleSyncOperation", azug0);
        this.b = cqgr0;
        this.j = cmbm0;
        this.c = executor0;
        this.n = cqeo0;
        this.d = cqel0;
        this.e = s;
        this.f = account0;
        this.g = fiyj0;
        this.h = cqdy0;
        this.a = syncRequest0;
        this.i = callerInfo0;
    }

    private final void b(int v) {
        cqel cqel0 = this.d;
        if(!hvem.h() && !cqel0.b.a(((long)cqel0.c))) {
            return;
        }
        fkpz fkpz0 = (fkpz)cqel0.a.mr();
        fkpq fkpq0 = fkpq.k;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fkpo.a).v_newBuilder();
        int v1 = cqel0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo0 = (fkpo)hftp0.b_message;
        fkpo0.b |= 1;
        fkpo0.e = v1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)cpzt.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((cpzt)hftp1.b_message).e = v - 1;
        ((cpzt)hftp1.b_message).b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)cpzq.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        CallerInfo callerInfo0 = this.i;
        ((cpzq)hftp2.b_message).c = this.a.a.f;
        ((cpzq)hftp2.b_message).b |= 1;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)cpzp.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        ((cpzp)hftv0).b |= 2;
        ((cpzp)hftv0).c = callerInfo0.b;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp3.b_message;
        ((cpzp)hftv1).b |= 4;
        ((cpzp)hftv1).d = this.e;
        String s = callerInfo0.a;
        if(!hftv1.isImmutable()) {
            hftp3.ensureMutable();
        }
        cpzp cpzp0 = (cpzp)hftp3.b_message;
        s.getClass();
        cpzp0.b |= 8;
        cpzp0.e = s;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        cpzq cpzq0 = (cpzq)hftp2.b_message;
        cpzp cpzp1 = (cpzp)hftp3.N_build();
        cpzp1.getClass();
        cpzq0.d = cpzp1;
        cpzq0.b |= 2;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        cpzt cpzt0 = (cpzt)hftp1.b_message;
        cpzq cpzq1 = (cpzq)hftp2.N_build();
        cpzq1.getClass();
        cpzt0.d = cpzq1;
        cpzt0.c = 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo1 = (fkpo)hftp0.b_message;
        cpzt cpzt1 = (cpzt)hftp1.N_build();
        cpzt1.getClass();
        fkpo1.d = cpzt1;
        fkpo1.c = 5;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)fkpn.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp4.b_message;
        ((fkpn)hftv2).b |= 2;
        ((fkpn)hftv2).c = 1;
        if(!hftv2.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp4.b_message;
        ((fkpn)hftv3).b |= 4;
        ((fkpn)hftv3).d = "com.google.android.gms";
        if(!hftv3.isImmutable()) {
            hftp4.ensureMutable();
        }
        fkpn fkpn0 = (fkpn)hftp4.b_message;
        fkpn0.b |= 16;
        fkpn0.f = "mdisync";
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo2 = (fkpo)hftp0.b_message;
        fkpn fkpn1 = (fkpn)hftp4.N_build();
        fkpn1.getClass();
        fkpo2.f = fkpn1;
        fkpo2.b |= 2;
        fkpz0.a(fkpq0, ((fkpo)hftp0.N_build()));
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        byte[] arr_b;
        fkpq fkpq0;
        cqae cqae0;
        ggsu ggsu0 = this.g.b().ar(7124);
        int v = this.a.a.f;
        ggsu0.z("Executing operation \'%d\'...", v);
        try {
            cqgr.a(this.a.a != cpzv.a, "No handler registered for the UNKNOWN operation!");
            cqae0 = (cqae)this.b.a.get(this.a.a);
            if(cqae0 == null) {
                throw new IllegalStateException(String.format("No handler registered for operation \'%d\'!", v));
            }
        }
        catch(cqgn cqgn0) {
            this.b(13);
            throw new cjuh(38001, "Unknown or unsupported sync operation requested!", null, cqgn0);
        }
        cpzh cpzh0 = hvem.e();
        if(!((ProtoLiteMessage)cpzh.a).equals(cpzh0)) {
            String s = hvem.e().c;
            if(!s.isEmpty() && !s.equals(this.e)) {
                throw new cjuh(38000, "API invocation rejected because the caller is disallowed!", null);
            }
            cpzh cpzh1 = hvem.e();
            cpzi cpzi0 = cpzi.a;
            cpzi cpzi1 = (cpzi)cpzh1.b.get(this.e);
            if(cpzi1 != null) {
                cpzi0 = cpzi1;
            }
            for(Object object0: cpzi0.b) {
                int v1 = ((cpzk)object0).c;
                long v2 = (v1 & 1) == 0 ? 0x8000000000000000L : ((cpzk)object0).d;
                long v3 = (v1 & 2) == 0 ? 0x7FFFFFFFFFFFFFFFL : ((cpzk)object0).e;
                if(new hfuh(((cpzk)object0).f, cpzk.a).contains(this.a.a)) {
                    long v4 = this.i.b;
                    if(v2 <= v4 && v4 <= v3) {
                        throw new cjuh(38000, "API invocation rejected because the caller is disallowed!", null);
                    }
                }
            }
        }
        cqeo cqeo0 = this.n;
        CallerInfo callerInfo0 = this.i;
        int v5 = this.a.a.ordinal();
        if(v5 == 1 || v5 == 2 || v5 == 3) {
            fkpq0 = fkpq.o;
        }
        else if(v5 != 4) {
            fkpq0 = fkpq.a;
        }
        else {
            fkpq0 = fkpq.p;
        }
        fkqb fkqb0 = new fkqb(cqeo0.a, cqeo0.b, "mdisync", callerInfo0.a);
        Objects.requireNonNull(cqeo0.d);
        cqep cqep0 = new cqep(cqeo0.d);
        new fkqi(fkqb0, cqeo0.c, fkpq0, ((gful_cronetEngineProvider)cqep0)).b();
        try {
            gmcd gmcd0 = this.j.m(cqgx.b, this.f).c(new cqgh(this, cqae0), 1, this.c);
            try {
                arr_b = (byte[])((glyq)gmcd0).u();
            }
            catch(ExecutionException executionException0) {
                Throwable throwable0 = executionException0.getCause();
                gftb.z(throwable0, "Failed sync must have a cause!");
                gfut.d(throwable0, cqgl.class);
                gfut.d(throwable0, cqgp.class);
                gfut.d(throwable0, cqgq.class);
                gfut.d(throwable0, InterruptedException.class);
                gfut.d(throwable0, cqgm.class);
                gfut.d(throwable0, fktq.class);
                gfut.d(throwable0, fktt.class);
                gfut.e(throwable0);
                throw new IllegalStateException("Sync failed with an unknown checked exception!", throwable0);
            }
        }
        catch(cqgo cqgo0) {
            this.b(7);
            throw new cjuh(38002, "Given request is malformed!", null, cqgo0);
        }
        catch(cqgl cqgl0) {
            this.b(3);
            throw new cjuh(38003, "Sync failed with an authentication error!", null, cqgl0);
        }
        catch(fktq fktq0) {
            this.b(10);
            throw new cjuh(38004, "Sync failed, because constraints are not met!", null, fktq0);
        }
        catch(fktt fktt0) {
            this.b(11);
            throw new cjuh(38005, "Sync is disabled by flag!", null, fktt0);
        }
        catch(cqgp cqgp0) {
            this.b(8);
            throw new cjuh(7, "Sync failed with a network error!", null, cqgp0);
        }
        catch(cqgq cqgq0) {
            this.b(14);
            throw new cjuh(38006, "Sync was rejected by the server due to a failing precondition!", null, cqgq0);
        }
        catch(InterruptedException interruptedException0) {
            this.b(6);
            Thread.currentThread().interrupt();
            throw new cjuh(14, "Sync was interrupted!", null, interruptedException0);
        }
        catch(cqgm cqgm0) {
            this.b(5);
            this.g.d().s(cqgm0).ar(7126).z("Sync \'%d\' failed with an internal error!", this.a.a.f);
            throw new cjuh(8, "Sync failed with an internal error!", null, cqgm0);
        }
        catch(RuntimeException runtimeException0) {
            this.b(12);
            this.g.d().s(runtimeException0).ar(7127).z("Sync \'%d\' failed with an unexpected error!", this.a.a.f);
            throw new cjuh(8, "Sync failed with an unexpected error!", null, runtimeException0);
        }
        SyncResult syncResult0 = new SyncResult(arr_b);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.cL);
        this.h.a(Status.b, syncResult0, apiMetadata0);
        this.g.b().ar(7125).z("Operation \'%d\' completed successfully!", this.a.a.f);
        this.b(2);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.h.a(status0, null, ApiMetadata.b);
        this.g.b().ar(7128).F("Operation \'%d\' failed with status \'%d\'!", this.a.a.f, status0.i);
    }
}


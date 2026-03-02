import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.audit.LogAuditRecordsRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.IOException;

public final class acrl extends cjtm {
    private final grob a;
    private final LogAuditRecordsRequest b;
    private final azxs c;
    private acqh d;
    private long e;

    public acrl(grob grob0, LogAuditRecordsRequest logAuditRecordsRequest0, azxs azxs0, azug azug0) {
        super(0x9A, "LogAuditRecordsOperation", azug0);
        this.a = grob0;
        this.b = logAuditRecordsRequest0;
        this.c = azxs0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        Account account0;
        this.e = SystemClock.elapsedRealtime();
        this.d = new acqh();
        LogAuditRecordsRequest logAuditRecordsRequest0 = this.b;
        if(logAuditRecordsRequest0 != null) {
            byte[][] arr2_b = logAuditRecordsRequest0.d;
            if(arr2_b != null) {
                for(Object object0: hovo.a.b().a().b) {
                    acqy acqy0 = (acqy)object0;
                    if(acqy0.c.equals(this.a.g) && ((2 & acqy0.b) == 0 || ((long)this.a.f) >= (acqy0.d == null ? acqz.a : acqy0.d).b && ((long)this.a.f) <= (acqy0.d == null ? acqz.a : acqy0.d).c)) {
                        throw new cjuh(24500, "Request rejected.");
                    }
                }
                int v = 0;
                while(v < arr2_b.length) {
                    byte[] arr_b = arr2_b[v];
                    if(arr_b == null) {
                        throw new cjuh(10, "Empty request.");
                    }
                    long v1 = hovl.a.c().a();
                    if(((long)arr_b.length) > v1) {
                        throw new cjuh(10, "Size exceeds maximum record size.");
                    }
                    ++v;
                    continue;
                }
                int v2 = arr2_b.length;
                grnz[] arr_grnz = new grnz[v2];
                for(int v3 = 0; v3 < v2; ++v3) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grnz.a).v_newBuilder();
                    int v4 = logAuditRecordsRequest0.b;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    grnz grnz0 = (grnz)hftp0.b_message;
                    grnz0.b |= 4;
                    grnz0.d = v4;
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grog.a).v_newBuilder();
                    grob grob0 = this.a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    grog grog0 = (grog)hftp1.b_message;
                    grob0.getClass();
                    grog0.c = grob0;
                    grog0.b = 1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    grnz grnz1 = (grnz)hftp0.b_message;
                    grog grog1 = (grog)hftp1.N_build();
                    grog1.getClass();
                    grnz1.e = grog1;
                    grnz1.b |= 8;
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)groh.a).v_newBuilder();
                    long v5 = System.currentTimeMillis();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    groh groh0 = (groh)hftp2.b_message;
                    groh0.b |= 1;
                    groh0.c = v5;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    grnz grnz2 = (grnz)hftp0.b_message;
                    groh groh1 = (groh)hftp2.N_build();
                    groh1.getClass();
                    grnz2.f = groh1;
                    grnz2.b |= 16;
                    ByteString hfsf0 = ByteString.copyFrom(arr2_b[v3]);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    grnz grnz3 = (grnz)hftp0.b_message;
                    grnz3.b |= 1;
                    grnz3.c = hfsf0;
                    byte[] arr_b1 = logAuditRecordsRequest0.e;
                    if(arr_b1 != null) {
                        ByteString hfsf1 = ByteString.copyFrom(arr_b1);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        grnz grnz4 = (grnz)hftp0.b_message;
                        grnz4.b |= 0x40;
                        grnz4.h = hfsf1;
                    }
                    byte[] arr_b2 = logAuditRecordsRequest0.f;
                    if(arr_b2 != null) {
                        ByteString hfsf2 = ByteString.copyFrom(arr_b2);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        grnz grnz5 = (grnz)hftp0.b_message;
                        grnz5.b |= 0x20;
                        grnz5.g = hfsf2;
                    }
                    arr_grnz[v3] = (grnz)hftp0.N_build();
                }
                switch(logAuditRecordsRequest0.a) {
                    case 1: {
                        acrm acrm0 = new acrm(new bbfe_BaseGrpcServer(context0, hovz.a.b().f(), ((int)hovz.a.b().a()), -1, 0x1007));
                        String s = logAuditRecordsRequest0.c;
                        grob grob1 = this.a;
                        String s1 = grob1.g;
                        for(Object object1: bbmn.h(context0, "com.google.android.gms")) {
                            account0 = (Account)object1;
                            if(!account0.name.equals(s)) {
                                continue;
                            }
                            goto label_101;
                        }
                        account0 = null;
                    label_101:
                        baqr baqr0 = acrn.c(account0, s1, context0);
                        boolean z = baqr0.h();
                        int v6 = 0;
                        try {
                            while(v6 < v2) {
                                grnz grnz6 = arr_grnz[v6];
                                ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)grnz6).jf(5, null);
                                hftp3.X(((ProtoLiteMessage)grnz6));
                                groh groh2 = grnz6.f == null ? groh.a : grnz6.f;
                                ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)groh2).jf(5, null);
                                hftp4.X(((ProtoLiteMessage)groh2));
                                long v8 = System.currentTimeMillis();
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                groh groh3 = (groh)hftp4.b_message;
                                groh3.b |= 2;
                                groh3.d = v8;
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                grnz grnz7 = (grnz)hftp3.b_message;
                                groh groh4 = (groh)hftp4.N_build();
                                groh4.getClass();
                                grnz7.f = groh4;
                                grnz7.b |= 16;
                                grnz grnz8 = (grnz)hftp3.N_build();
                                try {
                                    acrn.b(baqr0, grnz8, acrm0);
                                    this.d.a(true, z, true, grnz8);
                                    ++v6;
                                    v2 = v2;
                                }
                                catch(iapn | iapl exception0) {
                                    this.d.a(true, z, false, grnz8);
                                    throw acrn.a(exception0) ? new cjuh(7, "RPC failed", null, exception0) : new cjuh(24500, "Request rejected", null, exception0);
                                }
                                catch(acse acse0) {
                                    this.d.a(true, z, false, grnz8);
                                    throw new cjuh(13, "Authentication failed", null, acse0);
                                }
                            }
                            acqh.d(logAuditRecordsRequest0, grob1, SystemClock.elapsedRealtime() - this.e, 0);
                            this.c.a(Status.b);
                        }
                        finally {
                            acrm0.a();
                        }
                        return;
                    }
                    case 2: {
                        acqr acqr0 = new acqr(context0);
                        try {
                            if(((long)(acqr0.a() + v2)) > hovl.b()) {
                                throw new cjuh(8, "Cache is full.");
                            }
                            String s2 = "";
                            String s3 = this.b.c;
                            if(!gfta.c(s3)) {
                                try {
                                    s2 = acso.e(context0, s3);
                                }
                                catch(acse | IOException unused_ex) {
                                }
                            }
                            for(int v10 = 0; v10 < v2; ++v10) {
                                if(!acqr0.e(arr_grnz[v10], s2)) {
                                    throw new cjuh(8, "Database error");
                                }
                            }
                            acqh.c(acqr0);
                        }
                        catch(LevelDbException levelDbException0) {
                            throw new cjuh(8, "Database error", null, levelDbException0);
                        }
                        finally {
                            acqr0.close();
                            acro.a().b();
                        }
                        long v11 = SystemClock.elapsedRealtime();
                        acqh.d(this.b, this.a, v11 - this.e, -1);
                        Status status0 = new Status(-1);
                        this.c.a(status0);
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
        }
        throw new cjuh(10, "Empty request.");
    }

    @Override  // cjtm
    public final void j(Status status0) {
        LogAuditRecordsRequest logAuditRecordsRequest0 = this.b;
        if(logAuditRecordsRequest0 != null && logAuditRecordsRequest0.d != null) {
            long v = SystemClock.elapsedRealtime();
            acqh.d(logAuditRecordsRequest0, this.a, v - this.e, status0.i);
        }
        this.c.a(status0);
    }
}


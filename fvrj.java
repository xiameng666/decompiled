import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class fvrj implements fwxu, fxzt {
    public final fvrp a;
    public final fvrp b;
    public final fvrl c;
    public final fwyd d;
    private final fvrp e;
    private boolean f;

    public fvrj(fwyd fwyd0, fvrl fvrl0) {
        Throwable throwable3;
        ProtoLiteMessage hftv0;
        hfsl hfsl0;
        hftc hftc0;
        BufferedInputStream bufferedInputStream0;
        Closeable closeable0 = null;
        super();
        this.d = fwyd0;
        this.c = fvrl0;
        long v = fwyd0.b();
        File file0 = fvrl0.e.a();
        if(file0 == null) {
            fvrl0.a(v);
        }
        else {
            try {
                bufferedInputStream0 = new BufferedInputStream(new FileInputStream((huqs.c() ? new File(ccsb.a.b(file0, "cp_state")) : new File(file0, "cp_state"))));
            }
            catch(FileNotFoundException unused_ex) {
                goto label_69;
            }
            catch(Throwable throwable0) {
                throwable3 = throwable0;
                fvrl.c(closeable0);
                throw throwable3;
            }
            try {
                try {
                    DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
                    if(dataInputStream0.readUnsignedShort() == 1) {
                        hftc0 = hftc.a();
                        hfsl0 = hfsl.N(dataInputStream0);
                        hftv0 = ((ProtoLiteMessage)gwvo.a).x_newMutableInstance();
                        goto label_17;
                    }
                    else {
                        fvrl0.a(v);
                    }
                }
                catch(IOException unused_ex) {
                    fvrl0.a(v);
                }
                goto label_66;
                try {
                label_17:
                    hfwc hfwc0 = hfvu.a.c(hftv0);
                    hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                    hfwc0.g(hftv0);
                    goto label_39;
                }
                catch(hfur hfur0) {
                }
                catch(hfwr hfwr0) {
                    goto label_26;
                }
                catch(IOException iOException0) {
                    goto label_30;
                }
                catch(RuntimeException runtimeException0) {
                    goto label_36;
                }
                try {
                    hfur hfur1 = hfur0.b ? new hfur(hfur0) : hfur0;
                    hfur1.a = hftv0;
                    throw hfur1;
                label_26:
                    hfur hfur2 = hfwr0.a();
                    hfur2.a = hftv0;
                    throw hfur2;
                label_30:
                    if((iOException0.getCause() instanceof hfur)) {
                        throw (hfur)iOException0.getCause();
                    }
                    hfur hfur3 = new hfur(iOException0);
                    hfur3.a = hftv0;
                    throw hfur3;
                label_36:
                    if((runtimeException0.getCause() instanceof hfur)) {
                        throw (hfur)runtimeException0.getCause();
                    }
                    throw runtimeException0;
                label_39:
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    long v1 = ((gwvo)hftv0).d;
                    if(v1 > 0L) {
                        long v2 = ((gwvo)hftv0).c;
                        fvrp fvrp0 = fvrl0.b;
                        gwwd gwwd0 = ((gwvo)hftv0).e;
                        if(gwwd0 == null) {
                            gwwd0 = gwwd.a;
                        }
                        fvrp0.e(v, v2, v1, gwwd0);
                        fvrp fvrp1 = fvrl0.c;
                        gwwd gwwd1 = ((gwvo)hftv0).f;
                        if(gwwd1 == null) {
                            gwwd1 = gwwd.a;
                        }
                        fvrp1.e(v, v2, v1, gwwd1);
                        fvrp fvrp2 = fvrl0.d;
                        gwwd gwwd2 = ((gwvo)hftv0).g;
                        if(gwwd2 == null) {
                            gwwd2 = gwwd.a;
                        }
                        fvrp2.e(v, v2, v1, gwwd2);
                    }
                    else {
                        fvrl0.a(v);
                    }
                }
                catch(IOException unused_ex) {
                    fvrl0.a(v);
                }
                goto label_66;
            }
            catch(Throwable throwable1) {
                try {
                    fvrl.c(bufferedInputStream0);
                    throw throwable1;
                label_66:
                    fvrl.c(bufferedInputStream0);
                    goto label_81;
                }
                catch(FileNotFoundException unused_ex) {
                }
                catch(Throwable throwable2) {
                    throwable3 = throwable2;
                    closeable0 = bufferedInputStream0;
                    fvrl.c(closeable0);
                    throw throwable3;
                }
            }
            closeable0 = bufferedInputStream0;
            try {
            label_69:
                fvrl0.a(v);
            }
            catch(Throwable throwable0) {
                throwable3 = throwable0;
                fvrl.c(closeable0);
                throw throwable3;
            }
            fvrl.c(closeable0);
            goto label_82;
        label_81:
            fvrl.c(bufferedInputStream0);
        }
    label_82:
        fvrl0.b(v);
        this.a = fvrl0.b;
        this.e = fvrl0.c;
        this.b = fvrl0.d;
        this.f = true;
    }

    @Override  // fwxu
    public final void a(long v) {
        synchronized(this) {
            if(!this.f) {
                return;
            }
            long v2 = this.d.b();
            this.a.j(v, v2);
            this.c.b(v2);
        }
    }

    @Override  // fwxu
    public final boolean b(long v) {
        boolean z;
        synchronized(this) {
            if(!this.f) {
                return true;
            }
            long v2 = this.d.b();
            z = this.a.h(v, v2, true);
        }
        return z;
    }

    public final void c(boolean z) {
        synchronized(this) {
            this.f = z;
        }
    }

    @Override  // fxzt
    public final void e() {
        this.a.g();
        this.e.g();
    }

    @Override  // fxzt
    public final void f(ProtoLiteBuilder hftp0, long v) {
        gxnh gxnh0 = this.a.d();
        gxnh gxnh1 = this.e.d();
        if(gxnh0 != null && gxnh1 != null) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gxna.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((gxna)hftv0).c = gxnh0;
            ((gxna)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gxna)hftp1.b_message).d = gxnh1;
            ((gxna)hftp1.b_message).b |= 4;
            gxna gxna0 = (gxna)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gxng gxng0 = (gxng)hftp0.b_message;
            gxna0.getClass();
            gxng0.f = gxna0;
            gxng0.b |= 0x400;
        }
    }
}


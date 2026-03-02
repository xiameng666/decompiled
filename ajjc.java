import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.auth.cryptauth.AppContextProvider;
import java.io.IOException;
import java.math.BigInteger;

public final class ajjc implements ygn {
    public final ajgr a;
    private final ajit b;
    private static final baun c;

    static {
        ajjc.c = new baun(new String[]{"CryptauthEnrollmentService"}, null);
    }

    public ajjc(Context context0, Account account0, ajit ajit0) {
        ajgt ajgt0 = (ajgt)ajgt.a.b();
        ajgr ajgr0 = new ajgr(context0, account0, ajit0, hptd.a.b().a());
        super();
        this.a = ajgr0;
        this.b = ajit0;
    }

    @Override  // ygn
    public final gmlg a(gmkz gmkz0) {
        Class class0;
        gRPCMethodDescriptor iaoj0;
        iakr iakr0;
        gmks gmks1;
        gmks gmks0;
        this.b.a(1, -1L);
        try {
            try {
                gmks0 = this.a.d();
            }
            catch(acse | IOException exception0) {
                throw new ygv("failed to create stub", exception0, ygl.n);
            }
            try {
                gmks1 = (gmks)gmks0.q(cmlp.a, cjzi.b);
                iakr0 = gmks1.a;
                iaoj0 = gmkt.a;
                if(iaoj0 == null) {
                    class0 = gmkt.class;
                    __monitor_enter(class0);
                    goto label_11;
                }
                goto label_27;
            }
            catch(iapn iapn0) {
                goto label_44;
            }
        }
        catch(ygv ygv0) {
            goto label_56;
        }
        try {
        label_11:
            gRPCMethodDescriptor iaoj1 = gmkt.a;
            if(iaoj1 == null) {
                gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                iaog0.methodType = gRPCMethodType.a;
                iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.cryptauth.enrollment.v1.Enrollment", "SyncKeys");
                iaog0.setSampledToLocalTracing();
                iaog0.requestMarshaller = new ibjh(((MessageLite)gmkz.a));
                iaog0.responseMarshaller = new ibjh(((MessageLite)gmlg.a));
                iaoj1 = iaog0.build();
                gmkt.a = iaoj1;
            }
            __monitor_exit(class0);
            iaoj0 = iaoj1;
            goto label_27;
        }
        catch(Throwable throwable0) {
            try {
                try {
                    __monitor_exit(class0);
                    throw throwable0;
                label_27:
                    gmlg gmlg0 = (gmlg)ibjw.b(iakr0, iaoj0, gmks1.b, gmkz0);
                    this.b.a = new BigInteger(gmlg0.c.toByteArray()).longValue();
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghqs.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ghqs ghqs0 = (ghqs)hftp0.b_message;
                    ghqs0.b |= 1;
                    ghqs0.c = true;
                    boolean z = hptw.c();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ghqs ghqs1 = (ghqs)hftp0.b_message;
                    ghqs1.b |= 4;
                    ghqs1.e = z;
                    ajit.b(((ghqs)hftp0.N_build()));
                    return gmlg0;
                }
                catch(iapn iapn0) {
                label_44:
                    if(!hptw.c()) {
                        throw new ygv("Failed to make SyncKeysRequest", iapn0, ajjc.c(iapn0.a.t));
                    }
                    if(iapn0.a.t != iapk.g.t) {
                        throw new ygv("Failed to make SyncKeysRequest", iapn0, ajjc.c(iapn0.a.t));
                    }
                    ajjc.c.m("Invalid Instance ID token detected. Deleting it to force a refresh on the next attempt.", new Object[0]);
                    try {
                        bzoe.h(AppContextProvider.a()).g(hpta.h());
                        ajjc.c.h("Instance ID token deleted successfully.", new Object[0]);
                    }
                    catch(IOException iOException0) {
                        ajjc.c.m("Failed to delete Instance ID token.", new Object[0]);
                        throw new ygv("Failed to delete Instance ID token.", iOException0, ygl.e);
                    }
                    throw new ygv("Invalid Instance ID token detected.", iapn0, ygl.d);
                }
            }
            catch(ygv ygv0) {
            }
        }
    label_56:
        String s = ygv0.getMessage();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghqs.a).v_newBuilder();
        if(s == null) {
            s = "";
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((ghqs)hftv0).b |= 2;
        ((ghqs)hftv0).d = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghqs ghqs2 = (ghqs)hftp1.b_message;
        ghqs2.b |= 1;
        ghqs2.c = false;
        boolean z1 = hptw.c();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghqs ghqs3 = (ghqs)hftp1.b_message;
        ghqs3.b |= 4;
        ghqs3.e = z1;
        ajit.b(((ghqs)hftp1.N_build()));
        throw ygv0;
    }

    public final void b() {
        this.a.b();
    }

    public static final ygl c(iaph iaph0) {
        return iaph0.ordinal() == 1 || iaph0.ordinal() == 4 || iaph0.ordinal() == 8 || iaph0.ordinal() == 10 || iaph0.ordinal() == 14 ? ygl.d : ygl.e;
    }
}


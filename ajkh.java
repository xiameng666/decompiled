import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.DeviceFeatureStatus;
import com.google.android.gms.auth.cryptauth.DeviceFeatureStatusChange;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.List;

public final class ajkh extends cjtm {
    private final azxs a;
    private final Account b;
    private final String c;
    private final List d;
    private final int e;

    public ajkh(azxs azxs0, String s, Account account0, int v, List list0, azug azug0) {
        super(0x81, "SetFeatureStatusesOperation", azug0);
        this.a = azxs0;
        this.b = account0;
        this.c = s;
        this.d = list0;
        this.e = v;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        Class class0;
        gRPCMethodDescriptor iaoj0;
        iakr iakr0;
        gmjx gmjx1;
        gmjx gmjx0;
        gmjr gmjr2;
        gmka gmka0;
        if(hptg.c()) {
            ajit ajit0 = new ajit(context0, 0, 3);
            ajga ajga0 = ajfz.a(context0, this.b, ajit0);
            try {
                ajgj ajgj0 = new ajgj(context0);
                ajgb ajgb0 = new ajgb(context0);
                String s = this.c;
                List list0 = this.d;
                int v1 = this.e;
                try {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmkk.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gmkk)hftp0.b_message).b = v1;
                    gmka0 = ajgj0.a(s, ((gmkk)hftp0.N_build()));
                }
                catch(ajgo ajgo0) {
                    ajir.a(new ajiq(6, 11, null, 0));
                    throw new ajgk("Failed to generate request context", ajgo0);
                }
                String s1 = ajgb0.a();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gmju.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gmju gmju0 = (gmju)hftp1.b_message;
                s1.getClass();
                gmju0.b = s1;
                for(Object object0: list0) {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gmjt.a).v_newBuilder();
                    DeviceFeatureStatus deviceFeatureStatus0 = ((DeviceFeatureStatusChange)object0).b;
                    String s2 = deviceFeatureStatus0.b;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp2.b_message;
                    s2.getClass();
                    ((gmjt)hftv0).b = s2;
                    boolean z = deviceFeatureStatus0.c;
                    if(!hftv0.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp2.b_message;
                    ((gmjt)hftv1).c = z;
                    boolean z1 = ((DeviceFeatureStatusChange)object0).c;
                    if(!hftv1.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((gmjt)hftp2.b_message).d = z1;
                    gmjt gmjt0 = (gmjt)hftp2.N_build();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gmju gmju1 = (gmju)hftp1.b_message;
                    gmjt0.getClass();
                    hfuo hfuo0 = gmju1.c;
                    if(!hfuo0.c()) {
                        gmju1.c = ProtoLiteMessage.E(hfuo0);
                    }
                    gmju1.c.add(gmjt0);
                }
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gmjr.a).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gmjr gmjr0 = (gmjr)hftp3.b_message;
                gmka0.getClass();
                gmjr0.c = gmka0;
                gmjr0.b |= 1;
                gmju gmju2 = (gmju)hftp1.N_build();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gmjr gmjr1 = (gmjr)hftp3.b_message;
                gmju2.getClass();
                hfuo hfuo1 = gmjr1.d;
                if(!hfuo1.c()) {
                    gmjr1.d = ProtoLiteMessage.E(hfuo1);
                }
                gmjr1.d.add(gmju2);
                gmjr2 = (gmjr)hftp3.N_build();
                try {
                    try {
                        gmjx0 = ajga0.a.c();
                    }
                    catch(acse | IOException exception0) {
                        throw new ygb("failed to create stub", exception0, 5);
                    }
                    try {
                        gmjx1 = (gmjx)gmjx0.q(cmlp.a, cjze.b);
                        iakr0 = gmjx1.a;
                        iaoj0 = gmjy.d;
                        if(iaoj0 == null) {
                            class0 = gmjy.class;
                            __monitor_enter(class0);
                            goto label_82;
                        }
                        goto label_98;
                    }
                    catch(iapn iapn0) {
                        throw new ygb("Failed to make BatchSetFeatureStatusesRequest", iapn0, ajga.c(iapn0.a.t));
                    }
                }
                catch(ygb ygb0) {
                    goto label_105;
                }
            }
            catch(ajgk unused_ex) {
                this.a.a(Status.d);
                return;
            }
            finally {
                ajga0.a();
            }
            try {
            label_82:
                gRPCMethodDescriptor iaoj1 = gmjy.d;
                if(iaoj1 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.cryptauth.devicesync.v1.DeviceSync", "BatchSetFeatureStatuses");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)gmjr.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)gmjs.a));
                    iaoj1 = iaog0.build();
                    gmjy.d = iaoj1;
                }
                __monitor_exit(class0);
                iaoj0 = iaoj1;
                goto label_98;
            }
            catch(Throwable throwable0) {
                try {
                    try {
                        try {
                            __monitor_exit(class0);
                            throw throwable0;
                        label_98:
                            gmjs gmjs0 = (gmjs)ibjw.b(iakr0, iaoj0, gmjx1.b, gmjr2);
                        }
                        catch(iapn iapn0) {
                            throw new ygb("Failed to make BatchSetFeatureStatusesRequest", iapn0, ajga.c(iapn0.a.t));
                        }
                        ajir.a(new ajiq(6, 2, null, 0));
                        goto label_110;
                    }
                    catch(ygb ygb0) {
                    }
                label_105:
                    ajir.a(new ajiq(6, ygb0.a, null, 0));
                    throw new ajgk("Failed to make set feature statuses request", ygb0);
                }
                catch(ajgk unused_ex) {
                }
            }
            this.a.a(Status.d);
            return;
        }
    label_110:
        this.a.a(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}


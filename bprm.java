import android.accounts.Account;
import com.google.android.gms.findmydevice.spot.sync.NotableLocationsRefreshService;
import java.util.ArrayList;

public final class bprm implements glzn {
    public final NotableLocationsRefreshService a;

    public bprm(NotableLocationsRefreshService notableLocationsRefreshService0) {
        this.a = notableLocationsRefreshService0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gmcd gmcd0;
        if(bouv.c(((fqzl)object0))) {
            bpcn bpcn0 = this.a.b.q();
            if(hsww.c() && bpcn0.e.a() < bpcn0.g) {
                gmcd0 = gmbu.i(Boolean.valueOf(true));
            }
            else {
                gged_interceptors gged0 = bpsq.g(bpcn0.b);
                if(gged0.isEmpty()) {
                    gmcd0 = gdta.g(bpcn0.d.p(ggna.a)).h(new bpck(), gmap.a);
                }
                else {
                    ArrayList arrayList0 = new ArrayList();
                    int v1 = gged0.size();
                    for(int v = 0; v < v1; ++v) {
                        Account account0 = (Account)gged0.get(v);
                        gftb.check(account0);
                        gtdj gtdj0 = (gtdj)bpcn0.c.a(account0).a().a.q(cmlp.a, ckfq.b);
                        gtbi gtbi0 = gtbi.a;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtbi0).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gtbi)hftp0.b_message).b = true;
                        gtbi gtbi1 = (gtbi)hftp0.N_build();
                        iakr iakr0 = gtdj0.a;
                        gRPCMethodDescriptor iaoj0 = gtdk.b;
                        if(iaoj0 == null) {
                            synchronized(gtdk.class) {
                                iaoj0 = gtdk.b;
                                if(iaoj0 == null) {
                                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                                    iaog0.methodType = gRPCMethodType.a;
                                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.spot.v1.SpotService", "GetUser");
                                    iaog0.setSampledToLocalTracing();
                                    iaog0.requestMarshaller = new ibjh(((MessageLite)gtbi0));
                                    iaog0.responseMarshaller = new ibjh(((MessageLite)gtbj.a));
                                    gRPCMethodDescriptor iaoj1 = iaog0.build();
                                    gtdk.b = iaoj1;
                                    iaoj0 = iaoj1;
                                }
                            }
                        }
                        arrayList0.add(gdta.g(bnka.a(ibjw.a(iakr0.a(iaoj0, gtdj0.b), gtbi1), "getUser")));
                    }
                    gmcd0 = gdtd.g(arrayList0).b(new bpcl(bpcn0, arrayList0), bpcn0.f);
                }
            }
            gdta gdta0 = gdta.g(gmcd0).h(new bprk(), gmap.a);
            bprl bprl0 = new bprl();
            return gdta0.e(Throwable.class, bprl0, gmap.a);
        }
        return gmbu.i(Integer.valueOf(0));
    }
}


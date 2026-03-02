import java.util.concurrent.TimeUnit;

public final class fwxm implements glzm {
    public final fwxq a;
    public final gxmp b;
    public final String c;
    public final hebp d;
    public final int e;

    public fwxm(fwxq fwxq0, gxmp gxmp0, int v, String s, hebp hebp0) {
        this.a = fwxq0;
        this.b = gxmp0;
        this.e = v;
        this.c = s;
        this.d = hebp0;
    }

    @Override  // glzm
    public final gmcd a() {
        ckcq ckcq0;
        switch(this.e - 1) {
            case 1: {
                ckcq0 = ckik.b;
                break;
            }
            case 2: {
                ckcq0 = ckdo.b;
                break;
            }
            default: {
                ckcq0 = ckih.b;
            }
        }
        fwxq fwxq0 = this.a;
        gxmu gxmu0 = (gxmu)((gxmu)((gxmu)((gxmu)fwxq0.b.mr()).q(gpmu.a, this.d)).q(cmlp.a, ckcq0)).o(90L, TimeUnit.SECONDS);
        iakr iakr0 = gxmu0.a;
        gRPCMethodDescriptor iaoj0 = gxmv.a;
        if(iaoj0 == null) {
            synchronized(gxmv.class) {
                iaoj0 = gxmv.a;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.android.location.kollektomat.v1.KollektomatService", "Offer");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)gxmp.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)gxmq.a));
                    iaoj0 = iaog0.build();
                    gxmv.a = iaoj0;
                }
            }
        }
        gmcd gmcd0 = ibjw.a(iakr0.a(iaoj0, gxmu0.b), this.b);
        fwxo fwxo0 = new fwxo(fwxq0, this.c);
        return glyi.f(gmcd0, iapn.class, fwxo0, gmap.a);
    }
}


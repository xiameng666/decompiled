import android.accounts.Account;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

@ibnh
public final class bplf {
    public static final Object a;
    public final bboh b;
    public final Object c;
    public final bare d;
    public final bare e;
    public final Context f;
    public final gmcg g;
    public final bnnl h;
    public final Display i;
    private final boph j;

    static {
        bplf.a = new Object();
    }

    public bplf(Context context0, boph boph0, bnnl bnnl0, gmcg gmcg0) {
        this.b = bboh.b("TapToIdHandler", bbcu.eD);
        this.c = new Object();
        this.f = context0;
        this.h = bnnl0;
        this.j = boph0;
        this.g = gmcg0;
        this.i = ((DisplayManager)context0.getSystemService(DisplayManager.class)).getDisplay(0);
        this.d = new bare(10, -1L, hsxv.a.y().at(), TimeUnit.SECONDS);
        this.e = new bare(10, -1L, hsxv.a.y().av(), TimeUnit.SECONDS);
    }

    public final gmcd a(gtch gtch0, Queue queue0) {
        Account account0 = (Account)queue0.poll();
        gftb.check(account0);
        bnla bnla0 = this.j.a(account0).a();
        gtbd gtbd0 = gtbd.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtbd0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtbd gtbd1 = (gtbd)hftp0.b_message;
        gtch0.getClass();
        gtbd1.c = gtch0;
        gtbd1.b |= 1;
        gtdj gtdj0 = (gtdj)bnla0.a.q(cmlp.a, ckfb.b);
        gtbd gtbd2 = (gtbd)hftp0.N_build();
        iakr iakr0 = gtdj0.a;
        gRPCMethodDescriptor iaoj0 = gtdk.k;
        if(iaoj0 == null) {
            synchronized(gtdk.class) {
                iaoj0 = gtdk.k;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.spot.v1.SpotService", "GetScannedDeviceInfo");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)gtbd0));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)gtbf.a));
                    gRPCMethodDescriptor iaoj1 = iaog0.build();
                    gtdk.k = iaoj1;
                    iaoj0 = iaoj1;
                }
            }
        }
        gdta gdta0 = gdta.g(gdta.g(bnka.a(ibjw.a(iakr0.a(iaoj0, gtdj0.b), gtbd2), "getScannedDeviceInfo")));
        bplb bplb0 = new bplb(this, queue0, gtch0);
        return gdta0.f(Throwable.class, bplb0, this.g);
    }
}


import android.content.Context;
import j..util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class aqvq implements aqvg {
    private final aqvf a;
    private final gful_cronetEngineProvider b;
    private final gful_cronetEngineProvider c;

    public aqvq(Context context0, aquw aquw0) {
        aqvf aqvf0 = aqvf.b(context0, 4);
        Objects.requireNonNull(aquw0);
        aqvp aqvp0 = new aqvp(aquw0);
        super();
        this.c = gfus.a(((gful_cronetEngineProvider)new aqvo()));
        this.a = aqvf0;
        this.b = gfus.a(((gful_cronetEngineProvider)aqvp0));
    }

    @Override  // aqvg
    public final aqvk a(aqvd aqvd0) {
        Long long0;
        try {
            long0 = this.a.a();
            aqvk aqvk0 = this.b();
            this.a.g(15, aqvd0, aqvk0, long0);
            return aqvk0;
        }
        catch(InterruptedException | ExecutionException | TimeoutException exception0) {
            if((exception0 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            this.a.f(15, aqvd0, aqvf.d(true, exception0), long0);
            return new aqvk(aqvj.c, null, exception0);
        }
    }

    @Override  // aqvg
    public final aqvk b() {
        fpyd fpyd0 = fpyd.a;
        fpyg fpyg0 = (fpyg)this.b.mr();
        iakr iakr0 = fpyg0.a;
        gRPCMethodDescriptor iaoj0 = fpyh.c;
        if(iaoj0 == null) {
            synchronized(fpyh.class) {
                iaoj0 = fpyh.c;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("com.google.android.libraries.restore.backup.photos.apiservice.PhotosBackupApiService", "GetPhotosBackupSettings");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)fpyd0));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)fpye.a));
                    iaoj0 = iaog0.build();
                    fpyh.c = iaoj0;
                }
            }
        }
        fpye fpye0 = (fpye)((glyq)ibjw.a(iakr0.a(iaoj0, fpyg0.b), fpyd0)).v(((Long)this.c.mr()).longValue(), TimeUnit.SECONDS);
        return fpye0.b ? new aqvk(aqvj.a, (fpye0.c == null ? fpxw.a : fpye0.c).c, null) : new aqvk(aqvj.b, null, null);
    }
}


import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class eiir implements Callable {
    public final eiit a;
    public final baqr b;
    public final gtch c;

    public eiir(eiit eiit0, baqr baqr0, gtch gtch0) {
        this.a = eiit0;
        this.b = baqr0;
        this.c = gtch0;
    }

    @Override
    public final Object call() {
        eiiu eiiu0 = new eiiu(this.a.a, cmlp.a, cktd.b);
        gtbd gtbd0 = gtbd.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtbd0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtbd gtbd1 = (gtbd)hftp0.b_message;
        this.c.getClass();
        gtbd1.c = this.c;
        gtbd1.b |= 1;
        String s = Locale.getDefault().toLanguageTag();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtbd gtbd2 = (gtbd)hftp0.b_message;
        s.getClass();
        gtbd2.d = s;
        gtbd gtbd3 = (gtbd)hftp0.N_build();
        if(eiiu.b == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gtbd0));
            ibjh ibjh1 = new ibjh(((MessageLite)gtbf.a));
            eiiu.b = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.spot.v1.SpotService/GetScannedDeviceInfo", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (gtbf)eiiu0.c.callUnaryWithAuth(eiiu.b, this.b, gtbd3, ((long)eiiu.a), TimeUnit.MILLISECONDS, eiiu0.d);
    }
}


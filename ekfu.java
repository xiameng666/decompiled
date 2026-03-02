import android.content.Context;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public final class ekfu {
    public final ekft a;
    public final ekfs b;

    public ekfu(Context context0) {
        bbfe_BaseGrpcServer bbfe0 = new bbfe_BaseGrpcServer(context0, hxuc.a.c().c(), ((int)hxuc.a.c().a()), context0.getApplicationInfo().uid, 0x3700);
        hxty hxty0 = hxty.a;
        if(hxty0.b().h()) {
            bbfe0.g = hxty0.b().f();
        }
        this.a = new ekft(bbfe0);
        this.b = new ekfs(bbfe0);
    }

    public final gsug a(baqr baqr0, String s, String[] arr_s) {
        gsue gsue0 = gsue.a;
        gsud gsud0 = (gsud)((ProtoLiteMessage)gsue0).v_newBuilder();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gssl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gssl gssl0 = (gssl)hftp0.b_message;
        s.getClass();
        gssl0.b = s;
        if(!gsud0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gsud0).ensureMutable();
        }
        gsue gsue1 = (gsue)gsud0.b_message;
        gssl gssl1 = (gssl)hftp0.N_build();
        gssl1.getClass();
        gsue1.c = gssl1;
        gsue1.b |= 1;
        if(arr_s != null) {
            gsud0.a(Arrays.asList(arr_s));
        }
        if(!gsud0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gsud0).ensureMutable();
        }
        gsue.b(((gsue)gsud0.b_message));
        if(!gsud0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gsud0).ensureMutable();
        }
        ((gsue)gsud0.b_message).e = "";
        ekft ekft0 = new ekft(this.a, cmlp.a, ckui.b);
        gsue gsue2 = (gsue)((ProtoLiteBuilder)gsud0).N_build();
        long v = hxuc.b();
        if(ekft.a == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gsue0));
            ibjh ibjh1 = new ibjh(((MessageLite)gsug.a));
            ekft.a = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.people.v2.InternalPeopleService/RestoreDeviceContacts", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (gsug)ekft0.b.callUnaryWithAuth(ekft.a, baqr0, gsue2, v, TimeUnit.MILLISECONDS, ekft0.c);
    }
}


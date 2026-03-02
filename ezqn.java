import com.google.android.gms.udc.UdcCacheResponse.UdcSetting;

public final class ezqn implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hffi.a).v_newBuilder();
        int v = ((UdcCacheResponse.UdcSetting)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hffi)hftv0).b |= 1;
        ((hffi)hftv0).c = v;
        int v1 = ((UdcCacheResponse.UdcSetting)object0).b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hffi)hftv1).b |= 2;
        ((hffi)hftv1).d = v1;
        boolean z = ((UdcCacheResponse.UdcSetting)object0).c.a;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        hffi hffi0 = (hffi)hftp0.b_message;
        hffi0.b |= 4;
        hffi0.e = z;
        return (hffi)hftp0.N_build();
    }
}


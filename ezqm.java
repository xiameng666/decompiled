import com.google.android.gms.udc.UdcWriteLocalSettingsRequest.SettingChange;

public final class ezqm implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hffd.a).v_newBuilder();
        int v = ((UdcWriteLocalSettingsRequest.SettingChange)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hffd)hftv0).b |= 1;
        ((hffd)hftv0).c = v;
        boolean z = ((UdcWriteLocalSettingsRequest.SettingChange)object0).b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hffd hffd0 = (hffd)hftp0.b_message;
        hffd0.b |= 2;
        hffd0.d = z;
        return (hffd)hftp0.N_build();
    }
}


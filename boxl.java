import com.google.android.gms.common.api.Status;
import com.google.android.gms.findmydevice.spot.DisableLocationReportingRequest;

public final class boxl implements bpnj {
    private final fqxe a;
    private final fgvt b;

    public boxl(fqxe fqxe0, fgvt fgvt0) {
        this.a = fqxe0;
        this.b = fgvt0;
    }

    @Override  // bpnj
    public final gmcd a(Object object0) {
        String s = ((DisableLocationReportingRequest)object0).a;
        if(s == null) {
            return gmbu.h(new aztb(new Status(10, "BLE MAC address must be provided.")));
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fqzb.a).v_newBuilder();
        hfwn hfwn0 = hfyg.b(this.b.d());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hfwn0.getClass();
        ((fqzb)hftv0).c = hfwn0;
        ((fqzb)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fqzb fqzb0 = (fqzb)hftp0.b_message;
        fqzb0.b |= 2;
        fqzb0.d = s;
        fqzb fqzb1 = (fqzb)hftp0.N_build();
        bosr bosr0 = new bosr(((boul)this.a), fqzb1);
        return gdta.g(((boul)this.a).j.b(bosr0, gmap.a)).h(new boxk(), gmap.a);
    }
}


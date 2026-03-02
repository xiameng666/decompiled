import android.net.wifi.ScanResult;

public final class fhom implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fhqm.a).v_newBuilder();
        String s = ((ScanResult)object0).SSID;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fhqm fhqm0 = (fhqm)hftp0.b_message;
        s.getClass();
        fhqm0.b |= 1;
        fhqm0.c = s;
        int v = ((ScanResult)object0).level;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fhqm fhqm1 = (fhqm)hftp0.b_message;
        fhqm1.b |= 2;
        fhqm1.d = v;
        hfwn hfwn0 = hfyn.g(((ScanResult)object0).timestamp);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fhqm fhqm2 = (fhqm)hftp0.b_message;
        hfwn0.getClass();
        fhqm2.e = hfwn0;
        fhqm2.b |= 4;
        return (fhqm)hftp0.N_build();
    }
}


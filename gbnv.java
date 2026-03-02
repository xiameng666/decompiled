import android.text.TextUtils;

public final class gbnv {
    public static hdcz a(String s) {
        if(TextUtils.isEmpty(s)) {
            return hdcz.a;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hdcz.a).v_newBuilder();
        hftr hftr0 = (hftr)((ProtoLiteMessage)hcrz.a).v_newBuilder();
        hfta hfta0 = hddt.f;
        int v = hfta0.a();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcrz hcrz0 = (hcrz)hftr0.b_message;
        hcrz0.b |= 1;
        hcrz0.d = v;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hddt.a).v_newBuilder();
        hdds hdds0 = hdds.g;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hddt)hftp1.b_message).e = hdds0.p;
        ((hddt)hftp1.b_message).b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hddg.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hddg hddg0 = (hddg)hftp2.b_message;
        s.getClass();
        hddg0.b |= 1;
        hddg0.c = s;
        hddg hddg1 = (hddg)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hddt hddt0 = (hddt)hftp1.b_message;
        hddg1.getClass();
        hddt0.d = hddg1;
        hddt0.c = 7;
        hftr0.n(hfta0, ((hddt)hftp1.N_build()));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdcz hdcz0 = (hdcz)hftp0.b_message;
        hcrz hcrz1 = (hcrz)((ProtoLiteBuilder)hftr0).N_build();
        hcrz1.getClass();
        hfuo hfuo0 = hdcz0.b;
        if(!hfuo0.c()) {
            hdcz0.b = ProtoLiteMessage.E(hfuo0);
        }
        hdcz0.b.add(hcrz1);
        return (hdcz)hftp0.N_build();
    }

    public static hdsi b(float f) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hdsi.a).v_newBuilder();
        hdsh hdsh0 = hdsh.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdsi)hftp0.b_message).c = hdsh0.f;
        ((hdsi)hftp0.b_message).b |= 1;
        hdsn hdsn0 = gbnv.c(f);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdsi hdsi0 = (hdsi)hftp0.b_message;
        hdsn0.getClass();
        hdsi0.d = hdsn0;
        hdsi0.b |= 2;
        return (hdsi)hftp0.N_build();
    }

    public static hdsn c(float f) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hdsn.a).v_newBuilder();
        hdsm hdsm0 = hdsm.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hdsn)hftv0).c = hdsm0.g;
        ((hdsn)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdsn hdsn0 = (hdsn)hftp0.b_message;
        hdsn0.b |= 2;
        hdsn0.d = f;
        return (hdsn)hftp0.N_build();
    }
}


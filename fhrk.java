import android.net.Uri.Builder;
import android.net.Uri;

public final class fhrk {
    static {
        Uri.parse("https://www.google.com/assistant/wearables/setup");
    }

    public static Uri a(String s) {
        ProtoLiteBuilder hftp0;
        hfta hfta0 = wdb.d;
        if(s == null) {
            hftp0 = ((ProtoLiteMessage)wdb.a).v_newBuilder();
        }
        else {
            hftp0 = ((ProtoLiteMessage)wdb.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            wdb wdb0 = (wdb)hftp0.b_message;
            wdb0.b |= 1;
            wdb0.c = s;
        }
        wdb wdb1 = (wdb)hftp0.N_build();
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("googleapp").authority("deeplink").path("/");
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fpzm.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fpzi.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        fpzi fpzi0 = (fpzi)hftp2.b_message;
        fpzi0.b |= 1;
        fpzi0.c = "https://www.google.com";
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fpzm fpzm0 = (fpzm)hftp1.b_message;
        fpzi fpzi1 = (fpzi)hftp2.N_build();
        fpzi1.getClass();
        fpzm0.f = fpzi1;
        fpzm0.b |= 8;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)fpzl.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        fpzl fpzl0 = (fpzl)hftp3.b_message;
        fpzl0.b |= 1;
        fpzl0.c = 0x11ED080F;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fpzm fpzm1 = (fpzm)hftp1.b_message;
        fpzl fpzl1 = (fpzl)hftp3.N_build();
        fpzl1.getClass();
        fpzm1.c = fpzl1;
        fpzm1.b |= 1;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)fpzk.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        fpzk fpzk0 = (fpzk)hftp4.b_message;
        fpzk0.b |= 1;
        fpzk0.c = 746;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fpzm fpzm2 = (fpzm)hftp1.b_message;
        fpzk fpzk1 = (fpzk)hftp4.N_build();
        fpzk1.getClass();
        fpzm2.d = fpzk1;
        fpzm2.b |= 2;
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)fpzj.a).v_newBuilder();
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)fpzn.a).v_newBuilder();
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        ((fpzn)hftp6.b_message).c = 9;
        ((fpzn)hftp6.b_message).b |= 1;
        hftr hftr0 = (hftr)((ProtoLiteMessage)wda.a).v_newBuilder();
        hftr hftr1 = (hftr)((ProtoLiteMessage)fpzr.a).v_newBuilder();
        hftr1.n(hfta0, wdb1);
        fpzr fpzr0 = (fpzr)((ProtoLiteBuilder)hftr1).N_build();
        hftr0.n(fpzq.a, fpzr0);
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        fpzn fpzn0 = (fpzn)hftp6.b_message;
        wda wda0 = (wda)((ProtoLiteBuilder)hftr0).N_build();
        wda0.getClass();
        fpzn0.d = wda0;
        fpzn0.b |= 2;
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        fpzj fpzj0 = (fpzj)hftp5.b_message;
        fpzn fpzn1 = (fpzn)hftp6.N_build();
        fpzn1.getClass();
        fpzj0.c = fpzn1;
        fpzj0.b = 2;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fpzm fpzm3 = (fpzm)hftp1.b_message;
        fpzj fpzj1 = (fpzj)hftp5.N_build();
        fpzj1.getClass();
        fpzm3.e = fpzj1;
        fpzm3.b |= 4;
        fpzm fpzm4 = (fpzm)hftp1.N_build();
        ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)fpzp.a).v_newBuilder();
        ByteString hfsf0 = fpzm4.getDefaultInstanceForType();
        if(!hftp7.b_message.isImmutable()) {
            hftp7.ensureMutable();
        }
        fpzp fpzp0 = (fpzp)hftp7.b_message;
        fpzp0.b |= 2;
        fpzp0.c = hfsf0;
        Uri.Builder uri$Builder1 = uri$Builder0.appendQueryParameter("data", ghjc.e.g().o(((fpzp)hftp7.N_build()).toBytesArray()));
        uri$Builder1.appendQueryParameter("theme_code", "0");
        return uri$Builder1.build();
    }
}


import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import java.util.Iterator;

public final class abxv {
    public static igtn a(Bundle bundle0) {
        igtm igtm0 = (igtm)((ProtoLiteMessage)igtn.a).v_newBuilder();
        Iterator iterator0 = bundle0.keySet().iterator();
        while(iterator0.hasNext()) {
            int v = 0;
            Object object0 = iterator0.next();
            String s = (String)object0;
            Object object1 = bundle0.get(s);
            if((object1 instanceof String)) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)igto.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                igto igto0 = (igto)hftp0.b_message;
                ((String)object1).getClass();
                igto0.b |= 2;
                igto0.d = (String)object1;
                igto igto1 = (igto)hftp0.N_build();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)igtl.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                s.getClass();
                ((igtl)hftv0).b |= 1;
                ((igtl)hftv0).c = s;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                igtl igtl0 = (igtl)hftp1.b_message;
                igto1.getClass();
                igtl0.d = igto1;
                igtl0.b |= 2;
                igtm0.a(((igtl)hftp1.N_build()));
            }
            else if((object1 instanceof Bundle)) {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)igto.a).v_newBuilder();
                igtn igtn0 = abxv.a(((Bundle)object1));
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                igto igto2 = (igto)hftp2.b_message;
                igtn0.getClass();
                igto2.e = igtn0;
                igto2.b |= 16;
                igto igto3 = (igto)hftp2.N_build();
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)igtl.a).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp3.b_message;
                s.getClass();
                ((igtl)hftv1).b |= 1;
                ((igtl)hftv1).c = s;
                if(!hftv1.isImmutable()) {
                    hftp3.ensureMutable();
                }
                igtl igtl1 = (igtl)hftp3.b_message;
                igto3.getClass();
                igtl1.d = igto3;
                igtl1.b |= 2;
                igtm0.a(((igtl)hftp3.N_build()));
            }
            else if((object1 instanceof String[])) {
                while(v < ((String[])object1).length) {
                    String s1 = ((String[])object1)[v];
                    if(s1 != null) {
                        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)igto.a).v_newBuilder();
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        igto igto4 = (igto)hftp4.b_message;
                        igto4.b |= 2;
                        igto4.d = s1;
                        igto igto5 = (igto)hftp4.N_build();
                        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)igtl.a).v_newBuilder();
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ProtoLiteMessage hftv2 = hftp5.b_message;
                        s.getClass();
                        ((igtl)hftv2).b |= 1;
                        ((igtl)hftv2).c = s;
                        if(!hftv2.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        igtl igtl2 = (igtl)hftp5.b_message;
                        igto5.getClass();
                        igtl2.d = igto5;
                        igtl2.b |= 2;
                        igtm0.a(((igtl)hftp5.N_build()));
                    }
                    ++v;
                }
            }
            else if((object1 instanceof Bundle[])) {
                while(v < ((Bundle[])object1).length) {
                    Bundle bundle1 = ((Bundle[])object1)[v];
                    if(bundle1 != null) {
                        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)igto.a).v_newBuilder();
                        igtn igtn1 = abxv.a(bundle1);
                        if(!hftp6.b_message.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        igto igto6 = (igto)hftp6.b_message;
                        igtn1.getClass();
                        igto6.e = igtn1;
                        igto6.b |= 16;
                        igto igto7 = (igto)hftp6.N_build();
                        ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)igtl.a).v_newBuilder();
                        if(!hftp7.b_message.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        ProtoLiteMessage hftv3 = hftp7.b_message;
                        s.getClass();
                        ((igtl)hftv3).b |= 1;
                        ((igtl)hftv3).c = s;
                        if(!hftv3.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        igtl igtl3 = (igtl)hftp7.b_message;
                        igto7.getClass();
                        igtl3.d = igto7;
                        igtl3.b |= 2;
                        igtm0.a(((igtl)hftp7.N_build()));
                    }
                    ++v;
                }
            }
            else if((object1 instanceof Boolean)) {
                ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)igto.a).v_newBuilder();
                boolean z = ((Boolean)object1).booleanValue();
                if(!hftp8.b_message.isImmutable()) {
                    hftp8.ensureMutable();
                }
                igto igto8 = (igto)hftp8.b_message;
                igto8.b |= 1;
                igto8.c = z;
                igto igto9 = (igto)hftp8.N_build();
                ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)igtl.a).v_newBuilder();
                if(!hftp9.b_message.isImmutable()) {
                    hftp9.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp9.b_message;
                s.getClass();
                ((igtl)hftv4).b |= 1;
                ((igtl)hftv4).c = s;
                if(!hftv4.isImmutable()) {
                    hftp9.ensureMutable();
                }
                igtl igtl4 = (igtl)hftp9.b_message;
                igto9.getClass();
                igtl4.d = igto9;
                igtl4.b |= 2;
                igtm0.a(((igtl)hftp9.N_build()));
            }
            else {
                Log.e("SearchIndex", "Unsupported value: " + object1);
            }
        }
        String s2 = bundle0.getString("type");
        if(s2 != null) {
            if(!igtm0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)igtm0).ensureMutable();
            }
            igtn igtn2 = (igtn)igtm0.b_message;
            igtn2.b |= 1;
            igtn2.c = s2;
        }
        return (igtn)((ProtoLiteBuilder)igtm0).N_build();
    }

    public static DocumentSection b(igtn igtn0) {
        abwj abwj0 = new abwj(".private:action");
        abwj0.b = true;
        abwj0.f = ".private:action";
        abwj0.a = "blob";
        RegisterSectionInfo registerSectionInfo0 = abwj0.a();
        return new DocumentSection(igtn0.toBytesArray(), registerSectionInfo0);
    }
}


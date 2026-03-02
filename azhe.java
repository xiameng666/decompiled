import android.util.Log;
import com.google.android.gms.pseudonymous.SessionZwiebackToken;
import java.io.OutputStream;
import java.util.List;

final class azhe {
    public static void a(OutputStream outputStream0, azgp azgp0) {
        hfsn hfsn0 = new hfsn(outputStream0, 0x4000);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlpj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlpj hlpj0 = (hlpj)hftp0.b_message;
        hlpj0.b |= 1;
        hlpj0.d = true;
        if(azgp0.d) {
            for(Object object0: azgp0.e) {
                SessionZwiebackToken sessionZwiebackToken0 = (SessionZwiebackToken)object0;
                String s = sessionZwiebackToken0.a;
                if(s == null) {
                    Log.e("CCTBatchedLogRequest", "BatchedLogRequestWrapper given a SessionZwieback with null token.");
                }
                else {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hlqh.a).v_newBuilder();
                    String s1 = sessionZwiebackToken0.b;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    ((hlqh)hftv0).b |= 1;
                    ((hlqh)hftv0).c = s1;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hlqh hlqh0 = (hlqh)hftp1.b_message;
                    hlqh0.b |= 2;
                    hlqh0.d = s;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hlpj hlpj1 = (hlpj)hftp0.b_message;
                    hlqh hlqh1 = (hlqh)hftp1.N_build();
                    hlqh1.getClass();
                    hfuo hfuo0 = hlpj1.e;
                    if(!hfuo0.c()) {
                        hlpj1.e = ProtoLiteMessage.E(hfuo0);
                    }
                    hlpj1.e.add(hlqh1);
                }
            }
        }
        List list0 = azgp0.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlpj hlpj2 = (hlpj)hftp0.b_message;
        hfuo hfuo1 = hlpj2.c;
        if(!hfuo1.c()) {
            hlpj2.c = ProtoLiteMessage.E(hfuo1);
        }
        hfrj.E(list0, hlpj2.c);
        ((ProtoLiteMessage)(((hlpj)hftp0.N_build()))).writeTo(((CodedOutputStream)hfsn0));
        ((CodedOutputStream)hfsn0).flush();
    }
}


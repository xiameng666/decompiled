import android.content.Context;
import java.util.concurrent.ExecutionException;

public final class atmc {
    public static atmd a(Context context0) {
        atmd atmd0 = atmm.j(context0);
        if(hqlt.a.o().Z()) {
            atmd atmd1 = atmk.k(context0, ((atmm)atmd0));
            try {
                atmj atmj0 = new atmj(((atmk)atmd1));
                ((glyq)atmd1.e.b(atmj0, atmk.a)).u();
                return atmd1;
            }
            catch(ExecutionException | InterruptedException exception0) {
                atmb atmb0 = atmd1.c;
                String s = exception0.getMessage();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gifi.a).v_newBuilder();
                gifh gifh0 = gifh.c;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gifi)hftv0).d = gifh0.s;
                ((gifi)hftv0).b |= 2;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gifi gifi0 = (gifi)hftp0.b_message;
                gifi0.b |= 4;
                gifi0.e = "failed to migrate app record: " + s;
                gifi gifi1 = (gifi)hftp0.N_build();
                aqqk aqqk0 = atmb0.a;
                ProtoLiteBuilder hftp1 = aqra.b();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ghys ghys0 = (ghys)hftp1.b_message;
                gifi1.getClass();
                ghys0.ax = gifi1;
                ghys0.d |= 0x8000000;
                aqqk0.a(((ghys)hftp1.N_build()), ghyr.aM);
            }
        }
        return atmd0;
    }
}


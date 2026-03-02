import android.content.Context;
import java.io.IOException;

public final class ajgj {
    private final Context a;

    public ajgj(Context context0) {
        this.a = context0;
    }

    public final gmka a(String s, gmkk gmkk0) {
        String s2;
        String s1;
        try {
            bzoe bzoe0 = bzoe.h(this.a);
            s1 = bzoe0.c(hptg.a.b().b(), "GCM");
            s2 = bzoe0.b();
        }
        catch(IOException iOException0) {
            throw new ajgo("Couldn\'t generate request context", iOException0);
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmka.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gmka)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        s2.getClass();
        ((gmka)hftv1).e = s2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gmka)hftv2).f = s1;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmka gmka0 = (gmka)hftp0.b_message;
        gmkk0.getClass();
        gmka0.d = gmkk0;
        gmka0.b |= 1;
        return (gmka)hftp0.N_build();
    }
}


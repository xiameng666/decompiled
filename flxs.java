import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class flxs {
    public static hnve a(fmhm fmhm0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnve.a).v_newBuilder();
        gged_interceptors gged0 = flbp.c(fmhm0.c(), new flxn());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnve hnve0 = (hnve)hftp0.b_message;
        hfuo hfuo0 = hnve0.b;
        if(!hfuo0.c()) {
            hnve0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged0, hnve0.b);
        return (hnve)hftp0.N_build();
    }

    public static fmhm b(AccountContext accountContext0, Context context0, hnve hnve0, String s, flsl flsl0) {
        fmgv fmgv0 = new fmgv();
        fmgv0.b(flbp.c(hnve0.b, new flxo(accountContext0, context0, s, flsl0)));
        return fmgv0.a();
    }
}


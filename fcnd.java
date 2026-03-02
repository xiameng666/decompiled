import android.accounts.Account;
import java.io.IOException;

public final class fcnd implements gfsi {
    public final fcnm a;
    public final String b;

    public fcnd(fcnm fcnm0, String s) {
        this.a = fcnm0;
        this.b = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Account account0 = (Account)object0;
        try {
            aqqa aqqa0 = (aqqa)this.a.g.mr();
            gftb.check(aqqa0);
            arzs arzs0 = aqqa0.a(account0);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fexu.a).v_newBuilder();
            long v = arzs0.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((fexu)hftv0).b |= 1;
            ((fexu)hftv0).c = v;
            long v1 = arzs0.d;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            fexu fexu0 = (fexu)hftp0.b_message;
            fexu0.b |= 2;
            fexu0.d = v1;
            return (fexu)hftp0.N_build();
        }
        catch(IOException iOException0) {
            fcnm.a.n("Failed to fetch storage quota for " + this.b, iOException0, new Object[0]);
            throw new IllegalStateException(iOException0);
        }
    }
}


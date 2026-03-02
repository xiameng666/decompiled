import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import j..util.Collection.-EL;
import j..util.Optional;
import java.io.IOException;

public final class fcom {
    public static final int a;
    private static final baun b;
    private final Context c;
    private final cchj d;
    private final aqwe e;

    static {
        fcom.b = new fcgf(new String[]{"DeviceFetcher"});
    }

    public fcom(Context context0, cchj cchj0, aqwe aqwe0) {
        this.c = context0;
        this.d = cchj0;
        this.e = aqwe0;
    }

    public static fcom a(Context context0) {
        return new fcom(context0, cchj.b(context0), aqwe.a(context0));
    }

    final gged_interceptors b(String s) {
        Context context0 = this.c;
        Optional optional0 = fcre.a(context0, s);
        if(optional0.isEmpty()) {
            fcom.b.m("Invalid account:" + baun.q(s), new Object[0]);
            return ggna.a;
        }
        Optional optional1 = this.c(((Account)optional0.get()));
        if(optional1.isEmpty()) {
            fcom.b.m("Can\'t fetch devices: no valid auth token.", new Object[0]);
            if(!hzyp.h()) {
                return ggna.a;
            }
            throw new acse("No valid auth token could be fetched for account: " + baun.q(s));
        }
        fcom.b.j("Fetching devices for account: " + baun.q(s), new Object[0]);
        Account account0 = (Account)optional0.get();
        String s1 = (String)optional1.get();
        ProtoLiteBuilder hftp0 = aqwi.a(bbmq.e(context0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqfe aqfe0 = (aqfe)hftp0.b_message;
        s1.getClass();
        aqfe0.b |= 16;
        aqfe0.f = s1;
        aqfa aqfa0 = ((aqfe)hftp0.b_message).m;
        if(aqfa0 == null) {
            aqfa0 = aqfa.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)aqfa0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)aqfa0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        aqfa aqfa1 = (aqfa)hftp1.b_message;
        aqfa1.b |= 0x20;
        aqfa1.d = false;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqfe aqfe1 = (aqfe)hftp0.b_message;
        aqfa aqfa2 = (aqfa)hftp1.N_build();
        aqfa2.getClass();
        aqfe1.m = aqfa2;
        aqfe1.b |= 0x1000;
        try {
            aqfo aqfo0 = this.e.c(account0, hftp0);
            aqwg.b(aqfo0);
            return (gged_interceptors)Collection.-EL.stream(aqfo0.g).filter(new fcol()).collect(ggaf.a);
        }
        catch(aqxw | IOException | acse exception0) {
            fcom.b.n("Failed to fetch devices.", exception0, new Object[0]);
            if((exception0 instanceof acse) && hzyp.h()) {
                throw (acse)exception0;
            }
            return ggna.a;
        }
    }

    private final Optional c(Account account0) {
        try {
            return Optional.ofNullable(this.d.c(account0, "android", false));
        }
        catch(OperationCanceledException | AuthenticatorException | IOException exception0) {
            fcom.b.n("Failed to fetch auth token for account: " + account0.name, exception0, new Object[0]);
            return Optional.empty();
        }
    }
}


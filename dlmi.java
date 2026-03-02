import android.accounts.Account;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dlmi {
    public static final bboh a;

    static {
        dlmi.a = bboh.b("Pay", bbcu.cZ);
    }

    public static final evql a(Account account0, azts azts0) {
        ibuq.f(account0, "account");
        ibuq.f(azts0, "firstPartyPayClient");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftjq.a).v_newBuilder();
        String s = account0.name;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftjq ftjq0 = (ftjq)hftp0.b_message;
        s.getClass();
        ftjq0.d = s;
        ftbp ftbp0 = ftbp.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftjq ftjq1 = (ftjq)hftp0.b_message;
        ftbp0.getClass();
        ftjq1.c = ftbp0;
        ftjq1.b = 12;
        return azts0.bf(((ftjq)hftp0.N_build()).toBytesArray()).e(new dlmh());
    }

    public static final boolean b(Account account0, azts azts0) {
        try {
            Object object0 = evrg.o(dlmi.a(account0, azts0), hwvc.a.b().a(), TimeUnit.MILLISECONDS);
            ibuq.e(object0, "await(...)");
            return ((Boolean)object0).booleanValue();
        }
        catch(InterruptedException interruptedException0) {
            a.ae(dlmi.a.j(), "Could not determine if user\'s account is protected", interruptedException0);
            return false;
        }
        catch(ExecutionException executionException0) {
            a.ae(dlmi.a.j(), "Could not determine if user\'s account is protected", executionException0);
            return false;
        }
        catch(TimeoutException timeoutException0) {
            a.ae(dlmi.a.j(), "Could not determine if user\'s account is protected", timeoutException0);
            return false;
        }
    }
}


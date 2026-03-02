import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model..AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public final class flur implements glzm {
    public final flvd a;
    public final gmcd b;
    public final ContactId c;
    public final AccountContext d;

    public flur(flvd flvd0, gmcd gmcd0, ContactId contactId0, AccountContext accountContext0) {
        this.a = flvd0;
        this.b = gmcd0;
        this.c = contactId0;
        this.d = accountContext0;
    }

    @Override  // glzm
    public final gmcd a() {
        flvd flvd0;
        try {
            flvd0 = this.a;
            gmbu.r(this.b);
            return gmbu.i(Boolean.valueOf(false));
        }
        catch(Throwable throwable0) {
            if(iapk.d(throwable0).t == iapk.j.t) {
                ContactId contactId0 = this.c;
                if(((.AutoValue_ContactId)contactId0).c == ContactId.ContactType.c) {
                    try {
                        String s = (String)flvd0.f.remove(((.AutoValue_ContactId)contactId0).a);
                        if(!TextUtils.isEmpty(s)) {
                            flbz flbz0 = flvd0.e;
                            try {
                                Context context0 = ((fies)flbz0).c;
                                if(adgh.c(context0)) {
                                    if(fies.b == null) {
                                        fies.b = new adfy(context0.getApplicationContext());
                                    }
                                    try {
                                        evrg.n(fies.b.b(s));
                                    }
                                    catch(ExecutionException executionException0) {
                                        if((executionException0.getCause() instanceof acse)) {
                                            throw (acse)executionException0.getCause();
                                        }
                                        a.ae(fies.a.j(), "Unexpected exception while clearing token", executionException0);
                                    }
                                    catch(InterruptedException interruptedException0) {
                                        Thread.currentThread().interrupt();
                                        throw new IOException(interruptedException0);
                                    }
                                }
                                else {
                                    acso.j(((fies)flbz0).c, s);
                                }
                            }
                            catch(acse | IOException exception1) {
                                a.ae(fies.a.i(), "Failed to clear GAIA OAuth token", exception1);
                            }
                            return gmbu.i(Boolean.valueOf(true));
                        }
                    }
                    catch(Exception exception0) {
                        AccountContext accountContext0 = this.d;
                        flbj.c("Backend", "Failed to clear OAuth token with Exception: " + exception0.toString());
                        fmai fmai0 = fmaj.a();
                        fmai0.g(10024);
                        fmai0.n(contactId0);
                        if(accountContext0 != null) {
                            fmai0.o(accountContext0.d().toStringUtf8());
                        }
                        fmaj fmaj0 = fmai0.a();
                        flvd0.c.b(fmaj0);
                    }
                }
            }
            return gmbu.i(Boolean.valueOf(false));
        }
    }
}


import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model..AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.io.IOException;

public final class flus implements glzm {
    public final flvd a;
    public final ContactId b;
    public final gmcd c;

    public flus(flvd flvd0, ContactId contactId0, gmcd gmcd0) {
        this.a = flvd0;
        this.b = contactId0;
        this.c = gmcd0;
    }

    @Override  // glzm
    public final gmcd a() {
        ContactId contactId0 = this.b;
        gmcd gmcd0 = this.c;
        flvd flvd0 = this.a;
        if(((.AutoValue_ContactId)contactId0).c == ContactId.ContactType.c) {
            try {
                flbz flbz0 = flvd0.e;
                String s = ((.AutoValue_ContactId)contactId0).a;
                String s1 = flbz0.a(new Account(s, "com.google"));
                if(TextUtils.isEmpty(s1)) {
                    throw new iapn(iapk.j.f("Failed to generate OAuthToken"));
                }
                flvd0.f.put(s, s1);
                return glzd.f(gmcd0, new fluo(s1), gmap.a);
            }
            catch(Exception exception0) {
                acse acse0 = new acse(exception0);
                throw (exception0 instanceof IOException) ? new iapn(iapk.p.e(acse0)) : new iapn(iapk.j.e(acse0));
            }
        }
        return gmcd0;
    }
}


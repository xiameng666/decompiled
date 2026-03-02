import com.google.android.libraries.messaging.lighter.model.ContactId;

public final class flup implements glzm {
    public final flvd a;
    public final gmcd b;
    public final ContactId c;
    public final int d;

    public flup(flvd flvd0, gmcd gmcd0, int v, ContactId contactId0) {
        this.a = flvd0;
        this.b = gmcd0;
        this.d = v;
        this.c = contactId0;
    }

    @Override  // glzm
    public final gmcd a() {
        gmcd gmcd0;
        try {
            gmcd0 = this.b;
            gmbu.r(gmcd0);
        }
        catch(Throwable throwable0) {
            if(flvt.b().c(throwable0) == this.d) {
                flbj.f("Backend", "Registration was not found. This was likely deleted from a Tachyon Janitor job or Unregistered previously.");
                this.a.g.e(this.c);
            }
        }
        return gmcd0;
    }
}


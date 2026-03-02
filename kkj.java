import android.credentials.PrepareGetCredentialResponse;

final class kkj extends ibuo implements ibts {
    public kkj(Object object0) {
        super(1, object0, kkk.class, "hasCredentialType", "hasCredentialType(Ljava/lang/String;)Z", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        String s = (String)object0;
        ibuq.f(s, "p0");
        PrepareGetCredentialResponse prepareGetCredentialResponse0 = ((kkk)this.e).c;
        ibuq.c(prepareGetCredentialResponse0);
        return Boolean.valueOf(prepareGetCredentialResponse0.hasCredentialResults(s));
    }
}


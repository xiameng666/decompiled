import com.google.android.gms.auth.api.fido.RegisteredCredentialData;

public final class ahmy {
    public ByteString a;
    private String b;
    private boolean c;
    private byte d;

    public final RegisteredCredentialData a() {
        if(this.d == 1) {
            String s = this.b;
            if(s != null) {
                return new RegisteredCredentialData(s, this.a, this.c);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.b == null) {
            stringBuilder0.append(" localStorageId");
        }
        if(this.d == 0) {
            stringBuilder0.append(" thirdPartyPaymentsSupport");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(String s) {
        if(s == null) {
            throw new NullPointerException("Null localStorageId");
        }
        this.b = s;
    }

    public final void c(boolean z) {
        this.c = z;
        this.d = 1;
    }
}


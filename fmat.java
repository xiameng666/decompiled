import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.AccountUsers;
import com.google.android.libraries.messaging.lighter.model.AutoValue_AccountContext;

public final class fmat {
    public AccountUsers a;
    private long b;
    private ByteString c;
    private fmav d;
    private byte e;

    public final AccountContext a() {
        if(this.e == 1) {
            AccountUsers accountUsers0 = this.a;
            if(accountUsers0 != null) {
                ByteString hfsf0 = this.c;
                if(hfsf0 != null) {
                    fmav fmav0 = this.d;
                    if(fmav0 != null) {
                        return new AutoValue_AccountContext(this.b, accountUsers0, hfsf0, fmav0);
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.e == 0) {
            stringBuilder0.append(" registrationId");
        }
        if(this.a == null) {
            stringBuilder0.append(" accountUsers");
        }
        if(this.c == null) {
            stringBuilder0.append(" serverRegistrationId");
        }
        if(this.d == null) {
            stringBuilder0.append(" serverRegistrationStatus");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(long v) {
        this.b = v;
        this.e = 1;
    }

    public final void c(ByteString hfsf0) {
        if(hfsf0 == null) {
            throw new NullPointerException("Null serverRegistrationId");
        }
        this.c = hfsf0;
    }

    public final void d(fmav fmav0) {
        if(fmav0 == null) {
            throw new NullPointerException("Null serverRegistrationStatus");
        }
        this.d = fmav0;
    }

    public final void e(fmay fmay0) {
        this.a = fmay0.a();
    }
}


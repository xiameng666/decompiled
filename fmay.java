import com.google.android.libraries.messaging.lighter.model..AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.AccountUsers;
import com.google.android.libraries.messaging.lighter.model.AutoValue_AccountUsers;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.Set;

public final class fmay {
    private gfsx a;
    private Set b;
    private gfsx c;
    private String d;

    public fmay() {
        throw null;
    }

    public fmay(byte[] arr_b) {
        this.a = gfqx.a;
        this.c = gfqx.a;
    }

    public final AccountUsers a() {
        Set set0 = this.b;
        if(set0 != null) {
            String s = this.d;
            if(s != null) {
                return new AutoValue_AccountUsers(this.a, set0, this.c, s);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.b == null) {
            stringBuilder0.append(" phoneNumbers");
        }
        if(this.d == null) {
            stringBuilder0.append(" tachyonAppName");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(String s) {
        this.c = gfsx.m(s);
    }

    public final void c(String s) {
        this.a = gfsx.m(s);
    }

    public final void d(Set set0) {
        if(set0 == null) {
            throw new NullPointerException("Null phoneNumbers");
        }
        this.b = set0;
    }

    public final void e(String s) {
        if(s == null) {
            throw new NullPointerException("Null tachyonAppName");
        }
        this.d = s;
    }

    public final void f(ContactId contactId0) {
        this.e(((.AutoValue_ContactId)contactId0).b);
        switch(((.AutoValue_ContactId)contactId0).c.ordinal()) {
            case 1: {
                this.d(new ggoh(((.AutoValue_ContactId)contactId0).a));
                return;
            }
            case 2: {
                this.c(((.AutoValue_ContactId)contactId0).a);
                this.d(ggnj.a);
                return;
            }
            case 4: {
                this.b(((.AutoValue_ContactId)contactId0).a);
                this.d(ggnj.a);
                return;
            }
            default: {
                flbj.c("AccountUsers", "Absent contact type");
                this.c(((.AutoValue_ContactId)contactId0).a);
                this.d(ggnj.a);
            }
        }
    }
}


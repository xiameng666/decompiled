import com.google.android.libraries.messaging.lighter.model.AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;
import com.google.android.libraries.messaging.lighter.model.ContactId;

public final class fmep {
    private String a;
    private String b;
    private ContactId.ContactType c;
    private gfsx d;

    public fmep() {
        throw null;
    }

    public fmep(ContactId contactId0) {
        this.d = gfqx.a;
        this.a = contactId0.d();
        this.b = contactId0.e();
        this.c = contactId0.b();
        this.d = contactId0.c();
    }

    public fmep(byte[] arr_b) {
        this.d = gfqx.a;
    }

    public final ContactId a() {
        String s = this.a;
        if(s != null) {
            String s1 = this.b;
            if(s1 != null) {
                ContactId.ContactType contactId$ContactType0 = this.c;
                if(contactId$ContactType0 != null) {
                    return new AutoValue_ContactId(s, s1, contactId$ContactType0, this.d);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" id");
        }
        if(this.b == null) {
            stringBuilder0.append(" tachyonAppName");
        }
        if(this.c == null) {
            stringBuilder0.append(" type");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(String s) {
        this.d = gfsx.l(s);
    }

    public final void c(String s) {
        if(s == null) {
            throw new NullPointerException("Null id");
        }
        this.a = s;
    }

    public final void d(String s) {
        if(s == null) {
            throw new NullPointerException("Null tachyonAppName");
        }
        this.b = s;
    }

    public final void e(ContactId.ContactType contactId$ContactType0) {
        if(contactId$ContactType0 == null) {
            throw new NullPointerException("Null type");
        }
        this.c = contactId$ContactType0;
    }
}


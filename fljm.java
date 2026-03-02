import com.google.android.libraries.messaging.lighter.model..AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.UUID;

public final class fljm implements glzm {
    public final fljw a;
    public final ContactId b;
    public final flqw c;

    public fljm(fljw fljw0, ContactId contactId0, flqw flqw0) {
        this.a = fljw0;
        this.b = contactId0;
        this.c = flqw0;
    }

    @Override  // glzm
    public final gmcd a() {
        ContactId contactId0 = this.b;
        flqw flqw0 = this.c;
        flwm flwm0 = this.a.j;
        fiei fiei0 = this.a.l;
        fiej fiej0 = this.a.m;
        if(((.AutoValue_ContactId)contactId0).c == ContactId.ContactType.c) {
            UUID uUID0 = UUID.randomUUID();
            gmcd gmcd0 = flwm.a();
            flzl flzl0 = new flzl(contactId0, flwm0.c, fiei0, "com.google.android.gms", fiej0, gmcd0);
            gmcd gmcd1 = flwm0.b.d.f();
            return flwm0.b.d(uUID0, flzl0, gmcd1, contactId0, flqw0, true);
        }
        UUID uUID1 = UUID.randomUUID();
        gmcd gmcd2 = flwm.a();
        flzf flzf0 = new flzf(contactId0, flwm0.c, fiei0, "com.google.android.gms", fiej0, gmcd2);
        gmcd gmcd3 = flwm0.b.d.f();
        return flwm0.b.d(uUID1, flzf0, gmcd3, contactId0, flqw0, false);
    }
}


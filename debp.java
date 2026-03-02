import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.ContactInfo;

public final class debp {
    public static final deax a(Contact contact0) {
        deaz deaz0;
        String s = contact0.c;
        ibuq.e(s, "getDisplayName(...)");
        ContactInfo contactInfo0 = contact0.f;
        switch(contactInfo0.a) {
            case 1: {
                ibuq.e(contactInfo0.b, "getValue(...)");
                deaz0 = new deaz(contactInfo0.b);
                return new deax(s, contact0.d, deaz0);
            }
            case 2: {
                ibuq.e(contactInfo0.b, "getValue(...)");
                deaz0 = new deay(contactInfo0.b);
                return new deax(s, contact0.d, deaz0);
            }
            default: {
                return new deax(s, contact0.d, deba.a);
            }
        }
    }
}


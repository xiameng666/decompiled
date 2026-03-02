import com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveViewModel.ConsentUiData;
import java.util.logging.Level;

public final class efxt implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        switch(((ContactsConsentPrimitiveViewModel.ConsentUiData)object0).a()) {
            case 1: {
                Object object1 = ((ContactsConsentPrimitiveViewModel.ConsentUiData)object0).h();
                ((efya)object1).j(true);
                ((efya)object1).e(gjfl.c);
                return object1;
            }
            case 2: {
                gjfl gjfl0 = efyc.j(((ContactsConsentPrimitiveViewModel.ConsentUiData)object0));
                Object object2 = ((ContactsConsentPrimitiveViewModel.ConsentUiData)object0).h();
                if(gjfl0 == gjfl.e) {
                    ((efya)object2).k(true);
                }
                ((efya)object2).e(gjfl0);
                ((efya)object2).b(2);
                return object2;
            }
            default: {
                ((ggtj)efyc.a.g(Level.WARNING).ar(0x314B)).x("onChoicesPageNext called without a selection");
                return ((ContactsConsentPrimitiveViewModel.ConsentUiData)object0).h();
            }
        }
    }
}


import android.content.ContentValues;
import com.google.android.libraries.messaging.lighter.model.ContactId;

public final class fljf implements Runnable {
    public final fljw a;
    public final ContactId b;

    public fljf(fljw fljw0, ContactId contactId0) {
        this.a = fljw0;
        this.b = contactId0;
    }

    @Override
    public final void run() {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("server_registration_status", Integer.valueOf(fmav.b.c));
        fljw fljw0 = this.a;
        ContactId contactId0 = this.b;
        if(fljw0.k.k(contactId0, contentValues0)) {
            fljw0.f(contactId0);
        }
    }
}


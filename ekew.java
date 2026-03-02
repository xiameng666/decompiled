import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.romanesco.contactsupload.triggers.ContactsLoggerIntentOperation;

public final class ekew implements Runnable {
    public final ekex a;
    public final Context b;

    public ekew(ekex ekex0, Context context0) {
        this.a = ekex0;
        this.b = context0;
    }

    @Override
    public final void run() {
        Context context0 = this.b;
        Intent intent0 = IntentOperation.getStartIntent(context0, ContactsLoggerIntentOperation.class, "com.google.android.gms.romanesco.contactsupload.triggers.CONTACTS_PROVIDER_UPDATE");
        if(intent0 != null) {
            context0.startService(intent0);
        }
        this.a.a.set(false);
    }
}


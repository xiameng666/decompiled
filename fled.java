import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.concurrent.ExecutionException;

public final class fled implements Runnable {
    public final flen a;
    public final gmcd b;
    public final AccountContext c;
    public final ContactId d;

    public fled(flen flen0, gmcd gmcd0, AccountContext accountContext0, ContactId contactId0) {
        this.a = flen0;
        this.b = gmcd0;
        this.c = accountContext0;
        this.d = contactId0;
    }

    @Override
    public final void run() {
        try {
            fmeo fmeo0 = (fmeo)this.b.get();
            synchronized(this.a.c) {
                Pair pair0 = Pair.create(this.c, this.d);
                this.a.f.remove(pair0);
            }
        }
        catch(InterruptedException | ExecutionException exception0) {
            flbj.d("LitContactCtrlr", "Failed to sync contact profile", exception0);
        }
    }
}


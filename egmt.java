import android.accounts.Account;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;

final class egmt implements efyt {
    private final efyu a;
    private final Account b;
    private final String c;
    private final egms d;

    public egmt(efyu efyu0, Account account0, String s, egms egms0) {
        this.a = efyu0;
        this.b = account0;
        this.c = s;
        this.d = egms0;
    }

    @Override  // efyt
    public final void a(ExtendedSyncStatus extendedSyncStatus0) {
        if(extendedSyncStatus0.a != 3 && extendedSyncStatus0.e == 0 && (extendedSyncStatus0.a == 1 || extendedSyncStatus0.a == 2) && extendedSyncStatus0.g == 2) {
            this.d.a(extendedSyncStatus0);
            this.a.d(null, false, this.b, this.c);
        }
    }
}


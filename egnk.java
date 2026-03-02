import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@ibnh
public final class egnk {
    static final egna a;
    public final Context b;
    public final gmcg c;
    public final egns d;
    public final efpr e;
    public final bbng f;
    public final List g;
    private final frii h;

    static {
        egnk.a = new egnj();
    }

    public egnk(Context context0, frii frii0, egns egns0, gmcg gmcg0) {
        this.b = context0;
        this.h = frii0;
        this.c = gmcg0;
        this.d = egns0;
        this.e = efpr.a();
        this.f = bbnk.a;
        this.g = new CopyOnWriteArrayList();
    }

    public final egna a(AccountWithDataSet accountWithDataSet0) {
        Account account0 = accountWithDataSet0.a;
        if(account0 != null && "com.google".equals(account0.type)) {
            frie frie0 = frif.a();
            frie0.e(((MessageLite)egnn.a));
            frce frce0 = new frce(this.b);
            frce0.d("people");
            frce0.j();
            frce0.c(account0);
            frce0.e("ImportSimContactsStorageProto" + hxeb.a.b().b() + ".pb");
            frie0.f(frce0.a());
            frif frif0 = frie0.a();
            return new egnd(this.h.a(frif0));
        }
        return egnk.a;
    }

    public final egnv b(AccountWithDataSet accountWithDataSet0) {
        ContentResolver contentResolver0 = this.b.getContentResolver();
        gqig.a(this.b);
        return new egnu(contentResolver0, gqiv.e(), accountWithDataSet0);
    }

    public final void c(egni egni0) {
        this.g.remove(egni0);
    }
}


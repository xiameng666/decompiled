import android.accounts.Account;
import java.util.List;

public final class akwt implements evpo {
    public final akww a;
    public final Account b;

    public akwt(akww akww0, Account account0) {
        this.a = akww0;
        this.b = account0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(evql0.n()) {
            List list0 = (List)evql0.j();
            return this.a.c(this.b, list0);
        }
        return ggna.a;
    }
}


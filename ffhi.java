import android.accounts.Account;
import com.google.android.gms.wearable.internal.FastPairAccountKeyParcelable;
import com.google.android.gms.wearable.internal.GetFastpairAccountKeyByAccountResponse;

public final class ffhi implements fflq {
    public final fdiy a;
    public final Account b;

    public ffhi(fdiy fdiy0, Account account0) {
        this.a = fdiy0;
        this.b = account0;
    }

    @Override  // fflq
    public final void a(Object object0) {
        GetFastpairAccountKeyByAccountResponse getFastpairAccountKeyByAccountResponse0 = new GetFastpairAccountKeyByAccountResponse(0, ((FastPairAccountKeyParcelable)ggch.j(((feml)object0).b()).c(new femg(this.b)).b(new femh()).g()));
        this.a.E(getFastpairAccountKeyByAccountResponse0);
    }
}


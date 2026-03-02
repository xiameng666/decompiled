import android.accounts.Account;
import java.util.function.IntFunction;

public final class elyx implements IntFunction {
    @Override
    public final Object apply(int v) {
        return new Account[v];
    }
}


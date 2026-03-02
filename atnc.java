import android.accounts.Account;
import java.util.Comparator;

public final class atnc implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((Account)object0).name.compareToIgnoreCase(((Account)object1).name);
    }
}


import android.accounts.Account;
import java.io.Closeable;
import java.util.List;
import java.util.Map;

public interface ajfu extends Closeable {
    List a(String arg1, Account arg2);

    List b(String arg1, Account arg2);

    Map c(String arg1);

    @Override
    void close();
}


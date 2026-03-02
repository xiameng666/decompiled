import android.os.Bundle;
import android.os.IInterface;
import java.util.List;

public interface ezbf extends IInterface {
    Bundle a(String arg1);

    void b(String arg1, boolean arg2);

    void c(String arg1, int arg2);

    void d(String arg1, long arg2);

    void e(String arg1, String arg2);

    void f(String arg1, List arg2);

    void g(String arg1);
}


import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import java.util.List;

public interface xgx extends IInterface {
    int a(Uri arg1, ContentValues[] arg2);

    int c(Uri arg1, String arg2, String[] arg3);

    int d(Uri arg1, ContentValues arg2, String arg3, String[] arg4);

    Uri e(Uri arg1);

    Uri f(Uri arg1, ContentValues arg2);

    Uri g(Uri arg1);

    Bundle h(List arg1);

    Bundle i(String arg1, String arg2, Bundle arg3);

    Bundle j(Uri arg1, String arg2);

    Bundle k(Uri arg1, String arg2);

    Bundle l(Uri arg1, String arg2, Bundle arg3);

    String m(Uri arg1);

    void n(ParcelFileDescriptor arg1, String[] arg2);

    void o();

    boolean p();

    String[] q(Uri arg1, String arg2);
}


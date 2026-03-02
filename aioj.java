import android.os.IInterface;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.StoreBytesData;

public interface aioj extends IInterface {
    void a(aiom arg1, DeleteBytesRequest arg2);

    void b(aioq arg1);

    void c(aiot arg1);

    void d(aiow arg1, RetrieveBytesRequest arg2);

    void e(aioz arg1, byte[] arg2);

    void f(aipc arg1, StoreBytesData arg2);
}


import android.os.IInterface;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.model.RestoreResultEntity;
import java.util.List;

public interface ekfh extends IInterface {
    void a(Status arg1, List arg2, ApiMetadata arg3);

    void c(Status arg1, List arg2, ApiMetadata arg3);

    void d(Status arg1, RestoreResultEntity arg2, ApiMetadata arg3);

    void e(Status arg1, List arg2, ApiMetadata arg3);

    void f(Status arg1, List arg2, ApiMetadata arg3);

    void g(Status arg1, ApiMetadata arg2);

    void h(Status arg1, RestoreResultEntity arg2, ApiMetadata arg3);
}


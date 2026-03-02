import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

public interface bncc extends IInterface {
    void a(bnbz arg1, PublicKeyCredentialRequestOptions arg2, ParcelFileDescriptor arg3, ParcelFileDescriptor arg4, ApiMetadata arg5);
}


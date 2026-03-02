import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferConfigurations;

public interface eqti extends IInterface {
    void d(eqtg arg1, ApiMetadata arg2);

    void e(eqtg arg1, Bundle arg2, ApiMetadata arg3);

    void f(eqtg arg1, DirectTransferConfigurations arg2, ParcelFileDescriptor[] arg3, eqib arg4, ApiMetadata arg5);
}


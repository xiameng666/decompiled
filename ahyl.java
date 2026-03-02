import android.os.IInterface;
import com.google.android.gms.auth.api.phone.internal.ConsentPromptUserResponse;
import com.google.android.gms.auth.api.phone.internal.RequestResult;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import com.google.android.gms.auth.api.phone.internal.VerificationToken;
import com.google.android.gms.common.api.ApiMetadata;

public interface ahyl extends IInterface {
    RequestResult a(String arg1, VerificationToken arg2, ApiMetadata arg3);

    void b(SmsRetrieverEvent arg1, ApiMetadata arg2);

    void c(ConsentPromptUserResponse arg1, ApiMetadata arg2);
}


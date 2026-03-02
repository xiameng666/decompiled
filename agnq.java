import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import java.util.Comparator;

public final class agnq implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return -Long.compare(((FidoCredentialDetails)object0).f, ((FidoCredentialDetails)object1).f);
    }
}


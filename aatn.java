import com.google.android.gms.accountsettings.safetycenter.SafetyCenterIntentOperation;
import java.util.function.Supplier;

public final class aatn implements Supplier {
    public final SafetyCenterIntentOperation a;

    public aatn(SafetyCenterIntentOperation safetyCenterIntentOperation0) {
        this.a = safetyCenterIntentOperation0;
    }

    @Override
    public final Object get() {
        return "Google Security Checkup for work";
    }
}


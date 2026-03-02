import android.os.Bundle;

public final class ezaq extends ezap {
    static {
        bboh.b("TrustAgent", bbcu.aR);
    }

    public ezaq(ezdf ezdf0, Bundle bundle0, azug azug0) {
        super(ezdf0, bundle0, azug0);
    }

    @Override  // ezap
    protected final Bundle b(Bundle bundle0) {
        Bundle bundle1 = new Bundle();
        ezfd ezfd0 = ezfd.e();
        bundle1.putBoolean("trustagent.api.bridge.be.GetIsTrustagentStartOperation.is_trustagent_start_key", ezfd0.h());
        bundle1.putBoolean("trustagent.api.bridge.be.GetIsTrustagentStartOperation.is_trustagent_configured_key", ezfd0.g());
        return bundle1;
    }
}


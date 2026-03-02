import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.fastpair.internal.TriggerValidatorConnectionParams;

public final class cyui extends cjtm {
    private final TriggerValidatorConnectionParams a;
    private final String b;

    public cyui(TriggerValidatorConnectionParams triggerValidatorConnectionParams0, String s) {
        super(0x109, "TriggerValidatorConnection");
        this.a = triggerValidatorConnectionParams0;
        this.b = s;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        if(!hvpp.aB()) {
            throw new cjuh(40504, "Api is disabled");
        }
        if(!cygn.b(context0, this.b) && (!azql.c(context0).g(this.b) || !hvpg.a.aY().ga().equalsIgnoreCase(this.b))) {
            throw new cjuh(40500, "Only allow for Validator");
        }
        cysr.b(context0, "com.google.android.gms.nearby.fastpair.service.ACTION_TRIGGER_VALIDATOR_CONNECTION", null);
        this.a.a.a(new Status(0), true);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a.a(status0, false);
    }
}


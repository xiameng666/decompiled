import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.mdm.settings.RadioButtonPreferenceWithDropdown;
import java.util.concurrent.Executor;

public final class cqlb implements Runnable {
    public final cqlu a;
    public final gged_interceptors b;
    public final gged_interceptors c;
    public final int d;
    public final boolean e;
    public final RadioButtonPreferenceWithDropdown f;
    public final cqlu g;
    public final Executor h;

    public cqlb(cqlu cqlu0, gged_interceptors gged0, gged_interceptors gged1, int v, boolean z, RadioButtonPreferenceWithDropdown radioButtonPreferenceWithDropdown0, cqlu cqlu1, Executor executor0) {
        this.a = cqlu0;
        this.b = gged0;
        this.c = gged1;
        this.d = v;
        this.e = z;
        this.f = radioButtonPreferenceWithDropdown0;
        this.g = cqlu1;
        this.h = executor0;
    }

    @Override
    public final void run() {
        cqlu cqlu0 = this.a;
        Context context0 = cqlu0.getContext();
        gftb.check(context0);
        Account account0 = bpsq.a(context0);
        if(account0 != null) {
            frag frag0 = fraf.a(context0, account0);
            cqlt cqlt0 = new cqlt(cqlu0, this.f, this.d, this.e, this.g);
            gmbu.t(frag0.a(frae.a, this.b, this.c, ggna.a, ggna.a, frad.a(this.d, this.e)), cqlt0, this.h);
        }
    }
}


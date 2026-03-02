import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdm.settings.RadioButtonPreferenceWithDropdown;
import j..util.Objects;

final class cqlt implements gmbg {
    final RadioButtonPreferenceWithDropdown a;
    final int b;
    final boolean c;
    final cqlu d;
    final cqlu e;

    public cqlt(cqlu cqlu0, RadioButtonPreferenceWithDropdown radioButtonPreferenceWithDropdown0, int v, boolean z, cqlu cqlu1) {
        this.a = radioButtonPreferenceWithDropdown0;
        this.b = v;
        this.c = z;
        this.d = cqlu1;
        Objects.requireNonNull(cqlu0);
        this.e = cqlu0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        cqqt.b(throwable0, "Failed to log fmdn consent audit record", new Object[0]);
        bbqv.a(new cqls(this, this.d));
    }

    @Override  // gmbg
    public final void b(Object object0) {
        cqqt.c("Saved fmdn consent log audit record: %s", new Object[]{((Status)object0)});
        Context context0 = this.e.requireContext();
        boolean z = cqix.h.a(context0).booleanValue();
        bbqv.a(new cqlf(this.e, z, this.c, this.b, this.a));
    }
}


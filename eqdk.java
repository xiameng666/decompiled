import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.data.DisplayText;

final class eqdk implements eqdm {
    private final epwt a;
    private final DisplayText b;

    public eqdk(epwt epwt0, DisplayText displayText0) {
        this.a = epwt0;
        this.b = displayText0;
    }

    @Override  // eqdm
    public final void a() {
        eqdn.f.j("Processing DisplayText", new Object[0]);
        String s = this.b.b;
        if(!TextUtils.isEmpty(s)) {
            this.a.a(s);
        }
    }
}


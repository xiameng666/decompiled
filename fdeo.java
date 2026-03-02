import com.google.android.gms.common.widget.phone.SwitchBar;
import com.google.android.gms.wearable.consent.WearUsageAndDiagnosticsChimeraActivity;
import j..util.Objects;

public final class fdeo implements gmbg {
    final WearUsageAndDiagnosticsChimeraActivity a;

    public fdeo(WearUsageAndDiagnosticsChimeraActivity wearUsageAndDiagnosticsChimeraActivity0) {
        Objects.requireNonNull(wearUsageAndDiagnosticsChimeraActivity0);
        this.a = wearUsageAndDiagnosticsChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        WearUsageAndDiagnosticsChimeraActivity.j.g("failed to read consent or get account ids", throwable0, new Object[0]);
        this.a.finish();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        gfsz gfsz0 = (gfsz)object0;
        ffco ffco0 = (ffco)gfsz0.b;
        this.a.findViewById(0x7F0B2409).setVisibility(8);  // id:usage_and_diagnostics_title_placeholder
        this.a.findViewById(0x7F0B2408).setVisibility(0);  // id:usage_and_diagnostics_title
        this.a.findViewById(0x7F0B2407).setVisibility(0);  // id:usage_and_diagnostics_text
        SwitchBar switchBar0 = (SwitchBar)this.a.findViewById(0x7F0B240A);  // id:usage_and_diagnostics_toggle
        switchBar0.setChecked(ffco0.c);
        switchBar0.setEnabled(true);
        switchBar0.setVisibility(0);
        switchBar0.setAlpha(1.0f);
        switchBar0.a = new fdeq(this.a, ffco0, ((String)gfsz0.a));
    }
}


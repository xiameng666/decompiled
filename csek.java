import android.support.v7.widget.RecyclerView;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsChimeraActivity;
import j..util.Objects;

public final class csek extends uc {
    final im a;
    final MobileDataPlanSettingsChimeraActivity b;

    public csek(MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity0, im im0) {
        this.a = im0;
        Objects.requireNonNull(mobileDataPlanSettingsChimeraActivity0);
        this.b = mobileDataPlanSettingsChimeraActivity0;
        super();
    }

    @Override  // uc
    public final void a(RecyclerView recyclerView0, int v, int v1) {
        float f = recyclerView0.getChildCount() == 0 || recyclerView0.getChildAt(0).getTop() == 0 ? 0.0f : this.b.k;
        this.a.t(f);
    }
}


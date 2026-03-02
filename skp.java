import android.os.Bundle;
import android.view.View;
import androidx.preference.PreferenceScreen;

public abstract class skp extends ohv {
    @Override  // ohv
    protected tk kJ(PreferenceScreen preferenceScreen0) {
        return sku.a(this.requireContext()) ? new skr(preferenceScreen0) : new oib(preferenceScreen0);
    }

    @Override  // ohv
    public void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        super.onViewCreated(view0, bundle0);
        if(sku.a(this.requireContext())) {
            this.F(null);
            this.b.A(new sko());
        }
    }
}


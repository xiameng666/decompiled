import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

public final class achu implements evpo {
    public final Feature[] a;
    public final evqp b;

    public achu(Feature[] arr_feature, evqp evqp0) {
        this.a = arr_feature;
        this.b = evqp0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        Exception exception0 = evql0.i();
        if(exception0 != null) {
            return evrg.c(exception0);
        }
        if(((ModuleInstallResponse)evql0.j()).a()) {
            StringBuilder stringBuilder0 = new StringBuilder("Following modules are already installed:");
            for(int v = 0; v <= 0; ++v) {
                stringBuilder0.append(this.a[v].toString());
                stringBuilder0.append(",");
            }
            Log.i("APPSEARCH_INSTALLER", stringBuilder0.toString());
            return evrg.d(Boolean.valueOf(true));
        }
        return this.b.a;
    }
}


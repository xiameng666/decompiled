import com.google.android.gms.permissions.serviceinfo.ui.ServicePreference;

final class ehmu extends ibuv {
    public ehmu(Object object0) {
        super(object0, ServicePreference.class, "iconVisualElement", "getIconVisualElement()Lcom/google/android/gms/libs/ui/metrics/gmscore/GmsCoreMetrics$VisualElement;", 0);
    }

    @Override  // ibuv
    public final Object b() {
        Object object0 = ((ServicePreference)this.e).c;
        if(object0 != null) {
            return object0;
        }
        ibuq.j("iconVisualElement");
        return null;
    }
}


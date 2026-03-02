import com.google.android.gms.permissions.serviceinfo.ui.ServicePreference;

final class ehna extends ibuv {
    public ehna(Object object0) {
        super(object0, ServicePreference.class, "listItemVisualElement", "getListItemVisualElement()Lcom/google/android/gms/libs/ui/metrics/gmscore/GmsCoreMetrics$VisualElement;", 0);
    }

    @Override  // ibuv
    public final Object b() {
        Object object0 = ((ServicePreference)this.e).b;
        if(object0 != null) {
            return object0;
        }
        ibuq.j("listItemVisualElement");
        return null;
    }
}


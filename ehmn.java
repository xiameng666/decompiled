import com.google.android.gms.permissions.serviceinfo.ui.ControlPagePreference;

final class ehmn extends ibuv {
    public ehmn(Object object0) {
        super(object0, ControlPagePreference.class, "listItemVisualElement", "getListItemVisualElement()Lcom/google/android/gms/libs/ui/metrics/gmscore/GmsCoreMetrics$VisualElement;", 0);
    }

    @Override  // ibuv
    public final Object b() {
        Object object0 = ((ControlPagePreference)this.e).a;
        if(object0 != null) {
            return object0;
        }
        ibuq.j("listItemVisualElement");
        return null;
    }
}


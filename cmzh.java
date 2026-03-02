import com.google.android.gms.location.fused.manager.FusedLocationManager.Registration;

public final class cmzh implements gftc {
    @Override  // gftc
    public final boolean a(Object object0) {
        String s = ((FusedLocationManager.Registration)object0).m.f;
        return s != null && s.equals("location_accuracy");
    }
}


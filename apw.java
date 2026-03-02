import android.hardware.camera2.CameraManager.AvailabilityCallback;

public final class apw extends CameraManager.AvailabilityCallback {
    public boolean a;
    public final aqi b;
    private final String c;

    public apw(aqi aqi0, String s) {
        this.b = aqi0;
        super();
        this.a = true;
        this.c = s;
    }

    @Override  // android.hardware.camera2.CameraManager$AvailabilityCallback
    public final void onCameraAvailable(String s) {
        if(this.c.equals(s)) {
            this.a = true;
            aqi aqi0 = this.b;
            if(aqi0.A == 4 || aqi0.A == 5) {
                aqi0.B(false);
            }
        }
    }

    @Override  // android.hardware.camera2.CameraManager$AvailabilityCallback
    public final void onCameraUnavailable(String s) {
        if(!this.c.equals(s)) {
            return;
        }
        this.a = false;
    }
}


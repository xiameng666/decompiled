import android.os.Message;
import j..util.Objects;
import java.lang.ref.WeakReference;

final class aufw extends clht {
    private final WeakReference a;

    public aufw(WeakReference weakReference0) {
        this.a = weakReference0;
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        aufx aufx0 = (aufx)this.a.get();
        if(aufx0 == null) {
            super.handleMessage(message0);
            return;
        }
        switch(message0.what) {
            case 4: {
                aufx0.d = message0.getData().getString("castDeviceID");
                aufx.a.f("Self-device ID fetched as %s", new Object[]{aufx0.d});
                aufx0.b();
                return;
            }
            case 7: {
                aufx0.d = null;
                Object[] arr_object = {message0.getData().getString("errorInfo")};
                aufx.a.g("Unable to retrieve self-device ID: %s", arr_object);
                aufx.a.c("Retrying GET_DEVICE_ID call in %d seconds", new Object[]{((int)10)});
                Objects.requireNonNull(aufx0);
                aufx0.g(new aufv(aufx0), 10000);
                return;
            }
            default: {
                super.handleMessage(message0);
            }
        }
    }
}


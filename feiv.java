import android.os.Message;
import android.provider.Settings.Global;
import android.util.Log;
import j..util.Objects;

final class feiv extends fefk {
    final feiy a;

    public feiv(feiy feiy0) {
        Objects.requireNonNull(feiy0);
        this.a = feiy0;
        super();
    }

    @Override  // fefk
    public final String a() {
        return "GattServicesDisconnectedState";
    }

    @Override  // fefk
    public final boolean d(Message message0) {
        switch(message0.what) {
            case 1: 
            case 4: {
                feez feez0 = this.a.d;
                if(feez0.j()) {
                    try {
                        feez0.l();
                    }
                    catch(feex feex0) {
                        Log.w("IosServicesCM", "requestConnectionPriority failed", feex0);
                    }
                }
                else {
                    Log.e("IosServicesCM", "GATT helper is not connected");
                }
                feiy feiy0 = this.a;
                if(feiy0.o == null) {
                    feiy.k("Registering Standalone mode state observer.");
                    feiy0.o = new feip(feiy0, new clht(feiy0.f));
                    feiy0.a.getContentResolver().registerContentObserver(Settings.Global.getUriFor("tethered_config_state"), false, feiy0.o);
                }
                if(feiy0.b() == 2) {
                    feiy0.w(feiy0.m);
                    return true;
                }
                return true;
            }
            case 2: 
            case 3: 
            case 5: {
            label_21:
                feiy feiy1 = this.a;
                if(feiy1.o != null) {
                    feiy1.a.getContentResolver().unregisterContentObserver(feiy1.o);
                    feiy1.o = null;
                }
                feiy1.w(feiy1.l);
                return true;
            }
            case 11: {
                feex feex1 = (feex)message0.obj;
                if(feex1 == null || !this.a.f(feex1)) {
                    goto label_21;
                }
                return true;
            }
            case 12: {
                return true;
            }
            case 13: {
                this.a.w(this.a.m);
                return true;
            }
            default: {
                feiy.i(this.a, message0);
                return false;
            }
        }
    }
}


import android.os.Message;
import android.util.Log;
import j..util.Objects;

final class feiq extends fefk {
    final feiy a;

    public feiq(feiy feiy0) {
        Objects.requireNonNull(feiy0);
        this.a = feiy0;
        super();
    }

    @Override  // fefk
    public final String a() {
        return "AclConnectedState";
    }

    @Override  // fefk
    public final boolean d(Message message0) {
        switch(message0.what) {
            case 1: 
            case 4: {
                feiy feiy0 = this.a;
                feez feez0 = feiy0.d;
                if(!feez0.j()) {
                    String s = fefq.a(feiy0.a.getContentResolver());
                    if(s == null) {
                        Log.e("IosServicesCM", "Failed to connect. No companion address.");
                    }
                    else {
                        try {
                            feez0.d(feiy0.b.getRemoteDevice(s));
                            goto label_17;
                        }
                        catch(feex feex0) {
                            if(Log.isLoggable("IosServicesCM", 5)) {
                                Log.w("IosServicesCM", "GATT connect failure", feex0);
                            }
                        }
                    }
                    this.a.x(11);
                    return true;
                }
            label_17:
                this.a.w(this.a.k);
                return true;
            }
            case 2: 
            case 3: 
            case 5: 
            case 11: {
                try {
                    this.a.d.e();
                }
                catch(feex unused_ex) {
                }
                this.a.w(this.a.j);
                return true;
            }
            default: {
                feiy.i(this.a, message0);
                return false;
            }
        }
    }
}


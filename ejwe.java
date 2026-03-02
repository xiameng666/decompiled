import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import jeb.synthetic.TWR;

public final class ejwe extends ejvr {
    private final String b;

    public ejwe(ejtq ejtq0, String s, azug azug0) {
        super(ejtq0, "GetCustomizedSnoozePreset", azug0);
        this.b = s;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        DataHolder dataHolder0 = bbeh.d(context0, ejtu.a, new String[]{"morning_customized_time", "afternoon_customized_time", "evening_customized_time"}, "account_name=?", new String[]{this.b}, null);
        try {
            try {
                ejtq ejtq0 = this.a;
                ApiMetadata apiMetadata0 = cckf.d(bbdp.ex);
                ejtq0.b(dataHolder0, Status.b, apiMetadata0);
            }
            catch(RemoteException unused_ex) {
                try {
                    this.a.b(null, Status.d, ApiMetadata.b);
                }
                catch(RemoteException unused_ex) {
                }
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(dataHolder0, throwable0);
            throw throwable0;
        }
        if(dataHolder0 != null) {
            dataHolder0.close();
        }
        if(!ejxl.a(context0)) {
            ejxl.b(context0);
        }
    }
}


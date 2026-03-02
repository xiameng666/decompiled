import android.util.Log;
import com.google.android.gms.wearable.PutDataRequest;

public final class fekm {
    private final fcer a;

    public fekm(fcer fcer0) {
        this.a = fcer0;
    }

    public final void a(fczq fczq0) {
        if(Log.isLoggable("CompanionInfoWriter", 3)) {
            Log.d("CompanionInfoWriter", "Updating companion information for watch: " + fczq0.j + ", companion: " + fczq0.k);
        }
        String s = fczq0.j;
        if(fczq0.k != null && s != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)feyk.a).v_newBuilder();
            int v = fczq0.s;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            feyk feyk0 = (feyk)hftp0.b_message;
            feyk0.b |= 2;
            feyk0.c = v;
            feyk feyk1 = (feyk)hftp0.N_build();
            PutDataRequest putDataRequest0 = PutDataRequest.a(("/wearable/companion_info/" + s));
            putDataRequest0.c = feyk1.toBytesArray();
            putDataRequest0.e();
            evql evql0 = this.a.h(putDataRequest0);
            evql0.A(new fekk());
            evql0.b(new fekl());
        }
    }
}


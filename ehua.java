import android.content.Context;
import android.hardware.location.ContextHubInfo;
import android.hardware.location.ContextHubManager;
import android.hardware.location.ContextHubTransaction.OnCompleteListener;
import android.hardware.location.ContextHubTransaction.Response;
import android.hardware.location.ContextHubTransaction;
import android.hardware.location.NanoAppState;
import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import j..util.Objects;
import java.util.List;
import java.util.concurrent.CountDownLatch;

final class ehua implements ContextHubTransaction.OnCompleteListener {
    final ehub a;
    private final ContextHubInfo b;
    private final List c;
    private final Long d;
    private final ContextHubManager e;

    public ehua(ehub ehub0, ContextHubInfo contextHubInfo0, List list0, Long long0, ContextHubManager contextHubManager0) {
        Objects.requireNonNull(ehub0);
        this.a = ehub0;
        super();
        this.b = contextHubInfo0;
        this.c = list0;
        this.d = long0;
        this.e = contextHubManager0;
    }

    public final void onComplete(ContextHubTransaction contextHubTransaction0, ContextHubTransaction.Response contextHubTransaction$Response0) {
        ehub ehub0 = this.a;
        if(ehub0.c == null && ehub0.d) {
            ehub0.b = new CountDownLatch(1);
            if(contextHubTransaction$Response0.getResult() == 0) {
                long v = hrtd.a.I().Y();
                for(Object object0: ((List)contextHubTransaction$Response0.getContents())) {
                    long v1 = ((NanoAppState)object0).getNanoAppVersion();
                    if(v1 == 0L) {
                        v1 = 0L;
                    }
                    Long long0 = ((NanoAppState)object0).getNanoAppId();
                    if(this.d.equals(long0)) {
                        ContextHubInfo contextHubInfo0 = this.b;
                        contextHubInfo0.getId();
                        contextHubInfo0.getMaxPacketLengthBytes();
                        if(v1 < v) {
                            ((ggtj)eicd.a.j()).X("[%s] Nanoapp present but version %s is below minimum supported version %s", "ChreCommunication", Long.valueOf(v1), Long.valueOf(v));
                            ehub0.b.countDown();
                            ehub0.f(2);
                            return;
                        }
                        if(ehub0.c == null) {
                            Context context0 = AppContextProvider.a();
                            ehub0.c = this.e.createClient(context0, contextHubInfo0, ehub0.a, ehub0);
                        }
                        ehub0.b.countDown();
                        ehub0.f(1);
                        return;
                    }
                }
                ((ggtj)eicd.a.i()).P("[%s] Didn\'t find the nanoapp on contexthub: %s", "ChreCommunication", this.b.getId());
            }
            else {
                ((ggtj)eicd.a.i()).P("[%s] Failed to communicate with contexthub: %s", "ChreCommunication", this.b.getId());
            }
            this.c.remove(this.b);
            ehub0.b.countDown();
            if(this.c.isEmpty()) {
                ehub0.f(2);
            }
        }
    }
}


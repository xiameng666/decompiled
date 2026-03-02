import android.hardware.location.ContextHubInfo;
import android.hardware.location.ContextHubManager;
import android.hardware.location.ContextHubTransaction.Response;
import android.hardware.location.ContextHubTransaction;
import android.hardware.location.NanoAppState;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class esyt {
    public static final bboh a;

    static {
        esyt.a = bboh.b("TapAndPay", bbcu.aM);
    }

    public static final boolean a(ContextHubInfo contextHubInfo0, ContextHubManager contextHubManager0) {
        ibuq.f(contextHubInfo0, "contextHubInfo");
        ibuq.f(contextHubManager0, "contextHubManager");
        ContextHubTransaction contextHubTransaction0 = contextHubManager0.queryNanoApps(contextHubInfo0);
        ibuq.e(contextHubTransaction0, "queryNanoApps(...)");
        ContextHubTransaction.Response contextHubTransaction$Response0 = null;
        try {
            contextHubTransaction$Response0 = contextHubTransaction0.waitForResponse(5L, TimeUnit.SECONDS);
        }
        catch(InterruptedException interruptedException0) {
            ((ggtj)esyt.a.j()).B("Exception while querying sensorcollector", interruptedException0);
        }
        catch(TimeoutException timeoutException0) {
            ((ggtj)esyt.a.j()).B("Exception while querying sensorcollector", timeoutException0);
        }
        if(contextHubTransaction$Response0 != null && contextHubTransaction$Response0.getContents() != null) {
            Object object0 = contextHubTransaction$Response0.getContents();
            ibuq.e(object0, "getContents(...)");
            if(!(((Iterable)object0) instanceof Collection) || !((Collection)(((Iterable)object0))).isEmpty()) {
                for(Object object1: ((Iterable)object0)) {
                    if(((NanoAppState)object1).getNanoAppId() == 0x476F6F676C001048L) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}


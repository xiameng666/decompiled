import android.net.ConnectivityManager;
import com.google.android.gms.multidevice.domain.EnrollmentUseCase.tryInviteDevices.networkCallback.1;
import java.util.List;

public final class cszw {
    public final csxk a;
    public final cstg b;
    public final icck c;
    public final ConnectivityManager d;
    public final ctdo e;
    public static final int f;
    private static final bboh g;

    static {
        cszw.g = cume.a(new ibuk(cszw.class));
    }

    public cszw(csxk csxk0, cstg cstg0, icck icck0, ctdo ctdo0, ConnectivityManager connectivityManager0) {
        ibuq.f(csxk0, "settingsManager");
        ibuq.f(cstg0, "accountDeviceGroupsManager");
        ibuq.f(icck0, "scope");
        super();
        this.a = csxk0;
        this.b = cstg0;
        this.c = icck0;
        this.e = ctdo0;
        this.d = connectivityManager0;
    }

    public final Object a(cssq cssq0, List list0, ibrl ibrl0) {
        cszu cszu0;
        if((ibrl0 instanceof cszu)) {
            cszu0 = (cszu)ibrl0;
            int v = cszu0.c;
            if((v & 0x80000000) == 0) {
                cszu0 = new cszu(this, ibrl0);
            }
            else {
                cszu0.c = v - 0x80000000;
            }
        }
        else {
            cszu0 = new cszu(this, ibrl0);
        }
        Object object0 = cszu0.a;
        Object object1 = ibrx.a;
        switch(cszu0.c) {
            case 0: {
                ibnx.b(object0);
                ConnectivityManager connectivityManager0 = this.d;
                if(!connectivityManager0.isDefaultNetworkActive()) {
                    goto label_19;
                }
                cszu0.c = 1;
                if(this.b.a(cssq0, list0, cszu0) == object1) {
                    return object1;
                label_19:
                    EnrollmentUseCase.tryInviteDevices.networkCallback.1 enrollmentUseCase$tryInviteDevices$networkCallback$10 = new EnrollmentUseCase.tryInviteDevices.networkCallback.1(this, cssq0, list0);
                    ((ggtj)cszw.g.h()).x("Device is offline, creating network callback for invitations.");
                    connectivityManager0.registerDefaultNetworkCallback(enrollmentUseCase$tryInviteDevices$networkCallback$10);
                    return ibom.a;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.e.h(ctdl.e);
        return ibom.a;
    }
}


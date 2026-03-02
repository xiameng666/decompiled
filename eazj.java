import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.GetIntegrityTokenForPixRequest;
import com.google.android.gms.pay.GetIntegrityTokenForPixResponse;
import java.util.concurrent.ExecutorService;

@cmcs(a = cmcr.a)
public final class eazj extends ebav {
    public dxfs a;
    private static final bboh b;
    private final GetIntegrityTokenForPixRequest c;
    private final donp d;
    private eaut e;

    static {
        eazj.b = bboh.b("Pay", bbcu.cZ);
    }

    public eazj(GetIntegrityTokenForPixRequest getIntegrityTokenForPixRequest0, String s, donp donp0, azug azug0) {
        ibuq.f(getIntegrityTokenForPixRequest0, "request");
        ibuq.f(s, "callingPackage");
        ibuq.f(donp0, "callbacks");
        super("GetIntegrityTokenForPixOperation", s, azug0);
        this.c = getIntegrityTokenForPixRequest0;
        this.d = donp0;
    }

    @Override  // ebaw
    public final void b(Context context0) {
        ibuq.f(context0, "context");
        hwpy.d();
        if(!hwpy.c()) {
            ((ggtj)eazj.b.i()).x("PixPiaWarmUp is disabled");
            eazj.d(this, null, null, 3);
            return;
        }
        icpu.e(iccl.b(new icds(new bblp(0x7FFFFFFF, 9))), new eazh(this, null)).get();
    }

    public final Object c(ibrl ibrl0) {
        Object object2;
        eazi eazi0;
        if((ibrl0 instanceof eazi)) {
            eazi0 = (eazi)ibrl0;
            int v = eazi0.c;
            if((v & 0x80000000) == 0) {
                eazi0 = new eazi(this, ibrl0);
            }
            else {
                eazi0.c = v - 0x80000000;
            }
        }
        else {
            eazi0 = new eazi(this, ibrl0);
        }
        Object object0 = eazi0.a;
        Object object1 = ibrx.a;
        switch(eazi0.c) {
            case 0: {
                ibnx.b(object0);
                if(this.e == null) {
                    this.e = new eaut();
                }
                eaut eaut0 = this.e;
                if(eaut0 != null) {
                    eaut0.inject(this);
                }
                String s = this.c.a;
                if(s == null || s.length() == 0) {
                    ((ggtj)eazj.b.i()).x("requestHash cannot be empty");
                    eazj.d(this, null, null, 3);
                    return ibom.a;
                }
                dxfs dxfs0 = this.a;
                if(dxfs0 == null) {
                    ibuq.j("pixRiskSignalsManager");
                    dxfs0 = null;
                }
                eazi0.c = 1;
                object2 = dxfs0.a(s, eazi0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!(object2 instanceof ibnv)) {
            if(((String)object2) != null && ((String)object2).length() != 0) {
                GetIntegrityTokenForPixResponse getIntegrityTokenForPixResponse0 = new GetIntegrityTokenForPixResponse();
                getIntegrityTokenForPixResponse0.a = (String)object2;
                this.d.f(Status.b, getIntegrityTokenForPixResponse0);
                return ibom.a;
            }
            ((ggtj)eazj.b.i()).x("Token in the result was null or empty");
            eazj.d(this, null, null, 3);
            return ibom.a;
        }
        ((ggtj)eazj.b.i()).B("Result was a failure", ibnw.a(object2));
        eazj.d(this, null, null, 3);
        return ibom.a;
    }

    static void d(eazj eazj0, Exception exception0, Status status0, int v) {
        if(1 == (v & 1)) {
            exception0 = null;
        }
        if(exception0 != null) {
            ((ggtj)eazj.b.i()).B("Exception caught while executing the operation.", exception0);
        }
        if((v & 2) != 0) {
            status0 = null;
        }
        donp donp0 = eazj0.d;
        if(status0 == null) {
            status0 = Status.d;
        }
        donp0.f(status0, new GetIntegrityTokenForPixResponse());
    }

    @Override  // cjtm
    public final void j(Status status0) {
        eazj.d(this, null, status0, 1);
    }

    @Override  // ebav
    public final ExecutorService r() {
        return new bblp(0x7FFFFFFF, 9);
    }
}


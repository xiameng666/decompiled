import android.accounts.Account;
import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public final class ezrg implements ezss {
    public final Map a;
    public final ibrt b;
    public final icck c;
    public fpgj d;
    public final icta e;
    private final Context f;
    private final Executor g;
    private final icta h;

    public ezrg(Context context0, Executor executor0) {
        ibuq.f(context0, "context");
        ibuq.f(executor0, "executor");
        super();
        this.f = context0;
        this.g = executor0;
        this.e = new icta();
        this.h = new icta();
        this.a = new LinkedHashMap();
        this.b = cclw.d;
        this.c = iccl.b(cclw.d);
    }

    @Override  // ezss
    public final gmcd a(Account account0) {
        throw null;
    }

    public final Object b(ibrl ibrl0) {
        icta icta2;
        Object object2;
        icta icta0;
        ezrf ezrf0;
        if((ibrl0 instanceof ezrf)) {
            ezrf0 = (ezrf)ibrl0;
            int v = ezrf0.c;
            if((v & 0x80000000) == 0) {
                ezrf0 = new ezrf(this, ibrl0);
            }
            else {
                ezrf0.c = v - 0x80000000;
            }
        }
        else {
            ezrf0 = new ezrf(this, ibrl0);
        }
        Object object0 = ezrf0.a;
        Object object1 = ibrx.a;
        switch(ezrf0.c) {
            case 0: {
                ibnx.b(object0);
                if(this.d == null) {
                    icta0 = this.h;
                    ezrf0.e = icta0;
                    ezrf0.c = 1;
                    if(icta0.b(ezrf0) == object1) {
                        return object1;
                    }
                    goto label_24;
                }
                return ibom.a;
            }
            case 1: {
                icta icta1 = ezrf0.e;
                ibnx.b(object0);
                icta0 = icta1;
            label_24:
                if(this.d == null) {
                    try {
                        ezrf0.e = icta0;
                        ezrf0.d = this;
                        ezrf0.c = 2;
                        object2 = fpgj.a.a(this.f, this.g, ezrf0);
                    }
                    catch(Throwable throwable0) {
                        icta2 = icta0;
                        icta2.d();
                        throw throwable0;
                    }
                    if(object2 != object1) {
                        try {
                            icta2 = icta0;
                            this.d = (fpgj)object2;
                            icta0 = icta2;
                            break;
                        label_39:
                            this = ezrf0.d;
                            icta2 = ezrf0.e;
                            ibnx.b(object0);
                            this.d = (fpgj)object0;
                            icta0 = icta2;
                            break;
                        }
                        catch(Throwable throwable0) {
                        }
                        icta2.d();
                        throw throwable0;
                    }
                    return object1;
                }
                break;
            }
            case 2: {
                goto label_39;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        icta0.d();
        return ibom.a;
    }
}


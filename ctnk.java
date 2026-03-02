import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public final class ctnk {
    public static final Object a(Context context0, Intent intent0, ibth ibth0, ibtw ibtw0, ibrl ibrl0) {
        Throwable throwable1;
        ctni ctni2;
        Context context2;
        bbic bbic1;
        Object object2;
        ctng ctng0;
        if((ibrl0 instanceof ctng)) {
            ctng0 = (ctng)ibrl0;
            int v = ctng0.f;
            if((v & 0x80000000) == 0) {
                ctng0 = new ctng(ibrl0);
            }
            else {
                ctng0.f = v - 0x80000000;
            }
        }
        else {
            ctng0 = new ctng(ibrl0);
        }
        Object object0 = ctng0.e;
        Object object1 = ibrx.a;
        switch(ctng0.f) {
            case 0: {
                ibnx.b(object0);
                bbic bbic0 = bbic.a();
                ctng0.a = context0;
                ctng0.b = intent0;
                ctng0.c = ibth0;
                object2 = ibtw0;
                ctng0.d = object2;
                ctng0.g = bbic0;
                ctng0.f = 1;
                icbk icbk0 = new icbk(ibsc.c(ctng0), 1);
                icbk0.z();
                ctni ctni0 = new ctni(icbk0, bbic0, context0, intent0, ibth0);
                icbk0.d(new ctnh(bbic0, context0, ctni0));
                try {
                    if(!bbic0.d(context0, intent0, ctni0, 1)) {
                        bbic0.b(context0, ctni0);
                        icbk0.w(ibnx.a(new IllegalStateException(a.i(intent0, "Failed to bind service for ", "."))));
                    }
                }
                catch(SecurityException securityException0) {
                    bbic0.b(context0, ctni0);
                    icbk0.w(ibnx.a(securityException0));
                }
                object0 = icbk0.k();
                if(object0 == ibrx.a) {
                    ibsi.b(ctng0);
                }
                if(object0 != object1) {
                    bbic1 = bbic0;
                    goto label_48;
                }
                return object1;
            }
            case 1: {
                bbic bbic2 = ctng0.g;
                Object object3 = ctng0.d;
                ibth ibth1 = (ibth)ctng0.c;
                Intent intent1 = (Intent)ctng0.b;
                Context context1 = (Context)ctng0.a;
                ibnx.b(object0);
                object2 = object3;
                bbic1 = bbic2;
                context0 = context1;
            label_48:
                IBinder iBinder0 = (IBinder)((ibns)object0).a;
                ctni ctni1 = (ctni)((ibns)object0).b;
                try {
                    ctng0.a = context0;
                    ctng0.b = bbic1;
                    ctng0.c = ctni1;
                    ctng0.d = null;
                    ctng0.g = null;
                    ctng0.f = 2;
                    object0 = ((ibtw)object2).a(iBinder0, ctng0);
                }
                catch(Throwable throwable0) {
                    context2 = context0;
                    ctni2 = ctni1;
                    goto label_72;
                }
                if(object0 != object1) {
                    context2 = context0;
                    ctni2 = ctni1;
                    goto label_83;
                }
                return object1;
            }
            case 2: {
                ctni2 = (ctni)ctng0.c;
                bbic1 = (bbic)ctng0.b;
                context2 = (Context)ctng0.a;
                try {
                    ibnx.b(object0);
                    goto label_83;
                }
                catch(Throwable throwable0) {
                }
            label_72:
                ctnj ctnj0 = new ctnj(bbic1, context2, ctni2, null);
                ctng0.a = throwable0;
                ctng0.b = null;
                ctng0.c = null;
                ctng0.d = null;
                ctng0.g = null;
                ctng0.f = 4;
                if(icbd.a(icey.a, ctnj0, ctng0) != object1) {
                    throwable1 = throwable0;
                    throw throwable1;
                }
                return object1;
            label_83:
                ctnj ctnj1 = new ctnj(bbic1, context2, ctni2, null);
                ctng0.a = object0;
                ctng0.b = null;
                ctng0.c = null;
                ctng0.f = 3;
                return icbd.a(icey.a, ctnj1, ctng0) == object1 ? object1 : object0;
            }
            case 3: {
                Object object4 = ctng0.a;
                ibnx.b(object0);
                return object4;
            }
            case 4: {
                throwable1 = (Throwable)ctng0.a;
                ibnx.b(object0);
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


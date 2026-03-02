import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class jdp implements gui {
    public boolean a;
    public final jdh b;
    private final List c;
    private final jff d;
    private final jdt e;
    private final ibts f;
    private final gra g;

    public jdp(List list0, Object object0, jff jff0, jdt jdt0, ibts ibts0, jdh jdh0) {
        this.c = list0;
        this.d = jff0;
        this.e = jdt0;
        this.f = ibts0;
        this.b = jdh0;
        this.g = new ParcelableSnapshotMutableState(object0, gul.a);
        this.a = true;
    }

    @Override  // gui
    public final Object a() {
        return this.g.a();
    }

    public final Object b(ibrl ibrl0) {
        jdy jdy0;
        int v2;
        Object object2;
        int v1;
        Object object1;
        Object object0;
        jdl jdl0;
        if((ibrl0 instanceof jdl)) {
            jdl0 = (jdl)ibrl0;
            int v = jdl0.g;
            if((v & 0x80000000) == 0) {
                jdl0 = new jdl(this, ibrl0);
            }
            else {
                jdl0.g = v - 0x80000000;
            }
        }
        else {
            jdl0 = new jdl(this, ibrl0);
        }
        try {
            object0 = jdl0.e;
            object1 = ibrx.a;
            switch(jdl0.g) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_18;
                }
                case 2: {
                    goto label_26;
                }
            }
        }
        catch(Throwable throwable0) {
            goto label_60;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        try {
            v1 = this.c.size();
            object2 = this.c;
            v2 = 0;
            goto label_31;
        label_18:
            v1 = jdl0.d;
            v2 = jdl0.c;
            Object object3 = jdl0.b;
            Object object4 = jdl0.a;
            ibnx.b(object0);
            Object object5 = object3;
            object2 = object4;
            goto label_44;
        label_26:
            v1 = jdl0.d;
            v2 = jdl0.c;
            object2 = jdl0.a;
            ibnx.b(object0);
            while(true) {
                do {
                label_30:
                    ++v2;
                label_31:
                    if(v2 >= v1) {
                        goto label_65;
                    }
                    jdy0 = (jdy)((List)object2).get(v2);
                }
                while(!jel.a(jdy0.a(), 2));
                jdm jdm0 = new jdm(this, jdy0, null);
                jdl0.a = object2;
                jdl0.b = jdy0;
                jdl0.c = v2;
                jdl0.d = v1;
                jdl0.g = 1;
                Object object6 = this.e.b(jdy0, jdm0, jdl0);
                if(object6 == object1) {
                    return object1;
                }
                object5 = jdy0;
                object0 = object6;
            label_44:
                if(object0 != null) {
                    Object object7 = jeo.a(this.d.d, object0, ((jdy)object5), this.d.b, this.d.c);
                    this.g.b(object7);
                    break;
                }
                goto label_52;
            }
        }
        catch(Throwable throwable0) {
            goto label_60;
        }
        boolean z = icei.h(jdl0.u());
        this.a = false;
        jfj jfj0 = new jfj(this.a(), z);
        this.f.a(jfj0);
        return ibom.a;
        try {
        label_52:
            jdl0.a = object2;
            jdl0.b = null;
            jdl0.c = v2;
            jdl0.d = v1;
            jdl0.g = 2;
            if(icfv.a(jdl0) != object1) {
                goto label_30;
            }
            return object1;
        }
        catch(Throwable throwable0) {
        label_60:
            boolean z1 = icei.h(jdl0.u());
            this.a = false;
            jfj jfj1 = new jfj(this.a(), z1);
            this.f.a(jfj1);
            throw throwable0;
        }
    label_65:
        boolean z2 = icei.h(jdl0.u());
        this.a = false;
        jfj jfj2 = new jfj(this.a(), z2);
        this.f.a(jfj2);
        return ibom.a;
    }

    public final Object c(jdy jdy0, ibrl ibrl0) {
        jdn jdn0;
        if((ibrl0 instanceof jdn)) {
            jdn0 = (jdn)ibrl0;
            int v = jdn0.d;
            if((v & 0x80000000) == 0) {
                jdn0 = new jdn(this, ibrl0);
            }
            else {
                jdn0.d = v - 0x80000000;
            }
        }
        else {
            jdn0 = new jdn(this, ibrl0);
        }
        Object object0 = jdn0.b;
        Object object1 = ibrx.a;
        switch(jdn0.d) {
            case 0: {
                ibnx.b(object0);
                try {
                    jdo jdo0 = new jdo(this, jdy0, null);
                    jdn0.a = jdy0;
                    jdn0.d = 1;
                    Object object2 = icfo.c(15000L, jdo0, jdn0);
                    return object2 == object1 ? object1 : object2;
                label_21:
                    jdy0 = jdn0.a;
                    ibnx.b(object0);
                    return object0;
                }
                catch(CancellationException cancellationException0) {
                    goto label_25;
                }
                catch(Exception exception0) {
                    goto label_28;
                }
            }
            case 1: {
                goto label_21;
            label_25:
                if(!icei.h(jdn0.u())) {
                    throw cancellationException0;
                label_28:
                    CoroutineExceptionHandler coroutineExceptionHandler0 = (CoroutineExceptionHandler)jdn0.u().get(CoroutineExceptionHandler.c);
                    if(coroutineExceptionHandler0 != null) {
                        ibrt ibrt0 = jdn0.u();
                        Objects.toString(jdy0);
                        coroutineExceptionHandler0.handleException(ibrt0, new IllegalStateException("Unable to load font " + jdy0, exception0));
                        return null;
                    }
                }
                return null;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


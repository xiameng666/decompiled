import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.FIN;

public final class bve {
    public final Object a;
    public final Map b;
    public final Map c;
    ayv d;
    private final ArrayDeque e;

    bve() {
        this(null);
    }

    public bve(byte[] arr_b) {
        this.a = new Object();
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = new ArrayDeque();
    }

    public final LifecycleCameraRepository.LifecycleCameraRepositoryObserver a(lps lps0) {
        synchronized(this.a) {
            for(Object object1: this.c.keySet()) {
                LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserver0 = (LifecycleCameraRepository.LifecycleCameraRepositoryObserver)object1;
                if(lps0.equals(lifecycleCameraRepository$LifecycleCameraRepositoryObserver0.a)) {
                    return lifecycleCameraRepository$LifecycleCameraRepositoryObserver0;
                }
            }
        }
        return null;
    }

    public final void b(lps lps0) {
        Object object0 = this.a;
        synchronized(object0) {
            __monitor_enter(object0);
        }
        try {
            LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserver0 = this.a(lps0);
            if(lifecycleCameraRepository$LifecycleCameraRepositoryObserver0 == null) {
                goto label_35;
            }
            else {
                Iterator iterator0 = ((Set)this.c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserver0)).iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_33;
                    }
                    Object object1 = iterator0.next();
                    LifecycleCamera lifecycleCamera0 = (LifecycleCamera)this.b.get(((bvd)object1));
                    kay.i(lifecycleCamera0);
                    if(!lifecycleCamera0.c().isEmpty()) {
                        goto label_15;
                    }
                }
            }
            goto label_36;
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object0);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                __monitor_exit(object0);
                throw throwable0;
            }
        }
    label_15:
        __monitor_exit(object0);
        try {
            ArrayDeque arrayDeque0 = this.e;
            if(arrayDeque0.isEmpty()) {
                arrayDeque0.push(lps0);
            }
            else {
                lps lps1 = (lps)arrayDeque0.peek();
                if(!lps0.equals(lps1)) {
                    this.e(lps1);
                    arrayDeque0.remove(lps0);
                    arrayDeque0.push(lps0);
                }
            }
            this.f(lps0);
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
        __monitor_exit(object0);
        return;
    label_33:
        __monitor_exit(object0);
        goto label_36;
    label_35:
        __monitor_exit(object0);
    label_36:
        __monitor_exit(object0);
    }

    public final void c(lps lps0) {
        synchronized(this.a) {
            ArrayDeque arrayDeque0 = this.e;
            arrayDeque0.remove(lps0);
            this.e(lps0);
            if(!arrayDeque0.isEmpty()) {
                this.f(((lps)arrayDeque0.peek()));
            }
        }
    }

    public final void d(lps lps0) {
        synchronized(this.a) {
            LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserver0 = this.a(lps0);
            if(lifecycleCameraRepository$LifecycleCameraRepositoryObserver0 == null) {
                return;
            }
            this.c(lps0);
            Map map0 = this.c;
            for(Object object1: ((Set)map0.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserver0))) {
                this.b.remove(((bvd)object1));
            }
            map0.remove(lifecycleCameraRepository$LifecycleCameraRepositoryObserver0);
            lifecycleCameraRepository$LifecycleCameraRepositoryObserver0.a.getLifecycle().d(lifecycleCameraRepository$LifecycleCameraRepositoryObserver0);
        }
    }

    private final void e(lps lps0) {
        synchronized(this.a) {
            LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserver0 = this.a(lps0);
            if(lifecycleCameraRepository$LifecycleCameraRepositoryObserver0 == null) {
                return;
            }
            for(Object object1: ((Set)this.c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserver0))) {
                LifecycleCamera lifecycleCamera0 = (LifecycleCamera)this.b.get(((bvd)object1));
                kay.i(lifecycleCamera0);
                lifecycleCamera0.d();
            }
        }
    }

    private final void f(lps lps0) {
        Object object0 = this.a;
        __monitor_enter(object0);
        try {
            LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserver0 = this.a(lps0);
            for(Object object1: ((Set)this.c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserver0))) {
                LifecycleCamera lifecycleCamera0 = (LifecycleCamera)this.b.get(((bvd)object1));
                kay.i(lifecycleCamera0);
                if(lifecycleCamera0.c().isEmpty()) {
                    continue;
                }
                Object object2 = lifecycleCamera0.a;
                __monitor_enter(object2);
                int v1 = FIN.finallyOpen$NT();
                if(lifecycleCamera0.d) {
                    lifecycleCamera0.d = false;
                    lps lps1 = lifecycleCamera0.b;
                    if(lps1.getLifecycle().a().a(lpf.d)) {
                        lifecycleCamera0.onStart(lps1);
                    }
                    FIN.finallyExec$NT(v1);
                }
                else {
                    FIN.finallyCodeBegin$NT(v1);
                }
            }
        }
        finally {
            __monitor_exit(object0);
        }
    }
}


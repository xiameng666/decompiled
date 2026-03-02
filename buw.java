import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class buw implements Runnable {
    public final bvb a;

    public buw(bvb bvb0) {
        this.a = bvb0;
    }

    @Override
    public final void run() {
        bvb bvb0 = this.a;
        if(bvb0.d()) {
            bvb0.c();
            bve bve0 = bvb0.f;
            ibuq.c(bve0);
            Object object0 = bve0.a;
            synchronized(object0) {
                Iterator iterator0 = bvb0.i.iterator();
            alab1:
                while(true) {
                label_8:
                    if(!iterator0.hasNext()) {
                        goto label_44;
                    }
                    Object object1 = iterator0.next();
                    bvd bvd0 = (bvd)object1;
                    Map map0 = bve0.b;
                    if(map0.containsKey(bvd0)) {
                        LifecycleCamera lifecycleCamera0 = (LifecycleCamera)map0.get(bvd0);
                        synchronized(object0) {
                            lps lps0 = lifecycleCamera0.a();
                            bvd bvd1 = bvd.a(lps0, lifecycleCamera0.c.b);
                            map0.remove(bvd1);
                            HashSet hashSet0 = new HashSet();
                            Map map1 = bve0.c;
                            for(Object object2: map1.keySet()) {
                                LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserver0 = (LifecycleCameraRepository.LifecycleCameraRepositoryObserver)object2;
                                lps lps1 = lifecycleCameraRepository$LifecycleCameraRepositoryObserver0.a;
                                if(lps0.equals(lps1)) {
                                    Set set0 = (Set)map1.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserver0);
                                    set0.remove(bvd1);
                                    if(set0.isEmpty()) {
                                        hashSet0.add(lps1);
                                    }
                                }
                            }
                            Iterator iterator2 = hashSet0.iterator();
                            while(true) {
                                if(!iterator2.hasNext()) {
                                    break alab1;
                                }
                                Object object3 = iterator2.next();
                                bve0.d(((lps)object3));
                            }
                        }
                    }
                }
            }
            goto label_8;
        label_44:
        }
    }
}


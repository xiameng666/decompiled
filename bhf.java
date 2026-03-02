import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class bhf implements Runnable {
    public final Throwable a;
    public final bhg b;
    public final List c;

    public bhf(Throwable throwable0, bhg bhg0, List list0) {
        this.a = throwable0;
        this.b = bhg0;
        this.c = list0;
    }

    @Override
    public final void run() {
        List list2;
        List list1;
        ArrayList arrayList0;
        Throwable throwable0 = this.a;
        bhg bhg0 = this.b;
        if(throwable0 == null) {
            List list0 = this.c;
            bit bit0 = (bit)bhg0.b;
            biu biu1 = bit0.a;
            if(biu1.f.get()) {
                aox aox0 = biu1.i;
                if(aox0 != null) {
                    bjb bjb0 = biu1.b;
                    if(bjb0 != null) {
                        bjk bjk0 = biu1.j;
                        if(bjk0 != null) {
                            if(list0 == null) {
                                arrayList0 = ibps.a;
                            }
                            else {
                                arrayList0 = new ArrayList(ibpo.q(list0, 10));
                                for(Object object0: list0) {
                                    arrayList0.add(((azy)object0).a());
                                }
                            }
                            try {
                                list1 = biu1.e;
                                list2 = aox0.c(arrayList0);
                            }
                            catch(bcr bcr0) {
                                bcs.b("Camera2CameraFactory", "Unable to calculate available camera ids.", bcr0);
                                list2 = new ArrayList();
                            }
                            ArrayList arrayList1 = new ArrayList(ibpo.q(list2, 10));
                            for(Object object1: list2) {
                                ibuq.c(((String)object1));
                                arrayList1.add(azx.a(((String)object1)));
                            }
                            Set set0 = ibqg.e(ibpo.ay(list1), ibpo.ay(arrayList1));
                            if(!set0.isEmpty()) {
                                LinkedHashSet linkedHashSet0 = bjb0.c();
                                ibuq.f(set0, "removedCameras");
                                if(!bjk0.a) {
                                    bjj bjj0 = bjk0.b;
                                    boolean z = bjj0.a;
                                    if(z || bjj0.b) {
                                        bab bab0 = bab.b;
                                        ibuq.e(bab0, "DEFAULT_BACK_CAMERA");
                                        boolean z1 = bjk.a(linkedHashSet0, bab0);
                                        bab bab1 = bab.a;
                                        ibuq.e(bab1, "DEFAULT_FRONT_CAMERA");
                                        boolean z2 = bjk.a(linkedHashSet0, bab1);
                                        ArrayList arrayList2 = new ArrayList(ibpo.q(set0, 10));
                                        for(Object object2: set0) {
                                            arrayList2.add(((azy)object2).a());
                                        }
                                        Set set1 = ibpo.ay(arrayList2);
                                        ArrayList arrayList3 = new ArrayList();
                                        for(Object object3: linkedHashSet0) {
                                            if(!set1.contains(((bin)object3).e().j())) {
                                                arrayList3.add(object3);
                                            }
                                            z = z;
                                        }
                                        Set set2 = ibpo.ay(arrayList3);
                                        ibuq.e(bab0, "DEFAULT_BACK_CAMERA");
                                        boolean z3 = bjk.a(set2, bab0);
                                        ibuq.e(bab1, "DEFAULT_FRONT_CAMERA");
                                        boolean z4 = bjk.a(set2, bab1);
                                        if(z && z1 && !z3 || bjj0.b && z2 && !z4) {
                                            bcs.d("CameraPresencePrvdr", "Camera removal update invalid. Aborting.");
                                            return;
                                        }
                                    }
                                }
                            }
                            try {
                                aox0.e(arrayList0);
                            }
                            catch(Exception exception0) {
                                bcs.e("CameraPresencePrvdr", "CameraFactory failed to update. The camera list may be stale until the next update.", exception0);
                                return;
                            }
                            Set set3 = aox0.d();
                            ArrayList arrayList4 = new ArrayList(ibpo.q(set3, 10));
                            for(Object object4: set3) {
                                ibuq.c(((String)object4));
                                arrayList4.add(azx.a(((String)object4)));
                            }
                            biu biu2 = bit0.a;
                            if(!ibuq.m(arrayList4, biu2.e)) {
                                List list3 = ibpo.ar(biu2.e);
                                if(!ibuq.m(arrayList4, list3)) {
                                    Set set4 = ibpo.ay(list3);
                                    Set set5 = ibpo.ay(arrayList4);
                                    Set set6 = ibqg.e(set5, set4);
                                    Set set7 = ibqg.e(set4, set5);
                                    ArrayList arrayList5 = new ArrayList();
                                    ArrayList arrayList6 = new ArrayList(ibpo.q(arrayList4, 10));
                                    for(Object object5: arrayList4) {
                                        arrayList6.add(((azy)object5).a());
                                    }
                                    try {
                                        for(Object object6: set7) {
                                            biu2.c(((azy)object6).a());
                                        }
                                        bjb bjb1 = biu2.b;
                                        if(bjb1 != null) {
                                            bcs.h("CameraPresencePrvdr");
                                            bjb1.a(arrayList6);
                                            arrayList5.add(bjb1);
                                            bcs.h("CameraPresencePrvdr");
                                        }
                                        CopyOnWriteArrayList copyOnWriteArrayList0 = biu2.g;
                                        if(!copyOnWriteArrayList0.isEmpty()) {
                                            bcs.h("CameraPresencePrvdr");
                                            for(Object object7: copyOnWriteArrayList0) {
                                                ((bks)object7).a(arrayList6);
                                                ibuq.c(((bks)object7));
                                                arrayList5.add(((bks)object7));
                                            }
                                        }
                                        biu2.e = arrayList4;
                                        for(Object object8: set6) {
                                            biu2.b(((azy)object8).a());
                                        }
                                        if(!set6.isEmpty()) {
                                            bcs.c("CameraPresencePrvdr", "Notifying " + set6.size() + " cameras added.");
                                            Iterator iterator9 = biu2.h.iterator();
                                            if(iterator9.hasNext()) {
                                                Object object9 = iterator9.next();
                                                bis bis0 = (bis)object9;
                                                throw null;
                                            }
                                        }
                                        if(!set7.isEmpty()) {
                                            bcs.c("CameraPresencePrvdr", "Notifying " + set7.size() + " cameras removed.");
                                            Iterator iterator10 = biu2.h.iterator();
                                            if(iterator10.hasNext()) {
                                                Object object10 = iterator10.next();
                                                bis bis1 = (bis)object10;
                                                throw null;
                                            }
                                        }
                                    }
                                    catch(Exception exception1) {
                                        bcs.b("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", exception1);
                                        ArrayList arrayList7 = new ArrayList(ibpo.q(list3, 10));
                                        for(Object object11: list3) {
                                            arrayList7.add(((azy)object11).a());
                                        }
                                        ibqa ibqa0 = new ibqa(new ibqb(arrayList5), 0);
                                        while(ibqa0.hasNext()) {
                                            Object object12 = ibqa0.next();
                                            bks bks0 = (bks)object12;
                                            try {
                                                bks0.a(arrayList7);
                                            }
                                            catch(Exception exception2) {
                                                Objects.toString(bks0);
                                                bcs.b("CameraPresencePrvdr", "Failed to rollback listener: " + bks0, exception2);
                                            }
                                        }
                                        for(Object object13: set7) {
                                            biu2.b(((azy)object13).a());
                                        }
                                        for(Object object14: set6) {
                                            biu2.c(((azy)object14).a());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            biu biu0 = ((bit)bhg0.b).a;
            if(biu0.f.get()) {
                bcs.b("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", throwable0);
                bld bld0 = biu0.c;
                if(bld0 != null) {
                    bld0.a();
                }
            }
        }
    }
}


import j..util.Map.-EL;
import java.util.ArrayList;
import java.util.List;

public final class bfar {
    private final bewt a;

    public bfar(bewt bewt0) {
        this.a = bewt0;
    }

    // This method was un-flattened
    public final Object a(List list0, ibrl ibrl0) {
        bfan bfan0;
        bewg bewg3;
        bewp bewp1;
        Object object4;
        Object object2;
        bfaq bfaq0;
        if((ibrl0 instanceof bfaq)) {
            bfaq0 = (bfaq)ibrl0;
            int v = bfaq0.f;
            if((v & 0x80000000) == 0) {
                bfaq0 = new bfaq(this, ibrl0);
            }
            else {
                bfaq0.f = v - 0x80000000;
            }
        }
        else {
            bfaq0 = new bfaq(this, ibrl0);
        }
        Object object0 = bfaq0.d;
        Object object1 = ibrx.a;
        switch(bfaq0.f) {
            case 0: {
                ibnx.b(object0);
                ArrayList arrayList0 = new ArrayList();
                object2 = new ArrayList();
                bewp bewp0 = new bewp();
                bfaq0.a = list0;
                bfaq0.b = arrayList0;
                bfaq0.c = object2;
                bfaq0.g = bewp0;
                bfaq0.f = 1;
                Object object3 = this.a.a(bfaq0);
                if(object3 != object1) {
                    object4 = arrayList0;
                    object0 = object3;
                    bewp1 = bewp0;
                    break;
                }
                return object1;
            }
            case 1: {
                bewp1 = bfaq0.g;
                Object object5 = bfaq0.c;
                object4 = bfaq0.b;
                Object object6 = bfaq0.a;
                ibnx.b(object0);
                object2 = object5;
                list0 = object6;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((bews)object0) == null) {
            throw new beze();
        }
        for(Object object7: list0) {
            bewk bewk0 = (bewk)object7;
            String s = bewk0.d;
            bewg bewg0 = null;
            bewg bewg1 = s == null || s.length() <= 1000 ? null : bewg.a;
            if(bewg1 == null) {
                String s1 = bewk0.b;
                String s2 = bewk0.a;
                bewg bewg2 = s1 != null && s1.length() != 0 || s2.length() != 0 ? null : bewg.f;
                if(bewg2 == null) {
                    bewg1 = s1 == null || s1.length() <= 1000 ? null : bewg.b;
                    if(bewg1 == null) {
                        String s3 = bewk0.c;
                        if(s3.length() == 0) {
                            bewg3 = bewg.e;
                        }
                        else {
                            bewg3 = s3.length() <= 1000 ? null : bewg.c;
                        }
                        if(bewg3 != null) {
                            bewg0 = bewg3;
                        }
                        else if(s2.length() == 0) {
                            bewg0 = bewg.g;
                        }
                        else if(!gfri.a.h(s2)) {
                            bewg0 = bewg.h;
                        }
                        else if(s2.length() > 0x800) {
                            bewg0 = bewg.d;
                        }
                    }
                    else {
                        bewg0 = bewg1;
                    }
                }
                else {
                    bewg0 = bewg2;
                }
            }
            else {
                bewg0 = bewg1;
            }
            if(bewg0 == null) {
                String s4 = bewk0.a;
                if(ibzk.m(s4, "http://android://", true)) {
                    String s5 = s4.substring(17);
                    ibuq.e(s5, "substring(...)");
                    s4 = "android://" + s5;
                }
                bedo bedo0 = bgmt.a(s4);
                if(bedo0 == null) {
                    bfan0 = bfar.b(bewk0, bewg.i);
                }
                else {
                    String s6 = bewk0.b;
                    bewh bewh0 = new bewh(bedo0, s6, bewk0.c, s);
                    bewo bewo0 = new bewo(bewh0.b, bewh0.a);
                    bewh bewh1 = (bewh)Map.-EL.putIfAbsent(bewp1.a, bewo0, bewh0);
                    if(bewh1 == null) {
                        bewq bewq0 = new bewq(s6, bedo0);
                        bfan0 = ((bews)object0).a.contains(bewq0) ? bfar.b(bewk0, bewg.k) : new bfao(bewh0);
                    }
                    else if(ibuq.m(bewh1, bewh0)) {
                        bfan0 = bfam.a;
                    }
                    else {
                        bfan0 = bfar.b(bewk0, bewg.j);
                    }
                }
            }
            else {
                bfan0 = bfar.b(bewk0, bewg0);
            }
            if((bfan0 instanceof bfao)) {
                ((List)object4).add(((bfao)bfan0).a);
            }
            else if((bfan0 instanceof bfan)) {
                ((List)object2).add(bfan0.a);
            }
            else if(!ibuq.m(bfan0, bfam.a)) {
                throw new ibnq();
            }
        }
        return new bewm(ibpo.ar(((Iterable)object4)), ibpo.ar(((Iterable)object2)));
    }

    private static final bfan b(bewk bewk0, bewg bewg0) {
        return new bfan(new bewj(bewk0.a, bewk0.b, bewg0));
    }
}


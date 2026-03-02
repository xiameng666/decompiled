import java.util.ArrayList;
import java.util.List;

final class bdmf extends ibsl implements ibtw {
    int a;
    final bdmg b;

    public bdmf(bdmg bdmg0, ibrl ibrl0) {
        this.b = bdmg0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bdmf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bdmf(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object4;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                bdmg bdmg0 = this.b;
                do {
                    icnl icnl0 = bdmg0.l;
                    Object object3 = icnl0.b();
                    bdtu bdtu0 = (bdtu)object3;
                    bdtu bdtu1 = (bdtu0 instanceof bdtr) ? bdtu0 : null;
                    if(((bdtr)bdtu1) == null) {
                        ((ggtj)bdmg.a.j()).R("Cannot apply update to state %s, because we expected state %s", new ibuk(bdtu0.getClass()).c(), new ibuk(bdtr.class).c());
                    }
                    else {
                        bdtu0 = bdtr.c(((bdtr)bdtu1), null, true, false, false, false, false, 0x7B);
                    }
                }
                while(!icnl0.h(object3, bdtu0));
                this.a = 1;
                object4 = bdjs.a(bdmg0.d, this);
                if(object4 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                object4 = object0;
                break;
            }
            default: {
                object2 = object0;
                goto label_51;
            }
        }
        if((((bdjj)object4) instanceof bdji)) {
            List list0 = ((bdji)(((bdjj)object4))).a;
            List list1 = ((bdji)(((bdjj)object4))).b;
            if(list0.isEmpty() && list1.isEmpty()) {
                bboh bboh0 = bdmg.a;
                ((ggtj)bboh0.h()).x("No credentials imported");
                bdmg bdmg1 = this.b;
                do {
                    icnl icnl1 = bdmg1.l;
                    Object object5 = icnl1.b();
                    bdtu bdtu2 = (bdtu)object5;
                    bdtu bdtu3 = (bdtu2 instanceof bdtr) ? bdtu2 : null;
                    if(((bdtr)bdtu3) == null) {
                        ((ggtj)bboh0.j()).R("Cannot apply update to state %s, because we expected state %s", new ibuk(bdtu2.getClass()).c(), new ibuk(bdtr.class).c());
                    }
                    else {
                        bdtu2 = bdtr.c(((bdtr)bdtu3).a(), null, false, false, true, false, false, 0x6F);
                    }
                }
                while(!icnl1.h(object5, bdtu2));
                return ibom.a;
            }
            bdmg bdmg2 = this.b;
            do {
                icnl icnl2 = bdmg2.l;
                Object object6 = icnl2.b();
                bdtu bdtu4 = (bdtu)object6;
                bdtu bdtu5 = (bdtu4 instanceof bdtr) ? bdtu4 : null;
                if(((bdtr)bdtu5) == null) {
                    ((ggtj)bdmg.a.j()).R("Cannot apply update to state %s, because we expected state %s", new ibuk(bdtu4.getClass()).c(), new ibuk(bdtr.class).c());
                }
                else {
                    bdtu4 = new bdts(((bdtr)bdtu5).a, ((bdtr)bdtu5).b);
                }
            }
            while(!icnl2.h(object6, bdtu4));
            this.a = 2;
            object2 = bdjs.b(bdmg2.d, list0, list1, this);
            if(object2 != object1) {
            label_51:
                if((((bdjp)object2) instanceof bdjn)) {
                    List list2 = ((bdjn)(((bdjp)object2))).a;
                    List list3 = ((bdjn)(((bdjp)object2))).b;
                    List list4 = ((bdjn)(((bdjp)object2))).c;
                    List list5 = ((bdjn)(((bdjp)object2))).d;
                    if(list2.isEmpty() && list3.isEmpty()) {
                        bboh bboh1 = bdmg.a;
                        ((ggtj)bboh1.h()).x("Only conflicting credentials imported");
                        bdmg bdmg3 = this.b;
                        do {
                            icnl icnl3 = bdmg3.l;
                            Object object7 = icnl3.b();
                            bdtu bdtu6 = (bdtu)object7;
                            bdtu bdtu7 = (bdtu6 instanceof bdts) ? bdtu6 : null;
                            if(((bdts)bdtu7) == null) {
                                ((ggtj)bboh1.j()).R("Cannot apply update to state %s, because we expected state %s", new ibuk(bdtu6.getClass()).c(), new ibuk(bdts.class).c());
                            }
                            else {
                                bdtu6 = bdtr.c(((bdts)bdtu7).a(), null, false, false, false, true, false, 0x5F);
                            }
                        }
                        while(!icnl3.h(object7, bdtu6));
                        return ibom.a;
                    }
                    bdmg bdmg4 = this.b;
                    do {
                        icnl icnl4 = bdmg4.l;
                        Object object8 = icnl4.b();
                        bdtu bdtu8 = (bdtu)object8;
                        if(((bdts)((bdtu8 instanceof bdts) ? bdtu8 : null)) == null) {
                            ((ggtj)bdmg.a.j()).R("Cannot apply update to state %s, because we expected state %s", new ibuk(bdtu8.getClass()).c(), new ibuk(bdts.class).c());
                        }
                        else {
                            ArrayList arrayList0 = new ArrayList(ibpo.q(list2, 10));
                            for(Object object9: list2) {
                                arrayList0.add(bdmd.b(((bxwt)object9)));
                            }
                            ArrayList arrayList1 = new ArrayList(ibpo.q(list3, 10));
                            for(Object object10: list3) {
                                arrayList1.add(bdmd.a(((bxws)object10)));
                            }
                            ArrayList arrayList2 = new ArrayList(ibpo.q(list4, 10));
                            for(Object object11: list4) {
                                arrayList2.add(bdmd.b(((bxwt)object11)));
                            }
                            ArrayList arrayList3 = new ArrayList(ibpo.q(list5, 10));
                            for(Object object12: list5) {
                                arrayList3.add(bdmd.a(((bxws)object12)));
                            }
                            bdtu8 = new bdtt(arrayList0, arrayList1, ibpo.ak(arrayList2, arrayList3));
                        }
                    }
                    while(!icnl4.h(object8, bdtu8));
                    return ibom.a;
                }
                if((((bdjp)object2) instanceof bdjo)) {
                    ((ggtj)bdmg.a.h()).x("User interaction required");
                    this.b.g.l(((bdjo)(((bdjp)object2))).a);
                    return ibom.a;
                }
                if(!(((bdjp)object2) instanceof bdjm)) {
                    throw new ibnq();
                }
                bboh bboh2 = bdmg.a;
                ((ggtj)bboh2.j()).B("Error storing credentials: %s", ((bdjp)object2));
                bdmg bdmg5 = this.b;
                do {
                    icnl icnl5 = bdmg5.l;
                    Object object13 = icnl5.b();
                    bdtu bdtu9 = (bdtu)object13;
                    bdtu bdtu10 = (bdtu9 instanceof bdts) ? bdtu9 : null;
                    if(((bdts)bdtu10) == null) {
                        ((ggtj)bboh2.j()).R("Cannot apply update to state %s, because we expected state %s", new ibuk(bdtu9.getClass()).c(), new ibuk(bdts.class).c());
                    }
                    else {
                        bdtu9 = ((bdts)bdtu10).a().b();
                    }
                }
                while(!icnl5.h(object13, bdtu9));
                return ibom.a;
            }
            return object1;
        }
        if((((bdjj)object4) instanceof bdjh)) {
            bboh bboh3 = bdmg.a;
            ((ggtj)bboh3.j()).x("No credential provider installed");
            bdmg bdmg6 = this.b;
            do {
                icnl icnl6 = bdmg6.l;
                Object object14 = icnl6.b();
                bdtu bdtu11 = (bdtu)object14;
                bdtu bdtu12 = (bdtu11 instanceof bdtr) ? bdtu11 : null;
                if(((bdtr)bdtu12) == null) {
                    ((ggtj)bboh3.j()).R("Cannot apply update to state %s, because we expected state %s", new ibuk(bdtu11.getClass()).c(), new ibuk(bdtr.class).c());
                }
                else {
                    bdtu11 = bdtr.c(((bdtr)bdtu12).a(), null, false, true, false, false, false, 0x77);
                }
            }
            while(!icnl6.h(object14, bdtu11));
            return ibom.a;
        }
        if(!(((bdjj)object4) instanceof bdjg)) {
            throw new ibnq();
        }
        bboh bboh4 = bdmg.a;
        ((ggtj)bboh4.j()).B("Error importing credentials: %s", ((bdjj)object4));
        bdmg bdmg7 = this.b;
        do {
            icnl icnl7 = bdmg7.l;
            Object object15 = icnl7.b();
            bdtu bdtu13 = (bdtu)object15;
            bdtu bdtu14 = (bdtu13 instanceof bdtr) ? bdtu13 : null;
            if(((bdtr)bdtu14) == null) {
                ((ggtj)bboh4.j()).R("Cannot apply update to state %s, because we expected state %s", new ibuk(bdtu13.getClass()).c(), new ibuk(bdtr.class).c());
            }
            else {
                bdtu13 = ((bdtr)bdtu14).a().b();
            }
        }
        while(!icnl7.h(object15, bdtu13));
        return ibom.a;
    }
}


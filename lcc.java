import java.util.List;

public final class lcc implements lap {
    public final led a;
    public final icck b;
    public final icig c;
    public final lcd d;
    public final ibnn e;
    public final ldx f;
    public final ldq g;
    private final lag h;
    private int i;
    private iced j;
    private final ibnn k;
    private final icta l;

    public lcc(led led0, List list0, lag lag0, icck icck0) {
        ibuq.f(list0, "initTasksList");
        ibuq.f(icck0, "scope");
        super();
        this.a = led0;
        this.h = lag0;
        this.b = icck0;
        this.c = new icht(new lbg(this, null));
        this.l = new icta();
        this.d = new lcd();
        this.g = new ldq(this, list0);
        this.e = new ibnz(new lar(this));
        this.k = new ibnz(new las(this));
        this.f = new ldx(icck0, new lat(this), new lau(), new lbz(this, null));
    }

    @Override  // lap
    public final Object a(ibtw ibtw0, ibrl ibrl0) {
        lei lei0 = (lei)ibrl0.u().get(leh.a);
        if(lei0 != null) {
            lei0.a(this);
        }
        return icbd.a(new lei(lei0, this), new lby(this, ibtw0, null), ibrl0);
    }

    @Override  // lap
    public final icig b() {
        return this.c;
    }

    public final lct c() {
        return (lct)this.k.a();
    }

    public final Object d(ibrl ibrl0) {
        icta icta1;
        lbh lbh0;
        if((ibrl0 instanceof lbh)) {
            lbh0 = (lbh)ibrl0;
            int v = lbh0.c;
            if((v & 0x80000000) == 0) {
                lbh0 = new lbh(this, ibrl0);
            }
            else {
                lbh0.c = v - 0x80000000;
            }
        }
        else {
            lbh0 = new lbh(this, ibrl0);
        }
        Object object0 = lbh0.a;
        Object object1 = ibrx.a;
        switch(lbh0.c) {
            case 0: {
                ibnx.b(object0);
                icta icta0 = this.l;
                lbh0.d = icta0;
                lbh0.c = 1;
                if(icta0.b(lbh0) != object1) {
                    icta1 = icta0;
                    break;
                }
                return object1;
            }
            case 1: {
                icta1 = lbh0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            int v2 = this.i - 1;
            this.i = v2;
            if(v2 == 0) {
                iced iced0 = this.j;
                if(iced0 != null) {
                    iceb.a(iced0);
                }
                this.j = null;
            }
        }
        finally {
            icta1.d();
        }
        return ibom.a;
    }

    public final Object e(ibrl ibrl0) {
        icta icta1;
        lbl lbl0;
        if((ibrl0 instanceof lbl)) {
            lbl0 = (lbl)ibrl0;
            int v = lbl0.c;
            if((v & 0x80000000) == 0) {
                lbl0 = new lbl(this, ibrl0);
            }
            else {
                lbl0.c = v - 0x80000000;
            }
        }
        else {
            lbl0 = new lbl(this, ibrl0);
        }
        Object object0 = lbl0.a;
        Object object1 = ibrx.a;
        switch(lbl0.c) {
            case 0: {
                ibnx.b(object0);
                icta icta0 = this.l;
                lbl0.d = icta0;
                lbl0.c = 1;
                if(icta0.b(lbl0) != object1) {
                    icta1 = icta0;
                    break;
                }
                return object1;
            }
            case 1: {
                icta1 = lbl0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            int v2 = this.i + 1;
            this.i = v2;
            if(v2 == 1) {
                lbn lbn0 = new lbn(this, null);
                this.j = icbb.b(this.b, null, null, lbn0, 3);
            }
        }
        finally {
            icta1.d();
        }
        return ibom.a;
    }

    public final Object f(ibrl ibrl0) {
        Throwable throwable1;
        int v2;
        lbo lbo0;
        if((ibrl0 instanceof lbo)) {
            lbo0 = (lbo)ibrl0;
            int v = lbo0.d;
            if((v & 0x80000000) == 0) {
                lbo0 = new lbo(this, ibrl0);
            }
            else {
                lbo0.d = v - 0x80000000;
            }
        }
        else {
            lbo0 = new lbo(this, ibrl0);
        }
        Object object0 = lbo0.b;
        Object object1 = ibrx.a;
        switch(lbo0.d) {
            case 0: {
                ibnx.b(object0);
                lct lct0 = this.c();
                lbo0.d = 1;
                object0 = lct0.a(lbo0);
                if(object0 != object1) {
                    goto label_20;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
            label_20:
                int v1 = ((Number)object0).intValue();
                try {
                    lbo0.a = v1;
                    lbo0.d = 2;
                    return this.g.a(lbo0) != object1 ? ibom.a : object1;
                }
                catch(Throwable throwable0) {
                    v2 = v1;
                    throwable1 = throwable0;
                    goto label_35;
                }
                return ibom.a;
            }
            case 2: {
                try {
                    v2 = lbo0.a;
                    ibnx.b(object0);
                    return ibom.a;
                }
                catch(Throwable throwable1) {
                }
            label_35:
                ldo ldo0 = new ldo(throwable1, v2);
                this.d.b(ldo0);
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object g(boolean z, ibrl ibrl0) {
        Object object2;
        lbp lbp0;
        if((ibrl0 instanceof lbp)) {
            lbp0 = (lbp)ibrl0;
            int v = lbp0.e;
            if((v & 0x80000000) == 0) {
                lbp0 = new lbp(this, ibrl0);
            }
            else {
                lbp0.e = v - 0x80000000;
            }
        }
        else {
            lbp0 = new lbp(this, ibrl0);
        }
        Object object0 = lbp0.c;
        Object object1 = ibrx.a;
        switch(lbp0.e) {
            case 0: {
                ibnx.b(object0);
                object2 = this.d.a();
                if((object2 instanceof lef)) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                lct lct0 = this.c();
                lbp0.b = object2;
                lbp0.a = z;
                lbp0.e = 1;
                object0 = lct0.a(lbp0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_27;
            }
            case 1: {
                z = lbp0.a;
                object2 = lbp0.b;
                ibnx.b(object0);
            label_27:
                int v1 = ((Number)object0).intValue();
                int v2 = (object2 instanceof lah) ? ((lah)object2).c : -1;
                if((object2 instanceof lah) && v1 == v2) {
                    return object2;
                }
                if(z) {
                    lct lct1 = this.c();
                    lbq lbq0 = new lbq(this, null);
                    lbp0.b = null;
                    lbp0.e = 2;
                    object0 = lct1.c(lbq0, lbp0);
                    if(object0 == object1) {
                        return object1;
                    }
                }
                else {
                    lct lct2 = this.c();
                    lbr lbr0 = new lbr(this, v2, null);
                    lbp0.b = null;
                    lbp0.e = 3;
                    object0 = lct2.d(lbr0, lbp0);
                    if(object0 == object1) {
                        return object1;
                    }
                }
                goto label_49;
            }
            case 2: {
                ibnx.b(object0);
                goto label_49;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object0);
    label_49:
        Object object3 = (lec)((ibns)object0).a;
        if(((Boolean)((ibns)object0).b).booleanValue()) {
            this.d.b(((lec)object3));
        }
        return object3;
    }

    public final Object h(ibrl ibrl0) {
        return this.l().b(new lee(null), ibrl0);
    }

    public final Object i(boolean z, ibrl ibrl0) {
        ibvb ibvb1;
        laf laf3;
        ibvb ibvb0;
        ibvd ibvd1;
        boolean z2;
        laf laf2;
        ibvd ibvd0;
        lbs lbs0;
        if((ibrl0 instanceof lbs)) {
            lbs0 = (lbs)ibrl0;
            int v = lbs0.g;
            if((v & 0x80000000) == 0) {
                lbs0 = new lbs(this, ibrl0);
            }
            else {
                lbs0.g = v - 0x80000000;
            }
        }
        else {
            lbs0 = new lbs(this, ibrl0);
        }
        Object object0 = lbs0.e;
        Object object1 = ibrx.a;
        int v1 = 0;
        switch(lbs0.g) {
            case 0: {
                ibnx.b(object0);
                try {
                    if(z) {
                        lbs0.a = true;
                        lbs0.g = 1;
                        object0 = this.h(lbs0);
                        if(object0 != object1) {
                            goto label_29;
                        }
                    }
                    else {
                        lct lct0 = this.c();
                        lbs0.a = false;
                        lbs0.g = 3;
                        object0 = lct0.a(lbs0);
                        if(object0 != object1) {
                            goto label_56;
                        label_27:
                            z = lbs0.a;
                            ibnx.b(object0);
                        label_29:
                            int v2 = object0 == null ? 0 : object0.hashCode();
                            lct lct1 = this.c();
                            lbs0.b = object0;
                            lbs0.a = z;
                            lbs0.d = v2;
                            lbs0.g = 2;
                            Object object2 = lct1.a(lbs0);
                            if(object2 != object1) {
                                boolean z1 = z;
                                int v3 = v2;
                                Object object3 = object0;
                                object0 = object2;
                                return new lah(object3, v3, ((Number)object0).intValue());
                                try {
                                label_42:
                                    v3 = lbs0.d;
                                    z1 = lbs0.a;
                                    object3 = lbs0.b;
                                    ibnx.b(object0);
                                }
                                catch(laf laf0) {
                                    z = z1;
                                    goto label_68;
                                }
                                try {
                                    return new lah(object3, v3, ((Number)object0).intValue());
                                }
                                catch(laf laf1) {
                                    laf0 = laf1;
                                }
                                z = z1;
                                goto label_68;
                            label_54:
                                z = lbs0.a;
                                ibnx.b(object0);
                            label_56:
                                int v4 = ((Number)object0).intValue();
                                lct lct2 = this.c();
                                lbt lbt0 = new lbt(this, v4, null);
                                lbs0.a = z;
                                lbs0.g = 4;
                                object0 = lct2.d(lbt0, lbs0);
                                if(object0 != object1) {
                                    return (lah)object0;
                                label_64:
                                    z = lbs0.a;
                                    ibnx.b(object0);
                                    return (lah)object0;
                                }
                            }
                        }
                    }
                    return object1;
                }
                catch(laf laf0) {
                    goto label_68;
                }
            }
            case 1: {
                goto label_27;
            }
            case 2: {
                goto label_42;
            }
            case 3: {
                goto label_54;
            }
            case 4: {
                goto label_64;
            label_68:
                ibvd0 = new ibvd();
                lbs0.b = laf0;
                lbs0.h = ibvd0;
                lbs0.c = ibvd0;
                lbs0.a = z;
                lbs0.g = 5;
                Object object4 = this.h.a(laf0);
                if(object4 != object1) {
                    laf2 = laf0;
                    z2 = z;
                    ibvd1 = ibvd0;
                    ibvd0.a = object4;
                    ibvb0 = new ibvb();
                    goto label_91;
                }
                return object1;
            }
            case 5: {
                boolean z3 = lbs0.a;
                ibvd0 = (ibvd)lbs0.c;
                ibvd ibvd2 = lbs0.h;
                laf2 = (laf)lbs0.b;
                ibnx.b(object0);
                z2 = z3;
                ibvd1 = ibvd2;
                ibvd0.a = object0;
                ibvb0 = new ibvb();
                try {
                label_91:
                    lbu lbu0 = new lbu(ibvd1, this, ibvb0, null);
                    lbs0.b = laf2;
                    lbs0.h = ibvd1;
                    lbs0.c = ibvb0;
                    lbs0.g = 6;
                    if((z2 ? lbu0.a(lbs0) : this.c().c(new lbi(lbu0, null), lbs0)) != object1) {
                        ibvb1 = ibvb0;
                        break;
                    }
                    return object1;
                }
                catch(Throwable throwable0) {
                    laf3 = laf2;
                    ibnj.b(laf3, throwable0);
                    throw laf3;
                }
                ibvb1 = ibvb0;
                break;
            }
            case 6: {
                ibvb1 = (ibvb)lbs0.c;
                ibvd1 = lbs0.h;
                laf3 = (laf)lbs0.b;
                try {
                    ibnx.b(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
                ibnj.b(laf3, throwable0);
                throw laf3;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object5 = ibvd1.a;
        if(object5 != null) {
            v1 = object5.hashCode();
        }
        return new lah(object5, v1, ibvb1.a);
    }

    public final Object j(ibtw ibtw0, ibrt ibrt0, ibrl ibrl0) {
        return this.c().c(new lbx(this, ibrt0, ibtw0, null), ibrl0);
    }

    public final Object k(Object object0, boolean z, ibrl ibrl0) {
        lca lca0;
        if((ibrl0 instanceof lca)) {
            lca0 = (lca)ibrl0;
            int v = lca0.c;
            if((v & 0x80000000) == 0) {
                lca0 = new lca(this, ibrl0);
            }
            else {
                lca0.c = v - 0x80000000;
            }
        }
        else {
            lca0 = new lca(this, ibrl0);
        }
        Object object1 = lca0.a;
        Object object2 = ibrx.a;
        switch(lca0.c) {
            case 0: {
                ibnx.b(object1);
                ibvb ibvb0 = new ibvb();
                lco lco0 = this.l();
                lcb lcb0 = new lcb(ibvb0, this, object0, z, null);
                lca0.d = ibvb0;
                lca0.c = 1;
                return lco0.c(lcb0, lca0) != object2 ? new Integer(ibvb0.a) : object2;
            }
            case 1: {
                ibvb ibvb1 = lca0.d;
                ibnx.b(object1);
                return new Integer(ibvb1.a);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final lco l() {
        return (lco)this.e.a();
    }

    public final Object m(lcu lcu0, ibrl ibrl0) {
        icbr icbr1;
        Throwable throwable1;
        Object object2;
        lbj lbj0;
        if((ibrl0 instanceof lbj)) {
            lbj0 = (lbj)ibrl0;
            int v = lbj0.c;
            if((v & 0x80000000) == 0) {
                lbj0 = new lbj(this, ibrl0);
            }
            else {
                lbj0.c = v - 0x80000000;
            }
        }
        else {
            lbj0 = new lbj(this, ibrl0);
        }
        Object object0 = lbj0.a;
        Object object1 = ibrx.a;
        switch(lbj0.c) {
            case 0: {
                ibnx.b(object0);
                icbr icbr0 = lcu0.d;
                try {
                    ibrt ibrt0 = lbj0.u();
                    ibrt ibrt1 = lcu0.c.plus(ibrt0);
                    lbk lbk0 = new lbk(this, lcu0, null);
                    lbj0.d = icbr0;
                    lbj0.c = 1;
                    object2 = icbd.a(ibrt1, lbk0, lbj0);
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    icbr1 = icbr0;
                    object0 = ibnx.a(throwable1);
                    break;
                }
                if(object2 != object1) {
                    object0 = object2;
                    icbr1 = icbr0;
                    break;
                }
                return object1;
            }
            case 1: {
                try {
                    icbr1 = lbj0.d;
                    ibnx.b(object0);
                    break;
                }
                catch(Throwable throwable1) {
                }
                object0 = ibnx.a(throwable1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        icbs.b(icbr1, object0);
        return ibom.a;
    }
}


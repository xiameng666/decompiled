import android.accounts.Account;
import android.content.Context;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import j..util.DesugarCollections;
import java.util.List;

public final class dcta {
    private final Context a;
    private final Account b;
    private final gzdm c;

    @AssistedInject
    public dcta(iakr iakr0, Context context0, @Assisted Account account0) {
        ibuq.f(account0, "account");
        super();
        this.a = context0;
        this.b = account0;
        gzdm gzdm0 = new gzdm(iakr0, iakq.a);
        String s = hvqs.bd();
        long v = hvqs.at();
        gphs gphs0 = new gphs(account0.name, "google");
        this.c = (gzdm)((gzdm)gzdm0.q(gpho.a, s + ":" + v)).q(gphs.a, gphs0);
    }

    public final Object a(dcst dcst0, ibrl ibrl0) {
        dcsu dcsu0;
        if((ibrl0 instanceof dcsu)) {
            dcsu0 = (dcsu)ibrl0;
            int v = dcsu0.c;
            if((v & 0x80000000) == 0) {
                dcsu0 = new dcsu(this, ibrl0);
            }
            else {
                dcsu0.c = v - 0x80000000;
            }
        }
        else {
            dcsu0 = new dcsu(this, ibrl0);
        }
        Object object0 = dcsu0.a;
        Object object1 = ibrx.a;
        switch(dcsu0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    gzdm gzdm0 = (gzdm)this.c.q(cmlp.a, ckkc.b);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzbj.a).v_newBuilder();
                    ibuq.f(hftp0, "builder");
                    String s = dcst0.a;
                    ibuq.f(s, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gzbj gzbj0 = (gzbj)hftp0.b_message;
                    s.getClass();
                    gzbj0.b = s;
                    ProtoLiteMessage hftv0 = hftp0.N_build();
                    ibuq.e(hftv0, "build(...)");
                    dcsu0.d = dcst0;
                    dcsu0.c = 1;
                    object0 = gzdm0.a(((gzbj)hftv0), new iaof_metadata(), dcsu0);
                    if(object0 == object1) {
                        return object1;
                    label_31:
                        dcst0 = dcsu0.d;
                        ibnx.b(object0);
                    }
                    dcvz.a.b().h("Successfully cancelled cloud sharing session [%s]", ((gzbk)object0).b);
                    return Boolean.valueOf(true);
                }
                catch(iapl iapl0) {
                    break;
                }
            }
            case 1: {
                goto label_31;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        dcvz.a.c().f(iapl0).h("Failed to cancel sharing session [%s]", dcst0);
        return Boolean.valueOf(false);
    }

    public final Object b(gzbx gzbx0, ibrl ibrl0) {
        dcsv dcsv0;
        if((ibrl0 instanceof dcsv)) {
            dcsv0 = (dcsv)ibrl0;
            int v = dcsv0.c;
            if((v & 0x80000000) == 0) {
                dcsv0 = new dcsv(this, ibrl0);
            }
            else {
                dcsv0.c = v - 0x80000000;
            }
        }
        else {
            dcsv0 = new dcsv(this, ibrl0);
        }
        Object object0 = dcsv0.a;
        Object object1 = ibrx.a;
        switch(dcsv0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    gzdm gzdm0 = (gzdm)this.c.q(cmlp.a, ckkd.b);
                    dcsv0.d = gzbx0;
                    dcsv0.c = 1;
                    object0 = gzdm0.b(gzbx0, new iaof_metadata(), dcsv0);
                    if(object0 == object1) {
                        return object1;
                    label_20:
                        gzbx0 = dcsv0.d;
                        ibnx.b(object0);
                    }
                    cunf cunf0 = dcvz.a.b();
                    String s = (gzbx0.c == null ? gzbt.a : gzbx0.c).b;
                    gzbt gzbt0 = ((gzby)object0).b;
                    if(gzbt0 == null) {
                        gzbt0 = gzbt.a;
                    }
                    cunf0.i("Create cloud sharing id=[%s] status: [%s]", s, (gzbs.b(gzbt0.d) == null ? gzbs.d : gzbs.b(gzbt0.d)));
                    gzbt gzbt1 = ((gzby)object0).b;
                    if(gzbt1 == null) {
                        gzbt1 = gzbt.a;
                    }
                    return (gzbs.b(gzbt1.d) == null ? gzbs.d : gzbs.b(gzbt1.d)) == gzbs.b ? dctf.a : dctf.g;
                }
                catch(iapl iapl0) {
                    break;
                }
            }
            case 1: {
                goto label_20;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        dcvz.a.c().f(iapl0).h("Failed to create cloud sharing session [%s]", (gzbx0.c == null ? gzbt.a : gzbx0.c).b);
        switch(iapl0.a.t.ordinal()) {
            case 3: {
                return dctf.f;
            }
            case 4: {
                return dctf.e;
            }
            case 6: {
                return dctf.c;
            }
            case 7: {
                return dctf.b;
            }
            case 8: {
                return dctf.i;
            }
            case 14: {
                return cuuj.a(this.a) ? dctf.g : dctf.e;
            }
            case 16: {
                return dctf.b;
            }
            default: {
                return dctf.g;
            }
        }
    }

    public final Object c(dcst dcst0, ibrl ibrl0) {
        dcsw dcsw0;
        if((ibrl0 instanceof dcsw)) {
            dcsw0 = (dcsw)ibrl0;
            int v = dcsw0.c;
            if((v & 0x80000000) == 0) {
                dcsw0 = new dcsw(this, ibrl0);
            }
            else {
                dcsw0.c = v - 0x80000000;
            }
        }
        else {
            dcsw0 = new dcsw(this, ibrl0);
        }
        Object object0 = dcsw0.a;
        Object object1 = ibrx.a;
        switch(dcsw0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    gzdm gzdm0 = (gzdm)this.c.q(cmlp.a, ckke.b);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzbz.a).v_newBuilder();
                    ibuq.f(hftp0, "builder");
                    String s = dcst0.a;
                    ibuq.f(s, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gzbz gzbz0 = (gzbz)hftp0.b_message;
                    s.getClass();
                    gzbz0.b = s;
                    ProtoLiteMessage hftv0 = hftp0.N_build();
                    ibuq.e(hftv0, "build(...)");
                    dcsw0.d = dcst0;
                    dcsw0.c = 1;
                    object0 = gzdm0.c(((gzbz)hftv0), new iaof_metadata(), dcsw0);
                    if(object0 == object1) {
                        return object1;
                    label_31:
                        dcst0 = dcsw0.d;
                        ibnx.b(object0);
                    }
                    cunf cunf0 = dcvz.a.b();
                    gzbt gzbt0 = ((gzca)object0).b;
                    if(gzbt0 == null) {
                        gzbt0 = gzbt.a;
                    }
                    cunf0.h("Successfully fetched receivers for cloud sharing session [%s]", gzbt0.b);
                    gzbt gzbt1 = ((gzca)object0).b;
                    if(gzbt1 == null) {
                        gzbt1 = gzbt.a;
                    }
                    Object object2 = gzbt1.f;
                    ibuq.e(object2, "getReceiverMetadataList(...)");
                    return object2;
                }
                catch(iapl iapl0) {
                    break;
                }
            }
            case 1: {
                goto label_31;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        dcvz.a.c().f(iapl0).h("Failed to fetch receivers for cloud sharing session [%s]", dcst0);
        throw iapl0;
    }

    public final Object d(dcsl dcsl0, ibrl ibrl0) {
        dcsx dcsx0;
        if((ibrl0 instanceof dcsx)) {
            dcsx0 = (dcsx)ibrl0;
            int v = dcsx0.c;
            if((v & 0x80000000) == 0) {
                dcsx0 = new dcsx(this, ibrl0);
            }
            else {
                dcsx0.c = v - 0x80000000;
            }
        }
        else {
            dcsx0 = new dcsx(this, ibrl0);
        }
        Object object0 = dcsx0.a;
        Object object1 = ibrx.a;
        switch(dcsx0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    gzdm gzdm0 = (gzdm)this.c.q(cmlp.a, ckkf.b);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzdn.a).v_newBuilder();
                    ibuq.f(hftp0, "builder");
                    String s = dcsl0.b;
                    ibuq.f(s, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gzdn gzdn0 = (gzdn)hftp0.b_message;
                    s.getClass();
                    gzdn0.b = s;
                    ProtoLiteMessage hftv0 = hftp0.N_build();
                    ibuq.e(hftv0, "build(...)");
                    dcsx0.d = dcsl0;
                    dcsx0.c = 1;
                    object0 = gzdm0.e(((gzdn)hftv0), new iaof_metadata(), dcsx0);
                    if(object0 == object1) {
                        return object1;
                    label_31:
                        dcsl0 = dcsx0.d;
                        ibnx.b(object0);
                    }
                    gzdo gzdo0 = (gzdo)object0;
                    dcvz.a.b().h("Successfully removed receiver [%s]", dcsl0);
                    return Boolean.valueOf(true);
                }
                catch(iapl iapl0) {
                    break;
                }
            }
            case 1: {
                goto label_31;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        dcvz.a.c().f(iapl0).h("Failed to remove receiver [%s]", dcsl0);
        return Boolean.valueOf(false);
    }

    public final Object e(dcst dcst0, gzdw gzdw0, ibrl ibrl0) {
        dcsy dcsy0;
        if((ibrl0 instanceof dcsy)) {
            dcsy0 = (dcsy)ibrl0;
            int v = dcsy0.c;
            if((v & 0x80000000) == 0) {
                dcsy0 = new dcsy(this, ibrl0);
            }
            else {
                dcsy0.c = v - 0x80000000;
            }
        }
        else {
            dcsy0 = new dcsy(this, ibrl0);
        }
        Object object0 = dcsy0.a;
        Object object1 = ibrx.a;
        switch(dcsy0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    gzdm gzdm0 = (gzdm)this.c.q(cmlp.a, ckkg.b);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzdx.a).v_newBuilder();
                    ibuq.f(hftp0, "builder");
                    String s = dcst0.a;
                    ibuq.f(s, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gzdx gzdx0 = (gzdx)hftp0.b_message;
                    s.getClass();
                    gzdx0.b = s;
                    ibuq.f(gzdw0, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gzdx gzdx1 = (gzdx)hftp0.b_message;
                    gzdx1.c = gzdw0.a();
                    ProtoLiteMessage hftv0 = hftp0.N_build();
                    ibuq.e(hftv0, "build(...)");
                    dcsy0.d = dcst0;
                    dcsy0.e = gzdw0;
                    dcsy0.c = 1;
                    object0 = gzdm0.f(((gzdx)hftv0), new iaof_metadata(), dcsy0);
                    if(object0 == object1) {
                        return object1;
                    label_37:
                        gzdw0 = dcsy0.e;
                        dcst0 = dcsy0.d;
                        ibnx.b(object0);
                    }
                    gzdy gzdy0 = (gzdy)object0;
                    switch(gzdw0.ordinal()) {
                        case 1: {
                            dcvz.a.b().h("Successfully stop accepting new receiver for cloud sharing session [%s]", dcst0);
                            return Boolean.valueOf(true);
                        }
                        case 2: {
                            dcvz.a.b().h("Successfully extended receiver registration time cloud sharing session [%s]", dcst0);
                            return Boolean.valueOf(true);
                        }
                    }
                    return Boolean.valueOf(true);
                }
                catch(iapl iapl0) {
                    break;
                }
            }
            case 1: {
                goto label_37;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        dcvz.a.c().f(iapl0).i("Failed to update cloud sharing session [%s], update state: %s", dcst0, gzdw0.name());
        return Boolean.valueOf(false);
    }

    public final Object f(dcst dcst0, String s, String s1, ibrl ibrl0) {
        dcsz dcsz0;
        if((ibrl0 instanceof dcsz)) {
            dcsz0 = (dcsz)ibrl0;
            int v = dcsz0.c;
            if((v & 0x80000000) == 0) {
                dcsz0 = new dcsz(this, ibrl0);
            }
            else {
                dcsz0.c = v - 0x80000000;
            }
        }
        else {
            dcsz0 = new dcsz(this, ibrl0);
        }
        Object object0 = dcsz0.a;
        Object object1 = ibrx.a;
        switch(dcsz0.c) {
            case 0: {
                ibnx.b(object0);
                gzdm gzdm0 = (gzdm)this.c.q(cmlp.a, ckkh.b);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzdz.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                String s2 = dcst0.a;
                ibuq.f(s2, "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzdz gzdz0 = (gzdz)hftp0.b_message;
                s2.getClass();
                gzdz0.c = s2;
                List list0 = DesugarCollections.unmodifiableList(gzdz0.b);
                ibuq.e(list0, "getFileList(...)");
                new hfxu(list0);
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzbq.a).v_newBuilder();
                ibuq.f(hftp1, "builder");
                ibuq.f(s, "value");
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gzbq gzbq0 = (gzbq)hftp1.b_message;
                s.getClass();
                gzbq0.b = s;
                String s3 = ibzk.u(s1, "/blobstore/prod");
                ibuq.f(s3, "value");
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gzbq gzbq1 = (gzbq)hftp1.b_message;
                s3.getClass();
                gzbq1.c = s3;
                ProtoLiteMessage hftv0 = hftp1.N_build();
                ibuq.e(hftv0, "build(...)");
                ibuq.f(((gzbq)hftv0), "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzdz gzdz1 = (gzdz)hftp0.b_message;
                ((gzbq)hftv0).getClass();
                hfuo hfuo0 = gzdz1.b;
                if(!hfuo0.c()) {
                    gzdz1.b = ProtoLiteMessage.E(hfuo0);
                }
                gzdz1.b.add(((gzbq)hftv0));
                ProtoLiteMessage hftv1 = hftp0.N_build();
                ibuq.e(hftv1, "build(...)");
                gzdz gzdz2 = (gzdz)hftv1;
                try {
                    dcsz0.d = dcst0;
                    dcsz0.c = 1;
                    object0 = gzdm0.g(gzdz2, new iaof_metadata(), dcsz0);
                    if(object0 == object1) {
                        return object1;
                    label_61:
                        dcst0 = dcsz0.d;
                        ibnx.b(object0);
                    }
                    gzea gzea0 = (gzea)object0;
                    dcvz.a.b().h("Update cloud sharing uploads id=[%s]", dcst0.a);
                    return Boolean.valueOf(true);
                }
                catch(iapl iapl0) {
                    break;
                }
            }
            case 1: {
                goto label_61;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        dcvz.a.c().f(iapl0).h("Failed to update cloud sharing upload id=[%s]", dcst0.a);
        return Boolean.valueOf(false);
    }
}


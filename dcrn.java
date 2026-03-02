import android.accounts.Account;
import com.google.android.gms.nearby.sharing.FileAttachment;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import dagger.internal.InstanceFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dcrn {
    public final dcst a;
    public final List b;
    public final icnj c;
    public final dcta d;
    public final dcsh e;
    public iced f;
    public final icnl g;
    private final icck h;
    private final Account i;
    private final dcsr j;
    private final iced k;
    private final dcsj l;

    @AssistedInject
    public dcrn(dctc dctc0, dcsj dcsj0, icck icck0, @Assisted Account account0, @Assisted dcst dcst0, @Assisted List list0, @Assisted byte[] arr_b) {
        ibuq.f(dctc0, "rpcClientFactory");
        ibuq.f(dcsj0, "fileUploadManagerFactory");
        ibuq.f(account0, "account");
        ibuq.f(list0, "attachments");
        ibuq.f(arr_b, "sharedKey");
        super();
        this.l = dcsj0;
        this.h = icck0;
        this.i = account0;
        this.a = dcst0;
        this.j = new dcsr(arr_b);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if((((dcsk)object0).b instanceof FileAttachment)) {
                arrayList0.add(object0);
            }
        }
        this.b = arrayList0;
        dcrs dcrs0 = arrayList0.isEmpty() ? dcrs.a : dcrv.a;
        icnl icnl0 = icnm.a(new dcrq(dcrs0, ibps.a, true));
        this.g = icnl0;
        this.c = new icmp(icnl0);
        this.d = dctc0.a(this.i);
        this.e = new dcsh(((dcts)((InstanceFactory)this.l.a.a).a), this.i, this.j, this.a);
        dcrg dcrg0 = new dcrg(this, null);
        this.k = icbb.b(this.h, null, null, dcrg0, 3);
    }

    public final Object a(ibrl ibrl0) {
        Object object2;
        dcrq dcrq0;
        icnl icnl0;
        dcrf dcrf0;
        if((ibrl0 instanceof dcrf)) {
            dcrf0 = (dcrf)ibrl0;
            int v = dcrf0.d;
            if((v & 0x80000000) == 0) {
                dcrf0 = new dcrf(this, ibrl0);
            }
            else {
                dcrf0.d = v - 0x80000000;
            }
        }
        else {
            dcrf0 = new dcrf(this, ibrl0);
        }
        Object object0 = dcrf0.b;
        Object object1 = ibrx.a;
        switch(dcrf0.d) {
            case 0: {
                ibnx.b(object0);
                icnl0 = this.g;
                goto label_24;
            }
            case 1: {
                dcrq0 = dcrf0.e;
                object2 = dcrf0.a;
                icnl0 = dcrf0.f;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            if(((Boolean)object0).booleanValue()) {
                dcrq0 = dcrq.a(dcrq0, dcrr.a, null, 6);
            }
            if(icnl0.h(object2, dcrq0)) {
                return ibom.a;
            }
        label_24:
            object2 = icnl0.b();
            dcrq0 = (dcrq)object2;
            if(!(dcrq0.a instanceof dcru)) {
                break;
            }
            iced iced0 = this.f;
            if(iced0 != null) {
                iceb.a(iced0);
            }
            dcrf0.f = icnl0;
            dcrf0.a = object2;
            dcrf0.e = dcrq0;
            dcrf0.d = 1;
            object0 = this.d.a(this.a, dcrf0);
            if(object0 != object1) {
                continue;
            }
            return object1;
        }
        throw new IllegalStateException("Upload is not in progress");
    }

    public final Object b(dcsl dcsl0, ibrl ibrl0) {
        dcrh dcrh0;
        if((ibrl0 instanceof dcrh)) {
            dcrh0 = (dcrh)ibrl0;
            int v = dcrh0.c;
            if((v & 0x80000000) == 0) {
                dcrh0 = new dcrh(this, ibrl0);
            }
            else {
                dcrh0.c = v - 0x80000000;
            }
        }
        else {
            dcrh0 = new dcrh(this, ibrl0);
        }
        Object object0 = dcrh0.a;
        Object object1 = ibrx.a;
        switch(dcrh0.c) {
            case 0: {
                ibnx.b(object0);
                dcrh0.d = dcsl0;
                dcrh0.c = 1;
                object0 = this.d.d(dcsl0, dcrh0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                dcsl0 = dcrh0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Boolean)object0).booleanValue()) {
            icnl icnl0 = this.g;
            do {
                Object object2 = icnl0.b();
            }
            while(!icnl0.h(object2, dcrq.a(((dcrq)object2), null, ibpo.ai(((dcrq)object2).b, dcsl0), 5)));
        }
        return ibom.a;
    }

    public final Object c(ibrl ibrl0) {
        dcri dcri0;
        if((ibrl0 instanceof dcri)) {
            dcri0 = (dcri)ibrl0;
            int v = dcri0.c;
            if((v & 0x80000000) == 0) {
                dcri0 = new dcri(this, ibrl0);
            }
            else {
                dcri0.c = v - 0x80000000;
            }
        }
        else {
            dcri0 = new dcri(this, ibrl0);
        }
        Object object0 = dcri0.a;
        Object object1 = ibrx.a;
        switch(dcri0.c) {
            case 0: {
                ibnx.b(object0);
                iceb.a(this.k);
                dcri0.c = 1;
                object0 = this.d.e(this.a, gzdw.b, dcri0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_20;
            }
            case 1: {
                ibnx.b(object0);
            label_20:
                if(((Boolean)object0).booleanValue()) {
                    icnl icnl0 = this.g;
                    do {
                        Object object2 = icnl0.b();
                    }
                    while(!icnl0.h(object2, dcrq.a(((dcrq)object2), null, null, 3)));
                    if(((dcrq)icnl0.b()).b.isEmpty() && (((dcrq)icnl0.b()).a instanceof dcru)) {
                        dcri0.c = 2;
                        if(this.a(dcri0) == object1) {
                            return object1;
                        }
                    }
                }
                return ibom.a;
            }
            case 2: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object d(ibrl ibrl0) {
        gzbv gzbv0;
        InputStream inputStream0;
        gzbr gzbr0;
        dcsl dcsl0;
        ArrayList arrayList0;
        Object object1;
        Object object0;
        dcrj dcrj0;
        if((ibrl0 instanceof dcrj)) {
            dcrj0 = (dcrj)ibrl0;
            int v = dcrj0.c;
            if((v & 0x80000000) == 0) {
                dcrj0 = new dcrj(this, ibrl0);
            }
            else {
                dcrj0.c = v - 0x80000000;
            }
        }
        else {
            dcrj0 = new dcrj(this, ibrl0);
        }
        try {
            object0 = dcrj0.a;
            object1 = ibrx.a;
            switch(dcrj0.c) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_19;
                }
                case 2: {
                    goto label_93;
                }
            }
        }
        catch(iapl iapl0) {
            dcvz.a.c().f(iapl0).h("Failed to fetch receivers for cloud sharing session [%s]", this.a);
            return ibom.a;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        if(((dcrq)this.g.b()).c) {
            try {
                dcrj0.c = 1;
                object0 = this.d.c(this.a, dcrj0);
                if(object0 == object1) {
                    return object1;
                label_19:
                    ibnx.b(object0);
                }
                arrayList0 = new ArrayList();
                Iterator iterator0 = ((Iterable)object0).iterator();
                while(true) {
                label_22:
                    dcsl0 = null;
                    if(iterator0.hasNext()) {
                        goto label_37;
                    }
                    icnl icnl0 = this.g;
                    do {
                        Object object2 = icnl0.b();
                        dcrq dcrq0 = (dcrq)object2;
                    }
                    while(!icnl0.h(object2, dcrq.a(dcrq0, null, arrayList0, 5)));
                    if((((dcrq)icnl0.b()).a instanceof dcrv) && dcrq0.b.isEmpty() && !arrayList0.isEmpty() && !this.b.isEmpty()) {
                        dcrj0.c = 2;
                        if(!ibuq.m(((dcrq)icnl0.b()).a, dcrv.a)) {
                            throw new IllegalStateException("Upload is already in progress or has completed");
                        }
                        Object object3 = iccl.a(new dcrm(this, null), dcrj0);
                        if(object3 != ibrx.a) {
                            object3 = ibom.a;
                        }
                        if(object3 == object1) {
                            return object1;
                        label_37:
                            Object object4 = iterator0.next();
                            gzbr0 = (gzbr)object4;
                            try {
                                byte[] arr_b = gzbr0.c.toByteArray();
                                ibuq.e(arr_b, "toByteArray(...)");
                                ibuq.f(arr_b, "cipherText");
                                gmno gmno0 = (gmno)this.j.f.a();
                                ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
                                byte[] arr_b1 = dcss.a(this.j.a).a.getBytes(ibyo.a);
                                ibuq.e(arr_b1, "getBytes(...)");
                                inputStream0 = gmno0.a(byteArrayInputStream0, arr_b1);
                                break;
                            }
                            catch(IOException iOException0) {
                                goto label_82;
                            }
                        }
                    }
                    return ibom.a;
                }
            }
            catch(iapl iapl0) {
                dcvz.a.c().f(iapl0).h("Failed to fetch receivers for cloud sharing session [%s]", this.a);
                return ibom.a;
            }
            try {
                hfsl hfsl0 = hfsl.N(inputStream0);
                ProtoLiteMessage hftv0 = ((ProtoLiteMessage)gzbv.a).x_newMutableInstance();
                try {
                    hfwc hfwc0 = hfvu.a.c(hftv0);
                    hfwc0.l(hftv0, hfsm.p(hfsl0), hftc.a);
                    hfwc0.g(hftv0);
                }
                catch(hfur hfur0) {
                    if(hfur0.b) {
                        hfur0 = new hfur(hfur0);
                    }
                    hfur0.a = hftv0;
                    throw hfur0;
                }
                catch(hfwr hfwr0) {
                    hfur hfur1 = hfwr0.a();
                    hfur1.a = hftv0;
                    throw hfur1;
                }
                catch(IOException iOException1) {
                    if((iOException1.getCause() instanceof hfur)) {
                        throw (hfur)iOException1.getCause();
                    }
                    hfur hfur2 = new hfur(iOException1);
                    hfur2.a = hftv0;
                    throw hfur2;
                }
                catch(RuntimeException runtimeException0) {
                    if((runtimeException0.getCause() instanceof hfur)) {
                        throw (hfur)runtimeException0.getCause();
                    }
                    throw runtimeException0;
                }
                ProtoLiteMessage.P_makeImmutable(hftv0);
                gzbv0 = (gzbv)hftv0;
                goto label_78;
            }
            catch(Throwable throwable0) {
                try {
                    try {
                        ibsx.a(inputStream0, throwable0);
                        throw throwable0;
                    label_78:
                        ibsx.a(inputStream0, null);
                        ibuq.e(gzbv0, "use(...)");
                    }
                    catch(IOException iOException0) {
                    label_82:
                        dcvz.a.c().f(iOException0).i("Failed to parse decrypted metadata for receiver [%s] in cloud sharing session [%s]", gzbr0.b, this.a);
                        gzbv0 = null;
                    }
                    if(gzbv0 != null) {
                        String s = gzbr0.b;
                        ibuq.e(s, "getSessionId(...)");
                        String s1 = gzbv0.b;
                        ibuq.e(s1, "getDeviceName(...)");
                        dcsl0 = new dcsl(this.a, s, s1);
                    }
                    if(dcsl0 == null) {
                        goto label_22;
                    }
                    arrayList0.add(dcsl0);
                    goto label_22;
                label_93:
                    ibnx.b(object0);
                    return ibom.a;
                }
                catch(iapl iapl0) {
                }
            }
            dcvz.a.c().f(iapl0).h("Failed to fetch receivers for cloud sharing session [%s]", this.a);
        }
        return ibom.a;
    }
}


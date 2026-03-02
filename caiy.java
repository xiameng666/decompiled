import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import j..time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class caiy extends clso {
    public final Context a;
    public final List b;
    public final icnj c;
    public final cltr d;
    public final icig e;
    public final clsk f;
    public final icnl g;
    public final icnl h;
    public static final int i;
    private final cacc j;
    private final caje k;

    static {
        cajd.a("caiy");
    }

    public caiy(Context context0, clsk clsk0, cacc cacc0, caje caje0) {
        ibuq.f(clsk0, "selectedAccountRepository");
        super();
        this.a = context0;
        this.f = clsk0;
        this.j = cacc0;
        this.k = caje0;
        this.b = caiz.a(context0);
        this.g = icnm.a(null);
        icnl icnl0 = icnm.a(cahe.a);
        this.h = icnl0;
        this.c = new icmp(icnl0);
        cltr cltr0 = new cltr(lsc.a(this));
        this.d = cltr0;
        this.e = cltr0.b;
    }

    public final Object a(ibrl ibrl0) {
        Iterator iterator0;
        ArrayList arrayList0;
        ibps ibps0;
        caip caip0;
        if((ibrl0 instanceof caip)) {
            caip0 = (caip)ibrl0;
            int v = caip0.c;
            if((v & 0x80000000) == 0) {
                caip0 = new caip(this, ibrl0);
            }
            else {
                caip0.c = v - 0x80000000;
            }
        }
        else {
            caip0 = new caip(this, ibrl0);
        }
        Object object0 = caip0.a;
        Object object1 = ibrx.a;
        switch(caip0.c) {
            case 0: {
                ibnx.b(object0);
                Account account0 = (Account)this.g.b();
                if(account0 == null) {
                    ibps0 = ibps.a;
                }
                else {
                    caip0.c = 1;
                    object0 = this.j.a(account0, caip0);
                    if(object0 == object1) {
                        return object1;
                    }
                    arrayList0 = new ArrayList(ibpo.q(((Iterable)object0), 10));
                    iterator0 = ((Iterable)object0).iterator();
                    goto label_28;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                arrayList0 = new ArrayList(ibpo.q(((Iterable)object0), 10));
                iterator0 = ((Iterable)object0).iterator();
            label_28:
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    long v1 = ((cact)object2).a;
                    String s = ((cact)object2).c;
                    LocalDate localDate0 = ((cact)object2).b;
                    if(localDate0 == null) {
                        localDate0 = LocalDate.of(1970, 1, 1);
                        ibuq.e(localDate0, "of(...)");
                    }
                    arrayList0.add(new cage(v1, s, localDate0));
                }
                ibps0 = arrayList0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        cain cain0 = new cain(this);
        caiq caiq0 = new caiq(this, null);
        caio caio0 = new caio(this);
        Account account1 = (Account)this.g.b();
        cais cais0 = new cais(this);
        return new cahe(cain0, caiq0, caio0, ibps0, account1, this.k, cais0, 0x90);
    }

    public final Object b(String s, ibrl ibrl0) {
        String s1;
        ggtj ggtj0;
        cait cait0;
        if((ibrl0 instanceof cait)) {
            cait0 = (cait)ibrl0;
            int v = cait0.d;
            if((v & 0x80000000) == 0) {
                cait0 = new cait(this, ibrl0);
            }
            else {
                cait0.d = v - 0x80000000;
            }
        }
        else {
            cait0 = new cait(this, ibrl0);
        }
        Object object0 = cait0.b;
        Object object1 = ibrx.a;
        switch(cait0.d) {
            case 0: {
                ibnx.b(object0);
                cait0.a = s;
                cait0.d = 1;
                if(this.f.b(s) != object1) {
                    goto label_20;
                }
                return object1;
            }
            case 1: {
                s = (String)cait0.a;
                ibnx.b(object0);
            label_20:
                Account account0 = caiy.f(this.b, s);
                this.g.g(account0);
                ggtk ggtk0 = ggtl.c;
                icig icig0 = this.f.a();
                cait0.a = ggtk0;
                cait0.e = "New account name: %s";
                cait0.d = 2;
                Object object2 = icll.a(icig0, cait0);
                if(object2 != object1) {
                    ggtj0 = ggtk0;
                    object0 = object2;
                    s1 = "New account name: %s";
                    break;
                }
                return object1;
            }
            case 2: {
                s1 = cait0.e;
                ggtj0 = (ggtj)cait0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ggtj0.B(s1, object0);
        clto clto0 = new clto(clnd.l);
        this.d.a(clto0);
        return ibom.a;
    }

    public final Object c(long v, ibrl ibrl0) {
        Object object1;
        Object object0;
        caiu caiu0;
        if((ibrl0 instanceof caiu)) {
            caiu0 = (caiu)ibrl0;
            int v1 = caiu0.d;
            if((v1 & 0x80000000) == 0) {
                caiu0 = new caiu(this, ibrl0);
            }
            else {
                caiu0.d = v1 - 0x80000000;
            }
        }
        else {
            caiu0 = new caiu(this, ibrl0);
        }
        try {
            object0 = caiu0.b;
            object1 = ibrx.a;
            switch(caiu0.d) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_25;
                }
                case 2: {
                    goto label_35;
                }
            }
        }
        catch(Throwable throwable0) {
            return Boolean.valueOf(ibnw.b(ibnx.a(throwable0)));
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        Account account0 = (Account)this.g.b();
        if(account0 != null) {
            try {
                caiu0.a = account0;
                caiu0.e = this;
                caiu0.d = 1;
                cack cack0 = new cack(v, ((cacp)this.j), account0, null);
                object0 = icbd.a(cclw.d, cack0, caiu0);
                if(object0 == object1) {
                    return object1;
                }
                Object object2 = account0;
                goto label_28;
            label_25:
                this = caiu0.e;
                object2 = caiu0.a;
                ibnx.b(object0);
            label_28:
                caiu0.a = null;
                caiu0.e = null;
                caiu0.d = 2;
                cace cace0 = new cace(((cacp)this.j), ((Account)object2), ((List)object0), null);
                object0 = icbd.a(cclw.d, cace0, caiu0);
                if(object0 == object1) {
                    return object1;
                label_35:
                    ibnx.b(object0);
                }
                return Boolean.valueOf(ibnw.b(((List)object0)));
            }
            catch(Throwable throwable0) {
                return Boolean.valueOf(ibnw.b(ibnx.a(throwable0)));
            }
        }
        return Boolean.valueOf(false);
    }

    @Override  // eopt
    public final void e(Bundle bundle0) {
        icbb.b(lsc.a(this), null, null, new caix(this, null), 3);
    }

    public static final Account f(List list0, String s) {
        for(Object object0: list0) {
            if(ibuq.m(((Account)object0).name, s)) {
                return (Account)object0;
            }
        }
        return null;
    }
}


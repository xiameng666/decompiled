import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.common.Feature;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import com.google.android.gms.smartdevice.quickstart.AccountTransferOptions;
import com.google.android.gms.smartdevice.quickstart.AccountTransferResult;
import com.google.android.gms.smartdevice.quickstart.QuickStartConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class erbv extends rlj {
    public final rla g;
    public final erqc i;
    public String j;
    public final ibts k;
    public static final int l;
    private final erba m;
    private final rla n;
    private final ibts o;
    private final ibts p;

    public erbv() {
        this.m = erba.d;
        fncy fncy0 = new fncy();
        erbs erbs0 = new erbs(this);
        this.n = this.e(erbm.a, fncy0, null, erbs0);
        akhy akhy0 = new akhy();
        ibzw ibzw0 = new ibzw(rlj.a);
        erbt erbt0 = new erbt(this);
        this.g = this.e(erbi.e, akhy0, ibzw0, erbt0);
        this.i = new erqc(new String[]{"AccountTransferTask"});
        this.o = new erbn();
        this.k = new erbo();
        this.p = new erbp();
    }

    public final Intent C(List list0) {
        Context context0 = this.g();
        Object object0 = this.p.a(context0);
        for(Object object1: list0) {
            Account account0 = new Account(((String)object1), "com.google");
            if(((eqlf)object0).c(account0)) {
                Intent intent0 = ((eqlf)object0).a(account0, new Bundle(), new ManagedAuthOptions(1, 4));
                if(intent0 != null) {
                    return intent0;
                }
            }
        }
        return null;
    }

    public final erbi D(erbm erbm0) {
        List list0 = erbm0.c;
        int v = 0;
        String s = list0.isEmpty() ? "" : ((String)list0.get(0));
        String s1 = erbm0.d;
        if(s1 != null && list0.contains(s1)) {
            v = 1;
        }
        String s2 = 1 == v ? s1 : s;
        String s3 = 1 == v ? s1 : null;
        return 1 == v ? new erbh(s3, erbm0.e, s2, "com.google", erbm0.b.size(), list0.size()) : new erbh(s3, null, s2, "com.google", erbm0.b.size(), list0.size());
    }

    public final fnfb E(erbm erbm0) {
        ArrayList arrayList0 = new ArrayList();
        List list0 = erbm0.b;
        Iterator iterator0 = list0.iterator();
        while(true) {
            List list1 = erbm0.c;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            if(list1.contains(((erbk)object0).b)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: list0) {
            if(!list1.contains(((erbk)object1).b)) {
                arrayList1.add(object1);
            }
        }
        if(arrayList1.isEmpty()) {
            return new fnfb(new rui(new sei(this.g(), 0x7F1527CC), null, null, erbv.I(this, arrayList0), 6));  // string:quick_start_accounts_added_header "Accounts added"
        }
        String s = this.g().getResources().getQuantityString(0x7F13006C, arrayList1.size(), new Object[]{arrayList1.size()});  // plurals:quick_start_could_not_add_some_accounts_header
        ibuq.e(s, "getQuantityString(...)");
        return new fnfb(new rui(new sei(s), new sei(this.g(), 0x7F1527E1), new seg(this.g(), 0x7F08056E), ibpo.ak(erbv.I(this, arrayList0), this.J(arrayList1, true))));  // string:quick_start_try_later_in_settings_description "You can try again later in 
                                                                                                                                                                          // Settings"
    }

    public final Object F(evql evql0, ibrl ibrl0) {
        erbq erbq0;
        if((ibrl0 instanceof erbq)) {
            erbq0 = (erbq)ibrl0;
            int v = erbq0.c;
            if((v & 0x80000000) == 0) {
                erbq0 = new erbq(this, ibrl0);
            }
            else {
                erbq0.c = v - 0x80000000;
            }
        }
        else {
            erbq0 = new erbq(this, ibrl0);
        }
        Object object0 = erbq0.a;
        Object object1 = ibrx.a;
        switch(erbq0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    erbq0.c = 1;
                    object0 = ictn.b(evql0, erbq0);
                    if(object0 == object1) {
                        return object1;
                    label_18:
                        ibnx.b(object0);
                    }
                }
                catch(Throwable throwable0) {
                    object0 = ibnx.a(throwable0);
                }
                break;
            }
            case 1: {
                goto label_18;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Throwable throwable1 = ibnw.a(object0);
        if(throwable1 != null) {
            if((throwable1 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
                return object0;
            }
            this.i.f("Task failed: %s", new Object[]{throwable1.getMessage()});
        }
        return object0;
    }

    protected final Object G(erbd erbd0, ibrl ibrl0) {
        Object object6;
        bbng bbng0;
        Object object5;
        Object object4;
        Object object2;
        erbu erbu0;
        erbd erbd1 = erbd0;
        if((ibrl0 instanceof erbu)) {
            erbu0 = (erbu)ibrl0;
            int v = erbu0.e;
            if((v & 0x80000000) == 0) {
                erbu0 = new erbu(this, ibrl0);
            }
            else {
                erbu0.e = v - 0x80000000;
            }
        }
        else {
            erbu0 = new erbu(this, ibrl0);
        }
        Object object0 = erbu0.c;
        Object object1 = ibrx.a;
        String s = null;
        switch(erbu0.e) {
            case 0: {
                ibnx.b(object0);
                if(erbd1.d) {
                    if(erbd1.e) {
                        this.i.d("runOsMigration", new Object[0]);
                        return new rkt(new erbf(null));
                    }
                    fnfe fnfe0 = new fnfe(fnfd.c);
                    this.w(fnfe.class, fnfe0);
                    rui rui0 = new rui(new sei(this.g(), 0x7F1527CD), null, null, null, 14);  // string:quick_start_adding_accounts_header "Adding accounts"
                    this.w(rui.class, rui0);
                    this.i.d("runTask", new Object[0]);
                    Context context0 = this.g();
                    object2 = this.o.a(context0);
                    eqww eqww0 = new eqww(this, ((eqzi)object2));
                    azzc azzc0 = new azzc();
                    azzc0.c = new Feature[]{epvj.o};
                    azzc0.b = false;
                    azzc0.a = new eraj(((eraq)object2), eqww0);
                    azzc0.d = 20761;
                    evql evql0 = ((azts)object2).iG(azzc0.a());
                    erbu0.a = erbd1;
                    erbu0.b = object2;
                    erbu0.e = 1;
                    if(this.F(evql0, erbu0) == object1) {
                        return object1;
                    }
                    goto label_47;
                }
                this.i.f("useLauncher must be true", new Object[0]);
                return new rkt(new erbf(null));
            }
            case 1: {
                eqzi eqzi0 = (eqzi)erbu0.b;
                erbd erbd2 = (erbd)erbu0.a;
                ibnx.b(object0);
                ibnw ibnw0 = (ibnw)object0;
                object2 = eqzi0;
                erbd1 = erbd2;
            label_47:
                eqzq eqzq0 = new eqzq();
                eqzq0.a = eqxo.a(this.g());
                eqzq0.b(erbd1.b, erbd1.c);
                evql evql1 = ((eqzi)object2).c(eqzq0.a());
                erbu0.a = object2;
                erbu0.b = null;
                erbu0.e = 2;
                Object object3 = this.F(evql1, erbu0);
                if(object3 == object1) {
                    return object1;
                }
                object4 = object2;
                object5 = object3;
                goto label_63;
            }
            case 2: {
                eqzi eqzi1 = (eqzi)erbu0.a;
                ibnx.b(object0);
                object5 = ((ibnw)object0).a;
                object4 = eqzi1;
            label_63:
                if((object5 instanceof ibnv)) {
                    object5 = null;
                }
                if(((QuickStartConnectionResult)object5) != null) {
                    erqc erqc0 = this.i;
                    bbnk bbnk0 = bbnk.a;
                    erqc0.d("start() success!", new Object[0]);
                    erqc0.d("QA latency - reconnected timestamp: %d", new Object[]{new Long(SystemClock.elapsedRealtime())});
                    if(!hyja.c()) {
                        erqc0.d("delay before calling requestAccountTransfer", new Object[0]);
                        long v1 = hyit.a.b().a();
                        erbu0.a = object4;
                        erbu0.b = bbnk0;
                        erbu0.e = 3;
                        if(iccv.c(v1, erbu0) != object1) {
                            bbng0 = bbnk0;
                            goto label_86;
                        }
                        return object1;
                    }
                    bbng0 = bbnk0;
                    goto label_86;
                }
                this.i.f("start() failure! Returning Failure to start MinuteMaid", new Object[0]);
                Context context1 = this.g();
                ((eray)this.k.a(context1)).o(gjjm.Z);
                return new rkt(new erbf(null));
            }
            case 3: {
                bbng0 = (bbng)erbu0.b;
                object4 = (eqzi)erbu0.a;
                ibnx.b(object0);
            label_86:
                evql evql2 = ((eqzi)object4).b(new AccountTransferOptions(null, true));
                erbu0.a = bbng0;
                erbu0.b = null;
                erbu0.e = 4;
                object6 = this.F(evql2, erbu0);
                if(object6 == object1) {
                    return object1;
                }
                break;
            }
            case 4: {
                bbng0 = (bbng)erbu0.a;
                ibnx.b(object0);
                object6 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if((object6 instanceof ibnv)) {
            object6 = null;
        }
        erqc erqc1 = this.i;
        erqc1.d("QA latency - complete account transfer timestamp: %d", new Object[]{new Long(bbng0.b())});
        if(((AccountTransferResult)object6) == null) {
            erqc1.f("requestAccountTransfer() failure! Returning Failure to start MinuteMaid", new Object[0]);
            Context context2 = this.g();
            ((eray)this.k.a(context2)).o(gjjm.Z);
            return new rkt(new erbf(this.j));
        }
        ArrayList arrayList0 = ((AccountTransferResult)object6).a;
        ibuq.c(arrayList0);
        ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
        for(Object object7: arrayList0) {
            arrayList1.add(((BootstrapAccount)object7).b);
        }
        ArrayList arrayList2 = ((AccountTransferResult)object6).e;
        erqc1.d("Source had %d accounts, transferred %d accounts", new Object[]{((int)((AccountTransferResult)object6).b), arrayList0.size()});
        if(arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = ((AccountTransferResult)object6).f;
            ArrayList arrayList4 = new ArrayList(ibpo.q(arrayList2, 10));
            for(Object object8: arrayList2) {
                String s1 = ((BootstrapAccount)object8).b;
                ibuq.e(s1, "getName(...)");
                arrayList4.add(new erbk(s1, ((BootstrapAccount)object8).i));
            }
            ArrayList arrayList5 = new ArrayList(ibpo.q(arrayList0, 10));
            for(Object object9: arrayList0) {
                arrayList5.add(((BootstrapAccount)object9).b);
            }
            String s2 = ((AccountTransferResult)object6).g;
            if(s2 != null && s2.length() != 0) {
                s = s2;
            }
            erbm erbm0 = new erbm(arrayList4, arrayList5, s, ((AccountTransferResult)object6).d);
            if(arrayList3 != null) {
                erqc1.d("Launch fallback challenges", new Object[0]);
                rla rla0 = this.n;
                ArrayList arrayList6 = new ArrayList(ibpo.q(arrayList3, 10));
                for(Object object10: arrayList3) {
                    String s3 = ((FallbackAccount)object10).b;
                    ibuq.e(s3, "getName(...)");
                    String s4 = ((FallbackAccount)object10).c;
                    ibuq.e(s4, "getFallbackUrl(...)");
                    arrayList6.add(new fncv(s3, s4));
                }
                return rla0.a(erbm0, new fncw(arrayList6));
            }
            fnfb fnfb0 = this.E(erbm0);
            this.w(fnfb.class, fnfb0);
            this.H(erbm0);
            erbi erbi0 = this.D(erbm0);
            Intent intent0 = this.C(arrayList1);
            if(intent0 != null) {
                erqc1.d("Launch managed setup activity", new Object[0]);
                return this.g.a(erbi0, intent0);
            }
            return new rkt(erbi0);
        }
        Context context3 = this.g();
        ((eray)this.k.a(context3)).o(gjjm.Z);
        return new rkt(new erbf(null));
    }

    public final void H(erbm erbm0) {
        List list0 = erbm0.b;
        if(!list0.isEmpty()) {
            String s = erbm0.d;
            erbk erbk0 = (erbk)list0.get(0);
            List list1 = erbm0.c;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjjb.a).v_newBuilder();
            int v = list0.size();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjjb gjjb0 = (gjjb)hftp0.b_message;
            int v1 = 2;
            gjjb0.b |= 2;
            gjjb0.d = v;
            int v2 = list1.size();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gjjb)hftv0).b |= 1;
            ((gjjb)hftv0).c = v2;
            if(s == null) {
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gjjb)hftp0.b_message).e = 3;
                ((gjjb)hftp0.b_message).b |= 4;
                if(!list1.contains(erbk0.b)) {
                    v1 = 3;
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gjjb)hftp0.b_message).f = v1 - 1;
                ((gjjb)hftp0.b_message).b |= 8;
            }
            else {
                if(!list1.contains(s)) {
                    v1 = 3;
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gjjb)hftp0.b_message).e = v1 - 1;
                ((gjjb)hftp0.b_message).b |= 4;
            }
            Context context0 = this.g();
            ((eray)this.k.a(context0)).m(((gjjb)hftp0.N_build()));
            return;
        }
        this.i.m("sourceAccounts is empty!", new Object[0]);
    }

    public static List I(erbv erbv0, List list0) {
        return erbv0.J(list0, false);
    }

    private final List J(List list0, boolean z) {
        seg seg0;
        List list1 = ibpo.ao(list0, new erbr());
        List list2 = new ArrayList(ibpo.q(list1, 10));
        for(Object object0: list1) {
            erbk erbk0 = (erbk)object0;
            if(z) {
                seg0 = new seg(this.g(), 0x7F08056E);  // drawable:gs_error_vd_theme_24
            }
            else {
                String s = erbk0.c;
                Bitmap bitmap0 = null;
                if(!TextUtils.isEmpty(s)) {
                    try {
                        byte[] arr_b = bbmu.d(s);
                        bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
                    }
                    catch(IllegalArgumentException unused_ex) {
                    }
                }
                seg0 = bitmap0 == null ? new seg(this.g(), 0x7F0804B7) : new seg(bitmap0);  // drawable:gs_account_circle_vd_theme_24
            }
            list2.add(new rui(new sei(erbk0.b), null, seg0, null, 8));
        }
        return list2;
    }

    @Override  // rtn
    public final Object i(Object object0, ibrl ibrl0) {
        return this.G(((erbd)object0), ibrl0);
    }

    @Override  // rve
    public final rsp k() {
        return this.m;
    }
}


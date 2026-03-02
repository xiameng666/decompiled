import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.nearby.connection.UwbSenderInfo;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.FIN;

public final class dgdt {
    public final Map a;
    public final Map b;
    public final Map c;
    public ibtw d;
    public boolean e;
    private final Context f;
    private final icck g;
    private final dcpn h;
    private final dcqq i;
    private final iced j;
    private final icgv k;
    private final dgkd l;
    private final dgwm m;
    private final icnl n;

    public dgdt(Context context0, dgkd dgkd0, dgwm dgwm0, icck icck0, dcpn dcpn0, dcqq dcqq0) {
        ibuq.f(context0, "context");
        ibuq.f(dgkd0, "receiveManager");
        ibuq.f(dcpn0, "analyticsLogger");
        super();
        this.f = context0;
        this.l = dgkd0;
        this.m = dgwm0;
        this.g = icck0;
        this.h = dcpn0;
        this.i = dcqq0;
        this.a = new LinkedHashMap();
        this.n = icnm.a(Boolean.valueOf(true));
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        dgds dgds0 = new dgds(this, null);
        this.j = icir.d(new iclv(dgkd0.c, dgds0), icck0);
        this.d = new dgcq();
        icgv icgv0 = icgx.a(0x7FFFFFFF, 0, null, 6);
        icir.d(new iclv(new icia(icgv0, true), new dgdm(this, null)), icck0);
        this.k = icgv0;
    }

    public final int a(ShareTarget shareTarget0) {
        boolean z;
        synchronized(this) {
            z = this.l.d(shareTarget0.a);
        }
        return z ? 0 : 0x8AB7;
    }

    public final int b(ShareTarget shareTarget0) {
        boolean z;
        synchronized(this) {
            ibuq.f(shareTarget0, "shareTarget");
            z = this.l.e(shareTarget0.a);
        }
        return z ? 0 : 0x8AB7;
    }

    public final int c(ShareTarget shareTarget0) {
        boolean z;
        synchronized(this) {
            z = this.l.f(shareTarget0.a);
        }
        return z ? 0 : 0x8AB7;
    }

    public final Object d(String s, dgfy dgfy0, dfso dfso0, ibtw ibtw0, ibrl ibrl0) {
        Object object2;
        dgdn dgdn0;
        if((ibrl0 instanceof dgdn)) {
            dgdn0 = (dgdn)ibrl0;
            int v = dgdn0.c;
            if((v & 0x80000000) == 0) {
                dgdn0 = new dgdn(this, ibrl0);
            }
            else {
                dgdn0.c = v - 0x80000000;
            }
        }
        else {
            dgdn0 = new dgdn(this, ibrl0);
        }
        Object object0 = dgdn0.a;
        Object object1 = ibrx.a;
        boolean z = true;
        switch(dgdn0.c) {
            case 0: {
                ibnx.b(object0);
                if(this.e) {
                    throw new IllegalStateException("Check failed.");
                }
                this.d = ibtw0;
                dfsn dfsn0 = dfso0.a();
                dfsn0.h = this.h.b();
                dgkn dgkn0 = dgdt.n(s, dfsn0.a(), dgfy0);
                dgdn0.d = dgfy0;
                dgdn0.e = dfso0;
                dgdn0.c = 1;
                object2 = this.l.a(dgkn0, dgdn0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                dfso0 = dgdn0.e;
                dgfy0 = dgdn0.d;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        boolean z1 = ibnw.b(object2);
        this.e = z1;
        if(dgfy0 == null) {
            z = false;
        }
        dgym.a().a(new dgzy(dgdt.o(dfso0), dfso0.k, dfso0.b, z, z1));
        return ibom.a;
    }

    public final Object e(ibrl ibrl0) {
        dgdo dgdo0;
        if((ibrl0 instanceof dgdo)) {
            dgdo0 = (dgdo)ibrl0;
            int v = dgdo0.c;
            if((v & 0x80000000) == 0) {
                dgdo0 = new dgdo(this, ibrl0);
            }
            else {
                dgdo0.c = v - 0x80000000;
            }
        }
        else {
            dgdo0 = new dgdo(this, ibrl0);
        }
        Object object0 = dgdo0.a;
        Object object1 = ibrx.a;
        switch(dgdo0.c) {
            case 0: {
                ibnx.b(object0);
                dgym.a().a(dgzz.a);
                dgdo0.c = 1;
                if(this.l.b(dgdo0) == object1) {
                    return object1;
                }
                goto label_19;
            }
            case 1: {
                ibnx.b(object0);
            label_19:
                dgdp dgdp0 = new dgdp(null);
                dgdo0.c = 2;
                if(icll.b(this.n, dgdp0, dgdo0) == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        dgym.a().a(dgzu.a);
        this.d = new dgcx();
        this.e = false;
        return ibom.a;
    }

    public final Object f(String s, dgfy dgfy0, dfso dfso0, ibrl ibrl0) {
        Object object2;
        dgdq dgdq0;
        if((ibrl0 instanceof dgdq)) {
            dgdq0 = (dgdq)ibrl0;
            int v = dgdq0.c;
            if((v & 0x80000000) == 0) {
                dgdq0 = new dgdq(this, ibrl0);
            }
            else {
                dgdq0.c = v - 0x80000000;
            }
        }
        else {
            dgdq0 = new dgdq(this, ibrl0);
        }
        Object object0 = dgdq0.a;
        Object object1 = ibrx.a;
        boolean z = true;
        switch(dgdq0.c) {
            case 0: {
                ibnx.b(object0);
                dfsn dfsn0 = dfso0.a();
                dfsn0.h = this.h.b();
                dgkn dgkn0 = dgdt.n(s, dfsn0.a(), dgfy0);
                dgdq0.d = dgfy0;
                dgdq0.e = dfso0;
                dgdq0.c = 1;
                object2 = this.l.c(dgkn0, dgdq0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                dfso0 = dgdq0.e;
                dgfy0 = dgdq0.d;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(dgfy0 == null) {
            z = false;
        }
        dgym.a().a(new dhab(dgdt.o(dfso0), dfso0.k, dfso0.b, z, ibnw.b(object2)));
        return ibom.a;
    }

    public final void g(dgjp dgjp0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        dcvz.a.b().h("[RECEIVE_PROVIDER] received %s", dgjp0);
        if((dgjp0 instanceof dgjj)) {
            dgdg dgdg0 = new dgdg(((dgjj)dgjp0).c);
            dgdi dgdi0 = new dgdi(((dgjj)dgjp0).a, ((dgjj)dgjp0).b, dgdg0);
            this.a.put(Long.valueOf(((dgjj)dgjp0).a), dgdi0);
            icnl icnl0 = this.n;
            do {
                Object object0 = icnl0.b();
                Boolean boolean0 = (Boolean)object0;
            }
            while(!icnl0.h(object0, Boolean.valueOf(false)));
            if(hvqz.o()) {
                Map map0 = this.c;
                Long long0 = (long)((dgjj)dgjp0).a;
                if(!map0.containsKey(long0)) {
                    ArrayList arrayList0 = new ArrayList(ibpo.q(((dgjj)dgjp0).e, 10));
                    for(Object object1: ((dgjj)dgjp0).e) {
                        cuws cuws0 = ((dgfv)object1).a.l;
                        arrayList0.add((cuws0 == null ? null : cuws0.d));
                    }
                    map0.put(long0, ibpo.ag(arrayList0));
                }
            }
            dgcz dgcz0 = new dgcz(dgjp0, this);
            this.m(((dgjj)dgjp0).a, 1002, dgcz0);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgjp0 instanceof dgjo)) {
            if(hvqz.o()) {
                Map map1 = this.c;
                Long long1 = (long)((dgjo)dgjp0).a;
                if(!map1.containsKey(long1)) {
                    ArrayList arrayList1 = new ArrayList(ibpo.q(((dgjo)dgjp0).d, 10));
                    for(Object object2: ((dgjo)dgjp0).d) {
                        cuws cuws1 = ((dgfv)object2).a.l;
                        arrayList1.add((cuws1 == null ? null : cuws1.d));
                    }
                    map1.put(long1, ibpo.ag(arrayList1));
                }
            }
            Map map2 = this.a;
            long v1 = ((dgjo)dgjp0).a;
            Long long2 = v1;
            if(map2.get(long2) == null) {
                dgdg dgdg1 = new dgdg(((dgjo)dgjp0).c);
                map2.put(long2, new dgdi(v1, ((dgjo)dgjp0).b, dgdg1));
            }
            icnl icnl1 = this.n;
            do {
                Object object3 = icnl1.b();
                Boolean boolean1 = (Boolean)object3;
            }
            while(!icnl1.h(object3, Boolean.valueOf(false)));
            dgda dgda0 = new dgda(this, dgjp0);
            this.m(((dgjo)dgjp0).a, 1003, dgda0);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgjp0 instanceof dgje)) {
            dgdb dgdb0 = new dgdb(this, dgjp0);
            this.m(((dgje)dgjp0).a, 1005, dgdb0);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgjp0 instanceof dgjh)) {
            int v2 = 1007;
            switch(((dgjh)dgjp0).b - 1) {
                case 0: {
                    v2 = 0x3F0;
                    break;
                }
                case 1: {
                    v2 = 0x3F5;
                    break;
                }
                case 2: {
                    v2 = 1004;
                    break;
                }
                case 3: {
                    v2 = 0x3F6;
                    break;
                }
                case 4: {
                    v2 = 0x3FA;
                    break;
                }
                case 6: {
                    v2 = 1010;
                }
            }
            long v3 = ((dgjh)dgjp0).a;
            this.m(v3, v2, new dgdc(this, dgjp0));
            if(!hvqz.o()) {
                goto label_189;
            }
            List list0 = (List)this.c.remove(Long.valueOf(v3));
            if(list0 == null) {
                goto label_189;
            }
            for(Object object4: list0) {
                cuqf.m(this.f, ((Uri)object4));
            }
            goto label_189;
        }
        if((dgjp0 instanceof dgjf)) {
            long v4 = ((dgjf)dgjp0).a;
            this.m(v4, 1009, new dgdd(this, dgjp0));
            if(!hvqz.o()) {
                goto label_189;
            }
            List list1 = (List)this.c.remove(Long.valueOf(v4));
            if(list1 == null) {
                goto label_189;
            }
            for(Object object5: list1) {
                cuqf.m(this.f, ((Uri)object5));
            }
            goto label_189;
        }
        if((dgjp0 instanceof dgjg)) {
            dgcr dgcr0 = new dgcr(this, dgjp0);
            this.m(((dgjg)dgjp0).a, 0x3FD, dgcr0);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgjp0 instanceof dgjl)) {
            dgcs dgcs0 = new dgcs(dgjp0, this);
            this.m(((dgjl)dgjp0).a, 1005, dgcs0);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgjp0 instanceof dgjn)) {
            dgct dgct0 = new dgct(this, dgjp0);
            this.m(((dgjn)dgjp0).a, 0x3F9, dgct0);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgjp0 instanceof dgjm)) {
            long v5 = ((dgjm)dgjp0).a;
            dggc dggc0 = ((dgjm)dgjp0).b;
            Object object6 = this.a.remove(Long.valueOf(v5));
            if(object6 != null) {
                Context context0 = this.f;
                byte[] arr_b = dggc0.b() ? bauc.n(dizi.d(((dgdi)object6).a())) : null;
                dgiy dgiy0 = new dgiy(context0, ((dgdi)object6).b, dggc0, this.g, arr_b, this.i);
                dgdf dgdf0 = new dgdf(dggc0, dgiy0, icbb.b(this.g, null, null, new dgdr(this, v5, null), 3));
                dgdi dgdi1 = new dgdi(((dgdi)object6).a, ((dgdi)object6).b, dgdf0);
                int v6 = 1006;
                if(((dgdi)object6).b.c && ((dgdg)((dgdi)object6).c).a.a == 1) {
                    if(this.m.d.b() == dgvu.a || !bbqa.c()) {
                        dggc dggc1 = dgiy0.c;
                        List list2 = dggc1.d;
                        if(list2.isEmpty()) {
                            boolean z = false;
                            List list3 = dggc1.c;
                            if(!list3.isEmpty()) {
                                for(Object object7: list3) {
                                    if(!((FileAttachment)object7).k) {
                                        continue;
                                    }
                                    z = true;
                                    break;
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for(Object object8: list3) {
                                    if(((FileAttachment)object8).b != 1) {
                                        continue;
                                    }
                                    arrayList2.add(object8);
                                }
                                ArrayList arrayList3 = new ArrayList(ibpo.q(arrayList2, 10));
                                for(Object object9: arrayList2) {
                                    Uri uri0 = ((FileAttachment)object9).d;
                                    if(uri0 != null) {
                                        arrayList3.add(uri0);
                                        continue;
                                    }
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                ArrayList arrayList4 = new ArrayList(arrayList3);
                                djad.m(dgiy0.a, arrayList4, z, false, dggc1.a == 1, dgiy0.b.b);
                            }
                        }
                        else {
                            TextAttachment textAttachment0 = (TextAttachment)list2.get(0);
                            String s = textAttachment0.a;
                            if(s != null && !ibzk.D(s)) {
                                Intent intent1 = new Intent();
                                intent1.putExtra("android.intent.extra.TEXT", s);
                                intent1.putExtra("copy_paste_extra_need_toast", false);
                                intent1.putExtra("android.content.extra.IS_SENSITIVE", textAttachment0.g);
                                intent1.putExtra("android.content.extra.IS_REMOTE_DEVICE", dggc1.a == 1);
                                intent1.putExtra("android.content.extra.REMOTE_DEVICE_NAME", dgiy0.b.b);
                                djbt.c(dgiy0.a.getApplicationContext(), intent1);
                            }
                        }
                        if(bbqa.c()) {
                            v6 = 1020;
                        }
                    }
                    else if(hvrc.v()) {
                        Intent intent0 = djaj.b(dgdi1.a(), context0);
                        ibuq.f(context0, "<this>");
                        context0.sendBroadcast(intent0.setPackage("com.google.android.gms"), "com.google.android.gms.permission.INTERNAL_BROADCAST");
                    }
                    else {
                        context0.sendBroadcast(djaj.b(dgdi1.a(), context0));
                    }
                }
                dcnn dcnn0 = new dcnn(v6);
                dcnn0.e(100.0f);
                dcnn0.g = dgdi1.b.c;
                TransferMetadata transferMetadata0 = dcnn0.a();
                this.b.put(Long.valueOf(v5), dgdi1);
                this.d.a(dgdi1.a(), transferMetadata0);
                this.l();
                if(hvqz.o()) {
                    List list4 = (List)this.c.remove(Long.valueOf(((dgjm)dgjp0).a));
                    if(list4 != null) {
                        for(Object object10: list4) {
                            cuqf.m(context0, ((Uri)object10));
                        }
                    }
                }
            label_189:
                FIN.finallyCodeBegin$NT(v);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if((dgjp0 instanceof dgji)) {
            if(hvqz.ag() && ((dgji)dgjp0).d == 2) {
                int v7 = 0x402;
                switch(((dgji)dgjp0).c) {
                    case 9: 
                    case 12: {
                        break;
                    }
                    default: {
                        v7 = 0x3FF;
                    }
                }
                dgcu dgcu0 = new dgcu(this, dgjp0);
                this.m(((dgji)dgjp0).a, v7, dgcu0);
                FIN.finallyExec$NT(v);
                return;
            }
            if(hvqz.ag()) {
                dgdi dgdi2 = (dgdi)this.a.get(Long.valueOf(((dgji)dgjp0).a));
                if(dgdi2 != null) {
                    dgdi2.e = ((dgji)dgjp0).c;
                }
            }
            dgcv dgcv0 = new dgcv(dgjp0, this);
            this.m(((dgji)dgjp0).a, 0x3FE, dgcv0);
            FIN.finallyExec$NT(v);
            return;
        }
        throw new ibnq();
    }

    public final void h() {
        synchronized(this) {
            dcvz.a.b().p("[RECEIVE_PROVIDER] shutdown is called.", new Object[0]);
            iceb.a(this.j);
            this.b.clear();
            this.a.clear();
            do {
                Object object0 = this.n.b();
                Boolean boolean0 = (Boolean)object0;
            }
            while(!this.n.h(object0, Boolean.valueOf(true)));
            this.d = new dgcy();
        }
    }

    public final void i(String s, dgfy dgfy0, dfso dfso0, ibtw ibtw0) {
        synchronized(this) {
            cunf cunf0 = dcvz.a;
            cunf0.b().p("[RECEIVE_PROVIDER] start called.", new Object[0]);
            this.h.d();
            dgdj dgdj0 = new dgdj(s, dgfy0, dfso0, ibtw0);
            Object object0 = this.k.b(dgdj0);
            if((object0 instanceof icgz)) {
                Throwable throwable0 = icha.b(object0);
                cunf0.e().f(throwable0).p("failed to put start cmd to queue.", new Object[0]);
            }
        }
    }

    public final void j() {
        synchronized(this) {
            cunf cunf0 = dcvz.a;
            cunf0.b().p("[RECEIVE_PROVIDER] stop called.", new Object[0]);
            Object object0 = this.k.b(dgdk.a);
            if((object0 instanceof icgz)) {
                Throwable throwable0 = icha.b(object0);
                cunf0.e().f(throwable0).p("failed to put stop cmd to queue.", new Object[0]);
            }
        }
    }

    public final void k(String s, dgfy dgfy0, dfso dfso0) {
        synchronized(this) {
            cunf cunf0 = dcvz.a;
            cunf0.b().p("[RECEIVE_PROVIDER] update called.", new Object[0]);
            dgdl dgdl0 = new dgdl(s, dgfy0, dfso0);
            Object object0 = this.k.b(dgdl0);
            if((object0 instanceof icgz)) {
                Throwable throwable0 = icha.b(object0);
                cunf0.e().f(throwable0).p("failed to put update cmd to queue.", new Object[0]);
            }
        }
    }

    private final void l() {
        do {
            Object object0 = this.n.b();
            Boolean boolean0 = (Boolean)object0;
        }
        while(!this.n.h(object0, Boolean.valueOf(this.a.isEmpty())));
    }

    private final void m(long v, int v1, ibts ibts0) {
        Map map0 = this.a;
        Long long0 = v;
        dgdi dgdi0 = (dgdi)map0.get(long0);
        if(dgdi0 == null) {
            return;
        }
        dcnn dcnn0 = new dcnn(v1);
        dcnn0.g = dgdi0.b.c;
        dcnn0.h = dgdi0.d;
        dcnn0.m = dgdi0.e;
        dgdi0.d = false;
        ibts0.a(dcnn0);
        dgdi0.f = dcnn0.a();
        if(dgdi0.f.e) {
            map0.remove(long0);
        }
        this.d.a(dgdi0.a(), dgdi0.f);
        this.l();
    }

    private static final dgkn n(String s, dfso dfso0, dgfy dgfy0) {
        dglj dglj0;
        dglf dglf0;
        if(!hvqz.z()) {
            if(dfso0.k) {
            label_4:
                if(s == null) {
                    throw new IllegalArgumentException("Must provide a non-null device name when advertisePlaintextDeviceName is true");
                }
                dglf0 = new dglg(s, dgfy0);
            }
            else {
            label_8:
                if(dgfy0 == null) {
                    dglf0 = dglf.a;
                }
                else {
                    if(s == null) {
                        throw new IllegalArgumentException("Must provide a non-null device name when sharing with QR code in non-everyone mode");
                    }
                    dglf0 = new dgle(s, dgfy0);
                }
            }
        }
        else if(dfso0.k && (dfso0.a != dftl.d && dfso0.a != dftl.a)) {
            goto label_4;
        }
        else {
            goto label_8;
        }
        dftl dftl0 = dfso0.a;
        if(dftl0 == null) {
            throw new ibnq();
        }
        switch(dftl0.ordinal()) {
            case 0: {
                dglj0 = dglj.c;
                break;
            }
            case 1: {
                dglj0 = dglj.b;
                break;
            }
            case 2: {
                dglj0 = dglj.a;
                break;
            }
            case 3: {
                dglj0 = hvrc.a.b().y() ? dglj.d : dglj.c;
                break;
            }
            case 4: {
                dglj0 = dglj.e;
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        long v = dfso0.c;
        int v1 = dfso0.b;
        boolean z = dfso0.f;
        UwbSenderInfo[] arr_uwbSenderInfo = dfso0.d;
        if(arr_uwbSenderInfo != null) {
            Set set0 = ibpg.Q(arr_uwbSenderInfo);
            return set0 == null ? new dgkn(dglj0, v, v1, z, ibpu.a, dfso0.j, dglf0) : new dgkn(dglj0, v, v1, z, set0, dfso0.j, dglf0);
        }
        return new dgkn(dglj0, v, v1, z, ibpu.a, dfso0.j, dglf0);
    }

    private static final gyzc o(dfso dfso0) {
        dftl dftl0 = dfso0.a;
        if(dftl0 != null) {
            switch(dftl0.ordinal()) {
                case 0: {
                    return gyzc.c;
                }
                case 1: {
                    return gyzc.d;
                }
                case 2: {
                    return gyzc.e;
                }
                case 3: {
                    return gyzc.b;
                }
                case 4: {
                    return gyzc.f;
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        throw new IllegalStateException("Required value was null.");
    }
}


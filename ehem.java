import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.SyncStats;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.people.cpg.model.GroupContactOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

abstract class ehem {
    protected final ehfy a;
    protected final ehfw b;
    protected final ehft c;
    protected final ehcq d;
    protected final ehim e;
    protected final ehfk f;
    protected final ehfq g;
    protected final ehdl h;
    protected final girk i;
    private final ehfx j;
    private final egzp k;
    private final ehab l;

    protected ehem(girk girk0, ehfx ehfx0, ehfy ehfy0, ehfw ehfw0, ehim ehim0, egzp egzp0, ehab ehab0, ehcq ehcq0, ehfk ehfk0, ehfq ehfq0, ehdl ehdl0, ehft ehft0) {
        this.i = girk0;
        this.j = ehfx0;
        this.a = ehfy0;
        this.b = ehfw0;
        this.c = ehft0;
        this.e = ehim0;
        this.k = egzp0;
        this.l = ehab0;
        this.d = ehcq0;
        this.f = ehfk0;
        this.g = ehfq0;
        this.h = ehdl0;
    }

    protected abstract gfsx a(egzx arg1);

    protected abstract List b(List arg1);

    protected void c(List list0, List list1, List list2) {
        for(Object object0: list0) {
            egzx egzx0 = (egzx)object0;
            if(egzx0.f()) {
                list1.add(egzx0);
            }
            else {
                list2.add(egzx0);
            }
        }
    }

    protected final void d(Exception exception0, String s, int v) {
        this.e.r(gjgi.c, this.i, s, exception0);
        this.e.h(this.i, gjgi.c, false, 2, v);
    }

    protected final void e(int v) {
        egiv.R();
        ((ehiv)this.e).a.stats.numIoExceptions += (long)v;
    }

    protected final void f(List list0) {
        if(!list0.isEmpty()) {
            this.e.h(this.i, gjgi.c, false, 3, list0.size());
        }
    }

    protected final void g(egzx egzx0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)girw.a).v_newBuilder();
        giru giru0 = ehik.a(egzx0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        girw girw0 = (girw)hftp0.b_message;
        giru0.getClass();
        girw0.c = giru0;
        girw0.b |= 1;
        egiv.R();
        try {
            girv girv0 = this.g.a(egzx0.h.longValue());
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            girw girw1 = (girw)hftp0.b_message;
            girv0.getClass();
            girw1.d = girv0;
            girw1.b |= 2;
        }
        catch(RemoteException unused_ex) {
        }
        girw girw2 = (girw)hftp0.N_build();
        this.e.c(girw2);
    }

    protected final void h(List list0, iapl iapl0) {
        if(list0.size() != 1) {
            this.p(list0, iapl0);
            return;
        }
        girk girk0 = this.i;
        eggf eggf0 = ehem.n(girk0);
        switch(this.f.c(eggf0, iapl0.a.t.r, iapl0.a.u) - 1) {
            case 1: {
                if(hwyi.z()) {
                    egzx egzx0 = (egzx)list0.get(0);
                    this.a.h(egzx0);
                }
                else {
                    Long long0 = ((egzx)list0.get(0)).h;
                    this.a.e(long0);
                }
                this.e.h(girk0, gjgi.c, false, 3, 1);
                return;
            }
            case 7: {
                if(hxcc.h()) {
                    egzx egzx1 = (egzx)list0.get(0);
                    this.a.g(egzx1);
                }
                this.p(list0, iapl0);
                return;
            }
            default: {
                this.p(list0, iapl0);
            }
        }
    }

    protected final void i(egzx egzx0, egzx egzx1) {
        if(egzx0 != null) {
            ehhm ehhm0 = ehhn.a();
            ehhm0.b(egzx0);
            ehhm0.a = egzx1;
            ehhn ehhn0 = ehhm0.a();
            ehfy ehfy0 = this.a;
            ehfy0.f(ehhn0, false);
            if(hwyi.z() && (ehem.s(egzx0) || ehem.s(egzx1))) {
                this.e.h(this.i, gjgi.c, false, 10, 1);
                return;
            }
            if(hwyi.z()) {
                ehfy0.d(egzx1, true);
                return;
            }
            ehfy0.c(egzx1.h);
        }
    }

    protected abstract void j(egzx arg1, himv arg2);

    protected abstract void k(List arg1);

    public final void l(List list0) {
        gfsx gfsx0;
        int v10;
        int v9;
        ArrayList arrayList3;
        int v8;
        int v5;
        int v2;
        List list2;
        List list1 = list0;
        ehim ehim0 = this.e;
        girk girk0 = this.i;
        gjgi gjgi0 = gjgi.c;
        ehim0.h(girk0, gjgi0, false, 1, list1.size());
        egiv.R();
        int v = (int)hwzc.a.c().N();
        Integer.valueOf(v).getClass();
        int v1 = 0;
        while(v1 < list1.size()) {
            if(v1 == 0) {
                if(list1.size() < v) {
                    list2 = list1;
                    goto label_19;
                }
                else {
                    v2 = 0;
                    goto label_17;
                }
                goto label_16;
            }
            else {
            label_16:
                v2 = v1;
            }
        label_17:
            int v3 = v2 + v;
            list2 = list1.size() <= v3 ? list1.subList(v2, list1.size()) : list1.subList(v2, v3);
        label_19:
            long v4 = ehim0.a();
            this.k.d();
            if(ehjs.i(list2)) {
                v5 = v;
            }
            else {
                ArrayList arrayList0 = new ArrayList();
                ArrayList arrayList1 = new ArrayList();
                this.c(list2, arrayList0, arrayList1);
                this.k(arrayList0);
                if(hxcc.a.e().f()) {
                    ArrayList arrayList2 = new ArrayList();
                    int v6 = arrayList1.size();
                    int v7 = 0;
                    while(v7 < v6) {
                        egzx egzx0 = (egzx)arrayList1.get(v7);
                        if(hxcc.h() && ehhz.d(egzx0.u, egzx0.i)) {
                            ++((ehiv)ehim0).a.stats.numParseExceptions;
                            v8 = v6;
                            arrayList3 = arrayList2;
                            ehim0 = ehim0;
                            v9 = v7;
                            ehim0.h(girk0, gjgi0, false, 8, 1);
                            v10 = v;
                        }
                        else {
                            try {
                                arrayList3 = arrayList2;
                                v8 = v6;
                                v9 = v7;
                                gfsx0 = this.a(egzx0);
                                if(gfsx0.i()) {
                                    goto label_55;
                                }
                                else {
                                    goto label_52;
                                }
                                goto label_62;
                            }
                            catch(iapl iapl0) {
                                v10 = v;
                                goto label_60;
                            }
                        label_52:
                            arrayList3.add(egzx0);
                            v10 = v;
                            goto label_62;
                            try {
                            label_55:
                                v10 = v;
                                ehim0.h(girk0, gjgi0, false, 9, 1);
                                this.q(Arrays.asList(new egzx[]{egzx0}), Arrays.asList(new himv[]{((himv)gfsx0.d())}));
                                goto label_62;
                            }
                            catch(iapl iapl0) {
                            }
                        label_60:
                            this.e.h(this.i, gjgi.c, false, 9, 1);
                            this.h(Arrays.asList(new egzx[]{egzx0}), iapl0);
                        }
                    label_62:
                        v7 = v9 + 1;
                        arrayList2 = arrayList3;
                        v6 = v8;
                        v = v10;
                    }
                    v5 = v;
                    this.r(arrayList2);
                }
                else {
                    v5 = v;
                    this.r(arrayList1);
                }
                if(hwyi.z()) {
                    for(Object object0: arrayList1) {
                        if(!ehem.s(((egzx)object0))) {
                            continue;
                        }
                        ehfy ehfy0 = this.a;
                        if(hwyi.z()) {
                            ehfy0.b.a();
                        }
                        goto label_82;
                    }
                    this.a.a();
                }
            label_82:
                this.l.f();
            }
            int v11 = list2.size() - ((int)(this.e.a() - v4));
            egiv.R();
            if(this.i != girk.d || egiv.r().booleanValue()) {
                this.h.d(v11, false);
            }
            v1 += v5;
            list1 = list0;
            v = v5;
        }
    }

    protected static final void m(iapl iapl0, List list0) {
        egiv.R();
        boolean z = hwzc.a.c().ao();
        Boolean.valueOf(z).getClass();
        if(z) {
            new iapl(iapl0.a.f(list0.toString()));
        }
    }

    private static eggf n(girk girk0) {
        switch(girk0.ordinal()) {
            case 1: {
                return eggf.b;
            }
            case 2: {
                return eggf.c;
            }
            case 3: {
                return eggf.d;
            }
            default: {
                return eggf.a;
            }
        }
    }

    private final void o(Exception exception0) {
        egig.c("FSA2_BaseGroupUpSyncer", String.format("Group Sync gRPC throws Exception, operation type = %s", ((int)this.i.j)), exception0);
    }

    private final void p(List list0, iapl iapl0) {
        ehem.m(iapl0, list0);
        this.d(iapl0, iapl0.a.t.name(), list0.size());
        egiv.R();
        if(egiv.f().booleanValue() && iapl0.a.t == iaph.d) {
            egiv.R();
            SyncStats syncStats0 = ((ehiv)this.e).a.stats;
            syncStats0.numParseExceptions += (long)list0.size();
        }
        else {
            this.e(list0.size());
        }
        this.o(iapl0);
        for(Object object0: list0) {
            this.g(((egzx)object0));
        }
    }

    private final void q(List list0, List list1) {
        batl.b(list0.size() == list1.size());
        egiv.R();
        int v = 0;
        while(v < list1.size()) {
            egzx egzx0 = (egzx)list0.get(v);
            himv himv0 = (himv)list1.get(v);
            if(himv0 == null) {
                v2 = v;
            }
            else {
                girk girk0 = this.i;
                int v1 = ehfi.d(ehem.n(girk0), (himu.a(himv0.g) == 0 ? 1 : himu.a(himv0.g)), himv0.d, this.f.b);
                if(v1 == 2) {
                    if(hwyi.z()) {
                        this.a.h(egzx0);
                    }
                    else {
                        this.a.e(egzx0.h);
                    }
                    this.e.h(girk0, gjgi.c, false, 7, 1);
                    int v2 = v;
                    goto label_152;
                }
                else if(v1 != 4 && v1 != 7) {
                    if(v1 != 5) {
                    label_63:
                        if(hxcc.h() && v1 == 8) {
                            this.a.g(egzx0);
                        }
                    }
                    else if(this.i != girk.b) {
                        HashSet hashSet0 = new HashSet();
                        egiv.R();
                        if(egiv.t().booleanValue()) {
                            try {
                                String s = hwzc.d();
                                ArrayList arrayList0 = new ArrayList();
                                if(!TextUtils.isEmpty(s)) {
                                    for(Object object0: gfud.e(',').l(s)) {
                                        Long long0 = Long.parseLong(((String)object0), 16);
                                        if(ehhy.a.contains(long0)) {
                                            continue;
                                        }
                                        arrayList0.add(long0);
                                    }
                                }
                                hashSet0.addAll(arrayList0);
                            }
                            catch(NumberFormatException unused_ex) {
                                egig.d("FSA2_GroupSourceIdValidator", "Unable to parse group source ID black list %s", new Object[]{hwzc.d()});
                            }
                        }
                        String s1 = egzx0.k;
                        egiv.R();
                        try {
                            long v3 = Long.parseLong(s1, 16);
                            if(egiv.t().booleanValue() && hashSet0.contains(Long.valueOf(v3))) {
                                egig.m("FSA2_GroupSourceIdValidator", "Group source ID %s is treated as invalid.", new Object[]{s1});
                                goto label_46;
                            }
                        }
                        catch(NumberFormatException unused_ex) {
                            egig.m("FSA2_GroupSourceIdValidator", "Unable to parse groupSourceId, treat as invalid: %s", new Object[]{s1});
                            boolean z = hwzc.a.c().bi();
                            Boolean.valueOf(z).getClass();
                            if(z) {
                                goto label_46;
                            }
                        }
                        goto label_65;
                    label_46:
                        egig.g("FSA2_BaseGroupUpSyncer", "Invalid group source ID is found: %s", egzx0.k);
                        boolean z1 = hwzc.a.c().af();
                        Boolean.valueOf(z1).getClass();
                        if(z1) {
                            try {
                                if(this.j.f(egzx0.h, egzx0.m).isEmpty()) {
                                    goto label_51;
                                }
                            }
                            catch(RemoteException unused_ex) {
                            }
                        }
                        else {
                        label_51:
                            egig.g("FSA2_BaseGroupUpSyncer", "Start to nullify the invalid group source ID: %s", egzx0.k);
                            ContentValues contentValues0 = new ContentValues();
                            contentValues0.putNull("sourceid");
                            egiv.R();
                            boolean z2 = egiv.v().booleanValue();
                            this.a.a.d.e(this.a.a.d.a, egzx0.h, contentValues0, z2);
                            this.e.h(this.i, gjgi.c, false, 3, 1);
                            SyncStats syncStats0 = ((ehiv)this.e).a.stats;
                            ++syncStats0.numIoExceptions;
                            v2 = v;
                            goto label_152;
                        }
                    }
                    else {
                        v1 = 5;
                        goto label_63;
                    }
                label_65:
                    v2 = v;
                }
                else {
                    try {
                        ehfw ehfw0 = this.b;
                        Long long1 = egzx0.h;
                        List list2 = ehfw0.b.f(long1, egzx0.m.trim());
                        if(list2.isEmpty()) {
                            goto label_122;
                        }
                        else {
                            if(list2.size() > 1) {
                                egig.b("LocalGroupsMerger", "More than 1 synced duplicate group found in CP2. Doesn\'t know which to merge with.");
                            }
                            egiv.R();
                            hwzc hwzc0 = hwzc.a;
                            int v4 = (int)hwzc.a.c().t();
                            Integer.valueOf(v4).getClass();
                            while(true) {
                            label_77:
                                int v5 = v4;
                                ehfs ehfs0 = ehfw0.c;
                                long v6 = (long)long1;
                                goto label_80;
                            }
                        }
                        goto label_133;
                    }
                    catch(RemoteException unused_ex) {
                        goto label_130;
                    }
                    try {
                    label_80:
                        Object object1 = list2.get(0);
                    }
                    catch(RemoteException unused_ex) {
                        v2 = v;
                        goto label_131;
                    }
                    try {
                        egiv.R();
                        ehfw ehfw1 = ehfw0;
                        int v7 = (int)hwzc0.c().f();
                        Integer.valueOf(v7).getClass();
                        int v8 = ehfs0.a(v6, ((egzx)object1).h.longValue(), ((long)v7));
                        if(v8 >= 0) {
                            try {
                                ehab ehab0 = ehfw1.a;
                                ehac ehac0 = ehab0.f;
                                v2 = v;
                                ContentProviderOperation.Builder contentProviderOperation$Builder0 = ContentProviderOperation.newAssertQuery(ehac0.a);
                                v2 = v;
                                goto label_99;
                            }
                            catch(ehfh ehfh0) {
                            }
                            goto label_97;
                        }
                        goto label_108;
                    }
                    catch(RemoteException unused_ex) {
                        goto label_130;
                    }
                label_97:
                    ehfw1 = ehfw1;
                    goto label_106;
                    try {
                    label_99:
                        ehfw1 = ehfw1;
                        try {
                            ehac0.b.a(contentProviderOperation$Builder0.withSelection("mimetype=\'vnd.android.cursor.item/group_membership\' AND data1=?", new String[]{String.valueOf(long1.longValue())}).withExpectedCount(0), false);
                            ehab0.d.d(long1, false);
                            ehab0.f();
                            gjgz gjgz0 = gjgz.b;
                            goto label_133;
                        }
                        catch(ehfh ehfh0) {
                        }
                    label_106:
                        egig.c("LocalGroupsMerger", "Failed to delete group.", ehfh0);
                        goto label_109;
                    label_108:
                        v2 = v;
                    label_109:
                        v4 = v5 - 1;
                        if(v5 <= 0) {
                            if(v8 >= 0) {
                                gjgz0 = gjgz.h;
                            }
                            else if(v8 == -1) {
                                gjgz0 = gjgz.f;
                            }
                            else {
                                gjgz0 = gjgz.g;
                            }
                            goto label_133;
                        }
                    }
                    catch(RemoteException unused_ex) {
                        goto label_131;
                    }
                    try {
                        v = v2;
                        ehfw0 = ehfw1;
                        goto label_77;
                    label_122:
                        egig.b("LocalGroupsMerger", "No synced duplicate group found in CP2 while server claims there is a duplicate");
                        try {
                            ehfw0.d.b();
                        }
                        catch(ehfh unused_ex) {
                            gjgz0 = gjgz.i;
                            goto label_128;
                        }
                        gjgz0 = gjgz.d;
                    label_128:
                        v2 = v;
                        goto label_133;
                    }
                    catch(RemoteException unused_ex) {
                    label_130:
                        v2 = v;
                    }
                label_131:
                    egig.b("LocalGroupsMerger", "Unable to merge the duplicate groups.");
                    gjgz0 = gjgz.c;
                label_133:
                    ehim ehim0 = this.e;
                    ((ehiv)ehim0).I = gfsx.m(gjgz0);
                    if(gjgz0 == gjgz.b) {
                        ehim0.h(this.i, gjgi.c, false, 3, 1);
                        goto label_152;
                    }
                    else if(v1 == 7) {
                        if(hwyi.z()) {
                            this.a.h(egzx0);
                        }
                        else {
                            this.a.e(egzx0.h);
                        }
                        ehim0.h(this.i, gjgi.c, false, 7, 1);
                        goto label_152;
                    }
                }
            }
            try {
                this.j(egzx0, himv0);
            }
            catch(ehfa ehfa0) {
                this.d(ehfa0, String.valueOf(ehfa0.a), 1);
                SyncStats syncStats1 = ((ehiv)this.e).a.stats;
                ++syncStats1.numIoExceptions;
            }
        label_152:
            v = v2 + 1;
        }
    }

    private final void r(List list0) {
        if(ehjs.i(list0)) {
            return;
        }
        if(hwyi.z() && hwyi.x() && !ehjs.i(list0)) {
            ggdy ggdy0 = new ggdy();
            for(Object object0: list0) {
                egzx egzx0 = (egzx)object0;
                GroupContactOrder groupContactOrder0 = egzx0.s;
                if(groupContactOrder0 == null) {
                    ggdy0.i(egzx0);
                }
                else if(egzx0.e()) {
                    ggdy0.i(egzx0);
                }
                else {
                    if(groupContactOrder0.c()) {
                        egig.k("FSA2_BaseGroupUpSyncer", "Clearing CPG dirty bit for skipped CPG non-starred group");
                        this.a.b(egzx0);
                    }
                    egig.k("FSA2_BaseGroupUpSyncer", "Skipping non-starred group contact order");
                    if(hwyi.w()) {
                        egzw egzw0 = new egzw(egzx0);
                        egzw0.l = null;
                        egzw0.k = null;
                        egzw0.i(false);
                        ggdy0.i(egzw0.a());
                    }
                    else {
                        egzw egzw1 = new egzw(egzx0);
                        egzw1.l = null;
                        egzw1.k = null;
                        ggdy0.i(egzw1.a());
                    }
                }
            }
            this.a.a();
            list0 = ggdy0.h();
        }
        if(hwyi.z() && hwyi.y() && !ehjs.i(list0)) {
            ggdy ggdy1 = new ggdy();
            for(Object object1: list0) {
                egzx egzx1 = (egzx)object1;
                GroupContactOrder groupContactOrder1 = egzx1.s;
                if(groupContactOrder1 == null) {
                    ggdy1.i(egzx1);
                }
                else if(((long)egzx1.c().size()) < hwyi.b()) {
                    ggdy1.i(egzx1);
                }
                else {
                    if(groupContactOrder1.c()) {
                        egig.k("FSA2_BaseGroupUpSyncer", "Clearing dirty flag for skipped CPG group");
                        this.a.b(egzx1);
                    }
                    egig.k("FSA2_BaseGroupUpSyncer", "Skipping oversize group contact order");
                    if(hwyi.w()) {
                        egzw egzw2 = new egzw(egzx1);
                        egzw2.l = null;
                        egzw2.k = null;
                        egzw2.i(false);
                        ggdy1.i(egzw2.a());
                    }
                    else {
                        egzw egzw3 = new egzw(egzx1);
                        egzw3.l = null;
                        egzw3.k = null;
                        ggdy1.i(egzw3.a());
                    }
                }
            }
            this.a.a();
            list0 = ggdy1.h();
        }
        try {
            this.q(list0, this.b(list0));
        }
        catch(acse acse0) {
            int v = list0.size();
            this.d(acse0, "GRPC_AUTH_EXCEPTION", v);
            egiv.R();
            SyncStats syncStats0 = ((ehiv)this.e).a.stats;
            syncStats0.numAuthExceptions += (long)v;
            this.o(acse0);
        }
        catch(iapl iapl0) {
            this.h(list0, iapl0);
        }
        catch(ehfb ehfb0) {
            int v1 = list0.size();
            this.d(ehfb0, ehfb0.toString(), v1);
            this.e(v1);
            this.o(ehfb0);
        }
    }

    private static final boolean s(egzx egzx0) {
        return egzx0.t && !egzx0.f;
    }
}


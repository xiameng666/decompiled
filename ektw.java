import android.os.Bundle;
import com.google.android.gms.chimera.modules.scheduler.AppContextProvider;
import com.google.android.gms.scheduler.modeltasks.ModelTaskService;
import j..time.Clock;
import j..time.Instant;
import j..time.LocalDateTime;
import j..time.LocalTime;
import j..time.ZonedDateTime;
import j..time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class ektw {
    public static final ektw a;
    private static final bboh b;

    static {
        ektw.a = new ektw();
        ektw.b = bboh.a("ModelTaskScheduler");
        ibuq.e(glxu.a, "system(...)");
    }

    public final Object a(ekuc ekuc0, ibrl ibrl0) {
        ektt ektt0;
        if((ibrl0 instanceof ektt)) {
            ektt0 = (ektt)ibrl0;
            int v = ektt0.f;
            if((v & 0x80000000) == 0) {
                ektt0 = new ektt(this, ibrl0);
            }
            else {
                ektt0.f = v - 0x80000000;
            }
        }
        else {
            ektt0 = new ektt(this, ibrl0);
        }
        Object object0 = ektt0.d;
        Object object1 = ibrx.a;
        switch(ektt0.f) {
            case 0: {
                ibnx.b(object0);
                ektt0.a = ekuc0;
                ektt0.f = 1;
                object0 = ektr.a.a(ektt0);
                if(object0 != object1) {
                    goto label_21;
                }
                break;
            }
            case 1: {
                ekuc0 = (ekuc)ektt0.a;
                ibnx.b(object0);
            label_21:
                hfuo hfuo0 = ekuc0.b;
                ibuq.e(hfuo0, "getModelTaskConfigsList(...)");
                ArrayList arrayList0 = new ArrayList();
                Iterator iterator0 = hfuo0.iterator();
            label_25:
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    ekub ekub0 = (ekub)object2;
                    if(!(((List)object0) instanceof Collection) || !((List)object0).isEmpty()) {
                        for(Object object3: ((List)object0)) {
                            ekub ekub1 = ((ekug)object3).c;
                            if(ekub1 == null) {
                                ekub1 = ekub.a;
                            }
                            if(ibuq.m(ekub1.d, ekub0.d)) {
                                continue label_25;
                            }
                        }
                    }
                    arrayList0.add(object2);
                }
                ArrayList arrayList1 = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator iterator2 = ((List)object0).iterator();
            label_42:
                while(iterator2.hasNext()) {
                    Object object4 = iterator2.next();
                    ekug ekug0 = (ekug)object4;
                    hfuo hfuo1 = ekuc0.b;
                    ibuq.e(hfuo1, "getModelTaskConfigsList(...)");
                    if(!(hfuo1 instanceof Collection) || !hfuo1.isEmpty()) {
                        for(Object object5: hfuo1) {
                            if(ibuq.m(((ekub)object5).d, (ekug0.c == null ? ekub.a : ekug0.c).d)) {
                                arrayList2.add(object4);
                                continue label_42;
                            }
                        }
                    }
                    arrayList1.add(object4);
                }
                ibns ibns0 = new ibns(arrayList1, arrayList2);
                List list0 = (List)ibns0.a;
                List list1 = (List)ibns0.b;
                long v1 = Instant.now().toEpochMilli();
                List list2 = ibpo.at(list1);
                ArrayList arrayList3 = new ArrayList(ibpo.q(arrayList0, 10));
                for(Object object6: arrayList0) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ekug.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((ekub)object6).getClass();
                    ((ekug)hftv0).c = (ekub)object6;
                    ((ekug)hftv0).b |= 1;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ekug ekug1 = (ekug)hftp0.b_message;
                    ekug1.b |= 2;
                    ekug1.d = v1;
                    ProtoLiteMessage hftv1 = hftp0.N_build();
                    ibuq.e(hftv1, "build(...)");
                    arrayList3.add(((ekug)hftv1));
                }
                list2.addAll(arrayList3);
                ektt0.a = arrayList0;
                ektt0.b = list0;
                ektt0.c = list1;
                ektt0.f = 2;
                if(ektr.b(list2, ektt0) != object1) {
                    ((ggtj)ektw.b.h()).X("NewConfigs: %s. PreservedConfigs: %s. DeletedConfigs: %s", new Integer(arrayList0.size()), new Integer(list1.size()), new Integer(list0.size()));
                    return list0;
                }
                break;
            }
            case 2: {
                Object object7 = ektt0.c;
                object1 = ektt0.b;
                List list3 = (List)ektt0.a;
                ibnx.b(object0);
                ((ggtj)ektw.b.h()).X("NewConfigs: %s. PreservedConfigs: %s. DeletedConfigs: %s", new Integer(list3.size()), new Integer(((List)object7).size()), new Integer(((List)object1).size()));
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object1;
    }

    public final Object b(ibrl ibrl0) {
        Iterator iterator0;
        cljp cljp0;
        ektu ektu0;
        if((ibrl0 instanceof ektu)) {
            ektu0 = (ektu)ibrl0;
            int v = ektu0.c;
            if((v & 0x80000000) == 0) {
                ektu0 = new ektu(this, ibrl0);
            }
            else {
                ektu0.c = v - 0x80000000;
            }
        }
        else {
            ektu0 = new ektu(this, ibrl0);
        }
        Object object0 = ektu0.a;
        Object object1 = ibrx.a;
        switch(ektu0.c) {
            case 0: {
                ibnx.b(object0);
                cljp0 = cljp.a(AppContextProvider.a());
                if(hrwk.d()) {
                    ((ggtj)ektw.b.h()).x("Stopping all model tasks");
                    cljp0.c(new ibuk(ModelTaskService.class).b());
                    ektu0.c = 1;
                    return ektr.b(ibps.a, ektu0) != object1 ? ibom.a : object1;
                }
                hrwk hrwk0 = hrwk.a;
                if(hrwk0.c().d()) {
                    cljp0.c(new ibuk(ModelTaskService.class).b());
                }
                ekuc ekuc0 = hrwk0.c().b();
                ektu0.d = cljp0;
                ektu0.c = 2;
                object0 = this.a(ekuc0, ektu0);
                if(object0 != object1) {
                    iterator0 = ((List)object0).iterator();
                    goto label_36;
                }
                break;
            }
            case 2: {
                cljp0 = ektu0.d;
                ibnx.b(object0);
                iterator0 = ((List)object0).iterator();
            label_36:
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    ggtj ggtj0 = (ggtj)ektw.b.h();
                    ekub ekub0 = ((ekug)object2).c;
                    if(ekub0 == null) {
                        ekub0 = ekub.a;
                    }
                    ggtj0.B("Cancelling model task: %s", ekub0.d);
                    ekub ekub1 = ((ekug)object2).c;
                    if(ekub1 == null) {
                        ekub1 = ekub.a;
                    }
                    cljp0.d(ekub1.d, new ibuk(ModelTaskService.class).b());
                }
                ektu0.d = null;
                ektu0.c = 3;
                if(this.c(ektu0) != object1) {
                    return ibom.a;
                }
                break;
            }
            case 1: 
            case 3: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object1;
    }

    public final Object c(ibrl ibrl0) {
        int v14;
        int v13;
        int v12;
        Object object4;
        Instant instant5;
        long v6;
        Instant instant3;
        int v5;
        long v3;
        ektv ektv0;
        if((ibrl0 instanceof ektv)) {
            ektv0 = (ektv)ibrl0;
            int v = ektv0.c;
            if((v & 0x80000000) == 0) {
                ektv0 = new ektv(this, ibrl0);
            }
            else {
                ektv0.c = v - 0x80000000;
            }
        }
        else {
            ektv0 = new ektv(this, ibrl0);
        }
        Object object0 = ektv0.a;
        Object object1 = ibrx.a;
        switch(ektv0.c) {
            case 0: {
                ibnx.b(object0);
                ektv0.c = 1;
                object0 = ektr.a.a(ektv0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        for(Object object2: ((List)object0)) {
            ekug ekug0 = (ekug)object2;
            cljp cljp0 = cljp.a(AppContextProvider.a());
            hfuo hfuo0 = ekug0.e;
            ibuq.e(hfuo0, "getRunsList(...)");
            ekuj ekuj0 = (ekuj)ibpo.X(hfuo0);
            int v1 = -1;
            if(ekuj0 != null) {
                v1 = (ekui.b(ekuj0.c) == null ? ekui.a : ekui.b(ekuj0.c)) == ekui.b ? (ekuj0.e == null ? ekuf.a : ekuj0.e).h : -1 + (ekuj0.e == null ? ekuf.a : ekuj0.e).h;
            }
            Instant instant0 = Instant.now();
            ibuq.e(instant0, "instant(...)");
            ekub ekub0 = ekug0.c == null ? ekub.a : ekug0.c;
            ibuq.e(ekub0, "getTaskConfig(...)");
            int v2 = ekub0.b;
            if(v2 == 3) {
                v3 = TimeUnit.DAYS.toMillis(((long)(ekub0.b == 3 ? ((ekua)ekub0.c) : ekua.a).c));
            }
            else {
                long v4 = v2 == 4 ? ((long)(((Long)ekub0.c))) : 0L;
                if(v4 < hrwk.b()) {
                    ((ggtj)ektw.b.j()).Q("Clamping period of task %s to %s", ekub0.d, hrwk.b());
                    v3 = hrwk.b();
                }
                else {
                    v3 = v4;
                }
            }
            ibuq.f(ekug0, "task");
            Instant instant1 = Instant.ofEpochMilli(ekug0.d);
            ibuq.e(instant1, "ofEpochMilli(...)");
            ZonedDateTime zonedDateTime0 = ZonedDateTime.ofInstant(instant1, Clock.systemDefaultZone().getZone());
            ibuq.e(zonedDateTime0, "ofInstant(...)");
            ekub ekub1 = ekug0.c;
            if((ekub1 == null ? ekub.a : ekub1).b == 3) {
                if(ekub1 == null) {
                    ekub1 = ekub.a;
                }
                ekua ekua0 = ekub1.b == 3 ? ((ekua)ekub1.c) : ekua.a;
                hjio hjio0 = ekua0.b == null ? hjio.a : ekua0.b;
                LocalTime localTime0 = LocalTime.of(hjio0.b, hjio0.c, hjio0.d, hjio0.e);
                ibuq.e(localTime0, "let(...)");
                Instant instant2 = zonedDateTime0.toLocalTime().isBefore(localTime0) ? ZonedDateTime.ofLocal(LocalDateTime.of(zonedDateTime0.toLocalDate(), localTime0), zonedDateTime0.getZone(), null).toInstant() : ZonedDateTime.ofLocal(LocalDateTime.of(zonedDateTime0.toLocalDate().plusDays(1L), localTime0), zonedDateTime0.getZone(), null).toInstant();
                ibuq.e(instant2, "toInstant(...)");
                instant1 = instant2;
            }
            if(instant0.isAfter(instant1)) {
                v5 = (int)(instant1.until(instant0, ChronoUnit.MILLIS) / v3);
                if(v5 == v1) {
                    ++v5;
                }
                instant3 = instant1.plusMillis(((long)v5) * v3);
                ibuq.e(instant3, "plusMillis(...)");
            }
            else {
                instant3 = instant1;
                v5 = 0;
            }
            Instant instant4 = instant3.plusMillis(v3);
            ibuq.e(instant4, "plusMillis(...)");
            if(instant0.isBefore(instant3)) {
                v6 = 0L;
            }
            else {
                v6 = instant0.isBefore(instant4) ? ((long)(((double)instant3.until(instant0, ChronoUnit.MILLIS)) / ((double)v3) * 100.0)) : 100L;
            }
            hfuo hfuo1 = (ekug0.c == null ? ekub.a : ekug0.c).e;
            ibuq.e(hfuo1, "getConstraintsForStagesList(...)");
            Iterator iterator1 = hfuo1.iterator();
            while(true) {
                if(iterator1.hasNext()) {
                    Object object3 = iterator1.next();
                    ektz ektz0 = (ektz)object3;
                    instant5 = instant0;
                    if(v6 >= ((long)(ektz0.c == null ? ekud.a : ektz0.c).c) && v6 < ((long)(ektz0.c == null ? ekud.a : ektz0.c).d)) {
                        object4 = object3;
                        break;
                    }
                    else {
                        instant0 = instant5;
                        v6 = v6;
                        continue;
                    }
                }
                instant5 = instant0;
                object4 = null;
                break;
            }
            ektz ektz1 = (ektz)object4;
            if(ektz1 == null) {
                hfuo hfuo2 = (ekug0.c == null ? ekub.a : ekug0.c).e;
                ibuq.e(hfuo2, "getConstraintsForStagesList(...)");
                ektz1 = (ektz)ibpo.W(hfuo2);
            }
            int v7 = (ekug0.c == null ? ekub.a : ekug0.c).e.indexOf(ektz1) + 1;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ekul.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ektz1.getClass();
            ((ekul)hftv0).c = ektz1;
            ((ekul)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((ekul)hftv1).b |= 2;
            ((ekul)hftv1).d = v5;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ekul ekul0 = (ekul)hftp0.b_message;
            ekul0.b |= 4;
            ekul0.e = v7;
            long v8 = instant5.toEpochMilli();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ekul ekul1 = (ekul)hftp0.b_message;
            ekul1.b |= 8;
            ekul1.f = v8;
            long v9 = instant1.toEpochMilli();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((ekul)hftv2).b |= 16;
            ((ekul)hftv2).g = v9;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ekul ekul2 = (ekul)hftp0.b_message;
            ekul2.b |= 0x20;
            ekul2.h = v3;
            hfuo hfuo3 = (ekug0.c == null ? ekub.a : ekug0.c).e;
            ibuq.e(hfuo3, "getConstraintsForStagesList(...)");
            boolean z = ibuq.m(ektz1, ibpo.W(hfuo3));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ekul ekul3 = (ekul)hftp0.b_message;
            ekul3.b |= 0x40;
            ekul3.i = z;
            ProtoLiteMessage hftv3 = hftp0.N_build();
            ibuq.e(hftv3, "build(...)");
            ekul ekul4 = (ekul)hftv3;
            int v10 = ekul4.d;
            if(v10 >= (ekug0.c == null ? ekub.a : ekug0.c).f) {
                ((ggtj)ektw.b.h()).X("Not scheduling model task due to exceeding (%s) repeatFor (%s): %s", Integer.valueOf(v10), Integer.valueOf((ekug0.c == null ? ekub.a : ekug0.c).f), (ekug0.c == null ? ekub.a : ekug0.c).d);
            }
            else {
                clkn clkn0 = new clkn();
                clkn0.w(new ibuk(ModelTaskService.class).b());
                clkn0.t((ekug0.c == null ? ekub.a : ekug0.c).d);
                clkn0.p(cllj.a);
                clkn0.p = true;
                clkn0.v(1);
                Bundle bundle0 = new Bundle();
                ibuq.f(ekul4, "taskMetadata");
                Bundle bundle1 = new Bundle();
                ektz ektz2 = ekul4.c == null ? ektz.a : ekul4.c;
                bundle1.putInt("csbstart", (ektz2.c == null ? ekud.a : ektz2.c).c);
                ektz ektz3 = ekul4.c == null ? ektz.a : ekul4.c;
                bundle1.putInt("csbend", (ektz3.c == null ? ekud.a : ektz3.c).d);
                ektz ektz4 = ekul4.c == null ? ektz.a : ekul4.c;
                if(((ektz4.d == null ? ekty.a : ektz4.d).b & 1) != 0) {
                    ektz ektz5 = ekul4.c == null ? ektz.a : ekul4.c;
                    bundle1.putInt("csbnetwork", (ektz5.d == null ? ekty.a : ektz5.d).c);
                }
                ektz ektz6 = ekul4.c;
                ektz ektz7 = ektz6 == null ? ektz.a : ektz6;
                if(((ektz7.d == null ? ekty.a : ektz7.d).b & 2) != 0) {
                    if(ektz6 == null) {
                        ektz6 = ektz.a;
                    }
                    bundle1.putInt("csbcharging", (ektz6.d == null ? ekty.a : ektz6.d).d);
                }
                ektz ektz8 = ekul4.c;
                ektz ektz9 = ektz8 == null ? ektz.a : ektz8;
                if(((ektz9.d == null ? ekty.a : ektz9.d).b & 4) != 0) {
                    if(ektz8 == null) {
                        ektz8 = ektz.a;
                    }
                    bundle1.putInt("csbidleness", (ektz8.d == null ? ekty.a : ektz8.d).e);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("pCount", ekul4.d);
                bundle2.putInt("constraintStage", ekul4.e);
                bundle2.putLong("scheduleTimeTs", ekul4.f);
                bundle2.putLong("firstWindowStart", ekul4.g);
                bundle2.putLong("periodMillis", ekul4.h);
                bundle2.putBoolean("isLastStage", ekul4.i);
                bundle2.putBundle("constraintsStaged", bundle1);
                bundle0.putBundle("taskMetadata", bundle2);
                clkn0.u = bundle0;
                Instant instant6 = Instant.ofEpochMilli(ekul4.g).plusMillis(ekul4.h * ((long)ekul4.d));
                ibuq.e(instant6, "plusMillis(...)");
                ektz ektz10 = ekul4.c == null ? ektz.a : ekul4.c;
                Instant instant7 = instant6.plusMillis(((long)(ektz10.c == null ? ekud.a : ektz10.c).c) * ekul4.h / 100L);
                ibuq.e(instant7, "plusMillis(...)");
                ektz ektz11 = ekul4.c == null ? ektz.a : ekul4.c;
                Instant instant8 = instant6.plusMillis(((long)(ektz11.c == null ? ekud.a : ektz11.c).d) * ekul4.h / 100L);
                ibuq.e(instant8, "plusMillis(...)");
                Instant instant9 = Instant.now();
                ibuq.e(instant9, "instant(...)");
                long v11 = Math.max(0L, instant9.until(instant7, ChronoUnit.SECONDS));
                clkn0.e(v11, Math.max(v11 + 1L, instant9.until(instant8, ChronoUnit.SECONDS)));
                if(ekul4.i) {
                    ektz ektz12 = ekul4.c == null ? ektz.a : ekul4.c;
                    v12 = (ektz12.d == null ? ekty.a : ektz12.d).c;
                }
                else {
                    v12 = 2;
                }
                ektz ektz13 = ekul4.c == null ? ektz.a : ekul4.c;
                clkn0.y(v12, (ektz13.d == null ? ekty.a : ektz13.d).c);
                if(ekul4.i) {
                    ektz ektz14 = ekul4.c == null ? ektz.a : ekul4.c;
                    v13 = (ektz14.d == null ? ekty.a : ektz14.d).d;
                }
                else {
                    v13 = 0;
                }
                ektz ektz15 = ekul4.c == null ? ektz.a : ekul4.c;
                clkn0.x(v13, (ektz15.d == null ? ekty.a : ektz15.d).d);
                if(ekul4.i) {
                    ektz ektz16 = ekul4.c == null ? ektz.a : ekul4.c;
                    v14 = (ektz16.d == null ? ekty.a : ektz16.d).e;
                }
                else {
                    v14 = 0;
                }
                ektz ektz17 = ekul4.c == null ? ektz.a : ekul4.c;
                clkn0.f(v14, (ektz17.d == null ? ekty.a : ektz17.d).e);
                clko clko0 = clkn0.a();
                ((ggtj)ektw.b.h()).B("Scheduling model task: %s", (ekug0.c == null ? ekub.a : ekug0.c).d);
                cljp0.f(clko0);
            }
        }
        return ibom.a;
    }
}


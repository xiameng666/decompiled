import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.backup.BackUpNowConfig;
import com.google.android.gms.backup.extension.backup.CustomBackupRequest;
import j..time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class ashb {
    public static final baun a;
    private static final Map b;
    private final BackUpNowConfig c;
    private final asfu d;
    private final Context e;
    private final aqnb f;

    static {
        ashb.a = aqql.a("CustomBackupsManager");
        ashb.b = ibpz.i(new ibns[]{new ibns(aqfx.c, "com.google.android.apps.photos"), new ibns(aqfx.i, "com.google.android.gms")});
    }

    public ashb(BackUpNowConfig backUpNowConfig0, asfu asfu0, Context context0) {
        ibuq.f(backUpNowConfig0, "backUpNowConfig");
        ibuq.f(context0, "context");
        aqnb aqnb0 = aqnb.f(context0, new bblp(1, 9), true);
        ibuq.f(backUpNowConfig0, "backUpNowConfig");
        ibuq.f(context0, "context");
        super();
        this.c = backUpNowConfig0;
        this.d = asfu0;
        this.e = context0;
        this.f = aqnb0;
    }

    public final int a(asfv asfv0, asgb asgb0, asgc asgc0, List list0) {
        String s2;
        ArrayList arrayList0;
        ibuq.f(list0, "packagesToBackup");
        gibh gibh0 = (gibh)((ProtoLiteMessage)gibj.a).v_newBuilder();
        if(!gibh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gibh0).ensureMutable();
        }
        gibj gibj0 = (gibj)gibh0.b_message;
        gibj0.b |= 1;
        gibj0.c = true;
        for(Object object0: list0) {
            gibh0.a(((String)object0));
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gibj gibj1 = (gibj)((ProtoLiteBuilder)gibh0).N_build();
        gibj1.getClass();
        ghys0.L = gibj1;
        ghys0.c |= 0x8000;
        ghys ghys1 = (ghys)hftp0.N_build();
        this.d.e(ghys1, ghyr.T);
        if(!list0.isEmpty()) {
            try {
                CountDownLatch countDownLatch0 = new CountDownLatch(1);
                AtomicReference atomicReference0 = new AtomicReference(ibps.a);
                asha asha0 = new asha(atomicReference0, countDownLatch0);
                aqvc aqvc0 = aqvd.a();
                aqvc0.c(10);
                aqvd aqvd0 = aqvc0.a();
                this.f.c(asha0, aqvd0);
                try {
                    if(countDownLatch0.await(hqil.f(), TimeUnit.SECONDS)) {
                        goto label_37;
                    }
                }
                catch(InterruptedException interruptedException0) {
                    ashb.a.g("Interrupted while waiting", interruptedException0, new Object[0]);
                    this.d.g(5);
                    Thread.currentThread().interrupt();
                }
                throw new TimeoutException();
            label_37:
                List list1 = (List)atomicReference0.get();
                if(list1 == null) {
                    arrayList0 = null;
                }
                else {
                    arrayList0 = new ArrayList();
                    for(Object object1: list1) {
                        String s = (String)ashb.b.get(((aqfx)object1));
                        if(s != null) {
                            arrayList0.add(s);
                        }
                    }
                }
            }
            catch(TimeoutException unused_ex) {
                this.d.g(4);
                return 15;
            }
            if(arrayList0 == null) {
                ashb.a.f("Unable to retrieve disabled packages so not running custom backup", new Object[0]);
                this.d.g(3);
                return 29001;
            }
            asfu asfu0 = this.d;
            asfu0.g(2);
            List list2 = ibpo.ae(list0);
            ArrayList arrayList1 = new ArrayList();
            for(Object object2: list2) {
                if(!arrayList0.contains(((String)object2))) {
                    arrayList1.add(object2);
                }
            }
            if(arrayList1.isEmpty()) {
                ashb.a.j("No custom backup packages have user consent", new Object[0]);
                return 29013;
            }
            baun baun0 = ashb.a;
            baun0.j("Packages with user consent: %s", new Object[]{arrayList1});
            asgz asgz0 = new asgz();
            if(hqil.a.j().Z()) {
                baun0.h("Running backups by intent.", new Object[0]);
                ArrayList arrayList2 = new ArrayList();
                for(Object object3: arrayList1) {
                    arrayList2.add(ashb.c(((String)object3)));
                }
                baun0.j("Custom backup intents: %s", new Object[]{arrayList2});
                if(arrayList2.isEmpty()) {
                    baun0.j("No allowed backup services found after filtering.", new Object[0]);
                    return 29013;
                }
                asgb0.c(arrayList2.size());
                for(Object object4: arrayList2) {
                    Intent intent0 = (Intent)object4;
                    ComponentName componentName0 = intent0.getComponent();
                    if(componentName0 != null) {
                        String s1 = componentName0.getPackageName();
                        if(s1 != null) {
                            s2 = s1;
                            goto label_93;
                        }
                    }
                    s2 = intent0.getPackage();
                label_93:
                    batl.s(s2);
                    CustomBackupRequest customBackupRequest0 = this.b();
                    aqzt aqzt0 = aqzs.a(this.e);
                    int v = new asgu(this.e, s2, intent0, customBackupRequest0, asfu0, asgz0, aqzt0, this.c.a).a(asfv0, asgb0, asgc0);
                    Instant instant0 = Instant.now();
                    ibuq.e(instant0, "now(...)");
                    aqkm.b(s2, instant0, aqfv.d, this.e);
                    if(hqil.m() && v == 29002) {
                        return 29002;
                    }
                }
                return 29000;
            }
            baun0.h("Running backups with legacy method.", new Object[0]);
            asgb0.c(arrayList1.size());
            for(Object object5: arrayList1) {
                Intent intent1 = ashb.c(((String)object5));
                CustomBackupRequest customBackupRequest1 = this.b();
                aqzt aqzt1 = aqzs.a(this.e);
                int v1 = new asgu(this.e, ((String)object5), intent1, customBackupRequest1, asfu0, asgz0, aqzt1, this.c.a).a(asfv0, asgb0, asgc0);
                Instant instant1 = Instant.now();
                ibuq.e(instant1, "now(...)");
                aqkm.b(((String)object5), instant1, aqfv.d, this.e);
                if(hqil.m() && v1 == 29002) {
                    return 29002;
                }
            }
            return 29000;
        }
        ashb.a.j("No packages provided for backup.", new Object[0]);
        return 29013;
    }

    private final CustomBackupRequest b() {
        return new CustomBackupRequest(((int)this.c.a), this.c.k);
    }

    private static final Intent c(String s) {
        Intent intent0 = new Intent().setPackage(s).setAction("com.google.android.gms.backup.action.CUSTOM_BACKUP");
        ibuq.e(intent0, "setAction(...)");
        return intent0;
    }
}


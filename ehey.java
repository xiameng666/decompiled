import android.accounts.Account;
import android.content.Context;
import java.util.List;

public final class ehey extends ehel {
    private final egzp h;
    private final ehft i;

    public ehey(Context context0, ehfu ehfu0, ehco ehco0, ehab ehab0, ehim ehim0, egzp egzp0, ehft ehft0, ehfj ehfj0) {
        super(context0, girk.c, ehfu0, ehab0, ehim0, ehco0, ehfj0);
        this.h = egzp0;
        this.i = ehft0;
    }

    @Override  // ehel
    protected final void e(egzv egzv0, List list0) {
        ehey.j(egzv0);
        this.d(this.f.a(ehct.b(egzv0, list0, ((ehiv)this.f.e).C), egzv0.a), egzv0);
    }

    @Override  // ehel
    protected final void f(egzv egzv0) {
        this.i(egzv0, true);
    }

    private final void i(egzv egzv0, boolean z) {
        egzv egzv2;
        egzv egzv1;
        try {
            ehey.j(egzv0);
            goto label_5;
        }
        catch(iapl iapl0) {
            try {
                this.e.h(this.a, gjgi.b, false, 9, 1);
                throw iapl0;
            label_5:
                this.d(this.f.a(ehct.a(egzv0, ((ehiv)this.f.e).C), egzv0.a), egzv0);
                return;
            label_8:
                if(z) {
                    goto label_9;
                }
                throw iapl1;
            }
            catch(iapl iapl1) {
                goto label_8;
            }
        }
    label_9:
        iaph iaph0 = iapl1.a.t;
        if(this.g.c(eggf.c, iaph0.r, iapl1.a.u) != 3 && (iaph0 != iaph.j || !iapl1.getMessage().contains("FingerprintMismatch"))) {
            egiv.R();
            boolean z1 = hwzc.a.c().at();
            Boolean.valueOf(z1).getClass();
            if(!z1 || iaph0 != iaph.d) {
                throw iapl1;
            }
        }
        egig.k("FSA2_UpdateContactUpSyncer", "Error when update contact to server, doing getContact() now...");
        try {
            ehco ehco0 = this.f;
            String s = egzv0.a;
            gssr gssr0 = ehco0.e(ehig.a(s));
            ehif ehif0 = ehco0.d;
            ehif0.a();
            try {
                gssv gssv0 = ehco0.b.b(ehco0.a, gssr0);
                ehif0.c("FSA_getPerson", 1, ehcw.a(((MessageLite)gssv0)));
                if(gssv0 == null || gssv0.b.size() <= 0) {
                    egig.b("FSA2_ContactSyncGrpc", "Unexpected null result returned by getPeople API");
                    throw new ehfd(3);
                }
                gstw gstw0 = (gstw)gssv0.b.get(0);
                if((1 & gstw0.b) == 0 || ((gstw0.c == null ? hhna.a : gstw0.c).b != iaph.a.r || (gstw0.b & 2) == 0)) {
                    egig.d("FSA2_ContactSyncGrpc", "Failed to getPerson: %s", new Object[]{((ProtoLiteMessage)gssv0).toString()});
                    throw new ehfd(3);
                }
                egzv1 = ehcu.a((gstw0.d == null ? gdmq.a : gstw0.d), s, ehco0.j, ehco0.k, ((ehiv)ehco0.e).C);
            }
            catch(iapl iapl2) {
                ehco0.d.d("FSA_getPerson", iapl2);
                throw iapl2;
            }
        }
        catch(Exception exception0) {
            ehim ehim0 = this.e;
            ehim0.h(girk.c, gjgi.b, true, 1, 1);
            ehim0.h(girk.c, gjgi.b, true, 2, 1);
            throw exception0;
        }
        if(egzv1 != null) {
            ehhm ehhm0 = ehhn.a();
            ehhm0.b(egzv1);
            ehhm0.a = egzv0;
            ehhn ehhn0 = ehhm0.a();
            this.c.c(this.b, ehhn0, 2);
            this.d.f();
            egiv.R();
            long v = hwzc.a.c().J();
            Long long0 = v;
            long0.getClass();
            if(v > 0L) {
                try {
                    this.h.d();
                    long0.getClass();
                    Thread.sleep(v);
                    this.h.d();
                }
                catch(InterruptedException interruptedException0) {
                    egiv.R();
                    ehim ehim1 = this.e;
                    ehim1.r(gjgi.b, girk.c, "InterruptedException_MergeApiContactToLocal", interruptedException0);
                    ++((ehiv)ehim1).a.stats.numIoExceptions;
                    return;
                }
            }
            ehbp ehbp0 = this.i.a;
            Account account0 = this.i.b;
            ggfp ggfp0 = ehft.l();
            try(ehae ehae0 = ehae.c(this.i.f, ehbp0, account0, ggfp0, "sourceid=?", new String[]{egzv0.a})) {
                List list0 = this.i.i(ehae0);
                egzv2 = list0.size() <= 0 ? null : ((egzv)list0.get(0));
            }
            if(egzv2 != null) {
                this.i(egzv2, false);
            }
        }
    }

    private static void j(egzv egzv0) {
        if(hxcc.f()) {
            int v = (int)hxcc.c();
            ehhz.b(egzv0, v);
            if(ehhz.c(egzv0.K, v)) {
                throw new iapl(iaph.i.a().f("Resource has been exhausted (e.g. check quota)."));
            }
        }
        ehhz.a(egzv0, ((int)hxcc.b()));
    }
}


import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AdvertisementOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import com.google.android.gms.smartdevice.quickstart.AccountTransferOptions;
import com.google.android.gms.smartdevice.quickstart.AccountTransferResult;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public final class eqzw extends eqzx {
    private static final baun c;
    private final AccountTransferOptions d;
    private final eqxa e;
    private final erad f;
    private final eray g;
    private final CountDownLatch h;
    private BootstrapCompletionResult i;

    static {
        eqzw.c = new erqc(new String[]{"AccountTransferOperation"});
    }

    public eqzw(AccountTransferOptions accountTransferOptions0, eraf eraf0, eqxa eqxa0, erad erad0, eray eray0, azug azug0) {
        super("AccountTransferOperation", eraf0, azug0);
        this.h = new CountDownLatch(1);
        this.d = accountTransferOptions0;
        this.e = eqxa0;
        this.f = erad0;
        this.g = eray0;
    }

    @Override  // eqzx
    public final void b() {
        super.b();
        eqzw.c.d("Cancelling AccountTransferOperation", new Object[0]);
        this.h.countDown();
    }

    @Override  // eqzx
    protected final void c(BootstrapCompletionResult bootstrapCompletionResult0) {
        eqzw.c.h("onAccountTransferCompleted() with %d accounts!", new Object[]{((int)(bootstrapCompletionResult0.c == null ? 0 : bootstrapCompletionResult0.c.size()))});
        this.i = bootstrapCompletionResult0;
        this.h.countDown();
    }

    @Override  // eqzx
    protected final void d(Context context0) {
        BootstrapOptions bootstrapOptions0;
        AccountTransferOptions accountTransferOptions0 = this.d;
        if(accountTransferOptions0.b) {
            bootstrapOptions0 = eqsh.e(context0, eqzw.c);
        }
        else {
            ArrayList arrayList0 = new ArrayList();
            String s = Build.MODEL;
            AdvertisementOptions advertisementOptions0 = new AdvertisementOptions(0);
            ArrayList arrayList1 = new ArrayList();
            bootstrapOptions0 = epxk.a(2, arrayList0, eqsh.a(context0), s, true, -1L, false, false, null, null, advertisementOptions0, arrayList1);
        }
        Intent intent0 = accountTransferOptions0.a;
        if(intent0 != null) {
            eqzw.c.d("PostTransferAction intent: %s", new Object[]{intent0});
            PostTransferAction postTransferAction0 = new PostTransferAction();
            postTransferAction0.b = intent0.toUri(1);
            postTransferAction0.a.add(Integer.valueOf(2));
            bootstrapOptions0.aj(postTransferAction0);
        }
        this.e.c(bootstrapOptions0);
        eqzw.c.d("Waiting for account transfer result...", new Object[0]);
        try {
            this.h.await();
        }
        catch(InterruptedException unused_ex) {
            throw new cjuh(8, "Interrupted while waiting for account transfer result");
        }
        this.h();
        if(hyja.c()) {
            this.b.e(this, Status.b);
        }
        int v = eqri.a(this.i.k);
        if(!hyis.y()) {
            eray eray0 = this.g;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjjb.a).v_newBuilder();
            int v1 = eqri.a(this.i.c);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gjjb)hftv0).b |= 1;
            ((gjjb)hftv0).c = v1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjjb gjjb0 = (gjjb)hftp0.b_message;
            gjjb0.b |= 2;
            gjjb0.d = v;
            eray0.m(((gjjb)hftp0.N_build()));
        }
        BootstrapCompletionResult bootstrapCompletionResult0 = this.i;
        BootstrapAccount bootstrapAccount0 = bootstrapCompletionResult0.d;
        ArrayList arrayList2 = bootstrapCompletionResult0.c == null ? new ArrayList() : ggia.b(bootstrapCompletionResult0.c);
        if(bootstrapCompletionResult0.k != null) {
            int v2 = arrayList2.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                BootstrapAccount bootstrapAccount1 = (BootstrapAccount)arrayList2.get(v3);
                ArrayList arrayList3 = this.i.k;
                batl.s(arrayList3);
                if(arrayList3.size() > 0) {
                    BootstrapAccount bootstrapAccount2 = (BootstrapAccount)arrayList3.get(0);
                    bootstrapAccount1.q(bootstrapAccount2.g);
                    bootstrapAccount1.r(bootstrapAccount2.h);
                    eqzw.c.h("Found name for %s: %s", new Object[]{bootstrapAccount1.b, String.valueOf(bootstrapAccount1.g)});
                }
            }
        }
        AccountTransferResult accountTransferResult0 = new AccountTransferResult(arrayList2, v, null, this.i.b, this.i.k, this.i.l, (bootstrapAccount0 == null ? null : bootstrapAccount0.b));
        this.f.a(Status.b, accountTransferResult0);
    }

    @Override  // eqzx
    protected final void e(Status status0) {
        this.f.a(status0, null);
    }

    @Override  // eqzx
    protected final void g(int v) {
        super.g(v);
        this.h.countDown();
    }
}


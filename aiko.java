import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.authzen.transaction.BaseTransactionActivity.2;
import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import java.util.concurrent.TimeUnit;

public abstract class aiko extends xob implements aili {
    private fcfe j;
    private aikn k;
    protected String l;
    public hhqx m;
    protected hhqy n;
    public long o;
    protected long p;
    protected long q;
    protected long r;
    public String s;
    protected BroadcastReceiver t;
    public boolean u;
    protected boolean v;
    public int w;
    public static final baun x;
    private final ailf y;

    static {
        aiko.x = new baun(new String[]{"BaseTransactionActivity"});
    }

    public aiko() {
        this.v = false;
        new aild();
        this.y = ailf.b(this);
    }

    private final hhqy a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhqy.a).v_newBuilder();
        long v = this.r;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hhqy)hftv0).b |= 2;
        ((hhqy)hftv0).d = v;
        long v1 = this.p;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhqy hhqy0 = (hhqy)hftp0.b_message;
        hhqy0.b |= 8;
        hhqy0.g = v1;
        return (hhqy)hftp0.N_build();
    }

    protected abstract void g(Bundle arg1);

    public static hhqx o(Intent intent0) {
        try {
            byte[] arr_b = intent0.getByteArrayExtra("tx_request");
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhqx.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (hhqx)hftv0;
        }
        catch(hfur hfur0) {
            throw new RuntimeException("Unable to parse TxRequest", hfur0);
        }
    }

    @Override  // xoi
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        this.l = intent0.getStringExtra("account");
        this.m = aiko.o(intent0);
        this.k = new aikn(this.m, new aikm(this));
        aild.h(this.m.c.toByteArray(), 5, this);
        long v = 0L;
        if(bundle0 == null) {
            this.q = SystemClock.elapsedRealtime();
            this.r = System.currentTimeMillis();
            this.o = this.getIntent().getLongExtra("creation_elapsed_time", this.q);
            this.p = this.getIntent().getLongExtra("creation_wall_time", this.r);
            this.u = false;
            this.w = 40;
            this.n = this.a();
            if(this.getIntent().getLongExtra("proximity_verified_time", 0L) != 0L) {
                this.r(602, false, Integer.valueOf(0));
            }
        }
        else {
            this.v = bundle0.getBoolean("alarm_set");
            this.q = bundle0.getLong("activity_start_elapsed_time");
            this.r = bundle0.getLong("activity_start_wall_time");
            this.o = bundle0.getLong("creation_elapsed_time");
            this.p = bundle0.getLong("creation_wall_time");
            this.u = bundle0.getBoolean("reply_sent");
            this.w = ailg.b(bundle0.getInt("transaction_state"));
            try {
                byte[] arr_b = bundle0.getByteArray("tx_response");
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhqy.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                this.n = (hhqy)hftv0;
            }
            catch(hfur hfur0) {
                aiko.x.g("Failed to parse TxResponse", hfur0, new Object[0]);
                this.n = this.a();
            }
        }
        if(!this.v) {
            ailf ailf0 = this.y;
            hhqx hhqx0 = this.m;
            long v1 = this.getIntent().getLongExtra("creation_elapsed_time", SystemClock.elapsedRealtime());
            long v2 = aild.f(hhqx0);
            if(v2 >= 0L) {
                v = v2;
            }
            if(hprn.c()) {
                long v3 = TimeUnit.MILLISECONDS.toSeconds(v);
                Bundle bundle1 = new Bundle();
                bundle1.putLong("creation_elapsed_time", v1);
                clkn clkn0 = new clkn();
                clkn0.j = "com.google.android.gms.auth.authzen.AuthzenGcmTaskService";
                clkn0.t("expired:" + v1);
                clkn0.p = true;
                clkn0.e(v3, 60L + v3);
                clkn0.v(1);
                clkn0.u = bundle1;
                clko clko0 = clkn0.a();
                cljp.a(ailf0.a).f(clko0);
            }
            else {
                PendingIntent pendingIntent0 = ailf0.a(v1);
                aild.h(hhqx0.c.toByteArray(), 6, ailf0.a);
                new bbib(ailf0.a).d("AuthzenActivityAlarm", 2, v1 + v, pendingIntent0, "com.google.android.gms");
            }
            Object[] arr_object = {aild.b(hhqx0.c.toByteArray()), TimeUnit.MILLISECONDS.toSeconds(v)};
            ailf.b.h("Scheduling activity-based prompt (txId=%s) to be killed in %s seconds.", arr_object);
            hhqw hhqw0 = this.m.e == null ? hhqw.b : this.m.e;
            if((hhpy.b(hhqw0.h) == null ? hhpy.a : hhpy.b(hhqw0.h)) != hhpy.c) {
                ailf0.f(this.getIntent());
            }
        }
        this.s = ailf.d(this.m);
        this.t = new BaseTransactionActivity.2(this);
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("AUTHZEN_CLOSE_ACTIVITY");
        intentFilter0.addAction("AUTHZEN_REPLACE_ACTIVITY");
        intentFilter0.addAction("AUTHZEN_UPDATE_ACTIVITY");
        jwe.c(this, this.t, intentFilter0, "com.google.android.gms.permission.INTERNAL_BROADCAST", null, 2);
        IntentFilter intentFilter1 = new IntentFilter();
        intentFilter1.addAction("AUTHZEN_ACTIVITY_EXPIRED");
        intentFilter1.addCategory("creation_elapsed_time:" + this.o);
        jwe.c(this, this.t, intentFilter1, "com.google.android.gms.permission.INTERNAL_BROADCAST", null, 2);
        if(aiir.a().booleanValue()) {
            this.setTheme(0x7F160082);  // style:AuthzenMaterialTheme
        }
        this.g(bundle0);
        fcfe fcfe0 = fcfo.d(this);
        this.j = fcfe0;
        fcfe0.k(this.k);
        Object[] arr_object1 = {this.getClass().getSimpleName(), baun.q(this.l), aild.b(this.m.c.toByteArray())};
        aiko.x.h("Created activity (%s) for user %s (txId=%s...)", arr_object1);
        byte[] arr_b1 = this.m.c.toByteArray();
        Intent intent1 = IntentOperation.getStartIntent(AppContextProvider.a(), TransactionReplyIntentOperation.class, "com.google.android.gms.auth.authzen.operation.TRANSACTION_STATE_SYNC_REQUEST");
        intent1.putExtra("transaction_id", arr_b1);
        this.startService(intent1);
    }

    @Override  // xoi
    public void onDestroy() {
        super.onDestroy();
        if(!this.u) {
            this.p(hhqj.a);
        }
        ailf ailf0 = this.y;
        long v = this.getIntent().getLongExtra("creation_elapsed_time", 0L);
        if(hprn.c()) {
            ailf.b.d("Cancel dismiss notification task", new Object[0]);
            cljp.a(ailf0.a).d("expired:" + v, "com.google.android.gms.auth.authzen.AuthzenGcmTaskService");
        }
        else {
            PendingIntent pendingIntent0 = ailf0.a(v);
            new bbib(ailf0.a).a(pendingIntent0);
        }
        BroadcastReceiver broadcastReceiver0 = this.t;
        if(broadcastReceiver0 != null) {
            this.unregisterReceiver(broadcastReceiver0);
        }
        aikn aikn0 = this.k;
        aikn0.a = null;
        fcfe fcfe0 = this.j;
        if(fcfe0 != null) {
            fcfe0.m(aikn0);
        }
    }

    @Override  // xnb
    protected void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putLong("activity_start_elapsed_time", this.q);
        bundle0.putLong("activity_start_wall_time", this.r);
        bundle0.putLong("creation_elapsed_time", this.o);
        bundle0.putLong("creation_wall_time", this.p);
        bundle0.putBoolean("alarm_set", this.v);
        bundle0.putBoolean("reply_sent", this.u);
        bundle0.putInt("transaction_state", this.w);
        bundle0.putByteArray("tx_response", this.n.toBytesArray());
    }

    public final void p(hhqj hhqj0) {
        aild.h(this.m.c.toByteArray(), 14, this);
        this.u = true;
        byte[] arr_b = this.getIntent().getExtras().getByteArray("encryption_key_handle");
        if(arr_b != null) {
            String s = this.l;
            hhqx hhqx0 = this.m;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhqy.a).w(((ProtoLiteMessage)this.n));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hhqy)hftp0.b_message).c = hhqj0.j;
            ((hhqy)hftp0.b_message).b |= 1;
            long v = System.currentTimeMillis();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhqy hhqy0 = (hhqy)hftp0.b_message;
            hhqy0.b |= 4;
            hhqy0.e = v;
            this.n = (hhqy)hftp0.N_build();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhqu.a).v_newBuilder();
            hhqx hhqx1 = this.m;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            hhqx1.getClass();
            ((hhqu)hftv0).c = hhqx1;
            ((hhqu)hftv0).b |= 1;
            hhqy hhqy1 = this.n;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            hhqu hhqu0 = (hhqu)hftp1.b_message;
            hhqy1.getClass();
            hhqu0.d = hhqy1;
            hhqu0.b |= 2;
            byte[] arr_b1 = ((hhqu)hftp1.N_build()).toBytesArray();
            this.startService(TransactionReplyIntentOperation.b(s, arr_b, hhqx0, new hhts(hhtt.d, arr_b1)));
        }
        aztt aztt0 = new aztt(this);
        aztt0.c(fcfo.a);
        new aiip(this, aztt0.a(), fcfo.b, fcfo.c).a("/dismiss-wear-prompt/" + this.m.c.toStringUtf8()).a();
    }

    public final void q(int v, boolean z) {
        this.r(v, z, null);
    }

    protected final void r(int v, boolean z, Integer integer0) {
        long v1 = SystemClock.elapsedRealtime() - this.q;
        aiko.x.h("Adding UiEvent: " + Integer.toString(v - 2) + ", replySent: " + z + ", timeSinceReceived: " + v1 + ", proximitySensorResult: " + integer0, new Object[0]);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhre.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hhre)hftv0).b |= 1;
        ((hhre)hftv0).c = v1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hhre)hftv1).e = v - 2;
        ((hhre)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhre hhre0 = (hhre)hftp0.b_message;
        hhre0.b |= 2;
        hhre0.d = z;
        if(integer0 != null) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhqf.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hhqf hhqf0 = (hhqf)hftp1.b_message;
            hhqf0.b |= 1;
            hhqf0.c = 0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhre hhre1 = (hhre)hftp0.b_message;
            hhqf hhqf1 = (hhqf)hftp1.N_build();
            hhqf1.getClass();
            hhre1.f = hhqf1;
            hhre1.b |= 8;
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hhqy.a).w(((ProtoLiteMessage)this.n));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hhqy hhqy0 = (hhqy)hftp2.b_message;
        hhre hhre2 = (hhre)hftp0.N_build();
        hhre2.getClass();
        hfuo hfuo0 = hhqy0.f;
        if(!hfuo0.c()) {
            hhqy0.f = ProtoLiteMessage.E(hfuo0);
        }
        hhqy0.f.add(hhre2);
        this.n = (hhqy)hftp2.N_build();
    }

    public final void s(hhqj hhqj0, int v) {
        this.q(v, true);
        this.p(hhqj0);
    }
}


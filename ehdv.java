import android.accounts.Account;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;

public abstract class ehdv implements ehdm {
    private int A;
    private String a;
    protected final String b;
    protected final juo c;
    protected final bayn d;
    protected final Context e;
    protected final String f;
    protected final int g;
    protected final boolean h;
    protected final efur i;
    protected final String j;
    protected final ehim k;
    protected boolean l;
    protected boolean m;
    protected gfsx n;
    protected int o;
    protected int p;
    protected String q;
    protected String r;
    protected long s;
    private gjhn t;
    private final int u;
    private final String v;
    private boolean w;
    private long x;
    private final gfsx y;
    private final boolean z;

    protected ehdv(Context context0, Account account0, efur efur0, ehim ehim0, int v, int v1, String s) {
        this.l = false;
        this.m = false;
        this.n = gfqx.a;
        this.o = -1;
        this.p = -1;
        this.a = null;
        this.q = null;
        this.r = null;
        this.s = 0L;
        this.t = gjhn.a;
        this.A = 1;
        this.w = false;
        this.x = 0L;
        this.e = context0;
        this.i = efur0;
        String s1 = account0.name;
        this.j = s1;
        this.k = ehim0;
        this.u = v;
        this.g = v1;
        this.b = s;
        this.y = egik.f();
        hxdh hxdh0 = hxdh.a;
        this.h = hxdh0.c().F();
        this.f = ehdo.b(s1, true);
        bayn bayn0 = bayn.f(context0);
        this.d = bayn0;
        this.z = hxdh0.c().E();
        juo juo0 = new juo(context0);
        juo0.R(account0.name);
        juo0.s(0x7F080D3E);
        juo0.h(hxdh0.c().x());
        juo0.p(true);
        juo0.V(System.currentTimeMillis());
        juo0.l(ehdv.v(context0, this.h()));
        this.c = juo0;
        if(hxdh0.c().v()) {
            juo0.K(true);
        }
        PendingIntent pendingIntent0 = ehdv.v(context0, this.i());
        if(pendingIntent0 != null) {
            juo0.h = pendingIntent0;
        }
        String s2 = ehdo.a();
        if(hxdh.h()) {
            int v2 = (int)hxdh.b();
            if(v2 > 0) {
                for(int v3 = v2 - 1; true; --v3) {
                    String s3 = "com.google.android.gms.people.sync.focus.notification.fsa2_channel.id";
                    if(v3 < 0) {
                        break;
                    }
                    if(v3 != 0) {
                        s3 = "com.google.android.gms.people.sync.focus.notification.fsa2_channel.id" + Integer.toString(v3);
                    }
                    if(bayn0.c(s3) != null) {
                        bayn0.s(s3);
                        break;
                    }
                }
                if(bayn0.c(s2) == null) {
                    ehdt.a(((int)hxdh0.c().i()), context0, bayn0, s2);
                }
            }
            else {
                egig.b(s, "Flag next_channel_version should be positive.");
            }
        }
        else if(bayn0.c(s2) == null) {
            ehdt.a(3, context0, bayn0, s2);
        }
        this.v = s2;
        this.c.J = s2;
    }

    @Override  // ehdm
    public final void a(boolean z) {
    }

    @Override  // ehdm
    public final void b() {
        if(this.t() && this.l) {
            this.s(0, false, false, true, false);
        }
    }

    @Override  // ehdm
    public final void c(int v, boolean z) {
        boolean z1 = true;
        if(this.t() && v > 0) {
            if(!z) {
                if(!this.l) {
                    this.l = true;
                }
                int v1 = this.z ? 1 : this.m ^ 1;
                int v2 = this.m;
                this.m = true;
                if(v1 == 0 && v2 != 0) {
                    z1 = false;
                }
                this.s(v, ((boolean)v1), ((boolean)(v2 ^ 1)), z1, ((boolean)(v2 ^ 1)));
                return;
            }
            this.w(v);
        }
    }

    @Override  // ehdm
    public final void d(int v, boolean z) {
        if(!this.m(v)) {
            return;
        }
        this.t = gjhn.a;
        this.A = z ? 2 : 3;
        this.c.h(true);
        this.c.K(false);
        this.k(v, z);
    }

    @Override  // ehdm
    public final void e(int v, gjgi gjgi0, int v1) {
        boolean z;
        this.n = gfsx.m(new ehdu(v, gjgi0));
        if(this.t()) {
            this.m = false;
            switch(gjgi0.ordinal()) {
                case 1: {
                    this.j(v1);
                    return;
                }
                case 2: {
                    if(v1 >= 0) {
                        this.t = this.g(gjgi.c);
                        this.r = this.e.getResources().getQuantityString(0x7F130054, v1, new Object[]{v1});  // plurals:people_fsa_progress_notification_format_for_groups_sync
                        this.q = this.e.getResources().getString(this.u, new Object[]{this.r});
                        this.a = this.r;
                        this.p(v1);
                        return;
                    }
                    break;
                }
                case 3: {
                    if(v1 >= 0) {
                        this.t = this.g(gjgi.d);
                        Context context0 = this.e;
                        Integer integer0 = v1;
                        this.r = context0.getResources().getQuantityString((this.h ? 0x7F130055 : 0x7F130052), v1, new Object[]{integer0});  // plurals:people_fsa_progress_notification_format_for_photos_sync
                        if(!this.h) {
                            this.q = context0.getResources().getString(this.u, new Object[]{this.r});
                            this.a = this.r;
                            this.p(v1);
                            return;
                        }
                        int v2 = this.o / 2;
                        if(v2 != 0) {
                        label_29:
                            if(v2 > v1) {
                                this.o = v2 + v1;
                            }
                            z = false;
                        }
                        else if(v1 > 0) {
                            this.a = context0.getResources().getQuantityString(0x7F130053, v1, new Object[]{integer0});  // plurals:people_fsa_progress_notification_format_for_contacts_sync
                            this.q = context0.getResources().getString(this.u, new Object[]{this.a});
                            this.o = v1;
                            z = true;
                        }
                        else {
                            v2 = 0;
                            goto label_29;
                        }
                        if(this.l) {
                            this.s(0, z, true, true, v1 > 0);
                            return;
                        }
                    }
                    break;
                }
            }
        }
    }

    public abstract Intent f();

    protected abstract gjhn g(gjgi arg1);

    public abstract String h();

    public abstract String i();

    public void j(int v) {
        if(v >= 0) {
            this.t = this.g(gjgi.b);
            this.r = this.e.getResources().getQuantityString(0x7F130053, v, new Object[]{v});  // plurals:people_fsa_progress_notification_format_for_contacts_sync
            this.q = this.e.getResources().getString(this.u, new Object[]{this.r});
            this.a = this.r;
            if(this.h) {
                v += v;
            }
            this.p(v);
        }
    }

    protected abstract void k(int arg1, boolean arg2);

    public abstract boolean l(int arg1, gjgi arg2);

    protected abstract boolean m(int arg1);

    public final ehdp n() {
        return new ehdp(((ehiv)this.k).v, this.j, this.g, this.t, this.A);
    }

    public final void o() {
        egiv.R();
        if(!egiv.m().booleanValue() && this.w) {
            hxdh hxdh0 = hxdh.a;
            long v = hxdh0.c().k();
            if(hxdh.f()) {
                long v1 = System.currentTimeMillis() - this.x + v;
                long v2 = hxdh0.c().j() - v1;
                if(v2 > 0L) {
                    v += v2;
                }
            }
            if(v > 0L) {
                try {
                    Thread.sleep(v);
                }
                catch(InterruptedException unused_ex) {
                }
            }
            this.d.o(this.f, this.g, evuh.bz);
            this.x(9);
        }
    }

    protected final void p(int v) {
        this.o = v;
        this.p = 0;
    }

    protected final void q(boolean z) {
        int v;
        bayn bayn0 = this.d;
        if(bayn0.d("com.google.android.gms.people.sync.focus.notification.channel_group.id") == null || bayn0.d("com.google.android.gms.people.sync.focus.notification.channel_group.id").isBlocked()) {
            egig.e(this.b, "Notifications are disabled for channel group.");
            v = 3;
        }
        else if(bayn0.c(this.v) == null || bayn0.c(this.v).getImportance() == 0) {
            egig.e(this.b, "Notifications are disabled for the channel.");
            v = 4;
        }
        else if(!bayn0.z()) {
            egig.e(this.b, "Notifications are disabled for GmsCore.");
            v = 2;
        }
        else {
            v = 5;
        }
        if(v == 5) {
            if(hxdh.a.c().H()) {
                new clht(Looper.getMainLooper()).post(new ehds(this, this));
            }
            else {
                this.r(this);
            }
            this.s = System.currentTimeMillis();
        }
        if(z) {
            this.x(v);
        }
        ((egik)((gftm)this.y).a).a.a(bbdg.eU);
    }

    public final void r(ehdv ehdv0) {
        juo juo0 = this.c;
        juo0.L(this.o, this.p, false);
        if(!this.w) {
            ehdq.a(this.e, this.i, ehdv0);
        }
        if(!this.w) {
            String s = ehdo.b(this.j, false);
            this.d.o(s, this.g, evuh.bz);
        }
        Notification notification0 = juo0.a();
        this.d.y(this.f, this.g, evuh.bz, notification0);
        if(hxdh.f() && !this.w) {
            this.x = System.currentTimeMillis();
        }
        this.w = true;
    }

    protected final void s(int v, boolean z, boolean z1, boolean z2, boolean z3) {
        if(this.o > 0) {
            this.w(v);
            if(z) {
                if(this.z) {
                    Resources resources0 = this.e.getResources();
                    int v1 = this.p;
                    String s = this.a;
                    Resources resources1 = this.e.getResources();
                    this.q = resources0.getString(this.u, new Object[]{resources1.getString(0x7F152560, new Object[]{v1, s})});  // string:people_fsa_progress_notification_format_for_progress "%1$d of %2$s"
                }
                this.c.D(this.q);
                this.c.S(this.q);
            }
            if(hxdh.a.c().z() && z1) {
                this.c.k(this.r);
            }
            long v2 = System.currentTimeMillis();
            long v3 = this.s;
            if(z2) {
                this.q(z3);
            }
            else {
                egiv.R();
                long v4 = hwzc.a.c().M();
                Long.valueOf(v4).getClass();
                if(v2 - v3 >= v4) {
                    this.q(z3);
                }
            }
        }
    }

    public final boolean t() {
        return this.n.i() ? this.l(((ehdu)this.n.d()).b, ((ehdu)this.n.d()).a) : false;
    }

    public static boolean u() {
        egiv.R();
        boolean z = hwzc.a.c().aG();
        Boolean.valueOf(z).getClass();
        return z;
    }

    static final PendingIntent v(Context context0, String s) {
        return PendingIntent.getBroadcast(context0, 0, new Intent(s).setPackage("com.google.android.gms"), 0xA000000);
    }

    private final void w(int v) {
        int v1 = this.p + v;
        this.p = v1;
        if(v1 > this.o) {
            egig.d(this.b, "Current progress %d exceeds max progress %d", new Object[]{v1, ((int)this.o)});
            this.p = this.o;
        }
    }

    private final void x(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)girs.a).v_newBuilder();
        int v1 = this.A;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((girs)hftv0).c = (v1 == 1 ? 2 : 3) - 1;
        ((girs)hftv0).b |= 1;
        gjhn gjhn0 = this.t;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((girs)hftv1).d = gjhn0.h;
        ((girs)hftv1).b |= 2;
        int v2 = this.A;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        if(v2 == 0) {
            throw null;
        }
        ((girs)hftv2).e = v2 - 1;
        ((girs)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((girs)hftp0.b_message).f = v - 1;
        ((girs)hftp0.b_message).b |= 8;
        girs girs0 = (girs)hftp0.N_build();
        this.k.f(this.g, this.f, girs0);
    }
}


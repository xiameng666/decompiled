import android.app.Notification.Action;
import android.app.Notification.BubbleMetadata;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class juo {
    boolean A;
    public String B;
    public Bundle C;
    public int D;
    public int E;
    public Notification F;
    public RemoteViews G;
    public RemoteViews H;
    public RemoteViews I;
    public String J;
    public int K;
    public String L;
    jwi M;
    public long N;
    public int O;
    boolean P;
    jun Q;
    Notification R;
    public boolean S;
    Object T;
    @Deprecated
    public ArrayList U;
    public Context a;
    public ArrayList b;
    public ArrayList c;
    ArrayList d;
    CharSequence e;
    CharSequence f;
    String g;
    public PendingIntent h;
    PendingIntent i;
    IconCompat j;
    CharSequence k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    jvg p;
    CharSequence q;
    CharSequence r;
    int s;
    int t;
    boolean u;
    public String v;
    public boolean w;
    public String x;
    public boolean y;
    boolean z;

    @Deprecated
    public juo(Context context0) {
        this(context0, null);
    }

    public juo(Context context0, Notification notification0) {
        this(context0, notification0.getChannelId());
        juf juf0;
        Notification.Action[] arr_notification$Action1;
        Bundle bundle1;
        Bundle bundle0 = notification0.extras;
        jvg jvg0 = jvg.j(notification0);
        this.D(notification0.extras.getCharSequence("android.title"));
        this.k(notification0.extras.getCharSequence("android.text"));
        this.C(notification0.extras.getCharSequence("android.infoText"));
        this.R(notification0.extras.getCharSequence("android.subText"));
        this.r = juo.c(notification0.getSettingsText());
        this.v(jvg0);
        this.m(notification0.getGroup());
        this.G(jvk.a(notification0));
        LocusId locusId0 = notification0.getLocusId();
        this.M = locusId0 == null ? null : jwi.a(locusId0);
        this.V(notification0.when);
        this.r(notification0.extras.getBoolean("android.showWhen"));
        this.T(notification0.extras.getBoolean("android.showChronometer"));
        boolean z = true;
        this.h((notification0.flags & 16) != 0);
        this.p((notification0.flags & 8) != 0);
        this.K((notification0.flags & 2) != 0);
        this.o((notification0.flags & 0x100) != 0);
        this.H(notification0.largeIcon);
        this.z(notification0.getBadgeIconType());
        this.A(notification0.category);
        Notification.BubbleMetadata notification$BubbleMetadata0 = notification0.getBubbleMetadata();
        this.Q = notification$BubbleMetadata0 == null ? null : jul.b(notification$BubbleMetadata0);
        this.J(notification0.number);
        this.S(notification0.tickerText);
        this.j(notification0.contentIntent);
        this.l(notification0.deleteIntent);
        this.F(notification0.fullScreenIntent, (notification0.flags & 0x80) != 0);
        this.Q(notification0.sound, notification0.audioStreamType);
        if(!"silent".equals(notification0.getGroup())) {
            if(!jvk.a(notification0)) {
                if(notification0.getGroupAlertBehavior() != 1) {
                    z = false;
                }
            }
            else if(notification0.getGroupAlertBehavior() != 2) {
                z = false;
            }
        }
        this.S = z;
        this.x(notification0.vibrate);
        this.I(notification0.ledARGB, notification0.ledOnMS, notification0.ledOffMS);
        this.E(notification0.defaults);
        this.q(notification0.priority);
        this.B(notification0.color);
        this.U(notification0.visibility);
        this.M(notification0.publicVersion);
        this.u(notification0.getSortKey());
        this.w(notification0.getTimeoutAfter());
        this.N(notification0.getShortcutId());
        this.L(bundle0.getInt("android.progressMax"), bundle0.getInt("android.progress"), bundle0.getBoolean("android.progressIndeterminate"));
        this.P = notification0.getAllowSystemGeneratedContextualActions();
        this.O(notification0.icon, notification0.iconLevel);
        if(notification0.extras == null) {
            bundle1 = null;
        }
        else {
            bundle1 = new Bundle(notification0.extras);
            bundle1.remove("android.title");
            bundle1.remove("android.text");
            bundle1.remove("android.infoText");
            bundle1.remove("android.subText");
            if(Build.VERSION.SDK_INT >= 36) {
                bundle1.remove("android.shortCriticalText");
            }
            bundle1.remove("android.intent.extra.CHANNEL_ID");
            bundle1.remove("android.intent.extra.CHANNEL_GROUP_ID");
            bundle1.remove("android.showWhen");
            bundle1.remove("android.progress");
            bundle1.remove("android.progressMax");
            bundle1.remove("android.progressIndeterminate");
            bundle1.remove("android.chronometerCountDown");
            bundle1.remove("android.colorized");
            bundle1.remove("android.people.list");
            bundle1.remove("android.people");
            bundle1.remove("android.support.sortKey");
            bundle1.remove("android.support.groupKey");
            bundle1.remove("android.support.isGroupSummary");
            bundle1.remove("android.support.localOnly");
            bundle1.remove("android.support.actionExtras");
            Bundle bundle2 = bundle1.getBundle("android.car.EXTENSIONS");
            if(bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle1.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if(jvg0 != null) {
                jvg0.b(bundle1);
            }
        }
        this.e(bundle1);
        this.T = notification0.getSmallIcon();
        Icon icon0 = notification0.getLargeIcon();
        if(icon0 != null) {
            this.j = jxw.b(icon0);
        }
        if(notification0.actions != null && notification0.actions.length != 0) {
            Notification.Action[] arr_notification$Action = notification0.actions;
            int v = arr_notification$Action.length;
            int v1 = 0;
            while(v1 < v) {
                Notification.Action notification$Action0 = arr_notification$Action[v1];
                if(notification$Action0.getIcon() == null) {
                    arr_notification$Action1 = arr_notification$Action;
                    juf0 = new juf(notification$Action0.icon, notification$Action0.title, notification$Action0.actionIntent);
                }
                else {
                    Icon icon1 = notification$Action0.getIcon();
                    arr_notification$Action1 = arr_notification$Action;
                    juf0 = new juf((jxx.b(icon1) != 2 || jxx.a(icon1) != 0 ? jxw.b(icon1) : null), notification$Action0.title, notification$Action0.actionIntent);
                }
                RemoteInput[] arr_remoteInput = notification$Action0.getRemoteInputs();
                if(arr_remoteInput != null && arr_remoteInput.length != 0) {
                    int v2 = 0;
                    while(v2 < arr_remoteInput.length) {
                        RemoteInput remoteInput0 = arr_remoteInput[v2];
                        String s = remoteInput0.getResultKey();
                        HashSet hashSet0 = new HashSet();
                        Bundle bundle4 = new Bundle();
                        if(s == null) {
                            throw new IllegalArgumentException("Result key can\'t be null");
                        }
                        CharSequence charSequence0 = remoteInput0.getLabel();
                        CharSequence[] arr_charSequence = remoteInput0.getChoices();
                        boolean z1 = remoteInput0.getAllowFreeFormInput();
                        Bundle bundle5 = remoteInput0.getExtras();
                        if(bundle5 != null) {
                            bundle4.putAll(bundle5);
                        }
                        Set set0 = remoteInput0.getAllowedDataTypes();
                        if(set0 != null) {
                            for(Object object0: set0) {
                                hashSet0.add(((String)object0));
                                bundle4 = bundle4;
                            }
                        }
                        juf0.b(new jvz(s, charSequence0, arr_charSequence, z1, remoteInput0.getEditChoicesBeforeSending(), bundle4, hashSet0));
                        ++v2;
                        arr_remoteInput = arr_remoteInput;
                        v = v;
                        v1 = v1;
                        continue;
                    }
                }
                juf0.a = jub.a(notification$Action0);
                juf0.c = juc.a(notification$Action0);
                juf0.e = jud.a(notification$Action0);
                juf0.f = jue.a(notification$Action0);
                Bundle bundle6 = notification$Action0.getExtras();
                if(bundle6 != null) {
                    juf0.b.putAll(bundle6);
                }
                this.y(juf0.a());
                ++v1;
                arr_notification$Action = arr_notification$Action1;
                v = v;
            }
        }
        ArrayList arrayList0 = new ArrayList();
        Bundle bundle7 = notification0.extras.getBundle("android.car.EXTENSIONS");
        if(bundle7 != null) {
            Bundle bundle8 = bundle7.getBundle("invisible_actions");
            if(bundle8 != null) {
                for(int v3 = 0; v3 < bundle8.size(); ++v3) {
                    Bundle bundle9 = bundle8.getBundle(Integer.toString(v3));
                    Bundle bundle10 = bundle9.getBundle("extras");
                    boolean z2 = bundle10 == null ? false : bundle10.getBoolean("android.support.allowGeneratedReplies", false);
                    int v4 = bundle9.getInt("icon");
                    CharSequence charSequence1 = bundle9.getCharSequence("title");
                    PendingIntent pendingIntent0 = (PendingIntent)bundle9.getParcelable("actionIntent");
                    Bundle bundle11 = bundle9.getBundle("extras");
                    jvz[] arr_jvz = jvm.b(jvm.a(bundle9, "remoteInputs"));
                    jvm.b(jvm.a(bundle9, "dataOnlyRemoteInputs"));
                    int v5 = bundle9.getInt("semanticAction");
                    boolean z3 = bundle9.getBoolean("showsUserInterface");
                    arrayList0.add(new juh((v4 == 0 ? null : IconCompat.j(null, "", v4)), charSequence1, pendingIntent0, bundle11, arr_jvz, z2, v5, z3, false, false));
                }
            }
        }
        if(!arrayList0.isEmpty()) {
            for(Object object1: arrayList0) {
                juh juh0 = (juh)object1;
                if(juh0 != null) {
                    this.d.add(juh0);
                }
            }
        }
        String[] arr_s = notification0.extras.getStringArray("android.people");
        if(arr_s != null && arr_s.length != 0) {
            for(int v7 = 0; v7 < arr_s.length; ++v7) {
                this.f(arr_s[v7]);
            }
        }
        ArrayList arrayList1 = notification0.extras.getParcelableArrayList("android.people.list");
        if(arrayList1 != null && !arrayList1.isEmpty()) {
            int v8 = arrayList1.size();
            for(int v6 = 0; v6 < v8; ++v6) {
                jvx jvx0 = jvv.b(((Person)arrayList1.get(v6)));
                this.c.add(jvx0);
            }
        }
        if(bundle0.containsKey("android.chronometerCountDown")) {
            boolean z4 = bundle0.getBoolean("android.chronometerCountDown");
            this.b().putBoolean("android.chronometerCountDown", z4);
        }
        if(bundle0.containsKey("android.colorized")) {
            this.i(bundle0.getBoolean("android.colorized"));
        }
        if(Build.VERSION.SDK_INT >= 36 && bundle0.containsKey("android.shortCriticalText")) {
            String s1 = bundle0.getString("android.shortCriticalText");
            this.g = s1;
            if(Build.VERSION.SDK_INT < 36) {
                this.b().putString("android.shortCriticalText", s1);
            }
        }
    }

    public juo(Context context0, String s) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.n = true;
        this.y = false;
        this.D = 0;
        this.E = 0;
        this.K = 0;
        this.O = 0;
        Notification notification0 = new Notification();
        this.R = notification0;
        this.a = context0;
        this.J = s;
        notification0.when = System.currentTimeMillis();
        this.R.audioStreamType = -1;
        this.m = 0;
        this.U = new ArrayList();
        this.P = true;
    }

    public void A(String s) {
        this.B = s;
    }

    public void B(int v) {
        this.D = v;
    }

    public final void C(CharSequence charSequence0) {
        this.k = juo.c(charSequence0);
    }

    public void D(CharSequence charSequence0) {
        this.e = juo.c(charSequence0);
    }

    public final void E(int v) {
        this.R.defaults = v;
        if((v & 4) != 0) {
            this.R.flags |= 1;
        }
    }

    public final void F(PendingIntent pendingIntent0, boolean z) {
        this.i = pendingIntent0;
        this.W(0x80, z);
    }

    public void G(boolean z) {
        this.w = z;
    }

    public void H(Bitmap bitmap0) {
        this.j = bitmap0 == null ? null : IconCompat.g(bitmap0);
    }

    public final void I(int v, int v1, int v2) {
        this.R.ledARGB = v;
        this.R.ledOnMS = v1;
        this.R.ledOffMS = v2;
        this.R.flags = this.R.flags & -2 | (this.R.ledOnMS == 0 || this.R.ledOffMS == 0 ? 0 : 1);
    }

    public void J(int v) {
        this.l = v;
    }

    public final void K(boolean z) {
        this.W(2, z);
    }

    public void L(int v, int v1, boolean z) {
        this.s = v;
        this.t = v1;
        this.u = z;
    }

    public void M(Notification notification0) {
        this.F = notification0;
    }

    public void N(String s) {
        this.L = s;
    }

    public void O(int v, int v1) {
        this.R.icon = v;
        this.R.iconLevel = v1;
    }

    public final void P(Uri uri0) {
        this.R.sound = uri0;
        this.R.audioStreamType = -1;
        AudioAttributes.Builder audioAttributes$Builder0 = new AudioAttributes.Builder().setContentType(4).setUsage(5);
        Notification notification0 = this.R;
        notification0.audioAttributes = audioAttributes$Builder0.build();
    }

    public final void Q(Uri uri0, int v) {
        this.R.sound = uri0;
        this.R.audioStreamType = v;
        AudioAttributes.Builder audioAttributes$Builder0 = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(v);
        Notification notification0 = this.R;
        notification0.audioAttributes = audioAttributes$Builder0.build();
    }

    public void R(CharSequence charSequence0) {
        this.q = juo.c(charSequence0);
    }

    public final void S(CharSequence charSequence0) {
        Notification notification0 = this.R;
        notification0.tickerText = juo.c(charSequence0);
    }

    public void T(boolean z) {
        this.o = z;
    }

    public void U(int v) {
        this.E = v;
    }

    public final void V(long v) {
        this.R.when = v;
    }

    private final void W(int v, boolean z) {
        Notification notification0 = this.R;
        if(z) {
            notification0.flags |= v;
            return;
        }
        notification0.flags &= ~v;
    }

    public Notification a() {
        jvl jvl0 = new jvl(this);
        juo juo0 = jvl0.b;
        jvg jvg0 = juo0.p;
        if(jvg0 != null) {
            jvg0.d(jvl0);
        }
        Notification notification0 = jvl0.a.build();
        RemoteViews remoteViews0 = juo0.G;
        if(remoteViews0 != null) {
            notification0.contentView = remoteViews0;
        }
        if(jvg0 != null) {
            juo0.p.l();
        }
        if(jvg0 != null) {
            Bundle bundle0 = notification0.extras;
            if(bundle0 != null) {
                jvg0.k(bundle0);
            }
        }
        return notification0;
    }

    public final Bundle b() {
        if(this.C == null) {
            this.C = new Bundle();
        }
        return this.C;
    }

    public static CharSequence c(CharSequence charSequence0) {
        if(charSequence0 == null) {
            return null;
        }
        return charSequence0.length() <= 0x1400 ? charSequence0 : charSequence0.subSequence(0, 0x1400);
    }

    public final void d(int v, CharSequence charSequence0, PendingIntent pendingIntent0) {
        this.b.add(new juh(v, charSequence0, pendingIntent0));
    }

    public final void e(Bundle bundle0) {
        if(bundle0 != null) {
            Bundle bundle1 = this.C;
            if(bundle1 == null) {
                this.C = new Bundle(bundle0);
                return;
            }
            bundle1.putAll(bundle0);
        }
    }

    @Deprecated
    public void f(String s) {
        if(s != null && !s.isEmpty()) {
            this.U.add(s);
        }
    }

    public final void g(jut jut0) {
        jut0.a(this);
    }

    public final void h(boolean z) {
        this.W(16, z);
    }

    public final void i(boolean z) {
        this.z = z;
        this.A = true;
    }

    public void j(PendingIntent pendingIntent0) {
        this.h = pendingIntent0;
    }

    public void k(CharSequence charSequence0) {
        this.f = juo.c(charSequence0);
    }

    public final void l(PendingIntent pendingIntent0) {
        this.R.deleteIntent = pendingIntent0;
    }

    public void m(String s) {
        this.v = s;
    }

    public final void n(Icon icon0) {
        this.j = icon0 == null ? null : jxw.b(icon0);
    }

    public void o(boolean z) {
        this.y = z;
    }

    public final void p(boolean z) {
        this.W(8, z);
    }

    public void q(int v) {
        this.m = v;
    }

    public void r(boolean z) {
        this.n = z;
    }

    public final void s(int v) {
        this.R.icon = v;
    }

    public final void t(IconCompat iconCompat0) {
        this.T = jxw.c(iconCompat0);
    }

    public void u(String s) {
        this.x = s;
    }

    public final void v(jvg jvg0) {
        if(this.p != jvg0) {
            this.p = jvg0;
            if(jvg0 != null && jvg0.g != this) {
                jvg0.g = this;
                juo juo0 = jvg0.g;
                if(juo0 != null) {
                    juo0.v(jvg0);
                }
            }
        }
    }

    public void w(long v) {
        this.N = v;
    }

    public final void x(long[] arr_v) {
        this.R.vibrate = arr_v;
    }

    public final void y(juh juh0) {
        if(juh0 != null) {
            this.b.add(juh0);
        }
    }

    public void z(int v) {
        this.K = v;
    }
}


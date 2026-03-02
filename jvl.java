import android.app.Notification.Action.Builder;
import android.app.Notification.Action;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.Builder;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Set;

public final class jvl {
    public final Notification.Builder a;
    public final juo b;
    private final Bundle c;
    private int d;

    public jvl(juo juo0) {
        Bundle[] arr_bundle;
        int v2;
        juh juh1;
        this.c = new Bundle();
        this.b = juo0;
        Notification.Builder notification$Builder0 = new Notification.Builder(juo0.a, juo0.J);
        this.a = notification$Builder0;
        Notification notification0 = juo0.R;
        notification$Builder0.setWhen(notification0.when).setSmallIcon(notification0.icon, notification0.iconLevel).setContent(notification0.contentView).setTicker(notification0.tickerText, null).setVibrate(notification0.vibrate).setLights(notification0.ledARGB, notification0.ledOnMS, notification0.ledOffMS).setOngoing((notification0.flags & 2) != 0).setOnlyAlertOnce((notification0.flags & 8) != 0).setAutoCancel((notification0.flags & 16) != 0).setDefaults(notification0.defaults).setContentTitle(juo0.e).setContentText(juo0.f).setContentInfo(juo0.k).setContentIntent(juo0.h).setDeleteIntent(notification0.deleteIntent).setFullScreenIntent(juo0.i, (notification0.flags & 0x80) != 0).setNumber(juo0.l).setProgress(juo0.s, juo0.t, juo0.u);
        notification$Builder0.setLargeIcon((juo0.j == null ? null : jxw.c(juo0.j)));
        notification$Builder0.setSubText(juo0.q).setUsesChronometer(juo0.o).setPriority(juo0.m);
        jvg jvg0 = juo0.p;
        if((jvg0 instanceof juq)) {
            PendingIntent pendingIntent0 = ((juq)jvg0).b;
            juh juh0 = pendingIntent0 == null ? ((juq)jvg0).e(0x7F0806CA, 0x7F150636, ((juq)jvg0).f, 0x7F060104, ((juq)jvg0).c) : ((juq)jvg0).e(0x7F0806CA, 0x7F150635, ((juq)jvg0).f, 0x7F060104, pendingIntent0);  // drawable:ic_call_decline
            PendingIntent pendingIntent1 = ((juq)jvg0).a;
            if(pendingIntent1 == null) {
                juh1 = null;
            }
            else {
                boolean z = ((juq)jvg0).d;
                juh1 = ((juq)jvg0).e((z ? 0x7F0806C8 : 0x7F0806C6), (z ? 0x7F150634 : 0x7F150633), ((juq)jvg0).e, 0x7F060103, pendingIntent1);  // drawable:ic_call_answer_video
            }
            ArrayList arrayList0 = new ArrayList(3);
            arrayList0.add(juh0);
            ArrayList arrayList1 = ((juq)jvg0).g.b;
            if(arrayList1 == null) {
                v2 = 2;
            }
            else {
                int v1 = arrayList1.size();
                v2 = 2;
                for(int v3 = 0; v3 < v1; ++v3) {
                    juh juh2 = (juh)arrayList1.get(v3);
                    if(juh2.f) {
                        arrayList0.add(juh2);
                    }
                    else if(juh2 == null || !juh2.a.getBoolean("key_action_priority")) {
                        arrayList0.add(juh2);
                        --v2;
                    }
                    if(juh1 != null && v2 == 1) {
                        arrayList0.add(juh1);
                        v2 = 0;
                    }
                }
            }
            if(juh1 != null && v2 > 0) {
                arrayList0.add(juh1);
            }
            int v4 = arrayList0.size();
            for(int v5 = 0; v5 < v4; ++v5) {
                this.a(((juh)arrayList0.get(v5)));
            }
        }
        else {
            ArrayList arrayList2 = juo0.b;
            int v6 = arrayList2.size();
            for(int v7 = 0; v7 < v6; ++v7) {
                this.a(((juh)arrayList2.get(v7)));
            }
        }
        Bundle bundle0 = juo0.C;
        if(bundle0 != null) {
            this.c.putAll(bundle0);
        }
        this.a.setShowWhen(juo0.n);
        this.a.setLocalOnly(juo0.y);
        this.a.setGroup(juo0.v);
        this.a.setSortKey(juo0.x);
        this.a.setGroupSummary(juo0.w);
        this.d = 0;
        this.a.setCategory(juo0.B);
        this.a.setColor(juo0.D);
        this.a.setVisibility(juo0.E);
        this.a.setPublicVersion(juo0.F);
        this.a.setSound(notification0.sound, notification0.audioAttributes);
        ArrayList arrayList3 = juo0.U;
        if(arrayList3 != null && !arrayList3.isEmpty()) {
            for(Object object0: arrayList3) {
                this.a.addPerson(((String)object0));
            }
        }
        if(juo0.d.size() > 0) {
            Bundle bundle1 = juo0.b().getBundle("android.car.EXTENSIONS");
            if(bundle1 == null) {
                bundle1 = new Bundle();
            }
            Bundle bundle2 = new Bundle(bundle1);
            Bundle bundle3 = new Bundle();
            int v8 = 0;
            for(int v = 0; v8 < juo0.d.size(); v = 0) {
                String s = Integer.toString(v8);
                juh juh3 = (juh)juo0.d.get(v8);
                Bundle bundle4 = new Bundle();
                IconCompat iconCompat0 = juh3.a();
                bundle4.putInt("icon", (iconCompat0 == null ? 0 : iconCompat0.a()));
                bundle4.putCharSequence("title", juh3.h);
                bundle4.putParcelable("actionIntent", juh3.i);
                Bundle bundle5 = new Bundle(juh3.a);
                bundle5.putBoolean("android.support.allowGeneratedReplies", juh3.c);
                bundle4.putBundle("extras", bundle5);
                jvz[] arr_jvz = juh3.b;
                if(arr_jvz == null) {
                    arr_bundle = null;
                }
                else {
                    arr_bundle = new Bundle[arr_jvz.length];
                    while(v < arr_jvz.length) {
                        jvz jvz0 = arr_jvz[v];
                        Bundle bundle6 = new Bundle();
                        bundle6.putString("resultKey", jvz0.a);
                        bundle6.putCharSequence("label", jvz0.b);
                        bundle6.putCharSequenceArray("choices", jvz0.c);
                        bundle6.putBoolean("allowFreeFormInput", jvz0.d);
                        bundle6.putBundle("extras", jvz0.f);
                        Set set0 = jvz0.g;
                        if(!set0.isEmpty()) {
                            ArrayList arrayList4 = new ArrayList(set0.size());
                            for(Object object1: set0) {
                                arrayList4.add(((String)object1));
                            }
                            bundle6.putStringArrayList("allowedDataTypes", arrayList4);
                        }
                        arr_bundle[v] = bundle6;
                        ++v;
                        arr_jvz = arr_jvz;
                        v8 = v8;
                    }
                }
                bundle4.putParcelableArray("remoteInputs", arr_bundle);
                bundle4.putBoolean("showsUserInterface", juh3.d);
                bundle4.putInt("semanticAction", juh3.e);
                bundle3.putBundle(s, bundle4);
                ++v8;
            }
            bundle1.putBundle("invisible_actions", bundle3);
            bundle2.putBundle("invisible_actions", bundle3);
            juo0.b().putBundle("android.car.EXTENSIONS", bundle1);
            this.c.putBundle("android.car.EXTENSIONS", bundle2);
        }
        Object object2 = juo0.T;
        if(object2 != null) {
            this.a.setSmallIcon(((Icon)object2));
        }
        this.a.setExtras(juo0.C);
        this.a.setRemoteInputHistory(null);
        RemoteViews remoteViews0 = juo0.G;
        if(remoteViews0 != null) {
            this.a.setCustomContentView(remoteViews0);
        }
        RemoteViews remoteViews1 = juo0.H;
        if(remoteViews1 != null) {
            this.a.setCustomBigContentView(remoteViews1);
        }
        RemoteViews remoteViews2 = juo0.I;
        if(remoteViews2 != null) {
            this.a.setCustomHeadsUpContentView(remoteViews2);
        }
        this.a.setBadgeIconType(juo0.K);
        this.a.setSettingsText(juo0.r);
        this.a.setShortcutId(juo0.L);
        this.a.setTimeoutAfter(juo0.N);
        this.a.setGroupAlertBehavior(0);
        if(juo0.A) {
            this.a.setColorized(juo0.z);
        }
        if(!TextUtils.isEmpty(juo0.J)) {
            this.a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        ArrayList arrayList5 = juo0.c;
        int v9 = arrayList5.size();
        for(int v10 = 0; v10 < v9; ++v10) {
            Person person0 = jvv.a(((jvx)arrayList5.get(v10)));
            this.a.addPerson(person0);
        }
        this.a.setAllowSystemGeneratedContextualActions(juo0.P);
        Notification.BubbleMetadata notification$BubbleMetadata0 = juo0.Q == null ? null : jul.a(juo0.Q);
        this.a.setBubbleMetadata(notification$BubbleMetadata0);
        jwi jwi0 = juo0.M;
        if(jwi0 != null) {
            this.a.setLocusId(jwi0.a);
        }
        if(juo0.O != 0) {
            this.a.setForegroundServiceBehavior(1);
        }
        if(Build.VERSION.SDK_INT >= 36) {
            this.a.setShortCriticalText(juo0.g);
        }
        if(juo0.S) {
            this.d = this.b.w ? 2 : 1;
            this.a.setVibrate(null);
            this.a.setSound(null);
            notification0.defaults &= -2;
            notification0.defaults &= -3;
            this.a.setDefaults(notification0.defaults);
            if(TextUtils.isEmpty(this.b.v)) {
                this.a.setGroup("silent");
            }
            this.a.setGroupAlertBehavior(this.d);
        }
    }

    private final void a(juh juh0) {
        IconCompat iconCompat0 = juh0.a();
        Notification.Action.Builder notification$Action$Builder0 = new Notification.Action.Builder((iconCompat0 == null ? null : jxw.c(iconCompat0)), juh0.h, juh0.i);
        jvz[] arr_jvz = juh0.b;
        if(arr_jvz != null) {
            RemoteInput[] arr_remoteInput = jvz.a(arr_jvz);
            for(int v = 0; v < arr_remoteInput.length; ++v) {
                notification$Action$Builder0.addRemoteInput(arr_remoteInput[v]);
            }
        }
        Bundle bundle0 = new Bundle(juh0.a);
        bundle0.putBoolean("android.support.allowGeneratedReplies", juh0.c);
        notification$Action$Builder0.setAllowGeneratedReplies(juh0.c);
        bundle0.putInt("android.support.action.semanticAction", juh0.e);
        notification$Action$Builder0.setSemanticAction(juh0.e);
        notification$Action$Builder0.setContextual(juh0.f);
        notification$Action$Builder0.setAuthenticationRequired(juh0.j);
        bundle0.putBoolean("android.support.action.showsUserInterface", juh0.d);
        notification$Action$Builder0.addExtras(bundle0);
        Notification.Action notification$Action0 = notification$Action$Builder0.build();
        this.a.addAction(notification$Action0);
    }
}


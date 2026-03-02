import android.app.Notification.Action;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.UserHandle;
import android.service.notification.NotificationListenerService.Ranking;
import android.service.notification.NotificationListenerService.RankingMap;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.auth.proximity.AttestationVerifier;
import com.google.android.gms.auth.proximity.FileParams;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.WireMessageParams;
import com.google.android.gms.auth.proximity.phonehub.CdmAssociationChimeraActivity;
import com.google.android.gms.auth.proximity.phonehub.ParcelableRanking;
import com.google.android.gms.auth.proximity.phonehub.PhoneHubChimeraService;
import com.google.android.gms.auth.proximity.phonehub.PhoneHubSetupTimeoutGmsTaskBoundService;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import com.google.android.gms.common.Feature;
import j..util.Collection.-EL;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

public final class aloz implements alrd {
    public static final baun a;
    public final Context b;
    public final alrj c;
    public final alrg d;
    public boolean e;
    public final almk f;
    public final ExecutorService g;
    public altq h;
    public altq i;
    public boolean j;
    public alvg k;
    private final String l;
    private final alrm m;
    private boolean n;
    private boolean o;
    private final Map p;
    private final LruCache q;
    private final aldi r;
    private final almu s;
    private final ccmg t;
    private aliv u;
    private final alqj v;

    static {
        aloz.a = new baun("ProximityAuth", new String[]{"MessageProcessor"});
    }

    public aloz(Context context0, String s, alrj alrj0, alrg alrg0, alqj alqj0, alrm alrm0, LruCache lruCache0, almk almk0, aldi aldi0, almu almu0, ExecutorService executorService0) {
        this.p = new HashMap();
        this.j = false;
        this.b = context0;
        this.l = s;
        this.c = alrj0;
        this.d = alrg0;
        this.m = alrm0;
        this.v = alqj0;
        this.f = almk0;
        this.q = lruCache0;
        this.r = aldi0;
        this.s = almu0;
        this.g = executorService0;
        this.t = new ccmp();
        this.h = altq.f;
        this.i = altq.f;
        this.k = alvg.a;
        if(hpzm.B()) {
            this.u = aliv.a();
        }
    }

    final alul a(StatusBarNotification statusBarNotification0, NotificationListenerService.Ranking notificationListenerService$Ranking0) {
        int v4;
        int v3;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent1;
        Bitmap bitmap1;
        Notification notification0 = statusBarNotification0.getNotification();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)alul.a).v_newBuilder();
        long v = (long)alqb.a(statusBarNotification0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((alul)hftp0.b_message).c = v;
        long v1 = notification0.when;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((alul)hftp0.b_message).d = v1;
        String s = statusBarNotification0.getPackageName();
        UserHandle userHandle0 = statusBarNotification0.getUser();
        alsw alsw0 = this.f.b(s, userHandle0, statusBarNotification0);
        if(alsw0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((alul)hftp0.b_message).e = alsw0;
            ((alul)hftp0.b_message).b |= 1;
        }
        Bundle bundle0 = notification0.extras;
        if(bundle0 != null) {
            String s1 = bundle0.getString("android.title");
            if(!TextUtils.isEmpty(s1)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                alul alul0 = (alul)hftp0.b_message;
                s1.getClass();
                alul0.g = s1;
            }
            String s2 = bundle0.getString("android.text");
            if(!TextUtils.isEmpty(s2)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                alul alul1 = (alul)hftp0.b_message;
                s2.getClass();
                alul1.h = s2;
            }
            Bitmap bitmap0 = (Bitmap)bundle0.getParcelable("android.picture");
            if(bitmap0 != null) {
                ByteString hfsf0 = alni.c(bitmap0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((alul)hftp0.b_message).k = hfsf0;
            }
        }
        String s3 = statusBarNotification0.getKey();
        jvb jvb0 = jvb.g(notification0);
        int v2 = 0;
        PendingIntent pendingIntent0 = null;
        if(jvb0 != null) {
            List list0 = jvb0.a;
            if(!list0.isEmpty()) {
                jva jva0 = (jva)gggq.p(list0);
                jvx jvx0 = jva0.b;
                if(jvx0 != null) {
                    CharSequence charSequence0 = jvx0.a;
                    if(charSequence0 != null) {
                        String s4 = charSequence0.toString();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        alul alul2 = (alul)hftp0.b_message;
                        s4.getClass();
                        alul2.g = s4;
                    }
                    IconCompat iconCompat0 = jvx0.b;
                    if(iconCompat0 != null) {
                        if(hpzm.a.f().af()) {
                            String s5 = jvx0.d;
                            ByteString hfsf1 = s5 == null || s3 == null ? null : ((ByteString)this.q.get(s3 + s5));
                            if(hfsf1 == null) {
                                Drawable drawable0 = iconCompat0.c(this.b);
                                if(drawable0 == null) {
                                    hfsf1 = null;
                                }
                                else {
                                    hfsf1 = alni.d(drawable0, 0xA0, 0xA0);
                                    if(s5 != null && s3 != null) {
                                        this.q.put(s3 + s5, hfsf1);
                                    }
                                }
                            }
                            if(hfsf1 != null) {
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ((alul)hftp0.b_message).j = hfsf1;
                            }
                        }
                        else {
                            String s6 = jvx0.d == null ? null : s3 + jvx0.d;
                            ByteString hfsf2 = s6 == null ? null : ((ByteString)this.q.get(s6));
                            if(hfsf2 == null) {
                                hfsf2 = alni.d(iconCompat0.c(this.b), 0xA0, 0xA0);
                                if(s6 != null) {
                                    this.q.put(s6, hfsf2);
                                }
                            }
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((alul)hftp0.b_message).j = hfsf2;
                        }
                    }
                }
                CharSequence charSequence1 = jva0.a;
                if(!TextUtils.isEmpty(charSequence1)) {
                    String s7 = charSequence1.toString();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    alul alul3 = (alul)hftp0.b_message;
                    s7.getClass();
                    alul3.h = s7;
                }
                if(jva0.d != null && (jva0.c != null && jva0.c.startsWith("image/"))) {
                    try {
                        Context context0 = this.b;
                        Uri uri0 = jva0.d;
                        InputStream inputStream0 = context0.getContentResolver().openInputStream(uri0);
                        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                        bitmapFactory$Options0.inJustDecodeBounds = true;
                        bitmapFactory$Options0.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        BitmapFactory.decodeStream(inputStream0, null, bitmapFactory$Options0);
                        inputStream0.close();
                        if(bitmapFactory$Options0.outWidth != -1 && bitmapFactory$Options0.outHeight != -1) {
                            double f = (double)Math.max(bitmapFactory$Options0.outHeight, bitmapFactory$Options0.outWidth);
                            double f1 = f > 240.0 ? f / 240.0 : 1.0;
                            BitmapFactory.Options bitmapFactory$Options1 = new BitmapFactory.Options();
                            bitmapFactory$Options1.inSampleSize = Integer.highestOneBit(((int)Math.floor(f1))) == 0 ? 1 : Integer.highestOneBit(((int)Math.floor(f1)));
                            InputStream inputStream1 = context0.getContentResolver().openInputStream(uri0);
                            bitmap1 = BitmapFactory.decodeStream(inputStream1, null, bitmapFactory$Options1);
                            inputStream1.close();
                        }
                        else {
                            bitmap1 = null;
                        }
                        if(bitmap1 != null) {
                            ByteString hfsf3 = alni.c(bitmap1);
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((alul)hftp0.b_message).k = hfsf3;
                        }
                    }
                    catch(IOException | SecurityException exception0) {
                        aloz.a.n("Could not convert notification image to bitmap", exception0, new Object[0]);
                    }
                }
            }
        }
        Notification.Action[] arr_notification$Action = notification0.actions;
        if(albt.c()) {
            pendingIntent0 = (PendingIntent)notification0.extras.getParcelable("android.answerIntent");
            pendingIntent1 = (PendingIntent)notification0.extras.getParcelable("android.declineIntent");
            pendingIntent2 = (PendingIntent)notification0.extras.getParcelable("android.hangUpIntent");
            if(pendingIntent0 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((alul)hftp0.b_message).l = 2;
            }
            else if(pendingIntent2 == null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((alul)hftp0.b_message).l = 0;
            }
            else {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((alul)hftp0.b_message).l = 3;
            }
        }
        else {
            pendingIntent1 = null;
            pendingIntent2 = null;
        }
        if(arr_notification$Action != null && arr_notification$Action.length > 0) {
            while(v2 < arr_notification$Action.length) {
                Notification.Action notification$Action0 = arr_notification$Action[v2];
                if(hpzc.e() && alqb.b(notification$Action0)) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((alul)hftp0.b_message).l = 1;
                }
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)alsv.a).v_newBuilder();
                ++v2;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((alsv)hftp1.b_message).b = (long)v2;
                switch(notification$Action0.getSemanticAction()) {
                    case 0: 
                    case 1: {
                        if(alqb.b(notification$Action0)) {
                            v3 = 3;
                            goto label_159;
                        }
                    }
                }
                v3 = 2;
            label_159:
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((alsv)hftp1.b_message).d = v3 - 2;
                if(!TextUtils.isEmpty(notification$Action0.title)) {
                    String s8 = String.valueOf(notification$Action0.title);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    alsv alsv0 = (alsv)hftp1.b_message;
                    s8.getClass();
                    alsv0.c = s8;
                    if(hpzc.e()) {
                        if(notification$Action0.actionIntent.equals(pendingIntent0)) {
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((alsv)hftp1.b_message).e = 1;
                        }
                        else if(notification$Action0.actionIntent.equals(pendingIntent1)) {
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((alsv)hftp1.b_message).e = 2;
                        }
                        else if(notification$Action0.actionIntent.equals(pendingIntent2)) {
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((alsv)hftp1.b_message).e = 3;
                        }
                        else {
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((alsv)hftp1.b_message).e = 0;
                        }
                    }
                }
                hftp0.cd(hftp1);
            }
        }
        if(albt.c() && notification0.contentIntent != null) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)alsv.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            ((alsv)hftv0).b = -2L;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((alsv)hftp2.b_message).d = 3;
            hftp0.cd(hftp2);
        }
        if(((alul)hftp0.b_message).j.isEmpty() && "msg".equals(notification0.category)) {
            Icon icon0 = notification0.getLargeIcon();
            if(icon0 != null) {
                ByteString hfsf4 = alni.d(icon0.loadDrawable(this.b), 0xA0, 0xA0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((alul)hftp0.b_message).j = hfsf4;
            }
        }
        switch(notificationListenerService$Ranking0.getImportance()) {
            case 0: {
                v4 = 3;
                break;
            }
            case 1: {
                v4 = 4;
                break;
            }
            case 2: {
                v4 = 5;
                break;
            }
            case 3: {
                v4 = 6;
                break;
            }
            case 4: {
                v4 = 7;
                break;
            }
            default: {
                v4 = 2;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((alul)hftp0.b_message).f = v4 - 2;
        return (alul)hftp0.N_build();
    }

    public final String b() {
        akzn akzn0 = akzn.c();
        String s = this.l;
        RemoteDevice remoteDevice0 = akzn0.b(s);
        if(remoteDevice0 == null) {
            aloz.a.m("Failed to get RemoteDevice data for device ID %s", new Object[]{s});
            return "";
        }
        return remoteDevice0.d;
    }

    public final void c() {
        if(alrn.a()) {
            alos alos0 = new alos(this);
            this.g.execute(alos0);
        }
        else {
            this.c.e.remove(this);
        }
        this.j = false;
        this.k = alvg.a;
        this.u.c = null;
    }

    @Override  // alrd
    public final void d(int v) {
        if(hpzm.w()) {
            return;
        }
        this.n();
    }

    @Override  // alrd
    public final void e() {
        if(hpzm.s()) {
            ExecutorService executorService0 = this.g;
            executorService0.execute(new alow(this));
            if(hpzm.z() && this.i != altq.f) {
                executorService0.execute(new alon(this));
                this.i = altq.b;
            }
        }
        else {
            Context context0 = this.b;
            this.d.b(context0, this.c);
            if(hpzm.z() && this.i != altq.f) {
                PhoneHubSetupTimeoutGmsTaskBoundService.e(context0);
                this.i = altq.b;
            }
        }
        if(hpzm.z()) {
            this.q();
        }
        this.n();
    }

    @Override  // alrd
    public final void f() {
        if(hpzm.s()) {
            aloo aloo0 = new aloo(this);
            this.g.execute(aloo0);
        }
        else {
            this.d.b(this.b, this.c);
        }
        this.n();
    }

    public final void g(MessageLite hfvm0, String s) {
        StatusBarNotification statusBarNotification4;
        StatusBarNotification statusBarNotification3;
        Notification.Action notification$Action0;
        StatusBarNotification statusBarNotification2;
        StatusBarNotification[] arr_statusBarNotification;
        StatusBarNotification statusBarNotification0;
        aloz.a.h("Received message: " + hfvm0.toString() + " for device: " + s, new Object[0]);
        aliu aliu0 = new aliu();
        this.t.a(bbdg.hm);
        int v1 = 2;
        if(hpzm.B() && this.u != null) {
            if(hpzm.H() && (hfvm0 instanceof alti) && hpzm.H()) {
                aliv aliv0 = this.u;
                if(aliv0 != null) {
                    aliv0.c = ((alti)hfvm0).h;
                    long v2 = ((alti)hfvm0).g;
                    if(v2 != 0L) {
                        try {
                            alja alja0 = aliv0.b;
                            if(v2 < ((long)(((Long)((glyq)alja0.c()).u())))) {
                                ((glyq)alja0.e(((String)((glyq)alja0.b()).u()), v2)).u();
                            }
                        }
                        catch(InterruptedException | ExecutionException exception0) {
                            aliv.a.g("Failed to get or update PhoneHubEventsLoggerIdentifier", exception0, new Object[0]);
                        }
                    }
                }
            }
            try {
                this.u.d(2, alpb.a(hfvm0));
            }
            catch(hfur hfur0) {
                aloz.a.g("Failed to log message receiving event when parsing message type", hfur0, new Object[0]);
            }
        }
        Intent intent0 = null;
        int v3 = 3;
        if((hfvm0 instanceof alti)) {
            if(hpzm.a.f().v() && (((alti)hfvm0).b & 1) != 0) {
                akzn akzn0 = akzn.c();
                allt allt0 = ((alti)hfvm0).e;
                if(allt0 == null) {
                    allt0 = allt.a;
                }
                hfuo hfuo0 = allt0.c;
                byte[][] arr2_b = new byte[hfuo0.size()][];
                for(int v4 = 0; v4 < hfuo0.size(); ++v4) {
                    arr2_b[v4] = ((ByteString)hfuo0.get(v4)).toByteArray();
                }
                switch(allt0.b) {
                    case 0: {
                        v3 = 2;
                        break;
                    }
                    case 1: {
                        break;
                    }
                    default: {
                        v3 = 0;
                    }
                }
                if(v3 == 0) {
                    v3 = 1;
                }
                AttestationVerifier attestationVerifier0 = new AttestationVerifier(arr2_b, alls.a(v3));
                Object object0 = akzn0.c;
                synchronized(object0) {
                    akzm akzm0 = (akzm)akzn0.b.get(s);
                    if(akzm0 != null) {
                        akzm0.b = attestationVerifier0;
                    }
                }
            }
            alup alup0 = alup.b(((alti)hfvm0).c);
            if(alup0 == null) {
                alup0 = alup.c;
            }
            switch(alup0.ordinal()) {
                case 0: {
                    this.n = false;
                    break;
                }
                case 1: {
                    this.n = true;
                    break;
                }
                case 2: {
                    baun baun0 = aloz.a;
                    alup alup1 = alup.b(((alti)hfvm0).c);
                    if(alup1 == null) {
                        alup1 = alup.c;
                    }
                    baun0.m("Unrecognized notification setting " + alup1.a(), new Object[0]);
                }
            }
            baun baun1 = aloz.a;
            Boolean boolean0 = Boolean.valueOf(this.n);
            alup alup2 = alup.b(((alti)hfvm0).c);
            if(alup2 == null) {
                alup2 = alup.c;
            }
            baun1.h("areNotificationsRequested set to %s from %s CrosState notification setting", new Object[]{boolean0, alup2});
            if(hpzm.s()) {
                alou alou0 = new alou(this);
                this.g.execute(alou0);
            }
            else {
                this.d.b(this.b, this.c);
            }
            int v6 = ((alti)hfvm0).d;
            switch((altg.a(v6) == 0 ? 1 : altg.a(v6)) - 2) {
                case 0: {
                    this.e = false;
                    break;
                }
                case 1: {
                    this.e = true;
                    break;
                }
                default: {
                    int v7 = altg.a(v6) == 0 ? 1 : altg.a(v6);
                    if(v7 == 1) {
                        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
                    }
                    baun1.m("Unrecognized notification setting " + (v7 - 2), new Object[0]);
                    break;
                }
            }
            if(hpzm.O()) {
                this.o = ((alti)hfvm0).f;
            }
            if(hpzm.s()) {
                alop alop0 = new alop(this);
                this.g.execute(alop0);
            }
            else {
                this.m(((boolean)(hpzm.n() ^ 1)));
            }
            aloq aloq0 = () -> {
                alvg alvg0;
                List list0;
                if(hpzm.p() && this.s()) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)alsy.a).v_newBuilder();
                    String s = this.b();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)alvg.a).v_newBuilder();
                    try {
                        list0 = this.r.d(s, true);
                    }
                    catch(ywm ywm0) {
                        aldi.a.g("Profile unavailable", ywm0, new Object[0]);
                        alvg0 = (alvg)hftp1.N_build();
                        goto label_16;
                    }
                    if(list0 == null) {
                        aldi.a.f("Streamable app list is null", new Object[0]);
                    }
                    else {
                        Collection.-EL.stream(list0).sorted(aldi.c()).forEachOrdered(new alde(hftp1));
                    }
                    alvg0 = (alvg)hftp1.N_build();
                label_16:
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    alsy alsy0 = (alsy)hftp0.b_message;
                    alvg0.getClass();
                    alsy0.c = alvg0;
                    alsy0.b |= 1;
                    this.l(((MessageLite)hftp0.N_build()));
                }
            };
            this.g.execute(aloq0);
            aliu0.H(0);
            return;
        }
        if((hfvm0 instanceof alve)) {
            aliu0.H(1);
            if(!this.v()) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)alvf.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((alvf)hftp0.b_message).b = 2;
                this.l(((MessageLite)hftp0.N_build()));
                return;
            }
            Intent intent1 = new Intent().setClassName(this.b.getApplicationContext(), "com.google.android.gms.auth.proximity.phonehub.NotificationOptInActivity").setFlags(0x10000000);
            this.b.startActivity(intent1);
            this.l(((MessageLite)alvf.a));
            return;
        }
        if((hfvm0 instanceof alto)) {
            aliu0.H(11);
            if(!hpzm.u()) {
                aloz.a.m("Received FeatureSetupRequest but it is not yet supported", new Object[0]);
                return;
            }
            boolean z = ((alto)hfvm0).b;
            if(z && !this.v()) {
                aloz.a.m("Was requested to set up notifications but notification actions are not supported", new Object[0]);
                z = false;
            }
            if(TextUtils.isEmpty(this.b())) {
                aloz.a.m("Could not handle FeatureSetupRequest due to empty account name", new Object[0]);
                return;
            }
            if(hpzm.P() && bbqa.c()) {
                aloz.a.h("Requesting permissions using CDM.", new Object[0]);
                CdmAssociationChimeraActivity.a(this.b(), this.l);
                return;
            }
            Context context0 = this.b.getApplicationContext();
            String s1 = this.b();
            boolean z1 = ((alto)hfvm0).c;
            Intent intent2 = new Intent().setClassName(context0, "com.google.android.gms.auth.proximity.phonehub.PhoneHubFeatureSetupActivity").setFlags(0x10000000).putExtra("accountName", s1).putExtra("cameraRollSetupRequested", z1).putExtra("notificationSetupRequested", z).putExtra("deviceId", this.l);
            this.b.startActivity(intent2);
            if(hpzm.z()) {
                return;
            }
            this.l(((MessageLite)altp.a));
            return;
        }
        if((hfvm0 instanceof altl)) {
            aliu0.H(2);
            this.t.a(bbdg.ho);
            this.t.a(bbdg.hp);
            if(!this.v()) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)altm.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((altm)hftp1.b_message).b = 2;
                this.l(((MessageLite)hftp1.N_build()));
                return;
            }
            alrj alrj0 = this.c;
            int v8 = (int)((altl)hfvm0).b;
            if(!alrj0.g()) {
                alrj.a.m("Cannot dismiss notification since listener is not connected", new Object[0]);
                goto label_158;
            }
            if(alrn.a()) {
                statusBarNotification0 = alrv.c(alrj0.c).b(v8);
            }
            else {
                statusBarNotification0 = hpzm.s() ? alrj0.f.b(v8) : alrj0.d.a(v8);
            }
            if(statusBarNotification0 == null) {
                alrj.a.m("Cannot dismiss notification since notification ID does not correspond to a known notification", new Object[0]);
            label_158:
                aloz.a.m("Could not dismiss notification", new Object[0]);
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)altm.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((altm)hftp2.b_message).b = 1;
                this.l(((MessageLite)hftp2.N_build()));
                return;
            }
            String s2 = statusBarNotification0.getNotification().getGroup();
            if(!TextUtils.isEmpty(s2)) {
                if(alrn.a()) {
                    arr_statusBarNotification = alrv.c(alrj0.c).p();
                }
                else {
                    arr_statusBarNotification = hpzm.s() ? alrj0.f.p() : alrj0.d.getActiveNotifications();
                }
                int v9 = 0;
                for(int v = 0; v < arr_statusBarNotification.length; ++v) {
                    StatusBarNotification statusBarNotification1 = arr_statusBarNotification[v];
                    if(s2.equals(statusBarNotification1.getNotification().getGroup())) {
                        if((statusBarNotification0.getNotification().flags & 0x200) == 0) {
                            ++v9;
                        }
                        else {
                            intent0 = statusBarNotification1;
                        }
                    }
                }
                if(v9 == 1 && intent0 != null) {
                    if(alrn.a()) {
                        alrv.c(alrj0.c).l(((StatusBarNotification)intent0));
                    }
                    else if(hpzm.s()) {
                        alrj0.f.k(((StatusBarNotification)intent0));
                    }
                    else {
                        alrj0.d.cancelNotification(((StatusBarNotification)intent0).getKey());
                    }
                }
            }
            if(alrn.a()) {
                alrv.c(alrj0.c).l(statusBarNotification0);
            }
            else if(hpzm.s()) {
                alrj0.f.k(statusBarNotification0);
            }
            else {
                alrj0.d.cancelNotification(statusBarNotification0.getKey());
            }
            this.l(((MessageLite)altm.a));
            return;
        }
        if((hfvm0 instanceof alun)) {
            aliu0.H(3);
            this.t.a(bbdg.ho);
            this.t.a(bbdg.hp);
            if(!this.v()) {
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)aluo.a).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((aluo)hftp3.b_message).b = 2;
                this.l(((MessageLite)hftp3.N_build()));
                return;
            }
            alrj alrj1 = this.c;
            int v10 = (int)((alun)hfvm0).b;
            String s3 = ((alun)hfvm0).c;
            if(!alrj1.g()) {
                alrj.a.m("Cannot send reply since listener is not connected", new Object[0]);
                goto label_256;
            }
            if(alrn.a()) {
                statusBarNotification2 = alrv.c(alrj1.c).b(v10);
            }
            else {
                statusBarNotification2 = hpzm.s() ? alrj1.f.b(v10) : alrj1.d.a(v10);
            }
            if(statusBarNotification2 == null) {
                alrj.a.m("Cannot reply to notification since notification ID does not correspond to a known notification", new Object[0]);
                goto label_256;
            }
            if(TextUtils.isEmpty(s3)) {
                alrj.a.m("Cannot reply to notification since reply text is empty", new Object[0]);
                goto label_256;
            }
            Notification.Action[] arr_notification$Action = statusBarNotification2.getNotification().actions;
            for(int v11 = 0; true; ++v11) {
                notification$Action0 = null;
                if(v11 >= arr_notification$Action.length) {
                    break;
                }
                Notification.Action notification$Action1 = arr_notification$Action[v11];
                if(alqb.b(notification$Action1)) {
                    notification$Action0 = notification$Action1;
                    break;
                }
            }
            if(notification$Action0 == null) {
                alrj.a.m("Cannot reply to notification since there\'s no replyable action", new Object[0]);
                goto label_256;
            }
            RemoteInput[] arr_remoteInput = notification$Action0.getRemoteInputs();
            arr_remoteInput.getClass();
            Intent intent3 = null;
            for(int v12 = 0; true; ++v12) {
                if(v12 >= arr_remoteInput.length) {
                    intent0 = intent3;
                    break;
                }
                RemoteInput remoteInput0 = arr_remoteInput[v12];
                if(remoteInput0.getAllowFreeFormInput()) {
                    if(intent3 != null) {
                        break;
                    }
                    intent3 = remoteInput0;
                }
            }
            if(intent0 == null) {
                alrj.a.m("Cannot reply to notification since there\'s no valid remote input", new Object[0]);
            label_256:
                aloz.a.m("Could not perform inline reply", new Object[0]);
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)aluo.a).v_newBuilder();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ((aluo)hftp4.b_message).b = 1;
                this.l(((MessageLite)hftp4.N_build()));
                return;
            }
            Intent intent4 = new Intent().addFlags(0x10000000);
            Bundle bundle0 = new Bundle();
            bundle0.putString(((RemoteInput)intent0).getResultKey(), s3);
            RemoteInput.addResultsToIntent(new RemoteInput[]{intent0}, intent4, bundle0);
            RemoteInput.setResultsSource(intent4, 0);
            alrj1.b(notification$Action0, intent4);
            this.l(((MessageLite)aluo.a));
            return;
        }
        if((hfvm0 instanceof alvj)) {
            aliu0.H(4);
            if(this.v()) {
                Context context1 = this.b;
                if(alrj.c(context1)) {
                    int v13 = ((alvj)hfvm0).b == 1 ? 1 : 0;
                    if(v13 != 0 && alnq.a) {
                        bayn bayn0 = bayn.f(context1);
                        if(bayn0 == null) {
                            alrm.a.m("Could not retrieve notification manager", new Object[0]);
                            context1.startService(akwy.b(context1));
                        }
                        else if(!alrm.b(bayn0)) {
                            context1.startService(akwy.b(context1));
                        }
                    }
                    alrj alrj2 = this.c;
                    if(!alrj.c(alrj2.c)) {
                        alrj.a.h("Cannot toggle DND mode since notification policy access is not granted", new Object[0]);
                        goto label_292;
                    }
                    bayn bayn1 = bayn.f(alrj2.c);
                    if(bayn1 == null) {
                        alrj.a.m("Could not retrieve notification manager", new Object[0]);
                    label_292:
                        aloz.a.m("Could not update notification mode", new Object[0]);
                        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)alvk.a).v_newBuilder();
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ((alvk)hftp5.b_message).b = 1;
                        this.l(((MessageLite)hftp5.N_build()));
                        return;
                    }
                    if(1 != v13) {
                        v1 = 1;
                    }
                    bayn1.a.z(v1);
                    this.l(((MessageLite)alvk.a));
                    return;
                }
            }
            ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)alvk.a).v_newBuilder();
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            ((alvk)hftp6.b_message).b = 2;
            this.l(((MessageLite)hftp6.N_build()));
            return;
        }
        if((hfvm0 instanceof alvc)) {
            aliu0.H(5);
            switch(((alvc)hfvm0).b) {
                case 0: {
                    break;
                }
                case 1: {
                    v1 = 3;
                    break;
                }
                default: {
                    v1 = 0;
                }
            }
            if(v1 == 3) {
                Intent intent5 = akwy.a(this.b);
                if(intent5 != null) {
                    intent0 = intent5.putExtra("com.google.android.gms.mdm.services.EXTRA_OPERATION", "com.google.android.gms.mdm.services.OPERATION_START_RINGING");
                }
            }
            else {
                intent0 = akwy.b(this.b);
            }
            if(intent0 != null) {
                this.b.startService(intent0);
                this.l(((MessageLite)alvd.a));
                return;
            }
            aloz.a.m("Couldn\'t retrieve ringing intent", new Object[0]);
            ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)alvd.a).v_newBuilder();
            if(!hftp7.b_message.isImmutable()) {
                hftp7.ensureMutable();
            }
            ((alvd)hftp7.b_message).b = 1;
            this.l(((MessageLite)hftp7.N_build()));
            return;
        }
        if((hfvm0 instanceof altu)) {
            aliu0.H(6);
            int v14 = ((altu)hfvm0).b;
            hfuo hfuo1 = ((altu)hfvm0).c;
            baun baun2 = aloz.a;
            baun2.h("Camera Roll: Request message: %d items", new Object[]{hfuo1.size()});
            gged_interceptors gged0 = this.s.b(v14, hfuo1);
            ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)altv.a).v_newBuilder();
            if(!hftp8.b_message.isImmutable()) {
                hftp8.ensureMutable();
            }
            altv altv0 = (altv)hftp8.b_message;
            hfuo hfuo2 = altv0.b;
            if(!hfuo2.c()) {
                altv0.b = ProtoLiteMessage.E(hfuo2);
            }
            hfrj.E(gged0, altv0.b);
            baun2.h("Camera Roll: Response message: %d items", new Object[]{((altv)hftp8.b_message).b.size()});
            this.l(((MessageLite)hftp8.N_build()));
            return;
        }
        if((hfvm0 instanceof altr)) {
            aliu0.H(7);
            ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)altt.a).v_newBuilder();
            alte alte0 = ((altr)hfvm0).b;
            if(alte0 == null) {
                alte0 = alte.a;
            }
            if(!hftp9.b_message.isImmutable()) {
                hftp9.ensureMutable();
            }
            altt altt0 = (altt)hftp9.b_message;
            alte0.getClass();
            altt0.c = alte0;
            altt0.b |= 1;
            almu almu0 = this.s;
            alte alte1 = ((altr)hfvm0).b;
            if(alte1 == null) {
                alte1 = alte.a;
            }
            ParcelFileDescriptor parcelFileDescriptor0 = almu0.a(alte1);
            if(parcelFileDescriptor0 == null) {
                if(!hftp9.b_message.isImmutable()) {
                    hftp9.ensureMutable();
                }
                ((altt)hftp9.b_message).d = 2;
            }
            else {
                cuwu cuwu0 = cuwu.e(cuws.b(parcelFileDescriptor0), cuwu.a());
                if(!hftp9.b_message.isImmutable()) {
                    hftp9.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp9.b_message;
                ((altt)hftv0).d = 1;
                long v15 = cuwu0.i;
                if(!hftv0.isImmutable()) {
                    hftp9.ensureMutable();
                }
                ((altt)hftp9.b_message).e = v15;
                try {
                    parcelFileDescriptor0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            this.l(((MessageLite)hftp9.N_build()));
            return;
        }
        if((hfvm0 instanceof altz)) {
            aliu0.H(8);
            almu almu1 = this.s;
            alte alte2 = ((altz)hfvm0).b;
            if(alte2 == null) {
                alte2 = alte.a;
            }
            ParcelFileDescriptor parcelFileDescriptor1 = almu1.a(alte2);
            if(parcelFileDescriptor1 != null) {
                long v16 = ((altz)hfvm0).c;
                akzc akzc0 = new akzc(AppContextProvider.a());
                FileParams fileParams0 = new FileParams(this.v.a, "phone_hub", parcelFileDescriptor1, v16);
                azzc azzc0 = new azzc();
                azzc0.a = new akyt(fileParams0);
                azzc0.d = 0x677;
                azzc0.c = new Feature[]{amkb.b};
                akzc0.jn(azzc0.a());
                return;
            }
            baun baun3 = aloz.a;
            alte alte3 = ((altz)hfvm0).b;
            if(alte3 == null) {
                alte3 = alte.a;
            }
            baun3.m("File not available for camera roll item %s", new Object[]{alte3.b});
            return;
        }
        if((hfvm0 instanceof altj)) {
            if(!hpzc.e()) {
                return;
            }
            aliu0.H(9);
            if(!this.v()) {
                ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)altk.a).v_newBuilder();
                if(!hftp10.b_message.isImmutable()) {
                    hftp10.ensureMutable();
                }
                ((altk)hftp10.b_message).b = 2;
                this.l(((MessageLite)hftp10.N_build()));
                return;
            }
            alrj alrj3 = this.c;
            int v17 = ((altj)hfvm0).b;
            if(!alrj3.g()) {
                alrj.a.m("Cannot decline the incoming call since listener is not connected", new Object[0]);
                goto label_433;
            }
            if(alrn.a()) {
                statusBarNotification3 = alrv.c(alrj3.c).b(v17);
            }
            else {
                statusBarNotification3 = hpzm.s() ? alrj3.f.b(v17) : alrj3.d.a(v17);
            }
            if(statusBarNotification3 == null) {
                alrj.a.m("Cannot decline the incoming call since notification ID does not correspond to a known notification", new Object[0]);
                goto label_433;
            }
            Notification.Action notification$Action2 = alrj3.a(statusBarNotification3, "android.declineIntent");
            if(notification$Action2 == null) {
                alrj.a.m("Cannot decline the incoming call since there is no decline action", new Object[0]);
            label_433:
                aloz.a.m("Could not decline incoming call", new Object[0]);
                ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)altk.a).v_newBuilder();
                if(!hftp11.b_message.isImmutable()) {
                    hftp11.ensureMutable();
                }
                ((altk)hftp11.b_message).b = 1;
                this.l(((MessageLite)hftp11.N_build()));
                return;
            }
            alrj3.b(notification$Action2, albt.a(alrj3.c, notification$Action2));
            this.l(((MessageLite)altk.a));
            return;
        }
        if((hfvm0 instanceof altx)) {
            if(hpzc.e()) {
                aliu0.H(10);
                if(!this.v()) {
                    ProtoLiteBuilder hftp12 = ((ProtoLiteMessage)alty.a).v_newBuilder();
                    if(!hftp12.b_message.isImmutable()) {
                        hftp12.ensureMutable();
                    }
                    ((alty)hftp12.b_message).b = 2;
                    this.l(((MessageLite)hftp12.N_build()));
                    return;
                }
                alrj alrj4 = this.c;
                int v18 = ((altx)hfvm0).b;
                if(!alrj4.g()) {
                    alrj.a.m("Cannot hang up the ongoing call since listener is not connected", new Object[0]);
                    goto label_468;
                }
                if(alrn.a()) {
                    statusBarNotification4 = alrv.c(alrj4.c).b(v18);
                }
                else {
                    statusBarNotification4 = hpzm.s() ? alrj4.f.b(v18) : alrj4.d.a(v18);
                }
                if(statusBarNotification4 == null) {
                    alrj.a.m("Cannot hang up the ongoing call since notification ID does not correspond to a knownnotification", new Object[0]);
                    goto label_468;
                }
                Notification.Action notification$Action3 = alrj4.a(statusBarNotification4, "android.hangUpIntent");
                if(notification$Action3 == null) {
                    alrj.a.m("Cannot hang up the ongoing call since there is no hang up action", new Object[0]);
                label_468:
                    aloz.a.m("Could not hang up ongoing call", new Object[0]);
                    ProtoLiteBuilder hftp13 = ((ProtoLiteMessage)alty.a).v_newBuilder();
                    if(!hftp13.b_message.isImmutable()) {
                        hftp13.ensureMutable();
                    }
                    ((alty)hftp13.b_message).b = 1;
                    this.l(((MessageLite)hftp13.N_build()));
                    return;
                }
                alrj4.b(notification$Action3, albt.a(alrj4.c, notification$Action3));
                this.l(((MessageLite)alty.a));
            }
            return;
        }
        if(hpzm.C() && (hfvm0 instanceof alux)) {
            this.l(((MessageLite)aluy.a));
            return;
        }
        aloz.a.m("Received unsupported message type", new Object[0]);
    }

    @Override  // alrd
    public final void h(StatusBarNotification statusBarNotification0, NotificationListenerService.Ranking notificationListenerService$Ranking0) {
        int v;
        if(!this.r()) {
            return;
        }
        baun baun0 = aloz.a;
        baun0.h("XPF-Notification id=%s is ready to be submitted to the client. (userId = %s)", new Object[]{statusBarNotification0.getId(), Process.myUserHandle().getIdentifier()});
        alul alul0 = this.a(statusBarNotification0, notificationListenerService$Ranking0);
        if(((ProtoLiteMessage)alul0).isImmutable()) {
            v = ((ProtoLiteMessage)alul0).s();
        }
        else {
            v = alul0.memoizedHashCode;
            if(v == 0) {
                v = ((ProtoLiteMessage)alul0).s();
                alul0.memoizedHashCode = v;
            }
        }
        Map map0 = this.p;
        if(map0.containsKey(Long.valueOf(alul0.c)) && ((int)(((Integer)map0.get(Long.valueOf(alul0.c))))) == v) {
            baun0.h("Not sending notification %d since update has no change", new Object[]{((long)alul0.c)});
            return;
        }
        map0.put(Long.valueOf(alul0.c), Integer.valueOf(v));
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aluw.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aluw aluw0 = (aluw)hftp0.b_message;
        alul0.getClass();
        hfuo hfuo0 = aluw0.d;
        if(!hfuo0.c()) {
            aluw0.d = ProtoLiteMessage.E(hfuo0);
        }
        aluw0.d.add(alul0);
        this.o(((aluw)hftp0.N_build()));
        this.t.a(bbdg.hp);
    }

    @Override  // alrd
    public final void i(StatusBarNotification statusBarNotification0, ParcelableRanking parcelableRanking0) {
        alrc.a(this, statusBarNotification0, parcelableRanking0);
    }

    @Override  // alrd
    public final void j(int v, StatusBarNotification statusBarNotification0) {
        if(!this.r()) {
            return;
        }
        this.p.remove(Long.valueOf(v));
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aluw.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aluw aluw0 = (aluw)hftp0.b_message;
        hfui hfui0 = aluw0.e;
        if(!hfui0.c()) {
            aluw0.e = ProtoLiteMessage.D(hfui0);
        }
        aluw0.e.g(((long)v));
        this.o(((aluw)hftp0.N_build()));
        this.t.a(bbdg.hp);
    }

    // Detected as a lambda impl.
    public final void k() {
        alvg alvg0;
        List list0;
        if(hpzm.p() && this.s()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)alsy.a).v_newBuilder();
            String s = this.b();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)alvg.a).v_newBuilder();
            try {
                list0 = this.r.d(s, true);
            }
            catch(ywm ywm0) {
                aldi.a.g("Profile unavailable", ywm0, new Object[0]);
                alvg0 = (alvg)hftp1.N_build();
                goto label_16;
            }
            if(list0 == null) {
                aldi.a.f("Streamable app list is null", new Object[0]);
            }
            else {
                Collection.-EL.stream(list0).sorted(aldi.c()).forEachOrdered(new alde(hftp1));
            }
            alvg0 = (alvg)hftp1.N_build();
        label_16:
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            alsy alsy0 = (alsy)hftp0.b_message;
            alvg0.getClass();
            alsy0.c = alvg0;
            alsy0.b |= 1;
            this.l(((MessageLite)hftp0.N_build()));
        }
    }

    public final void l(MessageLite hfvm0) {
        byte[] arr_b1;
        String s;
        try {
            baun baun0 = aloz.a;
            switch(alpb.a(hfvm0)) {
                case 2: {
                    s = "PROVIDE_CROS_STATE";
                    break;
                }
                case 3: {
                    s = "PHONE_STATUS_SNAPSHOT";
                    break;
                }
                case 4: {
                    s = "PHONE_STATUS_UPDATE";
                    break;
                }
                case 5: {
                    s = "UPDATE_NOTIFICATION_MODE_REQUEST";
                    break;
                }
                case 6: {
                    s = "UPDATE_NOTIFICATION_MODE_RESPONSE";
                    break;
                }
                case 7: {
                    s = "RING_DEVICE_REQUEST";
                    break;
                }
                case 8: {
                    s = "RING_DEVICE_RESPONSE";
                    break;
                }
                case 9: {
                    s = "UPDATE_BATTERY_MODE_REQUEST";
                    break;
                }
                case 10: {
                    s = "UPDATE_BATTERY_MODE_RESPONSE";
                    break;
                }
                case 11: {
                    s = "DISMISS_NOTIFICATION_REQUEST";
                    break;
                }
                case 12: {
                    s = "DISMISS_NOTIFICATION_RESPONSE";
                    break;
                }
                case 13: {
                    s = "NOTIFICATION_INLINE_REPLY_REQUEST";
                    break;
                }
                case 14: {
                    s = "NOTIFICATION_INLINE_REPLY_RESPONSE";
                    break;
                }
                case 15: {
                    s = "SHOW_NOTIFICATION_ACCESS_SETUP_REQUEST";
                    break;
                }
                case 16: {
                    s = "SHOW_NOTIFICATION_ACCESS_SETUP_RESPONSE";
                    break;
                }
                case 17: {
                    s = "FETCH_CAMERA_ROLL_ITEMS_REQUEST";
                    break;
                }
                case 18: {
                    s = "FETCH_CAMERA_ROLL_ITEMS_RESPONSE";
                    break;
                }
                case 19: {
                    s = "FETCH_CAMERA_ROLL_ITEM_DATA_REQUEST";
                    break;
                }
                case 20: {
                    s = "FETCH_CAMERA_ROLL_ITEM_DATA_RESPONSE";
                    break;
                }
                case 21: {
                    s = "INITIATE_CAMERA_ROLL_ITEM_TRANSFER_REQUEST";
                    break;
                }
                case 22: {
                    s = "DECLINE_INCOMING_CALL_REQUEST";
                    break;
                }
                case 23: {
                    s = "DECLINE_INCOMING_CALL_RESPONSE";
                    break;
                }
                case 24: {
                    s = "HANGUP_ONGOING_CALL_REQUEST";
                    break;
                }
                case 25: {
                    s = "HANGUP_ONGOING_CALL_RESPONSE";
                    break;
                }
                case 26: {
                    s = "FEATURE_SETUP_REQUEST";
                    break;
                }
                case 27: {
                    s = "FEATURE_SETUP_RESPONSE";
                    break;
                }
                case 28: {
                    s = "PING_REQUEST";
                    break;
                }
                case 29: {
                    s = "PING_RESPONSE";
                    break;
                }
                case 30: {
                    s = "APP_STREAM_UPDATE";
                    break;
                }
                case 0x1F: {
                    s = "APP_LIST_UPDATE";
                    break;
                }
                default: {
                    s = "APP_LIST_INCREMENTAL_UPDATE";
                }
            }
            baun0.h("Sending %s: %s", new Object[]{s, hfvm0});
        }
        catch(hfur unused_ex) {
            aloz.a.h("Sending message: %s", new Object[]{hfvm0});
        }
        try {
            akzc akzc0 = new akzc(AppContextProvider.a());
            String s1 = this.v.a;
            batl.s(hfvm0);
            int v = alpb.a(hfvm0);
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            byte[] arr_b = ByteBuffer.allocate(2).putShort(((short)aluc.a(v))).array();
            try {
                byteArrayOutputStream0.write(arr_b);
                hfvm0.writeToStream(byteArrayOutputStream0);
            }
            catch(IOException iOException0) {
                alpb.a.n("Error serializing MessageWrapper: ", iOException0, new Object[0]);
                arr_b1 = null;
                goto label_80;
            }
            arr_b1 = byteArrayOutputStream0.toByteArray();
        label_80:
            akzc0.g(new WireMessageParams(s1, arr_b1, "phone_hub"));
        }
        catch(hfur hfur0) {
            PhoneHubChimeraService.a.n("Couldn\'t convert message to bytes", hfur0, new Object[0]);
        }
        this.t.a(bbdg.hn);
        if(hpzm.B()) {
            aliv aliv0 = this.u;
            if(aliv0 != null) {
                try {
                    aliv0.d(3, alpb.a(hfvm0));
                }
                catch(hfur hfur1) {
                    aloz.a.n("Failed to log message sending event when parsing message type", hfur1, new Object[0]);
                }
            }
        }
    }

    public final void m(boolean z) {
        int v3;
        int v1;
        alri alri0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aluv.a).v_newBuilder();
        RemoteDevice remoteDevice0 = null;
        if(this.r()) {
            alrj alrj0 = this.c;
            if(alrj0.g()) {
                alri0 = new alri();
                if(alrn.a()) {
                    alri0.a = alrv.c(alrj0.c).g();
                    alri0.b = alrv.c(alrj0.c).a();
                }
                else if(hpzm.s()) {
                    alri0.a = alrj0.f.g();
                    alri0.b = alrj0.f.a();
                }
                else {
                    alri0.a = alrj0.d.b();
                    alri0.b = alrj0.d.getCurrentRanking();
                }
            }
            else {
                alrj.a.m("getSnaphot(): notification listener is not connected.", new Object[0]);
                alri0 = null;
            }
            if(alri0 == null) {
                aloz.a.m("Notification snapshot is null", new Object[0]);
            }
            else {
                aloz.a.h("Notification snapshot: %s notifications", new Object[]{alri0.a.size()});
                ArrayList arrayList0 = new ArrayList();
                long v = 0L;
                for(Object object0: alri0.a) {
                    StatusBarNotification statusBarNotification0 = (StatusBarNotification)object0;
                    NotificationListenerService.Ranking notificationListenerService$Ranking0 = new NotificationListenerService.Ranking();
                    NotificationListenerService.RankingMap notificationListenerService$RankingMap0 = alri0.b;
                    if(notificationListenerService$RankingMap0 != null) {
                        notificationListenerService$RankingMap0.getRanking(statusBarNotification0.getKey(), notificationListenerService$Ranking0);
                    }
                    alul alul0 = this.a(statusBarNotification0, notificationListenerService$Ranking0);
                    Map map0 = this.p;
                    Long long0 = (long)alul0.c;
                    if(((ProtoLiteMessage)alul0).isImmutable()) {
                        v1 = ((ProtoLiteMessage)alul0).s();
                    }
                    else {
                        int v2 = alul0.memoizedHashCode;
                        if(v2 == 0) {
                            v1 = ((ProtoLiteMessage)alul0).s();
                            alul0.memoizedHashCode = v1;
                        }
                        else {
                            v1 = v2;
                        }
                    }
                    map0.put(long0, Integer.valueOf(v1));
                    arrayList0.add(alul0);
                    if(hpzm.J()) {
                        if(((ProtoLiteMessage)alul0).isImmutable()) {
                            v3 = ((ProtoLiteMessage)alul0).t(null);
                            if(v3 < 0) {
                                throw new IllegalStateException("serialized size must be non-negative, was " + v3);
                            }
                        }
                        else {
                            int v4 = alul0.memoizedSerializedSize & 0x7FFFFFFF;
                            if(v4 == 0x7FFFFFFF) {
                                v4 = ((ProtoLiteMessage)alul0).t(null);
                                if(v4 < 0) {
                                    throw new IllegalStateException("serialized size must be non-negative, was " + v4);
                                }
                                alul0.memoizedSerializedSize = alul0.memoizedSerializedSize & 0x80000000 | v4;
                            }
                            v3 = v4;
                        }
                        v += (long)v3;
                        if(v > hpzm.a.f().g()) {
                            break;
                        }
                    }
                }
                if(hpzm.J()) {
                    new aliu().C("phone_hub_excess_snapshot_notifications", alri0.a.size() - arrayList0.size());
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                aluv aluv0 = (aluv)hftp0.b_message;
                hfuo hfuo0 = aluv0.d;
                if(!hfuo0.c()) {
                    aluv0.d = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(arrayList0, aluv0.d);
            }
        }
        if(z && this.s()) {
            String s = this.b();
            alvg alvg0 = this.r.b(s);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aluv aluv1 = (aluv)hftp0.b_message;
            alvg0.getClass();
            aluv1.e = alvg0;
            aluv1.b |= 2;
        }
        String s1 = this.b();
        if(TextUtils.isEmpty(s1)) {
            aloz.a.m("Could not get Camera Roll access state due to empty account name", new Object[0]);
            return;
        }
        if(hpzm.O() && this.o) {
            remoteDevice0 = akzn.c().b(this.l);
            if(remoteDevice0 == null) {
                aloz.a.m("sendPhoneSnapshot: Device is no longer registered", new Object[0]);
                return;
            }
        }
        gmbu.t(this.m.a(this.b, s1, remoteDevice0, this.o), new alox(this, hftp0, z), gmap.a);
    }

    public final void n() {
        this.o(aluw.a);
    }

    public final void o(aluw aluw0) {
        RemoteDevice remoteDevice0;
        String s = this.b();
        if(TextUtils.isEmpty(s)) {
            aloz.a.m("Could not get Camerea Roll access state due to empty account name", new Object[0]);
            return;
        }
        if(hpzm.O()) {
            remoteDevice0 = akzn.c().b(this.l);
            if(remoteDevice0 == null) {
                aloz.a.m("sendPhoneStatusUpdate: Device is no longer registered", new Object[0]);
                return;
            }
        }
        else {
            remoteDevice0 = null;
        }
        gmbu.t(this.m.a(this.b, s, remoteDevice0, this.o), new aloy(this, aluw0), gmap.a);
    }

    public final void p(boolean z) {
        if(hpzm.p() && this.s()) {
            String s = this.b();
            alvg alvg0 = this.r.b(s);
            if(!z || !((ProtoLiteMessage)this.k).equals(alvg0)) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)alsy.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                alsy alsy0 = (alsy)hftp0.b_message;
                alvg0.getClass();
                alsy0.d = alvg0;
                alsy0.b |= 2;
                this.l(((MessageLite)hftp0.N_build()));
                this.k = alvg0;
            }
        }
    }

    public final void q() {
        altq altq0 = altq.f;
        if(this.h == altq0 && this.i == altq0) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)altp.a).v_newBuilder();
        altq altq1 = this.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        altp altp0 = (altp)hftp0.b_message;
        altp0.c = altq1.a();
        altq altq2 = this.i;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        altp altp1 = (altp)hftp0.b_message;
        altp1.b = altq2.a();
        this.l(((MessageLite)(((altp)hftp0.N_build()))));
        this.h = altq0;
        this.i = altq0;
    }

    public final boolean r() {
        if(!this.n) {
            return false;
        }
        if(hpzm.G()) {
            try {
                return ((Boolean)alol.a(this.b()).f().get()).booleanValue();
            }
            catch(ExecutionException | InterruptedException exception0) {
                aloz.a.g("error getting NotificationAccessState for account", exception0, new Object[0]);
                return false;
            }
        }
        return this.n;
    }

    public final boolean s() {
        return albt.d(this.b());
    }

    public final boolean t() {
        if(!hpzm.A()) {
            return false;
        }
        try {
            return ((aluq)((glyq)alol.a(this.b()).e()).u()).b;
        }
        catch(ExecutionException | InterruptedException exception0) {
            aloz.a.g("error getting PersonalProfileAccessState for account", exception0, new Object[0]);
            return false;
        }
    }

    public final boolean u(alsw alsw0) {
        return Long.compare(alsw0.f, Process.myUserHandle().getIdentifier()) == 0 || this.t() ? hpzm.v() && this.s() : false;
    }

    private final boolean v() {
        return hpzm.E() || !bbpj.a(this.b).h();
    }
}


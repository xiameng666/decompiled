import android.accounts.Account;
import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.provider.MediaStore.Downloads;
import android.text.TextUtils;
import android.util.ArraySet;
import com.google.android.gms.nearby.sharing.AppAttachment;
import com.google.android.gms.nearby.sharing.AppInfo;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.ContactInfo;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.QrCodeMetadata;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.ShareTargetAction;
import com.google.android.gms.nearby.sharing.StreamAttachment;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import com.google.android.gms.nearby.sharing.internal.UpdateSelectedContactsParams;
import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider.11;
import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider.16;
import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider.5;
import j..util.DesugarCollections;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import j..util.concurrent.ConcurrentLinkedQueue;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.SecureRandom;
import java.security.spec.ECPoint;
import java.text.DateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jeb.synthetic.FIN;

@Deprecated
public class dfzz implements dftm {
    public long A;
    public long B;
    public long C;
    public long D;
    public volatile ScheduledFuture E;
    public volatile ScheduledFuture F;
    public BroadcastReceiver G;
    public BroadcastReceiver H;
    public BroadcastReceiver I;
    public volatile int J;
    public long K;
    final Queue L;
    final Queue M;
    final Queue N;
    final Queue O;
    public Intent P;
    public int Q;
    public final PropertyChangeSupport R;
    public QrCodeMetadata S;
    final Map T;
    public final gfvb U;
    public final Map V;
    public final Map W;
    public final Map X;
    final AtomicBoolean Y;
    final AtomicLong Z;
    public final Map a;
    public final AtomicLong aa;
    final AtomicReference ab;
    public dcoz ac;
    public final gful_cronetEngineProvider ad;
    public final dftp ae;
    private final ScheduledExecutorService af;
    private final dbuw ag;
    private final cuud ah;
    private long ai;
    private int aj;
    private long ak;
    private final Set al;
    public final Map b;
    public final Map c;
    public final Map d;
    final Map e;
    final Map f;
    final ScheduledExecutorService g;
    public final dfzf h;
    public final Context i;
    public final PackageManager j;
    public final dcqh k;
    public final dfvp l;
    public final ScheduledExecutorService m;
    public dclv n;
    public boolean o;
    public dftl p;
    public dcnp q;
    public dftl r;
    public int s;
    public final dgah t;
    public final dgaf u;
    public final dfsk v;
    public final dcpn w;
    final dhtl x;
    public final dfuj y;
    public final dcqq z;

    public dfzz(Context context0, dfsk dfsk0, dcqh dcqh0, dgaf dgaf0, dhtl dhtl0, dcpn dcpn0, gful_cronetEngineProvider gful0) {
        this.a = new bxd();
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        ScheduledExecutorService scheduledExecutorService0 = cuui.f();
        this.g = scheduledExecutorService0;
        this.h = new dfzf(this, scheduledExecutorService0);
        this.o = false;
        this.p = null;
        this.r = null;
        this.s = 2;
        this.J = 0;
        this.L = new ArrayDeque(((int)hvqs.F()));
        this.M = new ArrayDeque(((int)hvqs.G()));
        this.N = new ArrayDeque();
        this.O = new ArrayDeque();
        this.Q = 0;
        this.T = new bxd();
        this.V = new bxd();
        new ConcurrentHashMap();
        this.W = new HashMap();
        this.al = new ArraySet();
        this.X = new bxd();
        this.Y = new AtomicBoolean();
        this.Z = new AtomicLong();
        this.aa = new AtomicLong();
        this.ab = new AtomicReference();
        this.i = context0;
        ScheduledExecutorService scheduledExecutorService1 = cuui.g(new curp(hvqf.b(), hvrc.F()));
        this.af = scheduledExecutorService1;
        this.m = cuui.f();
        this.v = dfsk0;
        this.w = dcpn0;
        this.ag = new dbuw();
        dfvp dfvp0 = new dfvp(context0);
        this.l = dfvp0;
        this.k = dcqh0;
        this.x = dhtl0;
        dgao dgao0 = new dgao(context0, dfsk0, dhtl0);
        this.t = dgao0;
        this.u = dgaf0;
        this.ae = dftp.f(context0, dfsk0, dgao0, dgaf0, dhtl0, dcpn0);
        this.y = new dfuj();
        this.z = new dcqq(context0);
        this.ah = new cuud(context0);
        this.j = context0.getPackageManager();
        if(djak.a(context0)) {
            dhtl0.m();
        }
        gfvh gfvh0 = new gfvh();
        gfvh0.f(hvqs.t(), TimeUnit.MILLISECONDS);
        gfvh0.g(hvqs.t(), TimeUnit.MILLISECONDS);
        gfvh0.h(0x7FFFFFFFL);
        this.U = gfvh0.b();
        this.R = new PropertyChangeSupport(this);
        this.ad = gful0;
        dfwy dfwy0 = scheduledExecutorService1 == null ? (gzdv gzdv0) -> {
            Account account0 = dfsk0.c();
            boolean z = bata.b(gzdv0.b, dfsk0.j(account0));
            if(!z) {
                dfsk0.C(gzdv0.b);
            }
            boolean z1 = bata.b(gzdv0.d, dfsk0.k(account0));
            boolean z2 = bata.b(gzdv0.c, dfsk0.l(account0));
            if(!z1 || !z2) {
                dfsk0.E(gzdv0.c, gzdv0.d);
            }
            if(z && (z1 || z2)) {
                return;
            }
            dcpu dcpu0 = new dcpu();
            dcpu0.a = 16;
            dcpu0.b = 1;
            dcpv dcpv0 = new dcpv(dcpu0);
            dgao0.f(dcpv0);
            dgaf0.c(dcpv0);
        } : new dfwz(scheduledExecutorService1, dfsk0, dgao0, dgaf0);
        dhtl0.k(dfwy0);
        dfsk0.q(dfvp0);
    }

    @Override  // dftm
    public final void A() {
        this.aU(new dfvw(this));
    }

    @Override  // dftm
    public final void B(byte[] arr_b) {
        throw new UnsupportedOperationException("startQrCodeSessionWithKey is not supported.");
    }

    @Override  // dftm
    public void C() {
        this.aU(new dfyg(this));
    }

    @Override  // dftm
    public void D() {
        this.aU(new dfvr(this));
    }

    @Override  // dftm
    public void E(dcpv dcpv0) {
        this.aU(new dfyc(this, dcpv0));
    }

    @Override  // dftm
    public void F(String s, dfso dfso0, QrCodeMetadata qrCodeMetadata0) {
        this.aU(new dfwt(this, dfso0, qrCodeMetadata0, s));
    }

    @Override  // dftm
    public void G(dfsq dfsq0) {
        this.aU(new dfvt(this, dfsq0));
    }

    @Override  // dftm
    public final void H(String s, ShareTarget shareTarget0, dcnp dcnp0, boolean z) {
        try {
            dfxj dfxj0 = new dfxj(this, shareTarget0, dcnp0);
            Integer integer0 = (Integer)((cuuf)this.af).e(dfxj0).get();
        }
        catch(ExecutionException executionException0) {
            dcvz.a.e().f(executionException0).h("Failed to send %s", shareTarget0);
        }
        catch(InterruptedException interruptedException0) {
            dcvz.a.e().f(interruptedException0).h("Failed to send %s", shareTarget0);
            if(!hvqz.ah()) {
                return;
            }
            Thread.currentThread().interrupt();
        }
    }

    public final float I(ShareTarget shareTarget0) {
        return shareTarget0.f ? this.ad(shareTarget0).j : this.ae(shareTarget0).u;
    }

    // Detected as a lambda impl.
    public final int J(ShareTarget shareTarget0, boolean z) {
        dcnp dcnp0 = this.Y(shareTarget0);
        if(dcnp0 == null) {
            dcvz.a.e().h("Cannot cancel. No transfer update callback for %s", shareTarget0.b);
            return 0x8AB7;
        }
        dcnp0.e(shareTarget0, new dcnn(0x3FD).a());
        boolean z1 = shareTarget0.f;
        if(z1) {
            this.ad(shareTarget0).g = z;
        }
        else {
            this.ae(shareTarget0).j = z;
        }
        this.bd(shareTarget0, true);
        cunf cunf0 = dcvz.a;
        cunf0.b().h("%s payload transfer has been canceled.", (z1 ? "Incoming" : "Outgoing"));
        if(z1 && djbr.u(shareTarget0.e())) {
            AppAttachment appAttachment0 = (AppAttachment)shareTarget0.d().get(0);
            if(appAttachment0.i) {
                String[] arr_s = appAttachment0.c;
                AppInfo appInfo0 = dizi.a(appAttachment0);
                if(appInfo0 != null && appInfo0.e == 1 && arr_s != null) {
                    for(int v = 0; v < arr_s.length; ++v) {
                        String s = arr_s[v];
                        (hrnt.i() ? new File(ccsb.a.a(s)) : new File(s)).delete();
                    }
                }
            }
        }
        int v1 = 1009;
        if(this.N.remove(shareTarget0)) {
            dcnp0.e(shareTarget0, new dcnn(1009).a());
            this.aH(shareTarget0);
            this.aC();
            cunf0.b().h("Cancelling ShareTarget %s. ShareTarget was queued. Ejecting ShareTarget from queue.", shareTarget0.b);
            return 0;
        }
        dfzu dfzu0 = (dfzu)this.W.get(Long.valueOf(shareTarget0.a));
        if(dfzu0 != null) {
            dfzu0.a.a();
            dcnp0.e(shareTarget0, new dcnn(1009).a());
            this.aH(shareTarget0);
            cunf0.b().h("Cancelling ShareTarget %s. ShareTarget was scanning for the remote device. Cancelling scan.", shareTarget0.b);
            return 0;
        }
        dfum dfum0 = this.aa(shareTarget0);
        String s1 = this.ap(shareTarget0);
        if(dfum0 == null) {
            String s2 = (String)Objects.requireNonNull(s1);
            this.l.k(s2);
            dcnp0.e(shareTarget0, new dcnn(1009).a());
            this.aH(shareTarget0);
            cunf0.b().h("Cancelling ShareTarget %s. ShareTarget making a connection request. Cancelling request.", shareTarget0.b);
            return 0;
        }
        if(hvrc.a.b().z()) {
            for(Object object0: shareTarget0.e()) {
                Attachment attachment0 = (Attachment)object0;
                if(hvqz.L() && attachment0.k()) {
                    ((StreamAttachment)attachment0).o();
                }
                else {
                    long v2 = this.O(attachment0);
                    if(v2 == -1L) {
                        continue;
                    }
                    this.l.N(v2);
                }
            }
        }
        if(z) {
            cunf0.b().h("Cancelling ShareTarget %s. Transfer is in progress. Sending a cancel request to the remote side.", shareTarget0.b);
            gmcu gmcu0 = new gmcu();
            dfum0.b(new dfws(this, shareTarget0, cumn.d(cunf0, new dfwr(dfum0, gmcu0), hvqs.m(), this.g), gmcu0));
            try {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dcjh.a).v_newBuilder();
                dcjg dcjg0 = dcjg.b;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((dcjh)hftp0.b_message).c = dcjg0.c;
                ((dcjh)hftp0.b_message).b |= 1;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dcjy.a).v_newBuilder();
                dcjx dcjx0 = dcjx.g;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((dcjy)hftp1.b_message).c = dcjx0.i;
                ((dcjy)hftp1.b_message).b |= 1;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dcjh dcjh0 = (dcjh)hftp0.b_message;
                dcjy dcjy0 = (dcjy)hftp1.N_build();
                dcjy0.getClass();
                dcjh0.d = dcjy0;
                dcjh0.b |= 2;
                dfum0.c(((dcjh)hftp0.N_build()).toBytesArray());
                cunf0.b().p("Successfully wrote a cancel frame", new Object[0]);
            }
            catch(IOException iOException0) {
                dcvz.a.e().f(iOException0).p("Failed to write the cancel frame", new Object[0]);
            }
        }
        else {
            dfum0.a();
            dcvz.a.b().h("Cancelling ShareTarget %s. Transfer is in progress. Received a cencel request and responding by closing the connection.", shareTarget0.b);
        }
        if(!z) {
            v1 = 0x3FA;
        }
        dcnp0.e(shareTarget0, new dcnn(v1).a());
        this.aH(shareTarget0);
        return 0;
    }

    public final int K() {
        int v = this.M.size();
        gged_interceptors gged0 = gged_interceptors.i(this.L);
        int v1 = gged0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            if(this.ae(((ShareTarget)gged0.get(v2))).g.get()) {
                ++v;
            }
        }
        return v;
    }

    public final int L(ShareTarget shareTarget0) {
        Queue queue0 = this.M;
        if(queue0.contains(shareTarget0)) {
            return new ArrayList(queue0).indexOf(shareTarget0) + 1;
        }
        int v = queue0.size();
        gged_interceptors gged0 = gged_interceptors.i(this.L);
        int v1 = gged0.size();
        int v2 = 0;
        while(v2 < v1) {
            ++v;
            boolean z = shareTarget0.equals(((ShareTarget)gged0.get(v2)));
            ++v2;
            if(z) {
                break;
            }
        }
        return v;
    }

    public final int M(ShareTarget shareTarget0) {
        return shareTarget0.f ? this.ad(shareTarget0).o : this.ae(shareTarget0).w;
    }

    public final int N(ShareTarget shareTarget0) {
        ParcelFileDescriptor[] arr_parcelFileDescriptor;
        long v6;
        Iterator iterator2;
        this.h.a();
        dfum dfum0 = this.aa(shareTarget0);
        if(dfum0 == null) {
            dcvz.a.e().p("Accept invoked for unknown share target", new Object[0]);
            return 0x8AB7;
        }
        dcnp dcnp0 = this.Y(shareTarget0);
        if(dcnp0 == null) {
            dcvz.a.e().p("Accept invoked for share target without TransferUpdateCallback", new Object[0]);
            dfum0.a();
            return 0x8AB7;
        }
        dfvp dfvp0 = this.l;
        dfyr dfyr0 = new dfyr(this, dcnp0, shareTarget0);
        dfvp0.u(dfum0.c, dfyr0);
        if(shareTarget0.m == 0) {
            String s = this.ap(shareTarget0);
            if(s != null) {
                dfvp0.P(s);
                goto label_22;
            }
            dfum0.a();
            dcnp0.e(shareTarget0, new dcnn(1007).a());
            dcvz.a.e().h("Failed to initiate bandwidth upgrade. No endpointId found for ShareTarget %s", shareTarget0);
            return 0x8AB7;
        }
    label_22:
        long v = this.C;
        long v1 = this.w.b();
        int v2 = this.t.a();
        cunf cunf0 = dcvz.a;
        cunf0.b().j("[ClearcutLog] RECEIVE_ATTACHMENTS_START sessionId=%s flowId=%s, isExternal=%s", Long.valueOf(v), Long.valueOf(v1), Boolean.valueOf(shareTarget0.k));
        dcou dcou0 = dcpt.e(v, shareTarget0, shareTarget0.e(), v1, v2);
        this.w.i(dcou0);
        cunf0.b().p("Logging Facet event for receive", new Object[0]);
        this.ag.a(bbdg.aA);
        dfyu dfyu0 = new dfyu(this, shareTarget0, dcnp0, dfum0, shareTarget0, dcnp0);
        HashMap hashMap0 = new HashMap();
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = shareTarget0.e().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Attachment attachment0 = (Attachment)object0;
            if(attachment0.i()) {
                List list0 = this.ar(((AppAttachment)attachment0));
                if(list0.isEmpty()) {
                    cunf0.e().h("Failed to retrieve file payloads for: %s", attachment0);
                    continue;
                }
                else {
                    for(Object object1: list0) {
                        this.aQ(((Long)object1).longValue(), dfyu0);
                    }
                    iterator2 = iterator0;
                    goto label_100;
                }
                goto label_50;
            }
            else {
            label_50:
                if(attachment0.k()) {
                    long v3 = this.ab(attachment0).d;
                    if(v3 == -1L) {
                        cunf0.e().h("Failed to retrieve payloadId to register payload status listener for attachment: %s", attachment0);
                        continue;
                    }
                    else {
                        this.aQ(v3, dfyu0);
                        iterator2 = iterator0;
                        goto label_100;
                    }
                    goto label_58;
                }
                else {
                label_58:
                    long v4 = this.O(attachment0);
                    if(v4 == -1L) {
                        cunf0.e().h("Failed to retrieve payloadId to register payload status listener for attachment: %s", attachment0);
                        continue;
                    }
                    else {
                        if(this.bs(shareTarget0) && attachment0.j()) {
                            long v5 = ((FileAttachment)attachment0).i;
                            if(v5 > 0L) {
                                cunf cunf1 = cunf0.b();
                                Long long0 = attachment0.c();
                                cunf1.k("Received file %s with payloadId %s before. Total file size is %s bytes, existing file(s) size: %s bytes", ((FileAttachment)attachment0).a, Long.valueOf(v4), long0, Long.valueOf(v5));
                                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dciu.a).v_newBuilder();
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                iterator2 = iterator0;
                                ((dciu)hftp0.b_message).c = 1;
                                ((dciu)hftp0.b_message).b |= 1;
                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dcjb.a).v_newBuilder();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                dcjb dcjb0 = (dcjb)hftp1.b_message;
                                dcjb0.b |= 1;
                                dcjb0.c = v5;
                                dcjb dcjb1 = (dcjb)hftp1.N_build();
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                dciu dciu0 = (dciu)hftp0.b_message;
                                dcjb1.getClass();
                                dciu0.d = dcjb1;
                                dciu0.b |= 2;
                                dciu dciu1 = (dciu)hftp0.N_build();
                                hashMap0.put(Long.valueOf(((FileAttachment)attachment0).j), dciu1);
                                if(v5 == attachment0.c()) {
                                    arrayList0.add(((FileAttachment)attachment0));
                                    cunf0.b().p("Received the entire file before", new Object[0]);
                                }
                                dfyu0.l(v4, v5);
                                attachment0.c();
                                v6 = v4;
                                dfyu0.a(v6, 0L, dfvl.b);
                                goto label_99;
                            }
                        }
                        iterator2 = iterator0;
                        v6 = v4;
                    label_99:
                        this.aQ(v6, dfyu0);
                    }
                }
            }
        label_100:
            cunf0.b().h("Accepted ShareTarget %s\'s incoming files", shareTarget0.b);
            iterator0 = iterator2;
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)dciz.a).v_newBuilder();
        dciy dciy0 = dciy.b;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((dciz)hftp2.b_message).c = dciy0.g;
        ((dciz)hftp2.b_message).b |= 1;
        if(this.bs(shareTarget0)) {
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((dciz)hftp2.b_message).b().putAll(hashMap0);
        }
        if(hvqz.L()) {
            for(Object object2: shareTarget0.g()) {
                try {
                    arr_parcelFileDescriptor = ParcelFileDescriptor.createPipe();
                }
                catch(IOException iOException0) {
                    dcvz.a.e().f(iOException0).p("Failed to create a ParcelFileDescriptor pipe to share back to the sender. Rejecting the connection.", new Object[0]);
                    ((dcnp)dfyu0).e(shareTarget0, new dcnn(1007).a());
                    dfum0.a();
                    return 13;
                }
                ParcelFileDescriptor parcelFileDescriptor0 = arr_parcelFileDescriptor[0];
                ParcelFileDescriptor parcelFileDescriptor1 = arr_parcelFileDescriptor[1];
                dfzx dfzx0 = new dfzx();
                dfzx0.a = parcelFileDescriptor1;
                dfzx0.b = parcelFileDescriptor0;
                this.b.put(shareTarget0, dfzx0);
                try {
                    FileOutputStream fileOutputStream0 = new FileOutputStream(parcelFileDescriptor1.getFileDescriptor());
                    fileOutputStream0.write(new byte[]{0});
                    fileOutputStream0.flush();
                }
                catch(IOException iOException1) {
                    dcvz.a.e().f(iOException1).p("Failed to send ParcelFileDescriptor prelude to the sender. Rejecting the connection.", new Object[0]);
                    ((dcnp)dfyu0).e(shareTarget0, new dcnn(1007).a());
                    dfum0.a();
                    return 13;
                }
                cuwu cuwu0 = dfzz.bL(dfzx0);
                long v7 = cuwu0.i;
                dfyu0.k(v7);
                this.aQ(v7, dfyu0);
                new bbln(9, new dfvs(this, shareTarget0, cuwu0, dfyu0)).start();
                this.ab(((StreamAttachment)object2)).a(v7);
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)dcjs.a).v_newBuilder();
                String s1 = ((StreamAttachment)object2).a;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp3.b_message;
                s1.getClass();
                ((dcjs)hftv0).b |= 1;
                ((dcjs)hftv0).c = s1;
                if(!hftv0.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp3.b_message;
                ((dcjs)hftv1).b |= 4;
                ((dcjs)hftv1).e = v7;
                String s2 = ((StreamAttachment)object2).e;
                if(!hftv1.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp3.b_message;
                s2.getClass();
                ((dcjs)hftv2).b |= 2;
                ((dcjs)hftv2).d = s2;
                String s3 = ((StreamAttachment)object2).f;
                if(!hftv2.isImmutable()) {
                    hftp3.ensureMutable();
                }
                dcjs dcjs0 = (dcjs)hftp3.b_message;
                s3.getClass();
                dcjs0.b |= 8;
                dcjs0.f = s3;
                dcjs dcjs1 = (dcjs)hftp3.N_build();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                dciz dciz0 = (dciz)hftp2.b_message;
                dcjs1.getClass();
                hfuo hfuo0 = dciz0.e;
                if(!hfuo0.c()) {
                    dciz0.e = ProtoLiteMessage.E(hfuo0);
                }
                dciz0.e.add(dcjs1);
            }
        }
        dciz dciz1 = (dciz)hftp2.N_build();
        try {
            dfzz.bo(dfum0, dciz1);
        }
        catch(IOException unused_ex) {
            ((dcnp)dfyu0).e(shareTarget0, new dcnn(1007).a());
            dfum0.a();
            return 35510;
        }
        if(!arrayList0.isEmpty()) {
            int v8 = arrayList0.size();
            for(int v9 = 0; v9 < v8; ++v9) {
                dfyu0.a(this.O(((FileAttachment)arrayList0.get(v9))), 0L, dfvl.c);
            }
        }
        dfzi dfzi0 = this.ad(shareTarget0);
        dfzi0.l = SystemClock.uptimeMillis();
        dcvz.a.b().p("Successfully wrote the response frame", new Object[0]);
        if(!shareTarget0.f || !shareTarget0.n) {
            ((dcnp)dfyu0).e(shareTarget0, this.bV(shareTarget0));
        }
        return 0;
    }

    final long O(Attachment attachment0) {
        dfzc dfzc0 = (dfzc)this.c.get(attachment0);
        return dfzc0 == null ? -1L : dfzc0.c;
    }

    public final long P(ShareTarget shareTarget0) {
        return this.ae(shareTarget0).v;
    }

    public final Uri Q(Attachment attachment0) {
        dfzc dfzc0 = (dfzc)this.c.get(attachment0);
        return dfzc0 == null ? null : dfzc0.a;
    }

    public final Uri R(dgap dgap0) {
        if(dgap0 != null) {
            dbwr dbwr0 = dgap0.b;
            if((dbwr0.b & 4) != 0) {
                Context context0 = this.i;
                File file0 = djbw.b(context0, dbwr0.e);
                if(file0 != null) {
                    try {
                        return dfzz.bM(context0, file0);
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        dcvz.a.b().f(illegalArgumentException0).h("Failed to get content Uri for %s", file0);
                    }
                }
            }
        }
        return null;
    }

    public final Uri S(ShareTarget shareTarget0, FileAttachment fileAttachment0, File file0) {
        Uri uri0;
        String s3;
        Context context0 = this.i;
        if(dcww.b(context0).h()) {
            hvrc hvrc0 = hvrc.a;
            if(!hvrc0.b().t() || ((long)shareTarget0.e().size()) <= hvqs.S()) {
                dcvz.a.a().h("Attempting to scan media URI for %s", file0);
                gmcu gmcu0 = new gmcu();
                dfzb dfzb0 = new dfzb(this, gmcu0);
                MediaScannerConnection.scanFile(context0, new String[]{file0.toString()}, new String[]{fileAttachment0.f}, dfzb0);
                uri0 = (Uri)cuuc.h("scanFile", gmcu0, hvqs.av());
                if(uri0 == null) {
                label_16:
                    String s = fileAttachment0.f;
                    if(s.startsWith("image") || s.startsWith("video") || s.startsWith("audio")) {
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("_display_name", file0.getName());
                        contentValues0.put("mime_type", s);
                        contentValues0.put("_size", Long.valueOf(file0.length()));
                        contentValues0.put("date_added", Long.valueOf(System.currentTimeMillis()));
                        File file1 = file0.getParentFile();
                        if(file1 == null) {
                            s3 = null;
                        }
                        else {
                            String s1 = file1.getAbsolutePath();
                            String s2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                            s3 = s1.startsWith(s2) ? Environment.DIRECTORY_DOWNLOADS + s1.substring(s2.length()) : null;
                        }
                        if(s3 == null) {
                            uri0 = null;
                        }
                        else {
                            contentValues0.put("is_pending", Boolean.valueOf(true));
                            contentValues0.put("relative_path", s3);
                            uri0 = context0.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues0);
                            if(uri0 == null) {
                                uri0 = null;
                            }
                            else {
                                ContentValues contentValues1 = new ContentValues();
                                contentValues1.put("is_pending", Boolean.valueOf(false));
                                context0.getContentResolver().update(uri0, contentValues1, null, null);
                            }
                        }
                    }
                    else {
                        uri0 = null;
                    }
                    if(uri0 == null) {
                        uri0 = this.bT(file0);
                    }
                }
            }
            else if(hvrc0.b().ah()) {
                dcvz.a.a().h("Posting media URI scan for %s", file0);
                dfzz.bN(new dfvz(this, file0, fileAttachment0));
                goto label_16;
            }
            else {
                goto label_16;
            }
        }
        else {
            uri0 = this.bT(file0);
        }
        File file2 = file0.getParentFile();
        if(file2 != null && file2.getAbsolutePath().equals(this.ak().getAbsolutePath())) {
            dcvz.a.b().p("File is ready, notify download manager.", new Object[0]);
        }
        context0.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file0)));
        return uri0;
    }

    public final cuwu T(Attachment attachment0) {
        long v = this.O(attachment0);
        if(Long.compare(v, -1L) == 0) {
            dcvz.a.e().h("Failed to receive text body of %s. No payload ID found.", attachment0);
            return null;
        }
        cuwu cuwu0 = this.l.g(v);
        if(cuwu0 == null) {
            dcvz.a.e().h("Failed to receive text body of %s. No payload found.", attachment0);
            return null;
        }
        return cuwu0;
    }

    public static dcjy U(dfum dfum0) {
        dcjg dcjg1;
        dcjh dcjh0;
        byte[] arr_b;
        ConcurrentLinkedQueue concurrentLinkedQueue0;
        dfvp dfvp0;
        try {
            dfvp0 = dfum0.b;
            __monitor_enter(dfvp0);
            int v = FIN.finallyOpen$NT();
            concurrentLinkedQueue0 = dfum0.d;
            arr_b = (byte[])concurrentLinkedQueue0.poll();
            while(true) {
            label_5:
                if(arr_b != null) {
                    dcvz.a.b().i("Read NearbyConnection message %s from %s", Arrays.toString(arr_b), dfum0.c);
                    if(Arrays.equals(dfum.a, arr_b)) {
                        throw new IOException("Connection closed. Quit reading.");
                    }
                    FIN.finallyCodeBegin$NT(v);
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dcjh.a), arr_b, 0, arr_b.length, hftc.a);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    dcjh0 = (dcjh)hftv0;
                    dcjg dcjg0 = dcjg.b;
                    dcjg1 = dcjg.b(dcjh0.c);
                    if(dcjg1 == null) {
                        break;
                    }
                    goto label_19;
                }
                goto label_42;
            }
        }
        catch(IOException unused_ex) {
            return null;
        }
        dcjg1 = dcjg.a;
    label_19:
        if(!dcjg0.equals(dcjg1)) {
            dcvz.a.e().h("Failed to read V1 frame, but got %s", (dcjg.b(dcjh0.c) == null ? dcjg.a : dcjg.b(dcjh0.c)).name());
            return null;
        }
        dcjy dcjy0 = dcjh0.d == null ? dcjy.a : dcjh0.d;
        switch((dcjx.b(dcjy0.c) == null ? dcjx.a : dcjx.b(dcjy0.c)).ordinal()) {
            case 1: {
                if((dcjy0.b & 2) != 0) {
                    return dcjh0.d == null ? dcjy.a : dcjh0.d;
                }
                break;
            }
            case 2: {
                if((dcjy0.b & 4) != 0) {
                    return dcjh0.d == null ? dcjy.a : dcjh0.d;
                }
                break;
            }
            case 3: {
                if((dcjy0.b & 8) != 0) {
                    return dcjh0.d == null ? dcjy.a : dcjh0.d;
                }
                break;
            }
            case 4: {
                if((dcjy0.b & 16) != 0) {
                    return dcjh0.d == null ? dcjy.a : dcjh0.d;
                }
                break;
            }
            case 5: {
                if((dcjy0.b & 0x20) != 0) {
                    return dcjh0.d == null ? dcjy.a : dcjh0.d;
                }
                break;
            }
            case 6: {
                return dcjh0.d == null ? dcjy.a : dcjh0.d;
            }
            case 7: {
                if((dcjy0.b & 0x40) != 0) {
                    return dcjh0.d == null ? dcjy.a : dcjh0.d;
                }
            }
        }
        cunf cunf0 = dcvz.a.e();
        dcjy dcjy1 = dcjh0.d == null ? dcjy.a : dcjh0.d;
        cunf0.h("Failed to read invalid %s frame", (dcjx.b(dcjy1.c) == null ? dcjx.a : dcjx.b(dcjy1.c)).name());
        return null;
        try {
        label_42:
            if(dfum0.e) {
                throw new IOException("Connection closed. Quit reading.");
            }
            try {
                dfvp0.wait();
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                throw new IOException("Interrupted while reading", interruptedException0);
            }
            arr_b = (byte[])concurrentLinkedQueue0.poll();
            goto label_5;
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    public final ShareTarget V(String s, dgag dgag0, boolean z) {
        String s2;
        dgap dgap0 = this.t.d(dgag0.d, dgag0.c);
        String s1 = null;
        if(!dgag0.a() && dgap0 == null) {
            dcvz.a.d().p("Failed to retrieve public certificate for a contacts only advertisement.", new Object[0]);
            return null;
        }
        int v = dgag0.f;
        boolean z1 = dgag0.a();
        if(dgap0 != null) {
            v = dgap0.b.j;
        }
        Uri uri0 = this.R(dgap0);
        if(dgap0 == null) {
            s2 = null;
        }
        else {
            dbwr dbwr0 = dgap0.b;
            s2 = (dbwr0.b & 2) == 0 ? null : dbwr0.d;
        }
        String s3 = dfzz.an(dgag0, dgap0);
        String s4 = dfzz.am(s, dgap0);
        if(s3 == null) {
            dcvz.a.b().h("Failed to retrieve device name for advertisement %s.", dgag.d(dgag0));
            return null;
        }
        boolean z2 = dgap0 == null ? false : dgap0.c;
        dcls dcls0 = new dcls();
        if(!z) {
            ShareTarget shareTarget0 = (ShareTarget)this.V.get(s4);
            ShareTarget shareTarget1 = this.W(s);
            ShareTarget shareTarget2 = (ShareTarget)this.U.d(s4);
            if(shareTarget0 != null) {
                dcls0 = shareTarget0.b();
            }
            else if(shareTarget1 != null) {
                dcls0 = shareTarget1.b();
            }
            else if(shareTarget2 != null) {
                dcls0 = shareTarget2.b();
            }
        }
        dcls0.r = dgag0.a == 1 ? 1 : 0;
        dcls0.d = dgag0.e;
        dcls0.b = s3;
        dcls0.l = s2;
        dcls0.k = z;
        dcls0.c = uri0;
        dcls0.s = z2;
        dcls0.t = this.Q;
        dcls0.w = v;
        if(z2) {
            if(dgap0 != null) {
                dbwr dbwr1 = dgap0.b;
                if(dbwr1 != null && (dbwr1.b & 0x40) != 0) {
                    s1 = dbwr1.i;
                }
            }
            dcls0.u = s1;
        }
        if(dgap0 == null) {
            dcls0.c();
        }
        else {
            dcls0.b();
        }
        ShareTarget shareTarget3 = dcls0.a();
        if(shareTarget3.f) {
            this.ad(shareTarget3).b = dgap0;
        }
        else {
            this.ae(shareTarget3).c = dgap0;
        }
        if(z1 && dgap0 == null) {
            dfzg dfzg0 = new dfzg();
            dfzg0.b = dgag0;
            dfzg0.a = shareTarget3;
            this.X.put(s, dfzg0);
        }
        return shareTarget3;
    }

    public final ShareTarget W(String s) {
        ShareTarget shareTarget0 = null;
        for(Object object0: this.e.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(!s.equals(((dfzj)map$Entry0.getValue()).a)) {
            }
            else if(shareTarget0 == null) {
                shareTarget0 = (ShareTarget)map$Entry0.getKey();
            }
            else {
                long v = ((ShareTarget)map$Entry0.getKey()).a;
                if(shareTarget0.a < v) {
                    shareTarget0 = (ShareTarget)map$Entry0.getKey();
                }
            }
        }
        return shareTarget0;
    }

    public final TransferMetadata X(ShareTarget shareTarget0) {
        return shareTarget0.f ? this.ad(shareTarget0).i : this.ae(shareTarget0).t;
    }

    final dcnp Y(ShareTarget shareTarget0) {
        return shareTarget0.f ? this.ad(shareTarget0).d : this.ae(shareTarget0).e;
    }

    final dcnp Z(ShareTarget shareTarget0, dcnp dcnp0) {
        dcnp dcnp1 = new dfym(this, dcnp0);
        if(shareTarget0.f) {
            this.ad(shareTarget0).d = dcnp1;
            return dcnp1;
        }
        this.ae(shareTarget0).e = dcnp1;
        return dcnp1;
    }

    @Override  // dftm
    public int a(ShareTarget shareTarget0) {
        long v = this.C;
        long v1 = this.w.b();
        this.w.i(dcpt.D(2, v, this.bC(), v1, this.t.a()));
        return this.bS("accept", new dfxe(this, shareTarget0));
    }

    public final void aA(dfum dfum0, dcnp dcnp0, ShareTarget shareTarget0, int v, gyzg gyzg0) {
        dcnp0.e(shareTarget0, new dcnn(v).a());
        dcvz.a.b().h("Handle Response Failure=%s", gyzg0.name());
        dfzz.bN(new dfxv(this, this.P(shareTarget0), shareTarget0, gyzg0));
        dfum0.a();
    }

    public final void aB(ShareTarget shareTarget0, int v) {
        if(hvqz.ag()) {
            switch(this.v.a()) {
                case 1: {
                    switch(v) {
                        case 9: {
                            goto label_9;
                        }
                        case 12: {
                            v = 12;
                            goto label_9;
                        }
                        default: {
                            return;
                        }
                    }
                }
                case 3: {
                    if(v == 9) {
                        v = 9;
                    label_9:
                        dfum dfum0 = this.aa(shareTarget0);
                        dcnp dcnp0 = this.Y(shareTarget0);
                        if(dcnp0 != null) {
                            dcnp0.e(shareTarget0, new dcnn(1007).a());
                        }
                        if(dfum0 != null) {
                            dfum0.a();
                            dcvz.a.b().h("Disconnect connection, because %s is not allowed.", Integer.valueOf(v));
                        }
                    }
                    break;
                }
            }
        }
    }

    final void aC() {
        int v22;
        int v21;
        int v9;
        int v8;
        gged_interceptors gged3;
        if(!this.bu() && this.o && !this.bw()) {
            if(this.l.c() == 0) {
                this.o = false;
                dcvz.a.b().p("Successfully transited to high power discovery", new Object[0]);
            }
            else {
                dcvz.a.b().p("Failed to transit to high power discovery", new Object[0]);
            }
        }
        ShareTarget shareTarget0 = (ShareTarget)this.N.peek();
        Queue queue0 = this.M;
        if(queue0.isEmpty() && this.L.isEmpty() && this.N.size() == 1 && shareTarget0 != null && (hvqs.bj() || this.ae(shareTarget0).k)) {
            this.ae(shareTarget0).n = true;
            dcvz.a.b().h("Prioritized receiver %s", shareTarget0);
        }
        Queue queue1 = this.L;
        gged_interceptors gged0 = gged_interceptors.i(queue1);
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ShareTarget shareTarget1 = (ShareTarget)gged0.get(v1);
            if(this.X(shareTarget1).a == 1005) {
                float f = this.X(shareTarget1).b;
                dcvz.a.b().h("currentProgress = %s", Float.valueOf(f));
                this.bg(shareTarget1, this.X(shareTarget1).b);
            }
        }
        ShareTarget shareTarget2 = (ShareTarget)queue1.peek();
        if(hvqs.G() == 1L && queue1.size() == 1 && queue0.isEmpty() && shareTarget2 != null && this.ae(shareTarget2).n) {
            queue1.remove(shareTarget2);
            queue0.offer(shareTarget2);
        }
        if(((long)queue0.size()) < hvqs.G()) {
            long v2 = hvqs.G() - ((long)queue0.size());
            gged_interceptors gged1 = gged_interceptors.i(queue1);
            int v3 = gged1.size();
            int v5 = 0;
            for(int v4 = 0; v4 < v3; ++v4) {
                ShareTarget shareTarget3 = (ShareTarget)gged1.get(v4);
                if(((long)v5) >= v2) {
                    break;
                }
                if(this.ae(shareTarget3).n || this.ae(shareTarget3).k && this.ae(shareTarget3).l) {
                    queue1.remove(shareTarget3);
                    queue0.offer(shareTarget3);
                    ++v5;
                }
            }
        }
        gged_interceptors gged2 = gged_interceptors.i(queue0);
        int v6 = gged2.size();
        int v7 = 0;
        while(v7 < v6) {
            ShareTarget shareTarget4 = (ShareTarget)gged2.get(v7);
            if(this.ae(shareTarget4).l) {
                cunf cunf0 = dcvz.a;
                cunf0.b().h("Preparing to send payloads to %s", shareTarget4);
                dfum dfum0 = this.aa(shareTarget4);
                dcnp dcnp0 = this.Y(shareTarget4);
                if(dfum0 != null && dcnp0 != null) {
                    String s = this.ap(shareTarget4);
                    if(s == null) {
                        dcnp0.e(shareTarget4, new dcnn(1007).a());
                        dfum0.a();
                        cunf0.e().p("Failed to send payload due to missing endpointId.", new Object[0]);
                        goto label_219;
                    }
                    else {
                        dcjy dcjy0 = this.ae(shareTarget4).z;
                        if(dcjy0 == null) {
                            dcnp0.e(shareTarget4, new dcnn(1007).a());
                            dfum0.a();
                            cunf0.e().p("Failed to send payload due to missing response frame.", new Object[0]);
                            goto label_219;
                        }
                        else if(this.ae(shareTarget4).m) {
                            cunf0.b().p("Payloads have been sent.", new Object[0]);
                            goto label_219;
                        }
                        else {
                            this.ae(shareTarget4).m = true;
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dcjr.a).v_newBuilder();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            dcjr.b(((dcjr)hftp0.b_message));
                            float f1 = this.I(shareTarget4);
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            dcjr dcjr0 = (dcjr)hftp0.b_message;
                            dcjr0.b |= 1;
                            dcjr0.c = f1;
                            dcjr dcjr1 = (dcjr)hftp0.N_build();
                            try {
                                dfzz.bn(dfum0, dcjr1);
                            }
                            catch(IOException iOException0) {
                                gged3 = gged2;
                                v8 = v6;
                                v9 = v7;
                                dcnp0.e(shareTarget4, new dcnn(1007).a());
                                dfum0.a();
                                dcvz.a.e().f(iOException0).p("Failed to write the start transfer progress update frame", new Object[0]);
                                goto label_222;
                            }
                            dfzt dfzt0 = (dfzt)this.d.remove(Long.valueOf(shareTarget4.a));
                            if(dfzt0 == null) {
                                dcvz.a.b().p("Sender is not handling stream attachments.", new Object[0]);
                                dfzt0 = new dfzt(this, shareTarget4, dcnp0);
                            }
                            Map map0 = DesugarCollections.unmodifiableMap((dcjy0.e == null ? dciz.a : dcjy0.e).d);
                            bxd bxd0 = new bxd();
                            Iterator iterator0 = shareTarget4.f().iterator();
                            while(iterator0.hasNext()) {
                                Object object0 = iterator0.next();
                                FileAttachment fileAttachment0 = (FileAttachment)object0;
                                Long long0 = this.O(fileAttachment0);
                                bxd0.put(long0, fileAttachment0);
                                Long long1 = (long)fileAttachment0.j;
                                if(map0.containsKey(long1)) {
                                    dciu dciu0 = (dciu)map0.get(long1);
                                    if(dciu0 != null && (dciu0.b & 2) != 0) {
                                        long v10 = (dciu0.d == null ? dcjb.a : dciu0.d).c;
                                        dbyq dbyq0 = fileAttachment0.e();
                                        dbyq0.g = v10;
                                        FileAttachment fileAttachment1 = dbyq0.a();
                                        if(shareTarget4.s(fileAttachment0, fileAttachment1)) {
                                            bxd0.put(long0, fileAttachment1);
                                            this.aT(fileAttachment0, fileAttachment1);
                                        }
                                        iterator0 = iterator0;
                                        continue;
                                    }
                                }
                                iterator0 = iterator0;
                            }
                            long v11 = this.P(shareTarget4);
                            int v12 = this.L(shareTarget4);
                            int v13 = this.K();
                            Intent intent0 = this.P;
                            long v14 = this.w.c();
                            long v15 = this.P(shareTarget4);
                            gged3 = gged2;
                            int v16 = this.t.a();
                            this.w.i(dcpt.m(v11, shareTarget4, v12, v13, dcpt.w(this.i, this.ah(), intent0, v14, v15, v16)));
                            cunf cunf1 = dcvz.a;
                            cunf1.b().p("Logging Facet event for send", new Object[0]);
                            this.ag.a(bbdg.aA);
                            dfzj dfzj0 = this.ae(shareTarget4);
                            dfzj0.y = SystemClock.uptimeMillis();
                            dcnn dcnn0 = new dcnn(1005);
                            dcnn0.g = shareTarget4.n;
                            dcnn0.e(this.I(shareTarget4));
                            dcnp0.e(shareTarget4, dcnn0.a());
                            cuwu[] arr_cuwu = this.cf(shareTarget4);
                            for(int v17 = 0; v17 < arr_cuwu.length; ++v17) {
                                cuwu cuwu0 = arr_cuwu[v17];
                                cunf1.b().h("Start to send a Text payload(%d)", Long.valueOf(cuwu0.i));
                                this.l.z(s, cuwu0, dfzt0);
                            }
                            cuwu[] arr_cuwu1 = this.cd(shareTarget4);
                            int v18 = 0;
                            while(v18 < arr_cuwu1.length) {
                                cuwu cuwu1 = arr_cuwu1[v18];
                                long v19 = cuwu1.i;
                                Long long2 = v19;
                                FileAttachment fileAttachment2 = (FileAttachment)bxd0.get(long2);
                                if(fileAttachment2 == null) {
                                    v21 = v6;
                                    v22 = v7;
                                }
                                else {
                                    long v20 = fileAttachment2.i;
                                    v21 = v6;
                                    v22 = v7;
                                    if(v20 == fileAttachment2.c) {
                                        cunf1.b().p("NearbySharingProvider not send the payload because receiver has received full file before.", new Object[0]);
                                        dfzt0.a(v19, 0L, dfvl.c);
                                        goto label_174;
                                    }
                                    else {
                                        int v23 = Long.compare(v20, 0L);
                                        if(v23 > 0) {
                                            cuwu1.k(v20);
                                            dfzt0.l(v19, v20);
                                            dfzt0.a(v19, 0L, dfvl.b);
                                        }
                                        String s1 = fileAttachment2.a;
                                        if(s1 != null && v23 <= 0) {
                                            cuwu1.j(dizi.j(s1, cuwu.a));
                                        }
                                        String s2 = fileAttachment2.h;
                                        if(s2 != null && v23 <= 0) {
                                            cuwu1.l(dizi.j(s2, cuwu.e));
                                        }
                                    }
                                }
                                cunf1.b().h("Start to send a File payload(%d)", long2);
                                this.l.z(s, cuwu1, dfzt0);
                            label_174:
                                ++v18;
                                cunf1 = cunf1;
                                arr_cuwu1 = arr_cuwu1;
                                v6 = v21;
                                v7 = v22;
                            }
                            v8 = v6;
                            v9 = v7;
                            cuwu[] arr_cuwu2 = this.cg(shareTarget4);
                            for(int v24 = 0; v24 < arr_cuwu2.length; ++v24) {
                                cuwu cuwu2 = arr_cuwu2[v24];
                                cunf1.b().h("Start to send a Wi-Fi Credentials payload(%d)", Long.valueOf(cuwu2.i));
                                this.l.z(s, cuwu2, dfzt0);
                            }
                            cuwu[] arr_cuwu3 = this.cc(shareTarget4);
                            for(int v25 = 0; v25 < arr_cuwu3.length; ++v25) {
                                cuwu cuwu3 = arr_cuwu3[v25];
                                cunf1.b().h("Start to send an APP payload(%d)", Long.valueOf(cuwu3.i));
                                this.l.z(s, cuwu3, dfzt0);
                            }
                            cuwu[] arr_cuwu4 = this.ce(shareTarget4);
                            for(int v26 = 0; v26 < arr_cuwu4.length; ++v26) {
                                cuwu cuwu4 = arr_cuwu4[v26];
                                cunf1.b().h("Start to send a stream payload(%d)", Long.valueOf(cuwu4.i));
                                this.l.z(s, cuwu4, dfzt0);
                            }
                            cunf1.b().h("The connection was accepted. Payloads are now being sent to ShareTarget %s.", shareTarget4);
                            goto label_222;
                        }
                    }
                    goto label_208;
                }
                else {
                label_208:
                    gged3 = gged2;
                    v8 = v6;
                    v9 = v7;
                    this.bh(shareTarget4, new dcnn(1007).a());
                    this.aH(shareTarget4);
                    if(dfum0 != null) {
                        dfum0.a();
                    }
                    if(dcnp0 != null) {
                        dcnp0.e(shareTarget4, new dcnn(1007).a());
                    }
                    cunf0.e().p("Failed to send payload due to missing connection.", new Object[0]);
                    goto label_222;
                }
            }
        label_219:
            gged3 = gged2;
            v8 = v6;
            v9 = v7;
        label_222:
            v7 = v9 + 1;
            v6 = v8;
            gged2 = gged3;
        }
        int v27 = 0;
        Queue queue2 = this.L;
        gged_interceptors gged4 = gged_interceptors.i(queue2);
        int v28 = gged4.size();
        for(int v29 = 0; v29 < v28; ++v29) {
            ShareTarget shareTarget5 = (ShareTarget)gged4.get(v29);
            dcnp dcnp1 = this.Y(shareTarget5);
            if(dcnp1 == null) {
                this.bh(shareTarget5, new dcnn(1007).a());
                this.aH(shareTarget5);
                dcvz.a.b().h("Failed to update status to %s, callback is null.", shareTarget5);
            }
            else if(this.ae(shareTarget5).k) {
                if(this.ae(shareTarget5).l && this.X(shareTarget5).a != 1005) {
                    dcnn dcnn1 = new dcnn(1005);
                    dcnn1.g = shareTarget5.n;
                    dcnp1.e(shareTarget5, dcnn1.a());
                }
                if(!this.ae(shareTarget5).l && this.X(shareTarget5).a != 1003) {
                    dcnp1.e(shareTarget5, this.bV(shareTarget5));
                }
            }
        }
        Queue queue3 = this.M;
        gged_interceptors gged5 = gged_interceptors.i(queue3);
        int v30 = gged5.size();
        for(int v31 = 0; v31 < v30; ++v31) {
            ShareTarget shareTarget6 = (ShareTarget)gged5.get(v31);
            dcnp dcnp2 = this.Y(shareTarget6);
            if(dcnp2 == null) {
                this.bh(shareTarget6, new dcnn(1007).a());
                this.aH(shareTarget6);
                dcvz.a.b().h("Failed to update status to %s, callback is null.", shareTarget6);
            }
            else if(!this.ae(shareTarget6).l && this.X(shareTarget6).a != 1003) {
                dcnp2.e(shareTarget6, this.bV(shareTarget6));
            }
        }
        if(this.bt()) {
            gged_interceptors gged6 = gged_interceptors.i(this.N);
            int v32 = gged6.size();
            while(v27 < v32) {
                ShareTarget shareTarget7 = (ShareTarget)gged6.get(v27);
                if(this.by()) {
                    break;
                }
                ShareTarget shareTarget8 = (ShareTarget)queue2.peek();
                if(!hvqs.bj() && shareTarget8 != null && shareTarget8.m == 0) {
                    break;
                }
                if(shareTarget7.m == 0 && (!queue2.isEmpty() || ((long)queue3.size()) >= hvqs.G())) {
                    ++v27;
                    continue;
                }
                else {
                    dfyq dfyq0 = new dfyq(this, shareTarget7);
                    String s3 = this.ao(shareTarget7);
                    if(s3 != null) {
                        dfyq0.a(s3);
                        return;
                    }
                    dfwg dfwg0 = new dfwg(this, shareTarget7);
                    dfyy dfyy0 = new dfyy(this, shareTarget7, dfwg0, dfyq0);
                    this.R.addPropertyChangeListener("onEndpointDiscovered", dfyy0);
                    NearbySharingProvider.5 nearbySharingProvider$50 = new NearbySharingProvider.5(this, shareTarget7, dfwg0, dfyq0);
                    IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.nearby.sharing.CERTIFICATES_DOWNLOAD");
                    cutr.b(this.i, nearbySharingProvider$50, intentFilter0);
                    dfwh dfwh0 = new dfwh(this, shareTarget7, dfwg0, dfyq0);
                    long v33 = hvqs.a.aT().bK();
                    dfzu dfzu0 = new dfzu(cumn.d(dcvz.a, dfwh0, v33, this.g), dfyy0, nearbySharingProvider$50);
                    this.W.put(Long.valueOf(shareTarget7.a), dfzu0);
                }
                break;
            }
        }
    }

    public final void aD() {
        if(hvqz.j() && this.H == null) {
            this.H = new NearbySharingProvider.16(this);
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter0.addAction("android.net.wifi.STATE_CHANGE");
            this.i.registerReceiver(this.H, intentFilter0);
        }
    }

    public final void aE() {
        dclv dclv0 = this.n;
        for(Object object0: this.y.b()) {
            dcvz.a.b().h("Load cached endpoint %s.", ((dfui)object0).b);
            this.aK(((dfui)object0).b, ((dfui)object0).c, false, dclv0);
        }
    }

    public final void aF() {
        for(Object object0: this.V.entrySet()) {
            ShareTarget shareTarget0 = (ShareTarget)((Map.Entry)object0).getValue();
            long v = this.A;
            long v1 = this.w.c();
            Intent intent0 = this.P;
            long v2 = this.w.c();
            long v3 = this.A;
            int v4 = this.t.a();
            boolean z = this.bw();
            dcoz dcoz0 = this.ac;
            this.w.i(dcpt.g(shareTarget0, v, 0L, v1, this.aq(), dcpt.w(this.i, this.ah(), intent0, v2, v3, v4), 0L, z, dcoz0));
        }
    }

    public final void aG(ShareTarget shareTarget0, int v, int v1, int v2, int v3, boolean z) {
        long v4 = this.ae(shareTarget0).x <= 0L ? 0L : System.currentTimeMillis() - this.ae(shareTarget0).x;
        dcov dcov0 = dcpt.h(shareTarget0, this.P(shareTarget0), v4, v, v1, v2, v3, z);
        this.w.i(dcov0);
    }

    public final void aH(ShareTarget shareTarget0) {
        if(shareTarget0.f) {
            this.bZ(shareTarget0);
            return;
        }
        dfum dfum0 = this.aa(shareTarget0);
        if(dfum0 != null) {
            boolean z = false;
            synchronized(dfum0.b) {
                if(!dfum0.e && dfum0.f != null) {
                    z = true;
                }
            }
            if(z) {
                return;
            }
        }
        this.bZ(shareTarget0);
    }

    public final void aI() {
        Map map0 = this.V;
        for(Object object0: map0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            ShareTarget shareTarget0 = (ShareTarget)((Map.Entry)object0).getValue();
            this.U.h(s, shareTarget0);
        }
        map0.clear();
    }

    public final void aJ(String s, byte[] arr_b) {
        this.aU(() -> {
            long v9;
            Map map4;
            Map map3;
            String s4;
            String s3;
            long v7;
            ShareTarget shareTarget4;
            long v3;
            ShareTarget shareTarget3;
            int v2;
            PropertyChangeSupport propertyChangeSupport0 = this.R;
            if(propertyChangeSupport0 != null) {
                propertyChangeSupport0.firePropertyChange(new PropertyChangeEvent(this, "onEndpointDiscovered", "", s));
            }
            if(!this.bA()) {
                dcvz.a.b().h("Ignoring discovered endpoint %s because we\'re no longer scanning", dizs.b(arr_b));
                return;
            }
            Context context0 = this.i;
            dgag dgag0 = dgag.c(arr_b);
            if(dgag0 == null) {
                dcvz.a.b().i("Failed to parse discovered advertisement (%s)%s", s, dizs.b(arr_b));
                this.ch(s, 2);
                return;
            }
            int v = 0;
            ShareTarget shareTarget0 = this.V(s, dgag0, false);
            if(shareTarget0 == null) {
                cunf cunf0 = dcvz.a;
                cunf0.b().i("Failed to convert given advertisement (%s)%s to share target from discovered advertisement. Ignoring.", s, dizs.b(arr_b));
                this.a.put(s, arr_b);
                this.ch(s, 3);
                if(hvqz.a.b().aR()) {
                    cunf0.b().h("Report endpoint %s as lost, since we cannot recognize this endpoint anymore", s);
                    this.aL(s);
                }
                return;
            }
            ShareTarget shareTarget1 = this.W(s);
            if(shareTarget1 == null || this.T.get(shareTarget1) != null || this.ae(shareTarget1).b()) {
                cumn cumn0 = (cumn)this.T.remove(shareTarget1);
                if(cumn0 != null) {
                    cumn0.b();
                }
            }
            Map map0 = this.T;
            cumn cumn1 = (cumn)map0.remove(shareTarget0);
            if(cumn1 != null) {
                cumn1.b();
            }
            String s1 = (String)MoreObjects.firstNonNull((TextUtils.isEmpty(shareTarget0.l) ? dfzz.bY(this.ag(shareTarget0)) : shareTarget0.l), s);
            Map map1 = this.V;
            ShareTarget shareTarget2 = (ShareTarget)map1.get(s1);
            int v1 = shareTarget2 == null ? 1 : 0;
            if(shareTarget2 == null) {
                shareTarget2 = this.W(s);
                if(shareTarget2 == null) {
                    shareTarget3 = null;
                    v2 = v1;
                }
                else {
                    if(this.ae(shareTarget2).b() && map0.get(shareTarget2) == null && !this.M.contains(shareTarget2) && !this.L.contains(shareTarget2)) {
                        v = 1;
                    }
                    v2 = v;
                    shareTarget3 = shareTarget2;
                }
            }
            else {
                shareTarget3 = shareTarget2;
                v2 = v1;
            }
            if(shareTarget3 != null) {
                Map map2 = this.e;
                dfzj dfzj0 = (dfzj)map2.get(shareTarget0);
                if(dfzj0 != null) {
                    dfzj dfzj1 = (dfzj)map2.remove(shareTarget3);
                    if(dfzj1 != null) {
                        cuwu[] arr_cuwu = dfzj0.p;
                        if(arr_cuwu.length > 0) {
                            dfzj1.p = arr_cuwu;
                        }
                        cuwu[] arr_cuwu1 = dfzj0.o;
                        if(arr_cuwu1.length > 0) {
                            dfzj1.o = arr_cuwu1;
                        }
                        cuwu[] arr_cuwu2 = dfzj0.q;
                        if(arr_cuwu2.length > 0) {
                            dfzj1.q = arr_cuwu2;
                        }
                        cuwu[] arr_cuwu3 = dfzj0.r;
                        if(arr_cuwu3.length > 0) {
                            dfzj1.r = arr_cuwu3;
                        }
                        dfzj1.D = dfzj0.D;
                        if(hvqz.I() && (dfzj0.c != null && !dfzj0.c.equals(dfzj1.c))) {
                            dfzj1.c = dfzj0.c;
                        }
                        map2.put(shareTarget0, dfzj1);
                    }
                }
                if(true) {
                    this.y.g(shareTarget3);
                    this.y.d(shareTarget3);
                }
            }
            if(true && !shareTarget0.k) {
                this.y.c(shareTarget0, s, arr_b);
            }
            if(hvrc.w() && this.bB()) {
                dcoz dcoz0 = this.ac;
                if(dcoz0 == null) {
                    v3 = this.P == null ? -1L : this.P.getLongExtra("send_surface_start_time", -1L);
                }
                else {
                    v3 = dcoz0.b;
                }
                dcpn dcpn0 = this.w;
                long v4 = this.A;
                long v5 = SystemClock.elapsedRealtime() - this.ak;
                long v6 = dcpn0.c();
                String s2 = this.aq();
                shareTarget4 = shareTarget3;
                gyqv gyqv0 = dcpt.w(context0, this.ah(), this.P, dcpn0.c(), this.A, this.t.a());
                if(v3 >= 0L && !this.bw()) {
                    v7 = SystemClock.elapsedRealtime() - v3;
                    s3 = s1;
                }
                else {
                    s3 = s1;
                    v7 = -1L;
                }
                s4 = s3;
                map3 = map1;
                dcpn0.i(dcpt.g(shareTarget0, v4, v5, v6, s2, gyqv0, v7, this.bw(), this.ac));
            }
            else {
                shareTarget4 = shareTarget3;
                s4 = s1;
                map3 = map1;
            }
            if(this.a.n == null) {
                map4 = map3;
            }
            else if(shareTarget4 != null && v2 == 0) {
                this.a.n.d(shareTarget0);
                cunf cunf1 = dcvz.a.b();
                long v8 = SystemClock.uptimeMillis();
                cunf1.j("Reported onShareTargetUpdated for (%s)%s in %s millis.", s, shareTarget0.b, Long.valueOf(v8 - this.D));
                map4 = map3;
            }
            else {
                this.a.n.jJ(shareTarget0);
                if(hvrc.w()) {
                    map4 = map3;
                }
                else {
                    dcoz dcoz1 = this.ac;
                    if(dcoz1 == null) {
                        v9 = this.P == null ? -1L : this.P.getLongExtra("send_surface_start_time", -1L);
                    }
                    else {
                        v9 = dcoz1.b;
                    }
                    if(this.bB()) {
                        long v10 = this.A;
                        long v11 = SystemClock.elapsedRealtime() - this.ak;
                        long v12 = this.w.c();
                        map4 = map3;
                        gyqv gyqv1 = dcpt.w(context0, this.ah(), this.P, this.w.c(), this.A, this.t.a());
                        long v13 = v9 < 0L || this.bw() ? -1L : SystemClock.elapsedRealtime() - v9;
                        this.w.i(dcpt.g(shareTarget0, v10, v11, v12, this.aq(), gyqv1, v13, this.bw(), this.ac));
                    }
                    else {
                        map4 = map3;
                    }
                }
                cunf cunf2 = dcvz.a.b();
                long v14 = SystemClock.uptimeMillis();
                cunf2.j("Reported onShareTargetDiscovered for (%s)%s in %s millis.", s, shareTarget0.b, Long.valueOf(v14 - this.D));
            }
            this.bc(shareTarget0, s);
            this.ae(shareTarget0);
            if(true) {
                this.ae(shareTarget0).D = 2;
            }
            map4.put(s4, shareTarget0);
        });
    }

    // Detected as a lambda impl.
    public final void aK(String s, byte[] arr_b, boolean z, dclv dclv0) {
        long v9;
        Map map4;
        Map map3;
        String s4;
        String s3;
        long v7;
        ShareTarget shareTarget4;
        long v3;
        ShareTarget shareTarget3;
        int v2;
        PropertyChangeSupport propertyChangeSupport0 = this.R;
        if(propertyChangeSupport0 != null) {
            propertyChangeSupport0.firePropertyChange(new PropertyChangeEvent(this, "onEndpointDiscovered", "", s));
        }
        if(!this.bA()) {
            dcvz.a.b().h("Ignoring discovered endpoint %s because we\'re no longer scanning", dizs.b(arr_b));
            return;
        }
        Context context0 = this.i;
        dgag dgag0 = dgag.c(arr_b);
        if(dgag0 == null) {
            dcvz.a.b().i("Failed to parse discovered advertisement (%s)%s", s, dizs.b(arr_b));
            this.ch(s, 2);
            return;
        }
        int v = 0;
        ShareTarget shareTarget0 = this.V(s, dgag0, false);
        if(shareTarget0 == null) {
            cunf cunf0 = dcvz.a;
            cunf0.b().i("Failed to convert given advertisement (%s)%s to share target from discovered advertisement. Ignoring.", s, dizs.b(arr_b));
            this.a.put(s, arr_b);
            this.ch(s, 3);
            if(hvqz.a.b().aR()) {
                cunf0.b().h("Report endpoint %s as lost, since we cannot recognize this endpoint anymore", s);
                this.aL(s);
            }
            return;
        }
        ShareTarget shareTarget1 = this.W(s);
        if(shareTarget1 == null || this.T.get(shareTarget1) != null || this.ae(shareTarget1).b()) {
            cumn cumn0 = (cumn)this.T.remove(shareTarget1);
            if(cumn0 != null) {
                cumn0.b();
            }
        }
        Map map0 = this.T;
        cumn cumn1 = (cumn)map0.remove(shareTarget0);
        if(cumn1 != null) {
            cumn1.b();
        }
        String s1 = (String)MoreObjects.firstNonNull((TextUtils.isEmpty(shareTarget0.l) ? dfzz.bY(this.ag(shareTarget0)) : shareTarget0.l), s);
        Map map1 = this.V;
        ShareTarget shareTarget2 = (ShareTarget)map1.get(s1);
        int v1 = shareTarget2 == null ? 1 : 0;
        if(shareTarget2 == null) {
            shareTarget2 = this.W(s);
            if(shareTarget2 == null) {
                shareTarget3 = null;
                v2 = v1;
            }
            else {
                if(this.ae(shareTarget2).b() && map0.get(shareTarget2) == null && !this.M.contains(shareTarget2) && !this.L.contains(shareTarget2)) {
                    v = 1;
                }
                v2 = v;
                shareTarget3 = shareTarget2;
            }
        }
        else {
            shareTarget3 = shareTarget2;
            v2 = v1;
        }
        if(shareTarget3 != null) {
            Map map2 = this.e;
            dfzj dfzj0 = (dfzj)map2.get(shareTarget0);
            if(dfzj0 != null) {
                dfzj dfzj1 = (dfzj)map2.remove(shareTarget3);
                if(dfzj1 != null) {
                    cuwu[] arr_cuwu = dfzj0.p;
                    if(arr_cuwu.length > 0) {
                        dfzj1.p = arr_cuwu;
                    }
                    cuwu[] arr_cuwu1 = dfzj0.o;
                    if(arr_cuwu1.length > 0) {
                        dfzj1.o = arr_cuwu1;
                    }
                    cuwu[] arr_cuwu2 = dfzj0.q;
                    if(arr_cuwu2.length > 0) {
                        dfzj1.q = arr_cuwu2;
                    }
                    cuwu[] arr_cuwu3 = dfzj0.r;
                    if(arr_cuwu3.length > 0) {
                        dfzj1.r = arr_cuwu3;
                    }
                    dfzj1.D = dfzj0.D;
                    if(hvqz.I() && (dfzj0.c != null && !dfzj0.c.equals(dfzj1.c))) {
                        dfzj1.c = dfzj0.c;
                    }
                    map2.put(shareTarget0, dfzj1);
                }
            }
            if(z) {
                this.y.g(shareTarget3);
                this.y.d(shareTarget3);
            }
        }
        if(z && !shareTarget0.k) {
            this.y.c(shareTarget0, s, arr_b);
        }
        if(hvrc.w() && this.bB()) {
            dcoz dcoz0 = this.ac;
            if(dcoz0 == null) {
                v3 = this.P == null ? -1L : this.P.getLongExtra("send_surface_start_time", -1L);
            }
            else {
                v3 = dcoz0.b;
            }
            dcpn dcpn0 = this.w;
            long v4 = this.A;
            long v5 = SystemClock.elapsedRealtime() - this.ak;
            long v6 = dcpn0.c();
            String s2 = this.aq();
            shareTarget4 = shareTarget3;
            gyqv gyqv0 = dcpt.w(context0, this.ah(), this.P, dcpn0.c(), this.A, this.t.a());
            if(v3 >= 0L && !this.bw()) {
                v7 = SystemClock.elapsedRealtime() - v3;
                s3 = s1;
            }
            else {
                s3 = s1;
                v7 = -1L;
            }
            s4 = s3;
            map3 = map1;
            dcpn0.i(dcpt.g(shareTarget0, v4, v5, v6, s2, gyqv0, v7, this.bw(), this.ac));
        }
        else {
            shareTarget4 = shareTarget3;
            s4 = s1;
            map3 = map1;
        }
        if(dclv0 == null) {
            map4 = map3;
        }
        else if(shareTarget4 != null && v2 == 0) {
            dclv0.d(shareTarget0);
            cunf cunf1 = dcvz.a.b();
            long v8 = SystemClock.uptimeMillis();
            cunf1.j("Reported onShareTargetUpdated for (%s)%s in %s millis.", s, shareTarget0.b, Long.valueOf(v8 - this.D));
            map4 = map3;
        }
        else {
            dclv0.jJ(shareTarget0);
            if(hvrc.w()) {
                map4 = map3;
            }
            else {
                dcoz dcoz1 = this.ac;
                if(dcoz1 == null) {
                    v9 = this.P == null ? -1L : this.P.getLongExtra("send_surface_start_time", -1L);
                }
                else {
                    v9 = dcoz1.b;
                }
                if(this.bB()) {
                    long v10 = this.A;
                    long v11 = SystemClock.elapsedRealtime() - this.ak;
                    long v12 = this.w.c();
                    map4 = map3;
                    gyqv gyqv1 = dcpt.w(context0, this.ah(), this.P, this.w.c(), this.A, this.t.a());
                    long v13 = v9 < 0L || this.bw() ? -1L : SystemClock.elapsedRealtime() - v9;
                    this.w.i(dcpt.g(shareTarget0, v10, v11, v12, this.aq(), gyqv1, v13, this.bw(), this.ac));
                }
                else {
                    map4 = map3;
                }
            }
            cunf cunf2 = dcvz.a.b();
            long v14 = SystemClock.uptimeMillis();
            cunf2.j("Reported onShareTargetDiscovered for (%s)%s in %s millis.", s, shareTarget0.b, Long.valueOf(v14 - this.D));
        }
        this.bc(shareTarget0, s);
        this.ae(shareTarget0);
        if(z) {
            this.ae(shareTarget0).D = 2;
        }
        map4.put(s4, shareTarget0);
    }

    public final void aL(String s) {
        this.aU(new dfyb(this, s));
    }

    public final void aM(dcnp dcnp0, ShareTarget shareTarget0) {
        if(this.X(shareTarget0).a == 0x3F9) {
            dcvz.a.b().p("Already reported VERIFYING_FILE status. Skip callback update.", new Object[0]);
            return;
        }
        dcnn dcnn0 = new dcnn(0x3F9);
        dcnn0.e(100.0f);
        dcnp0.e(shareTarget0, dcnn0.a());
    }

    // Detected as a lambda impl.
    public static void aN(gzdv gzdv0, dfsk dfsk0, dgah dgah0, dgaf dgaf0) {
        Account account0 = dfsk0.c();
        boolean z = bata.b(gzdv0.b, dfsk0.j(account0));
        if(!z) {
            dfsk0.C(gzdv0.b);
        }
        boolean z1 = bata.b(gzdv0.d, dfsk0.k(account0));
        boolean z2 = bata.b(gzdv0.c, dfsk0.l(account0));
        if(!z1 || !z2) {
            dfsk0.E(gzdv0.c, gzdv0.d);
        }
        if(z && (z1 || z2)) {
            return;
        }
        dcpu dcpu0 = new dcpu();
        dcpu0.a = 16;
        dcpu0.b = 1;
        dcpv dcpv0 = new dcpv(dcpu0);
        dgah0.f(dcpv0);
        dgaf0.c(dcpv0);
    }

    final void aO(List list0) {
        File file0 = this.aj(false);
        if(file0.exists() && file0.isDirectory()) {
            BigDecimal bigDecimal0 = BigDecimal.ZERO;
            for(Object object0: list0) {
                bigDecimal0 = bigDecimal0.add(new BigDecimal(((FileAttachment)object0).c));
                gged_interceptors gged0 = djbh.a(this.i, ((FileAttachment)object0).j);
                if(gged0 != null) {
                    long v = djas.a(gged0, djas.b(file0, gged0));
                    if(v != -1L) {
                        bigDecimal0 = bigDecimal0.subtract(new BigDecimal(v));
                    }
                }
            }
            long v1 = djad.c(file0, ((float)hvqs.c()), bigDecimal0);
            if(v1 > 0L) {
                dcvz.a.b().h("Need to free %d storage space on device.", Long.valueOf(v1));
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: list0) {
                    arrayList0.add(Long.valueOf(((FileAttachment)object1).j));
                }
                djas.g(this.i, file0, v1, arrayList0);
            }
        }
    }

    public final void aP(ShareTarget shareTarget0, String s) {
        int v13;
        int v11;
        dfum dfum1;
        cunf cunf1;
        int v6;
        boolean z;
        cunf cunf0 = dcvz.a;
        cunf0.b().h("Receiving introduction from %s", shareTarget0);
        dfum dfum0 = this.aa(shareTarget0);
        if(dfum0 == null) {
            cunf0.e().p("Ignore introduction, due to no connection has been established.", new Object[0]);
            return;
        }
        dcnp dcnp0 = this.Y(shareTarget0);
        if(dcnp0 == null) {
            cunf0.e().h("no TransferUpdateCallback tied to %s. Disconnect", shareTarget0);
            dfum0.a();
            return;
        }
        dcjy dcjy0 = this.bW(shareTarget0, dfum0, dcjx.b).a;
        if(dcjy0 == null) {
            dfum0.a();
            cunf0.e().p("Ignore introduction, due to invalid introduction frame.", new Object[0]);
            return;
        }
        long v = this.C;
        long v1 = this.w.b();
        this.w.i(dcpt.f(v, shareTarget0, this.aq(), v1, this.t.a()));
        cunf0.b().p("Successfully read the introduction frame", new Object[0]);
        dcjk dcjk0 = dcjy0.d == null ? dcjk.a : dcjy0.d;
        ArraySet arraySet0 = new ArraySet();
        if(!hvrc.a.b().aD() && (dcjk0.b & 2) != 0 && dcjk0.h) {
            cunf0.b().p("Upgrade bandwidth when receiving an introduction frame.", new Object[0]);
            if(djbz.h(this.i)) {
                String s1 = this.ap(shareTarget0);
                if(s1 != null) {
                    cunf0.b().p("Run bandwidth upgrade.", new Object[0]);
                    this.l.P(s1);
                }
            }
            else {
                dfzi dfzi0 = this.ad(shareTarget0);
                cumn cumn0 = dfzi0.m;
                if(cumn0 != null) {
                    cumn0.b();
                }
                dfzi0.m = cumn.d(cunf0, new dfxf(this), hvqs.a.aT().R(), this.g);
                this.ab.set(dfzi0);
                cunf0.b().p("Setup a defer bandwidth upgrade alarm.", new Object[0]);
            }
        }
        this.Q = (dcjj.b(dcjk0.j) == null ? dcjj.a : dcjj.b(dcjk0.j)) == dcjj.c ? 1 : 0;
        for(int v2 = 0; true; ++v2) {
            z = true;
            if(v2 >= dcjk0.c.size()) {
                break;
            }
            long v3 = ((dcje)dcjk0.c.get(v2)).j;
            if(v3 == 0L) {
                cunf0.b().p("Sender disables resume transfer feature. Disable resume transfer for receiver as well.", new Object[0]);
                z = false;
                break;
            }
            if(!arraySet0.add(Long.valueOf(v3))) {
                cunf0.e().p("There are duplicate attachment hashes in file attachments.", new Object[0]);
                z = false;
                break;
            }
        }
        this.ad(shareTarget0).f = z;
        int v4 = 0;
        while(v4 < dcjk0.c.size()) {
            dcje dcje0 = (dcje)dcjk0.c.get(v4);
            long v5 = dcje0.f;
            if(v5 <= 0L) {
                this.az(shareTarget0, 0x3F6);
                cunf0.e().p("Ignore introduction, due to invalid attachment size", new Object[0]);
                return;
            }
            String s2 = ddnb.d(dcje0.g);
            cunf0.b().m("Found file attachment %s of type %s, with mimeType %s, parent folder %s, attachment hash is %s, isSensitiveContent: %s", dcje0.c, (dcjd.b(dcje0.d) == null ? dcjd.a : dcjd.b(dcje0.d)).name(), s2, dcje0.i, Long.valueOf(dcje0.j), Boolean.valueOf((dcje0.b & 0x100) != 0 && dcje0.k));
            String s3 = cuua.d(dcje0.c);
            String s4 = cuua.e(dcje0.i);
            dbyq dbyq0 = new dbyq(s3);
            dbyq0.a = dcje0.h;
            switch((dcjd.b(dcje0.d) == null ? dcjd.a : dcjd.b(dcje0.d)).ordinal()) {
                case 1: {
                    v6 = 1;
                    break;
                }
                case 2: {
                    v6 = 2;
                    break;
                }
                case 3: {
                    v6 = 3;
                    break;
                }
                case 4: {
                    v6 = 4;
                    break;
                }
                case 5: {
                    v6 = 5;
                    break;
                }
                case 6: {
                    v6 = 6;
                    break;
                }
                default: {
                    v6 = 0;
                }
            }
            dbyq0.d = v6;
            dbyq0.c = v5;
            dbyq0.e = s2;
            dbyq0.f = s4;
            dbyq0.i = (dcje0.b & 0x100) != 0 && dcje0.k;
            if(z) {
                long v7 = dcje0.j;
                dbyq0.h = v7;
                Context context0 = this.i;
                gged_interceptors gged0 = djbh.a(context0, v7);
                if(gged0 != null) {
                    cunf1 = cunf0;
                    gged_interceptors gged1 = djas.b(this.aj(false), gged0);
                    dfum1 = dfum0;
                    long v8 = djas.a(gged0, gged1);
                    if(v8 != -1L && v8 <= v5) {
                        dbyq0.g = v8;
                    }
                    else {
                        cunf1.e().h("Something went wrong in file system for the attachment %s, delete all payload files with it.", s3);
                        djas.d(context0, v7, gged1);
                    }
                    goto label_108;
                }
            }
            cunf1 = cunf0;
            dfum1 = dfum0;
        label_108:
            FileAttachment fileAttachment0 = dbyq0.a();
            this.aY(fileAttachment0, dcje0.e);
            shareTarget0.l(fileAttachment0);
            ++v4;
            z = z;
            cunf0 = cunf1;
            dfum0 = dfum1;
            dcnp0 = dcnp0;
        }
        for(int v9 = 0; v9 < dcjk0.d.size(); ++v9) {
            dcjv dcjv0 = (dcjv)dcjk0.d.get(v9);
            long v10 = dcjv0.f;
            if(v10 <= 0L) {
                this.az(shareTarget0, 0x3F6);
                cunf0.e().p("Ignore introduction, due to invalid attachment size", new Object[0]);
                return;
            }
            cunf cunf2 = cunf0.b();
            dcju dcju0 = dcju.b(dcjv0.d) == null ? dcju.a : dcju.b(dcjv0.d);
            cunf2.i("Found text attachment %s of type %s", dcjv0.c, dcju0.name());
            dcnj dcnj0 = new dcnj(dcjv0.c);
            dcnj0.a = dcjv0.g;
            switch((dcju.b(dcjv0.d) == null ? dcju.a : dcju.b(dcjv0.d)).ordinal()) {
                case 2: {
                    v11 = 1;
                    break;
                }
                case 3: {
                    v11 = 2;
                    break;
                }
                case 4: {
                    v11 = 3;
                    break;
                }
                default: {
                    v11 = 0;
                }
            }
            dcnj0.c = v11;
            dcnj0.d = v10;
            dcnj0.f = (dcjv0.b & 0x20) != 0 && dcjv0.h;
            TextAttachment textAttachment0 = dcnj0.a();
            this.aY(textAttachment0, dcjv0.e);
            shareTarget0.n(textAttachment0);
        }
        int v12 = 0;
        while(v12 < dcjk0.f.size()) {
            Context context1 = this.i;
            if(djbw.h(context1)) {
                cunf0.e().p("Ignore introduction, we don\'t support wifiCredentials attachment for guest user.", new Object[0]);
                this.az(shareTarget0, 0x3F6);
                return;
            }
            if(!djbw.f(context1)) {
                dckc dckc0 = (dckc)dcjk0.f.get(v12);
                cunf cunf3 = cunf0.b();
                dckb dckb0 = dckb.b(dckc0.d) == null ? dckb.a : dckb.b(dckc0.d);
                cunf3.i("Found wifiCredentials attachment %s of security type %s", dckc0.c, dckb0);
                dcns dcns0 = new dcns(dckc0.c);
                dcns0.a = dckc0.f;
                switch((dckb.b(dckc0.d) == null ? dckb.a : dckb.b(dckc0.d)).ordinal()) {
                    case 1: {
                        v13 = 1;
                        break;
                    }
                    case 2: {
                        v13 = 2;
                        break;
                    }
                    case 3: {
                        v13 = 3;
                        break;
                    }
                    case 4: {
                        v13 = 4;
                        break;
                    }
                    default: {
                        v13 = 0;
                    }
                }
                dcns0.b = v13;
                WifiCredentialsAttachment wifiCredentialsAttachment0 = dcns0.a();
                this.aY(wifiCredentialsAttachment0, dckc0.e);
                shareTarget0.o(wifiCredentialsAttachment0);
                ++v12;
                continue;
            }
            cunf0.e().p("Ignore introduction, disallow add wifi config.", new Object[0]);
            this.az(shareTarget0, 0x3F6);
            return;
        }
        for(int v14 = 0; v14 < dcjk0.g.size(); ++v14) {
            dcis dcis0 = (dcis)dcjk0.g.get(v14);
            dbvf dbvf0 = new dbvf(dcis0.c);
            dbvf0.a = dcis0.f;
            dbvf0.b = dcis0.d;
            dbvf0.d = (String[])dcis0.g.toArray(new String[0]);
            dbvf0.e = glxd.j(dcis0.h);
            dbvf0.f = dcis0.i;
            dbvf0.c();
            AppAttachment appAttachment0 = dbvf0.a();
            this.aZ(appAttachment0, dcis0.e);
            shareTarget0.k(appAttachment0);
        }
        if(hvqz.L()) {
            for(int v15 = 0; v15 < dcjk0.i.size(); ++v15) {
                dcjs dcjs0 = (dcjs)dcjk0.i.get(v15);
                dcnh dcnh0 = new dcnh(dcjs0.c);
                dcnh0.a = new SecureRandom().nextLong();
                dcnh0.e = dcjs0.d;
                dcnh0.f = dcjs0.f;
                StreamAttachment streamAttachment0 = dcnh0.a();
                this.ab(streamAttachment0).b(dcjs0.e);
                shareTarget0.m(streamAttachment0);
            }
        }
        if(!shareTarget0.e().isEmpty()) {
            if((dcjk0.b & 1) != 0) {
                shareTarget0.e.putString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE", dcjk0.e);
            }
            cunf0.b().h("Successfully received incoming connection from %s", shareTarget0);
            this.aO(shareTarget0.f());
            Context context2 = this.i;
            List list0 = shareTarget0.e();
            cuud cuud0 = this.ah;
            BigDecimal bigDecimal0 = djad.i((djbr.x(list0) ? context2.getCacheDir() : Environment.getExternalStorageDirectory()));
            cunf0.d().h("There is %s remaining storage on the device", bigDecimal0);
            boolean z1 = false;
            for(Object object0: list0) {
                Attachment attachment0 = (Attachment)object0;
                if(attachment0.j()) {
                    long v16 = attachment0.c();
                    gged_interceptors gged2 = djbh.a(context2, ((FileAttachment)attachment0).j);
                    if(gged2 != null) {
                        long v17 = djas.a(gged2, djas.b(cuud0.b(djbr.x(list0)), gged2));
                        if(v17 != -1L) {
                            v16 -= v17;
                        }
                    }
                    bigDecimal0 = bigDecimal0.subtract(new BigDecimal(Long.toString(v16)));
                    z1 = true;
                }
            }
            cunf0.d().h("After downloading the incoming files, there will be %s remaining storage on the device", bigDecimal0);
            if(z1 && bigDecimal0.signum() <= 0) {
                this.az(shareTarget0, 0x3F5);
                cunf0.e().h("Not enough space on the receiver. We have informed %s", shareTarget0);
                return;
            }
            long v18 = hvqs.ao();
            this.h.b(shareTarget0, dfum0, dcnp0, v18);
            if(s == null && shareTarget0.n) {
                dcnn dcnn0 = new dcnn(1003);
                if(this.bz()) {
                    dcnn0.i = 1;
                }
                dcnn0.g = true;
                dcnn0.h = true;
                dcnp0.e(shareTarget0, dcnn0.a());
            }
            else {
                dcnn dcnn1 = new dcnn(1002);
                dcnn1.c = s;
                dcnn1.h = true;
                dcnp0.e(shareTarget0, dcnn1.a());
            }
            dcnp dcnp1 = this.Y(shareTarget0);
            if(dcnp1 == null) {
                dfum0.a();
                cunf0.b().h("No TransferUpdateCallback tied to %s. Disconnecting.", shareTarget0);
                return;
            }
            dfum0.b(new dfwl(this, dcnp1, shareTarget0));
            this.bk(dfum0, shareTarget0);
            return;
        }
        cunf0.e().p("No attachment is found for this share target. It can be result of unrecognizable attachment type.", new Object[0]);
        this.az(shareTarget0, 0x3F6);
        cunf0.e().h("We don\'t support the attachments sent by the sender. We have informed %s", shareTarget0);
    }

    public final void aQ(long v, dfzt dfzt0) {
        dcvz.a.b().h("Started listening for progress on payload %d", Long.valueOf(v));
        this.l.v(v, dfzt0);
    }

    public final void aR(ShareTarget shareTarget0) {
        this.c.keySet().removeAll(shareTarget0.e());
    }

    public static void aS(Map map0) {
        gged_interceptors gged0 = gged_interceptors.i(map0.keySet());
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = gged0.get(v1);
            dfzd dfzd0 = (dfzd)map0.get(object0);
            if(dfzd0 != null && TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - dfzd0.h) > hvqs.l()) {
                dcvz.a.a().h("Remove expired caching info: %s", object0);
                map0.remove(object0);
            }
        }
    }

    public final void aT(Attachment attachment0, Attachment attachment1) {
        Map map0 = this.c;
        dfzc dfzc0 = (dfzc)map0.remove(attachment0);
        if(dfzc0 == null) {
            return;
        }
        dfzc dfzc1 = (dfzc)map0.remove(attachment1);
        if(dfzc1 != null) {
            Uri uri0 = dfzc1.a;
            if(uri0 != null) {
                dfzc0.a = uri0;
            }
            dcjz dcjz0 = dfzc1.b;
            if(dcjz0 != null) {
                dfzc0.b = dcjz0;
            }
            long v = dfzc1.c;
            if(v != -1L) {
                dfzc0.c = v;
            }
            String s = dfzc1.f;
            if(s != null) {
                dfzc0.f = s;
            }
            if(!dfzc1.g.isEmpty()) {
                dfzc0.g = dfzc1.g;
            }
            long v1 = dfzc1.e;
            if(v1 != -1L) {
                dfzc0.e = v1;
            }
            long v2 = dfzc1.d;
            if(v2 != -1L) {
                dfzc0.d = v2;
            }
        }
        map0.put(attachment1, dfzc0);
    }

    public final void aU(Runnable runnable0) {
        this.af.execute(runnable0);
    }

    public final void aV() {
        if(Long.compare(this.aj, hvqs.z()) >= 0) {
            dcvz.a.b().p("Reached maximum number of tasks can be scheduled. Skipped scheduling certificates syncing tasks.", new Object[0]);
            return;
        }
        ++this.aj;
        this.F = this.au(new dfvy(this), hvqs.y());
        dcvz.a.b().p("Scheduled a certificates syncing task during discovery.", new Object[0]);
    }

    public final void aW(ShareTarget shareTarget0, String s) {
        dckb dckb0;
        dcju dcju0;
        dcjd dcjd0;
        cuwu[] arr_cuwu5;
        int v1;
        List list1;
        cunf cunf0 = dcvz.a;
        cunf0.b().h("Preparing to send introduction to %s", shareTarget0);
        dfum dfum0 = this.aa(shareTarget0);
        dcnp dcnp0 = this.Y(shareTarget0);
        if(dfum0 != null && dcnp0 != null) {
            cuwu[] arr_cuwu = this.cd(shareTarget0);
            cuwu[] arr_cuwu1 = this.cf(shareTarget0);
            cuwu[] arr_cuwu2 = this.cg(shareTarget0);
            cuwu[] arr_cuwu3 = this.cc(shareTarget0);
            cuwu[] arr_cuwu4 = this.ce(shareTarget0);
            if(arr_cuwu.length == 0 && arr_cuwu1.length == 0 && arr_cuwu2.length == 0 && arr_cuwu3.length == 0 && arr_cuwu4.length == 0) {
                dcnp0.e(shareTarget0, new dcnn(1007).a());
                dfum0.a();
                dcvz.a.b().h("No payloads tied to %s. Disconnecting.", shareTarget0);
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dcjk.a).v_newBuilder();
            if(this.ae(shareTarget0).n) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dcjk dcjk0 = (dcjk)hftp0.b_message;
                dcjk0.b |= 2;
                dcjk0.h = true;
            }
            if(this.bz()) {
                dcjj dcjj0 = dcjj.c;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((dcjk)hftp0.b_message).j = dcjj0.d;
                ((dcjk)hftp0.b_message).b |= 4;
            }
            cunf0.b().h("Sending attachments to %s", shareTarget0.b);
            List list0 = shareTarget0.f();
            int v = 0;
            while(v < arr_cuwu.length) {
                FileAttachment fileAttachment0 = (FileAttachment)list0.get(v);
                cunf cunf1 = cunf0.b();
                String s1 = fileAttachment0.a;
                cunf1.h("Preparing file attachment %s", s1);
                if(arr_cuwu[v] == null) {
                    list1 = list0;
                    v1 = v;
                    arr_cuwu5 = arr_cuwu;
                }
                else {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dcje.a).v_newBuilder();
                    v1 = v;
                    long v2 = fileAttachment0.g;
                    list1 = list0;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    arr_cuwu5 = arr_cuwu;
                    ((dcje)hftv0).b |= 0x20;
                    ((dcje)hftv0).h = v2;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp1.b_message;
                    s1.getClass();
                    ((dcje)hftv1).b |= 1;
                    ((dcje)hftv1).c = s1;
                    long v3 = arr_cuwu5[v1].i;
                    if(!hftv1.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp1.b_message;
                    ((dcje)hftv2).b |= 4;
                    ((dcje)hftv2).e = v3;
                    switch(fileAttachment0.b) {
                        case 1: {
                            dcjd0 = dcjd.b;
                            break;
                        }
                        case 2: {
                            dcjd0 = dcjd.c;
                            break;
                        }
                        case 3: {
                            dcjd0 = dcjd.d;
                            break;
                        }
                        case 4: {
                            dcjd0 = dcjd.e;
                            break;
                        }
                        case 5: {
                            dcjd0 = dcjd.f;
                            break;
                        }
                        case 6: {
                            dcjd0 = dcjd.g;
                            break;
                        }
                        default: {
                            dcjd0 = dcjd.a;
                        }
                    }
                    if(!hftv2.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp1.b_message;
                    ((dcje)hftv3).d = dcjd0.h;
                    ((dcje)hftv3).b |= 2;
                    String s2 = fileAttachment0.f;
                    if(!hftv3.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp1.b_message;
                    s2.getClass();
                    ((dcje)hftv4).b |= 16;
                    ((dcje)hftv4).g = s2;
                    long v4 = fileAttachment0.c;
                    if(!hftv4.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv5 = hftp1.b_message;
                    ((dcje)hftv5).b |= 8;
                    ((dcje)hftv5).f = v4;
                    long v5 = fileAttachment0.j;
                    if(!hftv5.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv6 = hftp1.b_message;
                    ((dcje)hftv6).b |= 0x80;
                    ((dcje)hftv6).j = v5;
                    boolean z = fileAttachment0.k;
                    if(!hftv6.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    dcje dcje0 = (dcje)hftp1.b_message;
                    dcje0.b |= 0x100;
                    dcje0.k = z;
                    String s3 = fileAttachment0.h;
                    if(!TextUtils.isEmpty(s3)) {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        dcje dcje1 = (dcje)hftp1.b_message;
                        s3.getClass();
                        dcje1.b |= 0x40;
                        dcje1.i = s3;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dcjk dcjk1 = (dcjk)hftp0.b_message;
                    dcje dcje2 = (dcje)hftp1.N_build();
                    dcje2.getClass();
                    dcjk1.c();
                    dcjk1.c.add(dcje2);
                }
                v = v1 + 1;
                cunf0 = cunf0;
                dcnp0 = dcnp0;
                list0 = list1;
                arr_cuwu = arr_cuwu5;
            }
            List list2 = shareTarget0.i();
            int v6 = 0;
            while(v6 < arr_cuwu1.length) {
                TextAttachment textAttachment0 = (TextAttachment)list2.get(v6);
                cunf cunf2 = cunf0.b();
                String s4 = textAttachment0.e;
                cunf2.h("Preparing text attachment %s", s4);
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)dcjv.a).v_newBuilder();
                long v7 = textAttachment0.f;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv7 = hftp2.b_message;
                ((dcjv)hftv7).b |= 16;
                ((dcjv)hftv7).g = v7;
                if(!hftv7.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv8 = hftp2.b_message;
                s4.getClass();
                ((dcjv)hftv8).b |= 1;
                ((dcjv)hftv8).c = s4;
                switch(textAttachment0.b) {
                    case 0: {
                        dcju0 = dcju.b;
                        break;
                    }
                    case 1: {
                        dcju0 = dcju.c;
                        break;
                    }
                    case 2: {
                        dcju0 = dcju.d;
                        break;
                    }
                    case 3: {
                        dcju0 = dcju.e;
                        break;
                    }
                    default: {
                        dcju0 = dcju.a;
                    }
                }
                if(!hftv8.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv9 = hftp2.b_message;
                ((dcjv)hftv9).d = dcju0.f;
                ((dcjv)hftv9).b |= 2;
                long v8 = textAttachment0.c;
                if(!hftv9.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv10 = hftp2.b_message;
                ((dcjv)hftv10).b |= 8;
                ((dcjv)hftv10).f = v8;
                long v9 = arr_cuwu1[v6].i;
                if(!hftv10.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv11 = hftp2.b_message;
                ((dcjv)hftv11).b |= 4;
                ((dcjv)hftv11).e = v9;
                boolean z1 = textAttachment0.g;
                if(!hftv11.isImmutable()) {
                    hftp2.ensureMutable();
                }
                dcjv dcjv0 = (dcjv)hftp2.b_message;
                dcjv0.b |= 0x20;
                dcjv0.h = z1;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dcjk dcjk2 = (dcjk)hftp0.b_message;
                dcjv dcjv1 = (dcjv)hftp2.N_build();
                dcjv1.getClass();
                dcjk2.d();
                dcjk2.d.add(dcjv1);
                ++v6;
                arr_cuwu1 = arr_cuwu1;
                list2 = list2;
            }
            for(int v10 = 0; v10 < arr_cuwu2.length; ++v10) {
                WifiCredentialsAttachment wifiCredentialsAttachment0 = (WifiCredentialsAttachment)shareTarget0.j().get(v10);
                cunf cunf3 = cunf0.b();
                String s5 = wifiCredentialsAttachment0.a;
                cunf3.h("Preparing wifi credentials attachment for %s.", s5);
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)dckc.a).v_newBuilder();
                long v11 = wifiCredentialsAttachment0.f;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv12 = hftp3.b_message;
                ((dckc)hftv12).b |= 8;
                ((dckc)hftv12).f = v11;
                if(!hftv12.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv13 = hftp3.b_message;
                s5.getClass();
                ((dckc)hftv13).b |= 1;
                ((dckc)hftv13).c = s5;
                long v12 = arr_cuwu2[v10].i;
                if(!hftv13.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv14 = hftp3.b_message;
                ((dckc)hftv14).b |= 4;
                ((dckc)hftv14).e = v12;
                switch(wifiCredentialsAttachment0.b) {
                    case 0: {
                        dckb0 = dckb.a;
                        break;
                    }
                    case 1: {
                        dckb0 = dckb.b;
                        break;
                    }
                    case 2: {
                        dckb0 = dckb.c;
                        break;
                    }
                    case 3: {
                        dckb0 = dckb.d;
                        break;
                    }
                    case 4: {
                        dckb0 = dckb.e;
                        break;
                    }
                    default: {
                        dckb0 = dckb.a;
                    }
                }
                if(!hftv14.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((dckc)hftp3.b_message).d = dckb0.f;
                ((dckc)hftp3.b_message).b |= 2;
                dckc dckc0 = (dckc)hftp3.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dcjk dcjk3 = (dcjk)hftp0.b_message;
                dckc0.getClass();
                dcjk3.e();
                dcjk3.f.add(dckc0);
            }
            for(Object object0: shareTarget0.d()) {
                cunf cunf4 = cunf0.b();
                String s6 = ((AppAttachment)object0).a;
                cunf4.h("Preparing app attachment %s", s6);
                dcir dcir0 = (dcir)((ProtoLiteMessage)dcis.a).v_newBuilder();
                if(!dcir0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)dcir0).ensureMutable();
                }
                dcis dcis0 = (dcis)dcir0.b_message;
                s6.getClass();
                dcis0.b |= 1;
                dcis0.c = s6;
                long v14 = ((AppAttachment)object0).e;
                if(!dcir0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)dcir0).ensureMutable();
                }
                dcis dcis1 = (dcis)dcir0.b_message;
                dcis1.b |= 4;
                dcis1.f = v14;
                long v15 = ((AppAttachment)object0).b;
                if(!dcir0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)dcir0).ensureMutable();
                }
                dcis dcis2 = (dcis)dcir0.b_message;
                dcis2.b |= 2;
                dcis2.d = v15;
                String[] arr_s = ((AppAttachment)object0).f;
                dcir0.a(Arrays.asList(arr_s));
                dcir0.k(glxd.g(((AppAttachment)object0).g));
                String s7 = ((AppAttachment)object0).h;
                if(!dcir0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)dcir0).ensureMutable();
                }
                dcis dcis3 = (dcis)dcir0.b_message;
                s7.getClass();
                dcis3.b |= 8;
                dcis3.i = s7;
                dcis dcis4 = (dcis)((ProtoLiteBuilder)dcir0).N_build();
                int v16 = 0;
                for(int v13 = 0; v16 < arr_s.length; ++v13) {
                    ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)dcis4).jf(5, null);
                    hftp4.X(((ProtoLiteMessage)dcis4));
                    dcir dcir1 = (dcir)hftp4;
                    long v17 = arr_cuwu3[v13].i;
                    if(!dcir1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)dcir1).ensureMutable();
                    }
                    dcis dcis5 = (dcis)dcir1.b_message;
                    dcis5.b();
                    dcis5.e.g(v17);
                    ++v16;
                    dcis4 = (dcis)((ProtoLiteBuilder)dcir1).N_build();
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dcjk dcjk4 = (dcjk)hftp0.b_message;
                dcis4.getClass();
                dcjk4.b();
                dcjk4.g.add(dcis4);
            }
            for(int v18 = 0; v18 < arr_cuwu4.length; ++v18) {
                StreamAttachment streamAttachment0 = (StreamAttachment)shareTarget0.g().get(v18);
                cunf cunf5 = cunf0.b();
                String s8 = streamAttachment0.a;
                cunf5.h("Preparing stream attachment \"%s\"", s8);
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)dcjs.a).v_newBuilder();
                long v19 = arr_cuwu4[v18].i;
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ProtoLiteMessage hftv15 = hftp5.b_message;
                ((dcjs)hftv15).b |= 4;
                ((dcjs)hftv15).e = v19;
                if(!hftv15.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ProtoLiteMessage hftv16 = hftp5.b_message;
                s8.getClass();
                ((dcjs)hftv16).b |= 1;
                ((dcjs)hftv16).c = s8;
                String s9 = streamAttachment0.e;
                if(!hftv16.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ProtoLiteMessage hftv17 = hftp5.b_message;
                s9.getClass();
                ((dcjs)hftv17).b |= 2;
                ((dcjs)hftv17).d = s9;
                String s10 = streamAttachment0.f;
                if(!hftv17.isImmutable()) {
                    hftp5.ensureMutable();
                }
                dcjs dcjs0 = (dcjs)hftp5.b_message;
                s10.getClass();
                dcjs0.b |= 8;
                dcjs0.f = s10;
                dcjs dcjs1 = (dcjs)hftp5.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dcjk dcjk5 = (dcjk)hftp0.b_message;
                dcjs1.getClass();
                hfuo hfuo0 = dcjk5.i;
                if(!hfuo0.c()) {
                    dcjk5.i = ProtoLiteMessage.E(hfuo0);
                }
                dcjk5.i.add(dcjs1);
            }
            String s11 = shareTarget0.e.getString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE");
            if(s11 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dcjk dcjk6 = (dcjk)hftp0.b_message;
                dcjk6.b |= 1;
                dcjk6.e = s11;
            }
            try {
                dcjk dcjk7 = (dcjk)hftp0.N_build();
                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)dcjh.a).v_newBuilder();
                dcjg dcjg0 = dcjg.b;
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ((dcjh)hftp6.b_message).c = dcjg0.c;
                ((dcjh)hftp6.b_message).b |= 1;
                ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)dcjy.a).v_newBuilder();
                dcjx dcjx0 = dcjx.b;
                if(!hftp7.b_message.isImmutable()) {
                    hftp7.ensureMutable();
                }
                ProtoLiteMessage hftv18 = hftp7.b_message;
                ((dcjy)hftv18).c = dcjx0.i;
                ((dcjy)hftv18).b |= 1;
                if(!hftv18.isImmutable()) {
                    hftp7.ensureMutable();
                }
                dcjy dcjy0 = (dcjy)hftp7.b_message;
                dcjk7.getClass();
                dcjy0.d = dcjk7;
                dcjy0.b |= 2;
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                dcjh dcjh0 = (dcjh)hftp6.b_message;
                dcjy dcjy1 = (dcjy)hftp7.N_build();
                dcjy1.getClass();
                dcjh0.d = dcjy1;
                dcjh0.b |= 2;
                dfum0.c(((dcjh)hftp6.N_build()).toBytesArray());
            }
            catch(IOException iOException0) {
                dcvz.a.e().f(iOException0).p("Failed to write the introduction frame. Disconnecting.", new Object[0]);
                dcnp0.e(shareTarget0, new dcnn(1007).a());
                dfum0.a();
                this.bR(shareTarget0, (this.bF() ? 10 : 7));
                return;
            }
            dcvz.a.b().p("Successfully wrote the introduction frame", new Object[0]);
            long v20 = hvqs.am();
            this.h.b(shareTarget0, dfum0, dcnp0, v20);
            if(hvqs.bj()) {
                dcnn dcnn0 = new dcnn(1003);
                dcnn0.c = s;
                dcnp0.e(shareTarget0, dcnn0.a());
                return;
            }
            dcnn dcnn1 = new dcnn(1002);
            dcnn1.c = s;
            dcnp0.e(shareTarget0, dcnn1.a());
            return;
        }
        this.bh(shareTarget0, new dcnn(1007).a());
        this.aH(shareTarget0);
        if(dfum0 != null) {
            dfum0.a();
        }
        if(dcnp0 != null) {
            dcnp0.e(shareTarget0, new dcnn(1007).a());
        }
        cunf0.b().h("No TransferUpdateCallback tied to %s. Disconnecting.", shareTarget0);
        if(dcnp0 == null) {
            this.bR(shareTarget0, (this.bF() ? 10 : 9));
            return;
        }
        this.bR(shareTarget0, (this.bF() ? 10 : 8));
    }

    final void aX(Attachment attachment0, Uri uri0) {
        Map map0 = this.c;
        dfzc dfzc0 = (dfzc)map0.get(attachment0);
        if(dfzc0 == null) {
            dfzc0 = new dfzc();
            map0.put(attachment0, dfzc0);
        }
        dfzc0.a = uri0;
    }

    final void aY(Attachment attachment0, long v) {
        this.ab(attachment0).c = v;
    }

    public final void aZ(AppAttachment appAttachment0, List list0) {
        Map map0 = this.c;
        dfzc dfzc0 = (dfzc)map0.get(appAttachment0);
        if(dfzc0 == null) {
            dfzc0 = new dfzc();
            map0.put(appAttachment0, dfzc0);
        }
        dfzc0.g = list0;
    }

    public final dfum aa(ShareTarget shareTarget0) {
        return shareTarget0.f ? this.ad(shareTarget0).c : this.ae(shareTarget0).d;
    }

    final dfzc ab(Attachment attachment0) {
        Map map0 = this.c;
        dfzc dfzc0 = (dfzc)map0.get(attachment0);
        if(dfzc0 == null) {
            dfzc0 = new dfzc();
            map0.put(attachment0, dfzc0);
        }
        return dfzc0;
    }

    final dfzh ac(ShareTarget shareTarget0, dfum dfum0, dcjx dcjx0, long v) {
        boolean z = shareTarget0.f;
        ConcurrentMap concurrentMap0 = z ? this.as(shareTarget0) : this.at(shareTarget0);
        dcjy dcjy0 = (dcjy)concurrentMap0.get(dcjx0);
        if(dcjy0 != null) {
            dcvz.a.b().h("Successfully read cached %s frame", dcjx0);
            concurrentMap0.remove(dcjx0);
            return new dfzh(dcjy0, 0);
        }
        cunf cunf0 = dcvz.a;
        cumn cumn0 = cumn.d(cunf0, new dfyi(this, v, dfum0), v, this.g);
        while(true) {
            dcjy dcjy1 = null;
            if(dfum0.d()) {
                break;
            }
            ConcurrentMap concurrentMap1 = z ? this.as(shareTarget0) : this.at(shareTarget0);
            dcjy dcjy2 = dfzz.U(dfum0);
            if(dcjy2 != null) {
                if(dcjx0.equals((dcjx.b(dcjy2.c) == null ? dcjx.a : dcjx.b(dcjy2.c)))) {
                    cunf0.b().h("Successfully read %s frame", dcjx0.name());
                    dcjy1 = dcjy2;
                }
                else {
                    cunf0.e().i("Failed to read %s frame, but got %s. Cached for later.", dcjx0.name(), (dcjx.b(dcjy2.c) == null ? dcjx.a : dcjx.b(dcjy2.c)).name());
                    concurrentMap1.put((dcjx.b(dcjy2.c) == null ? dcjx.a : dcjx.b(dcjy2.c)), dcjy2);
                }
            }
            if(dcjy1 != null) {
                cumn0.b();
                return new dfzh(dcjy1, 0);
            }
        }
        cunf0.e().h("Failed to read %s frame", dcjx0.name());
        cumn0.b();
        return new dfzh(null, (this.Y.get() ? 1 : 2));
    }

    public final dfzi ad(ShareTarget shareTarget0) {
        if(hvrc.x()) {
            batl.l(shareTarget0.f);
        }
        Map map0 = this.f;
        dfzi dfzi0 = (dfzi)map0.get(shareTarget0);
        if(dfzi0 == null) {
            dfzi0 = new dfzi();
            map0.put(shareTarget0, dfzi0);
        }
        return dfzi0;
    }

    public final dfzj ae(ShareTarget shareTarget0) {
        if(hvrc.x()) {
            batl.l(shareTarget0.q());
        }
        Map map0 = this.e;
        dfzj dfzj0 = (dfzj)map0.get(shareTarget0);
        if(dfzj0 == null) {
            dfzj0 = new dfzj();
            map0.put(shareTarget0, dfzj0);
        }
        return dfzj0;
    }

    public final dfzk af(ShareTarget shareTarget0) {
        dfzk dfzk6;
        dfzk dfzk3;
        cunf cunf0;
        dcjx dcjx1;
        dcjn dcjn0;
        dcjo dcjo0;
        dfzk dfzk2;
        dcjl dcjl0;
        int v2;
        int v1;
        boolean z1;
        boolean z = shareTarget0.f;
        String s = this.ap(shareTarget0);
        dfum dfum0 = this.aa(shareTarget0);
        dgap dgap0 = this.ag(shareTarget0);
        if(z) {
            z1 = this.ca(shareTarget0) || this.J == 3;
            v1 = 1;
            v2 = 2;
        }
        else {
            z1 = true;
            v2 = 1;
            v1 = 2;
        }
        if(s != null && dfum0 != null) {
            byte[] arr_b = this.l.G(s);
            if(arr_b == null) {
                dcvz.a.b().h("Failed to read authenticationToken from connection: %s.", s);
                return dfzk.b;
            }
            dcpu dcpu0 = new dcpu();
            dcpu0.a = 10;
            dcpu0.b = z ? 3 : 2;
            dcpv dcpv0 = new dcpv(dcpu0);
            dgah dgah0 = this.t;
            byte[] arr_b1 = dgah0.l(dfzz.cb(((byte)v2), arr_b), dcpv0);
            if(arr_b1 == null) {
                dcjl0 = dcjl.a;
            }
            else {
                byte[] arr_b2 = dgap0 == null ? dizs.e(6) : dfzz.bK(arr_b, dgap0.a.d.toByteArray());
                if(arr_b2 == null) {
                    arr_b2 = dizs.e(6);
                }
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dcjl.a).v_newBuilder();
                ByteString hfsf0 = ByteString.copyFrom(arr_b1);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dcjl dcjl1 = (dcjl)hftp0.b_message;
                dcjl1.b |= 1;
                dcjl1.c = hfsf0;
                ByteString hfsf1 = ByteString.copyFrom(arr_b2);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dcjl dcjl2 = (dcjl)hftp0.b_message;
                dcjl2.b |= 2;
                dcjl2.d = hfsf1;
                if(this.ca(shareTarget0)) {
                    dcvz.a.b().p("Attempts to sign authentication token with a previous private key.", new Object[0]);
                    byte[] arr_b3 = dgah0.m(dfzz.cb(((byte)v2), arr_b), dcpv0);
                    if(arr_b3 != null) {
                        ByteString hfsf2 = ByteString.copyFrom(arr_b3);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        dcjl dcjl3 = (dcjl)hftp0.b_message;
                        dcjl3.b |= 4;
                        dcjl3.e = hfsf2;
                    }
                }
                dcjl0 = (dcjl)hftp0.N_build();
            }
            try {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dcjh.a).v_newBuilder();
                dcjg dcjg0 = dcjg.b;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((dcjh)hftp1.b_message).c = dcjg0.c;
                ((dcjh)hftp1.b_message).b |= 1;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)dcjy.a).v_newBuilder();
                dcjx dcjx0 = dcjx.d;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp2.b_message;
                ((dcjy)hftv0).c = dcjx0.i;
                ((dcjy)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp2.ensureMutable();
                }
                dcjy dcjy0 = (dcjy)hftp2.b_message;
                dcjl0.getClass();
                dcjy0.f = dcjl0;
                dcjy0.b |= 8;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                dcjh dcjh0 = (dcjh)hftp1.b_message;
                dcjy dcjy1 = (dcjy)hftp2.N_build();
                dcjy1.getClass();
                dcjh0.d = dcjy1;
                dcjh0.b |= 2;
                dfum0.c(((dcjh)hftp1.N_build()).toBytesArray());
                dcvz.a.b().h("Wrote paired key encryption when connecting to %s.", shareTarget0);
            }
            catch(IOException iOException0) {
                dcvz.a.e().f(iOException0).h("Failed to write paired key encryption when connecting to %s.", shareTarget0);
                return dfzk.b;
            }
            dcjy dcjy2 = this.bW(shareTarget0, dfum0, dcjx.d).a;
            if(dcjy2 == null) {
                dcvz.a.b().h("Failed to read remote paired key encryption when connection to %s.", shareTarget0);
                return dfzk.b;
            }
            dcpu dcpu1 = new dcpu();
            dcpu1.b = shareTarget0.f ? 3 : 2;
            dcpu1.a = 10;
            dcpv dcpv1 = new dcpv(dcpu1);
            dgah dgah1 = this.t;
            dfzk dfzk0 = dfzz.ci((dcjy2.f == null ? dcjl.a : dcjy2.f), arr_b, dgah1.c(dcpv1));
            dfzk dfzk1 = dfzk.a;
            if(dfzk0 != dfzk1) {
                if(hvqz.a.b().aU()) {
                    if(z1) {
                        goto label_103;
                    }
                    dcvz.a.b().h("Rejecting connection from unauthenticated ShareTarget %s because we\'re only allowing connections with authenticated ShareTargets.", shareTarget0);
                    return dfzk.b;
                }
                else if(z1) {
                label_103:
                    dcjl dcjl4 = dcjy2.f == null ? dcjl.a : dcjy2.f;
                    dcvz.a.b().p("Attempts to verify remote public certificate with relaxed visibility", new Object[0]);
                    dfzk0 = dfzz.ci(dcjl4, arr_b, dgah1.b(dcpv1));
                }
            }
            dcjl dcjl5 = dcjy2.f == null ? dcjl.a : dcjy2.f;
            if(dgap0 == null) {
                dcvz.a.b().p("Unable to verify remote paired key encryption frame. Cannot locate remote certificate.", new Object[0]);
                dfzk2 = dfzk.c;
            }
            else if(this.v.c() == null) {
                dcvz.a.b().p("Unable to verify remote paired key encryption frame. Cannot locate account on local device.", new Object[0]);
                dfzk2 = dfzk.c;
            }
            else {
                dbwx dbwx0 = dgap0.a;
                if(dgah1.k(dbwx0.e.toByteArray(), dfzz.cb(((byte)v1), arr_b), dcjl5.c.toByteArray())) {
                label_123:
                    if(shareTarget0.h) {
                        dcvz.a.b().p("Successfully verified remote paired key encryption frame.", new Object[0]);
                        dfzk2 = dfzk1;
                    }
                    else {
                        dcvz.a.b().p("Unable to verify remote paired key encryption frame. Remote side is not a known share target.", new Object[0]);
                        dfzk2 = dfzk.c;
                    }
                }
                else if((hvqz.a.b().j() ? shareTarget0.q() : this.ca(shareTarget0)) && (dcjl5.b & 4) != 0 && dgah1.k(dbwx0.e.toByteArray(), dfzz.cb(((byte)v1), arr_b), dcjl5.e.toByteArray())) {
                    dcvz.a.b().p("Successfully verified remote paired key encryption frame with the optional signed data.", new Object[0]);
                    goto label_123;
                }
                else {
                    dcvz.a.b().p("Failed to verify remote paired key encryption frame.", new Object[0]);
                    dfzk2 = dfzk.b;
                }
            }
            try {
                dcjo0 = dcjo.a;
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)dcjo0).v_newBuilder();
                switch(dfzk2.ordinal()) {
                    case 0: {
                        dcjn0 = dcjn.b;
                        break;
                    }
                    case 1: {
                        dcjn0 = dcjn.c;
                        break;
                    }
                    case 2: {
                        dcjn0 = dcjn.d;
                        break;
                    }
                    default: {
                        throw new RuntimeException(null, null);
                    }
                }
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((dcjo)hftp3.b_message).c = dcjn0.e;
                ((dcjo)hftp3.b_message).b |= 1;
                dcjo dcjo1 = (dcjo)hftp3.N_build();
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)dcjh.a).v_newBuilder();
                dcjg dcjg1 = dcjg.b;
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ((dcjh)hftp4.b_message).c = dcjg1.c;
                ((dcjh)hftp4.b_message).b |= 1;
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)dcjy.a).v_newBuilder();
                dcjx1 = dcjx.e;
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp5.b_message;
                ((dcjy)hftv1).c = dcjx1.i;
                ((dcjy)hftv1).b |= 1;
                if(!hftv1.isImmutable()) {
                    hftp5.ensureMutable();
                }
                dcjy dcjy3 = (dcjy)hftp5.b_message;
                dcjo1.getClass();
                dcjy3.g = dcjo1;
                dcjy3.b |= 16;
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                dcjh dcjh1 = (dcjh)hftp4.b_message;
                dcjy dcjy4 = (dcjy)hftp5.N_build();
                dcjy4.getClass();
                dcjh1.d = dcjy4;
                dcjh1.b |= 2;
                dfum0.c(((dcjh)hftp4.N_build()).toBytesArray());
                cunf0 = dcvz.a;
                cunf0.b().i("Wrote paired key verification result %s when connecting to %s.", dfzk2, shareTarget0);
            }
            catch(IOException iOException1) {
                dcvz.a.e().f(iOException1).h("Failed to read paired key verification result when connecting to %s.", shareTarget0);
                return dfzk.b;
            }
            dcjy dcjy5 = this.bW(shareTarget0, dfum0, dcjx1).a;
            if(dcjy5 == null) {
                cunf0.b().h("Failed to read paired key verification when connecting to %s.", shareTarget0);
                return dfzk.b;
            }
            dcjo dcjo2 = dcjy5.g;
            if(dcjo2 != null) {
                dcjo0 = dcjo2;
            }
            dcjn dcjn1 = dcjn.b(dcjo0.c) == null ? dcjn.a : dcjn.b(dcjo0.c);
            dfzk[] arr_dfzk = {dfzk2, dfzk0, null};
            switch(dcjn1.ordinal()) {
                case 1: {
                    dfzk3 = dfzk1;
                    break;
                }
                case 2: {
                    dfzk3 = dfzk.b;
                    break;
                }
                case 0: 
                case 3: {
                    dfzk3 = dfzk.c;
                    break;
                }
                default: {
                    throw new RuntimeException(null, null);
                }
            }
            arr_dfzk[2] = dfzk3;
            int v3 = 0;
            for(int v = 0; true; ++v) {
                if(v >= 3) {
                    if(v3 != 3) {
                        dfzk1 = dfzk.c;
                    }
                    dfzk6 = dfzk1;
                    break;
                }
                dfzk dfzk4 = arr_dfzk[v];
                dfzk dfzk5 = dfzk.b;
                if(dfzk4 == dfzk5) {
                    dfzk6 = dfzk5;
                    break;
                }
                if(dfzk4 == dfzk1) {
                    ++v3;
                }
            }
            cunf0.b().k("Received local result %s, remote result %s, and remote certificate result %s. Combined, we settled on %s.", dfzk2, dcjn1.name(), dfzk0, dfzk6);
            return dfzk6;
        }
        dcvz.a.b().h("No endpoint id or connection tied to %s.", shareTarget0);
        return dfzk.b;
    }

    final dgap ag(ShareTarget shareTarget0) {
        return shareTarget0.f ? this.ad(shareTarget0).b : this.ae(shareTarget0).c;
    }

    public final gzat ah() {
        return this.w.h;
    }

    public final File ai(long v) {
        cuwu cuwu0 = this.l.g(v);
        if(cuwu0 == null) {
            dcvz.a.e().h("Failed to update the location of %s. No payload found.", Long.valueOf(v));
            return null;
        }
        cuws cuws0 = cuwu0.l;
        if(cuws0 == null) {
            dcvz.a.e().h("Failed to update the location of %s. No file found.", Long.valueOf(v));
            return null;
        }
        File file0 = cuws0.a;
        if(file0 == null) {
            dcvz.a.e().h("Cannot move attachment %s due to failure to get the Java file.", Long.valueOf(v));
            return null;
        }
        return file0;
    }

    public final File aj(boolean z) {
        return this.ah.b(z);
    }

    public final File ak() {
        File file0 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if(!hvqz.A() && !dcww.b(this.i).e()) {
            return file0;
        }
        File file1 = hrnt.k() ? new File(ccsb.a.b(file0, this.v.i())) : new File(file0, this.v.i());
        if(!file1.exists()) {
            file1.mkdir();
        }
        return file1;
    }

    public static String al(int v) {
        switch(v) {
            case 1: {
                return "OFFLINE";
            }
            case 2: {
                return "ONLINE";
            }
            case 3: {
                return "WIFI_ONLY";
            }
            default: {
                return a.f(v, "UNKNOWN[", "]");
            }
        }
    }

    public static String am(String s, dgap dgap0) {
        String s1 = dfzz.bY(dgap0);
        return s1 == null ? s : s1;
    }

    public static String an(dgag dgag0, dgap dgap0) {
        if(dgag0.a()) {
            return dizs.c(dgag0.b) ? null : new String(dgag0.b);
        }
        if(dgap0 != null) {
            return (dgap0.b.b & 1) == 0 ? null : dgap0.b.c;
        }
        return null;
    }

    public final String ao(ShareTarget shareTarget0) {
        String s = this.ap(shareTarget0);
        cunf cunf0 = dcvz.a;
        cunf cunf1 = cunf0.b();
        String s1 = shareTarget0.b;
        cunf1.i("Scanning for ShareTarget %s. Their last known EndpointID is %s", s1, s);
        Map map0 = this.l.i();
        if(map0.containsKey(s)) {
            cunf0.b().h("EndpointID is %s currently discovered.", s);
            return (String)Objects.requireNonNull(s);
        }
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            dgag dgag0 = dgag.c(((byte[])map$Entry0.getValue()));
            if(dgag0 != null) {
                ShareTarget shareTarget1 = this.V(((String)map$Entry0.getKey()), dgag0, false);
                if(shareTarget1 != null && shareTarget1.a == shareTarget0.a) {
                    cunf0.b().j("EndpointID %s is not discovered but ShareTarget %s was found with EndpointID %s.", s, s1, map$Entry0.getKey());
                    return (String)map$Entry0.getKey();
                }
            }
        }
        return null;
    }

    final String ap(ShareTarget shareTarget0) {
        dfum dfum0 = this.aa(shareTarget0);
        if(dfum0 == null) {
            if(shareTarget0.f) {
                return this.ad(shareTarget0).a;
            }
            String s = this.ae(shareTarget0).a;
            if(s == null && !shareTarget0.h) {
                cunf cunf0 = dcvz.a;
                cunf0.e().h("EndpointId is null from info= %s", this.ae(shareTarget0));
                for(Object object0: this.V.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    if(bata.b(map$Entry0.getValue(), shareTarget0)) {
                        String s1 = (String)map$Entry0.getKey();
                        cunf0.b().h("Get EndpointID from discoverSessionDeviceIdCache, %s", s1);
                        return s1;
                    }
                }
                dfui dfui0 = this.y.a(shareTarget0);
                if(dfui0 != null) {
                    cunf0.b().h("Get EndpointID from cachingManager, %s", dfui0.b);
                    return dfui0.b;
                }
            }
            return s;
        }
        return dfum0.c;
    }

    public final String aq() {
        return this.w.g;
    }

    final List ar(AppAttachment appAttachment0) {
        dfzc dfzc0 = (dfzc)this.c.get(appAttachment0);
        return dfzc0 == null ? ggna.a : dfzc0.g;
    }

    public final ConcurrentMap as(ShareTarget shareTarget0) {
        return this.ad(shareTarget0).p;
    }

    public final ConcurrentMap at(ShareTarget shareTarget0) {
        return this.ae(shareTarget0).B;
    }

    final ScheduledFuture au(Runnable runnable0, long v) {
        return ((cuuh)this.af).g(runnable0, v, TimeUnit.MILLISECONDS);
    }

    public final void av() {
        dcvz.a.a().p("Clear outgoing share target map.", new Object[0]);
        Map map0 = this.e;
        ArrayList arrayList0 = new ArrayList(map0.values());
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            cuwu[] arr_cuwu = ((dfzj)arrayList0.get(v1)).p;
            for(int v2 = 0; v2 < arr_cuwu.length; ++v2) {
                arr_cuwu[v2].i();
            }
        }
        map0.clear();
        this.aI();
        this.al.clear();
        this.M.clear();
        this.L.clear();
        this.N.clear();
        this.O.clear();
    }

    public static void aw(cuwu cuwu0) {
        if(cuwu0 != null) {
            cuws cuws0 = cuwu0.l;
            if(cuws0 != null) {
                File file0 = cuws0.a;
                if(file0 != null) {
                    file0.delete();
                }
            }
        }
    }

    public final void ax(Attachment attachment0) {
        if(attachment0.i()) {
            List list0 = this.ar(((AppAttachment)attachment0));
            if(list0.isEmpty()) {
                dcvz.a.e().h("Failed to retrieve payloads for: %s", attachment0);
                return;
            }
            for(Object object0: list0) {
                dfzz.aw(this.l.g(((Long)object0).longValue()));
            }
            return;
        }
        long v = this.O(attachment0);
        if(v == -1L) {
            dcvz.a.e().h("Failed to retrieve payload for: %s", attachment0);
            return;
        }
        dfzz.aw(this.l.g(v));
    }

    public final void ay(Set set0) {
        djad.n(this.aj(false));
        if(!set0.isEmpty()) {
            for(Object object0: set0) {
                String s = (String)object0;
                File[] arr_file = cuud.d().listFiles(new dfwm(s));
                if(arr_file != null) {
                    for(int v = 0; v < arr_file.length; ++v) {
                        File file0 = arr_file[v];
                        if(file0.isDirectory()) {
                            dcvz.a.b().h("Remove parentFolder(%s)", s);
                            djad.n(file0);
                        }
                    }
                }
            }
        }
    }

    public final void az(ShareTarget shareTarget0, int v) {
        gyzg gyzg0;
        dciy dciy0;
        dfum dfum0 = this.aa(shareTarget0);
        if(dfum0 == null) {
            dcvz.a.e().p("Fail invoked for unknown share target", new Object[0]);
            return;
        }
        cunf cunf0 = dcvz.a;
        Objects.requireNonNull(dfum0);
        dfum0.b(new dfxl(this, cumn.d(cunf0, new dfxb(dfum0), hvqs.K(), this.g), shareTarget0));
        switch(v) {
            case 1010: {
                dciy0 = dciy.f;
                gyzg0 = gyzg.x;
                break;
            }
            case 0x3F5: {
                dciy0 = dciy.d;
                gyzg0 = gyzg.y;
                break;
            }
            case 0x3F6: {
                dciy0 = dciy.e;
                gyzg0 = gyzg.z;
                break;
            }
            default: {
                dciy0 = dciy.a;
                gyzg0 = gyzg.a;
            }
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dciz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dciz)hftp0.b_message).c = dciy0.g;
        ((dciz)hftp0.b_message).b |= 1;
        dciz dciz0 = (dciz)hftp0.N_build();
        try {
            dfzz.bo(dfum0, dciz0);
            cunf0.b().h("Successfully wrote a %s response frame", dciy0.name());
        }
        catch(IOException iOException0) {
            dcvz.a.e().f(iOException0).h("Failed to write the %s response frame", dciy0.name());
        }
        dcnp dcnp0 = this.Y(shareTarget0);
        if(dcnp0 != null) {
            dcnp0.e(shareTarget0, new dcnn(v).a());
            dfzz.bN(new dfxm(this, gyzg0, shareTarget0));
        }
    }

    @Override  // dftm
    public int b(ShareTarget shareTarget0) {
        return this.bS("cancel", () -> {
            dcnp dcnp0 = this.Y(shareTarget0);
            if(dcnp0 == null) {
                dcvz.a.e().h("Cannot cancel. No transfer update callback for %s", shareTarget0.b);
                return 0x8AB7;
            }
            dcnp0.e(shareTarget0, new dcnn(0x3FD).a());
            boolean z1 = shareTarget0.f;
            if(z1) {
                this.ad(shareTarget0).g = true;
            }
            else {
                this.ae(shareTarget0).j = true;
            }
            this.bd(shareTarget0, true);
            cunf cunf0 = dcvz.a;
            cunf0.b().h("%s payload transfer has been canceled.", (z1 ? "Incoming" : "Outgoing"));
            if(z1 && djbr.u(shareTarget0.e())) {
                AppAttachment appAttachment0 = (AppAttachment)shareTarget0.d().get(0);
                if(appAttachment0.i) {
                    String[] arr_s = appAttachment0.c;
                    AppInfo appInfo0 = dizi.a(appAttachment0);
                    if(appInfo0 != null && appInfo0.e == 1 && arr_s != null) {
                        for(int v = 0; v < arr_s.length; ++v) {
                            String s = arr_s[v];
                            (hrnt.i() ? new File(ccsb.a.a(s)) : new File(s)).delete();
                        }
                    }
                }
            }
            int v1 = 1009;
            if(this.N.remove(shareTarget0)) {
                dcnp0.e(shareTarget0, new dcnn(1009).a());
                this.aH(shareTarget0);
                this.aC();
                cunf0.b().h("Cancelling ShareTarget %s. ShareTarget was queued. Ejecting ShareTarget from queue.", shareTarget0.b);
                return 0;
            }
            dfzu dfzu0 = (dfzu)this.W.get(Long.valueOf(shareTarget0.a));
            if(dfzu0 != null) {
                dfzu0.a.a();
                dcnp0.e(shareTarget0, new dcnn(1009).a());
                this.aH(shareTarget0);
                cunf0.b().h("Cancelling ShareTarget %s. ShareTarget was scanning for the remote device. Cancelling scan.", shareTarget0.b);
                return 0;
            }
            dfum dfum0 = this.aa(shareTarget0);
            String s1 = this.ap(shareTarget0);
            if(dfum0 == null) {
                String s2 = (String)Objects.requireNonNull(s1);
                this.l.k(s2);
                dcnp0.e(shareTarget0, new dcnn(1009).a());
                this.aH(shareTarget0);
                cunf0.b().h("Cancelling ShareTarget %s. ShareTarget making a connection request. Cancelling request.", shareTarget0.b);
                return 0;
            }
            if(hvrc.a.b().z()) {
                for(Object object0: shareTarget0.e()) {
                    Attachment attachment0 = (Attachment)object0;
                    if(hvqz.L() && attachment0.k()) {
                        ((StreamAttachment)attachment0).o();
                    }
                    else {
                        long v2 = this.O(attachment0);
                        if(v2 == -1L) {
                            continue;
                        }
                        this.l.N(v2);
                    }
                }
            }
            if(true) {
                cunf0.b().h("Cancelling ShareTarget %s. Transfer is in progress. Sending a cancel request to the remote side.", shareTarget0.b);
                gmcu gmcu0 = new gmcu();
                dfum0.b(new dfws(this, shareTarget0, cumn.d(cunf0, new dfwr(dfum0, gmcu0), hvqs.m(), this.g), gmcu0));
                try {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dcjh.a).v_newBuilder();
                    dcjg dcjg0 = dcjg.b;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((dcjh)hftp0.b_message).c = dcjg0.c;
                    ((dcjh)hftp0.b_message).b |= 1;
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dcjy.a).v_newBuilder();
                    dcjx dcjx0 = dcjx.g;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((dcjy)hftp1.b_message).c = dcjx0.i;
                    ((dcjy)hftp1.b_message).b |= 1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dcjh dcjh0 = (dcjh)hftp0.b_message;
                    dcjy dcjy0 = (dcjy)hftp1.N_build();
                    dcjy0.getClass();
                    dcjh0.d = dcjy0;
                    dcjh0.b |= 2;
                    dfum0.c(((dcjh)hftp0.N_build()).toBytesArray());
                    cunf0.b().p("Successfully wrote a cancel frame", new Object[0]);
                }
                catch(IOException iOException0) {
                    dcvz.a.e().f(iOException0).p("Failed to write the cancel frame", new Object[0]);
                }
            }
            else {
                dfum0.a();
                dcvz.a.b().h("Cancelling ShareTarget %s. Transfer is in progress. Received a cencel request and responding by closing the connection.", shareTarget0.b);
            }
            if(!true) {
                v1 = 0x3FA;
            }
            dcnp0.e(shareTarget0, new dcnn(v1).a());
            this.aH(shareTarget0);
            return 0;
        });
    }

    public final boolean bA() {
        return this.n != null;
    }

    public final boolean bB() {
        return !this.bw();
    }

    public final boolean bC() {
        return this.S != null;
    }

    public final boolean bD(ShareTarget shareTarget0) {
        long v = System.currentTimeMillis() - this.X(shareTarget0).h;
        dcvz.a.a().h("Reading response frame timeout in %s milliseconds.", Long.valueOf(v));
        return hvqs.am() - 500L < v;
    }

    public final boolean bE(ShareTarget shareTarget0) {
        return this.W.containsKey(Long.valueOf(shareTarget0.a));
    }

    public final boolean bF() {
        if(hvqz.j()) {
            long v = System.currentTimeMillis();
            long v1 = hvqs.ad();
            return !dizr.g(this.i) || !djbz.h(this.i) || this.Z.get() > 0L && v < this.Z.get() + v1 || this.aa.get() > 0L && v < this.aa.get() + v1;
        }
        return false;
    }

    public final boolean bG(FileAttachment fileAttachment0, ShareTarget shareTarget0) {
        cunf cunf0 = dcvz.a;
        cunf0.b().h("Updating attachment %s.", fileAttachment0);
        cuwu cuwu0 = this.T(fileAttachment0);
        if(cuwu0 == null) {
            cunf0.e().h("Failed to update the location of %s. No payload found.", fileAttachment0);
            return false;
        }
        cuws cuws0 = cuwu0.l;
        if(cuws0 == null) {
            cunf0.e().h("Failed to update the location of %s. No file found.", fileAttachment0);
            return false;
        }
        File file0 = cuws0.a;
        if(file0 == null) {
            cunf0.e().h("Cannot move attachment %s due to failure to get the Java file.", fileAttachment0);
            return false;
        }
        Uri uri0 = this.bU(shareTarget0, fileAttachment0, gged_interceptors.l(file0), this.bX(fileAttachment0, file0));
        if(uri0 == null) {
            return false;
        }
        dbyq dbyq0 = fileAttachment0.e();
        dbyq0.b = uri0;
        FileAttachment fileAttachment1 = dbyq0.a();
        shareTarget0.s(fileAttachment0, fileAttachment1);
        this.aX(fileAttachment1, uri0);
        return true;
    }

    public final byte[] bH(int v, String s, byte[] arr_b, int v1, dcpv dcpv0) {
        dgaq dgaq0 = this.t.e(dcpv0);
        byte[] arr_b1 = dgag.d(new dgag(1, dgaq0.b, dgaq0.a, v, (s == null ? null : s.getBytes()), arr_b, v1));
        dcvz.a.b().h("Created endpointInfo: %s", dizs.b(arr_b1));
        return arr_b1;
    }

    public final byte[] bI(Attachment attachment0) {
        cuwu cuwu0 = this.T(attachment0);
        if(cuwu0 == null) {
            dcvz.a.e().h("Failed to receive text body of %s. No payload found.", attachment0);
            return null;
        }
        byte[] arr_b = cuwu0.k;
        if(dizs.c(arr_b)) {
            dcvz.a.e().h("Failed to receive text body of %s. Incoming bytes is empty.", attachment0);
            return null;
        }
        return arr_b;
    }

    static ShareTarget bJ(dfzz dfzz0, String s, dgag dgag0) {
        return dfzz0.V(s, dgag0, false);
    }

    static final byte[] bK(byte[] arr_b, byte[] arr_b1) {
        return dizs.d(arr_b, arr_b1, 6);
    }

    public static final cuwu bL(dfzx dfzx0) {
        cuwt cuwt0 = cuwt.a(((ParcelFileDescriptor)Objects.requireNonNull(dfzx0.b)));
        return new cuwu(cuwu.a(), 3, null, null, cuwt0);
    }

    public static final Uri bM(Context context0, File file0) {
        return jwg.a(context0, "com.google.android.gms.fileprovider", file0);
    }

    static final void bN(Runnable runnable0) {
        cuui.d().execute(runnable0);
    }

    final void bO(ShareTarget shareTarget0) {
        this.ae(shareTarget0).k = true;
    }

    public static int bP(int v) {
        if(v != 0) {
            switch(v) {
                case 1: {
                    return 3;
                }
                case 2: {
                    return 4;
                }
                default: {
                    return 1;
                }
            }
        }
        return 2;
    }

    public final void bQ(ShareTarget shareTarget0, int v) {
        dcou dcou0 = dcpt.B(this.C, v, shareTarget0, this.w.b(), this.t.a(), null);
        this.w.i(dcou0);
    }

    public final void bR(ShareTarget shareTarget0, int v) {
        dfzj dfzj0 = this.ae(shareTarget0);
        long v1 = this.P(shareTarget0);
        int v2 = this.L(shareTarget0);
        int v3 = this.K();
        long v4 = dfzj0.x <= 0L ? 0L : System.currentTimeMillis() - dfzj0.x;
        Intent intent0 = this.P;
        long v5 = this.w.c();
        long v6 = this.P(shareTarget0);
        int v7 = this.t.a();
        this.w.i(dcpt.F(v1, v, shareTarget0, v2, v3, v4, this.aq(), dcpt.w(this.i, this.ah(), intent0, v5, v6, v7)));
    }

    private final int bS(String s, Callable callable0) {
        return cuuc.b(s, ((cuuf)this.af).e(callable0), hvqs.r());
    }

    private final Uri bT(File file0) {
        return dfzz.bM(this.i, file0);
    }

    private final Uri bU(ShareTarget shareTarget0, FileAttachment fileAttachment0, gged_interceptors gged0, File file0) {
        try {
            if(gged0.size() != 1) {
                long v1 = fileAttachment0.c;
                if(v1 >= hvqs.aF()) {
                    dcnp dcnp0 = this.Y(shareTarget0);
                    if(dcnp0 != null) {
                        dcvz.a.b().h("Entering the \'Verifying\' state when writing file to media store because file size %s (byte) is large and it may take time to move it into its final location when combining previous received files.", Long.valueOf(v1));
                        this.aM(dcnp0, shareTarget0);
                    }
                }
                djad.k(gged0, file0);
            }
            else if(!djad.u(((File)gged0.get(0)), file0)) {
                cunf cunf0 = dcvz.a;
                cunf0.b().p("Rename file failed, try to copy.", new Object[0]);
                long v2 = fileAttachment0.c;
                if(v2 >= hvqs.aF()) {
                    dcnp dcnp1 = this.Y(shareTarget0);
                    if(dcnp1 != null) {
                        cunf0.b().h("Entering the \'Verifying\' state when writing file to public directory because file size %s (byte) is large and it may take time to move it into its final location.", Long.valueOf(v2));
                        this.aM(dcnp1, shareTarget0);
                    }
                }
                djad.p(((File)gged0.get(0)), file0);
            }
        }
        catch(IOException iOException0) {
            dcvz.a.e().f(iOException0).p("Failed to move file.", new Object[0]);
            return null;
        }
        finally {
            djbh.k(this.i, fileAttachment0.j);
        }
        return this.S(shareTarget0, fileAttachment0, file0);
    }

    private final TransferMetadata bV(ShareTarget shareTarget0) {
        String s = shareTarget0.f ? this.ad(shareTarget0).e : this.ae(shareTarget0).b;
        if(s == null) {
            return new dcnn(1003).a();
        }
        dcnn dcnn0 = new dcnn(1003);
        dcnn0.c = s;
        return dcnn0.a();
    }

    private final dfzh bW(ShareTarget shareTarget0, dfum dfum0, dcjx dcjx0) {
        return this.ac(shareTarget0, dfum0, dcjx0, hvqs.al());
    }

    private final File bX(FileAttachment fileAttachment0, File file0) {
        File file1 = this.ak();
        String s = fileAttachment0.h;
        if(!TextUtils.isEmpty(s)) {
            file1 = hrnt.k() ? new File(ccsb.a.b(file1, s)) : new File(file1, s);
        }
        if(!file1.exists() || !file1.isDirectory()) {
            file1.mkdir();
        }
        File file2 = hrnt.k() ? new File(ccsb.a.b(file1, fileAttachment0.a)) : new File(file1, fileAttachment0.a);
        if(file0 != null && file0.getPath().equals(file2.getPath())) {
            String s1 = djad.h(file0.getPath());
            if(djad.t(fileAttachment0.a, s1)) {
                return hrnt.k() ? new File(ccsb.a.a(file0.getPath())) : new File(file0.getPath());
            }
        }
        return cuua.c(file2);
    }

    private static String bY(dgap dgap0) {
        if(dgap0 != null) {
            dbwr dbwr0 = dgap0.b;
            if((dbwr0.b & 8) == 0) {
                return (dgap0.a.b & 1) == 0 ? null : bboy.e(dgap0.a.c.toByteArray());
            }
            return String.valueOf(Arrays.hashCode(new Object[]{dbwr0.f}));
        }
        return null;
    }

    private final void bZ(ShareTarget shareTarget0) {
        if(!shareTarget0.f) {
            dfzj dfzj0 = this.ae(shareTarget0);
            cuwu[] arr_cuwu = dfzj0.p;
            for(int v = 0; v < arr_cuwu.length; ++v) {
                arr_cuwu[v].i();
            }
            if(hvqz.L()) {
                cuwu[] arr_cuwu1 = dfzj0.s;
                for(int v1 = 0; v1 < arr_cuwu1.length; ++v1) {
                    arr_cuwu1[v1].i();
                }
            }
            if(dfzj0.b()) {
                if(this.bA()) {
                    this.y.l(shareTarget0);
                }
                else {
                    this.y.j(shareTarget0);
                }
            }
            dfzj0.b = null;
            dfzj0.f = false;
            dfzj0.g.set(false);
            dfzj0.k = false;
            dfzj0.l = false;
            dfzj0.m = false;
            dfzj0.o = new cuwu[0];
            dfzj0.p = new cuwu[0];
            dfzj0.q = new cuwu[0];
            dfzj0.r = new cuwu[0];
            dfzj0.u = 0.0f;
            dfzj0.B.clear();
            dfzj0.z = null;
            dfzj0.A = null;
            dfzj0.C = 0;
            this.M.remove(shareTarget0);
            this.L.remove(shareTarget0);
            this.N.remove(shareTarget0);
            if(shareTarget0.q()) {
                Queue queue0 = this.O;
                if(!queue0.contains(shareTarget0)) {
                    queue0.offer(shareTarget0);
                    this.aC();
                }
            }
        }
    }

    final void ba(ShareTarget shareTarget0, dfum dfum0) {
        if(shareTarget0.f) {
            this.ad(shareTarget0).c = dfum0;
            return;
        }
        this.ae(shareTarget0).d = dfum0;
    }

    public final void bb(ShareTarget shareTarget0, int v) {
        if(shareTarget0.f) {
            this.ad(shareTarget0).o = v;
            return;
        }
        this.ae(shareTarget0).w = v;
    }

    final void bc(ShareTarget shareTarget0, String s) {
        if(shareTarget0.f) {
            this.ad(shareTarget0).a = s;
            return;
        }
        this.ae(shareTarget0).a = s;
    }

    public final void bd(ShareTarget shareTarget0, boolean z) {
        if(shareTarget0.f) {
            this.ad(shareTarget0).k = z;
            return;
        }
        this.ae(shareTarget0).i.set(z);
    }

    public final void be(ShareTarget shareTarget0, boolean z) {
        this.ae(shareTarget0).g.set(z);
    }

    final void bf(ShareTarget shareTarget0, boolean z) {
        this.ae(shareTarget0).f = z;
    }

    public final void bg(ShareTarget shareTarget0, float f) {
        if(shareTarget0.f) {
            this.ad(shareTarget0).j = f;
            return;
        }
        this.ae(shareTarget0).u = f;
    }

    public final void bh(ShareTarget shareTarget0, TransferMetadata transferMetadata0) {
        if(shareTarget0.f) {
            this.ad(shareTarget0).i = transferMetadata0;
            return;
        }
        this.ae(shareTarget0).t = transferMetadata0;
    }

    public final void bi(ShareTarget shareTarget0, String s) {
        if(shareTarget0.f) {
            this.ad(shareTarget0).e = s;
            return;
        }
        this.ae(shareTarget0).b = s;
    }

    public final void bj() {
        dcpu dcpu0 = new dcpu();
        dcpu0.b = 2;
        dcpu0.a = 9;
        this.E(new dcpv(dcpu0));
        this.aj = 0;
        this.aV();
    }

    public final void bk(dfum dfum0, ShareTarget shareTarget0) {
        new bbln(9, new dfwc(this, dfum0, shareTarget0)).start();
    }

    public final void bl() {
        cutr.f(this.i, this.G);
    }

    public final void bm(ShareTarget shareTarget0) {
        if(shareTarget0.f) {
            dfzi dfzi0 = (dfzi)this.f.remove(shareTarget0);
            if(dfzi0 != null) {
                TransferMetadata transferMetadata0 = dfzi0.n;
                if(transferMetadata0 != null) {
                    dcnp dcnp0 = dfzi0.d;
                    if(dcnp0 != null) {
                        dcnp0.e(shareTarget0, transferMetadata0);
                    }
                    dcvz.a.b().p("Incoming ShareTarget has been cleaned up. Reported final transfer metadata.", new Object[0]);
                }
                this.l.j();
            }
        }
        else {
            dfzj dfzj0 = this.ae(shareTarget0);
            this.be(shareTarget0, false);
            this.ba(shareTarget0, null);
            TransferMetadata transferMetadata1 = dfzj0.A;
            dfzj0.A = null;
            if(transferMetadata1 == null) {
                TransferMetadata transferMetadata2 = this.X(shareTarget0);
                if(!transferMetadata2.e && transferMetadata2.a != 1001) {
                    TransferMetadata transferMetadata3 = new dcnn(1007).a();
                    this.bh(shareTarget0, transferMetadata3);
                    dcvz.a.b().p("Change to FAILED status when connection is closed", new Object[0]);
                    dcnp dcnp2 = this.Y(shareTarget0);
                    if(hvrc.a.b().H() && dcnp2 != null) {
                        dcnp2.e(shareTarget0, transferMetadata3);
                    }
                }
            }
            else {
                this.bh(shareTarget0, transferMetadata1);
                dcnp dcnp1 = this.Y(shareTarget0);
                if(dcnp1 != null) {
                    dcnp1.e(shareTarget0, transferMetadata1);
                }
                dcvz.a.b().p("Outgoing ShareTarget has been cleaned up. Reported final transfer metadata.", new Object[0]);
            }
            if(!this.O.contains(shareTarget0)) {
                this.bZ(shareTarget0);
            }
        }
        this.h.a();
    }

    public static void bn(dfum dfum0, dcjr dcjr0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dcjh.a).v_newBuilder();
        dcjg dcjg0 = dcjg.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dcjh)hftp0.b_message).c = dcjg0.c;
        ((dcjh)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dcjy.a).v_newBuilder();
        dcjx dcjx0 = dcjx.h;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((dcjy)hftv0).c = dcjx0.i;
        ((dcjy)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        dcjy dcjy0 = (dcjy)hftp1.b_message;
        dcjr0.getClass();
        dcjy0.h = dcjr0;
        dcjy0.b |= 0x40;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dcjh dcjh0 = (dcjh)hftp0.b_message;
        dcjy dcjy1 = (dcjy)hftp1.N_build();
        dcjy1.getClass();
        dcjh0.d = dcjy1;
        dcjh0.b |= 2;
        dfum0.c(((dcjh)hftp0.N_build()).toBytesArray());
    }

    public static void bo(dfum dfum0, dciz dciz0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dcjh.a).v_newBuilder();
        dcjg dcjg0 = dcjg.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dcjh)hftp0.b_message).c = dcjg0.c;
        ((dcjh)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dcjy.a).v_newBuilder();
        dcjx dcjx0 = dcjx.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((dcjy)hftv0).c = dcjx0.i;
        ((dcjy)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        dcjy dcjy0 = (dcjy)hftp1.b_message;
        dciz0.getClass();
        dcjy0.e = dciz0;
        dcjy0.b |= 4;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dcjh dcjh0 = (dcjh)hftp0.b_message;
        dcjy dcjy1 = (dcjy)hftp1.N_build();
        dcjy1.getClass();
        dcjh0.d = dcjy1;
        dcjh0.b |= 2;
        dfum0.c(((dcjh)hftp0.N_build()).toBytesArray());
    }

    public final boolean bp(ShareTarget shareTarget0) {
        if(this.cd(shareTarget0).length <= 0 && this.cf(shareTarget0).length <= 0 && this.cg(shareTarget0).length <= 0 && this.cc(shareTarget0).length <= 0 && this.ce(shareTarget0).length <= 0) {
            dcvz.a.e().p("There is no payload.", new Object[0]);
            return false;
        }
        boolean z = shareTarget0.d().isEmpty() || this.cc(shareTarget0).length > 0;
        return this.cd(shareTarget0).length == shareTarget0.f().size() && this.cf(shareTarget0).length == shareTarget0.i().size() && this.cg(shareTarget0).length == shareTarget0.j().size() && z && this.ce(shareTarget0).length == shareTarget0.g().size();
    }

    public final boolean bq(FileAttachment fileAttachment0, ShareTarget shareTarget0, File file0) {
        Context context0 = this.i;
        long v = fileAttachment0.j;
        gged_interceptors gged0 = djbh.a(context0, v);
        if(gged0 != null) {
            gged_interceptors gged1 = djas.b(this.aj(false), gged0);
            long v1 = djas.a(gged0, gged1);
            if(file0 != null) {
                v1 += file0.length();
                ArrayList arrayList0 = new ArrayList(gged1);
                arrayList0.add(file0);
                gged1 = gged_interceptors.i(arrayList0);
            }
            if(fileAttachment0.c != v1) {
                djas.d(context0, v, gged1);
                dcvz.a.e().p("Deleting partial files in Nearby Connections since they are incomplete.", new Object[0]);
                return false;
            }
            Uri uri0 = this.bU(shareTarget0, fileAttachment0, gged1, this.bX(fileAttachment0, file0));
            if(uri0 != null) {
                dbyq dbyq0 = fileAttachment0.e();
                dbyq0.b = uri0;
                FileAttachment fileAttachment1 = dbyq0.a();
                shareTarget0.s(fileAttachment0, fileAttachment1);
                this.aX(fileAttachment1, uri0);
                return true;
            }
        }
        return false;
    }

    public static boolean br(List list0, long v) {
        BigDecimal bigDecimal0 = BigDecimal.ZERO;
        for(Object object0: list0) {
            bigDecimal0 = bigDecimal0.add(new BigDecimal(((Attachment)object0).c()));
        }
        return bigDecimal0.compareTo(new BigDecimal(v)) >= 0;
    }

    public final boolean bs(ShareTarget shareTarget0) {
        return this.ad(shareTarget0).f;
    }

    public final boolean bt() {
        long v = hvqs.F() + hvqs.G();
        return ((long)(this.M.size() + this.L.size())) < v;
    }

    public final boolean bu() {
        return !this.L.isEmpty() || !this.M.isEmpty() || !this.N.isEmpty();
    }

    public final boolean bv() {
        return this.r != dftl.a;
    }

    public final boolean bw() {
        return hvqz.C() && this.p == dftl.a;
    }

    public final boolean bx(ShareTarget shareTarget0) {
        return shareTarget0.f ? this.ad(shareTarget0).k : this.ae(shareTarget0).i.get();
    }

    public final boolean by() {
        for(Object object0: this.L) {
            ShareTarget shareTarget0 = (ShareTarget)object0;
            if(this.ae(shareTarget0).f && !this.ae(shareTarget0).g.get()) {
                return true;
            }
        }
        return false;
    }

    public final boolean bz() {
        return this.Q == 1;
    }

    @Override  // dftm
    public int c(ShareTarget shareTarget0) {
        long v = this.C;
        long v1 = this.w.b();
        this.w.i(dcpt.D(3, v, this.bC(), v1, this.t.a()));
        return this.bS("deny", new dfxd(this, shareTarget0));
    }

    private final boolean ca(ShareTarget shareTarget0) {
        return shareTarget0.h && System.currentTimeMillis() - this.ai < hvqs.ap();
    }

    private static byte[] cb(byte b, byte[] arr_b) {
        byte[] arr_b1 = new byte[arr_b.length + 1];
        arr_b1[0] = b;
        System.arraycopy(arr_b, 0, arr_b1, 1, arr_b.length);
        return arr_b1;
    }

    private final cuwu[] cc(ShareTarget shareTarget0) {
        return this.ae(shareTarget0).r;
    }

    private final cuwu[] cd(ShareTarget shareTarget0) {
        return this.ae(shareTarget0).p;
    }

    private final cuwu[] ce(ShareTarget shareTarget0) {
        return this.ae(shareTarget0).s;
    }

    private final cuwu[] cf(ShareTarget shareTarget0) {
        return this.ae(shareTarget0).o;
    }

    private final cuwu[] cg(ShareTarget shareTarget0) {
        return this.ae(shareTarget0).q;
    }

    private final void ch(String s, int v) {
        if(this.bB()) {
            Set set0 = this.al;
            if(!set0.contains(s)) {
                long v1 = this.P == null ? -1L : this.P.getLongExtra("send_surface_start_time", -1L);
                dcpn dcpn0 = this.w;
                dcpr dcpr0 = new dcpr();
                dcpr0.d(s);
                dcpr0.i(this.A);
                dcpr0.c(SystemClock.elapsedRealtime() - this.ak);
                dcpr0.e(dcpn0.c());
                dcpr0.a = this.aq();
                Intent intent0 = this.P;
                long v2 = dcpn0.c();
                long v3 = this.A;
                int v4 = this.t.a();
                dcpr0.h(dcpt.w(this.i, this.ah(), intent0, v2, v3, v4));
                dcpr0.g((v1 < 0L || this.bw() ? -1L : SystemClock.elapsedRealtime() - v1));
                dcpr0.b(this.bw());
                dcpr0.f(SystemClock.elapsedRealtime() - this.K);
                dcpr0.b = v;
                dftl dftl0 = this.p;
                int v5 = 1;
                if(dftl0 != null) {
                    v5 = 2;
                    switch(dftl0.ordinal()) {
                        case 0: {
                            v5 = 3;
                            break;
                        }
                        case 1: {
                            v5 = 4;
                            break;
                        }
                        case 2: {
                            v5 = 5;
                            break;
                        }
                        case 3: {
                            break;
                        }
                        case 4: {
                            v5 = 6;
                            break;
                        }
                        default: {
                            throw new RuntimeException(null, null);
                        }
                    }
                }
                dcpr0.c = v5;
                dcpn0.i(dcpt.j(dcpr0.a()));
                set0.add(s);
            }
        }
    }

    private static final dfzk ci(dcjl dcjl0, byte[] arr_b, dbwu dbwu0) {
        if(dbwu0 == null) {
            dcvz.a.b().p("Unable to verify remote certificate. Failed to load a valid local certificate.", new Object[0]);
            return dfzk.c;
        }
        if(Arrays.equals(dcjl0.d.toByteArray(), dfzz.bK(arr_b, dbwu0.e.toByteArray()))) {
            dcvz.a.b().p("Successfully verified remote certificate.", new Object[0]);
            return dfzk.a;
        }
        dcvz.a.b().p("Unable to verify remote certificate.", new Object[0]);
        return dfzk.c;
    }

    @Override  // dftm
    public final int d(ContactFilter contactFilter0) {
        evqp evqp0 = new evqp();
        dfwf dfwf0 = new dfwf(this, evqp0, contactFilter0);
        this.af.execute(dfwf0);
        long v = hvqs.E();
        Integer integer0 = (Integer)cuuc.g("getContactsCount", evqp0.a, v);
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // dftm
    public final int e(Account account0) {
        dcpu dcpu0 = new dcpu();
        dcpu0.a = 6;
        dcpu0.b = 1;
        dcpv dcpv0 = new dcpv(dcpu0);
        evqp evqp0 = new evqp();
        dfvu dfvu0 = new dfvu(this, evqp0, account0, dcpv0);
        this.af.execute(dfvu0);
        long v = hvqs.r();
        cunk cunk0 = (cunk)cuuc.g("getMyDevices", evqp0.a, v);
        Object object0 = null;
        int v1 = 0;
        if(cunk0 == null) {
            dcvz.a.e().p("Timed out trying to get my device info.", new Object[0]);
        }
        else if(cunk0.d()) {
            object0 = (List)cunk0.c();
        }
        else {
            String s = String.format(Locale.US, "[%d]%s", ((int)cunk0.a().i), cunk0.a().j);
            dcvz.a.e().h("Failed to get my device info with status %s.", s);
        }
        cunf cunf0 = dcvz.a;
        cunf0.d().h("The user has %s devices", object0);
        if(object0 == null) {
            return -1;
        }
        hfuf hfuf0 = hvqs.aQ().b;
        hfuf hfuf1 = hvqs.aP().b;
        for(Object object1: ((List)object0)) {
            gzcj gzcj0 = (gzcj)object1;
            if(hfuf0.contains(Integer.valueOf((vyp.b(gzcj0.c) == null ? vyp.a : vyp.b(gzcj0.c)).B)) && hfuf1.contains(Integer.valueOf((vyn.b(gzcj0.b) == null ? vyn.a : vyn.b(gzcj0.b)).w))) {
                ++v1;
            }
        }
        cunf0.b().h("The user has %s devices that support Nearby Share", Integer.valueOf(v1));
        return v1;
    }

    @Override  // dftm
    public final int f(ShareTarget shareTarget0, long v, dbzg dbzg0) {
        Attachment attachment0 = dizi.c(shareTarget0.e(), v);
        if(attachment0 == null) {
            dcvz.a.e().p("Not found install attachment.", new Object[0]);
            return 13;
        }
        if(dizi.a(attachment0) == null) {
            dcvz.a.e().p("Not found install appInfo.", new Object[0]);
            return 13;
        }
        List list0 = new ArrayList();
        if(attachment0.i()) {
            list0 = Arrays.asList(((AppAttachment)attachment0).c);
        }
        else {
            String s = djad.f(this.i, ((FileAttachment)attachment0).d);
            list0.add((hrnt.i() ? new File(ccsb.a.b(this.ak(), s)) : new File(this.ak(), s)).getAbsolutePath());
            this.aR(shareTarget0);
        }
        if(list0.isEmpty()) {
            dcvz.a.e().h("%s\'s paths are null.", attachment0);
            return 13;
        }
        dfyk dfyk0 = new dfyk(this, dbzg0, shareTarget0, attachment0, list0);
        this.z.c(list0, dfyk0);
        return 0;
    }

    @Override  // dftm
    public int g(ShareTarget shareTarget0) {
        if(djbr.y(shareTarget0.e())) {
            AppInfo appInfo0 = dizi.a(((Attachment)shareTarget0.e().get(0)));
            if(appInfo0 != null && appInfo0.d == 3) {
                dcvz.a.b().p("App is installing, don\'t open again.", new Object[0]);
                return 0;
            }
        }
        List list0 = this.k(shareTarget0);
        if(list0.isEmpty()) {
            dcvz.a.e().p("Unable to open as there is no action.", new Object[0]);
            return 13;
        }
        ShareTargetAction shareTargetAction0 = (ShareTargetAction)gggq.l(list0, new dfxk(), ((ShareTargetAction)list0.get(0)));
        if(shareTargetAction0 == null) {
            dcvz.a.e().p("Unable to open as there is no default action.", new Object[0]);
            return 13;
        }
        PendingIntent pendingIntent0 = shareTargetAction0.c;
        if(pendingIntent0 != null) {
            try {
                if(Build.VERSION.SDK_INT >= 34) {
                    pendingIntent0.send(cjoy.a().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                }
                else {
                    pendingIntent0.send();
                }
                dcvz.a.b().h("Launched an Activity by opening ShareTarget %s\'s attachment(s)", shareTarget0);
                dcou dcou0 = dcpt.b(this.C, shareTarget0.e(), this.w.b(), this.t.a());
                this.w.i(dcou0);
                return 0;
            }
            catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
                dcvz.a.e().f(pendingIntent$CanceledException0).h("Failed to send pendingIntent of action %s", shareTargetAction0.a);
                return 13;
            }
        }
        return 0;
    }

    @Override  // dftm
    public final int h() {
        return 0;
    }

    @Override  // dftm
    public final int i(UpdateSelectedContactsParams updateSelectedContactsParams0) {
        return this.bS("updateSelectedContacts", new dfwq(this, updateSelectedContactsParams0));
    }

    @Override  // dftm
    public final QrCodeMetadata j() {
        gnlw.a();
        ECPoint eCPoint0 = ((gnjn)gmnb.h(gnje.a(gnjh.a, gnjf.a, gnjg.a, gnji.d)).i().d().a()).b;
        byte[] arr_b = gnqs.p(gnqp.a, gnqr.b, eCPoint0);
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b.length + 2);
        byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        byteBuffer0.putShort(0);
        byteBuffer0.put(arr_b);
        byte[] arr_b1 = byteBuffer0.array();
        dckd dckd0 = new dckd();
        dckd0.a = arr_b1;
        return dckd0.a();
    }

    @Override  // dftm
    public final List k(ShareTarget shareTarget0) {
        Intent intent4;
        Intent intent2;
        List list0 = shareTarget0.e();
        Intent intent0 = new Intent();
        intent0.addFlags(0x10000000);
        intent0.addFlags(0x8000);
        if(djbr.w(shareTarget0.e())) {
            long v = hvqs.r();
            List list1 = (List)cuuc.g("getTextAttachmentActions", djbr.o(this.i, shareTarget0, this.bz()), v);
            return list1 == null ? ggna.a : list1;
        }
        List list2 = new ArrayList();
        if(djbr.y(shareTarget0.e())) {
            Context context0 = this.i;
            list2.add(djbr.g(context0));
            Attachment attachment0 = (Attachment)shareTarget0.e().get(0);
            AppInfo appInfo0 = dizi.a(attachment0);
            if(appInfo0 == null) {
                return list2;
            }
            int v1 = appInfo0.d;
            if(v1 != 2) {
                switch(appInfo0.e) {
                    case 0: {
                        if(attachment0.h()) {
                            return list2;
                        }
                        list2.add(djbr.l(context0, true));
                        return list2;
                    }
                    case 1: {
                        if(v1 != 0) {
                            return list2;
                        }
                        list2.add(djbr.i(context0, shareTarget0, attachment0.b()));
                        return list2;
                    }
                    case 2: {
                        list2.add(djbr.k(context0, djaj.a(context0, appInfo0.a)));
                        return list2;
                    }
                    default: {
                        return list2;
                    }
                }
            }
            list2.add(djbr.k(context0, djaj.a(context0, appInfo0.a)));
            return list2;
        }
        String s = shareTarget0.e.getString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE");
        if(s != null) {
            try {
                this.j.getPackageInfo(s, 0);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                dcvz.a.b().p("Required package is missing on receiver device.", new Object[0]);
                Intent intent1 = djaj.c(intent0, s);
                list2.add(djbr.j(this.i, intent1));
                IntentFilter intentFilter0 = new IntentFilter();
                intentFilter0.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter0.addDataScheme("package");
                NearbySharingProvider.11 nearbySharingProvider$110 = new NearbySharingProvider.11(this, s, shareTarget0);
                this.i.registerReceiver(nearbySharingProvider$110, intentFilter0);
                this.au(new dfxq(this, nearbySharingProvider$110, s), hvqs.ac());
                dcvz.a.b().h("Waiting for package %s to be installed", s);
                return list2;
            }
            intent0.setPackage(s);
            dcvz.a.b().p("Required package is installed on receiver device.", new Object[0]);
        }
        if(djbr.v(shareTarget0.e())) {
            if(list0.size() > 1) {
                List list3 = dizi.k(list0, new int[]{1, 2});
                if(list3.size() != list0.size()) {
                    list2.add(djbr.l(this.i, true));
                    return list2;
                }
                PackageManager packageManager0 = this.j;
                if(list3.size() <= ((int)hvqs.T())) {
                    if(djbm.g()) {
                        intent2 = new Intent(intent0);
                        intent2.setClassName("com.sec.android.gallery3d", "com.sec.android.gallery3d.app.GalleryActivity");
                        intent2.setAction("android.intent.action.VIEW");
                        ArrayList arrayList0 = new ArrayList();
                        ArrayList arrayList1 = new ArrayList();
                        for(Object object0: list3) {
                            FileAttachment fileAttachment0 = (FileAttachment)object0;
                            Uri uri0 = this.Q(fileAttachment0);
                            if(uri0 != null) {
                                arrayList0.add(uri0);
                                if(fileAttachment0.b == 2) {
                                    arrayList1.add(uri0);
                                }
                            }
                        }
                        intent2.putParcelableArrayListExtra("uriListData", arrayList0);
                        intent2.putExtra("useUriList", true);
                        intent2.putExtra("KEY_ITEM_POSITION", 0);
                        intent2.setDataAndType(((Uri)arrayList0.get(0)), "image/*");
                        if(!arrayList1.isEmpty()) {
                            Intent intent3 = new Intent("android.intent.action.VIEW");
                            intent3.setType("video/*");
                            for(Object object1: packageManager0.queryIntentActivities(intent3, 0x20000)) {
                                ActivityInfo activityInfo0 = ((ResolveInfo)object1).activityInfo;
                                int v2 = arrayList1.size();
                                for(int v3 = 0; v3 < v2; ++v3) {
                                    Uri uri1 = (Uri)arrayList1.get(v3);
                                    this.i.grantUriPermission(activityInfo0.applicationInfo.packageName, uri1, 3);
                                    dcvz.a.b().i("Granted package %s with view permission to uri %s", activityInfo0.applicationInfo.packageName, uri1);
                                }
                            }
                        }
                        ComponentName componentName0 = intent2.resolveActivity(packageManager0);
                        if(componentName0 == null) {
                            dcvz.a.b().p("Failed to find an intent to view multiple media files.", new Object[0]);
                            intent2 = null;
                        }
                        else {
                            String s1 = componentName0.getPackageName();
                            int v4 = arrayList0.size();
                            for(int v5 = 0; v5 < v4; ++v5) {
                                Uri uri2 = (Uri)arrayList0.get(v5);
                                this.i.grantUriPermission(s1, uri2, 3);
                            }
                        }
                    }
                    else {
                        intent2 = null;
                    }
                    intent4 = intent2 == null ? null : intent2;
                }
                else {
                    intent4 = null;
                }
                if(intent4 == null) {
                    list2.add(djbr.l(this.i, true));
                    return list2;
                }
                Context context1 = this.i;
                list2.add(djbr.j(context1, intent4));
                list2.add(djbr.l(context1, false));
                if(this.bz() && dizi.n(list3, new int[]{true})) {
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object2: list3) {
                        Uri uri3 = ((FileAttachment)object2).d;
                        if(uri3 != null) {
                            arrayList2.add(uri3.toString());
                        }
                    }
                    if(!arrayList2.isEmpty()) {
                        list2.add(djbr.m(context1, arrayList2));
                        return list2;
                    }
                }
            }
            else {
                FileAttachment fileAttachment1 = (FileAttachment)list0.get(0);
                Uri uri4 = this.Q(fileAttachment1);
                if(uri4 == null) {
                    dcvz.a.e().p("Failed to open file attachment with unknown destination.", new Object[0]);
                }
                else {
                    intent0.addFlags(1);
                    intent0.setDataAndType(uri4, fileAttachment1.f);
                    intent0.setAction("android.intent.action.VIEW");
                    if(djaj.h(this.j.queryIntentActivities(intent0, 0x10000)).isEmpty()) {
                        intent0.setDataAndType(null, null);
                        djaj.k(this.i, intent0);
                    }
                }
                if("android.intent.action.VIEW".equals(intent0.getAction())) {
                    list2.add(djbr.j(this.i, intent0));
                    list2.add(djbr.l(this.i, false));
                }
                else {
                    list2.add(djbr.l(this.i, true));
                }
                if(this.bz()) {
                    Uri uri5 = fileAttachment1.d;
                    if(uri5 != null) {
                        Context context2 = this.i;
                        if(ddnb.b(context2, uri5).startsWith("image")) {
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(uri5.toString());
                            list2.add(djbr.m(context2, arrayList3));
                        }
                    }
                }
            }
            return list2;
        }
        if(djbr.A(shareTarget0)) {
            WifiCredentialsAttachment wifiCredentialsAttachment0 = (WifiCredentialsAttachment)shareTarget0.j().get(0);
            list2.add(djbr.h(this.i, wifiCredentialsAttachment0));
            return list2;
        }
        this.aR(shareTarget0);
        return list2;
    }

    @Override  // dftm
    public final List l(int v, int v1, ContactFilter contactFilter0) {
        evqp evqp0 = new evqp();
        gmbu.t(this.ae.c(v, v1, contactFilter0, this.af), new dfyn(this, evqp0), this.af);
        long v2 = hvqs.E();
        List list0 = (List)cuuc.g("getContacts", evqp0.a, v2);
        return list0 == null ? ggna.a : list0;
    }

    @Override  // dftm
    public final List m(Account account0) {
        dfyd dfyd0 = new dfyd(this, account0);
        List list0 = (List)cuuc.g("getReachablePhoneNumbers", evrg.a(this.af, dfyd0), hvqs.r());
        List list1 = this.k.a();
        if(list1 == null) {
            dcvz.a.b().p("No verified phone number is retrieved. Return null.", new Object[0]);
            return null;
        }
        if(list0 == null) {
            dcvz.a.b().p("No reachable phone number is retrieved. Return empty list.", new Object[0]);
            return ggna.a;
        }
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            String s = (String)object0;
            if(list1.contains(s)) {
                ggdy0.i(s);
            }
        }
        List list2 = ggdy0.h();
        if(list2.isEmpty()) {
            dcvz.a.b().p("No verified phone number is reachable, return empty list.", new Object[0]);
        }
        return list2;
    }

    @Override  // dftm
    public final Map n(int v) {
        gmcu gmcu0 = new gmcu();
        this.aU(new dfxu(this, v, gmcu0));
        Map map0 = (Map)cuuc.h("getShareTargets", gmcu0, hvqs.r());
        return map0 == null ? new bxd() : map0;
    }

    @Override  // dftm
    public final void o(PrintWriter printWriter0) {
        dbxx dbxx0;
        printWriter0.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider"));
        printWriter0.write("discoverySessionDeviceIdCache:\n");
        for(Object object0: this.V.entrySet()) {
            printWriter0.write(String.format("  Device ID: %s\n", ((Map.Entry)object0).getKey()));
            printWriter0.write(String.format("  ShareTarget: %s\n", ((Map.Entry)object0).getValue()));
        }
        printWriter0.write("longTermIdCache:\n");
        for(Object object1: ((gfwl)this.U).a.entrySet()) {
            printWriter0.write(String.format("  Device ID: %s\n", ((Map.Entry)object1).getKey()));
            printWriter0.write(String.format("  ShareTarget: %s\n", ((Map.Entry)object1).getValue()));
        }
        printWriter0.write("incomingShareTargetInfoMap:\n");
        for(Object object2: this.f.entrySet()) {
            printWriter0.write(String.format("  ShareTarget: %s\n", ((Map.Entry)object2).getKey()));
            printWriter0.write(String.format("  %s\n", ((Map.Entry)object2).getValue()));
        }
        printWriter0.write("outgoingShareTargetInfoMap:\n");
        for(Object object3: this.e.entrySet()) {
            printWriter0.write(String.format("  ShareTarget: %s\n", ((Map.Entry)object3).getKey()));
            printWriter0.write(String.format("  %s\n", ((Map.Entry)object3).getValue()));
        }
        printWriter0.write("attachmentInfoMap:\n");
        for(Object object4: this.c.entrySet()) {
            printWriter0.write(String.format("  Attachment: %s\n", ((Map.Entry)object4).getKey()));
            printWriter0.write(String.format("  %s\n", ((Map.Entry)object4).getValue()));
        }
        ((dgao)this.t).n().B(printWriter0);
        dftp dftp0 = this.ae;
        printWriter0.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.provider.connections.ContactBookManager"));
        Account account0 = dftp0.c.c();
        if(account0 == null) {
            printWriter0.write("  No account is logged in.\n");
        }
        else {
            try {
                dbxx0 = dftp0.a.c(account0);
            }
            catch(IOException unused_ex) {
                dbxx0 = dbxx.a;
            }
            printWriter0.write("  Contacts Count: " + dbxx0.c.size() + "\n");
            switch(dcpt.K()) {
                case 2: 
                case 3: {
                    printWriter0.write("  Contacts:\n");
                    cumk[] arr_cumk = {new cumk(5, "ID"), new cumk(30, "Display Name"), new cumk(15, "Type"), new cumk(30, "Value"), new cumk(30, "Last Checked Reachability")};
                    ArrayList arrayList0 = new ArrayList();
                    ArrayList arrayList1 = new ArrayList();
                    Collections.addAll(arrayList0, arr_cumk);
                    for(Object object5: dbxx0.c) {
                        Contact contact0 = dftp.b(((dbxv)object5));
                        String s = DateFormat.getDateTimeInstance().format(new Date(((dbxv)object5).k));
                        cuml.b(new Object[]{((long)contact0.a), contact0.c, ContactInfo.b(contact0.f.a), contact0.f.b, s}, arrayList1);
                    }
                    cuml.a(printWriter0, arrayList0, arrayList1);
                }
            }
        }
        if(hvqz.a.b().L()) {
            this.y.e(printWriter0);
        }
    }

    @Override  // dftm
    public final void p(dcpv dcpv0) {
        this.aU(new dfwk(this, dcpv0));
    }

    @Override  // dftm
    public final void q(Intent intent0) {
        if(intent0 == null) {
            return;
        }
        String s = intent0.getStringExtra("source_activity");
        if("com.google.android.gms.nearby.sharing.ReceiveSurfaceActivity".equals(s)) {
            dcvz.a.b().p("SourceActivity is ReceiveSurfaceActivity.", new Object[0]);
            return;
        }
        if(bata.b(s, "com.google.android.gms.nearby.sharing.ShareSheetActivity")) {
            this.P = intent0;
            this.Q = 0;
            dcvz.a.b().p("SourceActivity is ShareSheetActivity.", new Object[0]);
            return;
        }
        if(bata.b(s, "com.google.android.gms.nearby.sharing.RemoteCopyShareSheetActivity")) {
            switch(intent0.getIntExtra("send_surface_state", -1)) {
                case 5: 
                case 6: {
                    this.P = intent0;
                    this.Q = 1;
                    dcvz.a.b().p("SourceActivity is RemoteCopyShareSheetActivity.", new Object[0]);
                    return;
                }
                default: {
                    dcvz.a.e().p("Return due to source activity and sendSurface state not match.", new Object[0]);
                    return;
                }
            }
        }
        dcvz.a.e().i("Intent %s includes an invalid source activity: %s", intent0, s);
    }

    @Override  // dftm
    public final void r() {
        Objects.requireNonNull(this.ae);
        this.aU(new dfxg(this.ae));
    }

    @Override  // dftm
    public final void s() {
        gmcu gmcu0 = new gmcu();
        this.aU(new dfwd(this, gmcu0));
        try {
            gmcu0.v(hvqs.a.aT().cE(), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | TimeoutException exception0) {
            dcvz.a.b().f(exception0).p("NearbySharingProvider Failed to complete reset!", new Object[0]);
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            dcvz.a.b().f(interruptedException0).p("NearbySharingProvider Failed to complete reset!", new Object[0]);
        }
    }

    @Override  // dftm
    public final void t(String s) {
    }

    @Override  // dftm
    public final void u(int v) {
        this.t.g(v);
    }

    @Override  // dftm
    public void v(int v) {
        this.J = v;
        this.t.h(v);
        this.ai = System.currentTimeMillis();
    }

    @Override  // dftm
    public final void w() {
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        this.aU(new dfvq(this, countDownLatch0));
        try {
            countDownLatch0.await(hvqs.a.aT().cF(), TimeUnit.MILLISECONDS);
            dcvz.a.b().p("NearbySharingProvider has been shutdown", new Object[0]);
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            dcvz.a.b().f(interruptedException0).p("NearbySharingProvider Failed to complete shutdown!", new Object[0]);
        }
        cuui.h(this.af, "NearbySharingProviderExecutor");
    }

    @Override  // dftm
    public final void x(String s, dcnp dcnp0, dfso dfso0) {
        throw null;
    }

    @Override  // dftm
    public void y(String s, dcnp dcnp0, dfso dfso0, QrCodeMetadata qrCodeMetadata0) {
        this.aU(new dfwx(this, dfso0, qrCodeMetadata0, s, dcnp0));
    }

    @Override  // dftm
    public void z(dclv dclv0, dfsq dfsq0) {
        this.ak = SystemClock.elapsedRealtime();
        this.aU(new dfvv(this, dclv0, dfsq0));
    }
}


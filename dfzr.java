import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Messenger;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.StreamAttachment;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

public final class dfzr implements Runnable {
    public final dfzt a;
    public final long b;
    public final long c;
    public final dfvl d;

    public dfzr(dfzt dfzt0, long v, long v1, dfvl dfvl0) {
        this.a = dfzt0;
        this.b = v;
        this.c = v1;
        this.d = dfvl0;
    }

    @Override
    public final void run() {
        float f1;
        boolean z3;
        int v2;
        int v1;
        dfzt dfzt0 = this.a;
        long v = this.b;
        Long long0 = v;
        dfzs dfzs0 = (dfzs)dfzt0.g.get(long0);
        if(dfzs0 != null) {
            dfvl dfvl0 = this.d;
            dfzs0.b = this.c;
            if(hvqz.L()) {
                ShareTarget shareTarget0 = dfzt0.e;
                if(shareTarget0.g().isEmpty()) {
                    goto label_75;
                }
                else {
                    StreamAttachment streamAttachment0 = (StreamAttachment)shareTarget0.g().get(0);
                    dfzz dfzz0 = dfzt0.m;
                    dfzc dfzc0 = dfzz0.ab(streamAttachment0);
                    if(!dfzc0.c()) {
                        dcvz.a.e().h("Possible logic error... receiving payload with id %d but attachmentInfo not configured.", long0);
                        return;
                    }
                    if(dfzs0.c == dfvl.a && dfvl0 == dfvl.b) {
                        boolean z = shareTarget0.q();
                        boolean z1 = dfzt0.o(dfzc0.e);
                        boolean z2 = dfzt0.o(dfzc0.d);
                        batl.b(dfzc0.c());
                        if(dfzy.b(z, dfzc0, v)) {
                            batl.c(shareTarget0.g().size() == 1, "Called receiveStream() on a shareTarget that does not have exactly one stream attachment.");
                            cuwu cuwu0 = dfzz0.l.g(v);
                            if(cuwu0 == null) {
                                dcvz.a.e().h("Failed to receive stream body of %s. No payload found.", shareTarget0);
                                v1 = 0;
                            }
                            else {
                                cuwt cuwt0 = cuwu0.m;
                                if(cuwt0 == null) {
                                    dcvz.a.e().i("Incorrect payload type for %s. Expected a stream, got %s.", shareTarget0, cuwu0);
                                    v1 = 0;
                                }
                                else {
                                    ParcelFileDescriptor parcelFileDescriptor0 = cuwt0.a;
                                    if(parcelFileDescriptor0 == null) {
                                        dcvz.a.e().i("Conversion to parcel file descriptor failed for attachment %s from stream %s.", shareTarget0, cuwt0);
                                        v1 = 0;
                                    }
                                    else {
                                        dfzx dfzx0 = (dfzx)dfzz0.b.get(shareTarget0);
                                        if(dfzx0 == null) {
                                            cunf cunf0 = dcvz.a;
                                            cunf0.e().h("No stream attachment holder found for %s. Canceling...", shareTarget0);
                                            if(dfzz0.b(shareTarget0) != 0) {
                                                cunf0.e().h("Could not cancel stream transfer for %s!", shareTarget0);
                                            }
                                            v1 = 0;
                                        }
                                        else {
                                            dfzx0.c = parcelFileDescriptor0;
                                            v1 = 1;
                                        }
                                    }
                                }
                            }
                            v2 = v1;
                            z3 = true;
                        }
                        else {
                            z3 = false;
                            v2 = 0;
                        }
                        batl.b(dfzy.b(z, dfzc0, v) == z3);
                        if(dfzy.b(z, dfzc0, v) && v2 != 0 && dfzy.a(z, z1, z2) || (z ? z1 : z2) && !dfzy.a(z, z1, z2)) {
                            dfzx dfzx1 = (dfzx)dfzz0.b.remove(shareTarget0);
                            if(dfzx1 == null) {
                                cunf cunf1 = dcvz.a;
                                cunf1.e().h("No StreamAttachmentHolder for %s... canceling transfer", shareTarget0);
                                if(dfzz0.b(shareTarget0) != 0) {
                                    cunf1.e().h("Could not cancel stream transfer for %s!", shareTarget0);
                                    return;
                                }
                            }
                            else {
                                dcnh dcnh0 = streamAttachment0.n();
                                dcnh0.b = dfzx1.c;
                                dcnh0.c = dfzx1.a;
                                Handler handler0;
                                while((handler0 = dfzx1.d) == null) {
                                    try {
                                        Thread.sleep(40L);
                                    }
                                    catch(InterruptedException unused_ex) {
                                    }
                                }
                                dcnh0.d = new Messenger(handler0);
                                StreamAttachment streamAttachment1 = dcnh0.a();
                                dfzt0.e.p();
                                dfzt0.e.m(streamAttachment1);
                                TransferMetadata transferMetadata0 = new dcnn(0x3FB).a();
                                dfzt0.f.e(dfzt0.e, transferMetadata0);
                                goto label_75;
                            }
                        }
                        else {
                            goto label_75;
                        }
                    }
                    else {
                        goto label_75;
                    }
                }
            }
            else {
            label_75:
                dfzs0.c = dfvl0;
                cunf cunf2 = dcvz.a;
                cunf2.d().i("Payload %d has status %s", Long.valueOf(v), dfvl0);
                try {
                    if(dfzt0.n()) {
                        cunf2.b().p("All payloads are complete", new Object[0]);
                        gyzg gyzg0 = gyzg.b;
                        dfzt0.j(gyzg0);
                        ShareTarget shareTarget1 = dfzt0.e;
                        boolean z4 = shareTarget1.f;
                        if(z4 && ((long)shareTarget1.f().size()) >= hvqs.a.aT().cC()) {
                            cunf2.b().h("Entering the \'Verifying\' state because %s files is large and it may take time to move them into their final location.", Integer.valueOf(shareTarget1.f().size()));
                            dfzt0.m.aM(dfzt0.f, shareTarget1);
                        }
                        if(dfzt0.d()) {
                            dfzt0.i(dfvl.c);
                            int v3 = 1006;
                            if(z4) {
                                dfzz dfzz1 = dfzt0.m;
                                if(dfzz1.bz()) {
                                    if(shareTarget1.n) {
                                        Context context0 = dfzz1.i;
                                        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
                                        KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
                                        if(powerManager0 != null && keyguardManager0 != null && powerManager0.isInteractive() && !keyguardManager0.isKeyguardLocked() || !bbqa.c()) {
                                            if(!shareTarget1.i().isEmpty()) {
                                                TextAttachment textAttachment0 = (TextAttachment)shareTarget1.i().get(0);
                                                Attachment attachment0 = (Attachment)shareTarget1.i().get(0);
                                                dfzc dfzc1 = (dfzc)dfzz1.c.get(attachment0);
                                                String s = dfzc1 == null ? null : dfzc1.f;
                                                if(!TextUtils.isEmpty(s)) {
                                                    Intent intent0 = new Intent();
                                                    intent0.putExtra("android.intent.extra.TEXT", s);
                                                    intent0.putExtra("copy_paste_extra_need_toast", false);
                                                    intent0.putExtra("android.content.extra.IS_SENSITIVE", textAttachment0.g);
                                                    intent0.putExtra("android.content.extra.IS_REMOTE_DEVICE", shareTarget1.o == 1);
                                                    intent0.putExtra("android.content.extra.REMOTE_DEVICE_NAME", shareTarget1.b);
                                                    djbt.c(context0.getApplicationContext(), intent0);
                                                }
                                            }
                                            else if(!shareTarget1.f().isEmpty()) {
                                                ArrayList arrayList0 = new ArrayList();
                                                boolean z5 = false;
                                                for(Object object0: shareTarget1.f()) {
                                                    FileAttachment fileAttachment0 = (FileAttachment)object0;
                                                    Uri uri0 = fileAttachment0.d;
                                                    if(uri0 != null && ddnb.b(context0, uri0).startsWith("image")) {
                                                        arrayList0.add(uri0);
                                                        if(fileAttachment0.k) {
                                                            z5 = true;
                                                        }
                                                    }
                                                }
                                                djad.m(context0, arrayList0, z5, false, shareTarget1.o == 1, shareTarget1.b);
                                            }
                                            if(bbqa.c()) {
                                                v3 = 1020;
                                            }
                                        }
                                        else if(hvrc.v()) {
                                            cutr.d(context0.getApplicationContext(), djaj.b(shareTarget1, context0));
                                        }
                                        else {
                                            context0.getApplicationContext().sendBroadcast(djaj.b(shareTarget1, context0));
                                        }
                                    }
                                    dcnn dcnn0 = new dcnn(v3);
                                    dcnn0.i = 1;
                                    dcnn0.e(100.0f);
                                    TransferMetadata transferMetadata1 = dcnn0.a();
                                    dfzt0.f.e(shareTarget1, transferMetadata1);
                                    goto label_143;
                                }
                                goto label_139;
                            }
                            else {
                            label_139:
                                dcnn dcnn1 = new dcnn(1006);
                                dcnn1.e(100.0f);
                                TransferMetadata transferMetadata2 = dcnn1.a();
                                dfzt0.f.e(shareTarget1, transferMetadata2);
                            }
                        label_143:
                            if(z4) {
                                long v4 = dfzt0.m.C;
                                long v5 = dfzt0.m.w.b();
                                int v6 = dfzt0.m.t.a();
                                dcou dcou0 = dcpt.c(v4, gzaj.b, v5, v6);
                                dfzt0.m.w.i(dcou0);
                                return;
                            }
                            dfzt0.j(gyzg0);
                            return;
                        }
                        dfzt0.c();
                        dfzt0.i(dfvl.d);
                        TransferMetadata transferMetadata3 = new dcnn(1007).a();
                        dfzt0.f.e(shareTarget1, transferMetadata3);
                        return;
                    }
                    if(dfzt0.m()) {
                        cunf2.b().p("Payloads cancelled", new Object[0]);
                        dfzt0.b();
                        dfzt0.i(dfvl.e);
                        TransferMetadata transferMetadata4 = new dcnn(0x3FA).a();
                        dfzt0.f.e(dfzt0.e, transferMetadata4);
                        dfzt0.j(gyzg.c);
                        return;
                    }
                    if(!dfzt0.m()) {
                        for(Object object1: dfzt0.g.values()) {
                            dfvl dfvl1 = dfvl.d;
                            if(dfvl1.equals(((dfzs)object1).c)) {
                                cunf2.b().p("Payloads failed", new Object[0]);
                                dfzt0.c();
                                dfzt0.i(dfvl1);
                                TransferMetadata transferMetadata5 = new dcnn(1007).a();
                                dfzt0.f.e(dfzt0.e, transferMetadata5);
                                dfzt0.j((dfzt0.m.bF() ? gyzg.D : gyzg.d));
                                return;
                            }
                        }
                    }
                    dfzz dfzz2 = dfzt0.m;
                    ShareTarget shareTarget2 = dfzt0.e;
                    float f = dfzz2.I(shareTarget2);
                    if(((Attachment)shareTarget2.e().get(0)).m()) {
                        f1 = 50.0f;
                    }
                    else {
                        dfzt0.i = BigDecimal.ZERO;
                        for(Object object2: dfzt0.g.values()) {
                            dfzt0.i = dfzt0.i.add(new BigDecimal(Long.toString(((dfzs)object2).b + ((dfzs)object2).a)));
                        }
                        if(dfzt0.h.signum() > 0) {
                            f1 = dfzt0.e(shareTarget2, 0);
                        }
                        else {
                            cunf2.e().p("Total size of attachment is 0.", new Object[0]);
                            f1 = 100.0f;
                        }
                    }
                    long v7 = SystemClock.uptimeMillis();
                    if(dfzt0.j != ((int)(100.0f * f1)) && v7 - dfzt0.k >= hvqs.X() && f1 > f) {
                        dfzt0.j = (int)(100.0f * f1);
                        dfzt0.k = v7;
                        if(dfzz2.bz()) {
                            dcnn dcnn2 = new dcnn(1005);
                            dcnn2.g = shareTarget2.n;
                            dcnn2.i = 1;
                            dcnn2.e(f1);
                            dcnn2.c(dfzt0.h());
                            dcnn2.s = dfzt0.g();
                            dcnn2.q = dfzt0.f();
                            if(hvqz.ag()) {
                                dcnn2.m = dfzz2.M(shareTarget2);
                            }
                            TransferMetadata transferMetadata6 = dcnn2.a();
                            dfzt0.f.e(shareTarget2, transferMetadata6);
                        }
                        else {
                            dcnn dcnn3 = new dcnn(1005);
                            dcnn3.g = shareTarget2.n;
                            dcnn3.e(f1);
                            dcnn3.c(dfzt0.h());
                            dcnn3.s = dfzt0.g();
                            dcnn3.q = dfzt0.f();
                            if(hvqz.ag()) {
                                dcnn3.m = dfzz2.M(shareTarget2);
                            }
                            TransferMetadata transferMetadata7 = dcnn3.a();
                            dfzt0.f.e(shareTarget2, transferMetadata7);
                        }
                        if(v7 - dfzt0.l >= hvqs.W()) {
                            dfzt0.l = v7;
                            Object[] arr_object = dfzz2.L.toArray();
                            for(int v8 = 0; v8 < arr_object.length; ++v8) {
                                ShareTarget shareTarget3 = (ShareTarget)arr_object[v8];
                                dcnp dcnp0 = dfzz2.Y(shareTarget3);
                                dfum dfum0 = dfzz2.aa(shareTarget3);
                                if(dcnp0 != null && dfum0 != null && dfzz2.X(shareTarget3).a == 1005) {
                                    float f2 = dfzt0.e(shareTarget3, v8 + 1);
                                    dcnn dcnn4 = new dcnn(1005);
                                    dcnn4.g = shareTarget2.n;
                                    dcnn4.e(f2);
                                    dcnp0.e(shareTarget3, dcnn4.a());
                                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dcjr.a).v_newBuilder();
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    dcjr dcjr0 = (dcjr)hftp0.b_message;
                                    dcjr0.b |= 1;
                                    dcjr0.c = f2;
                                    dfzz.bn(dfum0, ((dcjr)hftp0.N_build()));
                                    cunf2.b().h("Payloads are in faked progress at %s percent", Float.valueOf(f2));
                                }
                            }
                        }
                    }
                    return;
                }
                catch(IOException unused_ex) {
                    goto label_248;
                }
            }
        }
        return;
    label_248:
        dcvz.a.b().p("Transfer update is failure!", new Object[0]);
    }
}


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.nearby.sharing.AppAttachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.StreamAttachment;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider.17;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;

public final class dfxj implements Callable {
    public final dfzz a;
    public final ShareTarget b;
    public final dcnp c;

    public dfxj(dfzz dfzz0, ShareTarget shareTarget0, dcnp dcnp0) {
        this.a = dfzz0;
        this.b = shareTarget0;
        this.c = dcnp0;
    }

    @Override
    public final Object call() {
        cuwu cuwu0;
        dfzz dfzz0 = this.a;
        dfzz0.aD();
        if(hvqz.j() && dfzz0.I == null) {
            dfzz0.I = new NearbySharingProvider.17(dfzz0);
            BroadcastReceiver broadcastReceiver0 = dfzz0.I;
            IntentFilter intentFilter0 = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
            dfzz0.i.registerReceiver(broadcastReceiver0, intentFilter0);
        }
        ShareTarget shareTarget0 = this.b;
        dfzz0.ae(shareTarget0).v = dcpn.a();
        dcnp dcnp0 = dfzz0.Z(shareTarget0, this.c);
        dcnp0.e(shareTarget0, new dcnn(1001).a());
        if(!dfzz0.X(shareTarget0).e && dfzz0.bp(shareTarget0)) {
            dcvz.a.b().h("Skipping payload creation for ShareTarget %s. Payloads already created.", shareTarget0);
        }
        else {
            try {
                List list0 = shareTarget0.f();
                int v = list0.size();
                cuwu[] arr_cuwu = new cuwu[v];
                for(int v1 = 0; v1 < list0.size(); ++v1) {
                    FileAttachment fileAttachment0 = (FileAttachment)list0.get(v1);
                    Uri uri0 = fileAttachment0.d;
                    if(uri0 != null) {
                        if(hvqz.a.b().bc()) {
                            cuwu0 = cuwu.f(uri0, fileAttachment0.c);
                        }
                        else {
                            Context context0 = dfzz0.i;
                            ParcelFileDescriptor parcelFileDescriptor0 = cuqf.e(context0, uri0, cuua.b());
                            if(parcelFileDescriptor0 == null) {
                                AssetFileDescriptor assetFileDescriptor0 = cuqf.a(context0, uri0, cuua.b());
                                if(assetFileDescriptor0 == null) {
                                    throw new IOException(String.format("Failed to open file descriptor for uri \"%s\"", uri0));
                                }
                                parcelFileDescriptor0 = assetFileDescriptor0.getParcelFileDescriptor();
                            }
                            cuwu0 = cuwu.g(parcelFileDescriptor0, fileAttachment0.c);
                        }
                        arr_cuwu[v1] = cuwu0;
                        dfzz0.aY(fileAttachment0, cuwu0.i);
                    }
                }
                if(v > 0) {
                    dcvz.a.b().h("Created %d file payloads", Integer.valueOf(v));
                }
                dfzz0.ae(shareTarget0).p = arr_cuwu;
                List list1 = shareTarget0.i();
                int v2 = list1.size();
                cuwu[] arr_cuwu1 = new cuwu[v2];
                for(int v3 = 0; v3 < list1.size(); ++v3) {
                    TextAttachment textAttachment0 = (TextAttachment)list1.get(v3);
                    cuwu cuwu1 = cuwu.b(textAttachment0.a.getBytes());
                    arr_cuwu1[v3] = cuwu1;
                    dfzz0.aY(textAttachment0, cuwu1.i);
                }
                if(v2 > 0) {
                    dcvz.a.b().h("Created %d text payloads", Integer.valueOf(v2));
                }
                dfzz0.ae(shareTarget0).o = arr_cuwu1;
                List list2 = shareTarget0.j();
                int v4 = list2.size();
                cuwu[] arr_cuwu2 = new cuwu[v4];
                for(int v5 = 0; v5 < list2.size(); ++v5) {
                    WifiCredentialsAttachment wifiCredentialsAttachment0 = (WifiCredentialsAttachment)list2.get(v5);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dcjz.a).v_newBuilder();
                    String s = wifiCredentialsAttachment0.d;
                    if(s != null) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        dcjz dcjz0 = (dcjz)hftp0.b_message;
                        dcjz0.b |= 1;
                        dcjz0.c = s;
                    }
                    boolean z = wifiCredentialsAttachment0.e;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dcjz dcjz1 = (dcjz)hftp0.b_message;
                    dcjz1.b |= 2;
                    dcjz1.d = z;
                    cuwu cuwu2 = cuwu.b(((dcjz)hftp0.N_build()).toBytesArray());
                    arr_cuwu2[v5] = cuwu2;
                    dfzz0.aY(wifiCredentialsAttachment0, cuwu2.i);
                }
                if(v4 > 0) {
                    dcvz.a.b().h("Created %d wifi payloads", Integer.valueOf(v4));
                }
                dfzz0.ae(shareTarget0).q = arr_cuwu2;
                List list3 = shareTarget0.d();
                ArrayList arrayList0 = new ArrayList();
                for(int v6 = 0; v6 < list3.size(); ++v6) {
                    AppAttachment appAttachment0 = (AppAttachment)list3.get(v6);
                    String[] arr_s = appAttachment0.c;
                    if(arr_s != null) {
                        ArrayList arrayList1 = new ArrayList();
                        for(int v7 = 0; v7 < arr_s.length; ++v7) {
                            String s1 = arr_s[v7];
                            cuwu cuwu3 = cuwu.c((hrnt.k() ? new File(ccsb.a.a(s1)) : new File(s1)));
                            cuwu3.o = appAttachment0.i;
                            arrayList1.add(Long.valueOf(cuwu3.i));
                            arrayList0.add(cuwu3);
                        }
                        dfzz0.aZ(appAttachment0, arrayList1);
                    }
                }
                if(!arrayList0.isEmpty()) {
                    dcvz.a.b().h("Created %d app payloads", Integer.valueOf(arrayList0.size()));
                }
                dfzz0.ae(shareTarget0).r = (cuwu[])arrayList0.toArray(new cuwu[0]);
                ArrayList arrayList2 = new ArrayList();
                List list4 = shareTarget0.g();
                boolean z1 = list4.size() < 2 ? 1 : false;
                batl.b(z1);
                for(int v8 = 0; v8 < list4.size(); ++v8) {
                    StreamAttachment streamAttachment0 = (StreamAttachment)list4.get(v8);
                    ParcelFileDescriptor[] arr_parcelFileDescriptor = ParcelFileDescriptor.createPipe();
                    ParcelFileDescriptor parcelFileDescriptor1 = arr_parcelFileDescriptor[0];
                    ParcelFileDescriptor parcelFileDescriptor2 = arr_parcelFileDescriptor[1];
                    FileOutputStream fileOutputStream0 = new FileOutputStream(parcelFileDescriptor2.getFileDescriptor());
                    fileOutputStream0.write(new byte[]{0});
                    fileOutputStream0.flush();
                    dfzx dfzx0 = new dfzx();
                    dfzx0.a = parcelFileDescriptor2;
                    dfzx0.b = parcelFileDescriptor1;
                    dfzz0.b.put(shareTarget0, dfzx0);
                    cuwu cuwu4 = dfzz.bL(dfzx0);
                    arrayList2.add(cuwu4);
                    dfzz0.ab(streamAttachment0).b(cuwu4.i);
                }
                if(!arrayList2.isEmpty()) {
                    dcvz.a.b().h("Created %d stream payloads", Integer.valueOf(arrayList2.size()));
                }
                dfzz0.ae(shareTarget0).s = (cuwu[])arrayList2.toArray(new cuwu[0]);
                if(dfzz0.bp(shareTarget0)) {
                    dcvz.a.b().i("Created %s payloads for ShareTarget %s.", shareTarget0.e(), shareTarget0.b);
                    goto label_136;
                }
                goto label_159;
            }
            catch(IOException iOException0) {
                dcvz.a.e().f(iOException0).h("Failed to create payloads for the given attachments on share target %s. Disconnecting.", shareTarget0.b);
                dcnp0.e(shareTarget0, new dcnn(0x3F3).a());
                dfzz0.bR(shareTarget0, 5);
                return (int)0x8ABA;
            }
        }
    label_136:
        dfzz0.O.remove(shareTarget0);
        dfzz0.N.offer(shareTarget0);
        if(!dfzz0.bt()) {
            dcvz.a.b().h("Cannot share to ShareTarget %s yet, no transfer slots available yet.", shareTarget0.b);
            dcnp0.e(shareTarget0, new dcnn(0x3F8).a());
            return (int)0;
        }
        if(dfzz0.by()) {
            dcvz.a.b().h("Cannot share to ShareTarget %s yet, a ShareTarget is already connecting.", shareTarget0.b);
            dcnp0.e(shareTarget0, new dcnn(0x3F8).a());
            return (int)0;
        }
        Queue queue0 = dfzz0.L;
        ShareTarget shareTarget1 = (ShareTarget)queue0.peek();
        if(!hvqs.bj() && shareTarget1 != null && shareTarget1.m == 0) {
            dcvz.a.b().h("Cannot share to ShareTarget %s yet, the currently-connected device is on V1.", shareTarget0.b);
            dcnp0.e(shareTarget0, new dcnn(0x3F8).a());
            return (int)0;
        }
        if(shareTarget0.m == 0) {
            if(!queue0.isEmpty()) {
                dcvz.a.b().h("Cannot share to ShareTarget %s yet, this ShareTarget is V1 and there\'s already an ongoing connection.", shareTarget0.b);
                dcnp0.e(shareTarget0, new dcnn(0x3F8).a());
                return (int)0;
            }
            long v9 = hvqs.G();
            if(((long)dfzz0.M.size()) >= v9) {
                dcvz.a.b().h("Cannot share to ShareTarget %s yet, this ShareTarget is V1 and there\'s already an ongoing connection.", shareTarget0.b);
                dcnp0.e(shareTarget0, new dcnn(0x3F8).a());
                return (int)0;
            }
        }
        dcnp0.e(shareTarget0, new dcnn(1001).a());
        dfzz0.aC();
        return (int)0;
        try {
        label_159:
            dcvz.a.b().h("Failed to create any payloads for ShareTarget %s.", shareTarget0.b);
        }
        catch(IOException iOException0) {
            dcvz.a.e().f(iOException0).h("Failed to create payloads for the given attachments on share target %s. Disconnecting.", shareTarget0.b);
        }
        dcnp0.e(shareTarget0, new dcnn(0x3F3).a());
        dfzz0.bR(shareTarget0, 5);
        return (int)0x8ABA;
    }
}


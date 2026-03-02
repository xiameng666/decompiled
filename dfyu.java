import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.ArraySet;
import android.util.Pair;
import com.google.android.gms.nearby.sharing.AppAttachment;
import com.google.android.gms.nearby.sharing.AppInfo;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.StreamAttachment;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import j..util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class dfyu extends dfzt {
    final dfum a;
    final ShareTarget b;
    final dcnp c;
    final dfzz d;

    public dfyu(dfzz dfzz0, ShareTarget shareTarget0, dcnp dcnp0, dfum dfum0, ShareTarget shareTarget1, dcnp dcnp1) {
        this.a = dfum0;
        this.b = shareTarget1;
        this.c = dcnp1;
        Objects.requireNonNull(dfzz0);
        this.d = dfzz0;
        super(dfzz0, shareTarget0, dcnp0);
    }

    @Override  // dfzt
    public final void b() {
        ShareTarget shareTarget0 = this.b;
        for(Object object0: shareTarget0.e()) {
            this.d.ax(((Attachment)object0));
        }
        dfzz dfzz0 = this.d;
        dfzz0.ay(new ArraySet());
        if(hvqz.L()) {
            dfzx dfzx0 = (dfzx)dfzz0.b.remove(shareTarget0);
            if(dfzx0 != null) {
                dfzx0.a();
            }
        }
        dfzz0.aR(shareTarget0);
    }

    @Override  // dfzt
    public final void c() {
        Iterator iterator1;
        ShareTarget shareTarget0 = this.b;
        if(shareTarget0.f) {
            dfzz dfzz0 = this.d;
            if(dfzz0.bs(shareTarget0)) {
                for(Object object0: shareTarget0.f()) {
                    FileAttachment fileAttachment0 = (FileAttachment)object0;
                    File file0 = dfzz0.ai(dfzz0.O(fileAttachment0));
                    if(file0 != null) {
                        String s = djad.h(file0.getPath());
                        if(djad.t(fileAttachment0.a, s)) {
                            cuwu cuwu0 = dfzz0.T(fileAttachment0);
                            if(cuwu0 == null) {
                                dcvz.a.e().h("Failed to update the location of %s. No payload found to move back.", fileAttachment0);
                            }
                            else {
                                cuws cuws0 = cuwu0.l;
                                if(cuws0 == null) {
                                    dcvz.a.e().h("Failed to update the location of %s. No file found to move back.", fileAttachment0);
                                }
                                else {
                                    file0 = cuws0.a;
                                    if(file0 != null && file0.getParentFile() != null) {
                                        if(file0.getParentFile().equals(dfzz0.aj(false))) {
                                            dcvz.a.e().h("No need to move attachment %s back because the file is already in Connections folder.", fileAttachment0);
                                        }
                                        else {
                                            File file1 = hrnt.k() ? new File(ccsb.a.b(dfzz0.aj(false), String.valueOf(dfzz0.O(fileAttachment0)))) : new File(dfzz0.aj(false), String.valueOf(dfzz0.O(fileAttachment0)));
                                            try {
                                                if(!djad.u(file0, file1)) {
                                                    dcvz.a.b().p("Rename file failed when move back, try to copy.", new Object[0]);
                                                    djad.p(file0, file1);
                                                }
                                            }
                                            catch(IOException iOException0) {
                                                dcvz.a.b().f(iOException0).h("Failed to move the attachment %s back.", fileAttachment0);
                                                goto label_36;
                                            }
                                            file0 = file1;
                                        }
                                        goto label_37;
                                    }
                                    else {
                                        dcvz.a.e().h("Cannot move attachment %s due to failure to get the Java file to move back.", fileAttachment0);
                                    }
                                }
                            }
                        label_36:
                            file0 = null;
                        }
                    label_37:
                        if(file0 != null) {
                            djas.c(dfzz0.i, fileAttachment0.j, file0);
                        }
                    }
                }
                dfzz0.aO(shareTarget0.f());
            }
            else {
                iterator1 = shareTarget0.e().iterator();
                goto label_45;
            }
        }
        else {
            iterator1 = shareTarget0.e().iterator();
        label_45:
            while(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                this.d.ax(((Attachment)object1));
            }
        }
        dfzz dfzz1 = this.d;
        dfzz1.ay(new ArraySet());
        if(hvqz.L()) {
            dfzx dfzx0 = (dfzx)dfzz1.b.remove(shareTarget0);
            if(dfzx0 != null) {
                dfzx0.a();
            }
        }
        dfzz1.aR(shareTarget0);
    }

    // This method was un-flattened
    @Override  // dfzt
    public final boolean d() {
        File file8;
        File file7;
        List list1;
        Iterator iterator2;
        File file5;
        File file4;
        HashSet hashSet1;
        ShareTarget shareTarget0 = this.b;
        dfyt dfyt0 = new dfyt(this, shareTarget0);
        this.a.b(dfyt0);
        boolean z = shareTarget0.f && this.d.bs(shareTarget0);
        HashSet hashSet0 = new HashSet();
        for(Object object0: shareTarget0.f()) {
            FileAttachment fileAttachment0 = (FileAttachment)object0;
            dfzz dfzz0 = this.d;
            long v = dfzz0.O(fileAttachment0);
            cuwu cuwu0 = dfzz0.l.g(v);
            boolean z1 = cuwu0 != null && fileAttachment0.a.equals(cuwu0.q);
            if(hvqz.A() || dcww.b(dfzz0.i).e()) {
                String s = fileAttachment0.h;
                if(!TextUtils.isEmpty(s)) {
                    hashSet0.add(s);
                }
            }
            if(z) {
                long v1 = fileAttachment0.i;
                if(v1 == 0L) {
                    if(z1) {
                        File file0 = dfzz0.ai(dfzz0.O(fileAttachment0));
                        if(file0 == null) {
                            return false;
                        }
                        Uri uri0 = dfzz0.S(shareTarget0, fileAttachment0, file0);
                        dbyq dbyq0 = fileAttachment0.e();
                        dbyq0.b = uri0;
                        FileAttachment fileAttachment1 = dbyq0.a();
                        shareTarget0.s(fileAttachment0, fileAttachment1);
                        dfzz0.aX(fileAttachment1, uri0);
                        continue;
                    }
                    else {
                        if(dfzz0.bG(fileAttachment0, shareTarget0)) {
                            continue;
                        }
                        long v2 = dfzz0.C;
                        long v3 = dfzz0.w.b();
                        int v4 = dfzz0.t.a();
                        dcou dcou0 = dcpt.c(v2, gzaj.c, v3, v4);
                        dfzz0.w.i(dcou0);
                        return false;
                    }
                    goto label_38;
                }
                else {
                label_38:
                    long v5 = fileAttachment0.c;
                    if(v1 == v5) {
                        if(dfzz0.bq(fileAttachment0, shareTarget0, null)) {
                            continue;
                        }
                        long v6 = dfzz0.C;
                        long v7 = dfzz0.w.b();
                        int v8 = dfzz0.t.a();
                        dcou dcou1 = dcpt.c(v6, gzaj.c, v7, v8);
                        dfzz0.w.i(dcou1);
                    }
                    else {
                        File file1 = dfzz0.ai(dfzz0.O(fileAttachment0));
                        if(file1 == null) {
                            long v9 = dfzz0.C;
                            long v10 = dfzz0.w.b();
                            int v11 = dfzz0.t.a();
                            dcou dcou2 = dcpt.c(v9, gzaj.c, v10, v11);
                            dfzz0.w.i(dcou2);
                            return false;
                        }
                        if(v5 >= hvqs.aF()) {
                            dcvz.a.b().h("Entering the \'Verifying\' state because file size %s (byte) is large and it may take time to move it into its final location when combining previous received files.", Long.valueOf(v5));
                            dfzz0.aM(this.c, shareTarget0);
                        }
                        if(dfzz0.bq(fileAttachment0, shareTarget0, file1)) {
                            continue;
                        }
                        long v12 = dfzz0.C;
                        long v13 = dfzz0.w.b();
                        int v14 = dfzz0.t.a();
                        dcou dcou3 = dcpt.c(v12, gzaj.c, v13, v14);
                        dfzz0.w.i(dcou3);
                    }
                    return false;
                }
                goto label_65;
            }
            else {
            label_65:
                if(z1) {
                    File file2 = dfzz0.ai(dfzz0.O(fileAttachment0));
                    if(file2 == null) {
                        return false;
                    }
                    Uri uri1 = dfzz0.S(shareTarget0, fileAttachment0, file2);
                    dbyq dbyq1 = fileAttachment0.e();
                    dbyq1.b = uri1;
                    FileAttachment fileAttachment2 = dbyq1.a();
                    shareTarget0.s(fileAttachment0, fileAttachment2);
                    dfzz0.aX(fileAttachment2, uri1);
                    continue;
                }
                else {
                    if(dfzz0.bG(fileAttachment0, shareTarget0)) {
                        continue;
                    }
                    long v15 = dfzz0.C;
                    long v16 = dfzz0.w.b();
                    int v17 = dfzz0.t.a();
                    dcou dcou4 = dcpt.c(v15, gzaj.c, v16, v17);
                    dfzz0.w.i(dcou4);
                    return false;
                }
            }
            break;
        }
        if(djbr.z(shareTarget0.e())) {
            dfzz dfzz1 = this.d;
            FileAttachment fileAttachment3 = (FileAttachment)shareTarget0.f().get(0);
            Uri uri2 = dfzz1.Q(fileAttachment3);
            if(uri2 == null) {
                dcvz.a.e().p("Failed to evaluate apk file with unknown destination.", new Object[0]);
                long v18 = dfzz1.C;
                long v19 = dfzz1.w.b();
                int v20 = dfzz1.t.a();
                dcou dcou5 = dcpt.c(v18, gzaj.d, v19, v20);
                dfzz1.w.i(dcou5);
                return false;
            }
            Context context0 = dfzz1.i;
            String s1 = djad.f(context0, uri2);
            File file3 = hrnt.k() ? new File(ccsb.a.b(dfzz1.ak(), s1)) : new File(dfzz1.ak(), s1);
            PackageManager packageManager0 = dfzz1.j;
            PackageInfo packageInfo0 = djao.a(packageManager0, file3);
            String s2 = packageInfo0 == null ? null : packageInfo0.packageName;
            Drawable drawable0 = djao.b(packageManager0, file3);
            if(hrnt.k()) {
                hashSet1 = hashSet0;
                file4 = file3;
                file5 = new File(ccsb.a.b(djao.c(context0), fileAttachment3.g + ".png"));
            }
            else {
                hashSet1 = hashSet0;
                file4 = file3;
                file5 = new File(djao.c(context0), fileAttachment3.g + ".png");
            }
            djad.q(drawable0, file5.getAbsolutePath());
            String s3 = packageInfo0 == null ? fileAttachment3.a : packageManager0.getApplicationLabel(packageInfo0.applicationInfo).toString();
            gged_interceptors gged0 = gged_interceptors.l(file4.getAbsolutePath());
            Pair pair0 = dfzz1.z.a(gged0);
            AppInfo appInfo0 = dbvh.a(s2, s3, file5.getAbsolutePath(), 0, ((Integer)pair0.first).intValue(), ((Byte)pair0.second).byteValue());
            dcou dcou6 = dcpt.E(dfzz.bP(((Integer)pair0.first).intValue()), 2);
            dfzz1.w.i(dcou6);
            byte[] arr_b = bauc.n(appInfo0);
            fileAttachment3.e.putByteArray("com.google.android.gms.nearby.sharing.EXTRA_APP_INFO_BYTES", arr_b);
        }
        else {
            hashSet1 = hashSet0;
        }
        Iterator iterator1 = shareTarget0.d().iterator();
        while(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            AppAttachment appAttachment0 = (AppAttachment)object1;
            dfzz dfzz2 = this.d;
            List list0 = dfzz2.ar(appAttachment0);
            if(list0.isEmpty()) {
                dcvz.a.e().h("Failed to update the location of %s. No payload IDs found.", appAttachment0);
                goto label_189;
            }
            String[] arr_s = appAttachment0.f;
            ArrayList arrayList0 = new ArrayList();
            int v21 = 0;
            while(v21 < list0.size()) {
                File file6 = dfzz2.ai(((Long)list0.get(v21)).longValue());
                if(file6 == null) {
                    goto label_189;
                }
                if(appAttachment0.i) {
                    String s4 = arr_s[v21];
                    String s5 = file6.getAbsolutePath();
                    if(hrnt.k()) {
                        iterator2 = iterator1;
                        list1 = list0;
                        file7 = new File(ccsb.a.d(s5.substring(0, s5.lastIndexOf("/")), s4));
                    }
                    else {
                        iterator2 = iterator1;
                        list1 = list0;
                        file7 = new File(s5.substring(0, s5.lastIndexOf("/")), s4);
                    }
                    file8 = cuua.c(file7);
                    file6.renameTo(file8);
                }
                else {
                    try {
                        iterator2 = iterator1;
                        list1 = list0;
                        String s6 = arr_s[v21];
                        file8 = cuua.c((hrnt.k() ? new File(ccsb.a.b(dfzz2.ak(), s6)) : new File(dfzz2.ak(), s6)));
                        djad.o(file6, file8);
                    }
                    catch(IOException iOException0) {
                        dcvz.a.e().f(iOException0).p("Failed to move file.", new Object[0]);
                        file8 = null;
                    }
                }
                if(file8 == null || !file8.exists()) {
                    goto label_189;
                }
                arrayList0.add(file8.getAbsolutePath());
                ++v21;
                iterator1 = iterator2;
                list0 = list1;
            }
            File file9 = hrnt.k() ? new File(ccsb.a.a(((String)arrayList0.get(0)))) : new File(((String)arrayList0.get(0)));
            Drawable drawable1 = djao.b(dfzz2.j, file9);
            File file10 = hrnt.k() ? new File(ccsb.a.b(djao.c(dfzz2.i), appAttachment0.e + ".png")) : new File(djao.c(dfzz2.i), appAttachment0.e + ".png");
            djad.q(drawable1, file10.getAbsolutePath());
            Pair pair1 = dfzz2.z.a(arrayList0);
            dcou dcou7 = dcpt.E(dfzz.bP(((Integer)pair1.first).intValue()), 3);
            dfzz2.w.i(dcou7);
            dbvf dbvf0 = appAttachment0.e();
            dbvf0.c = (String[])arrayList0.toArray(new String[0]);
            dbvf0.d = arr_s;
            AppAttachment appAttachment1 = dbvf0.a();
            String s7 = file10.getAbsolutePath();
            AppInfo appInfo1 = dbvh.a(appAttachment0.h, appAttachment0.a, s7, 0, ((Integer)pair1.first).intValue(), ((Byte)pair1.second).byteValue());
            byte[] arr_b1 = bauc.n(appInfo1);
            appAttachment1.d.putByteArray("com.google.android.gms.nearby.sharing.EXTRA_APP_INFO_BYTES", arr_b1);
            if(appAttachment0.i && appInfo1.e != 1) {
                int v22 = arrayList0.size();
                for(int v23 = 0; v23 < v22; ++v23) {
                    String s8 = (String)arrayList0.get(v23);
                    (hrnt.k() ? new File(ccsb.a.a(s8)) : new File(s8)).delete();
                }
            }
            if(!shareTarget0.r(appAttachment0, appAttachment1)) {
            label_189:
                long v24 = dfzz2.C;
                long v25 = dfzz2.w.b();
                int v26 = dfzz2.t.a();
                dcou dcou8 = dcpt.c(v24, gzaj.d, v25, v26);
                dfzz2.w.i(dcou8);
                return false;
            }
            iterator1 = iterator1;
        }
        dfzz dfzz3 = this.d;
        dfzz3.ay(hashSet1);
        gged_interceptors gged1 = gged_interceptors.i(shareTarget0.i());
        int v27 = gged1.size();
        int v28 = 0;
        while(v28 < v27) {
            TextAttachment textAttachment0 = (TextAttachment)gged1.get(v28);
            byte[] arr_b2 = dfzz3.bI(textAttachment0);
            if(arr_b2 != null) {
                String s9 = new String(arr_b2);
                dcnj dcnj0 = textAttachment0.e();
                dcnj0.b = s9;
                dcnj0.e = textAttachment0.a;
                TextAttachment textAttachment1 = dcnj0.a();
                if(shareTarget0.t(textAttachment0, textAttachment1)) {
                    Map map0 = dfzz3.c;
                    dfzc dfzc0 = (dfzc)map0.get(textAttachment1);
                    if(dfzc0 == null) {
                        dfzc0 = new dfzc();
                        map0.put(textAttachment1, dfzc0);
                    }
                    dfzc0.f = s9;
                    dfzz3.aT(textAttachment0, textAttachment1);
                    ++v28;
                    continue;
                }
            }
            long v29 = dfzz3.C;
            long v30 = dfzz3.w.b();
            int v31 = dfzz3.t.a();
            dcou dcou9 = dcpt.c(v29, gzaj.e, v30, v31);
            dfzz3.w.i(dcou9);
            return false;
        }
        for(Object object2: shareTarget0.j()) {
            WifiCredentialsAttachment wifiCredentialsAttachment0 = (WifiCredentialsAttachment)object2;
            byte[] arr_b3 = dfzz3.bI(wifiCredentialsAttachment0);
            if(arr_b3 == null) {
                dcvz.a.e().h("Failed to receive Wi-Fi credential of %s.", wifiCredentialsAttachment0);
            }
            else {
                try {
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dcjz.a), arr_b3, 0, arr_b3.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    dcns dcns0 = wifiCredentialsAttachment0.e();
                    dcns0.d = ((dcjz)hftv0).d;
                    dcns0.c = ((dcjz)hftv0).c;
                    WifiCredentialsAttachment wifiCredentialsAttachment1 = dcns0.a();
                    if(shareTarget0.u(wifiCredentialsAttachment0, wifiCredentialsAttachment1)) {
                        Map map1 = dfzz3.c;
                        dfzc dfzc1 = (dfzc)map1.get(wifiCredentialsAttachment1);
                        if(dfzc1 == null) {
                            dfzc1 = new dfzc();
                            map1.put(wifiCredentialsAttachment1, dfzc1);
                        }
                        dfzc1.b = (dcjz)hftv0;
                        dfzz3.aT(wifiCredentialsAttachment0, wifiCredentialsAttachment1);
                        continue;
                    }
                }
                catch(hfur hfur0) {
                    dcvz.a.e().f(hfur0).h("Failed to receive Wi-Fi credential of %s.", wifiCredentialsAttachment0);
                }
            }
            long v32 = this.d.C;
            long v33 = this.d.w.b();
            int v34 = this.d.t.a();
            dcou dcou10 = dcpt.c(v32, gzaj.f, v33, v34);
            this.d.w.i(dcou10);
            return false;
        }
        if(hvqz.L()) {
            for(Object object3: this.b.g()) {
                ((StreamAttachment)object3).o();
            }
        }
        return true;
    }
}


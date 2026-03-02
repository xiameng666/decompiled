package com.google.android.gms.icing.proxy;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import abxg;
import abxh;
import abxi;
import android.content.ComponentName;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import bwwn;
import bwwr;
import bwws;
import bwwt;
import bwwu;
import bwwy;
import bwwz;
import bwxa;
import bwxb;
import bwyv;
import bwzd;
import bwze;
import gged_interceptors;
import ggna;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jeb.synthetic.FIN;

public class AppsContentChimeraProvider extends bwwn {
    private static final bwze a;
    private static final String[] b;

    static {
        Uri.parse("content://com.google.android.gms.icing.proxy.apps");
        AppsContentChimeraProvider.a = new bwze();
        List list0 = Arrays.asList(bwwu.a);
        ArrayList arrayList0 = new ArrayList(((ggna)abxg.a).c + 17);
        arrayList0.addAll(abxg.a);
        arrayList0.add("created_timestamp");
        for(Object object0: list0) {
            arrayList0.add(abxg.a(((String)object0)));
        }
        AppsContentChimeraProvider.b = (String[])arrayList0.toArray(new String[0]);
    }

    @Override  // bwwn
    public final String b(Uri uri0) {
        throw new UnsupportedOperationException();
    }

    @Override  // bwwn
    public final Cursor c(Uri uri0, String[] arr_s) {
        int v13;
        List list2;
        bwwy bwwy0 = bwwy.c(this.getContext());
        if(bwwy0 != null) {
            abxh abxh0 = abxh.d(arr_s);
            if(abxh0.a()) {
                long v = abxh0.a;
                long v1 = abxh0.b;
                if(abxh0.c()) {
                    gged_interceptors gged0 = bwxb.c(bwwy0.a, bwwy0.b);
                    if(!gged0.isEmpty()) {
                        long v2 = bwwy0.b();
                        int v3 = ((ggna)gged0).c;
                        ArrayList arrayList0 = new ArrayList(v3);
                        for(int v4 = 0; v4 < v3; ++v4) {
                            bwxa bwxa0 = (bwxa)gged0.get(v4);
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwws.a).v_newBuilder();
                            String s = bwxa0.a;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp0.b_message;
                            s.getClass();
                            ((bwws)hftv0).b |= 2;
                            ((bwws)hftv0).d = s;
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv1 = hftp0.b_message;
                            ((bwws)hftv1).c = 1;
                            ((bwws)hftv1).b |= 1;
                            ++v2;
                            if(!hftv1.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            bwws bwws0 = (bwws)hftp0.b_message;
                            bwws0.b |= 4;
                            bwws0.e = v2;
                            arrayList0.add(((bwws)hftp0.N_build()));
                        }
                        List list0 = bwxb.f(gged0);
                        bwwy0.c.c(list0);
                        bwwy0.c.d(arrayList0);
                        bwwy0.f(v2);
                    }
                }
                MatrixCursor matrixCursor0 = new MatrixCursor(AppsContentChimeraProvider.b);
                bwzd.e("getJournalEntries for lastSeqno = %d, limit = %d", Long.valueOf(v), Long.valueOf(v1));
                Object object0 = bwyv.a;
                __monitor_enter(object0);
                int v5 = FIN.finallyOpen$NT();
                List list1 = bwwy0.c.b();
                int v6;
                for(v6 = 0; v6 < list1.size() && ((bwws)list1.get(v6)).e <= v; ++v6) {
                }
                if(v6 >= list1.size()) {
                    bwzd.c("Not found any entry");
                    list2 = Collections.EMPTY_LIST;
                    FIN.finallyExec$NT(v5);
                }
                else {
                    ArrayList arrayList1 = new ArrayList();
                    int v7 = v6;
                    long v8 = 0L;
                    while(v7 < list1.size() && v8 < v1) {
                        arrayList1.add(((bwws)list1.get(v7)));
                        ++v8;
                        ++v7;
                    }
                    bwzd.e("Returning Apps corpus docs [%d,%d]", Integer.valueOf(v6), Long.valueOf(((long)v6) + v8 - 1L));
                    FIN.finallyCodeBegin$NT(v5);
                    list2 = arrayList1;
                }
                for(Object object1: list2) {
                    bwws bwws1 = (bwws)object1;
                    int v9 = bwws1.c;
                    if(bwwr.a(v9) == 2) {
                        ComponentName componentName0 = ComponentName.unflattenFromString(bwws1.d);
                        bwwz bwwz0 = componentName0 == null ? null : bwxb.a(this.getContext().getPackageManager(), componentName0);
                        if(bwwz0 == null) {
                            continue;
                        }
                        bwze bwze0 = AppsContentChimeraProvider.a;
                        String s1 = bwwz0.c.getPackageName();
                        MessageDigest messageDigest0 = bwze0.b;
                        int v10 = 5;
                        if(messageDigest0 != null) {
                            byte[] arr_b = messageDigest0.digest(s1.getBytes());
                            long v11 = 0L;
                            for(int v12 = 0; v12 < 8; ++v12) {
                                v11 = v11 << 8 | ((long)(arr_b[v12] & 0xFF));
                            }
                            v13 = 0;
                            while(v13 < 5) {
                                if(Arrays.binarySearch(bwze0.c[v13], v11) < 0) {
                                    ++v13;
                                    continue;
                                }
                                else {
                                    goto label_96;
                                }
                                break;
                            }
                        }
                        v13 = -1;
                    label_96:
                        if(v13 != -1) {
                            v10 = v13;
                        }
                        long v14 = bwze.a[v10];
                        matrixCursor0.newRow().add(Long.valueOf(bwws1.e)).add("add").add(bwwz0.e).add(Long.valueOf(v14)).add(Long.valueOf(bwwz0.d)).add(bwwz0.a).add(bwwz0.b).add(bwwz0.c.getPackageName()).add(bwwz0.c.getClassName()).add(Long.valueOf(bwwz0.f)).add((bwwz0.g == null ? "" : TextUtils.join("\n", bwwz0.g)));
                    }
                    else {
                        if(bwwr.a(v9) != 3) {
                            continue;
                        }
                        ComponentName componentName1 = ComponentName.unflattenFromString(bwws1.d);
                        if(componentName1 == null) {
                            continue;
                        }
                        matrixCursor0.newRow().add(Long.valueOf(bwws1.e)).add("del").add(bwwt.a(componentName1));
                    }
                }
                return abxi.a(matrixCursor0, "-dummy-incarnation-");
            }
        }
        return null;
    }
}


import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bwwv implements Runnable {
    public final bwwy a;
    public final Intent b;

    public bwwv(bwwy bwwy0, Intent intent0) {
        this.a = bwwy0;
        this.b = intent0;
    }

    @Override
    public final void run() {
        String s3;
        PrintWriter printWriter1;
        int v2;
        int v1;
        int v;
        Intent intent0 = this.b;
        bwzd.c(("AppsCorpus Got package manager broadcast: " + intent0.toString()));
        String s = intent0.getAction();
        Uri uri0 = intent0.getData();
        PrintWriter printWriter0 = null;
        String s1 = uri0 == null ? null : uri0.getSchemeSpecificPart();
        if(s != null) {
            bwwy bwwy0 = this.a;
            switch(s.hashCode()) {
                case 0xCFB12EEE: {
                    if(s.equals("android.intent.action.PACKAGE_REPLACED")) {
                        v = 1;
                        v1 = 0;
                        goto label_41;
                    }
                    break;
                }
                case -19011148: {
                    if(s.equals("android.intent.action.LOCALE_CHANGED")) {
                        bwzd.c("AppsCorpus::handleLocaleChanged");
                        if(bwwy0.h()) {
                            bwwy0.e();
                            return;
                        }
                    }
                    break;
                }
                case 0xA480416: {
                    if(s.equals("android.intent.action.PACKAGE_CHANGED")) {
                        Context context0 = bwwy0.a;
                        if(context0 != null) {
                            PackageManager packageManager0 = context0.getPackageManager();
                            if(s1 == null) {
                                v2 = 0;
                            }
                            else {
                                try {
                                    v2 = packageManager0.getApplicationInfo(s1, 0).enabled;
                                }
                                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                                    bwzd.i(packageManager$NameNotFoundException0, "Could not get app info for %s", new Object[]{s1});
                                    v2 = 0;
                                }
                            }
                            v = v2;
                            v1 = v2 ^ 1;
                            goto label_41;
                        }
                    }
                    break;
                }
                case 0x1F50B9C2: {
                    if(s.equals("android.intent.action.PACKAGE_REMOVED")) {
                        v1 = intent0.getBooleanExtra("android.intent.extra.REPLACING", false) ^ 1;
                        v = 0;
                        goto label_41;
                    }
                    break;
                }
                case 0x5C1076E2: {
                    if(s.equals("android.intent.action.PACKAGE_ADDED")) {
                        v = 1;
                        v1 = 0;
                    label_41:
                        if(s1 != null) {
                            if(v1 != 0) {
                                if(bwwy0.a != null) {
                                    List list0 = new ArrayList();
                                    bwyv bwyv0 = bwwy0.c;
                                    if(bwyv0 != null) {
                                        list0 = bwyv0.a();
                                    }
                                    ArrayList arrayList0 = new ArrayList();
                                    Iterator iterator0 = list0.iterator();
                                    while(iterator0.hasNext()) {
                                        Object object0 = iterator0.next();
                                        String s2 = (String)object0;
                                        ComponentName componentName0 = ComponentName.unflattenFromString(s2);
                                        if(componentName0 != null) {
                                            if(!s1.equals(componentName0.getPackageName())) {
                                                continue;
                                            }
                                            arrayList0.add(s2);
                                        }
                                        iterator0.remove();
                                    }
                                    long v3 = bwwy0.b();
                                    if(bwyv0 != null) {
                                        bwyv0.e(arrayList0, 3, v3);
                                        bwyv0.c(list0);
                                    }
                                    bwwy0.f(v3 + ((long)arrayList0.size()));
                                    bwzd.e("AppsCorpus::handlePackageRemoved: Removed package %s, number of removed components %d", s1, Integer.valueOf(arrayList0.size()));
                                }
                                bwwy0.e();
                                return;
                            }
                            if(v != 0) {
                                Context context1 = bwwy0.a;
                                if(context1 != null) {
                                    gged_interceptors gged0 = bwxb.b(context1, s1, bwwy0.b);
                                    long v4 = bwwy0.b();
                                    bwyv bwyv1 = bwwy0.c;
                                    if(bwyv1 != null) {
                                        bwyv1.e(bwxb.f(gged0), 2, v4);
                                        List list1 = bwxb.f(gged0);
                                        Object object1 = bwyv.a;
                                        __monitor_enter(object1);
                                        try {
                                            printWriter1 = new PrintWriter(new BufferedWriter(new FileWriter(bwyv1.c.getFileStreamPath(bwyv1.e), true)));
                                            goto label_84;
                                        }
                                        catch(IOException iOException0) {
                                            goto label_91;
                                            try {
                                            label_84:
                                                Iterator iterator1 = list1.iterator();
                                                while(true) {
                                                    if(!iterator1.hasNext()) {
                                                        goto label_107;
                                                    }
                                                    Object object2 = iterator1.next();
                                                    printWriter1.println(((String)object2));
                                                }
                                            }
                                            catch(IOException iOException0) {
                                            }
                                            catch(Throwable throwable0) {
                                                goto label_101;
                                            }
                                            printWriter0 = printWriter1;
                                            try {
                                            label_91:
                                                bwzd.i(iOException0, "Failed to append to component name file.", new Object[0]);
                                                goto label_95;
                                            }
                                            catch(Throwable throwable0) {
                                            }
                                            goto label_102;
                                        }
                                        catch(Throwable throwable0) {
                                            goto label_102;
                                        }
                                    label_95:
                                        if(printWriter0 != null) {
                                            try {
                                                try {
                                                    printWriter0.close();
                                                    goto label_115;
                                                }
                                                catch(RuntimeException unused_ex) {
                                                    s3 = bwyv1.e;
                                                    goto label_110;
                                                }
                                            label_101:
                                                printWriter0 = printWriter1;
                                            label_102:
                                                if(printWriter0 != null) {
                                                    try {
                                                        printWriter0.close();
                                                    }
                                                    catch(RuntimeException unused_ex) {
                                                        bwzd.d("Failed to close component name file %s", bwyv1.e);
                                                    }
                                                }
                                                throw throwable0;
                                                try {
                                                label_107:
                                                    printWriter1.close();
                                                    goto label_115;
                                                }
                                                catch(RuntimeException unused_ex) {
                                                    s3 = bwyv1.e;
                                                }
                                            label_110:
                                                bwzd.d("Failed to close component name file %s", s3);
                                            }
                                            catch(Throwable throwable1) {
                                                __monitor_exit(object1);
                                                throw throwable1;
                                            }
                                        }
                                    label_115:
                                        __monitor_exit(object1);
                                    }
                                    bwwy0.f(v4 + ((long)((ggna)gged0).c));
                                    bwzd.m("AppsCorpus::handlePackageAdded: Added package %s, number of added components %d", s1, Integer.valueOf(((ggna)gged0).c));
                                }
                                bwwy0.e();
                            }
                        }
                    }
                    break;
                }
            }
        }
    }
}


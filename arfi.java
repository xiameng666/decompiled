import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.BackupTransport;
import android.app.backup.RestoreDescription;
import android.app.backup.RestoreSet;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings.Secure;
import j..util.Collection.-EL;
import j..util.stream.Collectors;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import jeb.synthetic.TWR;

public final class arfi extends BackupTransport {
    public static final aqql a;
    public final Context b;
    public aqyv c;
    private final aqys d;
    private ParcelFileDescriptor e;
    private BufferedInputStream f;
    private BufferedOutputStream g;
    private byte[] h;
    private long i;
    private long j;
    private boolean k;
    private aqmv l;
    private boolean m;
    private final arfh n;

    static {
        arfi.a = new aqql(new String[]{"D2dTransport"});
    }

    public arfi(Context context0) {
        this.k = false;
        this.m = false;
        this.b = context0;
        this.d = new aqys(context0);
        try {
            this.c = new aqyv(context0);
        }
        catch(aqzd unused_ex) {
            arfi.a.m("Unable to create D2D transport directories", new Object[0]);
        }
        this.n = new arfh(this);
    }

    public final long a() {
        Context context0 = this.b;
        if(aqxa.n(context0)) {
            switch(aqjl.a.a(context0)) {
                case 1: 
                case 2: {
                    return hqlt.h() * 0x100000L;
                }
            }
        }
        hqhq hqhq0 = hqhq.a;
        if(hqhq0.j().ag()) {
            long v = hqhq0.j().e();
            StatFs statFs0 = new StatFs(Environment.getDataDirectory().getPath());
            return Math.min(v, Math.max(0L, statFs0.getBlockSizeLong() * statFs0.getAvailableBlocksLong() - 0x10000000L));
        }
        return 0x9600000L;
    }

    public final int abortFullRestore() {
        return 0;
    }

    public final File b(String s) {
        aqyv aqyv0 = this.c;
        return hrnt.i() ? new File(ccsb.a.b(aqyv0.a, s)) : new File(aqyv0.a, s);
    }

    public final File c(String s) {
        return this.g() ? this.c.b(s) : this.c.a(s);
    }

    public final void cancelFullBackup() {
        arfi.a.h("Canceling full backup of " + this.n.b, new Object[0]);
        File file0 = this.c(this.n.b);
        this.d();
        file0.delete();
        this.n.c = 5;
        this.n.a();
        if(hqlt.A()) {
            this.d.f(2);
        }
    }

    public final int checkFullBackupSize(long v) {
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            this.n.c = 6;
            arfi.a.m("Negative size reported for package %s.", new Object[]{this.n.b});
            if(hqlt.A()) {
                this.d.g(44, 4);
            }
            return -1002;
        }
        if(v1 == 0) {
            if(aqxa.n(this.b)) {
                arfi.a.h("Package %s doesn\'t have any backup data, but since testing flows are enabled, we will accept this as a valid backup.", new Object[]{this.n.b});
                return 0;
            }
            this.n.c = 6;
            arfi.a.h("Package %s doesn\'t have any backup data.", new Object[]{this.n.b});
            if(hqlt.A()) {
                this.d.g(43, 4);
            }
            return -1002;
        }
        if(v > this.a()) {
            this.n.c = 7;
            arfi.a.h("Package %s size (%d bytes) exceeds quota.", new Object[]{this.n.b, v});
            if(hqlt.A()) {
                this.d.g(42, 4);
            }
            return -1002;
        }
        return 0;
    }

    public final int clearBackupData(PackageInfo packageInfo0) {
        aqql aqql0 = arfi.a;
        aqql0.d("clearBackupData() pkg=" + packageInfo0.packageName, new Object[0]);
        arfh arfh0 = this.n;
        String s = packageInfo0.packageName;
        if(arfh0.a != 0) {
            aqql0.f("Movement to illegal state clearData.", new Object[0]);
        }
        arfh0.b(2);
        arfh0.b = s;
        this.c(packageInfo0.packageName).delete();
        return 0;
    }

    public final String currentDestinationString() {
        return hqhq.a.j().aO() ? "Moving data to new device" : "Moving data to new device";
    }

    private final int d() {
        if(this.e != null) {
            try {
                BufferedOutputStream bufferedOutputStream0 = this.g;
                if(bufferedOutputStream0 != null) {
                    bufferedOutputStream0.close();
                }
                this.f.close();
                this.e.close();
                return 0;
            }
            catch(IOException iOException0) {
                arfi.a.n("Exception caught in tearDownFullBackup()", iOException0, new Object[0]);
                this.d.g(37, 4);
                return -1000;
            }
            finally {
                bbpb.b(this.f);
                bbpb.a(this.e);
                this.e = null;
                this.f = null;
                this.g = null;
            }
        }
        return 0;
    }

    public final CharSequence dataManagementIntentLabel() {
        return "";
    }

    public final String dataManagementLabel() {
        return "";
    }

    private final void e() {
        File file0 = this.c("restore_token_file");
        if(!aqxa.n(this.b)) {
            if(!file0.exists()) {
                try {
                label_5:
                    try(FileOutputStream fileOutputStream0 = new FileOutputStream(file0)) {
                        fileOutputStream0.write(String.valueOf(this.getCurrentRestoreSet()).getBytes(StandardCharsets.UTF_8));
                    }
                }
                catch(IOException iOException0) {
                    arfi.a.g("Error writing restore token to file.", iOException0, new Object[0]);
                }
            }
        }
        else if(file0.length() == 0L) {
            goto label_5;
        }
    }

    private final boolean f() {
        return (this.getTransportFlags() & 1) != 0;
    }

    public final int finishBackup() {
        String s1;
        FileInputStream fileInputStream0;
        String s;
        arfi.a.d("backup finished", new Object[0]);
        int v = this.d();
        if(v == -1000) {
            arfh arfh0 = this.n;
            if(arfh0.c == 0) {
                arfh0.c = 4;
            }
        }
        if(hqlt.A()) {
            if(this.n.b != null && !this.m) {
                this.d.f(3);
            }
            this.m = false;
        }
        Context context0 = this.b;
        if(aqxa.n(context0)) {
            arfh arfh1 = this.n;
            if(arfh1.b != null && !arfh1.b.equals("@pm@")) {
                try {
                    s = arfh1.b;
                    if(aqxs.a(context0.getPackageManager().getPackageInfo(s, 0))) {
                        goto label_20;
                    }
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    aqxa.a.g("Failed to get package info for package: " + s, packageManager$NameNotFoundException0, new Object[0]);
                }
                goto label_48;
            label_20:
                File file0 = aqxa.b(context0, "app_backup");
                try(fileInputStream0 = new FileInputStream(file0); idnu idnu0 = new idnu(fileInputStream0)) {
                    int v1 = 0;
                    do {
                        if(idnu0.d() == null) {
                            goto label_34;
                        }
                        ++v1;
                    }
                    while(v1 <= 1);
                    goto label_48;
                label_34:
                    if(v1 == 1) {
                        aqxa.a.h("App backup file only contains backup manifest.", new Object[0]);
                        goto label_39;
                    }
                    else {
                        goto label_42;
                    }
                    goto label_48;
                }
                catch(IOException iOException0) {
                    goto label_45;
                }
            label_39:
                arfi.a.h("Clearing backup file for package: %s as app backup file doesn\'t contain any app data.", new Object[]{this.n.b});
                aqxa.f(this.b, this.n.b);
                goto label_48;
                try {
                label_42:
                    TWR.useResource$NT(fileInputStream0);
                }
                catch(IOException iOException0) {
                label_45:
                    aqxa.a.g("Failed to read tar file: " + file0.toString(), iOException0, new Object[0]);
                    goto label_48;
                }
                aqxa.a.f("Unexpected app backup file format. Expected a TAR archive file with one or more entries.", new Object[0]);
                try {
                label_48:
                    s1 = this.n.b;
                    PackageInfo packageInfo0 = this.b.getPackageManager().getPackageInfo(s1, 0);
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException1) {
                    aqxa.a.g("Failed to get package info for package: " + s1, packageManager$NameNotFoundException1, new Object[0]);
                    arfi.a.h("Clearing backup file for package: %s as allow_backup is set to false.", new Object[]{this.n.b});
                    aqxa.f(this.b, this.n.b);
                    goto label_59;
                }
                if(packageInfo0.applicationInfo == null || (packageInfo0.applicationInfo.flags & 0x8000) == 0) {
                    arfi.a.h("Clearing backup file for package: %s as allow_backup is set to false.", new Object[]{this.n.b});
                    aqxa.f(this.b, this.n.b);
                }
            }
        }
    label_59:
        this.n.a();
        return v;
    }

    private final boolean g() {
        int v = Settings.Secure.getInt(this.b.getContentResolver(), "backup_enable_d2d_test_mode", 0);
        aqjl.p("backup_enable_d2d_test_mode", v, aqjl.e);
        return v != 0;
    }

    public final RestoreSet[] getAvailableRestoreSets() {
        arfi.a.m("List of available restore sets requested. Unsupported operation.", new Object[0]);
        return new RestoreSet[]{new RestoreSet("D2D Restore Set", "D2dTransport", bbmq.d(this.b))};
    }

    public final long getCurrentRestoreSet() {
        arfi.a.m("Current restore set requested.", new Object[0]);
        return bbmq.d(this.b);
    }

    public final int getNextFullRestoreDataChunk(ParcelFileDescriptor parcelFileDescriptor0) {
        arfi.a.m("Can\'t restore from D2d Transport.", new Object[0]);
        return -1000;
    }

    public final int getRestoreData(ParcelFileDescriptor parcelFileDescriptor0) {
        arfi.a.m("Can\'t restore from D2d Transport.", new Object[0]);
        return -1000;
    }

    public final int getTransportFlags() {
        Context context0 = this.b;
        if(aqxa.n(context0)) {
            switch(aqjl.a.a(context0)) {
                case 1: {
                    return 1;
                }
                case 2: {
                    return 0;
                }
                default: {
                    return 2;
                }
            }
        }
        return 2;
    }

    private static final boolean h(int v) {
        return (v & 2) != 0;
    }

    public final int initializeDevice() {
        aqql aqql0 = arfi.a;
        aqql0.d("wiping all data", new Object[0]);
        if(hqlt.A()) {
            this.d.i(2, null, false, false, 3);
        }
        bboc.e(this.c.a);
        if(this.g()) {
            bboc.e(this.c.b);
        }
        Context context0 = this.b;
        hqlq.e();
        if(hqlq.d()) {
            if(aqjl.a.i(context0)) {
                baun baun0 = aqxa.a;
                baun0.h("B&R Test flows are enabled. Ensure URI permissions are set correctly for test data.", new Object[0]);
                baun0.h("Setting up the testing flows state.", new Object[0]);
                for(Object object0: aqxa.d(context0)) {
                    aqxa.h(((File)object0));
                    aqxa.g(((File)object0));
                }
                aqxa.j(context0);
                baun0.h("Scheduling reset task.", new Object[0]);
                clkn clkn0 = new clkn();
                clkn0.p = false;
                hqlq.e();
                hqlq hqlq0 = hqlq.a;
                long v = hqlq0.b().b();
                if(v < 0L) {
                    v = 600L;
                }
                hqlq.e();
                long v1 = hqlq0.b().a();
                if(v1 < 0L) {
                    v1 = 1200L;
                }
                clkn0.e(v, v1);
                clkn0.t("disable_testing_flows");
                clkn0.w("com.google.android.gms.backup.common.testingflows.TestingFlowsSettingsResetterChimeraService");
                clkn0.v(1);
                clkn0.r(false);
                clkn0.g(2);
                clkn0.i(false);
                clko clko0 = clkn0.a();
                cljp.a(context0).f(clko0);
                aqxa.m(context0, true);
            }
            else {
                aqxa.a.h("B&R Test flows are disabled. Cleaning up all the test data and related URI permissions.", new Object[0]);
                aqxa.k(context0);
            }
        }
        this.c.c();
        arfh arfh0 = this.n;
        if(arfh0.a != 0) {
            aqql0.f("Movement to illegal state initializeDevice.", new Object[0]);
        }
        arfh0.b(3);
        arfh0.a();
        return 0;
    }

    public final String name() {
        return "com.google.android.gms/.backup.migrate.service.D2dTransport";
    }

    public final RestoreDescription nextRestorePackage() {
        arfi.a.m("Can\'t restore from D2d Transport.", new Object[0]);
        return RestoreDescription.NO_MORE_PACKAGES;
    }

    public final int performBackup(PackageInfo packageInfo0, ParcelFileDescriptor parcelFileDescriptor0) {
        return this.performBackup(packageInfo0, parcelFileDescriptor0, 0);
    }

    public final int performBackup(PackageInfo packageInfo0, ParcelFileDescriptor parcelFileDescriptor0, int v) {
        List list0;
        boolean z1;
        FileOutputStream fileOutputStream0;
        this.m = (v & 8) != 0;
        if(hqlt.a.o().ag() && this.m) {
            return 0;
        }
        if(hqlt.A()) {
            boolean z = this.f();
            this.d.i(4, packageInfo0.packageName, 1 == (v & 1), z, 3);
        }
        int v1 = -1006;
        if(this.g()) {
            if(hqhq.a.j().ae() && arfi.h(v)) {
                return -1006;
            }
            this.e();
        }
        Context context0 = this.b;
        if(aqxa.n(context0)) {
            aqql aqql0 = arfi.a;
            aqql0.h("performBackup called with Testing Flows enabled.", new Object[0]);
            if(this.m) {
                aqql0.h("performBackup called with FLAG_DATA_NOT_CHANGED flag during Testing Flows. Ignoring this backup call as this is a no-op.", new Object[0]);
                return 0;
            }
            if(arfi.h(v)) {
                aqql0.m("Incremental backups are not supported for B&R testing flows. Rejecting package %s for backup.", new Object[]{packageInfo0.packageName});
                if(hqlt.A()) {
                    this.d.g(15, 4);
                }
            }
            else if((v & 1) == 0) {
                aqql0.m("Testing Flows backup requested without \'FLAG_USER_INITIATED\' flag. This means that the backup is scheduled by Framework. Rejecting package %s for backup to avoid running scheduled backups while Testing Flows are enabled.", new Object[]{packageInfo0.packageName});
                if(hqlt.A()) {
                    this.d.g(34, 4);
                }
                v1 = -1002;
            }
            else if(!packageInfo0.packageName.equals("@pm@") && (packageInfo0.applicationInfo.flags & 2) == 0) {
                aqql0.m("Rejecting package %s for testing flow backup because it is not debuggable.", new Object[]{packageInfo0.packageName});
                if(hqlt.A()) {
                    this.d.g(35, 4);
                }
                v1 = -1002;
            }
            else if(aqxa.c(context0, packageInfo0.packageName).length() > 0L) {
                aqql0.m("Rejecting package %s for testing flow backup: file already exists with data. Transport needs to be re-initialzed in order to clear any old state of Testing flows.", new Object[]{packageInfo0.packageName});
                if(hqlt.A()) {
                    this.d.g(36, 4);
                }
                v1 = -1002;
            }
            else {
                v1 = 0;
            }
            if(v1 != 0) {
                return v1;
            }
            this.e();
            if(!packageInfo0.packageName.equals("@pm@")) {
                aqql0.h("Taking backup of restore credentials for package: %s", new Object[]{packageInfo0.packageName});
                aqxa.e(context0, packageInfo0.packageName);
            }
        }
        this.n.c(packageInfo0.packageName);
        File file0 = this.c(packageInfo0.packageName);
        try {
            fileOutputStream0 = new FileOutputStream(file0);
            BackupDataInput backupDataInput0 = new BackupDataInput(parcelFileDescriptor0.getFileDescriptor());
            BackupDataOutput backupDataOutput0 = new BackupDataOutput(fileOutputStream0.getFD());
            byte[] arr_b = new byte[0x100000];
            ggfp ggfp0 = ggnj.a;
            if(hqhq.r() && packageInfo0.packageName.equals("@pm@")) {
                z1 = aqms.e(context0) && aqms.f(context0);
                if(z1) {
                    ggfp0 = aqms.b(hqhq.s());
                }
            }
            else {
                z1 = false;
            }
            boolean z2 = aqxa.n(context0) && packageInfo0.packageName.equals("@pm@");
            if(z2) {
                list0 = (List)Collection.-EL.stream(context0.getPackageManager().getInstalledPackages(0)).filter(new aqwv()).map(new aqww()).collect(Collectors.toCollection(new aqwx()));
                list0.addAll(aqxa.b);
            }
            else {
                list0 = ggna.a;
            }
            while(backupDataInput0.readNextHeader()) {
                String s = backupDataInput0.getKey();
                int v3 = backupDataInput0.getDataSize();
                if(v3 < 0) {
                    arfi.a.j("Skipping negative data size key: %s", new Object[]{s});
                    backupDataInput0.skipEntityData();
                }
                else if(!packageInfo0.packageName.equals("com.android.providers.settings") || (!"network_policies".equals(s) || hqhq.a.j().av())) {
                    if(z1 && ggfp0.contains(s)) {
                        long v4 = aqms.a(s);
                        if(v4 != 0L) {
                            aqms.d(s, v4, backupDataInput0, backupDataOutput0);
                            continue;
                        }
                    }
                    if(z2 && !list0.contains(s)) {
                        arfi.a.h("Skipping %s key for %s", new Object[]{s, packageInfo0.packageName});
                        backupDataInput0.skipEntityData();
                    }
                    else {
                        backupDataOutput0.writeEntityHeader(s, v3);
                        do {
                            int v5 = backupDataInput0.readEntityData(arr_b, 0, 0x100000);
                            v3 -= v5;
                            backupDataOutput0.writeEntityData(arr_b, v5);
                        }
                        while(v3 > 0);
                    }
                }
                else {
                    arfi.a.h("Skipping %s key for %s", new Object[]{"network_policies", "com.android.providers.settings"});
                    backupDataInput0.skipEntityData();
                }
            }
        }
        catch(IOException iOException0) {
            arfi.a.g("Error storing backup data.", iOException0, new Object[0]);
            if(hqlt.A()) {
                this.d.g(37, 4);
            }
            this.n.c = 2;
            this.n.a();
            return -1000;
        }
        finally {
            bbpb.b(fileOutputStream0);
        }
        return 0;
    }

    public final int performFullBackup(PackageInfo packageInfo0, ParcelFileDescriptor parcelFileDescriptor0) {
        if(hqlt.A()) {
            boolean z = this.f();
            this.d.i(5, packageInfo0.packageName, false, z, 3);
        }
        if(this.e != null) {
            if(SystemClock.elapsedRealtime() - this.j > 300000L) {
                arfi.a.m("Clearing old full backup state after timeout.", new Object[0]);
                this.d();
                goto label_12;
            }
            arfi.a.m("Attempt to initiate full backup while one is in progress", new Object[0]);
            if(hqlt.A()) {
                this.d.g(11, 4);
            }
            return -1000;
        }
    label_12:
        Context context0 = this.b;
        if(aqxa.n(context0)) {
            aqql aqql0 = arfi.a;
            aqql0.h("performFullBackup called with Testing Flows enabled.", new Object[0]);
            if((packageInfo0.applicationInfo.flags & 2) == 0) {
                aqql0.m("Rejecting package %s for testing flow backup because it is not debuggable.", new Object[]{packageInfo0.packageName});
                if(hqlt.A()) {
                    this.d.g(35, 4);
                }
                return -1002;
            }
            if(aqxa.c(context0, packageInfo0.packageName).length() > 0L) {
                aqql0.m("Rejecting package %s for backup file already exists with data. Transport needs to be re-initialzed in order to clear any old state of Testing flows.", new Object[]{packageInfo0.packageName});
                if(hqlt.A()) {
                    this.d.g(36, 4);
                }
                return -1002;
            }
            aqxa.e(context0, packageInfo0.packageName);
        }
        this.j = SystemClock.elapsedRealtime();
        this.n.c(packageInfo0.packageName);
        arfi.a.h("performFullBackup : " + packageInfo0, new Object[0]);
        this.e = parcelFileDescriptor0;
        this.f = hqlt.z() ? new BufferedInputStream(new FileInputStream(this.e.getFileDescriptor()), ((int)hqlt.i())) : new BufferedInputStream(new FileInputStream(this.e.getFileDescriptor()));
        this.h = new byte[(hqlt.z() ? ((int)hqlt.i()) : 0x2000)];
        this.i = 0L;
        return 0;
    }

    public final long requestBackupTime() {
        return 0L;
    }

    public final long requestFullBackupTime() {
        return 0L;
    }

    public final int sendBackupData(int v) {
        boolean z;
        FileOutputStream fileOutputStream0;
        if(this.e == null) {
            arfi.a.m("Attempted sendBackupData before performFullBackup", new Object[0]);
            return -1000;
        }
        long v1 = this.i + ((long)v);
        this.i = v1;
        if(Long.compare(v1, this.a()) > 0) {
            arfh arfh0 = this.n;
            arfi.a.m("Full backup size limit exceeded, pkg: " + arfh0.b, new Object[0]);
            if(hqlt.A()) {
                this.d.g(38, 4);
            }
            arfh0.c = 7;
            return -1000;
        }
        if(v > this.h.length) {
            this.h = new byte[v];
        }
        if(this.g == null) {
            try {
                fileOutputStream0 = new FileOutputStream(this.c(this.n.b));
            }
            catch(FileNotFoundException fileNotFoundException0) {
                arfi.a.f("sendBackupData: " + fileNotFoundException0.getMessage(), new Object[0]);
                if(hqlt.A()) {
                    this.d.g(39, 4);
                }
                this.n.c = 2;
                return -1000;
            }
            this.g = hqlt.z() ? new BufferedOutputStream(fileOutputStream0, ((int)hqlt.g())) : new BufferedOutputStream(fileOutputStream0);
        }
        if(hqhq.s() && hqhq.r() && this.n.b.equals("com.android.wallpaperbackup") && !this.k && (aqms.e(this.b) && aqms.f(this.b) && aqms.b(hqhq.s()).contains("com.android.wallpaperbackup"))) {
            try {
                BufferedInputStream bufferedInputStream0 = this.f;
                BufferedOutputStream bufferedOutputStream0 = this.g;
                if(this.l == null) {
                    this.l = new aqmv(((int)aqms.a("com.android.wallpaperbackup")));
                }
                aqmv aqmv0 = this.l;
                byte[] arr_b = new byte[v];
                ghjj.a(bufferedInputStream0, arr_b, 0, v);
                byte[][] arr2_b = {aqmv0.c, arr_b};
                int v2 = 0;
                for(int v3 = 0; v3 < 2; ++v3) {
                    v2 += arr2_b[v3].length;
                }
                byte[] arr_b1 = new byte[v2];
                int v4 = 0;
                for(int v5 = 0; v5 < 2; ++v5) {
                    byte[] arr_b2 = arr2_b[v5];
                    System.arraycopy(arr_b2, 0, arr_b1, v4, arr_b2.length);
                    v4 += arr_b2.length;
                }
                aqmv0.c = arr_b1;
                int v6 = aqmv0.d + v;
                aqmv0.d = v6;
                if(v6 < 545) {
                    z = false;
                }
                else {
                    try {
                        aqmu.a(aqmv0.c);
                        byte[] arr_b3 = aqmv0.c;
                        int v7 = aqmv0.b;
                        if(v7 < 0 || v7 > 99) {
                            throw new IOException("New version code must be between 0 and 99");
                        }
                        aqmu.b(arr_b3, aqmu.a.length);
                        arr_b3[542] = (byte)(v7 / 10 + 0x30);
                        arr_b3[0x21F] = (byte)(v7 % 10 + 0x30);
                        aqmv.a.h("VtoUMitigation: Changed version in wallpaper backup from V to U", new Object[0]);
                    }
                    catch(IOException iOException1) {
                        aqmv.a.n("VtoUMitigation: Failed to change the version, continue with the backup anyway", iOException1, new Object[0]);
                    }
                    bufferedOutputStream0.write(aqmv0.c);
                    z = true;
                }
                this.k = z;
                arfi.a.h("Attempting to change version for wallpaper tar backup. Changed version in this pass: " + z, new Object[0]);
                return 0;
            }
            catch(IOException iOException0) {
                arfi.a.g("Error changing version for wallpaper tar backup", iOException0, new Object[0]);
                if(hqlt.A()) {
                    this.d.g(40, 4);
                }
                this.n.c = 2;
                return -1000;
            }
        }
        while(v > 0) {
            try {
                int v8 = this.f.read(this.h, 0, v);
                if(v8 < 0) {
                    arfi.a.m("Unexpected EOD; failing backup", new Object[0]);
                    if(hqlt.A()) {
                        this.d.g(41, 4);
                    }
                    this.n.c = 3;
                    return -1000;
                }
                this.g.write(this.h, 0, v8);
                v -= v8;
            }
            catch(IOException iOException2) {
                arfh arfh1 = this.n;
                arfi.a.f("Error handling backup data for " + arfh1.b, new Object[0]);
                arfi.a.f(iOException2.getMessage(), new Object[0]);
                if(hqlt.A()) {
                    this.d.g(37, 4);
                }
                arfh1.c = 2;
                return -1000;
            }
        }
        return 0;
    }

    public final int startRestore(long v, PackageInfo[] arr_packageInfo) {
        arfi.a.m("Can\'t restore from D2d Transport.", new Object[0]);
        return -1000;
    }

    public final String transportDirName() {
        return "d2dMigrateTransport";
    }
}


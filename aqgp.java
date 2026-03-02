import android.accounts.Account;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.BackupStatsRequestConfig;
import com.google.android.gms.backup.transport.stats.BackupStatsChimeraService;
import j..util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public final class aqgp extends wby implements aqgq {
    final BackupStatsChimeraService a;

    public aqgp() {
        super("com.google.android.gms.backup.IBackupStatsService");
    }

    public aqgp(BackupStatsChimeraService backupStatsChimeraService0) {
        Objects.requireNonNull(backupStatsChimeraService0);
        this.a = backupStatsChimeraService0;
        super("com.google.android.gms.backup.IBackupStatsService");
    }

    @Override  // aqgq
    public final void a() {
        this.a.getSharedPreferences("CurrentDeviceBackupStats", 0).edit().clear().commit();
        atnk.b = System.currentTimeMillis();
    }

    @Override  // aqgq
    public final void b(ApplicationBackupStats applicationBackupStats0) {
        if(applicationBackupStats0 == null) {
            return;
        }
        SharedPreferences.Editor sharedPreferences$Editor0 = this.a.getSharedPreferences("CurrentDeviceBackupStats", 0).edit();
        String s = atnk.b(applicationBackupStats0);
        sharedPreferences$Editor0.putString(applicationBackupStats0.a, s);
        sharedPreferences$Editor0.commit();
    }

    @Override  // aqgq
    public final void c(String s, long v) {
        long v3;
        int v2;
        int v1;
        if(s == null) {
            BackupStatsChimeraService.a.j("Called on null package.", new Object[0]);
            return;
        }
        SharedPreferences sharedPreferences0 = this.a.getSharedPreferences("CurrentDeviceBackupStats", 0);
        String s1 = sharedPreferences0.getString(s, null);
        if(s1 == null) {
            v3 = 0L;
            v1 = 0;
            v2 = 0;
        }
        else {
            ApplicationBackupStats applicationBackupStats0 = atnk.a(s, s1, new BackupStatsRequestConfig(true, true));
            v1 = applicationBackupStats0.b;
            v2 = applicationBackupStats0.c;
            v3 = applicationBackupStats0.e;
        }
        ApplicationBackupStats applicationBackupStats1 = new ApplicationBackupStats(s, v1, v2, v, v3);
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        sharedPreferences$Editor0.putString(s, atnk.b(applicationBackupStats1));
        sharedPreferences$Editor0.commit();
    }

    @Override  // aqgq
    public final ApplicationBackupStats[] d(BackupStatsRequestConfig backupStatsRequestConfig0) {
        BackupStatsChimeraService backupStatsChimeraService0 = this.a;
        if(!backupStatsChimeraService0.a(backupStatsRequestConfig0)) {
            return null;
        }
        if(Long.compare(System.currentTimeMillis() - atnk.b, hqlt.a.o().l() * 3600000L) >= 0) {
            ConnectivityManager connectivityManager0 = (ConnectivityManager)backupStatsChimeraService0.getSystemService("connectivity");
            if(connectivityManager0 != null) {
                NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
                if(networkInfo0 != null && networkInfo0.isConnected()) {
                    ApplicationBackupStats[] arr_applicationBackupStats = backupStatsChimeraService0.b(bbmq.d(backupStatsChimeraService0), new BackupStatsRequestConfig(true, true));
                    if(arr_applicationBackupStats == null) {
                        return null;
                    }
                    SharedPreferences.Editor sharedPreferences$Editor0 = backupStatsChimeraService0.getSharedPreferences("CurrentDeviceBackupStats", 0).edit();
                    sharedPreferences$Editor0.clear();
                    for(int v = 0; v < arr_applicationBackupStats.length; ++v) {
                        ApplicationBackupStats applicationBackupStats0 = arr_applicationBackupStats[v];
                        String s = atnk.b(applicationBackupStats0);
                        sharedPreferences$Editor0.putString(applicationBackupStats0.a, s);
                    }
                    sharedPreferences$Editor0.commit();
                    atnk.b = System.currentTimeMillis();
                }
            }
        }
        if(!backupStatsRequestConfig0.a && !backupStatsRequestConfig0.b) {
            atnk.a.m("Client should request either backup data size or backup timestamp", new Object[0]);
            return null;
        }
        SharedPreferences sharedPreferences0 = backupStatsChimeraService0.getSharedPreferences("CurrentDeviceBackupStats", 0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: sharedPreferences0.getAll().entrySet()) {
            ApplicationBackupStats applicationBackupStats1 = atnk.a(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()), backupStatsRequestConfig0);
            if(applicationBackupStats1 != null) {
                arrayList0.add(applicationBackupStats1);
            }
        }
        return (ApplicationBackupStats[])arrayList0.toArray(new ApplicationBackupStats[0]);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        Parcelable[] arr_parcelable;
        String s3;
        Account account2;
        Account account1;
        int v8;
        ApplicationBackupStats[] arr_applicationBackupStats;
        switch(v) {
            case 1: {
                BackupStatsRequestConfig backupStatsRequestConfig0 = (BackupStatsRequestConfig)wbz.a(parcel0, BackupStatsRequestConfig.CREATOR);
                String[] arr_s = parcel0.createStringArray();
                aqgp.gr(parcel0);
                BackupStatsChimeraService backupStatsChimeraService0 = this.a;
                if(!backupStatsChimeraService0.a(backupStatsRequestConfig0)) {
                    arr_applicationBackupStats = null;
                }
                else if(arr_s.length == 0) {
                    BackupStatsChimeraService.a.h("Request getBackupDataStats for 0 packages", new Object[0]);
                    arr_applicationBackupStats = new ApplicationBackupStats[0];
                }
                else {
                    HashMap hashMap0 = ggkm.k(2);
                    for(int v1 = 0; v1 < arr_s.length; ++v1) {
                        String s = arr_s[v1];
                        Long long0 = new aqjk(backupStatsChimeraService0).b(s);
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)hashMap0.get(long0);
                        if(hftp0 == null) {
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aqew.a).v_newBuilder();
                            boolean z = backupStatsRequestConfig0.a;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            aqew aqew0 = (aqew)hftp1.b_message;
                            aqew0.b |= 1;
                            aqew0.d = z;
                            boolean z1 = hqil.s() && z;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            aqew aqew1 = (aqew)hftp1.b_message;
                            aqew1.b |= 4;
                            aqew1.f = z1;
                            hftp1.cO(s);
                            hashMap0.put(long0, hftp1);
                        }
                        else {
                            hftp0.cO(s);
                        }
                    }
                    ggdy ggdy0 = new ggdy();
                    for(Object object0: hashMap0.entrySet()) {
                        long v2 = (long)(((Long)((Map.Entry)object0).getKey()));
                        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((Map.Entry)object0).getValue();
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)aqfe.a).v_newBuilder();
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        aqfe aqfe0 = (aqfe)hftp3.b_message;
                        aqfe0.b |= 1;
                        aqfe0.c = v2;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        aqfe aqfe1 = (aqfe)hftp3.b_message;
                        aqew aqew2 = (aqew)hftp2.N_build();
                        aqew2.getClass();
                        aqfe1.o = aqew2;
                        aqfe1.b |= 0x4000;
                        if(hqhk.c()) {
                            long v3 = bbmq.d(backupStatsChimeraService0);
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            aqfe aqfe2 = (aqfe)hftp3.b_message;
                            aqfe2.b |= 2;
                            aqfe2.d = v3;
                        }
                        ggdy0.i(hftp3);
                    }
                    gged_interceptors gged0 = ggdy0.h();
                    int v4 = ((ggna)gged0).c;
                    if(v4 > 2) {
                        BackupStatsChimeraService.a.m("Request backup stats for more than 2 tokens.", new Object[0]);
                        arr_applicationBackupStats = null;
                    }
                    else {
                        Account account0 = ((aqef)backupStatsChimeraService0.b.apply(backupStatsChimeraService0)).a();
                        if(account0 == null) {
                            BackupStatsChimeraService.a.m("There is no backup account.", new Object[0]);
                            arr_applicationBackupStats = null;
                            parcel1.writeNoException();
                            parcel1.writeTypedArray(arr_applicationBackupStats, 1);
                            return true;
                        }
                        else {
                            ArrayList arrayList0 = new ArrayList(arr_s.length);
                            for(int v5 = 0; v5 < v4; ++v5) {
                                ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)gged0.get(v5);
                                try {
                                    String s1 = aqxr.d(backupStatsChimeraService0, account0, "android");
                                    if(!hftp4.b_message.isImmutable()) {
                                        hftp4.ensureMutable();
                                    }
                                    aqfe aqfe3 = (aqfe)hftp4.b_message;
                                    aqfe3.b |= 16;
                                    aqfe3.f = s1;
                                    arrayList0.addAll(backupStatsChimeraService0.d(account0, hftp4));
                                }
                                catch(aqxv aqxv0) {
                                    BackupStatsChimeraService.a.g("auth exception when on getting backup stats", aqxv0, new Object[0]);
                                    arr_applicationBackupStats = null;
                                    parcel1.writeNoException();
                                    parcel1.writeTypedArray(arr_applicationBackupStats, 1);
                                    return true;
                                }
                                catch(aqxu | acse exception0) {
                                    BackupStatsChimeraService.a.g("Account exception during getBackupDataStats()", exception0, new Object[0]);
                                    arr_applicationBackupStats = null;
                                    parcel1.writeNoException();
                                    parcel1.writeTypedArray(arr_applicationBackupStats, 1);
                                    return true;
                                }
                                catch(aqyh unused_ex) {
                                    BackupStatsChimeraService.a.f("Transfer exception during getBackupDataStats()", new Object[0]);
                                    arr_applicationBackupStats = null;
                                    parcel1.writeNoException();
                                    parcel1.writeTypedArray(arr_applicationBackupStats, 1);
                                    return true;
                                }
                            }
                            arr_applicationBackupStats = (ApplicationBackupStats[])arrayList0.toArray(new ApplicationBackupStats[0]);
                        }
                    }
                }
                parcel1.writeNoException();
                parcel1.writeTypedArray(arr_applicationBackupStats, 1);
                return true;
            }
            case 2: {
                BackupStatsRequestConfig backupStatsRequestConfig1 = (BackupStatsRequestConfig)wbz.a(parcel0, BackupStatsRequestConfig.CREATOR);
                aqgp.gr(parcel0);
                ApplicationBackupStats[] arr_applicationBackupStats1 = this.d(backupStatsRequestConfig1);
                parcel1.writeNoException();
                parcel1.writeTypedArray(arr_applicationBackupStats1, 1);
                return true;
            }
            case 3: {
                ApplicationBackupStats applicationBackupStats0 = (ApplicationBackupStats)wbz.a(parcel0, ApplicationBackupStats.CREATOR);
                aqgp.gr(parcel0);
                this.b(applicationBackupStats0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                long v6 = parcel0.readLong();
                BackupStatsRequestConfig backupStatsRequestConfig2 = (BackupStatsRequestConfig)wbz.a(parcel0, BackupStatsRequestConfig.CREATOR);
                aqgp.gr(parcel0);
                ApplicationBackupStats[] arr_applicationBackupStats2 = this.a.a(backupStatsRequestConfig2) ? this.a.b(v6, backupStatsRequestConfig2) : null;
                parcel1.writeNoException();
                parcel1.writeTypedArray(arr_applicationBackupStats2, 1);
                return true;
            }
            case 5: {
                long v7 = parcel0.readLong();
                String s2 = parcel0.readString();
                BackupStatsRequestConfig backupStatsRequestConfig3 = (BackupStatsRequestConfig)wbz.a(parcel0, BackupStatsRequestConfig.CREATOR);
                aqgp.gr(parcel0);
                BackupStatsChimeraService backupStatsChimeraService1 = this.a;
                if(backupStatsChimeraService1.a(backupStatsRequestConfig3)) {
                    try {
                        Account[] arr_account = new adgg(backupStatsChimeraService1).e(backupStatsChimeraService1);
                        v8 = 0;
                        while(true) {
                        label_128:
                            if(v8 < arr_account.length) {
                                account1 = arr_account[v8];
                                break;
                            }
                            goto label_138;
                        }
                    }
                    catch(RemoteException | azqj | azqi unused_ex) {
                        BackupStatsChimeraService.a.m("Unable to get the accounts on the device.", new Object[0]);
                        goto label_138;
                    }
                    if(s2.equals(account1.name)) {
                        account2 = account1;
                    }
                    else {
                        ++v8;
                        goto label_128;
                    label_138:
                        account2 = null;
                    }
                    if(account2 == null) {
                        BackupStatsChimeraService.a.f("Failed to find the account on the device.", new Object[0]);
                        arr_parcelable = null;
                        parcel1.writeNoException();
                        parcel1.writeTypedArray(arr_parcelable, 1);
                        return true;
                    }
                    else {
                        try {
                            s3 = aqxr.d(backupStatsChimeraService1, account2, "android");
                        }
                        catch(aqxu unused_ex) {
                            BackupStatsChimeraService.a.f("Failed to get auth token for account.", new Object[0]);
                            arr_parcelable = null;
                            parcel1.writeNoException();
                            parcel1.writeTypedArray(arr_parcelable, 1);
                            return true;
                        }
                        arr_parcelable = backupStatsChimeraService1.c(account2, v7, s3, backupStatsRequestConfig3);
                    }
                }
                else {
                    arr_parcelable = null;
                }
                parcel1.writeNoException();
                parcel1.writeTypedArray(arr_parcelable, 1);
                return true;
            }
            case 6: {
                String s4 = parcel0.readString();
                long v9 = parcel0.readLong();
                aqgp.gr(parcel0);
                this.c(s4, v9);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                this.a();
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}


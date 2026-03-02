package com.google.android.gms.backup.extension.download;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings.Secure;
import aqql;
import arsv;
import arsy;
import arth;
import arto;
import arts;
import artu;
import artv;
import artw;
import arue;
import baun;
import bbdg;
import ccmq;
import cljp;
import clkn;
import clko;
import cllb;
import cllc;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import gful_cronetEngineProvider;
import gfus;
import gged_interceptors;
import ggna;
import gibu;
import hqil;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CustomBackupDownloadStarterTask extends GmsTaskBoundService {
    private static final baun a;
    private final gful_cronetEngineProvider b;

    static {
        CustomBackupDownloadStarterTask.a = new aqql(new String[]{"CustomDownloadStarterTask"});
    }

    public CustomBackupDownloadStarterTask() {
        this.b = gfus.a(((gful_cronetEngineProvider)new arth()));
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        ccmq.a().a(bbdg.mi);
        arsv arsv0 = new arsv(this);
        arue arue0 = new arue(this);
        artw artw0 = new artw(this);
        arsy arsy0 = new arsy(this);
        if(!arsv.k()) {
            CustomBackupDownloadStarterTask.a.j("Server flag says not to run the operation", new Object[0]);
            arsy0.f(2);
            return 0;
        }
        arto arto0 = arsv0.b;
        long v = System.currentTimeMillis();
        artu artu0 = arto0.b();
        if((artu0.b & 4) == 0) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)artu.a).w(((ProtoLiteMessage)artu0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            artu artu1 = (artu)hftp0.b_message;
            artu1.b |= 4;
            artu1.e = v;
            arto0.c(((artu)hftp0.N_build()));
        }
        else if(v - artu0.e > TimeUnit.DAYS.toMillis(hqil.a.j().j())) {
            CustomBackupDownloadStarterTask.a.j("Number of retries exceeded to run the operation", new Object[0]);
            arsy0.f(9);
            return 2;
        }
        if(!arsv0.i()) {
            CustomBackupDownloadStarterTask.a.j("Restore token not yet available", new Object[0]);
            if(hqil.n()) {
                return 2;
            }
            arsy0.f(3);
            return 1;
        }
        baun baun0 = CustomBackupDownloadStarterTask.a;
        baun0.j("Restore has happened, applying user consent", new Object[0]);
        arto arto1 = arue0.a;
        if(arto1.b().d) {
            arue0.c.d("User consent already applied", new Object[0]);
        }
        else {
            Context context0 = arue0.b;
            String s = Settings.Secure.getString(context0.getContentResolver(), "custom_backup_data_download_selections");
            gged_interceptors gged0 = gged_interceptors.k((s == null ? new String[0] : s.split(",")));
            int v1 = ((ggna)gged0).c;
            for(int v2 = 0; v2 < v1; ++v2) {
                String s1 = (String)gged0.get(v2);
                String s2 = (String)arue0.d.get(s1);
                if(s2 != null) {
                    arue0.c(s2, 2);
                }
            }
            String s3 = Settings.Secure.getString(context0.getContentResolver(), "custom_backup_data_download_unavailable_or_unselected");
            gged_interceptors gged1 = gged_interceptors.k((s3 == null ? new String[0] : s3.split(",")));
            int v3 = ((ggna)gged1).c;
            for(int v4 = 0; v4 < v3; ++v4) {
                String s4 = (String)gged1.get(v4);
                String s5 = (String)arue0.d.get(s4);
                if(s5 != null) {
                    arue0.c(s5, 3);
                }
            }
            artu artu2 = arto1.b();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)artu.a).w(((ProtoLiteMessage)artu2));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            artu artu3 = (artu)hftp1.b_message;
            artu3.b |= 2;
            artu3.d = true;
            arto1.c(((artu)hftp1.N_build()));
        }
        if(!CustomBackupDownloadManagerChimeraService.b) {
            for(Object object0: hqil.i().b) {
                String s6 = (String)object0;
                Intent intent0 = new Intent().setAction("com.google.android.gms.backup.action.CUSTOM_DOWNLOAD").setPackage(s6);
                if(arsv0.a.getPackageManager().resolveService(intent0, 0) != null) {
                    continue;
                }
                artu artu4 = arto0.b();
                Map map0 = arsv0.e();
                if(map0.containsKey(s6)) {
                    arts arts0 = (arts)map0.get(s6);
                    int v5 = arts0.e;
                    if(v5 >= 10) {
                        continue;
                    }
                    arsv0.l(artu4, ((ProtoLiteMessage)arts.a).w(((ProtoLiteMessage)arts0)), v5 + 1, s6);
                }
                else {
                    arsv0.l(artu4, ((ProtoLiteMessage)arts.a).v_newBuilder(), 1, s6);
                }
                baun0.j("All supported packages are not ready", new Object[0]);
                arsy0.f(5);
                return 1;
            }
            if(!arsv0.f()) {
                baun0.j("Supported packages do not have any data to download", new Object[0]);
                arsy0.f(8);
                return 0;
            }
            if(!arsv0.b().isEmpty()) {
                baun0.j("All eligible packages are ready, but there are packages user need to consent", new Object[0]);
                arsy0.f(6);
                if(((Boolean)this.b.mr()).booleanValue()) {
                    arto arto2 = arto.a(this);
                    artu artu5 = arto2.b();
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)artu.a).w(((ProtoLiteMessage)artu5));
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    artu artu6 = (artu)hftp2.b_message;
                    artu6.b |= 8;
                    artu6.f = true;
                    arto2.c(((artu)hftp2.N_build()));
                }
                artw0.a(artv.e);
                return 0;
            }
            if(arsv0.j()) {
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gibu.a).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gibu gibu0 = (gibu)hftp3.b_message;
                gibu0.b |= 1;
                gibu0.c = true;
                arsy0.b(((gibu)hftp3.N_build()));
                baun0.j("All conditions satisfied. Starting download manager service", new Object[0]);
                CustomBackupDownloadManagerChimeraService.d(this);
                return 1;
            }
            baun0.j("There is no data remaining to be downloaded", new Object[0]);
            arsy0.f(7);
            return 0;
        }
        baun0.j("There is an existing instance of download manager service..just return", new Object[0]);
        arsy0.f(4);
        return 1;
    }

    static void d(Context context0) {
        baun baun0 = CustomBackupDownloadStarterTask.a;
        baun0.j("Trying to schedule Custom Backup Downloads", new Object[0]);
        new arsv(context0);
        if(!arsv.k()) {
            baun0.j("Server flag says not to schedule the operation", new Object[0]);
            return;
        }
        cllc cllc0 = cllb.a(1, ((int)hqil.a.j().o()), ((int)hqil.a.j().p()));
        long v = hqil.a.j().s();
        long v1 = hqil.a.j().q();
        clkn clkn0 = new clkn();
        clkn0.w(CustomBackupDownloadStarterTask.class.getName());
        clkn0.e(v, v1);
        clkn0.t("com.google.android.gms.backup.extension.download.START_DOWNLOAD");
        clkn0.y(1, 1);
        clkn0.p = true;
        clkn0.v(1);
        clkn0.t = cllc0;
        clko clko0 = clkn0.a();
        baun0.d("Task will run between %s and %s seconds", new Object[]{v, v1});
        cljp.a(context0).f(clko0);
    }
}


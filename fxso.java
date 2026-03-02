import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.provider.Settings.Global;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class fxso {
    public final fxtr a;
    public final fxsg b;
    private final Context c;
    private final fxtp d;

    private fxso(Context context0, fxtr fxtr0, fxsg fxsg0, fxtp fxtp0) {
        this.c = context0;
        this.a = fxtr0;
        this.b = fxsg0;
        this.d = fxtp0;
    }

    public final fxsf a(Account account0, fxsf fxsf0, String s, String s1) {
        fxsf fxsf1;
        gzve gzve3;
        gzsx gzsx0;
        gzvd gzvd7;
        gzvd gzvd3;
        Boolean boolean1;
        fxso fxso0;
        Boolean boolean0;
        Context context0;
        fxsg fxsg0;
        int v = this.a.a(account0);
        String s2 = this.c(account0);
        try {
            fxsg0 = this.b;
            context0 = fxsg0.j;
            PackageManager packageManager0 = context0.getPackageManager();
            boolean0 = fxsf0.d;
        }
        catch(acse acse0) {
            fxso0 = this;
            fxso0.d(account0, false);
            throw acse0;
        }
        if(boolean0 == null) {
            goto label_93;
        }
        else {
            try {
                if(boolean0.booleanValue() && (fxsf0.b != null && fxsf0.b.booleanValue())) {
                    if(packageManager0 == null) {
                        goto label_18;
                    }
                    else {
                        goto label_13;
                    }
                    goto label_23;
                }
                else {
                    goto label_93;
                }
                goto label_102;
            }
            catch(acse acse0) {
                fxso0 = this;
                fxso0.d(account0, false);
                throw acse0;
            }
            try {
            label_13:
                if(packageManager0.hasSystemFeature("android.hardware.wifi")) {
                    boolean1 = Boolean.valueOf(bbpg.b(context0));
                }
                else {
                    boolean1 = null;
                    goto label_23;
                label_18:
                    boolean1 = null;
                }
            }
            catch(acse acse0) {
                fxso0 = this;
                fxso0.d(account0, false);
                throw acse0;
            }
            try {
            label_23:
                ContentResolver contentResolver0 = context0.getContentResolver();
                Boolean boolean2 = boolean0;
                boolean z = Settings.Global.getInt(contentResolver0, "low_power", 0) != 0;
                Boolean boolean3 = Boolean.valueOf(z);
                int v1 = Settings.Global.getInt(contentResolver0, "low_power_trigger_level", 0);
                Integer integer0 = v1;
                int v2 = gzti.a(cjer_LocationSettings.a(context0));
                fxva.o(context0);
                cjer_LocationSettings.p(context0);
                azqk.g(context0);
                bbpg.c(context0);
                Objects.toString(boolean3);
                Objects.toString(integer0);
                Objects.toString(boolean1);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gztj.a).v_newBuilder();
                boolean z1 = cjer_LocationSettings.p(context0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gztj)hftv0).b |= 4;
                ((gztj)hftv0).e = z1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gztj gztj0 = (gztj)hftp0.b_message;
                gztj0.b |= 2;
                gztj0.d = true;
                boolean z2 = azqk.g(context0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gztj gztj1 = (gztj)hftp0.b_message;
                gztj1.b |= 8;
                gztj1.f = z2;
                boolean z3 = bbpg.c(context0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gztj gztj2 = (gztj)hftp0.b_message;
                gztj2.b |= 16;
                gztj2.g = z3;
                boolean z4 = fxva.o(context0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gztj gztj3 = (gztj)hftp0.b_message;
                gztj3.b |= 1;
                gztj3.c = z4;
                boolean3.getClass();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gztj gztj4 = (gztj)hftp0.b_message;
                gztj4.b |= 0x100;
                gztj4.j = z;
                integer0.getClass();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gztj gztj5 = (gztj)hftp0.b_message;
                gztj5.b |= 0x200;
                gztj5.k = v1;
                if(boolean1 != null) {
                    boolean z5 = boolean1.booleanValue();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gztj gztj6 = (gztj)hftp0.b_message;
                    gztj6.b |= 0x40;
                    gztj6.i = z5;
                }
                if(v2 != 0) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gztj)hftp0.b_message).h = v2 - 1;
                    ((gztj)hftp0.b_message).b |= 0x20;
                }
                gztj gztj7 = (gztj)hftp0.N_build();
                goto label_102;
            label_93:
                boolean2 = boolean0;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gztj.a).v_newBuilder();
                boolean z6 = cjer_LocationSettings.p(context0);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gztj gztj8 = (gztj)hftp1.b_message;
                gztj8.b |= 4;
                gztj8.e = z6;
                gztj7 = (gztj)hftp1.N_build();
            label_102:
                gzvd gzvd0 = gzvd.a;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gzvd0).v_newBuilder();
                if(boolean2 != null) {
                    boolean z7 = boolean2.booleanValue();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gzvd gzvd1 = (gzvd)hftp2.b_message;
                    gzvd1.b |= 2;
                    gzvd1.d = z7;
                }
                Long long0 = fxsf0.a;
                if(long0 == null) {
                    gzvd3 = gzvd0;
                }
                else {
                    long v3 = (long)long0;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gzvd gzvd2 = (gzvd)hftp2.b_message;
                    gzvd3 = gzvd0;
                    gzvd2.b |= 1;
                    gzvd2.c = v3;
                }
                Boolean boolean4 = fxsf0.b;
                if(boolean4 != null) {
                    boolean z8 = boolean4.booleanValue();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gzvd gzvd4 = (gzvd)hftp2.b_message;
                    gzvd4.b |= 4;
                    gzvd4.e = z8;
                }
                if(gztj7 != null) {
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((gzvd)hftp2.b_message).k = gztj7;
                    ((gzvd)hftp2.b_message).b |= 0x800;
                }
                if(hzeq.c()) {
                    Boolean boolean5 = fxsf0.f;
                    if(boolean5 != null) {
                        if(!hzeq.a.b().h()) {
                            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gztt.a).v_newBuilder();
                            boolean z9 = boolean5.booleanValue();
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ProtoLiteMessage hftv1 = hftp3.b_message;
                            ((gztt)hftv1).b |= 1;
                            ((gztt)hftv1).c = z9;
                            if(!hftv1.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ((gztt)hftp3.b_message).d = 4;
                            ((gztt)hftp3.b_message).b |= 4;
                            gztt gztt0 = (gztt)hftp3.N_build();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            gzvd gzvd5 = (gzvd)hftp2.b_message;
                            gztt0.getClass();
                            gzvd5.f = gztt0;
                            gzvd5.b |= 8;
                        }
                        else if(boolean5.booleanValue()) {
                            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gztt.a).v_newBuilder();
                            if(!hftp4.b_message.isImmutable()) {
                                hftp4.ensureMutable();
                            }
                            ProtoLiteMessage hftv2 = hftp4.b_message;
                            ((gztt)hftv2).b |= 1;
                            ((gztt)hftv2).c = true;
                            if(!hftv2.isImmutable()) {
                                hftp4.ensureMutable();
                            }
                            ((gztt)hftp4.b_message).d = 4;
                            ((gztt)hftp4.b_message).b |= 4;
                            gztt gztt1 = (gztt)hftp4.N_build();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            gzvd gzvd6 = (gzvd)hftp2.b_message;
                            gztt1.getClass();
                            gzvd6.f = gztt1;
                            gzvd6.b |= 8;
                        }
                    }
                }
                gzvd7 = (gzvd)hftp2.N_build();
                gzsx0 = (gzsx)fxsg0.c(s2, true).N_build();
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gzve.a).v_newBuilder();
                String s3 = fxsf0.e;
                if(s3 != null) {
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    gzve gzve0 = (gzve)hftp5.b_message;
                    gzve0.b |= 1;
                    gzve0.c = s3;
                }
                String s4 = fxsf0.c;
                if(s4 != null) {
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    gzve gzve1 = (gzve)hftp5.b_message;
                    gzve1.b |= 2;
                    gzve1.d = s4;
                }
                if(s1 != null) {
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    gzve gzve2 = (gzve)hftp5.b_message;
                    gzve2.b |= 4;
                    gzve2.e = s1;
                }
                gzve3 = (gzve)hftp5.N_build();
                goto label_200;
            }
            catch(acse acse0) {
                fxso0 = this;
                fxso0.d(account0, false);
                throw acse0;
            }
        }
        goto label_102;
        try {
        label_200:
            gzwa gzwa0 = gzwa.a;
            ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gzwa0).v_newBuilder();
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp6.b_message;
            ((gzwa)hftv3).b |= 1;
            ((gzwa)hftv3).c = v;
            if(!hftv3.isImmutable()) {
                hftp6.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp6.b_message;
            gzsx0.getClass();
            ((gzwa)hftv4).d = gzsx0;
            ((gzwa)hftv4).b |= 2;
            if(!hftv4.isImmutable()) {
                hftp6.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp6.b_message;
            gzvd7.getClass();
            ((gzwa)hftv5).e = gzvd7;
            ((gzwa)hftv5).b |= 4;
            if(!hftv5.isImmutable()) {
                hftp6.ensureMutable();
            }
            gzwa gzwa1 = (gzwa)hftp6.b_message;
            gzve3.getClass();
            gzwa1.f = gzve3;
            gzwa1.b |= 8;
            gzwa gzwa2 = (gzwa)hftp6.N_build();
            fxrd.a("UlrRpcDevSetSettings", "UlrRpcBetaSetSettings", "UlrRpcProdSetSettings", 3);
            if(fxrc.q()) {
                fxrc.a.v();
            }
            fxsp fxsp0 = new fxsp(fxsg.i, cmlp.a, ckir.b);
            baqr baqr0 = fxsg.a(context0, account0);
            if(fxsp.c == null) {
                ibjh ibjh0 = new ibjh(((MessageLite)gzwa0));
                ibjh ibjh1 = new ibjh(((MessageLite)gzvz.a));
                fxsp.c = new gRPCMethodDescriptor(gRPCMethodType.a, "userlocation.UserLocationReportingService/SetApiSettings", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
            }
            gzvz gzvz0 = (gzvz)fxsp0.g.callUnaryWithAuth(fxsp.c, baqr0, gzwa2, 10000L, TimeUnit.MILLISECONDS, fxsp0.h);
            fxrd.a("UlrRpcDevSetSettings", "UlrRpcBetaSetSettings", "UlrRpcProdSetSettings", 1);
            fxrc.n(true);
            fxsf1 = fxsf.b(account0, (gzvz0.b == null ? gzvd3 : gzvz0.b));
        }
        catch(iapl | acse exception0) {
            try {
                fxso0 = this;
                fxrd.a("UlrRpcDevSetSettings", "UlrRpcBetaSetSettings", "UlrRpcProdSetSettings", 2);
                fxrc.n(false);
                throw exception0;
            }
            catch(acse acse0) {
                fxso0.d(account0, false);
                throw acse0;
            }
        }
        try {
            boolean z10 = fxso.g(fxsf1);
            fxqw.c("GCoreUlrLong", "sendSettings(" + s + "): sent " + fxsf0.toString() + ", got back " + fxsf1.toString() + "; success: " + z10);
        }
        catch(acse acse0) {
            fxso0 = this;
            fxso0.d(account0, false);
            throw acse0;
        }
        if(z10) {
            try {
                fxso0 = this;
                fxso0.f(account0, s2);
                fxso0.e(fxsf1);
                goto label_257;
            label_256:
                fxso0 = this;
            label_257:
                fxso0.d(account0, true);
                return fxsf1;
            }
            catch(acse acse0) {
                fxso0.d(account0, false);
                throw acse0;
            }
        }
        else {
            goto label_256;
        }
        goto label_257;
    }

    public static fxso b(Context context0) {
        Context context1;
        Integer integer1;
        fxva.g(context0);
        fxvd.a(context0);
        fxtr fxtr0 = fxtr.b(context0);
        fxva.g(context0);
        int v = bbms.a(context0);
        Integer integer0 = (int)0;
        try {
            ModuleManager.ModuleInfo moduleManager$ModuleInfo0 = ModuleManager.get(context0).getCurrentModule();
            integer1 = (int)moduleManager$ModuleInfo0.moduleApk.apkVersionCode;
            integer0 = (int)moduleManager$ModuleInfo0.moduleVersion;
        }
        catch(IllegalStateException unused_ex) {
            integer1 = integer0;
        }
        Boolean boolean0 = Boolean.valueOf(bbnp.j(context0));
        SensorManager sensorManager0 = (SensorManager)context0.getSystemService("sensor");
        if(sensorManager0 != null) {
            try {
                Sensor sensor0 = sensorManager0.getDefaultSensor(6);
                if(sensor0 != null) {
                    sensor0.getName();
                }
            }
            catch(NullPointerException unused_ex) {
            }
        }
        fxsp fxsp0 = fxsg.i;
        if(fxsp0 == null) {
            context1 = context0;
            bbfe_BaseGrpcServer bbfe0 = new bbfe_BaseGrpcServer(context1, hzeh.a.b().c(), ((int)hzeh.a.b().a()), context0.getApplicationInfo().uid, 0x2200);
            fxqw.c("GCoreUlr", "Grpc compression enabled: " + hzeh.c());
            bbfe0.g = hzeh.c();
            fxsp0 = new fxsp(bbfe0);
        }
        else {
            context1 = context0;
        }
        fxtp fxtp0 = new fxtp(context1);
        return new fxso(context1, fxtr0, new fxsg(context1, fxsp0, v, ((int)integer1), ((int)integer0), boolean0), fxtp0);
    }

    public final String c(Account account0) {
        String s = bsoa.a(this.c);
        if(s == null) {
            fxqw.c("GCoreUlr", "No GCM registration ID");
        }
        if(s != null) {
            Long long0 = this.a.c(account0).p;
            return long0 != null && System.currentTimeMillis() - ((long)long0) <= TimeUnit.DAYS.toMillis(7L) ? null : s;
        }
        return null;
    }

    public final void d(Account account0, boolean z) {
        this.a.e(account0);
        synchronized(fxtr.b) {
            fxtu fxtu0 = this.a.d;
            if(account0 != null) {
                String s = fxtu.e(account0);
                long v1 = fxtu0.a.getLong(s, -1L);
                Long long0 = v1;
                SharedPreferences.Editor sharedPreferences$Editor0 = fxtu0.a.edit();
                sharedPreferences$Editor0.putBoolean(fxtu.f(account0), z);
                if(z) {
                    sharedPreferences$Editor0.putLong(fxtu.e(account0), -1L);
                }
                else {
                    long v2 = System.currentTimeMillis();
                    Long long1 = v2;
                    long0.getClass();
                    if(v1 == -1L) {
                        String s1 = fxtu.e(account0);
                        long1.getClass();
                        sharedPreferences$Editor0.putLong(s1, v2);
                        long0 = long1;
                    }
                    TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                    long1.getClass();
                    fxra.l("UlrAccountAuthenticationFailureDuration", timeUnit0.toMinutes(v2 - ((long)long0)));
                    TimeUnit timeUnit1 = TimeUnit.MILLISECONDS;
                    long1.getClass();
                    fxqw.f(("Account has been under authentication error for " + timeUnit1.toMinutes(v2 - ((long)long0)) + " minutes"));
                }
                sharedPreferences$Editor0.apply();
            }
        }
    }

    public final void e(fxsf fxsf0) {
        if(!fxsf0.c().isEmpty()) {
            ArrayList arrayList0 = new ArrayList(fxsf0.c());
            Intent intent0 = bbmq.j(new Intent("com.google.android.gms.location.reporting.DELETE_OPERATION"));
            intent0.putParcelableArrayListExtra("deletions", arrayList0);
            this.d.b.sendBroadcast(intent0);
            Intent intent1 = fxtk.a(this.c, "com.google.android.gms.location.reporting.DELETE_OPERATION");
            intent1.putExtra("deletions", arrayList0);
            fxva.p(this.c, intent1);
        }
    }

    public final void f(Account account0, String s) {
        this.a.e(account0);
        synchronized(fxtr.b) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.a.d.a.edit();
            if(s != null) {
                sharedPreferences$Editor0.putLong(fxtu.h(account0), System.currentTimeMillis());
            }
            sharedPreferences$Editor0.apply();
        }
    }

    public static final boolean g(fxsf fxsf0) {
        if(fxsf0 == null) {
            return false;
        }
        switch(fxsf0.h) {
            case 0: {
                return true;
            }
            case 3: {
                return fxsf0.i != 2;
            }
            default: {
                return false;
            }
        }
    }
}


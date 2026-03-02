import android.accounts.Account;
import android.os.Parcel;
import com.google.android.location.reporting.service.InternalPreferenceChimeraServiceDoNotUse;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import j..util.Objects;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class fxst extends wby implements fxsu {
    final InternalPreferenceChimeraServiceDoNotUse a;

    public fxst() {
        super("com.google.android.location.reporting.service.IPreferenceService");
    }

    public fxst(InternalPreferenceChimeraServiceDoNotUse internalPreferenceChimeraServiceDoNotUse0) {
        Objects.requireNonNull(internalPreferenceChimeraServiceDoNotUse0);
        this.a = internalPreferenceChimeraServiceDoNotUse0;
        super("com.google.android.location.reporting.service.IPreferenceService");
    }

    @Override  // fxsu
    public final AccountConfig a(Account account0) {
        return this.a.a.c(account0);
    }

    @Override  // fxsu
    public final List b(Account account0) {
        fxsn fxsn0;
        gzvp gzvp2;
        gzvp gzvp0;
        fxsg fxsg0;
        String s;
        int v;
        fxso fxso0;
        batl.k("Cannot call from UI thread.");
        try {
            try {
                try {
                    fxso0 = this.a.b;
                    v = fxso0.a.a(account0);
                    s = fxso0.c(account0);
                }
                catch(IOException | acse exception0) {
                    goto label_48;
                }
                try {
                    fxsg0 = fxso0.b;
                    gzsx gzsx0 = (gzsx)fxsg0.c(s, true).N_build();
                    gzvp0 = gzvp.a;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzvp0).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((gzvp)hftv0).b |= 1;
                    ((gzvp)hftv0).c = v;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gzvp gzvp1 = (gzvp)hftp0.b_message;
                    gzsx0.getClass();
                    gzvp1.d = gzsx0;
                    gzvp1.b |= 2;
                    gzvp2 = (gzvp)hftp0.N_build();
                }
                catch(acse acse0) {
                    goto label_45;
                }
                catch(IOException exception0) {
                    goto label_48;
                }
            }
            catch(iapl exception0) {
                goto label_48;
            }
            try {
                fxrd.a("UlrRpcDevGetUserSettings", "UlrRpcBetaGetUserSettings", "UlrRpcProdGetUserSettings", 3);
                if(fxrc.q()) {
                    fxrc.a.s();
                }
                fxsp fxsp0 = new fxsp(fxsg.i, cmlp.a, ckip.b);
                baqr baqr0 = fxsg.a(fxsg0.j, account0);
                if(fxsp.b == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)gzvp0));
                    ibjh ibjh1 = new ibjh(((MessageLite)gzvo.a));
                    fxsp.b = new gRPCMethodDescriptor(gRPCMethodType.a, "userlocation.UserLocationReportingService/GetApiUserSettings", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                gzvo gzvo0 = (gzvo)fxsp0.g.callUnaryWithAuth(fxsp.b, baqr0, gzvp2, 10000L, TimeUnit.MILLISECONDS, fxsp0.h);
                fxrd.a("UlrRpcDevGetUserSettings", "UlrRpcBetaGetUserSettings", "UlrRpcProdGetUserSettings", 1);
                fxrc.k(true);
                fxsn0 = fxsn.a(account0, (gzvo0.b == null ? gzvg.a : gzvo0.b));
                goto label_38;
            }
            catch(iapl | acse exception1) {
            }
            catch(IOException exception0) {
                goto label_48;
            }
            try {
                try {
                    fxrd.a("UlrRpcDevGetUserSettings", "UlrRpcBetaGetUserSettings", "UlrRpcProdGetUserSettings", 2);
                    fxrc.k(false);
                    throw exception1;
                label_38:
                    fxsf fxsf0 = fxsn0.a;
                    if(fxso.g(fxsf0)) {
                        fxso0.f(account0, s);
                        fxso0.e(fxsf0);
                    }
                    fxso0.d(account0, true);
                    return fxsn0.b;
                }
                catch(acse acse0) {
                }
                catch(IOException exception0) {
                    goto label_48;
                }
                try {
                label_45:
                    fxso0.d(account0, false);
                    throw acse0;
                }
                catch(IOException | acse exception0) {
                    goto label_48;
                }
            }
            catch(iapl exception0) {
                goto label_48;
            }
        }
        catch(NullPointerException exception0) {
        label_48:
            fxqw.g("Couldn\'t get remote devices", exception0);
            return null;
        }
    }

    @Override  // fxsu
    public final List c(Account account0, int v, boolean z, String s) {
        fxsn fxsn0;
        fxsg fxsg0;
        String s1;
        int v1;
        fxso fxso0;
        batl.k("Cannot call from UI thread.");
        try {
            try {
                try {
                    fxso0 = this.a.b;
                    v1 = fxso0.a.a(account0);
                    s1 = fxso0.c(account0);
                }
                catch(IOException | acse exception0) {
                    goto label_82;
                }
                try {
                    fxsg0 = fxso0.b;
                }
                catch(IOException exception0) {
                    goto label_82;
                }
            }
            catch(iapl exception0) {
                goto label_82;
            }
            try {
                gzvy gzvy0 = gzvy.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzvy0).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzvy gzvy1 = (gzvy)hftp0.b_message;
                gzvy1.b |= 1;
                gzvy1.c = v1;
                gzsx gzsx0 = (gzsx)fxsg0.c(s1, true).N_build();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzve.a).v_newBuilder();
                if(s != null) {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gzve gzve0 = (gzve)hftp1.b_message;
                    gzve0.b |= 4;
                    gzve0.e = s;
                }
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((gzve)hftv0).b |= 1;
                ((gzve)hftv0).c = "com.google.android.gms+remote";
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gzve gzve1 = (gzve)hftp1.b_message;
                gzve1.b |= 2;
                gzve1.d = "com.google.android.gms+remote";
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                gzsx0.getClass();
                ((gzvy)hftv1).e = gzsx0;
                ((gzvy)hftv1).b |= 4;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp0.b_message;
                ((gzvy)hftv2).b |= 2;
                ((gzvy)hftv2).d = v;
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzvy gzvy2 = (gzvy)hftp0.b_message;
                gzvy2.b |= 8;
                gzvy2.f = z;
                gzve gzve2 = (gzve)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzvy gzvy3 = (gzvy)hftp0.b_message;
                gzve2.getClass();
                gzvy3.g = gzve2;
                gzvy3.b |= 16;
                gzvy gzvy4 = (gzvy)hftp0.N_build();
                fxrd.a("UlrRpcDevSetRemoteDeviceSettings", "UlrRpcBetaSetRemoteDeviceSettings", "UlrRpcProdSetRemoteDeviceSettings", 3);
                if(fxrc.q()) {
                    fxrc.a.u();
                }
                fxsp fxsp0 = new fxsp(fxsg.i, cmlp.a, ckiq.b);
                baqr baqr0 = fxsg.a(fxsg0.j, account0);
                if(fxsp.d == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)gzvy0));
                    ibjh ibjh1 = new ibjh(((MessageLite)gzvx.a));
                    fxsp.d = new gRPCMethodDescriptor(gRPCMethodType.a, "userlocation.UserLocationReportingService/SetApiRemoteDeviceSettings", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                gzvx gzvx0 = (gzvx)fxsp0.g.callUnaryWithAuth(fxsp.d, baqr0, gzvy4, 10000L, TimeUnit.MILLISECONDS, fxsp0.h);
                fxrd.a("UlrRpcDevSetRemoteDeviceSettings", "UlrRpcBetaSetRemoteDeviceSettings", "UlrRpcProdSetRemoteDeviceSettings", 1);
                fxrc.m(true);
                fxsn0 = fxsn.a(account0, (gzvx0.b == null ? gzvg.a : gzvx0.b));
                goto label_72;
            }
            catch(iapl | acse exception1) {
            }
            catch(IOException exception0) {
                goto label_82;
            }
            try {
                try {
                    fxrd.a("UlrRpcDevSetRemoteDeviceSettings", "UlrRpcBetaSetRemoteDeviceSettings", "UlrRpcProdSetRemoteDeviceSettings", 2);
                    fxrc.m(false);
                    throw exception1;
                label_72:
                    fxsf fxsf0 = fxsn0.a;
                    if(fxso.g(fxsf0)) {
                        fxso0.f(account0, s1);
                        fxso0.e(fxsf0);
                    }
                    fxso0.d(account0, true);
                    return fxsn0.b;
                }
                catch(acse acse0) {
                }
                catch(IOException exception0) {
                    goto label_82;
                }
                try {
                    fxso0.d(account0, false);
                    throw acse0;
                }
                catch(IOException | acse exception0) {
                    goto label_82;
                }
            }
            catch(iapl exception0) {
                goto label_82;
            }
        }
        catch(NullPointerException exception0) {
        label_82:
            fxqw.g("Couldn\'t set remote device reporting enabled", exception0);
            return null;
        }
    }

    @Override  // fxsu
    public final void d(Account account0, String s, boolean z, String s1) {
        fxud fxud0 = new fxud(account0, "com.google.android.gms+settings+" + s);
        fxud0.h();
        Boolean boolean0 = Boolean.valueOf(z);
        fxud0.g = boolean0;
        fxud0.f = boolean0;
        fxud0.g();
        fxud0.q = s1;
        fxue fxue0 = new fxue(fxud0);
        this.a.a.l("PrefService.setHistoryEnabled", fxue0, "ui_update");
        if(!fxrc.q()) {
            return;
        }
        fxrc.a.i(z);
    }

    @Override  // fxsu
    public final void e(Account account0, String s, boolean z, String s1) {
        fxud fxud0 = new fxud(account0, "com.google.android.gms+settings+" + s);
        fxud0.h();
        fxud0.f = Boolean.valueOf(z);
        fxud0.g();
        fxud0.q = s1;
        fxue fxue0 = new fxue(fxud0);
        this.a.a.l("PrefService.setReportingEnabled", fxue0, "ui_update");
        if(!fxrc.q()) {
            return;
        }
        fxrc.a.j(z);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                ReportingConfig reportingConfig0 = this.a.a.d();
                parcel1.writeNoException();
                wbz.g(parcel1, reportingConfig0);
                return true;
            }
            case 2: {
                Account account0 = (Account)wbz.a(parcel0, Account.CREATOR);
                fxst.gr(parcel0);
                AccountConfig accountConfig0 = this.a(account0);
                parcel1.writeNoException();
                wbz.g(parcel1, accountConfig0);
                return true;
            }
            case 3: {
                Account account1 = (Account)wbz.a(parcel0, Account.CREATOR);
                String s = parcel0.readString();
                boolean z = wbz.i(parcel0);
                String s1 = parcel0.readString();
                fxst.gr(parcel0);
                this.e(account1, s, z, s1);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                Account account2 = (Account)wbz.a(parcel0, Account.CREATOR);
                String s2 = parcel0.readString();
                boolean z1 = wbz.i(parcel0);
                String s3 = parcel0.readString();
                fxst.gr(parcel0);
                this.d(account2, s2, z1, s3);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                Account account3 = (Account)wbz.a(parcel0, Account.CREATOR);
                fxst.gr(parcel0);
                List list0 = this.b(account3);
                parcel1.writeNoException();
                parcel1.writeTypedList(list0);
                return true;
            }
            case 6: {
                Account account4 = (Account)wbz.a(parcel0, Account.CREATOR);
                int v1 = parcel0.readInt();
                boolean z2 = wbz.i(parcel0);
                String s4 = parcel0.readString();
                fxst.gr(parcel0);
                List list1 = this.c(account4, v1, z2, s4);
                parcel1.writeNoException();
                parcel1.writeTypedList(list1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}


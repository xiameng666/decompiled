import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.account.authenticator.DefaultAuthDelegateChimeraService;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.delegate.AccountRemovalAllowedWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.ConfirmCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.auth.firstparty.shared.SupervisedAccountOptions;
import com.google.android.gms.auth.uiflows.addaccount.FinishSessionChimeraActivity;
import com.google.android.gms.auth.uiflows.addaccount.StartAddAccountSessionController;
import com.google.android.gms.auth.uiflows.confirmcredentials.ConfirmCredentialsController;
import com.google.android.gms.auth.uiflows.controller.ControllerLauncherChimeraActivity;
import com.google.android.gms.auth.uiflows.gettoken.GetTokenController;
import com.google.android.gms.auth.uiflows.updatecredentials.UpdateCredentialsController;
import j..util.Objects;
import java.util.List;
import java.util.UUID;

public class ajox extends wby implements ajoy {
    public final Context a;

    public ajox() {
        super("com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
    }

    public ajox(Context context0) {
        super("com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
        this.a = context0;
    }

    @Override  // ajoy
    public PendingIntent a(SetupAccountWorkflowRequest setupAccountWorkflowRequest0) {
        ajox.h(this.a);
        String s = setupAccountWorkflowRequest0.h;
        switch(s) {
            case "cn.google": 
            case "com.google": 
            case "com.google.work": {
                Intent intent0 = this.gn(setupAccountWorkflowRequest0);
                intent0.addFlags(0x2000000);
                intent0.addCategory("FLAG_ACTIVITY_FORWARD_RESULT");
                return this.i(intent0, UUID.randomUUID().toString());
            }
            default: {
                throw new IllegalStateException("Unknown account type:" + s);
            }
        }
    }

    @Override  // ajoy
    public final PendingIntent b(AccountRemovalAllowedWorkflowRequest accountRemovalAllowedWorkflowRequest0) {
        ajox.h(this.a);
        Account account0 = accountRemovalAllowedWorkflowRequest0.b;
        boolean z = accountRemovalAllowedWorkflowRequest0.c;
        Intent intent0 = new Intent().setClassName(this.a, "com.google.android.gms.auth.uiflows.removeaccount.GetAccountRemovalAllowedActivity").putExtra("am_response", accountRemovalAllowedWorkflowRequest0.a).putExtra("account", account0).putExtra("show_lock_screen", z);
        if(hoxf.i()) {
            intent0.addCategory("Account:" + ajox.o(account0));
            intent0.addCategory("lockscr:" + z);
            intent0.addCategory("Workflow:AccountRemovalAllowed");
        }
        return this.i(intent0, UUID.randomUUID().toString());
    }

    @Override  // ajoy
    public PendingIntent c(StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest0) {
        Context context0 = this.a;
        ajox.h(context0);
        String s = startAddAccountSessionWorkflowRequest0.e;
        if(!"com.google".equals(s) && !"com.google.work".equals(s)) {
            throw new IllegalStateException("Account type is not supported.");
        }
        String s1 = startAddAccountSessionWorkflowRequest0.a().getString(acsf.b);
        List list0 = startAddAccountSessionWorkflowRequest0.b();
        return list0 == null ? this.i(ControllerLauncherChimeraActivity.a(context0, new StartAddAccountSessionController(startAddAccountSessionWorkflowRequest0.f, s, startAddAccountSessionWorkflowRequest0.g, startAddAccountSessionWorkflowRequest0.a().getBoolean("deferredSetup"), startAddAccountSessionWorkflowRequest0.h, bagx.b(startAddAccountSessionWorkflowRequest0.a()), startAddAccountSessionWorkflowRequest0.i, startAddAccountSessionWorkflowRequest0.j, new String[0], s1, SupervisedAccountOptions.b(startAddAccountSessionWorkflowRequest0.a()), startAddAccountSessionWorkflowRequest0.k, startAddAccountSessionWorkflowRequest0.d, startAddAccountSessionWorkflowRequest0.l)), UUID.randomUUID().toString()) : this.i(ControllerLauncherChimeraActivity.a(context0, new StartAddAccountSessionController(startAddAccountSessionWorkflowRequest0.f, s, startAddAccountSessionWorkflowRequest0.g, startAddAccountSessionWorkflowRequest0.a().getBoolean("deferredSetup"), startAddAccountSessionWorkflowRequest0.h, bagx.b(startAddAccountSessionWorkflowRequest0.a()), startAddAccountSessionWorkflowRequest0.i, startAddAccountSessionWorkflowRequest0.j, ((String[])list0.toArray(new String[list0.size()])), s1, SupervisedAccountOptions.b(startAddAccountSessionWorkflowRequest0.a()), startAddAccountSessionWorkflowRequest0.k, startAddAccountSessionWorkflowRequest0.d, startAddAccountSessionWorkflowRequest0.l)), UUID.randomUUID().toString());
    }

    @Override  // ajoy
    public Bundle d(SetupAccountWorkflowRequest setupAccountWorkflowRequest0) {
        ajox.h(this.a);
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("gms_delegate_pending_intent", this.a(setupAccountWorkflowRequest0));
        fnck fnck0 = new fnck(setupAccountWorkflowRequest0.n, setupAccountWorkflowRequest0.c, setupAccountWorkflowRequest0.a().getBoolean("isSetupFlow", false), setupAccountWorkflowRequest0.j, bauc.n(D2dOptions.b(setupAccountWorkflowRequest0.e)), setupAccountWorkflowRequest0.p, setupAccountWorkflowRequest0.a().getString(acsf.b), setupAccountWorkflowRequest0.k, setupAccountWorkflowRequest0.q, setupAccountWorkflowRequest0.a().getBoolean("firstRun", false), new fnct(setupAccountWorkflowRequest0.r, setupAccountWorkflowRequest0.u, (setupAccountWorkflowRequest0.d == null ? ggna.a : gged_interceptors.i(setupAccountWorkflowRequest0.d))), setupAccountWorkflowRequest0.x);
        scv.b(bundle0, fnch.d.x(fnck0));
        return bundle0;
    }

    @Override  // ajoy
    public PendingIntent e(FinishSessionWorkflowRequest finishSessionWorkflowRequest0) {
        ajox.h(this.a);
        finishSessionWorkflowRequest0.a();
        AccountAuthenticatorResponse accountAuthenticatorResponse0 = finishSessionWorkflowRequest0.d;
        Bundle bundle0 = finishSessionWorkflowRequest0.a();
        return this.i(FinishSessionChimeraActivity.a(this.a, accountAuthenticatorResponse0, finishSessionWorkflowRequest0.c, bundle0), UUID.randomUUID().toString());
    }

    @Override  // ajoy
    public PendingIntent f(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest0) {
        Context context0 = this.a;
        ajox.h(context0);
        if(updateCredentialsWorkflowRequest0.e == null) {
            throw new IllegalStateException("Account is required to update credentials.");
        }
        Intent intent0 = ControllerLauncherChimeraActivity.a(context0, new UpdateCredentialsController(updateCredentialsWorkflowRequest0.f, updateCredentialsWorkflowRequest0.e, bagx.b(updateCredentialsWorkflowRequest0.a()), true));
        if(hoxf.i()) {
            intent0.addCategory("Account:" + ajox.o(updateCredentialsWorkflowRequest0.e));
            intent0.addCategory("Workflow:StartUpdateCredentialsSession");
        }
        return this.i(intent0, UUID.randomUUID().toString());
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                SetupAccountWorkflowRequest setupAccountWorkflowRequest0 = (SetupAccountWorkflowRequest)wbz.a(parcel0, SetupAccountWorkflowRequest.CREATOR);
                ajox.gr(parcel0);
                PendingIntent pendingIntent0 = this.a(setupAccountWorkflowRequest0);
                parcel1.writeNoException();
                wbz.g(parcel1, pendingIntent0);
                return true;
            }
            case 2: {
                TokenWorkflowRequest tokenWorkflowRequest0 = (TokenWorkflowRequest)wbz.a(parcel0, TokenWorkflowRequest.CREATOR);
                ajox.gr(parcel0);
                PendingIntent pendingIntent1 = this.j(tokenWorkflowRequest0);
                parcel1.writeNoException();
                wbz.g(parcel1, pendingIntent1);
                return true;
            }
            case 3: {
                UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest0 = (UpdateCredentialsWorkflowRequest)wbz.a(parcel0, UpdateCredentialsWorkflowRequest.CREATOR);
                ajox.gr(parcel0);
                PendingIntent pendingIntent2 = this.k(updateCredentialsWorkflowRequest0);
                parcel1.writeNoException();
                wbz.g(parcel1, pendingIntent2);
                return true;
            }
            case 4: {
                ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest0 = (ConfirmCredentialsWorkflowRequest)wbz.a(parcel0, ConfirmCredentialsWorkflowRequest.CREATOR);
                ajox.gr(parcel0);
                PendingIntent pendingIntent3 = this.g(confirmCredentialsWorkflowRequest0);
                parcel1.writeNoException();
                wbz.g(parcel1, pendingIntent3);
                return true;
            }
            case 5: {
                StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest0 = (StartAddAccountSessionWorkflowRequest)wbz.a(parcel0, StartAddAccountSessionWorkflowRequest.CREATOR);
                ajox.gr(parcel0);
                PendingIntent pendingIntent4 = this.c(startAddAccountSessionWorkflowRequest0);
                parcel1.writeNoException();
                wbz.g(parcel1, pendingIntent4);
                return true;
            }
            case 6: {
                UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest1 = (UpdateCredentialsWorkflowRequest)wbz.a(parcel0, UpdateCredentialsWorkflowRequest.CREATOR);
                ajox.gr(parcel0);
                PendingIntent pendingIntent5 = this.f(updateCredentialsWorkflowRequest1);
                parcel1.writeNoException();
                wbz.g(parcel1, pendingIntent5);
                return true;
            }
            case 7: {
                FinishSessionWorkflowRequest finishSessionWorkflowRequest0 = (FinishSessionWorkflowRequest)wbz.a(parcel0, FinishSessionWorkflowRequest.CREATOR);
                ajox.gr(parcel0);
                PendingIntent pendingIntent6 = this.e(finishSessionWorkflowRequest0);
                parcel1.writeNoException();
                wbz.g(parcel1, pendingIntent6);
                return true;
            }
            case 8: {
                AccountRemovalAllowedWorkflowRequest accountRemovalAllowedWorkflowRequest0 = (AccountRemovalAllowedWorkflowRequest)wbz.a(parcel0, AccountRemovalAllowedWorkflowRequest.CREATOR);
                ajox.gr(parcel0);
                PendingIntent pendingIntent7 = this.b(accountRemovalAllowedWorkflowRequest0);
                parcel1.writeNoException();
                wbz.g(parcel1, pendingIntent7);
                return true;
            }
            case 9: {
                SetupAccountWorkflowRequest setupAccountWorkflowRequest1 = (SetupAccountWorkflowRequest)wbz.a(parcel0, SetupAccountWorkflowRequest.CREATOR);
                ajox.gr(parcel0);
                Bundle bundle0 = this.d(setupAccountWorkflowRequest1);
                parcel1.writeNoException();
                wbz.g(parcel1, bundle0);
                return true;
            }
            case 10: {
                TokenWorkflowRequest tokenWorkflowRequest1 = (TokenWorkflowRequest)wbz.a(parcel0, TokenWorkflowRequest.CREATOR);
                ajox.gr(parcel0);
                Bundle bundle1 = this.n(tokenWorkflowRequest1);
                parcel1.writeNoException();
                wbz.g(parcel1, bundle1);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // ajoy
    public final PendingIntent g(ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest0) {
        ajox.h(this.a);
        ConfirmCredentialsController confirmCredentialsController0 = new ConfirmCredentialsController(confirmCredentialsWorkflowRequest0.f, confirmCredentialsWorkflowRequest0.e, false, bagx.b(new Bundle(confirmCredentialsWorkflowRequest0.d)));
        Intent intent0 = ControllerLauncherChimeraActivity.a(this.a, confirmCredentialsController0);
        if(hoxf.i()) {
            intent0.addCategory("Account:" + ajox.o(confirmCredentialsWorkflowRequest0.e));
            intent0.addCategory("Workflow:ConfirmCredentials");
        }
        return this.i(intent0, UUID.randomUUID().toString());
    }

    public Intent gn(SetupAccountWorkflowRequest setupAccountWorkflowRequest0) {
        String s = setupAccountWorkflowRequest0.a().getString(acsf.b);
        List list0 = setupAccountWorkflowRequest0.b();
        AccountAuthenticatorResponse accountAuthenticatorResponse0 = setupAccountWorkflowRequest0.i;
        boolean z = setupAccountWorkflowRequest0.c;
        boolean z1 = setupAccountWorkflowRequest0.x;
        boolean z2 = setupAccountWorkflowRequest0.k;
        bagx bagx0 = bagx.b(setupAccountWorkflowRequest0.e);
        boolean z3 = Objects.equals(setupAccountWorkflowRequest0.h, "cn.google") || setupAccountWorkflowRequest0.j;
        return amcg.d.a(this.a, new amcf(setupAccountWorkflowRequest0.h, accountAuthenticatorResponse0, z, z1, z2, bagx0, z3, setupAccountWorkflowRequest0.n, setupAccountWorkflowRequest0.l, setupAccountWorkflowRequest0.m, (list0 == null || list0.isEmpty() ? ggna.a : gged_interceptors.i(list0)), s, setupAccountWorkflowRequest0.o, setupAccountWorkflowRequest0.p, setupAccountWorkflowRequest0.q, setupAccountWorkflowRequest0.r, setupAccountWorkflowRequest0.s, setupAccountWorkflowRequest0.t, D2dOptions.b(setupAccountWorkflowRequest0.e), setupAccountWorkflowRequest0.u, setupAccountWorkflowRequest0.w, setupAccountWorkflowRequest0.a().getBoolean("firstRun", false), setupAccountWorkflowRequest0.a().getBoolean("deferredSetup", false), setupAccountWorkflowRequest0.a().getBoolean("preDeferredSetup", false), setupAccountWorkflowRequest0.a().getBoolean("isSetupFlow", false), false, false));
    }

    public static void h(Context context0) {
        if(hpbs.a.b().e() && (hpbs.a.b().b() || Binder.getCallingUid() != 1000 && bbsr.b(context0).a("android.permission.ACCOUNT_MANAGER") != 0) && !bbmq.Y(context0)) {
            ((ggtj)DefaultAuthDelegateChimeraService.a.j()).x("Only 0p apps are allowed to call this API.");
            throw new SecurityException("Only 0p apps are allowed to call this API.");
        }
    }

    private PendingIntent i(Intent intent0, String s) {
        if(!hoxf.k()) {
            intent0.addCategory("categoryhack:sessionid=" + s);
        }
        intent0.addCategory("defaultPendingIntent");
        return cjok.a(this.a, 0, intent0, 0x2000000);
    }

    @Override  // ajoy
    public final PendingIntent j(TokenWorkflowRequest tokenWorkflowRequest0) {
        return this.l(this.m(tokenWorkflowRequest0), UUID.randomUUID().toString());
    }

    @Override  // ajoy
    public final PendingIntent k(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest0) {
        ajox.h(this.a);
        UpdateCredentialsController updateCredentialsController0 = new UpdateCredentialsController(updateCredentialsWorkflowRequest0.f, updateCredentialsWorkflowRequest0.e, bagx.b(updateCredentialsWorkflowRequest0.a()), false);
        Intent intent0 = ControllerLauncherChimeraActivity.a(this.a, updateCredentialsController0);
        if(hoxf.i()) {
            intent0.addCategory("Account:" + ajox.o(updateCredentialsWorkflowRequest0.e));
            intent0.addCategory("Workflow:UpdateCredentials");
        }
        return this.i(intent0, UUID.randomUUID().toString());
    }

    private final PendingIntent l(Intent intent0, String s) {
        if(!hoxf.k()) {
            intent0.addCategory("categoryhack:sessionid=" + s);
        }
        intent0.addCategory("saferPendingIntent");
        return fqaw.c(this.a.getApplicationContext(), 0, intent0, 0);
    }

    private final Intent m(TokenWorkflowRequest tokenWorkflowRequest0) {
        Intent intent0;
        boolean z = true;
        Context context0 = this.a;
        ajox.h(context0);
        Bundle bundle0 = tokenWorkflowRequest0.a();
        boolean z1 = bundle0.getBoolean("UseCache");
        Account account0 = tokenWorkflowRequest0.h;
        batl.s(account0);
        TokenRequest tokenRequest0 = new TokenRequest(account0, tokenWorkflowRequest0.a);
        tokenRequest0.l = z1;
        tokenRequest0.f(bundle0);
        tokenRequest0.i = tokenWorkflowRequest0.g;
        tokenRequest0.w = tokenWorkflowRequest0.j;
        if(hphj.a.b().a()) {
            if(!hoxf.k() && !hoxf.i()) {
                z = false;
            }
            intent0 = bxjs.a(context0, tokenRequest0, z);
        }
        else {
            intent0 = ControllerLauncherChimeraActivity.a(context0, new GetTokenController(tokenWorkflowRequest0.i, tokenRequest0, tokenWorkflowRequest0.f, false, bagx.b(tokenWorkflowRequest0.a()), 0));
        }
        if(hoxf.i()) {
            intent0.addCategory("Account:" + ajox.o(tokenWorkflowRequest0.h));
            intent0.addCategory("callingapp:" + tokenWorkflowRequest0.g.e);
            String s = tokenWorkflowRequest0.a;
            String s1 = "";
            if(s != null) {
                byte[] arr_b = bbmq.aa(s, "SHA-256");
                if(arr_b != null) {
                    s1 = bbmu.a(arr_b);
                }
            }
            intent0.addCategory("service:" + s1);
            intent0.addCategory("progressux:" + tokenWorkflowRequest0.f);
            intent0.addCategory("Workflow:TokenRetrieval");
        }
        return intent0;
    }

    @Override  // ajoy
    public final Bundle n(TokenWorkflowRequest tokenWorkflowRequest0) {
        ajox.h(this.a);
        Bundle bundle0 = new Bundle();
        Intent intent0 = this.m(tokenWorkflowRequest0);
        bundle0.putParcelable("gms_delegate_pending_intent", this.l(intent0, UUID.randomUUID().toString()));
        scv.b(bundle0, amcq.d.i(this.a, intent0));
        return bundle0;
    }

    private static String o(Account account0) {
        if(account0 != null) {
            byte[] arr_b = bbmq.aa((account0.name + account0.type), "SHA-256");
            return arr_b == null ? "" : bboy.c(arr_b);
        }
        return "";
    }
}


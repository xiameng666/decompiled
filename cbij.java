import android.accounts.Account;
import android.app.Application;
import android.webkit.CookieManager;
import com.google.android.gms.kids.libs.webview.BaseWebViewViewModel.AuthState.Authenticated;
import com.google.android.gms.kids.libs.webview.BaseWebViewViewModel.AuthState.Initializing;
import com.google.android.gms.kids.libs.webview.BaseWebViewViewModel.AuthState.Unauthenticated;
import com.google.android.gms.kids.libs.webview.BaseWebViewViewModel.AuthState;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public final class cbij extends lny {
    public static final bboh a;
    public final ibrt b;
    public final String c;
    public final List d;
    public final icnj e;
    public final icnj f;
    public final icnj g;
    public final icnj h;
    public final icnl i;
    public final icnl j;
    public final icnl k;
    private final icnl l;

    static {
        cbij.a = bboh.b("BaseWebViewViewModel", bbcu.ac);
    }

    public cbij(Application application0, ibrt ibrt0, String s, List list0) {
        ibuq.f(ibrt0, "blockingContext");
        super(application0);
        this.b = ibrt0;
        this.c = s;
        this.d = list0;
        icnl icnl0 = icnm.a(cbhw.a);
        this.i = icnl0;
        this.e = new icmp(icnl0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvlp.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        icnl icnl1 = icnm.a(((gvlp)hftv0));
        this.j = icnl1;
        this.f = new icmp(icnl1);
        icnl icnl2 = icnm.a(Boolean.valueOf(true));
        this.k = icnl2;
        this.g = new icmp(icnl2);
        icnl icnl3 = icnm.a(BaseWebViewViewModel.AuthState.Initializing.a);
        this.l = icnl3;
        this.h = new icmp(icnl3);
        icbb.b(lsc.a(this), null, null, new cbhm(this, null), 3);
    }

    public final Object b(ibrl ibrl0) {
        cbhz cbhz0;
        if((ibrl0 instanceof cbhz)) {
            cbhz0 = (cbhz)ibrl0;
            int v = cbhz0.c;
            if((v & 0x80000000) == 0) {
                cbhz0 = new cbhz(this, ibrl0);
            }
            else {
                cbhz0.c = v - 0x80000000;
            }
        }
        else {
            cbhz0 = new cbhz(this, ibrl0);
        }
        Object object0 = cbhz0.a;
        Object object1 = ibrx.a;
        switch(cbhz0.c) {
            case 0: {
                ibnx.b(object0);
                cbia cbia0 = new cbia(this, null);
                cbhz0.c = 1;
                object0 = icbd.a(this.b, cbia0, cbhz0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "withContext(...)");
        return object0;
    }

    public final Object c(Account account0, int v, ibrl ibrl0) {
        cbie cbie0 = new cbie(this, account0, v, null);
        Object object0 = icbd.a(this.b, cbie0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object e(String s, ibrl ibrl0) {
        acse acse1;
        IOException iOException1;
        Account account1;
        acsz acsz1;
        Object object2;
        Iterator iterator0;
        cbih cbih0;
        if((ibrl0 instanceof cbih)) {
            cbih0 = (cbih)ibrl0;
            int v = cbih0.d;
            if((v & 0x80000000) == 0) {
                cbih0 = new cbih(this, ibrl0);
            }
            else {
                cbih0.d = v - 0x80000000;
            }
        }
        else {
            cbih0 = new cbih(this, ibrl0);
        }
        Object object0 = cbih0.b;
        Object object1 = ibrx.a;
        switch(cbih0.d) {
            case 0: {
                ibnx.b(object0);
                icnl icnl0 = this.l;
                BaseWebViewViewModel.AuthState baseWebViewViewModel$AuthState0 = (BaseWebViewViewModel.AuthState)icnl0.b();
                if((baseWebViewViewModel$AuthState0 instanceof BaseWebViewViewModel.AuthState.Authenticated) && ibuq.m(((BaseWebViewViewModel.AuthState.Authenticated)baseWebViewViewModel$AuthState0).a.name, s)) {
                    return Boolean.valueOf(true);
                }
                if(s == null) {
                    cbij.h();
                    icnl0.g(BaseWebViewViewModel.AuthState.Unauthenticated.a);
                    return Boolean.valueOf(true);
                }
                cbih0.a = s;
                cbih0.d = 1;
                object0 = this.b(cbih0);
                if(object0 != object1) {
                    iterator0 = ((Iterable)object0).iterator();
                    goto label_31;
                }
                return object1;
            }
            case 1: {
                s = (String)cbih0.a;
                ibnx.b(object0);
                iterator0 = ((Iterable)object0).iterator();
            label_31:
                while(iterator0.hasNext()) {
                    object2 = iterator0.next();
                    if(!ibuq.m(((Account)object2).name, s)) {
                        continue;
                    }
                    goto label_36;
                }
                object2 = null;
            label_36:
                Account account0 = (Account)object2;
                if(account0 == null) {
                    ((ggtj)cbij.a.j()).B("Couldn\'t find account %s", s);
                    return Boolean.valueOf(false);
                }
                try {
                    cbij.h();
                    cbih0.a = account0;
                    cbih0.d = 2;
                    if(this.c(account0, 1, cbih0) != object1) {
                        account1 = account0;
                        goto label_62;
                    }
                    return object1;
                }
                catch(acsz acsz0) {
                    acsz1 = acsz0;
                    account1 = account0;
                    break;
                }
                catch(IOException iOException0) {
                    iOException1 = iOException0;
                    account1 = account0;
                    cbij.i(iOException1, account1);
                    this.l.g(BaseWebViewViewModel.AuthState.Unauthenticated.a);
                    return Boolean.valueOf(false);
                }
                catch(acse acse0) {
                    acse1 = acse0;
                    account1 = account0;
                    cbij.i(acse1, account1);
                    this.l.g(BaseWebViewViewModel.AuthState.Unauthenticated.a);
                    return Boolean.valueOf(false);
                }
                account1 = account0;
                goto label_62;
            }
            case 2: {
                account1 = (Account)cbih0.a;
                try {
                    ibnx.b(object0);
                label_62:
                    BaseWebViewViewModel.AuthState.Authenticated baseWebViewViewModel$AuthState$Authenticated0 = new BaseWebViewViewModel.AuthState.Authenticated(account1);
                    this.l.g(baseWebViewViewModel$AuthState$Authenticated0);
                    return Boolean.valueOf(true);
                }
                catch(acsz acsz1) {
                    break;
                }
                catch(IOException iOException1) {
                    cbij.i(iOException1, account1);
                    this.l.g(BaseWebViewViewModel.AuthState.Unauthenticated.a);
                    return Boolean.valueOf(false);
                }
                catch(acse acse1) {
                    cbij.i(acse1, account1);
                    this.l.g(BaseWebViewViewModel.AuthState.Unauthenticated.a);
                    return Boolean.valueOf(false);
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((ggtj)((ggtj)cbij.a.j()).s(acsz1)).B("Couldn\'t get and set cookies for %s with recoverable exception. Not retrying", account1.name);
        this.l.g(BaseWebViewViewModel.AuthState.Unauthenticated.a);
        return Boolean.valueOf(false);
    }

    public final void f(int v) {
        icbb.b(lsc.a(this), null, null, new cbib(this, v, null), 3);
    }

    public final void g() {
        icbb.b(lsc.a(this), null, null, new cbic(this, null), 3);
    }

    private static final void h() {
        CookieManager cookieManager0 = CookieManager.getInstance();
        cookieManager0.removeAllCookies(new cbhl(cookieManager0));
    }

    private static final void i(Exception exception0, Account account0) {
        if(!(exception0 instanceof IOException) && !(exception0 instanceof acse)) {
            return;
        }
        ((ggtj)((ggtj)cbij.a.j()).s(exception0)).B("Couldn\'t get and set cookies for %s with unrecoverable exception.", account0.name);
    }
}


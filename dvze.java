import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import android.view.View;
import com.google.android.material.button.MaterialButton;

public abstract class dvze extends dokz {
    public static final bboh a;
    public edoa ag;
    public edoi ah;
    public boolean ai;
    public boolean aj;
    public View ak;
    public CancellationSignal al;
    public azts am;
    private boolean an;
    private acp ao;
    private final ednu ap;
    public Account b;
    public Context c;
    public ednv d;

    static {
        dvze.a = bboh.b("Pay", bbcu.cZ);
    }

    public dvze() {
        this.al = new CancellationSignal();
        this.ap = new dvzb(this);
    }

    public final Context B() {
        Context context0 = this.c;
        if(context0 != null) {
            return context0;
        }
        ibuq.j("applicationContext");
        return null;
    }

    protected final void D() {
        if(hwvf.e()) {
            this.al.cancel();
        }
    }

    protected final void E(View view0) {
        ibuq.f(view0, "rootView");
        this.ak = view0.findViewById(0x7F0B009D);  // id:AuthenticationPromptView
        MaterialButton materialButton0 = (MaterialButton)view0.findViewById(0x7F0B0970);  // id:UsePasswordButton
        this.aj = false;
        this.ai = false;
        this.an = false;
    }

    public final void H() {
        ((ggtj)dvze.a.h()).x("User authentication completed successfully.");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftjq.a).v_newBuilder();
        String s = this.y().name;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftjq ftjq0 = (ftjq)hftp0.b_message;
        s.getClass();
        ftjq0.d = s;
        ftjl ftjl0 = ftjl.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftjq ftjq1 = (ftjq)hftp0.b_message;
        ftjl0.getClass();
        ftjq1.c = ftjl0;
        ftjq1.b = 8;
        byte[] arr_b = ((ftjq)hftp0.N_build()).toBytesArray();
        azts azts0 = this.am;
        if(azts0 == null) {
            ibuq.j("firstPartyPayClient");
            azts0 = null;
        }
        azts0.bf(arr_b).z(new dvyz(this));
    }

    public abstract void L();

    public final void N() {
        synchronized(this) {
            if(this.ai) {
                return;
            }
            this.ai = true;
        }
        View view0 = null;
        if(this.aj) {
            View view1 = this.ak;
            if(view1 == null) {
                ibuq.j("authenticationPrompt");
            }
            else {
                view0 = view1;
            }
            view0.setVisibility(8);
            this.ai = false;
            this.L();
            return;
        }
        edoi edoi0 = this.ah;
        if(edoi0 == null) {
            ibuq.j("velocityCheck");
        }
        else {
            view0 = edoi0;
        }
        ((edoi)view0).a(new dvzd(this));
    }

    protected final boolean O() {
        synchronized(this) {
            if(this.ai) {
                return true;
            }
            this.ai = true;
        }
        if(this.aj) {
            View view0 = this.ak;
            if(view0 == null) {
                ibuq.j("authenticationPrompt");
                view0 = null;
            }
            view0.setVisibility(8);
            this.ai = false;
            return false;
        }
        return this.R();
    }

    public final boolean R() {
        ednv ednv0 = this.d;
        edoa edoa0 = null;
        if(ednv0 == null) {
            ibuq.j("deviceLockChecker");
            ednv0 = null;
        }
        if(!ednv0.a()) {
            Intent intent0 = dlnf.bb(this.B(), this.getString(0x7F15233E));  // string:pay_valuable_save_create_screen_lock_title "Secure your phone with a screen 
                                                                             // lock to add this card"
            synchronized(this) {
                this.an = true;
                this.ai = false;
            }
            acp acp0 = this.ao;
            if(acp0 == null) {
                ibuq.j("deviceLockActivityResultLauncher");
            }
            else {
                edoa0 = acp0;
            }
            ibuq.c(intent0);
            ((acp)edoa0).b(intent0);
            ((ggtj)dvze.a.h()).x("Awaiting user to set up device lock.");
            return true;
        }
        xob xob0 = this.an();
        if(xob0 == null) {
            this.ai = false;
            return false;
        }
        this.al.cancel();
        this.al = new CancellationSignal();
        edoa edoa1 = this.ag;
        if(edoa1 == null) {
            ibuq.j("keyguardManagerUtil");
        }
        else {
            edoa0 = edoa1;
        }
        edoa0.b(xob0, this.al, this.ap);
        return true;
    }

    public static final void S(dvze dvze0) {
        dvze0.ai = false;
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        if(v == 5) {
            bboh bboh0 = dvze.a;
            ((ggtj)bboh0.h()).z("User auth result: %s", v1);
            this.aj = v1 == -1;
            if(v1 != -1) {
                this.ai = false;
                View view0 = this.ak;
                if(view0 == null) {
                    ibuq.j("authenticationPrompt");
                    view0 = null;
                }
                view0.setVisibility(8);
                ((ggtj)bboh0.h()).x("Failed to authenticate user.");
                return;
            }
            this.H();
            return;
        }
        super.onActivityResult(v, v, intent0);
    }

    @Override  // dokz
    public void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        this.ao = this.registerForActivityResult(new adt(), new dvzc(this));
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        if(hwvf.e()) {
            boolean z = this.an;
            this.an = false;
            if(!this.aj && z) {
                if(hwfk.af()) {
                    this.N();
                    return;
                }
                this.O();
            }
        }
    }

    public final Account y() {
        Account account0 = this.b;
        if(account0 != null) {
            return account0;
        }
        ibuq.j("account");
        return null;
    }
}


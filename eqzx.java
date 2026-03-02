import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;

public abstract class eqzx extends cjtm {
    protected Integer a;
    protected final eraf b;
    private boolean c;

    public eqzx(String s, eraf eraf0, azug azug0) {
        super(0xF3, s, azug0);
        this.b = eraf0;
    }

    public void b() {
        this.c = true;
    }

    protected void c(BootstrapCompletionResult bootstrapCompletionResult0) {
        this.j(Status.d);
    }

    protected abstract void d(Context arg1);

    protected abstract void e(Status arg1);

    @Override  // cjtm
    protected final void f(Context context0) {
        this.d(context0);
        if(!hyja.c()) {
            this.b.e(this, Status.b);
        }
    }

    protected void g(int v) {
        this.a = v;
    }

    protected final void h() {
        String s;
        Integer integer0 = this.a;
        if(integer0 != null) {
            int v = (int)integer0;
            int v1 = (int)this.a;
            switch(v1) {
                case 10900: {
                    s = "QUICKSTART_ALREADY_STARTED";
                    break;
                }
                case 10901: {
                    s = "QUICKSTART_NOT_STARTED";
                    break;
                }
                case 10902: {
                    s = "INVALID_WIFI_NETWORK_DETAILS";
                    break;
                }
                case 10903: {
                    s = "IOS_FAILED_TO_ENROLL_CRYPTAUTH";
                    break;
                }
                case 10904: {
                    s = "IOS_APP_BACKGROUNDED";
                    break;
                }
                case 10905: {
                    s = "SOURCE_FALLBACK_SKIPPED";
                    break;
                }
                default: {
                    s = epzh.a(v1);
                }
            }
            throw new cjuh(v, "QuickStart error occurred during operation: " + s);
        }
        if(!this.c) {
            return;
        }
        throw new cjuh(16, "Operation cancelled by client");
    }

    protected void i() {
        this.j(Status.d);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.e(status0);
        this.b.e(this, status0);
    }

    protected void k(int v) {
        this.j(Status.d);
    }

    protected void l(Bundle bundle0) {
        this.j(Status.d);
    }
}


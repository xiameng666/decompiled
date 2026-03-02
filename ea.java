import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class ea extends aao implements jtv {
    final ef a;
    final lpw b;
    boolean c;
    boolean d;
    boolean e;

    public ea() {
        this.a = new ef(new dz(this));
        this.b = new lpw(this);
        this.e = true;
        this.getSavedStateRegistry().b("android:support:lifecycle", new dv(this));
        this.addOnConfigurationChangedListener(new dw(this));
        dx dx0 = new dx(this);
        this.i.add(dx0);
        this.i(new dy(this));
    }

    final View a(View view0, String s, Context context0, AttributeSet attributeSet0) {
        return this.a.b(view0, s, context0, attributeSet0);
    }

    final void b() {
        while(ea.c(this.getSupportFragmentManager(), lpf.c)) {
        }
    }

    private static boolean c(fm fm0, lpf lpf0) {
        int v = 0;
        for(Object object0: fm0.o()) {
            du du0 = (du)object0;
            if(du0 != null) {
                if(du0.getHost() != null) {
                    v |= ea.c(du0.getChildFragmentManager(), lpf0);
                }
                if(du0.aa != null && ((lpw)du0.aa.getLifecycle()).b.a(lpf.d)) {
                    du0.aa.a.g(lpf0);
                    v = 1;
                }
                if(du0.Z.b.a(lpf.d)) {
                    du0.Z.g(lpf0);
                    v = 1;
                }
            }
        }
        return v != 0;
    }

    @Override  // android.app.Activity
    public final void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        super.dump(s, fileDescriptor0, printWriter0, arr_s);
        if(arr_s != null && arr_s.length != 0) {
            String s1 = arr_s[0];
            switch(s1.hashCode()) {
                case 0xD98C2911: {
                    if(s1.equals("--translation")) {
                        return;
                    }
                    break;
                }
                case 0x5FD0F67: {
                    if(s1.equals("--dump-dumpable")) {
                        goto label_10;
                    }
                    break;
                }
                case 0x1C2B8816: {
                    if(s1.equals("--list-dumpables")) {
                    label_10:
                        if(Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                }
                case 0x4519F64D: {
                    if(s1.equals("--contentcapture")) {
                        return;
                    }
                    break;
                }
                case 1455016274: {
                    if(s1.equals("--autofill")) {
                        return;
                    }
                }
            }
        }
        printWriter0.print(s);
        printWriter0.print("Local FragmentActivity ");
        printWriter0.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter0.println(" State:");
        printWriter0.print(s + "  ");
        printWriter0.print("mCreated=");
        printWriter0.print(this.c);
        printWriter0.print(" mResumed=");
        printWriter0.print(this.d);
        printWriter0.print(" mStopped=");
        printWriter0.print(this.e);
        if(this.getApplication() != null) {
            lup.a(this).f(s + "  ", fileDescriptor0, printWriter0, arr_s);
        }
        this.a.a().M(s, fileDescriptor0, printWriter0, arr_s);
    }

    public final fm getSupportFragmentManager() {
        return this.a.a();
    }

    @Override  // aao
    protected void onActivityResult(int v, int v1, Intent intent0) {
        this.a.j();
        super.onActivityResult(v, v1, intent0);
    }

    @Override  // aao
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.b.f(lpe.ON_CREATE);
        this.a.d();
    }

    @Override  // android.app.Activity
    public final View onCreateView(View view0, String s, Context context0, AttributeSet attributeSet0) {
        View view1 = this.a(view0, s, context0, attributeSet0);
        return view1 == null ? super.onCreateView(view0, s, context0, attributeSet0) : view1;
    }

    @Override  // android.app.Activity
    public final View onCreateView(String s, Context context0, AttributeSet attributeSet0) {
        View view0 = this.a(null, s, context0, attributeSet0);
        return view0 == null ? super.onCreateView(s, context0, attributeSet0) : view0;
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.a.e();
        this.b.f(lpe.ON_DESTROY);
    }

    @Override  // aao
    public boolean onMenuItemSelected(int v, MenuItem menuItem0) {
        if(super.onMenuItemSelected(v, menuItem0)) {
            return true;
        }
        return v == 6 ? this.a.k(menuItem0) : false;
    }

    @Override  // android.app.Activity
    protected final void onPause() {
        super.onPause();
        this.d = false;
        this.a.f();
        this.b.f(lpe.ON_PAUSE);
    }

    @Override  // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.b.f(lpe.ON_RESUME);
        this.a.g();
    }

    @Override  // aao
    public final void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        this.a.j();
        super.onRequestPermissionsResult(v, arr_s, arr_v);
    }

    @Override  // android.app.Activity
    protected void onResume() {
        this.a.j();
        super.onResume();
        this.d = true;
        this.a.m();
    }

    @Override  // android.app.Activity
    protected void onStart() {
        ef ef0 = this.a;
        ef0.j();
        super.onStart();
        this.e = false;
        if(!this.c) {
            this.c = true;
            ef0.c();
        }
        ef0.m();
        this.b.f(lpe.ON_START);
        ef0.h();
    }

    @Override  // android.app.Activity
    public final void onStateNotSaved() {
        this.a.j();
    }

    @Override  // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.e = true;
        this.b();
        this.a.i();
        this.b.f(lpe.ON_STOP);
    }

    @Override  // jtv
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int v) {
    }
}


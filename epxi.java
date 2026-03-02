import com.google.android.gms.smartdevice.d2d.AuthenticatingUser;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.directtransfer.AccountPickerOptions;
import com.google.android.gms.smartdevice.directtransfer.UiCustomization;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class epxi {
    public ArrayList a;
    public final Map b;
    public boolean c;
    public boolean d;
    public AccountPickerOptions e;
    public AuthenticatingUser f;
    public UiCustomization g;
    private boolean h;

    public epxi() {
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = false;
        this.d = false;
        this.h = false;
    }

    public final BootstrapConfigurations a() {
        if(this.h) {
            if(this.a != null && !this.a.isEmpty()) {
                throw new IllegalArgumentException("Cannot set bootstrap accounts when accountPicker is enabled");
            }
            if(this.f == null || (this.e == null || !this.e.h)) {
                goto label_8;
            }
            throw new IllegalArgumentException("KidsOnboarding flow shouldn\'t have authenticatingUser provided.");
        }
        if(this.a == null || this.a.isEmpty()) {
            throw new IllegalArgumentException("Must specify bootstrap accounts unless accountPicker is enabled");
        }
        if(this.f != null && this.a.size() > 1) {
            throw new IllegalArgumentException("Can only specify one bootstrap account when authenticatingUser is present");
        }
    label_8:
        BootstrapConfigurations bootstrapConfigurations0 = new BootstrapConfigurations();
        bootstrapConfigurations0.s(this.a);
        bootstrapConfigurations0.u(this.b);
        bootstrapConfigurations0.i = this.c;
        bootstrapConfigurations0.b.add(Integer.valueOf(8));
        bootstrapConfigurations0.f = this.d;
        bootstrapConfigurations0.b.add(Integer.valueOf(5));
        bootstrapConfigurations0.j = false;
        bootstrapConfigurations0.b.add(Integer.valueOf(9));
        bootstrapConfigurations0.q = false;
        bootstrapConfigurations0.b.add(Integer.valueOf(16));
        bootstrapConfigurations0.r = this.h;
        bootstrapConfigurations0.b.add(Integer.valueOf(17));
        bootstrapConfigurations0.s = this.e;
        bootstrapConfigurations0.b.add(Integer.valueOf(18));
        bootstrapConfigurations0.r(this.f);
        bootstrapConfigurations0.x(false);
        bootstrapConfigurations0.v = this.g;
        bootstrapConfigurations0.b.add(Integer.valueOf(21));
        return bootstrapConfigurations0;
    }

    public final void b(String s, String s1) {
        batl.s(s1);
        this.b.put(s, s1);
    }

    public final void c() {
        this.h = true;
    }
}


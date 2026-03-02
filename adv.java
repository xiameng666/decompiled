import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.view.LayoutInflater;

public final class adv extends ContextWrapper {
    public int a;
    private static Configuration b;
    private Resources.Theme c;
    private LayoutInflater d;
    private Configuration e;
    private Resources f;

    public adv() {
        super(null);
    }

    public adv(Context context0, int v) {
        super(context0);
        this.a = v;
    }

    public adv(Context context0, Resources.Theme resources$Theme0) {
        super(context0);
        this.c = resources$Theme0;
    }

    public final Resources a() {
        if(this.f == null) {
            Configuration configuration0 = this.e;
            if(configuration0 != null) {
                if(adv.b == null) {
                    Configuration configuration1 = new Configuration();
                    configuration1.fontScale = 0.0f;
                    adv.b = configuration1;
                }
                if(!configuration0.equals(adv.b)) {
                    this.f = this.createConfigurationContext(this.e).getResources();
                    return this.f;
                }
            }
            this.f = super.getResources();
        }
        return this.f;
    }

    public final void b(Configuration configuration0) {
        if(this.f != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if(this.e != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.e = new Configuration(configuration0);
    }

    private final void c() {
        if(this.c == null) {
            this.c = this.a().newTheme();
            Resources.Theme resources$Theme0 = this.getBaseContext().getTheme();
            if(resources$Theme0 != null) {
                this.c.setTo(resources$Theme0);
            }
        }
        this.c.applyStyle(this.a, true);
    }

    @Override  // android.content.ContextWrapper
    public final AssetManager getAssets() {
        return this.a().getAssets();
    }

    @Override  // android.content.ContextWrapper
    public final Resources getResources() {
        return this.a();
    }

    @Override  // android.content.ContextWrapper
    public final Object getSystemService(String s) {
        if("layout_inflater".equals(s)) {
            if(this.d == null) {
                this.d = LayoutInflater.from(this.getBaseContext()).cloneInContext(this);
            }
            return this.d;
        }
        return this.getBaseContext().getSystemService(s);
    }

    @Override  // android.content.ContextWrapper
    public final Resources.Theme getTheme() {
        Resources.Theme resources$Theme0 = this.c;
        if(resources$Theme0 != null) {
            return resources$Theme0;
        }
        if(this.a == 0) {
            this.a = 0x7F160C05;  // style:Theme.AppCompat.Light
        }
        this.c();
        return this.c;
    }

    @Override  // android.content.ContextWrapper
    public final void setTheme(int v) {
        if(this.a != v) {
            this.a = v;
            this.c();
        }
    }
}


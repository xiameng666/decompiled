import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public abstract class abut extends avyp {
    public static final bboh j;
    public static abut k;
    public boolean l;
    public final bxd m;
    public final List n;
    public final bzt o;
    protected final cjai p;

    static {
        abut.j = bboh.b("GoogleSettingsActivity", bbcu.dH);
        abut.k = null;
    }

    public abut() {
        this.l = false;
        this.m = new bxd();
        this.n = DesugarCollections.synchronizedList(new ArrayList());
        this.o = new bzt();
        this.p = cjai.c();
    }

    protected abstract Intent a(int arg1, String arg2);

    protected abstract bbse g(CharSequence arg1, int arg2);

    protected final void l(int v, bbse bbse0) {
        this.m.put(Integer.valueOf(v), bbse0);
    }

    protected final void m(int v, int v1) {
        this.l(v, this.g(this.getText(v1), v));
        ArrayList arrayList0 = new ArrayList();
        this.o.h(v, arrayList0);
    }

    protected final void n(int v, int v1) {
        bbse bbse0 = (bbse)this.m.get(Integer.valueOf(0));
        if(bbse0 == null) {
            throw new IllegalArgumentException("No SettingsCategory found for id 0");
        }
        List list0 = (List)bzu.a(this.o, v);
        if(list0 != null && !list0.isEmpty()) {
            Intent intent0 = this.a(v1, this.getResources().getString(v1));
            bbsj bbsj0 = new bbsj(this);
            bbsj0.r(v1);
            bauc.j(list0, intent0, "items");
            bbsj0.m(intent0);
            bbsj0.i(true);
            if(!bbse0.l(bbsj0)) {
                bbse0.k(bbsj0);
            }
        }
    }

    private final void o(Menu menu0) {
        MenuItem menuItem0 = menu0.findItem(0x7F0B2040);  // id:show_hide_debug
        if(this.p.f(this)) {
            menuItem0.setTitle(0x7F150872);  // string:common_hide_debug "Hide debug items"
        }
        else {
            menuItem0.setTitle(0x7F1508DC);  // string:common_show_debug "Show debug items"
        }
        menuItem0.setVisible(hrpn.d());
    }

    @Override  // avyp
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(azqk.g(this)) {
            bboh bboh0 = abut.j;
            ((ggtj)bboh0.i()).x("Cannot run for restricted users.");
            Intent intent0 = this.getIntent();
            if(intent0 != null) {
                ComponentName componentName0 = intent0.getComponent();
                if(componentName0 != null) {
                    bbmq.F(this, componentName0);
                    ((ggtj)bboh0.j()).B("Disabling %s", componentName0);
                }
            }
            this.finish();
            return;
        }
        im im0 = this.hL();
        if(im0 != null) {
            im0.o(true);
        }
        this.p();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        this.getMenuInflater().inflate(0x7F10000D, menu0);  // menu:core_google_settings_menu
        cjai cjai0 = this.p;
        if(cjai0.k(this) && cjai0.m(this)) {
            menu0.findItem(0x7F0B2214).setVisible(true);  // id:system_component_update_settings_item
        }
        if(cjai0.h(this)) {
            this.o(menu0);
        }
        if(cjai0.l(this)) {
            menu0.findItem(0x7F0B240D).setVisible(true);  // id:usage_reporting
        }
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // xni
    public final void onDestroy() {
        if(abut.k == this) {
            abut.k = null;
        }
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        int v = menuItem0.getItemId();
        if(v == 0x7F0B1FD7) {  // id:settings_help
            Uri uri0 = Uri.parse(((String)((gfur_Suppliers)bajn.d).ofInstance_));
            this.p.d(uri0, this);
            return true;
        }
        switch(v) {
            case 0x102002C: {
                this.finish();
                return true;
            }
            case 0x7F0B1FDB: {  // id:settings_oss_licenses
                this.p.e(this);
                return true;
            }
            case 0x7F0B2040: {  // id:show_hide_debug
                SharedPreferences sharedPreferences0 = this.getSharedPreferences("googlesettings", 0);
                int v1 = sharedPreferences0.getBoolean("ShowDebug", false);
                sharedPreferences0.edit().putBoolean("ShowDebug", ((boolean)(v1 ^ 1))).commit();
                if(v1 != 0) {
                    bbse bbse0 = (bbse)this.m.remove(Integer.valueOf(2));
                    if(bbse0 != null) {
                        this.q.N(bbse0);
                        return true;
                    }
                    return true;
                }
                this.p();
                return true;
            }
            case 0x7F0B2214: {  // id:system_component_update_settings_item
                this.startActivity(this.p.a());
                return true;
            }
            case 0x7F0B240D: {  // id:usage_reporting
                this.startActivity(this.p.b(this));
                return true;
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onPrepareOptionsMenu(Menu menu0) {
        if(this.l) {
            this.o(menu0);
        }
        return true;
    }

    private final void p() {
        abut.k = this;
        Bundle bundle0 = new Bundle();
        cjah.b(bundle0, this.n);
        Intent intent0 = new Intent("com.google.android.gms.GOOGLE_SETTINGS_OPERATION").setPackage("com.google.android.gms");
        bundle0.putString("className", "GoogleSettingsActivity");
        intent0.putExtras(bundle0);
        this.startService(intent0);
    }

    @Override  // avyp
    protected final void q(bbsh bbsh0) {
    }

    @Override  // avyp
    public final void r() {
    }
}


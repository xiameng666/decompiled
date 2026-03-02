import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.widget.Spinner;

public final class egpa implements AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener {
    public Spinner a;
    public CheckBox b;
    public final Handler c;
    public final Runnable d;
    public static final int e;
    private WebView f;
    private static azts g;

    static {
    }

    public egpa() {
        this.c = new clht();
        this.d = new egoy(this);
    }

    public final View a(LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
        View view0 = layoutInflater0.inflate(0x7F0E07BE, viewGroup0, false);  // layout:people_settings
        this.a = (Spinner)view0.findViewById(0x7F0B2043);  // id:show_notification_spinner
        ArrayAdapter arrayAdapter0 = new ArrayAdapter(viewGroup0.getContext(), 0x7F0E07BD);  // layout:people_setting_spinner_view
        arrayAdapter0.add("GServices default");
        arrayAdapter0.add("Disable");
        arrayAdapter0.add("Enable");
        this.a.setAdapter(arrayAdapter0);
        this.a.setOnItemSelectedListener(this);
        this.a.setEnabled(false);
        CheckBox checkBox0 = (CheckBox)view0.findViewById(0x7F0B14BC);  // id:force_verbose_log
        this.b = checkBox0;
        checkBox0.setOnCheckedChangeListener(this);
        WebView webView0 = (WebView)view0.findViewById(0x7F0B228C);  // id:text_view
        this.f = webView0;
        webView0.getSettings().setBuiltInZoomControls(true);
        this.f.setWebViewClient(new egoz(this));
        return view0;
    }

    public final void b(xni xni0) {
        bayn.f(xni0).m(1, evuh.a);
        xni0.setTitle("People debug");
        xni0.hL().o(true);
        efol efol0 = new efol();
        efol0.a = 80;
        efom efom0 = efol0.a();
        if(egpa.g == null) {
            egpa.g = new azts(xni0.getApplicationContext(), efon.a, efom0, aztr_settings.a);
        }
    }

    public final void c(MenuInflater menuInflater0, Menu menu0) {
        menuInflater0.inflate(0x7F10002A, menu0);  // menu:people_settings_menu
    }

    public final void d(MenuItem menuItem0) {
        int v = menuItem0.getItemId();
        if(v == 0x7F0B1F3F) {  // id:scroll_to_top
            this.f.pageUp(true);
            return;
        }
        if(v == 0x7F0B1F3E) {  // id:scroll_to_end
            this.g();
        }
    }

    public final void e() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("internal_call_method", "LOAD_LOG");
        evql evql0 = egpa.g.bI(bundle0);
        evql0.b(new egoq(this));
        evql0.A(new egor(this));
        this.h("Loading log...");
        Bundle bundle1 = new Bundle();
        bundle1.putString("internal_call_method", "GET_SHOW_SYNC_NOTIFICATION_ERROR");
        evql evql1 = egpa.g.bI(bundle1);
        evql1.b(new egov(this));
        evql1.A(new egow());
        Bundle bundle2 = new Bundle();
        bundle2.putString("internal_call_method", "GET_FORCE_VERBOSE_LOG");
        evql evql2 = egpa.g.bI(bundle2);
        evql2.b(new egos(this));
        evql2.A(new egot());
    }

    public final void f() {
        this.c.removeCallbacks(this.d);
    }

    public final void g() {
        this.f.pageDown(true);
    }

    public final void h(String s) {
        String s1 = TextUtils.htmlEncode(s);
        this.f.loadDataWithBaseURL("", "<html><body><pre>" + s1 + "</pre></body></html>", "text/html", "UTF-8", "");
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("internal_call_method", "SET_FORCE_VERBOSE_LOG");
        bundle0.putBoolean("internal_call_arg_1", z);
        egpa.g.bI(bundle0).z(new egou());
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("internal_call_method", "SET_SHOW_SYNC_NOTIFICATION_ERROR");
        bundle0.putInt("internal_call_arg_1", v);
        egpa.g.bI(bundle0).z(new egox());
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView0) {
    }
}


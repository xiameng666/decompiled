package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import bbdg;
import bblp;
import bsln;
import bsne;
import bsnf;
import bsng;
import bsni;
import bsnj;
import bsoh;
import bsoo;
import ccmq;
import clht;
import com.google.android.chimera.ContextThemeWrapper;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import gfqz;
import gftb;
import gmcg;
import htgo;
import im;
import java.util.List;
import kex;
import xni;

@GmsCoreVeId(0x3F40B)
public class GcmChimeraDiagnostics extends xni implements View.OnClickListener {
    public static final Handler j;
    boolean k;
    boolean l;
    private TextView m;
    private Button n;
    private MenuItem o;
    private TextView p;
    private SearchView q;
    private bsoh r;
    private String s;
    private List t;
    private final gmcg u;
    private Runnable v;

    static {
        GcmChimeraDiagnostics.j = new clht();
    }

    public GcmChimeraDiagnostics() {
        this.k = false;
        this.u = new bblp(1, 10);
    }

    // Detected as a lambda impl.
    public final void a() {
        synchronized(this) {
            this.t = this.r.c();
            this.runOnUiThread(() -> synchronized(this) {
                StringBuilder stringBuilder0 = new StringBuilder();
                if(this.t != null) {
                    String s = TextUtils.isEmpty(this.q.c()) ? null : gfqz.c(this.q.c().toString());
                    List list0 = this.t;
                    gftb.check(list0);
                    for(Object object0: list0) {
                        String s1 = (String)object0;
                        if(s == null || gfqz.c(s1).contains(s)) {
                            stringBuilder0.append(s1);
                            stringBuilder0.append("\n");
                        }
                    }
                }
                this.p.setText(stringBuilder0.toString());
            });
        }
    }

    // Detected as a lambda impl.
    public final void g() {
        synchronized(this) {
            this.s = this.l ? this.r.a() : this.r.b();
            this.runOnUiThread(() -> synchronized(this) {
                this.m.setText(this.s);
            });
        }
    }

    public final void l() {
        if(this.k) {
            return;
        }
        bsne bsne0 = () -> synchronized(this) {
            this.s = this.l ? this.r.a() : this.r.b();
            this.runOnUiThread(() -> synchronized(this) {
                this.m.setText(this.s);
            });
        };
        this.u.execute(bsne0);
    }

    // Detected as a lambda impl.
    public final void m() {
        synchronized(this) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.t != null) {
                String s = TextUtils.isEmpty(this.q.c()) ? null : gfqz.c(this.q.c().toString());
                List list0 = this.t;
                gftb.check(list0);
                for(Object object0: list0) {
                    String s1 = (String)object0;
                    if(s == null || gfqz.c(s1).contains(s)) {
                        stringBuilder0.append(s1);
                        stringBuilder0.append("\n");
                    }
                }
            }
            this.p.setText(stringBuilder0.toString());
        }
    }

    // Detected as a lambda impl.
    public final void n() {
        synchronized(this) {
            this.m.setText(this.s);
        }
    }

    private final void o() {
        this.n.setText((this.k ? "Status" : "Events"));
        int v = 0;
        this.m.setVisibility((this.k ? 8 : 0));
        TextView textView0 = this.p;
        if(!this.k) {
            v = 8;
        }
        textView0.setVisibility(v);
        this.supportInvalidateOptionsMenu();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(!this.k) {
            bsng bsng0 = () -> synchronized(this) {
                this.t = this.r.c();
                this.runOnUiThread(() -> synchronized(this) {
                    StringBuilder stringBuilder0 = new StringBuilder();
                    if(this.t != null) {
                        String s = TextUtils.isEmpty(this.q.c()) ? null : gfqz.c(this.q.c().toString());
                        List list0 = this.t;
                        gftb.check(list0);
                        for(Object object0: list0) {
                            String s1 = (String)object0;
                            if(s == null || gfqz.c(s1).contains(s)) {
                                stringBuilder0.append(s1);
                                stringBuilder0.append("\n");
                            }
                        }
                    }
                    this.p.setText(stringBuilder0.toString());
                });
            };
            this.u.execute(bsng0);
        }
        this.k ^= 1;
        this.o();
        this.l();
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.gR);
        super.onCreate(bundle0);
        bsln.i(this.getApplicationContext());
        if(bsln.d() != 0) {
            this.finish();
            return;
        }
        if(this.r == null) {
            bsoh bsoh0 = new bsoh(this);
            this.r = bsoh0;
            Intent intent0 = new Intent("com.google.android.gms.gcm.GCM_SERVICE_DIAGNOSTICS");
            intent0.setPackage("com.google.android.gms");
            Bundle bundle1 = new Bundle();
            bundle1.putBinder("callback", new bsoo(bsoh0));
            intent0.putExtras(bundle1);
            bsoh0.a.sendBroadcast(intent0);
        }
        this.setTheme(0x7F160BFA);  // style:Theme.AppCompat.DayNight.DarkActionBar
        im im0 = this.hL();
        if(im0 != null) {
            im0.r(false);
        }
        LinearLayout linearLayout0 = new LinearLayout(this);
        linearLayout0.setOrientation(1);
        if(htgo.a.k().as()) {
            kex.b(linearLayout0, new bsnf());
        }
        if(im0 != null) {
            im0.B("FCM Diagnostics");
        }
        LinearLayout linearLayout1 = new LinearLayout(this);
        Button button0 = new Button(this);
        button0.setText("Events");
        linearLayout1.addView(button0);
        button0.setOnClickListener(this);
        this.n = button0;
        linearLayout0.addView(linearLayout1);
        TextView textView0 = new TextView(this);
        this.m = textView0;
        textView0.setMinLines(20);
        this.m.setMovementMethod(new ScrollingMovementMethod());
        linearLayout0.addView(this.m);
        SearchView searchView0 = new SearchView(new ContextThemeWrapper(this, 0x7F160D85));  // style:ThemeOverlay.AppCompat.Dark.ActionBar
        this.q = searchView0;
        searchView0.o = new bsni(this);
        TextView textView1 = new TextView(this);
        this.p = textView1;
        textView1.setMinLines(20);
        this.p.setMovementMethod(new ScrollingMovementMethod());
        linearLayout0.addView(this.p);
        this.o();
        this.l = true;
        this.setContentView(linearLayout0);
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        MenuItem menuItem0 = menu0.add("Advanced view");
        this.o = menuItem0;
        menuItem0.setCheckable(true);
        if(this.k) {
            MenuItem menuItem1 = menu0.add(0x104000C);
            menuItem1.setIcon(0x108004F);
            menuItem1.setActionView(this.q);
            menuItem1.setShowAsActionFlags(9);
        }
        return true;
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0 == this.o) {
            this.l ^= 1;
            this.l();
        }
        return true;
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onPrepareOptionsMenu(Menu menu0) {
        MenuItem menuItem0 = this.o;
        if(menuItem0 != null) {
            menuItem0.setChecked(((boolean)(this.l ^ 1)));
        }
        return super.onPrepareOptionsMenu(menu0);
    }

    @Override  // xni
    public final void onStart() {
        super.onStart();
        bsnj bsnj0 = new bsnj(this);
        this.v = bsnj0;
        bsnj0.run();
    }

    @Override  // xni
    public final void onStop() {
        super.onStop();
        Runnable runnable0 = this.v;
        gftb.check(runnable0);
        GcmChimeraDiagnostics.j.removeCallbacks(runnable0);
    }
}


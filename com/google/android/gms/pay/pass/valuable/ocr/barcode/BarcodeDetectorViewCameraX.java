package com.google.android.gms.pay.pass.valuable.ocr.barcode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import androidx.camera.view.PreviewView;
import bbcu;
import bboh;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import dagger.internal.Preconditions;
import domu;
import domv;
import dvnf;
import dvng;
import dvnh;
import dvnj;
import dvnk;
import fhvw;
import fhwb;
import fhwk;
import fhxi;
import frxp;
import fryr;
import ftts;
import ftux;
import ftuy;
import ftvc;
import fufz;
import gfsx;
import hawd;
import hbia;
import hbsu;
import hbsv;
import hbtf;
import hbtk;
import hbtl;
import hwev;
import hwln;
import ibth;
import lpf;
import lpw;

public class BarcodeDetectorViewCameraX extends RelativeLayout {
    public hbtk a;
    public BarcodeScanner b;
    public gfsx c;
    public fhwk d;
    public fhxi e;
    public fhvw f;
    public fhwb g;
    public String h;
    boolean i;
    public dvnj j;
    dvnk k;
    private ComposeActionBar l;
    private View m;
    private View n;
    private PreviewView o;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public BarcodeDetectorViewCameraX(Context context0) {
        this(context0, null);
    }

    public BarcodeDetectorViewCameraX(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public BarcodeDetectorViewCameraX(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.i = false;
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        this.k = new dvnk(domv0);
    }

    public final void a() {
        hbtk hbtk0 = this.a;
        if(hbtk0 != null) {
            hbtk0.a();
        }
    }

    public final void b(Context context0, dvnf dvnf0, String s) {
        this.k.inject(this);
        this.h = s;
        if(!this.i) {
            LayoutInflater.from(context0).inflate((hwev.c() ? 0x7F0E0D7C : 0x7F0E0D7D), this);  // layout:wallet_pay_barcode_scanner_view_camerax
            if(hwev.c()) {
                ComposeActionBar composeActionBar0 = (ComposeActionBar)this.findViewById(0x7F0B0012);  // id:ActionBar
                this.l = composeActionBar0;
                composeActionBar0.e(new fufz(this.e, this.f));
                ComposeActionBar composeActionBar1 = this.l;
                ftuy ftuy0 = new ftuy();
                ftuy0.d(new frxp(0));
                ftuy0.c(true);
                composeActionBar1.d(ftuy0.a());
            }
            else {
                this.m = this.findViewById(0x7F0B080C);  // id:SkipScanButton
                this.n = this.findViewById(0x7F0B013B);  // id:CancelButton
            }
            this.o = (PreviewView)this.findViewById(0x7F0B06AE);  // id:PreviewView
            this.i = true;
        }
        this.b = ((hbsu)hawd.b().e(hbsu.class)).a(hbsv.a);
        dvnj dvnj0 = new dvnj(this, dvnf0);
        this.j = dvnj0;
        BarcodeScanner barcodeScanner0 = this.b;
        if(barcodeScanner0 != null) {
            Context context1 = context0.getApplicationContext();
            if(context1 != null) {
                context0 = context1;
            }
            hbtk hbtk0 = new hbtk(new hbtf(context0, new hbtl(barcodeScanner0, dvnj0)), this.o);
            this.a = hbtk0;
            hbtk.a.f("start cameraXSource without preview view.");
            lpw lpw0 = hbtk0.h;
            lpf lpf0 = lpw0.b;
            lpf lpf1 = lpf.d;
            if(lpf0 != lpf1) {
                if(lpf0 != lpf.c) {
                    throw new IllegalStateException("Camera has not been created or has already been closed.");
                }
                lpw0.g(lpf1);
                if(hbtk0.j == null) {
                    hbtk0.b(hbia.c);
                }
                else {
                    hbtk0.b(hbia.f);
                }
            }
        }
        if(!hwev.c() && hwln.e()) {
            this.d.f(this.m, this.d.a.a(253010));
            this.d.f(this.n, this.d.a.a(253009));
        }
    }

    public final void c() {
        hbtk hbtk0 = this.a;
        if(hbtk0 != null) {
            hbtk0.d();
        }
    }

    public final void d(int v, View.OnClickListener view$OnClickListener0, ibth ibth0) {
        if(hwev.c()) {
            if(this.getContext() != null) {
                ftuy ftuy0 = new ftuy(this.l.b());
                if(v == 4) {
                    ftuy0.h(null);
                }
                ftux ftux0 = ftts.a(new fryr(0x7F1521CE), ibth0);  // string:pay_se_transactions_type_cancel "Cancel"
                ftux0.e(new frxp(-1));
                ftux0.c(ftvc.a);
                ftux0.f(253009);
                ftuy0.i(ftux0.a());
                this.l.d(ftuy0.a());
            }
        }
        else if(this.n != null) {
            if(hwln.e()) {
                this.n.setOnClickListener(new dvnh(this, view$OnClickListener0));
            }
            else {
                this.n.setOnClickListener(view$OnClickListener0);
            }
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = (RelativeLayout.LayoutParams)this.n.getLayoutParams();
            if(relativeLayout$LayoutParams0 != null) {
                if(v == 4) {
                    relativeLayout$LayoutParams0.addRule(14);
                }
                else {
                    relativeLayout$LayoutParams0.addRule(20);
                }
                this.n.setLayoutParams(relativeLayout$LayoutParams0);
            }
        }
    }

    public final void e(int v, View.OnClickListener view$OnClickListener0, ibth ibth0) {
        if(hwev.c()) {
            if(this.getContext() == null) {
                return;
            }
            ftuy ftuy0 = new ftuy(this.l.b());
            if(v != 4) {
                ftux ftux0 = ftts.a(new fryr(0x7F152210), ibth0);  // string:pay_skip_ocr_image_capture "Enter manually"
                ftux0.e(new frxp(-1));
                ftux0.c(ftvc.a);
                ftux0.f(253010);
                ftuy0.h(ftux0.a());
            }
            this.l.d(ftuy0.a());
            return;
        }
        if(v == 4) {
            this.m.setVisibility(8);
            return;
        }
        this.m.setVisibility(0);
        if(hwln.e()) {
            this.m.setOnClickListener(new dvng(this, view$OnClickListener0));
            return;
        }
        this.m.setOnClickListener(view$OnClickListener0);
    }
}


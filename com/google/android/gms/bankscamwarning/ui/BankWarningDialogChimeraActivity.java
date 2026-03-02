package com.google.android.gms.bankscamwarning.ui;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.BadTokenException;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ator;
import atpa;
import atpb;
import atpc;
import atpd;
import atpm;
import atpn;
import atpo;
import atpp;
import atpt;
import bbcu;
import bbdg;
import bboh;
import ccmq;
import cjmf;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.bankscamwarning.operations.BankScamMitigationIntentOperation;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import ggtj;
import hhbf;
import hhbh;
import hhbi;
import hxvd;
import ibol;
import ibpo;
import ibuq;
import ibzk;
import java.util.List;
import jwe;
import xni;

@GmsCoreVeId(0x3FCCA)
public final class BankWarningDialogChimeraActivity extends xni {
    public static final bboh j;
    public final atpd k;
    public CountDownTimer l;
    public boolean m;
    public atpc n;
    public atpb o;
    public Dialog p;
    public TextView q;
    public LinearLayout r;
    public CheckBox s;
    public Button t;
    public String u;
    public String v;
    public String w;
    public boolean x;
    private final long y;
    private final BankWarningDialogChimeraActivity.callEndedReceiver.1 z;

    static {
        BankWarningDialogChimeraActivity.j = bboh.b("BankWarningActivity", bbcu.gX);
    }

    public BankWarningDialogChimeraActivity() {
        this.y = hxvd.a.c().c() * 1000L;
        this.k = new atpd();
        this.z = new BankWarningDialogChimeraActivity.callEndedReceiver.1(this);
        this.m = true;
    }

    public final void a(int v) {
        String s = this.getString(0x7F1515C9, new Object[]{v});  // string:initial_wait_message "Wait %1$d sec to continue"
        ibuq.e(s, "getString(...)");
        if(((long)v) == this.y / 1000L) {
            ((ggtj)BankWarningDialogChimeraActivity.j.h()).B("BankWarningDialogChimeraActivity updateTimerText: %s", s);
        }
        int v1 = ibzk.N(s, v + " sec", 0, false, 6);
        SpannableString spannableString0 = new SpannableString(s);
        if(v1 != -1) {
            int v2 = this.g(0x7F0402FC);  // attr:colorOnSurfaceVariant
            int v3 = this.g(0x7F040307);  // attr:colorOutline
            spannableString0.setSpan(new ForegroundColorSpan(v2), v1, (v + " sec").length() + v1, 33);
            spannableString0.setSpan(new ForegroundColorSpan(v3), 0, v1, 33);
            if((v + " sec").length() + v1 < s.length()) {
                spannableString0.setSpan(new ForegroundColorSpan(v3), v1 + (v + " sec").length(), s.length(), 33);
            }
            TextView textView0 = this.q;
            if(textView0 == null) {
                ibuq.j("textWaitToContinue");
                textView0 = null;
            }
            textView0.setText(spannableString0);
        }
    }

    private final int g(int v) {
        try {
            TypedValue typedValue0 = new TypedValue();
            if(this.getTheme().resolveAttribute(v, typedValue0, true)) {
                return typedValue0.data;
            }
            ((ggtj)BankWarningDialogChimeraActivity.j.j()).z("Could not resolve attribute %s", v);
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            ((ggtj)((ggtj)BankWarningDialogChimeraActivity.j.i()).s(resources$NotFoundException0)).z("Attribute not found: %s", v);
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            ((ggtj)((ggtj)BankWarningDialogChimeraActivity.j.i()).s(unsupportedOperationException0)).z("Unsupported operation for attribute: %s", v);
        }
        catch(NullPointerException nullPointerException0) {
            a.ae(BankWarningDialogChimeraActivity.j.i(), "Theme is null", nullPointerException0);
        }
        return 0xFF888888;
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        IntentFilter intentFilter0;
        ccmq.a().a(bbdg.kb);
        super.onCreate(bundle0);
        bboh bboh0 = BankWarningDialogChimeraActivity.j;
        ((ggtj)bboh0.h()).x("BankWarningDialogChimeraActivity onCreate called");
        try {
            try {
                this.setTitle("");
                String s = this.getIntent().getStringExtra("com.google.android.gms.bankscamwarning.EXTRA_BANK_APP_PACKAGE_NAME");
                if(s == null) {
                    ((ggtj)bboh0.i()).x("Bank app package name not provided.");
                    this.finish();
                    return;
                }
                this.u = s;
                String s1 = this.getIntent().getStringExtra("com.google.android.gms.bankscamwarning.EXTRA_SESSION_ID");
                if(s1 == null) {
                    ((ggtj)bboh0.i()).x("Session ID not provided.");
                    this.finish();
                    return;
                }
                this.w = s1;
                String s2 = this.getIntent().getStringExtra("com.google.android.gms.bankscamwarning.EXTRA_PROJECTION_PACKAGE_NAME");
                if(s2 == null) {
                    s2 = "UNKNOWN";
                }
                String s3 = null;
                this.v = s2;
                this.n = new atpa(this);
                this.o = new ator(this);
                Dialog dialog0 = new Dialog(this);
                this.p = dialog0;
                dialog0.requestWindowFeature(1);
                Dialog dialog1 = this.p;
                if(dialog1 == null) {
                    ibuq.j("dialog");
                    dialog1 = null;
                }
                dialog1.setCancelable(false);
                View view0 = LayoutInflater.from(this).inflate(0x7F0E018A, null);  // layout:bank_scam_warning_dialog
                ibuq.e(view0, "inflate(...)");
                Dialog dialog2 = this.p;
                if(dialog2 == null) {
                    ibuq.j("dialog");
                    dialog2 = null;
                }
                dialog2.setContentView(view0);
                Dialog dialog3 = this.p;
                if(dialog3 == null) {
                    ibuq.j("dialog");
                    dialog3 = null;
                }
                Window window0 = dialog3.getWindow();
                if(window0 != null) {
                    window0.setBackgroundDrawable(new ColorDrawable(0));
                    window0.setDimAmount(0.32f);
                    window0.setGravity(17);
                    window0.addFlags(0x2000);
                    if(Build.VERSION.SDK_INT >= 35) {
                        window0.getDecorView().setAccessibilityDataSensitive(1);
                    }
                }
                this.q = (TextView)view0.findViewById(0x7F0B226C);  // id:textWaitToContinue
                this.r = (LinearLayout)view0.findViewById(0x7F0B1E9A);  // id:risk_acceptance_container
                this.s = (CheckBox)view0.findViewById(0x7F0B0EAA);  // id:checkboxUnderstandRisk
                this.t = (Button)view0.findViewById(0x7F0B0D86);  // id:buttonContinueAnyway
                ((Button)view0.findViewById(0x7F0B0D89)).setOnClickListener(new atpm(this));  // id:buttonEndCall
                TextView textView0 = this.q;
                if(textView0 == null) {
                    ibuq.j("textWaitToContinue");
                    textView0 = null;
                }
                textView0.setVisibility(0);
                LinearLayout linearLayout0 = this.r;
                if(linearLayout0 == null) {
                    ibuq.j("riskAcceptanceContainer");
                    linearLayout0 = null;
                }
                linearLayout0.setVisibility(8);
                Button button0 = this.t;
                if(button0 == null) {
                    ibuq.j("buttonContinueAnyway");
                    button0 = null;
                }
                button0.setVisibility(8);
                CountDownTimer countDownTimer0 = this.l;
                if(countDownTimer0 != null) {
                    countDownTimer0.cancel();
                }
                this.l = new atpt(this, this.y).start();
                this.a(((int)(this.y / 1000L)));
                CheckBox checkBox0 = this.s;
                if(checkBox0 == null) {
                    ibuq.j("checkboxUnderstandRisk");
                    checkBox0 = null;
                }
                checkBox0.setOnCheckedChangeListener(new atpn(this));
                Button button1 = this.t;
                if(button1 == null) {
                    ibuq.j("buttonContinueAnyway");
                    button1 = null;
                }
                button1.setOnClickListener(new atpo(this));
                Dialog dialog4 = this.p;
                if(dialog4 == null) {
                    ibuq.j("dialog");
                    dialog4 = null;
                }
                dialog4.show();
                view0.post(new atpp(this));
                if(cjmf.b(this, "android.permission.FORCE_STOP_PACKAGES") == 0) {
                    this.m = true;
                    ((ggtj)bboh0.h()).x("FORCE_STOP_PACKAGE permission is granted.");
                }
                else {
                    ((ggtj)bboh0.h()).x("FORCE_STOP_PACKAGE permission is not granted.");
                    this.m = false;
                    Dialog dialog5 = this.p;
                    if(dialog5 == null) {
                        ibuq.j("dialog");
                        dialog5 = null;
                    }
                    View view1 = dialog5.findViewById(0x7F0B2265);  // id:textSharingScreen
                    ibuq.e(view1, "findViewById(...)");
                    ((TextView)view1).setText("Scammers may be trying to access your finances through this call. For your protection, end the call and stop sharing your screen.");
                    Dialog dialog6 = this.p;
                    if(dialog6 == null) {
                        ibuq.j("dialog");
                        dialog6 = null;
                    }
                    View view2 = dialog6.findViewById(0x7F0B225F);  // id:textDontFollow
                    ibuq.e(view2, "findViewById(...)");
                    Dialog dialog7 = this.p;
                    if(dialog7 == null) {
                        ibuq.j("dialog");
                        dialog7 = null;
                    }
                    View view3 = dialog7.findViewById(0x7F0B2260);  // id:textDontShare
                    ibuq.e(view3, "findViewById(...)");
                    Dialog dialog8 = this.p;
                    if(dialog8 == null) {
                        ibuq.j("dialog");
                        dialog8 = null;
                    }
                    View view4 = dialog8.findViewById(0x7F0B16BD);  // id:iconDontShare
                    ibuq.e(view4, "findViewById(...)");
                    ((TextView)view2).setText("Don\'t follow caller\'s instructions or make payments");
                    ((TextView)view3).setText("Stop sharing your screen");
                    ((ImageView)view4).setImageResource(0x7F0804F5);  // drawable:gs_cancel_presentation_vd_theme_24
                    ((ImageView)view4).setContentDescription("Stop sharing your screen");
                }
                atpd atpd0 = this.k;
                String s4 = this.u;
                if(s4 == null) {
                    ibuq.j("bankAppPackageName");
                    s4 = null;
                }
                String s5 = this.v;
                if(s5 == null) {
                    ibuq.j("screenSharingAppPackageName");
                }
                else {
                    s3 = s5;
                }
                boolean z = this.getIntent().getBooleanExtra("com.google.android.gms.bankscamwarning.EXTRA_IS_DIALOG_RELAUNCHED_AFTER_IMPLICIT_DISMISSAL", false);
                ibuq.f(s4, "bankAppPackageName");
                ibuq.f(s3, "screenSharingAppPackageName");
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhbi.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhbh.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                s4.getClass();
                ((hhbh)hftv0).b |= 1;
                ((hhbh)hftv0).c = s4;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                s3.getClass();
                ((hhbh)hftv1).b |= 2;
                ((hhbh)hftv1).d = s3;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hhbh hhbh0 = (hhbh)hftp1.b_message;
                hhbh0.b |= 4;
                hhbh0.e = z;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hhbi hhbi0 = (hhbi)hftp0.b_message;
                hhbh hhbh1 = (hhbh)hftp1.N_build();
                hhbh1.getClass();
                hhbi0.d = hhbh1;
                hhbi0.c = 3;
                ProtoLiteMessage hftv2 = hftp0.N_build();
                ibuq.e(hftv2, "build(...)");
                atpd0.b(((hhbi)hftv2));
                intentFilter0 = new IntentFilter("com.google.android.gms.bankscamwarning.CALL_ENDED");
            }
            catch(NullPointerException nullPointerException0) {
                goto label_195;
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                goto label_199;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                goto label_183;
            }
            catch(SecurityException securityException0) {
                goto label_187;
            }
            catch(IllegalStateException illegalStateException0) {
                goto label_191;
            }
            try {
                jwe.b(this, this.z, intentFilter0, 4);
                ((ggtj)bboh0.h()).x("Registered callEndedReceiver successfully");
                return;
            }
            catch(SecurityException securityException1) {
            }
            catch(IllegalArgumentException illegalArgumentException1) {
                goto label_177;
            }
            catch(IllegalStateException illegalStateException1) {
                goto label_180;
            }
            catch(NullPointerException nullPointerException0) {
                goto label_195;
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                goto label_199;
            }
            try {
                ((ggtj)((ggtj)BankWarningDialogChimeraActivity.j.i()).s(securityException1)).x("Could not register callEndedReceiver");
                return;
            label_177:
                ((ggtj)((ggtj)BankWarningDialogChimeraActivity.j.i()).s(illegalArgumentException1)).x("Could not register callEndedReceiver");
                return;
            label_180:
                ((ggtj)((ggtj)BankWarningDialogChimeraActivity.j.i()).s(illegalStateException1)).x("Could not register callEndedReceiver");
                return;
            }
            catch(NullPointerException nullPointerException0) {
                goto label_195;
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                goto label_199;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
            }
            catch(SecurityException securityException0) {
                goto label_187;
            }
            catch(IllegalStateException illegalStateException0) {
                goto label_191;
            }
        }
        catch(WindowManager.BadTokenException windowManager$BadTokenException0) {
            a.ae(BankWarningDialogChimeraActivity.j.i(), "Error during initialization or dialog creation.", windowManager$BadTokenException0);
            this.finish();
            return;
        }
        catch(ibol ibol0) {
            goto label_207;
        }
    label_183:
        a.ae(BankWarningDialogChimeraActivity.j.i(), "Error during initialization or dialog creation.", illegalArgumentException0);
        this.finish();
        return;
    label_187:
        a.ae(BankWarningDialogChimeraActivity.j.i(), "Error during initialization or dialog creation.", securityException0);
        this.finish();
        return;
    label_191:
        a.ae(BankWarningDialogChimeraActivity.j.i(), "Error during initialization or dialog creation.", illegalStateException0);
        this.finish();
        return;
    label_195:
        a.ae(BankWarningDialogChimeraActivity.j.i(), "Could not show dialog", nullPointerException0);
        this.finish();
        return;
    label_199:
        a.ae(BankWarningDialogChimeraActivity.j.i(), "Error while showing dialog.", resources$NotFoundException0);
        this.finish();
        return;
    label_207:
        a.ae(BankWarningDialogChimeraActivity.j.i(), "Error during initialization or dialog creation.", ibol0);
        this.finish();
    }

    @Override  // xni
    protected final void onDestroy() {
        super.onDestroy();
        ((ggtj)BankWarningDialogChimeraActivity.j.h()).x("BankWarningDialogChimeraActivity onDestroy called");
        CountDownTimer countDownTimer0 = this.l;
        if(countDownTimer0 != null) {
            countDownTimer0.cancel();
        }
        if(this.p != null && this.p.isShowing()) {
            Dialog dialog0 = this.p;
            if(dialog0 == null) {
                ibuq.j("dialog");
                dialog0 = null;
            }
            dialog0.dismiss();
        }
        this.unregisterReceiver(this.z);
    }

    @Override  // xni
    protected final void onStop() {
        String s;
        super.onStop();
        ((ggtj)BankWarningDialogChimeraActivity.j.h()).x("BankWarningDialogChimeraActivity onStop called");
        Dialog dialog0 = null;
        if(!this.x) {
            try {
                Object object0 = this.getSystemService("activity");
                ibuq.d(object0, "null cannot be cast to non-null type android.app.ActivityManager");
                List list0 = ((ActivityManager)object0).getRunningTasks(1);
                ibuq.c(list0);
                ActivityManager.RunningTaskInfo activityManager$RunningTaskInfo0 = (ActivityManager.RunningTaskInfo)ibpo.T(list0);
                if(activityManager$RunningTaskInfo0 == null) {
                    s = null;
                }
                else {
                    ComponentName componentName0 = activityManager$RunningTaskInfo0.topActivity;
                    s = componentName0 == null ? null : componentName0.getPackageName();
                }
                String s1 = "UNKNOWN";
                String s2 = this.getIntent().getStringExtra("com.google.android.gms.bankscamwarning.EXTRA_BANK_APP_PACKAGE_NAME");
                if(s2 == null) {
                    s2 = "UNKNOWN";
                }
                String s3 = this.getIntent().getStringExtra("com.google.android.gms.bankscamwarning.EXTRA_PROJECTION_PACKAGE_NAME");
                if(s3 != null) {
                    s1 = s3;
                }
                if(s != null && !ibuq.m(s, s2)) {
                    this.k.c(hhbf.a, s2, s1);
                }
            }
            catch(NullPointerException nullPointerException0) {
                a.ae(BankWarningDialogChimeraActivity.j.i(), "NullPointerException getting ActivityManager or top app info.", nullPointerException0);
            }
            catch(ClassCastException classCastException0) {
                a.ae(BankWarningDialogChimeraActivity.j.i(), "ClassCastException getting ActivityManager service.", classCastException0);
            }
            catch(SecurityException securityException0) {
                a.ae(BankWarningDialogChimeraActivity.j.i(), "SecurityException getting running tasks to log dismissal event.", securityException0);
            }
            catch(IllegalStateException illegalStateException0) {
                a.ae(BankWarningDialogChimeraActivity.j.i(), "IllegalStateException getting running tasks to log dismissal event.", illegalStateException0);
            }
            if(this.u != null && this.w != null) {
                Intent intent0 = IntentOperation.getStartIntent(this, BankScamMitigationIntentOperation.class, "com.google.android.gms.bankscamwarning.ACTION_WARNING_DIALOG_DISMISSED_IMPLICITLY");
                if(intent0 == null) {
                    ((ggtj)BankWarningDialogChimeraActivity.j.j()).x("Could not get start intent for DIALOG_STOPPED action.");
                }
                else {
                    String s4 = this.u;
                    if(s4 == null) {
                        ibuq.j("bankAppPackageName");
                        s4 = null;
                    }
                    intent0.putExtra("com.google.android.gms.bankscamwarning.EXTRA_BANK_APP_PACKAGE_NAME", s4);
                    String s5 = this.w;
                    if(s5 == null) {
                        ibuq.j("currentSessionId");
                        s5 = null;
                    }
                    intent0.putExtra("com.google.android.gms.bankscamwarning.EXTRA_SESSION_ID", s5);
                    try {
                        this.startService(intent0);
                        ((ggtj)BankWarningDialogChimeraActivity.j.h()).x("Sent intent for DIALOG_STOPPED action.");
                    }
                    catch(SecurityException securityException1) {
                        a.ae(BankWarningDialogChimeraActivity.j.i(), "Can\'t start service for DIALOG_STOPPED intent.", securityException1);
                    }
                    catch(IllegalStateException illegalStateException1) {
                        a.ae(BankWarningDialogChimeraActivity.j.i(), "Can\'t start service for DIALOG_STOPPED intent.", illegalStateException1);
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        a.ae(BankWarningDialogChimeraActivity.j.i(), "Can\'t start service for DIALOG_STOPPED intent.", illegalArgumentException0);
                    }
                }
            }
            else {
                ((ggtj)BankWarningDialogChimeraActivity.j.j()).x("Cannot send DIALOG_STOPPED intent: bankAppPackageName or currentSessionId not initialized.");
            }
        }
        CountDownTimer countDownTimer0 = this.l;
        if(countDownTimer0 != null) {
            countDownTimer0.cancel();
        }
        if(this.p != null && this.p.isShowing()) {
            Dialog dialog1 = this.p;
            if(dialog1 == null) {
                ibuq.j("dialog");
            }
            else {
                dialog0 = dialog1;
            }
            dialog0.dismiss();
        }
        this.finish();
    }
}


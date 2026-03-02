import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class de extends du implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private boolean VA;
    private boolean VB;
    private Handler Vj;
    private final Runnable Vu;
    private final DialogInterface.OnCancelListener Vv;
    private int Vw;
    private boolean Vx;
    private final lqj Vy;
    private boolean Vz;
    public final DialogInterface.OnDismissListener a;
    private int ak;
    private boolean al;
    private int am;
    public boolean b;
    public Dialog c;
    public boolean d;

    public de() {
        this.Vu = new cz(this);
        this.Vv = new da(this);
        this.a = new db(this);
        this.Vw = 0;
        this.ak = 0;
        this.al = true;
        this.b = true;
        this.am = -1;
        this.Vy = new dc(this);
        this.d = false;
    }

    public de(int v) {
        super(v);
        this.Vu = new cz(this);
        this.Vv = new da(this);
        this.a = new db(this);
        this.Vw = 0;
        this.ak = 0;
        this.al = true;
        this.b = true;
        this.am = -1;
        this.Vy = new dc(this);
        this.d = false;
    }

    public void dismiss() {
        this.hW(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        this.hW(true, false, false);
    }

    public void dismissNow() {
        this.hW(false, false, true);
    }

    @Override  // du
    public final ee eS() {
        return new dd(this, new dl(this));
    }

    public Dialog getDialog() {
        return this.c;
    }

    public boolean getShowsDialog() {
        return this.b;
    }

    public int getTheme() {
        return this.ak;
    }

    @Override  // du
    public final void gl(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        super.gl(layoutInflater0, viewGroup0, bundle0);
        if(this.P == null && this.c != null && bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle("android:savedDialogState");
            if(bundle1 != null) {
                this.c.onRestoreInstanceState(bundle1);
            }
        }
    }

    private final void hW(boolean z, boolean z1, boolean z2) {
        if(this.VA) {
            return;
        }
        this.VA = true;
        this.VB = false;
        Dialog dialog0 = this.c;
        if(dialog0 != null) {
            dialog0.setOnDismissListener(null);
            this.c.dismiss();
            if(!z1) {
                if(Looper.myLooper() == this.Vj.getLooper()) {
                    this.onDismiss(this.c);
                }
                else {
                    this.Vj.post(this.Vu);
                }
            }
        }
        this.Vz = true;
        if(this.am >= 0) {
            if(z2) {
                this.getParentFragmentManager().aw(this.am, 1);
            }
            else {
                this.getParentFragmentManager().X(this.am, 1, z);
            }
            this.am = -1;
            return;
        }
        ca ca0 = new ca(this.getParentFragmentManager());
        ca0.C();
        ca0.o(this);
        if(z2) {
            ca0.f();
            return;
        }
        if(z) {
            ca0.b();
            return;
        }
        ca0.a();
    }

    public boolean isCancelable() {
        return this.al;
    }

    @Override  // du
    @Deprecated
    public void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
    }

    @Override  // du
    public void onAttach(Context context0) {
        super.onAttach(context0);
        this.getViewLifecycleOwnerLiveData().ih(this.Vy);
        if(!this.VB) {
            this.VA = false;
        }
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public void onCancel(DialogInterface dialogInterface0) {
    }

    @Override  // du
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.Vj = new Handler();
        this.b = this.F == 0;
        if(bundle0 != null) {
            this.Vw = bundle0.getInt("android:style", 0);
            this.ak = bundle0.getInt("android:theme", 0);
            this.al = bundle0.getBoolean("android:cancelable", true);
            this.b = bundle0.getBoolean("android:showsDialog", this.b);
            this.am = bundle0.getInt("android:backStackId", -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle0) {
        if(fm.ar(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this.toString());
        }
        return new aas(this.requireContext(), this.getTheme());
    }

    @Override  // du
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog0 = this.c;
        if(dialog0 != null) {
            this.Vz = true;
            dialog0.setOnDismissListener(null);
            this.c.dismiss();
            if(!this.VA) {
                this.onDismiss(this.c);
            }
            this.c = null;
            this.d = false;
        }
    }

    @Override  // du
    public void onDetach() {
        super.onDetach();
        if(!this.VB && !this.VA) {
            this.VA = true;
        }
        this.getViewLifecycleOwnerLiveData().j(this.Vy);
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public void onDismiss(DialogInterface dialogInterface0) {
        if(!this.Vz) {
            if(fm.ar(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this.toString());
            }
            this.hW(true, true, false);
        }
    }

    @Override  // du
    public LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        LayoutInflater layoutInflater0 = super.onGetLayoutInflater(bundle0);
        if(this.b && !this.Vx) {
            if(!this.d) {
                try {
                    this.Vx = true;
                    Dialog dialog0 = this.onCreateDialog(bundle0);
                    this.c = dialog0;
                    if(this.b) {
                        this.setupDialog(dialog0, this.Vw);
                        Context context0 = this.getContext();
                        if((context0 instanceof Activity)) {
                            this.c.setOwnerActivity(((Activity)context0));
                        }
                        this.c.setCancelable(this.al);
                        this.c.setOnCancelListener(this.Vv);
                        this.c.setOnDismissListener(this.a);
                        this.d = true;
                    }
                    else {
                        this.c = null;
                    }
                }
                finally {
                    this.Vx = false;
                }
            }
            if(fm.ar(2)) {
                Log.d("FragmentManager", a.i(this, "get layout inflater for DialogFragment ", " from dialog context"));
            }
            return this.c == null ? layoutInflater0 : layoutInflater0.cloneInContext(this.c.getContext());
        }
        if(fm.ar(2)) {
            String s = "getting layout inflater for DialogFragment " + this.toString();
            if(!this.b) {
                Log.d("FragmentManager", "mShowsDialog = false: " + s);
                return layoutInflater0;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + s);
        }
        return layoutInflater0;
    }

    @Override  // du
    public void onSaveInstanceState(Bundle bundle0) {
        Dialog dialog0 = this.c;
        if(dialog0 != null) {
            Bundle bundle1 = dialog0.onSaveInstanceState();
            bundle1.putBoolean("android:dialogShowing", false);
            bundle0.putBundle("android:savedDialogState", bundle1);
        }
        int v = this.Vw;
        if(v != 0) {
            bundle0.putInt("android:style", v);
        }
        int v1 = this.ak;
        if(v1 != 0) {
            bundle0.putInt("android:theme", v1);
        }
        if(!this.al) {
            bundle0.putBoolean("android:cancelable", false);
        }
        if(!this.b) {
            bundle0.putBoolean("android:showsDialog", false);
        }
        int v2 = this.am;
        if(v2 != -1) {
            bundle0.putInt("android:backStackId", v2);
        }
    }

    @Override  // du
    public void onStart() {
        super.onStart();
        Dialog dialog0 = this.c;
        if(dialog0 != null) {
            this.Vz = false;
            dialog0.show();
            View view0 = this.c.getWindow().getDecorView();
            lsr.b(view0, this);
            lss.b(view0, this);
            oro.b(view0, this);
        }
    }

    @Override  // du
    public void onStop() {
        super.onStop();
        Dialog dialog0 = this.c;
        if(dialog0 != null) {
            dialog0.hide();
        }
    }

    @Override  // du
    public void onViewStateRestored(Bundle bundle0) {
        super.onViewStateRestored(bundle0);
        if(this.c != null && bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle("android:savedDialogState");
            if(bundle1 != null) {
                this.c.onRestoreInstanceState(bundle1);
            }
        }
    }

    public final Dialog requireDialog() {
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            return dialog0;
        }
        throw new IllegalStateException(a.i(this, "DialogFragment ", " does not have a Dialog."));
    }

    public void setCancelable(boolean z) {
        this.al = z;
        Dialog dialog0 = this.c;
        if(dialog0 != null) {
            dialog0.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.b = z;
    }

    public void setStyle(int v, int v1) {
        if(fm.ar(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + v + ", " + v1);
        }
        this.Vw = v;
        if(v == 2 || v == 3) {
            this.ak = 0x1030059;
        }
        if(v1 != 0) {
            this.ak = v1;
        }
    }

    public void setupDialog(Dialog dialog0, int v) {
        switch(v) {
            case 1: 
            case 2: {
                break;
            }
            case 3: {
                Window window0 = dialog0.getWindow();
                if(window0 != null) {
                    window0.addFlags(24);
                }
                break;
            }
            default: {
                return;
            }
        }
        dialog0.requestWindowFeature(1);
    }

    public int show(fz fz0, String s) {
        this.VA = false;
        this.VB = true;
        fz0.v(this, s);
        this.Vz = false;
        int v = fz0.a();
        this.am = v;
        return v;
    }

    public void show(fm fm0, String s) {
        this.VA = false;
        this.VB = true;
        ca ca0 = new ca(fm0);
        ca0.C();
        ca0.v(this, s);
        ca0.a();
    }

    public void showNow(fm fm0, String s) {
        this.VA = false;
        this.VB = true;
        ca ca0 = new ca(fm0);
        ca0.C();
        ca0.v(this, s);
        ca0.f();
    }
}


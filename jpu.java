import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.util.Objects;
import java.util.UUID;

final class jpu extends aas {
    public ibth a;
    public jpq b;
    public final jpo c;
    private final View d;
    private final float e;
    private boolean f;

    public jpu(ibth ibth0, jpq jpq0, View view0, jlm jlm0, jks jks0, UUID uUID0) {
        super(new ContextThemeWrapper(view0.getContext(), (jpq0.d ? 0x7F160375 : 0x7F16040A)));  // style:DialogWindowTheme
        this.a = ibth0;
        this.b = jpq0;
        this.d = view0;
        this.e = 8.0f;
        Window window0 = this.getWindow();
        if(window0 == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window0.requestFeature(1);
        window0.setBackgroundDrawableResource(0x106000D);
        kfv.a(window0, this.b.d);
        window0.setGravity(17);
        if(!this.b.d) {
            window0.addFlags(0x10100);
            WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
            jpf.a.a(windowManager$LayoutParams0);
            jpg.a.a(windowManager$LayoutParams0, 0);
            jpg.a.b(windowManager$LayoutParams0, 0);
            window0.setAttributes(windowManager$LayoutParams0);
        }
        jpo jpo0 = new jpo(this.getContext(), window0);
        this.setTitle(this.b.e);
        Objects.toString(uUID0);
        jpo0.setTag(0x7F0B0F7D, "Dialog:" + uUID0);  // id:compose_view_saveable_id_tag
        jpo0.setClipChildren(false);
        jpo0.setElevation(jks0.eg(8.0f));
        jpo0.setOutlineProvider(new jps());
        this.c = jpo0;
        View view1 = window0.getDecorView();
        ViewGroup viewGroup0 = (view1 instanceof ViewGroup) ? ((ViewGroup)view1) : null;
        if(viewGroup0 != null) {
            jpu.b(viewGroup0);
        }
        this.setContentView(jpo0);
        lsr.b(jpo0, lsr.a(view0));
        lss.b(jpo0, lss.a(view0));
        oro.b(jpo0, oro.a(view0));
        this.a(this.a, this.b, jlm0);
        abe.a(this.getOnBackPressedDispatcher(), this, new jpt(this));
    }

    public final void a(ibth ibth0, jpq jpq0, jlm jlm0) {
        int v2;
        this.a = ibth0;
        this.b = jpq0;
        int v = jpq0.f - 1;
        boolean z = jpe.b(this.d);
        if(jpq0.f == 0) {
            throw null;
        }
        if(v != 0) {
            throw new ibnq();
        }
        Window window0 = this.getWindow();
        ibuq.c(window0);
        window0.setFlags((z ? 0x2000 : 0xFFFFDFFF), 0x2000);
        jpo jpo0 = this.c;
        int v1 = 0;
        switch(jlm0.ordinal()) {
            case 0: {
                v2 = 0;
                break;
            }
            case 1: {
                v2 = 1;
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        jpo0.setLayoutDirection(v2);
        boolean z1 = jpq0.d;
        boolean z2 = jpq0.c;
        boolean z3 = !jpo0.d || z2 != jpo0.b || z1 != jpo0.c;
        jpo0.b = z2;
        jpo0.c = z1;
        if(z3) {
            Window window1 = jpo0.a;
            int v3 = z2 ? -2 : -1;
            if(v3 != window1.getAttributes().width || !jpo0.d) {
                window1.setLayout(v3, -2);
                jpo0.d = true;
            }
        }
        this.setCanceledOnTouchOutside(jpq0.b);
        Window window2 = this.getWindow();
        if(window2 != null) {
            if(!z1) {
                v1 = 0x30;
            }
            window2.setSoftInputMode(v1);
        }
    }

    private static final void b(ViewGroup viewGroup0) {
        viewGroup0.setClipChildren(false);
        if(!(viewGroup0 instanceof jpo)) {
            int v1 = viewGroup0.getChildCount();
            for(int v = 0; v < v1; ++v) {
                View view0 = viewGroup0.getChildAt(v);
                ViewGroup viewGroup1 = (view0 instanceof ViewGroup) ? ((ViewGroup)view0) : null;
                if(viewGroup1 != null) {
                    jpu.b(viewGroup1);
                }
            }
        }
    }

    @Override  // android.app.Dialog
    public final void cancel() {
    }

    @Override  // android.app.Dialog
    public final boolean onKeyUp(int v, KeyEvent keyEvent0) {
        if(this.b.a && keyEvent0.isTracking() && !keyEvent0.isCanceled() && v == 0x6F) {
            this.a.a();
            return true;
        }
        return super.onKeyUp(v, keyEvent0);
    }

    @Override  // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z = super.onTouchEvent(motionEvent0);
        if(this.b.b) {
            jpo jpo0 = this.c;
            float f = motionEvent0.getX();
            if(!Float.isInfinite(f) && !Float.isNaN(f)) {
                float f1 = motionEvent0.getY();
                if(!Float.isInfinite(f1) && !Float.isNaN(f1)) {
                    View view0 = jpo0.getChildAt(0);
                    if(view0 == null) {
                        goto label_17;
                    }
                    else {
                        int v = jpo0.getLeft() + view0.getLeft();
                        int v1 = view0.getWidth() + v;
                        int v2 = jpo0.getTop() + view0.getTop();
                        int v3 = view0.getHeight() + v2;
                        int v4 = ibvr.c(motionEvent0.getX());
                        if(v <= v4 && v4 <= v1) {
                            int v5 = ibvr.c(motionEvent0.getY());
                            if(v2 > v5 || v5 > v3) {
                                goto label_17;
                            }
                            else {
                                goto label_25;
                            }
                        }
                        else {
                            goto label_17;
                        }
                    }
                }
                else {
                    goto label_17;
                }
            }
            else {
            label_17:
                switch(motionEvent0.getActionMasked()) {
                    case 0: {
                        this.f = true;
                        return true;
                    }
                    case 1: {
                        if(!this.f) {
                            return z;
                        }
                        this.a.a();
                        this.f = false;
                        return true;
                    }
                    case 3: {
                        break;
                    }
                    default: {
                        return z;
                    }
                }
            }
        }
        else {
        label_25:
            switch(motionEvent0.getActionMasked()) {
                case 0: 
                case 1: 
                case 3: {
                    break;
                }
                default: {
                    return z;
                }
            }
        }
        this.f = false;
        return z;
    }
}


import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

final class ed {
    static eb a(Context context0, du du0, boolean z, boolean z1) {
        boolean z2;
        int v2;
        int v = 0;
        int v1 = du0.S == null ? 0 : du0.S.f;
        if(!z1) {
            if(z) {
                v2 = du0.gj();
                z2 = true;
            }
            else {
                v2 = du0.gk();
                z2 = false;
            }
        }
        else if(z) {
            v2 = du0.iT();
            z2 = true;
        }
        else {
            v2 = du0.gZ();
            z2 = false;
        }
        du0.jb(0, 0, 0, 0);
        if(du0.O != null && du0.O.getTag(0x7F0B2471) != null) {  // id:visible_removing_fragment_view_tag
            du0.O.setTag(0x7F0B2471, null);  // id:visible_removing_fragment_view_tag
        }
        if(du0.O != null && du0.O.getLayoutTransition() != null) {
            return null;
        }
        Animation animation0 = du0.onCreateAnimation(v1, z2, v2);
        if(animation0 != null) {
            return new eb(animation0);
        }
        if(v2 == 0) {
            switch(v1) {
                case 0: {
                    break;
                }
                case 0x1001: {
                    v = z2 ? 0x7F02000B : 0x7F02000C;  // animator:fragment_open_enter
                    break;
                }
                case 0x1003: {
                    v = z2 ? 0x7F020009 : 0x7F02000A;  // animator:fragment_fade_enter
                    break;
                }
                case 4100: {
                    v = z2 ? ed.b(context0, 0x10100B8) : ed.b(context0, 0x10100B9);
                    break;
                }
                case 0x2002: {
                    v = z2 ? 0x7F020007 : 0x7F020008;  // animator:fragment_close_enter
                    break;
                }
                case 0x2005: {
                    v = z2 ? ed.b(context0, 0x10100BA) : ed.b(context0, 0x10100BB);
                    break;
                }
                default: {
                    v = -1;
                }
            }
        }
        else {
            v = v2;
        }
        if(v != 0) {
            boolean z3 = "anim".equals(context0.getResources().getResourceTypeName(v));
            if(!z3) {
                goto label_62;
            }
            try {
                Animation animation1 = AnimationUtils.loadAnimation(context0, v);
                if(animation1 != null) {
                    return new eb(animation1);
                }
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                throw resources$NotFoundException0;
            }
            catch(RuntimeException unused_ex) {
                try {
                label_62:
                    Animator animator0 = AnimatorInflater.loadAnimator(context0, v);
                    return animator0 == null ? null : new eb(animator0);
                }
                catch(RuntimeException runtimeException0) {
                    goto label_66;
                }
            }
        }
        return null;
    label_66:
        if(z3) {
            throw runtimeException0;
        }
        Animation animation2 = AnimationUtils.loadAnimation(context0, v);
        return animation2 == null ? null : new eb(animation2);
    }

    private static int b(Context context0, int v) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(0x1030001, new int[]{v});
        int v1 = typedArray0.getResourceId(0, -1);
        typedArray0.recycle();
        return v1;
    }
}


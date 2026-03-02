import android.animation.ValueAnimator;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar.Behavior;

final class fyww implements Handler.Callback {
    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        int v = 0;
        switch(message0.what) {
            case 0: {
                fyxk fyxk0 = (fyxk)message0.obj;
                fyxj fyxj0 = fyxk0.j;
                if(fyxj0.getParent() == null) {
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = fyxj0.getLayoutParams();
                    if((viewGroup$LayoutParams0 instanceof jto)) {
                        BaseTransientBottomBar.Behavior baseTransientBottomBar$Behavior0 = fyxk0.v == null ? new BaseTransientBottomBar.Behavior() : fyxk0.v;
                        baseTransientBottomBar$Behavior0.g.a = fyxk0.w;
                        baseTransientBottomBar$Behavior0.f = new fyxc(fyxk0);
                        ((jto)viewGroup$LayoutParams0).b(baseTransientBottomBar$Behavior0);
                        if(fyxk0.d() == null) {
                            ((jto)viewGroup$LayoutParams0).g = 80;
                        }
                    }
                    ViewGroup viewGroup0 = fyxk0.h;
                    fyxj0.g = true;
                    viewGroup0.addView(fyxj0);
                    fyxj0.g = false;
                    if(fyxk0.d() != null) {
                        int[] arr_v = new int[2];
                        fyxk0.d().getLocationOnScreen(arr_v);
                        int v1 = arr_v[1];
                        int[] arr_v1 = new int[2];
                        viewGroup0.getLocationOnScreen(arr_v1);
                        v = arr_v1[1] + viewGroup0.getHeight() - v1;
                    }
                    fyxk0.q = v;
                    fyxk0.k();
                    fyxj0.setVisibility(4);
                }
                if(fyxj0.isLaidOut()) {
                    fyxk0.j();
                    return true;
                }
                fyxk0.t = true;
                return true;
            }
            case 1: {
                fyxk fyxk1 = (fyxk)message0.obj;
                int v2 = message0.arg1;
                if(fyxk1.n()) {
                    fyxj fyxj1 = fyxk1.j;
                    if(fyxj1.getVisibility() == 0) {
                        if(fyxj1.c == 1) {
                            ValueAnimator valueAnimator0 = fyxk1.c(new float[]{1.0f, 0.0f});
                            valueAnimator0.setDuration(((long)fyxk1.d));
                            valueAnimator0.addListener(new fywp(fyxk1, v2));
                            valueAnimator0.start();
                            return true;
                        }
                        ValueAnimator valueAnimator1 = new ValueAnimator();
                        valueAnimator1.setIntValues(new int[]{0, fyxk1.b()});
                        valueAnimator1.setInterpolator(fyxk1.f);
                        valueAnimator1.setDuration(((long)fyxk1.e));
                        valueAnimator1.addListener(new fywu(fyxk1, v2));
                        valueAnimator1.addUpdateListener(new fywv(fyxk1));
                        valueAnimator1.start();
                        return true;
                    }
                }
                fyxk1.g(v2);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}


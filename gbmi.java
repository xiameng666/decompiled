import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;

public final class gbmi {
    static Animator a(gbmd gbmd0, hdzq hdzq0, View view0, boolean z) {
        float f4;
        float f3;
        int v5;
        float f2;
        int v4;
        int v3;
        int v6;
        float f1;
        hdzk hdzk0 = hdzq0.f == null ? hdzk.a : hdzq0.f;
        Animator animator0 = null;
        switch((hdzj.a(hdzk0.c) == 0 ? 1 : hdzj.a(hdzk0.c)) - 1) {
            case 1: {
                hdzl hdzl0 = hdzk0.d == null ? hdzl.a : hdzk0.d;
                int v = hdzl0.b;
                float f = 1.0f;
                if((v & 1) == 0) {
                    f1 = ((int)z) ? 0.0f : 1.0f;
                }
                else {
                    f1 = gbmi.d(hdzl0.c);
                }
                if((v & 2) != 0) {
                    f = gbmi.d(hdzl0.d);
                }
                else if(!((int)z)) {
                    f = 0.0f;
                }
                if(((int)z)) {
                    view0.setAlpha(0.0f);
                }
                animator0 = ObjectAnimator.ofFloat(view0, "alpha", new float[]{f1, f});
                break;
            }
            case 2: {
                hdzo hdzo0 = hdzk0.e == null ? hdzo.a : hdzk0.e;
                View view1 = view0.getRootView();
                if((hdzo0.b & 4) != 0) {
                    int v1 = hdzo0.e;
                    View view2 = view0;
                    while((view2.getParent() instanceof View)) {
                        view2 = (View)view2.getParent();
                        hdtk hdtk0 = gbmd0.l(view2, 0);
                        if(hdtk0 != null && hdtk0.c == v1) {
                            view1 = view2;
                            break;
                        }
                    }
                }
                Point point0 = new Point(0, 0);
                View view3 = view0;
                while((view3.getParent() instanceof View) && view3.getParent() != view1) {
                    view3 = (View)view3.getParent();
                    point0.offset(-view3.getLeft(), -view3.getTop());
                }
                if((view0.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    animator0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
                }
                int v2 = hdzn.a(hdzo0.c) == 0 ? 1 : hdzn.a(hdzo0.c);
                String s = "X";
                switch(v2 - 1) {
                    case 1: {
                        v3 = ((int)z) ^ 1;
                        v6 = point0.x + (animator0 == null ? 0 : animator0.leftMargin);
                        f2 = (float)view0.getLeft();
                        f3 = (float)(-view0.getWidth());
                        f4 = (float)v6;
                        break;
                    }
                    case 2: {
                        v3 = ((int)z) ^ 1;
                        v6 = point0.x + view1.getWidth() - view0.getWidth() - (animator0 == null ? 0 : animator0.rightMargin);
                        f2 = (float)view0.getLeft();
                        f3 = (float)view0.getWidth();
                        f4 = (float)v6;
                        break;
                    }
                    default: {
                        switch(v2 - 1) {
                            case 3: {
                                v3 = ((int)z) ^ 1;
                                v4 = point0.y + (animator0 == null ? 0 : animator0.topMargin);
                                f2 = (float)view0.getTop();
                                v5 = -view0.getHeight();
                                break;
                            }
                            case 4: {
                                v3 = ((int)z) ^ 1;
                                v4 = point0.y + view1.getHeight() - view0.getHeight() - (animator0 == null ? 0 : animator0.bottomMargin);
                                f2 = (float)view0.getTop();
                                v5 = view0.getHeight();
                                break;
                            }
                            default: {
                                throw new IllegalArgumentException("Unknown direction for translation effect.");
                            }
                        }
                        f3 = (float)v5;
                        f4 = (float)v4;
                        s = "Y";
                    }
                }
                if(hdzo0.d) {
                    f4 += f3;
                }
                animator0 = 1 == v3 ? ObjectAnimator.ofFloat(view0, s, new float[]{f2, f4}) : ObjectAnimator.ofFloat(view0, s, new float[]{f4, f2});
            }
        }
        if(animator0 != null) {
            animator0.setStartDelay(((long)hdzq0.e));
            animator0.setDuration(((long)hdzq0.d));
            animator0.setInterpolator(gbmi.c(hdzq0));
        }
        return animator0;
    }

    static Animator b(gbmd gbmd0, hdzs hdzs0, View view0, boolean z) {
        Animator animator0;
        gbmh gbmh0 = new gbmh(view0);
        int v = hdzs0.d.size();
        if(v == 0) {
            animator0 = null;
        }
        else if(v == 1) {
            animator0 = gbmi.a(gbmd0, ((hdzq)hdzs0.d.get(0)), view0, z);
        }
        else {
            AnimatorSet animatorSet0 = new AnimatorSet();
            ArrayList arrayList0 = new ArrayList(v);
            for(Object object0: hdzs0.d) {
                Animator animator1 = gbmi.a(gbmd0, ((hdzq)object0), view0, z);
                if(animator1 != null) {
                    arrayList0.add(animator1);
                }
            }
            animatorSet0.playTogether(arrayList0);
            animator0 = animatorSet0;
        }
        if(animator0 != null) {
            animator0.addListener(gbmh0);
        }
        return animator0;
    }

    static TimeInterpolator c(hdzq hdzq0) {
        if((hdzq0.b & 1) != 0) {
            hdzp hdzp0 = hdzq0.c == null ? hdzp.a : hdzq0.c;
            return new PathInterpolator(hdzp0.c, hdzp0.d, hdzp0.e, hdzp0.f);
        }
        return new LinearInterpolator();
    }

    private static float d(int v) {
        return ((float)v) / 255.0f;
    }
}


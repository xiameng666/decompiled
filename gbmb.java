import android.animation.Animator;
import android.view.ViewGroup;
import java.util.Iterator;

public final class gbmb extends oyw {
    private final gbmd y;

    public gbmb(gbmd gbmd0) {
        this.y = gbmd0;
    }

    @Override  // oyw
    public final Animator a(ViewGroup viewGroup0, pav pav0, pav pav1) {
        if(pav0 != null && pav1 != null) {
            hdzs hdzs0 = this.y.m(pav1.b, 4);
            if(hdzs0 != null) {
                for(Object object0: hdzs0.d) {
                    hdzk hdzk0 = ((hdzq)object0).f;
                    if(hdzk0 == null) {
                        hdzk0 = hdzk.a;
                    }
                    if(hdzj.a(hdzk0.c) == 4) {
                        Animator animator0 = super.a(viewGroup0, pav0, pav1);
                        if(animator0 != null) {
                            Iterator iterator1 = hdzs0.d.iterator();
                            while(true) {
                                if(!iterator1.hasNext()) {
                                    break;
                                }
                                Object object1 = iterator1.next();
                                hdzq hdzq0 = (hdzq)object1;
                                if(hdzj.a((hdzq0.f == null ? hdzk.a : hdzq0.f).c) != 4) {
                                    continue;
                                }
                                animator0.setStartDelay(((long)hdzq0.e));
                                animator0.setDuration(((long)hdzq0.d));
                                animator0.setInterpolator(gbmi.c(hdzq0));
                                return animator0;
                            }
                        }
                        break;
                    }
                }
            }
        }
        return null;
    }
}


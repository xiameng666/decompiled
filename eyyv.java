import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

public final class eyyv {
    public static final List a;
    public final ViewPager2 b;
    public int c;
    public final eyyu d;
    private final RecyclerView e;
    private final ImageView f;
    private final ImageView g;
    private final eyyt h;

    static {
        eyyv.a = ibpo.g(new ibns[]{new ibns(((int)0x7F14013E), ((int)0x7F15103C)), new ibns(((int)0x7F14013D), ((int)0x7F15103D))});  // raw:explanation_swipe_animation
    }

    public eyyv(ViewPager2 viewPager20, RecyclerView recyclerView0, ImageView imageView0, ImageView imageView1) {
        ibuq.f(viewPager20, "carousel");
        ibuq.f(recyclerView0, "progressIndicator");
        ibuq.f(imageView0, "backArrow");
        ibuq.f(imageView1, "forwardArrow");
        super();
        this.b = viewPager20;
        this.e = recyclerView0;
        this.f = imageView0;
        this.g = imageView1;
        eyyt eyyt0 = new eyyt();
        this.h = eyyt0;
        eyyu eyyu0 = new eyyu(this);
        this.d = eyyu0;
        pdn pdn0 = new pdn(((int)viewPager20.getContext().getResources().getDimension(0x7F070606)));  // dimen:explanation_fragment_padding_horizontal
        if(!viewPager20.g) {
            viewPager20.g = true;
        }
        viewPager20.d.ao(null);
        pdo pdo0 = viewPager20.f;
        if(pdn0 != pdo0.a) {
            pdo0.a = pdn0;
            if(pdo0.a != null) {
                double f = viewPager20.e.c();
                float f1 = (float)(f - ((double)(((int)f))));
                int v = Math.round(((float)viewPager20.b()) * f1);
                viewPager20.f.d(((int)f), f1, v);
            }
        }
        viewPager20.f(new eyys());
        viewPager20.e(eyyu0);
        recyclerView0.getContext();
        recyclerView0.ap(new LinearLayoutManager(0, false));
        recyclerView0.an(eyyt0);
        imageView0.getDrawable().setAutoMirrored(true);
        imageView1.getDrawable().setAutoMirrored(true);
        imageView0.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
            ibwm ibwm0 = new ibwm(0, eyyv.a.size() - 1);
            int v1 = ibwt.i(this.a.c - 1, ibwm0);
            this.c = v1;
            boolean z = true;
            this.f.setEnabled(v1 > ((int)ibwm0.g()));
            ImageView imageView0 = this.g;
            if(this.c >= ((int)ibwm0.f())) {
                z = false;
            }
            imageView0.setEnabled(z);
            this.b.g(this.c);
            int v2 = this.h.a;
            this.h.a = ibwt.j(this.c, 0, this.h.b() - 1);
            this.h.r(v2);
            this.h.r(this.h.a);
        });
        imageView1.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
            ibwm ibwm0 = new ibwm(0, eyyv.a.size() - 1);
            int v1 = ibwt.i(this.a.c + 1, ibwm0);
            this.c = v1;
            boolean z = true;
            this.f.setEnabled(v1 > ((int)ibwm0.g()));
            ImageView imageView0 = this.g;
            if(this.c >= ((int)ibwm0.f())) {
                z = false;
            }
            imageView0.setEnabled(z);
            this.b.g(this.c);
            int v2 = this.h.a;
            this.h.a = ibwt.j(this.c, 0, this.h.b() - 1);
            this.h.r(v2);
            this.h.r(this.h.a);
        });
        this.a(0);
    }

    // Detected as a lambda impl.
    public final void a(int v) {
        ibwm ibwm0 = new ibwm(0, eyyv.a.size() - 1);
        int v1 = ibwt.i(v, ibwm0);
        this.c = v1;
        boolean z = true;
        this.f.setEnabled(v1 > ((int)ibwm0.g()));
        ImageView imageView0 = this.g;
        if(this.c >= ((int)ibwm0.f())) {
            z = false;
        }
        imageView0.setEnabled(z);
        this.b.g(this.c);
        int v2 = this.h.a;
        this.h.a = ibwt.j(this.c, 0, this.h.b() - 1);
        this.h.r(v2);
        this.h.r(this.h.a);
    }
}


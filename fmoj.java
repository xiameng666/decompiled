import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v7.widget.RecyclerView;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.ArrayList;
import java.util.List;

public final class fmoj extends LinearLayout {
    public final RecyclerView a;
    public final RecyclerView b;
    public final List c;
    public final List d;
    public boolean e;
    final Paint f;
    public int g;
    public int h;
    public boolean i;
    ue j;
    private static final String k = "fmoj";
    private final Path l;
    private final RectF m;
    private final float n;
    private final float o;
    private int p;

    static {
    }

    public fmoj(Context context0) {
        super(fmrf.b(context0, iaea.j()), null, 0);
        this.l = new Path();
        this.m = new RectF();
        this.i = true;
        this.j = null;
        fmoj.inflate(this.getContext(), 0x7F0E0A0A, this);  // layout:stack_card_view_v2
        RecyclerView recyclerView0 = (RecyclerView)this.findViewById(0x7F0B1F06);  // id:rvTop
        this.a = recyclerView0;
        RecyclerView recyclerView1 = (RecyclerView)this.findViewById(0x7F0B1F05);  // id:rvBottom
        this.b = recyclerView1;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.getContext();
        fmoh fmoh0 = new fmoh(this);
        this.getContext();
        fmoi fmoi0 = new fmoi(this);
        recyclerView0.ap(fmoh0);
        recyclerView1.ap(fmoi0);
        fmoi0.s(true);
        this.n = (float)context0.getResources().getDimensionPixelSize(0x7F070FC4);  // dimen:rich_card_radius
        float f = (float)context0.getResources().getDimensionPixelSize(0x7F070FC6);  // dimen:rich_card_stroke_width
        this.o = f;
        Paint paint0 = new Paint();
        this.f = paint0;
        paint0.setColor(fyho.b(this, 0x7F04030A));  // attr:colorOutlineVariant
        paint0.setStrokeWidth(f);
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setAntiAlias(true);
        this.setOrientation(1);
        this.setBackgroundColor(0);
        this.setClipChildren(true);
    }

    public final void a(fmmb fmmb0, fmqf fmqf0, fmrq fmrq0, fmid fmid0, AccountContext accountContext0, fmga fmga0) {
        gged_interceptors gged0 = fmmb0.a;
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            fmmj fmmj0 = (fmmj)gged0.get(v1);
            switch(fmmj0.a().ordinal()) {
                case 0: {
                    gged_interceptors gged1 = fmmj0.b().a;
                    for(int v2 = 0; v2 < ((ggna)gged1).c; ++v2) {
                        this.c(((fmmo)gged1.get(v2)));
                    }
                    break;
                }
                case 1: {
                    this.c(fmmj0.c());
                }
            }
        }
        fmof fmof0 = new fmof(this.c, fmqf0, fmrq0, fmid0, this.j, accountContext0, fmga0);
        fmof fmof1 = new fmof(this.d, fmqf0, fmrq0, fmid0, this.j, accountContext0, fmga0);
        this.a.an(fmof0);
        this.b.an(fmof1);
        gfsx gfsx0 = fmmb0.b;
        if(gfsx0.i()) {
            this.p = fmro.a(this.getContext(), ((float)(((int)(((Integer)gfsx0.d()))))));
        }
    }

    private static int b(int v, int v1) {
        if(v1 > 0) {
            int v2 = View.MeasureSpec.getSize(v);
            int v3 = View.MeasureSpec.getMode(v);
            switch(v3) {
                case 0x80000000: {
                    return View.MeasureSpec.makeMeasureSpec(Math.min(v2, v1), 0x80000000);
                }
                case 0: {
                    return View.MeasureSpec.makeMeasureSpec(v1, 0x80000000);
                }
                default: {
                    if(v3 != 0x40000000) {
                        flbj.c(fmoj.k, "Invalid MeasureSpecMode: " + v3);
                        return v;
                    }
                    return View.MeasureSpec.makeMeasureSpec(Math.min(v2, v1), 0x40000000);
                }
            }
        }
        return v;
    }

    private final void c(fmmo fmmo0) {
        if(fmmo0.b().equals(fmmn.h)) {
            this.e = true;
            return;
        }
        (this.e ? this.d : this.c).add(fmmo0);
    }

    @Override  // android.view.View
    public final void draw(Canvas canvas0) {
        if(this.i) {
            canvas0.save();
            canvas0.clipPath(this.l);
            super.draw(canvas0);
            canvas0.restore();
            canvas0.drawRoundRect(this.m, this.n, this.n, this.f);
            return;
        }
        super.draw(canvas0);
    }

    @Override  // android.widget.LinearLayout
    protected final void onMeasure(int v, int v1) {
        int v2 = this.p;
        super.onMeasure(fmoj.b((v2 <= 0 ? fmoj.b(v, this.g) : fmoj.b(v, v2)), this.g), fmoj.b(v1, this.h));
    }

    @Override  // android.view.View
    protected final void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        if(v == v2 && v1 == v3) {
            return;
        }
        float f = this.o / 2.0f;
        this.m.set(f, f, ((float)v) - f, ((float)v1) - f);
        this.l.reset();
        this.l.addRoundRect(this.m, this.n, this.n, Path.Direction.CW);
    }
}


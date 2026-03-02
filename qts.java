import android.animation.Animator.AnimatorListener;
import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;

public final class qts extends qtn implements Choreographer.FrameCallback {
    public float c;
    public long d;
    public float e;
    public float f;
    public int g;
    public float h;
    public float i;
    public qkb j;
    public boolean k;
    public boolean l;
    private boolean m;

    public qts() {
        this.c = 1.0f;
        this.m = false;
        this.d = 0L;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0;
        this.h = -2147483648.0f;
        this.i = 2147483648.0f;
        this.k = false;
        this.l = false;
    }

    public final float c() {
        return this.j == null ? 0.0f : (this.f - this.j.k) / (this.j.l - this.j.k);
    }

    @Override  // android.animation.ValueAnimator
    public final void cancel() {
        for(Object object0: this.a) {
            ((Animator.AnimatorListener)object0).onAnimationCancel(this);
        }
        this.a(this.m());
        this.h();
    }

    public final float d() {
        qkb qkb0 = this.j;
        if(qkb0 == null) {
            return 0.0f;
        }
        return this.i == 2147483648.0f ? qkb0.l : this.i;
    }

    @Override  // android.view.Choreographer$FrameCallback
    public final void doFrame(long v) {
        this.g();
        qkb qkb0 = this.j;
        if(qkb0 != null && this.k) {
            float f = this.e;
            float f1 = ((float)(this.d == 0L ? 0L : v - this.d)) / (1000000000.0f / qkb0.m / Math.abs(this.c));
            if(this.m()) {
                f1 = -f1;
            }
            float f2 = f + f1;
            boolean z = Float.compare(f2, this.e()) >= 0 && f2 <= this.d();
            float f3 = this.e;
            float f4 = qtt.a(f2, this.e(), this.d());
            this.e = f4;
            if(this.l) {
                f4 = (float)Math.floor(f4);
            }
            this.f = f4;
            this.d = v;
            if(!this.l || this.e != f3) {
                this.b();
            }
            if(!z) {
                if(this.getRepeatCount() != -1 && this.g >= this.getRepeatCount()) {
                    float f5 = this.c < 0.0f ? this.e() : this.d();
                    this.e = f5;
                    this.f = f5;
                    this.h();
                    this.a(this.m());
                }
                else {
                    for(Object object0: this.a) {
                        ((Animator.AnimatorListener)object0).onAnimationRepeat(this);
                    }
                    ++this.g;
                    if(this.getRepeatMode() == 2) {
                        this.m ^= 1;
                        this.j();
                    }
                    else {
                        float f6 = this.m() ? this.d() : this.e();
                        this.e = f6;
                        this.f = f6;
                    }
                    this.d = v;
                }
            }
            if(this.j != null) {
                float f7 = this.h;
                if(this.f >= f7 && this.f <= this.i) {
                    return;
                }
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", f7, ((float)this.i), ((float)this.f)));
            }
        }
    }

    public final float e() {
        qkb qkb0 = this.j;
        if(qkb0 == null) {
            return 0.0f;
        }
        return this.h == -2147483648.0f ? qkb0.k : this.h;
    }

    public final void f() {
        this.h();
        this.a(this.m());
    }

    public final void g() {
        if(this.k) {
            this.i(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override  // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        if(this.j == null) {
            return 0.0f;
        }
        if(this.m()) {
            return (this.d() - this.f) / (this.d() - this.e());
        }
        float f = this.e();
        return (this.f - f) / (this.d() - this.e());
    }

    @Override  // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return this.c();
    }

    @Override  // android.animation.ValueAnimator
    public final long getDuration() {
        return this.j == null ? 0L : ((long)this.j.a());
    }

    public final void h() {
        this.i(true);
    }

    protected final void i(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if(z) {
            this.k = false;
        }
    }

    @Override  // android.animation.ValueAnimator
    public final boolean isRunning() {
        return this.k;
    }

    public final void j() {
        this.c = -this.c;
    }

    public final void k(float f) {
        if(this.e == f) {
            return;
        }
        float f1 = qtt.a(f, this.e(), this.d());
        this.e = f1;
        if(this.l) {
            f1 = (float)Math.floor(f1);
        }
        this.f = f1;
        this.d = 0L;
        this.b();
    }

    public final void l(float f, float f1) {
        if(f > f1) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", f, f1));
        }
        float f2 = this.j == null ? -3.402823E+38f : this.j.k;
        float f3 = this.j == null ? 3.402823E+38f : this.j.l;
        float f4 = qtt.a(f, f2, f3);
        float f5 = qtt.a(f1, f2, f3);
        if(f4 == this.h && f5 == this.i) {
            return;
        }
        this.h = f4;
        this.i = f5;
        this.k(((float)(((int)qtt.a(this.f, f4, f5)))));
    }

    public final boolean m() {
        return this.c < 0.0f;
    }

    @Override  // android.animation.ValueAnimator
    public final void setRepeatMode(int v) {
        super.setRepeatMode(v);
        if(v != 2 && this.m) {
            this.m = false;
            this.j();
        }
    }
}


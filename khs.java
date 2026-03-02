import android.graphics.drawable.Drawable;

public final class khs {
    public int a;
    public jxn b;
    public boolean c;
    public Drawable d;
    public float e;
    public float f;
    public khv g;

    public khs() {
        this.a = -1;
        this.b = jxn.a;
        this.c = false;
        this.d = null;
        this.e = 0.0f;
        this.f = 1.0f;
    }

    public final void a(khv khv0) {
        if(this.g != null && khv0 != null) {
            throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
        }
        this.g = khv0;
    }
}


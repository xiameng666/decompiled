import android.content.res.ColorStateList;

public final class fmnh implements kar {
    public final fmnk a;

    public fmnh(fmnk fmnk0) {
        this.a = fmnk0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        int v = iaea.j() ? fyho.b(this.a, 0x7F0402DC) : ((int)(((Integer)object0)));  // attr:colorOnPrimary
        ColorStateList colorStateList0 = new ColorStateList(fmnk.a, new int[]{v, (iaea.j() ? jxm.g(fyho.b(this.a, 0x7F0402FC), 38) : this.a.getContext().getColor(0x7F0600FD))});  // attr:colorOnSurfaceVariant
        this.a.b.w(colorStateList0);
    }
}


import android.graphics.drawable.Drawable;

public final class zum implements zsi {
    private final Drawable a;

    public zum(Drawable drawable0) {
        ibuq.f(drawable0, "summaryCardDivider");
        super();
        this.a = drawable0;
    }

    @Override  // zsi
    public final Drawable a(aaem aaem0, aaem aaem1) {
        ibuq.f(aaem0, "currentItem");
        ibuq.f(aaem1, "nextItem");
        boolean z = false;
        if((aaem0 instanceof zun)) {
            grvb grvb0 = ((zun)aaem0).a;
            if((grvb0.b == 1 ? ((grzs)grvb0.c) : grzs.a).d) {
                z = true;
            }
        }
        if(!z && !(aaem1 instanceof zuc)) {
            return this.a;
        }
        zsh.a(aaem0, aaem1);
        return null;
    }

    @Override  // zsi
    public final Drawable b(aaem aaem0, aaem aaem1) {
        boolean z1;
        ibuq.f(aaem0, "currentItem");
        ibuq.f(aaem1, "previousItem");
        boolean z = true;
        if((aaem0 instanceof zun)) {
            grvb grvb0 = ((zun)aaem0).a;
            z1 = (grvb0.b == 1 ? ((grzs)grvb0.c) : grzs.a).d;
        }
        else {
            z1 = false;
        }
        if((aaem1 instanceof zun)) {
            grvb grvb1 = ((zun)aaem1).a;
            if((grvb1.b == 1 ? ((grzs)grvb1.c) : grzs.a).d) {
                z = false;
            }
        }
        else {
            z = false;
        }
        if(!z1 && !z) {
            return this.a;
        }
        ibuq.f(aaem0, "currentItem");
        ibuq.f(aaem1, "previousItem");
        return null;
    }

    @Override  // zsi
    public final int c() {
        return 3;
    }
}


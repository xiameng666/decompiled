import android.os.Bundle;

public final class eqpb {
    public du a;
    private static final int b;
    private final xnz c;
    private final eqpa d;
    private final boolean e;
    private int f;

    static {
        new erqc(new String[]{"D2D", "UI", "FragmentTransitionController"});
        eqpb.b = 0x7F0B14C5;  // id:fragment_container
    }

    public eqpb(xnz xnz0, eqpa eqpa0) {
        this.f = -1;
        this.c = xnz0;
        this.d = eqpa0;
        this.e = hoxb.d() && gaec.B(xnz0);
    }

    public final void a(int v, int v1) {
        this.b(v, v1, null);
    }

    public final void b(int v, int v1, Bundle bundle0) {
        xnz xnz0 = this.c;
        if(xnz0.isFinishing()) {
            return;
        }
        if(this.f == v) {
            v1 = 4;
        }
        this.f = v;
        this.a = this.d.a(v, bundle0);
        ca ca0 = new ca(xnz0.gy());
        switch(v1) {
            case 1: {
                if(this.e) {
                    ca0.I(0x7F0100D4, 0x7F0100D5);  // anim:sud_slide_next_in
                }
                else {
                    ca0.I(0x7F0100C2, 0x7F0100C3);  // anim:slide_next_in
                }
                break;
            }
            case 2: {
                if(this.e) {
                    ca0.I(0x7F0100D2, 0x7F0100D3);  // anim:sud_slide_back_in
                }
                else {
                    ca0.I(0x7F0100B8, 0x7F0100B9);  // anim:slide_back_in
                }
                break;
            }
            case 3: {
                ca0.I(0x10A0000, 0x10A0001);
            }
        }
        du du0 = this.a;
        if((du0 instanceof de)) {
            ca0.v(du0, null);
        }
        else {
            ca0.G(eqpb.b, du0);
        }
        ca0.a();
    }
}


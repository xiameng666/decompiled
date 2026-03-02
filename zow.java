import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.chip.Chip;
import j..util.Objects;

public final class zow extends aaep {
    public final Chip t;
    final zox u;
    private final zem v;

    public zow(zox zox0, View view0, zem zem0) {
        Objects.requireNonNull(zox0);
        this.u = zox0;
        super(view0);
        this.t = (Chip)view0.findViewById(0x7F0B0ACC);  // id:action_chip
        this.v = zem0;
    }

    @Override  // aaep
    public final void D(aaem aaem0) {
        if(aaem0.a() != 4) {
            return;
        }
        grug grug0 = ((zot)aaem0).a;
        Chip chip0 = this.t;
        chip0.setText(grug0.c);
        zox zox0 = this.u;
        Context context0 = zox0.i;
        int v = cchs.a(context0, 0x7F04030C, 0x7F0606C6);  // attr:colorPrimary
        if((grug0.b & 2) != 0) {
            grwd grwd0 = grwd.b((grug0.d == null ? grwe.a : grug0.d).c);
            if(grwd0 != null && aabq.a(context0, grwd0) != 0) {
                Drawable drawable0 = aabq.b(context0, grwd0);
                if(drawable0 != null) {
                    chip0.j(drawable0.mutate());
                    chip0.k(cchs.e(v));
                }
            }
            String s = aabu.c((grug0.d == null ? grwe.a : grug0.d));
            if(s != null) {
                zov zov0 = new zov(this);
                this.v.b(s, zov0);
            }
        }
        if(hoju.p() && (4 & (grug0.e == null ? grwp.a : grug0.e).b) != 0) {
            grwp grwp0 = grug0.e == null ? grwp.a : grug0.e;
            zox0.f.b(chip0, zox0.a, (grwp0.e == null ? grwb.a : grwp0.e));
        }
        chip0.setOnClickListener(new zou(this, grug0));
    }
}


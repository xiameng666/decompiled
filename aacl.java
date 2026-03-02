import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.AvatarView;

public final class aacl implements ibts {
    public final gra a;
    public final aabl b;
    public final boolean c;
    public final boolean d;
    public final lps e;
    public final int f;

    public aacl(gra gra0, aabl aabl0, boolean z, boolean z1, lps lps0, int v) {
        this.a = gra0;
        this.b = aabl0;
        this.c = z;
        this.d = z1;
        this.e = lps0;
        this.f = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((Context)object0), "context");
        Object object1 = new AccountParticleDisc(((Context)object0));
        Drawable drawable0 = null;
        aabm aabm0 = this.b == null ? null : this.b.a(((AccountParticleDisc)object1), this.c);
        this.a.b(aabm0);
        if(this.d) {
            lps lps0 = this.e;
            ibuq.f(lps0, "lifecycleOwner");
            if(!fnxg.c(((AccountParticleDisc)object1).getContext())) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            object1.a.j = false;
            object1.a.l();
            ((AccountParticleDisc)object1).g();
            fntn fntn0 = new fntn();
            Context context0 = ((AccountParticleDisc)object1).getContext();
            ibuq.e(context0, "getContext(...)");
            int v = fhbz.b(((AccountParticleDisc)object1).getContext());
            int v1 = fhbz.a(((AccountParticleDisc)object1).getContext());
            Context context1 = ((AccountParticleDisc)object1).getContext();
            int v2 = AvatarView.b(this.f, context1);
            ibuq.f(context0, "context");
            ColorStateList colorStateList0 = new ColorStateList(new int[][]{new int[]{0x10100A7}, new int[]{0x101009E}, new int[]{0xFEFEFF62}}, new int[]{v, v1, v1});
            Drawable drawable1 = kv.a(context0, 0x7F0805FC);  // drawable:gs_photo_camera_vd_theme_24
            fnxf.c(drawable1, colorStateList0);
            Drawable[] arr_drawable = {new InsetDrawable(drawable1, v2 / 6), null};
            int v3 = fnxf.b(context0);
            if(v3 != 0) {
                Drawable drawable2 = context0.getDrawable(v3);
                if(drawable2 != null) {
                    if((drawable2 instanceof RippleDrawable)) {
                        ((RippleDrawable)drawable2).setRadius(v2 / 2);
                    }
                    drawable0 = drawable2;
                }
            }
            arr_drawable[1] = drawable0;
            ((AccountParticleDisc)object1).o(new fnhp(gged_interceptors.l(new fntf(fntn0, new LayerDrawable(arr_drawable))), lps0));
            return object1;
        }
        return object1;
    }
}


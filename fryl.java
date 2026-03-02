import android.widget.ImageView;

public final class fryl {
    public static final void a(ImageView imageView0, fryk fryk0, ibtw ibtw0) {
        fryi fryi1;
        frxu frxu0;
        String s;
        ibuq.f(imageView0, "<this>");
        ibuq.f(fryk0, "resource");
        fryd fryd0 = null;
        if(fryl.b(fryk0)) {
            imageView0.setImageDrawable(null);
            return;
        }
        if((fryk0 instanceof fryh)) {
            imageView0.setImageResource(((fryh)fryk0).a);
            return;
        }
        if((fryk0 instanceof fryj)) {
            if(ibtw0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if(fsce.a(imageView0.getContext())) {
                s = ((fryj)fryk0).b;
                if(s == null) {
                    s = ((fryj)fryk0).a;
                }
            }
            else {
                s = ((fryj)fryk0).a;
            }
            ibtw0.a(imageView0, s);
            return;
        }
        if((fryk0 instanceof frxu)) {
            imageView0.setImageBitmap(((frxu)fryk0).a);
            return;
        }
        if((fryk0 instanceof fryi)) {
            if(ibtw0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if(fsce.a(imageView0.getContext())) {
                fryi fryi0 = (fryi)fryk0;
            }
            ibtw0.a(imageView0, ((fryi)fryk0).a);
            return;
        }
        if(!(fryk0 instanceof frxv)) {
            throw new ibnq();
        }
        frxt frxt0 = ((frxv)fryk0).b;
        if(frxt0 != null) {
            fryd0 = frxt0.b;
        }
        if(fryd0 == null) {
            throw new IllegalArgumentException("Animation\'s are not supported in Imageview and the fallback isn\'t provided");
        }
        if((fryd0 instanceof frxz)) {
            frxu0 = new frxu(((frxz)fryd0).a);
            fryl.d(imageView0, frxu0);
            return;
        }
        if((fryd0 instanceof frya)) {
            frxu0 = new fryh(((frya)fryd0).a);
            fryl.d(imageView0, frxu0);
            return;
        }
        if((fryd0 instanceof fryb)) {
            fryi1 = new fryi(((fryb)fryd0).a, ((fryb)fryd0).b, ((fryb)fryd0).c, ((fryb)fryd0).d, null, 0x20);
            frxu0 = fryi1;
            fryl.d(imageView0, frxu0);
            return;
        }
        if(!(fryd0 instanceof fryc)) {
            throw new ibnq();
        }
        fryi1 = new fryj(((fryc)fryd0).a, ((fryc)fryd0).b, ((fryc)fryd0).c, null, 8);
        frxu0 = fryi1;
        fryl.d(imageView0, frxu0);
    }

    public static final boolean b(fryk fryk0) {
        ibuq.f(fryk0, "<this>");
        if((fryk0 instanceof fryh)) {
            return ((fryh)fryk0).a == 0;
        }
        if((fryk0 instanceof fryj)) {
            return ((fryj)fryk0).a.length() == 0 && ((fryj)fryk0).c.c == null;
        }
        if(!(fryk0 instanceof frxu)) {
            if((fryk0 instanceof fryi)) {
                return ((fryi)fryk0).a.length() == 0 && ((fryi)fryk0).e.c == null;
            }
            if(!(fryk0 instanceof frxv)) {
                throw new ibnq();
            }
        }
        return false;
    }

    public static final boolean c(fryk fryk0) {
        ibuq.f(fryk0, "<this>");
        return !fryl.b(fryk0);
    }

    public static void d(ImageView imageView0, fryk fryk0) {
        fryl.a(imageView0, fryk0, null);
    }
}


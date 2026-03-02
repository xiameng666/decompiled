import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class bdjd {
    private static final bboh a;
    private final Context b;
    private final bcyv c;
    private final bgkw d;
    private final bdvw e;

    static {
        bdjd.a = bboh.b("CredExportRegistrar", bbcu.cX);
    }

    public bdjd(Context context0, bcyv bcyv0, bgkw bgkw0, bdvw bdvw0) {
        this.b = context0;
        this.c = bcyv0;
        this.d = bgkw0;
        this.e = bdvw0;
    }

    public final Object a(String s, ibrl ibrl0) {
        bdja bdja0;
        if((ibrl0 instanceof bdja)) {
            bdja0 = (bdja)ibrl0;
            int v = bdja0.c;
            if((v & 0x80000000) == 0) {
                bdja0 = new bdja(this, ibrl0);
            }
            else {
                bdja0.c = v - 0x80000000;
            }
        }
        else {
            bdja0 = new bdja(this, ibrl0);
        }
        Object object0 = bdja0.a;
        Object object1 = ibrx.a;
        switch(bdja0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    evql evql0 = this.e.a(new bbll(1, 9), new bblp(0x7FFFFFFF, 9), bdvu.a(s), new bdiz());
                    bdja0.c = 1;
                    object0 = ictn.b(evql0, bdja0);
                    if(object0 == object1) {
                        return object1;
                    label_19:
                        ibnx.b(object0);
                    }
                    return (Bitmap)((bdvt)object0).a;
                }
                catch(IOException iOException0) {
                    break;
                }
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(bdjd.a.j(), "IO error loading avatar bitmap", iOException0);
        return null;
    }

    public final Object b(ibrl ibrl0) {
        Object object3;
        Object object2;
        bdjb bdjb0;
        if((ibrl0 instanceof bdjb)) {
            bdjb0 = (bdjb)ibrl0;
            int v = bdjb0.f;
            if((v & 0x80000000) == 0) {
                bdjb0 = new bdjb(this, ibrl0);
            }
            else {
                bdjb0.f = v - 0x80000000;
            }
        }
        else {
            bdjb0 = new bdjb(this, ibrl0);
        }
        Object object0 = bdjb0.d;
        Object object1 = ibrx.a;
        switch(bdjb0.f) {
            case 0: {
                ibnx.b(object0);
                List list0 = this.c.a();
                ((ggtj)bdjd.a.h()).z("registering %d accounts for exporting credentials", list0.size());
                object2 = new ArrayList(ibpo.q(list0, 10));
                object3 = list0.iterator();
                goto label_25;
            }
            case 1: {
                object2 = bdjb0.c;
                object3 = bdjb0.b;
                Object object4 = bdjb0.a;
                ibnx.b(object0);
                while(true) {
                    ((Collection)object2).add(((bdju)object0));
                    object2 = object4;
                label_25:
                    if(!((Iterator)object3).hasNext()) {
                        break;
                    }
                    Object object5 = ((Iterator)object3).next();
                    bdjb0.a = object2;
                    bdjb0.b = object3;
                    bdjb0.c = object2;
                    bdjb0.f = 1;
                    object0 = this.c(((String)object5), bdjb0);
                    if(object0 == object1) {
                        return object1;
                    }
                    object4 = object2;
                }
                bdjb0.a = null;
                bdjb0.b = null;
                bdjb0.c = null;
                bdjb0.f = 2;
                object0 = Boolean.valueOf(true);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Boolean)object0).booleanValue()) {
            ((ggtj)bdjd.a.h()).x("Success registering export credentials");
            return ibom.a;
        }
        ((ggtj)bdjd.a.h()).x("Error registering export credentials");
        return ibom.a;
    }

    public final Object c(String s, ibrl ibrl0) {
        Bitmap bitmap0;
        bgku bgku1;
        String s2;
        bgku bgku0;
        bdjc bdjc0;
        if((ibrl0 instanceof bdjc)) {
            bdjc0 = (bdjc)ibrl0;
            int v = bdjc0.c;
            if((v & 0x80000000) == 0) {
                bdjc0 = new bdjc(this, ibrl0);
            }
            else {
                bdjc0.c = v - 0x80000000;
            }
        }
        else {
            bdjc0 = new bdjc(this, ibrl0);
        }
        Object object0 = bdjc0.a;
        Object object1 = ibrx.a;
        switch(bdjc0.c) {
            case 0: {
                ibnx.b(object0);
                bdjc0.d = s;
                bdjc0.c = 1;
                object0 = bgkw.a(this.d, s, bdjc0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_21;
            }
            case 1: {
                s = bdjc0.d;
                ibnx.b(object0);
            label_21:
                bgku0 = (bgku)object0;
                if(bgku0 == null) {
                    goto label_42;
                }
                else {
                    String s1 = bgku0.b;
                    if(s1 == null) {
                        goto label_42;
                    }
                    else {
                        bdjc0.d = s;
                        bdjc0.e = bgku0;
                        bdjc0.c = 2;
                        Object object2 = this.a(s1, bdjc0);
                        if(object2 != object1) {
                            s2 = s;
                            bgku1 = bgku0;
                            object0 = object2;
                            goto label_38;
                        }
                        return object1;
                    }
                }
                break;
            }
            case 2: {
                bgku1 = bdjc0.e;
                s2 = bdjc0.d;
                ibnx.b(object0);
            label_38:
                bitmap0 = (Bitmap)object0;
                if(bitmap0 == null) {
                    bgku0 = bgku1;
                    s = s2;
                label_42:
                    Drawable drawable0 = this.b.getResources().getDrawable(0x7F0804B6, this.b.getResources().newTheme());  // drawable:gs_account_circle_full_vd_theme_24
                    Bitmap bitmap1 = Bitmap.createBitmap(drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas0 = new Canvas(bitmap1);
                    drawable0.setBounds(0, 0, canvas0.getWidth(), canvas0.getHeight());
                    drawable0.draw(canvas0);
                    s2 = s;
                    bgku1 = bgku0;
                    bitmap0 = bitmap1;
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(bgku1 != null) {
            return bgku1.a == null ? new bdju(s2, s2, "", bitmap0) : new bdju(s2, s2, bgku1.a, bitmap0);
        }
        return new bdju(s2, s2, "", bitmap0);
    }
}


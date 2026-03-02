import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;
import com.google.android.libraries.messaging.lighter.ui.conversationheader.ConversationHeaderView;

public final class fmso implements gfsi {
    public final fmus a;

    public fmso(fmus fmus0) {
        this.a = fmus0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gfsx gfsx1;
        fmus fmus0 = this.a;
        gged_interceptors gged0 = fmus0.R;
        if(((Boolean)object0).booleanValue()) {
            ggqk ggqk0 = gged0.E();
            while(ggqk0.hasNext()) {
                Object object1 = ggqk0.next();
                fmfj fmfj0 = (fmfj)object1;
                fmbi fmbi0 = fmfj0.b;
                if(fmbi0.a() == fmba.h) {
                    gfsx gfsx0 = fmfj0.c;
                    if(gfsx0.i()) {
                        int v = fmus0.q;
                        fmus0.q = v + 1;
                        ConversationHeaderView conversationHeaderView0 = ((ConversationView)fmus0.a).m;
                        Object object2 = gfsx0.d();
                        int v1 = conversationHeaderView0.g + 1;
                        conversationHeaderView0.g = v1;
                        int v2 = conversationHeaderView0.c.getPaddingTop();
                        int v3 = conversationHeaderView0.c.getPaddingBottom();
                        int v4 = v1 * 50;
                        conversationHeaderView0.c.setPadding(v4, v2, v4, v3);
                        MenuItem menuItem0 = conversationHeaderView0.a.g().add(0, v, 0, fmfj0.a).setOnMenuItemClickListener(fmus0.ae);
                        Bitmap bitmap0 = BitmapFactory.decodeByteArray(((byte[])object2), 0, ((byte[])object2).length);
                        if(bitmap0 == null) {
                            flbj.c("ConHeaderView", "toolbar button icon is null");
                            gfsx1 = gfqx.a;
                        }
                        else {
                            Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap0, ((int)conversationHeaderView0.e), ((int)conversationHeaderView0.f), true);
                            gfsx1 = gfsx.m(new BitmapDrawable(conversationHeaderView0.getResources(), bitmap1));
                        }
                        if(gfsx1.i()) {
                            ((Drawable)gfsx1.d()).setColorFilter(fyho.b(conversationHeaderView0, 0x7F0402FC), PorterDuff.Mode.SRC_IN);  // attr:colorOnSurfaceVariant
                            menuItem0.setIcon(((Drawable)gfsx1.d()));
                        }
                        MenuItem menuItem1 = menuItem0.setShowAsActionFlags(1);
                        int v5 = menuItem1.getItemId();
                        fmus0.r.put(v5, fmbi0);
                        menuItem1.setOnMenuItemClickListener(fmus0.af);
                        fmus0.t.add(menuItem1);
                        fmus0.f.g(String.valueOf(fmbi0.e));
                    }
                }
            }
        }
        return null;
    }
}


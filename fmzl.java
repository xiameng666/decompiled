import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.messaging.lighter.ui.avatar.ContactAvatarView;
import java.util.ArrayList;
import java.util.List;

public final class fmzl extends LinearLayout implements fmrd {
    public int a;
    public final TextView b;
    final Animatable c;
    final pbk d;
    private final List e;
    private final RelativeLayout f;
    private final LinearLayout g;

    public fmzl(Context context0) {
        super(fmrf.b(context0, iaea.j()), null, 0);
        this.e = new ArrayList(5);
        this.a = 5;
        fmzl.inflate(this.getContext(), 0x7F0E0BEE, this);  // layout:typing_indicator_view
        this.g = (LinearLayout)this.findViewById(0x7F0B2390);  // id:typers
        this.c = (Animatable)((ImageView)this.findViewById(0x7F0B2391)).getDrawable();  // id:typing_dots
        this.f = (RelativeLayout)this.findViewById(0x7F0B2392);  // id:typing_indicator_contents
        TextView textView0 = (TextView)this.findViewById(0x7F0B0B35);  // id:additional_typers
        this.b = textView0;
        textView0.setVisibility(8);
        this.d = new fmzk(this);
    }

    public final void a(List list0) {
        if(list0.size() > this.a) {
            this.b.setVisibility(0);
            this.g.setVisibility(8);
            this.b();
            goto label_9;
        }
        if(!list0.isEmpty()) {
            this.g.setVisibility(0);
            this.b.setVisibility(8);
            this.b();
        label_9:
            List list1 = this.e;
            int v = list1.size();
            while(true) {
                --v;
                if(v < 0) {
                    break;
                }
                if(!list0.contains(list1.get(v)) && list1.get(v) != null) {
                    list1.remove(v);
                    this.g.removeViewAt(v);
                }
            }
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                fmeo fmeo0 = (fmeo)list0.get(v1);
                if(!list1.contains(fmeo0)) {
                    list1.add(fmeo0);
                    ContactAvatarView contactAvatarView0 = new ContactAvatarView(this.getContext());
                    contactAvatarView0.a(fmeo0);
                    int v2 = (int)this.getContext().getResources().getDimension(0x7F070264);  // dimen:avatar_size
                    contactAvatarView0.e = v2;
                    Bitmap bitmap0 = contactAvatarView0.f;
                    if(bitmap0 != null) {
                        contactAvatarView0.b.setImageBitmap(Bitmap.createScaledBitmap(bitmap0, v2, v2, false));
                    }
                    contactAvatarView0.setImportantForAccessibility(2);
                    contactAvatarView0.setFocusable(false);
                    contactAvatarView0.setPadding(0, 0, ((int)this.getContext().getResources().getDimension(0x7F070260)), 0);  // dimen:avatar_padding
                    this.g.addView(contactAvatarView0);
                }
            }
            int v3 = list0.size();
            this.f.setContentDescription((list0.size() != 1 || !((fmeo)list0.get(0)).b.i() ? this.getResources().getQuantityString(0x7F130035, v3, new Object[]{v3}) : this.getContext().getString(0x7F1534E2, new Object[]{((fmeo)list0.get(0)).b.d()})));  // plurals:number_of_users_typing_message
            return;
        }
        pbk pbk0 = this.d;
        Drawable drawable0 = (Drawable)this.c;
        if(drawable0 != null && pbk0 != null && (drawable0 instanceof Animatable)) {
            pbq.f(((AnimatedVectorDrawable)drawable0), pbk0);
        }
    }

    @Override  // fmrd
    public final void aL(Object object0) {
        throw null;
    }

    private final void b() {
        Animatable animatable0 = this.c;
        animatable0.stop();
        if(((Drawable)animatable0) != null) {
            pbk pbk0 = this.d;
            if(pbk0 != null && (((Drawable)animatable0) instanceof Animatable)) {
                pbq.d(((AnimatedVectorDrawable)(((Drawable)animatable0))), pbk0);
            }
        }
        animatable0.start();
    }
}


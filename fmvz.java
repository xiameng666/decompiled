import android.content.Context;
import android.content.res.TypedArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.libraries.messaging.lighter.ui.avatar.ContactAvatarView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.MessageCellStatusView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.TimestampHeaderView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.TopLabelView;

public final class fmvz extends FrameLayout implements fmwa {
    public fmga a;
    public final LinearLayout b;
    public final MessageCellStatusView c;
    public final TimestampHeaderView d;
    public final FrameLayout e;
    public final TopLabelView f;
    public final int g;
    public final int h;
    public final int i;
    public fmwi j;
    public final ContactAvatarView k;
    private long l;

    public fmvz(Context context0) {
        super(fmrf.b(context0, iaea.j()), null, 0x7F0401E5);  // attr:bubbleCellStyle
        fmvz.inflate(this.getContext(), 0x7F0E01A5, this);  // layout:bubble_cell_layout
        this.setPadding(this.getContext().getResources().getDimensionPixelSize(0x7F0702EC), this.getContext().getResources().getDimensionPixelSize(0x7F0702EF), this.getContext().getResources().getDimensionPixelSize(0x7F0702EC), 0);  // dimen:bubble_cell_start_end_padding
        this.b = (LinearLayout)this.findViewById(0x7F0B0D76);  // id:bubble_cell_wrapper
        this.k = (ContactAvatarView)this.findViewById(0x7F0B18F2);  // id:message_avatar
        this.c = (MessageCellStatusView)this.findViewById(0x7F0B0D74);  // id:bubble_cell_status_view
        this.d = (TimestampHeaderView)this.findViewById(0x7F0B0D75);  // id:bubble_cell_tombstone_view
        this.e = (FrameLayout)this.findViewById(0x7F0B18F5);  // id:message_content_wrapper
        this.f = (TopLabelView)this.findViewById(0x7F0B22F6);  // id:top_label_layout
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(null, fmwe.b, 0x7F0401E5, 0x7F160490);  // attr:bubbleCellStyle
        this.g = typedArray0.getResourceId(2, 0x7F161020);  // style:UndefinedLabelText
        this.h = typedArray0.getResourceId(1, 0x7F16035D);  // style:DefaultLabelText
        this.i = typedArray0.getResourceId(0, 0x7F16028D);  // style:BotLabelText
        typedArray0.recycle();
    }

    @Override  // fmwa
    public final void a(fmwd fmwd0) {
        throw null;
    }

    @Override  // fmrd
    public final void aL(Object object0) {
        throw null;
    }

    @Override  // fmsc
    public final void b() {
        this.c.c = gfqx.a;
        this.k.b();
    }

    public final void c(View view0) {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams0.setMargins(this.getContext().getResources().getDimensionPixelSize(0x7F0702EC), 0, this.getContext().getResources().getDimensionPixelSize(0x7F0702EC), 0);  // dimen:bubble_cell_start_end_padding
        view0.setId(0x7F0B18F4);  // id:message_content
        fmwi fmwi0 = this.j;
        if(fmwi0 != null) {
            this.e.removeView(fmwi0);
        }
        this.j = (fmwi)view0;
        this.e.addView(view0, frameLayout$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: {
                flba.a();
                this.l = System.currentTimeMillis();
                return false;
            }
            case 1: {
                flba.a();
                if(System.currentTimeMillis() - this.l < 200L) {
                    if(this.a.g.equals(fmft.g)) {
                        this.performClick();
                        return true;
                    }
                    if(this.a.f.a() == 2 && !((fmwi)this.e.getChildAt(0)).hasSelection()) {
                        this.performClick();
                        return true;
                    }
                }
                return false;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(1.0f);
    }
}


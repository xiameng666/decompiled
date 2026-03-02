import android.content.Context;
import android.content.res.TypedArray;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.richcard.ui.CardCarouselView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.MessageCellStatusView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.TimestampHeaderView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.TopLabelView;

public final class fmnv extends LinearLayout implements fmwl {
    final MessageCellStatusView a;
    final TimestampHeaderView b;
    final CardCarouselView c;
    final TopLabelView d;
    AccountContext e;
    public fmqf f;
    public fmrq g;
    public fmid h;
    private final int i;
    private final int j;
    private final int k;

    public fmnv(Context context0) {
        super(context0, null, 0x7F0401E5);  // attr:bubbleCellStyle
        this.f = fmqg.a;
        this.g = fmrq.b;
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, fmng.a, 0x7F0401E5, 0x7F160490);  // attr:bubbleCellStyle
        this.i = typedArray0.getResourceId(2, 0x7F161020);  // style:UndefinedLabelText
        this.j = typedArray0.getResourceId(1, 0x7F16035D);  // style:DefaultLabelText
        this.k = typedArray0.getResourceId(0, 0x7F16028D);  // style:BotLabelText
        typedArray0.recycle();
        fmnv.inflate(this.getContext(), 0x7F0E08BA, this);  // layout:rich_card_view
        MessageCellStatusView messageCellStatusView0 = (MessageCellStatusView)this.findViewById(0x7F0B0D74);  // id:bubble_cell_status_view
        this.a = messageCellStatusView0;
        this.b = (TimestampHeaderView)this.findViewById(0x7F0B0D75);  // id:bubble_cell_tombstone_view
        this.d = (TopLabelView)this.findViewById(0x7F0B22F6);  // id:top_label_layout
        this.c = (CardCarouselView)this.findViewById(0x7F0B1E80);  // id:rich_card_carousel
        messageCellStatusView0.setPadding(this.getContext().getResources().getDimensionPixelSize(0x7F0708D5), messageCellStatusView0.getPaddingTop(), this.getContext().getResources().getDimensionPixelSize(0x7F0708D5), messageCellStatusView0.getPaddingBottom());  // dimen:label_padding_start
        this.setOrientation(1);
    }

    @Override  // fmwa
    public final void a(fmwd fmwd0) {
        this.setPadding(0, 0, 0, 0);
        gfsx gfsx0 = fmwd0.a;
        if(!gfsx0.i()) {
            return;
        }
        fmga fmga0 = (fmga)gfsx0.d();
        int v = fmga0.r;
        if(v == 0) {
            throw null;
        }
        switch(v - 1) {
            case 0: {
                this.d.setVisibility(0);
                this.setGravity(0x800003);
                this.c.ac = 0x800003;
                break;
            }
            case 1: {
                if(!fmwd0.d || (fmwd0.c == 0 || fmwd0.c == 1)) {
                    this.setPadding(0, this.getContext().getResources().getDimensionPixelSize(0x7F0713B4), 0, 0);  // dimen:top_padding_outgoing_message
                }
                this.d.setVisibility(8);
                this.setGravity(0x800005);
                this.c.ac = 0x800005;
            }
        }
        gfsx gfsx1 = fmjs.a(((fmga)gfsx0.d()));
        TopLabelView topLabelView0 = this.d;
        gfsx gfsx2 = fmwd0.b.b;
        topLabelView0.b(((String)gfsx2.f("")));
        TextView textView0 = topLabelView0.a;
        textView0.setContentDescription(((CharSequence)fmwd0.b.c.f("")));
        gfsx gfsx3 = fmwd0.b.k;
        if(gfsx3.i()) {
            int v1 = ((fmfl)gfsx3.d()).b;
            switch(v1) {
                case 0: {
                    textView0.setTextAppearance(this.i);
                    topLabelView0.a(8);
                    break;
                }
                case 1: {
                    textView0.setTextAppearance(this.j);
                    topLabelView0.a(8);
                    break;
                }
                default: {
                    if(v1 == 2) {
                        textView0.setTextAppearance(this.k);
                        if(gfsx2.i()) {
                            topLabelView0.a(0);
                        }
                    }
                }
            }
        }
        else {
            textView0.setTextAppearance(this.i);
        }
        if(gfsx1.i()) {
            Object object0 = gfsx1.d();
            this.c.a(((fmlz)object0), this.f, this.g, this.h, this.e, fmga0);
        }
        this.a.a(fmwd0);
        this.b.a(fmwd0);
    }

    @Override  // fmrd
    public final void aL(Object object0) {
        throw null;
    }

    @Override  // fmsc
    public final void b() {
    }

    @Override  // fmwl
    public final void c(fmnr fmnr0) {
        boolean z = this.isClickable();
        this.setOnClickListener(new fmnu(fmnr0));
        this.setClickable(z);
    }
}


import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

public final class dvyd extends dtjf {
    final guhs a;

    public dvyd(Context context0, guhs guhs0) {
        super(context0);
        this.a = guhs0;
    }

    @Override  // dtjf
    protected final int a() {
        return hwev.c() ? 0x7F0E0DEA : 0x7F0E0DEB;  // layout:wallet_valuable_detail_list_item_material_pass_progress_bar
    }

    @Override  // dtjf
    protected final FrameLayout b() {
        return (FrameLayout)this.findViewById(0x7F0B0650);  // id:PassProgressBarContainerView
    }

    @Override  // dtjf
    protected final ImageView c() {
        return (ImageView)this.findViewById(0x7F0B0325);  // id:DetailProgressBarImage
    }

    @Override  // dtjf
    protected final TextView d() {
        return (TextView)this.findViewById(0x7F0B0327);  // id:DetailProgressBarLegalText
    }

    @Override  // dtjf
    protected final TextView e() {
        return (TextView)this.findViewById(0x7F0B02E5);  // id:DetailListItemProgressProgressText
    }

    @Override  // dtjf
    protected final TextView f() {
        return (TextView)this.findViewById(0x7F0B032A);  // id:DetailRewardsEarnedText
    }

    @Override  // dtjf
    protected final TextView g() {
        return (TextView)this.findViewById(0x7F0B02E3);  // id:DetailListItemProgressBarSubtitle
    }

    @Override  // dtjf
    protected final TextView h() {
        return (TextView)this.findViewById(0x7F0B02E4);  // id:DetailListItemProgressBarTitle
    }

    @Override  // dtjf
    protected final CardView i() {
        return (CardView)this.findViewById(0x7F0B06D9);  // id:ProgressBarCardView
    }

    @Override  // dtjf
    protected final dtjh j(Context context0) {
        return new dssl(context0);
    }

    @Override  // dtjf
    protected final void k(guhu guhu0) {
        if(this.a == guhs.c) {
            CardView cardView0 = this.b;
            Context context0 = this.getContext();
            cardView0.d(fipw.b.a(context0));
        }
    }

    @Override  // dtjf
    public final void l(guhu guhu0, gufs gufs0) {
        super.l(guhu0, gufs0);
        if((guhu0.b & 0x40) != 0 || (guhu0.b & 0x100) != 0) {
            this.findViewById(0x7F0B0326).setVisibility(0);  // id:DetailProgressBarImageContainer
        }
        if(this.a == guhs.d) {
            this.findViewById(0x7F0B02E2).setPadding(0, 0, 0, 0);  // id:DetailListItemProgressBarRootView
            int v = this.getResources().getDimensionPixelSize(0x7F070DFD);  // dimen:pay_medium_spacing
            int v1 = this.getResources().getDimensionPixelSize(0x7F07051C);  // dimen:detail_list_item_progress_bar_spacing
            this.findViewById(0x7F0B06E3).setPadding(v, v1, v, v1);  // id:ProgressBarViewContainer
        }
    }
}


import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import com.google.android.material.chip.ChipGroup;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

final class ztr extends aaep {
    public final aacf t;
    private final ChipGroup u;

    @AssistedInject
    public ztr(@Assisted View view0, aacf aacf0) {
        super(view0);
        this.u = (ChipGroup)view0.findViewById(0x7F0B14B0);  // id:footer_chip_group
        this.t = aacf0;
    }

    @Override  // aaep
    public final void D(aaem aaem0) {
        Button button0;
        grvx grvx0 = ((ztm)aaem0).a;
        int v = grvx0.b.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ChipGroup chipGroup0 = this.u;
            if(v1 < chipGroup0.getChildCount()) {
                button0 = (Button)chipGroup0.getChildAt(v1);
            }
            else {
                Button button1 = (Button)LayoutInflater.from(chipGroup0.getContext()).inflate(0x7F0E00CE, chipGroup0, false);  // layout:as_cards_screen_footer_item
                chipGroup0.addView(button1);
                button0 = button1;
            }
            grvy grvy0 = (grvy)grvx0.b.get(v1);
            button0.setText(grvy0.b);
            button0.setContentDescription(grvy0.c);
            button0.setOnClickListener(new ztq(this, grvy0));
        }
        int v2 = this.u.getChildCount() - v;
        this.u.removeViews(v, v2);
    }
}


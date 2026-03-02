import android.text.Layout;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.growth.uiflow.ui.widget.SummaryCard;
import com.google.android.material.button.MaterialButton;

public final class bvzw implements ibts {
    public final SummaryCard a;

    public bvzw(SummaryCard summaryCard0) {
        this.a = summaryCard0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Integer integer0;
        ibuq.f(((View)object0), "$this$addOnGlobalLayoutListener");
        SummaryCard summaryCard0 = this.a;
        summaryCard0.i = summaryCard0.getHeight();
        summaryCard0.g = (ConstraintLayout)summaryCard0.findViewById(0x7F0B218A);  // id:summary_card_content_container
        ConstraintLayout constraintLayout0 = null;
        if(bwdz.j(summaryCard0)) {
            ConstraintLayout constraintLayout1 = summaryCard0.g;
            if(constraintLayout1 == null) {
                ibuq.j("constraintLayout");
                constraintLayout1 = null;
            }
            bwea.d(constraintLayout1, new bwar());
        }
        ImageView imageView0 = (ImageView)summaryCard0.k().findViewById(0x7F0B23D9);  // id:up_media_lottie
        if(imageView0 != null) {
            imageView0.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        bwdm bwdm0 = summaryCard0.j;
        if(bwdm0 == null) {
            ibuq.j("uiFlowFlags");
            bwdm0 = null;
        }
        if(!bwdm0.h()) {
            if(summaryCard0.r()) {
                TextView textView0 = summaryCard0.n();
                ibuq.e(textView0, "<get-title>(...)");
                ibuq.f(textView0, "<this>");
                Layout layout0 = textView0.getLayout();
                if(layout0 == null) {
                    integer0 = null;
                }
                else {
                    integer0 = layout0.getLineCount();
                    if(integer0.intValue() <= 0) {
                        integer0 = null;
                    }
                }
                if((integer0 == null || layout0.getEllipsisCount(((int)integer0) - 1) <= 0) && summaryCard0.n().getLineHeight() <= summaryCard0.n().getHeight()) {
                    summaryCard0.n().setGravity(0x800033);
                    goto label_46;
                }
                goto label_33;
            }
            else {
            label_33:
                summaryCard0.n().setGravity(0x800013);
                ConstraintLayout constraintLayout2 = summaryCard0.g;
                if(constraintLayout2 == null) {
                    ibuq.j("constraintLayout");
                    constraintLayout2 = null;
                }
                bwea.d(constraintLayout2, new bwau());
                TextView textView1 = summaryCard0.n();
                ibuq.e(textView1, "<get-title>(...)");
                bwav bwav0 = new bwav();
                ibuq.f(textView1, "<this>");
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = bweb.b(textView1);
                bwav0.a(viewGroup$MarginLayoutParams0);
                textView1.setLayoutParams(viewGroup$MarginLayoutParams0);
            }
        }
    label_46:
        MaterialButton materialButton0 = summaryCard0.p();
        ibuq.e(materialButton0, "<get-expandButton>(...)");
        bwbx.b(materialButton0, new bwas(summaryCard0));
        ConstraintLayout constraintLayout3 = summaryCard0.g;
        if(constraintLayout3 == null) {
            ibuq.j("constraintLayout");
        }
        else {
            constraintLayout0 = constraintLayout3;
        }
        summaryCard0.h = bwea.a(constraintLayout0);
        bwdz.g(summaryCard0, new bwat(summaryCard0));
        return ibom.a;
    }
}


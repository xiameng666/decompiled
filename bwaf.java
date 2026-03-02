import com.google.android.gms.growth.uiflow.ui.widget.SummaryCard;

public final class bwaf implements ibth {
    public final SummaryCard a;

    public bwaf(SummaryCard summaryCard0) {
        this.a = summaryCard0;
    }

    @Override  // ibth
    public final Object a() {
        Object object0 = new jtc();
        SummaryCard summaryCard0 = this.a;
        jtc jtc0 = summaryCard0.h;
        bwdm bwdm0 = null;
        if(jtc0 == null) {
            ibuq.j("collapsedConstraints");
            jtc0 = null;
        }
        ((jtc)object0).f(jtc0);
        bwea.c(((jtc)object0));
        ((jtc)object0).d(0x7F0B23BB, 6);  // id:uiflow_summary_card_media
        ((jtc)object0).h(0x7F0B23BB, 7, 0, 6);  // id:uiflow_summary_card_media
        bwea.b(((jtc)object0), 0x7F0B23BC, -2);  // id:uiflow_summary_card_title
        ((jtc)object0).d(0x7F0B23B6, 4);  // id:uiflow_summary_card_expand_button
        int v = summaryCard0.j();
        ((jtc)object0).i(0x7F0B23BC, 3, 0, 3, v + v);  // id:uiflow_summary_card_title
        ((jtc)object0).i(0x7F0B23B6, 3, 0, 3, summaryCard0.j());  // id:uiflow_summary_card_expand_button
        ((jtc)object0).i(0x7F0B23BC, 6, 0x7F0B23B9, 7, summaryCard0.i());  // id:uiflow_summary_card_title
        ((jtc)object0).i(0x7F0B23B7, 6, 0x7F0B23B9, 7, summaryCard0.i());  // id:uiflow_summary_card_expanded_body
        ((jtc)object0).i(0x7F0B23BA, 6, 0x7F0B23B9, 7, summaryCard0.i());  // id:uiflow_summary_card_feature_disclaimer
        bwdm bwdm1 = summaryCard0.j;
        if(bwdm1 == null) {
            ibuq.j("uiFlowFlags");
        }
        else {
            bwdm0 = bwdm1;
        }
        if(!bwdm0.h()) {
            ((jtc)object0).h(0x7F0B23B5, 6, 0x7F0B23B9, 7);  // id:uiflow_summary_card_cta
            if(summaryCard0.r()) {
                ((jtc)object0).i(0x7F0B23B5, 3, summaryCard0.h(), 4, summaryCard0.j());  // id:uiflow_summary_card_cta
                ((jtc)object0).i(0x7F0B23B5, 4, 0, 4, summaryCard0.j());  // id:uiflow_summary_card_cta
            }
            else {
                int v1 = summaryCard0.h();
                int v2 = summaryCard0.j();
                ((jtc)object0).i(v1, 4, 0, 4, v2 + v2);
            }
            ((jtc)object0).i(0x7F0B23B5, 6, 0x7F0B23B9, 7, summaryCard0.i());  // id:uiflow_summary_card_cta
        }
        else if(summaryCard0.r()) {
            ((jtc)object0).i(0x7F0B23B5, 3, summaryCard0.h(), 4, summaryCard0.j());  // id:uiflow_summary_card_cta
        }
        else {
            int v3 = summaryCard0.h();
            int v4 = summaryCard0.j();
            ((jtc)object0).i(v3, 4, 0, 4, v4 + v4);
        }
        double f = (double)summaryCard0.l().getHeight();
        ((jtc)object0).h(0x7F0B23B9, 3, 0, 3);  // id:uiflow_summary_card_expanded_media_container
        ((jtc)object0).h(0x7F0B23B9, 6, 0, 6);  // id:uiflow_summary_card_expanded_media_container
        bwea.e(((jtc)object0), ((int)(f * 0.5)));
        int v5 = summaryCard0.j();
        ((jtc)object0).i(0x7F0B23BC, 3, 0, 3, v5 + v5);  // id:uiflow_summary_card_title
        ((jtc)object0).i(0x7F0B23B6, 3, 0, 3, summaryCard0.j());  // id:uiflow_summary_card_expand_button
        ((jtc)object0).i(0x7F0B23BC, 6, 0x7F0B23B9, 7, summaryCard0.i());  // id:uiflow_summary_card_title
        ((jtc)object0).i(0x7F0B23B7, 6, 0x7F0B23B9, 7, summaryCard0.i());  // id:uiflow_summary_card_expanded_body
        ((jtc)object0).i(0x7F0B23BA, 6, 0x7F0B23B9, 7, summaryCard0.i());  // id:uiflow_summary_card_feature_disclaimer
        return object0;
    }
}


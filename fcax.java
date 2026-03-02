import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.wallet.activity.GenericDelegatorChimeraActivity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.component.filter.FilterCategoryNameView;
import com.google.android.wallet.clientlog.LogContext;
import java.util.List;
import java.util.Locale;

public final class fcax extends faxy implements View.OnClickListener, gcjp, gdan {
    Toolbar c;
    fcaw d;
    private gcjn e;

    public fcax(GenericDelegatorChimeraActivity genericDelegatorChimeraActivity0) {
        super(genericDelegatorChimeraActivity0);
    }

    @Override  // gcjp
    public final void K(gffq gffq0, List list0) {
        int v = gfev.a(gffq0.e);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        if(v - 1 != 3) {
            Locale locale0 = Locale.US;
            int v2 = gfev.a(gffq0.e);
            if(v2 != 0) {
                v1 = v2;
            }
            throw new IllegalArgumentException(String.format(locale0, "Unsupported resulting action type: %s", ((int)(v1 - 1))));
        }
        gffk gffk0 = gffq0.c == 4 ? ((gffk)gffq0.d) : gffk.a;
        if(this.ld((gffk0.c ? null : gffk0.b))) {
            Intent intent0 = new Intent();
            gciq.k(intent0, "filterValue", ((MessageLite)this.d.a()));
            intent0.putExtra("dependencyGraphActionToken", (gffq0.c == 4 ? ((gffk)gffq0.d) : gffk.a).e.toByteArray());
            GenericDelegatorChimeraActivity genericDelegatorChimeraActivity0 = this.a;
            genericDelegatorChimeraActivity0.setResult(-1, intent0);
            genericDelegatorChimeraActivity0.finish();
        }
    }

    @Override  // faxy
    public final void a(Bundle bundle0) {
        super.a(bundle0);
        fbgn.D(this.a, ((BuyFlowConfig)this.a.getIntent().getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig")), fbgn.j, true);
    }

    @Override  // faxy
    public final void b(Bundle bundle0) {
        super.b(bundle0);
        GenericDelegatorChimeraActivity genericDelegatorChimeraActivity0 = this.a;
        genericDelegatorChimeraActivity0.setContentView(0x7F0E0C8A);  // layout:wallet_activity_filter
        Toolbar toolbar0 = (Toolbar)genericDelegatorChimeraActivity0.findViewById(0x7F0B22D9);  // id:toolbar
        this.c = toolbar0;
        genericDelegatorChimeraActivity0.hG(toolbar0);
        genericDelegatorChimeraActivity0.hL().o(true);
        ViewGroup viewGroup0 = (ViewGroup)genericDelegatorChimeraActivity0.findViewById(0x7F0B0FCE);  // id:container
        Intent intent0 = genericDelegatorChimeraActivity0.getIntent();
        Bundle bundle1 = intent0.getExtras();
        hcer hcer0 = (hcer)gciq.a(bundle1, "filter", ((Parser)((ProtoLiteMessage)hcer.a).jf(7, null)));
        genericDelegatorChimeraActivity0.setTitle(hcer0.e);
        for(Object object0: hcer0.c) {
            FilterCategoryNameView filterCategoryNameView0 = (FilterCategoryNameView)genericDelegatorChimeraActivity0.getLayoutInflater().inflate(0x7F0E0E37, viewGroup0, false);  // layout:wallet_view_filter_category_name
            filterCategoryNameView0.a = (hces)object0;
            filterCategoryNameView0.setText(((hces)object0).e);
            filterCategoryNameView0.setOnClickListener(this);
            viewGroup0.addView(filterCategoryNameView0);
        }
        gcjn gcjn0 = new gcjn(((gfet)gciq.a(bundle1, "dependencyGraph", ((Parser)((ProtoLiteMessage)gfet.a).jf(7, null)))));
        this.e = gcjn0;
        gcjo.b(this, 1L, gcjn0);
        gcjo.b(this, 2L, this.e);
        LogContext logContext0 = this.b;
        gdcl gdcl0 = new gdcl(genericDelegatorChimeraActivity0.getSupportFragmentManager(), logContext0, genericDelegatorChimeraActivity0, intent0.getStringExtra("analyticsSessionId"));
        gdcl0.a = this.e;
        fcaw fcaw0 = new fcaw(gdcl0);
        this.d = fcaw0;
        fcaw0.c();
    }

    @Override  // gdan
    public final boolean lb(List list0) {
        return this.d.lb(list0);
    }

    @Override  // gdan
    public final boolean ld(List list0) {
        return this.d.ld(list0);
    }

    @Override  // gdan
    public final boolean le() {
        return this.d.le();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if((view0 instanceof FilterCategoryNameView)) {
            this.d.b(((FilterCategoryNameView)view0).a);
        }
    }
}


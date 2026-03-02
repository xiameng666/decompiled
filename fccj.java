import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.wallet.ui.component.table.RowClickFrameLayout;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class fccj extends gdak {
    fccm a;
    private final gamj ag;
    private String ah;
    RecyclerView b;
    fccn c;
    RowClickFrameLayout d;

    public fccj() {
        this.ag = new gamj(28);
    }

    @Override  // gami
    public final gamj B() {
        return this.ag;
    }

    @Override  // gdak
    protected final gewg C() {
        return null;
    }

    @Override  // gdak
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)hcfj.b).jf(7, null);
    }

    @Override  // gdcm
    protected final void M() {
        boolean z = this.ca;
        RecyclerView recyclerView0 = this.b;
        if(recyclerView0 != null) {
            recyclerView0.setEnabled(z);
            this.d.setEnabled(z);
            fccn fccn0 = this.c;
            if(fccn0 != null) {
                RecyclerView recyclerView1 = this.b;
                fccn0.h = z;
                int v = recyclerView1.getChildCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((fccf)recyclerView1.o(recyclerView1.getChildAt(v1))).E(fccn0.e, fccn0.h);
                }
            }
        }
    }

    @Override  // gdak
    public final long bs() {
        this.aj();
        return ((hcfj)this.aA).d;
    }

    @Override  // gdaa
    public final boolean la() {
        return true;
    }

    @Override  // gczu
    public final ArrayList lh() {
        return new ArrayList();
    }

    @Override  // gami
    public final List li() {
        return Collections.EMPTY_LIST;
    }

    @Override  // gdaa
    public final boolean ly(getg getg0) {
        return false;
    }

    @Override  // gdak
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.ah = this.getArguments().getString("analyticsId");
    }

    @Override  // gdcm
    public final void onResume() {
        int v5;
        int v4;
        int[] arr_v;
        float[] arr_f;
        if(((hcfj)this.aA).c.size() > 0) {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0.m == null) {
                recyclerView0.setVisibility(0);
                this.a = new fccm(((hcfj)this.aA));
                fccm fccm0 = this.a;
                gdcl gdcl0 = super.bC();
                gdcl0.f = this.ah;
                fccn fccn0 = new fccn(fccm0, gdcl0);
                this.c = fccn0;
                fccn0.e.a = this.cb;
                hcff hcff0 = (hcff)((hcfj)this.aA).c.get(0);
                int v1 = hcff0.c.size();
                int v3 = 0;
                for(int v2 = 0; v2 < v1; ++v2) {
                    v3 += fcco.a(((hcfc)hcff0.c.get(v2)));
                }
                SpannedGridLayoutManager spannedGridLayoutManager0 = new SpannedGridLayoutManager(new fcck(this.a), v3);
                List list0 = new hfuh(((hcfj)this.aA).e, hcfj.a);
                if(list0.isEmpty()) {
                    list0 = Collections.nCopies(v3, hcfi.c);
                    arr_f = new float[v3];
                    arr_v = new int[v3];
                    goto label_30;
                }
                else {
                    if(list0.size() != v3) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Table %d has mis-matched columns and hints. %d columns but %d hints.", ((long)((hcfj)this.aA).d), v3, list0.size()));
                    }
                    arr_f = new float[v3];
                    arr_v = new int[v3];
                label_30:
                    for(int v = 0; v < v3; ++v) {
                        switch(((hcfi)list0.get(v)).ordinal()) {
                            case 1: {
                                v4 = 0x7F07152E;  // dimen:wallet_table_small_column_weight
                                break;
                            }
                            case 3: {
                                v4 = 0x7F071529;  // dimen:wallet_table_large_column_weight
                                break;
                            }
                            default: {
                                v4 = 0x7F07152B;  // dimen:wallet_table_medium_column_weight
                            }
                        }
                        TypedValue typedValue0 = new TypedValue();
                        this.getResources().getValue(v4, typedValue0, true);
                        arr_f[v] = typedValue0.getFloat();
                        switch(((hcfi)list0.get(v)).ordinal()) {
                            case 1: {
                                v5 = 0x7F07152D;  // dimen:wallet_table_small_column_min_size
                                break;
                            }
                            case 3: {
                                v5 = 0x7F071528;  // dimen:wallet_table_large_column_min_size
                                break;
                            }
                            default: {
                                v5 = 0x7F07152A;  // dimen:wallet_table_medium_column_min_size
                            }
                        }
                        arr_v[v] = this.getResources().getDimensionPixelSize(v5);
                    }
                    spannedGridLayoutManager0.b = new gakw(v3, arr_f, arr_v);
                    spannedGridLayoutManager0.aU();
                    RowClickFrameLayout rowClickFrameLayout0 = this.d;
                    rowClickFrameLayout0.c = this.a;
                    rowClickFrameLayout0.d = this.c;
                    this.b.C(rowClickFrameLayout0);
                    this.b.A(new fcci(this.a, this.bV));
                    this.b.ap(spannedGridLayoutManager0);
                    this.b.an(this.c);
                    this.M();
                }
            }
        }
        super.onResume();
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0D47, viewGroup0, false);  // layout:wallet_fragment_table
        this.b = (RecyclerView)view0.findViewById(0x7F0B2219);  // id:table
        this.d = (RowClickFrameLayout)view0.findViewById(0x7F0B1EB6);  // id:row_click_frame_layout
        this.b.setVisibility(8);
        this.b.setNestedScrollingEnabled(false);
        return view0;
    }
}


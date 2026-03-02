import android.accounts.Account;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public final class dmnc extends tk {
    private final Context a;
    private final dsoz e;
    private final boolean f;
    private final boolean g;
    private final List h;
    private final ibth i;
    private final List j;

    public dmnc(Context context0, dsoz dsoz0, boolean z, List list0) {
        this(context0, dsoz0, false, z, list0, null);
    }

    public dmnc(Context context0, dsoz dsoz0, boolean z, boolean z1, List list0, ibth ibth0) {
        ibuq.f(dsoz0, "imageTargetLoader");
        ibuq.f(list0, "cardsList");
        super();
        this.a = context0;
        this.e = dsoz0;
        this.f = z;
        this.g = z1;
        this.h = list0;
        this.i = ibth0;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: list0) {
            Account account0 = ((dmmb)object0).a();
            Object object1 = linkedHashMap0.get(account0);
            if(object1 == null) {
                object1 = new ArrayList();
                linkedHashMap0.put(account0, object1);
            }
            ((List)object1).add(object0);
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object2: linkedHashMap0.entrySet()) {
            Account account1 = (Account)((Map.Entry)object2).getKey();
            List list1 = (List)((Map.Entry)object2).getValue();
            List list2 = ibpo.b(new dmlt(account1));
            ArrayList arrayList1 = new ArrayList(ibpo.q(list1, 10));
            for(Object object3: list1) {
                arrayList1.add(((dmmb)object3).b(this.a));
            }
            ibpo.D(arrayList0, ibpo.ak(list2, arrayList1));
        }
        this.j = arrayList0;
    }

    @Override  // tk
    public final int b() {
        return this.j.size();
    }

    @Override  // tk
    public final int dx(int v) {
        dmlw dmlw0 = (dmlw)this.j.get(v);
        if((dmlw0 instanceof dmlt)) {
            return 0;
        }
        if((dmlw0 instanceof dmlv)) {
            return 1;
        }
        throw new ibnq();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        int v1 = new int[]{1, 2}[v];
        if(v1 != 0) {
            switch(v1 - 1) {
                case 0: {
                    View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E06DB, viewGroup0, false);  // layout:pay_frw_account_item_view
                    ibuq.c(view0);
                    return new dmmz(view0);
                }
                case 1: {
                    View view1 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E06DE, viewGroup0, false);  // layout:pay_frw_transit_card_item_view
                    ibuq.c(view1);
                    return new dmnb(view1, this.i);
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        throw null;
    }

    public final List f() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.j) {
            dmlw dmlw0 = (dmlw)object0;
            if((dmlw0 instanceof dmlv) && ((dmlv)dmlw0).h) {
                arrayList0.add(object0);
            }
        }
        List list0 = new ArrayList(ibpo.q(arrayList0, 10));
        for(Object object1: arrayList0) {
            ibuq.d(((dmlw)object1), "null cannot be cast to non-null type com.google.android.gms.pay.factoryreset.wizard.CardListItem.CardItem");
            list0.add(((dmlv)(((dmlw)object1))).a);
        }
        return list0;
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ibuq.f(uq0, "viewHolder");
        if((uq0 instanceof dmmz)) {
            Object object0 = this.j.get(v);
            ibuq.d(object0, "null cannot be cast to non-null type com.google.android.gms.pay.factoryreset.wizard.CardListItem.AccountItem");
            ibuq.f(((dmlt)object0), "item");
            ((dmmz)uq0).t.setText(((dmlt)object0).a.name);
            return;
        }
        if((uq0 instanceof dmnb)) {
            Object object1 = this.j.get(v);
            ibuq.d(object1, "null cannot be cast to non-null type com.google.android.gms.pay.factoryreset.wizard.CardListItem.CardItem");
            boolean z = this.f;
            boolean z1 = this.g;
            ibuq.f(((dmlv)object1), "item");
            ibuq.f(this.e, "imageTargetLoader");
            fsda fsda0 = new fsda(((dmnb)uq0).u);
            this.e.c(fsda0, ((dmlv)object1).b);
            boolean z2 = ((dmlv)object1).g;
            int v1 = 0;
            if(z2) {
                ((dmnb)uq0).x.setVisibility((z ? 0 : 8));
                ((dmnb)uq0).y.setVisibility((z || !z1 ? 8 : 0));
                ((dmnb)uq0).z.setVisibility((z || z1 ? 8 : 0));
            }
            else {
                ((dmnb)uq0).x.setVisibility(8);
                ((dmnb)uq0).y.setVisibility(8);
                ((dmnb)uq0).z.setVisibility(8);
            }
            TextView textView0 = ((dmnb)uq0).v;
            textView0.setText(((dmlv)object1).c);
            Integer integer0 = ((dmlv)object1).e;
            if(integer0 != null) {
                textView0.setTextColor(integer0.intValue());
            }
            TextView textView1 = ((dmnb)uq0).w;
            String s = ((dmlv)object1).d;
            if(s.length() == 0) {
                v1 = 8;
            }
            textView1.setVisibility(v1);
            textView1.setText(s);
            Integer integer1 = ((dmlv)object1).f;
            if(integer1 != null) {
                textView1.setTextColor(integer1.intValue());
            }
            if(z && z2) {
                ((dmnb)uq0).a.setOnClickListener(new dmna(((dmlv)object1), ((dmnb)uq0)));
            }
        }
    }
}


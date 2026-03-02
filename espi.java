import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.service.quickaccesswallet.GetWalletCardsCallback;
import android.service.quickaccesswallet.GetWalletCardsResponse;
import android.service.quickaccesswallet.WalletCard.Builder;
import android.service.quickaccesswallet.WalletCard;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

final class espi implements gmbg {
    final List a;
    final int b;
    final int c;
    final GetWalletCardsCallback d;
    final espj e;

    public espi(espj espj0, List list0, int v, int v1, GetWalletCardsCallback getWalletCardsCallback0) {
        this.a = list0;
        this.b = v;
        this.c = v1;
        this.d = getWalletCardsCallback0;
        Objects.requireNonNull(espj0);
        this.e = espj0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(espj.a.j(), "getValuables: error", throwable0);
        GetWalletCardsResponse getWalletCardsResponse0 = new GetWalletCardsResponse(this.a, this.c);
        this.d.onSuccess(getWalletCardsResponse0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        List list0 = new ArrayList();
        list0.addAll(this.a);
        for(Object object1: ((List)object0)) {
            esgi esgi0 = this.e.a();
            gftb.check(esgi0);
            Account account0 = new Account(esgi0.b, "com.google");
            Icon icon0 = Icon.createWithResource(this.e, 0x7F080FDE);  // drawable:tp_qaw_lock
            dmqu dmqu0 = new dmqu();
            dmqu0.b.a(((ValuableGroup)object1).b);
            dmqu0.d(account0);
            Intent intent0 = dmqu0.c();
            intent0.setFlags(0x14028000);
            PendingIntent pendingIntent0 = fqaw.c(this.e, ((ValuableGroup)object1).hashCode(), intent0, 0x4000000);
            gftb.check(pendingIntent0);
            list0.add(new WalletCard.Builder(((ValuableGroup)object1).b, 2, icon0, ((ValuableGroup)object1).e, pendingIntent0).build());
        }
        if(this.e.d() && list0.size() >= 2 && ((WalletCard)list0.get(0)).getCardType() == 0) {
            list0.remove(0);
        }
        int v = this.b;
        if(list0.size() > v) {
            list0 = list0.subList(0, v);
        }
        GetWalletCardsResponse getWalletCardsResponse0 = new GetWalletCardsResponse(list0, this.c);
        this.d.onSuccess(getWalletCardsResponse0);
    }
}


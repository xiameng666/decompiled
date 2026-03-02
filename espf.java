import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.service.quickaccesswallet.GetWalletCardsCallback;
import android.service.quickaccesswallet.GetWalletCardsError;
import android.service.quickaccesswallet.GetWalletCardsRequest;
import android.service.quickaccesswallet.GetWalletCardsResponse;
import android.service.quickaccesswallet.WalletCard.Builder;
import com.google.android.gms.pay.GetValuablesRequest;
import com.google.android.gms.pay.PassFilter;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import java.util.Arrays;
import java.util.List;

public final class espf implements Runnable {
    public final espj a;
    public final GetWalletCardsRequest b;
    public final GetWalletCardsCallback c;

    public espf(espj espj0, GetWalletCardsRequest getWalletCardsRequest0, GetWalletCardsCallback getWalletCardsCallback0) {
        this.a = espj0;
        this.b = getWalletCardsRequest0;
        this.c = getWalletCardsCallback0;
    }

    @Override
    public final void run() {
        List list1;
        PendingIntent pendingIntent0;
        espj espj0;
        GetWalletCardsCallback getWalletCardsCallback0;
        try {
            getWalletCardsCallback0 = this.c;
            GetWalletCardsRequest getWalletCardsRequest0 = this.b;
            espj0 = this.a;
            if(!espj0.c.h()) {
                ((ggtj)espj.a.j()).x("getWalletCards: feature disabled");
                espj0.c.f();
                return;
            }
            GetGlobalActionCardsResponse getGlobalActionCardsResponse0 = espj0.c.i(esgj.g(espj0, null), getWalletCardsRequest0.getCardWidthPx(), getWalletCardsRequest0.getCardHeightPx(), getWalletCardsRequest0.getIconSizePx(), getWalletCardsRequest0.getMaxCards(), false);
            List list0 = Arrays.asList(getGlobalActionCardsResponse0.a);
            if(espj0.d() && list0.isEmpty()) {
                Drawable drawable0 = Icon.createWithData(new byte[0], 0, 0).loadDrawable(espj0);
                if(drawable0 == null) {
                    ((ggtj)espj.a.j()).x("Failed to create placeholder card, drawable or intent missing.");
                    list1 = ggna.a;
                }
                else {
                    if(hypp.a.b().u()) {
                        bboh bboh0 = espj.a;
                        ((ggtj)bboh0.h()).x("QAW tile tap fix enabled, using home intent for placeholder.");
                        pendingIntent0 = espj0.getTargetActivityPendingIntent();
                        if(pendingIntent0 == null) {
                            ((ggtj)bboh0.j()).x("Failed to get target activity intent for placeholder.");
                            getWalletCardsCallback0.onFailure(new GetWalletCardsError(null, espj0.c.b()));
                            return;
                        }
                    }
                    else {
                        ((ggtj)espj.a.h()).x("QAW tile tap fix disabled, using DoNothing intent for placeholder.");
                        pendingIntent0 = fqaw.c(espj0, 0, new Intent("DoNothing").setPackage("com.google.android.gms"), 0x4000000);
                        gftb.check(pendingIntent0);
                    }
                    list1 = gged_interceptors.l(new WalletCard.Builder("placeholder_card", 0, Icon.createWithBitmap(etsg.a(drawable0, getWalletCardsRequest0.getIconSizePx(), getWalletCardsRequest0.getIconSizePx())), "Tap to open", pendingIntent0).build());
                }
            }
            else {
                list1 = ggia.h(list0, new espd());
            }
            if(list1.isEmpty()) {
                ((ggtj)espj.a.j()).x("No wallet cards to return.");
                getWalletCardsCallback0.onFailure(new GetWalletCardsError(null, espj0.c.b()));
                return;
            }
            GetWalletCardsResponse getWalletCardsResponse0 = new GetWalletCardsResponse(list1, getGlobalActionCardsResponse0.b);
            if(bbqa.d() && getWalletCardsRequest0.getMaxCards() != 1 && hwhc.e()) {
                int v = getGlobalActionCardsResponse0.b;
                int v1 = getWalletCardsRequest0.getMaxCards();
                esgi esgi0 = espj0.a();
                gftb.check(esgi0);
                Account account0 = new Account(esgi0.b, "com.google");
                GetValuablesRequest getValuablesRequest0 = new GetValuablesRequest();
                getValuablesRequest0.a = account0;
                PassFilter passFilter0 = new PassFilter();
                passFilter0.h = 2;
                getValuablesRequest0.b = passFilter0;
                gmbu.t(glzd.f(fhra.b(espj0.h.aR(getValuablesRequest0)), new espe(), espj0.e), new espi(espj0, list1, v1, v, getWalletCardsCallback0), espj0.e);
                return;
            }
            getWalletCardsCallback0.onSuccess(getWalletCardsResponse0);
        }
        catch(eshj | cjuh exception0) {
            a.ae(espj.a.j(), "getWalletCards: error", exception0);
            getWalletCardsCallback0.onFailure(new GetWalletCardsError(null, espj0.c.b()));
        }
    }
}


import android.content.Context;
import android.content.Intent;

public final class dwbs implements ibth {
    public final dwby a;

    public dwbs(dwby dwby0) {
        this.a = dwby0;
    }

    @Override  // ibth
    public final Object a() {
        Context context0 = this.a.y();
        Intent intent0 = new Intent("com.google.android.apps.wallet.bulkimport.add.BULK_IMPORT_ENTRY").setClassName(dlng.c(context0), "com.google.android.apps.wallet.main.WalletActivity");
        this.a.startActivity(intent0);
        return ibom.a;
    }
}


import com.google.android.gms.nearby.internal.connection.InitiateBandwidthUpgradeParams;

public final class czbx implements czdn {
    public final String a;

    public czbx(String s) {
        this.a = s;
    }

    @Override  // czdn
    public final void a(czbf czbf0, azvd azvd0) {
        czft czft0 = (czft)czbf0.H();
        InitiateBandwidthUpgradeParams initiateBandwidthUpgradeParams0 = new InitiateBandwidthUpgradeParams();
        initiateBandwidthUpgradeParams0.a = new czbc(azvd0);
        initiateBandwidthUpgradeParams0.b = this.a;
        czft0.k(initiateBandwidthUpgradeParams0);
    }
}


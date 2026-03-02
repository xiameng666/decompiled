import android.accounts.Account;
import android.content.Context;

public final class aseh {
    public final Context a;
    public final icnj b;
    private final icck c;
    private final foeg d;

    public aseh(Context context0, asms asms0, aswy aswy0, icck icck0, foeg foeg0) {
        ibuq.f(asms0, "deviceDataBackupStateUseCase");
        ibuq.f(aswy0, "photosBackupStateDataSource");
        ibuq.f(icck0, "coroutineScope");
        ibuq.f(foeg0, "googleOwnersProvider");
        super();
        this.a = context0;
        this.c = icck0;
        this.d = foeg0;
        aseg aseg0 = new aseg(aswy0.a(), this);
        aseb aseb0 = new aseb(this, null);
        this.b = iclp.b(new icmj(asms0.f, aseg0, aseb0), icck0, icmy.a(0L, 3), aqqe.a);
    }

    public final Object a(Account account0, ibrl ibrl0) {
        asec asec0;
        if((ibrl0 instanceof asec)) {
            asec0 = (asec)ibrl0;
            int v = asec0.d;
            if((v & 0x80000000) == 0) {
                asec0 = new asec(this, ibrl0);
            }
            else {
                asec0.d = v - 0x80000000;
            }
        }
        else {
            asec0 = new asec(this, ibrl0);
        }
        Object object0 = asec0.b;
        Object object1 = ibrx.a;
        switch(asec0.d) {
            case 0: {
                ibnx.b(object0);
                if(account0 == null) {
                    return asdt.a;
                }
                gmcd gmcd0 = this.d.b(account0.name);
                ibuq.e(gmcd0, "loadOwner(...)");
                asec0.a = account0;
                asec0.d = 1;
                object0 = icpu.c(gmcd0, asec0);
                return object0 == object1 ? object1 : new asdu(account0, fnto.c(((foec)object0)));
            }
            case 1: {
                account0 = asec0.a;
                ibnx.b(object0);
                return new asdu(account0, fnto.c(((foec)object0)));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


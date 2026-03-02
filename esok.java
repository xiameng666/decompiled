import android.accounts.Account;
import com.google.android.gms.pay.GetSeMfiPrepaidCardsRequest;
import com.google.android.gms.pay.GetSePrepaidCardRequest;
import com.google.android.gms.pay.SeServiceProvider;

public final class esok implements gfsi {
    public final espb a;
    public final Account b;

    public esok(espb espb0, Account account0) {
        this.a = espb0;
        this.b = account0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        int v = (int)(((Integer)object0));
        Account account0 = this.b;
        espb espb0 = this.a;
        if(v != 1 && v != 2) {
            switch(v) {
                case 3: {
                    break;
                }
                case 4: 
                case 8: {
                    azts azts0 = espb0.l();
                    GetSeMfiPrepaidCardsRequest getSeMfiPrepaidCardsRequest0 = new GetSeMfiPrepaidCardsRequest();
                    getSeMfiPrepaidCardsRequest0.a = account0;
                    SeServiceProvider seServiceProvider0 = new SeServiceProvider();
                    seServiceProvider0.a = v;
                    getSeMfiPrepaidCardsRequest0.c = seServiceProvider0;
                    getSeMfiPrepaidCardsRequest0.b = 1;
                    getSeMfiPrepaidCardsRequest0.f = 1;
                    evql evql0 = azts0.aM(getSeMfiPrepaidCardsRequest0);
                    esow esow0 = new esow();
                    return evql0.d(gmap.a, esow0);
                }
                default: {
                    return evrg.d(Boolean.valueOf(false));
                }
            }
        }
        azts azts1 = espb0.l();
        GetSePrepaidCardRequest getSePrepaidCardRequest0 = new GetSePrepaidCardRequest();
        getSePrepaidCardRequest0.a = account0;
        SeServiceProvider seServiceProvider1 = new SeServiceProvider();
        seServiceProvider1.a = v;
        getSePrepaidCardRequest0.b = seServiceProvider1;
        getSePrepaidCardRequest0.d = 1;
        getSePrepaidCardRequest0.e = 2;
        evql evql1 = azts1.aN(getSePrepaidCardRequest0);
        esos esos0 = new esos();
        return evql1.d(gmap.a, esos0);
    }
}


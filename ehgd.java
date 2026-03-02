import android.accounts.Account;
import java.util.zip.CRC32;

public final class ehgd {
    public final Account a;
    public final ehbp b;
    public final ehab c;
    public final egzp d;

    public ehgd(Account account0, ehbp ehbp0, ehab ehab0, egzp egzp0) {
        this.a = account0;
        this.b = ehbp0;
        this.c = ehab0;
        this.d = egzp0;
    }

    public static long a(byte[] arr_b) {
        if(arr_b == null) {
            return 0L;
        }
        CRC32 cRC320 = new CRC32();
        cRC320.update(arr_b);
        return cRC320.getValue();
    }
}


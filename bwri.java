import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import j..util.Objects;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;

final class bwri implements bwrp {
    final goqq a;
    private final Deque b;
    private final Deque c;
    private int d;

    public bwri(goqq goqq0, gged_interceptors gged0) {
        Objects.requireNonNull(goqq0);
        this.a = goqq0;
        super();
        this.d = 0;
        this.b = new ArrayDeque(gged0);
        this.c = new ArrayDeque();
    }

    private static final void b(String s, glrs glrs0, Deque deque0) {
        while(!deque0.isEmpty()) {
            ((bwrj)deque0.removeFirst()).d(s, glrs0);
        }
    }

    @Override  // bwrp
    public final void g(bwrr bwrr0) {
        synchronized(this) {
            glrs glrs0 = glrs.a;
            String s = null;
            try {
                bwne.a("Batch request initializing");
                goqq goqq0 = this.a;
                bwqt bwqt0 = bwqt.c(goqq0.a.b, goqq0.e);
                batl.t(bwqt0, "AppIndexingDatabaseHelper can NOT be Null in executeOnTaskQueue()");
                bwmx bwmx0 = goqq0.a.a();
                bwtc bwtc0 = bwtc.d(goqq0.a.b);
                Deque deque0 = this.b;
                bwne.b("Batch request validating %d tasks", Integer.valueOf(deque0.size()));
                while(true) {
                    if(deque0.isEmpty()) {
                        Deque deque1 = this.c;
                        bwne.b("Batch request executing %d mutations", Integer.valueOf(deque1.size()));
                        HashSet hashSet0 = new HashSet();
                        HashSet hashSet1 = new HashSet();
                        goqq goqq1 = this.a;
                        goqq1.g(bwqt0, bwtc0);
                        SQLiteDatabase sQLiteDatabase0 = bwqt0.getWritableDatabase();
                        sQLiteDatabase0.beginTransaction();
                        try {
                            int v2 = this.d;
                            if(v2 > 0) {
                                bwqt0.g(sQLiteDatabase0, goqq1.f, bwmx0, bwtc0, v2);
                            }
                            for(Object object0: deque1) {
                                bwsg bwsg0 = ((bwsh)((bwrj)object0).a).g(sQLiteDatabase0, bwqt0, goqq1.f, bwtc0);
                                hashSet0.addAll(bwsg0.a);
                                hashSet1.addAll(bwsg0.b);
                            }
                            sQLiteDatabase0.setTransactionSuccessful();
                        }
                        finally {
                            sQLiteDatabase0.endTransaction();
                        }
                        bwne.a("Batch request syncing corpora");
                        hashSet0.removeAll(hashSet1);
                        bwqt0.p(hashSet1, this.a.f, bwmx0, 8);
                        bwqt0.n(hashSet0, this.a.f, bwmx0, 8);
                        break;
                    }
                    bwrj bwrj0 = (bwrj)deque0.getFirst();
                    boolean z = true;
                    try {
                        bwrj0.a.i(goqq0.f, bwmx0, bwtc0);
                        this.d += bwrj0.a.a();
                        bwrj0.a.e(bwmx0);
                        bwsy0 = null;
                    }
                    catch(bwsy bwsy0) {
                        bwne.w(bwsy0, "AppIndexing batch request validation of task failed", new Object[0]);
                        Pair pair0 = bwrj0.e(bwsy0);
                        bwrj bwrj1 = (bwrj)this.b.removeFirst();
                        batl.l(bwrj1 == bwrj0);
                        bwrj1.d(((String)pair0.first), ((glrs)pair0.second));
                    }
                    catch(Exception bwsy0) {
                        bwne.w(bwsy0, "AppIndexing batch request validation of task failed", new Object[0]);
                        bwrj bwrj2 = (bwrj)this.b.removeFirst();
                        batl.l(bwrj2 == bwrj0);
                        bwrj2.d(null, glrs.e);
                    }
                    if(bwsy0 == null) {
                        bwrj bwrj3 = (bwrj)this.b.removeFirst();
                        if(bwrj3 != bwrj0) {
                            z = false;
                        }
                        batl.l(z);
                        this.c.add(bwrj3);
                    }
                }
            }
            catch(bwtf bwtf0) {
                bwne.w(bwtf0, "AppIndexing batch request failed", new Object[0]);
                glrs0 = glrs.d;
                s = bwtf0.getMessage();
            }
            catch(Exception exception0) {
                bwne.w(exception0, "AppIndexing batch request failed", new Object[0]);
                glrs0 = glrs.e;
                huax.h();
                bwne.x();
            }
            if(aztk.h(bwsz.b(glrs0)) && bwrr0.b()) {
                return;
            }
            bwne.a("Batch request sending results");
            bwrr0.a();
            bwri.b(s, glrs0, this.b);
            bwri.b(s, glrs0, this.c);
            bwne.a("Batch request finished");
        }
    }
}


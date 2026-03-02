import java.util.Queue;

public final class arhp implements Runnable {
    public final arhv a;
    public final asce b;
    public final Queue c;

    public arhp(arhv arhv0, asce asce0, Queue queue0) {
        this.a = arhv0;
        this.b = asce0;
        this.c = queue0;
    }

    @Override
    public final void run() {
        Queue queue0;
        arhv arhv0;
        try {
            arhv0 = this.a;
            queue0 = this.c;
            arqo arqo0 = arhv0.g.a((this.b.c == null ? asbk.a : this.b.c));
            while(!queue0.isEmpty()) {
                if(arhv0.i.get()) {
                    arhv.a.h("PrefetchingThread cancelled while prefetching items from item queue", new Object[0]);
                    return;
                }
                asby asby0 = (asby)queue0.poll();
                if(asby0 != null) {
                    arhu arhu0 = new arhu(asby0, arhv.e(asby0, arqo0), arqo0.e(asby0), asby0.f);
                    arhv0.h.put(arhu0);
                }
            }
            arhv0.h.put(arhv.b);
        }
        catch(InterruptedException unused_ex) {
            arhv.a.m("prefetchItemsFromItemQueue interrupted, items left in the queue: %d", new Object[]{((int)(queue0.size() + arhv0.h.size()))});
            Thread.currentThread().interrupt();
        }
    }
}


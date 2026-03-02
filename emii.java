import java.util.Set;

public final class emii implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Set set0 = ((emqu)object0).b;
        if(!set0.isEmpty()) {
            ((ggtj)elyt.a.j()).z("PlaceIndexStorage still missing %d fprints after update", set0.size());
        }
        return new emic(((emqu)object0).a.values(), set0.size());
    }
}


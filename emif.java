import java.util.Set;

public final class emif implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Set set0 = ((emqu)object0).b;
        if(!set0.isEmpty()) {
            ((ggtj)elyt.a.j()).z("PlaceIndexStorage still missing %d S2 cells after update", set0.size());
        }
        return new emib(((emqu)object0).a.values(), set0.size());
    }
}


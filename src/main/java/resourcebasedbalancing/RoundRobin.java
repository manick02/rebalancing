package resourcebasedbalancing;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RoundRobin<T> {
    private final List<T> selectable;
    AtomicInteger index = new AtomicInteger(-1);
    private final int size;

    public RoundRobin(List<T> selectable) {
        this.selectable = Collections.unmodifiableList(selectable);
        this.size = selectable.size();
    }

    public T next() {
        return this.selectable.get(index.updateAndGet(v -> (v + 1) % size));
    }
}

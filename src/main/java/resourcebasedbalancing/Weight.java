package resourcebasedbalancing;

import java.util.concurrent.atomic.AtomicInteger;

public class Weight<T> {
    private T target;

    private final int weight;

    private final AtomicInteger currentWeight;

    public Weight(T target, int weight, AtomicInteger currentWeight) {
        this.target = target;
        this.weight = weight;
        this.currentWeight = currentWeight;
    }
}

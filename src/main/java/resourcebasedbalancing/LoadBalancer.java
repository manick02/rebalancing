package resourcebasedbalancing;

public interface LoadBalancer<T> {

    Weight<T> select();
}

package demo;
import org.apache.curator.framework.CuratorFramework;
import  java.io.Closeable;
import java.io.IOException;

import org.apache.curator.framework.recipes.leader.LeaderSelectorListenerAdapter;

public class LeaderSelector  extends LeaderSelectorListenerAdapter implements Closeable{
    @Override
    public void takeLeadership(CuratorFramework curatorFramework) throws Exception {

    }

    @Override
    public void close() throws IOException {

    }
}

import java.util.ArrayList;
import java.util.List;

public class LoadBalancer {

    private List<String> servers = new ArrayList<>();
    private int currentIndex = 0;

    public LoadBalancer() {
        servers.add("Server-1");
        servers.add("Server-2");
        servers.add("Server-3");
    }

    // Round Robin Algorithm
    public String getNextServer() {
        String server = servers.get(currentIndex);
        currentIndex = (currentIndex + 1) % servers.size();
        return server;
    }

    public static void main(String[] args) {
        LoadBalancer lb = new LoadBalancer();

        for(int i = 0; i < 10; i++) {
            System.out.println("Client Request sent to: " + lb.getNextServer());
        }
    }
}

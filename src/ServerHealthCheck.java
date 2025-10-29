public class ServerHealthCheck {

    // Simple mock server health simulator
    public boolean isServerHealthy(String serverName) {
        // In real implementation, ping or HTTP health-check to server
        return !serverName.contains("Down");
    }

    public static void main(String[] args) {
        ServerHealthCheck healthCheck = new ServerHealthCheck();

        System.out.println("Server-1 Healthy: " + healthCheck.isServerHealthy("Server-1"));
        System.out.println("Server-2 Healthy: " + healthCheck.isServerHealthy("Server-2"));
        System.out.println("Server-Down Healthy: " + healthCheck.isServerHealthy("Server-Down"));
    }
}

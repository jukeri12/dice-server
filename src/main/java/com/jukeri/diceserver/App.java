package com.jukeri.diceserver;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.List;


// Driver Class
public class App 
{
    // Main Method
    public static void main(String[] args) throws IOException 
    {
        // Create an HttpServer instance
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        // Create a context for a specific path and set the handler
        server.createContext("/", new RollHandler());

        // Start the server
        server.setExecutor(null); // Use the default executor
        server.start();

        System.out.println("Server is running on port 8000");
    }

    // define a custom HttpHandler
    static class RollHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException 
        {

            Roller roller = new Roller();

            List<Integer> rolls = roller.roll(6);
            // handle the request
            String response = "";


            for (int i = 0; i < rolls.size(); i++) {
              response += rolls.get(i) + "\n";
            }
            exchange.sendResponseHeaders(200, response.length());
        
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
    
}




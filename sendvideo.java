package whatsapp_api;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class sendvideo {
    
    public static void main(String args[]){
            
      
        String msg= "{ \"messaging_product\": \"whatsapp\", \"to\": \"917013206067\" , \"type\": \"video\", \"video\": { \"link\":\" https://samplelib.com/lib/preview/mp4/sample-5s.mp4\" } } ";

            try {
                HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://graph.facebook.com/v15.0/109576818691718/messages"))
                    .header("Authorization", "Bearer EAAHOOwNXm9cBAOa39X6y5rukiyCQSZCfNetP3sHsfX2J8ueNYBCEZARcDmt5DkCQSNSngbXZAS3rQjF9LToKDpUWklN6NxeePs47nCpAMPq3BnY3eWCFNHGZAjBYGNDhYjvqRWLVrmyKFuK7hZBZAZAvDv6yqu9xKyonU3aDfnLRdFKblZB4lLvd0ZA0298CE1HEh7KHlQgTjWb4zA27iZCIVlEnBB9mvwlPsZD")
                    .header("Content-Type","application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(msg))
                    .build();
                HttpClient http = HttpClient.newHttpClient();
                HttpResponse<String> response = http.send(request,HttpResponse.BodyHandlers.ofString());
                System.out.println(response.body());
            } catch (Exception e) {
                System.out.println("exception ");
                e.printStackTrace();
            }
        
        
    }

}

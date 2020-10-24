import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @author danushka
 * 10/24/2020
 */
public class VimeoEndPointHandler {
    private String endPoint;
    private String token;
    private WebClient webClient;

    public VimeoEndPointHandler(String endPoint, String token) {
        this.endPoint = endPoint;
        this.token = token;
        this.webClient = WebClient.builder()
                .baseUrl(endPoint)
                .defaultHeader(HttpHeaders.ACCEPT, "application/vnd.vimeo.*+json;version=3.2")
                .defaultHeader(HttpHeaders.AUTHORIZATION, "bearer" + " " + token)
                .build();
    }

    public Mono<String> getMe(){
        return this.webClient.get().uri("/me").retrieve().bodyToMono(String.class);
    }

    public Mono<String> getVideos() {
        return this.webClient.get().uri("/me/videos").retrieve().bodyToMono(String.class);
    }

    public Mono<String> getVideo(String videoId){
        return this.webClient.get().uri(String.format("/videos/%s", videoId)).retrieve().bodyToMono(String.class);
    }

    public Mono<String> initUploadVideo(){
        Map<String, String> params = new HashMap<>();
        params.put("type", "streaming");
        params.put("redirect_url", "");
        params.put("upgrade_to_1080", "false");
        return this.webClient.post()
                .uri("/me/videos")
                .body(BodyInserters.fromValue(params))
                .retrieve().bodyToMono(String.class);
    }
}

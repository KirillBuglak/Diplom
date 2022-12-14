package searchengine.dto;

import org.springframework.stereotype.Component;

@Component
public class StopIndexingResponse extends CommonResponse {
    private static volatile boolean result;
    public StopIndexingResponse() {
        result = true;
    }
    @Override
    public boolean isResult() {
        return result;
    }
    public static boolean getResult() {
        return result;
    }
    @Override
    public void setResult(boolean result) {
        StopIndexingResponse.result = result;
    }
}
